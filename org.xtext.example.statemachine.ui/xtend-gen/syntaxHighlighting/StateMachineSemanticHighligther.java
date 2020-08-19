package syntaxHighlighting;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.xtext.example.mydsl.stateMachine.Event;
import org.xtext.example.mydsl.stateMachine.Move;
import org.xtext.example.mydsl.stateMachine.State;
import org.xtext.example.mydsl.stateMachine.StateMachinePackage;
import syntaxHighlighting.StateMachineHighlighting;

@SuppressWarnings("all")
public class StateMachineSemanticHighligther extends DefaultSemanticHighlightingCalculator {
  @Override
  public void doProvideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor) {
    EObject rootObject = resource.getParseResult().getRootASTElement();
    List<State> _allContentsOfType = EcoreUtil2.<State>getAllContentsOfType(rootObject, State.class);
    for (final State ext : _allContentsOfType) {
      List<INode> _findNodesForFeature = NodeModelUtils.findNodesForFeature(ext, StateMachinePackage.Literals.STATE__NAME);
      for (final INode node : _findNodesForFeature) {
        acceptor.addPosition(node.getOffset(), node.getLength(), StateMachineHighlighting.STATE_NAME_ID);
      }
    }
    List<Move> _allContentsOfType_1 = EcoreUtil2.<Move>getAllContentsOfType(rootObject, Move.class);
    for (final Move ext_1 : _allContentsOfType_1) {
      List<INode> _findNodesForFeature_1 = NodeModelUtils.findNodesForFeature(ext_1, StateMachinePackage.Literals.MOVE__STATE);
      for (final INode node_1 : _findNodesForFeature_1) {
        acceptor.addPosition(node_1.getOffset(), node_1.getLength(), StateMachineHighlighting.STATE_MOVE_ID);
      }
    }
    List<Event> _allContentsOfType_2 = EcoreUtil2.<Event>getAllContentsOfType(rootObject, Event.class);
    for (final Event ext_2 : _allContentsOfType_2) {
      List<INode> _findNodesForFeature_2 = NodeModelUtils.findNodesForFeature(ext_2, StateMachinePackage.Literals.EVENT__NAME);
      for (final INode node_2 : _findNodesForFeature_2) {
        acceptor.addPosition(node_2.getOffset(), node_2.getLength(), StateMachineHighlighting.EVENT_NAME_ID);
      }
    }
    List<Move> _allContentsOfType_3 = EcoreUtil2.<Move>getAllContentsOfType(rootObject, Move.class);
    for (final Move ext_3 : _allContentsOfType_3) {
      List<INode> _findNodesForFeature_3 = NodeModelUtils.findNodesForFeature(ext_3, StateMachinePackage.Literals.MOVE__EVENT);
      for (final INode node_3 : _findNodesForFeature_3) {
        acceptor.addPosition(node_3.getOffset(), node_3.getLength(), StateMachineHighlighting.EVENT_MOVE_ID);
      }
    }
    List<Event> _allContentsOfType_4 = EcoreUtil2.<Event>getAllContentsOfType(rootObject, Event.class);
    for (final Event ext_4 : _allContentsOfType_4) {
      List<INode> _findNodesForFeature_4 = NodeModelUtils.findNodesForFeature(ext_4, StateMachinePackage.Literals.STATE_MACHINE__EVENT_RESET);
      for (final INode node_4 : _findNodesForFeature_4) {
        acceptor.addPosition(node_4.getOffset(), node_4.getLength(), StateMachineHighlighting.RESET_EVENT_ID);
      }
    }
    super.doProvideHighlightingFor(resource, acceptor);
  }
}
