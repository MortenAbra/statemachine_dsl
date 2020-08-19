package syntaxHighlighting

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor

class StateMachineHighlighting extends DefaultHighlightingConfiguration {
	
	public static final String STATE_NAME_ID = "State_name_id"
	public static final String STATE_MOVE_ID = "State_move_id"
	public static final String EVENT_NAME_ID = "Event_name_id"
	public static final String EVENT_MOVE_ID = "Event_move_id"
	public static final String RESET_EVENT_ID = "Reset_event_id"
	

	
	override configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword", keywordTextStyle());
		acceptor.acceptDefaultHighlighting(PUNCTUATION_ID, "Punctuation character", punctuationTextStyle());
		acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comment", commentTextStyle());
		acceptor.acceptDefaultHighlighting(TASK_ID, "Task Tag", taskTextStyle());
		acceptor.acceptDefaultHighlighting(STRING_ID, "String", stringTextStyle());
		acceptor.acceptDefaultHighlighting(NUMBER_ID, "Number", numberTextStyle());
		acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(INVALID_TOKEN_ID, "Invalid Symbol", errorTextStyle());
		acceptor.acceptDefaultHighlighting(STATE_NAME_ID, "State name", stateNameTextStyle())
		acceptor.acceptDefaultHighlighting(STATE_MOVE_ID, "State move ID", stateMoveNameTextStyle())
		acceptor.acceptDefaultHighlighting(EVENT_NAME_ID, "Event name ID", eventNameTextStyle())
		acceptor.acceptDefaultHighlighting(EVENT_MOVE_ID, "Event move ID", eventMoveTextStyle())
		acceptor.acceptDefaultHighlighting(RESET_EVENT_ID, "Reset event id", resetNameTextStyle())
	}
	
	def TextStyle resetNameTextStyle() {
		val textStyle = new TextStyle();
		textStyle.setColor(new RGB(25, 110, 20));
		textStyle;
	}
	
	def TextStyle eventMoveTextStyle() {
		val textStyle = new TextStyle();
		textStyle.setColor(new RGB(25, 110, 20));
		textStyle;
	}
	
	def TextStyle eventNameTextStyle() {
		val textStyle = new TextStyle();
		textStyle.setColor(new RGB(25, 110, 20));
		textStyle;
	}
	
	def TextStyle stateMoveNameTextStyle() {
		val textStyle = new TextStyle();
		textStyle.setColor(new RGB(250, 0, 0));
		textStyle;
	}
	
	def TextStyle stateNameTextStyle() {
		val textStyle = new TextStyle();
		textStyle.setColor(new RGB(250, 0, 0));
		textStyle;
	}
	
	override TextStyle keywordTextStyle(){
		val textStyle = new TextStyle();
		textStyle.setColor(new RGB(0, 0, 250));
		textStyle;
	}
	
}