/**
 * generated by Xtext 2.10.0
 */
package master.mdsd.game.impl;

import java.util.Collection;

import master.mdsd.game.GamePackage;
import master.mdsd.game.Location;
import master.mdsd.game.TargetRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link master.mdsd.game.impl.TargetRefImpl#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link master.mdsd.game.impl.TargetRefImpl#getLocationsId <em>Locations Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetRefImpl extends MinimalEObjectImpl.Container implements TargetRef
{
  /**
   * The default value of the '{@link #getTargetId() <em>Target Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetId()
   * @generated
   * @ordered
   */
  protected static final String TARGET_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetId() <em>Target Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetId()
   * @generated
   * @ordered
   */
  protected String targetId = TARGET_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getLocationsId() <em>Locations Id</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocationsId()
   * @generated
   * @ordered
   */
  protected EList<Location> locationsId;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TargetRefImpl()
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
    return GamePackage.Literals.TARGET_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTargetId()
  {
    return targetId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetId(String newTargetId)
  {
    String oldTargetId = targetId;
    targetId = newTargetId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.TARGET_REF__TARGET_ID, oldTargetId, targetId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Location> getLocationsId()
  {
    if (locationsId == null)
    {
      locationsId = new EObjectContainmentEList<Location>(Location.class, this, GamePackage.TARGET_REF__LOCATIONS_ID);
    }
    return locationsId;
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
      case GamePackage.TARGET_REF__LOCATIONS_ID:
        return ((InternalEList<?>)getLocationsId()).basicRemove(otherEnd, msgs);
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
      case GamePackage.TARGET_REF__TARGET_ID:
        return getTargetId();
      case GamePackage.TARGET_REF__LOCATIONS_ID:
        return getLocationsId();
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
      case GamePackage.TARGET_REF__TARGET_ID:
        setTargetId((String)newValue);
        return;
      case GamePackage.TARGET_REF__LOCATIONS_ID:
        getLocationsId().clear();
        getLocationsId().addAll((Collection<? extends Location>)newValue);
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
      case GamePackage.TARGET_REF__TARGET_ID:
        setTargetId(TARGET_ID_EDEFAULT);
        return;
      case GamePackage.TARGET_REF__LOCATIONS_ID:
        getLocationsId().clear();
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
      case GamePackage.TARGET_REF__TARGET_ID:
        return TARGET_ID_EDEFAULT == null ? targetId != null : !TARGET_ID_EDEFAULT.equals(targetId);
      case GamePackage.TARGET_REF__LOCATIONS_ID:
        return locationsId != null && !locationsId.isEmpty();
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
    result.append(" (targetId: ");
    result.append(targetId);
    result.append(')');
    return result.toString();
  }

} //TargetRefImpl