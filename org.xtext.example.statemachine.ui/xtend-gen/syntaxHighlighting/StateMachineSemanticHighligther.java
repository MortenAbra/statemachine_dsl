package syntaxHighlighting;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
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
    super.doProvideHighlightingFor(resource, acceptor);
  }
}
