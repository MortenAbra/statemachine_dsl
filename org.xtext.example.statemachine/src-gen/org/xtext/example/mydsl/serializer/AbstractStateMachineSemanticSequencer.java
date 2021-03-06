/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.services.StateMachineGrammarAccess;
import org.xtext.example.mydsl.stateMachine.Block;
import org.xtext.example.mydsl.stateMachine.Div;
import org.xtext.example.mydsl.stateMachine.Equal;
import org.xtext.example.mydsl.stateMachine.Event;
import org.xtext.example.mydsl.stateMachine.Gate;
import org.xtext.example.mydsl.stateMachine.GreaterThan;
import org.xtext.example.mydsl.stateMachine.GreaterThanEqual;
import org.xtext.example.mydsl.stateMachine.Instruction;
import org.xtext.example.mydsl.stateMachine.LessThan;
import org.xtext.example.mydsl.stateMachine.LessThanEqual;
import org.xtext.example.mydsl.stateMachine.Minus;
import org.xtext.example.mydsl.stateMachine.Move;
import org.xtext.example.mydsl.stateMachine.Mul;
import org.xtext.example.mydsl.stateMachine.Plus;
import org.xtext.example.mydsl.stateMachine.State;
import org.xtext.example.mydsl.stateMachine.StateMachine;
import org.xtext.example.mydsl.stateMachine.StateMachinePackage;
import org.xtext.example.mydsl.stateMachine.Trigger;
import org.xtext.example.mydsl.stateMachine.Unequal;

