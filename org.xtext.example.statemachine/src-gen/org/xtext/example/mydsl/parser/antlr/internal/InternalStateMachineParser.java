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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Actions", "Events", "Action", "Reset", "State", "Block", "To", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Action=6;
    public static final int RULE_END=15;
    public static final int RULE_BEGIN=14;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=18;
    public static final int RULE_DOUBLE=13;
    public static final int Events=5;
    public static final int To=10;
    public static final int Reset=7;
    public static final int EOF=-1;
    public static final int RULE_ID=16;
    public static final int Actions=4;
    public static final int RULE_WS=19;
    public static final int RULE_ANY_OTHER=20;
    public static final int State=8;
    public static final int RULE_INT=12;
    public static final int RULE_ML_COMMENT=17;
    public static final int Block=9;

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
    // InternalStateMachineParser.g:64:1: ruleStateMachine returns [EObject current=null] : ( () (otherlv_1= Events otherlv_2= Block this_BEGIN_3= RULE_BEGIN ( (lv_event_4_0= ruleEvent ) )+ this_END_5= RULE_END ) (otherlv_6= Reset otherlv_7= Block this_BEGIN_8= RULE_BEGIN ( (otherlv_9= RULE_ID ) )* this_END_10= RULE_END ) (otherlv_11= Actions otherlv_12= Block this_BEGIN_13= RULE_BEGIN ( (lv_instructions_14_0= ruleInstruction ) )* this_END_15= RULE_END ) ( (lv_state_16_0= ruleState ) )* ) ;
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
        EObject lv_event_4_0 = null;

        EObject lv_instructions_14_0 = null;

        EObject lv_state_16_0 = null;



        	enterRule();

        try {
            // InternalStateMachineParser.g:70:2: ( ( () (otherlv_1= Events otherlv_2= Block this_BEGIN_3= RULE_BEGIN ( (lv_event_4_0= ruleEvent ) )+ this_END_5= RULE_END ) (otherlv_6= Reset otherlv_7= Block this_BEGIN_8= RULE_BEGIN ( (otherlv_9= RULE_ID ) )* this_END_10= RULE_END ) (otherlv_11= Actions otherlv_12= Block this_BEGIN_13= RULE_BEGIN ( (lv_instructions_14_0= ruleInstruction ) )* this_END_15= RULE_END ) ( (lv_state_16_0= ruleState ) )* ) )
            // InternalStateMachineParser.g:71:2: ( () (otherlv_1= Events otherlv_2= Block this_BEGIN_3= RULE_BEGIN ( (lv_event_4_0= ruleEvent ) )+ this_END_5= RULE_END ) (otherlv_6= Reset otherlv_7= Block this_BEGIN_8= RULE_BEGIN ( (otherlv_9= RULE_ID ) )* this_END_10= RULE_END ) (otherlv_11= Actions otherlv_12= Block this_BEGIN_13= RULE_BEGIN ( (lv_instructions_14_0= ruleInstruction ) )* this_END_15= RULE_END ) ( (lv_state_16_0= ruleState ) )* )
            {
            // InternalStateMachineParser.g:71:2: ( () (otherlv_1= Events otherlv_2= Block this_BEGIN_3= RULE_BEGIN ( (lv_event_4_0= ruleEvent ) )+ this_END_5= RULE_END ) (otherlv_6= Reset otherlv_7= Block this_BEGIN_8= RULE_BEGIN ( (otherlv_9= RULE_ID ) )* this_END_10= RULE_END ) (otherlv_11= Actions otherlv_12= Block this_BEGIN_13= RULE_BEGIN ( (lv_instructions_14_0= ruleInstruction ) )* this_END_15= RULE_END ) ( (lv_state_16_0= ruleState ) )* )
            // InternalStateMachineParser.g:72:3: () (otherlv_1= Events otherlv_2= Block this_BEGIN_3= RULE_BEGIN ( (lv_event_4_0= ruleEvent ) )+ this_END_5= RULE_END ) (otherlv_6= Reset otherlv_7= Block this_BEGIN_8= RULE_BEGIN ( (otherlv_9= RULE_ID ) )* this_END_10= RULE_END ) (otherlv_11= Actions otherlv_12= Block this_BEGIN_13= RULE_BEGIN ( (lv_instructions_14_0= ruleInstruction ) )* this_END_15= RULE_END ) ( (lv_state_16_0= ruleState ) )*
            {
            // InternalStateMachineParser.g:72:3: ()
            // InternalStateMachineParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateMachineAccess().getStateMachineAction_0(),
            					current);
            			

            }

            // InternalStateMachineParser.g:79:3: (otherlv_1= Events otherlv_2= Block this_BEGIN_3= RULE_BEGIN ( (lv_event_4_0= ruleEvent ) )+ this_END_5= RULE_END )
            // InternalStateMachineParser.g:80:4: otherlv_1= Events otherlv_2= Block this_BEGIN_3= RULE_BEGIN ( (lv_event_4_0= ruleEvent ) )+ this_END_5= RULE_END
            {
            otherlv_1=(Token)match(input,Events,FOLLOW_3); 

            				newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getEventsKeyword_1_0());
            			
            otherlv_2=(Token)match(input,Block,FOLLOW_4); 

            				newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getBlockKeyword_1_1());
            			
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_5); 

            				newLeafNode(this_BEGIN_3, grammarAccess.getStateMachineAccess().getBEGINTerminalRuleCall_1_2());
            			
            // InternalStateMachineParser.g:92:4: ( (lv_event_4_0= ruleEvent ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStateMachineParser.g:93:5: (lv_event_4_0= ruleEvent )
            	    {
            	    // InternalStateMachineParser.g:93:5: (lv_event_4_0= ruleEvent )
            	    // InternalStateMachineParser.g:94:6: lv_event_4_0= ruleEvent
            	    {

            	    						newCompositeNode(grammarAccess.getStateMachineAccess().getEventEventParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_6);
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            this_END_5=(Token)match(input,RULE_END,FOLLOW_7); 

            				newLeafNode(this_END_5, grammarAccess.getStateMachineAccess().getENDTerminalRuleCall_1_4());
            			

            }

            // InternalStateMachineParser.g:116:3: (otherlv_6= Reset otherlv_7= Block this_BEGIN_8= RULE_BEGIN ( (otherlv_9= RULE_ID ) )* this_END_10= RULE_END )
            // InternalStateMachineParser.g:117:4: otherlv_6= Reset otherlv_7= Block this_BEGIN_8= RULE_BEGIN ( (otherlv_9= RULE_ID ) )* this_END_10= RULE_END
            {
            otherlv_6=(Token)match(input,Reset,FOLLOW_3); 

            				newLeafNode(otherlv_6, grammarAccess.getStateMachineAccess().getResetKeyword_2_0());
            			
            otherlv_7=(Token)match(input,Block,FOLLOW_4); 

            				newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getBlockKeyword_2_1());
            			
            this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            				newLeafNode(this_BEGIN_8, grammarAccess.getStateMachineAccess().getBEGINTerminalRuleCall_2_2());
            			
            // InternalStateMachineParser.g:129:4: ( (otherlv_9= RULE_ID ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStateMachineParser.g:130:5: (otherlv_9= RULE_ID )
            	    {
            	    // InternalStateMachineParser.g:130:5: (otherlv_9= RULE_ID )
            	    // InternalStateMachineParser.g:131:6: otherlv_9= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStateMachineRule());
            	    						}
            	    					
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    						newLeafNode(otherlv_9, grammarAccess.getStateMachineAccess().getEventResetEventCrossReference_2_3_0());
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            this_END_10=(Token)match(input,RULE_END,FOLLOW_8); 

            				newLeafNode(this_END_10, grammarAccess.getStateMachineAccess().getENDTerminalRuleCall_2_4());
            			

            }

            // InternalStateMachineParser.g:147:3: (otherlv_11= Actions otherlv_12= Block this_BEGIN_13= RULE_BEGIN ( (lv_instructions_14_0= ruleInstruction ) )* this_END_15= RULE_END )
            // InternalStateMachineParser.g:148:4: otherlv_11= Actions otherlv_12= Block this_BEGIN_13= RULE_BEGIN ( (lv_instructions_14_0= ruleInstruction ) )* this_END_15= RULE_END
            {
            otherlv_11=(Token)match(input,Actions,FOLLOW_3); 

            				newLeafNode(otherlv_11, grammarAccess.getStateMachineAccess().getActionsKeyword_3_0());
            			
            otherlv_12=(Token)match(input,Block,FOLLOW_4); 

            				newLeafNode(otherlv_12, grammarAccess.getStateMachineAccess().getBlockKeyword_3_1());
            			
            this_BEGIN_13=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            				newLeafNode(this_BEGIN_13, grammarAccess.getStateMachineAccess().getBEGINTerminalRuleCall_3_2());
            			
            // InternalStateMachineParser.g:160:4: ( (lv_instructions_14_0= ruleInstruction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStateMachineParser.g:161:5: (lv_instructions_14_0= ruleInstruction )
            	    {
            	    // InternalStateMachineParser.g:161:5: (lv_instructions_14_0= ruleInstruction )
            	    // InternalStateMachineParser.g:162:6: lv_instructions_14_0= ruleInstruction
            	    {

            	    						newCompositeNode(grammarAccess.getStateMachineAccess().getInstructionsInstructionParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_6);
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
            	    break loop3;
                }
            } while (true);

            this_END_15=(Token)match(input,RULE_END,FOLLOW_9); 

            				newLeafNode(this_END_15, grammarAccess.getStateMachineAccess().getENDTerminalRuleCall_3_4());
            			

            }

            // InternalStateMachineParser.g:184:3: ( (lv_state_16_0= ruleState ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==State) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStateMachineParser.g:185:4: (lv_state_16_0= ruleState )
            	    {
            	    // InternalStateMachineParser.g:185:4: (lv_state_16_0= ruleState )
            	    // InternalStateMachineParser.g:186:5: lv_state_16_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getStateMachineAccess().getStateStateParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            	    break loop4;
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


    // $ANTLR start "entryRuleInstruction"
    // InternalStateMachineParser.g:207:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalStateMachineParser.g:207:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalStateMachineParser.g:208:2: iv_ruleInstruction= ruleInstruction EOF
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
    // InternalStateMachineParser.g:214:1: ruleInstruction returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalStateMachineParser.g:220:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalStateMachineParser.g:221:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalStateMachineParser.g:221:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalStateMachineParser.g:222:3: (lv_name_0_0= RULE_ID )
            {
            // InternalStateMachineParser.g:222:3: (lv_name_0_0= RULE_ID )
            // InternalStateMachineParser.g:223:4: lv_name_0_0= RULE_ID
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
    // InternalStateMachineParser.g:242:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalStateMachineParser.g:242:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalStateMachineParser.g:243:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalStateMachineParser.g:249:1: ruleEvent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalStateMachineParser.g:255:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalStateMachineParser.g:256:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalStateMachineParser.g:256:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalStateMachineParser.g:257:3: (lv_name_0_0= RULE_ID )
            {
            // InternalStateMachineParser.g:257:3: (lv_name_0_0= RULE_ID )
            // InternalStateMachineParser.g:258:4: lv_name_0_0= RULE_ID
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
    // InternalStateMachineParser.g:277:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateMachineParser.g:277:46: (iv_ruleState= ruleState EOF )
            // InternalStateMachineParser.g:278:2: iv_ruleState= ruleState EOF
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
    // InternalStateMachineParser.g:284:1: ruleState returns [EObject current=null] : (otherlv_0= State ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Block this_BEGIN_3= RULE_BEGIN (otherlv_4= Action ( (otherlv_5= RULE_ID ) )+ )? ( (lv_moves_6_0= ruleMove ) )* this_END_7= RULE_END ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_END_7=null;
        EObject lv_moves_6_0 = null;



        	enterRule();

        try {
            // InternalStateMachineParser.g:290:2: ( (otherlv_0= State ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Block this_BEGIN_3= RULE_BEGIN (otherlv_4= Action ( (otherlv_5= RULE_ID ) )+ )? ( (lv_moves_6_0= ruleMove ) )* this_END_7= RULE_END ) )
            // InternalStateMachineParser.g:291:2: (otherlv_0= State ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Block this_BEGIN_3= RULE_BEGIN (otherlv_4= Action ( (otherlv_5= RULE_ID ) )+ )? ( (lv_moves_6_0= ruleMove ) )* this_END_7= RULE_END )
            {
            // InternalStateMachineParser.g:291:2: (otherlv_0= State ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Block this_BEGIN_3= RULE_BEGIN (otherlv_4= Action ( (otherlv_5= RULE_ID ) )+ )? ( (lv_moves_6_0= ruleMove ) )* this_END_7= RULE_END )
            // InternalStateMachineParser.g:292:3: otherlv_0= State ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Block this_BEGIN_3= RULE_BEGIN (otherlv_4= Action ( (otherlv_5= RULE_ID ) )+ )? ( (lv_moves_6_0= ruleMove ) )* this_END_7= RULE_END
            {
            otherlv_0=(Token)match(input,State,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalStateMachineParser.g:296:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateMachineParser.g:297:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateMachineParser.g:297:4: (lv_name_1_0= RULE_ID )
            // InternalStateMachineParser.g:298:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

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

            otherlv_2=(Token)match(input,Block,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getBlockKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getStateAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalStateMachineParser.g:322:3: (otherlv_4= Action ( (otherlv_5= RULE_ID ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Action) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalStateMachineParser.g:323:4: otherlv_4= Action ( (otherlv_5= RULE_ID ) )+
                    {
                    otherlv_4=(Token)match(input,Action,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getActionKeyword_4_0());
                    			
                    // InternalStateMachineParser.g:327:4: ( (otherlv_5= RULE_ID ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            int LA5_1 = input.LA(2);

                            if ( ((LA5_1>=RULE_END && LA5_1<=RULE_ID)) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalStateMachineParser.g:328:5: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalStateMachineParser.g:328:5: (otherlv_5= RULE_ID )
                    	    // InternalStateMachineParser.g:329:6: otherlv_5= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getStateRule());
                    	    						}
                    	    					
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_6); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getStateAccess().getActionsInstructionCrossReference_4_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }

            // InternalStateMachineParser.g:341:3: ( (lv_moves_6_0= ruleMove ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalStateMachineParser.g:342:4: (lv_moves_6_0= ruleMove )
            	    {
            	    // InternalStateMachineParser.g:342:4: (lv_moves_6_0= ruleMove )
            	    // InternalStateMachineParser.g:343:5: lv_moves_6_0= ruleMove
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getMovesMoveParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_moves_6_0=ruleMove();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"moves",
            	    						lv_moves_6_0,
            	    						"org.xtext.example.mydsl.StateMachine.Move");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_7, grammarAccess.getStateAccess().getENDTerminalRuleCall_6());
            		

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
    // InternalStateMachineParser.g:368:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalStateMachineParser.g:368:45: (iv_ruleMove= ruleMove EOF )
            // InternalStateMachineParser.g:369:2: iv_ruleMove= ruleMove EOF
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
    // InternalStateMachineParser.g:375:1: ruleMove returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= To ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStateMachineParser.g:381:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= To ( (otherlv_2= RULE_ID ) ) ) )
            // InternalStateMachineParser.g:382:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= To ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalStateMachineParser.g:382:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= To ( (otherlv_2= RULE_ID ) ) )
            // InternalStateMachineParser.g:383:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= To ( (otherlv_2= RULE_ID ) )
            {
            // InternalStateMachineParser.g:383:3: ( (otherlv_0= RULE_ID ) )
            // InternalStateMachineParser.g:384:4: (otherlv_0= RULE_ID )
            {
            // InternalStateMachineParser.g:384:4: (otherlv_0= RULE_ID )
            // InternalStateMachineParser.g:385:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getEventEventCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,To,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getToKeyword_1());
            		
            // InternalStateMachineParser.g:400:3: ( (otherlv_2= RULE_ID ) )
            // InternalStateMachineParser.g:401:4: (otherlv_2= RULE_ID )
            {
            // InternalStateMachineParser.g:401:4: (otherlv_2= RULE_ID )
            // InternalStateMachineParser.g:402:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getStateStateCrossReference_2_0());
            				

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
    // $ANTLR end "ruleMove"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000400L});

}