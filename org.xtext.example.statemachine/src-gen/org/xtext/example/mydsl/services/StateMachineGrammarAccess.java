/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class StateMachineGrammarAccess extends AbstractGrammarElementFinder {
	
	public class StateMachineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.StateMachine.StateMachine");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStateMachineAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEventKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBlockKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cEventAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cEventEventParserRuleCall_4_0 = (RuleCall)cEventAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cStopKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cResetKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cBlockKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cLeftParenthesisKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cEventResetAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final CrossReference cEventResetEventCrossReference_10_0 = (CrossReference)cEventResetAssignment_10.eContents().get(0);
		private final RuleCall cEventResetEventIDTerminalRuleCall_10_0_1 = (RuleCall)cEventResetEventCrossReference_10_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cStopKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cInstructionsKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cBlockKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cLeftParenthesisKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cInstructionsAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cInstructionsInstructionParserRuleCall_16_0 = (RuleCall)cInstructionsAssignment_16.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cStopKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Assignment cStateAssignment_19 = (Assignment)cGroup.eContents().get(19);
		private final RuleCall cStateStateParserRuleCall_19_0 = (RuleCall)cStateAssignment_19.eContents().get(0);
		
		//StateMachine:
		//	{StateMachine}
		//	"Event" "block" "(" event+=Event* ")" "stop"
		//	"Reset" "block" "(" eventReset+=[Event]* ")" "stop"
		//	"Instructions" "block" "(" instructions+=Instruction* ")" "stop"
		//	state+=State*;
		@Override public ParserRule getRule() { return rule; }
		
		//{StateMachine} "Event" "block" "(" event+=Event* ")" "stop" "Reset" "block" "(" eventReset+=[Event]* ")" "stop"
		//"Instructions" "block" "(" instructions+=Instruction* ")" "stop" state+=State*
		public Group getGroup() { return cGroup; }
		
		//{StateMachine}
		public Action getStateMachineAction_0() { return cStateMachineAction_0; }
		
		//"Event"
		public Keyword getEventKeyword_1() { return cEventKeyword_1; }
		
		//"block"
		public Keyword getBlockKeyword_2() { return cBlockKeyword_2; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }
		
		//event+=Event*
		public Assignment getEventAssignment_4() { return cEventAssignment_4; }
		
		//Event
		public RuleCall getEventEventParserRuleCall_4_0() { return cEventEventParserRuleCall_4_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
		
		//"stop"
		public Keyword getStopKeyword_6() { return cStopKeyword_6; }
		
		//"Reset"
		public Keyword getResetKeyword_7() { return cResetKeyword_7; }
		
		//"block"
		public Keyword getBlockKeyword_8() { return cBlockKeyword_8; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_9() { return cLeftParenthesisKeyword_9; }
		
		//eventReset+=[Event]*
		public Assignment getEventResetAssignment_10() { return cEventResetAssignment_10; }
		
		//[Event]
		public CrossReference getEventResetEventCrossReference_10_0() { return cEventResetEventCrossReference_10_0; }
		
		//ID
		public RuleCall getEventResetEventIDTerminalRuleCall_10_0_1() { return cEventResetEventIDTerminalRuleCall_10_0_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_11() { return cRightParenthesisKeyword_11; }
		
		//"stop"
		public Keyword getStopKeyword_12() { return cStopKeyword_12; }
		
		//"Instructions"
		public Keyword getInstructionsKeyword_13() { return cInstructionsKeyword_13; }
		
		//"block"
		public Keyword getBlockKeyword_14() { return cBlockKeyword_14; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_15() { return cLeftParenthesisKeyword_15; }
		
		//instructions+=Instruction*
		public Assignment getInstructionsAssignment_16() { return cInstructionsAssignment_16; }
		
		//Instruction
		public RuleCall getInstructionsInstructionParserRuleCall_16_0() { return cInstructionsInstructionParserRuleCall_16_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_17() { return cRightParenthesisKeyword_17; }
		
		//"stop"
		public Keyword getStopKeyword_18() { return cStopKeyword_18; }
		
		//state+=State*
		public Assignment getStateAssignment_19() { return cStateAssignment_19; }
		
		//State
		public RuleCall getStateStateParserRuleCall_19_0() { return cStateStateParserRuleCall_19_0; }
	}
	public class InstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.StateMachine.Instruction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueIDTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//Instruction:
		//	name=ID value=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID value=ID
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//value=ID
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//ID
		public RuleCall getValueIDTerminalRuleCall_1_0() { return cValueIDTerminalRuleCall_1_0; }
	}
	public class EventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.StateMachine.Event");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueIDTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//Event:
		//	name=ID value=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID value=ID
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//value=ID
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//ID
		public RuleCall getValueIDTerminalRuleCall_1_0() { return cValueIDTerminalRuleCall_1_0; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.StateMachine.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cBlockKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cActionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cActionsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cActionsInstructionCrossReference_4_1_0 = (CrossReference)cActionsAssignment_4_1.eContents().get(0);
		private final RuleCall cActionsInstructionIDTerminalRuleCall_4_1_0_1 = (RuleCall)cActionsInstructionCrossReference_4_1_0.eContents().get(1);
		private final Assignment cMovesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cMovesMoveParserRuleCall_5_0 = (RuleCall)cMovesAssignment_5.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cStopKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//State:
		//	"State" name=ID "block" "(" ("action" actions+=[Instruction]+)?
		//	moves+=Move* ")" "stop";
		@Override public ParserRule getRule() { return rule; }
		
		//"State" name=ID "block" "(" ("action" actions+=[Instruction]+)? moves+=Move* ")" "stop"
		public Group getGroup() { return cGroup; }
		
		//"State"
		public Keyword getStateKeyword_0() { return cStateKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"block"
		public Keyword getBlockKeyword_2() { return cBlockKeyword_2; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }
		
		//("action" actions+=[Instruction]+)?
		public Group getGroup_4() { return cGroup_4; }
		
		//"action"
		public Keyword getActionKeyword_4_0() { return cActionKeyword_4_0; }
		
		//actions+=[Instruction]+
		public Assignment getActionsAssignment_4_1() { return cActionsAssignment_4_1; }
		
		//[Instruction]
		public CrossReference getActionsInstructionCrossReference_4_1_0() { return cActionsInstructionCrossReference_4_1_0; }
		
		//ID
		public RuleCall getActionsInstructionIDTerminalRuleCall_4_1_0_1() { return cActionsInstructionIDTerminalRuleCall_4_1_0_1; }
		
		//moves+=Move*
		public Assignment getMovesAssignment_5() { return cMovesAssignment_5; }
		
		//Move
		public RuleCall getMovesMoveParserRuleCall_5_0() { return cMovesMoveParserRuleCall_5_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
		
		//"stop"
		public Keyword getStopKeyword_7() { return cStopKeyword_7; }
	}
	public class MoveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.StateMachine.Move");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEventAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cEventEventCrossReference_0_0 = (CrossReference)cEventAssignment_0.eContents().get(0);
		private final RuleCall cEventEventIDTerminalRuleCall_0_0_1 = (RuleCall)cEventEventCrossReference_0_0.eContents().get(1);
		private final Keyword cToKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cStateAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cStateStateCrossReference_2_0 = (CrossReference)cStateAssignment_2.eContents().get(0);
		private final RuleCall cStateStateIDTerminalRuleCall_2_0_1 = (RuleCall)cStateStateCrossReference_2_0.eContents().get(1);
		
		//Move:
		//	event=[Event] "to" state=[State];
		@Override public ParserRule getRule() { return rule; }
		
		//event=[Event] "to" state=[State]
		public Group getGroup() { return cGroup; }
		
		//event=[Event]
		public Assignment getEventAssignment_0() { return cEventAssignment_0; }
		
		//[Event]
		public CrossReference getEventEventCrossReference_0_0() { return cEventEventCrossReference_0_0; }
		
		//ID
		public RuleCall getEventEventIDTerminalRuleCall_0_0_1() { return cEventEventIDTerminalRuleCall_0_0_1; }
		
		//"to"
		public Keyword getToKeyword_1() { return cToKeyword_1; }
		
		//state=[State]
		public Assignment getStateAssignment_2() { return cStateAssignment_2; }
		
		//[State]
		public CrossReference getStateStateCrossReference_2_0() { return cStateStateCrossReference_2_0; }
		
		//ID
		public RuleCall getStateStateIDTerminalRuleCall_2_0_1() { return cStateStateIDTerminalRuleCall_2_0_1; }
	}
	
	
	private final StateMachineElements pStateMachine;
	private final InstructionElements pInstruction;
	private final EventElements pEvent;
	private final StateElements pState;
	private final MoveElements pMove;
	private final TerminalRule tSTRING;
	private final TerminalRule tDOUBLE;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public StateMachineGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pStateMachine = new StateMachineElements();
		this.pInstruction = new InstructionElements();
		this.pEvent = new EventElements();
		this.pState = new StateElements();
		this.pMove = new MoveElements();
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.StateMachine.STRING");
		this.tDOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.StateMachine.DOUBLE");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.StateMachine".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//StateMachine:
	//	{StateMachine}
	//	"Event" "block" "(" event+=Event* ")" "stop"
	//	"Reset" "block" "(" eventReset+=[Event]* ")" "stop"
	//	"Instructions" "block" "(" instructions+=Instruction* ")" "stop"
	//	state+=State*;
	public StateMachineElements getStateMachineAccess() {
		return pStateMachine;
	}
	
	public ParserRule getStateMachineRule() {
		return getStateMachineAccess().getRule();
	}
	
	//Instruction:
	//	name=ID value=ID;
	public InstructionElements getInstructionAccess() {
		return pInstruction;
	}
	
	public ParserRule getInstructionRule() {
		return getInstructionAccess().getRule();
	}
	
	//Event:
	//	name=ID value=ID;
	public EventElements getEventAccess() {
		return pEvent;
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}
	
	//State:
	//	"State" name=ID "block" "(" ("action" actions+=[Instruction]+)?
	//	moves+=Move* ")" "stop";
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//Move:
	//	event=[Event] "to" state=[State];
	public MoveElements getMoveAccess() {
		return pMove;
	}
	
	public ParserRule getMoveRule() {
		return getMoveAccess().getRule();
	}
	
	//@Override
	//terminal STRING:
	//	'"' ('\\' ('b' | 't' | 'n' | 'f' | 'r' | 'u' | '"' | "'" | '\\') | !('\\' | '"'))* '"' |
	//	"'" ('\\' ('b' | 't' | 'n' | 'f' | 'r' | 'u' | '"' | "'" | '\\') | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return tSTRING;
	}
	
	//terminal DOUBLE:
	//	INT '.' INT;
	public TerminalRule getDOUBLERule() {
		return tDOUBLE;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
