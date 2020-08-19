package hover

import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import org.eclipse.xtext.ui.editor.hover.html.XtextBrowserInformationControlInput
import org.eclipse.emf.ecore.EObject
import org.eclipse.swt.graphics.RGB
import org.eclipse.jface.resource.JFaceResources
import org.eclipse.jface.text.IRegion
import org.xtext.example.mydsl.stateMachine.Event
import org.xtext.example.mydsl.stateMachine.State
import org.xtext.example.mydsl.stateMachine.Instruction
import org.eclipse.jface.internal.text.html.HTMLPrinter

class StateMachineHoverProvider extends DefaultEObjectHoverProvider {
	
	override XtextBrowserInformationControlInput getHoverInfo(EObject element, IRegion hoverRegion,
			XtextBrowserInformationControlInput previous) {
		var html = getHoverInfo(element);
		if (html != null) {
			val buffer = new StringBuffer(html);
			val registry = JFaceResources.getColorRegistry();
			HTMLPrinter.insertPageProlog(buffer, 0, new RGB(0,0,0), new RGB(62,168,250), getStyleSheet());
			HTMLPrinter.addPageEpilog(buffer);
			html = buffer.toString();
			return new XtextBrowserInformationControlInput(previous, element, html, labelProvider);
		}
		return null;
	}
	
	def String getHoverInfo(EObject object){
		if(object instanceof Event){
			return '''�object.name� => Events block'''
		} else if( object instanceof State){
			return '''�object.name� => State'''
		} else if( object instanceof Instruction){
			return '''�object.name� => Action block'''
		}
		return object.class.toString
	}
	
}