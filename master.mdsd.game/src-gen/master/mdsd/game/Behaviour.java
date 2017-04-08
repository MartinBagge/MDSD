/**
 * generated by Xtext 2.10.0
 */
package master.mdsd.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link master.mdsd.game.Behaviour#getBehaviourTypeId <em>Behaviour Type Id</em>}</li>
 *   <li>{@link master.mdsd.game.Behaviour#getPathfinding <em>Pathfinding</em>}</li>
 *   <li>{@link master.mdsd.game.Behaviour#getAttack <em>Attack</em>}</li>
 *   <li>{@link master.mdsd.game.Behaviour#getBullet <em>Bullet</em>}</li>
 * </ul>
 *
 * @see master.mdsd.game.GamePackage#getBehaviour()
 * @model
 * @generated
 */
public interface Behaviour extends EObject
{
  /**
   * Returns the value of the '<em><b>Behaviour Type Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behaviour Type Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviour Type Id</em>' attribute.
   * @see #setBehaviourTypeId(String)
   * @see master.mdsd.game.GamePackage#getBehaviour_BehaviourTypeId()
   * @model
   * @generated
   */
  String getBehaviourTypeId();

  /**
   * Sets the value of the '{@link master.mdsd.game.Behaviour#getBehaviourTypeId <em>Behaviour Type Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Behaviour Type Id</em>' attribute.
   * @see #getBehaviourTypeId()
   * @generated
   */
  void setBehaviourTypeId(String value);

  /**
   * Returns the value of the '<em><b>Pathfinding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pathfinding</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pathfinding</em>' containment reference.
   * @see #setPathfinding(Pathfinding)
   * @see master.mdsd.game.GamePackage#getBehaviour_Pathfinding()
   * @model containment="true"
   * @generated
   */
  Pathfinding getPathfinding();

  /**
   * Sets the value of the '{@link master.mdsd.game.Behaviour#getPathfinding <em>Pathfinding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pathfinding</em>' containment reference.
   * @see #getPathfinding()
   * @generated
   */
  void setPathfinding(Pathfinding value);

  /**
   * Returns the value of the '<em><b>Attack</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attack</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attack</em>' containment reference.
   * @see #setAttack(Attack)
   * @see master.mdsd.game.GamePackage#getBehaviour_Attack()
   * @model containment="true"
   * @generated
   */
  Attack getAttack();

  /**
   * Sets the value of the '{@link master.mdsd.game.Behaviour#getAttack <em>Attack</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attack</em>' containment reference.
   * @see #getAttack()
   * @generated
   */
  void setAttack(Attack value);

  /**
   * Returns the value of the '<em><b>Bullet</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bullet</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bullet</em>' containment reference.
   * @see #setBullet(Bullet)
   * @see master.mdsd.game.GamePackage#getBehaviour_Bullet()
   * @model containment="true"
   * @generated
   */
  Bullet getBullet();

  /**
   * Sets the value of the '{@link master.mdsd.game.Behaviour#getBullet <em>Bullet</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bullet</em>' containment reference.
   * @see #getBullet()
   * @generated
   */
  void setBullet(Bullet value);

} // Behaviour