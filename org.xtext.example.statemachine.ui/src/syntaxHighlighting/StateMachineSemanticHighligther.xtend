package syntaxHighlighting

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.xtext.example.mydsl.stateMachine.State
import org.xtext.example.mydsl.stateMachine.StateMachinePackage
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.xtext.example.mydsl.stateMachine.Move
import org.xtext.example.mydsl.stateMachine.Event
import org.xtext.example.mydsl.stateMachine.Gate
import org.xtext.example.mydsl.stateMachine.Block

class StateMachineSemanticHighligther extends DefaultSemanticHighlightingCalculator {
	
	override doProvideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
	  
	  	//
		var rootObject = resource.getParseResult().getRootASTElement();
		  
		for (State ext : EcoreUtil2.getAllContentsOfType(rootObject, State)){  
			for (INode node : NodeModelUtils.findNodesForFeature(ext, StateMachinePackage.Literals.STATE__NAME)){
				acceptor.addPosition(node.getOffset(), node.getLength(), StateMachineHighlighting.STATE_NAME_ID)
			} 
		}   
		
		for (Move ext : EcoreUtil2.getAllContentsOfType(rootObject, Move)){  
			for (INode node : NodeModelUtils.findNodesForFeature(ext, StateMachinePackage.Literals.MOVE__STATE)){
				acceptor.addPosition(node.getOffset(), node.getLength(), StateMachineHighlighting.STATE_MOVE_ID)
			} 
		} 
		
		for (Event ext : EcoreUtil2.getAllContentsOfType(rootObject, Event)){  
			for (INode node : NodeModelUtils.findNodesForFeature(ext, StateMachinePackage.Literals.EVENT__NAME)){
				acceptor.addPosition(node.getOffset(), node.getLength(), StateMachineHighlighting.EVENT_NAME_ID)
			} 
		}
		
		for (Move ext : EcoreUtil2.getAllContentsOfType(rootObject, Move)){  
			for (INode node : NodeModelUtils.findNodesForFeature(ext, StateMachinePackage.Literals.MOVE__EVENT)){
				acceptor.addPosition(node.getOffset(), node.getLength(), StateMachineHighlighting.EVENT_MOVE_ID)
			} 
		}
		for (Event ext : EcoreUtil2.getAllContentsOfType(rootObject, Event)){  
			for (INode node : NodeModelUtils.findNodesForFeature(ext, StateMachinePackage.Literals.STATE_MACHINE__EVENT_RESET)){
				acceptor.addPosition(node.getOffset(), node.getLength(), StateMachineHighlighting.RESET_EVENT_ID)
			} 
		}
		
		for (Block ext : EcoreUtil2.getAllContentsOfType(rootObject, Block)){  
			for (INode node : NodeModelUtils.findNodesForFeature(ext, StateMachinePackage.Literals.BLOCK__STATE)){
				acceptor.addPosition(node.getOffset(), node.getLength(), StateMachineHighlighting.STATE_NAME_BLOCK)
			} 
		}
		  
		
		super.doProvideHighlightingFor(resource, acceptor);
	}
	
}