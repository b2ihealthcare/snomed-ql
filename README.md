# snomed-ql
SNOMED CT Query Language Implementation with IDE integration(s), user interface using Xtext.

[![build status](https://img.shields.io/github/workflow/status/b2ihealthcare/snomed-ql/Java%20CI/main?style=flat-square)](https://github.com/b2ihealthcare/snomed-ql/actions)
[![latest release](https://img.shields.io/github/tag/b2ihealthcare/snomed-ql.svg?style=flat-square)](https://github.com/b2ihealthcare/snomed-ql/releases/tag/v0.1.2)
[![GitHub](https://img.shields.io/github/license/b2ihealthcare/snomed-ql.svg?style=flat-square)](https://github.com/b2ihealthcare/snomed-ql/blob/main/LICENSE)

# Documentation

See the draft discussion presentation [here](https://confluence.ihtsdotools.org/download/attachments/52180605/Draft%20SNOMED%20Query%20Language%20-%20Examples%20for%20Discussion.pptx?api=v2)

# Examples

## Lexical matching

### Simple term match

Return clinical findings with `heart` in at least one of their description's term:

```
< 404684003|Clinical finding| {{ term = match : "heart" }}
```

### Exact term matching

Return clinical findings where at least one description's matches the given term exactly, case insensitively:

```
< 404684003|Clinical finding| {{ term = exact : "tetralogy of fallot" }}
```

### Regex matching

Return concepts with a term containing the fragment `sorbi` at any position in the description's term:

```
* {{ term = regex : ".*sorbi.*" }}
```

Return concepts that have double (or more) spaces in any of their descriptions:

```
* {{ term = regex : ".*[ ]{2,}.*" }}
```

Return concepts where spaces precede either commas, colons, semicolons or full stops in any description's term:

```
* {{ term = regex : ".*[ ]+[,:;\\.]+.*" }}
```

### Dialects

Return findings around retinal structure with term containing `color` OR `colour` and the description is **preferred** in the `US English` language reference set:

```
< 404684003|Clinical finding| : 
  363698007|Finding site| = << 5665001|Retinal structure|
  {{
    preferredIn = 900000000000509007|US English|,
    (term = match : "color" OR term = match : "colour")
  }}
```

Return finding around retinal structure with term containing `color` OR `colour` and the description is **acceptable** in the `US English` language reference set:

```
< 404684003|Clinical finding| : 
  363698007|Finding site| = << 5665001|Retinal structure|
  {{
    acceptableIn = 900000000000509007|US English|,
    (term = match : "color" OR term = match : "colour")
  }}
```

Return findings around retinal structure with term containing `color` OR `colour` and the description has **any** acceptability value in the `US English` language reference set:

```
< 404684003|Clinical finding| : 
  363698007|Finding site| = << 5665001|Retinal structure|
  {{
    languageRefSetId = 900000000000509007|US English|,
    (term = match : "color" OR term = match : "colour")
  }}
```

Return findings around retinal structure with term containing `color` OR `colour` and the description has any acceptability value in the `US English` language reference set:

```
< 404684003|Clinical finding| : 
  363698007|Finding site| = << 5665001|Retinal structure|
  {{
    languageRefSetId = (< ),
    (term = match : "color" OR term = match : "colour")
  }}
```


## Description type filtering

Return concepts from the `128927009|Procedure by method|` sub-hierarchy where the concept has at least one `Synonym` or subtype description and the term contains `incision`:

```
<< 128927009|Procedure by method|
  {{ term = match : "incision", typeId = << 900000000000013009|Synonym| }}
```

## Description language code filtering

Return finding concepts with at least one description with the Swedish language code:

```
< 404684003|Clinical finding| {{ languageCode = "sv" }}
```

## Description case significance filtering

Return finding concepts with at least one description having `Entire term case insensitive`:

```
< 404684003|Clinical finding| {{ caseSignificanceId = 900000000000448009|Entire term case insensitive| }}
```

## Module filtering

Return finding concepts maintained by the UK Clinical Extension, any module that is the subtype of `999003121000000100 |United Kingdom maintained clinical module|`

```
< 404684003|Clinical finding| {{ moduleId = < 999003121000000100 |United Kingdom maintained clinical module| }}
```

Return international finding concepts with extension description:

```
< 404684003|Clinical finding| {{ Concept.moduleId = 900000000000207008|SNOMED CT core module|, Description.moduleId = < 999003121000000100 |United Kingdom maintained clinical module| }}
```

## Inactive concepts

Return all inactive concepts:

```
* {{ active = false }}
```

## Inactive concepts with certain active descriptions

Return all inactive concepts where an active description's term contains the word `repair`:

```
* {{ active = false AND (Description.active = true, term = match : "repair") }}
```

## Inactive descriptions by term

Returns any concept (both active and inactive) which has an inactive description with the term's containing the word `NOS`:

```
* {{ Description.active = false, term = match : "NOS"}}
```

## Conjunction, Disjunction, Exclusion

Similar to ECL, Query Language constructs can be combined together on many levels.

Return concepts with terms having the 'colour' word but in a non-british language reference set:

```
* {{ term = match : "colour" MINUS languageRefSetId = '900000000000508004|GB English|' }}
```

Also, multiple queries can be connected together and evaluated in a single go:

```
* {{ active = false }} 
MINUS
(* {{ term = match : "colour" }} OR * {{ languageRefSetId = '900000000000508004|GB English|' }} )
```

# Building from source

SNOMED CT QL uses Maven for its build system. In order to run the build and create a p2 update site and the maven packages simply run the following command in the cloned directory. 

    mvn clean package

The packages can be found in the `com.b2international.snomed.ql.update/target` folder, when the build is complete.

To run the test cases, use the following command:

    mvn clean verify

# Contributing

Please see [CONTRIBUTING.md](CONTRIBUTING.md) for details.

# Versioning

Our [releases](https://github.com/b2ihealthcare/snomed-ql/releases) use [semantic versioning](http://semver.org). You can find a chronologically ordered list of notable changes in [CHANGELOG.md](CHANGELOG.md).
