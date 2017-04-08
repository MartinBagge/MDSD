/**
 * generated by Xtext 2.10.0
 */
package master.mdsd.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link master.mdsd.game.Attribute#getAttributename <em>Attributename</em>}</li>
 *   <li>{@link master.mdsd.game.Attribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see master.mdsd.game.GamePackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Attributename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributename</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributename</em>' attribute.
   * @see #setAttributename(String)
   * @see master.mdsd.game.GamePackage#getAttribute_Attributename()
   * @model
   * @generated
   */
  String getAttributename();

  /**
   * Sets the value of the '{@link master.mdsd.game.Attribute#getAttributename <em>Attributename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributename</em>' attribute.
   * @see #getAttributename()
   * @generated
   */
  void setAttributename(String value);

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
   * @see master.mdsd.game.GamePackage#getAttribute_Type()
   * @model containment="true"
   * @generated
   */
  EList<Type> getType();

} // Attribute