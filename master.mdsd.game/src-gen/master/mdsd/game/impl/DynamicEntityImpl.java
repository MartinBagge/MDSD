/**
 * generated by Xtext 2.10.0
 */
package master.mdsd.game.impl;

import master.mdsd.game.DynamicEntity;
import master.mdsd.game.GamePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link master.mdsd.game.impl.DynamicEntityImpl#getEntityid <em>Entityid</em>}</li>
 *   <li>{@link master.mdsd.game.impl.DynamicEntityImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicEntityImpl extends EntityImpl implements DynamicEntity
{
  /**
   * The default value of the '{@link #getEntityid() <em>Entityid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityid()
   * @generated
   * @ordered
   */
  protected static final String ENTITYID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntityid() <em>Entityid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityid()
   * @generated
   * @ordered
   */
  protected String entityid = ENTITYID_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DynamicEntityImpl()
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
    return GamePackage.Literals.DYNAMIC_ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEntityid()
  {
    return entityid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntityid(String newEntityid)
  {
    String oldEntityid = entityid;
    entityid = newEntityid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.DYNAMIC_ENTITY__ENTITYID, oldEntityid, entityid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.DYNAMIC_ENTITY__NAME, oldName, name));
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
      case GamePackage.DYNAMIC_ENTITY__ENTITYID:
        return getEntityid();
      case GamePackage.DYNAMIC_ENTITY__NAME:
        return getName();
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
      case GamePackage.DYNAMIC_ENTITY__ENTITYID:
        setEntityid((String)newValue);
        return;
      case GamePackage.DYNAMIC_ENTITY__NAME:
        setName((String)newValue);
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
      case GamePackage.DYNAMIC_ENTITY__ENTITYID:
        setEntityid(ENTITYID_EDEFAULT);
        return;
      case GamePackage.DYNAMIC_ENTITY__NAME:
        setName(NAME_EDEFAULT);
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
      case GamePackage.DYNAMIC_ENTITY__ENTITYID:
        return ENTITYID_EDEFAULT == null ? entityid != null : !ENTITYID_EDEFAULT.equals(entityid);
      case GamePackage.DYNAMIC_ENTITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (entityid: ");
    result.append(entityid);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //DynamicEntityImpl
