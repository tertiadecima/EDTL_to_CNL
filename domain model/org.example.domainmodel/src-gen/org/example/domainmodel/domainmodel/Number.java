/**
 * generated by Xtext 2.32.0
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.Number#getSign <em>Sign</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.Number#getBefore_point <em>Before point</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.Number#getAfter_point <em>After point</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.Number#getExponent <em>Exponent</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getNumber()
 * @model
 * @generated
 */
public interface Number extends EObject
{
  /**
   * Returns the value of the '<em><b>Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sign</em>' attribute.
   * @see #setSign(String)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getNumber_Sign()
   * @model
   * @generated
   */
  String getSign();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.Number#getSign <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sign</em>' attribute.
   * @see #getSign()
   * @generated
   */
  void setSign(String value);

  /**
   * Returns the value of the '<em><b>Before point</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Before point</em>' attribute.
   * @see #setBefore_point(String)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getNumber_Before_point()
   * @model
   * @generated
   */
  String getBefore_point();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.Number#getBefore_point <em>Before point</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Before point</em>' attribute.
   * @see #getBefore_point()
   * @generated
   */
  void setBefore_point(String value);

  /**
   * Returns the value of the '<em><b>After point</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>After point</em>' attribute.
   * @see #setAfter_point(String)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getNumber_After_point()
   * @model
   * @generated
   */
  String getAfter_point();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.Number#getAfter_point <em>After point</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>After point</em>' attribute.
   * @see #getAfter_point()
   * @generated
   */
  void setAfter_point(String value);

  /**
   * Returns the value of the '<em><b>Exponent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exponent</em>' attribute.
   * @see #setExponent(String)
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getNumber_Exponent()
   * @model
   * @generated
   */
  String getExponent();

  /**
   * Sets the value of the '{@link org.example.domainmodel.domainmodel.Number#getExponent <em>Exponent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exponent</em>' attribute.
   * @see #getExponent()
   * @generated
   */
  void setExponent(String value);

} // Number