@SuppressWarnings("all")
public abstract class AbstractStateMachineSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private StateMachineGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == StateMachinePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case StateMachinePackage.BLOCK:
				sequence_Block(context, (Block) semanticObject); 
				return; 
			case StateMachinePackage.DIV:
				sequence_MulDiv(context, (Div) semanticObject); 
				return; 
			case StateMachinePackage.EQUAL:
				sequence_Equality(context, (Equal) semanticObject); 
				return; 
			case StateMachinePackage.EVENT:
				sequence_Event(context, (Event) semanticObject); 
				return; 
			case StateMachinePackage.GATE:
				sequence_Gate(context, (Gate) semanticObject); 
				return; 
			case StateMachinePackage.GREATER_THAN:
				sequence_Comparison(context, (GreaterThan) semanticObject); 
				return; 
			case StateMachinePackage.GREATER_THAN_EQUAL:
				sequence_Comparison(context, (GreaterThanEqual) semanticObject); 
				return; 
			case StateMachinePackage.INSTRUCTION:
				sequence_Instruction(context, (Instruction) semanticObject); 
				return; 
			case StateMachinePackage.LESS_THAN:
				sequence_Comparison(context, (LessThan) semanticObject); 
				return; 
			case StateMachinePackage.LESS_THAN_EQUAL:
				sequence_Comparison(context, (LessThanEqual) semanticObject); 
				return; 
			case StateMachinePackage.MINUS:
				sequence_SubAdd(context, (Minus) semanticObject); 
				return; 
			case StateMachinePackage.MOVE:
				sequence_Move(context, (Move) semanticObject); 
				return; 
			case StateMachinePackage.MUL:
				sequence_MulDiv(context, (Mul) semanticObject); 
				return; 
			case StateMachinePackage.NUMBER:
				sequence_Number(context, (org.xtext.example.mydsl.stateMachine.Number) semanticObject); 
				return; 
			case StateMachinePackage.PLUS:
				sequence_SubAdd(context, (Plus) semanticObject); 
				return; 
			case StateMachinePackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case StateMachinePackage.STATE_MACHINE:
				sequence_StateMachine(context, (StateMachine) semanticObject); 
				return; 
			case StateMachinePackage.TRIGGER:
				sequence_Trigger(context, (Trigger) semanticObject); 
				return; 
			case StateMachinePackage.UNEQUAL:
				sequence_Equality(context, (Unequal) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Block returns Block
	 *
	 * Constraint:
	 *     (action=[Instruction|ID] state=[State|ID])
	 */
	protected void sequence_Block(ISerializationContext context, Block semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.BLOCK__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.BLOCK__ACTION));
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.BLOCK__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.BLOCK__STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBlockAccess().getActionInstructionIDTerminalRuleCall_0_0_1(), semanticObject.eGet(StateMachinePackage.Literals.BLOCK__ACTION, false));
		feeder.accept(grammarAccess.getBlockAccess().getStateStateIDTerminalRuleCall_2_0_1(), semanticObject.eGet(StateMachinePackage.Literals.BLOCK__STATE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Trigger returns GreaterThan
	 *     Expression returns GreaterThan
	 *     Equality returns GreaterThan
	 *     Equality.Equal_1_0_0 returns GreaterThan
	 *     Equality.Unequal_1_1_0 returns GreaterThan
	 *     Comparison returns GreaterThan
	 *     Comparison.LessThan_1_0_0 returns GreaterThan
	 *     Comparison.LessThanEqual_1_1_0 returns GreaterThan
	 *     Comparison.GreaterThan_1_2_0 returns GreaterThan
	 *     Comparison.GreaterThanEqual_1_3_0 returns GreaterThan
	 *     SubAdd returns GreaterThan
	 *     SubAdd.Plus_1_0_0 returns GreaterThan
	 *     SubAdd.Minus_1_1_0 returns GreaterThan
	 *     MulDiv returns GreaterThan
	 *     MulDiv.Mul_1_0_0 returns GreaterThan
	 *     MulDiv.Div_1_1_0 returns GreaterThan
	 *     Primary returns GreaterThan
	 *
	 * Constraint:
	 *     (left=Comparison_GreaterThan_1_2_0 right=SubAdd)
	 */
	protected void sequence_Comparison(ISerializationContext context, GreaterThan semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.GREATER_THAN__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.GREATER_THAN__LEFT));
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.GREATER_THAN__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.GREATER_THAN__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_2_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Trigger returns GreaterThanEqual
	 *     Expression returns GreaterThanEqual
	 *     Equality returns GreaterThanEqual
	 *     Equality.Equal_1_0_0 returns GreaterThanEqual
	 *     Equality.Unequal_1_1_0 returns GreaterThanEqual
	 *     Comparison returns GreaterThanEqual
	 *     Comparison.LessThan_1_0_0 returns GreaterThanEqual
	 *     Comparison.LessThanEqual_1_1_0 returns GreaterThanEqual
	 *     Comparison.GreaterThan_1_2_0 returns GreaterThanEqual
	 *     Comparison.GreaterThanEqual_1_3_0 returns GreaterThanEqual
	 *     SubAdd returns GreaterThanEqual
	 *     SubAdd.Plus_1_0_0 returns GreaterThanEqual
	 *     SubAdd.Minus_1_1_0 returns GreaterThanEqual
	 *     MulDiv returns GreaterThanEqual
	 *     MulDiv.Mul_1_0_0 returns GreaterThanEqual
	 *     MulDiv.Div_1_1_0 returns GreaterThanEqual
	 *     Primary returns GreaterThanEqual
	 *
	 * Constraint:
	 *     (left=Comparison_GreaterThanEqual_1_3_0 right=SubAdd)
	 */
	protected void sequence_Comparison(ISerializationContext context, GreaterThanEqual semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.GREATER_THAN_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.GREATER_THAN_EQUAL__LEFT));
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.GREATER_THAN_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.GREATER_THAN_EQUAL__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComparisonAccess().getGreaterThanEqualLeftAction_1_3_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_3_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Trigger returns LessThan
	 *     Expression returns LessThan
	 *     Equality returns LessThan
	 *     Equality.Equal_1_0_0 returns LessThan
	 *     Equality.Unequal_1_1_0 returns LessThan
	 *     Comparison returns LessThan
	 *     Comparison.LessThan_1_0_0 returns LessThan
	 *     Comparison.LessThanEqual_1_1_0 returns LessThan
	 *     Comparison.GreaterThan_1_2_0 returns LessThan
	 *     Comparison.GreaterThanEqual_1_3_0 returns LessThan
	 *     SubAdd returns LessThan
	 *     SubAdd.Plus_1_0_0 returns LessThan
	 *     SubAdd.Minus_1_1_0 returns LessThan
	 *     MulDiv returns LessThan
	 *     MulDiv.Mul_1_0_0 returns LessThan
	 *     MulDiv.Div_1_1_0 returns LessThan
	 *     Primary returns LessThan
	 *
	 * Constraint:
	 *     (left=Comparison_LessThan_1_0_0 right=SubAdd)
	 */
	protected void sequence_Comparison(ISerializationContext context, LessThan semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.LESS_THAN__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.LESS_THAN__LEFT));
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.LESS_THAN__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.LESS_THAN__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Trigger returns LessThanEqual
	 *     Expression returns LessThanEqual
	 *     Equality returns LessThanEqual
	 *     Equality.Equal_1_0_0 returns LessThanEqual
	 *     Equality.Unequal_1_1_0 returns LessThanEqual
	 *     Comparison returns LessThanEqual
	 *     Comparison.LessThan_1_0_0 returns LessThanEqual
	 *     Comparison.LessThanEqual_1_1_0 returns LessThanEqual
	 *     Comparison.GreaterThan_1_2_0 returns LessThanEqual
	 *     Comparison.GreaterThanEqual_1_3_0 returns LessThanEqual
	 *     SubAdd returns LessThanEqual
	 *     SubAdd.Plus_1_0_0 returns LessThanEqual
	 *     SubAdd.Minus_1_1_0 returns LessThanEqual
	 *     MulDiv returns LessThanEqual
	 *     MulDiv.Mul_1_0_0 returns LessThanEqual
	 *     MulDiv.Div_1_1_0 returns LessThanEqual
	 *     Primary returns LessThanEqual
	 *
	 * Constraint:
	 *     (left=Comparison_LessThanEqual_1_1_0 right=SubAdd)
	 */
	protected void sequence_Comparison(ISerializationContext context, LessThanEqual semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.LESS_THAN_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.LESS_THAN_EQUAL__LEFT));
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.LESS_THAN_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.LESS_THAN_EQUAL__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComparisonAccess().getLessThanEqualLeftAction_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonAccess().getRightSubAddParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Trigger returns Equal
	 *     Expression returns Equal
	 *     Equality returns Equal
	 *     Equality.Equal_1_0_0 returns Equal
	 *     Equality.Unequal_1_1_0 returns Equal
	 *     Comparison returns Equal
	 *     Comparison.LessThan_1_0_0 returns Equal
	 *     Comparison.LessThanEqual_1_1_0 returns Equal
	 *     Comparison.GreaterThan_1_2_0 returns Equal
	 *     Comparison.GreaterThanEqual_1_3_0 returns Equal
	 *     SubAdd returns Equal
	 *     SubAdd.Plus_1_0_0 returns Equal
	 *     SubAdd.Minus_1_1_0 returns Equal
	 *     MulDiv returns Equal
	 *     MulDiv.Mul_1_0_0 returns Equal
	 *     MulDiv.Div_1_1_0 returns Equal
	 *     Primary returns Equal
	 *
	 * Constraint:
	 *     (left=Equality_Equal_1_0_0 right=Comparison)
	 */
	protected void sequence_Equality(ISerializationContext context, Equal semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.EQUAL__LEFT));
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.EQUAL__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEqualityAccess().getEqualLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Trigger returns Unequal
	 *     Expression returns Unequal
	 *     Equality returns Unequal
	 *     Equality.Equal_1_0_0 returns Unequal
	 *     Equality.Unequal_1_1_0 returns Unequal
	 *     Comparison returns Unequal
	 *     Comparison.LessThan_1_0_0 returns Unequal
	 *     Comparison.LessThanEqual_1_1_0 returns Unequal
	 *     Comparison.GreaterThan_1_2_0 returns Unequal
	 *     Comparison.GreaterThanEqual_1_3_0 returns Unequal
	 *     SubAdd returns Unequal
	 *     SubAdd.Plus_1_0_0 returns Unequal
	 *     SubAdd.Minus_1_1_0 returns Unequal
	 *     MulDiv returns Unequal
	 *     MulDiv.Mul_1_0_0 returns Unequal
	 *     MulDiv.Div_1_1_0 returns Unequal
	 *     Primary returns Unequal
	 *
	 * Constraint:
	 *     (left=Equality_Unequal_1_1_0 right=Comparison)
	 */
	protected void sequence_Equality(ISerializationContext context, Unequal semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.UNEQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.UNEQUAL__LEFT));
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.UNEQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.UNEQUAL__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEqualityAccess().getUnequalLeftAction_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Event
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Event(ISerializationContext context, Event semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.EVENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.EVENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Gate returns Gate
	 *
	 * Constraint:
	 *     block+=Block+
	 */
	protected void sequence_Gate(ISerializationContext context, Gate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Instruction
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Instruction(ISerializationContext context, Instruction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.INSTRUCTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.INSTRUCTION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInstructionAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Move returns Move
	 *
	 * Constraint:
	 *     (event=Trigger state=[State|ID])
	 */
	protected void sequence_Move(ISerializationContext context, Move semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.MOVE__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.MOVE__EVENT));
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.MOVE__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.MOVE__STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMoveAccess().getEventTriggerParserRuleCall_1_0(), semanticObject.getEvent());
		feeder.accept(grammarAccess.getMoveAccess().getStateStateIDTerminalRuleCall_3_0_1(), semanticObject.eGet(StateMachinePackage.Literals.MOVE__STATE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Trigger returns Div
	 *     Expression returns Div
	 *     Equality returns Div
	 *     Equality.Equal_1_0_0 returns Div
	 *     Equality.Unequal_1_1_0 returns Div
	 *     Comparison returns Div
	 *     Comparison.LessThan_1_0_0 returns Div
	 *     Comparison.LessThanEqual_1_1_0 returns Div
	 *     Comparison.GreaterThan_1_2_0 returns Div
	 *     Comparison.GreaterThanEqual_1_3_0 returns Div
	 *     SubAdd returns Div
	 *     SubAdd.Plus_1_0_0 returns Div
	 *     SubAdd.Minus_1_1_0 returns Div
	 *     MulDiv returns Div
	 *     MulDiv.Mul_1_0_0 returns Div
	 *     MulDiv.Div_1_1_0 returns Div
	 *     Primary returns Div
	 *
	 * Constraint:
	 *     (left=MulDiv_Div_1_1_0 right=Primary)
	 */
	protected void sequence_MulDiv(ISerializationContext context, Div semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.DIV__LEFT));
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.DIV__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMulDivAccess().getDivLeftAction_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMulDivAccess().getRightPrimaryParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Trigger returns Mul
	 *     Expression returns Mul
	 *     Equality returns Mul
	 *     Equality.Equal_1_0_0 returns Mul
	 *     Equality.Unequal_1_1_0 returns Mul
	 *     Comparison returns Mul
	 *     Comparison.LessThan_1_0_0 returns Mul
	 *     Comparison.LessThanEqual_1_1_0 returns Mul
	 *     Comparison.GreaterThan_1_2_0 returns Mul
	 *     Comparison.GreaterThanEqual_1_3_0 returns Mul
	 *     SubAdd returns Mul
	 *     SubAdd.Plus_1_0_0 returns Mul
	 *     SubAdd.Minus_1_1_0 returns Mul
	 *     MulDiv returns Mul
	 *     MulDiv.Mul_1_0_0 returns Mul
	 *     MulDiv.Div_1_1_0 returns Mul
	 *     Primary returns Mul
	 *
	 * Constraint:
	 *     (left=MulDiv_Mul_1_0_0 right=Primary)
	 */
	protected void sequence_MulDiv(ISerializationContext context, Mul semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.MUL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.MUL__LEFT));
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.MUL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.MUL__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMulDivAccess().getMulLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMulDivAccess().getRightPrimaryParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Trigger returns Number
	 *     Expression returns Number
	 *     Equality returns Number
	 *     Equality.Equal_1_0_0 returns Number
	 *     Equality.Unequal_1_1_0 returns Number
	 *     Comparison returns Number
	 *     Comparison.LessThan_1_0_0 returns Number
	 *     Comparison.LessThanEqual_1_1_0 returns Number
	 *     Comparison.GreaterThan_1_2_0 returns Number
	 *     Comparison.GreaterThanEqual_1_3_0 returns Number
	 *     SubAdd returns Number
	 *     SubAdd.Plus_1_0_0 returns Number
	 *     SubAdd.Minus_1_1_0 returns Number
	 *     MulDiv returns Number
	 *     MulDiv.Mul_1_0_0 returns Number
	 *     MulDiv.Div_1_1_0 returns Number
	 *     Primary returns Number
	 *     Number returns Number
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Number(ISerializationContext context, org.xtext.example.mydsl.stateMachine.Number semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.NUMBER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StateMachine returns StateMachine
	 *
	 * Constraint:
	 *     (gate+=Gate* event+=Event+ eventReset+=[Event|ID]* instructions+=Instruction* state+=State*)
	 */
	protected void sequence_StateMachine(ISerializationContext context, StateMachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (name=ID actions+=[Instruction|ID]* moves+=Move*)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Trigger returns Minus
	 *     Expression returns Minus
	 *     Equality returns Minus
	 *     Equality.Equal_1_0_0 returns Minus
	 *     Equality.Unequal_1_1_0 returns Minus
	 *     Comparison returns Minus
	 *     Comparison.LessThan_1_0_0 returns Minus
	 *     Comparison.LessThanEqual_1_1_0 returns Minus
	 *     Comparison.GreaterThan_1_2_0 returns Minus
	 *     Comparison.GreaterThanEqual_1_3_0 returns Minus
	 *     SubAdd returns Minus
	 *     SubAdd.Plus_1_0_0 returns Minus
	 *     SubAdd.Minus_1_1_0 returns Minus
	 *     MulDiv returns Minus
	 *     MulDiv.Mul_1_0_0 returns Minus
	 *     MulDiv.Div_1_1_0 returns Minus
	 *     Primary returns Minus
	 *
	 * Constraint:
	 *     (left=SubAdd_Minus_1_1_0 right=MulDiv)
	 */
	protected void sequence_SubAdd(ISerializationContext context, Minus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.MINUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.MINUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSubAddAccess().getMinusLeftAction_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubAddAccess().getRightMulDivParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Trigger returns Plus
	 *     Expression returns Plus
	 *     Equality returns Plus
	 *     Equality.Equal_1_0_0 returns Plus
	 *     Equality.Unequal_1_1_0 returns Plus
	 *     Comparison returns Plus
	 *     Comparison.LessThan_1_0_0 returns Plus
	 *     Comparison.LessThanEqual_1_1_0 returns Plus
	 *     Comparison.GreaterThan_1_2_0 returns Plus
	 *     Comparison.GreaterThanEqual_1_3_0 returns Plus
	 *     SubAdd returns Plus
	 *     SubAdd.Plus_1_0_0 returns Plus
	 *     SubAdd.Minus_1_1_0 returns Plus
	 *     MulDiv returns Plus
	 *     MulDiv.Mul_1_0_0 returns Plus
	 *     MulDiv.Div_1_1_0 returns Plus
	 *     Primary returns Plus
	 *
	 * Constraint:
	 *     (left=SubAdd_Plus_1_0_0 right=MulDiv)
	 */
	protected void sequence_SubAdd(ISerializationContext context, Plus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.PLUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.PLUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSubAddAccess().getPlusLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSubAddAccess().getRightMulDivParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Trigger returns Trigger
	 *
	 * Constraint:
	 *     event=[Event|ID]
	 */
	protected void sequence_Trigger(ISerializationContext context, Trigger semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StateMachinePackage.Literals.TRIGGER__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StateMachinePackage.Literals.TRIGGER__EVENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTriggerAccess().getEventEventIDTerminalRuleCall_0_0_1(), semanticObject.eGet(StateMachinePackage.Literals.TRIGGER__EVENT, false));
		feeder.finish();
	}
	
	
}
