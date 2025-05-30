/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.cNL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.cNL.CNLPackage;
import org.xtext.example.cNL.Expression;
import org.xtext.example.cNL.PrimaryExpression;
import org.xtext.example.cNL.TauExpression;
import org.xtext.example.cNL.VarDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.cNL.impl.PrimaryExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.cNL.impl.PrimaryExpressionImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.xtext.example.cNL.impl.PrimaryExpressionImpl#getTau <em>Tau</em>}</li>
 *   <li>{@link org.xtext.example.cNL.impl.PrimaryExpressionImpl#getNestExpr <em>Nest Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryExpressionImpl extends UnExpressionImpl implements PrimaryExpression
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected VarDeclaration name;

  /**
   * The default value of the '{@link #getConstant() <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected static final String CONSTANT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstant() <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected String constant = CONSTANT_EDEFAULT;

  /**
   * The cached value of the '{@link #getTau() <em>Tau</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTau()
   * @generated
   * @ordered
   */
  protected TauExpression tau;

  /**
   * The cached value of the '{@link #getNestExpr() <em>Nest Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNestExpr()
   * @generated
   * @ordered
   */
  protected Expression nestExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimaryExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CNLPackage.Literals.PRIMARY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarDeclaration getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (VarDeclaration)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CNLPackage.PRIMARY_EXPRESSION__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDeclaration basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(VarDeclaration newName)
  {
    VarDeclaration oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CNLPackage.PRIMARY_EXPRESSION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getConstant()
  {
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConstant(String newConstant)
  {
    String oldConstant = constant;
    constant = newConstant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CNLPackage.PRIMARY_EXPRESSION__CONSTANT, oldConstant, constant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TauExpression getTau()
  {
    return tau;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTau(TauExpression newTau, NotificationChain msgs)
  {
    TauExpression oldTau = tau;
    tau = newTau;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CNLPackage.PRIMARY_EXPRESSION__TAU, oldTau, newTau);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTau(TauExpression newTau)
  {
    if (newTau != tau)
    {
      NotificationChain msgs = null;
      if (tau != null)
        msgs = ((InternalEObject)tau).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CNLPackage.PRIMARY_EXPRESSION__TAU, null, msgs);
      if (newTau != null)
        msgs = ((InternalEObject)newTau).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CNLPackage.PRIMARY_EXPRESSION__TAU, null, msgs);
      msgs = basicSetTau(newTau, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CNLPackage.PRIMARY_EXPRESSION__TAU, newTau, newTau));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getNestExpr()
  {
    return nestExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNestExpr(Expression newNestExpr, NotificationChain msgs)
  {
    Expression oldNestExpr = nestExpr;
    nestExpr = newNestExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CNLPackage.PRIMARY_EXPRESSION__NEST_EXPR, oldNestExpr, newNestExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNestExpr(Expression newNestExpr)
  {
    if (newNestExpr != nestExpr)
    {
      NotificationChain msgs = null;
      if (nestExpr != null)
        msgs = ((InternalEObject)nestExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CNLPackage.PRIMARY_EXPRESSION__NEST_EXPR, null, msgs);
      if (newNestExpr != null)
        msgs = ((InternalEObject)newNestExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CNLPackage.PRIMARY_EXPRESSION__NEST_EXPR, null, msgs);
      msgs = basicSetNestExpr(newNestExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CNLPackage.PRIMARY_EXPRESSION__NEST_EXPR, newNestExpr, newNestExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CNLPackage.PRIMARY_EXPRESSION__TAU:
        return basicSetTau(null, msgs);
      case CNLPackage.PRIMARY_EXPRESSION__NEST_EXPR:
        return basicSetNestExpr(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CNLPackage.PRIMARY_EXPRESSION__NAME:
        if (resolve) return getName();
        return basicGetName();
      case CNLPackage.PRIMARY_EXPRESSION__CONSTANT:
        return getConstant();
      case CNLPackage.PRIMARY_EXPRESSION__TAU:
        return getTau();
      case CNLPackage.PRIMARY_EXPRESSION__NEST_EXPR:
        return getNestExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CNLPackage.PRIMARY_EXPRESSION__NAME:
        setName((VarDeclaration)newValue);
        return;
      case CNLPackage.PRIMARY_EXPRESSION__CONSTANT:
        setConstant((String)newValue);
        return;
      case CNLPackage.PRIMARY_EXPRESSION__TAU:
        setTau((TauExpression)newValue);
        return;
      case CNLPackage.PRIMARY_EXPRESSION__NEST_EXPR:
        setNestExpr((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CNLPackage.PRIMARY_EXPRESSION__NAME:
        setName((VarDeclaration)null);
        return;
      case CNLPackage.PRIMARY_EXPRESSION__CONSTANT:
        setConstant(CONSTANT_EDEFAULT);
        return;
      case CNLPackage.PRIMARY_EXPRESSION__TAU:
        setTau((TauExpression)null);
        return;
      case CNLPackage.PRIMARY_EXPRESSION__NEST_EXPR:
        setNestExpr((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CNLPackage.PRIMARY_EXPRESSION__NAME:
        return name != null;
      case CNLPackage.PRIMARY_EXPRESSION__CONSTANT:
        return CONSTANT_EDEFAULT == null ? constant != null : !CONSTANT_EDEFAULT.equals(constant);
      case CNLPackage.PRIMARY_EXPRESSION__TAU:
        return tau != null;
      case CNLPackage.PRIMARY_EXPRESSION__NEST_EXPR:
        return nestExpr != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (constant: ");
    result.append(constant);
    result.append(')');
    return result.toString();
  }

} //PrimaryExpressionImpl
