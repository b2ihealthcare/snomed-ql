/*
 * Copyright 2021 B2i Healthcare Pte Ltd, http://b2i.sg
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
package com.b2international.snomed.ql.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#content-assist
 * on how to customize the content assistant.
 */
public class QLProposalProvider extends AbstractQLProposalProvider {

	@Override
	protected String getKeywordExplanation(String keyword) {
		switch (keyword) {
		case "active": return "Active Filter";
		case "acceptableIn": return "Acceptable in language reference set";
		case "preferredIn": return "Preferred in language reference set";
		case "languageRefSetId": return "Present in language reference set";
		case "moduleId": return "Module Filter";
		case "typeId": return "Type Filter";
		case "term": return "Term Filter";
		case "caseSignificanceId": return "Case Significance Filter";
		case "languageCode": return "Language Code Filter";
		case "exact": return "Matches descriptions where the term is an exact match";
		case "match": return "Matches descriptions where the term matches all specified words and/or prefixes";
		case "regex": return "Matches descriptions where the term matches the given regular expression";
		case "Concept": return "Apply filter on concepts (default domain)";
		case "Description": return "Apply filter on descriptions";
		default: return super.getKeywordExplanation(keyword);
		}
	}
	
	@Override
	public void complete_OPEN_DOUBLE_BRACES(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Open Domain refinement", acceptor);
	}
	
	@Override
	public void complete_CLOSE_DOUBLE_BRACES(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Close Domain refinement", acceptor);
	}
	
	@Override
	public void complete_Boolean(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Boolean value", acceptor);
	}
	
}
