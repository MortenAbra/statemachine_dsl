package hover;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.internal.text.html.HTMLPrinter;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.hover.html.XtextBrowserInformationControlInput;
import org.xtext.example.mydsl.stateMachine.Event;
import org.xtext.example.mydsl.stateMachine.Instruction;
import org.xtext.example.mydsl.stateMachine.State;

@SuppressWarnings("all")
public class StateMachineHoverProvider extends DefaultEObjectHoverProvider {
  @Override
  public XtextBrowserInformationControlInput getHoverInfo(final EObject element, final IRegion hoverRegion, final XtextBrowserInformationControlInput previous) {
    String html = this.getHoverInfo(element);
    boolean _notEquals = (!Objects.equal(html, null));
    if (_notEquals) {
      final StringBuffer buffer = new StringBuffer(html);
      final ColorRegistry registry = JFaceResources.getColorRegistry();
      RGB _rGB = new RGB(0, 0, 0);
      RGB _rGB_1 = new RGB(62, 168, 250);
      HTMLPrinter.insertPageProlog(buffer, 0, _rGB, _rGB_1, this.getStyleSheet());
      HTMLPrinter.addPageEpilog(buffer);
      html = buffer.toString();
      ILabelProvider _labelProvider = this.getLabelProvider();
      return new XtextBrowserInformationControlInput(previous, element, html, _labelProvider);
    }
    return null;
  }
  
  public String getHoverInfo(final EObject object) {
    if ((object instanceof Event)) {
      StringConcatenation _builder = new StringConcatenation();
      String _name = ((Event)object).getName();
      _builder.append(_name);
      _builder.append(" => Events block");
      return _builder.toString();
    } else {
      if ((object instanceof State)) {
        StringConcatenation _builder_1 = new StringConcatenation();
        String _name_1 = ((State)object).getName();
        _builder_1.append(_name_1);
        _builder_1.append(" => State");
        return _builder_1.toString();
      } else {
        if ((object instanceof Instruction)) {
          StringConcatenation _builder_2 = new StringConcatenation();
          String _name_2 = ((Instruction)object).getName();
          _builder_2.append(_name_2);
          _builder_2.append(" => Action block");
          return _builder_2.toString();
        }
      }
    }
    return object.getClass().toString();
  }
}
