/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.cNL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inv</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cNL.Inv#getInv <em>Inv</em>}</li>
 *   <li>{@link org.xtext.example.cNL.Inv#getDelay_final <em>Delay final</em>}</li>
 *   <li>{@link org.xtext.example.cNL.Inv#getRelease_reaction <em>Release reaction</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.cNL.CNLPackage#getInv()
 * @model
 * @generated
 */
public interface Inv extends EObject
{
  /**
   * Returns the value of the '<em><b>Inv</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inv</em>' reference.
   * @see #setInv(SentenceDeclaration)
   * @see org.xtext.example.cNL.CNLPackage#getInv_Inv()
   * @model
   * @generated
   */
  SentenceDeclaration getInv();

  /**
   * Sets the value of the '{@link org.xtext.example.cNL.Inv#getInv <em>Inv</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inv</em>' reference.
   * @see #getInv()
   * @generated
   */
  void setInv(SentenceDeclaration value);

  /**
   * Returns the value of the '<em><b>Delay final</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delay final</em>' containment reference.
   * @see #setDelay_final(DelFin)
   * @see org.xtext.example.cNL.CNLPackage#getInv_Delay_final()
   * @model containment="true"
   * @generated
   */
  DelFin getDelay_final();

  /**
   * Sets the value of the '{@link org.xtext.example.cNL.Inv#getDelay_final <em>Delay final</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delay final</em>' containment reference.
   * @see #getDelay_final()
   * @generated
   */
  void setDelay_final(DelFin value);

  /**
   * Returns the value of the '<em><b>Release reaction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Release reaction</em>' containment reference.
   * @see #setRelease_reaction(RelRea)
   * @see org.xtext.example.cNL.CNLPackage#getInv_Release_reaction()
   * @model containment="true"
   * @generated
   */
  RelRea getRelease_reaction();

  /**
   * Sets the value of the '{@link org.xtext.example.cNL.Inv#getRelease_reaction <em>Release reaction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Release reaction</em>' containment reference.
   * @see #getRelease_reaction()
   * @generated
   */
  void setRelease_reaction(RelRea value);

} // Inv
