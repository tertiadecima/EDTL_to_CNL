/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.cNL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rel Rea</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cNL.RelRea#getReaction <em>Reaction</em>}</li>
 *   <li>{@link org.xtext.example.cNL.RelRea#getDelay_final <em>Delay final</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.cNL.CNLPackage#getRelRea()
 * @model
 * @generated
 */
public interface RelRea extends EObject
{
  /**
   * Returns the value of the '<em><b>Reaction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reaction</em>' containment reference.
   * @see #setReaction(Reaction)
   * @see org.xtext.example.cNL.CNLPackage#getRelRea_Reaction()
   * @model containment="true"
   * @generated
   */
  Reaction getReaction();

  /**
   * Sets the value of the '{@link org.xtext.example.cNL.RelRea#getReaction <em>Reaction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reaction</em>' containment reference.
   * @see #getReaction()
   * @generated
   */
  void setReaction(Reaction value);

  /**
   * Returns the value of the '<em><b>Delay final</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delay final</em>' containment reference.
   * @see #setDelay_final(DelFin)
   * @see org.xtext.example.cNL.CNLPackage#getRelRea_Delay_final()
   * @model containment="true"
   * @generated
   */
  DelFin getDelay_final();

  /**
   * Sets the value of the '{@link org.xtext.example.cNL.RelRea#getDelay_final <em>Delay final</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delay final</em>' containment reference.
   * @see #getDelay_final()
   * @generated
   */
  void setDelay_final(DelFin value);

} // RelRea