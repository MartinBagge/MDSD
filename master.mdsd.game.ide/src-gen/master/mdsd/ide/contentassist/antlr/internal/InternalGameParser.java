package master.mdsd.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import master.mdsd.services.GameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGameParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'{'", "'}'", "'('", "')'", "'if'", "'else'", "'.'", "'='", "'Ammunition'", "'Attackspeed'", "'Bullet'", "','", "'Map'", "'Character'", "'Object'", "'Pathfinding'", "'self'", "'<'", "'>'", "'<='", "'>='", "'*'", "'+'", "'-'", "'/'", "'Attack'", "'Initializer'", "'random'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(GameGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalGame.g:54:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalGame.g:55:1: ( ruleModel EOF )
            // InternalGame.g:56:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGame.g:63:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:67:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalGame.g:68:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalGame.g:68:2: ( ( rule__Model__Group__0 ) )
            // InternalGame.g:69:3: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // InternalGame.g:70:3: ( rule__Model__Group__0 )
            // InternalGame.g:70:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGameMap"
    // InternalGame.g:79:1: entryRuleGameMap : ruleGameMap EOF ;
    public final void entryRuleGameMap() throws RecognitionException {
        try {
            // InternalGame.g:80:1: ( ruleGameMap EOF )
            // InternalGame.g:81:1: ruleGameMap EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGameMapRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGameMap();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGameMapRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGameMap"


    // $ANTLR start "ruleGameMap"
    // InternalGame.g:88:1: ruleGameMap : ( ( rule__GameMap__Group__0 ) ) ;
    public final void ruleGameMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:92:2: ( ( ( rule__GameMap__Group__0 ) ) )
            // InternalGame.g:93:2: ( ( rule__GameMap__Group__0 ) )
            {
            // InternalGame.g:93:2: ( ( rule__GameMap__Group__0 ) )
            // InternalGame.g:94:3: ( rule__GameMap__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGameMapAccess().getGroup()); 
            }
            // InternalGame.g:95:3: ( rule__GameMap__Group__0 )
            // InternalGame.g:95:4: rule__GameMap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GameMap__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGameMapAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGameMap"


    // $ANTLR start "entryRuleAttribute"
    // InternalGame.g:104:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalGame.g:105:1: ( ruleAttribute EOF )
            // InternalGame.g:106:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalGame.g:113:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:117:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalGame.g:118:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalGame.g:118:2: ( ( rule__Attribute__Group__0 ) )
            // InternalGame.g:119:3: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // InternalGame.g:120:3: ( rule__Attribute__Group__0 )
            // InternalGame.g:120:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEntity"
    // InternalGame.g:129:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalGame.g:130:1: ( ruleEntity EOF )
            // InternalGame.g:131:1: ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalGame.g:138:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:142:2: ( ( ( rule__Entity__Alternatives ) ) )
            // InternalGame.g:143:2: ( ( rule__Entity__Alternatives ) )
            {
            // InternalGame.g:143:2: ( ( rule__Entity__Alternatives ) )
            // InternalGame.g:144:3: ( rule__Entity__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getAlternatives()); 
            }
            // InternalGame.g:145:3: ( rule__Entity__Alternatives )
            // InternalGame.g:145:4: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleDynamicEntity"
    // InternalGame.g:154:1: entryRuleDynamicEntity : ruleDynamicEntity EOF ;
    public final void entryRuleDynamicEntity() throws RecognitionException {
        try {
            // InternalGame.g:155:1: ( ruleDynamicEntity EOF )
            // InternalGame.g:156:1: ruleDynamicEntity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDynamicEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDynamicEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDynamicEntityRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDynamicEntity"


    // $ANTLR start "ruleDynamicEntity"
    // InternalGame.g:163:1: ruleDynamicEntity : ( ( rule__DynamicEntity__Alternatives ) ) ;
    public final void ruleDynamicEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:167:2: ( ( ( rule__DynamicEntity__Alternatives ) ) )
            // InternalGame.g:168:2: ( ( rule__DynamicEntity__Alternatives ) )
            {
            // InternalGame.g:168:2: ( ( rule__DynamicEntity__Alternatives ) )
            // InternalGame.g:169:3: ( rule__DynamicEntity__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDynamicEntityAccess().getAlternatives()); 
            }
            // InternalGame.g:170:3: ( rule__DynamicEntity__Alternatives )
            // InternalGame.g:170:4: rule__DynamicEntity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDynamicEntityAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDynamicEntity"


    // $ANTLR start "entryRuleStaticEntity"
    // InternalGame.g:179:1: entryRuleStaticEntity : ruleStaticEntity EOF ;
    public final void entryRuleStaticEntity() throws RecognitionException {
        try {
            // InternalGame.g:180:1: ( ruleStaticEntity EOF )
            // InternalGame.g:181:1: ruleStaticEntity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStaticEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticEntityRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStaticEntity"


    // $ANTLR start "ruleStaticEntity"
    // InternalGame.g:188:1: ruleStaticEntity : ( ( rule__StaticEntity__Alternatives ) ) ;
    public final void ruleStaticEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:192:2: ( ( ( rule__StaticEntity__Alternatives ) ) )
            // InternalGame.g:193:2: ( ( rule__StaticEntity__Alternatives ) )
            {
            // InternalGame.g:193:2: ( ( rule__StaticEntity__Alternatives ) )
            // InternalGame.g:194:3: ( rule__StaticEntity__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStaticEntityAccess().getAlternatives()); 
            }
            // InternalGame.g:195:3: ( rule__StaticEntity__Alternatives )
            // InternalGame.g:195:4: rule__StaticEntity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StaticEntity__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStaticEntityAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStaticEntity"


    // $ANTLR start "entryRuleCharacter"
    // InternalGame.g:204:1: entryRuleCharacter : ruleCharacter EOF ;
    public final void entryRuleCharacter() throws RecognitionException {
        try {
            // InternalGame.g:205:1: ( ruleCharacter EOF )
            // InternalGame.g:206:1: ruleCharacter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCharacter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharacter"


    // $ANTLR start "ruleCharacter"
    // InternalGame.g:213:1: ruleCharacter : ( ( rule__Character__Group__0 ) ) ;
    public final void ruleCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:217:2: ( ( ( rule__Character__Group__0 ) ) )
            // InternalGame.g:218:2: ( ( rule__Character__Group__0 ) )
            {
            // InternalGame.g:218:2: ( ( rule__Character__Group__0 ) )
            // InternalGame.g:219:3: ( rule__Character__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getGroup()); 
            }
            // InternalGame.g:220:3: ( rule__Character__Group__0 )
            // InternalGame.g:220:4: rule__Character__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Character__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacter"


    // $ANTLR start "entryRuleType"
    // InternalGame.g:229:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalGame.g:230:1: ( ruleType EOF )
            // InternalGame.g:231:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalGame.g:238:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:242:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalGame.g:243:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalGame.g:243:2: ( ( rule__Type__Alternatives ) )
            // InternalGame.g:244:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalGame.g:245:3: ( rule__Type__Alternatives )
            // InternalGame.g:245:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleVECTOR"
    // InternalGame.g:254:1: entryRuleVECTOR : ruleVECTOR EOF ;
    public final void entryRuleVECTOR() throws RecognitionException {
        try {
            // InternalGame.g:255:1: ( ruleVECTOR EOF )
            // InternalGame.g:256:1: ruleVECTOR EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVECTORRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVECTOR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVECTORRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVECTOR"


    // $ANTLR start "ruleVECTOR"
    // InternalGame.g:263:1: ruleVECTOR : ( ( rule__VECTOR__Group__0 ) ) ;
    public final void ruleVECTOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:267:2: ( ( ( rule__VECTOR__Group__0 ) ) )
            // InternalGame.g:268:2: ( ( rule__VECTOR__Group__0 ) )
            {
            // InternalGame.g:268:2: ( ( rule__VECTOR__Group__0 ) )
            // InternalGame.g:269:3: ( rule__VECTOR__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVECTORAccess().getGroup()); 
            }
            // InternalGame.g:270:3: ( rule__VECTOR__Group__0 )
            // InternalGame.g:270:4: rule__VECTOR__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VECTOR__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVECTORAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVECTOR"


    // $ANTLR start "entryRuleINTORDEC"
    // InternalGame.g:279:1: entryRuleINTORDEC : ruleINTORDEC EOF ;
    public final void entryRuleINTORDEC() throws RecognitionException {
        try {
            // InternalGame.g:280:1: ( ruleINTORDEC EOF )
            // InternalGame.g:281:1: ruleINTORDEC EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTORDECRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleINTORDEC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINTORDECRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleINTORDEC"


    // $ANTLR start "ruleINTORDEC"
    // InternalGame.g:288:1: ruleINTORDEC : ( ( rule__INTORDEC__Alternatives ) ) ;
    public final void ruleINTORDEC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:292:2: ( ( ( rule__INTORDEC__Alternatives ) ) )
            // InternalGame.g:293:2: ( ( rule__INTORDEC__Alternatives ) )
            {
            // InternalGame.g:293:2: ( ( rule__INTORDEC__Alternatives ) )
            // InternalGame.g:294:3: ( rule__INTORDEC__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTORDECAccess().getAlternatives()); 
            }
            // InternalGame.g:295:3: ( rule__INTORDEC__Alternatives )
            // InternalGame.g:295:4: rule__INTORDEC__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__INTORDEC__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getINTORDECAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleINTORDEC"


    // $ANTLR start "entryRuleCharType"
    // InternalGame.g:304:1: entryRuleCharType : ruleCharType EOF ;
    public final void entryRuleCharType() throws RecognitionException {
        try {
            // InternalGame.g:305:1: ( ruleCharType EOF )
            // InternalGame.g:306:1: ruleCharType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCharType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharType"


    // $ANTLR start "ruleCharType"
    // InternalGame.g:313:1: ruleCharType : ( ( rule__CharType__CharTypeIdAssignment ) ) ;
    public final void ruleCharType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:317:2: ( ( ( rule__CharType__CharTypeIdAssignment ) ) )
            // InternalGame.g:318:2: ( ( rule__CharType__CharTypeIdAssignment ) )
            {
            // InternalGame.g:318:2: ( ( rule__CharType__CharTypeIdAssignment ) )
            // InternalGame.g:319:3: ( rule__CharType__CharTypeIdAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharTypeAccess().getCharTypeIdAssignment()); 
            }
            // InternalGame.g:320:3: ( rule__CharType__CharTypeIdAssignment )
            // InternalGame.g:320:4: rule__CharType__CharTypeIdAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CharType__CharTypeIdAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharTypeAccess().getCharTypeIdAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharType"


    // $ANTLR start "entryRuleObject"
    // InternalGame.g:329:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalGame.g:330:1: ( ruleObject EOF )
            // InternalGame.g:331:1: ruleObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalGame.g:338:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:342:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalGame.g:343:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalGame.g:343:2: ( ( rule__Object__Group__0 ) )
            // InternalGame.g:344:3: ( rule__Object__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getGroup()); 
            }
            // InternalGame.g:345:3: ( rule__Object__Group__0 )
            // InternalGame.g:345:4: rule__Object__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleBehaviour"
    // InternalGame.g:354:1: entryRuleBehaviour : ruleBehaviour EOF ;
    public final void entryRuleBehaviour() throws RecognitionException {
        try {
            // InternalGame.g:355:1: ( ruleBehaviour EOF )
            // InternalGame.g:356:1: ruleBehaviour EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviourRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBehaviour();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviourRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBehaviour"


    // $ANTLR start "ruleBehaviour"
    // InternalGame.g:363:1: ruleBehaviour : ( ( rule__Behaviour__Alternatives ) ) ;
    public final void ruleBehaviour() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:367:2: ( ( ( rule__Behaviour__Alternatives ) ) )
            // InternalGame.g:368:2: ( ( rule__Behaviour__Alternatives ) )
            {
            // InternalGame.g:368:2: ( ( rule__Behaviour__Alternatives ) )
            // InternalGame.g:369:3: ( rule__Behaviour__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviourAccess().getAlternatives()); 
            }
            // InternalGame.g:370:3: ( rule__Behaviour__Alternatives )
            // InternalGame.g:370:4: rule__Behaviour__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Behaviour__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviourAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehaviour"


    // $ANTLR start "entryRulePathfinding"
    // InternalGame.g:379:1: entryRulePathfinding : rulePathfinding EOF ;
    public final void entryRulePathfinding() throws RecognitionException {
        try {
            // InternalGame.g:380:1: ( rulePathfinding EOF )
            // InternalGame.g:381:1: rulePathfinding EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathfindingRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePathfinding();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathfindingRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePathfinding"


    // $ANTLR start "rulePathfinding"
    // InternalGame.g:388:1: rulePathfinding : ( ( rule__Pathfinding__Group__0 ) ) ;
    public final void rulePathfinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:392:2: ( ( ( rule__Pathfinding__Group__0 ) ) )
            // InternalGame.g:393:2: ( ( rule__Pathfinding__Group__0 ) )
            {
            // InternalGame.g:393:2: ( ( rule__Pathfinding__Group__0 ) )
            // InternalGame.g:394:3: ( rule__Pathfinding__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathfindingAccess().getGroup()); 
            }
            // InternalGame.g:395:3: ( rule__Pathfinding__Group__0 )
            // InternalGame.g:395:4: rule__Pathfinding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pathfinding__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathfindingAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePathfinding"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalGame.g:404:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // InternalGame.g:405:1: ( ruleBooleanExpression EOF )
            // InternalGame.g:406:1: ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalGame.g:413:1: ruleBooleanExpression : ( ( rule__BooleanExpression__Group__0 ) ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:417:2: ( ( ( rule__BooleanExpression__Group__0 ) ) )
            // InternalGame.g:418:2: ( ( rule__BooleanExpression__Group__0 ) )
            {
            // InternalGame.g:418:2: ( ( rule__BooleanExpression__Group__0 ) )
            // InternalGame.g:419:3: ( rule__BooleanExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getGroup()); 
            }
            // InternalGame.g:420:3: ( rule__BooleanExpression__Group__0 )
            // InternalGame.g:420:4: rule__BooleanExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleExpression"
    // InternalGame.g:429:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalGame.g:430:1: ( ruleExpression EOF )
            // InternalGame.g:431:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalGame.g:438:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:442:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalGame.g:443:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalGame.g:443:2: ( ( rule__Expression__Group__0 ) )
            // InternalGame.g:444:3: ( rule__Expression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup()); 
            }
            // InternalGame.g:445:3: ( rule__Expression__Group__0 )
            // InternalGame.g:445:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalGame.g:454:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // InternalGame.g:455:1: ( ruleTerminalExpression EOF )
            // InternalGame.g:456:1: ruleTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalGame.g:463:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:467:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // InternalGame.g:468:2: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // InternalGame.g:468:2: ( ( rule__TerminalExpression__Alternatives ) )
            // InternalGame.g:469:3: ( rule__TerminalExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            }
            // InternalGame.g:470:3: ( rule__TerminalExpression__Alternatives )
            // InternalGame.g:470:4: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleCondition"
    // InternalGame.g:479:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalGame.g:480:1: ( ruleCondition EOF )
            // InternalGame.g:481:1: ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGame.g:488:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:492:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalGame.g:493:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalGame.g:493:2: ( ( rule__Condition__Group__0 ) )
            // InternalGame.g:494:3: ( rule__Condition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup()); 
            }
            // InternalGame.g:495:3: ( rule__Condition__Group__0 )
            // InternalGame.g:495:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalGame.g:504:1: entryRuleDECIMAL : ruleDECIMAL EOF ;
    public final void entryRuleDECIMAL() throws RecognitionException {
        try {
            // InternalGame.g:505:1: ( ruleDECIMAL EOF )
            // InternalGame.g:506:1: ruleDECIMAL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDECIMAL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDECIMALRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // InternalGame.g:513:1: ruleDECIMAL : ( ( rule__DECIMAL__Group__0 ) ) ;
    public final void ruleDECIMAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:517:2: ( ( ( rule__DECIMAL__Group__0 ) ) )
            // InternalGame.g:518:2: ( ( rule__DECIMAL__Group__0 ) )
            {
            // InternalGame.g:518:2: ( ( rule__DECIMAL__Group__0 ) )
            // InternalGame.g:519:3: ( rule__DECIMAL__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getGroup()); 
            }
            // InternalGame.g:520:3: ( rule__DECIMAL__Group__0 )
            // InternalGame.g:520:4: rule__DECIMAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDECIMALAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDECIMAL"


    // $ANTLR start "entryRuleReferenceCharacter"
    // InternalGame.g:529:1: entryRuleReferenceCharacter : ruleReferenceCharacter EOF ;
    public final void entryRuleReferenceCharacter() throws RecognitionException {
        try {
            // InternalGame.g:530:1: ( ruleReferenceCharacter EOF )
            // InternalGame.g:531:1: ruleReferenceCharacter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCharacterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReferenceCharacter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCharacterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReferenceCharacter"


    // $ANTLR start "ruleReferenceCharacter"
    // InternalGame.g:538:1: ruleReferenceCharacter : ( ( rule__ReferenceCharacter__Alternatives ) ) ;
    public final void ruleReferenceCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:542:2: ( ( ( rule__ReferenceCharacter__Alternatives ) ) )
            // InternalGame.g:543:2: ( ( rule__ReferenceCharacter__Alternatives ) )
            {
            // InternalGame.g:543:2: ( ( rule__ReferenceCharacter__Alternatives ) )
            // InternalGame.g:544:3: ( rule__ReferenceCharacter__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCharacterAccess().getAlternatives()); 
            }
            // InternalGame.g:545:3: ( rule__ReferenceCharacter__Alternatives )
            // InternalGame.g:545:4: rule__ReferenceCharacter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceCharacter__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCharacterAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferenceCharacter"


    // $ANTLR start "entryRuleCompOperator"
    // InternalGame.g:554:1: entryRuleCompOperator : ruleCompOperator EOF ;
    public final void entryRuleCompOperator() throws RecognitionException {
        try {
            // InternalGame.g:555:1: ( ruleCompOperator EOF )
            // InternalGame.g:556:1: ruleCompOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCompOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompOperator"


    // $ANTLR start "ruleCompOperator"
    // InternalGame.g:563:1: ruleCompOperator : ( ( rule__CompOperator__Alternatives ) ) ;
    public final void ruleCompOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:567:2: ( ( ( rule__CompOperator__Alternatives ) ) )
            // InternalGame.g:568:2: ( ( rule__CompOperator__Alternatives ) )
            {
            // InternalGame.g:568:2: ( ( rule__CompOperator__Alternatives ) )
            // InternalGame.g:569:3: ( rule__CompOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getAlternatives()); 
            }
            // InternalGame.g:570:3: ( rule__CompOperator__Alternatives )
            // InternalGame.g:570:4: rule__CompOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompOperator"


    // $ANTLR start "entryRuleAction"
    // InternalGame.g:579:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalGame.g:580:1: ( ruleAction EOF )
            // InternalGame.g:581:1: ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalGame.g:588:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:592:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalGame.g:593:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalGame.g:593:2: ( ( rule__Action__Group__0 ) )
            // InternalGame.g:594:3: ( rule__Action__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup()); 
            }
            // InternalGame.g:595:3: ( rule__Action__Group__0 )
            // InternalGame.g:595:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCharDec"
    // InternalGame.g:604:1: entryRuleCharDec : ruleCharDec EOF ;
    public final void entryRuleCharDec() throws RecognitionException {
        try {
            // InternalGame.g:605:1: ( ruleCharDec EOF )
            // InternalGame.g:606:1: ruleCharDec EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharDecRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCharDec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharDecRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharDec"


    // $ANTLR start "ruleCharDec"
    // InternalGame.g:613:1: ruleCharDec : ( ( rule__CharDec__Alternatives ) ) ;
    public final void ruleCharDec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:617:2: ( ( ( rule__CharDec__Alternatives ) ) )
            // InternalGame.g:618:2: ( ( rule__CharDec__Alternatives ) )
            {
            // InternalGame.g:618:2: ( ( rule__CharDec__Alternatives ) )
            // InternalGame.g:619:3: ( rule__CharDec__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharDecAccess().getAlternatives()); 
            }
            // InternalGame.g:620:3: ( rule__CharDec__Alternatives )
            // InternalGame.g:620:4: rule__CharDec__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CharDec__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharDecAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharDec"


    // $ANTLR start "entryRuleCharacterAttr"
    // InternalGame.g:629:1: entryRuleCharacterAttr : ruleCharacterAttr EOF ;
    public final void entryRuleCharacterAttr() throws RecognitionException {
        try {
            // InternalGame.g:630:1: ( ruleCharacterAttr EOF )
            // InternalGame.g:631:1: ruleCharacterAttr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAttrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCharacterAttr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAttrRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharacterAttr"


    // $ANTLR start "ruleCharacterAttr"
    // InternalGame.g:638:1: ruleCharacterAttr : ( ( rule__CharacterAttr__Group__0 ) ) ;
    public final void ruleCharacterAttr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:642:2: ( ( ( rule__CharacterAttr__Group__0 ) ) )
            // InternalGame.g:643:2: ( ( rule__CharacterAttr__Group__0 ) )
            {
            // InternalGame.g:643:2: ( ( rule__CharacterAttr__Group__0 ) )
            // InternalGame.g:644:3: ( rule__CharacterAttr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAttrAccess().getGroup()); 
            }
            // InternalGame.g:645:3: ( rule__CharacterAttr__Group__0 )
            // InternalGame.g:645:4: rule__CharacterAttr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CharacterAttr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAttrAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacterAttr"


    // $ANTLR start "entryRuleLogicOperator"
    // InternalGame.g:654:1: entryRuleLogicOperator : ruleLogicOperator EOF ;
    public final void entryRuleLogicOperator() throws RecognitionException {
        try {
            // InternalGame.g:655:1: ( ruleLogicOperator EOF )
            // InternalGame.g:656:1: ruleLogicOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLogicOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogicOperator"


    // $ANTLR start "ruleLogicOperator"
    // InternalGame.g:663:1: ruleLogicOperator : ( ( rule__LogicOperator__Alternatives ) ) ;
    public final void ruleLogicOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:667:2: ( ( ( rule__LogicOperator__Alternatives ) ) )
            // InternalGame.g:668:2: ( ( rule__LogicOperator__Alternatives ) )
            {
            // InternalGame.g:668:2: ( ( rule__LogicOperator__Alternatives ) )
            // InternalGame.g:669:3: ( rule__LogicOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getAlternatives()); 
            }
            // InternalGame.g:670:3: ( rule__LogicOperator__Alternatives )
            // InternalGame.g:670:4: rule__LogicOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LogicOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicOperator"


    // $ANTLR start "entryRuleAttack"
    // InternalGame.g:679:1: entryRuleAttack : ruleAttack EOF ;
    public final void entryRuleAttack() throws RecognitionException {
        try {
            // InternalGame.g:680:1: ( ruleAttack EOF )
            // InternalGame.g:681:1: ruleAttack EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttackRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttack();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttackRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttack"


    // $ANTLR start "ruleAttack"
    // InternalGame.g:688:1: ruleAttack : ( ( rule__Attack__Group__0 ) ) ;
    public final void ruleAttack() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:692:2: ( ( ( rule__Attack__Group__0 ) ) )
            // InternalGame.g:693:2: ( ( rule__Attack__Group__0 ) )
            {
            // InternalGame.g:693:2: ( ( rule__Attack__Group__0 ) )
            // InternalGame.g:694:3: ( rule__Attack__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttackAccess().getGroup()); 
            }
            // InternalGame.g:695:3: ( rule__Attack__Group__0 )
            // InternalGame.g:695:4: rule__Attack__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attack__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttackAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttack"


    // $ANTLR start "entryRuleAttributeAttack"
    // InternalGame.g:704:1: entryRuleAttributeAttack : ruleAttributeAttack EOF ;
    public final void entryRuleAttributeAttack() throws RecognitionException {
        try {
            // InternalGame.g:705:1: ( ruleAttributeAttack EOF )
            // InternalGame.g:706:1: ruleAttributeAttack EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAttackRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttributeAttack();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAttackRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeAttack"


    // $ANTLR start "ruleAttributeAttack"
    // InternalGame.g:713:1: ruleAttributeAttack : ( ( rule__AttributeAttack__Group__0 ) ) ;
    public final void ruleAttributeAttack() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:717:2: ( ( ( rule__AttributeAttack__Group__0 ) ) )
            // InternalGame.g:718:2: ( ( rule__AttributeAttack__Group__0 ) )
            {
            // InternalGame.g:718:2: ( ( rule__AttributeAttack__Group__0 ) )
            // InternalGame.g:719:3: ( rule__AttributeAttack__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAttackAccess().getGroup()); 
            }
            // InternalGame.g:720:3: ( rule__AttributeAttack__Group__0 )
            // InternalGame.g:720:4: rule__AttributeAttack__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAttack__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAttackAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeAttack"


    // $ANTLR start "entryRuleAttributeTypeAttack"
    // InternalGame.g:729:1: entryRuleAttributeTypeAttack : ruleAttributeTypeAttack EOF ;
    public final void entryRuleAttributeTypeAttack() throws RecognitionException {
        try {
            // InternalGame.g:730:1: ( ruleAttributeTypeAttack EOF )
            // InternalGame.g:731:1: ruleAttributeTypeAttack EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeTypeAttackRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttributeTypeAttack();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeTypeAttackRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeTypeAttack"


    // $ANTLR start "ruleAttributeTypeAttack"
    // InternalGame.g:738:1: ruleAttributeTypeAttack : ( ( rule__AttributeTypeAttack__Alternatives ) ) ;
    public final void ruleAttributeTypeAttack() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:742:2: ( ( ( rule__AttributeTypeAttack__Alternatives ) ) )
            // InternalGame.g:743:2: ( ( rule__AttributeTypeAttack__Alternatives ) )
            {
            // InternalGame.g:743:2: ( ( rule__AttributeTypeAttack__Alternatives ) )
            // InternalGame.g:744:3: ( rule__AttributeTypeAttack__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeTypeAttackAccess().getAlternatives()); 
            }
            // InternalGame.g:745:3: ( rule__AttributeTypeAttack__Alternatives )
            // InternalGame.g:745:4: rule__AttributeTypeAttack__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AttributeTypeAttack__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeTypeAttackAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeTypeAttack"


    // $ANTLR start "entryRuleBullet"
    // InternalGame.g:754:1: entryRuleBullet : ruleBullet EOF ;
    public final void entryRuleBullet() throws RecognitionException {
        try {
            // InternalGame.g:755:1: ( ruleBullet EOF )
            // InternalGame.g:756:1: ruleBullet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBulletRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBullet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBulletRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBullet"


    // $ANTLR start "ruleBullet"
    // InternalGame.g:763:1: ruleBullet : ( ( rule__Bullet__Group__0 ) ) ;
    public final void ruleBullet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:767:2: ( ( ( rule__Bullet__Group__0 ) ) )
            // InternalGame.g:768:2: ( ( rule__Bullet__Group__0 ) )
            {
            // InternalGame.g:768:2: ( ( rule__Bullet__Group__0 ) )
            // InternalGame.g:769:3: ( rule__Bullet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBulletAccess().getGroup()); 
            }
            // InternalGame.g:770:3: ( rule__Bullet__Group__0 )
            // InternalGame.g:770:4: rule__Bullet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bullet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBulletAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBullet"


    // $ANTLR start "entryRuleInitializer"
    // InternalGame.g:779:1: entryRuleInitializer : ruleInitializer EOF ;
    public final void entryRuleInitializer() throws RecognitionException {
        try {
            // InternalGame.g:780:1: ( ruleInitializer EOF )
            // InternalGame.g:781:1: ruleInitializer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInitializerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInitializer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInitializerRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitializer"


    // $ANTLR start "ruleInitializer"
    // InternalGame.g:788:1: ruleInitializer : ( ( rule__Initializer__Group__0 ) ) ;
    public final void ruleInitializer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:792:2: ( ( ( rule__Initializer__Group__0 ) ) )
            // InternalGame.g:793:2: ( ( rule__Initializer__Group__0 ) )
            {
            // InternalGame.g:793:2: ( ( rule__Initializer__Group__0 ) )
            // InternalGame.g:794:3: ( rule__Initializer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInitializerAccess().getGroup()); 
            }
            // InternalGame.g:795:3: ( rule__Initializer__Group__0 )
            // InternalGame.g:795:4: rule__Initializer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Initializer__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInitializerAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitializer"


    // $ANTLR start "entryRuleAttributeInitializer"
    // InternalGame.g:804:1: entryRuleAttributeInitializer : ruleAttributeInitializer EOF ;
    public final void entryRuleAttributeInitializer() throws RecognitionException {
        try {
            // InternalGame.g:805:1: ( ruleAttributeInitializer EOF )
            // InternalGame.g:806:1: ruleAttributeInitializer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeInitializerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttributeInitializer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeInitializerRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeInitializer"


    // $ANTLR start "ruleAttributeInitializer"
    // InternalGame.g:813:1: ruleAttributeInitializer : ( ( rule__AttributeInitializer__Group__0 ) ) ;
    public final void ruleAttributeInitializer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:817:2: ( ( ( rule__AttributeInitializer__Group__0 ) ) )
            // InternalGame.g:818:2: ( ( rule__AttributeInitializer__Group__0 ) )
            {
            // InternalGame.g:818:2: ( ( rule__AttributeInitializer__Group__0 ) )
            // InternalGame.g:819:3: ( rule__AttributeInitializer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeInitializerAccess().getGroup()); 
            }
            // InternalGame.g:820:3: ( rule__AttributeInitializer__Group__0 )
            // InternalGame.g:820:4: rule__AttributeInitializer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeInitializer__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeInitializerAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeInitializer"


    // $ANTLR start "entryRuleTargetRef"
    // InternalGame.g:829:1: entryRuleTargetRef : ruleTargetRef EOF ;
    public final void entryRuleTargetRef() throws RecognitionException {
        try {
            // InternalGame.g:830:1: ( ruleTargetRef EOF )
            // InternalGame.g:831:1: ruleTargetRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTargetRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetRefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTargetRef"


    // $ANTLR start "ruleTargetRef"
    // InternalGame.g:838:1: ruleTargetRef : ( ( rule__TargetRef__Group__0 ) ) ;
    public final void ruleTargetRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:842:2: ( ( ( rule__TargetRef__Group__0 ) ) )
            // InternalGame.g:843:2: ( ( rule__TargetRef__Group__0 ) )
            {
            // InternalGame.g:843:2: ( ( rule__TargetRef__Group__0 ) )
            // InternalGame.g:844:3: ( rule__TargetRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetRefAccess().getGroup()); 
            }
            // InternalGame.g:845:3: ( rule__TargetRef__Group__0 )
            // InternalGame.g:845:4: rule__TargetRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TargetRef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetRefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargetRef"


    // $ANTLR start "entryRuleLocation"
    // InternalGame.g:854:1: entryRuleLocation : ruleLocation EOF ;
    public final void entryRuleLocation() throws RecognitionException {
        try {
            // InternalGame.g:855:1: ( ruleLocation EOF )
            // InternalGame.g:856:1: ruleLocation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLocation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalGame.g:863:1: ruleLocation : ( ( rule__Location__Alternatives ) ) ;
    public final void ruleLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:867:2: ( ( ( rule__Location__Alternatives ) ) )
            // InternalGame.g:868:2: ( ( rule__Location__Alternatives ) )
            {
            // InternalGame.g:868:2: ( ( rule__Location__Alternatives ) )
            // InternalGame.g:869:3: ( rule__Location__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationAccess().getAlternatives()); 
            }
            // InternalGame.g:870:3: ( rule__Location__Alternatives )
            // InternalGame.g:870:4: rule__Location__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Location__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "rule__Entity__Alternatives"
    // InternalGame.g:878:1: rule__Entity__Alternatives : ( ( ruleDynamicEntity ) | ( ruleStaticEntity ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:882:1: ( ( ruleDynamicEntity ) | ( ruleStaticEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22||(LA1_0>=25 && LA1_0<=27)||LA1_0==37) ) {
                alt1=1;
            }
            else if ( (LA1_0==24||LA1_0==38) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGame.g:883:2: ( ruleDynamicEntity )
                    {
                    // InternalGame.g:883:2: ( ruleDynamicEntity )
                    // InternalGame.g:884:3: ruleDynamicEntity
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityAccess().getDynamicEntityParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDynamicEntity();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityAccess().getDynamicEntityParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:889:2: ( ruleStaticEntity )
                    {
                    // InternalGame.g:889:2: ( ruleStaticEntity )
                    // InternalGame.g:890:3: ruleStaticEntity
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityAccess().getStaticEntityParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStaticEntity();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityAccess().getStaticEntityParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Alternatives"


    // $ANTLR start "rule__DynamicEntity__Alternatives"
    // InternalGame.g:899:1: rule__DynamicEntity__Alternatives : ( ( ruleCharacter ) | ( ruleObject ) | ( ruleBehaviour ) );
    public final void rule__DynamicEntity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:903:1: ( ( ruleCharacter ) | ( ruleObject ) | ( ruleBehaviour ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 22:
            case 27:
            case 37:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGame.g:904:2: ( ruleCharacter )
                    {
                    // InternalGame.g:904:2: ( ruleCharacter )
                    // InternalGame.g:905:3: ruleCharacter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDynamicEntityAccess().getCharacterParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCharacter();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDynamicEntityAccess().getCharacterParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:910:2: ( ruleObject )
                    {
                    // InternalGame.g:910:2: ( ruleObject )
                    // InternalGame.g:911:3: ruleObject
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDynamicEntityAccess().getObjectParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleObject();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDynamicEntityAccess().getObjectParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:916:2: ( ruleBehaviour )
                    {
                    // InternalGame.g:916:2: ( ruleBehaviour )
                    // InternalGame.g:917:3: ruleBehaviour
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDynamicEntityAccess().getBehaviourParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBehaviour();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDynamicEntityAccess().getBehaviourParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Alternatives"


    // $ANTLR start "rule__StaticEntity__Alternatives"
    // InternalGame.g:926:1: rule__StaticEntity__Alternatives : ( ( ruleGameMap ) | ( ruleInitializer ) );
    public final void rule__StaticEntity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:930:1: ( ( ruleGameMap ) | ( ruleInitializer ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            else if ( (LA3_0==38) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGame.g:931:2: ( ruleGameMap )
                    {
                    // InternalGame.g:931:2: ( ruleGameMap )
                    // InternalGame.g:932:3: ruleGameMap
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStaticEntityAccess().getGameMapParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGameMap();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStaticEntityAccess().getGameMapParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:937:2: ( ruleInitializer )
                    {
                    // InternalGame.g:937:2: ( ruleInitializer )
                    // InternalGame.g:938:3: ruleInitializer
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStaticEntityAccess().getInitializerParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleInitializer();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStaticEntityAccess().getInitializerParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalGame.g:947:1: rule__Type__Alternatives : ( ( ( rule__Type__ValueIdAssignment_0 ) ) | ( ( rule__Type__ValueIdAssignment_1 ) ) | ( ( rule__Type__ValueIdVecAssignment_2 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:951:1: ( ( ( rule__Type__ValueIdAssignment_0 ) ) | ( ( rule__Type__ValueIdAssignment_1 ) ) | ( ( rule__Type__ValueIdVecAssignment_2 ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                switch ( input.LA(2) ) {
                case RULE_INT:
                    {
                    alt4=3;
                    }
                    break;
                case 18:
                    {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==RULE_INT) ) {
                        int LA4_6 = input.LA(4);

                        if ( (LA4_6==RULE_INT) ) {
                            alt4=3;
                        }
                        else if ( (LA4_6==EOF||LA4_6==RULE_ID||LA4_6==13||(LA4_6>=15 && LA4_6<=16)||(LA4_6>=20 && LA4_6<=23)) ) {
                            alt4=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 13:
                case 15:
                case 16:
                case 20:
                case 21:
                case 22:
                case 23:
                    {
                    alt4=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGame.g:952:2: ( ( rule__Type__ValueIdAssignment_0 ) )
                    {
                    // InternalGame.g:952:2: ( ( rule__Type__ValueIdAssignment_0 ) )
                    // InternalGame.g:953:3: ( rule__Type__ValueIdAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getValueIdAssignment_0()); 
                    }
                    // InternalGame.g:954:3: ( rule__Type__ValueIdAssignment_0 )
                    // InternalGame.g:954:4: rule__Type__ValueIdAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__ValueIdAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getValueIdAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:958:2: ( ( rule__Type__ValueIdAssignment_1 ) )
                    {
                    // InternalGame.g:958:2: ( ( rule__Type__ValueIdAssignment_1 ) )
                    // InternalGame.g:959:3: ( rule__Type__ValueIdAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getValueIdAssignment_1()); 
                    }
                    // InternalGame.g:960:3: ( rule__Type__ValueIdAssignment_1 )
                    // InternalGame.g:960:4: rule__Type__ValueIdAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__ValueIdAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getValueIdAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:964:2: ( ( rule__Type__ValueIdVecAssignment_2 ) )
                    {
                    // InternalGame.g:964:2: ( ( rule__Type__ValueIdVecAssignment_2 ) )
                    // InternalGame.g:965:3: ( rule__Type__ValueIdVecAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getValueIdVecAssignment_2()); 
                    }
                    // InternalGame.g:966:3: ( rule__Type__ValueIdVecAssignment_2 )
                    // InternalGame.g:966:4: rule__Type__ValueIdVecAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__ValueIdVecAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getValueIdVecAssignment_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__INTORDEC__Alternatives"
    // InternalGame.g:974:1: rule__INTORDEC__Alternatives : ( ( RULE_INT ) | ( ruleDECIMAL ) );
    public final void rule__INTORDEC__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:978:1: ( ( RULE_INT ) | ( ruleDECIMAL ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||(LA5_1>=RULE_INT && LA5_1<=RULE_ID)||(LA5_1>=13 && LA5_1<=16)||(LA5_1>=19 && LA5_1<=23)||(LA5_1>=29 && LA5_1<=36)) ) {
                    alt5=1;
                }
                else if ( (LA5_1==18) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGame.g:979:2: ( RULE_INT )
                    {
                    // InternalGame.g:979:2: ( RULE_INT )
                    // InternalGame.g:980:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getINTORDECAccess().getINTTerminalRuleCall_0()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getINTORDECAccess().getINTTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:985:2: ( ruleDECIMAL )
                    {
                    // InternalGame.g:985:2: ( ruleDECIMAL )
                    // InternalGame.g:986:3: ruleDECIMAL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getINTORDECAccess().getDECIMALParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDECIMAL();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getINTORDECAccess().getDECIMALParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INTORDEC__Alternatives"


    // $ANTLR start "rule__Behaviour__Alternatives"
    // InternalGame.g:995:1: rule__Behaviour__Alternatives : ( ( rulePathfinding ) | ( ruleAttack ) | ( ruleBullet ) );
    public final void rule__Behaviour__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:999:1: ( ( rulePathfinding ) | ( ruleAttack ) | ( ruleBullet ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case 37:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalGame.g:1000:2: ( rulePathfinding )
                    {
                    // InternalGame.g:1000:2: ( rulePathfinding )
                    // InternalGame.g:1001:3: rulePathfinding
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBehaviourAccess().getPathfindingParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePathfinding();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBehaviourAccess().getPathfindingParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1006:2: ( ruleAttack )
                    {
                    // InternalGame.g:1006:2: ( ruleAttack )
                    // InternalGame.g:1007:3: ruleAttack
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBehaviourAccess().getAttackParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAttack();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBehaviourAccess().getAttackParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:1012:2: ( ruleBullet )
                    {
                    // InternalGame.g:1012:2: ( ruleBullet )
                    // InternalGame.g:1013:3: ruleBullet
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBehaviourAccess().getBulletParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBullet();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBehaviourAccess().getBulletParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behaviour__Alternatives"


    // $ANTLR start "rule__TerminalExpression__Alternatives"
    // InternalGame.g:1022:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1026:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGame.g:1027:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // InternalGame.g:1027:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // InternalGame.g:1028:3: ( rule__TerminalExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    }
                    // InternalGame.g:1029:3: ( rule__TerminalExpression__Group_0__0 )
                    // InternalGame.g:1029:4: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1033:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // InternalGame.g:1033:2: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // InternalGame.g:1034:3: ( rule__TerminalExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    }
                    // InternalGame.g:1035:3: ( rule__TerminalExpression__Group_1__0 )
                    // InternalGame.g:1035:4: rule__TerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Alternatives"


    // $ANTLR start "rule__ReferenceCharacter__Alternatives"
    // InternalGame.g:1043:1: rule__ReferenceCharacter__Alternatives : ( ( ( rule__ReferenceCharacter__Group_0__0 ) ) | ( ( rule__ReferenceCharacter__Group_1__0 ) ) );
    public final void rule__ReferenceCharacter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1047:1: ( ( ( rule__ReferenceCharacter__Group_0__0 ) ) | ( ( rule__ReferenceCharacter__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==28) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGame.g:1048:2: ( ( rule__ReferenceCharacter__Group_0__0 ) )
                    {
                    // InternalGame.g:1048:2: ( ( rule__ReferenceCharacter__Group_0__0 ) )
                    // InternalGame.g:1049:3: ( rule__ReferenceCharacter__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReferenceCharacterAccess().getGroup_0()); 
                    }
                    // InternalGame.g:1050:3: ( rule__ReferenceCharacter__Group_0__0 )
                    // InternalGame.g:1050:4: rule__ReferenceCharacter__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceCharacter__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReferenceCharacterAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1054:2: ( ( rule__ReferenceCharacter__Group_1__0 ) )
                    {
                    // InternalGame.g:1054:2: ( ( rule__ReferenceCharacter__Group_1__0 ) )
                    // InternalGame.g:1055:3: ( rule__ReferenceCharacter__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReferenceCharacterAccess().getGroup_1()); 
                    }
                    // InternalGame.g:1056:3: ( rule__ReferenceCharacter__Group_1__0 )
                    // InternalGame.g:1056:4: rule__ReferenceCharacter__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferenceCharacter__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReferenceCharacterAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCharacter__Alternatives"


    // $ANTLR start "rule__CompOperator__Alternatives"
    // InternalGame.g:1064:1: rule__CompOperator__Alternatives : ( ( ( rule__CompOperator__Group_0__0 ) ) | ( ( rule__CompOperator__Group_1__0 ) ) | ( ( rule__CompOperator__Group_2__0 ) ) | ( ( rule__CompOperator__Group_3__0 ) ) | ( ( rule__CompOperator__Group_4__0 ) ) );
    public final void rule__CompOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1068:1: ( ( ( rule__CompOperator__Group_0__0 ) ) | ( ( rule__CompOperator__Group_1__0 ) ) | ( ( rule__CompOperator__Group_2__0 ) ) | ( ( rule__CompOperator__Group_3__0 ) ) | ( ( rule__CompOperator__Group_4__0 ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt9=1;
                }
                break;
            case 30:
                {
                alt9=2;
                }
                break;
            case 31:
                {
                alt9=3;
                }
                break;
            case 32:
                {
                alt9=4;
                }
                break;
            case 19:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalGame.g:1069:2: ( ( rule__CompOperator__Group_0__0 ) )
                    {
                    // InternalGame.g:1069:2: ( ( rule__CompOperator__Group_0__0 ) )
                    // InternalGame.g:1070:3: ( rule__CompOperator__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOperatorAccess().getGroup_0()); 
                    }
                    // InternalGame.g:1071:3: ( rule__CompOperator__Group_0__0 )
                    // InternalGame.g:1071:4: rule__CompOperator__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompOperator__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOperatorAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1075:2: ( ( rule__CompOperator__Group_1__0 ) )
                    {
                    // InternalGame.g:1075:2: ( ( rule__CompOperator__Group_1__0 ) )
                    // InternalGame.g:1076:3: ( rule__CompOperator__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOperatorAccess().getGroup_1()); 
                    }
                    // InternalGame.g:1077:3: ( rule__CompOperator__Group_1__0 )
                    // InternalGame.g:1077:4: rule__CompOperator__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompOperator__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOperatorAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:1081:2: ( ( rule__CompOperator__Group_2__0 ) )
                    {
                    // InternalGame.g:1081:2: ( ( rule__CompOperator__Group_2__0 ) )
                    // InternalGame.g:1082:3: ( rule__CompOperator__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOperatorAccess().getGroup_2()); 
                    }
                    // InternalGame.g:1083:3: ( rule__CompOperator__Group_2__0 )
                    // InternalGame.g:1083:4: rule__CompOperator__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompOperator__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOperatorAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGame.g:1087:2: ( ( rule__CompOperator__Group_3__0 ) )
                    {
                    // InternalGame.g:1087:2: ( ( rule__CompOperator__Group_3__0 ) )
                    // InternalGame.g:1088:3: ( rule__CompOperator__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOperatorAccess().getGroup_3()); 
                    }
                    // InternalGame.g:1089:3: ( rule__CompOperator__Group_3__0 )
                    // InternalGame.g:1089:4: rule__CompOperator__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompOperator__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOperatorAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGame.g:1093:2: ( ( rule__CompOperator__Group_4__0 ) )
                    {
                    // InternalGame.g:1093:2: ( ( rule__CompOperator__Group_4__0 ) )
                    // InternalGame.g:1094:3: ( rule__CompOperator__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOperatorAccess().getGroup_4()); 
                    }
                    // InternalGame.g:1095:3: ( rule__CompOperator__Group_4__0 )
                    // InternalGame.g:1095:4: rule__CompOperator__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompOperator__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOperatorAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Alternatives"


    // $ANTLR start "rule__CharDec__Alternatives"
    // InternalGame.g:1103:1: rule__CharDec__Alternatives : ( ( ( rule__CharDec__CharAttResultAssignment_0 ) ) | ( ( rule__CharDec__ValAssignment_1 ) ) );
    public final void rule__CharDec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1107:1: ( ( ( rule__CharDec__CharAttResultAssignment_0 ) ) | ( ( rule__CharDec__ValAssignment_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==28) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INT) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGame.g:1108:2: ( ( rule__CharDec__CharAttResultAssignment_0 ) )
                    {
                    // InternalGame.g:1108:2: ( ( rule__CharDec__CharAttResultAssignment_0 ) )
                    // InternalGame.g:1109:3: ( rule__CharDec__CharAttResultAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCharDecAccess().getCharAttResultAssignment_0()); 
                    }
                    // InternalGame.g:1110:3: ( rule__CharDec__CharAttResultAssignment_0 )
                    // InternalGame.g:1110:4: rule__CharDec__CharAttResultAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CharDec__CharAttResultAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCharDecAccess().getCharAttResultAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1114:2: ( ( rule__CharDec__ValAssignment_1 ) )
                    {
                    // InternalGame.g:1114:2: ( ( rule__CharDec__ValAssignment_1 ) )
                    // InternalGame.g:1115:3: ( rule__CharDec__ValAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCharDecAccess().getValAssignment_1()); 
                    }
                    // InternalGame.g:1116:3: ( rule__CharDec__ValAssignment_1 )
                    // InternalGame.g:1116:4: rule__CharDec__ValAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CharDec__ValAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCharDecAccess().getValAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDec__Alternatives"


    // $ANTLR start "rule__LogicOperator__Alternatives"
    // InternalGame.g:1124:1: rule__LogicOperator__Alternatives : ( ( ( rule__LogicOperator__Group_0__0 ) ) | ( ( rule__LogicOperator__Group_1__0 ) ) | ( ( rule__LogicOperator__Group_2__0 ) ) | ( ( rule__LogicOperator__Group_3__0 ) ) );
    public final void rule__LogicOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1128:1: ( ( ( rule__LogicOperator__Group_0__0 ) ) | ( ( rule__LogicOperator__Group_1__0 ) ) | ( ( rule__LogicOperator__Group_2__0 ) ) | ( ( rule__LogicOperator__Group_3__0 ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt11=1;
                }
                break;
            case 34:
                {
                alt11=2;
                }
                break;
            case 35:
                {
                alt11=3;
                }
                break;
            case 36:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalGame.g:1129:2: ( ( rule__LogicOperator__Group_0__0 ) )
                    {
                    // InternalGame.g:1129:2: ( ( rule__LogicOperator__Group_0__0 ) )
                    // InternalGame.g:1130:3: ( rule__LogicOperator__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getGroup_0()); 
                    }
                    // InternalGame.g:1131:3: ( rule__LogicOperator__Group_0__0 )
                    // InternalGame.g:1131:4: rule__LogicOperator__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicOperator__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOperatorAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1135:2: ( ( rule__LogicOperator__Group_1__0 ) )
                    {
                    // InternalGame.g:1135:2: ( ( rule__LogicOperator__Group_1__0 ) )
                    // InternalGame.g:1136:3: ( rule__LogicOperator__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getGroup_1()); 
                    }
                    // InternalGame.g:1137:3: ( rule__LogicOperator__Group_1__0 )
                    // InternalGame.g:1137:4: rule__LogicOperator__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicOperator__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOperatorAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:1141:2: ( ( rule__LogicOperator__Group_2__0 ) )
                    {
                    // InternalGame.g:1141:2: ( ( rule__LogicOperator__Group_2__0 ) )
                    // InternalGame.g:1142:3: ( rule__LogicOperator__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getGroup_2()); 
                    }
                    // InternalGame.g:1143:3: ( rule__LogicOperator__Group_2__0 )
                    // InternalGame.g:1143:4: rule__LogicOperator__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicOperator__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOperatorAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGame.g:1147:2: ( ( rule__LogicOperator__Group_3__0 ) )
                    {
                    // InternalGame.g:1147:2: ( ( rule__LogicOperator__Group_3__0 ) )
                    // InternalGame.g:1148:3: ( rule__LogicOperator__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getGroup_3()); 
                    }
                    // InternalGame.g:1149:3: ( rule__LogicOperator__Group_3__0 )
                    // InternalGame.g:1149:4: rule__LogicOperator__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicOperator__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOperatorAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__Alternatives"


    // $ANTLR start "rule__AttributeTypeAttack__Alternatives"
    // InternalGame.g:1157:1: rule__AttributeTypeAttack__Alternatives : ( ( ( rule__AttributeTypeAttack__Group_0__0 ) ) | ( ( rule__AttributeTypeAttack__Group_1__0 ) ) | ( ( rule__AttributeTypeAttack__Group_2__0 ) ) );
    public final void rule__AttributeTypeAttack__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1161:1: ( ( ( rule__AttributeTypeAttack__Group_0__0 ) ) | ( ( rule__AttributeTypeAttack__Group_1__0 ) ) | ( ( rule__AttributeTypeAttack__Group_2__0 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt12=1;
                }
                break;
            case 21:
                {
                alt12=2;
                }
                break;
            case 22:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalGame.g:1162:2: ( ( rule__AttributeTypeAttack__Group_0__0 ) )
                    {
                    // InternalGame.g:1162:2: ( ( rule__AttributeTypeAttack__Group_0__0 ) )
                    // InternalGame.g:1163:3: ( rule__AttributeTypeAttack__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAttackAccess().getGroup_0()); 
                    }
                    // InternalGame.g:1164:3: ( rule__AttributeTypeAttack__Group_0__0 )
                    // InternalGame.g:1164:4: rule__AttributeTypeAttack__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeTypeAttack__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAttackAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1168:2: ( ( rule__AttributeTypeAttack__Group_1__0 ) )
                    {
                    // InternalGame.g:1168:2: ( ( rule__AttributeTypeAttack__Group_1__0 ) )
                    // InternalGame.g:1169:3: ( rule__AttributeTypeAttack__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAttackAccess().getGroup_1()); 
                    }
                    // InternalGame.g:1170:3: ( rule__AttributeTypeAttack__Group_1__0 )
                    // InternalGame.g:1170:4: rule__AttributeTypeAttack__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeTypeAttack__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAttackAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:1174:2: ( ( rule__AttributeTypeAttack__Group_2__0 ) )
                    {
                    // InternalGame.g:1174:2: ( ( rule__AttributeTypeAttack__Group_2__0 ) )
                    // InternalGame.g:1175:3: ( rule__AttributeTypeAttack__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAttackAccess().getGroup_2()); 
                    }
                    // InternalGame.g:1176:3: ( rule__AttributeTypeAttack__Group_2__0 )
                    // InternalGame.g:1176:4: rule__AttributeTypeAttack__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeTypeAttack__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAttackAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeTypeAttack__Alternatives"


    // $ANTLR start "rule__Location__Alternatives"
    // InternalGame.g:1184:1: rule__Location__Alternatives : ( ( ( rule__Location__LocationIdAssignment_0 ) ) | ( ( rule__Location__Group_1__0 ) ) );
    public final void rule__Location__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1188:1: ( ( ( rule__Location__LocationIdAssignment_0 ) ) | ( ( rule__Location__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            else if ( (LA13_0==14) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGame.g:1189:2: ( ( rule__Location__LocationIdAssignment_0 ) )
                    {
                    // InternalGame.g:1189:2: ( ( rule__Location__LocationIdAssignment_0 ) )
                    // InternalGame.g:1190:3: ( rule__Location__LocationIdAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLocationAccess().getLocationIdAssignment_0()); 
                    }
                    // InternalGame.g:1191:3: ( rule__Location__LocationIdAssignment_0 )
                    // InternalGame.g:1191:4: rule__Location__LocationIdAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Location__LocationIdAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLocationAccess().getLocationIdAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:1195:2: ( ( rule__Location__Group_1__0 ) )
                    {
                    // InternalGame.g:1195:2: ( ( rule__Location__Group_1__0 ) )
                    // InternalGame.g:1196:3: ( rule__Location__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLocationAccess().getGroup_1()); 
                    }
                    // InternalGame.g:1197:3: ( rule__Location__Group_1__0 )
                    // InternalGame.g:1197:4: rule__Location__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Location__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLocationAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalGame.g:1205:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1209:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalGame.g:1210:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalGame.g:1217:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1221:1: ( ( () ) )
            // InternalGame.g:1222:1: ( () )
            {
            // InternalGame.g:1222:1: ( () )
            // InternalGame.g:1223:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelAction_0()); 
            }
            // InternalGame.g:1224:2: ()
            // InternalGame.g:1224:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getModelAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalGame.g:1232:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1236:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalGame.g:1237:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalGame.g:1244:1: rule__Model__Group__1__Impl : ( 'Game' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1248:1: ( ( 'Game' ) )
            // InternalGame.g:1249:1: ( 'Game' )
            {
            // InternalGame.g:1249:1: ( 'Game' )
            // InternalGame.g:1250:2: 'Game'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGameKeyword_1()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGameKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalGame.g:1259:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1263:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalGame.g:1264:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalGame.g:1271:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1275:1: ( ( '{' ) )
            // InternalGame.g:1276:1: ( '{' )
            {
            // InternalGame.g:1276:1: ( '{' )
            // InternalGame.g:1277:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalGame.g:1286:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1290:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalGame.g:1291:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalGame.g:1298:1: rule__Model__Group__3__Impl : ( ( rule__Model__EntitiesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1302:1: ( ( ( rule__Model__EntitiesAssignment_3 )* ) )
            // InternalGame.g:1303:1: ( ( rule__Model__EntitiesAssignment_3 )* )
            {
            // InternalGame.g:1303:1: ( ( rule__Model__EntitiesAssignment_3 )* )
            // InternalGame.g:1304:2: ( rule__Model__EntitiesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getEntitiesAssignment_3()); 
            }
            // InternalGame.g:1305:2: ( rule__Model__EntitiesAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22||(LA14_0>=24 && LA14_0<=27)||(LA14_0>=37 && LA14_0<=38)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGame.g:1305:3: rule__Model__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__EntitiesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getEntitiesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalGame.g:1313:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1317:1: ( rule__Model__Group__4__Impl )
            // InternalGame.g:1318:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalGame.g:1324:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1328:1: ( ( '}' ) )
            // InternalGame.g:1329:1: ( '}' )
            {
            // InternalGame.g:1329:1: ( '}' )
            // InternalGame.g:1330:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__GameMap__Group__0"
    // InternalGame.g:1340:1: rule__GameMap__Group__0 : rule__GameMap__Group__0__Impl rule__GameMap__Group__1 ;
    public final void rule__GameMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1344:1: ( rule__GameMap__Group__0__Impl rule__GameMap__Group__1 )
            // InternalGame.g:1345:2: rule__GameMap__Group__0__Impl rule__GameMap__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__GameMap__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GameMap__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMap__Group__0"


    // $ANTLR start "rule__GameMap__Group__0__Impl"
    // InternalGame.g:1352:1: rule__GameMap__Group__0__Impl : ( ( rule__GameMap__EntityIdAssignment_0 ) ) ;
    public final void rule__GameMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1356:1: ( ( ( rule__GameMap__EntityIdAssignment_0 ) ) )
            // InternalGame.g:1357:1: ( ( rule__GameMap__EntityIdAssignment_0 ) )
            {
            // InternalGame.g:1357:1: ( ( rule__GameMap__EntityIdAssignment_0 ) )
            // InternalGame.g:1358:2: ( rule__GameMap__EntityIdAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGameMapAccess().getEntityIdAssignment_0()); 
            }
            // InternalGame.g:1359:2: ( rule__GameMap__EntityIdAssignment_0 )
            // InternalGame.g:1359:3: rule__GameMap__EntityIdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GameMap__EntityIdAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGameMapAccess().getEntityIdAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMap__Group__0__Impl"


    // $ANTLR start "rule__GameMap__Group__1"
    // InternalGame.g:1367:1: rule__GameMap__Group__1 : rule__GameMap__Group__1__Impl rule__GameMap__Group__2 ;
    public final void rule__GameMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1371:1: ( rule__GameMap__Group__1__Impl rule__GameMap__Group__2 )
            // InternalGame.g:1372:2: rule__GameMap__Group__1__Impl rule__GameMap__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__GameMap__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GameMap__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMap__Group__1"


    // $ANTLR start "rule__GameMap__Group__1__Impl"
    // InternalGame.g:1379:1: rule__GameMap__Group__1__Impl : ( '{' ) ;
    public final void rule__GameMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1383:1: ( ( '{' ) )
            // InternalGame.g:1384:1: ( '{' )
            {
            // InternalGame.g:1384:1: ( '{' )
            // InternalGame.g:1385:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGameMapAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGameMapAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMap__Group__1__Impl"


    // $ANTLR start "rule__GameMap__Group__2"
    // InternalGame.g:1394:1: rule__GameMap__Group__2 : rule__GameMap__Group__2__Impl rule__GameMap__Group__3 ;
    public final void rule__GameMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1398:1: ( rule__GameMap__Group__2__Impl rule__GameMap__Group__3 )
            // InternalGame.g:1399:2: rule__GameMap__Group__2__Impl rule__GameMap__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__GameMap__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GameMap__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMap__Group__2"


    // $ANTLR start "rule__GameMap__Group__2__Impl"
    // InternalGame.g:1406:1: rule__GameMap__Group__2__Impl : ( ( rule__GameMap__AttributeListAssignment_2 )* ) ;
    public final void rule__GameMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1410:1: ( ( ( rule__GameMap__AttributeListAssignment_2 )* ) )
            // InternalGame.g:1411:1: ( ( rule__GameMap__AttributeListAssignment_2 )* )
            {
            // InternalGame.g:1411:1: ( ( rule__GameMap__AttributeListAssignment_2 )* )
            // InternalGame.g:1412:2: ( rule__GameMap__AttributeListAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGameMapAccess().getAttributeListAssignment_2()); 
            }
            // InternalGame.g:1413:2: ( rule__GameMap__AttributeListAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGame.g:1413:3: rule__GameMap__AttributeListAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__GameMap__AttributeListAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGameMapAccess().getAttributeListAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMap__Group__2__Impl"


    // $ANTLR start "rule__GameMap__Group__3"
    // InternalGame.g:1421:1: rule__GameMap__Group__3 : rule__GameMap__Group__3__Impl ;
    public final void rule__GameMap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1425:1: ( rule__GameMap__Group__3__Impl )
            // InternalGame.g:1426:2: rule__GameMap__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameMap__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMap__Group__3"


    // $ANTLR start "rule__GameMap__Group__3__Impl"
    // InternalGame.g:1432:1: rule__GameMap__Group__3__Impl : ( '}' ) ;
    public final void rule__GameMap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1436:1: ( ( '}' ) )
            // InternalGame.g:1437:1: ( '}' )
            {
            // InternalGame.g:1437:1: ( '}' )
            // InternalGame.g:1438:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGameMapAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGameMapAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMap__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalGame.g:1448:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1452:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalGame.g:1453:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalGame.g:1460:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1464:1: ( ( () ) )
            // InternalGame.g:1465:1: ( () )
            {
            // InternalGame.g:1465:1: ( () )
            // InternalGame.g:1466:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            }
            // InternalGame.g:1467:2: ()
            // InternalGame.g:1467:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalGame.g:1475:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1479:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalGame.g:1480:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalGame.g:1487:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__AttributenameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1491:1: ( ( ( rule__Attribute__AttributenameAssignment_1 ) ) )
            // InternalGame.g:1492:1: ( ( rule__Attribute__AttributenameAssignment_1 ) )
            {
            // InternalGame.g:1492:1: ( ( rule__Attribute__AttributenameAssignment_1 ) )
            // InternalGame.g:1493:2: ( rule__Attribute__AttributenameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAttributenameAssignment_1()); 
            }
            // InternalGame.g:1494:2: ( rule__Attribute__AttributenameAssignment_1 )
            // InternalGame.g:1494:3: rule__Attribute__AttributenameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__AttributenameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getAttributenameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalGame.g:1502:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1506:1: ( rule__Attribute__Group__2__Impl )
            // InternalGame.g:1507:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalGame.g:1513:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1517:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalGame.g:1518:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalGame.g:1518:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalGame.g:1519:2: ( rule__Attribute__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            }
            // InternalGame.g:1520:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalGame.g:1520:3: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Character__Group__0"
    // InternalGame.g:1529:1: rule__Character__Group__0 : rule__Character__Group__0__Impl rule__Character__Group__1 ;
    public final void rule__Character__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1533:1: ( rule__Character__Group__0__Impl rule__Character__Group__1 )
            // InternalGame.g:1534:2: rule__Character__Group__0__Impl rule__Character__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Character__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Character__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__0"


    // $ANTLR start "rule__Character__Group__0__Impl"
    // InternalGame.g:1541:1: rule__Character__Group__0__Impl : ( ( rule__Character__EntityidAssignment_0 ) ) ;
    public final void rule__Character__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1545:1: ( ( ( rule__Character__EntityidAssignment_0 ) ) )
            // InternalGame.g:1546:1: ( ( rule__Character__EntityidAssignment_0 ) )
            {
            // InternalGame.g:1546:1: ( ( rule__Character__EntityidAssignment_0 ) )
            // InternalGame.g:1547:2: ( rule__Character__EntityidAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getEntityidAssignment_0()); 
            }
            // InternalGame.g:1548:2: ( rule__Character__EntityidAssignment_0 )
            // InternalGame.g:1548:3: rule__Character__EntityidAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Character__EntityidAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getEntityidAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__0__Impl"


    // $ANTLR start "rule__Character__Group__1"
    // InternalGame.g:1556:1: rule__Character__Group__1 : rule__Character__Group__1__Impl rule__Character__Group__2 ;
    public final void rule__Character__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1560:1: ( rule__Character__Group__1__Impl rule__Character__Group__2 )
            // InternalGame.g:1561:2: rule__Character__Group__1__Impl rule__Character__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Character__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Character__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__1"


    // $ANTLR start "rule__Character__Group__1__Impl"
    // InternalGame.g:1568:1: rule__Character__Group__1__Impl : ( ( rule__Character__CharIdAssignment_1 ) ) ;
    public final void rule__Character__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1572:1: ( ( ( rule__Character__CharIdAssignment_1 ) ) )
            // InternalGame.g:1573:1: ( ( rule__Character__CharIdAssignment_1 ) )
            {
            // InternalGame.g:1573:1: ( ( rule__Character__CharIdAssignment_1 ) )
            // InternalGame.g:1574:2: ( rule__Character__CharIdAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getCharIdAssignment_1()); 
            }
            // InternalGame.g:1575:2: ( rule__Character__CharIdAssignment_1 )
            // InternalGame.g:1575:3: rule__Character__CharIdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Character__CharIdAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getCharIdAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__1__Impl"


    // $ANTLR start "rule__Character__Group__2"
    // InternalGame.g:1583:1: rule__Character__Group__2 : rule__Character__Group__2__Impl rule__Character__Group__3 ;
    public final void rule__Character__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1587:1: ( rule__Character__Group__2__Impl rule__Character__Group__3 )
            // InternalGame.g:1588:2: rule__Character__Group__2__Impl rule__Character__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Character__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Character__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__2"


    // $ANTLR start "rule__Character__Group__2__Impl"
    // InternalGame.g:1595:1: rule__Character__Group__2__Impl : ( ( rule__Character__NameAssignment_2 ) ) ;
    public final void rule__Character__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1599:1: ( ( ( rule__Character__NameAssignment_2 ) ) )
            // InternalGame.g:1600:1: ( ( rule__Character__NameAssignment_2 ) )
            {
            // InternalGame.g:1600:1: ( ( rule__Character__NameAssignment_2 ) )
            // InternalGame.g:1601:2: ( rule__Character__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getNameAssignment_2()); 
            }
            // InternalGame.g:1602:2: ( rule__Character__NameAssignment_2 )
            // InternalGame.g:1602:3: rule__Character__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Character__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__2__Impl"


    // $ANTLR start "rule__Character__Group__3"
    // InternalGame.g:1610:1: rule__Character__Group__3 : rule__Character__Group__3__Impl rule__Character__Group__4 ;
    public final void rule__Character__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1614:1: ( rule__Character__Group__3__Impl rule__Character__Group__4 )
            // InternalGame.g:1615:2: rule__Character__Group__3__Impl rule__Character__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Character__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Character__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__3"


    // $ANTLR start "rule__Character__Group__3__Impl"
    // InternalGame.g:1622:1: rule__Character__Group__3__Impl : ( '{' ) ;
    public final void rule__Character__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1626:1: ( ( '{' ) )
            // InternalGame.g:1627:1: ( '{' )
            {
            // InternalGame.g:1627:1: ( '{' )
            // InternalGame.g:1628:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__3__Impl"


    // $ANTLR start "rule__Character__Group__4"
    // InternalGame.g:1637:1: rule__Character__Group__4 : rule__Character__Group__4__Impl rule__Character__Group__5 ;
    public final void rule__Character__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1641:1: ( rule__Character__Group__4__Impl rule__Character__Group__5 )
            // InternalGame.g:1642:2: rule__Character__Group__4__Impl rule__Character__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Character__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Character__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__4"


    // $ANTLR start "rule__Character__Group__4__Impl"
    // InternalGame.g:1649:1: rule__Character__Group__4__Impl : ( ( rule__Character__AttAssignment_4 )* ) ;
    public final void rule__Character__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1653:1: ( ( ( rule__Character__AttAssignment_4 )* ) )
            // InternalGame.g:1654:1: ( ( rule__Character__AttAssignment_4 )* )
            {
            // InternalGame.g:1654:1: ( ( rule__Character__AttAssignment_4 )* )
            // InternalGame.g:1655:2: ( rule__Character__AttAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getAttAssignment_4()); 
            }
            // InternalGame.g:1656:2: ( rule__Character__AttAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGame.g:1656:3: rule__Character__AttAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Character__AttAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getAttAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__4__Impl"


    // $ANTLR start "rule__Character__Group__5"
    // InternalGame.g:1664:1: rule__Character__Group__5 : rule__Character__Group__5__Impl ;
    public final void rule__Character__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1668:1: ( rule__Character__Group__5__Impl )
            // InternalGame.g:1669:2: rule__Character__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Character__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__5"


    // $ANTLR start "rule__Character__Group__5__Impl"
    // InternalGame.g:1675:1: rule__Character__Group__5__Impl : ( '}' ) ;
    public final void rule__Character__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1679:1: ( ( '}' ) )
            // InternalGame.g:1680:1: ( '}' )
            {
            // InternalGame.g:1680:1: ( '}' )
            // InternalGame.g:1681:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__5__Impl"


    // $ANTLR start "rule__VECTOR__Group__0"
    // InternalGame.g:1691:1: rule__VECTOR__Group__0 : rule__VECTOR__Group__0__Impl rule__VECTOR__Group__1 ;
    public final void rule__VECTOR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1695:1: ( rule__VECTOR__Group__0__Impl rule__VECTOR__Group__1 )
            // InternalGame.g:1696:2: rule__VECTOR__Group__0__Impl rule__VECTOR__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__VECTOR__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VECTOR__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VECTOR__Group__0"


    // $ANTLR start "rule__VECTOR__Group__0__Impl"
    // InternalGame.g:1703:1: rule__VECTOR__Group__0__Impl : ( ( rule__VECTOR__XValAssignment_0 ) ) ;
    public final void rule__VECTOR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1707:1: ( ( ( rule__VECTOR__XValAssignment_0 ) ) )
            // InternalGame.g:1708:1: ( ( rule__VECTOR__XValAssignment_0 ) )
            {
            // InternalGame.g:1708:1: ( ( rule__VECTOR__XValAssignment_0 ) )
            // InternalGame.g:1709:2: ( rule__VECTOR__XValAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVECTORAccess().getXValAssignment_0()); 
            }
            // InternalGame.g:1710:2: ( rule__VECTOR__XValAssignment_0 )
            // InternalGame.g:1710:3: rule__VECTOR__XValAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VECTOR__XValAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVECTORAccess().getXValAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VECTOR__Group__0__Impl"


    // $ANTLR start "rule__VECTOR__Group__1"
    // InternalGame.g:1718:1: rule__VECTOR__Group__1 : rule__VECTOR__Group__1__Impl ;
    public final void rule__VECTOR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1722:1: ( rule__VECTOR__Group__1__Impl )
            // InternalGame.g:1723:2: rule__VECTOR__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VECTOR__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VECTOR__Group__1"


    // $ANTLR start "rule__VECTOR__Group__1__Impl"
    // InternalGame.g:1729:1: rule__VECTOR__Group__1__Impl : ( ( rule__VECTOR__YValAssignment_1 ) ) ;
    public final void rule__VECTOR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1733:1: ( ( ( rule__VECTOR__YValAssignment_1 ) ) )
            // InternalGame.g:1734:1: ( ( rule__VECTOR__YValAssignment_1 ) )
            {
            // InternalGame.g:1734:1: ( ( rule__VECTOR__YValAssignment_1 ) )
            // InternalGame.g:1735:2: ( rule__VECTOR__YValAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVECTORAccess().getYValAssignment_1()); 
            }
            // InternalGame.g:1736:2: ( rule__VECTOR__YValAssignment_1 )
            // InternalGame.g:1736:3: rule__VECTOR__YValAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VECTOR__YValAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVECTORAccess().getYValAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VECTOR__Group__1__Impl"


    // $ANTLR start "rule__Object__Group__0"
    // InternalGame.g:1745:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1749:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalGame.g:1750:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Object__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0"


    // $ANTLR start "rule__Object__Group__0__Impl"
    // InternalGame.g:1757:1: rule__Object__Group__0__Impl : ( ( rule__Object__EntityidAssignment_0 ) ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1761:1: ( ( ( rule__Object__EntityidAssignment_0 ) ) )
            // InternalGame.g:1762:1: ( ( rule__Object__EntityidAssignment_0 ) )
            {
            // InternalGame.g:1762:1: ( ( rule__Object__EntityidAssignment_0 ) )
            // InternalGame.g:1763:2: ( rule__Object__EntityidAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getEntityidAssignment_0()); 
            }
            // InternalGame.g:1764:2: ( rule__Object__EntityidAssignment_0 )
            // InternalGame.g:1764:3: rule__Object__EntityidAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Object__EntityidAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getEntityidAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0__Impl"


    // $ANTLR start "rule__Object__Group__1"
    // InternalGame.g:1772:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1776:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalGame.g:1777:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Object__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1"


    // $ANTLR start "rule__Object__Group__1__Impl"
    // InternalGame.g:1784:1: rule__Object__Group__1__Impl : ( ( rule__Object__NameAssignment_1 ) ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1788:1: ( ( ( rule__Object__NameAssignment_1 ) ) )
            // InternalGame.g:1789:1: ( ( rule__Object__NameAssignment_1 ) )
            {
            // InternalGame.g:1789:1: ( ( rule__Object__NameAssignment_1 ) )
            // InternalGame.g:1790:2: ( rule__Object__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getNameAssignment_1()); 
            }
            // InternalGame.g:1791:2: ( rule__Object__NameAssignment_1 )
            // InternalGame.g:1791:3: rule__Object__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Object__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1__Impl"


    // $ANTLR start "rule__Object__Group__2"
    // InternalGame.g:1799:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1803:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalGame.g:1804:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Object__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2"


    // $ANTLR start "rule__Object__Group__2__Impl"
    // InternalGame.g:1811:1: rule__Object__Group__2__Impl : ( '{' ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1815:1: ( ( '{' ) )
            // InternalGame.g:1816:1: ( '{' )
            {
            // InternalGame.g:1816:1: ( '{' )
            // InternalGame.g:1817:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2__Impl"


    // $ANTLR start "rule__Object__Group__3"
    // InternalGame.g:1826:1: rule__Object__Group__3 : rule__Object__Group__3__Impl rule__Object__Group__4 ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1830:1: ( rule__Object__Group__3__Impl rule__Object__Group__4 )
            // InternalGame.g:1831:2: rule__Object__Group__3__Impl rule__Object__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Object__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Object__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3"


    // $ANTLR start "rule__Object__Group__3__Impl"
    // InternalGame.g:1838:1: rule__Object__Group__3__Impl : ( ( rule__Object__AttAssignment_3 )* ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1842:1: ( ( ( rule__Object__AttAssignment_3 )* ) )
            // InternalGame.g:1843:1: ( ( rule__Object__AttAssignment_3 )* )
            {
            // InternalGame.g:1843:1: ( ( rule__Object__AttAssignment_3 )* )
            // InternalGame.g:1844:2: ( rule__Object__AttAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getAttAssignment_3()); 
            }
            // InternalGame.g:1845:2: ( rule__Object__AttAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGame.g:1845:3: rule__Object__AttAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Object__AttAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getAttAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3__Impl"


    // $ANTLR start "rule__Object__Group__4"
    // InternalGame.g:1853:1: rule__Object__Group__4 : rule__Object__Group__4__Impl ;
    public final void rule__Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1857:1: ( rule__Object__Group__4__Impl )
            // InternalGame.g:1858:2: rule__Object__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__4"


    // $ANTLR start "rule__Object__Group__4__Impl"
    // InternalGame.g:1864:1: rule__Object__Group__4__Impl : ( '}' ) ;
    public final void rule__Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1868:1: ( ( '}' ) )
            // InternalGame.g:1869:1: ( '}' )
            {
            // InternalGame.g:1869:1: ( '}' )
            // InternalGame.g:1870:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__4__Impl"


    // $ANTLR start "rule__Pathfinding__Group__0"
    // InternalGame.g:1880:1: rule__Pathfinding__Group__0 : rule__Pathfinding__Group__0__Impl rule__Pathfinding__Group__1 ;
    public final void rule__Pathfinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1884:1: ( rule__Pathfinding__Group__0__Impl rule__Pathfinding__Group__1 )
            // InternalGame.g:1885:2: rule__Pathfinding__Group__0__Impl rule__Pathfinding__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Pathfinding__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pathfinding__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pathfinding__Group__0"


    // $ANTLR start "rule__Pathfinding__Group__0__Impl"
    // InternalGame.g:1892:1: rule__Pathfinding__Group__0__Impl : ( ( rule__Pathfinding__EntityidAssignment_0 ) ) ;
    public final void rule__Pathfinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1896:1: ( ( ( rule__Pathfinding__EntityidAssignment_0 ) ) )
            // InternalGame.g:1897:1: ( ( rule__Pathfinding__EntityidAssignment_0 ) )
            {
            // InternalGame.g:1897:1: ( ( rule__Pathfinding__EntityidAssignment_0 ) )
            // InternalGame.g:1898:2: ( rule__Pathfinding__EntityidAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathfindingAccess().getEntityidAssignment_0()); 
            }
            // InternalGame.g:1899:2: ( rule__Pathfinding__EntityidAssignment_0 )
            // InternalGame.g:1899:3: rule__Pathfinding__EntityidAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Pathfinding__EntityidAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathfindingAccess().getEntityidAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pathfinding__Group__0__Impl"


    // $ANTLR start "rule__Pathfinding__Group__1"
    // InternalGame.g:1907:1: rule__Pathfinding__Group__1 : rule__Pathfinding__Group__1__Impl rule__Pathfinding__Group__2 ;
    public final void rule__Pathfinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1911:1: ( rule__Pathfinding__Group__1__Impl rule__Pathfinding__Group__2 )
            // InternalGame.g:1912:2: rule__Pathfinding__Group__1__Impl rule__Pathfinding__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Pathfinding__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pathfinding__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pathfinding__Group__1"


    // $ANTLR start "rule__Pathfinding__Group__1__Impl"
    // InternalGame.g:1919:1: rule__Pathfinding__Group__1__Impl : ( ( rule__Pathfinding__NameAssignment_1 ) ) ;
    public final void rule__Pathfinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1923:1: ( ( ( rule__Pathfinding__NameAssignment_1 ) ) )
            // InternalGame.g:1924:1: ( ( rule__Pathfinding__NameAssignment_1 ) )
            {
            // InternalGame.g:1924:1: ( ( rule__Pathfinding__NameAssignment_1 ) )
            // InternalGame.g:1925:2: ( rule__Pathfinding__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathfindingAccess().getNameAssignment_1()); 
            }
            // InternalGame.g:1926:2: ( rule__Pathfinding__NameAssignment_1 )
            // InternalGame.g:1926:3: rule__Pathfinding__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pathfinding__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathfindingAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pathfinding__Group__1__Impl"


    // $ANTLR start "rule__Pathfinding__Group__2"
    // InternalGame.g:1934:1: rule__Pathfinding__Group__2 : rule__Pathfinding__Group__2__Impl rule__Pathfinding__Group__3 ;
    public final void rule__Pathfinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1938:1: ( rule__Pathfinding__Group__2__Impl rule__Pathfinding__Group__3 )
            // InternalGame.g:1939:2: rule__Pathfinding__Group__2__Impl rule__Pathfinding__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Pathfinding__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pathfinding__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pathfinding__Group__2"


    // $ANTLR start "rule__Pathfinding__Group__2__Impl"
    // InternalGame.g:1946:1: rule__Pathfinding__Group__2__Impl : ( '{' ) ;
    public final void rule__Pathfinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1950:1: ( ( '{' ) )
            // InternalGame.g:1951:1: ( '{' )
            {
            // InternalGame.g:1951:1: ( '{' )
            // InternalGame.g:1952:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathfindingAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathfindingAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pathfinding__Group__2__Impl"


    // $ANTLR start "rule__Pathfinding__Group__3"
    // InternalGame.g:1961:1: rule__Pathfinding__Group__3 : rule__Pathfinding__Group__3__Impl rule__Pathfinding__Group__4 ;
    public final void rule__Pathfinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1965:1: ( rule__Pathfinding__Group__3__Impl rule__Pathfinding__Group__4 )
            // InternalGame.g:1966:2: rule__Pathfinding__Group__3__Impl rule__Pathfinding__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Pathfinding__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pathfinding__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pathfinding__Group__3"


    // $ANTLR start "rule__Pathfinding__Group__3__Impl"
    // InternalGame.g:1973:1: rule__Pathfinding__Group__3__Impl : ( ( rule__Pathfinding__AttPathfindingAssignment_3 )* ) ;
    public final void rule__Pathfinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1977:1: ( ( ( rule__Pathfinding__AttPathfindingAssignment_3 )* ) )
            // InternalGame.g:1978:1: ( ( rule__Pathfinding__AttPathfindingAssignment_3 )* )
            {
            // InternalGame.g:1978:1: ( ( rule__Pathfinding__AttPathfindingAssignment_3 )* )
            // InternalGame.g:1979:2: ( rule__Pathfinding__AttPathfindingAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathfindingAccess().getAttPathfindingAssignment_3()); 
            }
            // InternalGame.g:1980:2: ( rule__Pathfinding__AttPathfindingAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGame.g:1980:3: rule__Pathfinding__AttPathfindingAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Pathfinding__AttPathfindingAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathfindingAccess().getAttPathfindingAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pathfinding__Group__3__Impl"


    // $ANTLR start "rule__Pathfinding__Group__4"
    // InternalGame.g:1988:1: rule__Pathfinding__Group__4 : rule__Pathfinding__Group__4__Impl rule__Pathfinding__Group__5 ;
    public final void rule__Pathfinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1992:1: ( rule__Pathfinding__Group__4__Impl rule__Pathfinding__Group__5 )
            // InternalGame.g:1993:2: rule__Pathfinding__Group__4__Impl rule__Pathfinding__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Pathfinding__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pathfinding__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pathfinding__Group__4"


    // $ANTLR start "rule__Pathfinding__Group__4__Impl"
    // InternalGame.g:2000:1: rule__Pathfinding__Group__4__Impl : ( ( rule__Pathfinding__ConditionsAssignment_4 )* ) ;
    public final void rule__Pathfinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2004:1: ( ( ( rule__Pathfinding__ConditionsAssignment_4 )* ) )
            // InternalGame.g:2005:1: ( ( rule__Pathfinding__ConditionsAssignment_4 )* )
            {
            // InternalGame.g:2005:1: ( ( rule__Pathfinding__ConditionsAssignment_4 )* )
            // InternalGame.g:2006:2: ( rule__Pathfinding__ConditionsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathfindingAccess().getConditionsAssignment_4()); 
            }
            // InternalGame.g:2007:2: ( rule__Pathfinding__ConditionsAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==16) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGame.g:2007:3: rule__Pathfinding__ConditionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Pathfinding__ConditionsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathfindingAccess().getConditionsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pathfinding__Group__4__Impl"


    // $ANTLR start "rule__Pathfinding__Group__5"
    // InternalGame.g:2015:1: rule__Pathfinding__Group__5 : rule__Pathfinding__Group__5__Impl ;
    public final void rule__Pathfinding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2019:1: ( rule__Pathfinding__Group__5__Impl )
            // InternalGame.g:2020:2: rule__Pathfinding__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pathfinding__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pathfinding__Group__5"


    // $ANTLR start "rule__Pathfinding__Group__5__Impl"
    // InternalGame.g:2026:1: rule__Pathfinding__Group__5__Impl : ( '}' ) ;
    public final void rule__Pathfinding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2030:1: ( ( '}' ) )
            // InternalGame.g:2031:1: ( '}' )
            {
            // InternalGame.g:2031:1: ( '}' )
            // InternalGame.g:2032:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathfindingAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathfindingAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pathfinding__Group__5__Impl"


    // $ANTLR start "rule__BooleanExpression__Group__0"
    // InternalGame.g:2042:1: rule__BooleanExpression__Group__0 : rule__BooleanExpression__Group__0__Impl rule__BooleanExpression__Group__1 ;
    public final void rule__BooleanExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2046:1: ( rule__BooleanExpression__Group__0__Impl rule__BooleanExpression__Group__1 )
            // InternalGame.g:2047:2: rule__BooleanExpression__Group__0__Impl rule__BooleanExpression__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__BooleanExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__0"


    // $ANTLR start "rule__BooleanExpression__Group__0__Impl"
    // InternalGame.g:2054:1: rule__BooleanExpression__Group__0__Impl : ( ( rule__BooleanExpression__AttributeRefLeftAssignment_0 )? ) ;
    public final void rule__BooleanExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2058:1: ( ( ( rule__BooleanExpression__AttributeRefLeftAssignment_0 )? ) )
            // InternalGame.g:2059:1: ( ( rule__BooleanExpression__AttributeRefLeftAssignment_0 )? )
            {
            // InternalGame.g:2059:1: ( ( rule__BooleanExpression__AttributeRefLeftAssignment_0 )? )
            // InternalGame.g:2060:2: ( rule__BooleanExpression__AttributeRefLeftAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getAttributeRefLeftAssignment_0()); 
            }
            // InternalGame.g:2061:2: ( rule__BooleanExpression__AttributeRefLeftAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGame.g:2061:3: rule__BooleanExpression__AttributeRefLeftAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanExpression__AttributeRefLeftAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getAttributeRefLeftAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__0__Impl"


    // $ANTLR start "rule__BooleanExpression__Group__1"
    // InternalGame.g:2069:1: rule__BooleanExpression__Group__1 : rule__BooleanExpression__Group__1__Impl rule__BooleanExpression__Group__2 ;
    public final void rule__BooleanExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2073:1: ( rule__BooleanExpression__Group__1__Impl rule__BooleanExpression__Group__2 )
            // InternalGame.g:2074:2: rule__BooleanExpression__Group__1__Impl rule__BooleanExpression__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__BooleanExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__1"


    // $ANTLR start "rule__BooleanExpression__Group__1__Impl"
    // InternalGame.g:2081:1: rule__BooleanExpression__Group__1__Impl : ( ( rule__BooleanExpression__LeftExAssignment_1 )? ) ;
    public final void rule__BooleanExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2085:1: ( ( ( rule__BooleanExpression__LeftExAssignment_1 )? ) )
            // InternalGame.g:2086:1: ( ( rule__BooleanExpression__LeftExAssignment_1 )? )
            {
            // InternalGame.g:2086:1: ( ( rule__BooleanExpression__LeftExAssignment_1 )? )
            // InternalGame.g:2087:2: ( rule__BooleanExpression__LeftExAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getLeftExAssignment_1()); 
            }
            // InternalGame.g:2088:2: ( rule__BooleanExpression__LeftExAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT||LA21_0==14) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGame.g:2088:3: rule__BooleanExpression__LeftExAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanExpression__LeftExAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getLeftExAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__1__Impl"


    // $ANTLR start "rule__BooleanExpression__Group__2"
    // InternalGame.g:2096:1: rule__BooleanExpression__Group__2 : rule__BooleanExpression__Group__2__Impl rule__BooleanExpression__Group__3 ;
    public final void rule__BooleanExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2100:1: ( rule__BooleanExpression__Group__2__Impl rule__BooleanExpression__Group__3 )
            // InternalGame.g:2101:2: rule__BooleanExpression__Group__2__Impl rule__BooleanExpression__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__BooleanExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__2"


    // $ANTLR start "rule__BooleanExpression__Group__2__Impl"
    // InternalGame.g:2108:1: rule__BooleanExpression__Group__2__Impl : ( ( rule__BooleanExpression__OperatorAssignment_2 ) ) ;
    public final void rule__BooleanExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2112:1: ( ( ( rule__BooleanExpression__OperatorAssignment_2 ) ) )
            // InternalGame.g:2113:1: ( ( rule__BooleanExpression__OperatorAssignment_2 ) )
            {
            // InternalGame.g:2113:1: ( ( rule__BooleanExpression__OperatorAssignment_2 ) )
            // InternalGame.g:2114:2: ( rule__BooleanExpression__OperatorAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getOperatorAssignment_2()); 
            }
            // InternalGame.g:2115:2: ( rule__BooleanExpression__OperatorAssignment_2 )
            // InternalGame.g:2115:3: rule__BooleanExpression__OperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__OperatorAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getOperatorAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__2__Impl"


    // $ANTLR start "rule__BooleanExpression__Group__3"
    // InternalGame.g:2123:1: rule__BooleanExpression__Group__3 : rule__BooleanExpression__Group__3__Impl rule__BooleanExpression__Group__4 ;
    public final void rule__BooleanExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2127:1: ( rule__BooleanExpression__Group__3__Impl rule__BooleanExpression__Group__4 )
            // InternalGame.g:2128:2: rule__BooleanExpression__Group__3__Impl rule__BooleanExpression__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__BooleanExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__3"


    // $ANTLR start "rule__BooleanExpression__Group__3__Impl"
    // InternalGame.g:2135:1: rule__BooleanExpression__Group__3__Impl : ( ( rule__BooleanExpression__AttributeRefRightAssignment_3 )? ) ;
    public final void rule__BooleanExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2139:1: ( ( ( rule__BooleanExpression__AttributeRefRightAssignment_3 )? ) )
            // InternalGame.g:2140:1: ( ( rule__BooleanExpression__AttributeRefRightAssignment_3 )? )
            {
            // InternalGame.g:2140:1: ( ( rule__BooleanExpression__AttributeRefRightAssignment_3 )? )
            // InternalGame.g:2141:2: ( rule__BooleanExpression__AttributeRefRightAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getAttributeRefRightAssignment_3()); 
            }
            // InternalGame.g:2142:2: ( rule__BooleanExpression__AttributeRefRightAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGame.g:2142:3: rule__BooleanExpression__AttributeRefRightAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanExpression__AttributeRefRightAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getAttributeRefRightAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__3__Impl"


    // $ANTLR start "rule__BooleanExpression__Group__4"
    // InternalGame.g:2150:1: rule__BooleanExpression__Group__4 : rule__BooleanExpression__Group__4__Impl ;
    public final void rule__BooleanExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2154:1: ( rule__BooleanExpression__Group__4__Impl )
            // InternalGame.g:2155:2: rule__BooleanExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__4"


    // $ANTLR start "rule__BooleanExpression__Group__4__Impl"
    // InternalGame.g:2161:1: rule__BooleanExpression__Group__4__Impl : ( ( rule__BooleanExpression__Group_4__0 )? ) ;
    public final void rule__BooleanExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2165:1: ( ( ( rule__BooleanExpression__Group_4__0 )? ) )
            // InternalGame.g:2166:1: ( ( rule__BooleanExpression__Group_4__0 )? )
            {
            // InternalGame.g:2166:1: ( ( rule__BooleanExpression__Group_4__0 )? )
            // InternalGame.g:2167:2: ( rule__BooleanExpression__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getGroup_4()); 
            }
            // InternalGame.g:2168:2: ( rule__BooleanExpression__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT||LA23_0==14||(LA23_0>=33 && LA23_0<=36)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGame.g:2168:3: rule__BooleanExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__4__Impl"


    // $ANTLR start "rule__BooleanExpression__Group_4__0"
    // InternalGame.g:2177:1: rule__BooleanExpression__Group_4__0 : rule__BooleanExpression__Group_4__0__Impl rule__BooleanExpression__Group_4__1 ;
    public final void rule__BooleanExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2181:1: ( rule__BooleanExpression__Group_4__0__Impl rule__BooleanExpression__Group_4__1 )
            // InternalGame.g:2182:2: rule__BooleanExpression__Group_4__0__Impl rule__BooleanExpression__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__BooleanExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group_4__0"


    // $ANTLR start "rule__BooleanExpression__Group_4__0__Impl"
    // InternalGame.g:2189:1: rule__BooleanExpression__Group_4__0__Impl : ( ( rule__BooleanExpression__OpAssignment_4_0 )? ) ;
    public final void rule__BooleanExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2193:1: ( ( ( rule__BooleanExpression__OpAssignment_4_0 )? ) )
            // InternalGame.g:2194:1: ( ( rule__BooleanExpression__OpAssignment_4_0 )? )
            {
            // InternalGame.g:2194:1: ( ( rule__BooleanExpression__OpAssignment_4_0 )? )
            // InternalGame.g:2195:2: ( rule__BooleanExpression__OpAssignment_4_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getOpAssignment_4_0()); 
            }
            // InternalGame.g:2196:2: ( rule__BooleanExpression__OpAssignment_4_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=33 && LA24_0<=36)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGame.g:2196:3: rule__BooleanExpression__OpAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanExpression__OpAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getOpAssignment_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group_4__0__Impl"


    // $ANTLR start "rule__BooleanExpression__Group_4__1"
    // InternalGame.g:2204:1: rule__BooleanExpression__Group_4__1 : rule__BooleanExpression__Group_4__1__Impl ;
    public final void rule__BooleanExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2208:1: ( rule__BooleanExpression__Group_4__1__Impl )
            // InternalGame.g:2209:2: rule__BooleanExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group_4__1"


    // $ANTLR start "rule__BooleanExpression__Group_4__1__Impl"
    // InternalGame.g:2215:1: rule__BooleanExpression__Group_4__1__Impl : ( ( rule__BooleanExpression__RightExAssignment_4_1 ) ) ;
    public final void rule__BooleanExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2219:1: ( ( ( rule__BooleanExpression__RightExAssignment_4_1 ) ) )
            // InternalGame.g:2220:1: ( ( rule__BooleanExpression__RightExAssignment_4_1 ) )
            {
            // InternalGame.g:2220:1: ( ( rule__BooleanExpression__RightExAssignment_4_1 ) )
            // InternalGame.g:2221:2: ( rule__BooleanExpression__RightExAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getRightExAssignment_4_1()); 
            }
            // InternalGame.g:2222:2: ( rule__BooleanExpression__RightExAssignment_4_1 )
            // InternalGame.g:2222:3: rule__BooleanExpression__RightExAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__RightExAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getRightExAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group_4__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalGame.g:2231:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2235:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalGame.g:2236:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Expression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalGame.g:2243:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__TmAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2247:1: ( ( ( rule__Expression__TmAssignment_0 ) ) )
            // InternalGame.g:2248:1: ( ( rule__Expression__TmAssignment_0 ) )
            {
            // InternalGame.g:2248:1: ( ( rule__Expression__TmAssignment_0 ) )
            // InternalGame.g:2249:2: ( rule__Expression__TmAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getTmAssignment_0()); 
            }
            // InternalGame.g:2250:2: ( rule__Expression__TmAssignment_0 )
            // InternalGame.g:2250:3: rule__Expression__TmAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__TmAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getTmAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalGame.g:2258:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2262:1: ( rule__Expression__Group__1__Impl )
            // InternalGame.g:2263:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalGame.g:2269:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2273:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalGame.g:2274:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalGame.g:2274:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalGame.g:2275:2: ( rule__Expression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getGroup_1()); 
            }
            // InternalGame.g:2276:2: ( rule__Expression__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=33 && LA25_0<=36)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalGame.g:2276:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalGame.g:2285:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2289:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalGame.g:2290:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalGame.g:2297:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2301:1: ( ( () ) )
            // InternalGame.g:2302:1: ( () )
            {
            // InternalGame.g:2302:1: ( () )
            // InternalGame.g:2303:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0()); 
            }
            // InternalGame.g:2304:2: ()
            // InternalGame.g:2304:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOperationLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalGame.g:2312:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2316:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalGame.g:2317:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalGame.g:2324:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OpAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2328:1: ( ( ( rule__Expression__OpAssignment_1_1 ) ) )
            // InternalGame.g:2329:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            {
            // InternalGame.g:2329:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            // InternalGame.g:2330:2: ( rule__Expression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOpAssignment_1_1()); 
            }
            // InternalGame.g:2331:2: ( rule__Expression__OpAssignment_1_1 )
            // InternalGame.g:2331:3: rule__Expression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__2"
    // InternalGame.g:2339:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2343:1: ( rule__Expression__Group_1__2__Impl )
            // InternalGame.g:2344:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__2"


    // $ANTLR start "rule__Expression__Group_1__2__Impl"
    // InternalGame.g:2350:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2354:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // InternalGame.g:2355:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // InternalGame.g:2355:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // InternalGame.g:2356:2: ( rule__Expression__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            }
            // InternalGame.g:2357:2: ( rule__Expression__RightAssignment_1_2 )
            // InternalGame.g:2357:3: rule__Expression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__2__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__0"
    // InternalGame.g:2366:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2370:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // InternalGame.g:2371:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_19);
            rule__TerminalExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__0"


    // $ANTLR start "rule__TerminalExpression__Group_0__0__Impl"
    // InternalGame.g:2378:1: rule__TerminalExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2382:1: ( ( '(' ) )
            // InternalGame.g:2383:1: ( '(' )
            {
            // InternalGame.g:2383:1: ( '(' )
            // InternalGame.g:2384:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__1"
    // InternalGame.g:2393:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2397:1: ( rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 )
            // InternalGame.g:2398:2: rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2
            {
            pushFollow(FOLLOW_20);
            rule__TerminalExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__1"


    // $ANTLR start "rule__TerminalExpression__Group_0__1__Impl"
    // InternalGame.g:2405:1: rule__TerminalExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2409:1: ( ( ruleExpression ) )
            // InternalGame.g:2410:1: ( ruleExpression )
            {
            // InternalGame.g:2410:1: ( ruleExpression )
            // InternalGame.g:2411:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__2"
    // InternalGame.g:2420:1: rule__TerminalExpression__Group_0__2 : rule__TerminalExpression__Group_0__2__Impl ;
    public final void rule__TerminalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2424:1: ( rule__TerminalExpression__Group_0__2__Impl )
            // InternalGame.g:2425:2: rule__TerminalExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__2"


    // $ANTLR start "rule__TerminalExpression__Group_0__2__Impl"
    // InternalGame.g:2431:1: rule__TerminalExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2435:1: ( ( ')' ) )
            // InternalGame.g:2436:1: ( ')' )
            {
            // InternalGame.g:2436:1: ( ')' )
            // InternalGame.g:2437:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__2__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__0"
    // InternalGame.g:2447:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2451:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // InternalGame.g:2452:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__TerminalExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__0"


    // $ANTLR start "rule__TerminalExpression__Group_1__0__Impl"
    // InternalGame.g:2459:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2463:1: ( ( () ) )
            // InternalGame.g:2464:1: ( () )
            {
            // InternalGame.g:2464:1: ( () )
            // InternalGame.g:2465:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_1_0()); 
            }
            // InternalGame.g:2466:2: ()
            // InternalGame.g:2466:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__1"
    // InternalGame.g:2474:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2478:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // InternalGame.g:2479:2: rule__TerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__1"


    // $ANTLR start "rule__TerminalExpression__Group_1__1__Impl"
    // InternalGame.g:2485:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2489:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) )
            // InternalGame.g:2490:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            {
            // InternalGame.g:2490:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            // InternalGame.g:2491:2: ( rule__TerminalExpression__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            }
            // InternalGame.g:2492:2: ( rule__TerminalExpression__ValueAssignment_1_1 )
            // InternalGame.g:2492:3: rule__TerminalExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalGame.g:2501:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2505:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGame.g:2506:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Condition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalGame.g:2513:1: rule__Condition__Group__0__Impl : ( 'if' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2517:1: ( ( 'if' ) )
            // InternalGame.g:2518:1: ( 'if' )
            {
            // InternalGame.g:2518:1: ( 'if' )
            // InternalGame.g:2519:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getIfKeyword_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalGame.g:2528:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2532:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalGame.g:2533:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Condition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalGame.g:2540:1: rule__Condition__Group__1__Impl : ( '(' ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2544:1: ( ( '(' ) )
            // InternalGame.g:2545:1: ( '(' )
            {
            // InternalGame.g:2545:1: ( '(' )
            // InternalGame.g:2546:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalGame.g:2555:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2559:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalGame.g:2560:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Condition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalGame.g:2567:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__IfConditionAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2571:1: ( ( ( rule__Condition__IfConditionAssignment_2 ) ) )
            // InternalGame.g:2572:1: ( ( rule__Condition__IfConditionAssignment_2 ) )
            {
            // InternalGame.g:2572:1: ( ( rule__Condition__IfConditionAssignment_2 ) )
            // InternalGame.g:2573:2: ( rule__Condition__IfConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getIfConditionAssignment_2()); 
            }
            // InternalGame.g:2574:2: ( rule__Condition__IfConditionAssignment_2 )
            // InternalGame.g:2574:3: rule__Condition__IfConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Condition__IfConditionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getIfConditionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // InternalGame.g:2582:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl rule__Condition__Group__4 ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2586:1: ( rule__Condition__Group__3__Impl rule__Condition__Group__4 )
            // InternalGame.g:2587:2: rule__Condition__Group__3__Impl rule__Condition__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Condition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // InternalGame.g:2594:1: rule__Condition__Group__3__Impl : ( ')' ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2598:1: ( ( ')' ) )
            // InternalGame.g:2599:1: ( ')' )
            {
            // InternalGame.g:2599:1: ( ')' )
            // InternalGame.g:2600:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__4"
    // InternalGame.g:2609:1: rule__Condition__Group__4 : rule__Condition__Group__4__Impl rule__Condition__Group__5 ;
    public final void rule__Condition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2613:1: ( rule__Condition__Group__4__Impl rule__Condition__Group__5 )
            // InternalGame.g:2614:2: rule__Condition__Group__4__Impl rule__Condition__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Condition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__4"


    // $ANTLR start "rule__Condition__Group__4__Impl"
    // InternalGame.g:2621:1: rule__Condition__Group__4__Impl : ( ( rule__Condition__ThenAssignment_4 ) ) ;
    public final void rule__Condition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2625:1: ( ( ( rule__Condition__ThenAssignment_4 ) ) )
            // InternalGame.g:2626:1: ( ( rule__Condition__ThenAssignment_4 ) )
            {
            // InternalGame.g:2626:1: ( ( rule__Condition__ThenAssignment_4 ) )
            // InternalGame.g:2627:2: ( rule__Condition__ThenAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getThenAssignment_4()); 
            }
            // InternalGame.g:2628:2: ( rule__Condition__ThenAssignment_4 )
            // InternalGame.g:2628:3: rule__Condition__ThenAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ThenAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getThenAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__4__Impl"


    // $ANTLR start "rule__Condition__Group__5"
    // InternalGame.g:2636:1: rule__Condition__Group__5 : rule__Condition__Group__5__Impl ;
    public final void rule__Condition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2640:1: ( rule__Condition__Group__5__Impl )
            // InternalGame.g:2641:2: rule__Condition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__5"


    // $ANTLR start "rule__Condition__Group__5__Impl"
    // InternalGame.g:2647:1: rule__Condition__Group__5__Impl : ( ( rule__Condition__Group_5__0 )? ) ;
    public final void rule__Condition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2651:1: ( ( ( rule__Condition__Group_5__0 )? ) )
            // InternalGame.g:2652:1: ( ( rule__Condition__Group_5__0 )? )
            {
            // InternalGame.g:2652:1: ( ( rule__Condition__Group_5__0 )? )
            // InternalGame.g:2653:2: ( rule__Condition__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup_5()); 
            }
            // InternalGame.g:2654:2: ( rule__Condition__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGame.g:2654:3: rule__Condition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__5__Impl"


    // $ANTLR start "rule__Condition__Group_5__0"
    // InternalGame.g:2663:1: rule__Condition__Group_5__0 : rule__Condition__Group_5__0__Impl rule__Condition__Group_5__1 ;
    public final void rule__Condition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2667:1: ( rule__Condition__Group_5__0__Impl rule__Condition__Group_5__1 )
            // InternalGame.g:2668:2: rule__Condition__Group_5__0__Impl rule__Condition__Group_5__1
            {
            pushFollow(FOLLOW_24);
            rule__Condition__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_5__0"


    // $ANTLR start "rule__Condition__Group_5__0__Impl"
    // InternalGame.g:2675:1: rule__Condition__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__Condition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2679:1: ( ( ( 'else' ) ) )
            // InternalGame.g:2680:1: ( ( 'else' ) )
            {
            // InternalGame.g:2680:1: ( ( 'else' ) )
            // InternalGame.g:2681:2: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getElseKeyword_5_0()); 
            }
            // InternalGame.g:2682:2: ( 'else' )
            // InternalGame.g:2682:3: 'else'
            {
            match(input,17,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getElseKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_5__0__Impl"


    // $ANTLR start "rule__Condition__Group_5__1"
    // InternalGame.g:2690:1: rule__Condition__Group_5__1 : rule__Condition__Group_5__1__Impl ;
    public final void rule__Condition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2694:1: ( rule__Condition__Group_5__1__Impl )
            // InternalGame.g:2695:2: rule__Condition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_5__1"


    // $ANTLR start "rule__Condition__Group_5__1__Impl"
    // InternalGame.g:2701:1: rule__Condition__Group_5__1__Impl : ( ( rule__Condition__ElseIfConditionAssignment_5_1 ) ) ;
    public final void rule__Condition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2705:1: ( ( ( rule__Condition__ElseIfConditionAssignment_5_1 ) ) )
            // InternalGame.g:2706:1: ( ( rule__Condition__ElseIfConditionAssignment_5_1 ) )
            {
            // InternalGame.g:2706:1: ( ( rule__Condition__ElseIfConditionAssignment_5_1 ) )
            // InternalGame.g:2707:2: ( rule__Condition__ElseIfConditionAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getElseIfConditionAssignment_5_1()); 
            }
            // InternalGame.g:2708:2: ( rule__Condition__ElseIfConditionAssignment_5_1 )
            // InternalGame.g:2708:3: rule__Condition__ElseIfConditionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ElseIfConditionAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getElseIfConditionAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_5__1__Impl"


    // $ANTLR start "rule__DECIMAL__Group__0"
    // InternalGame.g:2717:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2721:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalGame.g:2722:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__DECIMAL__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__0"


    // $ANTLR start "rule__DECIMAL__Group__0__Impl"
    // InternalGame.g:2729:1: rule__DECIMAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2733:1: ( ( RULE_INT ) )
            // InternalGame.g:2734:1: ( RULE_INT )
            {
            // InternalGame.g:2734:1: ( RULE_INT )
            // InternalGame.g:2735:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__0__Impl"


    // $ANTLR start "rule__DECIMAL__Group__1"
    // InternalGame.g:2744:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2748:1: ( rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 )
            // InternalGame.g:2749:2: rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__DECIMAL__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__1"


    // $ANTLR start "rule__DECIMAL__Group__1__Impl"
    // InternalGame.g:2756:1: rule__DECIMAL__Group__1__Impl : ( '.' ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2760:1: ( ( '.' ) )
            // InternalGame.g:2761:1: ( '.' )
            {
            // InternalGame.g:2761:1: ( '.' )
            // InternalGame.g:2762:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__1__Impl"


    // $ANTLR start "rule__DECIMAL__Group__2"
    // InternalGame.g:2771:1: rule__DECIMAL__Group__2 : rule__DECIMAL__Group__2__Impl ;
    public final void rule__DECIMAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2775:1: ( rule__DECIMAL__Group__2__Impl )
            // InternalGame.g:2776:2: rule__DECIMAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__2"


    // $ANTLR start "rule__DECIMAL__Group__2__Impl"
    // InternalGame.g:2782:1: rule__DECIMAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2786:1: ( ( RULE_INT ) )
            // InternalGame.g:2787:1: ( RULE_INT )
            {
            // InternalGame.g:2787:1: ( RULE_INT )
            // InternalGame.g:2788:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__2__Impl"


    // $ANTLR start "rule__ReferenceCharacter__Group_0__0"
    // InternalGame.g:2798:1: rule__ReferenceCharacter__Group_0__0 : rule__ReferenceCharacter__Group_0__0__Impl rule__ReferenceCharacter__Group_0__1 ;
    public final void rule__ReferenceCharacter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2802:1: ( rule__ReferenceCharacter__Group_0__0__Impl rule__ReferenceCharacter__Group_0__1 )
            // InternalGame.g:2803:2: rule__ReferenceCharacter__Group_0__0__Impl rule__ReferenceCharacter__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__ReferenceCharacter__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReferenceCharacter__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCharacter__Group_0__0"


    // $ANTLR start "rule__ReferenceCharacter__Group_0__0__Impl"
    // InternalGame.g:2810:1: rule__ReferenceCharacter__Group_0__0__Impl : ( () ) ;
    public final void rule__ReferenceCharacter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2814:1: ( ( () ) )
            // InternalGame.g:2815:1: ( () )
            {
            // InternalGame.g:2815:1: ( () )
            // InternalGame.g:2816:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCharacterAccess().getReferenceCharacterAction_0_0()); 
            }
            // InternalGame.g:2817:2: ()
            // InternalGame.g:2817:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCharacterAccess().getReferenceCharacterAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCharacter__Group_0__0__Impl"


    // $ANTLR start "rule__ReferenceCharacter__Group_0__1"
    // InternalGame.g:2825:1: rule__ReferenceCharacter__Group_0__1 : rule__ReferenceCharacter__Group_0__1__Impl ;
    public final void rule__ReferenceCharacter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2829:1: ( rule__ReferenceCharacter__Group_0__1__Impl )
            // InternalGame.g:2830:2: rule__ReferenceCharacter__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceCharacter__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCharacter__Group_0__1"


    // $ANTLR start "rule__ReferenceCharacter__Group_0__1__Impl"
    // InternalGame.g:2836:1: rule__ReferenceCharacter__Group_0__1__Impl : ( ( rule__ReferenceCharacter__CharacterIdAssignment_0_1 ) ) ;
    public final void rule__ReferenceCharacter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2840:1: ( ( ( rule__ReferenceCharacter__CharacterIdAssignment_0_1 ) ) )
            // InternalGame.g:2841:1: ( ( rule__ReferenceCharacter__CharacterIdAssignment_0_1 ) )
            {
            // InternalGame.g:2841:1: ( ( rule__ReferenceCharacter__CharacterIdAssignment_0_1 ) )
            // InternalGame.g:2842:2: ( rule__ReferenceCharacter__CharacterIdAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCharacterAccess().getCharacterIdAssignment_0_1()); 
            }
            // InternalGame.g:2843:2: ( rule__ReferenceCharacter__CharacterIdAssignment_0_1 )
            // InternalGame.g:2843:3: rule__ReferenceCharacter__CharacterIdAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceCharacter__CharacterIdAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCharacterAccess().getCharacterIdAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCharacter__Group_0__1__Impl"


    // $ANTLR start "rule__ReferenceCharacter__Group_1__0"
    // InternalGame.g:2852:1: rule__ReferenceCharacter__Group_1__0 : rule__ReferenceCharacter__Group_1__0__Impl rule__ReferenceCharacter__Group_1__1 ;
    public final void rule__ReferenceCharacter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2856:1: ( rule__ReferenceCharacter__Group_1__0__Impl rule__ReferenceCharacter__Group_1__1 )
            // InternalGame.g:2857:2: rule__ReferenceCharacter__Group_1__0__Impl rule__ReferenceCharacter__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__ReferenceCharacter__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReferenceCharacter__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCharacter__Group_1__0"


    // $ANTLR start "rule__ReferenceCharacter__Group_1__0__Impl"
    // InternalGame.g:2864:1: rule__ReferenceCharacter__Group_1__0__Impl : ( () ) ;
    public final void rule__ReferenceCharacter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2868:1: ( ( () ) )
            // InternalGame.g:2869:1: ( () )
            {
            // InternalGame.g:2869:1: ( () )
            // InternalGame.g:2870:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCharacterAccess().getReferenceCharacterAction_1_0()); 
            }
            // InternalGame.g:2871:2: ()
            // InternalGame.g:2871:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCharacterAccess().getReferenceCharacterAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCharacter__Group_1__0__Impl"


    // $ANTLR start "rule__ReferenceCharacter__Group_1__1"
    // InternalGame.g:2879:1: rule__ReferenceCharacter__Group_1__1 : rule__ReferenceCharacter__Group_1__1__Impl ;
    public final void rule__ReferenceCharacter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2883:1: ( rule__ReferenceCharacter__Group_1__1__Impl )
            // InternalGame.g:2884:2: rule__ReferenceCharacter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceCharacter__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCharacter__Group_1__1"


    // $ANTLR start "rule__ReferenceCharacter__Group_1__1__Impl"
    // InternalGame.g:2890:1: rule__ReferenceCharacter__Group_1__1__Impl : ( ( rule__ReferenceCharacter__TargetIdAssignment_1_1 ) ) ;
    public final void rule__ReferenceCharacter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2894:1: ( ( ( rule__ReferenceCharacter__TargetIdAssignment_1_1 ) ) )
            // InternalGame.g:2895:1: ( ( rule__ReferenceCharacter__TargetIdAssignment_1_1 ) )
            {
            // InternalGame.g:2895:1: ( ( rule__ReferenceCharacter__TargetIdAssignment_1_1 ) )
            // InternalGame.g:2896:2: ( rule__ReferenceCharacter__TargetIdAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCharacterAccess().getTargetIdAssignment_1_1()); 
            }
            // InternalGame.g:2897:2: ( rule__ReferenceCharacter__TargetIdAssignment_1_1 )
            // InternalGame.g:2897:3: rule__ReferenceCharacter__TargetIdAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceCharacter__TargetIdAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCharacterAccess().getTargetIdAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCharacter__Group_1__1__Impl"


    // $ANTLR start "rule__CompOperator__Group_0__0"
    // InternalGame.g:2906:1: rule__CompOperator__Group_0__0 : rule__CompOperator__Group_0__0__Impl rule__CompOperator__Group_0__1 ;
    public final void rule__CompOperator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2910:1: ( rule__CompOperator__Group_0__0__Impl rule__CompOperator__Group_0__1 )
            // InternalGame.g:2911:2: rule__CompOperator__Group_0__0__Impl rule__CompOperator__Group_0__1
            {
            pushFollow(FOLLOW_27);
            rule__CompOperator__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompOperator__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Group_0__0"


    // $ANTLR start "rule__CompOperator__Group_0__0__Impl"
    // InternalGame.g:2918:1: rule__CompOperator__Group_0__0__Impl : ( () ) ;
    public final void rule__CompOperator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2922:1: ( ( () ) )
            // InternalGame.g:2923:1: ( () )
            {
            // InternalGame.g:2923:1: ( () )
            // InternalGame.g:2924:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getLTAction_0_0()); 
            }
            // InternalGame.g:2925:2: ()
            // InternalGame.g:2925:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getLTAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Group_0__0__Impl"


    // $ANTLR start "rule__CompOperator__Group_0__1"
    // InternalGame.g:2933:1: rule__CompOperator__Group_0__1 : rule__CompOperator__Group_0__1__Impl ;
    public final void rule__CompOperator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2937:1: ( rule__CompOperator__Group_0__1__Impl )
            // InternalGame.g:2938:2: rule__CompOperator__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompOperator__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Group_0__1"


    // $ANTLR start "rule__CompOperator__Group_0__1__Impl"
    // InternalGame.g:2944:1: rule__CompOperator__Group_0__1__Impl : ( ( rule__CompOperator__OpAssignment_0_1 ) ) ;
    public final void rule__CompOperator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2948:1: ( ( ( rule__CompOperator__OpAssignment_0_1 ) ) )
            // InternalGame.g:2949:1: ( ( rule__CompOperator__OpAssignment_0_1 ) )
            {
            // InternalGame.g:2949:1: ( ( rule__CompOperator__OpAssignment_0_1 ) )
            // InternalGame.g:2950:2: ( rule__CompOperator__OpAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getOpAssignment_0_1()); 
            }
            // InternalGame.g:2951:2: ( rule__CompOperator__OpAssignment_0_1 )
            // InternalGame.g:2951:3: rule__CompOperator__OpAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CompOperator__OpAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getOpAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Group_0__1__Impl"


    // $ANTLR start "rule__CompOperator__Group_1__0"
    // InternalGame.g:2960:1: rule__CompOperator__Group_1__0 : rule__CompOperator__Group_1__0__Impl rule__CompOperator__Group_1__1 ;
    public final void rule__CompOperator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2964:1: ( rule__CompOperator__Group_1__0__Impl rule__CompOperator__Group_1__1 )
            // InternalGame.g:2965:2: rule__CompOperator__Group_1__0__Impl rule__CompOperator__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__CompOperator__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompOperator__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Group_1__0"


    // $ANTLR start "rule__CompOperator__Group_1__0__Impl"
    // InternalGame.g:2972:1: rule__CompOperator__Group_1__0__Impl : ( () ) ;
    public final void rule__CompOperator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2976:1: ( ( () ) )
            // InternalGame.g:2977:1: ( () )
            {
            // InternalGame.g:2977:1: ( () )
            // InternalGame.g:2978:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getGTAction_1_0()); 
            }
            // InternalGame.g:2979:2: ()
            // InternalGame.g:2979:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getGTAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Group_1__0__Impl"


    // $ANTLR start "rule__CompOperator__Group_1__1"
    // InternalGame.g:2987:1: rule__CompOperator__Group_1__1 : rule__CompOperator__Group_1__1__Impl ;
    public final void rule__CompOperator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2991:1: ( rule__CompOperator__Group_1__1__Impl )
            // InternalGame.g:2992:2: rule__CompOperator__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompOperator__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Group_1__1"


    // $ANTLR start "rule__CompOperator__Group_1__1__Impl"
    // InternalGame.g:2998:1: rule__CompOperator__Group_1__1__Impl : ( ( rule__CompOperator__OpAssignment_1_1 ) ) ;
    public final void rule__CompOperator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3002:1: ( ( ( rule__CompOperator__OpAssignment_1_1 ) ) )
            // InternalGame.g:3003:1: ( ( rule__CompOperator__OpAssignment_1_1 ) )
            {
            // InternalGame.g:3003:1: ( ( rule__CompOperator__OpAssignment_1_1 ) )
            // InternalGame.g:3004:2: ( rule__CompOperator__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getOpAssignment_1_1()); 
            }
            // InternalGame.g:3005:2: ( rule__CompOperator__OpAssignment_1_1 )
            // InternalGame.g:3005:3: rule__CompOperator__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompOperator__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Group_1__1__Impl"


    // $ANTLR start "rule__CompOperator__Group_2__0"
    // InternalGame.g:3014:1: rule__CompOperator__Group_2__0 : rule__CompOperator__Group_2__0__Impl rule__CompOperator__Group_2__1 ;
    public final void rule__CompOperator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3018:1: ( rule__CompOperator__Group_2__0__Impl rule__CompOperator__Group_2__1 )
            // InternalGame.g:3019:2: rule__CompOperator__Group_2__0__Impl rule__CompOperator__Group_2__1
            {
            pushFollow(FOLLOW_29);
            rule__CompOperator__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompOperator__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Group_2__0"


    // $ANTLR start "rule__CompOperator__Group_2__0__Impl"
    // InternalGame.g:3026:1: rule__CompOperator__Group_2__0__Impl : ( () ) ;
    public final void rule__CompOperator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3030:1: ( ( () ) )
            // InternalGame.g:3031:1: ( () )
            {
            // InternalGame.g:3031:1: ( () )
            // InternalGame.g:3032:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getLTEAction_2_0()); 
            }
            // InternalGame.g:3033:2: ()
            // InternalGame.g:3033:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getLTEAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Group_2__0__Impl"


    // $ANTLR start "rule__CompOperator__Group_2__1"
    // InternalGame.g:3041:1: rule__CompOperator__Group_2__1 : rule__CompOperator__Group_2__1__Impl ;
    public final void rule__CompOperator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3045:1: ( rule__CompOperator__Group_2__1__Impl )
            // InternalGame.g:3046:2: rule__CompOperator__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompOperator__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Group_2__1"


    // $ANTLR start "rule__CompOperator__Group_2__1__Impl"
    // InternalGame.g:3052:1: rule__CompOperator__Group_2__1__Impl : ( ( rule__CompOperator__OpAssignment_2_1 ) ) ;
    public final void rule__CompOperator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3056:1: ( ( ( rule__CompOperator__OpAssignment_2_1 ) ) )
            // InternalGame.g:3057:1: ( ( rule__CompOperator__OpAssignment_2_1 ) )
            {
            // InternalGame.g:3057:1: ( ( rule__CompOperator__OpAssignment_2_1 ) )
            // InternalGame.g:3058:2: ( rule__CompOperator__OpAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getOpAssignment_2_1()); 
            }
            // InternalGame.g:3059:2: ( rule__CompOperator__OpAssignment_2_1 )
            // InternalGame.g:3059:3: rule__CompOperator__OpAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CompOperator__OpAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getOpAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Group_2__1__Impl"


    // $ANTLR start "rule__CompOperator__Group_3__0"
    // InternalGame.g:3068:1: rule__CompOperator__Group_3__0 : rule__CompOperator__Group_3__0__Impl rule__CompOperator__Group_3__1 ;
    public final void rule__CompOperator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3072:1: ( rule__CompOperator__Group_3__0__Impl rule__CompOperator__Group_3__1 )
            // InternalGame.g:3073:2: rule__CompOperator__Group_3__0__Impl rule__CompOperator__Group_3__1
            {
            pushFollow(FOLLOW_30);
            rule__CompOperator__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompOperator__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Group_3__0"


    // $ANTLR start "rule__CompOperator__Group_3__0__Impl"
    // InternalGame.g:3080:1: rule__CompOperator__Group_3__0__Impl : ( () ) ;
    public final void rule__CompOperator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3084:1: ( ( () ) )
            // InternalGame.g:3085:1: ( () )
            {
            // InternalGame.g:3085:1: ( () )
            // InternalGame.g:3086:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getGTEAction_3_0()); 
            }
            // InternalGame.g:3087:2: ()
            // InternalGame.g:3087:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getGTEAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Group_3__0__Impl"


    // $ANTLR start "rule__CompOperator__Group_3__1"
    // InternalGame.g:3095:1: rule__CompOperator__Group_3__1 : rule__CompOperator__Group_3__1__Impl ;
    public final void rule__CompOperator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3099:1: ( rule__CompOperator__Group_3__1__Impl )
            // InternalGame.g:3100:2: rule__CompOperator__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompOperator__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Group_3__1"


    // $ANTLR start "rule__CompOperator__Group_3__1__Impl"
    // InternalGame.g:3106:1: rule__CompOperator__Group_3__1__Impl : ( ( rule__CompOperator__OpAssignment_3_1 ) ) ;
    public final void rule__CompOperator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3110:1: ( ( ( rule__CompOperator__OpAssignment_3_1 ) ) )
            // InternalGame.g:3111:1: ( ( rule__CompOperator__OpAssignment_3_1 ) )
            {
            // InternalGame.g:3111:1: ( ( rule__CompOperator__OpAssignment_3_1 ) )
            // InternalGame.g:3112:2: ( rule__CompOperator__OpAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getOpAssignment_3_1()); 
            }
            // InternalGame.g:3113:2: ( rule__CompOperator__OpAssignment_3_1 )
            // InternalGame.g:3113:3: rule__CompOperator__OpAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CompOperator__OpAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getOpAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Group_3__1__Impl"


    // $ANTLR start "rule__CompOperator__Group_4__0"
    // InternalGame.g:3122:1: rule__CompOperator__Group_4__0 : rule__CompOperator__Group_4__0__Impl rule__CompOperator__Group_4__1 ;
    public final void rule__CompOperator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3126:1: ( rule__CompOperator__Group_4__0__Impl rule__CompOperator__Group_4__1 )
            // InternalGame.g:3127:2: rule__CompOperator__Group_4__0__Impl rule__CompOperator__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__CompOperator__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompOperator__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Group_4__0"


    // $ANTLR start "rule__CompOperator__Group_4__0__Impl"
    // InternalGame.g:3134:1: rule__CompOperator__Group_4__0__Impl : ( () ) ;
    public final void rule__CompOperator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3138:1: ( ( () ) )
            // InternalGame.g:3139:1: ( () )
            {
            // InternalGame.g:3139:1: ( () )
            // InternalGame.g:3140:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getEQAction_4_0()); 
            }
            // InternalGame.g:3141:2: ()
            // InternalGame.g:3141:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getEQAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Group_4__0__Impl"


    // $ANTLR start "rule__CompOperator__Group_4__1"
    // InternalGame.g:3149:1: rule__CompOperator__Group_4__1 : rule__CompOperator__Group_4__1__Impl ;
    public final void rule__CompOperator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3153:1: ( rule__CompOperator__Group_4__1__Impl )
            // InternalGame.g:3154:2: rule__CompOperator__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompOperator__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Group_4__1"


    // $ANTLR start "rule__CompOperator__Group_4__1__Impl"
    // InternalGame.g:3160:1: rule__CompOperator__Group_4__1__Impl : ( ( rule__CompOperator__OpAssignment_4_1 ) ) ;
    public final void rule__CompOperator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3164:1: ( ( ( rule__CompOperator__OpAssignment_4_1 ) ) )
            // InternalGame.g:3165:1: ( ( rule__CompOperator__OpAssignment_4_1 ) )
            {
            // InternalGame.g:3165:1: ( ( rule__CompOperator__OpAssignment_4_1 ) )
            // InternalGame.g:3166:2: ( rule__CompOperator__OpAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getOpAssignment_4_1()); 
            }
            // InternalGame.g:3167:2: ( rule__CompOperator__OpAssignment_4_1 )
            // InternalGame.g:3167:3: rule__CompOperator__OpAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CompOperator__OpAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getOpAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__Group_4__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalGame.g:3176:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3180:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalGame.g:3181:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Action__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalGame.g:3188:1: rule__Action__Group__0__Impl : ( '(' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3192:1: ( ( '(' ) )
            // InternalGame.g:3193:1: ( '(' )
            {
            // InternalGame.g:3193:1: ( '(' )
            // InternalGame.g:3194:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalGame.g:3203:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3207:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalGame.g:3208:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Action__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalGame.g:3215:1: rule__Action__Group__1__Impl : ( ( rule__Action__CharAttAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3219:1: ( ( ( rule__Action__CharAttAssignment_1 ) ) )
            // InternalGame.g:3220:1: ( ( rule__Action__CharAttAssignment_1 ) )
            {
            // InternalGame.g:3220:1: ( ( rule__Action__CharAttAssignment_1 ) )
            // InternalGame.g:3221:2: ( rule__Action__CharAttAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getCharAttAssignment_1()); 
            }
            // InternalGame.g:3222:2: ( rule__Action__CharAttAssignment_1 )
            // InternalGame.g:3222:3: rule__Action__CharAttAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__CharAttAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getCharAttAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalGame.g:3230:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3234:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalGame.g:3235:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Action__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Action__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalGame.g:3242:1: rule__Action__Group__2__Impl : ( '=' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3246:1: ( ( '=' ) )
            // InternalGame.g:3247:1: ( '=' )
            {
            // InternalGame.g:3247:1: ( '=' )
            // InternalGame.g:3248:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getEqualsSignKeyword_2()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // InternalGame.g:3257:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3261:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // InternalGame.g:3262:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Action__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Action__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // InternalGame.g:3269:1: rule__Action__Group__3__Impl : ( ( rule__Action__CharDecAssignment_3 )? ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3273:1: ( ( ( rule__Action__CharDecAssignment_3 )? ) )
            // InternalGame.g:3274:1: ( ( rule__Action__CharDecAssignment_3 )? )
            {
            // InternalGame.g:3274:1: ( ( rule__Action__CharDecAssignment_3 )? )
            // InternalGame.g:3275:2: ( rule__Action__CharDecAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getCharDecAssignment_3()); 
            }
            // InternalGame.g:3276:2: ( rule__Action__CharDecAssignment_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||LA27_0==28) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_INT) ) {
                int LA27_2 = input.LA(2);

                if ( (synpred36_InternalGame()) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalGame.g:3276:3: rule__Action__CharDecAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__CharDecAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getCharDecAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__4"
    // InternalGame.g:3284:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3288:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // InternalGame.g:3289:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Action__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Action__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // InternalGame.g:3296:1: rule__Action__Group__4__Impl : ( ( rule__Action__Group_4__0 )? ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3300:1: ( ( ( rule__Action__Group_4__0 )? ) )
            // InternalGame.g:3301:1: ( ( rule__Action__Group_4__0 )? )
            {
            // InternalGame.g:3301:1: ( ( rule__Action__Group_4__0 )? )
            // InternalGame.g:3302:2: ( rule__Action__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup_4()); 
            }
            // InternalGame.g:3303:2: ( rule__Action__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT||LA28_0==14||(LA28_0>=33 && LA28_0<=36)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGame.g:3303:3: rule__Action__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__5"
    // InternalGame.g:3311:1: rule__Action__Group__5 : rule__Action__Group__5__Impl ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3315:1: ( rule__Action__Group__5__Impl )
            // InternalGame.g:3316:2: rule__Action__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5"


    // $ANTLR start "rule__Action__Group__5__Impl"
    // InternalGame.g:3322:1: rule__Action__Group__5__Impl : ( ')' ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3326:1: ( ( ')' ) )
            // InternalGame.g:3327:1: ( ')' )
            {
            // InternalGame.g:3327:1: ( ')' )
            // InternalGame.g:3328:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5__Impl"


    // $ANTLR start "rule__Action__Group_4__0"
    // InternalGame.g:3338:1: rule__Action__Group_4__0 : rule__Action__Group_4__0__Impl rule__Action__Group_4__1 ;
    public final void rule__Action__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3342:1: ( rule__Action__Group_4__0__Impl rule__Action__Group_4__1 )
            // InternalGame.g:3343:2: rule__Action__Group_4__0__Impl rule__Action__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Action__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Action__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__0"


    // $ANTLR start "rule__Action__Group_4__0__Impl"
    // InternalGame.g:3350:1: rule__Action__Group_4__0__Impl : ( ( rule__Action__OpAssignment_4_0 )? ) ;
    public final void rule__Action__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3354:1: ( ( ( rule__Action__OpAssignment_4_0 )? ) )
            // InternalGame.g:3355:1: ( ( rule__Action__OpAssignment_4_0 )? )
            {
            // InternalGame.g:3355:1: ( ( rule__Action__OpAssignment_4_0 )? )
            // InternalGame.g:3356:2: ( rule__Action__OpAssignment_4_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getOpAssignment_4_0()); 
            }
            // InternalGame.g:3357:2: ( rule__Action__OpAssignment_4_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=33 && LA29_0<=36)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGame.g:3357:3: rule__Action__OpAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__OpAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getOpAssignment_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__0__Impl"


    // $ANTLR start "rule__Action__Group_4__1"
    // InternalGame.g:3365:1: rule__Action__Group_4__1 : rule__Action__Group_4__1__Impl ;
    public final void rule__Action__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3369:1: ( rule__Action__Group_4__1__Impl )
            // InternalGame.g:3370:2: rule__Action__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__1"


    // $ANTLR start "rule__Action__Group_4__1__Impl"
    // InternalGame.g:3376:1: rule__Action__Group_4__1__Impl : ( ( rule__Action__ExAssignment_4_1 ) ) ;
    public final void rule__Action__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3380:1: ( ( ( rule__Action__ExAssignment_4_1 ) ) )
            // InternalGame.g:3381:1: ( ( rule__Action__ExAssignment_4_1 ) )
            {
            // InternalGame.g:3381:1: ( ( rule__Action__ExAssignment_4_1 ) )
            // InternalGame.g:3382:2: ( rule__Action__ExAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getExAssignment_4_1()); 
            }
            // InternalGame.g:3383:2: ( rule__Action__ExAssignment_4_1 )
            // InternalGame.g:3383:3: rule__Action__ExAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ExAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getExAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__1__Impl"


    // $ANTLR start "rule__CharacterAttr__Group__0"
    // InternalGame.g:3392:1: rule__CharacterAttr__Group__0 : rule__CharacterAttr__Group__0__Impl rule__CharacterAttr__Group__1 ;
    public final void rule__CharacterAttr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3396:1: ( rule__CharacterAttr__Group__0__Impl rule__CharacterAttr__Group__1 )
            // InternalGame.g:3397:2: rule__CharacterAttr__Group__0__Impl rule__CharacterAttr__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CharacterAttr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CharacterAttr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAttr__Group__0"


    // $ANTLR start "rule__CharacterAttr__Group__0__Impl"
    // InternalGame.g:3404:1: rule__CharacterAttr__Group__0__Impl : ( ( rule__CharacterAttr__ReferenceAssignment_0 ) ) ;
    public final void rule__CharacterAttr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3408:1: ( ( ( rule__CharacterAttr__ReferenceAssignment_0 ) ) )
            // InternalGame.g:3409:1: ( ( rule__CharacterAttr__ReferenceAssignment_0 ) )
            {
            // InternalGame.g:3409:1: ( ( rule__CharacterAttr__ReferenceAssignment_0 ) )
            // InternalGame.g:3410:2: ( rule__CharacterAttr__ReferenceAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAttrAccess().getReferenceAssignment_0()); 
            }
            // InternalGame.g:3411:2: ( rule__CharacterAttr__ReferenceAssignment_0 )
            // InternalGame.g:3411:3: rule__CharacterAttr__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CharacterAttr__ReferenceAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAttrAccess().getReferenceAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAttr__Group__0__Impl"


    // $ANTLR start "rule__CharacterAttr__Group__1"
    // InternalGame.g:3419:1: rule__CharacterAttr__Group__1 : rule__CharacterAttr__Group__1__Impl ;
    public final void rule__CharacterAttr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3423:1: ( rule__CharacterAttr__Group__1__Impl )
            // InternalGame.g:3424:2: rule__CharacterAttr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharacterAttr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAttr__Group__1"


    // $ANTLR start "rule__CharacterAttr__Group__1__Impl"
    // InternalGame.g:3430:1: rule__CharacterAttr__Group__1__Impl : ( ( rule__CharacterAttr__AttributenameAssignment_1 ) ) ;
    public final void rule__CharacterAttr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3434:1: ( ( ( rule__CharacterAttr__AttributenameAssignment_1 ) ) )
            // InternalGame.g:3435:1: ( ( rule__CharacterAttr__AttributenameAssignment_1 ) )
            {
            // InternalGame.g:3435:1: ( ( rule__CharacterAttr__AttributenameAssignment_1 ) )
            // InternalGame.g:3436:2: ( rule__CharacterAttr__AttributenameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAttrAccess().getAttributenameAssignment_1()); 
            }
            // InternalGame.g:3437:2: ( rule__CharacterAttr__AttributenameAssignment_1 )
            // InternalGame.g:3437:3: rule__CharacterAttr__AttributenameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CharacterAttr__AttributenameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAttrAccess().getAttributenameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAttr__Group__1__Impl"


    // $ANTLR start "rule__LogicOperator__Group_0__0"
    // InternalGame.g:3446:1: rule__LogicOperator__Group_0__0 : rule__LogicOperator__Group_0__0__Impl rule__LogicOperator__Group_0__1 ;
    public final void rule__LogicOperator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3450:1: ( rule__LogicOperator__Group_0__0__Impl rule__LogicOperator__Group_0__1 )
            // InternalGame.g:3451:2: rule__LogicOperator__Group_0__0__Impl rule__LogicOperator__Group_0__1
            {
            pushFollow(FOLLOW_33);
            rule__LogicOperator__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicOperator__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__Group_0__0"


    // $ANTLR start "rule__LogicOperator__Group_0__0__Impl"
    // InternalGame.g:3458:1: rule__LogicOperator__Group_0__0__Impl : ( () ) ;
    public final void rule__LogicOperator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3462:1: ( ( () ) )
            // InternalGame.g:3463:1: ( () )
            {
            // InternalGame.g:3463:1: ( () )
            // InternalGame.g:3464:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getTAction_0_0()); 
            }
            // InternalGame.g:3465:2: ()
            // InternalGame.g:3465:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getTAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__Group_0__0__Impl"


    // $ANTLR start "rule__LogicOperator__Group_0__1"
    // InternalGame.g:3473:1: rule__LogicOperator__Group_0__1 : rule__LogicOperator__Group_0__1__Impl ;
    public final void rule__LogicOperator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3477:1: ( rule__LogicOperator__Group_0__1__Impl )
            // InternalGame.g:3478:2: rule__LogicOperator__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicOperator__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__Group_0__1"


    // $ANTLR start "rule__LogicOperator__Group_0__1__Impl"
    // InternalGame.g:3484:1: rule__LogicOperator__Group_0__1__Impl : ( ( rule__LogicOperator__LopAssignment_0_1 ) ) ;
    public final void rule__LogicOperator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3488:1: ( ( ( rule__LogicOperator__LopAssignment_0_1 ) ) )
            // InternalGame.g:3489:1: ( ( rule__LogicOperator__LopAssignment_0_1 ) )
            {
            // InternalGame.g:3489:1: ( ( rule__LogicOperator__LopAssignment_0_1 ) )
            // InternalGame.g:3490:2: ( rule__LogicOperator__LopAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getLopAssignment_0_1()); 
            }
            // InternalGame.g:3491:2: ( rule__LogicOperator__LopAssignment_0_1 )
            // InternalGame.g:3491:3: rule__LogicOperator__LopAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicOperator__LopAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getLopAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__Group_0__1__Impl"


    // $ANTLR start "rule__LogicOperator__Group_1__0"
    // InternalGame.g:3500:1: rule__LogicOperator__Group_1__0 : rule__LogicOperator__Group_1__0__Impl rule__LogicOperator__Group_1__1 ;
    public final void rule__LogicOperator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3504:1: ( rule__LogicOperator__Group_1__0__Impl rule__LogicOperator__Group_1__1 )
            // InternalGame.g:3505:2: rule__LogicOperator__Group_1__0__Impl rule__LogicOperator__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__LogicOperator__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicOperator__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__Group_1__0"


    // $ANTLR start "rule__LogicOperator__Group_1__0__Impl"
    // InternalGame.g:3512:1: rule__LogicOperator__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicOperator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3516:1: ( ( () ) )
            // InternalGame.g:3517:1: ( () )
            {
            // InternalGame.g:3517:1: ( () )
            // InternalGame.g:3518:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getAAction_1_0()); 
            }
            // InternalGame.g:3519:2: ()
            // InternalGame.g:3519:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getAAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__Group_1__0__Impl"


    // $ANTLR start "rule__LogicOperator__Group_1__1"
    // InternalGame.g:3527:1: rule__LogicOperator__Group_1__1 : rule__LogicOperator__Group_1__1__Impl ;
    public final void rule__LogicOperator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3531:1: ( rule__LogicOperator__Group_1__1__Impl )
            // InternalGame.g:3532:2: rule__LogicOperator__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicOperator__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__Group_1__1"


    // $ANTLR start "rule__LogicOperator__Group_1__1__Impl"
    // InternalGame.g:3538:1: rule__LogicOperator__Group_1__1__Impl : ( ( rule__LogicOperator__LopAssignment_1_1 ) ) ;
    public final void rule__LogicOperator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3542:1: ( ( ( rule__LogicOperator__LopAssignment_1_1 ) ) )
            // InternalGame.g:3543:1: ( ( rule__LogicOperator__LopAssignment_1_1 ) )
            {
            // InternalGame.g:3543:1: ( ( rule__LogicOperator__LopAssignment_1_1 ) )
            // InternalGame.g:3544:2: ( rule__LogicOperator__LopAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getLopAssignment_1_1()); 
            }
            // InternalGame.g:3545:2: ( rule__LogicOperator__LopAssignment_1_1 )
            // InternalGame.g:3545:3: rule__LogicOperator__LopAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicOperator__LopAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getLopAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__Group_1__1__Impl"


    // $ANTLR start "rule__LogicOperator__Group_2__0"
    // InternalGame.g:3554:1: rule__LogicOperator__Group_2__0 : rule__LogicOperator__Group_2__0__Impl rule__LogicOperator__Group_2__1 ;
    public final void rule__LogicOperator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3558:1: ( rule__LogicOperator__Group_2__0__Impl rule__LogicOperator__Group_2__1 )
            // InternalGame.g:3559:2: rule__LogicOperator__Group_2__0__Impl rule__LogicOperator__Group_2__1
            {
            pushFollow(FOLLOW_35);
            rule__LogicOperator__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicOperator__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__Group_2__0"


    // $ANTLR start "rule__LogicOperator__Group_2__0__Impl"
    // InternalGame.g:3566:1: rule__LogicOperator__Group_2__0__Impl : ( () ) ;
    public final void rule__LogicOperator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3570:1: ( ( () ) )
            // InternalGame.g:3571:1: ( () )
            {
            // InternalGame.g:3571:1: ( () )
            // InternalGame.g:3572:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getMAction_2_0()); 
            }
            // InternalGame.g:3573:2: ()
            // InternalGame.g:3573:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getMAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__Group_2__0__Impl"


    // $ANTLR start "rule__LogicOperator__Group_2__1"
    // InternalGame.g:3581:1: rule__LogicOperator__Group_2__1 : rule__LogicOperator__Group_2__1__Impl ;
    public final void rule__LogicOperator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3585:1: ( rule__LogicOperator__Group_2__1__Impl )
            // InternalGame.g:3586:2: rule__LogicOperator__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicOperator__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__Group_2__1"


    // $ANTLR start "rule__LogicOperator__Group_2__1__Impl"
    // InternalGame.g:3592:1: rule__LogicOperator__Group_2__1__Impl : ( ( rule__LogicOperator__LopAssignment_2_1 ) ) ;
    public final void rule__LogicOperator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3596:1: ( ( ( rule__LogicOperator__LopAssignment_2_1 ) ) )
            // InternalGame.g:3597:1: ( ( rule__LogicOperator__LopAssignment_2_1 ) )
            {
            // InternalGame.g:3597:1: ( ( rule__LogicOperator__LopAssignment_2_1 ) )
            // InternalGame.g:3598:2: ( rule__LogicOperator__LopAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getLopAssignment_2_1()); 
            }
            // InternalGame.g:3599:2: ( rule__LogicOperator__LopAssignment_2_1 )
            // InternalGame.g:3599:3: rule__LogicOperator__LopAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicOperator__LopAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getLopAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__Group_2__1__Impl"


    // $ANTLR start "rule__LogicOperator__Group_3__0"
    // InternalGame.g:3608:1: rule__LogicOperator__Group_3__0 : rule__LogicOperator__Group_3__0__Impl rule__LogicOperator__Group_3__1 ;
    public final void rule__LogicOperator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3612:1: ( rule__LogicOperator__Group_3__0__Impl rule__LogicOperator__Group_3__1 )
            // InternalGame.g:3613:2: rule__LogicOperator__Group_3__0__Impl rule__LogicOperator__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__LogicOperator__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicOperator__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__Group_3__0"


    // $ANTLR start "rule__LogicOperator__Group_3__0__Impl"
    // InternalGame.g:3620:1: rule__LogicOperator__Group_3__0__Impl : ( () ) ;
    public final void rule__LogicOperator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3624:1: ( ( () ) )
            // InternalGame.g:3625:1: ( () )
            {
            // InternalGame.g:3625:1: ( () )
            // InternalGame.g:3626:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getDAction_3_0()); 
            }
            // InternalGame.g:3627:2: ()
            // InternalGame.g:3627:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getDAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__Group_3__0__Impl"


    // $ANTLR start "rule__LogicOperator__Group_3__1"
    // InternalGame.g:3635:1: rule__LogicOperator__Group_3__1 : rule__LogicOperator__Group_3__1__Impl ;
    public final void rule__LogicOperator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3639:1: ( rule__LogicOperator__Group_3__1__Impl )
            // InternalGame.g:3640:2: rule__LogicOperator__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicOperator__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__Group_3__1"


    // $ANTLR start "rule__LogicOperator__Group_3__1__Impl"
    // InternalGame.g:3646:1: rule__LogicOperator__Group_3__1__Impl : ( ( rule__LogicOperator__LopAssignment_3_1 ) ) ;
    public final void rule__LogicOperator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3650:1: ( ( ( rule__LogicOperator__LopAssignment_3_1 ) ) )
            // InternalGame.g:3651:1: ( ( rule__LogicOperator__LopAssignment_3_1 ) )
            {
            // InternalGame.g:3651:1: ( ( rule__LogicOperator__LopAssignment_3_1 ) )
            // InternalGame.g:3652:2: ( rule__LogicOperator__LopAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getLopAssignment_3_1()); 
            }
            // InternalGame.g:3653:2: ( rule__LogicOperator__LopAssignment_3_1 )
            // InternalGame.g:3653:3: rule__LogicOperator__LopAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicOperator__LopAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getLopAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__Group_3__1__Impl"


    // $ANTLR start "rule__Attack__Group__0"
    // InternalGame.g:3662:1: rule__Attack__Group__0 : rule__Attack__Group__0__Impl rule__Attack__Group__1 ;
    public final void rule__Attack__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3666:1: ( rule__Attack__Group__0__Impl rule__Attack__Group__1 )
            // InternalGame.g:3667:2: rule__Attack__Group__0__Impl rule__Attack__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Attack__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attack__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__Group__0"


    // $ANTLR start "rule__Attack__Group__0__Impl"
    // InternalGame.g:3674:1: rule__Attack__Group__0__Impl : ( ( rule__Attack__EntityidAssignment_0 ) ) ;
    public final void rule__Attack__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3678:1: ( ( ( rule__Attack__EntityidAssignment_0 ) ) )
            // InternalGame.g:3679:1: ( ( rule__Attack__EntityidAssignment_0 ) )
            {
            // InternalGame.g:3679:1: ( ( rule__Attack__EntityidAssignment_0 ) )
            // InternalGame.g:3680:2: ( rule__Attack__EntityidAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttackAccess().getEntityidAssignment_0()); 
            }
            // InternalGame.g:3681:2: ( rule__Attack__EntityidAssignment_0 )
            // InternalGame.g:3681:3: rule__Attack__EntityidAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attack__EntityidAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttackAccess().getEntityidAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__Group__0__Impl"


    // $ANTLR start "rule__Attack__Group__1"
    // InternalGame.g:3689:1: rule__Attack__Group__1 : rule__Attack__Group__1__Impl rule__Attack__Group__2 ;
    public final void rule__Attack__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3693:1: ( rule__Attack__Group__1__Impl rule__Attack__Group__2 )
            // InternalGame.g:3694:2: rule__Attack__Group__1__Impl rule__Attack__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Attack__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attack__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__Group__1"


    // $ANTLR start "rule__Attack__Group__1__Impl"
    // InternalGame.g:3701:1: rule__Attack__Group__1__Impl : ( ( rule__Attack__NameAssignment_1 ) ) ;
    public final void rule__Attack__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3705:1: ( ( ( rule__Attack__NameAssignment_1 ) ) )
            // InternalGame.g:3706:1: ( ( rule__Attack__NameAssignment_1 ) )
            {
            // InternalGame.g:3706:1: ( ( rule__Attack__NameAssignment_1 ) )
            // InternalGame.g:3707:2: ( rule__Attack__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttackAccess().getNameAssignment_1()); 
            }
            // InternalGame.g:3708:2: ( rule__Attack__NameAssignment_1 )
            // InternalGame.g:3708:3: rule__Attack__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attack__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttackAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__Group__1__Impl"


    // $ANTLR start "rule__Attack__Group__2"
    // InternalGame.g:3716:1: rule__Attack__Group__2 : rule__Attack__Group__2__Impl rule__Attack__Group__3 ;
    public final void rule__Attack__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3720:1: ( rule__Attack__Group__2__Impl rule__Attack__Group__3 )
            // InternalGame.g:3721:2: rule__Attack__Group__2__Impl rule__Attack__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Attack__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attack__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__Group__2"


    // $ANTLR start "rule__Attack__Group__2__Impl"
    // InternalGame.g:3728:1: rule__Attack__Group__2__Impl : ( '{' ) ;
    public final void rule__Attack__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3732:1: ( ( '{' ) )
            // InternalGame.g:3733:1: ( '{' )
            {
            // InternalGame.g:3733:1: ( '{' )
            // InternalGame.g:3734:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttackAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttackAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__Group__2__Impl"


    // $ANTLR start "rule__Attack__Group__3"
    // InternalGame.g:3743:1: rule__Attack__Group__3 : rule__Attack__Group__3__Impl rule__Attack__Group__4 ;
    public final void rule__Attack__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3747:1: ( rule__Attack__Group__3__Impl rule__Attack__Group__4 )
            // InternalGame.g:3748:2: rule__Attack__Group__3__Impl rule__Attack__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__Attack__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attack__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__Group__3"


    // $ANTLR start "rule__Attack__Group__3__Impl"
    // InternalGame.g:3755:1: rule__Attack__Group__3__Impl : ( ( rule__Attack__AttributesAssignment_3 )* ) ;
    public final void rule__Attack__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3759:1: ( ( ( rule__Attack__AttributesAssignment_3 )* ) )
            // InternalGame.g:3760:1: ( ( rule__Attack__AttributesAssignment_3 )* )
            {
            // InternalGame.g:3760:1: ( ( rule__Attack__AttributesAssignment_3 )* )
            // InternalGame.g:3761:2: ( rule__Attack__AttributesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttackAccess().getAttributesAssignment_3()); 
            }
            // InternalGame.g:3762:2: ( rule__Attack__AttributesAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGame.g:3762:3: rule__Attack__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Attack__AttributesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttackAccess().getAttributesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__Group__3__Impl"


    // $ANTLR start "rule__Attack__Group__4"
    // InternalGame.g:3770:1: rule__Attack__Group__4 : rule__Attack__Group__4__Impl rule__Attack__Group__5 ;
    public final void rule__Attack__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3774:1: ( rule__Attack__Group__4__Impl rule__Attack__Group__5 )
            // InternalGame.g:3775:2: rule__Attack__Group__4__Impl rule__Attack__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__Attack__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attack__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__Group__4"


    // $ANTLR start "rule__Attack__Group__4__Impl"
    // InternalGame.g:3782:1: rule__Attack__Group__4__Impl : ( ( rule__Attack__AttributesAttackAssignment_4 )* ) ;
    public final void rule__Attack__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3786:1: ( ( ( rule__Attack__AttributesAttackAssignment_4 )* ) )
            // InternalGame.g:3787:1: ( ( rule__Attack__AttributesAttackAssignment_4 )* )
            {
            // InternalGame.g:3787:1: ( ( rule__Attack__AttributesAttackAssignment_4 )* )
            // InternalGame.g:3788:2: ( rule__Attack__AttributesAttackAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttackAccess().getAttributesAttackAssignment_4()); 
            }
            // InternalGame.g:3789:2: ( rule__Attack__AttributesAttackAssignment_4 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=20 && LA31_0<=22)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalGame.g:3789:3: rule__Attack__AttributesAttackAssignment_4
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Attack__AttributesAttackAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttackAccess().getAttributesAttackAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__Group__4__Impl"


    // $ANTLR start "rule__Attack__Group__5"
    // InternalGame.g:3797:1: rule__Attack__Group__5 : rule__Attack__Group__5__Impl rule__Attack__Group__6 ;
    public final void rule__Attack__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3801:1: ( rule__Attack__Group__5__Impl rule__Attack__Group__6 )
            // InternalGame.g:3802:2: rule__Attack__Group__5__Impl rule__Attack__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__Attack__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Attack__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__Group__5"


    // $ANTLR start "rule__Attack__Group__5__Impl"
    // InternalGame.g:3809:1: rule__Attack__Group__5__Impl : ( ( rule__Attack__RulesAssignment_5 )? ) ;
    public final void rule__Attack__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3813:1: ( ( ( rule__Attack__RulesAssignment_5 )? ) )
            // InternalGame.g:3814:1: ( ( rule__Attack__RulesAssignment_5 )? )
            {
            // InternalGame.g:3814:1: ( ( rule__Attack__RulesAssignment_5 )? )
            // InternalGame.g:3815:2: ( rule__Attack__RulesAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttackAccess().getRulesAssignment_5()); 
            }
            // InternalGame.g:3816:2: ( rule__Attack__RulesAssignment_5 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGame.g:3816:3: rule__Attack__RulesAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attack__RulesAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttackAccess().getRulesAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__Group__5__Impl"


    // $ANTLR start "rule__Attack__Group__6"
    // InternalGame.g:3824:1: rule__Attack__Group__6 : rule__Attack__Group__6__Impl ;
    public final void rule__Attack__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3828:1: ( rule__Attack__Group__6__Impl )
            // InternalGame.g:3829:2: rule__Attack__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attack__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__Group__6"


    // $ANTLR start "rule__Attack__Group__6__Impl"
    // InternalGame.g:3835:1: rule__Attack__Group__6__Impl : ( '}' ) ;
    public final void rule__Attack__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3839:1: ( ( '}' ) )
            // InternalGame.g:3840:1: ( '}' )
            {
            // InternalGame.g:3840:1: ( '}' )
            // InternalGame.g:3841:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttackAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttackAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__Group__6__Impl"


    // $ANTLR start "rule__AttributeAttack__Group__0"
    // InternalGame.g:3851:1: rule__AttributeAttack__Group__0 : rule__AttributeAttack__Group__0__Impl rule__AttributeAttack__Group__1 ;
    public final void rule__AttributeAttack__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3855:1: ( rule__AttributeAttack__Group__0__Impl rule__AttributeAttack__Group__1 )
            // InternalGame.g:3856:2: rule__AttributeAttack__Group__0__Impl rule__AttributeAttack__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__AttributeAttack__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeAttack__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAttack__Group__0"


    // $ANTLR start "rule__AttributeAttack__Group__0__Impl"
    // InternalGame.g:3863:1: rule__AttributeAttack__Group__0__Impl : ( ( rule__AttributeAttack__AttributeTypesAttackAssignment_0 ) ) ;
    public final void rule__AttributeAttack__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3867:1: ( ( ( rule__AttributeAttack__AttributeTypesAttackAssignment_0 ) ) )
            // InternalGame.g:3868:1: ( ( rule__AttributeAttack__AttributeTypesAttackAssignment_0 ) )
            {
            // InternalGame.g:3868:1: ( ( rule__AttributeAttack__AttributeTypesAttackAssignment_0 ) )
            // InternalGame.g:3869:2: ( rule__AttributeAttack__AttributeTypesAttackAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAttackAccess().getAttributeTypesAttackAssignment_0()); 
            }
            // InternalGame.g:3870:2: ( rule__AttributeAttack__AttributeTypesAttackAssignment_0 )
            // InternalGame.g:3870:3: rule__AttributeAttack__AttributeTypesAttackAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAttack__AttributeTypesAttackAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAttackAccess().getAttributeTypesAttackAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAttack__Group__0__Impl"


    // $ANTLR start "rule__AttributeAttack__Group__1"
    // InternalGame.g:3878:1: rule__AttributeAttack__Group__1 : rule__AttributeAttack__Group__1__Impl ;
    public final void rule__AttributeAttack__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3882:1: ( rule__AttributeAttack__Group__1__Impl )
            // InternalGame.g:3883:2: rule__AttributeAttack__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAttack__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAttack__Group__1"


    // $ANTLR start "rule__AttributeAttack__Group__1__Impl"
    // InternalGame.g:3889:1: rule__AttributeAttack__Group__1__Impl : ( ( rule__AttributeAttack__TypeAssignment_1 )? ) ;
    public final void rule__AttributeAttack__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3893:1: ( ( ( rule__AttributeAttack__TypeAssignment_1 )? ) )
            // InternalGame.g:3894:1: ( ( rule__AttributeAttack__TypeAssignment_1 )? )
            {
            // InternalGame.g:3894:1: ( ( rule__AttributeAttack__TypeAssignment_1 )? )
            // InternalGame.g:3895:2: ( rule__AttributeAttack__TypeAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAttackAccess().getTypeAssignment_1()); 
            }
            // InternalGame.g:3896:2: ( rule__AttributeAttack__TypeAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_INT && LA33_0<=RULE_ID)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGame.g:3896:3: rule__AttributeAttack__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeAttack__TypeAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAttackAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAttack__Group__1__Impl"


    // $ANTLR start "rule__AttributeTypeAttack__Group_0__0"
    // InternalGame.g:3905:1: rule__AttributeTypeAttack__Group_0__0 : rule__AttributeTypeAttack__Group_0__0__Impl rule__AttributeTypeAttack__Group_0__1 ;
    public final void rule__AttributeTypeAttack__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3909:1: ( rule__AttributeTypeAttack__Group_0__0__Impl rule__AttributeTypeAttack__Group_0__1 )
            // InternalGame.g:3910:2: rule__AttributeTypeAttack__Group_0__0__Impl rule__AttributeTypeAttack__Group_0__1
            {
            pushFollow(FOLLOW_38);
            rule__AttributeTypeAttack__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeTypeAttack__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeTypeAttack__Group_0__0"


    // $ANTLR start "rule__AttributeTypeAttack__Group_0__0__Impl"
    // InternalGame.g:3917:1: rule__AttributeTypeAttack__Group_0__0__Impl : ( () ) ;
    public final void rule__AttributeTypeAttack__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3921:1: ( ( () ) )
            // InternalGame.g:3922:1: ( () )
            {
            // InternalGame.g:3922:1: ( () )
            // InternalGame.g:3923:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeTypeAttackAccess().getAmmoAction_0_0()); 
            }
            // InternalGame.g:3924:2: ()
            // InternalGame.g:3924:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeTypeAttackAccess().getAmmoAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeTypeAttack__Group_0__0__Impl"


    // $ANTLR start "rule__AttributeTypeAttack__Group_0__1"
    // InternalGame.g:3932:1: rule__AttributeTypeAttack__Group_0__1 : rule__AttributeTypeAttack__Group_0__1__Impl ;
    public final void rule__AttributeTypeAttack__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3936:1: ( rule__AttributeTypeAttack__Group_0__1__Impl )
            // InternalGame.g:3937:2: rule__AttributeTypeAttack__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeTypeAttack__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeTypeAttack__Group_0__1"


    // $ANTLR start "rule__AttributeTypeAttack__Group_0__1__Impl"
    // InternalGame.g:3943:1: rule__AttributeTypeAttack__Group_0__1__Impl : ( 'Ammunition' ) ;
    public final void rule__AttributeTypeAttack__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3947:1: ( ( 'Ammunition' ) )
            // InternalGame.g:3948:1: ( 'Ammunition' )
            {
            // InternalGame.g:3948:1: ( 'Ammunition' )
            // InternalGame.g:3949:2: 'Ammunition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeTypeAttackAccess().getAmmunitionKeyword_0_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeTypeAttackAccess().getAmmunitionKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeTypeAttack__Group_0__1__Impl"


    // $ANTLR start "rule__AttributeTypeAttack__Group_1__0"
    // InternalGame.g:3959:1: rule__AttributeTypeAttack__Group_1__0 : rule__AttributeTypeAttack__Group_1__0__Impl rule__AttributeTypeAttack__Group_1__1 ;
    public final void rule__AttributeTypeAttack__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3963:1: ( rule__AttributeTypeAttack__Group_1__0__Impl rule__AttributeTypeAttack__Group_1__1 )
            // InternalGame.g:3964:2: rule__AttributeTypeAttack__Group_1__0__Impl rule__AttributeTypeAttack__Group_1__1
            {
            pushFollow(FOLLOW_39);
            rule__AttributeTypeAttack__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeTypeAttack__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeTypeAttack__Group_1__0"


    // $ANTLR start "rule__AttributeTypeAttack__Group_1__0__Impl"
    // InternalGame.g:3971:1: rule__AttributeTypeAttack__Group_1__0__Impl : ( () ) ;
    public final void rule__AttributeTypeAttack__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3975:1: ( ( () ) )
            // InternalGame.g:3976:1: ( () )
            {
            // InternalGame.g:3976:1: ( () )
            // InternalGame.g:3977:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeTypeAttackAccess().getAttSAction_1_0()); 
            }
            // InternalGame.g:3978:2: ()
            // InternalGame.g:3978:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeTypeAttackAccess().getAttSAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeTypeAttack__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeTypeAttack__Group_1__1"
    // InternalGame.g:3986:1: rule__AttributeTypeAttack__Group_1__1 : rule__AttributeTypeAttack__Group_1__1__Impl ;
    public final void rule__AttributeTypeAttack__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3990:1: ( rule__AttributeTypeAttack__Group_1__1__Impl )
            // InternalGame.g:3991:2: rule__AttributeTypeAttack__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeTypeAttack__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeTypeAttack__Group_1__1"


    // $ANTLR start "rule__AttributeTypeAttack__Group_1__1__Impl"
    // InternalGame.g:3997:1: rule__AttributeTypeAttack__Group_1__1__Impl : ( 'Attackspeed' ) ;
    public final void rule__AttributeTypeAttack__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4001:1: ( ( 'Attackspeed' ) )
            // InternalGame.g:4002:1: ( 'Attackspeed' )
            {
            // InternalGame.g:4002:1: ( 'Attackspeed' )
            // InternalGame.g:4003:2: 'Attackspeed'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeTypeAttackAccess().getAttackspeedKeyword_1_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeTypeAttackAccess().getAttackspeedKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeTypeAttack__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeTypeAttack__Group_2__0"
    // InternalGame.g:4013:1: rule__AttributeTypeAttack__Group_2__0 : rule__AttributeTypeAttack__Group_2__0__Impl rule__AttributeTypeAttack__Group_2__1 ;
    public final void rule__AttributeTypeAttack__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4017:1: ( rule__AttributeTypeAttack__Group_2__0__Impl rule__AttributeTypeAttack__Group_2__1 )
            // InternalGame.g:4018:2: rule__AttributeTypeAttack__Group_2__0__Impl rule__AttributeTypeAttack__Group_2__1
            {
            pushFollow(FOLLOW_40);
            rule__AttributeTypeAttack__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeTypeAttack__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeTypeAttack__Group_2__0"


    // $ANTLR start "rule__AttributeTypeAttack__Group_2__0__Impl"
    // InternalGame.g:4025:1: rule__AttributeTypeAttack__Group_2__0__Impl : ( () ) ;
    public final void rule__AttributeTypeAttack__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4029:1: ( ( () ) )
            // InternalGame.g:4030:1: ( () )
            {
            // InternalGame.g:4030:1: ( () )
            // InternalGame.g:4031:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeTypeAttackAccess().getBulletAction_2_0()); 
            }
            // InternalGame.g:4032:2: ()
            // InternalGame.g:4032:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeTypeAttackAccess().getBulletAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeTypeAttack__Group_2__0__Impl"


    // $ANTLR start "rule__AttributeTypeAttack__Group_2__1"
    // InternalGame.g:4040:1: rule__AttributeTypeAttack__Group_2__1 : rule__AttributeTypeAttack__Group_2__1__Impl rule__AttributeTypeAttack__Group_2__2 ;
    public final void rule__AttributeTypeAttack__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4044:1: ( rule__AttributeTypeAttack__Group_2__1__Impl rule__AttributeTypeAttack__Group_2__2 )
            // InternalGame.g:4045:2: rule__AttributeTypeAttack__Group_2__1__Impl rule__AttributeTypeAttack__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__AttributeTypeAttack__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeTypeAttack__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeTypeAttack__Group_2__1"


    // $ANTLR start "rule__AttributeTypeAttack__Group_2__1__Impl"
    // InternalGame.g:4052:1: rule__AttributeTypeAttack__Group_2__1__Impl : ( 'Bullet' ) ;
    public final void rule__AttributeTypeAttack__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4056:1: ( ( 'Bullet' ) )
            // InternalGame.g:4057:1: ( 'Bullet' )
            {
            // InternalGame.g:4057:1: ( 'Bullet' )
            // InternalGame.g:4058:2: 'Bullet'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeTypeAttackAccess().getBulletKeyword_2_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeTypeAttackAccess().getBulletKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeTypeAttack__Group_2__1__Impl"


    // $ANTLR start "rule__AttributeTypeAttack__Group_2__2"
    // InternalGame.g:4067:1: rule__AttributeTypeAttack__Group_2__2 : rule__AttributeTypeAttack__Group_2__2__Impl ;
    public final void rule__AttributeTypeAttack__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4071:1: ( rule__AttributeTypeAttack__Group_2__2__Impl )
            // InternalGame.g:4072:2: rule__AttributeTypeAttack__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeTypeAttack__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeTypeAttack__Group_2__2"


    // $ANTLR start "rule__AttributeTypeAttack__Group_2__2__Impl"
    // InternalGame.g:4078:1: rule__AttributeTypeAttack__Group_2__2__Impl : ( ( rule__AttributeTypeAttack__BulletRefAssignment_2_2 ) ) ;
    public final void rule__AttributeTypeAttack__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4082:1: ( ( ( rule__AttributeTypeAttack__BulletRefAssignment_2_2 ) ) )
            // InternalGame.g:4083:1: ( ( rule__AttributeTypeAttack__BulletRefAssignment_2_2 ) )
            {
            // InternalGame.g:4083:1: ( ( rule__AttributeTypeAttack__BulletRefAssignment_2_2 ) )
            // InternalGame.g:4084:2: ( rule__AttributeTypeAttack__BulletRefAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeTypeAttackAccess().getBulletRefAssignment_2_2()); 
            }
            // InternalGame.g:4085:2: ( rule__AttributeTypeAttack__BulletRefAssignment_2_2 )
            // InternalGame.g:4085:3: rule__AttributeTypeAttack__BulletRefAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeTypeAttack__BulletRefAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeTypeAttackAccess().getBulletRefAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeTypeAttack__Group_2__2__Impl"


    // $ANTLR start "rule__Bullet__Group__0"
    // InternalGame.g:4094:1: rule__Bullet__Group__0 : rule__Bullet__Group__0__Impl rule__Bullet__Group__1 ;
    public final void rule__Bullet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4098:1: ( rule__Bullet__Group__0__Impl rule__Bullet__Group__1 )
            // InternalGame.g:4099:2: rule__Bullet__Group__0__Impl rule__Bullet__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Bullet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Bullet__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bullet__Group__0"


    // $ANTLR start "rule__Bullet__Group__0__Impl"
    // InternalGame.g:4106:1: rule__Bullet__Group__0__Impl : ( ( rule__Bullet__EntityidAssignment_0 ) ) ;
    public final void rule__Bullet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4110:1: ( ( ( rule__Bullet__EntityidAssignment_0 ) ) )
            // InternalGame.g:4111:1: ( ( rule__Bullet__EntityidAssignment_0 ) )
            {
            // InternalGame.g:4111:1: ( ( rule__Bullet__EntityidAssignment_0 ) )
            // InternalGame.g:4112:2: ( rule__Bullet__EntityidAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBulletAccess().getEntityidAssignment_0()); 
            }
            // InternalGame.g:4113:2: ( rule__Bullet__EntityidAssignment_0 )
            // InternalGame.g:4113:3: rule__Bullet__EntityidAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Bullet__EntityidAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBulletAccess().getEntityidAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bullet__Group__0__Impl"


    // $ANTLR start "rule__Bullet__Group__1"
    // InternalGame.g:4121:1: rule__Bullet__Group__1 : rule__Bullet__Group__1__Impl rule__Bullet__Group__2 ;
    public final void rule__Bullet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4125:1: ( rule__Bullet__Group__1__Impl rule__Bullet__Group__2 )
            // InternalGame.g:4126:2: rule__Bullet__Group__1__Impl rule__Bullet__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Bullet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Bullet__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bullet__Group__1"


    // $ANTLR start "rule__Bullet__Group__1__Impl"
    // InternalGame.g:4133:1: rule__Bullet__Group__1__Impl : ( ( rule__Bullet__NameAssignment_1 ) ) ;
    public final void rule__Bullet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4137:1: ( ( ( rule__Bullet__NameAssignment_1 ) ) )
            // InternalGame.g:4138:1: ( ( rule__Bullet__NameAssignment_1 ) )
            {
            // InternalGame.g:4138:1: ( ( rule__Bullet__NameAssignment_1 ) )
            // InternalGame.g:4139:2: ( rule__Bullet__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBulletAccess().getNameAssignment_1()); 
            }
            // InternalGame.g:4140:2: ( rule__Bullet__NameAssignment_1 )
            // InternalGame.g:4140:3: rule__Bullet__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Bullet__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBulletAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bullet__Group__1__Impl"


    // $ANTLR start "rule__Bullet__Group__2"
    // InternalGame.g:4148:1: rule__Bullet__Group__2 : rule__Bullet__Group__2__Impl rule__Bullet__Group__3 ;
    public final void rule__Bullet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4152:1: ( rule__Bullet__Group__2__Impl rule__Bullet__Group__3 )
            // InternalGame.g:4153:2: rule__Bullet__Group__2__Impl rule__Bullet__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Bullet__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Bullet__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bullet__Group__2"


    // $ANTLR start "rule__Bullet__Group__2__Impl"
    // InternalGame.g:4160:1: rule__Bullet__Group__2__Impl : ( '{' ) ;
    public final void rule__Bullet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4164:1: ( ( '{' ) )
            // InternalGame.g:4165:1: ( '{' )
            {
            // InternalGame.g:4165:1: ( '{' )
            // InternalGame.g:4166:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBulletAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBulletAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bullet__Group__2__Impl"


    // $ANTLR start "rule__Bullet__Group__3"
    // InternalGame.g:4175:1: rule__Bullet__Group__3 : rule__Bullet__Group__3__Impl rule__Bullet__Group__4 ;
    public final void rule__Bullet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4179:1: ( rule__Bullet__Group__3__Impl rule__Bullet__Group__4 )
            // InternalGame.g:4180:2: rule__Bullet__Group__3__Impl rule__Bullet__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Bullet__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Bullet__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bullet__Group__3"


    // $ANTLR start "rule__Bullet__Group__3__Impl"
    // InternalGame.g:4187:1: rule__Bullet__Group__3__Impl : ( ( rule__Bullet__AttributesBulletAssignment_3 )* ) ;
    public final void rule__Bullet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4191:1: ( ( ( rule__Bullet__AttributesBulletAssignment_3 )* ) )
            // InternalGame.g:4192:1: ( ( rule__Bullet__AttributesBulletAssignment_3 )* )
            {
            // InternalGame.g:4192:1: ( ( rule__Bullet__AttributesBulletAssignment_3 )* )
            // InternalGame.g:4193:2: ( rule__Bullet__AttributesBulletAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBulletAccess().getAttributesBulletAssignment_3()); 
            }
            // InternalGame.g:4194:2: ( rule__Bullet__AttributesBulletAssignment_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalGame.g:4194:3: rule__Bullet__AttributesBulletAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Bullet__AttributesBulletAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBulletAccess().getAttributesBulletAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bullet__Group__3__Impl"


    // $ANTLR start "rule__Bullet__Group__4"
    // InternalGame.g:4202:1: rule__Bullet__Group__4 : rule__Bullet__Group__4__Impl ;
    public final void rule__Bullet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4206:1: ( rule__Bullet__Group__4__Impl )
            // InternalGame.g:4207:2: rule__Bullet__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bullet__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bullet__Group__4"


    // $ANTLR start "rule__Bullet__Group__4__Impl"
    // InternalGame.g:4213:1: rule__Bullet__Group__4__Impl : ( '}' ) ;
    public final void rule__Bullet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4217:1: ( ( '}' ) )
            // InternalGame.g:4218:1: ( '}' )
            {
            // InternalGame.g:4218:1: ( '}' )
            // InternalGame.g:4219:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBulletAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBulletAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bullet__Group__4__Impl"


    // $ANTLR start "rule__Initializer__Group__0"
    // InternalGame.g:4229:1: rule__Initializer__Group__0 : rule__Initializer__Group__0__Impl rule__Initializer__Group__1 ;
    public final void rule__Initializer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4233:1: ( rule__Initializer__Group__0__Impl rule__Initializer__Group__1 )
            // InternalGame.g:4234:2: rule__Initializer__Group__0__Impl rule__Initializer__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Initializer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Initializer__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initializer__Group__0"


    // $ANTLR start "rule__Initializer__Group__0__Impl"
    // InternalGame.g:4241:1: rule__Initializer__Group__0__Impl : ( () ) ;
    public final void rule__Initializer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4245:1: ( ( () ) )
            // InternalGame.g:4246:1: ( () )
            {
            // InternalGame.g:4246:1: ( () )
            // InternalGame.g:4247:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInitializerAccess().getInitializerAction_0()); 
            }
            // InternalGame.g:4248:2: ()
            // InternalGame.g:4248:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInitializerAccess().getInitializerAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initializer__Group__0__Impl"


    // $ANTLR start "rule__Initializer__Group__1"
    // InternalGame.g:4256:1: rule__Initializer__Group__1 : rule__Initializer__Group__1__Impl rule__Initializer__Group__2 ;
    public final void rule__Initializer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4260:1: ( rule__Initializer__Group__1__Impl rule__Initializer__Group__2 )
            // InternalGame.g:4261:2: rule__Initializer__Group__1__Impl rule__Initializer__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Initializer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Initializer__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initializer__Group__1"


    // $ANTLR start "rule__Initializer__Group__1__Impl"
    // InternalGame.g:4268:1: rule__Initializer__Group__1__Impl : ( ( rule__Initializer__EntityIdAssignment_1 ) ) ;
    public final void rule__Initializer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4272:1: ( ( ( rule__Initializer__EntityIdAssignment_1 ) ) )
            // InternalGame.g:4273:1: ( ( rule__Initializer__EntityIdAssignment_1 ) )
            {
            // InternalGame.g:4273:1: ( ( rule__Initializer__EntityIdAssignment_1 ) )
            // InternalGame.g:4274:2: ( rule__Initializer__EntityIdAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInitializerAccess().getEntityIdAssignment_1()); 
            }
            // InternalGame.g:4275:2: ( rule__Initializer__EntityIdAssignment_1 )
            // InternalGame.g:4275:3: rule__Initializer__EntityIdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Initializer__EntityIdAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInitializerAccess().getEntityIdAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initializer__Group__1__Impl"


    // $ANTLR start "rule__Initializer__Group__2"
    // InternalGame.g:4283:1: rule__Initializer__Group__2 : rule__Initializer__Group__2__Impl rule__Initializer__Group__3 ;
    public final void rule__Initializer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4287:1: ( rule__Initializer__Group__2__Impl rule__Initializer__Group__3 )
            // InternalGame.g:4288:2: rule__Initializer__Group__2__Impl rule__Initializer__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Initializer__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Initializer__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initializer__Group__2"


    // $ANTLR start "rule__Initializer__Group__2__Impl"
    // InternalGame.g:4295:1: rule__Initializer__Group__2__Impl : ( '{' ) ;
    public final void rule__Initializer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4299:1: ( ( '{' ) )
            // InternalGame.g:4300:1: ( '{' )
            {
            // InternalGame.g:4300:1: ( '{' )
            // InternalGame.g:4301:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInitializerAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInitializerAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initializer__Group__2__Impl"


    // $ANTLR start "rule__Initializer__Group__3"
    // InternalGame.g:4310:1: rule__Initializer__Group__3 : rule__Initializer__Group__3__Impl rule__Initializer__Group__4 ;
    public final void rule__Initializer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4314:1: ( rule__Initializer__Group__3__Impl rule__Initializer__Group__4 )
            // InternalGame.g:4315:2: rule__Initializer__Group__3__Impl rule__Initializer__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Initializer__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Initializer__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initializer__Group__3"


    // $ANTLR start "rule__Initializer__Group__3__Impl"
    // InternalGame.g:4322:1: rule__Initializer__Group__3__Impl : ( ( rule__Initializer__AttributesInitializerAssignment_3 )* ) ;
    public final void rule__Initializer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4326:1: ( ( ( rule__Initializer__AttributesInitializerAssignment_3 )* ) )
            // InternalGame.g:4327:1: ( ( rule__Initializer__AttributesInitializerAssignment_3 )* )
            {
            // InternalGame.g:4327:1: ( ( rule__Initializer__AttributesInitializerAssignment_3 )* )
            // InternalGame.g:4328:2: ( rule__Initializer__AttributesInitializerAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInitializerAccess().getAttributesInitializerAssignment_3()); 
            }
            // InternalGame.g:4329:2: ( rule__Initializer__AttributesInitializerAssignment_3 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalGame.g:4329:3: rule__Initializer__AttributesInitializerAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Initializer__AttributesInitializerAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInitializerAccess().getAttributesInitializerAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initializer__Group__3__Impl"


    // $ANTLR start "rule__Initializer__Group__4"
    // InternalGame.g:4337:1: rule__Initializer__Group__4 : rule__Initializer__Group__4__Impl ;
    public final void rule__Initializer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4341:1: ( rule__Initializer__Group__4__Impl )
            // InternalGame.g:4342:2: rule__Initializer__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Initializer__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initializer__Group__4"


    // $ANTLR start "rule__Initializer__Group__4__Impl"
    // InternalGame.g:4348:1: rule__Initializer__Group__4__Impl : ( '}' ) ;
    public final void rule__Initializer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4352:1: ( ( '}' ) )
            // InternalGame.g:4353:1: ( '}' )
            {
            // InternalGame.g:4353:1: ( '}' )
            // InternalGame.g:4354:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInitializerAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInitializerAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initializer__Group__4__Impl"


    // $ANTLR start "rule__AttributeInitializer__Group__0"
    // InternalGame.g:4364:1: rule__AttributeInitializer__Group__0 : rule__AttributeInitializer__Group__0__Impl rule__AttributeInitializer__Group__1 ;
    public final void rule__AttributeInitializer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4368:1: ( rule__AttributeInitializer__Group__0__Impl rule__AttributeInitializer__Group__1 )
            // InternalGame.g:4369:2: rule__AttributeInitializer__Group__0__Impl rule__AttributeInitializer__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__AttributeInitializer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeInitializer__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeInitializer__Group__0"


    // $ANTLR start "rule__AttributeInitializer__Group__0__Impl"
    // InternalGame.g:4376:1: rule__AttributeInitializer__Group__0__Impl : ( ( rule__AttributeInitializer__AttributeIdAssignment_0 ) ) ;
    public final void rule__AttributeInitializer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4380:1: ( ( ( rule__AttributeInitializer__AttributeIdAssignment_0 ) ) )
            // InternalGame.g:4381:1: ( ( rule__AttributeInitializer__AttributeIdAssignment_0 ) )
            {
            // InternalGame.g:4381:1: ( ( rule__AttributeInitializer__AttributeIdAssignment_0 ) )
            // InternalGame.g:4382:2: ( rule__AttributeInitializer__AttributeIdAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeInitializerAccess().getAttributeIdAssignment_0()); 
            }
            // InternalGame.g:4383:2: ( rule__AttributeInitializer__AttributeIdAssignment_0 )
            // InternalGame.g:4383:3: rule__AttributeInitializer__AttributeIdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeInitializer__AttributeIdAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeInitializerAccess().getAttributeIdAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeInitializer__Group__0__Impl"


    // $ANTLR start "rule__AttributeInitializer__Group__1"
    // InternalGame.g:4391:1: rule__AttributeInitializer__Group__1 : rule__AttributeInitializer__Group__1__Impl rule__AttributeInitializer__Group__2 ;
    public final void rule__AttributeInitializer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4395:1: ( rule__AttributeInitializer__Group__1__Impl rule__AttributeInitializer__Group__2 )
            // InternalGame.g:4396:2: rule__AttributeInitializer__Group__1__Impl rule__AttributeInitializer__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__AttributeInitializer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AttributeInitializer__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeInitializer__Group__1"


    // $ANTLR start "rule__AttributeInitializer__Group__1__Impl"
    // InternalGame.g:4403:1: rule__AttributeInitializer__Group__1__Impl : ( ( rule__AttributeInitializer__AmountValueIdAssignment_1 )? ) ;
    public final void rule__AttributeInitializer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4407:1: ( ( ( rule__AttributeInitializer__AmountValueIdAssignment_1 )? ) )
            // InternalGame.g:4408:1: ( ( rule__AttributeInitializer__AmountValueIdAssignment_1 )? )
            {
            // InternalGame.g:4408:1: ( ( rule__AttributeInitializer__AmountValueIdAssignment_1 )? )
            // InternalGame.g:4409:2: ( rule__AttributeInitializer__AmountValueIdAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeInitializerAccess().getAmountValueIdAssignment_1()); 
            }
            // InternalGame.g:4410:2: ( rule__AttributeInitializer__AmountValueIdAssignment_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGame.g:4410:3: rule__AttributeInitializer__AmountValueIdAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeInitializer__AmountValueIdAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeInitializerAccess().getAmountValueIdAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeInitializer__Group__1__Impl"


    // $ANTLR start "rule__AttributeInitializer__Group__2"
    // InternalGame.g:4418:1: rule__AttributeInitializer__Group__2 : rule__AttributeInitializer__Group__2__Impl ;
    public final void rule__AttributeInitializer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4422:1: ( rule__AttributeInitializer__Group__2__Impl )
            // InternalGame.g:4423:2: rule__AttributeInitializer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeInitializer__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeInitializer__Group__2"


    // $ANTLR start "rule__AttributeInitializer__Group__2__Impl"
    // InternalGame.g:4429:1: rule__AttributeInitializer__Group__2__Impl : ( ( rule__AttributeInitializer__TargetAssignment_2 ) ) ;
    public final void rule__AttributeInitializer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4433:1: ( ( ( rule__AttributeInitializer__TargetAssignment_2 ) ) )
            // InternalGame.g:4434:1: ( ( rule__AttributeInitializer__TargetAssignment_2 ) )
            {
            // InternalGame.g:4434:1: ( ( rule__AttributeInitializer__TargetAssignment_2 ) )
            // InternalGame.g:4435:2: ( rule__AttributeInitializer__TargetAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeInitializerAccess().getTargetAssignment_2()); 
            }
            // InternalGame.g:4436:2: ( rule__AttributeInitializer__TargetAssignment_2 )
            // InternalGame.g:4436:3: rule__AttributeInitializer__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeInitializer__TargetAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeInitializerAccess().getTargetAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeInitializer__Group__2__Impl"


    // $ANTLR start "rule__TargetRef__Group__0"
    // InternalGame.g:4445:1: rule__TargetRef__Group__0 : rule__TargetRef__Group__0__Impl rule__TargetRef__Group__1 ;
    public final void rule__TargetRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4449:1: ( rule__TargetRef__Group__0__Impl rule__TargetRef__Group__1 )
            // InternalGame.g:4450:2: rule__TargetRef__Group__0__Impl rule__TargetRef__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TargetRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TargetRef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetRef__Group__0"


    // $ANTLR start "rule__TargetRef__Group__0__Impl"
    // InternalGame.g:4457:1: rule__TargetRef__Group__0__Impl : ( ( rule__TargetRef__TargetIdAssignment_0 ) ) ;
    public final void rule__TargetRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4461:1: ( ( ( rule__TargetRef__TargetIdAssignment_0 ) ) )
            // InternalGame.g:4462:1: ( ( rule__TargetRef__TargetIdAssignment_0 ) )
            {
            // InternalGame.g:4462:1: ( ( rule__TargetRef__TargetIdAssignment_0 ) )
            // InternalGame.g:4463:2: ( rule__TargetRef__TargetIdAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetRefAccess().getTargetIdAssignment_0()); 
            }
            // InternalGame.g:4464:2: ( rule__TargetRef__TargetIdAssignment_0 )
            // InternalGame.g:4464:3: rule__TargetRef__TargetIdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TargetRef__TargetIdAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetRefAccess().getTargetIdAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetRef__Group__0__Impl"


    // $ANTLR start "rule__TargetRef__Group__1"
    // InternalGame.g:4472:1: rule__TargetRef__Group__1 : rule__TargetRef__Group__1__Impl rule__TargetRef__Group__2 ;
    public final void rule__TargetRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4476:1: ( rule__TargetRef__Group__1__Impl rule__TargetRef__Group__2 )
            // InternalGame.g:4477:2: rule__TargetRef__Group__1__Impl rule__TargetRef__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__TargetRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TargetRef__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetRef__Group__1"


    // $ANTLR start "rule__TargetRef__Group__1__Impl"
    // InternalGame.g:4484:1: rule__TargetRef__Group__1__Impl : ( '{' ) ;
    public final void rule__TargetRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4488:1: ( ( '{' ) )
            // InternalGame.g:4489:1: ( '{' )
            {
            // InternalGame.g:4489:1: ( '{' )
            // InternalGame.g:4490:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetRefAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetRefAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetRef__Group__1__Impl"


    // $ANTLR start "rule__TargetRef__Group__2"
    // InternalGame.g:4499:1: rule__TargetRef__Group__2 : rule__TargetRef__Group__2__Impl rule__TargetRef__Group__3 ;
    public final void rule__TargetRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4503:1: ( rule__TargetRef__Group__2__Impl rule__TargetRef__Group__3 )
            // InternalGame.g:4504:2: rule__TargetRef__Group__2__Impl rule__TargetRef__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__TargetRef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TargetRef__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetRef__Group__2"


    // $ANTLR start "rule__TargetRef__Group__2__Impl"
    // InternalGame.g:4511:1: rule__TargetRef__Group__2__Impl : ( ( rule__TargetRef__LocationsIdAssignment_2 ) ) ;
    public final void rule__TargetRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4515:1: ( ( ( rule__TargetRef__LocationsIdAssignment_2 ) ) )
            // InternalGame.g:4516:1: ( ( rule__TargetRef__LocationsIdAssignment_2 ) )
            {
            // InternalGame.g:4516:1: ( ( rule__TargetRef__LocationsIdAssignment_2 ) )
            // InternalGame.g:4517:2: ( rule__TargetRef__LocationsIdAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetRefAccess().getLocationsIdAssignment_2()); 
            }
            // InternalGame.g:4518:2: ( rule__TargetRef__LocationsIdAssignment_2 )
            // InternalGame.g:4518:3: rule__TargetRef__LocationsIdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TargetRef__LocationsIdAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetRefAccess().getLocationsIdAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetRef__Group__2__Impl"


    // $ANTLR start "rule__TargetRef__Group__3"
    // InternalGame.g:4526:1: rule__TargetRef__Group__3 : rule__TargetRef__Group__3__Impl rule__TargetRef__Group__4 ;
    public final void rule__TargetRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4530:1: ( rule__TargetRef__Group__3__Impl rule__TargetRef__Group__4 )
            // InternalGame.g:4531:2: rule__TargetRef__Group__3__Impl rule__TargetRef__Group__4
            {
            pushFollow(FOLLOW_43);
            rule__TargetRef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TargetRef__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetRef__Group__3"


    // $ANTLR start "rule__TargetRef__Group__3__Impl"
    // InternalGame.g:4538:1: rule__TargetRef__Group__3__Impl : ( ( rule__TargetRef__Group_3__0 )* ) ;
    public final void rule__TargetRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4542:1: ( ( ( rule__TargetRef__Group_3__0 )* ) )
            // InternalGame.g:4543:1: ( ( rule__TargetRef__Group_3__0 )* )
            {
            // InternalGame.g:4543:1: ( ( rule__TargetRef__Group_3__0 )* )
            // InternalGame.g:4544:2: ( rule__TargetRef__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetRefAccess().getGroup_3()); 
            }
            // InternalGame.g:4545:2: ( rule__TargetRef__Group_3__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==23) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalGame.g:4545:3: rule__TargetRef__Group_3__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__TargetRef__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetRefAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetRef__Group__3__Impl"


    // $ANTLR start "rule__TargetRef__Group__4"
    // InternalGame.g:4553:1: rule__TargetRef__Group__4 : rule__TargetRef__Group__4__Impl ;
    public final void rule__TargetRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4557:1: ( rule__TargetRef__Group__4__Impl )
            // InternalGame.g:4558:2: rule__TargetRef__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetRef__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetRef__Group__4"


    // $ANTLR start "rule__TargetRef__Group__4__Impl"
    // InternalGame.g:4564:1: rule__TargetRef__Group__4__Impl : ( '}' ) ;
    public final void rule__TargetRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4568:1: ( ( '}' ) )
            // InternalGame.g:4569:1: ( '}' )
            {
            // InternalGame.g:4569:1: ( '}' )
            // InternalGame.g:4570:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetRefAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetRefAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetRef__Group__4__Impl"


    // $ANTLR start "rule__TargetRef__Group_3__0"
    // InternalGame.g:4580:1: rule__TargetRef__Group_3__0 : rule__TargetRef__Group_3__0__Impl rule__TargetRef__Group_3__1 ;
    public final void rule__TargetRef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4584:1: ( rule__TargetRef__Group_3__0__Impl rule__TargetRef__Group_3__1 )
            // InternalGame.g:4585:2: rule__TargetRef__Group_3__0__Impl rule__TargetRef__Group_3__1
            {
            pushFollow(FOLLOW_42);
            rule__TargetRef__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TargetRef__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetRef__Group_3__0"


    // $ANTLR start "rule__TargetRef__Group_3__0__Impl"
    // InternalGame.g:4592:1: rule__TargetRef__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TargetRef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4596:1: ( ( ',' ) )
            // InternalGame.g:4597:1: ( ',' )
            {
            // InternalGame.g:4597:1: ( ',' )
            // InternalGame.g:4598:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetRefAccess().getCommaKeyword_3_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetRefAccess().getCommaKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetRef__Group_3__0__Impl"


    // $ANTLR start "rule__TargetRef__Group_3__1"
    // InternalGame.g:4607:1: rule__TargetRef__Group_3__1 : rule__TargetRef__Group_3__1__Impl ;
    public final void rule__TargetRef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4611:1: ( rule__TargetRef__Group_3__1__Impl )
            // InternalGame.g:4612:2: rule__TargetRef__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetRef__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetRef__Group_3__1"


    // $ANTLR start "rule__TargetRef__Group_3__1__Impl"
    // InternalGame.g:4618:1: rule__TargetRef__Group_3__1__Impl : ( ( rule__TargetRef__LocationsIdAssignment_3_1 ) ) ;
    public final void rule__TargetRef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4622:1: ( ( ( rule__TargetRef__LocationsIdAssignment_3_1 ) ) )
            // InternalGame.g:4623:1: ( ( rule__TargetRef__LocationsIdAssignment_3_1 ) )
            {
            // InternalGame.g:4623:1: ( ( rule__TargetRef__LocationsIdAssignment_3_1 ) )
            // InternalGame.g:4624:2: ( rule__TargetRef__LocationsIdAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetRefAccess().getLocationsIdAssignment_3_1()); 
            }
            // InternalGame.g:4625:2: ( rule__TargetRef__LocationsIdAssignment_3_1 )
            // InternalGame.g:4625:3: rule__TargetRef__LocationsIdAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TargetRef__LocationsIdAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetRefAccess().getLocationsIdAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetRef__Group_3__1__Impl"


    // $ANTLR start "rule__Location__Group_1__0"
    // InternalGame.g:4634:1: rule__Location__Group_1__0 : rule__Location__Group_1__0__Impl rule__Location__Group_1__1 ;
    public final void rule__Location__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4638:1: ( rule__Location__Group_1__0__Impl rule__Location__Group_1__1 )
            // InternalGame.g:4639:2: rule__Location__Group_1__0__Impl rule__Location__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Location__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Location__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_1__0"


    // $ANTLR start "rule__Location__Group_1__0__Impl"
    // InternalGame.g:4646:1: rule__Location__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Location__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4650:1: ( ( '(' ) )
            // InternalGame.g:4651:1: ( '(' )
            {
            // InternalGame.g:4651:1: ( '(' )
            // InternalGame.g:4652:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_1__0__Impl"


    // $ANTLR start "rule__Location__Group_1__1"
    // InternalGame.g:4661:1: rule__Location__Group_1__1 : rule__Location__Group_1__1__Impl rule__Location__Group_1__2 ;
    public final void rule__Location__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4665:1: ( rule__Location__Group_1__1__Impl rule__Location__Group_1__2 )
            // InternalGame.g:4666:2: rule__Location__Group_1__1__Impl rule__Location__Group_1__2
            {
            pushFollow(FOLLOW_45);
            rule__Location__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Location__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_1__1"


    // $ANTLR start "rule__Location__Group_1__1__Impl"
    // InternalGame.g:4673:1: rule__Location__Group_1__1__Impl : ( ( rule__Location__TypeaAssignment_1_1 ) ) ;
    public final void rule__Location__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4677:1: ( ( ( rule__Location__TypeaAssignment_1_1 ) ) )
            // InternalGame.g:4678:1: ( ( rule__Location__TypeaAssignment_1_1 ) )
            {
            // InternalGame.g:4678:1: ( ( rule__Location__TypeaAssignment_1_1 ) )
            // InternalGame.g:4679:2: ( rule__Location__TypeaAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationAccess().getTypeaAssignment_1_1()); 
            }
            // InternalGame.g:4680:2: ( rule__Location__TypeaAssignment_1_1 )
            // InternalGame.g:4680:3: rule__Location__TypeaAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Location__TypeaAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationAccess().getTypeaAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_1__1__Impl"


    // $ANTLR start "rule__Location__Group_1__2"
    // InternalGame.g:4688:1: rule__Location__Group_1__2 : rule__Location__Group_1__2__Impl rule__Location__Group_1__3 ;
    public final void rule__Location__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4692:1: ( rule__Location__Group_1__2__Impl rule__Location__Group_1__3 )
            // InternalGame.g:4693:2: rule__Location__Group_1__2__Impl rule__Location__Group_1__3
            {
            pushFollow(FOLLOW_10);
            rule__Location__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Location__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_1__2"


    // $ANTLR start "rule__Location__Group_1__2__Impl"
    // InternalGame.g:4700:1: rule__Location__Group_1__2__Impl : ( ',' ) ;
    public final void rule__Location__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4704:1: ( ( ',' ) )
            // InternalGame.g:4705:1: ( ',' )
            {
            // InternalGame.g:4705:1: ( ',' )
            // InternalGame.g:4706:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationAccess().getCommaKeyword_1_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationAccess().getCommaKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_1__2__Impl"


    // $ANTLR start "rule__Location__Group_1__3"
    // InternalGame.g:4715:1: rule__Location__Group_1__3 : rule__Location__Group_1__3__Impl rule__Location__Group_1__4 ;
    public final void rule__Location__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4719:1: ( rule__Location__Group_1__3__Impl rule__Location__Group_1__4 )
            // InternalGame.g:4720:2: rule__Location__Group_1__3__Impl rule__Location__Group_1__4
            {
            pushFollow(FOLLOW_20);
            rule__Location__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Location__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_1__3"


    // $ANTLR start "rule__Location__Group_1__3__Impl"
    // InternalGame.g:4727:1: rule__Location__Group_1__3__Impl : ( ( rule__Location__TypebAssignment_1_3 ) ) ;
    public final void rule__Location__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4731:1: ( ( ( rule__Location__TypebAssignment_1_3 ) ) )
            // InternalGame.g:4732:1: ( ( rule__Location__TypebAssignment_1_3 ) )
            {
            // InternalGame.g:4732:1: ( ( rule__Location__TypebAssignment_1_3 ) )
            // InternalGame.g:4733:2: ( rule__Location__TypebAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationAccess().getTypebAssignment_1_3()); 
            }
            // InternalGame.g:4734:2: ( rule__Location__TypebAssignment_1_3 )
            // InternalGame.g:4734:3: rule__Location__TypebAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Location__TypebAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationAccess().getTypebAssignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_1__3__Impl"


    // $ANTLR start "rule__Location__Group_1__4"
    // InternalGame.g:4742:1: rule__Location__Group_1__4 : rule__Location__Group_1__4__Impl ;
    public final void rule__Location__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4746:1: ( rule__Location__Group_1__4__Impl )
            // InternalGame.g:4747:2: rule__Location__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_1__4"


    // $ANTLR start "rule__Location__Group_1__4__Impl"
    // InternalGame.g:4753:1: rule__Location__Group_1__4__Impl : ( ')' ) ;
    public final void rule__Location__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4757:1: ( ( ')' ) )
            // InternalGame.g:4758:1: ( ')' )
            {
            // InternalGame.g:4758:1: ( ')' )
            // InternalGame.g:4759:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationAccess().getRightParenthesisKeyword_1_4()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationAccess().getRightParenthesisKeyword_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_1__4__Impl"


    // $ANTLR start "rule__Model__EntitiesAssignment_3"
    // InternalGame.g:4769:1: rule__Model__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__Model__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4773:1: ( ( ruleEntity ) )
            // InternalGame.g:4774:2: ( ruleEntity )
            {
            // InternalGame.g:4774:2: ( ruleEntity )
            // InternalGame.g:4775:3: ruleEntity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EntitiesAssignment_3"


    // $ANTLR start "rule__GameMap__EntityIdAssignment_0"
    // InternalGame.g:4784:1: rule__GameMap__EntityIdAssignment_0 : ( ( 'Map' ) ) ;
    public final void rule__GameMap__EntityIdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4788:1: ( ( ( 'Map' ) ) )
            // InternalGame.g:4789:2: ( ( 'Map' ) )
            {
            // InternalGame.g:4789:2: ( ( 'Map' ) )
            // InternalGame.g:4790:3: ( 'Map' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGameMapAccess().getEntityIdMapKeyword_0_0()); 
            }
            // InternalGame.g:4791:3: ( 'Map' )
            // InternalGame.g:4792:4: 'Map'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGameMapAccess().getEntityIdMapKeyword_0_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGameMapAccess().getEntityIdMapKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGameMapAccess().getEntityIdMapKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMap__EntityIdAssignment_0"


    // $ANTLR start "rule__GameMap__AttributeListAssignment_2"
    // InternalGame.g:4803:1: rule__GameMap__AttributeListAssignment_2 : ( ruleAttribute ) ;
    public final void rule__GameMap__AttributeListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4807:1: ( ( ruleAttribute ) )
            // InternalGame.g:4808:2: ( ruleAttribute )
            {
            // InternalGame.g:4808:2: ( ruleAttribute )
            // InternalGame.g:4809:3: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGameMapAccess().getAttributeListAttributeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGameMapAccess().getAttributeListAttributeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameMap__AttributeListAssignment_2"


    // $ANTLR start "rule__Attribute__AttributenameAssignment_1"
    // InternalGame.g:4818:1: rule__Attribute__AttributenameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__AttributenameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4822:1: ( ( RULE_ID ) )
            // InternalGame.g:4823:2: ( RULE_ID )
            {
            // InternalGame.g:4823:2: ( RULE_ID )
            // InternalGame.g:4824:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAttributenameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getAttributenameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AttributenameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // InternalGame.g:4833:1: rule__Attribute__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4837:1: ( ( ruleType ) )
            // InternalGame.g:4838:2: ( ruleType )
            {
            // InternalGame.g:4838:2: ( ruleType )
            // InternalGame.g:4839:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__Character__EntityidAssignment_0"
    // InternalGame.g:4848:1: rule__Character__EntityidAssignment_0 : ( ( 'Character' ) ) ;
    public final void rule__Character__EntityidAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4852:1: ( ( ( 'Character' ) ) )
            // InternalGame.g:4853:2: ( ( 'Character' ) )
            {
            // InternalGame.g:4853:2: ( ( 'Character' ) )
            // InternalGame.g:4854:3: ( 'Character' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getEntityidCharacterKeyword_0_0()); 
            }
            // InternalGame.g:4855:3: ( 'Character' )
            // InternalGame.g:4856:4: 'Character'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getEntityidCharacterKeyword_0_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getEntityidCharacterKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getEntityidCharacterKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__EntityidAssignment_0"


    // $ANTLR start "rule__Character__CharIdAssignment_1"
    // InternalGame.g:4867:1: rule__Character__CharIdAssignment_1 : ( ruleCharType ) ;
    public final void rule__Character__CharIdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4871:1: ( ( ruleCharType ) )
            // InternalGame.g:4872:2: ( ruleCharType )
            {
            // InternalGame.g:4872:2: ( ruleCharType )
            // InternalGame.g:4873:3: ruleCharType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getCharIdCharTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCharType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getCharIdCharTypeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__CharIdAssignment_1"


    // $ANTLR start "rule__Character__NameAssignment_2"
    // InternalGame.g:4882:1: rule__Character__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Character__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4886:1: ( ( RULE_ID ) )
            // InternalGame.g:4887:2: ( RULE_ID )
            {
            // InternalGame.g:4887:2: ( RULE_ID )
            // InternalGame.g:4888:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__NameAssignment_2"


    // $ANTLR start "rule__Character__AttAssignment_4"
    // InternalGame.g:4897:1: rule__Character__AttAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Character__AttAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4901:1: ( ( ruleAttribute ) )
            // InternalGame.g:4902:2: ( ruleAttribute )
            {
            // InternalGame.g:4902:2: ( ruleAttribute )
            // InternalGame.g:4903:3: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAccess().getAttAttributeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAccess().getAttAttributeParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__AttAssignment_4"


    // $ANTLR start "rule__Type__ValueIdAssignment_0"
    // InternalGame.g:4912:1: rule__Type__ValueIdAssignment_0 : ( ruleINTORDEC ) ;
    public final void rule__Type__ValueIdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4916:1: ( ( ruleINTORDEC ) )
            // InternalGame.g:4917:2: ( ruleINTORDEC )
            {
            // InternalGame.g:4917:2: ( ruleINTORDEC )
            // InternalGame.g:4918:3: ruleINTORDEC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getValueIdINTORDECParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleINTORDEC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getValueIdINTORDECParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ValueIdAssignment_0"


    // $ANTLR start "rule__Type__ValueIdAssignment_1"
    // InternalGame.g:4927:1: rule__Type__ValueIdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__ValueIdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4931:1: ( ( RULE_ID ) )
            // InternalGame.g:4932:2: ( RULE_ID )
            {
            // InternalGame.g:4932:2: ( RULE_ID )
            // InternalGame.g:4933:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getValueIdIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getValueIdIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ValueIdAssignment_1"


    // $ANTLR start "rule__Type__ValueIdVecAssignment_2"
    // InternalGame.g:4942:1: rule__Type__ValueIdVecAssignment_2 : ( ruleVECTOR ) ;
    public final void rule__Type__ValueIdVecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4946:1: ( ( ruleVECTOR ) )
            // InternalGame.g:4947:2: ( ruleVECTOR )
            {
            // InternalGame.g:4947:2: ( ruleVECTOR )
            // InternalGame.g:4948:3: ruleVECTOR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getValueIdVecVECTORParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVECTOR();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getValueIdVecVECTORParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ValueIdVecAssignment_2"


    // $ANTLR start "rule__VECTOR__XValAssignment_0"
    // InternalGame.g:4957:1: rule__VECTOR__XValAssignment_0 : ( ruleINTORDEC ) ;
    public final void rule__VECTOR__XValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4961:1: ( ( ruleINTORDEC ) )
            // InternalGame.g:4962:2: ( ruleINTORDEC )
            {
            // InternalGame.g:4962:2: ( ruleINTORDEC )
            // InternalGame.g:4963:3: ruleINTORDEC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVECTORAccess().getXValINTORDECParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleINTORDEC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVECTORAccess().getXValINTORDECParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VECTOR__XValAssignment_0"


    // $ANTLR start "rule__VECTOR__YValAssignment_1"
    // InternalGame.g:4972:1: rule__VECTOR__YValAssignment_1 : ( ruleINTORDEC ) ;
    public final void rule__VECTOR__YValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4976:1: ( ( ruleINTORDEC ) )
            // InternalGame.g:4977:2: ( ruleINTORDEC )
            {
            // InternalGame.g:4977:2: ( ruleINTORDEC )
            // InternalGame.g:4978:3: ruleINTORDEC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVECTORAccess().getYValINTORDECParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleINTORDEC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVECTORAccess().getYValINTORDECParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VECTOR__YValAssignment_1"


    // $ANTLR start "rule__CharType__CharTypeIdAssignment"
    // InternalGame.g:4987:1: rule__CharType__CharTypeIdAssignment : ( RULE_ID ) ;
    public final void rule__CharType__CharTypeIdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:4991:1: ( ( RULE_ID ) )
            // InternalGame.g:4992:2: ( RULE_ID )
            {
            // InternalGame.g:4992:2: ( RULE_ID )
            // InternalGame.g:4993:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharTypeAccess().getCharTypeIdIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharTypeAccess().getCharTypeIdIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharType__CharTypeIdAssignment"


    // $ANTLR start "rule__Object__EntityidAssignment_0"
    // InternalGame.g:5002:1: rule__Object__EntityidAssignment_0 : ( ( 'Object' ) ) ;
    public final void rule__Object__EntityidAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5006:1: ( ( ( 'Object' ) ) )
            // InternalGame.g:5007:2: ( ( 'Object' ) )
            {
            // InternalGame.g:5007:2: ( ( 'Object' ) )
            // InternalGame.g:5008:3: ( 'Object' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getEntityidObjectKeyword_0_0()); 
            }
            // InternalGame.g:5009:3: ( 'Object' )
            // InternalGame.g:5010:4: 'Object'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getEntityidObjectKeyword_0_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getEntityidObjectKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getEntityidObjectKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__EntityidAssignment_0"


    // $ANTLR start "rule__Object__NameAssignment_1"
    // InternalGame.g:5021:1: rule__Object__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Object__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5025:1: ( ( RULE_ID ) )
            // InternalGame.g:5026:2: ( RULE_ID )
            {
            // InternalGame.g:5026:2: ( RULE_ID )
            // InternalGame.g:5027:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__NameAssignment_1"


    // $ANTLR start "rule__Object__AttAssignment_3"
    // InternalGame.g:5036:1: rule__Object__AttAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Object__AttAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5040:1: ( ( ruleAttribute ) )
            // InternalGame.g:5041:2: ( ruleAttribute )
            {
            // InternalGame.g:5041:2: ( ruleAttribute )
            // InternalGame.g:5042:3: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectAccess().getAttAttributeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectAccess().getAttAttributeParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__AttAssignment_3"


    // $ANTLR start "rule__Pathfinding__EntityidAssignment_0"
    // InternalGame.g:5051:1: rule__Pathfinding__EntityidAssignment_0 : ( ( 'Pathfinding' ) ) ;
    public final void rule__Pathfinding__EntityidAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5055:1: ( ( ( 'Pathfinding' ) ) )
            // InternalGame.g:5056:2: ( ( 'Pathfinding' ) )
            {
            // InternalGame.g:5056:2: ( ( 'Pathfinding' ) )
            // InternalGame.g:5057:3: ( 'Pathfinding' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathfindingAccess().getEntityidPathfindingKeyword_0_0()); 
            }
            // InternalGame.g:5058:3: ( 'Pathfinding' )
            // InternalGame.g:5059:4: 'Pathfinding'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathfindingAccess().getEntityidPathfindingKeyword_0_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathfindingAccess().getEntityidPathfindingKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathfindingAccess().getEntityidPathfindingKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pathfinding__EntityidAssignment_0"


    // $ANTLR start "rule__Pathfinding__NameAssignment_1"
    // InternalGame.g:5070:1: rule__Pathfinding__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Pathfinding__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5074:1: ( ( RULE_ID ) )
            // InternalGame.g:5075:2: ( RULE_ID )
            {
            // InternalGame.g:5075:2: ( RULE_ID )
            // InternalGame.g:5076:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathfindingAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathfindingAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pathfinding__NameAssignment_1"


    // $ANTLR start "rule__Pathfinding__AttPathfindingAssignment_3"
    // InternalGame.g:5085:1: rule__Pathfinding__AttPathfindingAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Pathfinding__AttPathfindingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5089:1: ( ( ruleAttribute ) )
            // InternalGame.g:5090:2: ( ruleAttribute )
            {
            // InternalGame.g:5090:2: ( ruleAttribute )
            // InternalGame.g:5091:3: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathfindingAccess().getAttPathfindingAttributeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathfindingAccess().getAttPathfindingAttributeParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pathfinding__AttPathfindingAssignment_3"


    // $ANTLR start "rule__Pathfinding__ConditionsAssignment_4"
    // InternalGame.g:5100:1: rule__Pathfinding__ConditionsAssignment_4 : ( ruleCondition ) ;
    public final void rule__Pathfinding__ConditionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5104:1: ( ( ruleCondition ) )
            // InternalGame.g:5105:2: ( ruleCondition )
            {
            // InternalGame.g:5105:2: ( ruleCondition )
            // InternalGame.g:5106:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPathfindingAccess().getConditionsConditionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPathfindingAccess().getConditionsConditionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pathfinding__ConditionsAssignment_4"


    // $ANTLR start "rule__BooleanExpression__AttributeRefLeftAssignment_0"
    // InternalGame.g:5115:1: rule__BooleanExpression__AttributeRefLeftAssignment_0 : ( ruleCharacterAttr ) ;
    public final void rule__BooleanExpression__AttributeRefLeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5119:1: ( ( ruleCharacterAttr ) )
            // InternalGame.g:5120:2: ( ruleCharacterAttr )
            {
            // InternalGame.g:5120:2: ( ruleCharacterAttr )
            // InternalGame.g:5121:3: ruleCharacterAttr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getAttributeRefLeftCharacterAttrParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCharacterAttr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getAttributeRefLeftCharacterAttrParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__AttributeRefLeftAssignment_0"


    // $ANTLR start "rule__BooleanExpression__LeftExAssignment_1"
    // InternalGame.g:5130:1: rule__BooleanExpression__LeftExAssignment_1 : ( ruleExpression ) ;
    public final void rule__BooleanExpression__LeftExAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5134:1: ( ( ruleExpression ) )
            // InternalGame.g:5135:2: ( ruleExpression )
            {
            // InternalGame.g:5135:2: ( ruleExpression )
            // InternalGame.g:5136:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getLeftExExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getLeftExExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__LeftExAssignment_1"


    // $ANTLR start "rule__BooleanExpression__OperatorAssignment_2"
    // InternalGame.g:5145:1: rule__BooleanExpression__OperatorAssignment_2 : ( ruleCompOperator ) ;
    public final void rule__BooleanExpression__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5149:1: ( ( ruleCompOperator ) )
            // InternalGame.g:5150:2: ( ruleCompOperator )
            {
            // InternalGame.g:5150:2: ( ruleCompOperator )
            // InternalGame.g:5151:3: ruleCompOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getOperatorCompOperatorParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCompOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getOperatorCompOperatorParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__OperatorAssignment_2"


    // $ANTLR start "rule__BooleanExpression__AttributeRefRightAssignment_3"
    // InternalGame.g:5160:1: rule__BooleanExpression__AttributeRefRightAssignment_3 : ( ruleCharacterAttr ) ;
    public final void rule__BooleanExpression__AttributeRefRightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5164:1: ( ( ruleCharacterAttr ) )
            // InternalGame.g:5165:2: ( ruleCharacterAttr )
            {
            // InternalGame.g:5165:2: ( ruleCharacterAttr )
            // InternalGame.g:5166:3: ruleCharacterAttr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getAttributeRefRightCharacterAttrParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCharacterAttr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getAttributeRefRightCharacterAttrParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__AttributeRefRightAssignment_3"


    // $ANTLR start "rule__BooleanExpression__OpAssignment_4_0"
    // InternalGame.g:5175:1: rule__BooleanExpression__OpAssignment_4_0 : ( ruleLogicOperator ) ;
    public final void rule__BooleanExpression__OpAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5179:1: ( ( ruleLogicOperator ) )
            // InternalGame.g:5180:2: ( ruleLogicOperator )
            {
            // InternalGame.g:5180:2: ( ruleLogicOperator )
            // InternalGame.g:5181:3: ruleLogicOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getOpLogicOperatorParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLogicOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getOpLogicOperatorParserRuleCall_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__OpAssignment_4_0"


    // $ANTLR start "rule__BooleanExpression__RightExAssignment_4_1"
    // InternalGame.g:5190:1: rule__BooleanExpression__RightExAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__BooleanExpression__RightExAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5194:1: ( ( ruleExpression ) )
            // InternalGame.g:5195:2: ( ruleExpression )
            {
            // InternalGame.g:5195:2: ( ruleExpression )
            // InternalGame.g:5196:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getRightExExpressionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getRightExExpressionParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__RightExAssignment_4_1"


    // $ANTLR start "rule__Expression__TmAssignment_0"
    // InternalGame.g:5205:1: rule__Expression__TmAssignment_0 : ( ruleTerminalExpression ) ;
    public final void rule__Expression__TmAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5209:1: ( ( ruleTerminalExpression ) )
            // InternalGame.g:5210:2: ( ruleTerminalExpression )
            {
            // InternalGame.g:5210:2: ( ruleTerminalExpression )
            // InternalGame.g:5211:3: ruleTerminalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getTmTerminalExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getTmTerminalExpressionParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__TmAssignment_0"


    // $ANTLR start "rule__Expression__OpAssignment_1_1"
    // InternalGame.g:5220:1: rule__Expression__OpAssignment_1_1 : ( ruleLogicOperator ) ;
    public final void rule__Expression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5224:1: ( ( ruleLogicOperator ) )
            // InternalGame.g:5225:2: ( ruleLogicOperator )
            {
            // InternalGame.g:5225:2: ( ruleLogicOperator )
            // InternalGame.g:5226:3: ruleLogicOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOpLogicOperatorParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLogicOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOpLogicOperatorParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__OpAssignment_1_1"


    // $ANTLR start "rule__Expression__RightAssignment_1_2"
    // InternalGame.g:5235:1: rule__Expression__RightAssignment_1_2 : ( ruleTerminalExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5239:1: ( ( ruleTerminalExpression ) )
            // InternalGame.g:5240:2: ( ruleTerminalExpression )
            {
            // InternalGame.g:5240:2: ( ruleTerminalExpression )
            // InternalGame.g:5241:3: ruleTerminalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RightAssignment_1_2"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_1_1"
    // InternalGame.g:5250:1: rule__TerminalExpression__ValueAssignment_1_1 : ( ruleINTORDEC ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5254:1: ( ( ruleINTORDEC ) )
            // InternalGame.g:5255:2: ( ruleINTORDEC )
            {
            // InternalGame.g:5255:2: ( ruleINTORDEC )
            // InternalGame.g:5256:3: ruleINTORDEC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalExpressionAccess().getValueINTORDECParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleINTORDEC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalExpressionAccess().getValueINTORDECParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__Condition__IfConditionAssignment_2"
    // InternalGame.g:5265:1: rule__Condition__IfConditionAssignment_2 : ( ruleBooleanExpression ) ;
    public final void rule__Condition__IfConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5269:1: ( ( ruleBooleanExpression ) )
            // InternalGame.g:5270:2: ( ruleBooleanExpression )
            {
            // InternalGame.g:5270:2: ( ruleBooleanExpression )
            // InternalGame.g:5271:3: ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getIfConditionBooleanExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getIfConditionBooleanExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__IfConditionAssignment_2"


    // $ANTLR start "rule__Condition__ThenAssignment_4"
    // InternalGame.g:5280:1: rule__Condition__ThenAssignment_4 : ( ruleAction ) ;
    public final void rule__Condition__ThenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5284:1: ( ( ruleAction ) )
            // InternalGame.g:5285:2: ( ruleAction )
            {
            // InternalGame.g:5285:2: ( ruleAction )
            // InternalGame.g:5286:3: ruleAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getThenActionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getThenActionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ThenAssignment_4"


    // $ANTLR start "rule__Condition__ElseIfConditionAssignment_5_1"
    // InternalGame.g:5295:1: rule__Condition__ElseIfConditionAssignment_5_1 : ( ruleCondition ) ;
    public final void rule__Condition__ElseIfConditionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5299:1: ( ( ruleCondition ) )
            // InternalGame.g:5300:2: ( ruleCondition )
            {
            // InternalGame.g:5300:2: ( ruleCondition )
            // InternalGame.g:5301:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getElseIfConditionConditionParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getElseIfConditionConditionParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ElseIfConditionAssignment_5_1"


    // $ANTLR start "rule__ReferenceCharacter__CharacterIdAssignment_0_1"
    // InternalGame.g:5310:1: rule__ReferenceCharacter__CharacterIdAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceCharacter__CharacterIdAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5314:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5315:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5315:2: ( ( RULE_ID ) )
            // InternalGame.g:5316:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCharacterAccess().getCharacterIdCharacterCrossReference_0_1_0()); 
            }
            // InternalGame.g:5317:3: ( RULE_ID )
            // InternalGame.g:5318:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCharacterAccess().getCharacterIdCharacterIDTerminalRuleCall_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCharacterAccess().getCharacterIdCharacterIDTerminalRuleCall_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCharacterAccess().getCharacterIdCharacterCrossReference_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCharacter__CharacterIdAssignment_0_1"


    // $ANTLR start "rule__ReferenceCharacter__TargetIdAssignment_1_1"
    // InternalGame.g:5329:1: rule__ReferenceCharacter__TargetIdAssignment_1_1 : ( ( 'self' ) ) ;
    public final void rule__ReferenceCharacter__TargetIdAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5333:1: ( ( ( 'self' ) ) )
            // InternalGame.g:5334:2: ( ( 'self' ) )
            {
            // InternalGame.g:5334:2: ( ( 'self' ) )
            // InternalGame.g:5335:3: ( 'self' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCharacterAccess().getTargetIdSelfKeyword_1_1_0()); 
            }
            // InternalGame.g:5336:3: ( 'self' )
            // InternalGame.g:5337:4: 'self'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceCharacterAccess().getTargetIdSelfKeyword_1_1_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCharacterAccess().getTargetIdSelfKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceCharacterAccess().getTargetIdSelfKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceCharacter__TargetIdAssignment_1_1"


    // $ANTLR start "rule__CompOperator__OpAssignment_0_1"
    // InternalGame.g:5348:1: rule__CompOperator__OpAssignment_0_1 : ( ( '<' ) ) ;
    public final void rule__CompOperator__OpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5352:1: ( ( ( '<' ) ) )
            // InternalGame.g:5353:2: ( ( '<' ) )
            {
            // InternalGame.g:5353:2: ( ( '<' ) )
            // InternalGame.g:5354:3: ( '<' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getOpLessThanSignKeyword_0_1_0()); 
            }
            // InternalGame.g:5355:3: ( '<' )
            // InternalGame.g:5356:4: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getOpLessThanSignKeyword_0_1_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getOpLessThanSignKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getOpLessThanSignKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__OpAssignment_0_1"


    // $ANTLR start "rule__CompOperator__OpAssignment_1_1"
    // InternalGame.g:5367:1: rule__CompOperator__OpAssignment_1_1 : ( ( '>' ) ) ;
    public final void rule__CompOperator__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5371:1: ( ( ( '>' ) ) )
            // InternalGame.g:5372:2: ( ( '>' ) )
            {
            // InternalGame.g:5372:2: ( ( '>' ) )
            // InternalGame.g:5373:3: ( '>' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getOpGreaterThanSignKeyword_1_1_0()); 
            }
            // InternalGame.g:5374:3: ( '>' )
            // InternalGame.g:5375:4: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getOpGreaterThanSignKeyword_1_1_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getOpGreaterThanSignKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getOpGreaterThanSignKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__OpAssignment_1_1"


    // $ANTLR start "rule__CompOperator__OpAssignment_2_1"
    // InternalGame.g:5386:1: rule__CompOperator__OpAssignment_2_1 : ( ( '<=' ) ) ;
    public final void rule__CompOperator__OpAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5390:1: ( ( ( '<=' ) ) )
            // InternalGame.g:5391:2: ( ( '<=' ) )
            {
            // InternalGame.g:5391:2: ( ( '<=' ) )
            // InternalGame.g:5392:3: ( '<=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getOpLessThanSignEqualsSignKeyword_2_1_0()); 
            }
            // InternalGame.g:5393:3: ( '<=' )
            // InternalGame.g:5394:4: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getOpLessThanSignEqualsSignKeyword_2_1_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getOpLessThanSignEqualsSignKeyword_2_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getOpLessThanSignEqualsSignKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__OpAssignment_2_1"


    // $ANTLR start "rule__CompOperator__OpAssignment_3_1"
    // InternalGame.g:5405:1: rule__CompOperator__OpAssignment_3_1 : ( ( '>=' ) ) ;
    public final void rule__CompOperator__OpAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5409:1: ( ( ( '>=' ) ) )
            // InternalGame.g:5410:2: ( ( '>=' ) )
            {
            // InternalGame.g:5410:2: ( ( '>=' ) )
            // InternalGame.g:5411:3: ( '>=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getOpGreaterThanSignEqualsSignKeyword_3_1_0()); 
            }
            // InternalGame.g:5412:3: ( '>=' )
            // InternalGame.g:5413:4: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getOpGreaterThanSignEqualsSignKeyword_3_1_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getOpGreaterThanSignEqualsSignKeyword_3_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getOpGreaterThanSignEqualsSignKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__OpAssignment_3_1"


    // $ANTLR start "rule__CompOperator__OpAssignment_4_1"
    // InternalGame.g:5424:1: rule__CompOperator__OpAssignment_4_1 : ( ( '=' ) ) ;
    public final void rule__CompOperator__OpAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5428:1: ( ( ( '=' ) ) )
            // InternalGame.g:5429:2: ( ( '=' ) )
            {
            // InternalGame.g:5429:2: ( ( '=' ) )
            // InternalGame.g:5430:3: ( '=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getOpEqualsSignKeyword_4_1_0()); 
            }
            // InternalGame.g:5431:3: ( '=' )
            // InternalGame.g:5432:4: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOperatorAccess().getOpEqualsSignKeyword_4_1_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getOpEqualsSignKeyword_4_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOperatorAccess().getOpEqualsSignKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompOperator__OpAssignment_4_1"


    // $ANTLR start "rule__Action__CharAttAssignment_1"
    // InternalGame.g:5443:1: rule__Action__CharAttAssignment_1 : ( ruleCharacterAttr ) ;
    public final void rule__Action__CharAttAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5447:1: ( ( ruleCharacterAttr ) )
            // InternalGame.g:5448:2: ( ruleCharacterAttr )
            {
            // InternalGame.g:5448:2: ( ruleCharacterAttr )
            // InternalGame.g:5449:3: ruleCharacterAttr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getCharAttCharacterAttrParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCharacterAttr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getCharAttCharacterAttrParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__CharAttAssignment_1"


    // $ANTLR start "rule__Action__CharDecAssignment_3"
    // InternalGame.g:5458:1: rule__Action__CharDecAssignment_3 : ( ruleCharDec ) ;
    public final void rule__Action__CharDecAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5462:1: ( ( ruleCharDec ) )
            // InternalGame.g:5463:2: ( ruleCharDec )
            {
            // InternalGame.g:5463:2: ( ruleCharDec )
            // InternalGame.g:5464:3: ruleCharDec
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getCharDecCharDecParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCharDec();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getCharDecCharDecParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__CharDecAssignment_3"


    // $ANTLR start "rule__Action__OpAssignment_4_0"
    // InternalGame.g:5473:1: rule__Action__OpAssignment_4_0 : ( ruleLogicOperator ) ;
    public final void rule__Action__OpAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5477:1: ( ( ruleLogicOperator ) )
            // InternalGame.g:5478:2: ( ruleLogicOperator )
            {
            // InternalGame.g:5478:2: ( ruleLogicOperator )
            // InternalGame.g:5479:3: ruleLogicOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getOpLogicOperatorParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLogicOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getOpLogicOperatorParserRuleCall_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__OpAssignment_4_0"


    // $ANTLR start "rule__Action__ExAssignment_4_1"
    // InternalGame.g:5488:1: rule__Action__ExAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__Action__ExAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5492:1: ( ( ruleExpression ) )
            // InternalGame.g:5493:2: ( ruleExpression )
            {
            // InternalGame.g:5493:2: ( ruleExpression )
            // InternalGame.g:5494:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getExExpressionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getExExpressionParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ExAssignment_4_1"


    // $ANTLR start "rule__CharDec__CharAttResultAssignment_0"
    // InternalGame.g:5503:1: rule__CharDec__CharAttResultAssignment_0 : ( ruleCharacterAttr ) ;
    public final void rule__CharDec__CharAttResultAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5507:1: ( ( ruleCharacterAttr ) )
            // InternalGame.g:5508:2: ( ruleCharacterAttr )
            {
            // InternalGame.g:5508:2: ( ruleCharacterAttr )
            // InternalGame.g:5509:3: ruleCharacterAttr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharDecAccess().getCharAttResultCharacterAttrParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCharacterAttr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharDecAccess().getCharAttResultCharacterAttrParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDec__CharAttResultAssignment_0"


    // $ANTLR start "rule__CharDec__ValAssignment_1"
    // InternalGame.g:5518:1: rule__CharDec__ValAssignment_1 : ( ruleINTORDEC ) ;
    public final void rule__CharDec__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5522:1: ( ( ruleINTORDEC ) )
            // InternalGame.g:5523:2: ( ruleINTORDEC )
            {
            // InternalGame.g:5523:2: ( ruleINTORDEC )
            // InternalGame.g:5524:3: ruleINTORDEC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharDecAccess().getValINTORDECParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleINTORDEC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharDecAccess().getValINTORDECParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharDec__ValAssignment_1"


    // $ANTLR start "rule__CharacterAttr__ReferenceAssignment_0"
    // InternalGame.g:5533:1: rule__CharacterAttr__ReferenceAssignment_0 : ( ruleReferenceCharacter ) ;
    public final void rule__CharacterAttr__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5537:1: ( ( ruleReferenceCharacter ) )
            // InternalGame.g:5538:2: ( ruleReferenceCharacter )
            {
            // InternalGame.g:5538:2: ( ruleReferenceCharacter )
            // InternalGame.g:5539:3: ruleReferenceCharacter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAttrAccess().getReferenceReferenceCharacterParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleReferenceCharacter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAttrAccess().getReferenceReferenceCharacterParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAttr__ReferenceAssignment_0"


    // $ANTLR start "rule__CharacterAttr__AttributenameAssignment_1"
    // InternalGame.g:5548:1: rule__CharacterAttr__AttributenameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CharacterAttr__AttributenameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5552:1: ( ( RULE_ID ) )
            // InternalGame.g:5553:2: ( RULE_ID )
            {
            // InternalGame.g:5553:2: ( RULE_ID )
            // InternalGame.g:5554:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCharacterAttrAccess().getAttributenameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCharacterAttrAccess().getAttributenameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharacterAttr__AttributenameAssignment_1"


    // $ANTLR start "rule__LogicOperator__LopAssignment_0_1"
    // InternalGame.g:5563:1: rule__LogicOperator__LopAssignment_0_1 : ( ( '*' ) ) ;
    public final void rule__LogicOperator__LopAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5567:1: ( ( ( '*' ) ) )
            // InternalGame.g:5568:2: ( ( '*' ) )
            {
            // InternalGame.g:5568:2: ( ( '*' ) )
            // InternalGame.g:5569:3: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getLopAsteriskKeyword_0_1_0()); 
            }
            // InternalGame.g:5570:3: ( '*' )
            // InternalGame.g:5571:4: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getLopAsteriskKeyword_0_1_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getLopAsteriskKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getLopAsteriskKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__LopAssignment_0_1"


    // $ANTLR start "rule__LogicOperator__LopAssignment_1_1"
    // InternalGame.g:5582:1: rule__LogicOperator__LopAssignment_1_1 : ( ( '+' ) ) ;
    public final void rule__LogicOperator__LopAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5586:1: ( ( ( '+' ) ) )
            // InternalGame.g:5587:2: ( ( '+' ) )
            {
            // InternalGame.g:5587:2: ( ( '+' ) )
            // InternalGame.g:5588:3: ( '+' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getLopPlusSignKeyword_1_1_0()); 
            }
            // InternalGame.g:5589:3: ( '+' )
            // InternalGame.g:5590:4: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getLopPlusSignKeyword_1_1_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getLopPlusSignKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getLopPlusSignKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__LopAssignment_1_1"


    // $ANTLR start "rule__LogicOperator__LopAssignment_2_1"
    // InternalGame.g:5601:1: rule__LogicOperator__LopAssignment_2_1 : ( ( '-' ) ) ;
    public final void rule__LogicOperator__LopAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5605:1: ( ( ( '-' ) ) )
            // InternalGame.g:5606:2: ( ( '-' ) )
            {
            // InternalGame.g:5606:2: ( ( '-' ) )
            // InternalGame.g:5607:3: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getLopHyphenMinusKeyword_2_1_0()); 
            }
            // InternalGame.g:5608:3: ( '-' )
            // InternalGame.g:5609:4: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getLopHyphenMinusKeyword_2_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getLopHyphenMinusKeyword_2_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getLopHyphenMinusKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__LopAssignment_2_1"


    // $ANTLR start "rule__LogicOperator__LopAssignment_3_1"
    // InternalGame.g:5620:1: rule__LogicOperator__LopAssignment_3_1 : ( ( '/' ) ) ;
    public final void rule__LogicOperator__LopAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5624:1: ( ( ( '/' ) ) )
            // InternalGame.g:5625:2: ( ( '/' ) )
            {
            // InternalGame.g:5625:2: ( ( '/' ) )
            // InternalGame.g:5626:3: ( '/' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getLopSolidusKeyword_3_1_0()); 
            }
            // InternalGame.g:5627:3: ( '/' )
            // InternalGame.g:5628:4: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getLopSolidusKeyword_3_1_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getLopSolidusKeyword_3_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getLopSolidusKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__LopAssignment_3_1"


    // $ANTLR start "rule__Attack__EntityidAssignment_0"
    // InternalGame.g:5639:1: rule__Attack__EntityidAssignment_0 : ( ( 'Attack' ) ) ;
    public final void rule__Attack__EntityidAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5643:1: ( ( ( 'Attack' ) ) )
            // InternalGame.g:5644:2: ( ( 'Attack' ) )
            {
            // InternalGame.g:5644:2: ( ( 'Attack' ) )
            // InternalGame.g:5645:3: ( 'Attack' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttackAccess().getEntityidAttackKeyword_0_0()); 
            }
            // InternalGame.g:5646:3: ( 'Attack' )
            // InternalGame.g:5647:4: 'Attack'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttackAccess().getEntityidAttackKeyword_0_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttackAccess().getEntityidAttackKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttackAccess().getEntityidAttackKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__EntityidAssignment_0"


    // $ANTLR start "rule__Attack__NameAssignment_1"
    // InternalGame.g:5658:1: rule__Attack__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attack__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5662:1: ( ( RULE_ID ) )
            // InternalGame.g:5663:2: ( RULE_ID )
            {
            // InternalGame.g:5663:2: ( RULE_ID )
            // InternalGame.g:5664:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttackAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttackAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__NameAssignment_1"


    // $ANTLR start "rule__Attack__AttributesAssignment_3"
    // InternalGame.g:5673:1: rule__Attack__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Attack__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5677:1: ( ( ruleAttribute ) )
            // InternalGame.g:5678:2: ( ruleAttribute )
            {
            // InternalGame.g:5678:2: ( ruleAttribute )
            // InternalGame.g:5679:3: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttackAccess().getAttributesAttributeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttackAccess().getAttributesAttributeParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__AttributesAssignment_3"


    // $ANTLR start "rule__Attack__AttributesAttackAssignment_4"
    // InternalGame.g:5688:1: rule__Attack__AttributesAttackAssignment_4 : ( ruleAttributeAttack ) ;
    public final void rule__Attack__AttributesAttackAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5692:1: ( ( ruleAttributeAttack ) )
            // InternalGame.g:5693:2: ( ruleAttributeAttack )
            {
            // InternalGame.g:5693:2: ( ruleAttributeAttack )
            // InternalGame.g:5694:3: ruleAttributeAttack
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttackAccess().getAttributesAttackAttributeAttackParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttributeAttack();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttackAccess().getAttributesAttackAttributeAttackParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__AttributesAttackAssignment_4"


    // $ANTLR start "rule__Attack__RulesAssignment_5"
    // InternalGame.g:5703:1: rule__Attack__RulesAssignment_5 : ( ruleCondition ) ;
    public final void rule__Attack__RulesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5707:1: ( ( ruleCondition ) )
            // InternalGame.g:5708:2: ( ruleCondition )
            {
            // InternalGame.g:5708:2: ( ruleCondition )
            // InternalGame.g:5709:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttackAccess().getRulesConditionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttackAccess().getRulesConditionParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attack__RulesAssignment_5"


    // $ANTLR start "rule__AttributeAttack__AttributeTypesAttackAssignment_0"
    // InternalGame.g:5718:1: rule__AttributeAttack__AttributeTypesAttackAssignment_0 : ( ruleAttributeTypeAttack ) ;
    public final void rule__AttributeAttack__AttributeTypesAttackAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5722:1: ( ( ruleAttributeTypeAttack ) )
            // InternalGame.g:5723:2: ( ruleAttributeTypeAttack )
            {
            // InternalGame.g:5723:2: ( ruleAttributeTypeAttack )
            // InternalGame.g:5724:3: ruleAttributeTypeAttack
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAttackAccess().getAttributeTypesAttackAttributeTypeAttackParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttributeTypeAttack();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAttackAccess().getAttributeTypesAttackAttributeTypeAttackParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAttack__AttributeTypesAttackAssignment_0"


    // $ANTLR start "rule__AttributeAttack__TypeAssignment_1"
    // InternalGame.g:5733:1: rule__AttributeAttack__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__AttributeAttack__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5737:1: ( ( ruleType ) )
            // InternalGame.g:5738:2: ( ruleType )
            {
            // InternalGame.g:5738:2: ( ruleType )
            // InternalGame.g:5739:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAttackAccess().getTypeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAttackAccess().getTypeTypeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAttack__TypeAssignment_1"


    // $ANTLR start "rule__AttributeTypeAttack__BulletRefAssignment_2_2"
    // InternalGame.g:5748:1: rule__AttributeTypeAttack__BulletRefAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeTypeAttack__BulletRefAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5752:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:5753:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:5753:2: ( ( RULE_ID ) )
            // InternalGame.g:5754:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeTypeAttackAccess().getBulletRefBulletCrossReference_2_2_0()); 
            }
            // InternalGame.g:5755:3: ( RULE_ID )
            // InternalGame.g:5756:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeTypeAttackAccess().getBulletRefBulletIDTerminalRuleCall_2_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeTypeAttackAccess().getBulletRefBulletIDTerminalRuleCall_2_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeTypeAttackAccess().getBulletRefBulletCrossReference_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeTypeAttack__BulletRefAssignment_2_2"


    // $ANTLR start "rule__Bullet__EntityidAssignment_0"
    // InternalGame.g:5767:1: rule__Bullet__EntityidAssignment_0 : ( ( 'Bullet' ) ) ;
    public final void rule__Bullet__EntityidAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5771:1: ( ( ( 'Bullet' ) ) )
            // InternalGame.g:5772:2: ( ( 'Bullet' ) )
            {
            // InternalGame.g:5772:2: ( ( 'Bullet' ) )
            // InternalGame.g:5773:3: ( 'Bullet' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBulletAccess().getEntityidBulletKeyword_0_0()); 
            }
            // InternalGame.g:5774:3: ( 'Bullet' )
            // InternalGame.g:5775:4: 'Bullet'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBulletAccess().getEntityidBulletKeyword_0_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBulletAccess().getEntityidBulletKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBulletAccess().getEntityidBulletKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bullet__EntityidAssignment_0"


    // $ANTLR start "rule__Bullet__NameAssignment_1"
    // InternalGame.g:5786:1: rule__Bullet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Bullet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5790:1: ( ( RULE_ID ) )
            // InternalGame.g:5791:2: ( RULE_ID )
            {
            // InternalGame.g:5791:2: ( RULE_ID )
            // InternalGame.g:5792:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBulletAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBulletAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bullet__NameAssignment_1"


    // $ANTLR start "rule__Bullet__AttributesBulletAssignment_3"
    // InternalGame.g:5801:1: rule__Bullet__AttributesBulletAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Bullet__AttributesBulletAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5805:1: ( ( ruleAttribute ) )
            // InternalGame.g:5806:2: ( ruleAttribute )
            {
            // InternalGame.g:5806:2: ( ruleAttribute )
            // InternalGame.g:5807:3: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBulletAccess().getAttributesBulletAttributeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBulletAccess().getAttributesBulletAttributeParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bullet__AttributesBulletAssignment_3"


    // $ANTLR start "rule__Initializer__EntityIdAssignment_1"
    // InternalGame.g:5816:1: rule__Initializer__EntityIdAssignment_1 : ( ( 'Initializer' ) ) ;
    public final void rule__Initializer__EntityIdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5820:1: ( ( ( 'Initializer' ) ) )
            // InternalGame.g:5821:2: ( ( 'Initializer' ) )
            {
            // InternalGame.g:5821:2: ( ( 'Initializer' ) )
            // InternalGame.g:5822:3: ( 'Initializer' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInitializerAccess().getEntityIdInitializerKeyword_1_0()); 
            }
            // InternalGame.g:5823:3: ( 'Initializer' )
            // InternalGame.g:5824:4: 'Initializer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInitializerAccess().getEntityIdInitializerKeyword_1_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInitializerAccess().getEntityIdInitializerKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInitializerAccess().getEntityIdInitializerKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initializer__EntityIdAssignment_1"


    // $ANTLR start "rule__Initializer__AttributesInitializerAssignment_3"
    // InternalGame.g:5835:1: rule__Initializer__AttributesInitializerAssignment_3 : ( ruleAttributeInitializer ) ;
    public final void rule__Initializer__AttributesInitializerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5839:1: ( ( ruleAttributeInitializer ) )
            // InternalGame.g:5840:2: ( ruleAttributeInitializer )
            {
            // InternalGame.g:5840:2: ( ruleAttributeInitializer )
            // InternalGame.g:5841:3: ruleAttributeInitializer
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInitializerAccess().getAttributesInitializerAttributeInitializerParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAttributeInitializer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInitializerAccess().getAttributesInitializerAttributeInitializerParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initializer__AttributesInitializerAssignment_3"


    // $ANTLR start "rule__AttributeInitializer__AttributeIdAssignment_0"
    // InternalGame.g:5850:1: rule__AttributeInitializer__AttributeIdAssignment_0 : ( RULE_ID ) ;
    public final void rule__AttributeInitializer__AttributeIdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5854:1: ( ( RULE_ID ) )
            // InternalGame.g:5855:2: ( RULE_ID )
            {
            // InternalGame.g:5855:2: ( RULE_ID )
            // InternalGame.g:5856:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeInitializerAccess().getAttributeIdIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeInitializerAccess().getAttributeIdIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeInitializer__AttributeIdAssignment_0"


    // $ANTLR start "rule__AttributeInitializer__AmountValueIdAssignment_1"
    // InternalGame.g:5865:1: rule__AttributeInitializer__AmountValueIdAssignment_1 : ( RULE_INT ) ;
    public final void rule__AttributeInitializer__AmountValueIdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5869:1: ( ( RULE_INT ) )
            // InternalGame.g:5870:2: ( RULE_INT )
            {
            // InternalGame.g:5870:2: ( RULE_INT )
            // InternalGame.g:5871:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeInitializerAccess().getAmountValueIdINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeInitializerAccess().getAmountValueIdINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeInitializer__AmountValueIdAssignment_1"


    // $ANTLR start "rule__AttributeInitializer__TargetAssignment_2"
    // InternalGame.g:5880:1: rule__AttributeInitializer__TargetAssignment_2 : ( ruleTargetRef ) ;
    public final void rule__AttributeInitializer__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5884:1: ( ( ruleTargetRef ) )
            // InternalGame.g:5885:2: ( ruleTargetRef )
            {
            // InternalGame.g:5885:2: ( ruleTargetRef )
            // InternalGame.g:5886:3: ruleTargetRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeInitializerAccess().getTargetTargetRefParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTargetRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeInitializerAccess().getTargetTargetRefParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeInitializer__TargetAssignment_2"


    // $ANTLR start "rule__TargetRef__TargetIdAssignment_0"
    // InternalGame.g:5895:1: rule__TargetRef__TargetIdAssignment_0 : ( RULE_ID ) ;
    public final void rule__TargetRef__TargetIdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5899:1: ( ( RULE_ID ) )
            // InternalGame.g:5900:2: ( RULE_ID )
            {
            // InternalGame.g:5900:2: ( RULE_ID )
            // InternalGame.g:5901:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetRefAccess().getTargetIdIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetRefAccess().getTargetIdIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetRef__TargetIdAssignment_0"


    // $ANTLR start "rule__TargetRef__LocationsIdAssignment_2"
    // InternalGame.g:5910:1: rule__TargetRef__LocationsIdAssignment_2 : ( ruleLocation ) ;
    public final void rule__TargetRef__LocationsIdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5914:1: ( ( ruleLocation ) )
            // InternalGame.g:5915:2: ( ruleLocation )
            {
            // InternalGame.g:5915:2: ( ruleLocation )
            // InternalGame.g:5916:3: ruleLocation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetRefAccess().getLocationsIdLocationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetRefAccess().getLocationsIdLocationParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetRef__LocationsIdAssignment_2"


    // $ANTLR start "rule__TargetRef__LocationsIdAssignment_3_1"
    // InternalGame.g:5925:1: rule__TargetRef__LocationsIdAssignment_3_1 : ( ruleLocation ) ;
    public final void rule__TargetRef__LocationsIdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5929:1: ( ( ruleLocation ) )
            // InternalGame.g:5930:2: ( ruleLocation )
            {
            // InternalGame.g:5930:2: ( ruleLocation )
            // InternalGame.g:5931:3: ruleLocation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetRefAccess().getLocationsIdLocationParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetRefAccess().getLocationsIdLocationParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetRef__LocationsIdAssignment_3_1"


    // $ANTLR start "rule__Location__LocationIdAssignment_0"
    // InternalGame.g:5940:1: rule__Location__LocationIdAssignment_0 : ( ( 'random' ) ) ;
    public final void rule__Location__LocationIdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5944:1: ( ( ( 'random' ) ) )
            // InternalGame.g:5945:2: ( ( 'random' ) )
            {
            // InternalGame.g:5945:2: ( ( 'random' ) )
            // InternalGame.g:5946:3: ( 'random' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationAccess().getLocationIdRandomKeyword_0_0()); 
            }
            // InternalGame.g:5947:3: ( 'random' )
            // InternalGame.g:5948:4: 'random'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationAccess().getLocationIdRandomKeyword_0_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationAccess().getLocationIdRandomKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationAccess().getLocationIdRandomKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__LocationIdAssignment_0"


    // $ANTLR start "rule__Location__TypeaAssignment_1_1"
    // InternalGame.g:5959:1: rule__Location__TypeaAssignment_1_1 : ( ruleType ) ;
    public final void rule__Location__TypeaAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5963:1: ( ( ruleType ) )
            // InternalGame.g:5964:2: ( ruleType )
            {
            // InternalGame.g:5964:2: ( ruleType )
            // InternalGame.g:5965:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationAccess().getTypeaTypeParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationAccess().getTypeaTypeParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__TypeaAssignment_1_1"


    // $ANTLR start "rule__Location__TypebAssignment_1_3"
    // InternalGame.g:5974:1: rule__Location__TypebAssignment_1_3 : ( ruleType ) ;
    public final void rule__Location__TypebAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:5978:1: ( ( ruleType ) )
            // InternalGame.g:5979:2: ( ruleType )
            {
            // InternalGame.g:5979:2: ( ruleType )
            // InternalGame.g:5980:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationAccess().getTypebTypeParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationAccess().getTypebTypeParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__TypebAssignment_1_3"

    // $ANTLR start synpred36_InternalGame
    public final void synpred36_InternalGame_fragment() throws RecognitionException {   
        // InternalGame.g:3276:3: ( rule__Action__CharDecAssignment_3 )
        // InternalGame.g:3276:3: rule__Action__CharDecAssignment_3
        {
        pushFollow(FOLLOW_2);
        rule__Action__CharDecAssignment_3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalGame

    // Delegated rules

    public final boolean synpred36_InternalGame() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalGame_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000600F402000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000600F400002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000012020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001E0084010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001E10004030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001E00004010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000001F0084030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001E1000C030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000712020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000000600F400000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000800000L});

}