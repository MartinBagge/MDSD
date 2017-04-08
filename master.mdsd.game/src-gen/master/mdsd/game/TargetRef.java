/**
 * generated by Xtext 2.10.0
 */
package master.mdsd.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link master.mdsd.game.TargetRef#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link master.mdsd.game.TargetRef#getLocationsId <em>Locations Id</em>}</li>
 * </ul>
 *
 * @see master.mdsd.game.GamePackage#getTargetRef()
 * @model
 * @generated
 */
public interface TargetRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Target Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Id</em>' attribute.
   * @see #setTargetId(String)
   * @see master.mdsd.game.GamePackage#getTargetRef_TargetId()
   * @model
   * @generated
   */
  String getTargetId();

  /**
   * Sets the value of the '{@link master.mdsd.game.TargetRef#getTargetId <em>Target Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Id</em>' attribute.
   * @see #getTargetId()
   * @generated
   */
  void setTargetId(String value);

  /**
   * Returns the value of the '<em><b>Locations Id</b></em>' containment reference list.
   * The list contents are of type {@link master.mdsd.game.Location}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Locations Id</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locations Id</em>' containment reference list.
   * @see master.mdsd.game.GamePackage#getTargetRef_LocationsId()
   * @model containment="true"
   * @generated
   */
  EList<Location> getLocationsId();

} // TargetRef
