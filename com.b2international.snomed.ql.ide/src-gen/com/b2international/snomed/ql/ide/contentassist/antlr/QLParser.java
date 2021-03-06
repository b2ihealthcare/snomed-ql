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
package com.b2international.snomed.ql.ide.contentassist.antlr;

import com.b2international.snomed.ql.ide.contentassist.antlr.internal.InternalQLParser;
import com.b2international.snomed.ql.services.QLGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class QLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(QLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, QLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getQueryConjunctionAccess().getAlternatives_1_1(), "rule__QueryConjunction__Alternatives_1_1");
			builder.put(grammarAccess.getSubQueryAccess().getAlternatives(), "rule__SubQuery__Alternatives");
			builder.put(grammarAccess.getConjunctionFilterAccess().getAlternatives_1_1(), "rule__ConjunctionFilter__Alternatives_1_1");
			builder.put(grammarAccess.getPropertyFilterAccess().getAlternatives(), "rule__PropertyFilter__Alternatives");
			builder.put(grammarAccess.getAndExpressionConstraintAccess().getAlternatives_1_1(), "rule__AndExpressionConstraint__Alternatives_1_1");
			builder.put(grammarAccess.getSubExpressionConstraintAccess().getAlternatives(), "rule__SubExpressionConstraint__Alternatives");
			builder.put(grammarAccess.getEclFocusConceptAccess().getAlternatives(), "rule__EclFocusConcept__Alternatives");
			builder.put(grammarAccess.getMemberOfAccess().getConstraintAlternatives_1_0(), "rule__MemberOf__ConstraintAlternatives_1_0");
			builder.put(grammarAccess.getAndRefinementAccess().getAlternatives_1_0_1(), "rule__AndRefinement__Alternatives_1_0_1");
			builder.put(grammarAccess.getSubRefinementAccess().getAlternatives(), "rule__SubRefinement__Alternatives");
			builder.put(grammarAccess.getAndAttributeSetAccess().getAlternatives_1_1(), "rule__AndAttributeSet__Alternatives_1_1");
			builder.put(grammarAccess.getSubAttributeSetAccess().getAlternatives(), "rule__SubAttributeSet__Alternatives");
			builder.put(grammarAccess.getComparisonAccess().getAlternatives(), "rule__Comparison__Alternatives");
			builder.put(grammarAccess.getAttributeComparisonAccess().getAlternatives(), "rule__AttributeComparison__Alternatives");
			builder.put(grammarAccess.getDataTypeComparisonAccess().getAlternatives(), "rule__DataTypeComparison__Alternatives");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getAlternatives_1(), "rule__SnomedIdentifier__Alternatives_1");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getAlternatives_2(), "rule__SnomedIdentifier__Alternatives_2");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getAlternatives_3(), "rule__SnomedIdentifier__Alternatives_3");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getAlternatives_4(), "rule__SnomedIdentifier__Alternatives_4");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5(), "rule__SnomedIdentifier__Alternatives_5");
			builder.put(grammarAccess.getNonNegativeIntegerAccess().getAlternatives(), "rule__NonNegativeInteger__Alternatives");
			builder.put(grammarAccess.getNonNegativeIntegerAccess().getAlternatives_1_1(), "rule__NonNegativeInteger__Alternatives_1_1");
			builder.put(grammarAccess.getMaxValueAccess().getAlternatives(), "rule__MaxValue__Alternatives");
			builder.put(grammarAccess.getIntegerAccess().getAlternatives_0(), "rule__Integer__Alternatives_0");
			builder.put(grammarAccess.getDecimalAccess().getAlternatives_0(), "rule__Decimal__Alternatives_0");
			builder.put(grammarAccess.getNonNegativeDecimalAccess().getAlternatives_2(), "rule__NonNegativeDecimal__Alternatives_2");
			builder.put(grammarAccess.getBooleanAccess().getAlternatives(), "rule__Boolean__Alternatives");
			builder.put(grammarAccess.getLexicalSearchTypeAccess().getAlternatives(), "rule__LexicalSearchType__Alternatives");
			builder.put(grammarAccess.getDomainAccess().getAlternatives(), "rule__Domain__Alternatives");
			builder.put(grammarAccess.getQueryAccess().getGroup(), "rule__Query__Group__0");
			builder.put(grammarAccess.getQueryDisjunctionAccess().getGroup(), "rule__QueryDisjunction__Group__0");
			builder.put(grammarAccess.getQueryDisjunctionAccess().getGroup_1(), "rule__QueryDisjunction__Group_1__0");
			builder.put(grammarAccess.getQueryConjunctionAccess().getGroup(), "rule__QueryConjunction__Group__0");
			builder.put(grammarAccess.getQueryConjunctionAccess().getGroup_1(), "rule__QueryConjunction__Group_1__0");
			builder.put(grammarAccess.getQueryExclusionAccess().getGroup(), "rule__QueryExclusion__Group__0");
			builder.put(grammarAccess.getQueryExclusionAccess().getGroup_1(), "rule__QueryExclusion__Group_1__0");
			builder.put(grammarAccess.getDomainQueryAccess().getGroup(), "rule__DomainQuery__Group__0");
			builder.put(grammarAccess.getDomainQueryAccess().getGroup_2(), "rule__DomainQuery__Group_2__0");
			builder.put(grammarAccess.getNestedQueryAccess().getGroup(), "rule__NestedQuery__Group__0");
			builder.put(grammarAccess.getDisjunctionFilterAccess().getGroup(), "rule__DisjunctionFilter__Group__0");
			builder.put(grammarAccess.getDisjunctionFilterAccess().getGroup_1(), "rule__DisjunctionFilter__Group_1__0");
			builder.put(grammarAccess.getConjunctionFilterAccess().getGroup(), "rule__ConjunctionFilter__Group__0");
			builder.put(grammarAccess.getConjunctionFilterAccess().getGroup_1(), "rule__ConjunctionFilter__Group_1__0");
			builder.put(grammarAccess.getExclusionFilterAccess().getGroup(), "rule__ExclusionFilter__Group__0");
			builder.put(grammarAccess.getExclusionFilterAccess().getGroup_1(), "rule__ExclusionFilter__Group_1__0");
			builder.put(grammarAccess.getNestedFilterAccess().getGroup(), "rule__NestedFilter__Group__0");
			builder.put(grammarAccess.getActiveFilterAccess().getGroup(), "rule__ActiveFilter__Group__0");
			builder.put(grammarAccess.getActiveFilterAccess().getGroup_0(), "rule__ActiveFilter__Group_0__0");
			builder.put(grammarAccess.getModuleFilterAccess().getGroup(), "rule__ModuleFilter__Group__0");
			builder.put(grammarAccess.getModuleFilterAccess().getGroup_0(), "rule__ModuleFilter__Group_0__0");
			builder.put(grammarAccess.getTermFilterAccess().getGroup(), "rule__TermFilter__Group__0");
			builder.put(grammarAccess.getTermFilterAccess().getGroup_2(), "rule__TermFilter__Group_2__0");
			builder.put(grammarAccess.getPreferredInFilterAccess().getGroup(), "rule__PreferredInFilter__Group__0");
			builder.put(grammarAccess.getAcceptableInFilterAccess().getGroup(), "rule__AcceptableInFilter__Group__0");
			builder.put(grammarAccess.getLanguageRefSetFilterAccess().getGroup(), "rule__LanguageRefSetFilter__Group__0");
			builder.put(grammarAccess.getTypeFilterAccess().getGroup(), "rule__TypeFilter__Group__0");
			builder.put(grammarAccess.getCaseSignificanceFilterAccess().getGroup(), "rule__CaseSignificanceFilter__Group__0");
			builder.put(grammarAccess.getLanguageCodeFilterAccess().getGroup(), "rule__LanguageCodeFilter__Group__0");
			builder.put(grammarAccess.getScriptAccess().getGroup(), "rule__Script__Group__0");
			builder.put(grammarAccess.getOrExpressionConstraintAccess().getGroup(), "rule__OrExpressionConstraint__Group__0");
			builder.put(grammarAccess.getOrExpressionConstraintAccess().getGroup_1(), "rule__OrExpressionConstraint__Group_1__0");
			builder.put(grammarAccess.getAndExpressionConstraintAccess().getGroup(), "rule__AndExpressionConstraint__Group__0");
			builder.put(grammarAccess.getAndExpressionConstraintAccess().getGroup_1(), "rule__AndExpressionConstraint__Group_1__0");
			builder.put(grammarAccess.getExclusionExpressionConstraintAccess().getGroup(), "rule__ExclusionExpressionConstraint__Group__0");
			builder.put(grammarAccess.getExclusionExpressionConstraintAccess().getGroup_1(), "rule__ExclusionExpressionConstraint__Group_1__0");
			builder.put(grammarAccess.getRefinedExpressionConstraintAccess().getGroup(), "rule__RefinedExpressionConstraint__Group__0");
			builder.put(grammarAccess.getRefinedExpressionConstraintAccess().getGroup_1(), "rule__RefinedExpressionConstraint__Group_1__0");
			builder.put(grammarAccess.getDottedExpressionConstraintAccess().getGroup(), "rule__DottedExpressionConstraint__Group__0");
			builder.put(grammarAccess.getDottedExpressionConstraintAccess().getGroup_1(), "rule__DottedExpressionConstraint__Group_1__0");
			builder.put(grammarAccess.getChildOfAccess().getGroup(), "rule__ChildOf__Group__0");
			builder.put(grammarAccess.getChildOrSelfOfAccess().getGroup(), "rule__ChildOrSelfOf__Group__0");
			builder.put(grammarAccess.getDescendantOfAccess().getGroup(), "rule__DescendantOf__Group__0");
			builder.put(grammarAccess.getDescendantOrSelfOfAccess().getGroup(), "rule__DescendantOrSelfOf__Group__0");
			builder.put(grammarAccess.getParentOfAccess().getGroup(), "rule__ParentOf__Group__0");
			builder.put(grammarAccess.getParentOrSelfOfAccess().getGroup(), "rule__ParentOrSelfOf__Group__0");
			builder.put(grammarAccess.getAncestorOfAccess().getGroup(), "rule__AncestorOf__Group__0");
			builder.put(grammarAccess.getAncestorOrSelfOfAccess().getGroup(), "rule__AncestorOrSelfOf__Group__0");
			builder.put(grammarAccess.getMemberOfAccess().getGroup(), "rule__MemberOf__Group__0");
			builder.put(grammarAccess.getEclConceptReferenceAccess().getGroup(), "rule__EclConceptReference__Group__0");
			builder.put(grammarAccess.getAnyAccess().getGroup(), "rule__Any__Group__0");
			builder.put(grammarAccess.getOrRefinementAccess().getGroup(), "rule__OrRefinement__Group__0");
			builder.put(grammarAccess.getOrRefinementAccess().getGroup_1(), "rule__OrRefinement__Group_1__0");
			builder.put(grammarAccess.getOrRefinementAccess().getGroup_1_0(), "rule__OrRefinement__Group_1_0__0");
			builder.put(grammarAccess.getAndRefinementAccess().getGroup(), "rule__AndRefinement__Group__0");
			builder.put(grammarAccess.getAndRefinementAccess().getGroup_1(), "rule__AndRefinement__Group_1__0");
			builder.put(grammarAccess.getAndRefinementAccess().getGroup_1_0(), "rule__AndRefinement__Group_1_0__0");
			builder.put(grammarAccess.getNestedRefinementAccess().getGroup(), "rule__NestedRefinement__Group__0");
			builder.put(grammarAccess.getEclAttributeGroupAccess().getGroup(), "rule__EclAttributeGroup__Group__0");
			builder.put(grammarAccess.getOrAttributeSetAccess().getGroup(), "rule__OrAttributeSet__Group__0");
			builder.put(grammarAccess.getOrAttributeSetAccess().getGroup_1(), "rule__OrAttributeSet__Group_1__0");
			builder.put(grammarAccess.getAndAttributeSetAccess().getGroup(), "rule__AndAttributeSet__Group__0");
			builder.put(grammarAccess.getAndAttributeSetAccess().getGroup_1(), "rule__AndAttributeSet__Group_1__0");
			builder.put(grammarAccess.getNestedAttributeSetAccess().getGroup(), "rule__NestedAttributeSet__Group__0");
			builder.put(grammarAccess.getAttributeConstraintAccess().getGroup(), "rule__AttributeConstraint__Group__0");
			builder.put(grammarAccess.getCardinalityAccess().getGroup(), "rule__Cardinality__Group__0");
			builder.put(grammarAccess.getAttributeValueEqualsAccess().getGroup(), "rule__AttributeValueEquals__Group__0");
			builder.put(grammarAccess.getAttributeValueNotEqualsAccess().getGroup(), "rule__AttributeValueNotEquals__Group__0");
			builder.put(grammarAccess.getBooleanValueEqualsAccess().getGroup(), "rule__BooleanValueEquals__Group__0");
			builder.put(grammarAccess.getBooleanValueNotEqualsAccess().getGroup(), "rule__BooleanValueNotEquals__Group__0");
			builder.put(grammarAccess.getStringValueEqualsAccess().getGroup(), "rule__StringValueEquals__Group__0");
			builder.put(grammarAccess.getStringValueNotEqualsAccess().getGroup(), "rule__StringValueNotEquals__Group__0");
			builder.put(grammarAccess.getIntegerValueEqualsAccess().getGroup(), "rule__IntegerValueEquals__Group__0");
			builder.put(grammarAccess.getIntegerValueNotEqualsAccess().getGroup(), "rule__IntegerValueNotEquals__Group__0");
			builder.put(grammarAccess.getIntegerValueGreaterThanAccess().getGroup(), "rule__IntegerValueGreaterThan__Group__0");
			builder.put(grammarAccess.getIntegerValueLessThanAccess().getGroup(), "rule__IntegerValueLessThan__Group__0");
			builder.put(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getGroup(), "rule__IntegerValueGreaterThanEquals__Group__0");
			builder.put(grammarAccess.getIntegerValueLessThanEqualsAccess().getGroup(), "rule__IntegerValueLessThanEquals__Group__0");
			builder.put(grammarAccess.getDecimalValueEqualsAccess().getGroup(), "rule__DecimalValueEquals__Group__0");
			builder.put(grammarAccess.getDecimalValueNotEqualsAccess().getGroup(), "rule__DecimalValueNotEquals__Group__0");
			builder.put(grammarAccess.getDecimalValueGreaterThanAccess().getGroup(), "rule__DecimalValueGreaterThan__Group__0");
			builder.put(grammarAccess.getDecimalValueLessThanAccess().getGroup(), "rule__DecimalValueLessThan__Group__0");
			builder.put(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getGroup(), "rule__DecimalValueGreaterThanEquals__Group__0");
			builder.put(grammarAccess.getDecimalValueLessThanEqualsAccess().getGroup(), "rule__DecimalValueLessThanEquals__Group__0");
			builder.put(grammarAccess.getNestedExpressionAccess().getGroup(), "rule__NestedExpression__Group__0");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getGroup(), "rule__SnomedIdentifier__Group__0");
			builder.put(grammarAccess.getNonNegativeIntegerAccess().getGroup_1(), "rule__NonNegativeInteger__Group_1__0");
			builder.put(grammarAccess.getIntegerAccess().getGroup(), "rule__Integer__Group__0");
			builder.put(grammarAccess.getDecimalAccess().getGroup(), "rule__Decimal__Group__0");
			builder.put(grammarAccess.getNonNegativeDecimalAccess().getGroup(), "rule__NonNegativeDecimal__Group__0");
			builder.put(grammarAccess.getQueryAccess().getQueryAssignment_1(), "rule__Query__QueryAssignment_1");
			builder.put(grammarAccess.getQueryDisjunctionAccess().getRightAssignment_1_2(), "rule__QueryDisjunction__RightAssignment_1_2");
			builder.put(grammarAccess.getQueryConjunctionAccess().getRightAssignment_1_2(), "rule__QueryConjunction__RightAssignment_1_2");
			builder.put(grammarAccess.getQueryExclusionAccess().getRightAssignment_1_2(), "rule__QueryExclusion__RightAssignment_1_2");
			builder.put(grammarAccess.getDomainQueryAccess().getEclAssignment_1(), "rule__DomainQuery__EclAssignment_1");
			builder.put(grammarAccess.getDomainQueryAccess().getFilterAssignment_2_1(), "rule__DomainQuery__FilterAssignment_2_1");
			builder.put(grammarAccess.getNestedQueryAccess().getNestedAssignment_1(), "rule__NestedQuery__NestedAssignment_1");
			builder.put(grammarAccess.getDisjunctionFilterAccess().getRightAssignment_1_2(), "rule__DisjunctionFilter__RightAssignment_1_2");
			builder.put(grammarAccess.getConjunctionFilterAccess().getRightAssignment_1_2(), "rule__ConjunctionFilter__RightAssignment_1_2");
			builder.put(grammarAccess.getExclusionFilterAccess().getRightAssignment_1_2(), "rule__ExclusionFilter__RightAssignment_1_2");
			builder.put(grammarAccess.getNestedFilterAccess().getNestedAssignment_1(), "rule__NestedFilter__NestedAssignment_1");
			builder.put(grammarAccess.getActiveFilterAccess().getDomainAssignment_0_0(), "rule__ActiveFilter__DomainAssignment_0_0");
			builder.put(grammarAccess.getActiveFilterAccess().getActiveAssignment_3(), "rule__ActiveFilter__ActiveAssignment_3");
			builder.put(grammarAccess.getModuleFilterAccess().getDomainAssignment_0_0(), "rule__ModuleFilter__DomainAssignment_0_0");
			builder.put(grammarAccess.getModuleFilterAccess().getModuleIdAssignment_3(), "rule__ModuleFilter__ModuleIdAssignment_3");
			builder.put(grammarAccess.getTermFilterAccess().getLexicalSearchTypeAssignment_2_0(), "rule__TermFilter__LexicalSearchTypeAssignment_2_0");
			builder.put(grammarAccess.getTermFilterAccess().getTermAssignment_3(), "rule__TermFilter__TermAssignment_3");
			builder.put(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdAssignment_2(), "rule__PreferredInFilter__LanguageRefSetIdAssignment_2");
			builder.put(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdAssignment_2(), "rule__AcceptableInFilter__LanguageRefSetIdAssignment_2");
			builder.put(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdAssignment_2(), "rule__LanguageRefSetFilter__LanguageRefSetIdAssignment_2");
			builder.put(grammarAccess.getTypeFilterAccess().getTypeAssignment_2(), "rule__TypeFilter__TypeAssignment_2");
			builder.put(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdAssignment_2(), "rule__CaseSignificanceFilter__CaseSignificanceIdAssignment_2");
			builder.put(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodeAssignment_2(), "rule__LanguageCodeFilter__LanguageCodeAssignment_2");
			builder.put(grammarAccess.getScriptAccess().getConstraintAssignment_1(), "rule__Script__ConstraintAssignment_1");
			builder.put(grammarAccess.getOrExpressionConstraintAccess().getRightAssignment_1_2(), "rule__OrExpressionConstraint__RightAssignment_1_2");
			builder.put(grammarAccess.getAndExpressionConstraintAccess().getRightAssignment_1_2(), "rule__AndExpressionConstraint__RightAssignment_1_2");
			builder.put(grammarAccess.getExclusionExpressionConstraintAccess().getRightAssignment_1_2(), "rule__ExclusionExpressionConstraint__RightAssignment_1_2");
			builder.put(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementAssignment_1_2(), "rule__RefinedExpressionConstraint__RefinementAssignment_1_2");
			builder.put(grammarAccess.getDottedExpressionConstraintAccess().getAttributeAssignment_1_2(), "rule__DottedExpressionConstraint__AttributeAssignment_1_2");
			builder.put(grammarAccess.getChildOfAccess().getConstraintAssignment_1(), "rule__ChildOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getChildOrSelfOfAccess().getConstraintAssignment_1(), "rule__ChildOrSelfOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getDescendantOfAccess().getConstraintAssignment_1(), "rule__DescendantOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getDescendantOrSelfOfAccess().getConstraintAssignment_1(), "rule__DescendantOrSelfOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getParentOfAccess().getConstraintAssignment_1(), "rule__ParentOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getParentOrSelfOfAccess().getConstraintAssignment_1(), "rule__ParentOrSelfOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getAncestorOfAccess().getConstraintAssignment_1(), "rule__AncestorOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getAncestorOrSelfOfAccess().getConstraintAssignment_1(), "rule__AncestorOrSelfOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getMemberOfAccess().getConstraintAssignment_1(), "rule__MemberOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getEclConceptReferenceAccess().getIdAssignment_0(), "rule__EclConceptReference__IdAssignment_0");
			builder.put(grammarAccess.getEclConceptReferenceAccess().getTermAssignment_1(), "rule__EclConceptReference__TermAssignment_1");
			builder.put(grammarAccess.getOrRefinementAccess().getRightAssignment_1_0_2(), "rule__OrRefinement__RightAssignment_1_0_2");
			builder.put(grammarAccess.getAndRefinementAccess().getRightAssignment_1_0_2(), "rule__AndRefinement__RightAssignment_1_0_2");
			builder.put(grammarAccess.getNestedRefinementAccess().getNestedAssignment_1(), "rule__NestedRefinement__NestedAssignment_1");
			builder.put(grammarAccess.getEclAttributeGroupAccess().getCardinalityAssignment_0(), "rule__EclAttributeGroup__CardinalityAssignment_0");
			builder.put(grammarAccess.getEclAttributeGroupAccess().getRefinementAssignment_2(), "rule__EclAttributeGroup__RefinementAssignment_2");
			builder.put(grammarAccess.getOrAttributeSetAccess().getRightAssignment_1_2(), "rule__OrAttributeSet__RightAssignment_1_2");
			builder.put(grammarAccess.getAndAttributeSetAccess().getRightAssignment_1_2(), "rule__AndAttributeSet__RightAssignment_1_2");
			builder.put(grammarAccess.getNestedAttributeSetAccess().getNestedAssignment_1(), "rule__NestedAttributeSet__NestedAssignment_1");
			builder.put(grammarAccess.getAttributeConstraintAccess().getCardinalityAssignment_0(), "rule__AttributeConstraint__CardinalityAssignment_0");
			builder.put(grammarAccess.getAttributeConstraintAccess().getReversedAssignment_1(), "rule__AttributeConstraint__ReversedAssignment_1");
			builder.put(grammarAccess.getAttributeConstraintAccess().getAttributeAssignment_2(), "rule__AttributeConstraint__AttributeAssignment_2");
			builder.put(grammarAccess.getAttributeConstraintAccess().getComparisonAssignment_3(), "rule__AttributeConstraint__ComparisonAssignment_3");
			builder.put(grammarAccess.getCardinalityAccess().getMinAssignment_1(), "rule__Cardinality__MinAssignment_1");
			builder.put(grammarAccess.getCardinalityAccess().getMaxAssignment_3(), "rule__Cardinality__MaxAssignment_3");
			builder.put(grammarAccess.getAttributeValueEqualsAccess().getConstraintAssignment_1(), "rule__AttributeValueEquals__ConstraintAssignment_1");
			builder.put(grammarAccess.getAttributeValueNotEqualsAccess().getConstraintAssignment_1(), "rule__AttributeValueNotEquals__ConstraintAssignment_1");
			builder.put(grammarAccess.getBooleanValueEqualsAccess().getValueAssignment_1(), "rule__BooleanValueEquals__ValueAssignment_1");
			builder.put(grammarAccess.getBooleanValueNotEqualsAccess().getValueAssignment_1(), "rule__BooleanValueNotEquals__ValueAssignment_1");
			builder.put(grammarAccess.getStringValueEqualsAccess().getValueAssignment_1(), "rule__StringValueEquals__ValueAssignment_1");
			builder.put(grammarAccess.getStringValueNotEqualsAccess().getValueAssignment_1(), "rule__StringValueNotEquals__ValueAssignment_1");
			builder.put(grammarAccess.getIntegerValueEqualsAccess().getValueAssignment_2(), "rule__IntegerValueEquals__ValueAssignment_2");
			builder.put(grammarAccess.getIntegerValueNotEqualsAccess().getValueAssignment_2(), "rule__IntegerValueNotEquals__ValueAssignment_2");
			builder.put(grammarAccess.getIntegerValueGreaterThanAccess().getValueAssignment_2(), "rule__IntegerValueGreaterThan__ValueAssignment_2");
			builder.put(grammarAccess.getIntegerValueLessThanAccess().getValueAssignment_2(), "rule__IntegerValueLessThan__ValueAssignment_2");
			builder.put(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getValueAssignment_2(), "rule__IntegerValueGreaterThanEquals__ValueAssignment_2");
			builder.put(grammarAccess.getIntegerValueLessThanEqualsAccess().getValueAssignment_2(), "rule__IntegerValueLessThanEquals__ValueAssignment_2");
			builder.put(grammarAccess.getDecimalValueEqualsAccess().getValueAssignment_2(), "rule__DecimalValueEquals__ValueAssignment_2");
			builder.put(grammarAccess.getDecimalValueNotEqualsAccess().getValueAssignment_2(), "rule__DecimalValueNotEquals__ValueAssignment_2");
			builder.put(grammarAccess.getDecimalValueGreaterThanAccess().getValueAssignment_2(), "rule__DecimalValueGreaterThan__ValueAssignment_2");
			builder.put(grammarAccess.getDecimalValueLessThanAccess().getValueAssignment_2(), "rule__DecimalValueLessThan__ValueAssignment_2");
			builder.put(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getValueAssignment_2(), "rule__DecimalValueGreaterThanEquals__ValueAssignment_2");
			builder.put(grammarAccess.getDecimalValueLessThanEqualsAccess().getValueAssignment_2(), "rule__DecimalValueLessThanEquals__ValueAssignment_2");
			builder.put(grammarAccess.getNestedExpressionAccess().getNestedAssignment_1(), "rule__NestedExpression__NestedAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private QLGrammarAccess grammarAccess;

	@Override
	protected InternalQLParser createParser() {
		InternalQLParser result = new InternalQLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public QLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(QLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
