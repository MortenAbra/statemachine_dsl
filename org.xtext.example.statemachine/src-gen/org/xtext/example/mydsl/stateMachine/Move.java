/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.stateMachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.stateMachine.Move#getEvent <em>Event</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.stateMachine.Move#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.stateMachine.StateMachinePackage#getMove()
 * @model
 * @generated
 */
public interface Move extends EObject
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference.
   * @see #setEvent(Trigger)
   * @see org.xtext.example.mydsl.stateMachine.StateMachinePackage#getMove_Event()
   * @model containment="true"
   * @generated
   */
  Trigger getEvent();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.stateMachine.Move#getEvent <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' containment reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(Trigger value);

  /**
   * Returns the value of the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' reference.
   * @see #setState(State)
   * @see org.xtext.example.mydsl.stateMachine.StateMachinePackage#getMove_State()
   * @model
   * @generated
   */
  State getState();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.stateMachine.Move#getState <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' reference.
   * @see #getState()
   * @generated
   */
  void setState(State value);

} // Move
