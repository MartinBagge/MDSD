/*
 * generated by Xtext 2.10.0
 */
package master.mdsd.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import master.mdsd.ide.contentassist.antlr.internal.InternalGameParser;
import master.mdsd.services.GameGrammarAccess;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class GameParser extends AbstractContentAssistParser {

	@Inject
	private GameGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalGameParser createParser() {
		InternalGameParser result = new InternalGameParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEntityAccess().getAlternatives(), "rule__Entity__Alternatives");
					put(grammarAccess.getDynamicEntityAccess().getAlternatives(), "rule__DynamicEntity__Alternatives");
					put(grammarAccess.getStaticEntityAccess().getAlternatives(), "rule__StaticEntity__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getINTORDECAccess().getAlternatives(), "rule__INTORDEC__Alternatives");
					put(grammarAccess.getBehaviourAccess().getAlternatives(), "rule__Behaviour__Alternatives");
					put(grammarAccess.getIntAttAccess().getAlternatives(), "rule__IntAtt__Alternatives");
					put(grammarAccess.getReferenceCharacterAccess().getAlternatives(), "rule__ReferenceCharacter__Alternatives");
					put(grammarAccess.getCompOperatorAccess().getAlternatives(), "rule__CompOperator__Alternatives");
					put(grammarAccess.getCharDecAccess().getAlternatives(), "rule__CharDec__Alternatives");
					put(grammarAccess.getLogicOperatorAccess().getAlternatives(), "rule__LogicOperator__Alternatives");
					put(grammarAccess.getAttributeTypeAttackAccess().getAlternatives(), "rule__AttributeTypeAttack__Alternatives");
					put(grammarAccess.getLocationAccess().getAlternatives(), "rule__Location__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getMapAccess().getGroup(), "rule__Map__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getDynamicEntityAccess().getGroup_0(), "rule__DynamicEntity__Group_0__0");
					put(grammarAccess.getDynamicEntityAccess().getGroup_1(), "rule__DynamicEntity__Group_1__0");
					put(grammarAccess.getDynamicEntityAccess().getGroup_2(), "rule__DynamicEntity__Group_2__0");
					put(grammarAccess.getCharacterAccess().getGroup(), "rule__Character__Group__0");
					put(grammarAccess.getVECTORAccess().getGroup(), "rule__VECTOR__Group__0");
					put(grammarAccess.getObjectAccess().getGroup(), "rule__Object__Group__0");
					put(grammarAccess.getBehaviourAccess().getGroup_0(), "rule__Behaviour__Group_0__0");
					put(grammarAccess.getBehaviourAccess().getGroup_1(), "rule__Behaviour__Group_1__0");
					put(grammarAccess.getBehaviourAccess().getGroup_2(), "rule__Behaviour__Group_2__0");
					put(grammarAccess.getPathfindingAccess().getGroup(), "rule__Pathfinding__Group__0");
					put(grammarAccess.getRuleSetAccess().getGroup(), "rule__RuleSet__Group__0");
					put(grammarAccess.getRuleSetAccess().getGroup_2(), "rule__RuleSet__Group_2__0");
					put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
					put(grammarAccess.getRuleSetupAccess().getGroup(), "rule__RuleSetup__Group__0");
					put(grammarAccess.getIntAttAccess().getGroup_1(), "rule__IntAtt__Group_1__0");
					put(grammarAccess.getDECIMALAccess().getGroup(), "rule__DECIMAL__Group__0");
					put(grammarAccess.getLogicOperatorLoopAccess().getGroup(), "rule__LogicOperatorLoop__Group__0");
					put(grammarAccess.getReferenceCharacterAccess().getGroup_0(), "rule__ReferenceCharacter__Group_0__0");
					put(grammarAccess.getReferenceCharacterAccess().getGroup_1(), "rule__ReferenceCharacter__Group_1__0");
					put(grammarAccess.getCompOperatorAccess().getGroup_0(), "rule__CompOperator__Group_0__0");
					put(grammarAccess.getCompOperatorAccess().getGroup_1(), "rule__CompOperator__Group_1__0");
					put(grammarAccess.getCompOperatorAccess().getGroup_2(), "rule__CompOperator__Group_2__0");
					put(grammarAccess.getCompOperatorAccess().getGroup_3(), "rule__CompOperator__Group_3__0");
					put(grammarAccess.getCompOperatorAccess().getGroup_4(), "rule__CompOperator__Group_4__0");
					put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
					put(grammarAccess.getCharacterAttrAccess().getGroup(), "rule__CharacterAttr__Group__0");
					put(grammarAccess.getLogicOperatorAccess().getGroup_0(), "rule__LogicOperator__Group_0__0");
					put(grammarAccess.getLogicOperatorAccess().getGroup_1(), "rule__LogicOperator__Group_1__0");
					put(grammarAccess.getLogicOperatorAccess().getGroup_2(), "rule__LogicOperator__Group_2__0");
					put(grammarAccess.getLogicOperatorAccess().getGroup_3(), "rule__LogicOperator__Group_3__0");
					put(grammarAccess.getAttackAccess().getGroup(), "rule__Attack__Group__0");
					put(grammarAccess.getAttributeAttackAccess().getGroup(), "rule__AttributeAttack__Group__0");
					put(grammarAccess.getAttributeTypeAttackAccess().getGroup_0(), "rule__AttributeTypeAttack__Group_0__0");
					put(grammarAccess.getAttributeTypeAttackAccess().getGroup_1(), "rule__AttributeTypeAttack__Group_1__0");
					put(grammarAccess.getAttributeTypeAttackAccess().getGroup_2(), "rule__AttributeTypeAttack__Group_2__0");
					put(grammarAccess.getBulletAccess().getGroup(), "rule__Bullet__Group__0");
					put(grammarAccess.getInitializerAccess().getGroup(), "rule__Initializer__Group__0");
					put(grammarAccess.getAttributeInitializerAccess().getGroup(), "rule__AttributeInitializer__Group__0");
					put(grammarAccess.getTargetRefAccess().getGroup(), "rule__TargetRef__Group__0");
					put(grammarAccess.getTargetRefAccess().getGroup_3(), "rule__TargetRef__Group_3__0");
					put(grammarAccess.getLocationAccess().getGroup_1(), "rule__Location__Group_1__0");
					put(grammarAccess.getLocationAccess().getGroup_2(), "rule__Location__Group_2__0");
					put(grammarAccess.getModelAccess().getMapAssignment_2(), "rule__Model__MapAssignment_2");
					put(grammarAccess.getModelAccess().getEntitiesAssignment_3(), "rule__Model__EntitiesAssignment_3");
					put(grammarAccess.getModelAccess().getIniAssignment_4(), "rule__Model__IniAssignment_4");
					put(grammarAccess.getMapAccess().getEntityIdAssignment_1(), "rule__Map__EntityIdAssignment_1");
					put(grammarAccess.getMapAccess().getAttributesAssignment_3(), "rule__Map__AttributesAssignment_3");
					put(grammarAccess.getAttributeAccess().getAttributenameAssignment_1(), "rule__Attribute__AttributenameAssignment_1");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_2(), "rule__Attribute__TypeAssignment_2");
					put(grammarAccess.getDynamicEntityAccess().getEntityidAssignment_0_0(), "rule__DynamicEntity__EntityidAssignment_0_0");
					put(grammarAccess.getDynamicEntityAccess().getCharacterAssignment_0_1(), "rule__DynamicEntity__CharacterAssignment_0_1");
					put(grammarAccess.getDynamicEntityAccess().getEntityidAssignment_1_0(), "rule__DynamicEntity__EntityidAssignment_1_0");
					put(grammarAccess.getDynamicEntityAccess().getObjectAssignment_1_1(), "rule__DynamicEntity__ObjectAssignment_1_1");
					put(grammarAccess.getDynamicEntityAccess().getEntityidAssignment_2_0(), "rule__DynamicEntity__EntityidAssignment_2_0");
					put(grammarAccess.getDynamicEntityAccess().getBehaviourAssignment_2_1(), "rule__DynamicEntity__BehaviourAssignment_2_1");
					put(grammarAccess.getCharacterAccess().getCharAssignment_0(), "rule__Character__CharAssignment_0");
					put(grammarAccess.getCharacterAccess().getNameAssignment_1(), "rule__Character__NameAssignment_1");
					put(grammarAccess.getCharacterAccess().getAttAssignment_3(), "rule__Character__AttAssignment_3");
					put(grammarAccess.getTypeAccess().getValueIdAssignment_0(), "rule__Type__ValueIdAssignment_0");
					put(grammarAccess.getTypeAccess().getValueIdAssignment_1(), "rule__Type__ValueIdAssignment_1");
					put(grammarAccess.getTypeAccess().getValueIdAssignment_2(), "rule__Type__ValueIdAssignment_2");
					put(grammarAccess.getCharTypeAccess().getCharTypeidAssignment(), "rule__CharType__CharTypeidAssignment");
					put(grammarAccess.getObjectAccess().getNameAssignment_0(), "rule__Object__NameAssignment_0");
					put(grammarAccess.getObjectAccess().getAttAssignment_2(), "rule__Object__AttAssignment_2");
					put(grammarAccess.getBehaviourAccess().getBehaviourTypeIdAssignment_0_0(), "rule__Behaviour__BehaviourTypeIdAssignment_0_0");
					put(grammarAccess.getBehaviourAccess().getPathfindingAssignment_0_1(), "rule__Behaviour__PathfindingAssignment_0_1");
					put(grammarAccess.getBehaviourAccess().getBehaviourTypeIdAssignment_1_0(), "rule__Behaviour__BehaviourTypeIdAssignment_1_0");
					put(grammarAccess.getBehaviourAccess().getAttackAssignment_1_1(), "rule__Behaviour__AttackAssignment_1_1");
					put(grammarAccess.getBehaviourAccess().getBehaviourTypeIdAssignment_2_0(), "rule__Behaviour__BehaviourTypeIdAssignment_2_0");
					put(grammarAccess.getBehaviourAccess().getBulletAssignment_2_1(), "rule__Behaviour__BulletAssignment_2_1");
					put(grammarAccess.getPathfindingAccess().getNameAssignment_0(), "rule__Pathfinding__NameAssignment_0");
					put(grammarAccess.getPathfindingAccess().getAttPathfindingAssignment_2(), "rule__Pathfinding__AttPathfindingAssignment_2");
					put(grammarAccess.getPathfindingAccess().getRuleSetsAssignment_3(), "rule__Pathfinding__RuleSetsAssignment_3");
					put(grammarAccess.getRuleSetAccess().getIfIdAssignment_0(), "rule__RuleSet__IfIdAssignment_0");
					put(grammarAccess.getRuleSetAccess().getRuleAssignment_1(), "rule__RuleSet__RuleAssignment_1");
					put(grammarAccess.getRuleSetAccess().getElseIfIdAssignment_2_0(), "rule__RuleSet__ElseIfIdAssignment_2_0");
					put(grammarAccess.getRuleSetAccess().getElseRulesAssignment_2_1(), "rule__RuleSet__ElseRulesAssignment_2_1");
					put(grammarAccess.getRuleAccess().getRuleSetupAssignment_1(), "rule__Rule__RuleSetupAssignment_1");
					put(grammarAccess.getRuleAccess().getToDoActionAssignment_3(), "rule__Rule__ToDoActionAssignment_3");
					put(grammarAccess.getRuleSetupAccess().getAttributeRefLeftAssignment_0(), "rule__RuleSetup__AttributeRefLeftAssignment_0");
					put(grammarAccess.getRuleSetupAccess().getRuleTypeAssignment_1(), "rule__RuleSetup__RuleTypeAssignment_1");
					put(grammarAccess.getRuleSetupAccess().getOperatorAssignment_2(), "rule__RuleSetup__OperatorAssignment_2");
					put(grammarAccess.getRuleSetupAccess().getIntAttleftAssignment_3(), "rule__RuleSetup__IntAttleftAssignment_3");
					put(grammarAccess.getRuleSetupAccess().getLoAssignment_4(), "rule__RuleSetup__LoAssignment_4");
					put(grammarAccess.getIntAttAccess().getValueAssignment_0(), "rule__IntAtt__ValueAssignment_0");
					put(grammarAccess.getIntAttAccess().getAttrIdAssignment_1_1(), "rule__IntAtt__AttrIdAssignment_1_1");
					put(grammarAccess.getLogicOperatorLoopAccess().getLogicOpAssignment_0(), "rule__LogicOperatorLoop__LogicOpAssignment_0");
					put(grammarAccess.getLogicOperatorLoopAccess().getIntAttAssignment_1(), "rule__LogicOperatorLoop__IntAttAssignment_1");
					put(grammarAccess.getLogicOperatorLoopAccess().getLopAssignment_2(), "rule__LogicOperatorLoop__LopAssignment_2");
					put(grammarAccess.getReferenceCharacterAccess().getCharacterIdAssignment_0_1(), "rule__ReferenceCharacter__CharacterIdAssignment_0_1");
					put(grammarAccess.getReferenceCharacterAccess().getTargetIdAssignment_1_1(), "rule__ReferenceCharacter__TargetIdAssignment_1_1");
					put(grammarAccess.getRuleTypeAccess().getRuleTypeIdAssignment(), "rule__RuleType__RuleTypeIdAssignment");
					put(grammarAccess.getActionAccess().getCharAttAssignment_1(), "rule__Action__CharAttAssignment_1");
					put(grammarAccess.getActionAccess().getCharDecAssignment_3(), "rule__Action__CharDecAssignment_3");
					put(grammarAccess.getActionAccess().getLoAssignment_4(), "rule__Action__LoAssignment_4");
					put(grammarAccess.getCharDecAccess().getCharAttResultAssignment_0(), "rule__CharDec__CharAttResultAssignment_0");
					put(grammarAccess.getCharDecAccess().getValAssignment_1(), "rule__CharDec__ValAssignment_1");
					put(grammarAccess.getCharacterAttrAccess().getReferenceAssignment_0(), "rule__CharacterAttr__ReferenceAssignment_0");
					put(grammarAccess.getCharacterAttrAccess().getAttributenameAssignment_1(), "rule__CharacterAttr__AttributenameAssignment_1");
					put(grammarAccess.getAttackAccess().getNameAssignment_0(), "rule__Attack__NameAssignment_0");
					put(grammarAccess.getAttackAccess().getAttributesAssignment_2(), "rule__Attack__AttributesAssignment_2");
					put(grammarAccess.getAttackAccess().getAttributesAttackAssignment_3(), "rule__Attack__AttributesAttackAssignment_3");
					put(grammarAccess.getAttackAccess().getRulesAssignment_4(), "rule__Attack__RulesAssignment_4");
					put(grammarAccess.getAttributeAttackAccess().getAttributeTypesAttackAssignment_0(), "rule__AttributeAttack__AttributeTypesAttackAssignment_0");
					put(grammarAccess.getAttributeAttackAccess().getTypeAssignment_1(), "rule__AttributeAttack__TypeAssignment_1");
					put(grammarAccess.getAttributeTypeAttackAccess().getBulletRefAssignment_2_2(), "rule__AttributeTypeAttack__BulletRefAssignment_2_2");
					put(grammarAccess.getBulletAccess().getNameAssignment_0(), "rule__Bullet__NameAssignment_0");
					put(grammarAccess.getBulletAccess().getAttributesBulletAssignment_2(), "rule__Bullet__AttributesBulletAssignment_2");
					put(grammarAccess.getInitializerAccess().getEntityIdAssignment_1(), "rule__Initializer__EntityIdAssignment_1");
					put(grammarAccess.getInitializerAccess().getAttributesInitializerAssignment_3(), "rule__Initializer__AttributesInitializerAssignment_3");
					put(grammarAccess.getAttributeInitializerAccess().getAttributeIdAssignment_0(), "rule__AttributeInitializer__AttributeIdAssignment_0");
					put(grammarAccess.getAttributeInitializerAccess().getAmountValueIdAssignment_1(), "rule__AttributeInitializer__AmountValueIdAssignment_1");
					put(grammarAccess.getAttributeInitializerAccess().getTargetAssignment_2(), "rule__AttributeInitializer__TargetAssignment_2");
					put(grammarAccess.getTargetRefAccess().getTargetIdAssignment_0(), "rule__TargetRef__TargetIdAssignment_0");
					put(grammarAccess.getTargetRefAccess().getLocationsIdAssignment_2(), "rule__TargetRef__LocationsIdAssignment_2");
					put(grammarAccess.getTargetRefAccess().getLocationsIdAssignment_3_1(), "rule__TargetRef__LocationsIdAssignment_3_1");
					put(grammarAccess.getLocationAccess().getLocationIdAssignment_0(), "rule__Location__LocationIdAssignment_0");
					put(grammarAccess.getLocationAccess().getTypeaAssignment_1_1(), "rule__Location__TypeaAssignment_1_1");
					put(grammarAccess.getLocationAccess().getTypebAssignment_1_3(), "rule__Location__TypebAssignment_1_3");
					put(grammarAccess.getLocationAccess().getCharAttAssignment_2_0(), "rule__Location__CharAttAssignment_2_0");
					put(grammarAccess.getLocationAccess().getLogicOpAssignment_2_1(), "rule__Location__LogicOpAssignment_2_1");
					put(grammarAccess.getLocationAccess().getTypecAssignment_2_2(), "rule__Location__TypecAssignment_2_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalGameParser typedParser = (InternalGameParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GameGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GameGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
