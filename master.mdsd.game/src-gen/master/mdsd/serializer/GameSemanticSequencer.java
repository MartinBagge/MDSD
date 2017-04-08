/*
 * generated by Xtext 2.10.0
 */
package master.mdsd.serializer;

import com.google.inject.Inject;
import java.util.Set;
import master.mdsd.game.A;
import master.mdsd.game.Ammo;
import master.mdsd.game.AttS;
import master.mdsd.game.Attack;
import master.mdsd.game.Attribute;
import master.mdsd.game.AttributeAttack;
import master.mdsd.game.AttributeInitializer;
import master.mdsd.game.Behaviour;
import master.mdsd.game.Bullet;
import master.mdsd.game.CharDec;
import master.mdsd.game.CharType;
import master.mdsd.game.CharacterAttr;
import master.mdsd.game.D;
import master.mdsd.game.DynamicEntity;
import master.mdsd.game.EQ;
import master.mdsd.game.GT;
import master.mdsd.game.GTE;
import master.mdsd.game.GamePackage;
import master.mdsd.game.Initializer;
import master.mdsd.game.IntAtt;
import master.mdsd.game.LT;
import master.mdsd.game.LTE;
import master.mdsd.game.Location;
import master.mdsd.game.LogicOperatorLoop;
import master.mdsd.game.M;
import master.mdsd.game.Map;
import master.mdsd.game.Model;
import master.mdsd.game.Pathfinding;
import master.mdsd.game.ReferenceCharacter;
import master.mdsd.game.Rule;
import master.mdsd.game.RuleSet;
import master.mdsd.game.RuleSetup;
import master.mdsd.game.RuleType;
import master.mdsd.game.T;
import master.mdsd.game.TargetRef;
import master.mdsd.game.Type;
import master.mdsd.services.GameGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GameSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GameGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GamePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GamePackage.A:
				sequence_LogicOperator(context, (A) semanticObject); 
				return; 
			case GamePackage.ACTION:
				sequence_Action(context, (master.mdsd.game.Action) semanticObject); 
				return; 
			case GamePackage.AMMO:
				sequence_AttributeTypeAttack(context, (Ammo) semanticObject); 
				return; 
			case GamePackage.ATT_S:
				sequence_AttributeTypeAttack(context, (AttS) semanticObject); 
				return; 
			case GamePackage.ATTACK:
				sequence_Attack(context, (Attack) semanticObject); 
				return; 
			case GamePackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case GamePackage.ATTRIBUTE_ATTACK:
				sequence_AttributeAttack(context, (AttributeAttack) semanticObject); 
				return; 
			case GamePackage.ATTRIBUTE_INITIALIZER:
				sequence_AttributeInitializer(context, (AttributeInitializer) semanticObject); 
				return; 
			case GamePackage.BEHAVIOUR:
				sequence_Behaviour(context, (Behaviour) semanticObject); 
				return; 
			case GamePackage.BULLET:
				if (rule == grammarAccess.getAttributeTypeAttackRule()) {
					sequence_AttributeTypeAttack(context, (Bullet) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getBulletRule()) {
					sequence_Bullet(context, (Bullet) semanticObject); 
					return; 
				}
				else break;
			case GamePackage.CHAR_DEC:
				sequence_CharDec(context, (CharDec) semanticObject); 
				return; 
			case GamePackage.CHAR_TYPE:
				sequence_CharType(context, (CharType) semanticObject); 
				return; 
			case GamePackage.CHARACTER:
				sequence_Character(context, (master.mdsd.game.Character) semanticObject); 
				return; 
			case GamePackage.CHARACTER_ATTR:
				sequence_CharacterAttr(context, (CharacterAttr) semanticObject); 
				return; 
			case GamePackage.D:
				sequence_LogicOperator(context, (D) semanticObject); 
				return; 
			case GamePackage.DYNAMIC_ENTITY:
				sequence_DynamicEntity(context, (DynamicEntity) semanticObject); 
				return; 
			case GamePackage.EQ:
				sequence_CompOperator(context, (EQ) semanticObject); 
				return; 
			case GamePackage.GT:
				sequence_CompOperator(context, (GT) semanticObject); 
				return; 
			case GamePackage.GTE:
				sequence_CompOperator(context, (GTE) semanticObject); 
				return; 
			case GamePackage.INITIALIZER:
				sequence_Initializer(context, (Initializer) semanticObject); 
				return; 
			case GamePackage.INT_ATT:
				sequence_IntAtt(context, (IntAtt) semanticObject); 
				return; 
			case GamePackage.LT:
				sequence_CompOperator(context, (LT) semanticObject); 
				return; 
			case GamePackage.LTE:
				sequence_CompOperator(context, (LTE) semanticObject); 
				return; 
			case GamePackage.LOCATION:
				sequence_Location(context, (Location) semanticObject); 
				return; 
			case GamePackage.LOGIC_OPERATOR_LOOP:
				sequence_LogicOperatorLoop(context, (LogicOperatorLoop) semanticObject); 
				return; 
			case GamePackage.M:
				sequence_LogicOperator(context, (M) semanticObject); 
				return; 
			case GamePackage.MAP:
				sequence_Map(context, (Map) semanticObject); 
				return; 
			case GamePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case GamePackage.OBJECT:
				sequence_Object(context, (master.mdsd.game.Object) semanticObject); 
				return; 
			case GamePackage.PATHFINDING:
				sequence_Pathfinding(context, (Pathfinding) semanticObject); 
				return; 
			case GamePackage.REFERENCE_CHARACTER:
				sequence_ReferenceCharacter(context, (ReferenceCharacter) semanticObject); 
				return; 
			case GamePackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case GamePackage.RULE_SET:
				sequence_RuleSet(context, (RuleSet) semanticObject); 
				return; 
			case GamePackage.RULE_SETUP:
				sequence_RuleSetup(context, (RuleSetup) semanticObject); 
				return; 
			case GamePackage.RULE_TYPE:
				sequence_RuleType(context, (RuleType) semanticObject); 
				return; 
			case GamePackage.T:
				sequence_LogicOperator(context, (T) semanticObject); 
				return; 
			case GamePackage.TARGET_REF:
				sequence_TargetRef(context, (TargetRef) semanticObject); 
				return; 
			case GamePackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (charAtt=CharacterAttr charDec=CharDec lo+=LogicOperatorLoop?)
	 */
	protected void sequence_Action(ISerializationContext context, master.mdsd.game.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attack returns Attack
	 *
	 * Constraint:
	 *     (name=ID attributes+=Attribute* attributesAttack+=AttributeAttack* rules+=RuleSet?)
	 */
	protected void sequence_Attack(ISerializationContext context, Attack semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeAttack returns AttributeAttack
	 *
	 * Constraint:
	 *     (attributeTypesAttack+=AttributeTypeAttack type+=Type?)
	 */
	protected void sequence_AttributeAttack(ISerializationContext context, AttributeAttack semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeInitializer returns AttributeInitializer
	 *
	 * Constraint:
	 *     (attributeId=ID amountValueId=INT? target+=TargetRef)
	 */
	protected void sequence_AttributeInitializer(ISerializationContext context, AttributeInitializer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeTypeAttack returns Ammo
	 *
	 * Constraint:
	 *     {Ammo}
	 */
	protected void sequence_AttributeTypeAttack(ISerializationContext context, Ammo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeTypeAttack returns AttS
	 *
	 * Constraint:
	 *     {AttS}
	 */
	protected void sequence_AttributeTypeAttack(ISerializationContext context, AttS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeTypeAttack returns Bullet
	 *
	 * Constraint:
	 *     bulletRef=[Bullet|ID]
	 */
	protected void sequence_AttributeTypeAttack(ISerializationContext context, Bullet semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.BULLET__BULLET_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.BULLET__BULLET_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeTypeAttackAccess().getBulletRefBulletIDTerminalRuleCall_2_2_0_1(), semanticObject.getBulletRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (attributename=ID type+=Type)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Behaviour returns Behaviour
	 *
	 * Constraint:
	 *     ((behaviourTypeId='Pathfinding' pathfinding=Pathfinding) | (behaviourTypeId='Attack' attack=Attack) | (behaviourTypeId='Bullet' bullet=Bullet))
	 */
	protected void sequence_Behaviour(ISerializationContext context, Behaviour semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Bullet returns Bullet
	 *
	 * Constraint:
	 *     (name=ID attributesBullet+=Attribute*)
	 */
	protected void sequence_Bullet(ISerializationContext context, Bullet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CharDec returns CharDec
	 *
	 * Constraint:
	 *     (charAttResult+=CharacterAttr | val=INTORDEC)
	 */
	protected void sequence_CharDec(ISerializationContext context, CharDec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CharType returns CharType
	 *
	 * Constraint:
	 *     charTypeid=ID
	 */
	protected void sequence_CharType(ISerializationContext context, CharType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.CHAR_TYPE__CHAR_TYPEID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.CHAR_TYPE__CHAR_TYPEID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCharTypeAccess().getCharTypeidIDTerminalRuleCall_0(), semanticObject.getCharTypeid());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CharacterAttr returns CharacterAttr
	 *
	 * Constraint:
	 *     (reference=ReferenceCharacter attributename=ID)
	 */
	protected void sequence_CharacterAttr(ISerializationContext context, CharacterAttr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.CHARACTER_ATTR__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.CHARACTER_ATTR__REFERENCE));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.CHARACTER_ATTR__ATTRIBUTENAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.CHARACTER_ATTR__ATTRIBUTENAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCharacterAttrAccess().getReferenceReferenceCharacterParserRuleCall_0_0(), semanticObject.getReference());
		feeder.accept(grammarAccess.getCharacterAttrAccess().getAttributenameIDTerminalRuleCall_1_0(), semanticObject.getAttributename());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Character returns Character
	 *
	 * Constraint:
	 *     (char=CharType name=ID att+=Attribute*)
	 */
	protected void sequence_Character(ISerializationContext context, master.mdsd.game.Character semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CompOperator returns EQ
	 *
	 * Constraint:
	 *     {EQ}
	 */
	protected void sequence_CompOperator(ISerializationContext context, EQ semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CompOperator returns GT
	 *
	 * Constraint:
	 *     {GT}
	 */
	protected void sequence_CompOperator(ISerializationContext context, GT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CompOperator returns GTE
	 *
	 * Constraint:
	 *     {GTE}
	 */
	protected void sequence_CompOperator(ISerializationContext context, GTE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CompOperator returns LT
	 *
	 * Constraint:
	 *     {LT}
	 */
	protected void sequence_CompOperator(ISerializationContext context, LT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CompOperator returns LTE
	 *
	 * Constraint:
	 *     {LTE}
	 */
	protected void sequence_CompOperator(ISerializationContext context, LTE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns DynamicEntity
	 *     DynamicEntity returns DynamicEntity
	 *
	 * Constraint:
	 *     ((entityid='Character' character+=Character) | (entityid='Object' object+=Object) | (entityid='Behaviour' behaviour+=Behaviour))
	 */
	protected void sequence_DynamicEntity(ISerializationContext context, DynamicEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Initializer
	 *     StaticEntity returns Initializer
	 *     Initializer returns Initializer
	 *
	 * Constraint:
	 *     (entityId='Initializer' attributesInitializer+=AttributeInitializer*)
	 */
	protected void sequence_Initializer(ISerializationContext context, Initializer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IntAtt returns IntAtt
	 *
	 * Constraint:
	 *     (value=INTORDEC | attrId=ID)
	 */
	protected void sequence_IntAtt(ISerializationContext context, IntAtt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Location returns Location
	 *
	 * Constraint:
	 *     (locationId='random' | (typea=Type typeb=Type) | (charAtt+=Attribute logicOp+=LogicOperator typec+=Type))
	 */
	protected void sequence_Location(ISerializationContext context, Location semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LogicOperatorLoop returns LogicOperatorLoop
	 *
	 * Constraint:
	 *     (logicOp+=LogicOperator intAtt+=IntAtt lop+=LogicOperatorLoop?)
	 */
	protected void sequence_LogicOperatorLoop(ISerializationContext context, LogicOperatorLoop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LogicOperator returns A
	 *
	 * Constraint:
	 *     {A}
	 */
	protected void sequence_LogicOperator(ISerializationContext context, A semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LogicOperator returns D
	 *
	 * Constraint:
	 *     {D}
	 */
	protected void sequence_LogicOperator(ISerializationContext context, D semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LogicOperator returns M
	 *
	 * Constraint:
	 *     {M}
	 */
	protected void sequence_LogicOperator(ISerializationContext context, M semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LogicOperator returns T
	 *
	 * Constraint:
	 *     {T}
	 */
	protected void sequence_LogicOperator(ISerializationContext context, T semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Map returns Map
	 *     Entity returns Map
	 *     StaticEntity returns Map
	 *
	 * Constraint:
	 *     (entityId='Map' attributes+=Attribute*)
	 */
	protected void sequence_Map(ISerializationContext context, Map semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (map=Map entities+=Entity* ini=Initializer)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Object returns Object
	 *
	 * Constraint:
	 *     (name=ID att+=Attribute*)
	 */
	protected void sequence_Object(ISerializationContext context, master.mdsd.game.Object semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pathfinding returns Pathfinding
	 *
	 * Constraint:
	 *     (name=ID attPathfinding+=Attribute* ruleSets+=RuleSet*)
	 */
	protected void sequence_Pathfinding(ISerializationContext context, Pathfinding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReferenceCharacter returns ReferenceCharacter
	 *
	 * Constraint:
	 *     (characterId=[Character|ID] | targetId='self')
	 */
	protected void sequence_ReferenceCharacter(ISerializationContext context, ReferenceCharacter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RuleSet returns RuleSet
	 *
	 * Constraint:
	 *     (ifId+='if' rule=Rule (elseIfId+='elseif' elseRules+=Rule)*)
	 */
	protected void sequence_RuleSet(ISerializationContext context, RuleSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RuleSetup returns RuleSetup
	 *
	 * Constraint:
	 *     (attributeRefLeft=ReferenceCharacter? ruleType=RuleType operator=CompOperator intAttleft=IntAtt lo=LogicOperatorLoop?)
	 */
	protected void sequence_RuleSetup(ISerializationContext context, RuleSetup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RuleType returns RuleType
	 *
	 * Constraint:
	 *     ruleTypeId=ID
	 */
	protected void sequence_RuleType(ISerializationContext context, RuleType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.RULE_TYPE__RULE_TYPE_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.RULE_TYPE__RULE_TYPE_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRuleTypeAccess().getRuleTypeIdIDTerminalRuleCall_0(), semanticObject.getRuleTypeId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (ruleSetup=RuleSetup toDoAction=Action)
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.RULE__RULE_SETUP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.RULE__RULE_SETUP));
			if (transientValues.isValueTransient(semanticObject, GamePackage.Literals.RULE__TO_DO_ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GamePackage.Literals.RULE__TO_DO_ACTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRuleAccess().getRuleSetupRuleSetupParserRuleCall_1_0(), semanticObject.getRuleSetup());
		feeder.accept(grammarAccess.getRuleAccess().getToDoActionActionParserRuleCall_3_0(), semanticObject.getToDoAction());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TargetRef returns TargetRef
	 *
	 * Constraint:
	 *     (targetId=ID locationsId+=Location locationsId+=Location*)
	 */
	protected void sequence_TargetRef(ISerializationContext context, TargetRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Type
	 *
	 * Constraint:
	 *     (valueId=INTORDEC | valueId=ID | valueId=VECTOR)
	 */
	protected void sequence_Type(ISerializationContext context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}