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
package com.b2international.snomed.ql.services;

import com.b2international.snomed.ecl.services.EclGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class QLGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class QueryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.Query");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cQueryAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cQueryAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cQueryQueryConstraintParserRuleCall_1_0 = (RuleCall)cQueryAssignment_1.eContents().get(0);
		
		//Query:
		//	{Query} query=QueryConstraint?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Query} query=QueryConstraint?
		public Group getGroup() { return cGroup; }
		
		//{Query}
		public Action getQueryAction_0() { return cQueryAction_0; }
		
		//query=QueryConstraint?
		public Assignment getQueryAssignment_1() { return cQueryAssignment_1; }
		
		//QueryConstraint
		public RuleCall getQueryQueryConstraintParserRuleCall_1_0() { return cQueryQueryConstraintParserRuleCall_1_0; }
	}
	public class QueryConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.QueryConstraint");
		private final RuleCall cQueryDisjunctionParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//// Domain Query Parts
		//QueryConstraint:
		//	QueryDisjunction;
		@Override public ParserRule getRule() { return rule; }
		
		//QueryDisjunction
		public RuleCall getQueryDisjunctionParserRuleCall() { return cQueryDisjunctionParserRuleCall; }
	}
	public class QueryDisjunctionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.QueryDisjunction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQueryConjunctionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cQueryDisjunctionLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cDISJUNCTIONTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightQueryConjunctionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//QueryDisjunction QueryConstraint:
		//	QueryConjunction ({QueryDisjunction.left=current} DISJUNCTION right=QueryConjunction)*;
		@Override public ParserRule getRule() { return rule; }
		
		//QueryConjunction ({QueryDisjunction.left=current} DISJUNCTION right=QueryConjunction)*
		public Group getGroup() { return cGroup; }
		
		//QueryConjunction
		public RuleCall getQueryConjunctionParserRuleCall_0() { return cQueryConjunctionParserRuleCall_0; }
		
		//({QueryDisjunction.left=current} DISJUNCTION right=QueryConjunction)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{QueryDisjunction.left=current}
		public Action getQueryDisjunctionLeftAction_1_0() { return cQueryDisjunctionLeftAction_1_0; }
		
		//DISJUNCTION
		public RuleCall getDISJUNCTIONTerminalRuleCall_1_1() { return cDISJUNCTIONTerminalRuleCall_1_1; }
		
		//right=QueryConjunction
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//QueryConjunction
		public RuleCall getRightQueryConjunctionParserRuleCall_1_2_0() { return cRightQueryConjunctionParserRuleCall_1_2_0; }
	}
	public class QueryConjunctionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.QueryConjunction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQueryExclusionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cQueryConjunctionLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final RuleCall cCONJUNCTIONTerminalRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final RuleCall cCOMMATerminalRuleCall_1_1_1 = (RuleCall)cAlternatives_1_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightQueryExclusionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//QueryConjunction QueryConstraint:
		//	QueryExclusion ({QueryConjunction.left=current} (CONJUNCTION | COMMA) right=QueryExclusion)*;
		@Override public ParserRule getRule() { return rule; }
		
		//QueryExclusion ({QueryConjunction.left=current} (CONJUNCTION | COMMA) right=QueryExclusion)*
		public Group getGroup() { return cGroup; }
		
		//QueryExclusion
		public RuleCall getQueryExclusionParserRuleCall_0() { return cQueryExclusionParserRuleCall_0; }
		
		//({QueryConjunction.left=current} (CONJUNCTION | COMMA) right=QueryExclusion)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{QueryConjunction.left=current}
		public Action getQueryConjunctionLeftAction_1_0() { return cQueryConjunctionLeftAction_1_0; }
		
		//(CONJUNCTION | COMMA)
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//CONJUNCTION
		public RuleCall getCONJUNCTIONTerminalRuleCall_1_1_0() { return cCONJUNCTIONTerminalRuleCall_1_1_0; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_1_1_1() { return cCOMMATerminalRuleCall_1_1_1; }
		
		//right=QueryExclusion
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//QueryExclusion
		public RuleCall getRightQueryExclusionParserRuleCall_1_2_0() { return cRightQueryExclusionParserRuleCall_1_2_0; }
	}
	public class QueryExclusionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.QueryExclusion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSubQueryParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cQueryExclusionLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cEXCLUSIONTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightSubQueryParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//QueryExclusion QueryConstraint:
		//	SubQuery ({QueryExclusion.left=current} EXCLUSION right=SubQuery)?;
		@Override public ParserRule getRule() { return rule; }
		
		//SubQuery ({QueryExclusion.left=current} EXCLUSION right=SubQuery)?
		public Group getGroup() { return cGroup; }
		
		//SubQuery
		public RuleCall getSubQueryParserRuleCall_0() { return cSubQueryParserRuleCall_0; }
		
		//({QueryExclusion.left=current} EXCLUSION right=SubQuery)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{QueryExclusion.left=current}
		public Action getQueryExclusionLeftAction_1_0() { return cQueryExclusionLeftAction_1_0; }
		
		//EXCLUSION
		public RuleCall getEXCLUSIONTerminalRuleCall_1_1() { return cEXCLUSIONTerminalRuleCall_1_1; }
		
		//right=SubQuery
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//SubQuery
		public RuleCall getRightSubQueryParserRuleCall_1_2_0() { return cRightSubQueryParserRuleCall_1_2_0; }
	}
	public class SubQueryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.SubQuery");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDomainQueryParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNestedQueryParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//SubQuery:
		//	DomainQuery | NestedQuery;
		@Override public ParserRule getRule() { return rule; }
		
		//DomainQuery | NestedQuery
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DomainQuery
		public RuleCall getDomainQueryParserRuleCall_0() { return cDomainQueryParserRuleCall_0; }
		
		//NestedQuery
		public RuleCall getNestedQueryParserRuleCall_1() { return cNestedQueryParserRuleCall_1; }
	}
	public class DomainQueryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.DomainQuery");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDomainQueryAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cEclAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cEclExpressionConstraintParserRuleCall_1_0 = (RuleCall)cEclAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final RuleCall cOPEN_DOUBLE_BRACESTerminalRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final Assignment cFilterAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cFilterFilterParserRuleCall_2_1_0 = (RuleCall)cFilterAssignment_2_1.eContents().get(0);
		private final RuleCall cCLOSE_DOUBLE_BRACESTerminalRuleCall_2_2 = (RuleCall)cGroup_2.eContents().get(2);
		
		//DomainQuery:
		//	{DomainQuery} ecl=ExpressionConstraint? (OPEN_DOUBLE_BRACES filter=Filter CLOSE_DOUBLE_BRACES)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{DomainQuery} ecl=ExpressionConstraint? (OPEN_DOUBLE_BRACES filter=Filter CLOSE_DOUBLE_BRACES)?
		public Group getGroup() { return cGroup; }
		
		//{DomainQuery}
		public Action getDomainQueryAction_0() { return cDomainQueryAction_0; }
		
		//ecl=ExpressionConstraint?
		public Assignment getEclAssignment_1() { return cEclAssignment_1; }
		
		//ExpressionConstraint
		public RuleCall getEclExpressionConstraintParserRuleCall_1_0() { return cEclExpressionConstraintParserRuleCall_1_0; }
		
		//(OPEN_DOUBLE_BRACES filter=Filter CLOSE_DOUBLE_BRACES)?
		public Group getGroup_2() { return cGroup_2; }
		
		//OPEN_DOUBLE_BRACES
		public RuleCall getOPEN_DOUBLE_BRACESTerminalRuleCall_2_0() { return cOPEN_DOUBLE_BRACESTerminalRuleCall_2_0; }
		
		//filter=Filter
		public Assignment getFilterAssignment_2_1() { return cFilterAssignment_2_1; }
		
		//Filter
		public RuleCall getFilterFilterParserRuleCall_2_1_0() { return cFilterFilterParserRuleCall_2_1_0; }
		
		//CLOSE_DOUBLE_BRACES
		public RuleCall getCLOSE_DOUBLE_BRACESTerminalRuleCall_2_2() { return cCLOSE_DOUBLE_BRACESTerminalRuleCall_2_2; }
	}
	public class NestedQueryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.NestedQuery");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNestedAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNestedQueryConstraintParserRuleCall_1_0 = (RuleCall)cNestedAssignment_1.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//NestedQuery:
		//	ROUND_OPEN nested=QueryConstraint ROUND_CLOSE;
		@Override public ParserRule getRule() { return rule; }
		
		//ROUND_OPEN nested=QueryConstraint ROUND_CLOSE
		public Group getGroup() { return cGroup; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_0() { return cROUND_OPENTerminalRuleCall_0; }
		
		//nested=QueryConstraint
		public Assignment getNestedAssignment_1() { return cNestedAssignment_1; }
		
		//QueryConstraint
		public RuleCall getNestedQueryConstraintParserRuleCall_1_0() { return cNestedQueryConstraintParserRuleCall_1_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_2() { return cROUND_CLOSETerminalRuleCall_2; }
	}
	public class FilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.Filter");
		private final RuleCall cDisjunctionFilterParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//// Domain Property Filters
		//Filter:
		//	DisjunctionFilter;
		@Override public ParserRule getRule() { return rule; }
		
		//DisjunctionFilter
		public RuleCall getDisjunctionFilterParserRuleCall() { return cDisjunctionFilterParserRuleCall; }
	}
	public class DisjunctionFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.DisjunctionFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cConjunctionFilterParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cDisjunctionFilterLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cDISJUNCTIONTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightConjunctionFilterParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//DisjunctionFilter Filter:
		//	ConjunctionFilter ({DisjunctionFilter.left=current} DISJUNCTION right=ConjunctionFilter)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ConjunctionFilter ({DisjunctionFilter.left=current} DISJUNCTION right=ConjunctionFilter)*
		public Group getGroup() { return cGroup; }
		
		//ConjunctionFilter
		public RuleCall getConjunctionFilterParserRuleCall_0() { return cConjunctionFilterParserRuleCall_0; }
		
		//({DisjunctionFilter.left=current} DISJUNCTION right=ConjunctionFilter)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{DisjunctionFilter.left=current}
		public Action getDisjunctionFilterLeftAction_1_0() { return cDisjunctionFilterLeftAction_1_0; }
		
		//DISJUNCTION
		public RuleCall getDISJUNCTIONTerminalRuleCall_1_1() { return cDISJUNCTIONTerminalRuleCall_1_1; }
		
		//right=ConjunctionFilter
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//ConjunctionFilter
		public RuleCall getRightConjunctionFilterParserRuleCall_1_2_0() { return cRightConjunctionFilterParserRuleCall_1_2_0; }
	}
	public class ConjunctionFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.ConjunctionFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cExclusionFilterParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cConjunctionFilterLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final RuleCall cCONJUNCTIONTerminalRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final RuleCall cCOMMATerminalRuleCall_1_1_1 = (RuleCall)cAlternatives_1_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightExclusionFilterParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//ConjunctionFilter Filter:
		//	ExclusionFilter ({ConjunctionFilter.left=current} (CONJUNCTION | COMMA) right=ExclusionFilter)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ExclusionFilter ({ConjunctionFilter.left=current} (CONJUNCTION | COMMA) right=ExclusionFilter)*
		public Group getGroup() { return cGroup; }
		
		//ExclusionFilter
		public RuleCall getExclusionFilterParserRuleCall_0() { return cExclusionFilterParserRuleCall_0; }
		
		//({ConjunctionFilter.left=current} (CONJUNCTION | COMMA) right=ExclusionFilter)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{ConjunctionFilter.left=current}
		public Action getConjunctionFilterLeftAction_1_0() { return cConjunctionFilterLeftAction_1_0; }
		
		//(CONJUNCTION | COMMA)
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//CONJUNCTION
		public RuleCall getCONJUNCTIONTerminalRuleCall_1_1_0() { return cCONJUNCTIONTerminalRuleCall_1_1_0; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_1_1_1() { return cCOMMATerminalRuleCall_1_1_1; }
		
		//right=ExclusionFilter
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//ExclusionFilter
		public RuleCall getRightExclusionFilterParserRuleCall_1_2_0() { return cRightExclusionFilterParserRuleCall_1_2_0; }
	}
	public class ExclusionFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.ExclusionFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPropertyFilterParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cExclusionFilterLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cEXCLUSIONTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightPropertyFilterParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//ExclusionFilter Filter:
		//	PropertyFilter ({ExclusionFilter.left=current} EXCLUSION right=PropertyFilter)?;
		@Override public ParserRule getRule() { return rule; }
		
		//PropertyFilter ({ExclusionFilter.left=current} EXCLUSION right=PropertyFilter)?
		public Group getGroup() { return cGroup; }
		
		//PropertyFilter
		public RuleCall getPropertyFilterParserRuleCall_0() { return cPropertyFilterParserRuleCall_0; }
		
		//({ExclusionFilter.left=current} EXCLUSION right=PropertyFilter)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{ExclusionFilter.left=current}
		public Action getExclusionFilterLeftAction_1_0() { return cExclusionFilterLeftAction_1_0; }
		
		//EXCLUSION
		public RuleCall getEXCLUSIONTerminalRuleCall_1_1() { return cEXCLUSIONTerminalRuleCall_1_1; }
		
		//right=PropertyFilter
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//PropertyFilter
		public RuleCall getRightPropertyFilterParserRuleCall_1_2_0() { return cRightPropertyFilterParserRuleCall_1_2_0; }
	}
	public class NestedFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.NestedFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNestedAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNestedFilterParserRuleCall_1_0 = (RuleCall)cNestedAssignment_1.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//NestedFilter:
		//	ROUND_OPEN nested=Filter ROUND_CLOSE;
		@Override public ParserRule getRule() { return rule; }
		
		//ROUND_OPEN nested=Filter ROUND_CLOSE
		public Group getGroup() { return cGroup; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_0() { return cROUND_OPENTerminalRuleCall_0; }
		
		//nested=Filter
		public Assignment getNestedAssignment_1() { return cNestedAssignment_1; }
		
		//Filter
		public RuleCall getNestedFilterParserRuleCall_1_0() { return cNestedFilterParserRuleCall_1_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_2() { return cROUND_CLOSETerminalRuleCall_2; }
	}
	public class PropertyFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.PropertyFilter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cActiveFilterParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTermFilterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cPreferredInFilterParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cAcceptableInFilterParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cLanguageRefSetFilterParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cTypeFilterParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cModuleFilterParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cCaseSignificanceFilterParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cLanguageCodeFilterParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cNestedFilterParserRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		
		//PropertyFilter:
		//	ActiveFilter | TermFilter | PreferredInFilter | AcceptableInFilter | LanguageRefSetFilter | TypeFilter | ModuleFilter
		//	| CaseSignificanceFilter | LanguageCodeFilter
		//	| NestedFilter;
		@Override public ParserRule getRule() { return rule; }
		
		//ActiveFilter | TermFilter | PreferredInFilter | AcceptableInFilter | LanguageRefSetFilter | TypeFilter | ModuleFilter |
		//CaseSignificanceFilter | LanguageCodeFilter | NestedFilter
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ActiveFilter
		public RuleCall getActiveFilterParserRuleCall_0() { return cActiveFilterParserRuleCall_0; }
		
		//TermFilter
		public RuleCall getTermFilterParserRuleCall_1() { return cTermFilterParserRuleCall_1; }
		
		//PreferredInFilter
		public RuleCall getPreferredInFilterParserRuleCall_2() { return cPreferredInFilterParserRuleCall_2; }
		
		//AcceptableInFilter
		public RuleCall getAcceptableInFilterParserRuleCall_3() { return cAcceptableInFilterParserRuleCall_3; }
		
		//LanguageRefSetFilter
		public RuleCall getLanguageRefSetFilterParserRuleCall_4() { return cLanguageRefSetFilterParserRuleCall_4; }
		
		//TypeFilter
		public RuleCall getTypeFilterParserRuleCall_5() { return cTypeFilterParserRuleCall_5; }
		
		//ModuleFilter
		public RuleCall getModuleFilterParserRuleCall_6() { return cModuleFilterParserRuleCall_6; }
		
		//CaseSignificanceFilter
		public RuleCall getCaseSignificanceFilterParserRuleCall_7() { return cCaseSignificanceFilterParserRuleCall_7; }
		
		//LanguageCodeFilter
		public RuleCall getLanguageCodeFilterParserRuleCall_8() { return cLanguageCodeFilterParserRuleCall_8; }
		
		//NestedFilter
		public RuleCall getNestedFilterParserRuleCall_9() { return cNestedFilterParserRuleCall_9; }
	}
	public class ActiveFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.ActiveFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cDomainAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cDomainDomainEnumRuleCall_0_0_0 = (RuleCall)cDomainAssignment_0_0.eContents().get(0);
		private final RuleCall cDOTTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Keyword cActiveKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cEQUALTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cActiveAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cActiveBooleanParserRuleCall_3_0 = (RuleCall)cActiveAssignment_3.eContents().get(0);
		
		//ActiveFilter:
		//	(domain=Domain DOT)? 'active' EQUAL active=Boolean;
		@Override public ParserRule getRule() { return rule; }
		
		//(domain=Domain DOT)? 'active' EQUAL active=Boolean
		public Group getGroup() { return cGroup; }
		
		//(domain=Domain DOT)?
		public Group getGroup_0() { return cGroup_0; }
		
		//domain=Domain
		public Assignment getDomainAssignment_0_0() { return cDomainAssignment_0_0; }
		
		//Domain
		public RuleCall getDomainDomainEnumRuleCall_0_0_0() { return cDomainDomainEnumRuleCall_0_0_0; }
		
		//DOT
		public RuleCall getDOTTerminalRuleCall_0_1() { return cDOTTerminalRuleCall_0_1; }
		
		//'active'
		public Keyword getActiveKeyword_1() { return cActiveKeyword_1; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_2() { return cEQUALTerminalRuleCall_2; }
		
		//active=Boolean
		public Assignment getActiveAssignment_3() { return cActiveAssignment_3; }
		
		//Boolean
		public RuleCall getActiveBooleanParserRuleCall_3_0() { return cActiveBooleanParserRuleCall_3_0; }
	}
	public class ModuleFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.ModuleFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cDomainAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cDomainDomainEnumRuleCall_0_0_0 = (RuleCall)cDomainAssignment_0_0.eContents().get(0);
		private final RuleCall cDOTTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Keyword cModuleIdKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cEQUALTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cModuleIdAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cModuleIdExpressionConstraintParserRuleCall_3_0 = (RuleCall)cModuleIdAssignment_3.eContents().get(0);
		
		//ModuleFilter:
		//	(domain=Domain DOT)? 'moduleId' EQUAL moduleId=ExpressionConstraint;
		@Override public ParserRule getRule() { return rule; }
		
		//(domain=Domain DOT)? 'moduleId' EQUAL moduleId=ExpressionConstraint
		public Group getGroup() { return cGroup; }
		
		//(domain=Domain DOT)?
		public Group getGroup_0() { return cGroup_0; }
		
		//domain=Domain
		public Assignment getDomainAssignment_0_0() { return cDomainAssignment_0_0; }
		
		//Domain
		public RuleCall getDomainDomainEnumRuleCall_0_0_0() { return cDomainDomainEnumRuleCall_0_0_0; }
		
		//DOT
		public RuleCall getDOTTerminalRuleCall_0_1() { return cDOTTerminalRuleCall_0_1; }
		
		//'moduleId'
		public Keyword getModuleIdKeyword_1() { return cModuleIdKeyword_1; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_2() { return cEQUALTerminalRuleCall_2; }
		
		//moduleId=ExpressionConstraint
		public Assignment getModuleIdAssignment_3() { return cModuleIdAssignment_3; }
		
		//ExpressionConstraint
		public RuleCall getModuleIdExpressionConstraintParserRuleCall_3_0() { return cModuleIdExpressionConstraintParserRuleCall_3_0; }
	}
	public class TermFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.TermFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTermKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cEQUALTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cLexicalSearchTypeAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cLexicalSearchTypeLexicalSearchTypeEnumRuleCall_2_0_0 = (RuleCall)cLexicalSearchTypeAssignment_2_0.eContents().get(0);
		private final RuleCall cCOLONTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Assignment cTermAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTermSTRINGTerminalRuleCall_3_0 = (RuleCall)cTermAssignment_3.eContents().get(0);
		
		//TermFilter:
		//	'term' EQUAL (lexicalSearchType=LexicalSearchType COLON)? term=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'term' EQUAL (lexicalSearchType=LexicalSearchType COLON)? term=STRING
		public Group getGroup() { return cGroup; }
		
		//'term'
		public Keyword getTermKeyword_0() { return cTermKeyword_0; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_1() { return cEQUALTerminalRuleCall_1; }
		
		//(lexicalSearchType=LexicalSearchType COLON)?
		public Group getGroup_2() { return cGroup_2; }
		
		//lexicalSearchType=LexicalSearchType
		public Assignment getLexicalSearchTypeAssignment_2_0() { return cLexicalSearchTypeAssignment_2_0; }
		
		//LexicalSearchType
		public RuleCall getLexicalSearchTypeLexicalSearchTypeEnumRuleCall_2_0_0() { return cLexicalSearchTypeLexicalSearchTypeEnumRuleCall_2_0_0; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_2_1() { return cCOLONTerminalRuleCall_2_1; }
		
		//term=STRING
		public Assignment getTermAssignment_3() { return cTermAssignment_3; }
		
		//STRING
		public RuleCall getTermSTRINGTerminalRuleCall_3_0() { return cTermSTRINGTerminalRuleCall_3_0; }
	}
	public class PreferredInFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.PreferredInFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPreferredInKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cEQUALTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cLanguageRefSetIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLanguageRefSetIdExpressionConstraintParserRuleCall_2_0 = (RuleCall)cLanguageRefSetIdAssignment_2.eContents().get(0);
		
		//PreferredInFilter:
		//	'preferredIn' EQUAL languageRefSetId=ExpressionConstraint;
		@Override public ParserRule getRule() { return rule; }
		
		//'preferredIn' EQUAL languageRefSetId=ExpressionConstraint
		public Group getGroup() { return cGroup; }
		
		//'preferredIn'
		public Keyword getPreferredInKeyword_0() { return cPreferredInKeyword_0; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_1() { return cEQUALTerminalRuleCall_1; }
		
		//languageRefSetId=ExpressionConstraint
		public Assignment getLanguageRefSetIdAssignment_2() { return cLanguageRefSetIdAssignment_2; }
		
		//ExpressionConstraint
		public RuleCall getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0() { return cLanguageRefSetIdExpressionConstraintParserRuleCall_2_0; }
	}
	public class AcceptableInFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.AcceptableInFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAcceptableInKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cEQUALTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cLanguageRefSetIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLanguageRefSetIdExpressionConstraintParserRuleCall_2_0 = (RuleCall)cLanguageRefSetIdAssignment_2.eContents().get(0);
		
		//AcceptableInFilter:
		//	'acceptableIn' EQUAL languageRefSetId=ExpressionConstraint;
		@Override public ParserRule getRule() { return rule; }
		
		//'acceptableIn' EQUAL languageRefSetId=ExpressionConstraint
		public Group getGroup() { return cGroup; }
		
		//'acceptableIn'
		public Keyword getAcceptableInKeyword_0() { return cAcceptableInKeyword_0; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_1() { return cEQUALTerminalRuleCall_1; }
		
		//languageRefSetId=ExpressionConstraint
		public Assignment getLanguageRefSetIdAssignment_2() { return cLanguageRefSetIdAssignment_2; }
		
		//ExpressionConstraint
		public RuleCall getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0() { return cLanguageRefSetIdExpressionConstraintParserRuleCall_2_0; }
	}
	public class LanguageRefSetFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.LanguageRefSetFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLanguageRefSetIdKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cEQUALTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cLanguageRefSetIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLanguageRefSetIdExpressionConstraintParserRuleCall_2_0 = (RuleCall)cLanguageRefSetIdAssignment_2.eContents().get(0);
		
		//LanguageRefSetFilter:
		//	'languageRefSetId' EQUAL languageRefSetId=ExpressionConstraint;
		@Override public ParserRule getRule() { return rule; }
		
		//'languageRefSetId' EQUAL languageRefSetId=ExpressionConstraint
		public Group getGroup() { return cGroup; }
		
		//'languageRefSetId'
		public Keyword getLanguageRefSetIdKeyword_0() { return cLanguageRefSetIdKeyword_0; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_1() { return cEQUALTerminalRuleCall_1; }
		
		//languageRefSetId=ExpressionConstraint
		public Assignment getLanguageRefSetIdAssignment_2() { return cLanguageRefSetIdAssignment_2; }
		
		//ExpressionConstraint
		public RuleCall getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0() { return cLanguageRefSetIdExpressionConstraintParserRuleCall_2_0; }
	}
	public class TypeFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.TypeFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTypeIdKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cEQUALTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeExpressionConstraintParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//TypeFilter:
		//	'typeId' EQUAL type=ExpressionConstraint;
		@Override public ParserRule getRule() { return rule; }
		
		//'typeId' EQUAL type=ExpressionConstraint
		public Group getGroup() { return cGroup; }
		
		//'typeId'
		public Keyword getTypeIdKeyword_0() { return cTypeIdKeyword_0; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_1() { return cEQUALTerminalRuleCall_1; }
		
		//type=ExpressionConstraint
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//ExpressionConstraint
		public RuleCall getTypeExpressionConstraintParserRuleCall_2_0() { return cTypeExpressionConstraintParserRuleCall_2_0; }
	}
	public class CaseSignificanceFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.CaseSignificanceFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseSignificanceIdKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cEQUALTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cCaseSignificanceIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCaseSignificanceIdExpressionConstraintParserRuleCall_2_0 = (RuleCall)cCaseSignificanceIdAssignment_2.eContents().get(0);
		
		//CaseSignificanceFilter:
		//	'caseSignificanceId' EQUAL caseSignificanceId=ExpressionConstraint;
		@Override public ParserRule getRule() { return rule; }
		
		//'caseSignificanceId' EQUAL caseSignificanceId=ExpressionConstraint
		public Group getGroup() { return cGroup; }
		
		//'caseSignificanceId'
		public Keyword getCaseSignificanceIdKeyword_0() { return cCaseSignificanceIdKeyword_0; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_1() { return cEQUALTerminalRuleCall_1; }
		
		//caseSignificanceId=ExpressionConstraint
		public Assignment getCaseSignificanceIdAssignment_2() { return cCaseSignificanceIdAssignment_2; }
		
		//ExpressionConstraint
		public RuleCall getCaseSignificanceIdExpressionConstraintParserRuleCall_2_0() { return cCaseSignificanceIdExpressionConstraintParserRuleCall_2_0; }
	}
	public class LanguageCodeFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.LanguageCodeFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLanguageCodeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cEQUALTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cLanguageCodeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLanguageCodeSTRINGTerminalRuleCall_2_0 = (RuleCall)cLanguageCodeAssignment_2.eContents().get(0);
		
		//LanguageCodeFilter:
		//	'languageCode' EQUAL languageCode=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'languageCode' EQUAL languageCode=STRING
		public Group getGroup() { return cGroup; }
		
		//'languageCode'
		public Keyword getLanguageCodeKeyword_0() { return cLanguageCodeKeyword_0; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_1() { return cEQUALTerminalRuleCall_1; }
		
		//languageCode=STRING
		public Assignment getLanguageCodeAssignment_2() { return cLanguageCodeAssignment_2; }
		
		//STRING
		public RuleCall getLanguageCodeSTRINGTerminalRuleCall_2_0() { return cLanguageCodeSTRINGTerminalRuleCall_2_0; }
	}
	
	public class LexicalSearchTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.LexicalSearchType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMATCHEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMATCHMatchKeyword_0_0 = (Keyword)cMATCHEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cREGEXEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cREGEXRegexKeyword_1_0 = (Keyword)cREGEXEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cEXACTEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cEXACTExactKeyword_2_0 = (Keyword)cEXACTEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum LexicalSearchType:
		//	MATCH="match" | REGEX="regex" | EXACT="exact";
		public EnumRule getRule() { return rule; }
		
		//MATCH="match" | REGEX="regex" | EXACT="exact"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MATCH="match"
		public EnumLiteralDeclaration getMATCHEnumLiteralDeclaration_0() { return cMATCHEnumLiteralDeclaration_0; }
		
		//"match"
		public Keyword getMATCHMatchKeyword_0_0() { return cMATCHMatchKeyword_0_0; }
		
		//REGEX="regex"
		public EnumLiteralDeclaration getREGEXEnumLiteralDeclaration_1() { return cREGEXEnumLiteralDeclaration_1; }
		
		//"regex"
		public Keyword getREGEXRegexKeyword_1_0() { return cREGEXRegexKeyword_1_0; }
		
		//EXACT="exact"
		public EnumLiteralDeclaration getEXACTEnumLiteralDeclaration_2() { return cEXACTEnumLiteralDeclaration_2; }
		
		//"exact"
		public Keyword getEXACTExactKeyword_2_0() { return cEXACTExactKeyword_2_0; }
	}
	public class DomainElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.Domain");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cCONCEPTEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cCONCEPTConceptKeyword_0_0 = (Keyword)cCONCEPTEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDESCRIPTIONEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDESCRIPTIONDescriptionKeyword_1_0 = (Keyword)cDESCRIPTIONEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Domain:
		//	CONCEPT="Concept" | DESCRIPTION="Description";
		public EnumRule getRule() { return rule; }
		
		//CONCEPT="Concept" | DESCRIPTION="Description"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//CONCEPT="Concept"
		public EnumLiteralDeclaration getCONCEPTEnumLiteralDeclaration_0() { return cCONCEPTEnumLiteralDeclaration_0; }
		
		//"Concept"
		public Keyword getCONCEPTConceptKeyword_0_0() { return cCONCEPTConceptKeyword_0_0; }
		
		//DESCRIPTION="Description"
		public EnumLiteralDeclaration getDESCRIPTIONEnumLiteralDeclaration_1() { return cDESCRIPTIONEnumLiteralDeclaration_1; }
		
		//"Description"
		public Keyword getDESCRIPTIONDescriptionKeyword_1_0() { return cDESCRIPTIONDescriptionKeyword_1_0; }
	}
	
	private final QueryElements pQuery;
	private final QueryConstraintElements pQueryConstraint;
	private final QueryDisjunctionElements pQueryDisjunction;
	private final QueryConjunctionElements pQueryConjunction;
	private final QueryExclusionElements pQueryExclusion;
	private final SubQueryElements pSubQuery;
	private final DomainQueryElements pDomainQuery;
	private final NestedQueryElements pNestedQuery;
	private final FilterElements pFilter;
	private final DisjunctionFilterElements pDisjunctionFilter;
	private final ConjunctionFilterElements pConjunctionFilter;
	private final ExclusionFilterElements pExclusionFilter;
	private final NestedFilterElements pNestedFilter;
	private final PropertyFilterElements pPropertyFilter;
	private final ActiveFilterElements pActiveFilter;
	private final ModuleFilterElements pModuleFilter;
	private final TermFilterElements pTermFilter;
	private final PreferredInFilterElements pPreferredInFilter;
	private final AcceptableInFilterElements pAcceptableInFilter;
	private final LanguageRefSetFilterElements pLanguageRefSetFilter;
	private final TypeFilterElements pTypeFilter;
	private final CaseSignificanceFilterElements pCaseSignificanceFilter;
	private final LanguageCodeFilterElements pLanguageCodeFilter;
	private final LexicalSearchTypeElements eLexicalSearchType;
	private final DomainElements eDomain;
	private final TerminalRule tOPEN_DOUBLE_BRACES;
	private final TerminalRule tCLOSE_DOUBLE_BRACES;
	
	private final Grammar grammar;
	
	private final EclGrammarAccess gaEcl;

	@Inject
	public QLGrammarAccess(GrammarProvider grammarProvider,
			EclGrammarAccess gaEcl) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaEcl = gaEcl;
		this.pQuery = new QueryElements();
		this.pQueryConstraint = new QueryConstraintElements();
		this.pQueryDisjunction = new QueryDisjunctionElements();
		this.pQueryConjunction = new QueryConjunctionElements();
		this.pQueryExclusion = new QueryExclusionElements();
		this.pSubQuery = new SubQueryElements();
		this.pDomainQuery = new DomainQueryElements();
		this.pNestedQuery = new NestedQueryElements();
		this.pFilter = new FilterElements();
		this.pDisjunctionFilter = new DisjunctionFilterElements();
		this.pConjunctionFilter = new ConjunctionFilterElements();
		this.pExclusionFilter = new ExclusionFilterElements();
		this.pNestedFilter = new NestedFilterElements();
		this.pPropertyFilter = new PropertyFilterElements();
		this.pActiveFilter = new ActiveFilterElements();
		this.pModuleFilter = new ModuleFilterElements();
		this.pTermFilter = new TermFilterElements();
		this.pPreferredInFilter = new PreferredInFilterElements();
		this.pAcceptableInFilter = new AcceptableInFilterElements();
		this.pLanguageRefSetFilter = new LanguageRefSetFilterElements();
		this.pTypeFilter = new TypeFilterElements();
		this.pCaseSignificanceFilter = new CaseSignificanceFilterElements();
		this.pLanguageCodeFilter = new LanguageCodeFilterElements();
		this.eLexicalSearchType = new LexicalSearchTypeElements();
		this.eDomain = new DomainElements();
		this.tOPEN_DOUBLE_BRACES = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.OPEN_DOUBLE_BRACES");
		this.tCLOSE_DOUBLE_BRACES = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ql.QL.CLOSE_DOUBLE_BRACES");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.b2international.snomed.ql.QL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public EclGrammarAccess getEclGrammarAccess() {
		return gaEcl;
	}

	
	//Query:
	//	{Query} query=QueryConstraint?;
	public QueryElements getQueryAccess() {
		return pQuery;
	}
	
	public ParserRule getQueryRule() {
		return getQueryAccess().getRule();
	}
	
	//// Domain Query Parts
	//QueryConstraint:
	//	QueryDisjunction;
	public QueryConstraintElements getQueryConstraintAccess() {
		return pQueryConstraint;
	}
	
	public ParserRule getQueryConstraintRule() {
		return getQueryConstraintAccess().getRule();
	}
	
	//QueryDisjunction QueryConstraint:
	//	QueryConjunction ({QueryDisjunction.left=current} DISJUNCTION right=QueryConjunction)*;
	public QueryDisjunctionElements getQueryDisjunctionAccess() {
		return pQueryDisjunction;
	}
	
	public ParserRule getQueryDisjunctionRule() {
		return getQueryDisjunctionAccess().getRule();
	}
	
	//QueryConjunction QueryConstraint:
	//	QueryExclusion ({QueryConjunction.left=current} (CONJUNCTION | COMMA) right=QueryExclusion)*;
	public QueryConjunctionElements getQueryConjunctionAccess() {
		return pQueryConjunction;
	}
	
	public ParserRule getQueryConjunctionRule() {
		return getQueryConjunctionAccess().getRule();
	}
	
	//QueryExclusion QueryConstraint:
	//	SubQuery ({QueryExclusion.left=current} EXCLUSION right=SubQuery)?;
	public QueryExclusionElements getQueryExclusionAccess() {
		return pQueryExclusion;
	}
	
	public ParserRule getQueryExclusionRule() {
		return getQueryExclusionAccess().getRule();
	}
	
	//SubQuery:
	//	DomainQuery | NestedQuery;
	public SubQueryElements getSubQueryAccess() {
		return pSubQuery;
	}
	
	public ParserRule getSubQueryRule() {
		return getSubQueryAccess().getRule();
	}
	
	//DomainQuery:
	//	{DomainQuery} ecl=ExpressionConstraint? (OPEN_DOUBLE_BRACES filter=Filter CLOSE_DOUBLE_BRACES)?;
	public DomainQueryElements getDomainQueryAccess() {
		return pDomainQuery;
	}
	
	public ParserRule getDomainQueryRule() {
		return getDomainQueryAccess().getRule();
	}
	
	//NestedQuery:
	//	ROUND_OPEN nested=QueryConstraint ROUND_CLOSE;
	public NestedQueryElements getNestedQueryAccess() {
		return pNestedQuery;
	}
	
	public ParserRule getNestedQueryRule() {
		return getNestedQueryAccess().getRule();
	}
	
	//// Domain Property Filters
	//Filter:
	//	DisjunctionFilter;
	public FilterElements getFilterAccess() {
		return pFilter;
	}
	
	public ParserRule getFilterRule() {
		return getFilterAccess().getRule();
	}
	
	//DisjunctionFilter Filter:
	//	ConjunctionFilter ({DisjunctionFilter.left=current} DISJUNCTION right=ConjunctionFilter)*;
	public DisjunctionFilterElements getDisjunctionFilterAccess() {
		return pDisjunctionFilter;
	}
	
	public ParserRule getDisjunctionFilterRule() {
		return getDisjunctionFilterAccess().getRule();
	}
	
	//ConjunctionFilter Filter:
	//	ExclusionFilter ({ConjunctionFilter.left=current} (CONJUNCTION | COMMA) right=ExclusionFilter)*;
	public ConjunctionFilterElements getConjunctionFilterAccess() {
		return pConjunctionFilter;
	}
	
	public ParserRule getConjunctionFilterRule() {
		return getConjunctionFilterAccess().getRule();
	}
	
	//ExclusionFilter Filter:
	//	PropertyFilter ({ExclusionFilter.left=current} EXCLUSION right=PropertyFilter)?;
	public ExclusionFilterElements getExclusionFilterAccess() {
		return pExclusionFilter;
	}
	
	public ParserRule getExclusionFilterRule() {
		return getExclusionFilterAccess().getRule();
	}
	
	//NestedFilter:
	//	ROUND_OPEN nested=Filter ROUND_CLOSE;
	public NestedFilterElements getNestedFilterAccess() {
		return pNestedFilter;
	}
	
	public ParserRule getNestedFilterRule() {
		return getNestedFilterAccess().getRule();
	}
	
	//PropertyFilter:
	//	ActiveFilter | TermFilter | PreferredInFilter | AcceptableInFilter | LanguageRefSetFilter | TypeFilter | ModuleFilter
	//	| CaseSignificanceFilter | LanguageCodeFilter
	//	| NestedFilter;
	public PropertyFilterElements getPropertyFilterAccess() {
		return pPropertyFilter;
	}
	
	public ParserRule getPropertyFilterRule() {
		return getPropertyFilterAccess().getRule();
	}
	
	//ActiveFilter:
	//	(domain=Domain DOT)? 'active' EQUAL active=Boolean;
	public ActiveFilterElements getActiveFilterAccess() {
		return pActiveFilter;
	}
	
	public ParserRule getActiveFilterRule() {
		return getActiveFilterAccess().getRule();
	}
	
	//ModuleFilter:
	//	(domain=Domain DOT)? 'moduleId' EQUAL moduleId=ExpressionConstraint;
	public ModuleFilterElements getModuleFilterAccess() {
		return pModuleFilter;
	}
	
	public ParserRule getModuleFilterRule() {
		return getModuleFilterAccess().getRule();
	}
	
	//TermFilter:
	//	'term' EQUAL (lexicalSearchType=LexicalSearchType COLON)? term=STRING;
	public TermFilterElements getTermFilterAccess() {
		return pTermFilter;
	}
	
	public ParserRule getTermFilterRule() {
		return getTermFilterAccess().getRule();
	}
	
	//PreferredInFilter:
	//	'preferredIn' EQUAL languageRefSetId=ExpressionConstraint;
	public PreferredInFilterElements getPreferredInFilterAccess() {
		return pPreferredInFilter;
	}
	
	public ParserRule getPreferredInFilterRule() {
		return getPreferredInFilterAccess().getRule();
	}
	
	//AcceptableInFilter:
	//	'acceptableIn' EQUAL languageRefSetId=ExpressionConstraint;
	public AcceptableInFilterElements getAcceptableInFilterAccess() {
		return pAcceptableInFilter;
	}
	
	public ParserRule getAcceptableInFilterRule() {
		return getAcceptableInFilterAccess().getRule();
	}
	
	//LanguageRefSetFilter:
	//	'languageRefSetId' EQUAL languageRefSetId=ExpressionConstraint;
	public LanguageRefSetFilterElements getLanguageRefSetFilterAccess() {
		return pLanguageRefSetFilter;
	}
	
	public ParserRule getLanguageRefSetFilterRule() {
		return getLanguageRefSetFilterAccess().getRule();
	}
	
	//TypeFilter:
	//	'typeId' EQUAL type=ExpressionConstraint;
	public TypeFilterElements getTypeFilterAccess() {
		return pTypeFilter;
	}
	
	public ParserRule getTypeFilterRule() {
		return getTypeFilterAccess().getRule();
	}
	
	//CaseSignificanceFilter:
	//	'caseSignificanceId' EQUAL caseSignificanceId=ExpressionConstraint;
	public CaseSignificanceFilterElements getCaseSignificanceFilterAccess() {
		return pCaseSignificanceFilter;
	}
	
	public ParserRule getCaseSignificanceFilterRule() {
		return getCaseSignificanceFilterAccess().getRule();
	}
	
	//LanguageCodeFilter:
	//	'languageCode' EQUAL languageCode=STRING;
	public LanguageCodeFilterElements getLanguageCodeFilterAccess() {
		return pLanguageCodeFilter;
	}
	
	public ParserRule getLanguageCodeFilterRule() {
		return getLanguageCodeFilterAccess().getRule();
	}
	
	//enum LexicalSearchType:
	//	MATCH="match" | REGEX="regex" | EXACT="exact";
	public LexicalSearchTypeElements getLexicalSearchTypeAccess() {
		return eLexicalSearchType;
	}
	
	public EnumRule getLexicalSearchTypeRule() {
		return getLexicalSearchTypeAccess().getRule();
	}
	
	//enum Domain:
	//	CONCEPT="Concept" | DESCRIPTION="Description";
	public DomainElements getDomainAccess() {
		return eDomain;
	}
	
	public EnumRule getDomainRule() {
		return getDomainAccess().getRule();
	}
	
	//terminal OPEN_DOUBLE_BRACES:
	//	'{{';
	public TerminalRule getOPEN_DOUBLE_BRACESRule() {
		return tOPEN_DOUBLE_BRACES;
	}
	
	//terminal CLOSE_DOUBLE_BRACES:
	//	'}}';
	public TerminalRule getCLOSE_DOUBLE_BRACESRule() {
		return tCLOSE_DOUBLE_BRACES;
	}
	
	//Script:
	//	{Script} constraint=ExpressionConstraint?;
	public EclGrammarAccess.ScriptElements getScriptAccess() {
		return gaEcl.getScriptAccess();
	}
	
	public ParserRule getScriptRule() {
		return getScriptAccess().getRule();
	}
	
	//ExpressionConstraint:
	//	OrExpressionConstraint;
	public EclGrammarAccess.ExpressionConstraintElements getExpressionConstraintAccess() {
		return gaEcl.getExpressionConstraintAccess();
	}
	
	public ParserRule getExpressionConstraintRule() {
		return getExpressionConstraintAccess().getRule();
	}
	
	//OrExpressionConstraint ExpressionConstraint:
	//	AndExpressionConstraint ({OrExpressionConstraint.left=current} DISJUNCTION right=AndExpressionConstraint)*;
	public EclGrammarAccess.OrExpressionConstraintElements getOrExpressionConstraintAccess() {
		return gaEcl.getOrExpressionConstraintAccess();
	}
	
	public ParserRule getOrExpressionConstraintRule() {
		return getOrExpressionConstraintAccess().getRule();
	}
	
	//AndExpressionConstraint ExpressionConstraint:
	//	ExclusionExpressionConstraint ({AndExpressionConstraint.left=current} (CONJUNCTION | COMMA)
	//	right=ExclusionExpressionConstraint)*;
	public EclGrammarAccess.AndExpressionConstraintElements getAndExpressionConstraintAccess() {
		return gaEcl.getAndExpressionConstraintAccess();
	}
	
	public ParserRule getAndExpressionConstraintRule() {
		return getAndExpressionConstraintAccess().getRule();
	}
	
	//ExclusionExpressionConstraint ExpressionConstraint:
	//	RefinedExpressionConstraint ({ExclusionExpressionConstraint.left=current} EXCLUSION
	//	right=RefinedExpressionConstraint)?;
	public EclGrammarAccess.ExclusionExpressionConstraintElements getExclusionExpressionConstraintAccess() {
		return gaEcl.getExclusionExpressionConstraintAccess();
	}
	
	public ParserRule getExclusionExpressionConstraintRule() {
		return getExclusionExpressionConstraintAccess().getRule();
	}
	
	//RefinedExpressionConstraint ExpressionConstraint:
	//	DottedExpressionConstraint ({RefinedExpressionConstraint.constraint=current} COLON refinement=EclRefinement)?;
	public EclGrammarAccess.RefinedExpressionConstraintElements getRefinedExpressionConstraintAccess() {
		return gaEcl.getRefinedExpressionConstraintAccess();
	}
	
	public ParserRule getRefinedExpressionConstraintRule() {
		return getRefinedExpressionConstraintAccess().getRule();
	}
	
	//DottedExpressionConstraint ExpressionConstraint:
	//	SubExpressionConstraint ({DottedExpressionConstraint.constraint=current} DOT attribute=SubExpressionConstraint)*;
	public EclGrammarAccess.DottedExpressionConstraintElements getDottedExpressionConstraintAccess() {
		return gaEcl.getDottedExpressionConstraintAccess();
	}
	
	public ParserRule getDottedExpressionConstraintRule() {
		return getDottedExpressionConstraintAccess().getRule();
	}
	
	//SubExpressionConstraint ExpressionConstraint:
	//	ChildOf | ChildOrSelfOf | DescendantOf | DescendantOrSelfOf | ParentOf | ParentOrSelfOf | AncestorOf |
	//	AncestorOrSelfOf | EclFocusConcept;
	public EclGrammarAccess.SubExpressionConstraintElements getSubExpressionConstraintAccess() {
		return gaEcl.getSubExpressionConstraintAccess();
	}
	
	public ParserRule getSubExpressionConstraintRule() {
		return getSubExpressionConstraintAccess().getRule();
	}
	
	//EclFocusConcept ExpressionConstraint:
	//	MemberOf | EclConceptReference | Any | NestedExpression;
	public EclGrammarAccess.EclFocusConceptElements getEclFocusConceptAccess() {
		return gaEcl.getEclFocusConceptAccess();
	}
	
	public ParserRule getEclFocusConceptRule() {
		return getEclFocusConceptAccess().getRule();
	}
	
	//ChildOf:
	//	LT_EM constraint=EclFocusConcept;
	public EclGrammarAccess.ChildOfElements getChildOfAccess() {
		return gaEcl.getChildOfAccess();
	}
	
	public ParserRule getChildOfRule() {
		return getChildOfAccess().getRule();
	}
	
	//ChildOrSelfOf:
	//	DBL_LT_EM constraint=EclFocusConcept;
	public EclGrammarAccess.ChildOrSelfOfElements getChildOrSelfOfAccess() {
		return gaEcl.getChildOrSelfOfAccess();
	}
	
	public ParserRule getChildOrSelfOfRule() {
		return getChildOrSelfOfAccess().getRule();
	}
	
	//DescendantOf:
	//	LT constraint=EclFocusConcept;
	public EclGrammarAccess.DescendantOfElements getDescendantOfAccess() {
		return gaEcl.getDescendantOfAccess();
	}
	
	public ParserRule getDescendantOfRule() {
		return getDescendantOfAccess().getRule();
	}
	
	//DescendantOrSelfOf:
	//	DBL_LT constraint=EclFocusConcept;
	public EclGrammarAccess.DescendantOrSelfOfElements getDescendantOrSelfOfAccess() {
		return gaEcl.getDescendantOrSelfOfAccess();
	}
	
	public ParserRule getDescendantOrSelfOfRule() {
		return getDescendantOrSelfOfAccess().getRule();
	}
	
	//ParentOf:
	//	GT_EM constraint=EclFocusConcept;
	public EclGrammarAccess.ParentOfElements getParentOfAccess() {
		return gaEcl.getParentOfAccess();
	}
	
	public ParserRule getParentOfRule() {
		return getParentOfAccess().getRule();
	}
	
	//ParentOrSelfOf:
	//	DBL_GT_EM constraint=EclFocusConcept;
	public EclGrammarAccess.ParentOrSelfOfElements getParentOrSelfOfAccess() {
		return gaEcl.getParentOrSelfOfAccess();
	}
	
	public ParserRule getParentOrSelfOfRule() {
		return getParentOrSelfOfAccess().getRule();
	}
	
	//AncestorOf:
	//	GT constraint=EclFocusConcept;
	public EclGrammarAccess.AncestorOfElements getAncestorOfAccess() {
		return gaEcl.getAncestorOfAccess();
	}
	
	public ParserRule getAncestorOfRule() {
		return getAncestorOfAccess().getRule();
	}
	
	//AncestorOrSelfOf:
	//	DBL_GT constraint=EclFocusConcept;
	public EclGrammarAccess.AncestorOrSelfOfElements getAncestorOrSelfOfAccess() {
		return gaEcl.getAncestorOrSelfOfAccess();
	}
	
	public ParserRule getAncestorOrSelfOfRule() {
		return getAncestorOrSelfOfAccess().getRule();
	}
	
	//MemberOf:
	//	CARET constraint=(EclConceptReference | Any | NestedExpression);
	public EclGrammarAccess.MemberOfElements getMemberOfAccess() {
		return gaEcl.getMemberOfAccess();
	}
	
	public ParserRule getMemberOfRule() {
		return getMemberOfAccess().getRule();
	}
	
	//EclConceptReference:
	//	id=SnomedIdentifier term=TERM_STRING?;
	public EclGrammarAccess.EclConceptReferenceElements getEclConceptReferenceAccess() {
		return gaEcl.getEclConceptReferenceAccess();
	}
	
	public ParserRule getEclConceptReferenceRule() {
		return getEclConceptReferenceAccess().getRule();
	}
	
	//Any:
	//	WILDCARD {Any};
	public EclGrammarAccess.AnyElements getAnyAccess() {
		return gaEcl.getAnyAccess();
	}
	
	public ParserRule getAnyRule() {
		return getAnyAccess().getRule();
	}
	
	//EclRefinement:
	//	OrRefinement;
	public EclGrammarAccess.EclRefinementElements getEclRefinementAccess() {
		return gaEcl.getEclRefinementAccess();
	}
	
	public ParserRule getEclRefinementRule() {
		return getEclRefinementAccess().getRule();
	}
	
	//OrRefinement EclRefinement:
	//	AndRefinement -> ({OrRefinement.left=current} DISJUNCTION right=AndRefinement)*;
	public EclGrammarAccess.OrRefinementElements getOrRefinementAccess() {
		return gaEcl.getOrRefinementAccess();
	}
	
	public ParserRule getOrRefinementRule() {
		return getOrRefinementAccess().getRule();
	}
	
	//AndRefinement EclRefinement:
	//	SubRefinement -> ({AndRefinement.left=current} (CONJUNCTION | COMMA) right=SubRefinement)*;
	public EclGrammarAccess.AndRefinementElements getAndRefinementAccess() {
		return gaEcl.getAndRefinementAccess();
	}
	
	public ParserRule getAndRefinementRule() {
		return getAndRefinementAccess().getRule();
	}
	
	//SubRefinement EclRefinement:
	//	AttributeConstraint | EclAttributeGroup | NestedRefinement;
	public EclGrammarAccess.SubRefinementElements getSubRefinementAccess() {
		return gaEcl.getSubRefinementAccess();
	}
	
	public ParserRule getSubRefinementRule() {
		return getSubRefinementAccess().getRule();
	}
	
	//NestedRefinement:
	//	ROUND_OPEN nested=EclRefinement ROUND_CLOSE;
	public EclGrammarAccess.NestedRefinementElements getNestedRefinementAccess() {
		return gaEcl.getNestedRefinementAccess();
	}
	
	public ParserRule getNestedRefinementRule() {
		return getNestedRefinementAccess().getRule();
	}
	
	//EclAttributeGroup:
	//	cardinality=Cardinality? CURLY_OPEN refinement=EclAttributeSet CURLY_CLOSE;
	public EclGrammarAccess.EclAttributeGroupElements getEclAttributeGroupAccess() {
		return gaEcl.getEclAttributeGroupAccess();
	}
	
	public ParserRule getEclAttributeGroupRule() {
		return getEclAttributeGroupAccess().getRule();
	}
	
	//EclAttributeSet EclRefinement:
	//	OrAttributeSet;
	public EclGrammarAccess.EclAttributeSetElements getEclAttributeSetAccess() {
		return gaEcl.getEclAttributeSetAccess();
	}
	
	public ParserRule getEclAttributeSetRule() {
		return getEclAttributeSetAccess().getRule();
	}
	
	//OrAttributeSet EclRefinement:
	//	AndAttributeSet ({OrRefinement.left=current} DISJUNCTION right=AndAttributeSet)*;
	public EclGrammarAccess.OrAttributeSetElements getOrAttributeSetAccess() {
		return gaEcl.getOrAttributeSetAccess();
	}
	
	public ParserRule getOrAttributeSetRule() {
		return getOrAttributeSetAccess().getRule();
	}
	
	//AndAttributeSet EclRefinement:
	//	SubAttributeSet ({AndRefinement.left=current} (CONJUNCTION | COMMA) right=SubAttributeSet)*;
	public EclGrammarAccess.AndAttributeSetElements getAndAttributeSetAccess() {
		return gaEcl.getAndAttributeSetAccess();
	}
	
	public ParserRule getAndAttributeSetRule() {
		return getAndAttributeSetAccess().getRule();
	}
	
	//SubAttributeSet EclRefinement:
	//	AttributeConstraint | NestedAttributeSet;
	public EclGrammarAccess.SubAttributeSetElements getSubAttributeSetAccess() {
		return gaEcl.getSubAttributeSetAccess();
	}
	
	public ParserRule getSubAttributeSetRule() {
		return getSubAttributeSetAccess().getRule();
	}
	
	//NestedAttributeSet NestedRefinement:
	//	ROUND_OPEN nested=EclAttributeSet ROUND_CLOSE;
	public EclGrammarAccess.NestedAttributeSetElements getNestedAttributeSetAccess() {
		return gaEcl.getNestedAttributeSetAccess();
	}
	
	public ParserRule getNestedAttributeSetRule() {
		return getNestedAttributeSetAccess().getRule();
	}
	
	//AttributeConstraint:
	//	cardinality=Cardinality? reversed?=REVERSED? attribute=SubExpressionConstraint comparison=Comparison;
	public EclGrammarAccess.AttributeConstraintElements getAttributeConstraintAccess() {
		return gaEcl.getAttributeConstraintAccess();
	}
	
	public ParserRule getAttributeConstraintRule() {
		return getAttributeConstraintAccess().getRule();
	}
	
	//Cardinality:
	//	SQUARE_OPEN min=NonNegativeInteger TO max=MaxValue SQUARE_CLOSE;
	public EclGrammarAccess.CardinalityElements getCardinalityAccess() {
		return gaEcl.getCardinalityAccess();
	}
	
	public ParserRule getCardinalityRule() {
		return getCardinalityAccess().getRule();
	}
	
	//Comparison:
	//	AttributeComparison | DataTypeComparison;
	public EclGrammarAccess.ComparisonElements getComparisonAccess() {
		return gaEcl.getComparisonAccess();
	}
	
	public ParserRule getComparisonRule() {
		return getComparisonAccess().getRule();
	}
	
	//AttributeComparison:
	//	AttributeValueEquals | AttributeValueNotEquals;
	public EclGrammarAccess.AttributeComparisonElements getAttributeComparisonAccess() {
		return gaEcl.getAttributeComparisonAccess();
	}
	
	public ParserRule getAttributeComparisonRule() {
		return getAttributeComparisonAccess().getRule();
	}
	
	//DataTypeComparison:
	//	BooleanValueEquals
	//	| BooleanValueNotEquals
	//	| StringValueEquals
	//	| StringValueNotEquals
	//	| IntegerValueEquals
	//	| IntegerValueNotEquals
	//	| IntegerValueGreaterThan
	//	| IntegerValueGreaterThanEquals
	//	| IntegerValueLessThan
	//	| IntegerValueLessThanEquals
	//	| DecimalValueEquals
	//	| DecimalValueNotEquals
	//	| DecimalValueGreaterThan
	//	| DecimalValueGreaterThanEquals
	//	| DecimalValueLessThan
	//	| DecimalValueLessThanEquals;
	public EclGrammarAccess.DataTypeComparisonElements getDataTypeComparisonAccess() {
		return gaEcl.getDataTypeComparisonAccess();
	}
	
	public ParserRule getDataTypeComparisonRule() {
		return getDataTypeComparisonAccess().getRule();
	}
	
	//AttributeValueEquals:
	//	EQUAL constraint=SubExpressionConstraint;
	public EclGrammarAccess.AttributeValueEqualsElements getAttributeValueEqualsAccess() {
		return gaEcl.getAttributeValueEqualsAccess();
	}
	
	public ParserRule getAttributeValueEqualsRule() {
		return getAttributeValueEqualsAccess().getRule();
	}
	
	//AttributeValueNotEquals:
	//	NOT_EQUAL constraint=SubExpressionConstraint;
	public EclGrammarAccess.AttributeValueNotEqualsElements getAttributeValueNotEqualsAccess() {
		return gaEcl.getAttributeValueNotEqualsAccess();
	}
	
	public ParserRule getAttributeValueNotEqualsRule() {
		return getAttributeValueNotEqualsAccess().getRule();
	}
	
	//BooleanValueEquals:
	//	EQUAL value=Boolean;
	public EclGrammarAccess.BooleanValueEqualsElements getBooleanValueEqualsAccess() {
		return gaEcl.getBooleanValueEqualsAccess();
	}
	
	public ParserRule getBooleanValueEqualsRule() {
		return getBooleanValueEqualsAccess().getRule();
	}
	
	//BooleanValueNotEquals:
	//	NOT_EQUAL value=Boolean;
	public EclGrammarAccess.BooleanValueNotEqualsElements getBooleanValueNotEqualsAccess() {
		return gaEcl.getBooleanValueNotEqualsAccess();
	}
	
	public ParserRule getBooleanValueNotEqualsRule() {
		return getBooleanValueNotEqualsAccess().getRule();
	}
	
	//StringValueEquals:
	//	EQUAL value=STRING;
	public EclGrammarAccess.StringValueEqualsElements getStringValueEqualsAccess() {
		return gaEcl.getStringValueEqualsAccess();
	}
	
	public ParserRule getStringValueEqualsRule() {
		return getStringValueEqualsAccess().getRule();
	}
	
	//StringValueNotEquals:
	//	NOT_EQUAL value=STRING;
	public EclGrammarAccess.StringValueNotEqualsElements getStringValueNotEqualsAccess() {
		return gaEcl.getStringValueNotEqualsAccess();
	}
	
	public ParserRule getStringValueNotEqualsRule() {
		return getStringValueNotEqualsAccess().getRule();
	}
	
	//IntegerValueEquals:
	//	EQUAL HASH value=Integer;
	public EclGrammarAccess.IntegerValueEqualsElements getIntegerValueEqualsAccess() {
		return gaEcl.getIntegerValueEqualsAccess();
	}
	
	public ParserRule getIntegerValueEqualsRule() {
		return getIntegerValueEqualsAccess().getRule();
	}
	
	//IntegerValueNotEquals:
	//	NOT_EQUAL HASH value=Integer;
	public EclGrammarAccess.IntegerValueNotEqualsElements getIntegerValueNotEqualsAccess() {
		return gaEcl.getIntegerValueNotEqualsAccess();
	}
	
	public ParserRule getIntegerValueNotEqualsRule() {
		return getIntegerValueNotEqualsAccess().getRule();
	}
	
	//IntegerValueGreaterThan:
	//	GT HASH value=Integer;
	public EclGrammarAccess.IntegerValueGreaterThanElements getIntegerValueGreaterThanAccess() {
		return gaEcl.getIntegerValueGreaterThanAccess();
	}
	
	public ParserRule getIntegerValueGreaterThanRule() {
		return getIntegerValueGreaterThanAccess().getRule();
	}
	
	//IntegerValueLessThan:
	//	LT HASH value=Integer;
	public EclGrammarAccess.IntegerValueLessThanElements getIntegerValueLessThanAccess() {
		return gaEcl.getIntegerValueLessThanAccess();
	}
	
	public ParserRule getIntegerValueLessThanRule() {
		return getIntegerValueLessThanAccess().getRule();
	}
	
	//IntegerValueGreaterThanEquals:
	//	GTE HASH value=Integer;
	public EclGrammarAccess.IntegerValueGreaterThanEqualsElements getIntegerValueGreaterThanEqualsAccess() {
		return gaEcl.getIntegerValueGreaterThanEqualsAccess();
	}
	
	public ParserRule getIntegerValueGreaterThanEqualsRule() {
		return getIntegerValueGreaterThanEqualsAccess().getRule();
	}
	
	//IntegerValueLessThanEquals:
	//	LTE HASH value=Integer;
	public EclGrammarAccess.IntegerValueLessThanEqualsElements getIntegerValueLessThanEqualsAccess() {
		return gaEcl.getIntegerValueLessThanEqualsAccess();
	}
	
	public ParserRule getIntegerValueLessThanEqualsRule() {
		return getIntegerValueLessThanEqualsAccess().getRule();
	}
	
	//DecimalValueEquals:
	//	EQUAL HASH value=Decimal;
	public EclGrammarAccess.DecimalValueEqualsElements getDecimalValueEqualsAccess() {
		return gaEcl.getDecimalValueEqualsAccess();
	}
	
	public ParserRule getDecimalValueEqualsRule() {
		return getDecimalValueEqualsAccess().getRule();
	}
	
	//DecimalValueNotEquals:
	//	NOT_EQUAL HASH value=Decimal;
	public EclGrammarAccess.DecimalValueNotEqualsElements getDecimalValueNotEqualsAccess() {
		return gaEcl.getDecimalValueNotEqualsAccess();
	}
	
	public ParserRule getDecimalValueNotEqualsRule() {
		return getDecimalValueNotEqualsAccess().getRule();
	}
	
	//DecimalValueGreaterThan:
	//	GT HASH value=Decimal;
	public EclGrammarAccess.DecimalValueGreaterThanElements getDecimalValueGreaterThanAccess() {
		return gaEcl.getDecimalValueGreaterThanAccess();
	}
	
	public ParserRule getDecimalValueGreaterThanRule() {
		return getDecimalValueGreaterThanAccess().getRule();
	}
	
	//DecimalValueLessThan:
	//	LT HASH value=Decimal;
	public EclGrammarAccess.DecimalValueLessThanElements getDecimalValueLessThanAccess() {
		return gaEcl.getDecimalValueLessThanAccess();
	}
	
	public ParserRule getDecimalValueLessThanRule() {
		return getDecimalValueLessThanAccess().getRule();
	}
	
	//DecimalValueGreaterThanEquals:
	//	GTE HASH value=Decimal;
	public EclGrammarAccess.DecimalValueGreaterThanEqualsElements getDecimalValueGreaterThanEqualsAccess() {
		return gaEcl.getDecimalValueGreaterThanEqualsAccess();
	}
	
	public ParserRule getDecimalValueGreaterThanEqualsRule() {
		return getDecimalValueGreaterThanEqualsAccess().getRule();
	}
	
	//DecimalValueLessThanEquals:
	//	LTE HASH value=Decimal;
	public EclGrammarAccess.DecimalValueLessThanEqualsElements getDecimalValueLessThanEqualsAccess() {
		return gaEcl.getDecimalValueLessThanEqualsAccess();
	}
	
	public ParserRule getDecimalValueLessThanEqualsRule() {
		return getDecimalValueLessThanEqualsAccess().getRule();
	}
	
	//NestedExpression:
	//	ROUND_OPEN nested=ExpressionConstraint ROUND_CLOSE;
	public EclGrammarAccess.NestedExpressionElements getNestedExpressionAccess() {
		return gaEcl.getNestedExpressionAccess();
	}
	
	public ParserRule getNestedExpressionRule() {
		return getNestedExpressionAccess().getRule();
	}
	
	//// hidden grammar rules
	//SnomedIdentifier hidden():
	//	DIGIT_NONZERO (DIGIT_NONZERO | ZERO) (DIGIT_NONZERO | ZERO) (DIGIT_NONZERO | ZERO) (DIGIT_NONZERO | ZERO)
	//	(DIGIT_NONZERO | ZERO)+;
	public EclGrammarAccess.SnomedIdentifierElements getSnomedIdentifierAccess() {
		return gaEcl.getSnomedIdentifierAccess();
	}
	
	public ParserRule getSnomedIdentifierRule() {
		return getSnomedIdentifierAccess().getRule();
	}
	
	//NonNegativeInteger ecore::EInt hidden():
	//	ZERO | DIGIT_NONZERO (DIGIT_NONZERO | ZERO)*;
	public EclGrammarAccess.NonNegativeIntegerElements getNonNegativeIntegerAccess() {
		return gaEcl.getNonNegativeIntegerAccess();
	}
	
	public ParserRule getNonNegativeIntegerRule() {
		return getNonNegativeIntegerAccess().getRule();
	}
	
	//MaxValue ecore::EInt hidden():
	//	NonNegativeInteger | WILDCARD;
	public EclGrammarAccess.MaxValueElements getMaxValueAccess() {
		return gaEcl.getMaxValueAccess();
	}
	
	public ParserRule getMaxValueRule() {
		return getMaxValueAccess().getRule();
	}
	
	//Integer ecore::EInt hidden():
	//	(PLUS | DASH)? NonNegativeInteger;
	public EclGrammarAccess.IntegerElements getIntegerAccess() {
		return gaEcl.getIntegerAccess();
	}
	
	public ParserRule getIntegerRule() {
		return getIntegerAccess().getRule();
	}
	
	//Decimal ecore::EBigDecimal hidden():
	//	(PLUS | DASH)? NonNegativeDecimal;
	public EclGrammarAccess.DecimalElements getDecimalAccess() {
		return gaEcl.getDecimalAccess();
	}
	
	public ParserRule getDecimalRule() {
		return getDecimalAccess().getRule();
	}
	
	//NonNegativeDecimal ecore::EBigDecimal hidden():
	//	NonNegativeInteger DOT (DIGIT_NONZERO | ZERO)*;
	public EclGrammarAccess.NonNegativeDecimalElements getNonNegativeDecimalAccess() {
		return gaEcl.getNonNegativeDecimalAccess();
	}
	
	public ParserRule getNonNegativeDecimalRule() {
		return getNonNegativeDecimalAccess().getRule();
	}
	
	//Boolean ecore::EBoolean hidden():
	//	'true' | 'false';
	public EclGrammarAccess.BooleanElements getBooleanAccess() {
		return gaEcl.getBooleanAccess();
	}
	
	public ParserRule getBooleanRule() {
		return getBooleanAccess().getRule();
	}
	
	//terminal TERM_STRING:
	//	"|" !"|"* "|";
	public TerminalRule getTERM_STRINGRule() {
		return gaEcl.getTERM_STRINGRule();
	}
	
	//terminal REVERSED:
	//	'R';
	public TerminalRule getREVERSEDRule() {
		return gaEcl.getREVERSEDRule();
	}
	
	//terminal TO:
	//	'..';
	public TerminalRule getTORule() {
		return gaEcl.getTORule();
	}
	
	//terminal COMMA:
	//	',';
	public TerminalRule getCOMMARule() {
		return gaEcl.getCOMMARule();
	}
	
	//terminal CONJUNCTION:
	//	('a' | 'A') ('n' | 'N') ('d' | 'D');
	public TerminalRule getCONJUNCTIONRule() {
		return gaEcl.getCONJUNCTIONRule();
	}
	
	//terminal DISJUNCTION:
	//	('o' | 'O') ('r' | 'R');
	public TerminalRule getDISJUNCTIONRule() {
		return gaEcl.getDISJUNCTIONRule();
	}
	
	//terminal EXCLUSION:
	//	('m' | 'M') ('i' | 'I') ('n' | 'N') ('u' | 'U') ('s' | 'S');
	public TerminalRule getEXCLUSIONRule() {
		return gaEcl.getEXCLUSIONRule();
	}
	
	//terminal ZERO:
	//	'0';
	public TerminalRule getZERORule() {
		return gaEcl.getZERORule();
	}
	
	//terminal DIGIT_NONZERO:
	//	'1'..'9';
	public TerminalRule getDIGIT_NONZERORule() {
		return gaEcl.getDIGIT_NONZERORule();
	}
	
	//terminal COLON:
	//	':';
	public TerminalRule getCOLONRule() {
		return gaEcl.getCOLONRule();
	}
	
	//terminal CURLY_OPEN:
	//	'{';
	public TerminalRule getCURLY_OPENRule() {
		return gaEcl.getCURLY_OPENRule();
	}
	
	//terminal CURLY_CLOSE:
	//	'}';
	public TerminalRule getCURLY_CLOSERule() {
		return gaEcl.getCURLY_CLOSERule();
	}
	
	//terminal ROUND_OPEN:
	//	'(';
	public TerminalRule getROUND_OPENRule() {
		return gaEcl.getROUND_OPENRule();
	}
	
	//terminal ROUND_CLOSE:
	//	')';
	public TerminalRule getROUND_CLOSERule() {
		return gaEcl.getROUND_CLOSERule();
	}
	
	//terminal SQUARE_OPEN:
	//	'[';
	public TerminalRule getSQUARE_OPENRule() {
		return gaEcl.getSQUARE_OPENRule();
	}
	
	//terminal SQUARE_CLOSE:
	//	']';
	public TerminalRule getSQUARE_CLOSERule() {
		return gaEcl.getSQUARE_CLOSERule();
	}
	
	//terminal PLUS:
	//	'+';
	public TerminalRule getPLUSRule() {
		return gaEcl.getPLUSRule();
	}
	
	//terminal DASH:
	//	'-';
	public TerminalRule getDASHRule() {
		return gaEcl.getDASHRule();
	}
	
	//terminal CARET:
	//	'^';
	public TerminalRule getCARETRule() {
		return gaEcl.getCARETRule();
	}
	
	//terminal DOT:
	//	'.';
	public TerminalRule getDOTRule() {
		return gaEcl.getDOTRule();
	}
	
	//terminal WILDCARD:
	//	'*';
	public TerminalRule getWILDCARDRule() {
		return gaEcl.getWILDCARDRule();
	}
	
	//terminal EQUAL:
	//	'=';
	public TerminalRule getEQUALRule() {
		return gaEcl.getEQUALRule();
	}
	
	//terminal NOT_EQUAL:
	//	'!=';
	public TerminalRule getNOT_EQUALRule() {
		return gaEcl.getNOT_EQUALRule();
	}
	
	//terminal LT:
	//	'<';
	public TerminalRule getLTRule() {
		return gaEcl.getLTRule();
	}
	
	//terminal GT:
	//	'>';
	public TerminalRule getGTRule() {
		return gaEcl.getGTRule();
	}
	
	//terminal DBL_LT:
	//	'<<';
	public TerminalRule getDBL_LTRule() {
		return gaEcl.getDBL_LTRule();
	}
	
	//terminal DBL_GT:
	//	'>>';
	public TerminalRule getDBL_GTRule() {
		return gaEcl.getDBL_GTRule();
	}
	
	//terminal LT_EM:
	//	'<!';
	public TerminalRule getLT_EMRule() {
		return gaEcl.getLT_EMRule();
	}
	
	//terminal DBL_LT_EM:
	//	'<<!';
	public TerminalRule getDBL_LT_EMRule() {
		return gaEcl.getDBL_LT_EMRule();
	}
	
	//terminal GT_EM:
	//	'>!';
	public TerminalRule getGT_EMRule() {
		return gaEcl.getGT_EMRule();
	}
	
	//terminal DBL_GT_EM:
	//	'>>!';
	public TerminalRule getDBL_GT_EMRule() {
		return gaEcl.getDBL_GT_EMRule();
	}
	
	//terminal GTE:
	//	'>=';
	public TerminalRule getGTERule() {
		return gaEcl.getGTERule();
	}
	
	//terminal LTE:
	//	'<=';
	public TerminalRule getLTERule() {
		return gaEcl.getLTERule();
	}
	
	//terminal HASH:
	//	'#';
	public TerminalRule getHASHRule() {
		return gaEcl.getHASHRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\n' | '\r';
	public TerminalRule getWSRule() {
		return gaEcl.getWSRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaEcl.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaEcl.getSL_COMMENTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaEcl.getSTRINGRule();
	}
}
