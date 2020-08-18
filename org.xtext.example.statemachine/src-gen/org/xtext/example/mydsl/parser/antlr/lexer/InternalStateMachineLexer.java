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
    public static final int RULE_END=12;
    public static final int RULE_BEGIN=11;
    public static final int RULE_STRING=15;
    public static final int RULE_SL_COMMENT=17;
    public static final int Events=5;
    public static final int To=10;
    public static final int Reset=7;
    public static final int EOF=-1;
    public static final int RULE_ID=13;
    public static final int Actions=4;
    public static final int RULE_WS=18;
    public static final int RULE_ANY_OTHER=19;
    public static final int State=8;
    public static final int RULE_INT=14;
    public static final int RULE_ML_COMMENT=16;
    public static final int Block=9;

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

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:26:4: ( 'to' )
            // InternalStateMachineLexer.g:26:6: 'to'
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

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalStateMachineLexer.g:28:21: ()
            // InternalStateMachineLexer.g:28:23: 
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
            // InternalStateMachineLexer.g:30:19: ()
            // InternalStateMachineLexer.g:30:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:32:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalStateMachineLexer.g:32:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalStateMachineLexer.g:32:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalStateMachineLexer.g:32:11: '^'
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

            // InternalStateMachineLexer.g:32:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    break loop2;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:34:10: ( ( '0' .. '9' )+ )
            // InternalStateMachineLexer.g:34:12: ( '0' .. '9' )+
            {
            // InternalStateMachineLexer.g:34:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStateMachineLexer.g:34:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateMachineLexer.g:36:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalStateMachineLexer.g:36:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalStateMachineLexer.g:36:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalStateMachineLexer.g:36:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalStateMachineLexer.g:36:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalStateMachineLexer.g:36:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalStateMachineLexer.g:36:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalStateMachineLexer.g:36:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalStateMachineLexer.g:36:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalStateMachineLexer.g:36:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalStateMachineLexer.g:36:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // InternalStateMachineLexer.g:38:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalStateMachineLexer.g:38:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalStateMachineLexer.g:38:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalStateMachineLexer.g:38:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalStateMachineLexer.g:40:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalStateMachineLexer.g:40:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalStateMachineLexer.g:40:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalStateMachineLexer.g:40:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalStateMachineLexer.g:40:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalStateMachineLexer.g:40:41: ( '\\r' )? '\\n'
                    {
                    // InternalStateMachineLexer.g:40:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalStateMachineLexer.g:40:41: '\\r'
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
            // InternalStateMachineLexer.g:42:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalStateMachineLexer.g:42:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalStateMachineLexer.g:42:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // InternalStateMachineLexer.g:44:16: ( . )
            // InternalStateMachineLexer.g:44:18: .
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
        // InternalStateMachineLexer.g:1:8: ( Actions | Events | Action | Reset | State | Block | To | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=14;
        alt12 = dfa12.predict(input);
        switch (alt12) {
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
                // InternalStateMachineLexer.g:1:50: To
                {
                mTo(); 

                }
                break;
            case 8 :
                // InternalStateMachineLexer.g:1:53: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 9 :
                // InternalStateMachineLexer.g:1:61: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 10 :
                // InternalStateMachineLexer.g:1:70: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 11 :
                // InternalStateMachineLexer.g:1:82: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 12 :
                // InternalStateMachineLexer.g:1:98: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 13 :
                // InternalStateMachineLexer.g:1:114: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 14 :
                // InternalStateMachineLexer.g:1:122: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\7\21\1\17\2\uffff\3\17\2\uffff\1\21\1\uffff\5\21\1\43\5\uffff\6\21\1\uffff\11\21\1\63\1\64\1\65\1\21\1\67\1\70\3\uffff\1\71\3\uffff";
    static final String DFA12_eofS =
        "\72\uffff";
    static final String DFA12_minS =
        "\1\0\1\143\1\166\1\143\1\145\1\164\1\154\1\157\1\101\2\uffff\2\0\1\52\2\uffff\1\164\1\uffff\1\145\1\164\1\163\1\141\1\157\1\60\5\uffff\1\151\1\156\1\151\1\145\1\164\1\143\1\uffff\1\157\1\164\1\157\1\164\1\145\1\153\1\156\1\163\1\156\3\60\1\163\2\60\3\uffff\1\60\3\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\143\1\166\1\143\1\145\1\164\1\154\1\157\1\172\2\uffff\2\uffff\1\57\2\uffff\1\164\1\uffff\1\145\1\164\1\163\1\141\1\157\1\172\5\uffff\1\151\1\156\1\151\1\145\1\164\1\143\1\uffff\1\157\1\164\1\157\1\164\1\145\1\153\1\156\1\163\1\156\3\172\1\163\2\172\3\uffff\1\172\3\uffff";
    static final String DFA12_acceptS =
        "\11\uffff\1\10\1\11\3\uffff\1\15\1\16\1\uffff\1\10\6\uffff\1\11\1\12\1\13\1\14\1\15\6\uffff\1\7\17\uffff\1\4\1\5\1\6\1\uffff\1\2\1\3\1\1";
    static final String DFA12_specialS =
        "\1\1\12\uffff\1\0\1\2\55\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\17\2\16\2\17\1\16\22\17\1\16\1\17\1\13\4\17\1\14\7\17\1\15\12\12\7\17\1\1\3\11\1\2\14\11\1\4\1\5\7\11\3\17\1\10\1\11\1\17\1\3\1\6\21\11\1\7\6\11\uff85\17",
            "\1\20",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "",
            "\0\31",
            "\0\31",
            "\1\32\4\uffff\1\33",
            "",
            "",
            "\1\35",
            "",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "",
            "",
            "",
            "",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\66",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Actions | Events | Action | Reset | State | Block | To | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_11 = input.LA(1);

                        s = -1;
                        if ( ((LA12_11>='\u0000' && LA12_11<='\uFFFF')) ) {s = 25;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='A') ) {s = 1;}

                        else if ( (LA12_0=='E') ) {s = 2;}

                        else if ( (LA12_0=='a') ) {s = 3;}

                        else if ( (LA12_0=='R') ) {s = 4;}

                        else if ( (LA12_0=='S') ) {s = 5;}

                        else if ( (LA12_0=='b') ) {s = 6;}

                        else if ( (LA12_0=='t') ) {s = 7;}

                        else if ( (LA12_0=='^') ) {s = 8;}

                        else if ( ((LA12_0>='B' && LA12_0<='D')||(LA12_0>='F' && LA12_0<='Q')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='c' && LA12_0<='s')||(LA12_0>='u' && LA12_0<='z')) ) {s = 9;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 10;}

                        else if ( (LA12_0=='\"') ) {s = 11;}

                        else if ( (LA12_0=='\'') ) {s = 12;}

                        else if ( (LA12_0=='/') ) {s = 13;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 14;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 15;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_12 = input.LA(1);

                        s = -1;
                        if ( ((LA12_12>='\u0000' && LA12_12<='\uFFFF')) ) {s = 25;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}