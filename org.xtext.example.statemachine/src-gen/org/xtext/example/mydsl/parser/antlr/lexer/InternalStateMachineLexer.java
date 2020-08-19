package org.xtext.example.mydsl.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineLexer extends Lexer {
    public static final int Action=6;
    public static final int RULE_END=29;
    public static final int RULE_BEGIN=28;
    public static final int EqualsSignGreaterThanSign=17;
    public static final int State_1=11;
    public static final int Gate=12;
    public static final int RULE_STRING=33;
    public static final int LessThanSign=26;
    public static final int RULE_SL_COMMENT=35;
    public static final int EqualsSignGreaterThanSignVerticalLine=13;
    public static final int HyphenMinus=24;
    public static final int LeftParenthesis=20;
    public static final int Events=5;
    public static final int LessThanSignEqualsSign=15;
    public static final int To=19;
    public static final int Solidus=25;
    public static final int Reset=7;
    public static final int EOF=-1;
    public static final int Asterisk=22;
    public static final int GreaterThanSign=27;
    public static final int RULE_ID=32;
    public static final int Actions=4;
    public static final int RULE_WS=36;
    public static final int RightParenthesis=21;
    public static final int RULE_ANY_OTHER=37;
    public static final int GreaterThanSignEqualsSign=18;
    public static final int EqualsSignEqualsSign=16;
    public static final int RULE_DBL=31;
    public static final int State=8;
    public static final int PlusSign=23;
    public static final int RULE_INT=30;
    public static final int RULE_ML_COMMENT=34;
    public static final int Block=9;
    public static final int Event=10;
    public static final int ExclamationMarkEqualsSign=14;

    // delegates
    // delegators

    public InternalStateMachineLexer() {;} 
    public InternalStateMachineLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalStateMachineLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalStateMachineLexer.g"; }

    // $ANTLR start "Actions"
    public final void mActions() throws RecognitionException {
        try {
            int _type = Actions;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:14:9: ( 'Actions' )
            // InternalStateMachineLexer.g:14:11: 'Actions'
            {
            match("Actions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Actions"

    // $ANTLR start "Events"
    public final void mEvents() throws RecognitionException {
        try {
            int _type = Events;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:16:8: ( 'Events' )
            // InternalStateMachineLexer.g:16:10: 'Events'
            {
            match("Events"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Events"

    // $ANTLR start "Action"
    public final void mAction() throws RecognitionException {
        try {
            int _type = Action;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:18:8: ( 'action' )
            // InternalStateMachineLexer.g:18:10: 'action'
            {
            match("action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Action"

    // $ANTLR start "Reset"
    public final void mReset() throws RecognitionException {
        try {
            int _type = Reset;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:20:7: ( 'Reset' )
            // InternalStateMachineLexer.g:20:9: 'Reset'
            {
            match("Reset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Reset"

    // $ANTLR start "State"
    public final void mState() throws RecognitionException {
        try {
            int _type = State;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:22:7: ( 'State' )
            // InternalStateMachineLexer.g:22:9: 'State'
            {
            match("State"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "State"

    // $ANTLR start "Block"
    public final void mBlock() throws RecognitionException {
        try {
            int _type = Block;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:24:7: ( 'block' )
            // InternalStateMachineLexer.g:24:9: 'block'
            {
            match("block"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Block"

    // $ANTLR start "Event"
    public final void mEvent() throws RecognitionException {
        try {
            int _type = Event;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:26:7: ( 'event' )
            // InternalStateMachineLexer.g:26:9: 'event'
            {
            match("event"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Event"

    // $ANTLR start "State_1"
    public final void mState_1() throws RecognitionException {
        try {
            int _type = State_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:28:9: ( 'state' )
            // InternalStateMachineLexer.g:28:11: 'state'
            {
            match("state"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "State_1"

    // $ANTLR start "Gate"
    public final void mGate() throws RecognitionException {
        try {
            int _type = Gate;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:30:6: ( 'Gate' )
            // InternalStateMachineLexer.g:30:8: 'Gate'
            {
            match("Gate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Gate"

    // $ANTLR start "EqualsSignGreaterThanSignVerticalLine"
    public final void mEqualsSignGreaterThanSignVerticalLine() throws RecognitionException {
        try {
            int _type = EqualsSignGreaterThanSignVerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:32:39: ( '=>|' )
            // InternalStateMachineLexer.g:32:41: '=>|'
            {
            match("=>|"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignGreaterThanSignVerticalLine"

    // $ANTLR start "ExclamationMarkEqualsSign"
    public final void mExclamationMarkEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:34:27: ( '!=' )
            // InternalStateMachineLexer.g:34:29: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkEqualsSign"

    // $ANTLR start "LessThanSignEqualsSign"
    public final void mLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:36:24: ( '<=' )
            // InternalStateMachineLexer.g:36:26: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignEqualsSign"

    // $ANTLR start "EqualsSignEqualsSign"
    public final void mEqualsSignEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:38:22: ( '==' )
            // InternalStateMachineLexer.g:38:24: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignEqualsSign"

    // $ANTLR start "EqualsSignGreaterThanSign"
    public final void mEqualsSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = EqualsSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:40:27: ( '=>' )
            // InternalStateMachineLexer.g:40:29: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignGreaterThanSign"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:42:27: ( '>=' )
            // InternalStateMachineLexer.g:42:29: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:44:4: ( 'to' )
            // InternalStateMachineLexer.g:44:6: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "To"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:46:17: ( '(' )
            // InternalStateMachineLexer.g:46:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:48:18: ( ')' )
            // InternalStateMachineLexer.g:48:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:50:10: ( '*' )
            // InternalStateMachineLexer.g:50:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:52:10: ( '+' )
            // InternalStateMachineLexer.g:52:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:54:13: ( '-' )
            // InternalStateMachineLexer.g:54:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:56:9: ( '/' )
            // InternalStateMachineLexer.g:56:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:58:14: ( '<' )
            // InternalStateMachineLexer.g:58:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:60:17: ( '>' )
            // InternalStateMachineLexer.g:60:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalStateMachineLexer.g:62:21: ()
            // InternalStateMachineLexer.g:62:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalStateMachineLexer.g:64:19: ()
            // InternalStateMachineLexer.g:64:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:66:10: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // InternalStateMachineLexer.g:66:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // InternalStateMachineLexer.g:66:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                alt2=1;
            }
            else if ( ((LA2_0>='1' && LA2_0<='9')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalStateMachineLexer.g:66:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalStateMachineLexer.g:66:17: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalStateMachineLexer.g:66:26: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalStateMachineLexer.g:66:27: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DBL"
    public final void mRULE_DBL() throws RecognitionException {
        try {
            int _type = RULE_DBL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:68:10: ( ( RULE_INT )? '.' ( '0' .. '9' )+ )
            // InternalStateMachineLexer.g:68:12: ( RULE_INT )? '.' ( '0' .. '9' )+
            {
            // InternalStateMachineLexer.g:68:12: ( RULE_INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalStateMachineLexer.g:68:12: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            match('.'); 
            // InternalStateMachineLexer.g:68:26: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStateMachineLexer.g:68:27: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DBL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:70:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalStateMachineLexer.g:70:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalStateMachineLexer.g:70:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalStateMachineLexer.g:70:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalStateMachineLexer.g:70:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalStateMachineLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:72:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalStateMachineLexer.g:72:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalStateMachineLexer.g:72:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalStateMachineLexer.g:72:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalStateMachineLexer.g:72:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalStateMachineLexer.g:72:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalStateMachineLexer.g:72:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalStateMachineLexer.g:72:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalStateMachineLexer.g:72:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalStateMachineLexer.g:72:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalStateMachineLexer.g:72:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:74:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalStateMachineLexer.g:74:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalStateMachineLexer.g:74:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalStateMachineLexer.g:74:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:76:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalStateMachineLexer.g:76:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalStateMachineLexer.g:76:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalStateMachineLexer.g:76:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalStateMachineLexer.g:76:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalStateMachineLexer.g:76:41: ( '\\r' )? '\\n'
                    {
                    // InternalStateMachineLexer.g:76:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalStateMachineLexer.g:76:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:78:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalStateMachineLexer.g:78:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalStateMachineLexer.g:78:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalStateMachineLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:80:16: ( . )
            // InternalStateMachineLexer.g:80:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalStateMachineLexer.g:1:8: ( Actions | Events | Action | Reset | State | Block | Event | State_1 | Gate | EqualsSignGreaterThanSignVerticalLine | ExclamationMarkEqualsSign | LessThanSignEqualsSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | To | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | HyphenMinus | Solidus | LessThanSign | GreaterThanSign | RULE_INT | RULE_DBL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=32;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalStateMachineLexer.g:1:10: Actions
                {
                mActions(); 

                }
                break;
            case 2 :
                // InternalStateMachineLexer.g:1:18: Events
                {
                mEvents(); 

                }
                break;
            case 3 :
                // InternalStateMachineLexer.g:1:25: Action
                {
                mAction(); 

                }
                break;
            case 4 :
                // InternalStateMachineLexer.g:1:32: Reset
                {
                mReset(); 

                }
                break;
            case 5 :
                // InternalStateMachineLexer.g:1:38: State
                {
                mState(); 

                }
                break;
            case 6 :
                // InternalStateMachineLexer.g:1:44: Block
                {
                mBlock(); 

                }
                break;
            case 7 :
                // InternalStateMachineLexer.g:1:50: Event
                {
                mEvent(); 

                }
                break;
            case 8 :
                // InternalStateMachineLexer.g:1:56: State_1
                {
                mState_1(); 

                }
                break;
            case 9 :
                // InternalStateMachineLexer.g:1:64: Gate
                {
                mGate(); 

                }
                break;
            case 10 :
                // InternalStateMachineLexer.g:1:69: EqualsSignGreaterThanSignVerticalLine
                {
                mEqualsSignGreaterThanSignVerticalLine(); 

                }
                break;
            case 11 :
                // InternalStateMachineLexer.g:1:107: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 12 :
                // InternalStateMachineLexer.g:1:133: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 13 :
                // InternalStateMachineLexer.g:1:156: EqualsSignEqualsSign
                {
                mEqualsSignEqualsSign(); 

                }
                break;
            case 14 :
                // InternalStateMachineLexer.g:1:177: EqualsSignGreaterThanSign
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
            case 15 :
                // InternalStateMachineLexer.g:1:203: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 16 :
                // InternalStateMachineLexer.g:1:229: To
                {
                mTo(); 

                }
                break;
            case 17 :
                // InternalStateMachineLexer.g:1:232: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 18 :
                // InternalStateMachineLexer.g:1:248: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 19 :
                // InternalStateMachineLexer.g:1:265: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 20 :
                // InternalStateMachineLexer.g:1:274: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 21 :
                // InternalStateMachineLexer.g:1:283: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 22 :
                // InternalStateMachineLexer.g:1:295: Solidus
                {
                mSolidus(); 

                }
                break;
            case 23 :
                // InternalStateMachineLexer.g:1:303: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 24 :
                // InternalStateMachineLexer.g:1:316: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 25 :
                // InternalStateMachineLexer.g:1:332: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // InternalStateMachineLexer.g:1:341: RULE_DBL
                {
                mRULE_DBL(); 

                }
                break;
            case 27 :
                // InternalStateMachineLexer.g:1:350: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 28 :
                // InternalStateMachineLexer.g:1:358: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 29 :
                // InternalStateMachineLexer.g:1:370: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 30 :
                // InternalStateMachineLexer.g:1:386: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 31 :
                // InternalStateMachineLexer.g:1:402: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 32 :
                // InternalStateMachineLexer.g:1:410: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\11\37\2\35\1\54\1\56\1\37\5\uffff\1\67\2\70\2\35\1\uffff\2\35\2\uffff\1\37\1\uffff\10\37\1\107\6\uffff\1\110\12\uffff\1\70\2\uffff\11\37\3\uffff\10\37\1\132\3\37\1\136\1\137\1\140\1\141\1\142\1\uffff\1\37\1\144\1\145\5\uffff\1\146\3\uffff";
    static final String DFA15_eofS =
        "\147\uffff";
    static final String DFA15_minS =
        "\1\0\1\143\1\166\1\143\1\145\1\164\1\154\1\166\1\164\1\141\4\75\1\157\5\uffff\1\52\2\56\1\60\1\101\1\uffff\2\0\2\uffff\1\164\1\uffff\1\145\1\164\1\163\1\141\1\157\1\145\1\141\1\164\1\174\6\uffff\1\60\12\uffff\1\56\2\uffff\1\151\1\156\1\151\1\145\1\164\1\143\1\156\1\164\1\145\3\uffff\1\157\1\164\1\157\1\164\1\145\1\153\1\164\1\145\1\60\1\156\1\163\1\156\5\60\1\uffff\1\163\2\60\5\uffff\1\60\3\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\143\1\166\1\143\1\145\1\164\1\154\1\166\1\164\1\141\1\76\3\75\1\157\5\uffff\1\57\1\56\2\71\1\172\1\uffff\2\uffff\2\uffff\1\164\1\uffff\1\145\1\164\1\163\1\141\1\157\1\145\1\141\1\164\1\174\6\uffff\1\172\12\uffff\1\71\2\uffff\1\151\1\156\1\151\1\145\1\164\1\143\1\156\1\164\1\145\3\uffff\1\157\1\164\1\157\1\164\1\145\1\153\1\164\1\145\1\172\1\156\1\163\1\156\5\172\1\uffff\1\163\2\172\5\uffff\1\172\3\uffff";
    static final String DFA15_acceptS =
        "\17\uffff\1\21\1\22\1\23\1\24\1\25\5\uffff\1\33\2\uffff\1\37\1\40\1\uffff\1\33\11\uffff\1\15\1\13\1\14\1\27\1\17\1\30\1\uffff\1\21\1\22\1\23\1\24\1\25\1\35\1\36\1\26\1\31\1\32\1\uffff\1\34\1\37\11\uffff\1\12\1\16\1\20\21\uffff\1\11\3\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\1\2\1\3\1\1";
    static final String DFA15_specialS =
        "\1\1\31\uffff\1\0\1\2\113\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\13\1\32\4\35\1\33\1\17\1\20\1\21\1\22\1\35\1\23\1\27\1\24\1\25\11\26\2\35\1\14\1\12\1\15\2\35\1\1\3\31\1\2\1\31\1\11\12\31\1\4\1\5\7\31\3\35\1\30\1\31\1\35\1\3\1\6\2\31\1\7\15\31\1\10\1\16\6\31\uff85\35",
            "\1\36",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\51\1\50",
            "\1\52",
            "\1\53",
            "\1\55",
            "\1\57",
            "",
            "",
            "",
            "",
            "",
            "\1\65\4\uffff\1\66",
            "\1\71",
            "\1\71\1\uffff\12\72",
            "\12\71",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\0\73",
            "\0\73",
            "",
            "",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\71\1\uffff\12\72",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\143",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Actions | Events | Action | Reset | State | Block | Event | State_1 | Gate | EqualsSignGreaterThanSignVerticalLine | ExclamationMarkEqualsSign | LessThanSignEqualsSign | EqualsSignEqualsSign | EqualsSignGreaterThanSign | GreaterThanSignEqualsSign | To | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | HyphenMinus | Solidus | LessThanSign | GreaterThanSign | RULE_INT | RULE_DBL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_26 = input.LA(1);

                        s = -1;
                        if ( ((LA15_26>='\u0000' && LA15_26<='\uFFFF')) ) {s = 59;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='A') ) {s = 1;}

                        else if ( (LA15_0=='E') ) {s = 2;}

                        else if ( (LA15_0=='a') ) {s = 3;}

                        else if ( (LA15_0=='R') ) {s = 4;}

                        else if ( (LA15_0=='S') ) {s = 5;}

                        else if ( (LA15_0=='b') ) {s = 6;}

                        else if ( (LA15_0=='e') ) {s = 7;}

                        else if ( (LA15_0=='s') ) {s = 8;}

                        else if ( (LA15_0=='G') ) {s = 9;}

                        else if ( (LA15_0=='=') ) {s = 10;}

                        else if ( (LA15_0=='!') ) {s = 11;}

                        else if ( (LA15_0=='<') ) {s = 12;}

                        else if ( (LA15_0=='>') ) {s = 13;}

                        else if ( (LA15_0=='t') ) {s = 14;}

                        else if ( (LA15_0=='(') ) {s = 15;}

                        else if ( (LA15_0==')') ) {s = 16;}

                        else if ( (LA15_0=='*') ) {s = 17;}

                        else if ( (LA15_0=='+') ) {s = 18;}

                        else if ( (LA15_0=='-') ) {s = 19;}

                        else if ( (LA15_0=='/') ) {s = 20;}

                        else if ( (LA15_0=='0') ) {s = 21;}

                        else if ( ((LA15_0>='1' && LA15_0<='9')) ) {s = 22;}

                        else if ( (LA15_0=='.') ) {s = 23;}

                        else if ( (LA15_0=='^') ) {s = 24;}

                        else if ( ((LA15_0>='B' && LA15_0<='D')||LA15_0=='F'||(LA15_0>='H' && LA15_0<='Q')||(LA15_0>='T' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='c' && LA15_0<='d')||(LA15_0>='f' && LA15_0<='r')||(LA15_0>='u' && LA15_0<='z')) ) {s = 25;}

                        else if ( (LA15_0=='\"') ) {s = 26;}

                        else if ( (LA15_0=='\'') ) {s = 27;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 28;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='#' && LA15_0<='&')||LA15_0==','||(LA15_0>=':' && LA15_0<=';')||(LA15_0>='?' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_27 = input.LA(1);

                        s = -1;
                        if ( ((LA15_27>='\u0000' && LA15_27<='\uFFFF')) ) {s = 59;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}