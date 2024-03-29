/**
 * generated by Xtext 2.10.0
 */
package master.mdsd.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link master.mdsd.game.AttributeAttack#getAttributeTypesAttack <em>Attribute Types Attack</em>}</li>
 *   <li>{@link master.mdsd.game.AttributeAttack#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see master.mdsd.game.GamePackage#getAttributeAttack()
 * @model
 * @generated
 */
public interface AttributeAttack extends EObject
{
  /**
   * Returns the value of the '<em><b>Attribute Types Attack</b></em>' containment reference list.
   * The list contents are of type {@link master.mdsd.game.AttributeTypeAttack}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Types Attack</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Types Attack</em>' containment reference list.
   * @see master.mdsd.game.GamePackage#getAttributeAttack_AttributeTypesAttack()
   * @model containment="true"
   * @generated
   */
  EList<AttributeTypeAttack> getAttributeTypesAttack();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference list.
   * The list contents are of type {@link master.mdsd.game.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference list.
   * @see master.mdsd.game.GamePackage#getAttributeAttack_Type()
   * @model containment="true"
   * @generated
   */
  EList<Type> getType();

} // AttributeAttack
