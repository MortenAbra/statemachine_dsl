package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.StateMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Actions", "Events", "Action", "Reset", "State", "Block", "Event", "State_1", "Gate", "EqualsSignGreaterThanSignVerticalLine", "ExclamationMarkEqualsSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "EqualsSignGreaterThanSign", "GreaterThanSignEqualsSign", "To", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "HyphenMinus", "Solidus", "LessThanSign", "GreaterThanSign", "RULE_BEGIN", "RULE_END", "RULE_INT", "RULE_DBL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
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


        public InternalStateMachineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateMachineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateMachineParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStateMachineParser.g"; }



     	private StateMachineGrammarAccess grammarAccess;

        public InternalStateMachineParser(TokenStream input, StateMachineGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "StateMachine";
       	}

       	@Override
       	protected StateMachineGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStateMachine"
    // InternalStateMachineParser.g:57:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalStateMachineParser.g:57:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalStateMachineParser.g:58:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalStateMachineParser.g:64:1: ruleStateMachine returns [EObject current=null] : ( ( (lv_gate_0_0= ruleGate ) )* otherlv_1= Events otherlv_2= Block this_BEGIN_3= RULE_BEGIN ( (lv_event_4_0= ruleEvent ) )+ this_END_5= RULE_END otherlv_6= Reset otherlv_7= Block this_BEGIN_8= RULE_BEGIN ( (otherlv_9= RULE_ID ) )* this_END_10= RULE_END otherlv_11= Actions otherlv_12= Block this_BEGIN_13= RULE_BEGIN ( (lv_instructions_14_0= ruleInstruction ) )* this_END_15= RULE_END ( (lv_state_16_0= ruleState ) )* ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_BEGIN_8=null;
        Token otherlv_9=null;
        Token this_END_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token this_BEGIN_13=null;
        Token this_END_15=null;
        EObject lv_gate_0_0 = null;

        EObject lv_event_4_0 = null;

        EObject lv_instructions_14_0 = null;

        EObject lv_state_16_0 = null;



        	enterRule();

        try {
            // InternalStateMachineParser.g:70:2: ( ( ( (lv_gate_0_0= ruleGate ) )* otherlv_1= Events otherlv_2= Block this_BEGIN_3= RULE_BEGIN ( (lv_event_4_0= ruleEvent ) )+ this_END_5= RULE_END otherlv_6= Reset otherlv_7= Block this_BEGIN_8= RULE_BEGIN ( (otherlv_9= RULE_ID ) )* this_END_10= RULE_END otherlv_11= Actions otherlv_12= Block this_BEGIN_13= RULE_BEGIN ( (lv_instructions_14_0= ruleInstruction ) )* this_END_15= RULE_END ( (lv_state_16_0= ruleState ) )* ) )
            // InternalStateMachineParser.g:71:2: ( ( (lv_gate_0_0= ruleGate ) )* otherlv_1= Events otherlv_2= Block this_BEGIN_3= RULE_BEGIN ( (lv_event_4_0= ruleEvent ) )+ this_END_5= RULE_END otherlv_6= Reset otherlv_7= Block this_BEGIN_8= RULE_BEGIN ( (otherlv_9= RULE_ID ) )* this_END_10= RULE_END otherlv_11= Actions otherlv_12= Block this_BEGIN_13= RULE_BEGIN ( (lv_instructions_14_0= ruleInstruction ) )* this_END_15= RULE_END ( (lv_state_16_0= ruleState ) )* )
            {
            // InternalStateMachineParser.g:71:2: ( ( (lv_gate_0_0= ruleGate ) )* otherlv_1= Events otherlv_2= Block this_BEGIN_3= RULE_BEGIN ( (lv_event_4_0= ruleEvent ) )+ this_END_5= RULE_END otherlv_6= Reset otherlv_7= Block this_BEGIN_8= RULE_BEGIN ( (otherlv_9= RULE_ID ) )* this_END_10= RULE_END otherlv_11= Actions otherlv_12= Block this_BEGIN_13= RULE_BEGIN ( (lv_instructions_14_0= ruleInstruction ) )* this_END_15= RULE_END ( (lv_state_16_0= ruleState ) )* )
            // InternalStateMachineParser.g:72:3: ( (lv_gate_0_0= ruleGate ) )* otherlv_1= Events otherlv_2= Block this_BEGIN_3= RULE_BEGIN ( (lv_event_4_0= ruleEvent ) )+ this_END_5= RULE_END otherlv_6= Reset otherlv_7= Block this_BEGIN_8= RULE_BEGIN ( (otherlv_9= RULE_ID ) )* this_END_10= RULE_END otherlv_11= Actions otherlv_12= Block this_BEGIN_13= RULE_BEGIN ( (lv_instructions_14_0= ruleInstruction ) )* this_END_15= RULE_END ( (lv_state_16_0= ruleState ) )*
            {
            // InternalStateMachineParser.g:72:3: ( (lv_gate_0_0= ruleGate ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Gate) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStateMachineParser.g:73:4: (lv_gate_0_0= ruleGate )
            	    {
            	    // InternalStateMachineParser.g:73:4: (lv_gate_0_0= ruleGate )
            	    // InternalStateMachineParser.g:74:5: lv_gate_0_0= ruleGate
            	    {

            	    					newCompositeNode(grammarAccess.getStateMachineAccess().getGateGateParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_gate_0_0=ruleGate();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"gate",
            	    						lv_gate_0_0,
            	    						"org.xtext.example.mydsl.StateMachine.Gate");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,Events,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getEventsKeyword_1());
            		
            otherlv_2=(Token)match(input,Block,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getBlockKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getStateMachineAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalStateMachineParser.g:103:3: ( (lv_event_4_0= ruleEvent ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStateMachineParser.g:104:4: (lv_event_4_0= ruleEvent )
            	    {
            	    // InternalStateMachineParser.g:104:4: (lv_event_4_0= ruleEvent )
            	    // InternalStateMachineParser.g:105:5: lv_event_4_0= ruleEvent
            	    {

            	    					newCompositeNode(grammarAccess.getStateMachineAccess().getEventEventParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_event_4_0=ruleEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"event",
            	    						lv_event_4_0,
            	    						"org.xtext.example.mydsl.StateMachine.Event");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_8); 

            			newLeafNode(this_END_5, grammarAccess.getStateMachineAccess().getENDTerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,Reset,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getStateMachineAccess().getResetKeyword_6());
            		
            otherlv_7=(Token)match(input,Block,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getBlockKeyword_7());
            		
            this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            			newLeafNode(this_BEGIN_8, grammarAccess.getStateMachineAccess().getBEGINTerminalRuleCall_8());
            		
            // InternalStateMachineParser.g:138:3: ( (otherlv_9= RULE_ID ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStateMachineParser.g:139:4: (otherlv_9= RULE_ID )
            	    {
            	    // InternalStateMachineParser.g:139:4: (otherlv_9= RULE_ID )
            	    // InternalStateMachineParser.g:140:5: otherlv_9= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getStateMachineRule());
            	    					}
            	    				
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    					newLeafNode(otherlv_9, grammarAccess.getStateMachineAccess().getEventResetEventCrossReference_9_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_END_10=(Token)match(input,RULE_END,FOLLOW_9); 

            			newLeafNode(this_END_10, grammarAccess.getStateMachineAccess().getENDTerminalRuleCall_10());
            		
            otherlv_11=(Token)match(input,Actions,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getStateMachineAccess().getActionsKeyword_11());
            		
            otherlv_12=(Token)match(input,Block,FOLLOW_5); 

            			newLeafNode(otherlv_12, grammarAccess.getStateMachineAccess().getBlockKeyword_12());
            		
            this_BEGIN_13=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            			newLeafNode(this_BEGIN_13, grammarAccess.getStateMachineAccess().getBEGINTerminalRuleCall_13());
            		
            // InternalStateMachineParser.g:167:3: ( (lv_instructions_14_0= ruleInstruction ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStateMachineParser.g:168:4: (lv_instructions_14_0= ruleInstruction )
            	    {
            	    // InternalStateMachineParser.g:168:4: (lv_instructions_14_0= ruleInstruction )
            	    // InternalStateMachineParser.g:169:5: lv_instructions_14_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getStateMachineAccess().getInstructionsInstructionParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_instructions_14_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_14_0,
            	    						"org.xtext.example.mydsl.StateMachine.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_END_15=(Token)match(input,RULE_END,FOLLOW_10); 

            			newLeafNode(this_END_15, grammarAccess.getStateMachineAccess().getENDTerminalRuleCall_15());
            		
            // InternalStateMachineParser.g:190:3: ( (lv_state_16_0= ruleState ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==State) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalStateMachineParser.g:191:4: (lv_state_16_0= ruleState )
            	    {
            	    // InternalStateMachineParser.g:191:4: (lv_state_16_0= ruleState )
            	    // InternalStateMachineParser.g:192:5: lv_state_16_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getStateMachineAccess().getStateStateParserRuleCall_16_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_state_16_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"state",
            	    						lv_state_16_0,
            	    						"org.xtext.example.mydsl.StateMachine.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleGate"
    // InternalStateMachineParser.g:213:1: entryRuleGate returns [EObject current=null] : iv_ruleGate= ruleGate EOF ;
    public final EObject entryRuleGate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGate = null;


        try {
            // InternalStateMachineParser.g:213:45: (iv_ruleGate= ruleGate EOF )
            // InternalStateMachineParser.g:214:2: iv_ruleGate= ruleGate EOF
            {
             newCompositeNode(grammarAccess.getGateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGate=ruleGate();

            state._fsp--;

             current =iv_ruleGate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGate"


    // $ANTLR start "ruleGate"
    // InternalStateMachineParser.g:220:1: ruleGate returns [EObject current=null] : (otherlv_0= Gate otherlv_1= Block this_BEGIN_2= RULE_BEGIN ( (lv_block_3_0= ruleBlock ) )+ this_END_4= RULE_END ) ;
    public final EObject ruleGate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_block_3_0 = null;



        	enterRule();

        try {
            // InternalStateMachineParser.g:226:2: ( (otherlv_0= Gate otherlv_1= Block this_BEGIN_2= RULE_BEGIN ( (lv_block_3_0= ruleBlock ) )+ this_END_4= RULE_END ) )
            // InternalStateMachineParser.g:227:2: (otherlv_0= Gate otherlv_1= Block this_BEGIN_2= RULE_BEGIN ( (lv_block_3_0= ruleBlock ) )+ this_END_4= RULE_END )
            {
            // InternalStateMachineParser.g:227:2: (otherlv_0= Gate otherlv_1= Block this_BEGIN_2= RULE_BEGIN ( (lv_block_3_0= ruleBlock ) )+ this_END_4= RULE_END )
            // InternalStateMachineParser.g:228:3: otherlv_0= Gate otherlv_1= Block this_BEGIN_2= RULE_BEGIN ( (lv_block_3_0= ruleBlock ) )+ this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,Gate,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGateAccess().getGateKeyword_0());
            		
            otherlv_1=(Token)match(input,Block,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getGateAccess().getBlockKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getGateAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalStateMachineParser.g:240:3: ( (lv_block_3_0= ruleBlock ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalStateMachineParser.g:241:4: (lv_block_3_0= ruleBlock )
            	    {
            	    // InternalStateMachineParser.g:241:4: (lv_block_3_0= ruleBlock )
            	    // InternalStateMachineParser.g:242:5: lv_block_3_0= ruleBlock
            	    {

            	    					newCompositeNode(grammarAccess.getGateAccess().getBlockBlockParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_block_3_0=ruleBlock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"block",
            	    						lv_block_3_0,
            	    						"org.xtext.example.mydsl.StateMachine.Block");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getGateAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGate"


    // $ANTLR start "entryRuleBlock"
    // InternalStateMachineParser.g:267:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalStateMachineParser.g:267:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalStateMachineParser.g:268:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalStateMachineParser.g:274:1: ruleBlock returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSignVerticalLine ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStateMachineParser.g:280:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSignVerticalLine ( (otherlv_2= RULE_ID ) ) ) )
            // InternalStateMachineParser.g:281:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSignVerticalLine ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalStateMachineParser.g:281:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSignVerticalLine ( (otherlv_2= RULE_ID ) ) )
            // InternalStateMachineParser.g:282:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSignVerticalLine ( (otherlv_2= RULE_ID ) )
            {
            // InternalStateMachineParser.g:282:3: ( (otherlv_0= RULE_ID ) )
            // InternalStateMachineParser.g:283:4: (otherlv_0= RULE_ID )
            {
            // InternalStateMachineParser.g:283:4: (otherlv_0= RULE_ID )
            // InternalStateMachineParser.g:284:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBlockRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getActionInstructionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,EqualsSignGreaterThanSignVerticalLine,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getEqualsSignGreaterThanSignVerticalLineKeyword_1());
            		
            // InternalStateMachineParser.g:299:3: ( (otherlv_2= RULE_ID ) )
            // InternalStateMachineParser.g:300:4: (otherlv_2= RULE_ID )
            {
            // InternalStateMachineParser.g:300:4: (otherlv_2= RULE_ID )
            // InternalStateMachineParser.g:301:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBlockRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getStateStateCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleInstruction"
    // InternalStateMachineParser.g:316:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalStateMachineParser.g:316:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalStateMachineParser.g:317:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalStateMachineParser.g:323:1: ruleInstruction returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalStateMachineParser.g:329:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalStateMachineParser.g:330:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalStateMachineParser.g:330:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalStateMachineParser.g:331:3: (lv_name_0_0= RULE_ID )
            {
            // InternalStateMachineParser.g:331:3: (lv_name_0_0= RULE_ID )
            // InternalStateMachineParser.g:332:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getInstructionAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getInstructionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleEvent"
    // InternalStateMachineParser.g:351:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalStateMachineParser.g:351:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalStateMachineParser.g:352:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalStateMachineParser.g:358:1: ruleEvent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalStateMachineParser.g:364:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalStateMachineParser.g:365:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalStateMachineParser.g:365:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalStateMachineParser.g:366:3: (lv_name_0_0= RULE_ID )
            {
            // InternalStateMachineParser.g:366:3: (lv_name_0_0= RULE_ID )
            // InternalStateMachineParser.g:367:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEventRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleState"
    // InternalStateMachineParser.g:386:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateMachineParser.g:386:46: (iv_ruleState= ruleState EOF )
            // InternalStateMachineParser.g:387:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStateMachineParser.g:393:1: ruleState returns [EObject current=null] : (otherlv_0= State ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Block this_BEGIN_3= RULE_BEGIN (otherlv_4= Action ( (otherlv_5= RULE_ID ) )+ otherlv_6= EqualsSignGreaterThanSign )? ( (lv_moves_7_0= ruleMove ) )* this_END_8= RULE_END ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        EObject lv_moves_7_0 = null;



        	enterRule();

        try {
            // InternalStateMachineParser.g:399:2: ( (otherlv_0= State ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Block this_BEGIN_3= RULE_BEGIN (otherlv_4= Action ( (otherlv_5= RULE_ID ) )+ otherlv_6= EqualsSignGreaterThanSign )? ( (lv_moves_7_0= ruleMove ) )* this_END_8= RULE_END ) )
            // InternalStateMachineParser.g:400:2: (otherlv_0= State ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Block this_BEGIN_3= RULE_BEGIN (otherlv_4= Action ( (otherlv_5= RULE_ID ) )+ otherlv_6= EqualsSignGreaterThanSign )? ( (lv_moves_7_0= ruleMove ) )* this_END_8= RULE_END )
            {
            // InternalStateMachineParser.g:400:2: (otherlv_0= State ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Block this_BEGIN_3= RULE_BEGIN (otherlv_4= Action ( (otherlv_5= RULE_ID ) )+ otherlv_6= EqualsSignGreaterThanSign )? ( (lv_moves_7_0= ruleMove ) )* this_END_8= RULE_END )
            // InternalStateMachineParser.g:401:3: otherlv_0= State ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Block this_BEGIN_3= RULE_BEGIN (otherlv_4= Action ( (otherlv_5= RULE_ID ) )+ otherlv_6= EqualsSignGreaterThanSign )? ( (lv_moves_7_0= ruleMove ) )* this_END_8= RULE_END
            {
            otherlv_0=(Token)match(input,State,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalStateMachineParser.g:405:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateMachineParser.g:406:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateMachineParser.g:406:4: (lv_name_1_0= RULE_ID )
            // InternalStateMachineParser.g:407:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Block,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getBlockKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_12); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getStateAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalStateMachineParser.g:431:3: (otherlv_4= Action ( (otherlv_5= RULE_ID ) )+ otherlv_6= EqualsSignGreaterThanSign )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Action) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalStateMachineParser.g:432:4: otherlv_4= Action ( (otherlv_5= RULE_ID ) )+ otherlv_6= EqualsSignGreaterThanSign
                    {
                    otherlv_4=(Token)match(input,Action,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getActionKeyword_4_0());
                    			
                    // InternalStateMachineParser.g:436:4: ( (otherlv_5= RULE_ID ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalStateMachineParser.g:437:5: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalStateMachineParser.g:437:5: (otherlv_5= RULE_ID )
                    	    // InternalStateMachineParser.g:438:6: otherlv_5= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getStateRule());
                    	    						}
                    	    					
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getStateAccess().getActionsInstructionCrossReference_4_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    otherlv_6=(Token)match(input,EqualsSignGreaterThanSign,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getEqualsSignGreaterThanSignKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalStateMachineParser.g:454:3: ( (lv_moves_7_0= ruleMove ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Event) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalStateMachineParser.g:455:4: (lv_moves_7_0= ruleMove )
            	    {
            	    // InternalStateMachineParser.g:455:4: (lv_moves_7_0= ruleMove )
            	    // InternalStateMachineParser.g:456:5: lv_moves_7_0= ruleMove
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getMovesMoveParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_moves_7_0=ruleMove();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"moves",
            	    						lv_moves_7_0,
            	    						"org.xtext.example.mydsl.StateMachine.Move");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getStateAccess().getENDTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleMove"
    // InternalStateMachineParser.g:481:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalStateMachineParser.g:481:45: (iv_ruleMove= ruleMove EOF )
            // InternalStateMachineParser.g:482:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalStateMachineParser.g:488:1: ruleMove returns [EObject current=null] : (otherlv_0= Event ( (lv_event_1_0= ruleTrigger ) ) otherlv_2= To ( (otherlv_3= RULE_ID ) ) otherlv_4= State_1 ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_event_1_0 = null;



        	enterRule();

        try {
            // InternalStateMachineParser.g:494:2: ( (otherlv_0= Event ( (lv_event_1_0= ruleTrigger ) ) otherlv_2= To ( (otherlv_3= RULE_ID ) ) otherlv_4= State_1 ) )
            // InternalStateMachineParser.g:495:2: (otherlv_0= Event ( (lv_event_1_0= ruleTrigger ) ) otherlv_2= To ( (otherlv_3= RULE_ID ) ) otherlv_4= State_1 )
            {
            // InternalStateMachineParser.g:495:2: (otherlv_0= Event ( (lv_event_1_0= ruleTrigger ) ) otherlv_2= To ( (otherlv_3= RULE_ID ) ) otherlv_4= State_1 )
            // InternalStateMachineParser.g:496:3: otherlv_0= Event ( (lv_event_1_0= ruleTrigger ) ) otherlv_2= To ( (otherlv_3= RULE_ID ) ) otherlv_4= State_1
            {
            otherlv_0=(Token)match(input,Event,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getEventKeyword_0());
            		
            // InternalStateMachineParser.g:500:3: ( (lv_event_1_0= ruleTrigger ) )
            // InternalStateMachineParser.g:501:4: (lv_event_1_0= ruleTrigger )
            {
            // InternalStateMachineParser.g:501:4: (lv_event_1_0= ruleTrigger )
            // InternalStateMachineParser.g:502:5: lv_event_1_0= ruleTrigger
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getEventTriggerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_event_1_0=ruleTrigger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"event",
            						lv_event_1_0,
            						"org.xtext.example.mydsl.StateMachine.Trigger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,To,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getToKeyword_2());
            		
            // InternalStateMachineParser.g:523:3: ( (otherlv_3= RULE_ID ) )
            // InternalStateMachineParser.g:524:4: (otherlv_3= RULE_ID )
            {
            // InternalStateMachineParser.g:524:4: (otherlv_3= RULE_ID )
            // InternalStateMachineParser.g:525:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_3, grammarAccess.getMoveAccess().getStateStateCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,State_1,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMoveAccess().getStateKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleTrigger"
    // InternalStateMachineParser.g:544:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalStateMachineParser.g:544:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalStateMachineParser.g:545:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalStateMachineParser.g:551:1: ruleTrigger returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | this_Expression_1= ruleExpression ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalStateMachineParser.g:557:2: ( ( ( (otherlv_0= RULE_ID ) ) | this_Expression_1= ruleExpression ) )
            // InternalStateMachineParser.g:558:2: ( ( (otherlv_0= RULE_ID ) ) | this_Expression_1= ruleExpression )
            {
            // InternalStateMachineParser.g:558:2: ( ( (otherlv_0= RULE_ID ) ) | this_Expression_1= ruleExpression )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==LeftParenthesis||LA10_0==RULE_INT) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalStateMachineParser.g:559:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalStateMachineParser.g:559:3: ( (otherlv_0= RULE_ID ) )
                    // InternalStateMachineParser.g:560:4: (otherlv_0= RULE_ID )
                    {
                    // InternalStateMachineParser.g:560:4: (otherlv_0= RULE_ID )
                    // InternalStateMachineParser.g:561:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTriggerRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getTriggerAccess().getEventEventCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachineParser.g:573:3: this_Expression_1= ruleExpression
                    {

                    			newCompositeNode(grammarAccess.getTriggerAccess().getExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    			current = this_Expression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleExpression"
    // InternalStateMachineParser.g:585:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalStateMachineParser.g:585:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalStateMachineParser.g:586:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalStateMachineParser.g:592:1: ruleExpression returns [EObject current=null] : this_Equality_0= ruleEquality ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Equality_0 = null;



        	enterRule();

        try {
            // InternalStateMachineParser.g:598:2: (this_Equality_0= ruleEquality )
            // InternalStateMachineParser.g:599:2: this_Equality_0= ruleEquality
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getEqualityParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Equality_0=ruleEquality();

            state._fsp--;


            		current = this_Equality_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleEquality"
    // InternalStateMachineParser.g:610:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalStateMachineParser.g:610:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalStateMachineParser.g:611:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalStateMachineParser.g:617:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalStateMachineParser.g:623:2: ( (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* ) )
            // InternalStateMachineParser.g:624:2: (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* )
            {
            // InternalStateMachineParser.g:624:2: (this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )* )
            // InternalStateMachineParser.g:625:3: this_Comparison_0= ruleComparison ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateMachineParser.g:633:3: ( ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) ) | ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==EqualsSignEqualsSign) ) {
                    alt11=1;
                }
                else if ( (LA11_0==ExclamationMarkEqualsSign) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalStateMachineParser.g:634:4: ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) )
            	    {
            	    // InternalStateMachineParser.g:634:4: ( () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) ) )
            	    // InternalStateMachineParser.g:635:5: () otherlv_2= EqualsSignEqualsSign ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalStateMachineParser.g:635:5: ()
            	    // InternalStateMachineParser.g:636:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getEqualityAccess().getEqualLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,EqualsSignEqualsSign,FOLLOW_15); 

            	    					newLeafNode(otherlv_2, grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalStateMachineParser.g:646:5: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalStateMachineParser.g:647:6: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalStateMachineParser.g:647:6: (lv_right_3_0= ruleComparison )
            	    // InternalStateMachineParser.g:648:7: lv_right_3_0= ruleComparison
            	    {

            	    							newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"org.xtext.example.mydsl.StateMachine.Comparison");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStateMachineParser.g:667:4: ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) )
            	    {
            	    // InternalStateMachineParser.g:667:4: ( () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) ) )
            	    // InternalStateMachineParser.g:668:5: () otherlv_5= ExclamationMarkEqualsSign ( (lv_right_6_0= ruleComparison ) )
            	    {
            	    // InternalStateMachineParser.g:668:5: ()
            	    // InternalStateMachineParser.g:669:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getEqualityAccess().getUnequalLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_15); 

            	    					newLeafNode(otherlv_5, grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalStateMachineParser.g:679:5: ( (lv_right_6_0= ruleComparison ) )
            	    // InternalStateMachineParser.g:680:6: (lv_right_6_0= ruleComparison )
            	    {
            	    // InternalStateMachineParser.g:680:6: (lv_right_6_0= ruleComparison )
            	    // InternalStateMachineParser.g:681:7: lv_right_6_0= ruleComparison
            	    {

            	    							newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_18);
            	    lv_right_6_0=ruleComparison();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"org.xtext.example.mydsl.StateMachine.Comparison");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalStateMachineParser.g:704:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalStateMachineParser.g:704:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalStateMachineParser.g:705:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalStateMachineParser.g:711:1: ruleComparison returns [EObject current=null] : (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject this_SubAdd_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_12_0 = null;



        	enterRule();

        try {
            // InternalStateMachineParser.g:717:2: ( (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* ) )
            // InternalStateMachineParser.g:718:2: (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* )
            {
            // InternalStateMachineParser.g:718:2: (this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )* )
            // InternalStateMachineParser.g:719:3: this_SubAdd_0= ruleSubAdd ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getSubAddParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_SubAdd_0=ruleSubAdd();

            state._fsp--;


            			current = this_SubAdd_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateMachineParser.g:727:3: ( ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) ) | ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) ) | ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) ) | ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) ) )*
            loop12:
            do {
                int alt12=5;
                switch ( input.LA(1) ) {
                case LessThanSign:
                    {
                    alt12=1;
                    }
                    break;
                case LessThanSignEqualsSign:
                    {
                    alt12=2;
                    }
                    break;
                case GreaterThanSign:
                    {
                    alt12=3;
                    }
                    break;
                case GreaterThanSignEqualsSign:
                    {
                    alt12=4;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // InternalStateMachineParser.g:728:4: ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) )
            	    {
            	    // InternalStateMachineParser.g:728:4: ( () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) ) )
            	    // InternalStateMachineParser.g:729:5: () otherlv_2= LessThanSign ( (lv_right_3_0= ruleSubAdd ) )
            	    {
            	    // InternalStateMachineParser.g:729:5: ()
            	    // InternalStateMachineParser.g:730:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,LessThanSign,FOLLOW_15); 

            	    					newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_1());
            	    				
            	    // InternalStateMachineParser.g:740:5: ( (lv_right_3_0= ruleSubAdd ) )
            	    // InternalStateMachineParser.g:741:6: (lv_right_3_0= ruleSubAdd )
            	    {
            	    // InternalStateMachineParser.g:741:6: (lv_right_3_0= ruleSubAdd )
            	    // InternalStateMachineParser.g:742:7: lv_right_3_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleSubAdd();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"org.xtext.example.mydsl.StateMachine.SubAdd");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStateMachineParser.g:761:4: ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) )
            	    {
            	    // InternalStateMachineParser.g:761:4: ( () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) ) )
            	    // InternalStateMachineParser.g:762:5: () otherlv_5= LessThanSignEqualsSign ( (lv_right_6_0= ruleSubAdd ) )
            	    {
            	    // InternalStateMachineParser.g:762:5: ()
            	    // InternalStateMachineParser.g:763:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getLessThanEqualLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,LessThanSignEqualsSign,FOLLOW_15); 

            	    					newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalStateMachineParser.g:773:5: ( (lv_right_6_0= ruleSubAdd ) )
            	    // InternalStateMachineParser.g:774:6: (lv_right_6_0= ruleSubAdd )
            	    {
            	    // InternalStateMachineParser.g:774:6: (lv_right_6_0= ruleSubAdd )
            	    // InternalStateMachineParser.g:775:7: lv_right_6_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_19);
            	    lv_right_6_0=ruleSubAdd();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"org.xtext.example.mydsl.StateMachine.SubAdd");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalStateMachineParser.g:794:4: ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) )
            	    {
            	    // InternalStateMachineParser.g:794:4: ( () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) ) )
            	    // InternalStateMachineParser.g:795:5: () otherlv_8= GreaterThanSign ( (lv_right_9_0= ruleSubAdd ) )
            	    {
            	    // InternalStateMachineParser.g:795:5: ()
            	    // InternalStateMachineParser.g:796:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,GreaterThanSign,FOLLOW_15); 

            	    					newLeafNode(otherlv_8, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_2_1());
            	    				
            	    // InternalStateMachineParser.g:806:5: ( (lv_right_9_0= ruleSubAdd ) )
            	    // InternalStateMachineParser.g:807:6: (lv_right_9_0= ruleSubAdd )
            	    {
            	    // InternalStateMachineParser.g:807:6: (lv_right_9_0= ruleSubAdd )
            	    // InternalStateMachineParser.g:808:7: lv_right_9_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_19);
            	    lv_right_9_0=ruleSubAdd();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_9_0,
            	    								"org.xtext.example.mydsl.StateMachine.SubAdd");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalStateMachineParser.g:827:4: ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) )
            	    {
            	    // InternalStateMachineParser.g:827:4: ( () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) ) )
            	    // InternalStateMachineParser.g:828:5: () otherlv_11= GreaterThanSignEqualsSign ( (lv_right_12_0= ruleSubAdd ) )
            	    {
            	    // InternalStateMachineParser.g:828:5: ()
            	    // InternalStateMachineParser.g:829:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getComparisonAccess().getGreaterThanEqualLeftAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_11=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_15); 

            	    					newLeafNode(otherlv_11, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_3_1());
            	    				
            	    // InternalStateMachineParser.g:839:5: ( (lv_right_12_0= ruleSubAdd ) )
            	    // InternalStateMachineParser.g:840:6: (lv_right_12_0= ruleSubAdd )
            	    {
            	    // InternalStateMachineParser.g:840:6: (lv_right_12_0= ruleSubAdd )
            	    // InternalStateMachineParser.g:841:7: lv_right_12_0= ruleSubAdd
            	    {

            	    							newCompositeNode(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_19);
            	    lv_right_12_0=ruleSubAdd();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_12_0,
            	    								"org.xtext.example.mydsl.StateMachine.SubAdd");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleSubAdd"
    // InternalStateMachineParser.g:864:1: entryRuleSubAdd returns [EObject current=null] : iv_ruleSubAdd= ruleSubAdd EOF ;
    public final EObject entryRuleSubAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAdd = null;


        try {
            // InternalStateMachineParser.g:864:47: (iv_ruleSubAdd= ruleSubAdd EOF )
            // InternalStateMachineParser.g:865:2: iv_ruleSubAdd= ruleSubAdd EOF
            {
             newCompositeNode(grammarAccess.getSubAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubAdd=ruleSubAdd();

            state._fsp--;

             current =iv_ruleSubAdd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubAdd"


    // $ANTLR start "ruleSubAdd"
    // InternalStateMachineParser.g:871:1: ruleSubAdd returns [EObject current=null] : (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* ) ;
    public final EObject ruleSubAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_MulDiv_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalStateMachineParser.g:877:2: ( (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* ) )
            // InternalStateMachineParser.g:878:2: (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* )
            {
            // InternalStateMachineParser.g:878:2: (this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )* )
            // InternalStateMachineParser.g:879:3: this_MulDiv_0= ruleMulDiv ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getSubAddAccess().getMulDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_MulDiv_0=ruleMulDiv();

            state._fsp--;


            			current = this_MulDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateMachineParser.g:887:3: ( ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) ) | ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==PlusSign) ) {
                    alt13=1;
                }
                else if ( (LA13_0==HyphenMinus) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalStateMachineParser.g:888:4: ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) )
            	    {
            	    // InternalStateMachineParser.g:888:4: ( () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) ) )
            	    // InternalStateMachineParser.g:889:5: () otherlv_2= PlusSign ( (lv_right_3_0= ruleMulDiv ) )
            	    {
            	    // InternalStateMachineParser.g:889:5: ()
            	    // InternalStateMachineParser.g:890:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getSubAddAccess().getPlusLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,PlusSign,FOLLOW_15); 

            	    					newLeafNode(otherlv_2, grammarAccess.getSubAddAccess().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalStateMachineParser.g:900:5: ( (lv_right_3_0= ruleMulDiv ) )
            	    // InternalStateMachineParser.g:901:6: (lv_right_3_0= ruleMulDiv )
            	    {
            	    // InternalStateMachineParser.g:901:6: (lv_right_3_0= ruleMulDiv )
            	    // InternalStateMachineParser.g:902:7: lv_right_3_0= ruleMulDiv
            	    {

            	    							newCompositeNode(grammarAccess.getSubAddAccess().getRightMulDivParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleMulDiv();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getSubAddRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"org.xtext.example.mydsl.StateMachine.MulDiv");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStateMachineParser.g:921:4: ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) )
            	    {
            	    // InternalStateMachineParser.g:921:4: ( () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) ) )
            	    // InternalStateMachineParser.g:922:5: () otherlv_5= HyphenMinus ( (lv_right_6_0= ruleMulDiv ) )
            	    {
            	    // InternalStateMachineParser.g:922:5: ()
            	    // InternalStateMachineParser.g:923:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getSubAddAccess().getMinusLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,HyphenMinus,FOLLOW_15); 

            	    					newLeafNode(otherlv_5, grammarAccess.getSubAddAccess().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalStateMachineParser.g:933:5: ( (lv_right_6_0= ruleMulDiv ) )
            	    // InternalStateMachineParser.g:934:6: (lv_right_6_0= ruleMulDiv )
            	    {
            	    // InternalStateMachineParser.g:934:6: (lv_right_6_0= ruleMulDiv )
            	    // InternalStateMachineParser.g:935:7: lv_right_6_0= ruleMulDiv
            	    {

            	    							newCompositeNode(grammarAccess.getSubAddAccess().getRightMulDivParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_20);
            	    lv_right_6_0=ruleMulDiv();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getSubAddRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"org.xtext.example.mydsl.StateMachine.MulDiv");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubAdd"


    // $ANTLR start "entryRuleMulDiv"
    // InternalStateMachineParser.g:958:1: entryRuleMulDiv returns [EObject current=null] : iv_ruleMulDiv= ruleMulDiv EOF ;
    public final EObject entryRuleMulDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulDiv = null;


        try {
            // InternalStateMachineParser.g:958:47: (iv_ruleMulDiv= ruleMulDiv EOF )
            // InternalStateMachineParser.g:959:2: iv_ruleMulDiv= ruleMulDiv EOF
            {
             newCompositeNode(grammarAccess.getMulDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulDiv=ruleMulDiv();

            state._fsp--;

             current =iv_ruleMulDiv; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulDiv"


    // $ANTLR start "ruleMulDiv"
    // InternalStateMachineParser.g:965:1: ruleMulDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( () otherlv_2= Asterisk ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= rulePrimary ) ) ) )* ) ;
    public final EObject ruleMulDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalStateMachineParser.g:971:2: ( (this_Primary_0= rulePrimary ( ( () otherlv_2= Asterisk ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= rulePrimary ) ) ) )* ) )
            // InternalStateMachineParser.g:972:2: (this_Primary_0= rulePrimary ( ( () otherlv_2= Asterisk ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= rulePrimary ) ) ) )* )
            {
            // InternalStateMachineParser.g:972:2: (this_Primary_0= rulePrimary ( ( () otherlv_2= Asterisk ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= rulePrimary ) ) ) )* )
            // InternalStateMachineParser.g:973:3: this_Primary_0= rulePrimary ( ( () otherlv_2= Asterisk ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= rulePrimary ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateMachineParser.g:981:3: ( ( () otherlv_2= Asterisk ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= Solidus ( (lv_right_6_0= rulePrimary ) ) ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Asterisk) ) {
                    alt14=1;
                }
                else if ( (LA14_0==Solidus) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalStateMachineParser.g:982:4: ( () otherlv_2= Asterisk ( (lv_right_3_0= rulePrimary ) ) )
            	    {
            	    // InternalStateMachineParser.g:982:4: ( () otherlv_2= Asterisk ( (lv_right_3_0= rulePrimary ) ) )
            	    // InternalStateMachineParser.g:983:5: () otherlv_2= Asterisk ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalStateMachineParser.g:983:5: ()
            	    // InternalStateMachineParser.g:984:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMulDivAccess().getMulLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,Asterisk,FOLLOW_15); 

            	    					newLeafNode(otherlv_2, grammarAccess.getMulDivAccess().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalStateMachineParser.g:994:5: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalStateMachineParser.g:995:6: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalStateMachineParser.g:995:6: (lv_right_3_0= rulePrimary )
            	    // InternalStateMachineParser.g:996:7: lv_right_3_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getMulDivAccess().getRightPrimaryParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMulDivRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"org.xtext.example.mydsl.StateMachine.Primary");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStateMachineParser.g:1015:4: ( () otherlv_5= Solidus ( (lv_right_6_0= rulePrimary ) ) )
            	    {
            	    // InternalStateMachineParser.g:1015:4: ( () otherlv_5= Solidus ( (lv_right_6_0= rulePrimary ) ) )
            	    // InternalStateMachineParser.g:1016:5: () otherlv_5= Solidus ( (lv_right_6_0= rulePrimary ) )
            	    {
            	    // InternalStateMachineParser.g:1016:5: ()
            	    // InternalStateMachineParser.g:1017:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMulDivAccess().getDivLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,Solidus,FOLLOW_15); 

            	    					newLeafNode(otherlv_5, grammarAccess.getMulDivAccess().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalStateMachineParser.g:1027:5: ( (lv_right_6_0= rulePrimary ) )
            	    // InternalStateMachineParser.g:1028:6: (lv_right_6_0= rulePrimary )
            	    {
            	    // InternalStateMachineParser.g:1028:6: (lv_right_6_0= rulePrimary )
            	    // InternalStateMachineParser.g:1029:7: lv_right_6_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getMulDivAccess().getRightPrimaryParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_21);
            	    lv_right_6_0=rulePrimary();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMulDivRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"org.xtext.example.mydsl.StateMachine.Primary");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalStateMachineParser.g:1052:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalStateMachineParser.g:1052:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalStateMachineParser.g:1053:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalStateMachineParser.g:1059:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Number_3= ruleNumber ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_Number_3 = null;



        	enterRule();

        try {
            // InternalStateMachineParser.g:1065:2: ( ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Number_3= ruleNumber ) )
            // InternalStateMachineParser.g:1066:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Number_3= ruleNumber )
            {
            // InternalStateMachineParser.g:1066:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | this_Number_3= ruleNumber )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LeftParenthesis) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_INT) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalStateMachineParser.g:1067:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    {
                    // InternalStateMachineParser.g:1067:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    // InternalStateMachineParser.g:1068:4: otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_22);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachineParser.g:1086:3: this_Number_3= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_3=ruleNumber();

                    state._fsp--;


                    			current = this_Number_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleNumber"
    // InternalStateMachineParser.g:1098:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalStateMachineParser.g:1098:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalStateMachineParser.g:1099:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalStateMachineParser.g:1105:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalStateMachineParser.g:1111:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalStateMachineParser.g:1112:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalStateMachineParser.g:1112:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalStateMachineParser.g:1113:3: (lv_value_0_0= RULE_INT )
            {
            // InternalStateMachineParser.g:1113:3: (lv_value_0_0= RULE_INT )
            // InternalStateMachineParser.g:1114:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.mydsl.StateMachine.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000440L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000140100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C048002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002400002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200000L});

}