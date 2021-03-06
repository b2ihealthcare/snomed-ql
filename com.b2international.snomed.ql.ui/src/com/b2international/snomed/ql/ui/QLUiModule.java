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
package com.b2international.snomed.ql.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;

import com.b2international.snomed.ecl.ui.EclUiValidator;
import com.b2international.snomed.ecl.ui.contentassist.SnomedConceptTemplateProposalProvider;
import com.b2international.snomed.ecl.ui.highlighting.EclHighlightingConfiguration;
import com.b2international.snomed.ecl.validation.EclValidator;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
public class QLUiModule extends AbstractQLUiModule {

	public QLUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	/**
	 * Manually added to register the template proposal provider.
	 */
	@Override
	public Class<? extends ITemplateProposalProvider> bindITemplateProposalProvider() {
		return SnomedConceptTemplateProposalProvider.class;
	}
	
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return EclHighlightingConfiguration.class;
	}
	
	public Class<? extends EclValidator> bindEclValidator() {
		return EclUiValidator.class;
	}
	
}
