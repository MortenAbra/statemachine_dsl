/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration
import syntaxHighlighting.StateMachineHighlighting
import syntaxHighlighting.StateMachineSemanticHighligther
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider
import hover.StateMachineHoverProvider

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class StateMachineUiModule extends AbstractStateMachineUiModule {
	
	def Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration(){
		StateMachineHighlighting;
	}
	
	def Class<? extends DefaultSemanticHighlightingCalculator> bindISemanticHighlightingCalculator(){
		StateMachineSemanticHighligther;
	}
	
	def Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider(){
		StateMachineHoverProvider;
	}
}
