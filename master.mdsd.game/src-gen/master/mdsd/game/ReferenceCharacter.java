/**
 * generated by Xtext 2.10.0
 */
package master.mdsd.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link master.mdsd.game.ReferenceCharacter#getCharacterId <em>Character Id</em>}</li>
 *   <li>{@link master.mdsd.game.ReferenceCharacter#getTargetId <em>Target Id</em>}</li>
 * </ul>
 *
 * @see master.mdsd.game.GamePackage#getReferenceCharacter()
 * @model
 * @generated
 */
public interface ReferenceCharacter extends EObject
{
  /**
   * Returns the value of the '<em><b>Character Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Character Id</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Character Id</em>' reference.
   * @see #setCharacterId(master.mdsd.game.Character)
   * @see master.mdsd.game.GamePackage#getReferenceCharacter_CharacterId()
   * @model
   * @generated
   */
  master.mdsd.game.Character getCharacterId();

  /**
   * Sets the value of the '{@link master.mdsd.game.ReferenceCharacter#getCharacterId <em>Character Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Character Id</em>' reference.
   * @see #getCharacterId()
   * @generated
   */
  void setCharacterId(master.mdsd.game.Character value);

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
   * @see master.mdsd.game.GamePackage#getReferenceCharacter_TargetId()
   * @model
   * @generated
   */
  String getTargetId();

  /**
   * Sets the value of the '{@link master.mdsd.game.ReferenceCharacter#getTargetId <em>Target Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Id</em>' attribute.
   * @see #getTargetId()
   * @generated
   */
  void setTargetId(String value);

} // ReferenceCharacter