/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.stateMachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.stateMachine.StateMachine#getGate <em>Gate</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.stateMachine.StateMachine#getEvent <em>Event</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.stateMachine.StateMachine#getEventReset <em>Event Reset</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.stateMachine.StateMachine#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.stateMachine.StateMachine#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.stateMachine.StateMachinePackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject
{
  /**
   * Returns the value of the '<em><b>Gate</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.stateMachine.Gate}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gate</em>' containment reference list.
   * @see org.xtext.example.mydsl.stateMachine.StateMachinePackage#getStateMachine_Gate()
   * @model containment="true"
   * @generated
   */
  EList<Gate> getGate();

  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.stateMachine.Event}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference list.
   * @see org.xtext.example.mydsl.stateMachine.StateMachinePackage#getStateMachine_Event()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvent();

  /**
   * Returns the value of the '<em><b>Event Reset</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.stateMachine.Event}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Reset</em>' reference list.
   * @see org.xtext.example.mydsl.stateMachine.StateMachinePackage#getStateMachine_EventReset()
   * @model
   * @generated
   */
  EList<Event> getEventReset();

  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.stateMachine.Instruction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see org.xtext.example.mydsl.stateMachine.StateMachinePackage#getStateMachine_Instructions()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getInstructions();

  /**
   * Returns the value of the '<em><b>State</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.stateMachine.State}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' containment reference list.
   * @see org.xtext.example.mydsl.stateMachine.StateMachinePackage#getStateMachine_State()
   * @model containment="true"
   * @generated
   */
  EList<State> getState();

} // StateMachine
