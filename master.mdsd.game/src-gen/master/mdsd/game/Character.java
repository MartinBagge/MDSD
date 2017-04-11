/**
 * generated by Xtext 2.10.0
 */
package master.mdsd.game;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link master.mdsd.game.Character#getCharId <em>Char Id</em>}</li>
 *   <li>{@link master.mdsd.game.Character#getAtt <em>Att</em>}</li>
 * </ul>
 *
 * @see master.mdsd.game.GamePackage#getCharacter()
 * @model
 * @generated
 */
public interface Character extends DynamicEntity
{
  /**
   * Returns the value of the '<em><b>Char Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Char Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Char Id</em>' containment reference.
   * @see #setCharId(CharType)
   * @see master.mdsd.game.GamePackage#getCharacter_CharId()
   * @model containment="true"
   * @generated
   */
  CharType getCharId();

  /**
   * Sets the value of the '{@link master.mdsd.game.Character#getCharId <em>Char Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Char Id</em>' containment reference.
   * @see #getCharId()
   * @generated
   */
  void setCharId(CharType value);

  /**
   * Returns the value of the '<em><b>Att</b></em>' containment reference list.
   * The list contents are of type {@link master.mdsd.game.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Att</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Att</em>' containment reference list.
   * @see master.mdsd.game.GamePackage#getCharacter_Att()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAtt();

} // Character
