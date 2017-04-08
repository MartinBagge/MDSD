package master.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import master.mdsd.services.GameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'{'", "'}'", "'Map'", "'Character'", "'Object'", "'Behaviour'", "'Pathfinding'", "'Attack'", "'Bullet'", "'if'", "'elseif'", "'('", "')'", "'self'", "'.'", "'<'", "'>'", "'<='", "'>='", "'='", "'*'", "'+'", "'-'", "'/'", "'Ammunition'", "'Attackspeed'", "'Initializer'", "','", "'random'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGameParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGameParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGameParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGame.g"; }



     	private GameGrammarAccess grammarAccess;

        public InternalGameParser(TokenStream input, GameGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected GameGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalGame.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGame.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalGame.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGame.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Game' otherlv_1= '{' ( (lv_map_2_0= ruleMap ) ) ( (lv_entities_3_0= ruleEntity ) )* ( (lv_ini_4_0= ruleInitializer ) ) otherlv_5= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_map_2_0 = null;

        EObject lv_entities_3_0 = null;

        EObject lv_ini_4_0 = null;



        	enterRule();

        try {
            // InternalGame.g:77:2: ( (otherlv_0= 'Game' otherlv_1= '{' ( (lv_map_2_0= ruleMap ) ) ( (lv_entities_3_0= ruleEntity ) )* ( (lv_ini_4_0= ruleInitializer ) ) otherlv_5= '}' ) )
            // InternalGame.g:78:2: (otherlv_0= 'Game' otherlv_1= '{' ( (lv_map_2_0= ruleMap ) ) ( (lv_entities_3_0= ruleEntity ) )* ( (lv_ini_4_0= ruleInitializer ) ) otherlv_5= '}' )
            {
            // InternalGame.g:78:2: (otherlv_0= 'Game' otherlv_1= '{' ( (lv_map_2_0= ruleMap ) ) ( (lv_entities_3_0= ruleEntity ) )* ( (lv_ini_4_0= ruleInitializer ) ) otherlv_5= '}' )
            // InternalGame.g:79:3: otherlv_0= 'Game' otherlv_1= '{' ( (lv_map_2_0= ruleMap ) ) ( (lv_entities_3_0= ruleEntity ) )* ( (lv_ini_4_0= ruleInitializer ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getGameKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:87:3: ( (lv_map_2_0= ruleMap ) )
            // InternalGame.g:88:4: (lv_map_2_0= ruleMap )
            {
            // InternalGame.g:88:4: (lv_map_2_0= ruleMap )
            // InternalGame.g:89:5: lv_map_2_0= ruleMap
            {

            					newCompositeNode(grammarAccess.getModelAccess().getMapMapParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_map_2_0=ruleMap();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"map",
            						lv_map_2_0,
            						"master.mdsd.Game.Map");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:106:3: ( (lv_entities_3_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalGame.g:107:4: (lv_entities_3_0= ruleEntity )
            	    {
            	    // InternalGame.g:107:4: (lv_entities_3_0= ruleEntity )
            	    // InternalGame.g:108:5: lv_entities_3_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_entities_3_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_3_0,
            	    						"master.mdsd.Game.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalGame.g:125:3: ( (lv_ini_4_0= ruleInitializer ) )
            // InternalGame.g:126:4: (lv_ini_4_0= ruleInitializer )
            {
            // InternalGame.g:126:4: (lv_ini_4_0= ruleInitializer )
            // InternalGame.g:127:5: lv_ini_4_0= ruleInitializer
            {

            					newCompositeNode(grammarAccess.getModelAccess().getIniInitializerParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_ini_4_0=ruleInitializer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"ini",
            						lv_ini_4_0,
            						"master.mdsd.Game.Initializer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMap"
    // InternalGame.g:152:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // InternalGame.g:152:44: (iv_ruleMap= ruleMap EOF )
            // InternalGame.g:153:2: iv_ruleMap= ruleMap EOF
            {
             newCompositeNode(grammarAccess.getMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMap=ruleMap();

            state._fsp--;

             current =iv_ruleMap; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // InternalGame.g:159:1: ruleMap returns [EObject current=null] : ( () ( (lv_entityId_1_0= 'Map' ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleMap() throws RecognitionException {
        EObject current = null;

        Token lv_entityId_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:165:2: ( ( () ( (lv_entityId_1_0= 'Map' ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // InternalGame.g:166:2: ( () ( (lv_entityId_1_0= 'Map' ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // InternalGame.g:166:2: ( () ( (lv_entityId_1_0= 'Map' ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // InternalGame.g:167:3: () ( (lv_entityId_1_0= 'Map' ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            // InternalGame.g:167:3: ()
            // InternalGame.g:168:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMapAccess().getMapAction_0(),
            					current);
            			

            }

            // InternalGame.g:174:3: ( (lv_entityId_1_0= 'Map' ) )
            // InternalGame.g:175:4: (lv_entityId_1_0= 'Map' )
            {
            // InternalGame.g:175:4: (lv_entityId_1_0= 'Map' )
            // InternalGame.g:176:5: lv_entityId_1_0= 'Map'
            {
            lv_entityId_1_0=(Token)match(input,14,FOLLOW_3); 

            					newLeafNode(lv_entityId_1_0, grammarAccess.getMapAccess().getEntityIdMapKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapRule());
            					}
            					setWithLastConsumed(current, "entityId", lv_entityId_1_0, "Map");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMapAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:192:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGame.g:193:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalGame.g:193:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalGame.g:194:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getMapAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMapRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"master.mdsd.Game.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMapAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleAttribute"
    // InternalGame.g:219:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalGame.g:219:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalGame.g:220:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalGame.g:226:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_attributename_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_attributename_1_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:232:2: ( ( () ( (lv_attributename_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) ) )
            // InternalGame.g:233:2: ( () ( (lv_attributename_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalGame.g:233:2: ( () ( (lv_attributename_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) )
            // InternalGame.g:234:3: () ( (lv_attributename_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) )
            {
            // InternalGame.g:234:3: ()
            // InternalGame.g:235:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            // InternalGame.g:241:3: ( (lv_attributename_1_0= RULE_ID ) )
            // InternalGame.g:242:4: (lv_attributename_1_0= RULE_ID )
            {
            // InternalGame.g:242:4: (lv_attributename_1_0= RULE_ID )
            // InternalGame.g:243:5: lv_attributename_1_0= RULE_ID
            {
            lv_attributename_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_attributename_1_0, grammarAccess.getAttributeAccess().getAttributenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attributename",
            						lv_attributename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGame.g:259:3: ( (lv_type_2_0= ruleType ) )
            // InternalGame.g:260:4: (lv_type_2_0= ruleType )
            {
            // InternalGame.g:260:4: (lv_type_2_0= ruleType )
            // InternalGame.g:261:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					add(
            						current,
            						"type",
            						lv_type_2_0,
            						"master.mdsd.Game.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEntity"
    // InternalGame.g:282:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalGame.g:282:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalGame.g:283:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalGame.g:289:1: ruleEntity returns [EObject current=null] : (this_DynamicEntity_0= ruleDynamicEntity | this_StaticEntity_1= ruleStaticEntity ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_DynamicEntity_0 = null;

        EObject this_StaticEntity_1 = null;



        	enterRule();

        try {
            // InternalGame.g:295:2: ( (this_DynamicEntity_0= ruleDynamicEntity | this_StaticEntity_1= ruleStaticEntity ) )
            // InternalGame.g:296:2: (this_DynamicEntity_0= ruleDynamicEntity | this_StaticEntity_1= ruleStaticEntity )
            {
            // InternalGame.g:296:2: (this_DynamicEntity_0= ruleDynamicEntity | this_StaticEntity_1= ruleStaticEntity )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=15 && LA3_0<=17)) ) {
                alt3=1;
            }
            else if ( (LA3_0==14||LA3_0==38) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGame.g:297:3: this_DynamicEntity_0= ruleDynamicEntity
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getDynamicEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DynamicEntity_0=ruleDynamicEntity();

                    state._fsp--;


                    			current = this_DynamicEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGame.g:306:3: this_StaticEntity_1= ruleStaticEntity
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getStaticEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StaticEntity_1=ruleStaticEntity();

                    state._fsp--;


                    			current = this_StaticEntity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleDynamicEntity"
    // InternalGame.g:318:1: entryRuleDynamicEntity returns [EObject current=null] : iv_ruleDynamicEntity= ruleDynamicEntity EOF ;
    public final EObject entryRuleDynamicEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicEntity = null;


        try {
            // InternalGame.g:318:54: (iv_ruleDynamicEntity= ruleDynamicEntity EOF )
            // InternalGame.g:319:2: iv_ruleDynamicEntity= ruleDynamicEntity EOF
            {
             newCompositeNode(grammarAccess.getDynamicEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDynamicEntity=ruleDynamicEntity();

            state._fsp--;

             current =iv_ruleDynamicEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDynamicEntity"


    // $ANTLR start "ruleDynamicEntity"
    // InternalGame.g:325:1: ruleDynamicEntity returns [EObject current=null] : ( ( ( (lv_entityid_0_0= 'Character' ) ) ( (lv_character_1_0= ruleCharacter ) ) ) | ( ( (lv_entityid_2_0= 'Object' ) ) ( (lv_object_3_0= ruleObject ) ) ) | ( ( (lv_entityid_4_0= 'Behaviour' ) ) ( (lv_behaviour_5_0= ruleBehaviour ) ) ) ) ;
    public final EObject ruleDynamicEntity() throws RecognitionException {
        EObject current = null;

        Token lv_entityid_0_0=null;
        Token lv_entityid_2_0=null;
        Token lv_entityid_4_0=null;
        EObject lv_character_1_0 = null;

        EObject lv_object_3_0 = null;

        EObject lv_behaviour_5_0 = null;



        	enterRule();

        try {
            // InternalGame.g:331:2: ( ( ( ( (lv_entityid_0_0= 'Character' ) ) ( (lv_character_1_0= ruleCharacter ) ) ) | ( ( (lv_entityid_2_0= 'Object' ) ) ( (lv_object_3_0= ruleObject ) ) ) | ( ( (lv_entityid_4_0= 'Behaviour' ) ) ( (lv_behaviour_5_0= ruleBehaviour ) ) ) ) )
            // InternalGame.g:332:2: ( ( ( (lv_entityid_0_0= 'Character' ) ) ( (lv_character_1_0= ruleCharacter ) ) ) | ( ( (lv_entityid_2_0= 'Object' ) ) ( (lv_object_3_0= ruleObject ) ) ) | ( ( (lv_entityid_4_0= 'Behaviour' ) ) ( (lv_behaviour_5_0= ruleBehaviour ) ) ) )
            {
            // InternalGame.g:332:2: ( ( ( (lv_entityid_0_0= 'Character' ) ) ( (lv_character_1_0= ruleCharacter ) ) ) | ( ( (lv_entityid_2_0= 'Object' ) ) ( (lv_object_3_0= ruleObject ) ) ) | ( ( (lv_entityid_4_0= 'Behaviour' ) ) ( (lv_behaviour_5_0= ruleBehaviour ) ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGame.g:333:3: ( ( (lv_entityid_0_0= 'Character' ) ) ( (lv_character_1_0= ruleCharacter ) ) )
                    {
                    // InternalGame.g:333:3: ( ( (lv_entityid_0_0= 'Character' ) ) ( (lv_character_1_0= ruleCharacter ) ) )
                    // InternalGame.g:334:4: ( (lv_entityid_0_0= 'Character' ) ) ( (lv_character_1_0= ruleCharacter ) )
                    {
                    // InternalGame.g:334:4: ( (lv_entityid_0_0= 'Character' ) )
                    // InternalGame.g:335:5: (lv_entityid_0_0= 'Character' )
                    {
                    // InternalGame.g:335:5: (lv_entityid_0_0= 'Character' )
                    // InternalGame.g:336:6: lv_entityid_0_0= 'Character'
                    {
                    lv_entityid_0_0=(Token)match(input,15,FOLLOW_9); 

                    						newLeafNode(lv_entityid_0_0, grammarAccess.getDynamicEntityAccess().getEntityidCharacterKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDynamicEntityRule());
                    						}
                    						setWithLastConsumed(current, "entityid", lv_entityid_0_0, "Character");
                    					

                    }


                    }

                    // InternalGame.g:348:4: ( (lv_character_1_0= ruleCharacter ) )
                    // InternalGame.g:349:5: (lv_character_1_0= ruleCharacter )
                    {
                    // InternalGame.g:349:5: (lv_character_1_0= ruleCharacter )
                    // InternalGame.g:350:6: lv_character_1_0= ruleCharacter
                    {

                    						newCompositeNode(grammarAccess.getDynamicEntityAccess().getCharacterCharacterParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_character_1_0=ruleCharacter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicEntityRule());
                    						}
                    						add(
                    							current,
                    							"character",
                    							lv_character_1_0,
                    							"master.mdsd.Game.Character");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:369:3: ( ( (lv_entityid_2_0= 'Object' ) ) ( (lv_object_3_0= ruleObject ) ) )
                    {
                    // InternalGame.g:369:3: ( ( (lv_entityid_2_0= 'Object' ) ) ( (lv_object_3_0= ruleObject ) ) )
                    // InternalGame.g:370:4: ( (lv_entityid_2_0= 'Object' ) ) ( (lv_object_3_0= ruleObject ) )
                    {
                    // InternalGame.g:370:4: ( (lv_entityid_2_0= 'Object' ) )
                    // InternalGame.g:371:5: (lv_entityid_2_0= 'Object' )
                    {
                    // InternalGame.g:371:5: (lv_entityid_2_0= 'Object' )
                    // InternalGame.g:372:6: lv_entityid_2_0= 'Object'
                    {
                    lv_entityid_2_0=(Token)match(input,16,FOLLOW_9); 

                    						newLeafNode(lv_entityid_2_0, grammarAccess.getDynamicEntityAccess().getEntityidObjectKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDynamicEntityRule());
                    						}
                    						setWithLastConsumed(current, "entityid", lv_entityid_2_0, "Object");
                    					

                    }


                    }

                    // InternalGame.g:384:4: ( (lv_object_3_0= ruleObject ) )
                    // InternalGame.g:385:5: (lv_object_3_0= ruleObject )
                    {
                    // InternalGame.g:385:5: (lv_object_3_0= ruleObject )
                    // InternalGame.g:386:6: lv_object_3_0= ruleObject
                    {

                    						newCompositeNode(grammarAccess.getDynamicEntityAccess().getObjectObjectParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_object_3_0=ruleObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicEntityRule());
                    						}
                    						add(
                    							current,
                    							"object",
                    							lv_object_3_0,
                    							"master.mdsd.Game.Object");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:405:3: ( ( (lv_entityid_4_0= 'Behaviour' ) ) ( (lv_behaviour_5_0= ruleBehaviour ) ) )
                    {
                    // InternalGame.g:405:3: ( ( (lv_entityid_4_0= 'Behaviour' ) ) ( (lv_behaviour_5_0= ruleBehaviour ) ) )
                    // InternalGame.g:406:4: ( (lv_entityid_4_0= 'Behaviour' ) ) ( (lv_behaviour_5_0= ruleBehaviour ) )
                    {
                    // InternalGame.g:406:4: ( (lv_entityid_4_0= 'Behaviour' ) )
                    // InternalGame.g:407:5: (lv_entityid_4_0= 'Behaviour' )
                    {
                    // InternalGame.g:407:5: (lv_entityid_4_0= 'Behaviour' )
                    // InternalGame.g:408:6: lv_entityid_4_0= 'Behaviour'
                    {
                    lv_entityid_4_0=(Token)match(input,17,FOLLOW_10); 

                    						newLeafNode(lv_entityid_4_0, grammarAccess.getDynamicEntityAccess().getEntityidBehaviourKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDynamicEntityRule());
                    						}
                    						setWithLastConsumed(current, "entityid", lv_entityid_4_0, "Behaviour");
                    					

                    }


                    }

                    // InternalGame.g:420:4: ( (lv_behaviour_5_0= ruleBehaviour ) )
                    // InternalGame.g:421:5: (lv_behaviour_5_0= ruleBehaviour )
                    {
                    // InternalGame.g:421:5: (lv_behaviour_5_0= ruleBehaviour )
                    // InternalGame.g:422:6: lv_behaviour_5_0= ruleBehaviour
                    {

                    						newCompositeNode(grammarAccess.getDynamicEntityAccess().getBehaviourBehaviourParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_behaviour_5_0=ruleBehaviour();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicEntityRule());
                    						}
                    						add(
                    							current,
                    							"behaviour",
                    							lv_behaviour_5_0,
                    							"master.mdsd.Game.Behaviour");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDynamicEntity"


    // $ANTLR start "entryRuleStaticEntity"
    // InternalGame.g:444:1: entryRuleStaticEntity returns [EObject current=null] : iv_ruleStaticEntity= ruleStaticEntity EOF ;
    public final EObject entryRuleStaticEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticEntity = null;


        try {
            // InternalGame.g:444:53: (iv_ruleStaticEntity= ruleStaticEntity EOF )
            // InternalGame.g:445:2: iv_ruleStaticEntity= ruleStaticEntity EOF
            {
             newCompositeNode(grammarAccess.getStaticEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStaticEntity=ruleStaticEntity();

            state._fsp--;

             current =iv_ruleStaticEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticEntity"


    // $ANTLR start "ruleStaticEntity"
    // InternalGame.g:451:1: ruleStaticEntity returns [EObject current=null] : (this_Map_0= ruleMap | this_Initializer_1= ruleInitializer ) ;
    public final EObject ruleStaticEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Map_0 = null;

        EObject this_Initializer_1 = null;



        	enterRule();

        try {
            // InternalGame.g:457:2: ( (this_Map_0= ruleMap | this_Initializer_1= ruleInitializer ) )
            // InternalGame.g:458:2: (this_Map_0= ruleMap | this_Initializer_1= ruleInitializer )
            {
            // InternalGame.g:458:2: (this_Map_0= ruleMap | this_Initializer_1= ruleInitializer )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==38) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGame.g:459:3: this_Map_0= ruleMap
                    {

                    			newCompositeNode(grammarAccess.getStaticEntityAccess().getMapParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Map_0=ruleMap();

                    state._fsp--;


                    			current = this_Map_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGame.g:468:3: this_Initializer_1= ruleInitializer
                    {

                    			newCompositeNode(grammarAccess.getStaticEntityAccess().getInitializerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Initializer_1=ruleInitializer();

                    state._fsp--;


                    			current = this_Initializer_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticEntity"


    // $ANTLR start "entryRuleCharacter"
    // InternalGame.g:480:1: entryRuleCharacter returns [EObject current=null] : iv_ruleCharacter= ruleCharacter EOF ;
    public final EObject entryRuleCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacter = null;


        try {
            // InternalGame.g:480:50: (iv_ruleCharacter= ruleCharacter EOF )
            // InternalGame.g:481:2: iv_ruleCharacter= ruleCharacter EOF
            {
             newCompositeNode(grammarAccess.getCharacterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacter=ruleCharacter();

            state._fsp--;

             current =iv_ruleCharacter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCharacter"


    // $ANTLR start "ruleCharacter"
    // InternalGame.g:487:1: ruleCharacter returns [EObject current=null] : ( ( (lv_char_0_0= ruleCharType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_att_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleCharacter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_char_0_0 = null;

        EObject lv_att_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:493:2: ( ( ( (lv_char_0_0= ruleCharType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_att_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // InternalGame.g:494:2: ( ( (lv_char_0_0= ruleCharType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_att_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // InternalGame.g:494:2: ( ( (lv_char_0_0= ruleCharType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_att_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // InternalGame.g:495:3: ( (lv_char_0_0= ruleCharType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_att_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            // InternalGame.g:495:3: ( (lv_char_0_0= ruleCharType ) )
            // InternalGame.g:496:4: (lv_char_0_0= ruleCharType )
            {
            // InternalGame.g:496:4: (lv_char_0_0= ruleCharType )
            // InternalGame.g:497:5: lv_char_0_0= ruleCharType
            {

            					newCompositeNode(grammarAccess.getCharacterAccess().getCharCharTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_char_0_0=ruleCharType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCharacterRule());
            					}
            					set(
            						current,
            						"char",
            						lv_char_0_0,
            						"master.mdsd.Game.CharType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:514:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:515:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:515:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:516:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCharacterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:536:3: ( (lv_att_3_0= ruleAttribute ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGame.g:537:4: (lv_att_3_0= ruleAttribute )
            	    {
            	    // InternalGame.g:537:4: (lv_att_3_0= ruleAttribute )
            	    // InternalGame.g:538:5: lv_att_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getCharacterAccess().getAttAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_att_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCharacterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"att",
            	    						lv_att_3_0,
            	    						"master.mdsd.Game.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCharacterAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharacter"


    // $ANTLR start "entryRuleType"
    // InternalGame.g:563:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalGame.g:563:45: (iv_ruleType= ruleType EOF )
            // InternalGame.g:564:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalGame.g:570:1: ruleType returns [EObject current=null] : ( ( (lv_valueId_0_0= ruleINTORDEC ) ) | ( (lv_valueId_1_0= RULE_ID ) ) | ( (lv_valueId_2_0= ruleVECTOR ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_valueId_1_0=null;
        AntlrDatatypeRuleToken lv_valueId_0_0 = null;

        AntlrDatatypeRuleToken lv_valueId_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:576:2: ( ( ( (lv_valueId_0_0= ruleINTORDEC ) ) | ( (lv_valueId_1_0= RULE_ID ) ) | ( (lv_valueId_2_0= ruleVECTOR ) ) ) )
            // InternalGame.g:577:2: ( ( (lv_valueId_0_0= ruleINTORDEC ) ) | ( (lv_valueId_1_0= RULE_ID ) ) | ( (lv_valueId_2_0= ruleVECTOR ) ) )
            {
            // InternalGame.g:577:2: ( ( (lv_valueId_0_0= ruleINTORDEC ) ) | ( (lv_valueId_1_0= RULE_ID ) ) | ( (lv_valueId_2_0= ruleVECTOR ) ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case 13:
                case 20:
                case 21:
                case 24:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 39:
                    {
                    alt7=1;
                    }
                    break;
                case 26:
                    {
                    int LA7_4 = input.LA(3);

                    if ( (LA7_4==RULE_INT) ) {
                        int LA7_6 = input.LA(4);

                        if ( (LA7_6==EOF||LA7_6==RULE_ID||LA7_6==13||(LA7_6>=20 && LA7_6<=21)||LA7_6==24||(LA7_6>=32 && LA7_6<=37)||LA7_6==39) ) {
                            alt7=1;
                        }
                        else if ( (LA7_6==RULE_INT) ) {
                            alt7=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    alt7=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGame.g:578:3: ( (lv_valueId_0_0= ruleINTORDEC ) )
                    {
                    // InternalGame.g:578:3: ( (lv_valueId_0_0= ruleINTORDEC ) )
                    // InternalGame.g:579:4: (lv_valueId_0_0= ruleINTORDEC )
                    {
                    // InternalGame.g:579:4: (lv_valueId_0_0= ruleINTORDEC )
                    // InternalGame.g:580:5: lv_valueId_0_0= ruleINTORDEC
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getValueIdINTORDECParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_valueId_0_0=ruleINTORDEC();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"valueId",
                    						lv_valueId_0_0,
                    						"master.mdsd.Game.INTORDEC");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:598:3: ( (lv_valueId_1_0= RULE_ID ) )
                    {
                    // InternalGame.g:598:3: ( (lv_valueId_1_0= RULE_ID ) )
                    // InternalGame.g:599:4: (lv_valueId_1_0= RULE_ID )
                    {
                    // InternalGame.g:599:4: (lv_valueId_1_0= RULE_ID )
                    // InternalGame.g:600:5: lv_valueId_1_0= RULE_ID
                    {
                    lv_valueId_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_valueId_1_0, grammarAccess.getTypeAccess().getValueIdIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"valueId",
                    						lv_valueId_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:617:3: ( (lv_valueId_2_0= ruleVECTOR ) )
                    {
                    // InternalGame.g:617:3: ( (lv_valueId_2_0= ruleVECTOR ) )
                    // InternalGame.g:618:4: (lv_valueId_2_0= ruleVECTOR )
                    {
                    // InternalGame.g:618:4: (lv_valueId_2_0= ruleVECTOR )
                    // InternalGame.g:619:5: lv_valueId_2_0= ruleVECTOR
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getValueIdVECTORParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_valueId_2_0=ruleVECTOR();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"valueId",
                    						lv_valueId_2_0,
                    						"master.mdsd.Game.VECTOR");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleVECTOR"
    // InternalGame.g:640:1: entryRuleVECTOR returns [String current=null] : iv_ruleVECTOR= ruleVECTOR EOF ;
    public final String entryRuleVECTOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVECTOR = null;


        try {
            // InternalGame.g:640:46: (iv_ruleVECTOR= ruleVECTOR EOF )
            // InternalGame.g:641:2: iv_ruleVECTOR= ruleVECTOR EOF
            {
             newCompositeNode(grammarAccess.getVECTORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVECTOR=ruleVECTOR();

            state._fsp--;

             current =iv_ruleVECTOR.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVECTOR"


    // $ANTLR start "ruleVECTOR"
    // InternalGame.g:647:1: ruleVECTOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTORDEC_0= ruleINTORDEC this_INTORDEC_1= ruleINTORDEC ) ;
    public final AntlrDatatypeRuleToken ruleVECTOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_INTORDEC_0 = null;

        AntlrDatatypeRuleToken this_INTORDEC_1 = null;



        	enterRule();

        try {
            // InternalGame.g:653:2: ( (this_INTORDEC_0= ruleINTORDEC this_INTORDEC_1= ruleINTORDEC ) )
            // InternalGame.g:654:2: (this_INTORDEC_0= ruleINTORDEC this_INTORDEC_1= ruleINTORDEC )
            {
            // InternalGame.g:654:2: (this_INTORDEC_0= ruleINTORDEC this_INTORDEC_1= ruleINTORDEC )
            // InternalGame.g:655:3: this_INTORDEC_0= ruleINTORDEC this_INTORDEC_1= ruleINTORDEC
            {

            			newCompositeNode(grammarAccess.getVECTORAccess().getINTORDECParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_INTORDEC_0=ruleINTORDEC();

            state._fsp--;


            			current.merge(this_INTORDEC_0);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getVECTORAccess().getINTORDECParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_INTORDEC_1=ruleINTORDEC();

            state._fsp--;


            			current.merge(this_INTORDEC_1);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVECTOR"


    // $ANTLR start "entryRuleINTORDEC"
    // InternalGame.g:679:1: entryRuleINTORDEC returns [String current=null] : iv_ruleINTORDEC= ruleINTORDEC EOF ;
    public final String entryRuleINTORDEC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTORDEC = null;


        try {
            // InternalGame.g:679:48: (iv_ruleINTORDEC= ruleINTORDEC EOF )
            // InternalGame.g:680:2: iv_ruleINTORDEC= ruleINTORDEC EOF
            {
             newCompositeNode(grammarAccess.getINTORDECRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINTORDEC=ruleINTORDEC();

            state._fsp--;

             current =iv_ruleINTORDEC.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINTORDEC"


    // $ANTLR start "ruleINTORDEC"
    // InternalGame.g:686:1: ruleINTORDEC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DECIMAL_1= ruleDECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTORDEC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        AntlrDatatypeRuleToken this_DECIMAL_1 = null;



        	enterRule();

        try {
            // InternalGame.g:692:2: ( (this_INT_0= RULE_INT | this_DECIMAL_1= ruleDECIMAL ) )
            // InternalGame.g:693:2: (this_INT_0= RULE_INT | this_DECIMAL_1= ruleDECIMAL )
            {
            // InternalGame.g:693:2: (this_INT_0= RULE_INT | this_DECIMAL_1= ruleDECIMAL )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||(LA8_1>=RULE_ID && LA8_1<=RULE_INT)||LA8_1==13||(LA8_1>=20 && LA8_1<=21)||LA8_1==24||(LA8_1>=32 && LA8_1<=37)||LA8_1==39) ) {
                    alt8=1;
                }
                else if ( (LA8_1==26) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGame.g:694:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getINTORDECAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGame.g:702:3: this_DECIMAL_1= ruleDECIMAL
                    {

                    			newCompositeNode(grammarAccess.getINTORDECAccess().getDECIMALParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DECIMAL_1=ruleDECIMAL();

                    state._fsp--;


                    			current.merge(this_DECIMAL_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINTORDEC"


    // $ANTLR start "entryRuleCharType"
    // InternalGame.g:716:1: entryRuleCharType returns [EObject current=null] : iv_ruleCharType= ruleCharType EOF ;
    public final EObject entryRuleCharType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharType = null;


        try {
            // InternalGame.g:716:49: (iv_ruleCharType= ruleCharType EOF )
            // InternalGame.g:717:2: iv_ruleCharType= ruleCharType EOF
            {
             newCompositeNode(grammarAccess.getCharTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharType=ruleCharType();

            state._fsp--;

             current =iv_ruleCharType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCharType"


    // $ANTLR start "ruleCharType"
    // InternalGame.g:723:1: ruleCharType returns [EObject current=null] : ( (lv_charTypeid_0_0= RULE_ID ) ) ;
    public final EObject ruleCharType() throws RecognitionException {
        EObject current = null;

        Token lv_charTypeid_0_0=null;


        	enterRule();

        try {
            // InternalGame.g:729:2: ( ( (lv_charTypeid_0_0= RULE_ID ) ) )
            // InternalGame.g:730:2: ( (lv_charTypeid_0_0= RULE_ID ) )
            {
            // InternalGame.g:730:2: ( (lv_charTypeid_0_0= RULE_ID ) )
            // InternalGame.g:731:3: (lv_charTypeid_0_0= RULE_ID )
            {
            // InternalGame.g:731:3: (lv_charTypeid_0_0= RULE_ID )
            // InternalGame.g:732:4: lv_charTypeid_0_0= RULE_ID
            {
            lv_charTypeid_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_charTypeid_0_0, grammarAccess.getCharTypeAccess().getCharTypeidIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCharTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"charTypeid",
            					lv_charTypeid_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharType"


    // $ANTLR start "entryRuleObject"
    // InternalGame.g:751:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalGame.g:751:47: (iv_ruleObject= ruleObject EOF )
            // InternalGame.g:752:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalGame.g:758:1: ruleObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_att_2_0= ruleAttribute ) )* otherlv_3= '}' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_att_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:764:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_att_2_0= ruleAttribute ) )* otherlv_3= '}' ) )
            // InternalGame.g:765:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_att_2_0= ruleAttribute ) )* otherlv_3= '}' )
            {
            // InternalGame.g:765:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_att_2_0= ruleAttribute ) )* otherlv_3= '}' )
            // InternalGame.g:766:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_att_2_0= ruleAttribute ) )* otherlv_3= '}'
            {
            // InternalGame.g:766:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:767:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:767:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:768:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:788:3: ( (lv_att_2_0= ruleAttribute ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGame.g:789:4: (lv_att_2_0= ruleAttribute )
            	    {
            	    // InternalGame.g:789:4: (lv_att_2_0= ruleAttribute )
            	    // InternalGame.g:790:5: lv_att_2_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getObjectAccess().getAttAttributeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_att_2_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"att",
            	    						lv_att_2_0,
            	    						"master.mdsd.Game.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleBehaviour"
    // InternalGame.g:815:1: entryRuleBehaviour returns [EObject current=null] : iv_ruleBehaviour= ruleBehaviour EOF ;
    public final EObject entryRuleBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviour = null;


        try {
            // InternalGame.g:815:50: (iv_ruleBehaviour= ruleBehaviour EOF )
            // InternalGame.g:816:2: iv_ruleBehaviour= ruleBehaviour EOF
            {
             newCompositeNode(grammarAccess.getBehaviourRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviour=ruleBehaviour();

            state._fsp--;

             current =iv_ruleBehaviour; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehaviour"


    // $ANTLR start "ruleBehaviour"
    // InternalGame.g:822:1: ruleBehaviour returns [EObject current=null] : ( ( ( (lv_behaviourTypeId_0_0= 'Pathfinding' ) ) ( (lv_pathfinding_1_0= rulePathfinding ) ) ) | ( ( (lv_behaviourTypeId_2_0= 'Attack' ) ) ( (lv_attack_3_0= ruleAttack ) ) ) | ( ( (lv_behaviourTypeId_4_0= 'Bullet' ) ) ( (lv_bullet_5_0= ruleBullet ) ) ) ) ;
    public final EObject ruleBehaviour() throws RecognitionException {
        EObject current = null;

        Token lv_behaviourTypeId_0_0=null;
        Token lv_behaviourTypeId_2_0=null;
        Token lv_behaviourTypeId_4_0=null;
        EObject lv_pathfinding_1_0 = null;

        EObject lv_attack_3_0 = null;

        EObject lv_bullet_5_0 = null;



        	enterRule();

        try {
            // InternalGame.g:828:2: ( ( ( ( (lv_behaviourTypeId_0_0= 'Pathfinding' ) ) ( (lv_pathfinding_1_0= rulePathfinding ) ) ) | ( ( (lv_behaviourTypeId_2_0= 'Attack' ) ) ( (lv_attack_3_0= ruleAttack ) ) ) | ( ( (lv_behaviourTypeId_4_0= 'Bullet' ) ) ( (lv_bullet_5_0= ruleBullet ) ) ) ) )
            // InternalGame.g:829:2: ( ( ( (lv_behaviourTypeId_0_0= 'Pathfinding' ) ) ( (lv_pathfinding_1_0= rulePathfinding ) ) ) | ( ( (lv_behaviourTypeId_2_0= 'Attack' ) ) ( (lv_attack_3_0= ruleAttack ) ) ) | ( ( (lv_behaviourTypeId_4_0= 'Bullet' ) ) ( (lv_bullet_5_0= ruleBullet ) ) ) )
            {
            // InternalGame.g:829:2: ( ( ( (lv_behaviourTypeId_0_0= 'Pathfinding' ) ) ( (lv_pathfinding_1_0= rulePathfinding ) ) ) | ( ( (lv_behaviourTypeId_2_0= 'Attack' ) ) ( (lv_attack_3_0= ruleAttack ) ) ) | ( ( (lv_behaviourTypeId_4_0= 'Bullet' ) ) ( (lv_bullet_5_0= ruleBullet ) ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt10=1;
                }
                break;
            case 19:
                {
                alt10=2;
                }
                break;
            case 20:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalGame.g:830:3: ( ( (lv_behaviourTypeId_0_0= 'Pathfinding' ) ) ( (lv_pathfinding_1_0= rulePathfinding ) ) )
                    {
                    // InternalGame.g:830:3: ( ( (lv_behaviourTypeId_0_0= 'Pathfinding' ) ) ( (lv_pathfinding_1_0= rulePathfinding ) ) )
                    // InternalGame.g:831:4: ( (lv_behaviourTypeId_0_0= 'Pathfinding' ) ) ( (lv_pathfinding_1_0= rulePathfinding ) )
                    {
                    // InternalGame.g:831:4: ( (lv_behaviourTypeId_0_0= 'Pathfinding' ) )
                    // InternalGame.g:832:5: (lv_behaviourTypeId_0_0= 'Pathfinding' )
                    {
                    // InternalGame.g:832:5: (lv_behaviourTypeId_0_0= 'Pathfinding' )
                    // InternalGame.g:833:6: lv_behaviourTypeId_0_0= 'Pathfinding'
                    {
                    lv_behaviourTypeId_0_0=(Token)match(input,18,FOLLOW_9); 

                    						newLeafNode(lv_behaviourTypeId_0_0, grammarAccess.getBehaviourAccess().getBehaviourTypeIdPathfindingKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBehaviourRule());
                    						}
                    						setWithLastConsumed(current, "behaviourTypeId", lv_behaviourTypeId_0_0, "Pathfinding");
                    					

                    }


                    }

                    // InternalGame.g:845:4: ( (lv_pathfinding_1_0= rulePathfinding ) )
                    // InternalGame.g:846:5: (lv_pathfinding_1_0= rulePathfinding )
                    {
                    // InternalGame.g:846:5: (lv_pathfinding_1_0= rulePathfinding )
                    // InternalGame.g:847:6: lv_pathfinding_1_0= rulePathfinding
                    {

                    						newCompositeNode(grammarAccess.getBehaviourAccess().getPathfindingPathfindingParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_pathfinding_1_0=rulePathfinding();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviourRule());
                    						}
                    						set(
                    							current,
                    							"pathfinding",
                    							lv_pathfinding_1_0,
                    							"master.mdsd.Game.Pathfinding");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:866:3: ( ( (lv_behaviourTypeId_2_0= 'Attack' ) ) ( (lv_attack_3_0= ruleAttack ) ) )
                    {
                    // InternalGame.g:866:3: ( ( (lv_behaviourTypeId_2_0= 'Attack' ) ) ( (lv_attack_3_0= ruleAttack ) ) )
                    // InternalGame.g:867:4: ( (lv_behaviourTypeId_2_0= 'Attack' ) ) ( (lv_attack_3_0= ruleAttack ) )
                    {
                    // InternalGame.g:867:4: ( (lv_behaviourTypeId_2_0= 'Attack' ) )
                    // InternalGame.g:868:5: (lv_behaviourTypeId_2_0= 'Attack' )
                    {
                    // InternalGame.g:868:5: (lv_behaviourTypeId_2_0= 'Attack' )
                    // InternalGame.g:869:6: lv_behaviourTypeId_2_0= 'Attack'
                    {
                    lv_behaviourTypeId_2_0=(Token)match(input,19,FOLLOW_9); 

                    						newLeafNode(lv_behaviourTypeId_2_0, grammarAccess.getBehaviourAccess().getBehaviourTypeIdAttackKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBehaviourRule());
                    						}
                    						setWithLastConsumed(current, "behaviourTypeId", lv_behaviourTypeId_2_0, "Attack");
                    					

                    }


                    }

                    // InternalGame.g:881:4: ( (lv_attack_3_0= ruleAttack ) )
                    // InternalGame.g:882:5: (lv_attack_3_0= ruleAttack )
                    {
                    // InternalGame.g:882:5: (lv_attack_3_0= ruleAttack )
                    // InternalGame.g:883:6: lv_attack_3_0= ruleAttack
                    {

                    						newCompositeNode(grammarAccess.getBehaviourAccess().getAttackAttackParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_attack_3_0=ruleAttack();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviourRule());
                    						}
                    						set(
                    							current,
                    							"attack",
                    							lv_attack_3_0,
                    							"master.mdsd.Game.Attack");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:902:3: ( ( (lv_behaviourTypeId_4_0= 'Bullet' ) ) ( (lv_bullet_5_0= ruleBullet ) ) )
                    {
                    // InternalGame.g:902:3: ( ( (lv_behaviourTypeId_4_0= 'Bullet' ) ) ( (lv_bullet_5_0= ruleBullet ) ) )
                    // InternalGame.g:903:4: ( (lv_behaviourTypeId_4_0= 'Bullet' ) ) ( (lv_bullet_5_0= ruleBullet ) )
                    {
                    // InternalGame.g:903:4: ( (lv_behaviourTypeId_4_0= 'Bullet' ) )
                    // InternalGame.g:904:5: (lv_behaviourTypeId_4_0= 'Bullet' )
                    {
                    // InternalGame.g:904:5: (lv_behaviourTypeId_4_0= 'Bullet' )
                    // InternalGame.g:905:6: lv_behaviourTypeId_4_0= 'Bullet'
                    {
                    lv_behaviourTypeId_4_0=(Token)match(input,20,FOLLOW_9); 

                    						newLeafNode(lv_behaviourTypeId_4_0, grammarAccess.getBehaviourAccess().getBehaviourTypeIdBulletKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBehaviourRule());
                    						}
                    						setWithLastConsumed(current, "behaviourTypeId", lv_behaviourTypeId_4_0, "Bullet");
                    					

                    }


                    }

                    // InternalGame.g:917:4: ( (lv_bullet_5_0= ruleBullet ) )
                    // InternalGame.g:918:5: (lv_bullet_5_0= ruleBullet )
                    {
                    // InternalGame.g:918:5: (lv_bullet_5_0= ruleBullet )
                    // InternalGame.g:919:6: lv_bullet_5_0= ruleBullet
                    {

                    						newCompositeNode(grammarAccess.getBehaviourAccess().getBulletBulletParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_bullet_5_0=ruleBullet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviourRule());
                    						}
                    						set(
                    							current,
                    							"bullet",
                    							lv_bullet_5_0,
                    							"master.mdsd.Game.Bullet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehaviour"


    // $ANTLR start "entryRulePathfinding"
    // InternalGame.g:941:1: entryRulePathfinding returns [EObject current=null] : iv_rulePathfinding= rulePathfinding EOF ;
    public final EObject entryRulePathfinding() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathfinding = null;


        try {
            // InternalGame.g:941:52: (iv_rulePathfinding= rulePathfinding EOF )
            // InternalGame.g:942:2: iv_rulePathfinding= rulePathfinding EOF
            {
             newCompositeNode(grammarAccess.getPathfindingRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathfinding=rulePathfinding();

            state._fsp--;

             current =iv_rulePathfinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathfinding"


    // $ANTLR start "rulePathfinding"
    // InternalGame.g:948:1: rulePathfinding returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attPathfinding_2_0= ruleAttribute ) )* ( (lv_ruleSets_3_0= ruleRuleSet ) )* otherlv_4= '}' ) ;
    public final EObject rulePathfinding() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_attPathfinding_2_0 = null;

        EObject lv_ruleSets_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:954:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attPathfinding_2_0= ruleAttribute ) )* ( (lv_ruleSets_3_0= ruleRuleSet ) )* otherlv_4= '}' ) )
            // InternalGame.g:955:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attPathfinding_2_0= ruleAttribute ) )* ( (lv_ruleSets_3_0= ruleRuleSet ) )* otherlv_4= '}' )
            {
            // InternalGame.g:955:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attPathfinding_2_0= ruleAttribute ) )* ( (lv_ruleSets_3_0= ruleRuleSet ) )* otherlv_4= '}' )
            // InternalGame.g:956:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attPathfinding_2_0= ruleAttribute ) )* ( (lv_ruleSets_3_0= ruleRuleSet ) )* otherlv_4= '}'
            {
            // InternalGame.g:956:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:957:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:957:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:958:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPathfindingAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPathfindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getPathfindingAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:978:3: ( (lv_attPathfinding_2_0= ruleAttribute ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGame.g:979:4: (lv_attPathfinding_2_0= ruleAttribute )
            	    {
            	    // InternalGame.g:979:4: (lv_attPathfinding_2_0= ruleAttribute )
            	    // InternalGame.g:980:5: lv_attPathfinding_2_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getPathfindingAccess().getAttPathfindingAttributeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_attPathfinding_2_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPathfindingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attPathfinding",
            	    						lv_attPathfinding_2_0,
            	    						"master.mdsd.Game.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalGame.g:997:3: ( (lv_ruleSets_3_0= ruleRuleSet ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGame.g:998:4: (lv_ruleSets_3_0= ruleRuleSet )
            	    {
            	    // InternalGame.g:998:4: (lv_ruleSets_3_0= ruleRuleSet )
            	    // InternalGame.g:999:5: lv_ruleSets_3_0= ruleRuleSet
            	    {

            	    					newCompositeNode(grammarAccess.getPathfindingAccess().getRuleSetsRuleSetParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_ruleSets_3_0=ruleRuleSet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPathfindingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ruleSets",
            	    						lv_ruleSets_3_0,
            	    						"master.mdsd.Game.RuleSet");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPathfindingAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathfinding"


    // $ANTLR start "entryRuleRuleSet"
    // InternalGame.g:1024:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // InternalGame.g:1024:48: (iv_ruleRuleSet= ruleRuleSet EOF )
            // InternalGame.g:1025:2: iv_ruleRuleSet= ruleRuleSet EOF
            {
             newCompositeNode(grammarAccess.getRuleSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleSet=ruleRuleSet();

            state._fsp--;

             current =iv_ruleRuleSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleSet"


    // $ANTLR start "ruleRuleSet"
    // InternalGame.g:1031:1: ruleRuleSet returns [EObject current=null] : ( ( (lv_ifId_0_0= 'if' ) ) ( (lv_rule_1_0= ruleRule ) ) ( ( (lv_elseIfId_2_0= 'elseif' ) ) ( (lv_elseRules_3_0= ruleRule ) ) )* ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        Token lv_ifId_0_0=null;
        Token lv_elseIfId_2_0=null;
        EObject lv_rule_1_0 = null;

        EObject lv_elseRules_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1037:2: ( ( ( (lv_ifId_0_0= 'if' ) ) ( (lv_rule_1_0= ruleRule ) ) ( ( (lv_elseIfId_2_0= 'elseif' ) ) ( (lv_elseRules_3_0= ruleRule ) ) )* ) )
            // InternalGame.g:1038:2: ( ( (lv_ifId_0_0= 'if' ) ) ( (lv_rule_1_0= ruleRule ) ) ( ( (lv_elseIfId_2_0= 'elseif' ) ) ( (lv_elseRules_3_0= ruleRule ) ) )* )
            {
            // InternalGame.g:1038:2: ( ( (lv_ifId_0_0= 'if' ) ) ( (lv_rule_1_0= ruleRule ) ) ( ( (lv_elseIfId_2_0= 'elseif' ) ) ( (lv_elseRules_3_0= ruleRule ) ) )* )
            // InternalGame.g:1039:3: ( (lv_ifId_0_0= 'if' ) ) ( (lv_rule_1_0= ruleRule ) ) ( ( (lv_elseIfId_2_0= 'elseif' ) ) ( (lv_elseRules_3_0= ruleRule ) ) )*
            {
            // InternalGame.g:1039:3: ( (lv_ifId_0_0= 'if' ) )
            // InternalGame.g:1040:4: (lv_ifId_0_0= 'if' )
            {
            // InternalGame.g:1040:4: (lv_ifId_0_0= 'if' )
            // InternalGame.g:1041:5: lv_ifId_0_0= 'if'
            {
            lv_ifId_0_0=(Token)match(input,21,FOLLOW_14); 

            					newLeafNode(lv_ifId_0_0, grammarAccess.getRuleSetAccess().getIfIdIfKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleSetRule());
            					}
            					addWithLastConsumed(current, "ifId", lv_ifId_0_0, "if");
            				

            }


            }

            // InternalGame.g:1053:3: ( (lv_rule_1_0= ruleRule ) )
            // InternalGame.g:1054:4: (lv_rule_1_0= ruleRule )
            {
            // InternalGame.g:1054:4: (lv_rule_1_0= ruleRule )
            // InternalGame.g:1055:5: lv_rule_1_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getRuleSetAccess().getRuleRuleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_rule_1_0=ruleRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleSetRule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_1_0,
            						"master.mdsd.Game.Rule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:1072:3: ( ( (lv_elseIfId_2_0= 'elseif' ) ) ( (lv_elseRules_3_0= ruleRule ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGame.g:1073:4: ( (lv_elseIfId_2_0= 'elseif' ) ) ( (lv_elseRules_3_0= ruleRule ) )
            	    {
            	    // InternalGame.g:1073:4: ( (lv_elseIfId_2_0= 'elseif' ) )
            	    // InternalGame.g:1074:5: (lv_elseIfId_2_0= 'elseif' )
            	    {
            	    // InternalGame.g:1074:5: (lv_elseIfId_2_0= 'elseif' )
            	    // InternalGame.g:1075:6: lv_elseIfId_2_0= 'elseif'
            	    {
            	    lv_elseIfId_2_0=(Token)match(input,22,FOLLOW_14); 

            	    						newLeafNode(lv_elseIfId_2_0, grammarAccess.getRuleSetAccess().getElseIfIdElseifKeyword_2_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRuleSetRule());
            	    						}
            	    						addWithLastConsumed(current, "elseIfId", lv_elseIfId_2_0, "elseif");
            	    					

            	    }


            	    }

            	    // InternalGame.g:1087:4: ( (lv_elseRules_3_0= ruleRule ) )
            	    // InternalGame.g:1088:5: (lv_elseRules_3_0= ruleRule )
            	    {
            	    // InternalGame.g:1088:5: (lv_elseRules_3_0= ruleRule )
            	    // InternalGame.g:1089:6: lv_elseRules_3_0= ruleRule
            	    {

            	    						newCompositeNode(grammarAccess.getRuleSetAccess().getElseRulesRuleParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_elseRules_3_0=ruleRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleSetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elseRules",
            	    							lv_elseRules_3_0,
            	    							"master.mdsd.Game.Rule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleSet"


    // $ANTLR start "entryRuleRule"
    // InternalGame.g:1111:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalGame.g:1111:45: (iv_ruleRule= ruleRule EOF )
            // InternalGame.g:1112:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalGame.g:1118:1: ruleRule returns [EObject current=null] : (otherlv_0= '(' ( (lv_ruleSetup_1_0= ruleRuleSetup ) ) otherlv_2= ')' ( (lv_toDoAction_3_0= ruleAction ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ruleSetup_1_0 = null;

        EObject lv_toDoAction_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1124:2: ( (otherlv_0= '(' ( (lv_ruleSetup_1_0= ruleRuleSetup ) ) otherlv_2= ')' ( (lv_toDoAction_3_0= ruleAction ) ) ) )
            // InternalGame.g:1125:2: (otherlv_0= '(' ( (lv_ruleSetup_1_0= ruleRuleSetup ) ) otherlv_2= ')' ( (lv_toDoAction_3_0= ruleAction ) ) )
            {
            // InternalGame.g:1125:2: (otherlv_0= '(' ( (lv_ruleSetup_1_0= ruleRuleSetup ) ) otherlv_2= ')' ( (lv_toDoAction_3_0= ruleAction ) ) )
            // InternalGame.g:1126:3: otherlv_0= '(' ( (lv_ruleSetup_1_0= ruleRuleSetup ) ) otherlv_2= ')' ( (lv_toDoAction_3_0= ruleAction ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_0());
            		
            // InternalGame.g:1130:3: ( (lv_ruleSetup_1_0= ruleRuleSetup ) )
            // InternalGame.g:1131:4: (lv_ruleSetup_1_0= ruleRuleSetup )
            {
            // InternalGame.g:1131:4: (lv_ruleSetup_1_0= ruleRuleSetup )
            // InternalGame.g:1132:5: lv_ruleSetup_1_0= ruleRuleSetup
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getRuleSetupRuleSetupParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_ruleSetup_1_0=ruleRuleSetup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"ruleSetup",
            						lv_ruleSetup_1_0,
            						"master.mdsd.Game.RuleSetup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getRightParenthesisKeyword_2());
            		
            // InternalGame.g:1153:3: ( (lv_toDoAction_3_0= ruleAction ) )
            // InternalGame.g:1154:4: (lv_toDoAction_3_0= ruleAction )
            {
            // InternalGame.g:1154:4: (lv_toDoAction_3_0= ruleAction )
            // InternalGame.g:1155:5: lv_toDoAction_3_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getToDoActionActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_toDoAction_3_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"toDoAction",
            						lv_toDoAction_3_0,
            						"master.mdsd.Game.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRuleSetup"
    // InternalGame.g:1176:1: entryRuleRuleSetup returns [EObject current=null] : iv_ruleRuleSetup= ruleRuleSetup EOF ;
    public final EObject entryRuleRuleSetup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSetup = null;


        try {
            // InternalGame.g:1176:50: (iv_ruleRuleSetup= ruleRuleSetup EOF )
            // InternalGame.g:1177:2: iv_ruleRuleSetup= ruleRuleSetup EOF
            {
             newCompositeNode(grammarAccess.getRuleSetupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleSetup=ruleRuleSetup();

            state._fsp--;

             current =iv_ruleRuleSetup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleSetup"


    // $ANTLR start "ruleRuleSetup"
    // InternalGame.g:1183:1: ruleRuleSetup returns [EObject current=null] : ( ( (lv_attributeRefLeft_0_0= ruleReferenceCharacter ) )? ( (lv_ruleType_1_0= ruleRuleType ) ) ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_intAttleft_3_0= ruleIntAtt ) ) ( (lv_lo_4_0= ruleLogicOperatorLoop ) )? ) ;
    public final EObject ruleRuleSetup() throws RecognitionException {
        EObject current = null;

        EObject lv_attributeRefLeft_0_0 = null;

        EObject lv_ruleType_1_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_intAttleft_3_0 = null;

        EObject lv_lo_4_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1189:2: ( ( ( (lv_attributeRefLeft_0_0= ruleReferenceCharacter ) )? ( (lv_ruleType_1_0= ruleRuleType ) ) ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_intAttleft_3_0= ruleIntAtt ) ) ( (lv_lo_4_0= ruleLogicOperatorLoop ) )? ) )
            // InternalGame.g:1190:2: ( ( (lv_attributeRefLeft_0_0= ruleReferenceCharacter ) )? ( (lv_ruleType_1_0= ruleRuleType ) ) ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_intAttleft_3_0= ruleIntAtt ) ) ( (lv_lo_4_0= ruleLogicOperatorLoop ) )? )
            {
            // InternalGame.g:1190:2: ( ( (lv_attributeRefLeft_0_0= ruleReferenceCharacter ) )? ( (lv_ruleType_1_0= ruleRuleType ) ) ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_intAttleft_3_0= ruleIntAtt ) ) ( (lv_lo_4_0= ruleLogicOperatorLoop ) )? )
            // InternalGame.g:1191:3: ( (lv_attributeRefLeft_0_0= ruleReferenceCharacter ) )? ( (lv_ruleType_1_0= ruleRuleType ) ) ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_intAttleft_3_0= ruleIntAtt ) ) ( (lv_lo_4_0= ruleLogicOperatorLoop ) )?
            {
            // InternalGame.g:1191:3: ( (lv_attributeRefLeft_0_0= ruleReferenceCharacter ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_ID) ) {
                    alt14=1;
                }
            }
            else if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGame.g:1192:4: (lv_attributeRefLeft_0_0= ruleReferenceCharacter )
                    {
                    // InternalGame.g:1192:4: (lv_attributeRefLeft_0_0= ruleReferenceCharacter )
                    // InternalGame.g:1193:5: lv_attributeRefLeft_0_0= ruleReferenceCharacter
                    {

                    					newCompositeNode(grammarAccess.getRuleSetupAccess().getAttributeRefLeftReferenceCharacterParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_attributeRefLeft_0_0=ruleReferenceCharacter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRuleSetupRule());
                    					}
                    					set(
                    						current,
                    						"attributeRefLeft",
                    						lv_attributeRefLeft_0_0,
                    						"master.mdsd.Game.ReferenceCharacter");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalGame.g:1210:3: ( (lv_ruleType_1_0= ruleRuleType ) )
            // InternalGame.g:1211:4: (lv_ruleType_1_0= ruleRuleType )
            {
            // InternalGame.g:1211:4: (lv_ruleType_1_0= ruleRuleType )
            // InternalGame.g:1212:5: lv_ruleType_1_0= ruleRuleType
            {

            					newCompositeNode(grammarAccess.getRuleSetupAccess().getRuleTypeRuleTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_ruleType_1_0=ruleRuleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleSetupRule());
            					}
            					set(
            						current,
            						"ruleType",
            						lv_ruleType_1_0,
            						"master.mdsd.Game.RuleType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:1229:3: ( (lv_operator_2_0= ruleCompOperator ) )
            // InternalGame.g:1230:4: (lv_operator_2_0= ruleCompOperator )
            {
            // InternalGame.g:1230:4: (lv_operator_2_0= ruleCompOperator )
            // InternalGame.g:1231:5: lv_operator_2_0= ruleCompOperator
            {

            					newCompositeNode(grammarAccess.getRuleSetupAccess().getOperatorCompOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_operator_2_0=ruleCompOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleSetupRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"master.mdsd.Game.CompOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:1248:3: ( (lv_intAttleft_3_0= ruleIntAtt ) )
            // InternalGame.g:1249:4: (lv_intAttleft_3_0= ruleIntAtt )
            {
            // InternalGame.g:1249:4: (lv_intAttleft_3_0= ruleIntAtt )
            // InternalGame.g:1250:5: lv_intAttleft_3_0= ruleIntAtt
            {

            					newCompositeNode(grammarAccess.getRuleSetupAccess().getIntAttleftIntAttParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_intAttleft_3_0=ruleIntAtt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleSetupRule());
            					}
            					set(
            						current,
            						"intAttleft",
            						lv_intAttleft_3_0,
            						"master.mdsd.Game.IntAtt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:1267:3: ( (lv_lo_4_0= ruleLogicOperatorLoop ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=32 && LA15_0<=35)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGame.g:1268:4: (lv_lo_4_0= ruleLogicOperatorLoop )
                    {
                    // InternalGame.g:1268:4: (lv_lo_4_0= ruleLogicOperatorLoop )
                    // InternalGame.g:1269:5: lv_lo_4_0= ruleLogicOperatorLoop
                    {

                    					newCompositeNode(grammarAccess.getRuleSetupAccess().getLoLogicOperatorLoopParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_lo_4_0=ruleLogicOperatorLoop();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRuleSetupRule());
                    					}
                    					set(
                    						current,
                    						"lo",
                    						lv_lo_4_0,
                    						"master.mdsd.Game.LogicOperatorLoop");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleSetup"


    // $ANTLR start "entryRuleIntAtt"
    // InternalGame.g:1290:1: entryRuleIntAtt returns [EObject current=null] : iv_ruleIntAtt= ruleIntAtt EOF ;
    public final EObject entryRuleIntAtt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntAtt = null;


        try {
            // InternalGame.g:1290:47: (iv_ruleIntAtt= ruleIntAtt EOF )
            // InternalGame.g:1291:2: iv_ruleIntAtt= ruleIntAtt EOF
            {
             newCompositeNode(grammarAccess.getIntAttRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntAtt=ruleIntAtt();

            state._fsp--;

             current =iv_ruleIntAtt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntAtt"


    // $ANTLR start "ruleIntAtt"
    // InternalGame.g:1297:1: ruleIntAtt returns [EObject current=null] : ( ( (lv_value_0_0= ruleINTORDEC ) ) | (otherlv_1= 'self' ( (lv_attrId_2_0= RULE_ID ) ) ) ) ;
    public final EObject ruleIntAtt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_attrId_2_0=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1303:2: ( ( ( (lv_value_0_0= ruleINTORDEC ) ) | (otherlv_1= 'self' ( (lv_attrId_2_0= RULE_ID ) ) ) ) )
            // InternalGame.g:1304:2: ( ( (lv_value_0_0= ruleINTORDEC ) ) | (otherlv_1= 'self' ( (lv_attrId_2_0= RULE_ID ) ) ) )
            {
            // InternalGame.g:1304:2: ( ( (lv_value_0_0= ruleINTORDEC ) ) | (otherlv_1= 'self' ( (lv_attrId_2_0= RULE_ID ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==25) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalGame.g:1305:3: ( (lv_value_0_0= ruleINTORDEC ) )
                    {
                    // InternalGame.g:1305:3: ( (lv_value_0_0= ruleINTORDEC ) )
                    // InternalGame.g:1306:4: (lv_value_0_0= ruleINTORDEC )
                    {
                    // InternalGame.g:1306:4: (lv_value_0_0= ruleINTORDEC )
                    // InternalGame.g:1307:5: lv_value_0_0= ruleINTORDEC
                    {

                    					newCompositeNode(grammarAccess.getIntAttAccess().getValueINTORDECParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleINTORDEC();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIntAttRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"master.mdsd.Game.INTORDEC");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1325:3: (otherlv_1= 'self' ( (lv_attrId_2_0= RULE_ID ) ) )
                    {
                    // InternalGame.g:1325:3: (otherlv_1= 'self' ( (lv_attrId_2_0= RULE_ID ) ) )
                    // InternalGame.g:1326:4: otherlv_1= 'self' ( (lv_attrId_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getIntAttAccess().getSelfKeyword_1_0());
                    			
                    // InternalGame.g:1330:4: ( (lv_attrId_2_0= RULE_ID ) )
                    // InternalGame.g:1331:5: (lv_attrId_2_0= RULE_ID )
                    {
                    // InternalGame.g:1331:5: (lv_attrId_2_0= RULE_ID )
                    // InternalGame.g:1332:6: lv_attrId_2_0= RULE_ID
                    {
                    lv_attrId_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_attrId_2_0, grammarAccess.getIntAttAccess().getAttrIdIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntAttRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"attrId",
                    							lv_attrId_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntAtt"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalGame.g:1353:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalGame.g:1353:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalGame.g:1354:2: iv_ruleDECIMAL= ruleDECIMAL EOF
            {
             newCompositeNode(grammarAccess.getDECIMALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDECIMAL=ruleDECIMAL();

            state._fsp--;

             current =iv_ruleDECIMAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // InternalGame.g:1360:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGame.g:1366:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalGame.g:1367:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalGame.g:1367:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalGame.g:1368:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,26,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDECIMAL"


    // $ANTLR start "entryRuleLogicOperatorLoop"
    // InternalGame.g:1391:1: entryRuleLogicOperatorLoop returns [EObject current=null] : iv_ruleLogicOperatorLoop= ruleLogicOperatorLoop EOF ;
    public final EObject entryRuleLogicOperatorLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicOperatorLoop = null;


        try {
            // InternalGame.g:1391:58: (iv_ruleLogicOperatorLoop= ruleLogicOperatorLoop EOF )
            // InternalGame.g:1392:2: iv_ruleLogicOperatorLoop= ruleLogicOperatorLoop EOF
            {
             newCompositeNode(grammarAccess.getLogicOperatorLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicOperatorLoop=ruleLogicOperatorLoop();

            state._fsp--;

             current =iv_ruleLogicOperatorLoop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicOperatorLoop"


    // $ANTLR start "ruleLogicOperatorLoop"
    // InternalGame.g:1398:1: ruleLogicOperatorLoop returns [EObject current=null] : ( ( (lv_logicOp_0_0= ruleLogicOperator ) ) ( (lv_intAtt_1_0= ruleIntAtt ) ) ( (lv_lop_2_0= ruleLogicOperatorLoop ) )? ) ;
    public final EObject ruleLogicOperatorLoop() throws RecognitionException {
        EObject current = null;

        EObject lv_logicOp_0_0 = null;

        EObject lv_intAtt_1_0 = null;

        EObject lv_lop_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1404:2: ( ( ( (lv_logicOp_0_0= ruleLogicOperator ) ) ( (lv_intAtt_1_0= ruleIntAtt ) ) ( (lv_lop_2_0= ruleLogicOperatorLoop ) )? ) )
            // InternalGame.g:1405:2: ( ( (lv_logicOp_0_0= ruleLogicOperator ) ) ( (lv_intAtt_1_0= ruleIntAtt ) ) ( (lv_lop_2_0= ruleLogicOperatorLoop ) )? )
            {
            // InternalGame.g:1405:2: ( ( (lv_logicOp_0_0= ruleLogicOperator ) ) ( (lv_intAtt_1_0= ruleIntAtt ) ) ( (lv_lop_2_0= ruleLogicOperatorLoop ) )? )
            // InternalGame.g:1406:3: ( (lv_logicOp_0_0= ruleLogicOperator ) ) ( (lv_intAtt_1_0= ruleIntAtt ) ) ( (lv_lop_2_0= ruleLogicOperatorLoop ) )?
            {
            // InternalGame.g:1406:3: ( (lv_logicOp_0_0= ruleLogicOperator ) )
            // InternalGame.g:1407:4: (lv_logicOp_0_0= ruleLogicOperator )
            {
            // InternalGame.g:1407:4: (lv_logicOp_0_0= ruleLogicOperator )
            // InternalGame.g:1408:5: lv_logicOp_0_0= ruleLogicOperator
            {

            					newCompositeNode(grammarAccess.getLogicOperatorLoopAccess().getLogicOpLogicOperatorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_logicOp_0_0=ruleLogicOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicOperatorLoopRule());
            					}
            					add(
            						current,
            						"logicOp",
            						lv_logicOp_0_0,
            						"master.mdsd.Game.LogicOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:1425:3: ( (lv_intAtt_1_0= ruleIntAtt ) )
            // InternalGame.g:1426:4: (lv_intAtt_1_0= ruleIntAtt )
            {
            // InternalGame.g:1426:4: (lv_intAtt_1_0= ruleIntAtt )
            // InternalGame.g:1427:5: lv_intAtt_1_0= ruleIntAtt
            {

            					newCompositeNode(grammarAccess.getLogicOperatorLoopAccess().getIntAttIntAttParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_intAtt_1_0=ruleIntAtt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicOperatorLoopRule());
            					}
            					add(
            						current,
            						"intAtt",
            						lv_intAtt_1_0,
            						"master.mdsd.Game.IntAtt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:1444:3: ( (lv_lop_2_0= ruleLogicOperatorLoop ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=32 && LA17_0<=35)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGame.g:1445:4: (lv_lop_2_0= ruleLogicOperatorLoop )
                    {
                    // InternalGame.g:1445:4: (lv_lop_2_0= ruleLogicOperatorLoop )
                    // InternalGame.g:1446:5: lv_lop_2_0= ruleLogicOperatorLoop
                    {

                    					newCompositeNode(grammarAccess.getLogicOperatorLoopAccess().getLopLogicOperatorLoopParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_lop_2_0=ruleLogicOperatorLoop();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLogicOperatorLoopRule());
                    					}
                    					add(
                    						current,
                    						"lop",
                    						lv_lop_2_0,
                    						"master.mdsd.Game.LogicOperatorLoop");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicOperatorLoop"


    // $ANTLR start "entryRuleReferenceCharacter"
    // InternalGame.g:1467:1: entryRuleReferenceCharacter returns [EObject current=null] : iv_ruleReferenceCharacter= ruleReferenceCharacter EOF ;
    public final EObject entryRuleReferenceCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCharacter = null;


        try {
            // InternalGame.g:1467:59: (iv_ruleReferenceCharacter= ruleReferenceCharacter EOF )
            // InternalGame.g:1468:2: iv_ruleReferenceCharacter= ruleReferenceCharacter EOF
            {
             newCompositeNode(grammarAccess.getReferenceCharacterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceCharacter=ruleReferenceCharacter();

            state._fsp--;

             current =iv_ruleReferenceCharacter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceCharacter"


    // $ANTLR start "ruleReferenceCharacter"
    // InternalGame.g:1474:1: ruleReferenceCharacter returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_targetId_3_0= 'self' ) ) ) ) ;
    public final EObject ruleReferenceCharacter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_targetId_3_0=null;


        	enterRule();

        try {
            // InternalGame.g:1480:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_targetId_3_0= 'self' ) ) ) ) )
            // InternalGame.g:1481:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_targetId_3_0= 'self' ) ) ) )
            {
            // InternalGame.g:1481:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_targetId_3_0= 'self' ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==25) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalGame.g:1482:3: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalGame.g:1482:3: ( () ( (otherlv_1= RULE_ID ) ) )
                    // InternalGame.g:1483:4: () ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalGame.g:1483:4: ()
                    // InternalGame.g:1484:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getReferenceCharacterAccess().getReferenceCharacterAction_0_0(),
                    						current);
                    				

                    }

                    // InternalGame.g:1490:4: ( (otherlv_1= RULE_ID ) )
                    // InternalGame.g:1491:5: (otherlv_1= RULE_ID )
                    {
                    // InternalGame.g:1491:5: (otherlv_1= RULE_ID )
                    // InternalGame.g:1492:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceCharacterRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getReferenceCharacterAccess().getCharacterIdCharacterCrossReference_0_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1505:3: ( () ( (lv_targetId_3_0= 'self' ) ) )
                    {
                    // InternalGame.g:1505:3: ( () ( (lv_targetId_3_0= 'self' ) ) )
                    // InternalGame.g:1506:4: () ( (lv_targetId_3_0= 'self' ) )
                    {
                    // InternalGame.g:1506:4: ()
                    // InternalGame.g:1507:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getReferenceCharacterAccess().getReferenceCharacterAction_1_0(),
                    						current);
                    				

                    }

                    // InternalGame.g:1513:4: ( (lv_targetId_3_0= 'self' ) )
                    // InternalGame.g:1514:5: (lv_targetId_3_0= 'self' )
                    {
                    // InternalGame.g:1514:5: (lv_targetId_3_0= 'self' )
                    // InternalGame.g:1515:6: lv_targetId_3_0= 'self'
                    {
                    lv_targetId_3_0=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_targetId_3_0, grammarAccess.getReferenceCharacterAccess().getTargetIdSelfKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceCharacterRule());
                    						}
                    						setWithLastConsumed(current, "targetId", lv_targetId_3_0, "self");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferenceCharacter"


    // $ANTLR start "entryRuleRuleType"
    // InternalGame.g:1532:1: entryRuleRuleType returns [EObject current=null] : iv_ruleRuleType= ruleRuleType EOF ;
    public final EObject entryRuleRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleType = null;


        try {
            // InternalGame.g:1532:49: (iv_ruleRuleType= ruleRuleType EOF )
            // InternalGame.g:1533:2: iv_ruleRuleType= ruleRuleType EOF
            {
             newCompositeNode(grammarAccess.getRuleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleType=ruleRuleType();

            state._fsp--;

             current =iv_ruleRuleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleType"


    // $ANTLR start "ruleRuleType"
    // InternalGame.g:1539:1: ruleRuleType returns [EObject current=null] : ( (lv_ruleTypeId_0_0= RULE_ID ) ) ;
    public final EObject ruleRuleType() throws RecognitionException {
        EObject current = null;

        Token lv_ruleTypeId_0_0=null;


        	enterRule();

        try {
            // InternalGame.g:1545:2: ( ( (lv_ruleTypeId_0_0= RULE_ID ) ) )
            // InternalGame.g:1546:2: ( (lv_ruleTypeId_0_0= RULE_ID ) )
            {
            // InternalGame.g:1546:2: ( (lv_ruleTypeId_0_0= RULE_ID ) )
            // InternalGame.g:1547:3: (lv_ruleTypeId_0_0= RULE_ID )
            {
            // InternalGame.g:1547:3: (lv_ruleTypeId_0_0= RULE_ID )
            // InternalGame.g:1548:4: lv_ruleTypeId_0_0= RULE_ID
            {
            lv_ruleTypeId_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_ruleTypeId_0_0, grammarAccess.getRuleTypeAccess().getRuleTypeIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRuleTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"ruleTypeId",
            					lv_ruleTypeId_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleType"


    // $ANTLR start "entryRuleCompOperator"
    // InternalGame.g:1567:1: entryRuleCompOperator returns [EObject current=null] : iv_ruleCompOperator= ruleCompOperator EOF ;
    public final EObject entryRuleCompOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompOperator = null;


        try {
            // InternalGame.g:1567:53: (iv_ruleCompOperator= ruleCompOperator EOF )
            // InternalGame.g:1568:2: iv_ruleCompOperator= ruleCompOperator EOF
            {
             newCompositeNode(grammarAccess.getCompOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompOperator=ruleCompOperator();

            state._fsp--;

             current =iv_ruleCompOperator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompOperator"


    // $ANTLR start "ruleCompOperator"
    // InternalGame.g:1574:1: ruleCompOperator returns [EObject current=null] : ( ( () otherlv_1= '<' ) | ( () otherlv_3= '>' ) | ( () otherlv_5= '<=' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '=' ) ) ;
    public final EObject ruleCompOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalGame.g:1580:2: ( ( ( () otherlv_1= '<' ) | ( () otherlv_3= '>' ) | ( () otherlv_5= '<=' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '=' ) ) )
            // InternalGame.g:1581:2: ( ( () otherlv_1= '<' ) | ( () otherlv_3= '>' ) | ( () otherlv_5= '<=' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '=' ) )
            {
            // InternalGame.g:1581:2: ( ( () otherlv_1= '<' ) | ( () otherlv_3= '>' ) | ( () otherlv_5= '<=' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '=' ) )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt19=1;
                }
                break;
            case 28:
                {
                alt19=2;
                }
                break;
            case 29:
                {
                alt19=3;
                }
                break;
            case 30:
                {
                alt19=4;
                }
                break;
            case 31:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalGame.g:1582:3: ( () otherlv_1= '<' )
                    {
                    // InternalGame.g:1582:3: ( () otherlv_1= '<' )
                    // InternalGame.g:1583:4: () otherlv_1= '<'
                    {
                    // InternalGame.g:1583:4: ()
                    // InternalGame.g:1584:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCompOperatorAccess().getLTAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getCompOperatorAccess().getLessThanSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1596:3: ( () otherlv_3= '>' )
                    {
                    // InternalGame.g:1596:3: ( () otherlv_3= '>' )
                    // InternalGame.g:1597:4: () otherlv_3= '>'
                    {
                    // InternalGame.g:1597:4: ()
                    // InternalGame.g:1598:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCompOperatorAccess().getGTAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompOperatorAccess().getGreaterThanSignKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:1610:3: ( () otherlv_5= '<=' )
                    {
                    // InternalGame.g:1610:3: ( () otherlv_5= '<=' )
                    // InternalGame.g:1611:4: () otherlv_5= '<='
                    {
                    // InternalGame.g:1611:4: ()
                    // InternalGame.g:1612:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCompOperatorAccess().getLTEAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getCompOperatorAccess().getLessThanSignEqualsSignKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGame.g:1624:3: ( () otherlv_7= '>=' )
                    {
                    // InternalGame.g:1624:3: ( () otherlv_7= '>=' )
                    // InternalGame.g:1625:4: () otherlv_7= '>='
                    {
                    // InternalGame.g:1625:4: ()
                    // InternalGame.g:1626:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCompOperatorAccess().getGTEAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getCompOperatorAccess().getGreaterThanSignEqualsSignKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGame.g:1638:3: ( () otherlv_9= '=' )
                    {
                    // InternalGame.g:1638:3: ( () otherlv_9= '=' )
                    // InternalGame.g:1639:4: () otherlv_9= '='
                    {
                    // InternalGame.g:1639:4: ()
                    // InternalGame.g:1640:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCompOperatorAccess().getEQAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getCompOperatorAccess().getEqualsSignKeyword_4_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompOperator"


    // $ANTLR start "entryRuleAction"
    // InternalGame.g:1655:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalGame.g:1655:47: (iv_ruleAction= ruleAction EOF )
            // InternalGame.g:1656:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalGame.g:1662:1: ruleAction returns [EObject current=null] : (otherlv_0= '(' ( (lv_charAtt_1_0= ruleCharacterAttr ) ) otherlv_2= '=' ( (lv_charDec_3_0= ruleCharDec ) ) ( (lv_lo_4_0= ruleLogicOperatorLoop ) )? otherlv_5= ')' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_charAtt_1_0 = null;

        EObject lv_charDec_3_0 = null;

        EObject lv_lo_4_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1668:2: ( (otherlv_0= '(' ( (lv_charAtt_1_0= ruleCharacterAttr ) ) otherlv_2= '=' ( (lv_charDec_3_0= ruleCharDec ) ) ( (lv_lo_4_0= ruleLogicOperatorLoop ) )? otherlv_5= ')' ) )
            // InternalGame.g:1669:2: (otherlv_0= '(' ( (lv_charAtt_1_0= ruleCharacterAttr ) ) otherlv_2= '=' ( (lv_charDec_3_0= ruleCharDec ) ) ( (lv_lo_4_0= ruleLogicOperatorLoop ) )? otherlv_5= ')' )
            {
            // InternalGame.g:1669:2: (otherlv_0= '(' ( (lv_charAtt_1_0= ruleCharacterAttr ) ) otherlv_2= '=' ( (lv_charDec_3_0= ruleCharDec ) ) ( (lv_lo_4_0= ruleLogicOperatorLoop ) )? otherlv_5= ')' )
            // InternalGame.g:1670:3: otherlv_0= '(' ( (lv_charAtt_1_0= ruleCharacterAttr ) ) otherlv_2= '=' ( (lv_charDec_3_0= ruleCharDec ) ) ( (lv_lo_4_0= ruleLogicOperatorLoop ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalGame.g:1674:3: ( (lv_charAtt_1_0= ruleCharacterAttr ) )
            // InternalGame.g:1675:4: (lv_charAtt_1_0= ruleCharacterAttr )
            {
            // InternalGame.g:1675:4: (lv_charAtt_1_0= ruleCharacterAttr )
            // InternalGame.g:1676:5: lv_charAtt_1_0= ruleCharacterAttr
            {

            					newCompositeNode(grammarAccess.getActionAccess().getCharAttCharacterAttrParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_charAtt_1_0=ruleCharacterAttr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"charAtt",
            						lv_charAtt_1_0,
            						"master.mdsd.Game.CharacterAttr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getEqualsSignKeyword_2());
            		
            // InternalGame.g:1697:3: ( (lv_charDec_3_0= ruleCharDec ) )
            // InternalGame.g:1698:4: (lv_charDec_3_0= ruleCharDec )
            {
            // InternalGame.g:1698:4: (lv_charDec_3_0= ruleCharDec )
            // InternalGame.g:1699:5: lv_charDec_3_0= ruleCharDec
            {

            					newCompositeNode(grammarAccess.getActionAccess().getCharDecCharDecParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_charDec_3_0=ruleCharDec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"charDec",
            						lv_charDec_3_0,
            						"master.mdsd.Game.CharDec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:1716:3: ( (lv_lo_4_0= ruleLogicOperatorLoop ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=32 && LA20_0<=35)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGame.g:1717:4: (lv_lo_4_0= ruleLogicOperatorLoop )
                    {
                    // InternalGame.g:1717:4: (lv_lo_4_0= ruleLogicOperatorLoop )
                    // InternalGame.g:1718:5: lv_lo_4_0= ruleLogicOperatorLoop
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getLoLogicOperatorLoopParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_lo_4_0=ruleLogicOperatorLoop();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					add(
                    						current,
                    						"lo",
                    						lv_lo_4_0,
                    						"master.mdsd.Game.LogicOperatorLoop");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getActionAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCharDec"
    // InternalGame.g:1743:1: entryRuleCharDec returns [EObject current=null] : iv_ruleCharDec= ruleCharDec EOF ;
    public final EObject entryRuleCharDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharDec = null;


        try {
            // InternalGame.g:1743:48: (iv_ruleCharDec= ruleCharDec EOF )
            // InternalGame.g:1744:2: iv_ruleCharDec= ruleCharDec EOF
            {
             newCompositeNode(grammarAccess.getCharDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharDec=ruleCharDec();

            state._fsp--;

             current =iv_ruleCharDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCharDec"


    // $ANTLR start "ruleCharDec"
    // InternalGame.g:1750:1: ruleCharDec returns [EObject current=null] : ( ( (lv_charAttResult_0_0= ruleCharacterAttr ) ) | ( (lv_val_1_0= ruleINTORDEC ) ) ) ;
    public final EObject ruleCharDec() throws RecognitionException {
        EObject current = null;

        EObject lv_charAttResult_0_0 = null;

        AntlrDatatypeRuleToken lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1756:2: ( ( ( (lv_charAttResult_0_0= ruleCharacterAttr ) ) | ( (lv_val_1_0= ruleINTORDEC ) ) ) )
            // InternalGame.g:1757:2: ( ( (lv_charAttResult_0_0= ruleCharacterAttr ) ) | ( (lv_val_1_0= ruleINTORDEC ) ) )
            {
            // InternalGame.g:1757:2: ( ( (lv_charAttResult_0_0= ruleCharacterAttr ) ) | ( (lv_val_1_0= ruleINTORDEC ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||LA21_0==25) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_INT) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalGame.g:1758:3: ( (lv_charAttResult_0_0= ruleCharacterAttr ) )
                    {
                    // InternalGame.g:1758:3: ( (lv_charAttResult_0_0= ruleCharacterAttr ) )
                    // InternalGame.g:1759:4: (lv_charAttResult_0_0= ruleCharacterAttr )
                    {
                    // InternalGame.g:1759:4: (lv_charAttResult_0_0= ruleCharacterAttr )
                    // InternalGame.g:1760:5: lv_charAttResult_0_0= ruleCharacterAttr
                    {

                    					newCompositeNode(grammarAccess.getCharDecAccess().getCharAttResultCharacterAttrParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_charAttResult_0_0=ruleCharacterAttr();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCharDecRule());
                    					}
                    					add(
                    						current,
                    						"charAttResult",
                    						lv_charAttResult_0_0,
                    						"master.mdsd.Game.CharacterAttr");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1778:3: ( (lv_val_1_0= ruleINTORDEC ) )
                    {
                    // InternalGame.g:1778:3: ( (lv_val_1_0= ruleINTORDEC ) )
                    // InternalGame.g:1779:4: (lv_val_1_0= ruleINTORDEC )
                    {
                    // InternalGame.g:1779:4: (lv_val_1_0= ruleINTORDEC )
                    // InternalGame.g:1780:5: lv_val_1_0= ruleINTORDEC
                    {

                    					newCompositeNode(grammarAccess.getCharDecAccess().getValINTORDECParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_val_1_0=ruleINTORDEC();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCharDecRule());
                    					}
                    					set(
                    						current,
                    						"val",
                    						lv_val_1_0,
                    						"master.mdsd.Game.INTORDEC");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharDec"


    // $ANTLR start "entryRuleCharacterAttr"
    // InternalGame.g:1801:1: entryRuleCharacterAttr returns [EObject current=null] : iv_ruleCharacterAttr= ruleCharacterAttr EOF ;
    public final EObject entryRuleCharacterAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacterAttr = null;


        try {
            // InternalGame.g:1801:54: (iv_ruleCharacterAttr= ruleCharacterAttr EOF )
            // InternalGame.g:1802:2: iv_ruleCharacterAttr= ruleCharacterAttr EOF
            {
             newCompositeNode(grammarAccess.getCharacterAttrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacterAttr=ruleCharacterAttr();

            state._fsp--;

             current =iv_ruleCharacterAttr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCharacterAttr"


    // $ANTLR start "ruleCharacterAttr"
    // InternalGame.g:1808:1: ruleCharacterAttr returns [EObject current=null] : ( ( (lv_reference_0_0= ruleReferenceCharacter ) ) ( (lv_attributename_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCharacterAttr() throws RecognitionException {
        EObject current = null;

        Token lv_attributename_1_0=null;
        EObject lv_reference_0_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1814:2: ( ( ( (lv_reference_0_0= ruleReferenceCharacter ) ) ( (lv_attributename_1_0= RULE_ID ) ) ) )
            // InternalGame.g:1815:2: ( ( (lv_reference_0_0= ruleReferenceCharacter ) ) ( (lv_attributename_1_0= RULE_ID ) ) )
            {
            // InternalGame.g:1815:2: ( ( (lv_reference_0_0= ruleReferenceCharacter ) ) ( (lv_attributename_1_0= RULE_ID ) ) )
            // InternalGame.g:1816:3: ( (lv_reference_0_0= ruleReferenceCharacter ) ) ( (lv_attributename_1_0= RULE_ID ) )
            {
            // InternalGame.g:1816:3: ( (lv_reference_0_0= ruleReferenceCharacter ) )
            // InternalGame.g:1817:4: (lv_reference_0_0= ruleReferenceCharacter )
            {
            // InternalGame.g:1817:4: (lv_reference_0_0= ruleReferenceCharacter )
            // InternalGame.g:1818:5: lv_reference_0_0= ruleReferenceCharacter
            {

            					newCompositeNode(grammarAccess.getCharacterAttrAccess().getReferenceReferenceCharacterParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_reference_0_0=ruleReferenceCharacter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCharacterAttrRule());
            					}
            					set(
            						current,
            						"reference",
            						lv_reference_0_0,
            						"master.mdsd.Game.ReferenceCharacter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:1835:3: ( (lv_attributename_1_0= RULE_ID ) )
            // InternalGame.g:1836:4: (lv_attributename_1_0= RULE_ID )
            {
            // InternalGame.g:1836:4: (lv_attributename_1_0= RULE_ID )
            // InternalGame.g:1837:5: lv_attributename_1_0= RULE_ID
            {
            lv_attributename_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_attributename_1_0, grammarAccess.getCharacterAttrAccess().getAttributenameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacterAttrRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attributename",
            						lv_attributename_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharacterAttr"


    // $ANTLR start "entryRuleLogicOperator"
    // InternalGame.g:1857:1: entryRuleLogicOperator returns [EObject current=null] : iv_ruleLogicOperator= ruleLogicOperator EOF ;
    public final EObject entryRuleLogicOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicOperator = null;


        try {
            // InternalGame.g:1857:54: (iv_ruleLogicOperator= ruleLogicOperator EOF )
            // InternalGame.g:1858:2: iv_ruleLogicOperator= ruleLogicOperator EOF
            {
             newCompositeNode(grammarAccess.getLogicOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicOperator=ruleLogicOperator();

            state._fsp--;

             current =iv_ruleLogicOperator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicOperator"


    // $ANTLR start "ruleLogicOperator"
    // InternalGame.g:1864:1: ruleLogicOperator returns [EObject current=null] : ( ( () otherlv_1= '*' ) | ( () otherlv_3= '+' ) | ( () otherlv_5= '-' ) | ( () otherlv_7= '/' ) ) ;
    public final EObject ruleLogicOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalGame.g:1870:2: ( ( ( () otherlv_1= '*' ) | ( () otherlv_3= '+' ) | ( () otherlv_5= '-' ) | ( () otherlv_7= '/' ) ) )
            // InternalGame.g:1871:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '+' ) | ( () otherlv_5= '-' ) | ( () otherlv_7= '/' ) )
            {
            // InternalGame.g:1871:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '+' ) | ( () otherlv_5= '-' ) | ( () otherlv_7= '/' ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt22=1;
                }
                break;
            case 33:
                {
                alt22=2;
                }
                break;
            case 34:
                {
                alt22=3;
                }
                break;
            case 35:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalGame.g:1872:3: ( () otherlv_1= '*' )
                    {
                    // InternalGame.g:1872:3: ( () otherlv_1= '*' )
                    // InternalGame.g:1873:4: () otherlv_1= '*'
                    {
                    // InternalGame.g:1873:4: ()
                    // InternalGame.g:1874:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLogicOperatorAccess().getTAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getLogicOperatorAccess().getAsteriskKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1886:3: ( () otherlv_3= '+' )
                    {
                    // InternalGame.g:1886:3: ( () otherlv_3= '+' )
                    // InternalGame.g:1887:4: () otherlv_3= '+'
                    {
                    // InternalGame.g:1887:4: ()
                    // InternalGame.g:1888:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLogicOperatorAccess().getAAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogicOperatorAccess().getPlusSignKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:1900:3: ( () otherlv_5= '-' )
                    {
                    // InternalGame.g:1900:3: ( () otherlv_5= '-' )
                    // InternalGame.g:1901:4: () otherlv_5= '-'
                    {
                    // InternalGame.g:1901:4: ()
                    // InternalGame.g:1902:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLogicOperatorAccess().getMAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getLogicOperatorAccess().getHyphenMinusKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGame.g:1914:3: ( () otherlv_7= '/' )
                    {
                    // InternalGame.g:1914:3: ( () otherlv_7= '/' )
                    // InternalGame.g:1915:4: () otherlv_7= '/'
                    {
                    // InternalGame.g:1915:4: ()
                    // InternalGame.g:1916:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLogicOperatorAccess().getDAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,35,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getLogicOperatorAccess().getSolidusKeyword_3_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicOperator"


    // $ANTLR start "entryRuleAttack"
    // InternalGame.g:1931:1: entryRuleAttack returns [EObject current=null] : iv_ruleAttack= ruleAttack EOF ;
    public final EObject entryRuleAttack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttack = null;


        try {
            // InternalGame.g:1931:47: (iv_ruleAttack= ruleAttack EOF )
            // InternalGame.g:1932:2: iv_ruleAttack= ruleAttack EOF
            {
             newCompositeNode(grammarAccess.getAttackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttack=ruleAttack();

            state._fsp--;

             current =iv_ruleAttack; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttack"


    // $ANTLR start "ruleAttack"
    // InternalGame.g:1938:1: ruleAttack returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attributes_2_0= ruleAttribute ) )* ( (lv_attributesAttack_3_0= ruleAttributeAttack ) )* ( (lv_rules_4_0= ruleRuleSet ) )? otherlv_5= '}' ) ;
    public final EObject ruleAttack() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_attributes_2_0 = null;

        EObject lv_attributesAttack_3_0 = null;

        EObject lv_rules_4_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1944:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attributes_2_0= ruleAttribute ) )* ( (lv_attributesAttack_3_0= ruleAttributeAttack ) )* ( (lv_rules_4_0= ruleRuleSet ) )? otherlv_5= '}' ) )
            // InternalGame.g:1945:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attributes_2_0= ruleAttribute ) )* ( (lv_attributesAttack_3_0= ruleAttributeAttack ) )* ( (lv_rules_4_0= ruleRuleSet ) )? otherlv_5= '}' )
            {
            // InternalGame.g:1945:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attributes_2_0= ruleAttribute ) )* ( (lv_attributesAttack_3_0= ruleAttributeAttack ) )* ( (lv_rules_4_0= ruleRuleSet ) )? otherlv_5= '}' )
            // InternalGame.g:1946:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attributes_2_0= ruleAttribute ) )* ( (lv_attributesAttack_3_0= ruleAttributeAttack ) )* ( (lv_rules_4_0= ruleRuleSet ) )? otherlv_5= '}'
            {
            // InternalGame.g:1946:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:1947:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:1947:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:1948:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttackAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttackRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getAttackAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:1968:3: ( (lv_attributes_2_0= ruleAttribute ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGame.g:1969:4: (lv_attributes_2_0= ruleAttribute )
            	    {
            	    // InternalGame.g:1969:4: (lv_attributes_2_0= ruleAttribute )
            	    // InternalGame.g:1970:5: lv_attributes_2_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getAttackAccess().getAttributesAttributeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_attributes_2_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAttackRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_2_0,
            	    						"master.mdsd.Game.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalGame.g:1987:3: ( (lv_attributesAttack_3_0= ruleAttributeAttack ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==20||(LA24_0>=36 && LA24_0<=37)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalGame.g:1988:4: (lv_attributesAttack_3_0= ruleAttributeAttack )
            	    {
            	    // InternalGame.g:1988:4: (lv_attributesAttack_3_0= ruleAttributeAttack )
            	    // InternalGame.g:1989:5: lv_attributesAttack_3_0= ruleAttributeAttack
            	    {

            	    					newCompositeNode(grammarAccess.getAttackAccess().getAttributesAttackAttributeAttackParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_attributesAttack_3_0=ruleAttributeAttack();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAttackRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributesAttack",
            	    						lv_attributesAttack_3_0,
            	    						"master.mdsd.Game.AttributeAttack");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // InternalGame.g:2006:3: ( (lv_rules_4_0= ruleRuleSet ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGame.g:2007:4: (lv_rules_4_0= ruleRuleSet )
                    {
                    // InternalGame.g:2007:4: (lv_rules_4_0= ruleRuleSet )
                    // InternalGame.g:2008:5: lv_rules_4_0= ruleRuleSet
                    {

                    					newCompositeNode(grammarAccess.getAttackAccess().getRulesRuleSetParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_rules_4_0=ruleRuleSet();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttackRule());
                    					}
                    					add(
                    						current,
                    						"rules",
                    						lv_rules_4_0,
                    						"master.mdsd.Game.RuleSet");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAttackAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttack"


    // $ANTLR start "entryRuleAttributeAttack"
    // InternalGame.g:2033:1: entryRuleAttributeAttack returns [EObject current=null] : iv_ruleAttributeAttack= ruleAttributeAttack EOF ;
    public final EObject entryRuleAttributeAttack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeAttack = null;


        try {
            // InternalGame.g:2033:56: (iv_ruleAttributeAttack= ruleAttributeAttack EOF )
            // InternalGame.g:2034:2: iv_ruleAttributeAttack= ruleAttributeAttack EOF
            {
             newCompositeNode(grammarAccess.getAttributeAttackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeAttack=ruleAttributeAttack();

            state._fsp--;

             current =iv_ruleAttributeAttack; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeAttack"


    // $ANTLR start "ruleAttributeAttack"
    // InternalGame.g:2040:1: ruleAttributeAttack returns [EObject current=null] : ( ( (lv_attributeTypesAttack_0_0= ruleAttributeTypeAttack ) ) ( (lv_type_1_0= ruleType ) )? ) ;
    public final EObject ruleAttributeAttack() throws RecognitionException {
        EObject current = null;

        EObject lv_attributeTypesAttack_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalGame.g:2046:2: ( ( ( (lv_attributeTypesAttack_0_0= ruleAttributeTypeAttack ) ) ( (lv_type_1_0= ruleType ) )? ) )
            // InternalGame.g:2047:2: ( ( (lv_attributeTypesAttack_0_0= ruleAttributeTypeAttack ) ) ( (lv_type_1_0= ruleType ) )? )
            {
            // InternalGame.g:2047:2: ( ( (lv_attributeTypesAttack_0_0= ruleAttributeTypeAttack ) ) ( (lv_type_1_0= ruleType ) )? )
            // InternalGame.g:2048:3: ( (lv_attributeTypesAttack_0_0= ruleAttributeTypeAttack ) ) ( (lv_type_1_0= ruleType ) )?
            {
            // InternalGame.g:2048:3: ( (lv_attributeTypesAttack_0_0= ruleAttributeTypeAttack ) )
            // InternalGame.g:2049:4: (lv_attributeTypesAttack_0_0= ruleAttributeTypeAttack )
            {
            // InternalGame.g:2049:4: (lv_attributeTypesAttack_0_0= ruleAttributeTypeAttack )
            // InternalGame.g:2050:5: lv_attributeTypesAttack_0_0= ruleAttributeTypeAttack
            {

            					newCompositeNode(grammarAccess.getAttributeAttackAccess().getAttributeTypesAttackAttributeTypeAttackParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_attributeTypesAttack_0_0=ruleAttributeTypeAttack();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeAttackRule());
            					}
            					add(
            						current,
            						"attributeTypesAttack",
            						lv_attributeTypesAttack_0_0,
            						"master.mdsd.Game.AttributeTypeAttack");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:2067:3: ( (lv_type_1_0= ruleType ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_INT)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGame.g:2068:4: (lv_type_1_0= ruleType )
                    {
                    // InternalGame.g:2068:4: (lv_type_1_0= ruleType )
                    // InternalGame.g:2069:5: lv_type_1_0= ruleType
                    {

                    					newCompositeNode(grammarAccess.getAttributeAttackAccess().getTypeTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_1_0=ruleType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeAttackRule());
                    					}
                    					add(
                    						current,
                    						"type",
                    						lv_type_1_0,
                    						"master.mdsd.Game.Type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeAttack"


    // $ANTLR start "entryRuleAttributeTypeAttack"
    // InternalGame.g:2090:1: entryRuleAttributeTypeAttack returns [EObject current=null] : iv_ruleAttributeTypeAttack= ruleAttributeTypeAttack EOF ;
    public final EObject entryRuleAttributeTypeAttack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeTypeAttack = null;


        try {
            // InternalGame.g:2090:60: (iv_ruleAttributeTypeAttack= ruleAttributeTypeAttack EOF )
            // InternalGame.g:2091:2: iv_ruleAttributeTypeAttack= ruleAttributeTypeAttack EOF
            {
             newCompositeNode(grammarAccess.getAttributeTypeAttackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeTypeAttack=ruleAttributeTypeAttack();

            state._fsp--;

             current =iv_ruleAttributeTypeAttack; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeTypeAttack"


    // $ANTLR start "ruleAttributeTypeAttack"
    // InternalGame.g:2097:1: ruleAttributeTypeAttack returns [EObject current=null] : ( ( () otherlv_1= 'Ammunition' ) | ( () otherlv_3= 'Attackspeed' ) | ( () otherlv_5= 'Bullet' ( (otherlv_6= RULE_ID ) ) ) ) ;
    public final EObject ruleAttributeTypeAttack() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalGame.g:2103:2: ( ( ( () otherlv_1= 'Ammunition' ) | ( () otherlv_3= 'Attackspeed' ) | ( () otherlv_5= 'Bullet' ( (otherlv_6= RULE_ID ) ) ) ) )
            // InternalGame.g:2104:2: ( ( () otherlv_1= 'Ammunition' ) | ( () otherlv_3= 'Attackspeed' ) | ( () otherlv_5= 'Bullet' ( (otherlv_6= RULE_ID ) ) ) )
            {
            // InternalGame.g:2104:2: ( ( () otherlv_1= 'Ammunition' ) | ( () otherlv_3= 'Attackspeed' ) | ( () otherlv_5= 'Bullet' ( (otherlv_6= RULE_ID ) ) ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt27=1;
                }
                break;
            case 37:
                {
                alt27=2;
                }
                break;
            case 20:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalGame.g:2105:3: ( () otherlv_1= 'Ammunition' )
                    {
                    // InternalGame.g:2105:3: ( () otherlv_1= 'Ammunition' )
                    // InternalGame.g:2106:4: () otherlv_1= 'Ammunition'
                    {
                    // InternalGame.g:2106:4: ()
                    // InternalGame.g:2107:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeTypeAttackAccess().getAmmoAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeTypeAttackAccess().getAmmunitionKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:2119:3: ( () otherlv_3= 'Attackspeed' )
                    {
                    // InternalGame.g:2119:3: ( () otherlv_3= 'Attackspeed' )
                    // InternalGame.g:2120:4: () otherlv_3= 'Attackspeed'
                    {
                    // InternalGame.g:2120:4: ()
                    // InternalGame.g:2121:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeTypeAttackAccess().getAttSAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeTypeAttackAccess().getAttackspeedKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:2133:3: ( () otherlv_5= 'Bullet' ( (otherlv_6= RULE_ID ) ) )
                    {
                    // InternalGame.g:2133:3: ( () otherlv_5= 'Bullet' ( (otherlv_6= RULE_ID ) ) )
                    // InternalGame.g:2134:4: () otherlv_5= 'Bullet' ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalGame.g:2134:4: ()
                    // InternalGame.g:2135:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeTypeAttackAccess().getBulletAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeTypeAttackAccess().getBulletKeyword_2_1());
                    			
                    // InternalGame.g:2145:4: ( (otherlv_6= RULE_ID ) )
                    // InternalGame.g:2146:5: (otherlv_6= RULE_ID )
                    {
                    // InternalGame.g:2146:5: (otherlv_6= RULE_ID )
                    // InternalGame.g:2147:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeTypeAttackRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_6, grammarAccess.getAttributeTypeAttackAccess().getBulletRefBulletCrossReference_2_2_0());
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeTypeAttack"


    // $ANTLR start "entryRuleBullet"
    // InternalGame.g:2163:1: entryRuleBullet returns [EObject current=null] : iv_ruleBullet= ruleBullet EOF ;
    public final EObject entryRuleBullet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBullet = null;


        try {
            // InternalGame.g:2163:47: (iv_ruleBullet= ruleBullet EOF )
            // InternalGame.g:2164:2: iv_ruleBullet= ruleBullet EOF
            {
             newCompositeNode(grammarAccess.getBulletRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBullet=ruleBullet();

            state._fsp--;

             current =iv_ruleBullet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBullet"


    // $ANTLR start "ruleBullet"
    // InternalGame.g:2170:1: ruleBullet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attributesBullet_2_0= ruleAttribute ) )* otherlv_3= '}' ) ;
    public final EObject ruleBullet() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_attributesBullet_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:2176:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attributesBullet_2_0= ruleAttribute ) )* otherlv_3= '}' ) )
            // InternalGame.g:2177:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attributesBullet_2_0= ruleAttribute ) )* otherlv_3= '}' )
            {
            // InternalGame.g:2177:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attributesBullet_2_0= ruleAttribute ) )* otherlv_3= '}' )
            // InternalGame.g:2178:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attributesBullet_2_0= ruleAttribute ) )* otherlv_3= '}'
            {
            // InternalGame.g:2178:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:2179:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:2179:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:2180:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBulletAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBulletRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getBulletAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:2200:3: ( (lv_attributesBullet_2_0= ruleAttribute ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGame.g:2201:4: (lv_attributesBullet_2_0= ruleAttribute )
            	    {
            	    // InternalGame.g:2201:4: (lv_attributesBullet_2_0= ruleAttribute )
            	    // InternalGame.g:2202:5: lv_attributesBullet_2_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getBulletAccess().getAttributesBulletAttributeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_attributesBullet_2_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBulletRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributesBullet",
            	    						lv_attributesBullet_2_0,
            	    						"master.mdsd.Game.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBulletAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBullet"


    // $ANTLR start "entryRuleInitializer"
    // InternalGame.g:2227:1: entryRuleInitializer returns [EObject current=null] : iv_ruleInitializer= ruleInitializer EOF ;
    public final EObject entryRuleInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitializer = null;


        try {
            // InternalGame.g:2227:52: (iv_ruleInitializer= ruleInitializer EOF )
            // InternalGame.g:2228:2: iv_ruleInitializer= ruleInitializer EOF
            {
             newCompositeNode(grammarAccess.getInitializerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitializer=ruleInitializer();

            state._fsp--;

             current =iv_ruleInitializer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitializer"


    // $ANTLR start "ruleInitializer"
    // InternalGame.g:2234:1: ruleInitializer returns [EObject current=null] : ( () ( (lv_entityId_1_0= 'Initializer' ) ) otherlv_2= '{' ( (lv_attributesInitializer_3_0= ruleAttributeInitializer ) )* otherlv_4= '}' ) ;
    public final EObject ruleInitializer() throws RecognitionException {
        EObject current = null;

        Token lv_entityId_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributesInitializer_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:2240:2: ( ( () ( (lv_entityId_1_0= 'Initializer' ) ) otherlv_2= '{' ( (lv_attributesInitializer_3_0= ruleAttributeInitializer ) )* otherlv_4= '}' ) )
            // InternalGame.g:2241:2: ( () ( (lv_entityId_1_0= 'Initializer' ) ) otherlv_2= '{' ( (lv_attributesInitializer_3_0= ruleAttributeInitializer ) )* otherlv_4= '}' )
            {
            // InternalGame.g:2241:2: ( () ( (lv_entityId_1_0= 'Initializer' ) ) otherlv_2= '{' ( (lv_attributesInitializer_3_0= ruleAttributeInitializer ) )* otherlv_4= '}' )
            // InternalGame.g:2242:3: () ( (lv_entityId_1_0= 'Initializer' ) ) otherlv_2= '{' ( (lv_attributesInitializer_3_0= ruleAttributeInitializer ) )* otherlv_4= '}'
            {
            // InternalGame.g:2242:3: ()
            // InternalGame.g:2243:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitializerAccess().getInitializerAction_0(),
            					current);
            			

            }

            // InternalGame.g:2249:3: ( (lv_entityId_1_0= 'Initializer' ) )
            // InternalGame.g:2250:4: (lv_entityId_1_0= 'Initializer' )
            {
            // InternalGame.g:2250:4: (lv_entityId_1_0= 'Initializer' )
            // InternalGame.g:2251:5: lv_entityId_1_0= 'Initializer'
            {
            lv_entityId_1_0=(Token)match(input,38,FOLLOW_3); 

            					newLeafNode(lv_entityId_1_0, grammarAccess.getInitializerAccess().getEntityIdInitializerKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitializerRule());
            					}
            					setWithLastConsumed(current, "entityId", lv_entityId_1_0, "Initializer");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getInitializerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:2267:3: ( (lv_attributesInitializer_3_0= ruleAttributeInitializer ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGame.g:2268:4: (lv_attributesInitializer_3_0= ruleAttributeInitializer )
            	    {
            	    // InternalGame.g:2268:4: (lv_attributesInitializer_3_0= ruleAttributeInitializer )
            	    // InternalGame.g:2269:5: lv_attributesInitializer_3_0= ruleAttributeInitializer
            	    {

            	    					newCompositeNode(grammarAccess.getInitializerAccess().getAttributesInitializerAttributeInitializerParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_attributesInitializer_3_0=ruleAttributeInitializer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInitializerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributesInitializer",
            	    						lv_attributesInitializer_3_0,
            	    						"master.mdsd.Game.AttributeInitializer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInitializerAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitializer"


    // $ANTLR start "entryRuleAttributeInitializer"
    // InternalGame.g:2294:1: entryRuleAttributeInitializer returns [EObject current=null] : iv_ruleAttributeInitializer= ruleAttributeInitializer EOF ;
    public final EObject entryRuleAttributeInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeInitializer = null;


        try {
            // InternalGame.g:2294:61: (iv_ruleAttributeInitializer= ruleAttributeInitializer EOF )
            // InternalGame.g:2295:2: iv_ruleAttributeInitializer= ruleAttributeInitializer EOF
            {
             newCompositeNode(grammarAccess.getAttributeInitializerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeInitializer=ruleAttributeInitializer();

            state._fsp--;

             current =iv_ruleAttributeInitializer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeInitializer"


    // $ANTLR start "ruleAttributeInitializer"
    // InternalGame.g:2301:1: ruleAttributeInitializer returns [EObject current=null] : ( ( (lv_attributeId_0_0= RULE_ID ) ) ( (lv_amountValueId_1_0= RULE_INT ) )? ( (lv_target_2_0= ruleTargetRef ) ) ) ;
    public final EObject ruleAttributeInitializer() throws RecognitionException {
        EObject current = null;

        Token lv_attributeId_0_0=null;
        Token lv_amountValueId_1_0=null;
        EObject lv_target_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:2307:2: ( ( ( (lv_attributeId_0_0= RULE_ID ) ) ( (lv_amountValueId_1_0= RULE_INT ) )? ( (lv_target_2_0= ruleTargetRef ) ) ) )
            // InternalGame.g:2308:2: ( ( (lv_attributeId_0_0= RULE_ID ) ) ( (lv_amountValueId_1_0= RULE_INT ) )? ( (lv_target_2_0= ruleTargetRef ) ) )
            {
            // InternalGame.g:2308:2: ( ( (lv_attributeId_0_0= RULE_ID ) ) ( (lv_amountValueId_1_0= RULE_INT ) )? ( (lv_target_2_0= ruleTargetRef ) ) )
            // InternalGame.g:2309:3: ( (lv_attributeId_0_0= RULE_ID ) ) ( (lv_amountValueId_1_0= RULE_INT ) )? ( (lv_target_2_0= ruleTargetRef ) )
            {
            // InternalGame.g:2309:3: ( (lv_attributeId_0_0= RULE_ID ) )
            // InternalGame.g:2310:4: (lv_attributeId_0_0= RULE_ID )
            {
            // InternalGame.g:2310:4: (lv_attributeId_0_0= RULE_ID )
            // InternalGame.g:2311:5: lv_attributeId_0_0= RULE_ID
            {
            lv_attributeId_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_attributeId_0_0, grammarAccess.getAttributeInitializerAccess().getAttributeIdIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeInitializerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attributeId",
            						lv_attributeId_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGame.g:2327:3: ( (lv_amountValueId_1_0= RULE_INT ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGame.g:2328:4: (lv_amountValueId_1_0= RULE_INT )
                    {
                    // InternalGame.g:2328:4: (lv_amountValueId_1_0= RULE_INT )
                    // InternalGame.g:2329:5: lv_amountValueId_1_0= RULE_INT
                    {
                    lv_amountValueId_1_0=(Token)match(input,RULE_INT,FOLLOW_8); 

                    					newLeafNode(lv_amountValueId_1_0, grammarAccess.getAttributeInitializerAccess().getAmountValueIdINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeInitializerRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"amountValueId",
                    						lv_amountValueId_1_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalGame.g:2345:3: ( (lv_target_2_0= ruleTargetRef ) )
            // InternalGame.g:2346:4: (lv_target_2_0= ruleTargetRef )
            {
            // InternalGame.g:2346:4: (lv_target_2_0= ruleTargetRef )
            // InternalGame.g:2347:5: lv_target_2_0= ruleTargetRef
            {

            					newCompositeNode(grammarAccess.getAttributeInitializerAccess().getTargetTargetRefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_target_2_0=ruleTargetRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeInitializerRule());
            					}
            					add(
            						current,
            						"target",
            						lv_target_2_0,
            						"master.mdsd.Game.TargetRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeInitializer"


    // $ANTLR start "entryRuleTargetRef"
    // InternalGame.g:2368:1: entryRuleTargetRef returns [EObject current=null] : iv_ruleTargetRef= ruleTargetRef EOF ;
    public final EObject entryRuleTargetRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetRef = null;


        try {
            // InternalGame.g:2368:50: (iv_ruleTargetRef= ruleTargetRef EOF )
            // InternalGame.g:2369:2: iv_ruleTargetRef= ruleTargetRef EOF
            {
             newCompositeNode(grammarAccess.getTargetRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetRef=ruleTargetRef();

            state._fsp--;

             current =iv_ruleTargetRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTargetRef"


    // $ANTLR start "ruleTargetRef"
    // InternalGame.g:2375:1: ruleTargetRef returns [EObject current=null] : ( ( (lv_targetId_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_locationsId_2_0= ruleLocation ) ) (otherlv_3= ',' ( (lv_locationsId_4_0= ruleLocation ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTargetRef() throws RecognitionException {
        EObject current = null;

        Token lv_targetId_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_locationsId_2_0 = null;

        EObject lv_locationsId_4_0 = null;



        	enterRule();

        try {
            // InternalGame.g:2381:2: ( ( ( (lv_targetId_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_locationsId_2_0= ruleLocation ) ) (otherlv_3= ',' ( (lv_locationsId_4_0= ruleLocation ) ) )* otherlv_5= '}' ) )
            // InternalGame.g:2382:2: ( ( (lv_targetId_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_locationsId_2_0= ruleLocation ) ) (otherlv_3= ',' ( (lv_locationsId_4_0= ruleLocation ) ) )* otherlv_5= '}' )
            {
            // InternalGame.g:2382:2: ( ( (lv_targetId_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_locationsId_2_0= ruleLocation ) ) (otherlv_3= ',' ( (lv_locationsId_4_0= ruleLocation ) ) )* otherlv_5= '}' )
            // InternalGame.g:2383:3: ( (lv_targetId_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_locationsId_2_0= ruleLocation ) ) (otherlv_3= ',' ( (lv_locationsId_4_0= ruleLocation ) ) )* otherlv_5= '}'
            {
            // InternalGame.g:2383:3: ( (lv_targetId_0_0= RULE_ID ) )
            // InternalGame.g:2384:4: (lv_targetId_0_0= RULE_ID )
            {
            // InternalGame.g:2384:4: (lv_targetId_0_0= RULE_ID )
            // InternalGame.g:2385:5: lv_targetId_0_0= RULE_ID
            {
            lv_targetId_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_targetId_0_0, grammarAccess.getTargetRefAccess().getTargetIdIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTargetRefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"targetId",
            						lv_targetId_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getTargetRefAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:2405:3: ( (lv_locationsId_2_0= ruleLocation ) )
            // InternalGame.g:2406:4: (lv_locationsId_2_0= ruleLocation )
            {
            // InternalGame.g:2406:4: (lv_locationsId_2_0= ruleLocation )
            // InternalGame.g:2407:5: lv_locationsId_2_0= ruleLocation
            {

            					newCompositeNode(grammarAccess.getTargetRefAccess().getLocationsIdLocationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_29);
            lv_locationsId_2_0=ruleLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTargetRefRule());
            					}
            					add(
            						current,
            						"locationsId",
            						lv_locationsId_2_0,
            						"master.mdsd.Game.Location");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:2424:3: (otherlv_3= ',' ( (lv_locationsId_4_0= ruleLocation ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==39) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGame.g:2425:4: otherlv_3= ',' ( (lv_locationsId_4_0= ruleLocation ) )
            	    {
            	    otherlv_3=(Token)match(input,39,FOLLOW_28); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTargetRefAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalGame.g:2429:4: ( (lv_locationsId_4_0= ruleLocation ) )
            	    // InternalGame.g:2430:5: (lv_locationsId_4_0= ruleLocation )
            	    {
            	    // InternalGame.g:2430:5: (lv_locationsId_4_0= ruleLocation )
            	    // InternalGame.g:2431:6: lv_locationsId_4_0= ruleLocation
            	    {

            	    						newCompositeNode(grammarAccess.getTargetRefAccess().getLocationsIdLocationParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_locationsId_4_0=ruleLocation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTargetRefRule());
            	    						}
            	    						add(
            	    							current,
            	    							"locationsId",
            	    							lv_locationsId_4_0,
            	    							"master.mdsd.Game.Location");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTargetRefAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTargetRef"


    // $ANTLR start "entryRuleLocation"
    // InternalGame.g:2457:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalGame.g:2457:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalGame.g:2458:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalGame.g:2464:1: ruleLocation returns [EObject current=null] : ( ( (lv_locationId_0_0= 'random' ) ) | (otherlv_1= '(' ( (lv_typea_2_0= ruleType ) ) otherlv_3= ',' ( (lv_typeb_4_0= ruleType ) ) otherlv_5= ')' ) | ( ( (lv_charAtt_6_0= ruleAttribute ) ) ( (lv_logicOp_7_0= ruleLogicOperator ) ) ( (lv_typec_8_0= ruleType ) ) ) ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token lv_locationId_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_typea_2_0 = null;

        EObject lv_typeb_4_0 = null;

        EObject lv_charAtt_6_0 = null;

        EObject lv_logicOp_7_0 = null;

        EObject lv_typec_8_0 = null;



        	enterRule();

        try {
            // InternalGame.g:2470:2: ( ( ( (lv_locationId_0_0= 'random' ) ) | (otherlv_1= '(' ( (lv_typea_2_0= ruleType ) ) otherlv_3= ',' ( (lv_typeb_4_0= ruleType ) ) otherlv_5= ')' ) | ( ( (lv_charAtt_6_0= ruleAttribute ) ) ( (lv_logicOp_7_0= ruleLogicOperator ) ) ( (lv_typec_8_0= ruleType ) ) ) ) )
            // InternalGame.g:2471:2: ( ( (lv_locationId_0_0= 'random' ) ) | (otherlv_1= '(' ( (lv_typea_2_0= ruleType ) ) otherlv_3= ',' ( (lv_typeb_4_0= ruleType ) ) otherlv_5= ')' ) | ( ( (lv_charAtt_6_0= ruleAttribute ) ) ( (lv_logicOp_7_0= ruleLogicOperator ) ) ( (lv_typec_8_0= ruleType ) ) ) )
            {
            // InternalGame.g:2471:2: ( ( (lv_locationId_0_0= 'random' ) ) | (otherlv_1= '(' ( (lv_typea_2_0= ruleType ) ) otherlv_3= ',' ( (lv_typeb_4_0= ruleType ) ) otherlv_5= ')' ) | ( ( (lv_charAtt_6_0= ruleAttribute ) ) ( (lv_logicOp_7_0= ruleLogicOperator ) ) ( (lv_typec_8_0= ruleType ) ) ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt32=1;
                }
                break;
            case 23:
                {
                alt32=2;
                }
                break;
            case RULE_ID:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalGame.g:2472:3: ( (lv_locationId_0_0= 'random' ) )
                    {
                    // InternalGame.g:2472:3: ( (lv_locationId_0_0= 'random' ) )
                    // InternalGame.g:2473:4: (lv_locationId_0_0= 'random' )
                    {
                    // InternalGame.g:2473:4: (lv_locationId_0_0= 'random' )
                    // InternalGame.g:2474:5: lv_locationId_0_0= 'random'
                    {
                    lv_locationId_0_0=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_locationId_0_0, grammarAccess.getLocationAccess().getLocationIdRandomKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLocationRule());
                    					}
                    					setWithLastConsumed(current, "locationId", lv_locationId_0_0, "random");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:2487:3: (otherlv_1= '(' ( (lv_typea_2_0= ruleType ) ) otherlv_3= ',' ( (lv_typeb_4_0= ruleType ) ) otherlv_5= ')' )
                    {
                    // InternalGame.g:2487:3: (otherlv_1= '(' ( (lv_typea_2_0= ruleType ) ) otherlv_3= ',' ( (lv_typeb_4_0= ruleType ) ) otherlv_5= ')' )
                    // InternalGame.g:2488:4: otherlv_1= '(' ( (lv_typea_2_0= ruleType ) ) otherlv_3= ',' ( (lv_typeb_4_0= ruleType ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalGame.g:2492:4: ( (lv_typea_2_0= ruleType ) )
                    // InternalGame.g:2493:5: (lv_typea_2_0= ruleType )
                    {
                    // InternalGame.g:2493:5: (lv_typea_2_0= ruleType )
                    // InternalGame.g:2494:6: lv_typea_2_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getLocationAccess().getTypeaTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_typea_2_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocationRule());
                    						}
                    						set(
                    							current,
                    							"typea",
                    							lv_typea_2_0,
                    							"master.mdsd.Game.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,39,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getLocationAccess().getCommaKeyword_1_2());
                    			
                    // InternalGame.g:2515:4: ( (lv_typeb_4_0= ruleType ) )
                    // InternalGame.g:2516:5: (lv_typeb_4_0= ruleType )
                    {
                    // InternalGame.g:2516:5: (lv_typeb_4_0= ruleType )
                    // InternalGame.g:2517:6: lv_typeb_4_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getLocationAccess().getTypebTypeParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_typeb_4_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocationRule());
                    						}
                    						set(
                    							current,
                    							"typeb",
                    							lv_typeb_4_0,
                    							"master.mdsd.Game.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getLocationAccess().getRightParenthesisKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:2540:3: ( ( (lv_charAtt_6_0= ruleAttribute ) ) ( (lv_logicOp_7_0= ruleLogicOperator ) ) ( (lv_typec_8_0= ruleType ) ) )
                    {
                    // InternalGame.g:2540:3: ( ( (lv_charAtt_6_0= ruleAttribute ) ) ( (lv_logicOp_7_0= ruleLogicOperator ) ) ( (lv_typec_8_0= ruleType ) ) )
                    // InternalGame.g:2541:4: ( (lv_charAtt_6_0= ruleAttribute ) ) ( (lv_logicOp_7_0= ruleLogicOperator ) ) ( (lv_typec_8_0= ruleType ) )
                    {
                    // InternalGame.g:2541:4: ( (lv_charAtt_6_0= ruleAttribute ) )
                    // InternalGame.g:2542:5: (lv_charAtt_6_0= ruleAttribute )
                    {
                    // InternalGame.g:2542:5: (lv_charAtt_6_0= ruleAttribute )
                    // InternalGame.g:2543:6: lv_charAtt_6_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getLocationAccess().getCharAttAttributeParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_charAtt_6_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocationRule());
                    						}
                    						add(
                    							current,
                    							"charAtt",
                    							lv_charAtt_6_0,
                    							"master.mdsd.Game.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:2560:4: ( (lv_logicOp_7_0= ruleLogicOperator ) )
                    // InternalGame.g:2561:5: (lv_logicOp_7_0= ruleLogicOperator )
                    {
                    // InternalGame.g:2561:5: (lv_logicOp_7_0= ruleLogicOperator )
                    // InternalGame.g:2562:6: lv_logicOp_7_0= ruleLogicOperator
                    {

                    						newCompositeNode(grammarAccess.getLocationAccess().getLogicOpLogicOperatorParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_logicOp_7_0=ruleLogicOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocationRule());
                    						}
                    						add(
                    							current,
                    							"logicOp",
                    							lv_logicOp_7_0,
                    							"master.mdsd.Game.LogicOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGame.g:2579:4: ( (lv_typec_8_0= ruleType ) )
                    // InternalGame.g:2580:5: (lv_typec_8_0= ruleType )
                    {
                    // InternalGame.g:2580:5: (lv_typec_8_0= ruleType )
                    // InternalGame.g:2581:6: lv_typec_8_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getLocationAccess().getTypecTypeParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_typec_8_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocationRule());
                    						}
                    						add(
                    							current,
                    							"typec",
                    							lv_typec_8_0,
                    							"master.mdsd.Game.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocation"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\126\uffff";
    static final String dfa_2s = "\1\16\1\14\1\uffff\2\4\1\15\1\4\1\14\1\uffff\1\4\1\15\4\4\1\5\1\47\1\5\1\40\1\15\2\4\1\5\1\4\1\32\4\4\1\32\2\5\1\47\1\5\1\40\2\5\1\30\2\5\1\15\2\5\1\4\1\32\1\5\4\4\1\32\1\5\1\15\1\30\1\5\1\47\1\15\1\5\1\40\1\5\1\30\3\5\1\15\6\5\1\15\1\30\1\5\1\47\1\15\1\5\1\40\1\30\1\15\4\5\1\30\1\15";
    static final String dfa_3s = "\1\46\1\14\1\uffff\1\15\1\5\1\46\1\4\1\14\1\uffff\1\50\1\47\2\5\1\50\1\15\2\47\2\43\1\47\4\5\1\47\4\5\1\43\1\5\2\47\2\43\1\47\1\32\1\30\1\5\2\47\1\5\1\43\1\5\1\47\5\5\1\43\1\5\1\47\1\32\1\5\2\47\1\5\1\43\1\32\1\30\1\5\3\47\1\5\1\43\1\5\1\30\1\5\2\47\1\32\1\5\2\47\1\5\1\43\1\30\1\47\1\5\1\30\1\5\1\47\1\30\1\47";
    static final String dfa_4s = "\2\uffff\1\1\5\uffff\1\2\115\uffff";
    static final String dfa_5s = "\126\uffff}>";
    static final String[] dfa_6s = {
            "\4\2\24\uffff\1\1",
            "\1\3",
            "",
            "\1\4\10\uffff\1\5",
            "\1\7\1\6",
            "\1\10\4\2\24\uffff\1\2",
            "\1\7",
            "\1\11",
            "",
            "\1\14\22\uffff\1\13\20\uffff\1\12",
            "\1\16\31\uffff\1\15",
            "\1\20\1\17",
            "\1\22\1\21",
            "\1\25\22\uffff\1\24\20\uffff\1\23",
            "\1\4\10\uffff\1\5",
            "\1\30\24\uffff\1\26\14\uffff\1\27",
            "\1\27",
            "\1\35\24\uffff\1\36\5\uffff\1\31\1\32\1\33\1\34",
            "\1\31\1\32\1\33\1\34",
            "\1\16\31\uffff\1\15",
            "\1\40\1\37",
            "\1\42\1\41",
            "\1\43",
            "\1\45\1\44",
            "\1\46\14\uffff\1\27",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\51\5\uffff\1\31\1\32\1\33\1\34",
            "\1\52",
            "\1\54\24\uffff\1\55\14\uffff\1\53",
            "\1\53",
            "\1\62\24\uffff\1\63\5\uffff\1\56\1\57\1\60\1\61",
            "\1\56\1\57\1\60\1\61",
            "\1\30\41\uffff\1\27",
            "\1\65\22\uffff\1\64\1\uffff\1\66",
            "\1\64",
            "\1\67",
            "\1\70\7\uffff\1\16\14\uffff\1\71\14\uffff\1\15",
            "\1\16\31\uffff\1\15",
            "\1\72",
            "\1\35\32\uffff\1\31\1\32\1\33\1\34",
            "\1\74\1\73",
            "\1\75\14\uffff\1\53",
            "\1\76",
            "\1\100\1\77",
            "\1\100\1\77",
            "\1\100\1\77",
            "\1\100\1\77",
            "\1\101\5\uffff\1\56\1\57\1\60\1\61",
            "\1\102",
            "\1\16\31\uffff\1\15",
            "\1\64\1\uffff\1\103",
            "\1\104",
            "\1\27",
            "\1\16\14\uffff\1\105\14\uffff\1\15",
            "\1\106",
            "\1\31\1\32\1\33\1\34",
            "\1\110\22\uffff\1\107\1\uffff\1\111",
            "\1\107",
            "\1\112",
            "\1\54\41\uffff\1\53",
            "\1\113\7\uffff\1\16\14\uffff\1\114\14\uffff\1\15",
            "\1\16\31\uffff\1\15",
            "\1\115",
            "\1\62\32\uffff\1\56\1\57\1\60\1\61",
            "\1\116",
            "\1\65\22\uffff\1\64",
            "\1\117",
            "\1\70\7\uffff\1\16\31\uffff\1\15",
            "\1\16\31\uffff\1\15",
            "\1\107\1\uffff\1\120",
            "\1\121",
            "\1\53",
            "\1\16\14\uffff\1\122\14\uffff\1\15",
            "\1\123",
            "\1\56\1\57\1\60\1\61",
            "\1\64",
            "\1\16\31\uffff\1\15",
            "\1\124",
            "\1\110\22\uffff\1\107",
            "\1\125",
            "\1\113\7\uffff\1\16\31\uffff\1\15",
            "\1\107",
            "\1\16\31\uffff\1\15"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 106:3: ( (lv_entities_3_0= ruleEntity ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000400003C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000202010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000F8000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000F01000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000003000302010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000003000302000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000800010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000F00000000L});

}