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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGameParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'{'", "'}'", "'Map'", "'Character'", "'Object'", "'Pathfinding'", "'('", "')'", "'if'", "'else'", "'.'", "'self'", "'<'", "'>'", "'<='", "'>='", "'='", "'*'", "'+'", "'-'", "'/'", "'Attack'", "'Ammunition'", "'Attackspeed'", "'Bullet'", "'Initializer'", "','", "'random'"
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:71:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Game' otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entities_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:77:2: ( ( () otherlv_1= 'Game' otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' ) )
            // InternalGame.g:78:2: ( () otherlv_1= 'Game' otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' )
            {
            // InternalGame.g:78:2: ( () otherlv_1= 'Game' otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' )
            // InternalGame.g:79:3: () otherlv_1= 'Game' otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}'
            {
            // InternalGame.g:79:3: ()
            // InternalGame.g:80:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getModelAccess().getModelAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getGameKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalGame.g:94:3: ( (lv_entities_3_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=17)||LA1_0==33||(LA1_0>=36 && LA1_0<=37)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGame.g:95:4: (lv_entities_3_0= ruleEntity )
            	    {
            	    // InternalGame.g:95:4: (lv_entities_3_0= ruleEntity )
            	    // InternalGame.g:96:5: lv_entities_3_0= ruleEntity
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_entities_3_0=ruleEntity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGameMap"
    // InternalGame.g:121:1: entryRuleGameMap returns [EObject current=null] : iv_ruleGameMap= ruleGameMap EOF ;
    public final EObject entryRuleGameMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameMap = null;


        try {
            // InternalGame.g:121:48: (iv_ruleGameMap= ruleGameMap EOF )
            // InternalGame.g:122:2: iv_ruleGameMap= ruleGameMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGameMapRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGameMap=ruleGameMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGameMap; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGameMap"


    // $ANTLR start "ruleGameMap"
    // InternalGame.g:128:1: ruleGameMap returns [EObject current=null] : ( ( (lv_entityId_0_0= 'Map' ) ) otherlv_1= '{' ( (lv_attributeList_2_0= ruleAttribute ) )* otherlv_3= '}' ) ;
    public final EObject ruleGameMap() throws RecognitionException {
        EObject current = null;

        Token lv_entityId_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_attributeList_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:134:2: ( ( ( (lv_entityId_0_0= 'Map' ) ) otherlv_1= '{' ( (lv_attributeList_2_0= ruleAttribute ) )* otherlv_3= '}' ) )
            // InternalGame.g:135:2: ( ( (lv_entityId_0_0= 'Map' ) ) otherlv_1= '{' ( (lv_attributeList_2_0= ruleAttribute ) )* otherlv_3= '}' )
            {
            // InternalGame.g:135:2: ( ( (lv_entityId_0_0= 'Map' ) ) otherlv_1= '{' ( (lv_attributeList_2_0= ruleAttribute ) )* otherlv_3= '}' )
            // InternalGame.g:136:3: ( (lv_entityId_0_0= 'Map' ) ) otherlv_1= '{' ( (lv_attributeList_2_0= ruleAttribute ) )* otherlv_3= '}'
            {
            // InternalGame.g:136:3: ( (lv_entityId_0_0= 'Map' ) )
            // InternalGame.g:137:4: (lv_entityId_0_0= 'Map' )
            {
            // InternalGame.g:137:4: (lv_entityId_0_0= 'Map' )
            // InternalGame.g:138:5: lv_entityId_0_0= 'Map'
            {
            lv_entityId_0_0=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_entityId_0_0, grammarAccess.getGameMapAccess().getEntityIdMapKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGameMapRule());
              					}
              					setWithLastConsumed(current, "entityId", lv_entityId_0_0, "Map");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGameMapAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGame.g:154:3: ( (lv_attributeList_2_0= ruleAttribute ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGame.g:155:4: (lv_attributeList_2_0= ruleAttribute )
            	    {
            	    // InternalGame.g:155:4: (lv_attributeList_2_0= ruleAttribute )
            	    // InternalGame.g:156:5: lv_attributeList_2_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGameMapAccess().getAttributeListAttributeParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_attributeList_2_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGameMapRule());
            	      					}
            	      					add(
            	      						current,
            	      						"attributeList",
            	      						lv_attributeList_2_0,
            	      						"master.mdsd.Game.Attribute");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGameMapAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGameMap"


    // $ANTLR start "entryRuleAttribute"
    // InternalGame.g:181:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalGame.g:181:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalGame.g:182:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:188:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_attributename_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_attributename_1_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:194:2: ( ( () ( (lv_attributename_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) ) )
            // InternalGame.g:195:2: ( () ( (lv_attributename_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalGame.g:195:2: ( () ( (lv_attributename_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) )
            // InternalGame.g:196:3: () ( (lv_attributename_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) )
            {
            // InternalGame.g:196:3: ()
            // InternalGame.g:197:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAttributeAccess().getAttributeAction_0(),
              					current);
              			
            }

            }

            // InternalGame.g:203:3: ( (lv_attributename_1_0= RULE_ID ) )
            // InternalGame.g:204:4: (lv_attributename_1_0= RULE_ID )
            {
            // InternalGame.g:204:4: (lv_attributename_1_0= RULE_ID )
            // InternalGame.g:205:5: lv_attributename_1_0= RULE_ID
            {
            lv_attributename_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_attributename_1_0, grammarAccess.getAttributeAccess().getAttributenameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            // InternalGame.g:221:3: ( (lv_type_2_0= ruleType ) )
            // InternalGame.g:222:4: (lv_type_2_0= ruleType )
            {
            // InternalGame.g:222:4: (lv_type_2_0= ruleType )
            // InternalGame.g:223:5: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"master.mdsd.Game.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEntity"
    // InternalGame.g:244:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalGame.g:244:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalGame.g:245:2: iv_ruleEntity= ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:251:1: ruleEntity returns [EObject current=null] : (this_DynamicEntity_0= ruleDynamicEntity | this_StaticEntity_1= ruleStaticEntity ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_DynamicEntity_0 = null;

        EObject this_StaticEntity_1 = null;



        	enterRule();

        try {
            // InternalGame.g:257:2: ( (this_DynamicEntity_0= ruleDynamicEntity | this_StaticEntity_1= ruleStaticEntity ) )
            // InternalGame.g:258:2: (this_DynamicEntity_0= ruleDynamicEntity | this_StaticEntity_1= ruleStaticEntity )
            {
            // InternalGame.g:258:2: (this_DynamicEntity_0= ruleDynamicEntity | this_StaticEntity_1= ruleStaticEntity )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=15 && LA3_0<=17)||LA3_0==33||LA3_0==36) ) {
                alt3=1;
            }
            else if ( (LA3_0==14||LA3_0==37) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGame.g:259:3: this_DynamicEntity_0= ruleDynamicEntity
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEntityAccess().getDynamicEntityParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DynamicEntity_0=ruleDynamicEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DynamicEntity_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGame.g:268:3: this_StaticEntity_1= ruleStaticEntity
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEntityAccess().getStaticEntityParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StaticEntity_1=ruleStaticEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StaticEntity_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleDynamicEntity"
    // InternalGame.g:280:1: entryRuleDynamicEntity returns [EObject current=null] : iv_ruleDynamicEntity= ruleDynamicEntity EOF ;
    public final EObject entryRuleDynamicEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicEntity = null;


        try {
            // InternalGame.g:280:54: (iv_ruleDynamicEntity= ruleDynamicEntity EOF )
            // InternalGame.g:281:2: iv_ruleDynamicEntity= ruleDynamicEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDynamicEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDynamicEntity=ruleDynamicEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDynamicEntity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:287:1: ruleDynamicEntity returns [EObject current=null] : (this_Character_0= ruleCharacter | this_Object_1= ruleObject | this_Behaviour_2= ruleBehaviour ) ;
    public final EObject ruleDynamicEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Character_0 = null;

        EObject this_Object_1 = null;

        EObject this_Behaviour_2 = null;



        	enterRule();

        try {
            // InternalGame.g:293:2: ( (this_Character_0= ruleCharacter | this_Object_1= ruleObject | this_Behaviour_2= ruleBehaviour ) )
            // InternalGame.g:294:2: (this_Character_0= ruleCharacter | this_Object_1= ruleObject | this_Behaviour_2= ruleBehaviour )
            {
            // InternalGame.g:294:2: (this_Character_0= ruleCharacter | this_Object_1= ruleObject | this_Behaviour_2= ruleBehaviour )
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
            case 33:
            case 36:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGame.g:295:3: this_Character_0= ruleCharacter
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDynamicEntityAccess().getCharacterParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Character_0=ruleCharacter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Character_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGame.g:304:3: this_Object_1= ruleObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDynamicEntityAccess().getObjectParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Object_1=ruleObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Object_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGame.g:313:3: this_Behaviour_2= ruleBehaviour
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDynamicEntityAccess().getBehaviourParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Behaviour_2=ruleBehaviour();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Behaviour_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDynamicEntity"


    // $ANTLR start "entryRuleStaticEntity"
    // InternalGame.g:325:1: entryRuleStaticEntity returns [EObject current=null] : iv_ruleStaticEntity= ruleStaticEntity EOF ;
    public final EObject entryRuleStaticEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticEntity = null;


        try {
            // InternalGame.g:325:53: (iv_ruleStaticEntity= ruleStaticEntity EOF )
            // InternalGame.g:326:2: iv_ruleStaticEntity= ruleStaticEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStaticEntity=ruleStaticEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticEntity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:332:1: ruleStaticEntity returns [EObject current=null] : (this_GameMap_0= ruleGameMap | this_Initializer_1= ruleInitializer ) ;
    public final EObject ruleStaticEntity() throws RecognitionException {
        EObject current = null;

        EObject this_GameMap_0 = null;

        EObject this_Initializer_1 = null;



        	enterRule();

        try {
            // InternalGame.g:338:2: ( (this_GameMap_0= ruleGameMap | this_Initializer_1= ruleInitializer ) )
            // InternalGame.g:339:2: (this_GameMap_0= ruleGameMap | this_Initializer_1= ruleInitializer )
            {
            // InternalGame.g:339:2: (this_GameMap_0= ruleGameMap | this_Initializer_1= ruleInitializer )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==37) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGame.g:340:3: this_GameMap_0= ruleGameMap
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStaticEntityAccess().getGameMapParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GameMap_0=ruleGameMap();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GameMap_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGame.g:349:3: this_Initializer_1= ruleInitializer
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStaticEntityAccess().getInitializerParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Initializer_1=ruleInitializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Initializer_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStaticEntity"


    // $ANTLR start "entryRuleCharacter"
    // InternalGame.g:361:1: entryRuleCharacter returns [EObject current=null] : iv_ruleCharacter= ruleCharacter EOF ;
    public final EObject entryRuleCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacter = null;


        try {
            // InternalGame.g:361:50: (iv_ruleCharacter= ruleCharacter EOF )
            // InternalGame.g:362:2: iv_ruleCharacter= ruleCharacter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharacterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCharacter=ruleCharacter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCharacter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:368:1: ruleCharacter returns [EObject current=null] : ( ( (lv_entityid_0_0= 'Character' ) ) ( (lv_charId_1_0= ruleCharType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_att_4_0= ruleAttribute ) )* otherlv_5= '}' ) ;
    public final EObject ruleCharacter() throws RecognitionException {
        EObject current = null;

        Token lv_entityid_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_charId_1_0 = null;

        EObject lv_att_4_0 = null;



        	enterRule();

        try {
            // InternalGame.g:374:2: ( ( ( (lv_entityid_0_0= 'Character' ) ) ( (lv_charId_1_0= ruleCharType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_att_4_0= ruleAttribute ) )* otherlv_5= '}' ) )
            // InternalGame.g:375:2: ( ( (lv_entityid_0_0= 'Character' ) ) ( (lv_charId_1_0= ruleCharType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_att_4_0= ruleAttribute ) )* otherlv_5= '}' )
            {
            // InternalGame.g:375:2: ( ( (lv_entityid_0_0= 'Character' ) ) ( (lv_charId_1_0= ruleCharType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_att_4_0= ruleAttribute ) )* otherlv_5= '}' )
            // InternalGame.g:376:3: ( (lv_entityid_0_0= 'Character' ) ) ( (lv_charId_1_0= ruleCharType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_att_4_0= ruleAttribute ) )* otherlv_5= '}'
            {
            // InternalGame.g:376:3: ( (lv_entityid_0_0= 'Character' ) )
            // InternalGame.g:377:4: (lv_entityid_0_0= 'Character' )
            {
            // InternalGame.g:377:4: (lv_entityid_0_0= 'Character' )
            // InternalGame.g:378:5: lv_entityid_0_0= 'Character'
            {
            lv_entityid_0_0=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_entityid_0_0, grammarAccess.getCharacterAccess().getEntityidCharacterKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCharacterRule());
              					}
              					setWithLastConsumed(current, "entityid", lv_entityid_0_0, "Character");
              				
            }

            }


            }

            // InternalGame.g:390:3: ( (lv_charId_1_0= ruleCharType ) )
            // InternalGame.g:391:4: (lv_charId_1_0= ruleCharType )
            {
            // InternalGame.g:391:4: (lv_charId_1_0= ruleCharType )
            // InternalGame.g:392:5: lv_charId_1_0= ruleCharType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCharacterAccess().getCharIdCharTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_charId_1_0=ruleCharType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCharacterRule());
              					}
              					set(
              						current,
              						"charId",
              						lv_charId_1_0,
              						"master.mdsd.Game.CharType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGame.g:409:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalGame.g:410:4: (lv_name_2_0= RULE_ID )
            {
            // InternalGame.g:410:4: (lv_name_2_0= RULE_ID )
            // InternalGame.g:411:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCharacterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCharacterAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalGame.g:431:3: ( (lv_att_4_0= ruleAttribute ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGame.g:432:4: (lv_att_4_0= ruleAttribute )
            	    {
            	    // InternalGame.g:432:4: (lv_att_4_0= ruleAttribute )
            	    // InternalGame.g:433:5: lv_att_4_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCharacterAccess().getAttAttributeParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_att_4_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCharacterRule());
            	      					}
            	      					add(
            	      						current,
            	      						"att",
            	      						lv_att_4_0,
            	      						"master.mdsd.Game.Attribute");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCharacterAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCharacter"


    // $ANTLR start "entryRuleType"
    // InternalGame.g:458:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalGame.g:458:45: (iv_ruleType= ruleType EOF )
            // InternalGame.g:459:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:465:1: ruleType returns [EObject current=null] : ( ( (lv_valueId_0_0= ruleINTORDEC ) ) | ( (lv_valueId_1_0= RULE_ID ) ) | ( (lv_valueIdVec_2_0= ruleVECTOR ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_valueId_1_0=null;
        AntlrDatatypeRuleToken lv_valueId_0_0 = null;

        EObject lv_valueIdVec_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:471:2: ( ( ( (lv_valueId_0_0= ruleINTORDEC ) ) | ( (lv_valueId_1_0= RULE_ID ) ) | ( (lv_valueIdVec_2_0= ruleVECTOR ) ) ) )
            // InternalGame.g:472:2: ( ( (lv_valueId_0_0= ruleINTORDEC ) ) | ( (lv_valueId_1_0= RULE_ID ) ) | ( (lv_valueIdVec_2_0= ruleVECTOR ) ) )
            {
            // InternalGame.g:472:2: ( ( (lv_valueId_0_0= ruleINTORDEC ) ) | ( (lv_valueId_1_0= RULE_ID ) ) | ( (lv_valueIdVec_2_0= ruleVECTOR ) ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==RULE_INT) ) {
                        int LA7_6 = input.LA(4);

                        if ( (LA7_6==EOF||LA7_6==RULE_ID||LA7_6==13||(LA7_6>=19 && LA7_6<=20)||(LA7_6>=34 && LA7_6<=36)||LA7_6==38) ) {
                            alt7=1;
                        }
                        else if ( (LA7_6==RULE_INT) ) {
                            alt7=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 13:
                case 19:
                case 20:
                case 34:
                case 35:
                case 36:
                case 38:
                    {
                    alt7=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt7=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGame.g:473:3: ( (lv_valueId_0_0= ruleINTORDEC ) )
                    {
                    // InternalGame.g:473:3: ( (lv_valueId_0_0= ruleINTORDEC ) )
                    // InternalGame.g:474:4: (lv_valueId_0_0= ruleINTORDEC )
                    {
                    // InternalGame.g:474:4: (lv_valueId_0_0= ruleINTORDEC )
                    // InternalGame.g:475:5: lv_valueId_0_0= ruleINTORDEC
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeAccess().getValueIdINTORDECParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_valueId_0_0=ruleINTORDEC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // InternalGame.g:493:3: ( (lv_valueId_1_0= RULE_ID ) )
                    {
                    // InternalGame.g:493:3: ( (lv_valueId_1_0= RULE_ID ) )
                    // InternalGame.g:494:4: (lv_valueId_1_0= RULE_ID )
                    {
                    // InternalGame.g:494:4: (lv_valueId_1_0= RULE_ID )
                    // InternalGame.g:495:5: lv_valueId_1_0= RULE_ID
                    {
                    lv_valueId_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_valueId_1_0, grammarAccess.getTypeAccess().getValueIdIDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 3 :
                    // InternalGame.g:512:3: ( (lv_valueIdVec_2_0= ruleVECTOR ) )
                    {
                    // InternalGame.g:512:3: ( (lv_valueIdVec_2_0= ruleVECTOR ) )
                    // InternalGame.g:513:4: (lv_valueIdVec_2_0= ruleVECTOR )
                    {
                    // InternalGame.g:513:4: (lv_valueIdVec_2_0= ruleVECTOR )
                    // InternalGame.g:514:5: lv_valueIdVec_2_0= ruleVECTOR
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeAccess().getValueIdVecVECTORParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_valueIdVec_2_0=ruleVECTOR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeRule());
                      					}
                      					set(
                      						current,
                      						"valueIdVec",
                      						lv_valueIdVec_2_0,
                      						"master.mdsd.Game.VECTOR");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleVECTOR"
    // InternalGame.g:535:1: entryRuleVECTOR returns [EObject current=null] : iv_ruleVECTOR= ruleVECTOR EOF ;
    public final EObject entryRuleVECTOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVECTOR = null;


        try {
            // InternalGame.g:535:47: (iv_ruleVECTOR= ruleVECTOR EOF )
            // InternalGame.g:536:2: iv_ruleVECTOR= ruleVECTOR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVECTORRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVECTOR=ruleVECTOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVECTOR; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:542:1: ruleVECTOR returns [EObject current=null] : ( ( (lv_xVal_0_0= ruleINTORDEC ) ) ( (lv_yVal_1_0= ruleINTORDEC ) ) ) ;
    public final EObject ruleVECTOR() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_xVal_0_0 = null;

        AntlrDatatypeRuleToken lv_yVal_1_0 = null;



        	enterRule();

        try {
            // InternalGame.g:548:2: ( ( ( (lv_xVal_0_0= ruleINTORDEC ) ) ( (lv_yVal_1_0= ruleINTORDEC ) ) ) )
            // InternalGame.g:549:2: ( ( (lv_xVal_0_0= ruleINTORDEC ) ) ( (lv_yVal_1_0= ruleINTORDEC ) ) )
            {
            // InternalGame.g:549:2: ( ( (lv_xVal_0_0= ruleINTORDEC ) ) ( (lv_yVal_1_0= ruleINTORDEC ) ) )
            // InternalGame.g:550:3: ( (lv_xVal_0_0= ruleINTORDEC ) ) ( (lv_yVal_1_0= ruleINTORDEC ) )
            {
            // InternalGame.g:550:3: ( (lv_xVal_0_0= ruleINTORDEC ) )
            // InternalGame.g:551:4: (lv_xVal_0_0= ruleINTORDEC )
            {
            // InternalGame.g:551:4: (lv_xVal_0_0= ruleINTORDEC )
            // InternalGame.g:552:5: lv_xVal_0_0= ruleINTORDEC
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVECTORAccess().getXValINTORDECParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_xVal_0_0=ruleINTORDEC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVECTORRule());
              					}
              					set(
              						current,
              						"xVal",
              						lv_xVal_0_0,
              						"master.mdsd.Game.INTORDEC");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGame.g:569:3: ( (lv_yVal_1_0= ruleINTORDEC ) )
            // InternalGame.g:570:4: (lv_yVal_1_0= ruleINTORDEC )
            {
            // InternalGame.g:570:4: (lv_yVal_1_0= ruleINTORDEC )
            // InternalGame.g:571:5: lv_yVal_1_0= ruleINTORDEC
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVECTORAccess().getYValINTORDECParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_yVal_1_0=ruleINTORDEC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVECTORRule());
              					}
              					set(
              						current,
              						"yVal",
              						lv_yVal_1_0,
              						"master.mdsd.Game.INTORDEC");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVECTOR"


    // $ANTLR start "entryRuleINTORDEC"
    // InternalGame.g:592:1: entryRuleINTORDEC returns [String current=null] : iv_ruleINTORDEC= ruleINTORDEC EOF ;
    public final String entryRuleINTORDEC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTORDEC = null;


        try {
            // InternalGame.g:592:48: (iv_ruleINTORDEC= ruleINTORDEC EOF )
            // InternalGame.g:593:2: iv_ruleINTORDEC= ruleINTORDEC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINTORDECRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleINTORDEC=ruleINTORDEC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINTORDEC.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:599:1: ruleINTORDEC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DECIMAL_1= ruleDECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTORDEC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        AntlrDatatypeRuleToken this_DECIMAL_1 = null;



        	enterRule();

        try {
            // InternalGame.g:605:2: ( (this_INT_0= RULE_INT | this_DECIMAL_1= ruleDECIMAL ) )
            // InternalGame.g:606:2: (this_INT_0= RULE_INT | this_DECIMAL_1= ruleDECIMAL )
            {
            // InternalGame.g:606:2: (this_INT_0= RULE_INT | this_DECIMAL_1= ruleDECIMAL )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==22) ) {
                    alt8=2;
                }
                else if ( (LA8_1==EOF||(LA8_1>=RULE_ID && LA8_1<=RULE_INT)||LA8_1==13||(LA8_1>=18 && LA8_1<=20)||(LA8_1>=24 && LA8_1<=32)||(LA8_1>=34 && LA8_1<=36)||LA8_1==38) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGame.g:607:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_0, grammarAccess.getINTORDECAccess().getINTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGame.g:615:3: this_DECIMAL_1= ruleDECIMAL
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getINTORDECAccess().getDECIMALParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DECIMAL_1=ruleDECIMAL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DECIMAL_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleINTORDEC"


    // $ANTLR start "entryRuleCharType"
    // InternalGame.g:629:1: entryRuleCharType returns [EObject current=null] : iv_ruleCharType= ruleCharType EOF ;
    public final EObject entryRuleCharType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharType = null;


        try {
            // InternalGame.g:629:49: (iv_ruleCharType= ruleCharType EOF )
            // InternalGame.g:630:2: iv_ruleCharType= ruleCharType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCharType=ruleCharType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCharType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:636:1: ruleCharType returns [EObject current=null] : ( (lv_charTypeId_0_0= RULE_ID ) ) ;
    public final EObject ruleCharType() throws RecognitionException {
        EObject current = null;

        Token lv_charTypeId_0_0=null;


        	enterRule();

        try {
            // InternalGame.g:642:2: ( ( (lv_charTypeId_0_0= RULE_ID ) ) )
            // InternalGame.g:643:2: ( (lv_charTypeId_0_0= RULE_ID ) )
            {
            // InternalGame.g:643:2: ( (lv_charTypeId_0_0= RULE_ID ) )
            // InternalGame.g:644:3: (lv_charTypeId_0_0= RULE_ID )
            {
            // InternalGame.g:644:3: (lv_charTypeId_0_0= RULE_ID )
            // InternalGame.g:645:4: lv_charTypeId_0_0= RULE_ID
            {
            lv_charTypeId_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_charTypeId_0_0, grammarAccess.getCharTypeAccess().getCharTypeIdIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getCharTypeRule());
              				}
              				setWithLastConsumed(
              					current,
              					"charTypeId",
              					lv_charTypeId_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCharType"


    // $ANTLR start "entryRuleObject"
    // InternalGame.g:664:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalGame.g:664:47: (iv_ruleObject= ruleObject EOF )
            // InternalGame.g:665:2: iv_ruleObject= ruleObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:671:1: ruleObject returns [EObject current=null] : ( ( (lv_entityid_0_0= 'Object' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_att_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_entityid_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_att_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:677:2: ( ( ( (lv_entityid_0_0= 'Object' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_att_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // InternalGame.g:678:2: ( ( (lv_entityid_0_0= 'Object' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_att_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // InternalGame.g:678:2: ( ( (lv_entityid_0_0= 'Object' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_att_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // InternalGame.g:679:3: ( (lv_entityid_0_0= 'Object' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_att_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            // InternalGame.g:679:3: ( (lv_entityid_0_0= 'Object' ) )
            // InternalGame.g:680:4: (lv_entityid_0_0= 'Object' )
            {
            // InternalGame.g:680:4: (lv_entityid_0_0= 'Object' )
            // InternalGame.g:681:5: lv_entityid_0_0= 'Object'
            {
            lv_entityid_0_0=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_entityid_0_0, grammarAccess.getObjectAccess().getEntityidObjectKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getObjectRule());
              					}
              					setWithLastConsumed(current, "entityid", lv_entityid_0_0, "Object");
              				
            }

            }


            }

            // InternalGame.g:693:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:694:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:694:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:695:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getObjectRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalGame.g:715:3: ( (lv_att_3_0= ruleAttribute ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGame.g:716:4: (lv_att_3_0= ruleAttribute )
            	    {
            	    // InternalGame.g:716:4: (lv_att_3_0= ruleAttribute )
            	    // InternalGame.g:717:5: lv_att_3_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getObjectAccess().getAttAttributeParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_att_3_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getObjectRule());
            	      					}
            	      					add(
            	      						current,
            	      						"att",
            	      						lv_att_3_0,
            	      						"master.mdsd.Game.Attribute");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleBehaviour"
    // InternalGame.g:742:1: entryRuleBehaviour returns [EObject current=null] : iv_ruleBehaviour= ruleBehaviour EOF ;
    public final EObject entryRuleBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviour = null;


        try {
            // InternalGame.g:742:50: (iv_ruleBehaviour= ruleBehaviour EOF )
            // InternalGame.g:743:2: iv_ruleBehaviour= ruleBehaviour EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBehaviourRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBehaviour=ruleBehaviour();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBehaviour; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:749:1: ruleBehaviour returns [EObject current=null] : (this_Pathfinding_0= rulePathfinding | this_Attack_1= ruleAttack | this_Bullet_2= ruleBullet ) ;
    public final EObject ruleBehaviour() throws RecognitionException {
        EObject current = null;

        EObject this_Pathfinding_0 = null;

        EObject this_Attack_1 = null;

        EObject this_Bullet_2 = null;



        	enterRule();

        try {
            // InternalGame.g:755:2: ( (this_Pathfinding_0= rulePathfinding | this_Attack_1= ruleAttack | this_Bullet_2= ruleBullet ) )
            // InternalGame.g:756:2: (this_Pathfinding_0= rulePathfinding | this_Attack_1= ruleAttack | this_Bullet_2= ruleBullet )
            {
            // InternalGame.g:756:2: (this_Pathfinding_0= rulePathfinding | this_Attack_1= ruleAttack | this_Bullet_2= ruleBullet )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt10=1;
                }
                break;
            case 33:
                {
                alt10=2;
                }
                break;
            case 36:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalGame.g:757:3: this_Pathfinding_0= rulePathfinding
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBehaviourAccess().getPathfindingParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Pathfinding_0=rulePathfinding();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Pathfinding_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGame.g:766:3: this_Attack_1= ruleAttack
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBehaviourAccess().getAttackParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Attack_1=ruleAttack();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Attack_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGame.g:775:3: this_Bullet_2= ruleBullet
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBehaviourAccess().getBulletParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Bullet_2=ruleBullet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Bullet_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBehaviour"


    // $ANTLR start "entryRulePathfinding"
    // InternalGame.g:787:1: entryRulePathfinding returns [EObject current=null] : iv_rulePathfinding= rulePathfinding EOF ;
    public final EObject entryRulePathfinding() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathfinding = null;


        try {
            // InternalGame.g:787:52: (iv_rulePathfinding= rulePathfinding EOF )
            // InternalGame.g:788:2: iv_rulePathfinding= rulePathfinding EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathfindingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePathfinding=rulePathfinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathfinding; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:794:1: rulePathfinding returns [EObject current=null] : ( ( (lv_entityid_0_0= 'Pathfinding' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attPathfinding_3_0= ruleAttribute ) )* ( (lv_conditions_4_0= ruleCondition ) )* otherlv_5= '}' ) ;
    public final EObject rulePathfinding() throws RecognitionException {
        EObject current = null;

        Token lv_entityid_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_attPathfinding_3_0 = null;

        EObject lv_conditions_4_0 = null;



        	enterRule();

        try {
            // InternalGame.g:800:2: ( ( ( (lv_entityid_0_0= 'Pathfinding' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attPathfinding_3_0= ruleAttribute ) )* ( (lv_conditions_4_0= ruleCondition ) )* otherlv_5= '}' ) )
            // InternalGame.g:801:2: ( ( (lv_entityid_0_0= 'Pathfinding' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attPathfinding_3_0= ruleAttribute ) )* ( (lv_conditions_4_0= ruleCondition ) )* otherlv_5= '}' )
            {
            // InternalGame.g:801:2: ( ( (lv_entityid_0_0= 'Pathfinding' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attPathfinding_3_0= ruleAttribute ) )* ( (lv_conditions_4_0= ruleCondition ) )* otherlv_5= '}' )
            // InternalGame.g:802:3: ( (lv_entityid_0_0= 'Pathfinding' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attPathfinding_3_0= ruleAttribute ) )* ( (lv_conditions_4_0= ruleCondition ) )* otherlv_5= '}'
            {
            // InternalGame.g:802:3: ( (lv_entityid_0_0= 'Pathfinding' ) )
            // InternalGame.g:803:4: (lv_entityid_0_0= 'Pathfinding' )
            {
            // InternalGame.g:803:4: (lv_entityid_0_0= 'Pathfinding' )
            // InternalGame.g:804:5: lv_entityid_0_0= 'Pathfinding'
            {
            lv_entityid_0_0=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_entityid_0_0, grammarAccess.getPathfindingAccess().getEntityidPathfindingKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPathfindingRule());
              					}
              					setWithLastConsumed(current, "entityid", lv_entityid_0_0, "Pathfinding");
              				
            }

            }


            }

            // InternalGame.g:816:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:817:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:817:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:818:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPathfindingAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPathfindingRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPathfindingAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalGame.g:838:3: ( (lv_attPathfinding_3_0= ruleAttribute ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGame.g:839:4: (lv_attPathfinding_3_0= ruleAttribute )
            	    {
            	    // InternalGame.g:839:4: (lv_attPathfinding_3_0= ruleAttribute )
            	    // InternalGame.g:840:5: lv_attPathfinding_3_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPathfindingAccess().getAttPathfindingAttributeParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_attPathfinding_3_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPathfindingRule());
            	      					}
            	      					add(
            	      						current,
            	      						"attPathfinding",
            	      						lv_attPathfinding_3_0,
            	      						"master.mdsd.Game.Attribute");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalGame.g:857:3: ( (lv_conditions_4_0= ruleCondition ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGame.g:858:4: (lv_conditions_4_0= ruleCondition )
            	    {
            	    // InternalGame.g:858:4: (lv_conditions_4_0= ruleCondition )
            	    // InternalGame.g:859:5: lv_conditions_4_0= ruleCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPathfindingAccess().getConditionsConditionParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_conditions_4_0=ruleCondition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPathfindingRule());
            	      					}
            	      					add(
            	      						current,
            	      						"conditions",
            	      						lv_conditions_4_0,
            	      						"master.mdsd.Game.Condition");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPathfindingAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePathfinding"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalGame.g:884:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalGame.g:884:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalGame.g:885:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalGame.g:891:1: ruleBooleanExpression returns [EObject current=null] : ( ( (lv_attributeRefLeft_0_0= ruleCharacterAttr ) )? ( (lv_leftEx_1_0= ruleExpression ) )? ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_attributeRefRight_3_0= ruleCharacterAttr ) )? ( ( (lv_op_4_0= ruleLogicOperator ) )? ( (lv_rightEx_5_0= ruleExpression ) ) )? ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_attributeRefLeft_0_0 = null;

        EObject lv_leftEx_1_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_attributeRefRight_3_0 = null;

        EObject lv_op_4_0 = null;

        EObject lv_rightEx_5_0 = null;



        	enterRule();

        try {
            // InternalGame.g:897:2: ( ( ( (lv_attributeRefLeft_0_0= ruleCharacterAttr ) )? ( (lv_leftEx_1_0= ruleExpression ) )? ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_attributeRefRight_3_0= ruleCharacterAttr ) )? ( ( (lv_op_4_0= ruleLogicOperator ) )? ( (lv_rightEx_5_0= ruleExpression ) ) )? ) )
            // InternalGame.g:898:2: ( ( (lv_attributeRefLeft_0_0= ruleCharacterAttr ) )? ( (lv_leftEx_1_0= ruleExpression ) )? ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_attributeRefRight_3_0= ruleCharacterAttr ) )? ( ( (lv_op_4_0= ruleLogicOperator ) )? ( (lv_rightEx_5_0= ruleExpression ) ) )? )
            {
            // InternalGame.g:898:2: ( ( (lv_attributeRefLeft_0_0= ruleCharacterAttr ) )? ( (lv_leftEx_1_0= ruleExpression ) )? ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_attributeRefRight_3_0= ruleCharacterAttr ) )? ( ( (lv_op_4_0= ruleLogicOperator ) )? ( (lv_rightEx_5_0= ruleExpression ) ) )? )
            // InternalGame.g:899:3: ( (lv_attributeRefLeft_0_0= ruleCharacterAttr ) )? ( (lv_leftEx_1_0= ruleExpression ) )? ( (lv_operator_2_0= ruleCompOperator ) ) ( (lv_attributeRefRight_3_0= ruleCharacterAttr ) )? ( ( (lv_op_4_0= ruleLogicOperator ) )? ( (lv_rightEx_5_0= ruleExpression ) ) )?
            {
            // InternalGame.g:899:3: ( (lv_attributeRefLeft_0_0= ruleCharacterAttr ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGame.g:900:4: (lv_attributeRefLeft_0_0= ruleCharacterAttr )
                    {
                    // InternalGame.g:900:4: (lv_attributeRefLeft_0_0= ruleCharacterAttr )
                    // InternalGame.g:901:5: lv_attributeRefLeft_0_0= ruleCharacterAttr
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBooleanExpressionAccess().getAttributeRefLeftCharacterAttrParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_11);
                    lv_attributeRefLeft_0_0=ruleCharacterAttr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
                      					}
                      					set(
                      						current,
                      						"attributeRefLeft",
                      						lv_attributeRefLeft_0_0,
                      						"master.mdsd.Game.CharacterAttr");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGame.g:918:3: ( (lv_leftEx_1_0= ruleExpression ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT||LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGame.g:919:4: (lv_leftEx_1_0= ruleExpression )
                    {
                    // InternalGame.g:919:4: (lv_leftEx_1_0= ruleExpression )
                    // InternalGame.g:920:5: lv_leftEx_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBooleanExpressionAccess().getLeftExExpressionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_11);
                    lv_leftEx_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
                      					}
                      					set(
                      						current,
                      						"leftEx",
                      						lv_leftEx_1_0,
                      						"master.mdsd.Game.Expression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGame.g:937:3: ( (lv_operator_2_0= ruleCompOperator ) )
            // InternalGame.g:938:4: (lv_operator_2_0= ruleCompOperator )
            {
            // InternalGame.g:938:4: (lv_operator_2_0= ruleCompOperator )
            // InternalGame.g:939:5: lv_operator_2_0= ruleCompOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBooleanExpressionAccess().getOperatorCompOperatorParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_operator_2_0=ruleCompOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_2_0,
              						"master.mdsd.Game.CompOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGame.g:956:3: ( (lv_attributeRefRight_3_0= ruleCharacterAttr ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID||LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGame.g:957:4: (lv_attributeRefRight_3_0= ruleCharacterAttr )
                    {
                    // InternalGame.g:957:4: (lv_attributeRefRight_3_0= ruleCharacterAttr )
                    // InternalGame.g:958:5: lv_attributeRefRight_3_0= ruleCharacterAttr
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBooleanExpressionAccess().getAttributeRefRightCharacterAttrParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_13);
                    lv_attributeRefRight_3_0=ruleCharacterAttr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
                      					}
                      					set(
                      						current,
                      						"attributeRefRight",
                      						lv_attributeRefRight_3_0,
                      						"master.mdsd.Game.CharacterAttr");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalGame.g:975:3: ( ( (lv_op_4_0= ruleLogicOperator ) )? ( (lv_rightEx_5_0= ruleExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT||LA17_0==18||(LA17_0>=29 && LA17_0<=32)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGame.g:976:4: ( (lv_op_4_0= ruleLogicOperator ) )? ( (lv_rightEx_5_0= ruleExpression ) )
                    {
                    // InternalGame.g:976:4: ( (lv_op_4_0= ruleLogicOperator ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=29 && LA16_0<=32)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalGame.g:977:5: (lv_op_4_0= ruleLogicOperator )
                            {
                            // InternalGame.g:977:5: (lv_op_4_0= ruleLogicOperator )
                            // InternalGame.g:978:6: lv_op_4_0= ruleLogicOperator
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getBooleanExpressionAccess().getOpLogicOperatorParserRuleCall_4_0_0());
                              					
                            }
                            pushFollow(FOLLOW_14);
                            lv_op_4_0=ruleLogicOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
                              						}
                              						set(
                              							current,
                              							"op",
                              							lv_op_4_0,
                              							"master.mdsd.Game.LogicOperator");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalGame.g:995:4: ( (lv_rightEx_5_0= ruleExpression ) )
                    // InternalGame.g:996:5: (lv_rightEx_5_0= ruleExpression )
                    {
                    // InternalGame.g:996:5: (lv_rightEx_5_0= ruleExpression )
                    // InternalGame.g:997:6: lv_rightEx_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBooleanExpressionAccess().getRightExExpressionParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rightEx_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBooleanExpressionRule());
                      						}
                      						set(
                      							current,
                      							"rightEx",
                      							lv_rightEx_5_0,
                      							"master.mdsd.Game.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleExpression"
    // InternalGame.g:1019:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalGame.g:1019:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalGame.g:1020:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalGame.g:1026:1: ruleExpression returns [EObject current=null] : ( ( (lv_tm_0_0= ruleTerminalExpression ) ) ( () ( (lv_op_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_tm_0_0 = null;

        EObject lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1032:2: ( ( ( (lv_tm_0_0= ruleTerminalExpression ) ) ( () ( (lv_op_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* ) )
            // InternalGame.g:1033:2: ( ( (lv_tm_0_0= ruleTerminalExpression ) ) ( () ( (lv_op_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            {
            // InternalGame.g:1033:2: ( ( (lv_tm_0_0= ruleTerminalExpression ) ) ( () ( (lv_op_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )* )
            // InternalGame.g:1034:3: ( (lv_tm_0_0= ruleTerminalExpression ) ) ( () ( (lv_op_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
            {
            // InternalGame.g:1034:3: ( (lv_tm_0_0= ruleTerminalExpression ) )
            // InternalGame.g:1035:4: (lv_tm_0_0= ruleTerminalExpression )
            {
            // InternalGame.g:1035:4: (lv_tm_0_0= ruleTerminalExpression )
            // InternalGame.g:1036:5: lv_tm_0_0= ruleTerminalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionAccess().getTmTerminalExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_tm_0_0=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionRule());
              					}
              					set(
              						current,
              						"tm",
              						lv_tm_0_0,
              						"master.mdsd.Game.TerminalExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGame.g:1053:3: ( () ( (lv_op_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=29 && LA18_0<=32)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGame.g:1054:4: () ( (lv_op_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleTerminalExpression ) )
            	    {
            	    // InternalGame.g:1054:4: ()
            	    // InternalGame.g:1055:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getExpressionAccess().getOperationLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalGame.g:1061:4: ( (lv_op_2_0= ruleLogicOperator ) )
            	    // InternalGame.g:1062:5: (lv_op_2_0= ruleLogicOperator )
            	    {
            	    // InternalGame.g:1062:5: (lv_op_2_0= ruleLogicOperator )
            	    // InternalGame.g:1063:6: lv_op_2_0= ruleLogicOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpressionAccess().getOpLogicOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_op_2_0=ruleLogicOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"op",
            	      							lv_op_2_0,
            	      							"master.mdsd.Game.LogicOperator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalGame.g:1080:4: ( (lv_right_3_0= ruleTerminalExpression ) )
            	    // InternalGame.g:1081:5: (lv_right_3_0= ruleTerminalExpression )
            	    {
            	    // InternalGame.g:1081:5: (lv_right_3_0= ruleTerminalExpression )
            	    // InternalGame.g:1082:6: lv_right_3_0= ruleTerminalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_right_3_0=ruleTerminalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"master.mdsd.Game.TerminalExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalGame.g:1104:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalGame.g:1104:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalGame.g:1105:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalGame.g:1111:1: ruleTerminalExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleINTORDEC ) ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1117:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleINTORDEC ) ) ) ) )
            // InternalGame.g:1118:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleINTORDEC ) ) ) )
            {
            // InternalGame.g:1118:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleINTORDEC ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==18) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_INT) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalGame.g:1119:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalGame.g:1119:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalGame.g:1120:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_16);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1138:3: ( () ( (lv_value_4_0= ruleINTORDEC ) ) )
                    {
                    // InternalGame.g:1138:3: ( () ( (lv_value_4_0= ruleINTORDEC ) ) )
                    // InternalGame.g:1139:4: () ( (lv_value_4_0= ruleINTORDEC ) )
                    {
                    // InternalGame.g:1139:4: ()
                    // InternalGame.g:1140:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGame.g:1146:4: ( (lv_value_4_0= ruleINTORDEC ) )
                    // InternalGame.g:1147:5: (lv_value_4_0= ruleINTORDEC )
                    {
                    // InternalGame.g:1147:5: (lv_value_4_0= ruleINTORDEC )
                    // InternalGame.g:1148:6: lv_value_4_0= ruleINTORDEC
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExpressionAccess().getValueINTORDECParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleINTORDEC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExpressionRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_4_0,
                      							"master.mdsd.Game.INTORDEC");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleCondition"
    // InternalGame.g:1170:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGame.g:1170:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGame.g:1171:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGame.g:1177:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleBooleanExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleAction ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseIfCondition_6_0= ruleCondition ) ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ifCondition_2_0 = null;

        EObject lv_then_4_0 = null;

        EObject lv_elseIfCondition_6_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1183:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleBooleanExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleAction ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseIfCondition_6_0= ruleCondition ) ) )? ) )
            // InternalGame.g:1184:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleBooleanExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleAction ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseIfCondition_6_0= ruleCondition ) ) )? )
            {
            // InternalGame.g:1184:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleBooleanExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleAction ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseIfCondition_6_0= ruleCondition ) ) )? )
            // InternalGame.g:1185:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_ifCondition_2_0= ruleBooleanExpression ) ) otherlv_3= ')' ( (lv_then_4_0= ruleAction ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseIfCondition_6_0= ruleCondition ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalGame.g:1193:3: ( (lv_ifCondition_2_0= ruleBooleanExpression ) )
            // InternalGame.g:1194:4: (lv_ifCondition_2_0= ruleBooleanExpression )
            {
            // InternalGame.g:1194:4: (lv_ifCondition_2_0= ruleBooleanExpression )
            // InternalGame.g:1195:5: lv_ifCondition_2_0= ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getIfConditionBooleanExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_ifCondition_2_0=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionRule());
              					}
              					set(
              						current,
              						"ifCondition",
              						lv_ifCondition_2_0,
              						"master.mdsd.Game.BooleanExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalGame.g:1216:3: ( (lv_then_4_0= ruleAction ) )
            // InternalGame.g:1217:4: (lv_then_4_0= ruleAction )
            {
            // InternalGame.g:1217:4: (lv_then_4_0= ruleAction )
            // InternalGame.g:1218:5: lv_then_4_0= ruleAction
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getThenActionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_then_4_0=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionRule());
              					}
              					set(
              						current,
              						"then",
              						lv_then_4_0,
              						"master.mdsd.Game.Action");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGame.g:1235:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseIfCondition_6_0= ruleCondition ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) && (synpred1_InternalGame())) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGame.g:1236:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseIfCondition_6_0= ruleCondition ) )
                    {
                    // InternalGame.g:1236:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalGame.g:1237:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalGame.g:1243:4: ( (lv_elseIfCondition_6_0= ruleCondition ) )
                    // InternalGame.g:1244:5: (lv_elseIfCondition_6_0= ruleCondition )
                    {
                    // InternalGame.g:1244:5: (lv_elseIfCondition_6_0= ruleCondition )
                    // InternalGame.g:1245:6: lv_elseIfCondition_6_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConditionAccess().getElseIfConditionConditionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseIfCondition_6_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConditionRule());
                      						}
                      						set(
                      							current,
                      							"elseIfCondition",
                      							lv_elseIfCondition_6_0,
                      							"master.mdsd.Game.Condition");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalGame.g:1267:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalGame.g:1267:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalGame.g:1268:2: iv_ruleDECIMAL= ruleDECIMAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDECIMALRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDECIMAL=ruleDECIMAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDECIMAL.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:1274:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGame.g:1280:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalGame.g:1281:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalGame.g:1281:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalGame.g:1282:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,22,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
              		
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_2, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDECIMAL"


    // $ANTLR start "entryRuleReferenceCharacter"
    // InternalGame.g:1305:1: entryRuleReferenceCharacter returns [EObject current=null] : iv_ruleReferenceCharacter= ruleReferenceCharacter EOF ;
    public final EObject entryRuleReferenceCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCharacter = null;


        try {
            // InternalGame.g:1305:59: (iv_ruleReferenceCharacter= ruleReferenceCharacter EOF )
            // InternalGame.g:1306:2: iv_ruleReferenceCharacter= ruleReferenceCharacter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceCharacterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReferenceCharacter=ruleReferenceCharacter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceCharacter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:1312:1: ruleReferenceCharacter returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_targetId_3_0= 'self' ) ) ) ) ;
    public final EObject ruleReferenceCharacter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_targetId_3_0=null;


        	enterRule();

        try {
            // InternalGame.g:1318:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_targetId_3_0= 'self' ) ) ) ) )
            // InternalGame.g:1319:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_targetId_3_0= 'self' ) ) ) )
            {
            // InternalGame.g:1319:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_targetId_3_0= 'self' ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==23) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalGame.g:1320:3: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalGame.g:1320:3: ( () ( (otherlv_1= RULE_ID ) ) )
                    // InternalGame.g:1321:4: () ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalGame.g:1321:4: ()
                    // InternalGame.g:1322:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getReferenceCharacterAccess().getReferenceCharacterAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGame.g:1328:4: ( (otherlv_1= RULE_ID ) )
                    // InternalGame.g:1329:5: (otherlv_1= RULE_ID )
                    {
                    // InternalGame.g:1329:5: (otherlv_1= RULE_ID )
                    // InternalGame.g:1330:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getReferenceCharacterRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getReferenceCharacterAccess().getCharacterIdCharacterCrossReference_0_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1343:3: ( () ( (lv_targetId_3_0= 'self' ) ) )
                    {
                    // InternalGame.g:1343:3: ( () ( (lv_targetId_3_0= 'self' ) ) )
                    // InternalGame.g:1344:4: () ( (lv_targetId_3_0= 'self' ) )
                    {
                    // InternalGame.g:1344:4: ()
                    // InternalGame.g:1345:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getReferenceCharacterAccess().getReferenceCharacterAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGame.g:1351:4: ( (lv_targetId_3_0= 'self' ) )
                    // InternalGame.g:1352:5: (lv_targetId_3_0= 'self' )
                    {
                    // InternalGame.g:1352:5: (lv_targetId_3_0= 'self' )
                    // InternalGame.g:1353:6: lv_targetId_3_0= 'self'
                    {
                    lv_targetId_3_0=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_targetId_3_0, grammarAccess.getReferenceCharacterAccess().getTargetIdSelfKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getReferenceCharacterRule());
                      						}
                      						setWithLastConsumed(current, "targetId", lv_targetId_3_0, "self");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReferenceCharacter"


    // $ANTLR start "entryRuleCompOperator"
    // InternalGame.g:1370:1: entryRuleCompOperator returns [EObject current=null] : iv_ruleCompOperator= ruleCompOperator EOF ;
    public final EObject entryRuleCompOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompOperator = null;


        try {
            // InternalGame.g:1370:53: (iv_ruleCompOperator= ruleCompOperator EOF )
            // InternalGame.g:1371:2: iv_ruleCompOperator= ruleCompOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompOperator=ruleCompOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:1377:1: ruleCompOperator returns [EObject current=null] : ( ( () ( (lv_op_1_0= '<' ) ) ) | ( () ( (lv_op_3_0= '>' ) ) ) | ( () ( (lv_op_5_0= '<=' ) ) ) | ( () ( (lv_op_7_0= '>=' ) ) ) | ( () ( (lv_op_9_0= '=' ) ) ) ) ;
    public final EObject ruleCompOperator() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        Token lv_op_3_0=null;
        Token lv_op_5_0=null;
        Token lv_op_7_0=null;
        Token lv_op_9_0=null;


        	enterRule();

        try {
            // InternalGame.g:1383:2: ( ( ( () ( (lv_op_1_0= '<' ) ) ) | ( () ( (lv_op_3_0= '>' ) ) ) | ( () ( (lv_op_5_0= '<=' ) ) ) | ( () ( (lv_op_7_0= '>=' ) ) ) | ( () ( (lv_op_9_0= '=' ) ) ) ) )
            // InternalGame.g:1384:2: ( ( () ( (lv_op_1_0= '<' ) ) ) | ( () ( (lv_op_3_0= '>' ) ) ) | ( () ( (lv_op_5_0= '<=' ) ) ) | ( () ( (lv_op_7_0= '>=' ) ) ) | ( () ( (lv_op_9_0= '=' ) ) ) )
            {
            // InternalGame.g:1384:2: ( ( () ( (lv_op_1_0= '<' ) ) ) | ( () ( (lv_op_3_0= '>' ) ) ) | ( () ( (lv_op_5_0= '<=' ) ) ) | ( () ( (lv_op_7_0= '>=' ) ) ) | ( () ( (lv_op_9_0= '=' ) ) ) )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt22=1;
                }
                break;
            case 25:
                {
                alt22=2;
                }
                break;
            case 26:
                {
                alt22=3;
                }
                break;
            case 27:
                {
                alt22=4;
                }
                break;
            case 28:
                {
                alt22=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalGame.g:1385:3: ( () ( (lv_op_1_0= '<' ) ) )
                    {
                    // InternalGame.g:1385:3: ( () ( (lv_op_1_0= '<' ) ) )
                    // InternalGame.g:1386:4: () ( (lv_op_1_0= '<' ) )
                    {
                    // InternalGame.g:1386:4: ()
                    // InternalGame.g:1387:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getCompOperatorAccess().getLTAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGame.g:1393:4: ( (lv_op_1_0= '<' ) )
                    // InternalGame.g:1394:5: (lv_op_1_0= '<' )
                    {
                    // InternalGame.g:1394:5: (lv_op_1_0= '<' )
                    // InternalGame.g:1395:6: lv_op_1_0= '<'
                    {
                    lv_op_1_0=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_1_0, grammarAccess.getCompOperatorAccess().getOpLessThanSignKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCompOperatorRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_1_0, "<");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1409:3: ( () ( (lv_op_3_0= '>' ) ) )
                    {
                    // InternalGame.g:1409:3: ( () ( (lv_op_3_0= '>' ) ) )
                    // InternalGame.g:1410:4: () ( (lv_op_3_0= '>' ) )
                    {
                    // InternalGame.g:1410:4: ()
                    // InternalGame.g:1411:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getCompOperatorAccess().getGTAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGame.g:1417:4: ( (lv_op_3_0= '>' ) )
                    // InternalGame.g:1418:5: (lv_op_3_0= '>' )
                    {
                    // InternalGame.g:1418:5: (lv_op_3_0= '>' )
                    // InternalGame.g:1419:6: lv_op_3_0= '>'
                    {
                    lv_op_3_0=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_3_0, grammarAccess.getCompOperatorAccess().getOpGreaterThanSignKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCompOperatorRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_3_0, ">");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:1433:3: ( () ( (lv_op_5_0= '<=' ) ) )
                    {
                    // InternalGame.g:1433:3: ( () ( (lv_op_5_0= '<=' ) ) )
                    // InternalGame.g:1434:4: () ( (lv_op_5_0= '<=' ) )
                    {
                    // InternalGame.g:1434:4: ()
                    // InternalGame.g:1435:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getCompOperatorAccess().getLTEAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGame.g:1441:4: ( (lv_op_5_0= '<=' ) )
                    // InternalGame.g:1442:5: (lv_op_5_0= '<=' )
                    {
                    // InternalGame.g:1442:5: (lv_op_5_0= '<=' )
                    // InternalGame.g:1443:6: lv_op_5_0= '<='
                    {
                    lv_op_5_0=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_5_0, grammarAccess.getCompOperatorAccess().getOpLessThanSignEqualsSignKeyword_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCompOperatorRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_5_0, "<=");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGame.g:1457:3: ( () ( (lv_op_7_0= '>=' ) ) )
                    {
                    // InternalGame.g:1457:3: ( () ( (lv_op_7_0= '>=' ) ) )
                    // InternalGame.g:1458:4: () ( (lv_op_7_0= '>=' ) )
                    {
                    // InternalGame.g:1458:4: ()
                    // InternalGame.g:1459:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getCompOperatorAccess().getGTEAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGame.g:1465:4: ( (lv_op_7_0= '>=' ) )
                    // InternalGame.g:1466:5: (lv_op_7_0= '>=' )
                    {
                    // InternalGame.g:1466:5: (lv_op_7_0= '>=' )
                    // InternalGame.g:1467:6: lv_op_7_0= '>='
                    {
                    lv_op_7_0=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_7_0, grammarAccess.getCompOperatorAccess().getOpGreaterThanSignEqualsSignKeyword_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCompOperatorRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_7_0, ">=");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGame.g:1481:3: ( () ( (lv_op_9_0= '=' ) ) )
                    {
                    // InternalGame.g:1481:3: ( () ( (lv_op_9_0= '=' ) ) )
                    // InternalGame.g:1482:4: () ( (lv_op_9_0= '=' ) )
                    {
                    // InternalGame.g:1482:4: ()
                    // InternalGame.g:1483:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getCompOperatorAccess().getEQAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGame.g:1489:4: ( (lv_op_9_0= '=' ) )
                    // InternalGame.g:1490:5: (lv_op_9_0= '=' )
                    {
                    // InternalGame.g:1490:5: (lv_op_9_0= '=' )
                    // InternalGame.g:1491:6: lv_op_9_0= '='
                    {
                    lv_op_9_0=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_9_0, grammarAccess.getCompOperatorAccess().getOpEqualsSignKeyword_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCompOperatorRule());
                      						}
                      						setWithLastConsumed(current, "op", lv_op_9_0, "=");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCompOperator"


    // $ANTLR start "entryRuleAction"
    // InternalGame.g:1508:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalGame.g:1508:47: (iv_ruleAction= ruleAction EOF )
            // InternalGame.g:1509:2: iv_ruleAction= ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:1515:1: ruleAction returns [EObject current=null] : (otherlv_0= '(' ( (lv_charAtt_1_0= ruleCharacterAttr ) ) otherlv_2= '=' ( (lv_charDec_3_0= ruleCharDec ) )? ( ( (lv_op_4_0= ruleLogicOperator ) )? ( (lv_ex_5_0= ruleExpression ) ) )? otherlv_6= ')' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_charAtt_1_0 = null;

        EObject lv_charDec_3_0 = null;

        EObject lv_op_4_0 = null;

        EObject lv_ex_5_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1521:2: ( (otherlv_0= '(' ( (lv_charAtt_1_0= ruleCharacterAttr ) ) otherlv_2= '=' ( (lv_charDec_3_0= ruleCharDec ) )? ( ( (lv_op_4_0= ruleLogicOperator ) )? ( (lv_ex_5_0= ruleExpression ) ) )? otherlv_6= ')' ) )
            // InternalGame.g:1522:2: (otherlv_0= '(' ( (lv_charAtt_1_0= ruleCharacterAttr ) ) otherlv_2= '=' ( (lv_charDec_3_0= ruleCharDec ) )? ( ( (lv_op_4_0= ruleLogicOperator ) )? ( (lv_ex_5_0= ruleExpression ) ) )? otherlv_6= ')' )
            {
            // InternalGame.g:1522:2: (otherlv_0= '(' ( (lv_charAtt_1_0= ruleCharacterAttr ) ) otherlv_2= '=' ( (lv_charDec_3_0= ruleCharDec ) )? ( ( (lv_op_4_0= ruleLogicOperator ) )? ( (lv_ex_5_0= ruleExpression ) ) )? otherlv_6= ')' )
            // InternalGame.g:1523:3: otherlv_0= '(' ( (lv_charAtt_1_0= ruleCharacterAttr ) ) otherlv_2= '=' ( (lv_charDec_3_0= ruleCharDec ) )? ( ( (lv_op_4_0= ruleLogicOperator ) )? ( (lv_ex_5_0= ruleExpression ) ) )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalGame.g:1527:3: ( (lv_charAtt_1_0= ruleCharacterAttr ) )
            // InternalGame.g:1528:4: (lv_charAtt_1_0= ruleCharacterAttr )
            {
            // InternalGame.g:1528:4: (lv_charAtt_1_0= ruleCharacterAttr )
            // InternalGame.g:1529:5: lv_charAtt_1_0= ruleCharacterAttr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getActionAccess().getCharAttCharacterAttrParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_23);
            lv_charAtt_1_0=ruleCharacterAttr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,28,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalGame.g:1550:3: ( (lv_charDec_3_0= ruleCharDec ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||LA23_0==23) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGame.g:1551:4: (lv_charDec_3_0= ruleCharDec )
                    {
                    // InternalGame.g:1551:4: (lv_charDec_3_0= ruleCharDec )
                    // InternalGame.g:1552:5: lv_charDec_3_0= ruleCharDec
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getActionAccess().getCharDecCharDecParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_25);
                    lv_charDec_3_0=ruleCharDec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }

            // InternalGame.g:1569:3: ( ( (lv_op_4_0= ruleLogicOperator ) )? ( (lv_ex_5_0= ruleExpression ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT||LA25_0==18||(LA25_0>=29 && LA25_0<=32)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGame.g:1570:4: ( (lv_op_4_0= ruleLogicOperator ) )? ( (lv_ex_5_0= ruleExpression ) )
                    {
                    // InternalGame.g:1570:4: ( (lv_op_4_0= ruleLogicOperator ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=29 && LA24_0<=32)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalGame.g:1571:5: (lv_op_4_0= ruleLogicOperator )
                            {
                            // InternalGame.g:1571:5: (lv_op_4_0= ruleLogicOperator )
                            // InternalGame.g:1572:6: lv_op_4_0= ruleLogicOperator
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getActionAccess().getOpLogicOperatorParserRuleCall_4_0_0());
                              					
                            }
                            pushFollow(FOLLOW_14);
                            lv_op_4_0=ruleLogicOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getActionRule());
                              						}
                              						set(
                              							current,
                              							"op",
                              							lv_op_4_0,
                              							"master.mdsd.Game.LogicOperator");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalGame.g:1589:4: ( (lv_ex_5_0= ruleExpression ) )
                    // InternalGame.g:1590:5: (lv_ex_5_0= ruleExpression )
                    {
                    // InternalGame.g:1590:5: (lv_ex_5_0= ruleExpression )
                    // InternalGame.g:1591:6: lv_ex_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getActionAccess().getExExpressionParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_ex_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getActionRule());
                      						}
                      						set(
                      							current,
                      							"ex",
                      							lv_ex_5_0,
                      							"master.mdsd.Game.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCharDec"
    // InternalGame.g:1617:1: entryRuleCharDec returns [EObject current=null] : iv_ruleCharDec= ruleCharDec EOF ;
    public final EObject entryRuleCharDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharDec = null;


        try {
            // InternalGame.g:1617:48: (iv_ruleCharDec= ruleCharDec EOF )
            // InternalGame.g:1618:2: iv_ruleCharDec= ruleCharDec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharDecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCharDec=ruleCharDec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCharDec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:1624:1: ruleCharDec returns [EObject current=null] : ( ( (lv_charAttResult_0_0= ruleCharacterAttr ) ) | ( (lv_val_1_0= ruleINTORDEC ) ) ) ;
    public final EObject ruleCharDec() throws RecognitionException {
        EObject current = null;

        EObject lv_charAttResult_0_0 = null;

        AntlrDatatypeRuleToken lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1630:2: ( ( ( (lv_charAttResult_0_0= ruleCharacterAttr ) ) | ( (lv_val_1_0= ruleINTORDEC ) ) ) )
            // InternalGame.g:1631:2: ( ( (lv_charAttResult_0_0= ruleCharacterAttr ) ) | ( (lv_val_1_0= ruleINTORDEC ) ) )
            {
            // InternalGame.g:1631:2: ( ( (lv_charAttResult_0_0= ruleCharacterAttr ) ) | ( (lv_val_1_0= ruleINTORDEC ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||LA26_0==23) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_INT) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalGame.g:1632:3: ( (lv_charAttResult_0_0= ruleCharacterAttr ) )
                    {
                    // InternalGame.g:1632:3: ( (lv_charAttResult_0_0= ruleCharacterAttr ) )
                    // InternalGame.g:1633:4: (lv_charAttResult_0_0= ruleCharacterAttr )
                    {
                    // InternalGame.g:1633:4: (lv_charAttResult_0_0= ruleCharacterAttr )
                    // InternalGame.g:1634:5: lv_charAttResult_0_0= ruleCharacterAttr
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCharDecAccess().getCharAttResultCharacterAttrParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_charAttResult_0_0=ruleCharacterAttr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCharDecRule());
                      					}
                      					set(
                      						current,
                      						"charAttResult",
                      						lv_charAttResult_0_0,
                      						"master.mdsd.Game.CharacterAttr");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1652:3: ( (lv_val_1_0= ruleINTORDEC ) )
                    {
                    // InternalGame.g:1652:3: ( (lv_val_1_0= ruleINTORDEC ) )
                    // InternalGame.g:1653:4: (lv_val_1_0= ruleINTORDEC )
                    {
                    // InternalGame.g:1653:4: (lv_val_1_0= ruleINTORDEC )
                    // InternalGame.g:1654:5: lv_val_1_0= ruleINTORDEC
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCharDecAccess().getValINTORDECParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_val_1_0=ruleINTORDEC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCharDec"


    // $ANTLR start "entryRuleCharacterAttr"
    // InternalGame.g:1675:1: entryRuleCharacterAttr returns [EObject current=null] : iv_ruleCharacterAttr= ruleCharacterAttr EOF ;
    public final EObject entryRuleCharacterAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacterAttr = null;


        try {
            // InternalGame.g:1675:54: (iv_ruleCharacterAttr= ruleCharacterAttr EOF )
            // InternalGame.g:1676:2: iv_ruleCharacterAttr= ruleCharacterAttr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharacterAttrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCharacterAttr=ruleCharacterAttr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCharacterAttr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:1682:1: ruleCharacterAttr returns [EObject current=null] : ( ( (lv_reference_0_0= ruleReferenceCharacter ) ) ( (lv_attributename_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCharacterAttr() throws RecognitionException {
        EObject current = null;

        Token lv_attributename_1_0=null;
        EObject lv_reference_0_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1688:2: ( ( ( (lv_reference_0_0= ruleReferenceCharacter ) ) ( (lv_attributename_1_0= RULE_ID ) ) ) )
            // InternalGame.g:1689:2: ( ( (lv_reference_0_0= ruleReferenceCharacter ) ) ( (lv_attributename_1_0= RULE_ID ) ) )
            {
            // InternalGame.g:1689:2: ( ( (lv_reference_0_0= ruleReferenceCharacter ) ) ( (lv_attributename_1_0= RULE_ID ) ) )
            // InternalGame.g:1690:3: ( (lv_reference_0_0= ruleReferenceCharacter ) ) ( (lv_attributename_1_0= RULE_ID ) )
            {
            // InternalGame.g:1690:3: ( (lv_reference_0_0= ruleReferenceCharacter ) )
            // InternalGame.g:1691:4: (lv_reference_0_0= ruleReferenceCharacter )
            {
            // InternalGame.g:1691:4: (lv_reference_0_0= ruleReferenceCharacter )
            // InternalGame.g:1692:5: lv_reference_0_0= ruleReferenceCharacter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCharacterAttrAccess().getReferenceReferenceCharacterParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_reference_0_0=ruleReferenceCharacter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalGame.g:1709:3: ( (lv_attributename_1_0= RULE_ID ) )
            // InternalGame.g:1710:4: (lv_attributename_1_0= RULE_ID )
            {
            // InternalGame.g:1710:4: (lv_attributename_1_0= RULE_ID )
            // InternalGame.g:1711:5: lv_attributename_1_0= RULE_ID
            {
            lv_attributename_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_attributename_1_0, grammarAccess.getCharacterAttrAccess().getAttributenameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCharacterAttr"


    // $ANTLR start "entryRuleLogicOperator"
    // InternalGame.g:1731:1: entryRuleLogicOperator returns [EObject current=null] : iv_ruleLogicOperator= ruleLogicOperator EOF ;
    public final EObject entryRuleLogicOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicOperator = null;


        try {
            // InternalGame.g:1731:54: (iv_ruleLogicOperator= ruleLogicOperator EOF )
            // InternalGame.g:1732:2: iv_ruleLogicOperator= ruleLogicOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicOperator=ruleLogicOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:1738:1: ruleLogicOperator returns [EObject current=null] : ( ( () ( (lv_lop_1_0= '*' ) ) ) | ( () ( (lv_lop_3_0= '+' ) ) ) | ( () ( (lv_lop_5_0= '-' ) ) ) | ( () ( (lv_lop_7_0= '/' ) ) ) ) ;
    public final EObject ruleLogicOperator() throws RecognitionException {
        EObject current = null;

        Token lv_lop_1_0=null;
        Token lv_lop_3_0=null;
        Token lv_lop_5_0=null;
        Token lv_lop_7_0=null;


        	enterRule();

        try {
            // InternalGame.g:1744:2: ( ( ( () ( (lv_lop_1_0= '*' ) ) ) | ( () ( (lv_lop_3_0= '+' ) ) ) | ( () ( (lv_lop_5_0= '-' ) ) ) | ( () ( (lv_lop_7_0= '/' ) ) ) ) )
            // InternalGame.g:1745:2: ( ( () ( (lv_lop_1_0= '*' ) ) ) | ( () ( (lv_lop_3_0= '+' ) ) ) | ( () ( (lv_lop_5_0= '-' ) ) ) | ( () ( (lv_lop_7_0= '/' ) ) ) )
            {
            // InternalGame.g:1745:2: ( ( () ( (lv_lop_1_0= '*' ) ) ) | ( () ( (lv_lop_3_0= '+' ) ) ) | ( () ( (lv_lop_5_0= '-' ) ) ) | ( () ( (lv_lop_7_0= '/' ) ) ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt27=1;
                }
                break;
            case 30:
                {
                alt27=2;
                }
                break;
            case 31:
                {
                alt27=3;
                }
                break;
            case 32:
                {
                alt27=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalGame.g:1746:3: ( () ( (lv_lop_1_0= '*' ) ) )
                    {
                    // InternalGame.g:1746:3: ( () ( (lv_lop_1_0= '*' ) ) )
                    // InternalGame.g:1747:4: () ( (lv_lop_1_0= '*' ) )
                    {
                    // InternalGame.g:1747:4: ()
                    // InternalGame.g:1748:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLogicOperatorAccess().getTAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGame.g:1754:4: ( (lv_lop_1_0= '*' ) )
                    // InternalGame.g:1755:5: (lv_lop_1_0= '*' )
                    {
                    // InternalGame.g:1755:5: (lv_lop_1_0= '*' )
                    // InternalGame.g:1756:6: lv_lop_1_0= '*'
                    {
                    lv_lop_1_0=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_lop_1_0, grammarAccess.getLogicOperatorAccess().getLopAsteriskKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLogicOperatorRule());
                      						}
                      						setWithLastConsumed(current, "lop", lv_lop_1_0, "*");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1770:3: ( () ( (lv_lop_3_0= '+' ) ) )
                    {
                    // InternalGame.g:1770:3: ( () ( (lv_lop_3_0= '+' ) ) )
                    // InternalGame.g:1771:4: () ( (lv_lop_3_0= '+' ) )
                    {
                    // InternalGame.g:1771:4: ()
                    // InternalGame.g:1772:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLogicOperatorAccess().getAAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGame.g:1778:4: ( (lv_lop_3_0= '+' ) )
                    // InternalGame.g:1779:5: (lv_lop_3_0= '+' )
                    {
                    // InternalGame.g:1779:5: (lv_lop_3_0= '+' )
                    // InternalGame.g:1780:6: lv_lop_3_0= '+'
                    {
                    lv_lop_3_0=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_lop_3_0, grammarAccess.getLogicOperatorAccess().getLopPlusSignKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLogicOperatorRule());
                      						}
                      						setWithLastConsumed(current, "lop", lv_lop_3_0, "+");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:1794:3: ( () ( (lv_lop_5_0= '-' ) ) )
                    {
                    // InternalGame.g:1794:3: ( () ( (lv_lop_5_0= '-' ) ) )
                    // InternalGame.g:1795:4: () ( (lv_lop_5_0= '-' ) )
                    {
                    // InternalGame.g:1795:4: ()
                    // InternalGame.g:1796:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLogicOperatorAccess().getMAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGame.g:1802:4: ( (lv_lop_5_0= '-' ) )
                    // InternalGame.g:1803:5: (lv_lop_5_0= '-' )
                    {
                    // InternalGame.g:1803:5: (lv_lop_5_0= '-' )
                    // InternalGame.g:1804:6: lv_lop_5_0= '-'
                    {
                    lv_lop_5_0=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_lop_5_0, grammarAccess.getLogicOperatorAccess().getLopHyphenMinusKeyword_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLogicOperatorRule());
                      						}
                      						setWithLastConsumed(current, "lop", lv_lop_5_0, "-");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGame.g:1818:3: ( () ( (lv_lop_7_0= '/' ) ) )
                    {
                    // InternalGame.g:1818:3: ( () ( (lv_lop_7_0= '/' ) ) )
                    // InternalGame.g:1819:4: () ( (lv_lop_7_0= '/' ) )
                    {
                    // InternalGame.g:1819:4: ()
                    // InternalGame.g:1820:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLogicOperatorAccess().getDAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalGame.g:1826:4: ( (lv_lop_7_0= '/' ) )
                    // InternalGame.g:1827:5: (lv_lop_7_0= '/' )
                    {
                    // InternalGame.g:1827:5: (lv_lop_7_0= '/' )
                    // InternalGame.g:1828:6: lv_lop_7_0= '/'
                    {
                    lv_lop_7_0=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_lop_7_0, grammarAccess.getLogicOperatorAccess().getLopSolidusKeyword_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLogicOperatorRule());
                      						}
                      						setWithLastConsumed(current, "lop", lv_lop_7_0, "/");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLogicOperator"


    // $ANTLR start "entryRuleAttack"
    // InternalGame.g:1845:1: entryRuleAttack returns [EObject current=null] : iv_ruleAttack= ruleAttack EOF ;
    public final EObject entryRuleAttack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttack = null;


        try {
            // InternalGame.g:1845:47: (iv_ruleAttack= ruleAttack EOF )
            // InternalGame.g:1846:2: iv_ruleAttack= ruleAttack EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttackRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttack=ruleAttack();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttack; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:1852:1: ruleAttack returns [EObject current=null] : ( ( (lv_entityid_0_0= 'Attack' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_attributesAttack_4_0= ruleAttributeAttack ) )* ( (lv_rules_5_0= ruleCondition ) )? otherlv_6= '}' ) ;
    public final EObject ruleAttack() throws RecognitionException {
        EObject current = null;

        Token lv_entityid_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_attributesAttack_4_0 = null;

        EObject lv_rules_5_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1858:2: ( ( ( (lv_entityid_0_0= 'Attack' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_attributesAttack_4_0= ruleAttributeAttack ) )* ( (lv_rules_5_0= ruleCondition ) )? otherlv_6= '}' ) )
            // InternalGame.g:1859:2: ( ( (lv_entityid_0_0= 'Attack' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_attributesAttack_4_0= ruleAttributeAttack ) )* ( (lv_rules_5_0= ruleCondition ) )? otherlv_6= '}' )
            {
            // InternalGame.g:1859:2: ( ( (lv_entityid_0_0= 'Attack' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_attributesAttack_4_0= ruleAttributeAttack ) )* ( (lv_rules_5_0= ruleCondition ) )? otherlv_6= '}' )
            // InternalGame.g:1860:3: ( (lv_entityid_0_0= 'Attack' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_attributesAttack_4_0= ruleAttributeAttack ) )* ( (lv_rules_5_0= ruleCondition ) )? otherlv_6= '}'
            {
            // InternalGame.g:1860:3: ( (lv_entityid_0_0= 'Attack' ) )
            // InternalGame.g:1861:4: (lv_entityid_0_0= 'Attack' )
            {
            // InternalGame.g:1861:4: (lv_entityid_0_0= 'Attack' )
            // InternalGame.g:1862:5: lv_entityid_0_0= 'Attack'
            {
            lv_entityid_0_0=(Token)match(input,33,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_entityid_0_0, grammarAccess.getAttackAccess().getEntityidAttackKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAttackRule());
              					}
              					setWithLastConsumed(current, "entityid", lv_entityid_0_0, "Attack");
              				
            }

            }


            }

            // InternalGame.g:1874:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:1875:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:1875:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:1876:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getAttackAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAttackRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAttackAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalGame.g:1896:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalGame.g:1897:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalGame.g:1897:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalGame.g:1898:5: lv_attributes_3_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAttackAccess().getAttributesAttributeParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAttackRule());
            	      					}
            	      					add(
            	      						current,
            	      						"attributes",
            	      						lv_attributes_3_0,
            	      						"master.mdsd.Game.Attribute");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalGame.g:1915:3: ( (lv_attributesAttack_4_0= ruleAttributeAttack ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=34 && LA29_0<=36)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGame.g:1916:4: (lv_attributesAttack_4_0= ruleAttributeAttack )
            	    {
            	    // InternalGame.g:1916:4: (lv_attributesAttack_4_0= ruleAttributeAttack )
            	    // InternalGame.g:1917:5: lv_attributesAttack_4_0= ruleAttributeAttack
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAttackAccess().getAttributesAttackAttributeAttackParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_attributesAttack_4_0=ruleAttributeAttack();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAttackRule());
            	      					}
            	      					add(
            	      						current,
            	      						"attributesAttack",
            	      						lv_attributesAttack_4_0,
            	      						"master.mdsd.Game.AttributeAttack");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalGame.g:1934:3: ( (lv_rules_5_0= ruleCondition ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGame.g:1935:4: (lv_rules_5_0= ruleCondition )
                    {
                    // InternalGame.g:1935:4: (lv_rules_5_0= ruleCondition )
                    // InternalGame.g:1936:5: lv_rules_5_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAttackAccess().getRulesConditionParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_28);
                    lv_rules_5_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAttackRule());
                      					}
                      					add(
                      						current,
                      						"rules",
                      						lv_rules_5_0,
                      						"master.mdsd.Game.Condition");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getAttackAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttack"


    // $ANTLR start "entryRuleAttributeAttack"
    // InternalGame.g:1961:1: entryRuleAttributeAttack returns [EObject current=null] : iv_ruleAttributeAttack= ruleAttributeAttack EOF ;
    public final EObject entryRuleAttributeAttack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeAttack = null;


        try {
            // InternalGame.g:1961:56: (iv_ruleAttributeAttack= ruleAttributeAttack EOF )
            // InternalGame.g:1962:2: iv_ruleAttributeAttack= ruleAttributeAttack EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeAttackRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttributeAttack=ruleAttributeAttack();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeAttack; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:1968:1: ruleAttributeAttack returns [EObject current=null] : ( ( (lv_attributeTypesAttack_0_0= ruleAttributeTypeAttack ) ) ( (lv_type_1_0= ruleType ) )? ) ;
    public final EObject ruleAttributeAttack() throws RecognitionException {
        EObject current = null;

        EObject lv_attributeTypesAttack_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalGame.g:1974:2: ( ( ( (lv_attributeTypesAttack_0_0= ruleAttributeTypeAttack ) ) ( (lv_type_1_0= ruleType ) )? ) )
            // InternalGame.g:1975:2: ( ( (lv_attributeTypesAttack_0_0= ruleAttributeTypeAttack ) ) ( (lv_type_1_0= ruleType ) )? )
            {
            // InternalGame.g:1975:2: ( ( (lv_attributeTypesAttack_0_0= ruleAttributeTypeAttack ) ) ( (lv_type_1_0= ruleType ) )? )
            // InternalGame.g:1976:3: ( (lv_attributeTypesAttack_0_0= ruleAttributeTypeAttack ) ) ( (lv_type_1_0= ruleType ) )?
            {
            // InternalGame.g:1976:3: ( (lv_attributeTypesAttack_0_0= ruleAttributeTypeAttack ) )
            // InternalGame.g:1977:4: (lv_attributeTypesAttack_0_0= ruleAttributeTypeAttack )
            {
            // InternalGame.g:1977:4: (lv_attributeTypesAttack_0_0= ruleAttributeTypeAttack )
            // InternalGame.g:1978:5: lv_attributeTypesAttack_0_0= ruleAttributeTypeAttack
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAttackAccess().getAttributeTypesAttackAttributeTypeAttackParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_attributeTypesAttack_0_0=ruleAttributeTypeAttack();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalGame.g:1995:3: ( (lv_type_1_0= ruleType ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_INT)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGame.g:1996:4: (lv_type_1_0= ruleType )
                    {
                    // InternalGame.g:1996:4: (lv_type_1_0= ruleType )
                    // InternalGame.g:1997:5: lv_type_1_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAttributeAttackAccess().getTypeTypeParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_1_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttributeAttack"


    // $ANTLR start "entryRuleAttributeTypeAttack"
    // InternalGame.g:2018:1: entryRuleAttributeTypeAttack returns [EObject current=null] : iv_ruleAttributeTypeAttack= ruleAttributeTypeAttack EOF ;
    public final EObject entryRuleAttributeTypeAttack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeTypeAttack = null;


        try {
            // InternalGame.g:2018:60: (iv_ruleAttributeTypeAttack= ruleAttributeTypeAttack EOF )
            // InternalGame.g:2019:2: iv_ruleAttributeTypeAttack= ruleAttributeTypeAttack EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeTypeAttackRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttributeTypeAttack=ruleAttributeTypeAttack();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeTypeAttack; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:2025:1: ruleAttributeTypeAttack returns [EObject current=null] : ( ( () otherlv_1= 'Ammunition' ) | ( () otherlv_3= 'Attackspeed' ) | ( () otherlv_5= 'Bullet' ( (otherlv_6= RULE_ID ) ) ) ) ;
    public final EObject ruleAttributeTypeAttack() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalGame.g:2031:2: ( ( ( () otherlv_1= 'Ammunition' ) | ( () otherlv_3= 'Attackspeed' ) | ( () otherlv_5= 'Bullet' ( (otherlv_6= RULE_ID ) ) ) ) )
            // InternalGame.g:2032:2: ( ( () otherlv_1= 'Ammunition' ) | ( () otherlv_3= 'Attackspeed' ) | ( () otherlv_5= 'Bullet' ( (otherlv_6= RULE_ID ) ) ) )
            {
            // InternalGame.g:2032:2: ( ( () otherlv_1= 'Ammunition' ) | ( () otherlv_3= 'Attackspeed' ) | ( () otherlv_5= 'Bullet' ( (otherlv_6= RULE_ID ) ) ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt32=1;
                }
                break;
            case 35:
                {
                alt32=2;
                }
                break;
            case 36:
                {
                alt32=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalGame.g:2033:3: ( () otherlv_1= 'Ammunition' )
                    {
                    // InternalGame.g:2033:3: ( () otherlv_1= 'Ammunition' )
                    // InternalGame.g:2034:4: () otherlv_1= 'Ammunition'
                    {
                    // InternalGame.g:2034:4: ()
                    // InternalGame.g:2035:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAttributeTypeAttackAccess().getAmmoAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getAttributeTypeAttackAccess().getAmmunitionKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:2047:3: ( () otherlv_3= 'Attackspeed' )
                    {
                    // InternalGame.g:2047:3: ( () otherlv_3= 'Attackspeed' )
                    // InternalGame.g:2048:4: () otherlv_3= 'Attackspeed'
                    {
                    // InternalGame.g:2048:4: ()
                    // InternalGame.g:2049:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAttributeTypeAttackAccess().getAttSAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_3=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAttributeTypeAttackAccess().getAttackspeedKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:2061:3: ( () otherlv_5= 'Bullet' ( (otherlv_6= RULE_ID ) ) )
                    {
                    // InternalGame.g:2061:3: ( () otherlv_5= 'Bullet' ( (otherlv_6= RULE_ID ) ) )
                    // InternalGame.g:2062:4: () otherlv_5= 'Bullet' ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalGame.g:2062:4: ()
                    // InternalGame.g:2063:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAttributeTypeAttackAccess().getBulletAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,36,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getAttributeTypeAttackAccess().getBulletKeyword_2_1());
                      			
                    }
                    // InternalGame.g:2073:4: ( (otherlv_6= RULE_ID ) )
                    // InternalGame.g:2074:5: (otherlv_6= RULE_ID )
                    {
                    // InternalGame.g:2074:5: (otherlv_6= RULE_ID )
                    // InternalGame.g:2075:6: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAttributeTypeAttackRule());
                      						}
                      					
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getAttributeTypeAttackAccess().getBulletRefBulletCrossReference_2_2_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttributeTypeAttack"


    // $ANTLR start "entryRuleBullet"
    // InternalGame.g:2091:1: entryRuleBullet returns [EObject current=null] : iv_ruleBullet= ruleBullet EOF ;
    public final EObject entryRuleBullet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBullet = null;


        try {
            // InternalGame.g:2091:47: (iv_ruleBullet= ruleBullet EOF )
            // InternalGame.g:2092:2: iv_ruleBullet= ruleBullet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBulletRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBullet=ruleBullet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBullet; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:2098:1: ruleBullet returns [EObject current=null] : ( ( (lv_entityid_0_0= 'Bullet' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributesBullet_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleBullet() throws RecognitionException {
        EObject current = null;

        Token lv_entityid_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributesBullet_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:2104:2: ( ( ( (lv_entityid_0_0= 'Bullet' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributesBullet_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // InternalGame.g:2105:2: ( ( (lv_entityid_0_0= 'Bullet' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributesBullet_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // InternalGame.g:2105:2: ( ( (lv_entityid_0_0= 'Bullet' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributesBullet_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // InternalGame.g:2106:3: ( (lv_entityid_0_0= 'Bullet' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributesBullet_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            // InternalGame.g:2106:3: ( (lv_entityid_0_0= 'Bullet' ) )
            // InternalGame.g:2107:4: (lv_entityid_0_0= 'Bullet' )
            {
            // InternalGame.g:2107:4: (lv_entityid_0_0= 'Bullet' )
            // InternalGame.g:2108:5: lv_entityid_0_0= 'Bullet'
            {
            lv_entityid_0_0=(Token)match(input,36,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_entityid_0_0, grammarAccess.getBulletAccess().getEntityidBulletKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBulletRule());
              					}
              					setWithLastConsumed(current, "entityid", lv_entityid_0_0, "Bullet");
              				
            }

            }


            }

            // InternalGame.g:2120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:2121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:2121:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:2122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getBulletAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBulletRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBulletAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalGame.g:2142:3: ( (lv_attributesBullet_3_0= ruleAttribute ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalGame.g:2143:4: (lv_attributesBullet_3_0= ruleAttribute )
            	    {
            	    // InternalGame.g:2143:4: (lv_attributesBullet_3_0= ruleAttribute )
            	    // InternalGame.g:2144:5: lv_attributesBullet_3_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBulletAccess().getAttributesBulletAttributeParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_attributesBullet_3_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBulletRule());
            	      					}
            	      					add(
            	      						current,
            	      						"attributesBullet",
            	      						lv_attributesBullet_3_0,
            	      						"master.mdsd.Game.Attribute");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBulletAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBullet"


    // $ANTLR start "entryRuleInitializer"
    // InternalGame.g:2169:1: entryRuleInitializer returns [EObject current=null] : iv_ruleInitializer= ruleInitializer EOF ;
    public final EObject entryRuleInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitializer = null;


        try {
            // InternalGame.g:2169:52: (iv_ruleInitializer= ruleInitializer EOF )
            // InternalGame.g:2170:2: iv_ruleInitializer= ruleInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitializerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInitializer=ruleInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitializer; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:2176:1: ruleInitializer returns [EObject current=null] : ( () ( (lv_entityId_1_0= 'Initializer' ) ) otherlv_2= '{' ( (lv_attributesInitializer_3_0= ruleAttributeInitializer ) )* otherlv_4= '}' ) ;
    public final EObject ruleInitializer() throws RecognitionException {
        EObject current = null;

        Token lv_entityId_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributesInitializer_3_0 = null;



        	enterRule();

        try {
            // InternalGame.g:2182:2: ( ( () ( (lv_entityId_1_0= 'Initializer' ) ) otherlv_2= '{' ( (lv_attributesInitializer_3_0= ruleAttributeInitializer ) )* otherlv_4= '}' ) )
            // InternalGame.g:2183:2: ( () ( (lv_entityId_1_0= 'Initializer' ) ) otherlv_2= '{' ( (lv_attributesInitializer_3_0= ruleAttributeInitializer ) )* otherlv_4= '}' )
            {
            // InternalGame.g:2183:2: ( () ( (lv_entityId_1_0= 'Initializer' ) ) otherlv_2= '{' ( (lv_attributesInitializer_3_0= ruleAttributeInitializer ) )* otherlv_4= '}' )
            // InternalGame.g:2184:3: () ( (lv_entityId_1_0= 'Initializer' ) ) otherlv_2= '{' ( (lv_attributesInitializer_3_0= ruleAttributeInitializer ) )* otherlv_4= '}'
            {
            // InternalGame.g:2184:3: ()
            // InternalGame.g:2185:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInitializerAccess().getInitializerAction_0(),
              					current);
              			
            }

            }

            // InternalGame.g:2191:3: ( (lv_entityId_1_0= 'Initializer' ) )
            // InternalGame.g:2192:4: (lv_entityId_1_0= 'Initializer' )
            {
            // InternalGame.g:2192:4: (lv_entityId_1_0= 'Initializer' )
            // InternalGame.g:2193:5: lv_entityId_1_0= 'Initializer'
            {
            lv_entityId_1_0=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_entityId_1_0, grammarAccess.getInitializerAccess().getEntityIdInitializerKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInitializerRule());
              					}
              					setWithLastConsumed(current, "entityId", lv_entityId_1_0, "Initializer");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInitializerAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalGame.g:2209:3: ( (lv_attributesInitializer_3_0= ruleAttributeInitializer ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGame.g:2210:4: (lv_attributesInitializer_3_0= ruleAttributeInitializer )
            	    {
            	    // InternalGame.g:2210:4: (lv_attributesInitializer_3_0= ruleAttributeInitializer )
            	    // InternalGame.g:2211:5: lv_attributesInitializer_3_0= ruleAttributeInitializer
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getInitializerAccess().getAttributesInitializerAttributeInitializerParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_attributesInitializer_3_0=ruleAttributeInitializer();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getInitializerAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInitializer"


    // $ANTLR start "entryRuleAttributeInitializer"
    // InternalGame.g:2236:1: entryRuleAttributeInitializer returns [EObject current=null] : iv_ruleAttributeInitializer= ruleAttributeInitializer EOF ;
    public final EObject entryRuleAttributeInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeInitializer = null;


        try {
            // InternalGame.g:2236:61: (iv_ruleAttributeInitializer= ruleAttributeInitializer EOF )
            // InternalGame.g:2237:2: iv_ruleAttributeInitializer= ruleAttributeInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeInitializerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttributeInitializer=ruleAttributeInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeInitializer; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:2243:1: ruleAttributeInitializer returns [EObject current=null] : ( ( (lv_attributeId_0_0= RULE_ID ) ) ( (lv_amountValueId_1_0= RULE_INT ) )? ( (lv_target_2_0= ruleTargetRef ) ) ) ;
    public final EObject ruleAttributeInitializer() throws RecognitionException {
        EObject current = null;

        Token lv_attributeId_0_0=null;
        Token lv_amountValueId_1_0=null;
        EObject lv_target_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:2249:2: ( ( ( (lv_attributeId_0_0= RULE_ID ) ) ( (lv_amountValueId_1_0= RULE_INT ) )? ( (lv_target_2_0= ruleTargetRef ) ) ) )
            // InternalGame.g:2250:2: ( ( (lv_attributeId_0_0= RULE_ID ) ) ( (lv_amountValueId_1_0= RULE_INT ) )? ( (lv_target_2_0= ruleTargetRef ) ) )
            {
            // InternalGame.g:2250:2: ( ( (lv_attributeId_0_0= RULE_ID ) ) ( (lv_amountValueId_1_0= RULE_INT ) )? ( (lv_target_2_0= ruleTargetRef ) ) )
            // InternalGame.g:2251:3: ( (lv_attributeId_0_0= RULE_ID ) ) ( (lv_amountValueId_1_0= RULE_INT ) )? ( (lv_target_2_0= ruleTargetRef ) )
            {
            // InternalGame.g:2251:3: ( (lv_attributeId_0_0= RULE_ID ) )
            // InternalGame.g:2252:4: (lv_attributeId_0_0= RULE_ID )
            {
            // InternalGame.g:2252:4: (lv_attributeId_0_0= RULE_ID )
            // InternalGame.g:2253:5: lv_attributeId_0_0= RULE_ID
            {
            lv_attributeId_0_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_attributeId_0_0, grammarAccess.getAttributeInitializerAccess().getAttributeIdIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            // InternalGame.g:2269:3: ( (lv_amountValueId_1_0= RULE_INT ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_INT) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGame.g:2270:4: (lv_amountValueId_1_0= RULE_INT )
                    {
                    // InternalGame.g:2270:4: (lv_amountValueId_1_0= RULE_INT )
                    // InternalGame.g:2271:5: lv_amountValueId_1_0= RULE_INT
                    {
                    lv_amountValueId_1_0=(Token)match(input,RULE_INT,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_amountValueId_1_0, grammarAccess.getAttributeInitializerAccess().getAmountValueIdINTTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }

            // InternalGame.g:2287:3: ( (lv_target_2_0= ruleTargetRef ) )
            // InternalGame.g:2288:4: (lv_target_2_0= ruleTargetRef )
            {
            // InternalGame.g:2288:4: (lv_target_2_0= ruleTargetRef )
            // InternalGame.g:2289:5: lv_target_2_0= ruleTargetRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeInitializerAccess().getTargetTargetRefParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_target_2_0=ruleTargetRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeInitializerRule());
              					}
              					set(
              						current,
              						"target",
              						lv_target_2_0,
              						"master.mdsd.Game.TargetRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttributeInitializer"


    // $ANTLR start "entryRuleTargetRef"
    // InternalGame.g:2310:1: entryRuleTargetRef returns [EObject current=null] : iv_ruleTargetRef= ruleTargetRef EOF ;
    public final EObject entryRuleTargetRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetRef = null;


        try {
            // InternalGame.g:2310:50: (iv_ruleTargetRef= ruleTargetRef EOF )
            // InternalGame.g:2311:2: iv_ruleTargetRef= ruleTargetRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTargetRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTargetRef=ruleTargetRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTargetRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:2317:1: ruleTargetRef returns [EObject current=null] : ( ( (lv_targetId_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_locationsId_2_0= ruleLocation ) ) (otherlv_3= ',' ( (lv_locationsId_4_0= ruleLocation ) ) )* otherlv_5= '}' ) ;
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
            // InternalGame.g:2323:2: ( ( ( (lv_targetId_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_locationsId_2_0= ruleLocation ) ) (otherlv_3= ',' ( (lv_locationsId_4_0= ruleLocation ) ) )* otherlv_5= '}' ) )
            // InternalGame.g:2324:2: ( ( (lv_targetId_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_locationsId_2_0= ruleLocation ) ) (otherlv_3= ',' ( (lv_locationsId_4_0= ruleLocation ) ) )* otherlv_5= '}' )
            {
            // InternalGame.g:2324:2: ( ( (lv_targetId_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_locationsId_2_0= ruleLocation ) ) (otherlv_3= ',' ( (lv_locationsId_4_0= ruleLocation ) ) )* otherlv_5= '}' )
            // InternalGame.g:2325:3: ( (lv_targetId_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_locationsId_2_0= ruleLocation ) ) (otherlv_3= ',' ( (lv_locationsId_4_0= ruleLocation ) ) )* otherlv_5= '}'
            {
            // InternalGame.g:2325:3: ( (lv_targetId_0_0= RULE_ID ) )
            // InternalGame.g:2326:4: (lv_targetId_0_0= RULE_ID )
            {
            // InternalGame.g:2326:4: (lv_targetId_0_0= RULE_ID )
            // InternalGame.g:2327:5: lv_targetId_0_0= RULE_ID
            {
            lv_targetId_0_0=(Token)match(input,RULE_ID,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_targetId_0_0, grammarAccess.getTargetRefAccess().getTargetIdIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_1=(Token)match(input,12,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTargetRefAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGame.g:2347:3: ( (lv_locationsId_2_0= ruleLocation ) )
            // InternalGame.g:2348:4: (lv_locationsId_2_0= ruleLocation )
            {
            // InternalGame.g:2348:4: (lv_locationsId_2_0= ruleLocation )
            // InternalGame.g:2349:5: lv_locationsId_2_0= ruleLocation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTargetRefAccess().getLocationsIdLocationParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_locationsId_2_0=ruleLocation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalGame.g:2366:3: (otherlv_3= ',' ( (lv_locationsId_4_0= ruleLocation ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==38) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalGame.g:2367:4: otherlv_3= ',' ( (lv_locationsId_4_0= ruleLocation ) )
            	    {
            	    otherlv_3=(Token)match(input,38,FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getTargetRefAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalGame.g:2371:4: ( (lv_locationsId_4_0= ruleLocation ) )
            	    // InternalGame.g:2372:5: (lv_locationsId_4_0= ruleLocation )
            	    {
            	    // InternalGame.g:2372:5: (lv_locationsId_4_0= ruleLocation )
            	    // InternalGame.g:2373:6: lv_locationsId_4_0= ruleLocation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTargetRefAccess().getLocationsIdLocationParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_locationsId_4_0=ruleLocation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTargetRefAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTargetRef"


    // $ANTLR start "entryRuleLocation"
    // InternalGame.g:2399:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalGame.g:2399:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalGame.g:2400:2: iv_ruleLocation= ruleLocation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalGame.g:2406:1: ruleLocation returns [EObject current=null] : ( ( (lv_locationId_0_0= 'random' ) ) | (otherlv_1= '(' ( (lv_typea_2_0= ruleType ) ) otherlv_3= ',' ( (lv_typeb_4_0= ruleType ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token lv_locationId_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_typea_2_0 = null;

        EObject lv_typeb_4_0 = null;



        	enterRule();

        try {
            // InternalGame.g:2412:2: ( ( ( (lv_locationId_0_0= 'random' ) ) | (otherlv_1= '(' ( (lv_typea_2_0= ruleType ) ) otherlv_3= ',' ( (lv_typeb_4_0= ruleType ) ) otherlv_5= ')' ) ) )
            // InternalGame.g:2413:2: ( ( (lv_locationId_0_0= 'random' ) ) | (otherlv_1= '(' ( (lv_typea_2_0= ruleType ) ) otherlv_3= ',' ( (lv_typeb_4_0= ruleType ) ) otherlv_5= ')' ) )
            {
            // InternalGame.g:2413:2: ( ( (lv_locationId_0_0= 'random' ) ) | (otherlv_1= '(' ( (lv_typea_2_0= ruleType ) ) otherlv_3= ',' ( (lv_typeb_4_0= ruleType ) ) otherlv_5= ')' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            else if ( (LA37_0==18) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalGame.g:2414:3: ( (lv_locationId_0_0= 'random' ) )
                    {
                    // InternalGame.g:2414:3: ( (lv_locationId_0_0= 'random' ) )
                    // InternalGame.g:2415:4: (lv_locationId_0_0= 'random' )
                    {
                    // InternalGame.g:2415:4: (lv_locationId_0_0= 'random' )
                    // InternalGame.g:2416:5: lv_locationId_0_0= 'random'
                    {
                    lv_locationId_0_0=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_locationId_0_0, grammarAccess.getLocationAccess().getLocationIdRandomKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getLocationRule());
                      					}
                      					setWithLastConsumed(current, "locationId", lv_locationId_0_0, "random");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:2429:3: (otherlv_1= '(' ( (lv_typea_2_0= ruleType ) ) otherlv_3= ',' ( (lv_typeb_4_0= ruleType ) ) otherlv_5= ')' )
                    {
                    // InternalGame.g:2429:3: (otherlv_1= '(' ( (lv_typea_2_0= ruleType ) ) otherlv_3= ',' ( (lv_typeb_4_0= ruleType ) ) otherlv_5= ')' )
                    // InternalGame.g:2430:4: otherlv_1= '(' ( (lv_typea_2_0= ruleType ) ) otherlv_3= ',' ( (lv_typeb_4_0= ruleType ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalGame.g:2434:4: ( (lv_typea_2_0= ruleType ) )
                    // InternalGame.g:2435:5: (lv_typea_2_0= ruleType )
                    {
                    // InternalGame.g:2435:5: (lv_typea_2_0= ruleType )
                    // InternalGame.g:2436:6: lv_typea_2_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLocationAccess().getTypeaTypeParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
                    lv_typea_2_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_3=(Token)match(input,38,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLocationAccess().getCommaKeyword_1_2());
                      			
                    }
                    // InternalGame.g:2457:4: ( (lv_typeb_4_0= ruleType ) )
                    // InternalGame.g:2458:5: (lv_typeb_4_0= ruleType )
                    {
                    // InternalGame.g:2458:5: (lv_typeb_4_0= ruleType )
                    // InternalGame.g:2459:6: lv_typeb_4_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLocationAccess().getTypebTypeParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_typeb_4_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getLocationAccess().getRightParenthesisKeyword_1_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLocation"

    // $ANTLR start synpred1_InternalGame
    public final void synpred1_InternalGame_fragment() throws RecognitionException {   
        // InternalGame.g:1237:5: ( 'else' )
        // InternalGame.g:1237:6: 'else'
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalGame

    // Delegated rules

    public final boolean synpred1_InternalGame() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGame_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000320003E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000102010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000001F040020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000001E0840032L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000001E0040022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001F840030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000001E08C0030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000001E00C0020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001C00102010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001C00102000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000040000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000002000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});

}