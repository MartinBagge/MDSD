/**
 * generated by Xtext 2.10.0
 */
package master.mdsd.game.impl;

import java.util.Collection;

import master.mdsd.game.GamePackage;
import master.mdsd.game.Rule;
import master.mdsd.game.RuleSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link master.mdsd.game.impl.RuleSetImpl#getIfId <em>If Id</em>}</li>
 *   <li>{@link master.mdsd.game.impl.RuleSetImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link master.mdsd.game.impl.RuleSetImpl#getElseIfId <em>Else If Id</em>}</li>
 *   <li>{@link master.mdsd.game.impl.RuleSetImpl#getElseRules <em>Else Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleSetImpl extends MinimalEObjectImpl.Container implements RuleSet
{
  /**
   * The cached value of the '{@link #getIfId() <em>If Id</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfId()
   * @generated
   * @ordered
   */
  protected EList<String> ifId;

  /**
   * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected Rule rule;

  /**
   * The cached value of the '{@link #getElseIfId() <em>Else If Id</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseIfId()
   * @generated
   * @ordered
   */
  protected EList<String> elseIfId;

  /**
   * The cached value of the '{@link #getElseRules() <em>Else Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseRules()
   * @generated
   * @ordered
   */
  protected EList<Rule> elseRules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleSetImpl()
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
    return GamePackage.Literals.RULE_SET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getIfId()
  {
    if (ifId == null)
    {
      ifId = new EDataTypeEList<String>(String.class, this, GamePackage.RULE_SET__IF_ID);
    }
    return ifId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule getRule()
  {
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs)
  {
    Rule oldRule = rule;
    rule = newRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.RULE_SET__RULE, oldRule, newRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRule(Rule newRule)
  {
    if (newRule != rule)
    {
      NotificationChain msgs = null;
      if (rule != null)
        msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.RULE_SET__RULE, null, msgs);
      if (newRule != null)
        msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.RULE_SET__RULE, null, msgs);
      msgs = basicSetRule(newRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.RULE_SET__RULE, newRule, newRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getElseIfId()
  {
    if (elseIfId == null)
    {
      elseIfId = new EDataTypeEList<String>(String.class, this, GamePackage.RULE_SET__ELSE_IF_ID);
    }
    return elseIfId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rule> getElseRules()
  {
    if (elseRules == null)
    {
      elseRules = new EObjectContainmentEList<Rule>(Rule.class, this, GamePackage.RULE_SET__ELSE_RULES);
    }
    return elseRules;
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
      case GamePackage.RULE_SET__RULE:
        return basicSetRule(null, msgs);
      case GamePackage.RULE_SET__ELSE_RULES:
        return ((InternalEList<?>)getElseRules()).basicRemove(otherEnd, msgs);
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
      case GamePackage.RULE_SET__IF_ID:
        return getIfId();
      case GamePackage.RULE_SET__RULE:
        return getRule();
      case GamePackage.RULE_SET__ELSE_IF_ID:
        return getElseIfId();
      case GamePackage.RULE_SET__ELSE_RULES:
        return getElseRules();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GamePackage.RULE_SET__IF_ID:
        getIfId().clear();
        getIfId().addAll((Collection<? extends String>)newValue);
        return;
      case GamePackage.RULE_SET__RULE:
        setRule((Rule)newValue);
        return;
      case GamePackage.RULE_SET__ELSE_IF_ID:
        getElseIfId().clear();
        getElseIfId().addAll((Collection<? extends String>)newValue);
        return;
      case GamePackage.RULE_SET__ELSE_RULES:
        getElseRules().clear();
        getElseRules().addAll((Collection<? extends Rule>)newValue);
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
      case GamePackage.RULE_SET__IF_ID:
        getIfId().clear();
        return;
      case GamePackage.RULE_SET__RULE:
        setRule((Rule)null);
        return;
      case GamePackage.RULE_SET__ELSE_IF_ID:
        getElseIfId().clear();
        return;
      case GamePackage.RULE_SET__ELSE_RULES:
        getElseRules().clear();
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
      case GamePackage.RULE_SET__IF_ID:
        return ifId != null && !ifId.isEmpty();
      case GamePackage.RULE_SET__RULE:
        return rule != null;
      case GamePackage.RULE_SET__ELSE_IF_ID:
        return elseIfId != null && !elseIfId.isEmpty();
      case GamePackage.RULE_SET__ELSE_RULES:
        return elseRules != null && !elseRules.isEmpty();
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (ifId: ");
    result.append(ifId);
    result.append(", elseIfId: ");
    result.append(elseIfId);
    result.append(')');
    return result.toString();
  }

} //RuleSetImpl
