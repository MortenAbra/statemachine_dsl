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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Events'", "'block'", "'{'", "'}'", "'Reset'", "'Actions'", "'State'", "'action'", "'to'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=7;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalStateMachineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateMachineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateMachineParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStateMachine.g"; }



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
    // InternalStateMachine.g:64:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalStateMachine.g:64:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalStateMachine.g:65:2: iv_ruleStateMachine= ruleStateMachine EOF
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
    // InternalStateMachine.g:71:1: ruleStateMachine returns [EObject current=null] : ( () (otherlv_1= 'Events' otherlv_2= 'block' otherlv_3= '{' ( (lv_event_4_0= ruleEvent ) )+ otherlv_5= '}' ) (otherlv_6= 'Reset' otherlv_7= 'block' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) (otherlv_11= 'Actions' otherlv_12= 'block' otherlv_13= '{' ( (lv_instructions_14_0= ruleInstruction ) )* otherlv_15= '}' ) ( (lv_state_16_0= ruleState ) )* ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_event_4_0 = null;

        EObject lv_instructions_14_0 = null;

        EObject lv_state_16_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:77:2: ( ( () (otherlv_1= 'Events' otherlv_2= 'block' otherlv_3= '{' ( (lv_event_4_0= ruleEvent ) )+ otherlv_5= '}' ) (otherlv_6= 'Reset' otherlv_7= 'block' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) (otherlv_11= 'Actions' otherlv_12= 'block' otherlv_13= '{' ( (lv_instructions_14_0= ruleInstruction ) )* otherlv_15= '}' ) ( (lv_state_16_0= ruleState ) )* ) )
            // InternalStateMachine.g:78:2: ( () (otherlv_1= 'Events' otherlv_2= 'block' otherlv_3= '{' ( (lv_event_4_0= ruleEvent ) )+ otherlv_5= '}' ) (otherlv_6= 'Reset' otherlv_7= 'block' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) (otherlv_11= 'Actions' otherlv_12= 'block' otherlv_13= '{' ( (lv_instructions_14_0= ruleInstruction ) )* otherlv_15= '}' ) ( (lv_state_16_0= ruleState ) )* )
            {
            // InternalStateMachine.g:78:2: ( () (otherlv_1= 'Events' otherlv_2= 'block' otherlv_3= '{' ( (lv_event_4_0= ruleEvent ) )+ otherlv_5= '}' ) (otherlv_6= 'Reset' otherlv_7= 'block' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) (otherlv_11= 'Actions' otherlv_12= 'block' otherlv_13= '{' ( (lv_instructions_14_0= ruleInstruction ) )* otherlv_15= '}' ) ( (lv_state_16_0= ruleState ) )* )
            // InternalStateMachine.g:79:3: () (otherlv_1= 'Events' otherlv_2= 'block' otherlv_3= '{' ( (lv_event_4_0= ruleEvent ) )+ otherlv_5= '}' ) (otherlv_6= 'Reset' otherlv_7= 'block' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) (otherlv_11= 'Actions' otherlv_12= 'block' otherlv_13= '{' ( (lv_instructions_14_0= ruleInstruction ) )* otherlv_15= '}' ) ( (lv_state_16_0= ruleState ) )*
            {
            // InternalStateMachine.g:79:3: ()
            // InternalStateMachine.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateMachineAccess().getStateMachineAction_0(),
            					current);
            			

            }

            // InternalStateMachine.g:86:3: (otherlv_1= 'Events' otherlv_2= 'block' otherlv_3= '{' ( (lv_event_4_0= ruleEvent ) )+ otherlv_5= '}' )
            // InternalStateMachine.g:87:4: otherlv_1= 'Events' otherlv_2= 'block' otherlv_3= '{' ( (lv_event_4_0= ruleEvent ) )+ otherlv_5= '}'
            {
            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            				newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getEventsKeyword_1_0());
            			
            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            				newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getBlockKeyword_1_1());
            			
            otherlv_3=(Token)match(input,14,FOLLOW_5); 

            				newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_1_2());
            			
            // InternalStateMachine.g:99:4: ( (lv_event_4_0= ruleEvent ) )+
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
            	    // InternalStateMachine.g:100:5: (lv_event_4_0= ruleEvent )
            	    {
            	    // InternalStateMachine.g:100:5: (lv_event_4_0= ruleEvent )
            	    // InternalStateMachine.g:101:6: lv_event_4_0= ruleEvent
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

            otherlv_5=(Token)match(input,15,FOLLOW_7); 

            				newLeafNode(otherlv_5, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_1_4());
            			

            }

            // InternalStateMachine.g:123:3: (otherlv_6= 'Reset' otherlv_7= 'block' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' )
            // InternalStateMachine.g:124:4: otherlv_6= 'Reset' otherlv_7= 'block' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}'
            {
            otherlv_6=(Token)match(input,16,FOLLOW_3); 

            				newLeafNode(otherlv_6, grammarAccess.getStateMachineAccess().getResetKeyword_2_0());
            			
            otherlv_7=(Token)match(input,13,FOLLOW_4); 

            				newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getBlockKeyword_2_1());
            			
            otherlv_8=(Token)match(input,14,FOLLOW_6); 

            				newLeafNode(otherlv_8, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2_2());
            			
            // InternalStateMachine.g:136:4: ( (otherlv_9= RULE_ID ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStateMachine.g:137:5: (otherlv_9= RULE_ID )
            	    {
            	    // InternalStateMachine.g:137:5: (otherlv_9= RULE_ID )
            	    // InternalStateMachine.g:138:6: otherlv_9= RULE_ID
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

            otherlv_10=(Token)match(input,15,FOLLOW_8); 

            				newLeafNode(otherlv_10, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_2_4());
            			

            }

            // InternalStateMachine.g:154:3: (otherlv_11= 'Actions' otherlv_12= 'block' otherlv_13= '{' ( (lv_instructions_14_0= ruleInstruction ) )* otherlv_15= '}' )
            // InternalStateMachine.g:155:4: otherlv_11= 'Actions' otherlv_12= 'block' otherlv_13= '{' ( (lv_instructions_14_0= ruleInstruction ) )* otherlv_15= '}'
            {
            otherlv_11=(Token)match(input,17,FOLLOW_3); 

            				newLeafNode(otherlv_11, grammarAccess.getStateMachineAccess().getActionsKeyword_3_0());
            			
            otherlv_12=(Token)match(input,13,FOLLOW_4); 

            				newLeafNode(otherlv_12, grammarAccess.getStateMachineAccess().getBlockKeyword_3_1());
            			
            otherlv_13=(Token)match(input,14,FOLLOW_6); 

            				newLeafNode(otherlv_13, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_3_2());
            			
            // InternalStateMachine.g:167:4: ( (lv_instructions_14_0= ruleInstruction ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStateMachine.g:168:5: (lv_instructions_14_0= ruleInstruction )
            	    {
            	    // InternalStateMachine.g:168:5: (lv_instructions_14_0= ruleInstruction )
            	    // InternalStateMachine.g:169:6: lv_instructions_14_0= ruleInstruction
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

            otherlv_15=(Token)match(input,15,FOLLOW_9); 

            				newLeafNode(otherlv_15, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_3_4());
            			

            }

            // InternalStateMachine.g:191:3: ( (lv_state_16_0= ruleState ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStateMachine.g:192:4: (lv_state_16_0= ruleState )
            	    {
            	    // InternalStateMachine.g:192:4: (lv_state_16_0= ruleState )
            	    // InternalStateMachine.g:193:5: lv_state_16_0= ruleState
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
    // InternalStateMachine.g:214:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalStateMachine.g:214:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalStateMachine.g:215:2: iv_ruleInstruction= ruleInstruction EOF
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
    // InternalStateMachine.g:221:1: ruleInstruction returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:227:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalStateMachine.g:228:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalStateMachine.g:228:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalStateMachine.g:229:3: (lv_name_0_0= RULE_ID )
            {
            // InternalStateMachine.g:229:3: (lv_name_0_0= RULE_ID )
            // InternalStateMachine.g:230:4: lv_name_0_0= RULE_ID
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
    // InternalStateMachine.g:249:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalStateMachine.g:249:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalStateMachine.g:250:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalStateMachine.g:256:1: ruleEvent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:262:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalStateMachine.g:263:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalStateMachine.g:263:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalStateMachine.g:264:3: (lv_name_0_0= RULE_ID )
            {
            // InternalStateMachine.g:264:3: (lv_name_0_0= RULE_ID )
            // InternalStateMachine.g:265:4: lv_name_0_0= RULE_ID
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
    // InternalStateMachine.g:284:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateMachine.g:284:46: (iv_ruleState= ruleState EOF )
            // InternalStateMachine.g:285:2: iv_ruleState= ruleState EOF
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
    // InternalStateMachine.g:291:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'block' otherlv_3= '{' (otherlv_4= 'action' ( (otherlv_5= RULE_ID ) )+ )? ( (lv_moves_6_0= ruleMove ) )* otherlv_7= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_moves_6_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:297:2: ( (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'block' otherlv_3= '{' (otherlv_4= 'action' ( (otherlv_5= RULE_ID ) )+ )? ( (lv_moves_6_0= ruleMove ) )* otherlv_7= '}' ) )
            // InternalStateMachine.g:298:2: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'block' otherlv_3= '{' (otherlv_4= 'action' ( (otherlv_5= RULE_ID ) )+ )? ( (lv_moves_6_0= ruleMove ) )* otherlv_7= '}' )
            {
            // InternalStateMachine.g:298:2: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'block' otherlv_3= '{' (otherlv_4= 'action' ( (otherlv_5= RULE_ID ) )+ )? ( (lv_moves_6_0= ruleMove ) )* otherlv_7= '}' )
            // InternalStateMachine.g:299:3: otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'block' otherlv_3= '{' (otherlv_4= 'action' ( (otherlv_5= RULE_ID ) )+ )? ( (lv_moves_6_0= ruleMove ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalStateMachine.g:303:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateMachine.g:304:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateMachine.g:304:4: (lv_name_1_0= RULE_ID )
            // InternalStateMachine.g:305:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getBlockKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalStateMachine.g:329:3: (otherlv_4= 'action' ( (otherlv_5= RULE_ID ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalStateMachine.g:330:4: otherlv_4= 'action' ( (otherlv_5= RULE_ID ) )+
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getActionKeyword_4_0());
                    			
                    // InternalStateMachine.g:334:4: ( (otherlv_5= RULE_ID ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1==RULE_ID||LA5_1==15) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalStateMachine.g:335:5: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalStateMachine.g:335:5: (otherlv_5= RULE_ID )
                    	    // InternalStateMachine.g:336:6: otherlv_5= RULE_ID
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

            // InternalStateMachine.g:348:3: ( (lv_moves_6_0= ruleMove ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalStateMachine.g:349:4: (lv_moves_6_0= ruleMove )
            	    {
            	    // InternalStateMachine.g:349:4: (lv_moves_6_0= ruleMove )
            	    // InternalStateMachine.g:350:5: lv_moves_6_0= ruleMove
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

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalStateMachine.g:375:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalStateMachine.g:375:45: (iv_ruleMove= ruleMove EOF )
            // InternalStateMachine.g:376:2: iv_ruleMove= ruleMove EOF
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
    // InternalStateMachine.g:382:1: ruleMove returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStateMachine.g:388:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalStateMachine.g:389:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalStateMachine.g:389:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (otherlv_2= RULE_ID ) ) )
            // InternalStateMachine.g:390:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (otherlv_2= RULE_ID ) )
            {
            // InternalStateMachine.g:390:3: ( (otherlv_0= RULE_ID ) )
            // InternalStateMachine.g:391:4: (otherlv_0= RULE_ID )
            {
            // InternalStateMachine.g:391:4: (otherlv_0= RULE_ID )
            // InternalStateMachine.g:392:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getEventEventCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getToKeyword_1());
            		
            // InternalStateMachine.g:407:3: ( (otherlv_2= RULE_ID ) )
            // InternalStateMachine.g:408:4: (otherlv_2= RULE_ID )
            {
            // InternalStateMachine.g:408:4: (otherlv_2= RULE_ID )
            // InternalStateMachine.g:409:5: otherlv_2= RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000088010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});

}