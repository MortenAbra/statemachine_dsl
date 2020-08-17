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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Name'", "'Event'", "'block'", "'('", "')'", "'stop'", "'Reset'", "'Instructions'", "'State'", "'action'", "'to'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalStateMachine.g:71:1: ruleStateMachine returns [EObject current=null] : (otherlv_0= 'Name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Event' otherlv_3= 'block' otherlv_4= '(' ( (lv_event_5_0= ruleEvent ) )* otherlv_6= ')' otherlv_7= 'stop' otherlv_8= 'Reset' otherlv_9= 'block' otherlv_10= '(' ( (otherlv_11= RULE_ID ) )* otherlv_12= ')' otherlv_13= 'stop' otherlv_14= 'Instructions' otherlv_15= 'block' otherlv_16= '(' ( (lv_instructions_17_0= ruleInstruction ) )* otherlv_18= ')' otherlv_19= 'stop' ( (lv_state_20_0= ruleState ) )* )* ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_event_5_0 = null;

        EObject lv_instructions_17_0 = null;

        EObject lv_state_20_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:77:2: ( (otherlv_0= 'Name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Event' otherlv_3= 'block' otherlv_4= '(' ( (lv_event_5_0= ruleEvent ) )* otherlv_6= ')' otherlv_7= 'stop' otherlv_8= 'Reset' otherlv_9= 'block' otherlv_10= '(' ( (otherlv_11= RULE_ID ) )* otherlv_12= ')' otherlv_13= 'stop' otherlv_14= 'Instructions' otherlv_15= 'block' otherlv_16= '(' ( (lv_instructions_17_0= ruleInstruction ) )* otherlv_18= ')' otherlv_19= 'stop' ( (lv_state_20_0= ruleState ) )* )* )
            // InternalStateMachine.g:78:2: (otherlv_0= 'Name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Event' otherlv_3= 'block' otherlv_4= '(' ( (lv_event_5_0= ruleEvent ) )* otherlv_6= ')' otherlv_7= 'stop' otherlv_8= 'Reset' otherlv_9= 'block' otherlv_10= '(' ( (otherlv_11= RULE_ID ) )* otherlv_12= ')' otherlv_13= 'stop' otherlv_14= 'Instructions' otherlv_15= 'block' otherlv_16= '(' ( (lv_instructions_17_0= ruleInstruction ) )* otherlv_18= ')' otherlv_19= 'stop' ( (lv_state_20_0= ruleState ) )* )*
            {
            // InternalStateMachine.g:78:2: (otherlv_0= 'Name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Event' otherlv_3= 'block' otherlv_4= '(' ( (lv_event_5_0= ruleEvent ) )* otherlv_6= ')' otherlv_7= 'stop' otherlv_8= 'Reset' otherlv_9= 'block' otherlv_10= '(' ( (otherlv_11= RULE_ID ) )* otherlv_12= ')' otherlv_13= 'stop' otherlv_14= 'Instructions' otherlv_15= 'block' otherlv_16= '(' ( (lv_instructions_17_0= ruleInstruction ) )* otherlv_18= ')' otherlv_19= 'stop' ( (lv_state_20_0= ruleState ) )* )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalStateMachine.g:79:3: otherlv_0= 'Name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Event' otherlv_3= 'block' otherlv_4= '(' ( (lv_event_5_0= ruleEvent ) )* otherlv_6= ')' otherlv_7= 'stop' otherlv_8= 'Reset' otherlv_9= 'block' otherlv_10= '(' ( (otherlv_11= RULE_ID ) )* otherlv_12= ')' otherlv_13= 'stop' otherlv_14= 'Instructions' otherlv_15= 'block' otherlv_16= '(' ( (lv_instructions_17_0= ruleInstruction ) )* otherlv_18= ')' otherlv_19= 'stop' ( (lv_state_20_0= ruleState ) )*
            	    {
            	    otherlv_0=(Token)match(input,12,FOLLOW_3); 

            	    			newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getNameKeyword_0());
            	    		
            	    // InternalStateMachine.g:83:3: ( (lv_name_1_0= RULE_STRING ) )
            	    // InternalStateMachine.g:84:4: (lv_name_1_0= RULE_STRING )
            	    {
            	    // InternalStateMachine.g:84:4: (lv_name_1_0= RULE_STRING )
            	    // InternalStateMachine.g:85:5: lv_name_1_0= RULE_STRING
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	    					newLeafNode(lv_name_1_0, grammarAccess.getStateMachineAccess().getNameSTRINGTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getStateMachineRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"name",
            	    						lv_name_1_0,
            	    						"org.xtext.example.mydsl.StateMachine.STRING");
            	    				

            	    }


            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_5); 

            	    			newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getEventKeyword_2());
            	    		
            	    otherlv_3=(Token)match(input,14,FOLLOW_6); 

            	    			newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getBlockKeyword_3());
            	    		
            	    otherlv_4=(Token)match(input,15,FOLLOW_7); 

            	    			newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getLeftParenthesisKeyword_4());
            	    		
            	    // InternalStateMachine.g:113:3: ( (lv_event_5_0= ruleEvent ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==RULE_ID) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalStateMachine.g:114:4: (lv_event_5_0= ruleEvent )
            	    	    {
            	    	    // InternalStateMachine.g:114:4: (lv_event_5_0= ruleEvent )
            	    	    // InternalStateMachine.g:115:5: lv_event_5_0= ruleEvent
            	    	    {

            	    	    					newCompositeNode(grammarAccess.getStateMachineAccess().getEventEventParserRuleCall_5_0());
            	    	    				
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_event_5_0=ruleEvent();

            	    	    state._fsp--;


            	    	    					if (current==null) {
            	    	    						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	    					}
            	    	    					add(
            	    	    						current,
            	    	    						"event",
            	    	    						lv_event_5_0,
            	    	    						"org.xtext.example.mydsl.StateMachine.Event");
            	    	    					afterParserOrEnumRuleCall();
            	    	    				

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);

            	    otherlv_6=(Token)match(input,16,FOLLOW_8); 

            	    			newLeafNode(otherlv_6, grammarAccess.getStateMachineAccess().getRightParenthesisKeyword_6());
            	    		
            	    otherlv_7=(Token)match(input,17,FOLLOW_9); 

            	    			newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getStopKeyword_7());
            	    		
            	    otherlv_8=(Token)match(input,18,FOLLOW_5); 

            	    			newLeafNode(otherlv_8, grammarAccess.getStateMachineAccess().getResetKeyword_8());
            	    		
            	    otherlv_9=(Token)match(input,14,FOLLOW_6); 

            	    			newLeafNode(otherlv_9, grammarAccess.getStateMachineAccess().getBlockKeyword_9());
            	    		
            	    otherlv_10=(Token)match(input,15,FOLLOW_7); 

            	    			newLeafNode(otherlv_10, grammarAccess.getStateMachineAccess().getLeftParenthesisKeyword_10());
            	    		
            	    // InternalStateMachine.g:152:3: ( (otherlv_11= RULE_ID ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==RULE_ID) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalStateMachine.g:153:4: (otherlv_11= RULE_ID )
            	    	    {
            	    	    // InternalStateMachine.g:153:4: (otherlv_11= RULE_ID )
            	    	    // InternalStateMachine.g:154:5: otherlv_11= RULE_ID
            	    	    {

            	    	    					if (current==null) {
            	    	    						current = createModelElement(grammarAccess.getStateMachineRule());
            	    	    					}
            	    	    				
            	    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    	    					newLeafNode(otherlv_11, grammarAccess.getStateMachineAccess().getEventResetEventCrossReference_11_0());
            	    	    				

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,16,FOLLOW_8); 

            	    			newLeafNode(otherlv_12, grammarAccess.getStateMachineAccess().getRightParenthesisKeyword_12());
            	    		
            	    otherlv_13=(Token)match(input,17,FOLLOW_10); 

            	    			newLeafNode(otherlv_13, grammarAccess.getStateMachineAccess().getStopKeyword_13());
            	    		
            	    otherlv_14=(Token)match(input,19,FOLLOW_5); 

            	    			newLeafNode(otherlv_14, grammarAccess.getStateMachineAccess().getInstructionsKeyword_14());
            	    		
            	    otherlv_15=(Token)match(input,14,FOLLOW_6); 

            	    			newLeafNode(otherlv_15, grammarAccess.getStateMachineAccess().getBlockKeyword_15());
            	    		
            	    otherlv_16=(Token)match(input,15,FOLLOW_7); 

            	    			newLeafNode(otherlv_16, grammarAccess.getStateMachineAccess().getLeftParenthesisKeyword_16());
            	    		
            	    // InternalStateMachine.g:185:3: ( (lv_instructions_17_0= ruleInstruction ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==RULE_ID) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalStateMachine.g:186:4: (lv_instructions_17_0= ruleInstruction )
            	    	    {
            	    	    // InternalStateMachine.g:186:4: (lv_instructions_17_0= ruleInstruction )
            	    	    // InternalStateMachine.g:187:5: lv_instructions_17_0= ruleInstruction
            	    	    {

            	    	    					newCompositeNode(grammarAccess.getStateMachineAccess().getInstructionsInstructionParserRuleCall_17_0());
            	    	    				
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_instructions_17_0=ruleInstruction();

            	    	    state._fsp--;


            	    	    					if (current==null) {
            	    	    						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	    					}
            	    	    					add(
            	    	    						current,
            	    	    						"instructions",
            	    	    						lv_instructions_17_0,
            	    	    						"org.xtext.example.mydsl.StateMachine.Instruction");
            	    	    					afterParserOrEnumRuleCall();
            	    	    				

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    otherlv_18=(Token)match(input,16,FOLLOW_8); 

            	    			newLeafNode(otherlv_18, grammarAccess.getStateMachineAccess().getRightParenthesisKeyword_18());
            	    		
            	    otherlv_19=(Token)match(input,17,FOLLOW_11); 

            	    			newLeafNode(otherlv_19, grammarAccess.getStateMachineAccess().getStopKeyword_19());
            	    		
            	    // InternalStateMachine.g:212:3: ( (lv_state_20_0= ruleState ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==20) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalStateMachine.g:213:4: (lv_state_20_0= ruleState )
            	    	    {
            	    	    // InternalStateMachine.g:213:4: (lv_state_20_0= ruleState )
            	    	    // InternalStateMachine.g:214:5: lv_state_20_0= ruleState
            	    	    {

            	    	    					newCompositeNode(grammarAccess.getStateMachineAccess().getStateStateParserRuleCall_20_0());
            	    	    				
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_state_20_0=ruleState();

            	    	    state._fsp--;


            	    	    					if (current==null) {
            	    	    						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	    					}
            	    	    					add(
            	    	    						current,
            	    	    						"state",
            	    	    						lv_state_20_0,
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
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // InternalStateMachine.g:235:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalStateMachine.g:235:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalStateMachine.g:236:2: iv_ruleInstruction= ruleInstruction EOF
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
    // InternalStateMachine.g:242:1: ruleInstruction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_ID ) ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:248:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_ID ) ) ) )
            // InternalStateMachine.g:249:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_ID ) ) )
            {
            // InternalStateMachine.g:249:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_ID ) ) )
            // InternalStateMachine.g:250:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_ID ) )
            {
            // InternalStateMachine.g:250:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalStateMachine.g:251:4: (lv_name_0_0= RULE_ID )
            {
            // InternalStateMachine.g:251:4: (lv_name_0_0= RULE_ID )
            // InternalStateMachine.g:252:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInstructionAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            // InternalStateMachine.g:268:3: ( (lv_value_1_0= RULE_ID ) )
            // InternalStateMachine.g:269:4: (lv_value_1_0= RULE_ID )
            {
            // InternalStateMachine.g:269:4: (lv_value_1_0= RULE_ID )
            // InternalStateMachine.g:270:5: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getInstructionAccess().getValueIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstructionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleEvent"
    // InternalStateMachine.g:290:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalStateMachine.g:290:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalStateMachine.g:291:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalStateMachine.g:297:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalStateMachine.g:303:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_ID ) ) ) )
            // InternalStateMachine.g:304:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_ID ) ) )
            {
            // InternalStateMachine.g:304:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_ID ) ) )
            // InternalStateMachine.g:305:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_ID ) )
            {
            // InternalStateMachine.g:305:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalStateMachine.g:306:4: (lv_name_0_0= RULE_ID )
            {
            // InternalStateMachine.g:306:4: (lv_name_0_0= RULE_ID )
            // InternalStateMachine.g:307:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            // InternalStateMachine.g:323:3: ( (lv_value_1_0= RULE_ID ) )
            // InternalStateMachine.g:324:4: (lv_value_1_0= RULE_ID )
            {
            // InternalStateMachine.g:324:4: (lv_value_1_0= RULE_ID )
            // InternalStateMachine.g:325:5: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getEventAccess().getValueIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleState"
    // InternalStateMachine.g:345:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateMachine.g:345:46: (iv_ruleState= ruleState EOF )
            // InternalStateMachine.g:346:2: iv_ruleState= ruleState EOF
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
    // InternalStateMachine.g:352:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'block' otherlv_3= '(' (otherlv_4= 'action' ( (otherlv_5= RULE_ID ) )+ )? ( (lv_moves_6_0= ruleMove ) )* otherlv_7= ')' otherlv_8= 'stop' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_moves_6_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:358:2: ( (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'block' otherlv_3= '(' (otherlv_4= 'action' ( (otherlv_5= RULE_ID ) )+ )? ( (lv_moves_6_0= ruleMove ) )* otherlv_7= ')' otherlv_8= 'stop' ) )
            // InternalStateMachine.g:359:2: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'block' otherlv_3= '(' (otherlv_4= 'action' ( (otherlv_5= RULE_ID ) )+ )? ( (lv_moves_6_0= ruleMove ) )* otherlv_7= ')' otherlv_8= 'stop' )
            {
            // InternalStateMachine.g:359:2: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'block' otherlv_3= '(' (otherlv_4= 'action' ( (otherlv_5= RULE_ID ) )+ )? ( (lv_moves_6_0= ruleMove ) )* otherlv_7= ')' otherlv_8= 'stop' )
            // InternalStateMachine.g:360:3: otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'block' otherlv_3= '(' (otherlv_4= 'action' ( (otherlv_5= RULE_ID ) )+ )? ( (lv_moves_6_0= ruleMove ) )* otherlv_7= ')' otherlv_8= 'stop'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalStateMachine.g:364:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateMachine.g:365:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateMachine.g:365:4: (lv_name_1_0= RULE_ID )
            // InternalStateMachine.g:366:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getBlockKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftParenthesisKeyword_3());
            		
            // InternalStateMachine.g:390:3: (otherlv_4= 'action' ( (otherlv_5= RULE_ID ) )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalStateMachine.g:391:4: otherlv_4= 'action' ( (otherlv_5= RULE_ID ) )+
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getActionKeyword_4_0());
                    			
                    // InternalStateMachine.g:395:4: ( (otherlv_5= RULE_ID ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            int LA6_1 = input.LA(2);

                            if ( (LA6_1==RULE_ID||LA6_1==16) ) {
                                alt6=1;
                            }


                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalStateMachine.g:396:5: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalStateMachine.g:396:5: (otherlv_5= RULE_ID )
                    	    // InternalStateMachine.g:397:6: otherlv_5= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getStateRule());
                    	    						}
                    	    					
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getStateAccess().getActionsInstructionCrossReference_4_1_0());
                    	    					

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


                    }
                    break;

            }

            // InternalStateMachine.g:409:3: ( (lv_moves_6_0= ruleMove ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalStateMachine.g:410:4: (lv_moves_6_0= ruleMove )
            	    {
            	    // InternalStateMachine.g:410:4: (lv_moves_6_0= ruleMove )
            	    // InternalStateMachine.g:411:5: lv_moves_6_0= ruleMove
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getMovesMoveParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
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
            	    break loop8;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getStateAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getStateAccess().getStopKeyword_7());
            		

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
    // InternalStateMachine.g:440:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalStateMachine.g:440:45: (iv_ruleMove= ruleMove EOF )
            // InternalStateMachine.g:441:2: iv_ruleMove= ruleMove EOF
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
    // InternalStateMachine.g:447:1: ruleMove returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalStateMachine.g:453:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalStateMachine.g:454:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalStateMachine.g:454:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (otherlv_2= RULE_ID ) ) )
            // InternalStateMachine.g:455:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (otherlv_2= RULE_ID ) )
            {
            // InternalStateMachine.g:455:3: ( (otherlv_0= RULE_ID ) )
            // InternalStateMachine.g:456:4: (otherlv_0= RULE_ID )
            {
            // InternalStateMachine.g:456:4: (otherlv_0= RULE_ID )
            // InternalStateMachine.g:457:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getEventEventCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getToKeyword_1());
            		
            // InternalStateMachine.g:472:3: ( (otherlv_2= RULE_ID ) )
            // InternalStateMachine.g:473:4: (otherlv_2= RULE_ID )
            {
            // InternalStateMachine.g:473:4: (otherlv_2= RULE_ID )
            // InternalStateMachine.g:474:5: otherlv_2= RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000101002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000210020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});

}