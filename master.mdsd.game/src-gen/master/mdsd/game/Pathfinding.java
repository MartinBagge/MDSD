/**
 * generated by Xtext 2.10.0
 */
package master.mdsd.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pathfinding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link master.mdsd.game.Pathfinding#getName <em>Name</em>}</li>
 *   <li>{@link master.mdsd.game.Pathfinding#getAttPathfinding <em>Att Pathfinding</em>}</li>
 *   <li>{@link master.mdsd.game.Pathfinding#getRuleSets <em>Rule Sets</em>}</li>
 * </ul>
 *
 * @see master.mdsd.game.GamePackage#getPathfinding()
 * @model
 * @generated
 */
public interface Pathfinding extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see master.mdsd.game.GamePackage#getPathfinding_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link master.mdsd.game.Pathfinding#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Att Pathfinding</b></em>' containment reference list.
   * The list contents are of type {@link master.mdsd.game.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Att Pathfinding</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Att Pathfinding</em>' containment reference list.
   * @see master.mdsd.game.GamePackage#getPathfinding_AttPathfinding()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttPathfinding();

  /**
   * Returns the value of the '<em><b>Rule Sets</b></em>' containment reference list.
   * The list contents are of type {@link master.mdsd.game.RuleSet}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule Sets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule Sets</em>' containment reference list.
   * @see master.mdsd.game.GamePackage#getPathfinding_RuleSets()
   * @model containment="true"
   * @generated
   */
  EList<RuleSet> getRuleSets();

} // Pathfinding