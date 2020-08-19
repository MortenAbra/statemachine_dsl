package syntaxHighlighting;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

@SuppressWarnings("all")
public class StateMachineHighlighting extends DefaultHighlightingConfiguration {
  public static final String STATE_NAME_ID = "State_name_id";
  
  public static final String STATE_MOVE_ID = "State_move_id";
  
  public static final String EVENT_NAME_ID = "Event_name_id";
  
  public static final String EVENT_MOVE_ID = "Event_move_id";
  
  public static final String RESET_EVENT_ID = "Reset_event_id";
  
  @Override
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    acceptor.acceptDefaultHighlighting(DefaultHighlightingConfiguration.KEYWORD_ID, "Keyword", this.keywordTextStyle());
    acceptor.acceptDefaultHighlighting(DefaultHighlightingConfiguration.PUNCTUATION_ID, "Punctuation character", this.punctuationTextStyle());
    acceptor.acceptDefaultHighlighting(DefaultHighlightingConfiguration.COMMENT_ID, "Comment", this.commentTextStyle());
    acceptor.acceptDefaultHighlighting(DefaultHighlightingConfiguration.TASK_ID, "Task Tag", this.taskTextStyle());
    acceptor.acceptDefaultHighlighting(DefaultHighlightingConfiguration.STRING_ID, "String", this.stringTextStyle());
    acceptor.acceptDefaultHighlighting(DefaultHighlightingConfiguration.NUMBER_ID, "Number", this.numberTextStyle());
    acceptor.acceptDefaultHighlighting(DefaultHighlightingConfiguration.DEFAULT_ID, "Default", this.defaultTextStyle());
    acceptor.acceptDefaultHighlighting(DefaultHighlightingConfiguration.INVALID_TOKEN_ID, "Invalid Symbol", this.errorTextStyle());
    acceptor.acceptDefaultHighlighting(StateMachineHighlighting.STATE_NAME_ID, "State name", this.stateNameTextStyle());
    acceptor.acceptDefaultHighlighting(StateMachineHighlighting.STATE_MOVE_ID, "State move ID", this.stateMoveNameTextStyle());
    acceptor.acceptDefaultHighlighting(StateMachineHighlighting.EVENT_NAME_ID, "Event name ID", this.eventNameTextStyle());
    acceptor.acceptDefaultHighlighting(StateMachineHighlighting.EVENT_MOVE_ID, "Event move ID", this.eventMoveTextStyle());
    acceptor.acceptDefaultHighlighting(StateMachineHighlighting.RESET_EVENT_ID, "Reset event id", this.resetNameTextStyle());
  }
  
  public TextStyle resetNameTextStyle() {
    TextStyle _xblockexpression = null;
    {
      final TextStyle textStyle = new TextStyle();
      RGB _rGB = new RGB(25, 110, 20);
      textStyle.setColor(_rGB);
      _xblockexpression = textStyle;
    }
    return _xblockexpression;
  }
  
  public TextStyle eventMoveTextStyle() {
    TextStyle _xblockexpression = null;
    {
      final TextStyle textStyle = new TextStyle();
      RGB _rGB = new RGB(25, 110, 20);
      textStyle.setColor(_rGB);
      _xblockexpression = textStyle;
    }
    return _xblockexpression;
  }
  
  public TextStyle eventNameTextStyle() {
    TextStyle _xblockexpression = null;
    {
      final TextStyle textStyle = new TextStyle();
      RGB _rGB = new RGB(25, 110, 20);
      textStyle.setColor(_rGB);
      _xblockexpression = textStyle;
    }
    return _xblockexpression;
  }
  
  public TextStyle stateMoveNameTextStyle() {
    TextStyle _xblockexpression = null;
    {
      final TextStyle textStyle = new TextStyle();
      RGB _rGB = new RGB(250, 0, 0);
      textStyle.setColor(_rGB);
      _xblockexpression = textStyle;
    }
    return _xblockexpression;
  }
  
  public TextStyle stateNameTextStyle() {
    TextStyle _xblockexpression = null;
    {
      final TextStyle textStyle = new TextStyle();
      RGB _rGB = new RGB(250, 0, 0);
      textStyle.setColor(_rGB);
      _xblockexpression = textStyle;
    }
    return _xblockexpression;
  }
  
  @Override
  public TextStyle keywordTextStyle() {
    TextStyle _xblockexpression = null;
    {
      final TextStyle textStyle = new TextStyle();
      RGB _rGB = new RGB(0, 0, 250);
      textStyle.setColor(_rGB);
      _xblockexpression = textStyle;
    }
    return _xblockexpression;
  }
}
