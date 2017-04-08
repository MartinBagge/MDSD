/**
 * generated by Xtext 2.10.0
 */
package master.mdsd.game;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link master.mdsd.game.Initializer#getAttributesInitializer <em>Attributes Initializer</em>}</li>
 * </ul>
 *
 * @see master.mdsd.game.GamePackage#getInitializer()
 * @model
 * @generated
 */
public interface Initializer extends StaticEntity
{
  /**
   * Returns the value of the '<em><b>Attributes Initializer</b></em>' containment reference list.
   * The list contents are of type {@link master.mdsd.game.AttributeInitializer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes Initializer</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes Initializer</em>' containment reference list.
   * @see master.mdsd.game.GamePackage#getInitializer_AttributesInitializer()
   * @model containment="true"
   * @generated
   */
  EList<AttributeInitializer> getAttributesInitializer();

} // Initializer
