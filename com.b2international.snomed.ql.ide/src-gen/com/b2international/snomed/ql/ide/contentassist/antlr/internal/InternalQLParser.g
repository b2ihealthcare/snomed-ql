/*
 * Copyright 2020-2021 B2i Healthcare Pte Ltd, http://b2i.sg
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
parser grammar InternalQLParser;

options {
	tokenVocab=InternalQLLexer;
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@header {
package com.b2international.snomed.ql.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.b2international.snomed.ql.services.QLGrammarAccess;

}
@members {
	private QLGrammarAccess grammarAccess;
	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
	
	{
		tokenNameToValue.put("Term", "'term'");
		tokenNameToValue.put("True", "'true'");
		tokenNameToValue.put("Exact", "'exact'");
		tokenNameToValue.put("False", "'false'");
		tokenNameToValue.put("Match", "'match'");
		tokenNameToValue.put("Regex", "'regex'");
		tokenNameToValue.put("Active", "'active'");
		tokenNameToValue.put("TypeId", "'typeId'");
		tokenNameToValue.put("Concept", "'Concept'");
		tokenNameToValue.put("ModuleId", "'moduleId'");
		tokenNameToValue.put("Description", "'Description'");
		tokenNameToValue.put("PreferredIn", "'preferredIn'");
		tokenNameToValue.put("AcceptableIn", "'acceptableIn'");
		tokenNameToValue.put("LanguageCode", "'languageCode'");
		tokenNameToValue.put("LanguageRefSetId", "'languageRefSetId'");
		tokenNameToValue.put("CaseSignificanceId", "'caseSignificanceId'");
	}

	public void setGrammarAccess(QLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		String result = tokenNameToValue.get(tokenName);
		if (result == null)
			result = tokenName;
		return result;
	}
}

// Entry rule entryRuleQuery
entryRuleQuery
:
{ before(grammarAccess.getQueryRule()); }
	 ruleQuery
{ after(grammarAccess.getQueryRule()); } 
	 EOF 
;

// Rule Query
ruleQuery 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQueryAccess().getGroup()); }
		(rule__Query__Group__0)
		{ after(grammarAccess.getQueryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQueryConstraint
entryRuleQueryConstraint
:
{ before(grammarAccess.getQueryConstraintRule()); }
	 ruleQueryConstraint
{ after(grammarAccess.getQueryConstraintRule()); } 
	 EOF 
;

// Rule QueryConstraint
ruleQueryConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQueryConstraintAccess().getQueryDisjunctionParserRuleCall()); }
		ruleQueryDisjunction
		{ after(grammarAccess.getQueryConstraintAccess().getQueryDisjunctionParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQueryDisjunction
entryRuleQueryDisjunction
:
{ before(grammarAccess.getQueryDisjunctionRule()); }
	 ruleQueryDisjunction
{ after(grammarAccess.getQueryDisjunctionRule()); } 
	 EOF 
;

// Rule QueryDisjunction
ruleQueryDisjunction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQueryDisjunctionAccess().getGroup()); }
		(rule__QueryDisjunction__Group__0)
		{ after(grammarAccess.getQueryDisjunctionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQueryConjunction
entryRuleQueryConjunction
:
{ before(grammarAccess.getQueryConjunctionRule()); }
	 ruleQueryConjunction
{ after(grammarAccess.getQueryConjunctionRule()); } 
	 EOF 
;

// Rule QueryConjunction
ruleQueryConjunction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQueryConjunctionAccess().getGroup()); }
		(rule__QueryConjunction__Group__0)
		{ after(grammarAccess.getQueryConjunctionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQueryExclusion
entryRuleQueryExclusion
:
{ before(grammarAccess.getQueryExclusionRule()); }
	 ruleQueryExclusion
{ after(grammarAccess.getQueryExclusionRule()); } 
	 EOF 
;

// Rule QueryExclusion
ruleQueryExclusion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQueryExclusionAccess().getGroup()); }
		(rule__QueryExclusion__Group__0)
		{ after(grammarAccess.getQueryExclusionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubQuery
entryRuleSubQuery
:
{ before(grammarAccess.getSubQueryRule()); }
	 ruleSubQuery
{ after(grammarAccess.getSubQueryRule()); } 
	 EOF 
;

// Rule SubQuery
ruleSubQuery 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubQueryAccess().getAlternatives()); }
		(rule__SubQuery__Alternatives)
		{ after(grammarAccess.getSubQueryAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDomainQuery
entryRuleDomainQuery
:
{ before(grammarAccess.getDomainQueryRule()); }
	 ruleDomainQuery
{ after(grammarAccess.getDomainQueryRule()); } 
	 EOF 
;

// Rule DomainQuery
ruleDomainQuery 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDomainQueryAccess().getGroup()); }
		(rule__DomainQuery__Group__0)
		{ after(grammarAccess.getDomainQueryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNestedQuery
entryRuleNestedQuery
:
{ before(grammarAccess.getNestedQueryRule()); }
	 ruleNestedQuery
{ after(grammarAccess.getNestedQueryRule()); } 
	 EOF 
;

// Rule NestedQuery
ruleNestedQuery 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNestedQueryAccess().getGroup()); }
		(rule__NestedQuery__Group__0)
		{ after(grammarAccess.getNestedQueryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFilter
entryRuleFilter
:
{ before(grammarAccess.getFilterRule()); }
	 ruleFilter
{ after(grammarAccess.getFilterRule()); } 
	 EOF 
;

// Rule Filter
ruleFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFilterAccess().getDisjunctionFilterParserRuleCall()); }
		ruleDisjunctionFilter
		{ after(grammarAccess.getFilterAccess().getDisjunctionFilterParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDisjunctionFilter
entryRuleDisjunctionFilter
:
{ before(grammarAccess.getDisjunctionFilterRule()); }
	 ruleDisjunctionFilter
{ after(grammarAccess.getDisjunctionFilterRule()); } 
	 EOF 
;

// Rule DisjunctionFilter
ruleDisjunctionFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDisjunctionFilterAccess().getGroup()); }
		(rule__DisjunctionFilter__Group__0)
		{ after(grammarAccess.getDisjunctionFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConjunctionFilter
entryRuleConjunctionFilter
:
{ before(grammarAccess.getConjunctionFilterRule()); }
	 ruleConjunctionFilter
{ after(grammarAccess.getConjunctionFilterRule()); } 
	 EOF 
;

// Rule ConjunctionFilter
ruleConjunctionFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConjunctionFilterAccess().getGroup()); }
		(rule__ConjunctionFilter__Group__0)
		{ after(grammarAccess.getConjunctionFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExclusionFilter
entryRuleExclusionFilter
:
{ before(grammarAccess.getExclusionFilterRule()); }
	 ruleExclusionFilter
{ after(grammarAccess.getExclusionFilterRule()); } 
	 EOF 
;

// Rule ExclusionFilter
ruleExclusionFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExclusionFilterAccess().getGroup()); }
		(rule__ExclusionFilter__Group__0)
		{ after(grammarAccess.getExclusionFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNestedFilter
entryRuleNestedFilter
:
{ before(grammarAccess.getNestedFilterRule()); }
	 ruleNestedFilter
{ after(grammarAccess.getNestedFilterRule()); } 
	 EOF 
;

// Rule NestedFilter
ruleNestedFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNestedFilterAccess().getGroup()); }
		(rule__NestedFilter__Group__0)
		{ after(grammarAccess.getNestedFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePropertyFilter
entryRulePropertyFilter
:
{ before(grammarAccess.getPropertyFilterRule()); }
	 rulePropertyFilter
{ after(grammarAccess.getPropertyFilterRule()); } 
	 EOF 
;

// Rule PropertyFilter
rulePropertyFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyFilterAccess().getAlternatives()); }
		(rule__PropertyFilter__Alternatives)
		{ after(grammarAccess.getPropertyFilterAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleActiveFilter
entryRuleActiveFilter
:
{ before(grammarAccess.getActiveFilterRule()); }
	 ruleActiveFilter
{ after(grammarAccess.getActiveFilterRule()); } 
	 EOF 
;

// Rule ActiveFilter
ruleActiveFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActiveFilterAccess().getGroup()); }
		(rule__ActiveFilter__Group__0)
		{ after(grammarAccess.getActiveFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModuleFilter
entryRuleModuleFilter
:
{ before(grammarAccess.getModuleFilterRule()); }
	 ruleModuleFilter
{ after(grammarAccess.getModuleFilterRule()); } 
	 EOF 
;

// Rule ModuleFilter
ruleModuleFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModuleFilterAccess().getGroup()); }
		(rule__ModuleFilter__Group__0)
		{ after(grammarAccess.getModuleFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTermFilter
entryRuleTermFilter
:
{ before(grammarAccess.getTermFilterRule()); }
	 ruleTermFilter
{ after(grammarAccess.getTermFilterRule()); } 
	 EOF 
;

// Rule TermFilter
ruleTermFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTermFilterAccess().getGroup()); }
		(rule__TermFilter__Group__0)
		{ after(grammarAccess.getTermFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePreferredInFilter
entryRulePreferredInFilter
:
{ before(grammarAccess.getPreferredInFilterRule()); }
	 rulePreferredInFilter
{ after(grammarAccess.getPreferredInFilterRule()); } 
	 EOF 
;

// Rule PreferredInFilter
rulePreferredInFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPreferredInFilterAccess().getGroup()); }
		(rule__PreferredInFilter__Group__0)
		{ after(grammarAccess.getPreferredInFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAcceptableInFilter
entryRuleAcceptableInFilter
:
{ before(grammarAccess.getAcceptableInFilterRule()); }
	 ruleAcceptableInFilter
{ after(grammarAccess.getAcceptableInFilterRule()); } 
	 EOF 
;

// Rule AcceptableInFilter
ruleAcceptableInFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAcceptableInFilterAccess().getGroup()); }
		(rule__AcceptableInFilter__Group__0)
		{ after(grammarAccess.getAcceptableInFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLanguageRefSetFilter
entryRuleLanguageRefSetFilter
:
{ before(grammarAccess.getLanguageRefSetFilterRule()); }
	 ruleLanguageRefSetFilter
{ after(grammarAccess.getLanguageRefSetFilterRule()); } 
	 EOF 
;

// Rule LanguageRefSetFilter
ruleLanguageRefSetFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLanguageRefSetFilterAccess().getGroup()); }
		(rule__LanguageRefSetFilter__Group__0)
		{ after(grammarAccess.getLanguageRefSetFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeFilter
entryRuleTypeFilter
:
{ before(grammarAccess.getTypeFilterRule()); }
	 ruleTypeFilter
{ after(grammarAccess.getTypeFilterRule()); } 
	 EOF 
;

// Rule TypeFilter
ruleTypeFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeFilterAccess().getGroup()); }
		(rule__TypeFilter__Group__0)
		{ after(grammarAccess.getTypeFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCaseSignificanceFilter
entryRuleCaseSignificanceFilter
:
{ before(grammarAccess.getCaseSignificanceFilterRule()); }
	 ruleCaseSignificanceFilter
{ after(grammarAccess.getCaseSignificanceFilterRule()); } 
	 EOF 
;

// Rule CaseSignificanceFilter
ruleCaseSignificanceFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCaseSignificanceFilterAccess().getGroup()); }
		(rule__CaseSignificanceFilter__Group__0)
		{ after(grammarAccess.getCaseSignificanceFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLanguageCodeFilter
entryRuleLanguageCodeFilter
:
{ before(grammarAccess.getLanguageCodeFilterRule()); }
	 ruleLanguageCodeFilter
{ after(grammarAccess.getLanguageCodeFilterRule()); } 
	 EOF 
;

// Rule LanguageCodeFilter
ruleLanguageCodeFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLanguageCodeFilterAccess().getGroup()); }
		(rule__LanguageCodeFilter__Group__0)
		{ after(grammarAccess.getLanguageCodeFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpressionConstraint
entryRuleExpressionConstraint
:
{ before(grammarAccess.getExpressionConstraintRule()); }
	 ruleExpressionConstraint
{ after(grammarAccess.getExpressionConstraintRule()); } 
	 EOF 
;

// Rule ExpressionConstraint
ruleExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionConstraintAccess().getOrExpressionConstraintParserRuleCall()); }
		ruleOrExpressionConstraint
		{ after(grammarAccess.getExpressionConstraintAccess().getOrExpressionConstraintParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOrExpressionConstraint
entryRuleOrExpressionConstraint
:
{ before(grammarAccess.getOrExpressionConstraintRule()); }
	 ruleOrExpressionConstraint
{ after(grammarAccess.getOrExpressionConstraintRule()); } 
	 EOF 
;

// Rule OrExpressionConstraint
ruleOrExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOrExpressionConstraintAccess().getGroup()); }
		(rule__OrExpressionConstraint__Group__0)
		{ after(grammarAccess.getOrExpressionConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAndExpressionConstraint
entryRuleAndExpressionConstraint
:
{ before(grammarAccess.getAndExpressionConstraintRule()); }
	 ruleAndExpressionConstraint
{ after(grammarAccess.getAndExpressionConstraintRule()); } 
	 EOF 
;

// Rule AndExpressionConstraint
ruleAndExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAndExpressionConstraintAccess().getGroup()); }
		(rule__AndExpressionConstraint__Group__0)
		{ after(grammarAccess.getAndExpressionConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExclusionExpressionConstraint
entryRuleExclusionExpressionConstraint
:
{ before(grammarAccess.getExclusionExpressionConstraintRule()); }
	 ruleExclusionExpressionConstraint
{ after(grammarAccess.getExclusionExpressionConstraintRule()); } 
	 EOF 
;

// Rule ExclusionExpressionConstraint
ruleExclusionExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExclusionExpressionConstraintAccess().getGroup()); }
		(rule__ExclusionExpressionConstraint__Group__0)
		{ after(grammarAccess.getExclusionExpressionConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRefinedExpressionConstraint
entryRuleRefinedExpressionConstraint
:
{ before(grammarAccess.getRefinedExpressionConstraintRule()); }
	 ruleRefinedExpressionConstraint
{ after(grammarAccess.getRefinedExpressionConstraintRule()); } 
	 EOF 
;

// Rule RefinedExpressionConstraint
ruleRefinedExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRefinedExpressionConstraintAccess().getGroup()); }
		(rule__RefinedExpressionConstraint__Group__0)
		{ after(grammarAccess.getRefinedExpressionConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDottedExpressionConstraint
entryRuleDottedExpressionConstraint
:
{ before(grammarAccess.getDottedExpressionConstraintRule()); }
	 ruleDottedExpressionConstraint
{ after(grammarAccess.getDottedExpressionConstraintRule()); } 
	 EOF 
;

// Rule DottedExpressionConstraint
ruleDottedExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDottedExpressionConstraintAccess().getGroup()); }
		(rule__DottedExpressionConstraint__Group__0)
		{ after(grammarAccess.getDottedExpressionConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubExpressionConstraint
entryRuleSubExpressionConstraint
:
{ before(grammarAccess.getSubExpressionConstraintRule()); }
	 ruleSubExpressionConstraint
{ after(grammarAccess.getSubExpressionConstraintRule()); } 
	 EOF 
;

// Rule SubExpressionConstraint
ruleSubExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getAlternatives()); }
		(rule__SubExpressionConstraint__Alternatives)
		{ after(grammarAccess.getSubExpressionConstraintAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEclFocusConcept
entryRuleEclFocusConcept
:
{ before(grammarAccess.getEclFocusConceptRule()); }
	 ruleEclFocusConcept
{ after(grammarAccess.getEclFocusConceptRule()); } 
	 EOF 
;

// Rule EclFocusConcept
ruleEclFocusConcept 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEclFocusConceptAccess().getAlternatives()); }
		(rule__EclFocusConcept__Alternatives)
		{ after(grammarAccess.getEclFocusConceptAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChildOf
entryRuleChildOf
:
{ before(grammarAccess.getChildOfRule()); }
	 ruleChildOf
{ after(grammarAccess.getChildOfRule()); } 
	 EOF 
;

// Rule ChildOf
ruleChildOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChildOfAccess().getGroup()); }
		(rule__ChildOf__Group__0)
		{ after(grammarAccess.getChildOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChildOrSelfOf
entryRuleChildOrSelfOf
:
{ before(grammarAccess.getChildOrSelfOfRule()); }
	 ruleChildOrSelfOf
{ after(grammarAccess.getChildOrSelfOfRule()); } 
	 EOF 
;

// Rule ChildOrSelfOf
ruleChildOrSelfOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChildOrSelfOfAccess().getGroup()); }
		(rule__ChildOrSelfOf__Group__0)
		{ after(grammarAccess.getChildOrSelfOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDescendantOf
entryRuleDescendantOf
:
{ before(grammarAccess.getDescendantOfRule()); }
	 ruleDescendantOf
{ after(grammarAccess.getDescendantOfRule()); } 
	 EOF 
;

// Rule DescendantOf
ruleDescendantOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDescendantOfAccess().getGroup()); }
		(rule__DescendantOf__Group__0)
		{ after(grammarAccess.getDescendantOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDescendantOrSelfOf
entryRuleDescendantOrSelfOf
:
{ before(grammarAccess.getDescendantOrSelfOfRule()); }
	 ruleDescendantOrSelfOf
{ after(grammarAccess.getDescendantOrSelfOfRule()); } 
	 EOF 
;

// Rule DescendantOrSelfOf
ruleDescendantOrSelfOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDescendantOrSelfOfAccess().getGroup()); }
		(rule__DescendantOrSelfOf__Group__0)
		{ after(grammarAccess.getDescendantOrSelfOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParentOf
entryRuleParentOf
:
{ before(grammarAccess.getParentOfRule()); }
	 ruleParentOf
{ after(grammarAccess.getParentOfRule()); } 
	 EOF 
;

// Rule ParentOf
ruleParentOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParentOfAccess().getGroup()); }
		(rule__ParentOf__Group__0)
		{ after(grammarAccess.getParentOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParentOrSelfOf
entryRuleParentOrSelfOf
:
{ before(grammarAccess.getParentOrSelfOfRule()); }
	 ruleParentOrSelfOf
{ after(grammarAccess.getParentOrSelfOfRule()); } 
	 EOF 
;

// Rule ParentOrSelfOf
ruleParentOrSelfOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParentOrSelfOfAccess().getGroup()); }
		(rule__ParentOrSelfOf__Group__0)
		{ after(grammarAccess.getParentOrSelfOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAncestorOf
entryRuleAncestorOf
:
{ before(grammarAccess.getAncestorOfRule()); }
	 ruleAncestorOf
{ after(grammarAccess.getAncestorOfRule()); } 
	 EOF 
;

// Rule AncestorOf
ruleAncestorOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAncestorOfAccess().getGroup()); }
		(rule__AncestorOf__Group__0)
		{ after(grammarAccess.getAncestorOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAncestorOrSelfOf
entryRuleAncestorOrSelfOf
:
{ before(grammarAccess.getAncestorOrSelfOfRule()); }
	 ruleAncestorOrSelfOf
{ after(grammarAccess.getAncestorOrSelfOfRule()); } 
	 EOF 
;

// Rule AncestorOrSelfOf
ruleAncestorOrSelfOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAncestorOrSelfOfAccess().getGroup()); }
		(rule__AncestorOrSelfOf__Group__0)
		{ after(grammarAccess.getAncestorOrSelfOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMemberOf
entryRuleMemberOf
:
{ before(grammarAccess.getMemberOfRule()); }
	 ruleMemberOf
{ after(grammarAccess.getMemberOfRule()); } 
	 EOF 
;

// Rule MemberOf
ruleMemberOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMemberOfAccess().getGroup()); }
		(rule__MemberOf__Group__0)
		{ after(grammarAccess.getMemberOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEclConceptReference
entryRuleEclConceptReference
:
{ before(grammarAccess.getEclConceptReferenceRule()); }
	 ruleEclConceptReference
{ after(grammarAccess.getEclConceptReferenceRule()); } 
	 EOF 
;

// Rule EclConceptReference
ruleEclConceptReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEclConceptReferenceAccess().getGroup()); }
		(rule__EclConceptReference__Group__0)
		{ after(grammarAccess.getEclConceptReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAny
entryRuleAny
:
{ before(grammarAccess.getAnyRule()); }
	 ruleAny
{ after(grammarAccess.getAnyRule()); } 
	 EOF 
;

// Rule Any
ruleAny 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnyAccess().getGroup()); }
		(rule__Any__Group__0)
		{ after(grammarAccess.getAnyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEclRefinement
entryRuleEclRefinement
:
{ before(grammarAccess.getEclRefinementRule()); }
	 ruleEclRefinement
{ after(grammarAccess.getEclRefinementRule()); } 
	 EOF 
;

// Rule EclRefinement
ruleEclRefinement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEclRefinementAccess().getOrRefinementParserRuleCall()); }
		ruleOrRefinement
		{ after(grammarAccess.getEclRefinementAccess().getOrRefinementParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOrRefinement
entryRuleOrRefinement
:
{ before(grammarAccess.getOrRefinementRule()); }
	 ruleOrRefinement
{ after(grammarAccess.getOrRefinementRule()); } 
	 EOF 
;

// Rule OrRefinement
ruleOrRefinement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOrRefinementAccess().getGroup()); }
		(rule__OrRefinement__Group__0)
		{ after(grammarAccess.getOrRefinementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAndRefinement
entryRuleAndRefinement
:
{ before(grammarAccess.getAndRefinementRule()); }
	 ruleAndRefinement
{ after(grammarAccess.getAndRefinementRule()); } 
	 EOF 
;

// Rule AndRefinement
ruleAndRefinement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAndRefinementAccess().getGroup()); }
		(rule__AndRefinement__Group__0)
		{ after(grammarAccess.getAndRefinementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubRefinement
entryRuleSubRefinement
:
{ before(grammarAccess.getSubRefinementRule()); }
	 ruleSubRefinement
{ after(grammarAccess.getSubRefinementRule()); } 
	 EOF 
;

// Rule SubRefinement
ruleSubRefinement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubRefinementAccess().getAlternatives()); }
		(rule__SubRefinement__Alternatives)
		{ after(grammarAccess.getSubRefinementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNestedRefinement
entryRuleNestedRefinement
:
{ before(grammarAccess.getNestedRefinementRule()); }
	 ruleNestedRefinement
{ after(grammarAccess.getNestedRefinementRule()); } 
	 EOF 
;

// Rule NestedRefinement
ruleNestedRefinement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNestedRefinementAccess().getGroup()); }
		(rule__NestedRefinement__Group__0)
		{ after(grammarAccess.getNestedRefinementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEclAttributeGroup
entryRuleEclAttributeGroup
:
{ before(grammarAccess.getEclAttributeGroupRule()); }
	 ruleEclAttributeGroup
{ after(grammarAccess.getEclAttributeGroupRule()); } 
	 EOF 
;

// Rule EclAttributeGroup
ruleEclAttributeGroup 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEclAttributeGroupAccess().getGroup()); }
		(rule__EclAttributeGroup__Group__0)
		{ after(grammarAccess.getEclAttributeGroupAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEclAttributeSet
entryRuleEclAttributeSet
:
{ before(grammarAccess.getEclAttributeSetRule()); }
	 ruleEclAttributeSet
{ after(grammarAccess.getEclAttributeSetRule()); } 
	 EOF 
;

// Rule EclAttributeSet
ruleEclAttributeSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEclAttributeSetAccess().getOrAttributeSetParserRuleCall()); }
		ruleOrAttributeSet
		{ after(grammarAccess.getEclAttributeSetAccess().getOrAttributeSetParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOrAttributeSet
entryRuleOrAttributeSet
:
{ before(grammarAccess.getOrAttributeSetRule()); }
	 ruleOrAttributeSet
{ after(grammarAccess.getOrAttributeSetRule()); } 
	 EOF 
;

// Rule OrAttributeSet
ruleOrAttributeSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOrAttributeSetAccess().getGroup()); }
		(rule__OrAttributeSet__Group__0)
		{ after(grammarAccess.getOrAttributeSetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAndAttributeSet
entryRuleAndAttributeSet
:
{ before(grammarAccess.getAndAttributeSetRule()); }
	 ruleAndAttributeSet
{ after(grammarAccess.getAndAttributeSetRule()); } 
	 EOF 
;

// Rule AndAttributeSet
ruleAndAttributeSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAndAttributeSetAccess().getGroup()); }
		(rule__AndAttributeSet__Group__0)
		{ after(grammarAccess.getAndAttributeSetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubAttributeSet
entryRuleSubAttributeSet
:
{ before(grammarAccess.getSubAttributeSetRule()); }
	 ruleSubAttributeSet
{ after(grammarAccess.getSubAttributeSetRule()); } 
	 EOF 
;

// Rule SubAttributeSet
ruleSubAttributeSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubAttributeSetAccess().getAlternatives()); }
		(rule__SubAttributeSet__Alternatives)
		{ after(grammarAccess.getSubAttributeSetAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNestedAttributeSet
entryRuleNestedAttributeSet
:
{ before(grammarAccess.getNestedAttributeSetRule()); }
	 ruleNestedAttributeSet
{ after(grammarAccess.getNestedAttributeSetRule()); } 
	 EOF 
;

// Rule NestedAttributeSet
ruleNestedAttributeSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNestedAttributeSetAccess().getGroup()); }
		(rule__NestedAttributeSet__Group__0)
		{ after(grammarAccess.getNestedAttributeSetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttributeConstraint
entryRuleAttributeConstraint
:
{ before(grammarAccess.getAttributeConstraintRule()); }
	 ruleAttributeConstraint
{ after(grammarAccess.getAttributeConstraintRule()); } 
	 EOF 
;

// Rule AttributeConstraint
ruleAttributeConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeConstraintAccess().getGroup()); }
		(rule__AttributeConstraint__Group__0)
		{ after(grammarAccess.getAttributeConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCardinality
entryRuleCardinality
:
{ before(grammarAccess.getCardinalityRule()); }
	 ruleCardinality
{ after(grammarAccess.getCardinalityRule()); } 
	 EOF 
;

// Rule Cardinality
ruleCardinality 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCardinalityAccess().getGroup()); }
		(rule__Cardinality__Group__0)
		{ after(grammarAccess.getCardinalityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComparison
entryRuleComparison
:
{ before(grammarAccess.getComparisonRule()); }
	 ruleComparison
{ after(grammarAccess.getComparisonRule()); } 
	 EOF 
;

// Rule Comparison
ruleComparison 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComparisonAccess().getAlternatives()); }
		(rule__Comparison__Alternatives)
		{ after(grammarAccess.getComparisonAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttributeComparison
entryRuleAttributeComparison
:
{ before(grammarAccess.getAttributeComparisonRule()); }
	 ruleAttributeComparison
{ after(grammarAccess.getAttributeComparisonRule()); } 
	 EOF 
;

// Rule AttributeComparison
ruleAttributeComparison 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeComparisonAccess().getAlternatives()); }
		(rule__AttributeComparison__Alternatives)
		{ after(grammarAccess.getAttributeComparisonAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataTypeComparison
entryRuleDataTypeComparison
:
{ before(grammarAccess.getDataTypeComparisonRule()); }
	 ruleDataTypeComparison
{ after(grammarAccess.getDataTypeComparisonRule()); } 
	 EOF 
;

// Rule DataTypeComparison
ruleDataTypeComparison 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getAlternatives()); }
		(rule__DataTypeComparison__Alternatives)
		{ after(grammarAccess.getDataTypeComparisonAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttributeValueEquals
entryRuleAttributeValueEquals
:
{ before(grammarAccess.getAttributeValueEqualsRule()); }
	 ruleAttributeValueEquals
{ after(grammarAccess.getAttributeValueEqualsRule()); } 
	 EOF 
;

// Rule AttributeValueEquals
ruleAttributeValueEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeValueEqualsAccess().getGroup()); }
		(rule__AttributeValueEquals__Group__0)
		{ after(grammarAccess.getAttributeValueEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttributeValueNotEquals
entryRuleAttributeValueNotEquals
:
{ before(grammarAccess.getAttributeValueNotEqualsRule()); }
	 ruleAttributeValueNotEquals
{ after(grammarAccess.getAttributeValueNotEqualsRule()); } 
	 EOF 
;

// Rule AttributeValueNotEquals
ruleAttributeValueNotEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeValueNotEqualsAccess().getGroup()); }
		(rule__AttributeValueNotEquals__Group__0)
		{ after(grammarAccess.getAttributeValueNotEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBooleanValueEquals
entryRuleBooleanValueEquals
:
{ before(grammarAccess.getBooleanValueEqualsRule()); }
	 ruleBooleanValueEquals
{ after(grammarAccess.getBooleanValueEqualsRule()); } 
	 EOF 
;

// Rule BooleanValueEquals
ruleBooleanValueEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanValueEqualsAccess().getGroup()); }
		(rule__BooleanValueEquals__Group__0)
		{ after(grammarAccess.getBooleanValueEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBooleanValueNotEquals
entryRuleBooleanValueNotEquals
:
{ before(grammarAccess.getBooleanValueNotEqualsRule()); }
	 ruleBooleanValueNotEquals
{ after(grammarAccess.getBooleanValueNotEqualsRule()); } 
	 EOF 
;

// Rule BooleanValueNotEquals
ruleBooleanValueNotEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanValueNotEqualsAccess().getGroup()); }
		(rule__BooleanValueNotEquals__Group__0)
		{ after(grammarAccess.getBooleanValueNotEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringValueEquals
entryRuleStringValueEquals
:
{ before(grammarAccess.getStringValueEqualsRule()); }
	 ruleStringValueEquals
{ after(grammarAccess.getStringValueEqualsRule()); } 
	 EOF 
;

// Rule StringValueEquals
ruleStringValueEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringValueEqualsAccess().getGroup()); }
		(rule__StringValueEquals__Group__0)
		{ after(grammarAccess.getStringValueEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringValueNotEquals
entryRuleStringValueNotEquals
:
{ before(grammarAccess.getStringValueNotEqualsRule()); }
	 ruleStringValueNotEquals
{ after(grammarAccess.getStringValueNotEqualsRule()); } 
	 EOF 
;

// Rule StringValueNotEquals
ruleStringValueNotEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringValueNotEqualsAccess().getGroup()); }
		(rule__StringValueNotEquals__Group__0)
		{ after(grammarAccess.getStringValueNotEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerValueEquals
entryRuleIntegerValueEquals
:
{ before(grammarAccess.getIntegerValueEqualsRule()); }
	 ruleIntegerValueEquals
{ after(grammarAccess.getIntegerValueEqualsRule()); } 
	 EOF 
;

// Rule IntegerValueEquals
ruleIntegerValueEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerValueEqualsAccess().getGroup()); }
		(rule__IntegerValueEquals__Group__0)
		{ after(grammarAccess.getIntegerValueEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerValueNotEquals
entryRuleIntegerValueNotEquals
:
{ before(grammarAccess.getIntegerValueNotEqualsRule()); }
	 ruleIntegerValueNotEquals
{ after(grammarAccess.getIntegerValueNotEqualsRule()); } 
	 EOF 
;

// Rule IntegerValueNotEquals
ruleIntegerValueNotEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerValueNotEqualsAccess().getGroup()); }
		(rule__IntegerValueNotEquals__Group__0)
		{ after(grammarAccess.getIntegerValueNotEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerValueGreaterThan
entryRuleIntegerValueGreaterThan
:
{ before(grammarAccess.getIntegerValueGreaterThanRule()); }
	 ruleIntegerValueGreaterThan
{ after(grammarAccess.getIntegerValueGreaterThanRule()); } 
	 EOF 
;

// Rule IntegerValueGreaterThan
ruleIntegerValueGreaterThan 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerValueGreaterThanAccess().getGroup()); }
		(rule__IntegerValueGreaterThan__Group__0)
		{ after(grammarAccess.getIntegerValueGreaterThanAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerValueLessThan
entryRuleIntegerValueLessThan
:
{ before(grammarAccess.getIntegerValueLessThanRule()); }
	 ruleIntegerValueLessThan
{ after(grammarAccess.getIntegerValueLessThanRule()); } 
	 EOF 
;

// Rule IntegerValueLessThan
ruleIntegerValueLessThan 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerValueLessThanAccess().getGroup()); }
		(rule__IntegerValueLessThan__Group__0)
		{ after(grammarAccess.getIntegerValueLessThanAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerValueGreaterThanEquals
entryRuleIntegerValueGreaterThanEquals
:
{ before(grammarAccess.getIntegerValueGreaterThanEqualsRule()); }
	 ruleIntegerValueGreaterThanEquals
{ after(grammarAccess.getIntegerValueGreaterThanEqualsRule()); } 
	 EOF 
;

// Rule IntegerValueGreaterThanEquals
ruleIntegerValueGreaterThanEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getGroup()); }
		(rule__IntegerValueGreaterThanEquals__Group__0)
		{ after(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerValueLessThanEquals
entryRuleIntegerValueLessThanEquals
:
{ before(grammarAccess.getIntegerValueLessThanEqualsRule()); }
	 ruleIntegerValueLessThanEquals
{ after(grammarAccess.getIntegerValueLessThanEqualsRule()); } 
	 EOF 
;

// Rule IntegerValueLessThanEquals
ruleIntegerValueLessThanEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerValueLessThanEqualsAccess().getGroup()); }
		(rule__IntegerValueLessThanEquals__Group__0)
		{ after(grammarAccess.getIntegerValueLessThanEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDecimalValueEquals
entryRuleDecimalValueEquals
:
{ before(grammarAccess.getDecimalValueEqualsRule()); }
	 ruleDecimalValueEquals
{ after(grammarAccess.getDecimalValueEqualsRule()); } 
	 EOF 
;

// Rule DecimalValueEquals
ruleDecimalValueEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalValueEqualsAccess().getGroup()); }
		(rule__DecimalValueEquals__Group__0)
		{ after(grammarAccess.getDecimalValueEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDecimalValueNotEquals
entryRuleDecimalValueNotEquals
:
{ before(grammarAccess.getDecimalValueNotEqualsRule()); }
	 ruleDecimalValueNotEquals
{ after(grammarAccess.getDecimalValueNotEqualsRule()); } 
	 EOF 
;

// Rule DecimalValueNotEquals
ruleDecimalValueNotEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalValueNotEqualsAccess().getGroup()); }
		(rule__DecimalValueNotEquals__Group__0)
		{ after(grammarAccess.getDecimalValueNotEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDecimalValueGreaterThan
entryRuleDecimalValueGreaterThan
:
{ before(grammarAccess.getDecimalValueGreaterThanRule()); }
	 ruleDecimalValueGreaterThan
{ after(grammarAccess.getDecimalValueGreaterThanRule()); } 
	 EOF 
;

// Rule DecimalValueGreaterThan
ruleDecimalValueGreaterThan 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalValueGreaterThanAccess().getGroup()); }
		(rule__DecimalValueGreaterThan__Group__0)
		{ after(grammarAccess.getDecimalValueGreaterThanAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDecimalValueLessThan
entryRuleDecimalValueLessThan
:
{ before(grammarAccess.getDecimalValueLessThanRule()); }
	 ruleDecimalValueLessThan
{ after(grammarAccess.getDecimalValueLessThanRule()); } 
	 EOF 
;

// Rule DecimalValueLessThan
ruleDecimalValueLessThan 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalValueLessThanAccess().getGroup()); }
		(rule__DecimalValueLessThan__Group__0)
		{ after(grammarAccess.getDecimalValueLessThanAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDecimalValueGreaterThanEquals
entryRuleDecimalValueGreaterThanEquals
:
{ before(grammarAccess.getDecimalValueGreaterThanEqualsRule()); }
	 ruleDecimalValueGreaterThanEquals
{ after(grammarAccess.getDecimalValueGreaterThanEqualsRule()); } 
	 EOF 
;

// Rule DecimalValueGreaterThanEquals
ruleDecimalValueGreaterThanEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getGroup()); }
		(rule__DecimalValueGreaterThanEquals__Group__0)
		{ after(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDecimalValueLessThanEquals
entryRuleDecimalValueLessThanEquals
:
{ before(grammarAccess.getDecimalValueLessThanEqualsRule()); }
	 ruleDecimalValueLessThanEquals
{ after(grammarAccess.getDecimalValueLessThanEqualsRule()); } 
	 EOF 
;

// Rule DecimalValueLessThanEquals
ruleDecimalValueLessThanEquals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalValueLessThanEqualsAccess().getGroup()); }
		(rule__DecimalValueLessThanEquals__Group__0)
		{ after(grammarAccess.getDecimalValueLessThanEqualsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNestedExpression
entryRuleNestedExpression
:
{ before(grammarAccess.getNestedExpressionRule()); }
	 ruleNestedExpression
{ after(grammarAccess.getNestedExpressionRule()); } 
	 EOF 
;

// Rule NestedExpression
ruleNestedExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNestedExpressionAccess().getGroup()); }
		(rule__NestedExpression__Group__0)
		{ after(grammarAccess.getNestedExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSnomedIdentifier
entryRuleSnomedIdentifier
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getSnomedIdentifierRule()); }
	 ruleSnomedIdentifier
{ after(grammarAccess.getSnomedIdentifierRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule SnomedIdentifier
ruleSnomedIdentifier 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getGroup()); }
		(rule__SnomedIdentifier__Group__0)
		{ after(grammarAccess.getSnomedIdentifierAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleNonNegativeInteger
entryRuleNonNegativeInteger
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getNonNegativeIntegerRule()); }
	 ruleNonNegativeInteger
{ after(grammarAccess.getNonNegativeIntegerRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule NonNegativeInteger
ruleNonNegativeInteger 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getAlternatives()); }
		(rule__NonNegativeInteger__Alternatives)
		{ after(grammarAccess.getNonNegativeIntegerAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleMaxValue
entryRuleMaxValue
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getMaxValueRule()); }
	 ruleMaxValue
{ after(grammarAccess.getMaxValueRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule MaxValue
ruleMaxValue 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMaxValueAccess().getAlternatives()); }
		(rule__MaxValue__Alternatives)
		{ after(grammarAccess.getMaxValueAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleInteger
entryRuleInteger
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getIntegerRule()); }
	 ruleInteger
{ after(grammarAccess.getIntegerRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Integer
ruleInteger 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerAccess().getGroup()); }
		(rule__Integer__Group__0)
		{ after(grammarAccess.getIntegerAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleDecimal
entryRuleDecimal
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getDecimalRule()); }
	 ruleDecimal
{ after(grammarAccess.getDecimalRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Decimal
ruleDecimal 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalAccess().getGroup()); }
		(rule__Decimal__Group__0)
		{ after(grammarAccess.getDecimalAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleNonNegativeDecimal
entryRuleNonNegativeDecimal
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getNonNegativeDecimalRule()); }
	 ruleNonNegativeDecimal
{ after(grammarAccess.getNonNegativeDecimalRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule NonNegativeDecimal
ruleNonNegativeDecimal 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNonNegativeDecimalAccess().getGroup()); }
		(rule__NonNegativeDecimal__Group__0)
		{ after(grammarAccess.getNonNegativeDecimalAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleBoolean
entryRuleBoolean
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getBooleanRule()); }
	 ruleBoolean
{ after(grammarAccess.getBooleanRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Boolean
ruleBoolean 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanAccess().getAlternatives()); }
		(rule__Boolean__Alternatives)
		{ after(grammarAccess.getBooleanAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Rule LexicalSearchType
ruleLexicalSearchType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLexicalSearchTypeAccess().getAlternatives()); }
		(rule__LexicalSearchType__Alternatives)
		{ after(grammarAccess.getLexicalSearchTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Domain
ruleDomain
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDomainAccess().getAlternatives()); }
		(rule__Domain__Alternatives)
		{ after(grammarAccess.getDomainAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryConjunction__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQueryConjunctionAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); }
		RULE_CONJUNCTION
		{ after(grammarAccess.getQueryConjunctionAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getQueryConjunctionAccess().getCOMMATerminalRuleCall_1_1_1()); }
		RULE_COMMA
		{ after(grammarAccess.getQueryConjunctionAccess().getCOMMATerminalRuleCall_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubQuery__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubQueryAccess().getDomainQueryParserRuleCall_0()); }
		ruleDomainQuery
		{ after(grammarAccess.getSubQueryAccess().getDomainQueryParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSubQueryAccess().getNestedQueryParserRuleCall_1()); }
		ruleNestedQuery
		{ after(grammarAccess.getSubQueryAccess().getNestedQueryParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConjunctionFilterAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); }
		RULE_CONJUNCTION
		{ after(grammarAccess.getConjunctionFilterAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getConjunctionFilterAccess().getCOMMATerminalRuleCall_1_1_1()); }
		RULE_COMMA
		{ after(grammarAccess.getConjunctionFilterAccess().getCOMMATerminalRuleCall_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyFilter__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyFilterAccess().getActiveFilterParserRuleCall_0()); }
		ruleActiveFilter
		{ after(grammarAccess.getPropertyFilterAccess().getActiveFilterParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getTermFilterParserRuleCall_1()); }
		ruleTermFilter
		{ after(grammarAccess.getPropertyFilterAccess().getTermFilterParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getPreferredInFilterParserRuleCall_2()); }
		rulePreferredInFilter
		{ after(grammarAccess.getPropertyFilterAccess().getPreferredInFilterParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getAcceptableInFilterParserRuleCall_3()); }
		ruleAcceptableInFilter
		{ after(grammarAccess.getPropertyFilterAccess().getAcceptableInFilterParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getLanguageRefSetFilterParserRuleCall_4()); }
		ruleLanguageRefSetFilter
		{ after(grammarAccess.getPropertyFilterAccess().getLanguageRefSetFilterParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getTypeFilterParserRuleCall_5()); }
		ruleTypeFilter
		{ after(grammarAccess.getPropertyFilterAccess().getTypeFilterParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getModuleFilterParserRuleCall_6()); }
		ruleModuleFilter
		{ after(grammarAccess.getPropertyFilterAccess().getModuleFilterParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getCaseSignificanceFilterParserRuleCall_7()); }
		ruleCaseSignificanceFilter
		{ after(grammarAccess.getPropertyFilterAccess().getCaseSignificanceFilterParserRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getLanguageCodeFilterParserRuleCall_8()); }
		ruleLanguageCodeFilter
		{ after(grammarAccess.getPropertyFilterAccess().getLanguageCodeFilterParserRuleCall_8()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getNestedFilterParserRuleCall_9()); }
		ruleNestedFilter
		{ after(grammarAccess.getPropertyFilterAccess().getNestedFilterParserRuleCall_9()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndExpressionConstraintAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); }
		RULE_CONJUNCTION
		{ after(grammarAccess.getAndExpressionConstraintAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getAndExpressionConstraintAccess().getCOMMATerminalRuleCall_1_1_1()); }
		RULE_COMMA
		{ after(grammarAccess.getAndExpressionConstraintAccess().getCOMMATerminalRuleCall_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpressionConstraint__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getChildOfParserRuleCall_0()); }
		ruleChildOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getChildOfParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getChildOrSelfOfParserRuleCall_1()); }
		ruleChildOrSelfOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getChildOrSelfOfParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getDescendantOfParserRuleCall_2()); }
		ruleDescendantOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getDescendantOfParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getDescendantOrSelfOfParserRuleCall_3()); }
		ruleDescendantOrSelfOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getDescendantOrSelfOfParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getParentOfParserRuleCall_4()); }
		ruleParentOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getParentOfParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getParentOrSelfOfParserRuleCall_5()); }
		ruleParentOrSelfOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getParentOrSelfOfParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getAncestorOfParserRuleCall_6()); }
		ruleAncestorOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getAncestorOfParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getAncestorOrSelfOfParserRuleCall_7()); }
		ruleAncestorOrSelfOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getAncestorOrSelfOfParserRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getEclFocusConceptParserRuleCall_8()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getSubExpressionConstraintAccess().getEclFocusConceptParserRuleCall_8()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclFocusConcept__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEclFocusConceptAccess().getMemberOfParserRuleCall_0()); }
		ruleMemberOf
		{ after(grammarAccess.getEclFocusConceptAccess().getMemberOfParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEclFocusConceptAccess().getEclConceptReferenceParserRuleCall_1()); }
		ruleEclConceptReference
		{ after(grammarAccess.getEclFocusConceptAccess().getEclConceptReferenceParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getEclFocusConceptAccess().getAnyParserRuleCall_2()); }
		ruleAny
		{ after(grammarAccess.getEclFocusConceptAccess().getAnyParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getEclFocusConceptAccess().getNestedExpressionParserRuleCall_3()); }
		ruleNestedExpression
		{ after(grammarAccess.getEclFocusConceptAccess().getNestedExpressionParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__ConstraintAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberOfAccess().getConstraintEclConceptReferenceParserRuleCall_1_0_0()); }
		ruleEclConceptReference
		{ after(grammarAccess.getMemberOfAccess().getConstraintEclConceptReferenceParserRuleCall_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMemberOfAccess().getConstraintAnyParserRuleCall_1_0_1()); }
		ruleAny
		{ after(grammarAccess.getMemberOfAccess().getConstraintAnyParserRuleCall_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getMemberOfAccess().getConstraintNestedExpressionParserRuleCall_1_0_2()); }
		ruleNestedExpression
		{ after(grammarAccess.getMemberOfAccess().getConstraintNestedExpressionParserRuleCall_1_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Alternatives_1_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndRefinementAccess().getCONJUNCTIONTerminalRuleCall_1_0_1_0()); }
		RULE_CONJUNCTION
		{ after(grammarAccess.getAndRefinementAccess().getCONJUNCTIONTerminalRuleCall_1_0_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getAndRefinementAccess().getCOMMATerminalRuleCall_1_0_1_1()); }
		RULE_COMMA
		{ after(grammarAccess.getAndRefinementAccess().getCOMMATerminalRuleCall_1_0_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubRefinement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubRefinementAccess().getAttributeConstraintParserRuleCall_0()); }
		ruleAttributeConstraint
		{ after(grammarAccess.getSubRefinementAccess().getAttributeConstraintParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSubRefinementAccess().getEclAttributeGroupParserRuleCall_1()); }
		ruleEclAttributeGroup
		{ after(grammarAccess.getSubRefinementAccess().getEclAttributeGroupParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getSubRefinementAccess().getNestedRefinementParserRuleCall_2()); }
		ruleNestedRefinement
		{ after(grammarAccess.getSubRefinementAccess().getNestedRefinementParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndAttributeSetAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); }
		RULE_CONJUNCTION
		{ after(grammarAccess.getAndAttributeSetAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getAndAttributeSetAccess().getCOMMATerminalRuleCall_1_1_1()); }
		RULE_COMMA
		{ after(grammarAccess.getAndAttributeSetAccess().getCOMMATerminalRuleCall_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAttributeSet__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubAttributeSetAccess().getAttributeConstraintParserRuleCall_0()); }
		ruleAttributeConstraint
		{ after(grammarAccess.getSubAttributeSetAccess().getAttributeConstraintParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSubAttributeSetAccess().getNestedAttributeSetParserRuleCall_1()); }
		ruleNestedAttributeSet
		{ after(grammarAccess.getSubAttributeSetAccess().getNestedAttributeSetParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComparisonAccess().getAttributeComparisonParserRuleCall_0()); }
		ruleAttributeComparison
		{ after(grammarAccess.getComparisonAccess().getAttributeComparisonParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getComparisonAccess().getDataTypeComparisonParserRuleCall_1()); }
		ruleDataTypeComparison
		{ after(grammarAccess.getComparisonAccess().getDataTypeComparisonParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeComparison__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeComparisonAccess().getAttributeValueEqualsParserRuleCall_0()); }
		ruleAttributeValueEquals
		{ after(grammarAccess.getAttributeComparisonAccess().getAttributeValueEqualsParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeComparisonAccess().getAttributeValueNotEqualsParserRuleCall_1()); }
		ruleAttributeValueNotEquals
		{ after(grammarAccess.getAttributeComparisonAccess().getAttributeValueNotEqualsParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataTypeComparison__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getBooleanValueEqualsParserRuleCall_0()); }
		ruleBooleanValueEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getBooleanValueEqualsParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getBooleanValueNotEqualsParserRuleCall_1()); }
		ruleBooleanValueNotEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getBooleanValueNotEqualsParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getStringValueEqualsParserRuleCall_2()); }
		ruleStringValueEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getStringValueEqualsParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getStringValueNotEqualsParserRuleCall_3()); }
		ruleStringValueNotEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getStringValueNotEqualsParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getIntegerValueEqualsParserRuleCall_4()); }
		ruleIntegerValueEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getIntegerValueEqualsParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getIntegerValueNotEqualsParserRuleCall_5()); }
		ruleIntegerValueNotEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getIntegerValueNotEqualsParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getIntegerValueGreaterThanParserRuleCall_6()); }
		ruleIntegerValueGreaterThan
		{ after(grammarAccess.getDataTypeComparisonAccess().getIntegerValueGreaterThanParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getIntegerValueGreaterThanEqualsParserRuleCall_7()); }
		ruleIntegerValueGreaterThanEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getIntegerValueGreaterThanEqualsParserRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getIntegerValueLessThanParserRuleCall_8()); }
		ruleIntegerValueLessThan
		{ after(grammarAccess.getDataTypeComparisonAccess().getIntegerValueLessThanParserRuleCall_8()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getIntegerValueLessThanEqualsParserRuleCall_9()); }
		ruleIntegerValueLessThanEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getIntegerValueLessThanEqualsParserRuleCall_9()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getDecimalValueEqualsParserRuleCall_10()); }
		ruleDecimalValueEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getDecimalValueEqualsParserRuleCall_10()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getDecimalValueNotEqualsParserRuleCall_11()); }
		ruleDecimalValueNotEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getDecimalValueNotEqualsParserRuleCall_11()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getDecimalValueGreaterThanParserRuleCall_12()); }
		ruleDecimalValueGreaterThan
		{ after(grammarAccess.getDataTypeComparisonAccess().getDecimalValueGreaterThanParserRuleCall_12()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getDecimalValueGreaterThanEqualsParserRuleCall_13()); }
		ruleDecimalValueGreaterThanEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getDecimalValueGreaterThanEqualsParserRuleCall_13()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getDecimalValueLessThanParserRuleCall_14()); }
		ruleDecimalValueLessThan
		{ after(grammarAccess.getDataTypeComparisonAccess().getDecimalValueLessThanParserRuleCall_14()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getDecimalValueLessThanEqualsParserRuleCall_15()); }
		ruleDecimalValueLessThanEquals
		{ after(grammarAccess.getDataTypeComparisonAccess().getDecimalValueLessThanEqualsParserRuleCall_15()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_1_1()); }
		RULE_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_2_1()); }
		RULE_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_3_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_3_1()); }
		RULE_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_4_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_4_1()); }
		RULE_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_4_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_5_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_5_1()); }
		RULE_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_5_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeInteger__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_0()); }
		RULE_ZERO
		{ after(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getGroup_1()); }
		(rule__NonNegativeInteger__Group_1__0)
		{ after(grammarAccess.getNonNegativeIntegerAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeInteger__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_1_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_1_1_1()); }
		RULE_ZERO
		{ after(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxValue__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMaxValueAccess().getNonNegativeIntegerParserRuleCall_0()); }
		ruleNonNegativeInteger
		{ after(grammarAccess.getMaxValueAccess().getNonNegativeIntegerParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getMaxValueAccess().getWILDCARDTerminalRuleCall_1()); }
		RULE_WILDCARD
		{ after(grammarAccess.getMaxValueAccess().getWILDCARDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Integer__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0()); }
		RULE_PLUS
		{ after(grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getIntegerAccess().getDASHTerminalRuleCall_0_1()); }
		RULE_DASH
		{ after(grammarAccess.getIntegerAccess().getDASHTerminalRuleCall_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0()); }
		RULE_PLUS
		{ after(grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getDecimalAccess().getDASHTerminalRuleCall_0_1()); }
		RULE_DASH
		{ after(grammarAccess.getDecimalAccess().getDASHTerminalRuleCall_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNonNegativeDecimalAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getNonNegativeDecimalAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getNonNegativeDecimalAccess().getZEROTerminalRuleCall_2_1()); }
		RULE_ZERO
		{ after(grammarAccess.getNonNegativeDecimalAccess().getZEROTerminalRuleCall_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Boolean__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); }
		True
		{ after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); }
		False
		{ after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LexicalSearchType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLexicalSearchTypeAccess().getMATCHEnumLiteralDeclaration_0()); }
		(Match)
		{ after(grammarAccess.getLexicalSearchTypeAccess().getMATCHEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getLexicalSearchTypeAccess().getREGEXEnumLiteralDeclaration_1()); }
		(Regex)
		{ after(grammarAccess.getLexicalSearchTypeAccess().getREGEXEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getLexicalSearchTypeAccess().getEXACTEnumLiteralDeclaration_2()); }
		(Exact)
		{ after(grammarAccess.getLexicalSearchTypeAccess().getEXACTEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Domain__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDomainAccess().getCONCEPTEnumLiteralDeclaration_0()); }
		(Concept)
		{ after(grammarAccess.getDomainAccess().getCONCEPTEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getDomainAccess().getDESCRIPTIONEnumLiteralDeclaration_1()); }
		(Description)
		{ after(grammarAccess.getDomainAccess().getDESCRIPTIONEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Query__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Query__Group__0__Impl
	rule__Query__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Query__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryAccess().getQueryAction_0()); }
	()
	{ after(grammarAccess.getQueryAccess().getQueryAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Query__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Query__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Query__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryAccess().getQueryAssignment_1()); }
	(rule__Query__QueryAssignment_1)?
	{ after(grammarAccess.getQueryAccess().getQueryAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QueryDisjunction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryDisjunction__Group__0__Impl
	rule__QueryDisjunction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryDisjunction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryDisjunctionAccess().getQueryConjunctionParserRuleCall_0()); }
	ruleQueryConjunction
	{ after(grammarAccess.getQueryDisjunctionAccess().getQueryConjunctionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryDisjunction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryDisjunction__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryDisjunction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryDisjunctionAccess().getGroup_1()); }
	(rule__QueryDisjunction__Group_1__0)*
	{ after(grammarAccess.getQueryDisjunctionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QueryDisjunction__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryDisjunction__Group_1__0__Impl
	rule__QueryDisjunction__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryDisjunction__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryDisjunctionAccess().getQueryDisjunctionLeftAction_1_0()); }
	()
	{ after(grammarAccess.getQueryDisjunctionAccess().getQueryDisjunctionLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryDisjunction__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryDisjunction__Group_1__1__Impl
	rule__QueryDisjunction__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryDisjunction__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryDisjunctionAccess().getDISJUNCTIONTerminalRuleCall_1_1()); }
	RULE_DISJUNCTION
	{ after(grammarAccess.getQueryDisjunctionAccess().getDISJUNCTIONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryDisjunction__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryDisjunction__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryDisjunction__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryDisjunctionAccess().getRightAssignment_1_2()); }
	(rule__QueryDisjunction__RightAssignment_1_2)
	{ after(grammarAccess.getQueryDisjunctionAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QueryConjunction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryConjunction__Group__0__Impl
	rule__QueryConjunction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryConjunction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryConjunctionAccess().getQueryExclusionParserRuleCall_0()); }
	ruleQueryExclusion
	{ after(grammarAccess.getQueryConjunctionAccess().getQueryExclusionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryConjunction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryConjunction__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryConjunction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryConjunctionAccess().getGroup_1()); }
	(rule__QueryConjunction__Group_1__0)*
	{ after(grammarAccess.getQueryConjunctionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QueryConjunction__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryConjunction__Group_1__0__Impl
	rule__QueryConjunction__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryConjunction__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryConjunctionAccess().getQueryConjunctionLeftAction_1_0()); }
	()
	{ after(grammarAccess.getQueryConjunctionAccess().getQueryConjunctionLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryConjunction__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryConjunction__Group_1__1__Impl
	rule__QueryConjunction__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryConjunction__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryConjunctionAccess().getAlternatives_1_1()); }
	(rule__QueryConjunction__Alternatives_1_1)
	{ after(grammarAccess.getQueryConjunctionAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryConjunction__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryConjunction__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryConjunction__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryConjunctionAccess().getRightAssignment_1_2()); }
	(rule__QueryConjunction__RightAssignment_1_2)
	{ after(grammarAccess.getQueryConjunctionAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QueryExclusion__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryExclusion__Group__0__Impl
	rule__QueryExclusion__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryExclusion__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryExclusionAccess().getSubQueryParserRuleCall_0()); }
	ruleSubQuery
	{ after(grammarAccess.getQueryExclusionAccess().getSubQueryParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryExclusion__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryExclusion__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryExclusion__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryExclusionAccess().getGroup_1()); }
	(rule__QueryExclusion__Group_1__0)?
	{ after(grammarAccess.getQueryExclusionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QueryExclusion__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryExclusion__Group_1__0__Impl
	rule__QueryExclusion__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryExclusion__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryExclusionAccess().getQueryExclusionLeftAction_1_0()); }
	()
	{ after(grammarAccess.getQueryExclusionAccess().getQueryExclusionLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryExclusion__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryExclusion__Group_1__1__Impl
	rule__QueryExclusion__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryExclusion__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryExclusionAccess().getEXCLUSIONTerminalRuleCall_1_1()); }
	RULE_EXCLUSION
	{ after(grammarAccess.getQueryExclusionAccess().getEXCLUSIONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryExclusion__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QueryExclusion__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryExclusion__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQueryExclusionAccess().getRightAssignment_1_2()); }
	(rule__QueryExclusion__RightAssignment_1_2)
	{ after(grammarAccess.getQueryExclusionAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DomainQuery__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DomainQuery__Group__0__Impl
	rule__DomainQuery__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainQuery__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDomainQueryAccess().getDomainQueryAction_0()); }
	()
	{ after(grammarAccess.getDomainQueryAccess().getDomainQueryAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainQuery__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DomainQuery__Group__1__Impl
	rule__DomainQuery__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainQuery__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDomainQueryAccess().getEclAssignment_1()); }
	(rule__DomainQuery__EclAssignment_1)?
	{ after(grammarAccess.getDomainQueryAccess().getEclAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainQuery__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DomainQuery__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainQuery__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDomainQueryAccess().getGroup_2()); }
	(rule__DomainQuery__Group_2__0)?
	{ after(grammarAccess.getDomainQueryAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DomainQuery__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DomainQuery__Group_2__0__Impl
	rule__DomainQuery__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainQuery__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDomainQueryAccess().getOPEN_DOUBLE_BRACESTerminalRuleCall_2_0()); }
	RULE_OPEN_DOUBLE_BRACES
	{ after(grammarAccess.getDomainQueryAccess().getOPEN_DOUBLE_BRACESTerminalRuleCall_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainQuery__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DomainQuery__Group_2__1__Impl
	rule__DomainQuery__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainQuery__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDomainQueryAccess().getFilterAssignment_2_1()); }
	(rule__DomainQuery__FilterAssignment_2_1)
	{ after(grammarAccess.getDomainQueryAccess().getFilterAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainQuery__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DomainQuery__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainQuery__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDomainQueryAccess().getCLOSE_DOUBLE_BRACESTerminalRuleCall_2_2()); }
	RULE_CLOSE_DOUBLE_BRACES
	{ after(grammarAccess.getDomainQueryAccess().getCLOSE_DOUBLE_BRACESTerminalRuleCall_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NestedQuery__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedQuery__Group__0__Impl
	rule__NestedQuery__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedQuery__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedQueryAccess().getROUND_OPENTerminalRuleCall_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getNestedQueryAccess().getROUND_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedQuery__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedQuery__Group__1__Impl
	rule__NestedQuery__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedQuery__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedQueryAccess().getNestedAssignment_1()); }
	(rule__NestedQuery__NestedAssignment_1)
	{ after(grammarAccess.getNestedQueryAccess().getNestedAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedQuery__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedQuery__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedQuery__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedQueryAccess().getROUND_CLOSETerminalRuleCall_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getNestedQueryAccess().getROUND_CLOSETerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DisjunctionFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DisjunctionFilter__Group__0__Impl
	rule__DisjunctionFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDisjunctionFilterAccess().getConjunctionFilterParserRuleCall_0()); }
	ruleConjunctionFilter
	{ after(grammarAccess.getDisjunctionFilterAccess().getConjunctionFilterParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DisjunctionFilter__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDisjunctionFilterAccess().getGroup_1()); }
	(rule__DisjunctionFilter__Group_1__0)*
	{ after(grammarAccess.getDisjunctionFilterAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DisjunctionFilter__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DisjunctionFilter__Group_1__0__Impl
	rule__DisjunctionFilter__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDisjunctionFilterAccess().getDisjunctionFilterLeftAction_1_0()); }
	()
	{ after(grammarAccess.getDisjunctionFilterAccess().getDisjunctionFilterLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DisjunctionFilter__Group_1__1__Impl
	rule__DisjunctionFilter__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDisjunctionFilterAccess().getDISJUNCTIONTerminalRuleCall_1_1()); }
	RULE_DISJUNCTION
	{ after(grammarAccess.getDisjunctionFilterAccess().getDISJUNCTIONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DisjunctionFilter__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDisjunctionFilterAccess().getRightAssignment_1_2()); }
	(rule__DisjunctionFilter__RightAssignment_1_2)
	{ after(grammarAccess.getDisjunctionFilterAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConjunctionFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConjunctionFilter__Group__0__Impl
	rule__ConjunctionFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConjunctionFilterAccess().getExclusionFilterParserRuleCall_0()); }
	ruleExclusionFilter
	{ after(grammarAccess.getConjunctionFilterAccess().getExclusionFilterParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConjunctionFilter__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConjunctionFilterAccess().getGroup_1()); }
	(rule__ConjunctionFilter__Group_1__0)*
	{ after(grammarAccess.getConjunctionFilterAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConjunctionFilter__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConjunctionFilter__Group_1__0__Impl
	rule__ConjunctionFilter__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConjunctionFilterAccess().getConjunctionFilterLeftAction_1_0()); }
	()
	{ after(grammarAccess.getConjunctionFilterAccess().getConjunctionFilterLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConjunctionFilter__Group_1__1__Impl
	rule__ConjunctionFilter__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConjunctionFilterAccess().getAlternatives_1_1()); }
	(rule__ConjunctionFilter__Alternatives_1_1)
	{ after(grammarAccess.getConjunctionFilterAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConjunctionFilter__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConjunctionFilterAccess().getRightAssignment_1_2()); }
	(rule__ConjunctionFilter__RightAssignment_1_2)
	{ after(grammarAccess.getConjunctionFilterAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExclusionFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionFilter__Group__0__Impl
	rule__ExclusionFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionFilterAccess().getPropertyFilterParserRuleCall_0()); }
	rulePropertyFilter
	{ after(grammarAccess.getExclusionFilterAccess().getPropertyFilterParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionFilter__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionFilterAccess().getGroup_1()); }
	(rule__ExclusionFilter__Group_1__0)?
	{ after(grammarAccess.getExclusionFilterAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExclusionFilter__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionFilter__Group_1__0__Impl
	rule__ExclusionFilter__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionFilter__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionFilterAccess().getExclusionFilterLeftAction_1_0()); }
	()
	{ after(grammarAccess.getExclusionFilterAccess().getExclusionFilterLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionFilter__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionFilter__Group_1__1__Impl
	rule__ExclusionFilter__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionFilter__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionFilterAccess().getEXCLUSIONTerminalRuleCall_1_1()); }
	RULE_EXCLUSION
	{ after(grammarAccess.getExclusionFilterAccess().getEXCLUSIONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionFilter__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionFilter__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionFilter__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionFilterAccess().getRightAssignment_1_2()); }
	(rule__ExclusionFilter__RightAssignment_1_2)
	{ after(grammarAccess.getExclusionFilterAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NestedFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedFilter__Group__0__Impl
	rule__NestedFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFilterAccess().getROUND_OPENTerminalRuleCall_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getNestedFilterAccess().getROUND_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedFilter__Group__1__Impl
	rule__NestedFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFilterAccess().getNestedAssignment_1()); }
	(rule__NestedFilter__NestedAssignment_1)
	{ after(grammarAccess.getNestedFilterAccess().getNestedAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFilterAccess().getROUND_CLOSETerminalRuleCall_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getNestedFilterAccess().getROUND_CLOSETerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActiveFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActiveFilter__Group__0__Impl
	rule__ActiveFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActiveFilterAccess().getGroup_0()); }
	(rule__ActiveFilter__Group_0__0)?
	{ after(grammarAccess.getActiveFilterAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActiveFilter__Group__1__Impl
	rule__ActiveFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActiveFilterAccess().getActiveKeyword_1()); }
	Active
	{ after(grammarAccess.getActiveFilterAccess().getActiveKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActiveFilter__Group__2__Impl
	rule__ActiveFilter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActiveFilterAccess().getEQUALTerminalRuleCall_2()); }
	RULE_EQUAL
	{ after(grammarAccess.getActiveFilterAccess().getEQUALTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActiveFilter__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActiveFilterAccess().getActiveAssignment_3()); }
	(rule__ActiveFilter__ActiveAssignment_3)
	{ after(grammarAccess.getActiveFilterAccess().getActiveAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActiveFilter__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActiveFilter__Group_0__0__Impl
	rule__ActiveFilter__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActiveFilterAccess().getDomainAssignment_0_0()); }
	(rule__ActiveFilter__DomainAssignment_0_0)
	{ after(grammarAccess.getActiveFilterAccess().getDomainAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActiveFilter__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActiveFilterAccess().getDOTTerminalRuleCall_0_1()); }
	RULE_DOT
	{ after(grammarAccess.getActiveFilterAccess().getDOTTerminalRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ModuleFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModuleFilter__Group__0__Impl
	rule__ModuleFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleFilterAccess().getGroup_0()); }
	(rule__ModuleFilter__Group_0__0)?
	{ after(grammarAccess.getModuleFilterAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModuleFilter__Group__1__Impl
	rule__ModuleFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleFilterAccess().getModuleIdKeyword_1()); }
	ModuleId
	{ after(grammarAccess.getModuleFilterAccess().getModuleIdKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModuleFilter__Group__2__Impl
	rule__ModuleFilter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleFilterAccess().getEQUALTerminalRuleCall_2()); }
	RULE_EQUAL
	{ after(grammarAccess.getModuleFilterAccess().getEQUALTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModuleFilter__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleFilterAccess().getModuleIdAssignment_3()); }
	(rule__ModuleFilter__ModuleIdAssignment_3)
	{ after(grammarAccess.getModuleFilterAccess().getModuleIdAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ModuleFilter__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModuleFilter__Group_0__0__Impl
	rule__ModuleFilter__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleFilterAccess().getDomainAssignment_0_0()); }
	(rule__ModuleFilter__DomainAssignment_0_0)
	{ after(grammarAccess.getModuleFilterAccess().getDomainAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModuleFilter__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleFilterAccess().getDOTTerminalRuleCall_0_1()); }
	RULE_DOT
	{ after(grammarAccess.getModuleFilterAccess().getDOTTerminalRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TermFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TermFilter__Group__0__Impl
	rule__TermFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermFilterAccess().getTermKeyword_0()); }
	Term
	{ after(grammarAccess.getTermFilterAccess().getTermKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TermFilter__Group__1__Impl
	rule__TermFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermFilterAccess().getEQUALTerminalRuleCall_1()); }
	RULE_EQUAL
	{ after(grammarAccess.getTermFilterAccess().getEQUALTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TermFilter__Group__2__Impl
	rule__TermFilter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermFilterAccess().getGroup_2()); }
	(rule__TermFilter__Group_2__0)?
	{ after(grammarAccess.getTermFilterAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TermFilter__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermFilterAccess().getTermAssignment_3()); }
	(rule__TermFilter__TermAssignment_3)
	{ after(grammarAccess.getTermFilterAccess().getTermAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TermFilter__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TermFilter__Group_2__0__Impl
	rule__TermFilter__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermFilterAccess().getLexicalSearchTypeAssignment_2_0()); }
	(rule__TermFilter__LexicalSearchTypeAssignment_2_0)
	{ after(grammarAccess.getTermFilterAccess().getLexicalSearchTypeAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TermFilter__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermFilterAccess().getCOLONTerminalRuleCall_2_1()); }
	RULE_COLON
	{ after(grammarAccess.getTermFilterAccess().getCOLONTerminalRuleCall_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PreferredInFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PreferredInFilter__Group__0__Impl
	rule__PreferredInFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PreferredInFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPreferredInFilterAccess().getPreferredInKeyword_0()); }
	PreferredIn
	{ after(grammarAccess.getPreferredInFilterAccess().getPreferredInKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PreferredInFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PreferredInFilter__Group__1__Impl
	rule__PreferredInFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PreferredInFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPreferredInFilterAccess().getEQUALTerminalRuleCall_1()); }
	RULE_EQUAL
	{ after(grammarAccess.getPreferredInFilterAccess().getEQUALTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PreferredInFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PreferredInFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PreferredInFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdAssignment_2()); }
	(rule__PreferredInFilter__LanguageRefSetIdAssignment_2)
	{ after(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AcceptableInFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AcceptableInFilter__Group__0__Impl
	rule__AcceptableInFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptableInFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAcceptableInFilterAccess().getAcceptableInKeyword_0()); }
	AcceptableIn
	{ after(grammarAccess.getAcceptableInFilterAccess().getAcceptableInKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptableInFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AcceptableInFilter__Group__1__Impl
	rule__AcceptableInFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptableInFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAcceptableInFilterAccess().getEQUALTerminalRuleCall_1()); }
	RULE_EQUAL
	{ after(grammarAccess.getAcceptableInFilterAccess().getEQUALTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptableInFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AcceptableInFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptableInFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdAssignment_2()); }
	(rule__AcceptableInFilter__LanguageRefSetIdAssignment_2)
	{ after(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LanguageRefSetFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageRefSetFilter__Group__0__Impl
	rule__LanguageRefSetFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageRefSetFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdKeyword_0()); }
	LanguageRefSetId
	{ after(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageRefSetFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageRefSetFilter__Group__1__Impl
	rule__LanguageRefSetFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageRefSetFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageRefSetFilterAccess().getEQUALTerminalRuleCall_1()); }
	RULE_EQUAL
	{ after(grammarAccess.getLanguageRefSetFilterAccess().getEQUALTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageRefSetFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageRefSetFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageRefSetFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdAssignment_2()); }
	(rule__LanguageRefSetFilter__LanguageRefSetIdAssignment_2)
	{ after(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeFilter__Group__0__Impl
	rule__TypeFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeFilterAccess().getTypeIdKeyword_0()); }
	TypeId
	{ after(grammarAccess.getTypeFilterAccess().getTypeIdKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeFilter__Group__1__Impl
	rule__TypeFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeFilterAccess().getEQUALTerminalRuleCall_1()); }
	RULE_EQUAL
	{ after(grammarAccess.getTypeFilterAccess().getEQUALTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeFilterAccess().getTypeAssignment_2()); }
	(rule__TypeFilter__TypeAssignment_2)
	{ after(grammarAccess.getTypeFilterAccess().getTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CaseSignificanceFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CaseSignificanceFilter__Group__0__Impl
	rule__CaseSignificanceFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseSignificanceFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdKeyword_0()); }
	CaseSignificanceId
	{ after(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseSignificanceFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CaseSignificanceFilter__Group__1__Impl
	rule__CaseSignificanceFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseSignificanceFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseSignificanceFilterAccess().getEQUALTerminalRuleCall_1()); }
	RULE_EQUAL
	{ after(grammarAccess.getCaseSignificanceFilterAccess().getEQUALTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseSignificanceFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CaseSignificanceFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseSignificanceFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdAssignment_2()); }
	(rule__CaseSignificanceFilter__CaseSignificanceIdAssignment_2)
	{ after(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LanguageCodeFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageCodeFilter__Group__0__Impl
	rule__LanguageCodeFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodeKeyword_0()); }
	LanguageCode
	{ after(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageCodeFilter__Group__1__Impl
	rule__LanguageCodeFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageCodeFilterAccess().getEQUALTerminalRuleCall_1()); }
	RULE_EQUAL
	{ after(grammarAccess.getLanguageCodeFilterAccess().getEQUALTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageCodeFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodeAssignment_2()); }
	(rule__LanguageCodeFilter__LanguageCodeAssignment_2)
	{ after(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpressionConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpressionConstraint__Group__0__Impl
	rule__OrExpressionConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionConstraintAccess().getAndExpressionConstraintParserRuleCall_0()); }
	ruleAndExpressionConstraint
	{ after(grammarAccess.getOrExpressionConstraintAccess().getAndExpressionConstraintParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpressionConstraint__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionConstraintAccess().getGroup_1()); }
	(rule__OrExpressionConstraint__Group_1__0)*
	{ after(grammarAccess.getOrExpressionConstraintAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpressionConstraint__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpressionConstraint__Group_1__0__Impl
	rule__OrExpressionConstraint__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionConstraintAccess().getOrExpressionConstraintLeftAction_1_0()); }
	()
	{ after(grammarAccess.getOrExpressionConstraintAccess().getOrExpressionConstraintLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpressionConstraint__Group_1__1__Impl
	rule__OrExpressionConstraint__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionConstraintAccess().getDISJUNCTIONTerminalRuleCall_1_1()); }
	RULE_DISJUNCTION
	{ after(grammarAccess.getOrExpressionConstraintAccess().getDISJUNCTIONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpressionConstraint__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionConstraintAccess().getRightAssignment_1_2()); }
	(rule__OrExpressionConstraint__RightAssignment_1_2)
	{ after(grammarAccess.getOrExpressionConstraintAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpressionConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpressionConstraint__Group__0__Impl
	rule__AndExpressionConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionConstraintAccess().getExclusionExpressionConstraintParserRuleCall_0()); }
	ruleExclusionExpressionConstraint
	{ after(grammarAccess.getAndExpressionConstraintAccess().getExclusionExpressionConstraintParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpressionConstraint__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionConstraintAccess().getGroup_1()); }
	(rule__AndExpressionConstraint__Group_1__0)*
	{ after(grammarAccess.getAndExpressionConstraintAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpressionConstraint__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpressionConstraint__Group_1__0__Impl
	rule__AndExpressionConstraint__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionConstraintAccess().getAndExpressionConstraintLeftAction_1_0()); }
	()
	{ after(grammarAccess.getAndExpressionConstraintAccess().getAndExpressionConstraintLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpressionConstraint__Group_1__1__Impl
	rule__AndExpressionConstraint__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionConstraintAccess().getAlternatives_1_1()); }
	(rule__AndExpressionConstraint__Alternatives_1_1)
	{ after(grammarAccess.getAndExpressionConstraintAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpressionConstraint__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionConstraintAccess().getRightAssignment_1_2()); }
	(rule__AndExpressionConstraint__RightAssignment_1_2)
	{ after(grammarAccess.getAndExpressionConstraintAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExclusionExpressionConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionExpressionConstraint__Group__0__Impl
	rule__ExclusionExpressionConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionExpressionConstraintAccess().getRefinedExpressionConstraintParserRuleCall_0()); }
	ruleRefinedExpressionConstraint
	{ after(grammarAccess.getExclusionExpressionConstraintAccess().getRefinedExpressionConstraintParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionExpressionConstraint__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionExpressionConstraintAccess().getGroup_1()); }
	(rule__ExclusionExpressionConstraint__Group_1__0)?
	{ after(grammarAccess.getExclusionExpressionConstraintAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExclusionExpressionConstraint__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionExpressionConstraint__Group_1__0__Impl
	rule__ExclusionExpressionConstraint__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionExpressionConstraintAccess().getExclusionExpressionConstraintLeftAction_1_0()); }
	()
	{ after(grammarAccess.getExclusionExpressionConstraintAccess().getExclusionExpressionConstraintLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionExpressionConstraint__Group_1__1__Impl
	rule__ExclusionExpressionConstraint__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionExpressionConstraintAccess().getEXCLUSIONTerminalRuleCall_1_1()); }
	RULE_EXCLUSION
	{ after(grammarAccess.getExclusionExpressionConstraintAccess().getEXCLUSIONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionExpressionConstraint__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionExpressionConstraintAccess().getRightAssignment_1_2()); }
	(rule__ExclusionExpressionConstraint__RightAssignment_1_2)
	{ after(grammarAccess.getExclusionExpressionConstraintAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RefinedExpressionConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RefinedExpressionConstraint__Group__0__Impl
	rule__RefinedExpressionConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinedExpressionConstraintAccess().getDottedExpressionConstraintParserRuleCall_0()); }
	ruleDottedExpressionConstraint
	{ after(grammarAccess.getRefinedExpressionConstraintAccess().getDottedExpressionConstraintParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RefinedExpressionConstraint__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinedExpressionConstraintAccess().getGroup_1()); }
	(rule__RefinedExpressionConstraint__Group_1__0)?
	{ after(grammarAccess.getRefinedExpressionConstraintAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RefinedExpressionConstraint__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RefinedExpressionConstraint__Group_1__0__Impl
	rule__RefinedExpressionConstraint__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinedExpressionConstraintAccess().getRefinedExpressionConstraintConstraintAction_1_0()); }
	()
	{ after(grammarAccess.getRefinedExpressionConstraintAccess().getRefinedExpressionConstraintConstraintAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RefinedExpressionConstraint__Group_1__1__Impl
	rule__RefinedExpressionConstraint__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinedExpressionConstraintAccess().getCOLONTerminalRuleCall_1_1()); }
	RULE_COLON
	{ after(grammarAccess.getRefinedExpressionConstraintAccess().getCOLONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RefinedExpressionConstraint__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementAssignment_1_2()); }
	(rule__RefinedExpressionConstraint__RefinementAssignment_1_2)
	{ after(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DottedExpressionConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DottedExpressionConstraint__Group__0__Impl
	rule__DottedExpressionConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDottedExpressionConstraintAccess().getSubExpressionConstraintParserRuleCall_0()); }
	ruleSubExpressionConstraint
	{ after(grammarAccess.getDottedExpressionConstraintAccess().getSubExpressionConstraintParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DottedExpressionConstraint__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDottedExpressionConstraintAccess().getGroup_1()); }
	(rule__DottedExpressionConstraint__Group_1__0)*
	{ after(grammarAccess.getDottedExpressionConstraintAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DottedExpressionConstraint__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DottedExpressionConstraint__Group_1__0__Impl
	rule__DottedExpressionConstraint__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDottedExpressionConstraintAccess().getDottedExpressionConstraintConstraintAction_1_0()); }
	()
	{ after(grammarAccess.getDottedExpressionConstraintAccess().getDottedExpressionConstraintConstraintAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DottedExpressionConstraint__Group_1__1__Impl
	rule__DottedExpressionConstraint__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDottedExpressionConstraintAccess().getDOTTerminalRuleCall_1_1()); }
	RULE_DOT
	{ after(grammarAccess.getDottedExpressionConstraintAccess().getDOTTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DottedExpressionConstraint__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDottedExpressionConstraintAccess().getAttributeAssignment_1_2()); }
	(rule__DottedExpressionConstraint__AttributeAssignment_1_2)
	{ after(grammarAccess.getDottedExpressionConstraintAccess().getAttributeAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ChildOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChildOf__Group__0__Impl
	rule__ChildOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChildOfAccess().getLT_EMTerminalRuleCall_0()); }
	RULE_LT_EM
	{ after(grammarAccess.getChildOfAccess().getLT_EMTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChildOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChildOfAccess().getConstraintAssignment_1()); }
	(rule__ChildOf__ConstraintAssignment_1)
	{ after(grammarAccess.getChildOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ChildOrSelfOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChildOrSelfOf__Group__0__Impl
	rule__ChildOrSelfOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOrSelfOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChildOrSelfOfAccess().getDBL_LT_EMTerminalRuleCall_0()); }
	RULE_DBL_LT_EM
	{ after(grammarAccess.getChildOrSelfOfAccess().getDBL_LT_EMTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOrSelfOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChildOrSelfOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOrSelfOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChildOrSelfOfAccess().getConstraintAssignment_1()); }
	(rule__ChildOrSelfOf__ConstraintAssignment_1)
	{ after(grammarAccess.getChildOrSelfOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DescendantOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescendantOf__Group__0__Impl
	rule__DescendantOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescendantOfAccess().getLTTerminalRuleCall_0()); }
	RULE_LT
	{ after(grammarAccess.getDescendantOfAccess().getLTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescendantOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescendantOfAccess().getConstraintAssignment_1()); }
	(rule__DescendantOf__ConstraintAssignment_1)
	{ after(grammarAccess.getDescendantOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DescendantOrSelfOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescendantOrSelfOf__Group__0__Impl
	rule__DescendantOrSelfOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOrSelfOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescendantOrSelfOfAccess().getDBL_LTTerminalRuleCall_0()); }
	RULE_DBL_LT
	{ after(grammarAccess.getDescendantOrSelfOfAccess().getDBL_LTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOrSelfOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescendantOrSelfOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOrSelfOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescendantOrSelfOfAccess().getConstraintAssignment_1()); }
	(rule__DescendantOrSelfOf__ConstraintAssignment_1)
	{ after(grammarAccess.getDescendantOrSelfOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParentOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParentOf__Group__0__Impl
	rule__ParentOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParentOfAccess().getGT_EMTerminalRuleCall_0()); }
	RULE_GT_EM
	{ after(grammarAccess.getParentOfAccess().getGT_EMTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParentOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParentOfAccess().getConstraintAssignment_1()); }
	(rule__ParentOf__ConstraintAssignment_1)
	{ after(grammarAccess.getParentOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParentOrSelfOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParentOrSelfOf__Group__0__Impl
	rule__ParentOrSelfOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOrSelfOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParentOrSelfOfAccess().getDBL_GT_EMTerminalRuleCall_0()); }
	RULE_DBL_GT_EM
	{ after(grammarAccess.getParentOrSelfOfAccess().getDBL_GT_EMTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOrSelfOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParentOrSelfOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOrSelfOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParentOrSelfOfAccess().getConstraintAssignment_1()); }
	(rule__ParentOrSelfOf__ConstraintAssignment_1)
	{ after(grammarAccess.getParentOrSelfOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AncestorOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AncestorOf__Group__0__Impl
	rule__AncestorOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAncestorOfAccess().getGTTerminalRuleCall_0()); }
	RULE_GT
	{ after(grammarAccess.getAncestorOfAccess().getGTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AncestorOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAncestorOfAccess().getConstraintAssignment_1()); }
	(rule__AncestorOf__ConstraintAssignment_1)
	{ after(grammarAccess.getAncestorOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AncestorOrSelfOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AncestorOrSelfOf__Group__0__Impl
	rule__AncestorOrSelfOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOrSelfOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAncestorOrSelfOfAccess().getDBL_GTTerminalRuleCall_0()); }
	RULE_DBL_GT
	{ after(grammarAccess.getAncestorOrSelfOfAccess().getDBL_GTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOrSelfOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AncestorOrSelfOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOrSelfOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAncestorOrSelfOfAccess().getConstraintAssignment_1()); }
	(rule__AncestorOrSelfOf__ConstraintAssignment_1)
	{ after(grammarAccess.getAncestorOrSelfOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MemberOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemberOf__Group__0__Impl
	rule__MemberOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberOfAccess().getCARETTerminalRuleCall_0()); }
	RULE_CARET
	{ after(grammarAccess.getMemberOfAccess().getCARETTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemberOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberOfAccess().getConstraintAssignment_1()); }
	(rule__MemberOf__ConstraintAssignment_1)
	{ after(grammarAccess.getMemberOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EclConceptReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclConceptReference__Group__0__Impl
	rule__EclConceptReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclConceptReferenceAccess().getIdAssignment_0()); }
	(rule__EclConceptReference__IdAssignment_0)
	{ after(grammarAccess.getEclConceptReferenceAccess().getIdAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclConceptReference__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclConceptReferenceAccess().getTermAssignment_1()); }
	(rule__EclConceptReference__TermAssignment_1)?
	{ after(grammarAccess.getEclConceptReferenceAccess().getTermAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Any__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Any__Group__0__Impl
	rule__Any__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Any__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnyAccess().getWILDCARDTerminalRuleCall_0()); }
	RULE_WILDCARD
	{ after(grammarAccess.getAnyAccess().getWILDCARDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Any__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Any__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Any__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnyAccess().getAnyAction_1()); }
	()
	{ after(grammarAccess.getAnyAccess().getAnyAction_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrRefinement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrRefinement__Group__0__Impl
	rule__OrRefinement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrRefinementAccess().getAndRefinementParserRuleCall_0()); }
	ruleAndRefinement
	{ after(grammarAccess.getOrRefinementAccess().getAndRefinementParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrRefinement__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrRefinementAccess().getGroup_1()); }
	(rule__OrRefinement__Group_1__0)*
	{ after(grammarAccess.getOrRefinementAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrRefinement__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrRefinement__Group_1__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrRefinementAccess().getGroup_1_0()); }
	(rule__OrRefinement__Group_1_0__0)
	{ after(grammarAccess.getOrRefinementAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrRefinement__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrRefinement__Group_1_0__0__Impl
	rule__OrRefinement__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrRefinementAccess().getOrRefinementLeftAction_1_0_0()); }
	()
	{ after(grammarAccess.getOrRefinementAccess().getOrRefinementLeftAction_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrRefinement__Group_1_0__1__Impl
	rule__OrRefinement__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrRefinementAccess().getDISJUNCTIONTerminalRuleCall_1_0_1()); }
	RULE_DISJUNCTION
	{ after(grammarAccess.getOrRefinementAccess().getDISJUNCTIONTerminalRuleCall_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrRefinement__Group_1_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrRefinementAccess().getRightAssignment_1_0_2()); }
	(rule__OrRefinement__RightAssignment_1_0_2)
	{ after(grammarAccess.getOrRefinementAccess().getRightAssignment_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndRefinement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndRefinement__Group__0__Impl
	rule__AndRefinement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndRefinementAccess().getSubRefinementParserRuleCall_0()); }
	ruleSubRefinement
	{ after(grammarAccess.getAndRefinementAccess().getSubRefinementParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndRefinement__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndRefinementAccess().getGroup_1()); }
	(rule__AndRefinement__Group_1__0)*
	{ after(grammarAccess.getAndRefinementAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndRefinement__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndRefinement__Group_1__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndRefinementAccess().getGroup_1_0()); }
	(rule__AndRefinement__Group_1_0__0)
	{ after(grammarAccess.getAndRefinementAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndRefinement__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndRefinement__Group_1_0__0__Impl
	rule__AndRefinement__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndRefinementAccess().getAndRefinementLeftAction_1_0_0()); }
	()
	{ after(grammarAccess.getAndRefinementAccess().getAndRefinementLeftAction_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndRefinement__Group_1_0__1__Impl
	rule__AndRefinement__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndRefinementAccess().getAlternatives_1_0_1()); }
	(rule__AndRefinement__Alternatives_1_0_1)
	{ after(grammarAccess.getAndRefinementAccess().getAlternatives_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndRefinement__Group_1_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndRefinementAccess().getRightAssignment_1_0_2()); }
	(rule__AndRefinement__RightAssignment_1_0_2)
	{ after(grammarAccess.getAndRefinementAccess().getRightAssignment_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NestedRefinement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedRefinement__Group__0__Impl
	rule__NestedRefinement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedRefinement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedRefinementAccess().getROUND_OPENTerminalRuleCall_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getNestedRefinementAccess().getROUND_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedRefinement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedRefinement__Group__1__Impl
	rule__NestedRefinement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedRefinement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedRefinementAccess().getNestedAssignment_1()); }
	(rule__NestedRefinement__NestedAssignment_1)
	{ after(grammarAccess.getNestedRefinementAccess().getNestedAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedRefinement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedRefinement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedRefinement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedRefinementAccess().getROUND_CLOSETerminalRuleCall_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getNestedRefinementAccess().getROUND_CLOSETerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EclAttributeGroup__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclAttributeGroup__Group__0__Impl
	rule__EclAttributeGroup__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclAttributeGroupAccess().getCardinalityAssignment_0()); }
	(rule__EclAttributeGroup__CardinalityAssignment_0)?
	{ after(grammarAccess.getEclAttributeGroupAccess().getCardinalityAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclAttributeGroup__Group__1__Impl
	rule__EclAttributeGroup__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_1()); }
	RULE_CURLY_OPEN
	{ after(grammarAccess.getEclAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclAttributeGroup__Group__2__Impl
	rule__EclAttributeGroup__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclAttributeGroupAccess().getRefinementAssignment_2()); }
	(rule__EclAttributeGroup__RefinementAssignment_2)
	{ after(grammarAccess.getEclAttributeGroupAccess().getRefinementAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclAttributeGroup__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_3()); }
	RULE_CURLY_CLOSE
	{ after(grammarAccess.getEclAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrAttributeSet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrAttributeSet__Group__0__Impl
	rule__OrAttributeSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAttributeSetAccess().getAndAttributeSetParserRuleCall_0()); }
	ruleAndAttributeSet
	{ after(grammarAccess.getOrAttributeSetAccess().getAndAttributeSetParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrAttributeSet__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAttributeSetAccess().getGroup_1()); }
	(rule__OrAttributeSet__Group_1__0)*
	{ after(grammarAccess.getOrAttributeSetAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrAttributeSet__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrAttributeSet__Group_1__0__Impl
	rule__OrAttributeSet__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAttributeSetAccess().getOrRefinementLeftAction_1_0()); }
	()
	{ after(grammarAccess.getOrAttributeSetAccess().getOrRefinementLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrAttributeSet__Group_1__1__Impl
	rule__OrAttributeSet__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAttributeSetAccess().getDISJUNCTIONTerminalRuleCall_1_1()); }
	RULE_DISJUNCTION
	{ after(grammarAccess.getOrAttributeSetAccess().getDISJUNCTIONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrAttributeSet__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAttributeSetAccess().getRightAssignment_1_2()); }
	(rule__OrAttributeSet__RightAssignment_1_2)
	{ after(grammarAccess.getOrAttributeSetAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndAttributeSet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndAttributeSet__Group__0__Impl
	rule__AndAttributeSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAttributeSetAccess().getSubAttributeSetParserRuleCall_0()); }
	ruleSubAttributeSet
	{ after(grammarAccess.getAndAttributeSetAccess().getSubAttributeSetParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndAttributeSet__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAttributeSetAccess().getGroup_1()); }
	(rule__AndAttributeSet__Group_1__0)*
	{ after(grammarAccess.getAndAttributeSetAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndAttributeSet__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndAttributeSet__Group_1__0__Impl
	rule__AndAttributeSet__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAttributeSetAccess().getAndRefinementLeftAction_1_0()); }
	()
	{ after(grammarAccess.getAndAttributeSetAccess().getAndRefinementLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndAttributeSet__Group_1__1__Impl
	rule__AndAttributeSet__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAttributeSetAccess().getAlternatives_1_1()); }
	(rule__AndAttributeSet__Alternatives_1_1)
	{ after(grammarAccess.getAndAttributeSetAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndAttributeSet__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAttributeSetAccess().getRightAssignment_1_2()); }
	(rule__AndAttributeSet__RightAssignment_1_2)
	{ after(grammarAccess.getAndAttributeSetAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NestedAttributeSet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedAttributeSet__Group__0__Impl
	rule__NestedAttributeSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedAttributeSet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedAttributeSetAccess().getROUND_OPENTerminalRuleCall_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getNestedAttributeSetAccess().getROUND_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedAttributeSet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedAttributeSet__Group__1__Impl
	rule__NestedAttributeSet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedAttributeSet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedAttributeSetAccess().getNestedAssignment_1()); }
	(rule__NestedAttributeSet__NestedAssignment_1)
	{ after(grammarAccess.getNestedAttributeSetAccess().getNestedAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedAttributeSet__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedAttributeSet__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedAttributeSet__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedAttributeSetAccess().getROUND_CLOSETerminalRuleCall_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getNestedAttributeSetAccess().getROUND_CLOSETerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AttributeConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeConstraint__Group__0__Impl
	rule__AttributeConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeConstraintAccess().getCardinalityAssignment_0()); }
	(rule__AttributeConstraint__CardinalityAssignment_0)?
	{ after(grammarAccess.getAttributeConstraintAccess().getCardinalityAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeConstraint__Group__1__Impl
	rule__AttributeConstraint__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeConstraintAccess().getReversedAssignment_1()); }
	(rule__AttributeConstraint__ReversedAssignment_1)?
	{ after(grammarAccess.getAttributeConstraintAccess().getReversedAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeConstraint__Group__2__Impl
	rule__AttributeConstraint__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeConstraintAccess().getAttributeAssignment_2()); }
	(rule__AttributeConstraint__AttributeAssignment_2)
	{ after(grammarAccess.getAttributeConstraintAccess().getAttributeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeConstraint__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeConstraintAccess().getComparisonAssignment_3()); }
	(rule__AttributeConstraint__ComparisonAssignment_3)
	{ after(grammarAccess.getAttributeConstraintAccess().getComparisonAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cardinality__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cardinality__Group__0__Impl
	rule__Cardinality__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCardinalityAccess().getSQUARE_OPENTerminalRuleCall_0()); }
	RULE_SQUARE_OPEN
	{ after(grammarAccess.getCardinalityAccess().getSQUARE_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cardinality__Group__1__Impl
	rule__Cardinality__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCardinalityAccess().getMinAssignment_1()); }
	(rule__Cardinality__MinAssignment_1)
	{ after(grammarAccess.getCardinalityAccess().getMinAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cardinality__Group__2__Impl
	rule__Cardinality__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCardinalityAccess().getTOTerminalRuleCall_2()); }
	RULE_TO
	{ after(grammarAccess.getCardinalityAccess().getTOTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cardinality__Group__3__Impl
	rule__Cardinality__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCardinalityAccess().getMaxAssignment_3()); }
	(rule__Cardinality__MaxAssignment_3)
	{ after(grammarAccess.getCardinalityAccess().getMaxAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cardinality__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCardinalityAccess().getSQUARE_CLOSETerminalRuleCall_4()); }
	RULE_SQUARE_CLOSE
	{ after(grammarAccess.getCardinalityAccess().getSQUARE_CLOSETerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AttributeValueEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeValueEquals__Group__0__Impl
	rule__AttributeValueEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValueEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeValueEqualsAccess().getEQUALTerminalRuleCall_0()); }
	RULE_EQUAL
	{ after(grammarAccess.getAttributeValueEqualsAccess().getEQUALTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValueEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeValueEquals__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValueEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeValueEqualsAccess().getConstraintAssignment_1()); }
	(rule__AttributeValueEquals__ConstraintAssignment_1)
	{ after(grammarAccess.getAttributeValueEqualsAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AttributeValueNotEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeValueNotEquals__Group__0__Impl
	rule__AttributeValueNotEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValueNotEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); }
	RULE_NOT_EQUAL
	{ after(grammarAccess.getAttributeValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValueNotEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeValueNotEquals__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValueNotEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeValueNotEqualsAccess().getConstraintAssignment_1()); }
	(rule__AttributeValueNotEquals__ConstraintAssignment_1)
	{ after(grammarAccess.getAttributeValueNotEqualsAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BooleanValueEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanValueEquals__Group__0__Impl
	rule__BooleanValueEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanValueEqualsAccess().getEQUALTerminalRuleCall_0()); }
	RULE_EQUAL
	{ after(grammarAccess.getBooleanValueEqualsAccess().getEQUALTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanValueEquals__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanValueEqualsAccess().getValueAssignment_1()); }
	(rule__BooleanValueEquals__ValueAssignment_1)
	{ after(grammarAccess.getBooleanValueEqualsAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BooleanValueNotEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanValueNotEquals__Group__0__Impl
	rule__BooleanValueNotEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueNotEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); }
	RULE_NOT_EQUAL
	{ after(grammarAccess.getBooleanValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueNotEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanValueNotEquals__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueNotEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanValueNotEqualsAccess().getValueAssignment_1()); }
	(rule__BooleanValueNotEquals__ValueAssignment_1)
	{ after(grammarAccess.getBooleanValueNotEqualsAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringValueEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringValueEquals__Group__0__Impl
	rule__StringValueEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringValueEqualsAccess().getEQUALTerminalRuleCall_0()); }
	RULE_EQUAL
	{ after(grammarAccess.getStringValueEqualsAccess().getEQUALTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringValueEquals__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringValueEqualsAccess().getValueAssignment_1()); }
	(rule__StringValueEquals__ValueAssignment_1)
	{ after(grammarAccess.getStringValueEqualsAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringValueNotEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringValueNotEquals__Group__0__Impl
	rule__StringValueNotEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueNotEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); }
	RULE_NOT_EQUAL
	{ after(grammarAccess.getStringValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueNotEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringValueNotEquals__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueNotEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringValueNotEqualsAccess().getValueAssignment_1()); }
	(rule__StringValueNotEquals__ValueAssignment_1)
	{ after(grammarAccess.getStringValueNotEqualsAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerValueEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueEquals__Group__0__Impl
	rule__IntegerValueEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueEqualsAccess().getEQUALTerminalRuleCall_0()); }
	RULE_EQUAL
	{ after(grammarAccess.getIntegerValueEqualsAccess().getEQUALTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueEquals__Group__1__Impl
	rule__IntegerValueEquals__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueEqualsAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getIntegerValueEqualsAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueEquals__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueEquals__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueEquals__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueEqualsAccess().getValueAssignment_2()); }
	(rule__IntegerValueEquals__ValueAssignment_2)
	{ after(grammarAccess.getIntegerValueEqualsAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerValueNotEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueNotEquals__Group__0__Impl
	rule__IntegerValueNotEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueNotEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); }
	RULE_NOT_EQUAL
	{ after(grammarAccess.getIntegerValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueNotEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueNotEquals__Group__1__Impl
	rule__IntegerValueNotEquals__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueNotEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueNotEqualsAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getIntegerValueNotEqualsAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueNotEquals__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueNotEquals__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueNotEquals__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueNotEqualsAccess().getValueAssignment_2()); }
	(rule__IntegerValueNotEquals__ValueAssignment_2)
	{ after(grammarAccess.getIntegerValueNotEqualsAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerValueGreaterThan__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueGreaterThan__Group__0__Impl
	rule__IntegerValueGreaterThan__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThan__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueGreaterThanAccess().getGTTerminalRuleCall_0()); }
	RULE_GT
	{ after(grammarAccess.getIntegerValueGreaterThanAccess().getGTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThan__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueGreaterThan__Group__1__Impl
	rule__IntegerValueGreaterThan__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThan__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueGreaterThanAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getIntegerValueGreaterThanAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThan__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueGreaterThan__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThan__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueGreaterThanAccess().getValueAssignment_2()); }
	(rule__IntegerValueGreaterThan__ValueAssignment_2)
	{ after(grammarAccess.getIntegerValueGreaterThanAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerValueLessThan__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueLessThan__Group__0__Impl
	rule__IntegerValueLessThan__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThan__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueLessThanAccess().getLTTerminalRuleCall_0()); }
	RULE_LT
	{ after(grammarAccess.getIntegerValueLessThanAccess().getLTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThan__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueLessThan__Group__1__Impl
	rule__IntegerValueLessThan__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThan__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueLessThanAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getIntegerValueLessThanAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThan__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueLessThan__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThan__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueLessThanAccess().getValueAssignment_2()); }
	(rule__IntegerValueLessThan__ValueAssignment_2)
	{ after(grammarAccess.getIntegerValueLessThanAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerValueGreaterThanEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueGreaterThanEquals__Group__0__Impl
	rule__IntegerValueGreaterThanEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThanEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getGTETerminalRuleCall_0()); }
	RULE_GTE
	{ after(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getGTETerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThanEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueGreaterThanEquals__Group__1__Impl
	rule__IntegerValueGreaterThanEquals__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThanEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThanEquals__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueGreaterThanEquals__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThanEquals__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getValueAssignment_2()); }
	(rule__IntegerValueGreaterThanEquals__ValueAssignment_2)
	{ after(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerValueLessThanEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueLessThanEquals__Group__0__Impl
	rule__IntegerValueLessThanEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThanEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueLessThanEqualsAccess().getLTETerminalRuleCall_0()); }
	RULE_LTE
	{ after(grammarAccess.getIntegerValueLessThanEqualsAccess().getLTETerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThanEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueLessThanEquals__Group__1__Impl
	rule__IntegerValueLessThanEquals__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThanEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueLessThanEqualsAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getIntegerValueLessThanEqualsAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThanEquals__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueLessThanEquals__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThanEquals__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueLessThanEqualsAccess().getValueAssignment_2()); }
	(rule__IntegerValueLessThanEquals__ValueAssignment_2)
	{ after(grammarAccess.getIntegerValueLessThanEqualsAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DecimalValueEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueEquals__Group__0__Impl
	rule__DecimalValueEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueEqualsAccess().getEQUALTerminalRuleCall_0()); }
	RULE_EQUAL
	{ after(grammarAccess.getDecimalValueEqualsAccess().getEQUALTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueEquals__Group__1__Impl
	rule__DecimalValueEquals__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueEqualsAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getDecimalValueEqualsAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueEquals__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueEquals__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueEquals__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueEqualsAccess().getValueAssignment_2()); }
	(rule__DecimalValueEquals__ValueAssignment_2)
	{ after(grammarAccess.getDecimalValueEqualsAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DecimalValueNotEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueNotEquals__Group__0__Impl
	rule__DecimalValueNotEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueNotEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); }
	RULE_NOT_EQUAL
	{ after(grammarAccess.getDecimalValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueNotEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueNotEquals__Group__1__Impl
	rule__DecimalValueNotEquals__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueNotEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueNotEqualsAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getDecimalValueNotEqualsAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueNotEquals__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueNotEquals__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueNotEquals__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueNotEqualsAccess().getValueAssignment_2()); }
	(rule__DecimalValueNotEquals__ValueAssignment_2)
	{ after(grammarAccess.getDecimalValueNotEqualsAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DecimalValueGreaterThan__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueGreaterThan__Group__0__Impl
	rule__DecimalValueGreaterThan__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThan__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueGreaterThanAccess().getGTTerminalRuleCall_0()); }
	RULE_GT
	{ after(grammarAccess.getDecimalValueGreaterThanAccess().getGTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThan__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueGreaterThan__Group__1__Impl
	rule__DecimalValueGreaterThan__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThan__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueGreaterThanAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getDecimalValueGreaterThanAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThan__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueGreaterThan__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThan__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueGreaterThanAccess().getValueAssignment_2()); }
	(rule__DecimalValueGreaterThan__ValueAssignment_2)
	{ after(grammarAccess.getDecimalValueGreaterThanAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DecimalValueLessThan__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueLessThan__Group__0__Impl
	rule__DecimalValueLessThan__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThan__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueLessThanAccess().getLTTerminalRuleCall_0()); }
	RULE_LT
	{ after(grammarAccess.getDecimalValueLessThanAccess().getLTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThan__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueLessThan__Group__1__Impl
	rule__DecimalValueLessThan__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThan__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueLessThanAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getDecimalValueLessThanAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThan__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueLessThan__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThan__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueLessThanAccess().getValueAssignment_2()); }
	(rule__DecimalValueLessThan__ValueAssignment_2)
	{ after(grammarAccess.getDecimalValueLessThanAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DecimalValueGreaterThanEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueGreaterThanEquals__Group__0__Impl
	rule__DecimalValueGreaterThanEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThanEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getGTETerminalRuleCall_0()); }
	RULE_GTE
	{ after(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getGTETerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThanEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueGreaterThanEquals__Group__1__Impl
	rule__DecimalValueGreaterThanEquals__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThanEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThanEquals__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueGreaterThanEquals__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThanEquals__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getValueAssignment_2()); }
	(rule__DecimalValueGreaterThanEquals__ValueAssignment_2)
	{ after(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DecimalValueLessThanEquals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueLessThanEquals__Group__0__Impl
	rule__DecimalValueLessThanEquals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThanEquals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueLessThanEqualsAccess().getLTETerminalRuleCall_0()); }
	RULE_LTE
	{ after(grammarAccess.getDecimalValueLessThanEqualsAccess().getLTETerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThanEquals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueLessThanEquals__Group__1__Impl
	rule__DecimalValueLessThanEquals__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThanEquals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueLessThanEqualsAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getDecimalValueLessThanEqualsAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThanEquals__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueLessThanEquals__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThanEquals__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueLessThanEqualsAccess().getValueAssignment_2()); }
	(rule__DecimalValueLessThanEquals__ValueAssignment_2)
	{ after(grammarAccess.getDecimalValueLessThanEqualsAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NestedExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedExpression__Group__0__Impl
	rule__NestedExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedExpressionAccess().getROUND_OPENTerminalRuleCall_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getNestedExpressionAccess().getROUND_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedExpression__Group__1__Impl
	rule__NestedExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedExpressionAccess().getNestedAssignment_1()); }
	(rule__NestedExpression__NestedAssignment_1)
	{ after(grammarAccess.getNestedExpressionAccess().getNestedAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedExpression__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedExpressionAccess().getROUND_CLOSETerminalRuleCall_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getNestedExpressionAccess().getROUND_CLOSETerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SnomedIdentifier__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__0__Impl
	rule__SnomedIdentifier__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0()); }
	RULE_DIGIT_NONZERO
	{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__1__Impl
	rule__SnomedIdentifier__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_1()); }
	(rule__SnomedIdentifier__Alternatives_1)
	{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__2__Impl
	rule__SnomedIdentifier__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_2()); }
	(rule__SnomedIdentifier__Alternatives_2)
	{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__3__Impl
	rule__SnomedIdentifier__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_3()); }
	(rule__SnomedIdentifier__Alternatives_3)
	{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__4__Impl
	rule__SnomedIdentifier__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_4()); }
	(rule__SnomedIdentifier__Alternatives_4)
	{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); }
		(rule__SnomedIdentifier__Alternatives_5)
		{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); }
	)
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); }
		(rule__SnomedIdentifier__Alternatives_5)*
		{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NonNegativeInteger__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonNegativeInteger__Group_1__0__Impl
	rule__NonNegativeInteger__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeInteger__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); }
	RULE_DIGIT_NONZERO
	{ after(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeInteger__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonNegativeInteger__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeInteger__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonNegativeIntegerAccess().getAlternatives_1_1()); }
	(rule__NonNegativeInteger__Alternatives_1_1)*
	{ after(grammarAccess.getNonNegativeIntegerAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Integer__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Integer__Group__0__Impl
	rule__Integer__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Integer__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerAccess().getAlternatives_0()); }
	(rule__Integer__Alternatives_0)?
	{ after(grammarAccess.getIntegerAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Integer__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Integer__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Integer__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerAccess().getNonNegativeIntegerParserRuleCall_1()); }
	ruleNonNegativeInteger
	{ after(grammarAccess.getIntegerAccess().getNonNegativeIntegerParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Decimal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Decimal__Group__0__Impl
	rule__Decimal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalAccess().getAlternatives_0()); }
	(rule__Decimal__Alternatives_0)?
	{ after(grammarAccess.getDecimalAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Decimal__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalAccess().getNonNegativeDecimalParserRuleCall_1()); }
	ruleNonNegativeDecimal
	{ after(grammarAccess.getDecimalAccess().getNonNegativeDecimalParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NonNegativeDecimal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonNegativeDecimal__Group__0__Impl
	rule__NonNegativeDecimal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0()); }
	ruleNonNegativeInteger
	{ after(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonNegativeDecimal__Group__1__Impl
	rule__NonNegativeDecimal__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1()); }
	RULE_DOT
	{ after(grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonNegativeDecimal__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonNegativeDecimalAccess().getAlternatives_2()); }
	(rule__NonNegativeDecimal__Alternatives_2)*
	{ after(grammarAccess.getNonNegativeDecimalAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Query__QueryAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQueryAccess().getQueryQueryConstraintParserRuleCall_1_0()); }
		ruleQueryConstraint
		{ after(grammarAccess.getQueryAccess().getQueryQueryConstraintParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryDisjunction__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQueryDisjunctionAccess().getRightQueryConjunctionParserRuleCall_1_2_0()); }
		ruleQueryConjunction
		{ after(grammarAccess.getQueryDisjunctionAccess().getRightQueryConjunctionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryConjunction__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQueryConjunctionAccess().getRightQueryExclusionParserRuleCall_1_2_0()); }
		ruleQueryExclusion
		{ after(grammarAccess.getQueryConjunctionAccess().getRightQueryExclusionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__QueryExclusion__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQueryExclusionAccess().getRightSubQueryParserRuleCall_1_2_0()); }
		ruleSubQuery
		{ after(grammarAccess.getQueryExclusionAccess().getRightSubQueryParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainQuery__EclAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDomainQueryAccess().getEclExpressionConstraintParserRuleCall_1_0()); }
		ruleExpressionConstraint
		{ after(grammarAccess.getDomainQueryAccess().getEclExpressionConstraintParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DomainQuery__FilterAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDomainQueryAccess().getFilterFilterParserRuleCall_2_1_0()); }
		ruleFilter
		{ after(grammarAccess.getDomainQueryAccess().getFilterFilterParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedQuery__NestedAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedQueryAccess().getNestedQueryConstraintParserRuleCall_1_0()); }
		ruleQueryConstraint
		{ after(grammarAccess.getNestedQueryAccess().getNestedQueryConstraintParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDisjunctionFilterAccess().getRightConjunctionFilterParserRuleCall_1_2_0()); }
		ruleConjunctionFilter
		{ after(grammarAccess.getDisjunctionFilterAccess().getRightConjunctionFilterParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConjunctionFilterAccess().getRightExclusionFilterParserRuleCall_1_2_0()); }
		ruleExclusionFilter
		{ after(grammarAccess.getConjunctionFilterAccess().getRightExclusionFilterParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionFilter__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExclusionFilterAccess().getRightPropertyFilterParserRuleCall_1_2_0()); }
		rulePropertyFilter
		{ after(grammarAccess.getExclusionFilterAccess().getRightPropertyFilterParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFilter__NestedAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedFilterAccess().getNestedFilterParserRuleCall_1_0()); }
		ruleFilter
		{ after(grammarAccess.getNestedFilterAccess().getNestedFilterParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__DomainAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActiveFilterAccess().getDomainDomainEnumRuleCall_0_0_0()); }
		ruleDomain
		{ after(grammarAccess.getActiveFilterAccess().getDomainDomainEnumRuleCall_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__ActiveAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActiveFilterAccess().getActiveBooleanParserRuleCall_3_0()); }
		ruleBoolean
		{ after(grammarAccess.getActiveFilterAccess().getActiveBooleanParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__DomainAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModuleFilterAccess().getDomainDomainEnumRuleCall_0_0_0()); }
		ruleDomain
		{ after(grammarAccess.getModuleFilterAccess().getDomainDomainEnumRuleCall_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__ModuleIdAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModuleFilterAccess().getModuleIdExpressionConstraintParserRuleCall_3_0()); }
		ruleExpressionConstraint
		{ after(grammarAccess.getModuleFilterAccess().getModuleIdExpressionConstraintParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__LexicalSearchTypeAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTermFilterAccess().getLexicalSearchTypeLexicalSearchTypeEnumRuleCall_2_0_0()); }
		ruleLexicalSearchType
		{ after(grammarAccess.getTermFilterAccess().getLexicalSearchTypeLexicalSearchTypeEnumRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__TermAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTermFilterAccess().getTermSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getTermFilterAccess().getTermSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PreferredInFilter__LanguageRefSetIdAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0()); }
		ruleExpressionConstraint
		{ after(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptableInFilter__LanguageRefSetIdAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0()); }
		ruleExpressionConstraint
		{ after(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageRefSetFilter__LanguageRefSetIdAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0()); }
		ruleExpressionConstraint
		{ after(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeFilter__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeFilterAccess().getTypeExpressionConstraintParserRuleCall_2_0()); }
		ruleExpressionConstraint
		{ after(grammarAccess.getTypeFilterAccess().getTypeExpressionConstraintParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseSignificanceFilter__CaseSignificanceIdAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdExpressionConstraintParserRuleCall_2_0()); }
		ruleExpressionConstraint
		{ after(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdExpressionConstraintParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__LanguageCodeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodeSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodeSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrExpressionConstraintAccess().getRightAndExpressionConstraintParserRuleCall_1_2_0()); }
		ruleAndExpressionConstraint
		{ after(grammarAccess.getOrExpressionConstraintAccess().getRightAndExpressionConstraintParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndExpressionConstraintAccess().getRightExclusionExpressionConstraintParserRuleCall_1_2_0()); }
		ruleExclusionExpressionConstraint
		{ after(grammarAccess.getAndExpressionConstraintAccess().getRightExclusionExpressionConstraintParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExclusionExpressionConstraintAccess().getRightRefinedExpressionConstraintParserRuleCall_1_2_0()); }
		ruleRefinedExpressionConstraint
		{ after(grammarAccess.getExclusionExpressionConstraintAccess().getRightRefinedExpressionConstraintParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__RefinementAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementEclRefinementParserRuleCall_1_2_0()); }
		ruleEclRefinement
		{ after(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementEclRefinementParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__AttributeAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDottedExpressionConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_1_2_0()); }
		ruleSubExpressionConstraint
		{ after(grammarAccess.getDottedExpressionConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChildOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getChildOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOrSelfOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChildOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getChildOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescendantOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getDescendantOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOrSelfOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescendantOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getDescendantOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParentOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getParentOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOrSelfOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParentOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getParentOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAncestorOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getAncestorOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOrSelfOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAncestorOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getAncestorOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberOfAccess().getConstraintAlternatives_1_0()); }
		(rule__MemberOf__ConstraintAlternatives_1_0)
		{ after(grammarAccess.getMemberOfAccess().getConstraintAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReference__IdAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEclConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_0_0()); }
		ruleSnomedIdentifier
		{ after(grammarAccess.getEclConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReference__TermAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEclConceptReferenceAccess().getTermTERM_STRINGTerminalRuleCall_1_0()); }
		RULE_TERM_STRING
		{ after(grammarAccess.getEclConceptReferenceAccess().getTermTERM_STRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__RightAssignment_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrRefinementAccess().getRightAndRefinementParserRuleCall_1_0_2_0()); }
		ruleAndRefinement
		{ after(grammarAccess.getOrRefinementAccess().getRightAndRefinementParserRuleCall_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__RightAssignment_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndRefinementAccess().getRightSubRefinementParserRuleCall_1_0_2_0()); }
		ruleSubRefinement
		{ after(grammarAccess.getAndRefinementAccess().getRightSubRefinementParserRuleCall_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedRefinement__NestedAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedRefinementAccess().getNestedEclRefinementParserRuleCall_1_0()); }
		ruleEclRefinement
		{ after(grammarAccess.getNestedRefinementAccess().getNestedEclRefinementParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__CardinalityAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEclAttributeGroupAccess().getCardinalityCardinalityParserRuleCall_0_0()); }
		ruleCardinality
		{ after(grammarAccess.getEclAttributeGroupAccess().getCardinalityCardinalityParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__RefinementAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEclAttributeGroupAccess().getRefinementEclAttributeSetParserRuleCall_2_0()); }
		ruleEclAttributeSet
		{ after(grammarAccess.getEclAttributeGroupAccess().getRefinementEclAttributeSetParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrAttributeSetAccess().getRightAndAttributeSetParserRuleCall_1_2_0()); }
		ruleAndAttributeSet
		{ after(grammarAccess.getOrAttributeSetAccess().getRightAndAttributeSetParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndAttributeSetAccess().getRightSubAttributeSetParserRuleCall_1_2_0()); }
		ruleSubAttributeSet
		{ after(grammarAccess.getAndAttributeSetAccess().getRightSubAttributeSetParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedAttributeSet__NestedAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedAttributeSetAccess().getNestedEclAttributeSetParserRuleCall_1_0()); }
		ruleEclAttributeSet
		{ after(grammarAccess.getNestedAttributeSetAccess().getNestedEclAttributeSetParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__CardinalityAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeConstraintAccess().getCardinalityCardinalityParserRuleCall_0_0()); }
		ruleCardinality
		{ after(grammarAccess.getAttributeConstraintAccess().getCardinalityCardinalityParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__ReversedAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeConstraintAccess().getReversedREVERSEDTerminalRuleCall_1_0()); }
		RULE_REVERSED
		{ after(grammarAccess.getAttributeConstraintAccess().getReversedREVERSEDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__AttributeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_2_0()); }
		ruleSubExpressionConstraint
		{ after(grammarAccess.getAttributeConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__ComparisonAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeConstraintAccess().getComparisonComparisonParserRuleCall_3_0()); }
		ruleComparison
		{ after(grammarAccess.getAttributeConstraintAccess().getComparisonComparisonParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__MinAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0()); }
		ruleNonNegativeInteger
		{ after(grammarAccess.getCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__MaxAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0()); }
		ruleMaxValue
		{ after(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValueEquals__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeValueEqualsAccess().getConstraintSubExpressionConstraintParserRuleCall_1_0()); }
		ruleSubExpressionConstraint
		{ after(grammarAccess.getAttributeValueEqualsAccess().getConstraintSubExpressionConstraintParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValueNotEquals__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeValueNotEqualsAccess().getConstraintSubExpressionConstraintParserRuleCall_1_0()); }
		ruleSubExpressionConstraint
		{ after(grammarAccess.getAttributeValueNotEqualsAccess().getConstraintSubExpressionConstraintParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueEquals__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanValueEqualsAccess().getValueBooleanParserRuleCall_1_0()); }
		ruleBoolean
		{ after(grammarAccess.getBooleanValueEqualsAccess().getValueBooleanParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueNotEquals__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanValueNotEqualsAccess().getValueBooleanParserRuleCall_1_0()); }
		ruleBoolean
		{ after(grammarAccess.getBooleanValueNotEqualsAccess().getValueBooleanParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueEquals__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringValueEqualsAccess().getValueSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getStringValueEqualsAccess().getValueSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueNotEquals__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringValueNotEqualsAccess().getValueSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getStringValueNotEqualsAccess().getValueSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueEquals__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerValueEqualsAccess().getValueIntegerParserRuleCall_2_0()); }
		ruleInteger
		{ after(grammarAccess.getIntegerValueEqualsAccess().getValueIntegerParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueNotEquals__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerValueNotEqualsAccess().getValueIntegerParserRuleCall_2_0()); }
		ruleInteger
		{ after(grammarAccess.getIntegerValueNotEqualsAccess().getValueIntegerParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThan__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerValueGreaterThanAccess().getValueIntegerParserRuleCall_2_0()); }
		ruleInteger
		{ after(grammarAccess.getIntegerValueGreaterThanAccess().getValueIntegerParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThan__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerValueLessThanAccess().getValueIntegerParserRuleCall_2_0()); }
		ruleInteger
		{ after(grammarAccess.getIntegerValueLessThanAccess().getValueIntegerParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueGreaterThanEquals__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getValueIntegerParserRuleCall_2_0()); }
		ruleInteger
		{ after(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getValueIntegerParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueLessThanEquals__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerValueLessThanEqualsAccess().getValueIntegerParserRuleCall_2_0()); }
		ruleInteger
		{ after(grammarAccess.getIntegerValueLessThanEqualsAccess().getValueIntegerParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueEquals__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalValueEqualsAccess().getValueDecimalParserRuleCall_2_0()); }
		ruleDecimal
		{ after(grammarAccess.getDecimalValueEqualsAccess().getValueDecimalParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueNotEquals__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalValueNotEqualsAccess().getValueDecimalParserRuleCall_2_0()); }
		ruleDecimal
		{ after(grammarAccess.getDecimalValueNotEqualsAccess().getValueDecimalParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThan__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalValueGreaterThanAccess().getValueDecimalParserRuleCall_2_0()); }
		ruleDecimal
		{ after(grammarAccess.getDecimalValueGreaterThanAccess().getValueDecimalParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThan__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalValueLessThanAccess().getValueDecimalParserRuleCall_2_0()); }
		ruleDecimal
		{ after(grammarAccess.getDecimalValueLessThanAccess().getValueDecimalParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueGreaterThanEquals__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getValueDecimalParserRuleCall_2_0()); }
		ruleDecimal
		{ after(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getValueDecimalParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueLessThanEquals__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalValueLessThanEqualsAccess().getValueDecimalParserRuleCall_2_0()); }
		ruleDecimal
		{ after(grammarAccess.getDecimalValueLessThanEqualsAccess().getValueDecimalParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedExpression__NestedAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedExpressionAccess().getNestedExpressionConstraintParserRuleCall_1_0()); }
		ruleExpressionConstraint
		{ after(grammarAccess.getNestedExpressionAccess().getNestedExpressionConstraintParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}
