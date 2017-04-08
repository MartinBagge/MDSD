/**
 * generated by Xtext 2.10.0
 */
package master.mdsd.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link master.mdsd.game.RuleType#getRuleTypeId <em>Rule Type Id</em>}</li>
 * </ul>
 *
 * @see master.mdsd.game.GamePackage#getRuleType()
 * @model
 * @generated
 */
public interface RuleType extends EObject
{
  /**
   * Returns the value of the '<em><b>Rule Type Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule Type Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule Type Id</em>' attribute.
   * @see #setRuleTypeId(String)
   * @see master.mdsd.game.GamePackage#getRuleType_RuleTypeId()
   * @model
   * @generated
   */
  String getRuleTypeId();

  /**
   * Sets the value of the '{@link master.mdsd.game.RuleType#getRuleTypeId <em>Rule Type Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule Type Id</em>' attribute.
   * @see #getRuleTypeId()
   * @generated
   */
  void setRuleTypeId(String value);

} // RuleType
