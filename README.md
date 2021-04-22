# snomed-ql
SNOMED CT Query Language Implementation with IDE integration(s), user interface using Xtext.

[![build status](https://img.shields.io/github/workflow/status/b2ihealthcare/snomed-ql/Java%20CI/main?style=flat-square)](https://github.com/b2ihealthcare/snomed-ql/actions)
[![latest release](https://img.shields.io/github/tag/b2ihealthcare/snomed-ql.svg?style=flat-square)](https://github.com/b2ihealthcare/snomed-ql/releases/tag/v0.1.2)
[![GitHub](https://img.shields.io/github/license/b2ihealthcare/snomed-ql.svg?style=flat-square)](https://github.com/b2ihealthcare/snomed-ql/blob/main/LICENSE)

# Documentation

See the draft discussion presentation [here](https://confluence.ihtsdotools.org/download/attachments/52180605/Draft%20SNOMED%20Query%20Language%20-%20Examples%20for%20Discussion.pptx?api=v2)

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
