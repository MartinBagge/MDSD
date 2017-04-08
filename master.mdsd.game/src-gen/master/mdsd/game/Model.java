/**
 * generated by Xtext 2.10.0
 */
package master.mdsd.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link master.mdsd.game.Model#getMap <em>Map</em>}</li>
 *   <li>{@link master.mdsd.game.Model#getEntities <em>Entities</em>}</li>
 *   <li>{@link master.mdsd.game.Model#getIni <em>Ini</em>}</li>
 * </ul>
 *
 * @see master.mdsd.game.GamePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Map</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map</em>' containment reference.
   * @see #setMap(Map)
   * @see master.mdsd.game.GamePackage#getModel_Map()
   * @model containment="true"
   * @generated
   */
  Map getMap();

  /**
   * Sets the value of the '{@link master.mdsd.game.Model#getMap <em>Map</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Map</em>' containment reference.
   * @see #getMap()
   * @generated
   */
  void setMap(Map value);

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link master.mdsd.game.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see master.mdsd.game.GamePackage#getModel_Entities()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntities();

  /**
   * Returns the value of the '<em><b>Ini</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ini</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ini</em>' containment reference.
   * @see #setIni(Initializer)
   * @see master.mdsd.game.GamePackage#getModel_Ini()
   * @model containment="true"
   * @generated
   */
  Initializer getIni();

  /**
   * Sets the value of the '{@link master.mdsd.game.Model#getIni <em>Ini</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ini</em>' containment reference.
   * @see #getIni()
   * @generated
   */
  void setIni(Initializer value);

} // Model