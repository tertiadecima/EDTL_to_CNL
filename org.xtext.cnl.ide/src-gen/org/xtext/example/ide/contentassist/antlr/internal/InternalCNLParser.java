package org.xtext.example.ide.contentassist.antlr.internal;

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
import org.xtext.example.services.CNLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCNLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INTEGER", "RULE_BOOLEAN_LITERAL", "RULE_OR_OPERATOR", "RULE_INTERVAL", "RULE_DIRECT_TYPE_PREFIX", "RULE_DIRECT_SIZE_PREFIX", "RULE_OCTAL_DIGIT", "RULE_DIRECT_VARIABLE", "RULE_DIGIT", "RULE_LETTER", "RULE_BIT", "RULE_HEX_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_WS", "RULE_INT", "RULE_ANY_OTHER", "','", "'XOR'", "'#T'", "'Always'", "'BOOL'", "'INT'", "'&&'", "'AND'", "'FE'", "'RE'", "'HIGH'", "'LOW'", "'NOT'", "'!'", "'=='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'REQUIREMENT'", "'END_REQUIREMENT'", "'.'", "'After'", "'should'", "'remain'", "'valid'", "'until'", "'always'", "'either'", "'or'", "'Reaction'", "'is'", "'reaction'", "'which'", "'must'", "'occur'", "'from'", "'immediately'", "'after'", "'within'", "'\"'", "'VAR_INPUT'", "'END_VAR'", "';'", "'VAR_OUTPUT'", "':'", "'SENTENCE'", "'END_SENTENCE'", "'='", "'TAU'", "'('", "')'"
    };
    public static final int T__50=50;
    public static final int RULE_INTERVAL=8;
    public static final int RULE_BIT=15;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_DIRECT_SIZE_PREFIX=10;
    public static final int RULE_ID=4;
    public static final int RULE_BOOLEAN_LITERAL=6;
    public static final int RULE_DIGIT=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=21;
    public static final int T__29=29;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_DIRECT_TYPE_PREFIX=9;
    public static final int RULE_DIRECT_VARIABLE=12;
    public static final int RULE_OR_OPERATOR=7;
    public static final int RULE_STRING=19;
    public static final int RULE_SL_COMMENT=18;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int RULE_OCTAL_DIGIT=11;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int RULE_WS=20;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_LETTER=14;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_HEX_DIGIT=16;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_INTEGER=5;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCNLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCNLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCNLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCNL.g"; }


    	private CNLGrammarAccess grammarAccess;

    	public void setGrammarAccess(CNLGrammarAccess grammarAccess) {
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
    // InternalCNL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalCNL.g:54:1: ( ruleModel EOF )
            // InternalCNL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCNL.g:62:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:66:2: ( ( ( rule__Model__Alternatives )* ) )
            // InternalCNL.g:67:2: ( ( rule__Model__Alternatives )* )
            {
            // InternalCNL.g:67:2: ( ( rule__Model__Alternatives )* )
            // InternalCNL.g:68:3: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalCNL.g:69:3: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==43||LA1_0==65||LA1_0==68||LA1_0==70) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCNL.g:69:4: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleReqDeclaration"
    // InternalCNL.g:78:1: entryRuleReqDeclaration : ruleReqDeclaration EOF ;
    public final void entryRuleReqDeclaration() throws RecognitionException {
        try {
            // InternalCNL.g:79:1: ( ruleReqDeclaration EOF )
            // InternalCNL.g:80:1: ruleReqDeclaration EOF
            {
             before(grammarAccess.getReqDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleReqDeclaration();

            state._fsp--;

             after(grammarAccess.getReqDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReqDeclaration"


    // $ANTLR start "ruleReqDeclaration"
    // InternalCNL.g:87:1: ruleReqDeclaration : ( ( rule__ReqDeclaration__Group__0 ) ) ;
    public final void ruleReqDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:91:2: ( ( ( rule__ReqDeclaration__Group__0 ) ) )
            // InternalCNL.g:92:2: ( ( rule__ReqDeclaration__Group__0 ) )
            {
            // InternalCNL.g:92:2: ( ( rule__ReqDeclaration__Group__0 ) )
            // InternalCNL.g:93:3: ( rule__ReqDeclaration__Group__0 )
            {
             before(grammarAccess.getReqDeclarationAccess().getGroup()); 
            // InternalCNL.g:94:3: ( rule__ReqDeclaration__Group__0 )
            // InternalCNL.g:94:4: rule__ReqDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReqDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReqDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleReqDeclaration"


    // $ANTLR start "entryRuleRequirement"
    // InternalCNL.g:103:1: entryRuleRequirement : ruleRequirement EOF ;
    public final void entryRuleRequirement() throws RecognitionException {
        try {
            // InternalCNL.g:104:1: ( ruleRequirement EOF )
            // InternalCNL.g:105:1: ruleRequirement EOF
            {
             before(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            ruleRequirement();

            state._fsp--;

             after(grammarAccess.getRequirementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalCNL.g:112:1: ruleRequirement : ( ( rule__Requirement__Group__0 ) ) ;
    public final void ruleRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:116:2: ( ( ( rule__Requirement__Group__0 ) ) )
            // InternalCNL.g:117:2: ( ( rule__Requirement__Group__0 ) )
            {
            // InternalCNL.g:117:2: ( ( rule__Requirement__Group__0 ) )
            // InternalCNL.g:118:3: ( rule__Requirement__Group__0 )
            {
             before(grammarAccess.getRequirementAccess().getGroup()); 
            // InternalCNL.g:119:3: ( rule__Requirement__Group__0 )
            // InternalCNL.g:119:4: rule__Requirement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getGroup()); 

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
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleTrig"
    // InternalCNL.g:128:1: entryRuleTrig : ruleTrig EOF ;
    public final void entryRuleTrig() throws RecognitionException {
        try {
            // InternalCNL.g:129:1: ( ruleTrig EOF )
            // InternalCNL.g:130:1: ruleTrig EOF
            {
             before(grammarAccess.getTrigRule()); 
            pushFollow(FOLLOW_1);
            ruleTrig();

            state._fsp--;

             after(grammarAccess.getTrigRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTrig"


    // $ANTLR start "ruleTrig"
    // InternalCNL.g:137:1: ruleTrig : ( ( rule__Trig__Group__0 ) ) ;
    public final void ruleTrig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:141:2: ( ( ( rule__Trig__Group__0 ) ) )
            // InternalCNL.g:142:2: ( ( rule__Trig__Group__0 ) )
            {
            // InternalCNL.g:142:2: ( ( rule__Trig__Group__0 ) )
            // InternalCNL.g:143:3: ( rule__Trig__Group__0 )
            {
             before(grammarAccess.getTrigAccess().getGroup()); 
            // InternalCNL.g:144:3: ( rule__Trig__Group__0 )
            // InternalCNL.g:144:4: rule__Trig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Trig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrigAccess().getGroup()); 

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
    // $ANTLR end "ruleTrig"


    // $ANTLR start "entryRuleInv"
    // InternalCNL.g:153:1: entryRuleInv : ruleInv EOF ;
    public final void entryRuleInv() throws RecognitionException {
        try {
            // InternalCNL.g:154:1: ( ruleInv EOF )
            // InternalCNL.g:155:1: ruleInv EOF
            {
             before(grammarAccess.getInvRule()); 
            pushFollow(FOLLOW_1);
            ruleInv();

            state._fsp--;

             after(grammarAccess.getInvRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInv"


    // $ANTLR start "ruleInv"
    // InternalCNL.g:162:1: ruleInv : ( ( rule__Inv__Group__0 ) ) ;
    public final void ruleInv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:166:2: ( ( ( rule__Inv__Group__0 ) ) )
            // InternalCNL.g:167:2: ( ( rule__Inv__Group__0 ) )
            {
            // InternalCNL.g:167:2: ( ( rule__Inv__Group__0 ) )
            // InternalCNL.g:168:3: ( rule__Inv__Group__0 )
            {
             before(grammarAccess.getInvAccess().getGroup()); 
            // InternalCNL.g:169:3: ( rule__Inv__Group__0 )
            // InternalCNL.g:169:4: rule__Inv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInvAccess().getGroup()); 

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
    // $ANTLR end "ruleInv"


    // $ANTLR start "entryRuleInv_always"
    // InternalCNL.g:178:1: entryRuleInv_always : ruleInv_always EOF ;
    public final void entryRuleInv_always() throws RecognitionException {
        try {
            // InternalCNL.g:179:1: ( ruleInv_always EOF )
            // InternalCNL.g:180:1: ruleInv_always EOF
            {
             before(grammarAccess.getInv_alwaysRule()); 
            pushFollow(FOLLOW_1);
            ruleInv_always();

            state._fsp--;

             after(grammarAccess.getInv_alwaysRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInv_always"


    // $ANTLR start "ruleInv_always"
    // InternalCNL.g:187:1: ruleInv_always : ( ( rule__Inv_always__Group__0 ) ) ;
    public final void ruleInv_always() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:191:2: ( ( ( rule__Inv_always__Group__0 ) ) )
            // InternalCNL.g:192:2: ( ( rule__Inv_always__Group__0 ) )
            {
            // InternalCNL.g:192:2: ( ( rule__Inv_always__Group__0 ) )
            // InternalCNL.g:193:3: ( rule__Inv_always__Group__0 )
            {
             before(grammarAccess.getInv_alwaysAccess().getGroup()); 
            // InternalCNL.g:194:3: ( rule__Inv_always__Group__0 )
            // InternalCNL.g:194:4: rule__Inv_always__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inv_always__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInv_alwaysAccess().getGroup()); 

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
    // $ANTLR end "ruleInv_always"


    // $ANTLR start "entryRuleRelRea"
    // InternalCNL.g:203:1: entryRuleRelRea : ruleRelRea EOF ;
    public final void entryRuleRelRea() throws RecognitionException {
        try {
            // InternalCNL.g:204:1: ( ruleRelRea EOF )
            // InternalCNL.g:205:1: ruleRelRea EOF
            {
             before(grammarAccess.getRelReaRule()); 
            pushFollow(FOLLOW_1);
            ruleRelRea();

            state._fsp--;

             after(grammarAccess.getRelReaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelRea"


    // $ANTLR start "ruleRelRea"
    // InternalCNL.g:212:1: ruleRelRea : ( ( rule__RelRea__Alternatives ) ) ;
    public final void ruleRelRea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:216:2: ( ( ( rule__RelRea__Alternatives ) ) )
            // InternalCNL.g:217:2: ( ( rule__RelRea__Alternatives ) )
            {
            // InternalCNL.g:217:2: ( ( rule__RelRea__Alternatives ) )
            // InternalCNL.g:218:3: ( rule__RelRea__Alternatives )
            {
             before(grammarAccess.getRelReaAccess().getAlternatives()); 
            // InternalCNL.g:219:3: ( rule__RelRea__Alternatives )
            // InternalCNL.g:219:4: rule__RelRea__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRelRea"


    // $ANTLR start "entryRuleReaction"
    // InternalCNL.g:228:1: entryRuleReaction : ruleReaction EOF ;
    public final void entryRuleReaction() throws RecognitionException {
        try {
            // InternalCNL.g:229:1: ( ruleReaction EOF )
            // InternalCNL.g:230:1: ruleReaction EOF
            {
             before(grammarAccess.getReactionRule()); 
            pushFollow(FOLLOW_1);
            ruleReaction();

            state._fsp--;

             after(grammarAccess.getReactionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReaction"


    // $ANTLR start "ruleReaction"
    // InternalCNL.g:237:1: ruleReaction : ( ( rule__Reaction__Group__0 ) ) ;
    public final void ruleReaction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:241:2: ( ( ( rule__Reaction__Group__0 ) ) )
            // InternalCNL.g:242:2: ( ( rule__Reaction__Group__0 ) )
            {
            // InternalCNL.g:242:2: ( ( rule__Reaction__Group__0 ) )
            // InternalCNL.g:243:3: ( rule__Reaction__Group__0 )
            {
             before(grammarAccess.getReactionAccess().getGroup()); 
            // InternalCNL.g:244:3: ( rule__Reaction__Group__0 )
            // InternalCNL.g:244:4: rule__Reaction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactionAccess().getGroup()); 

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
    // $ANTLR end "ruleReaction"


    // $ANTLR start "entryRuleDelFin"
    // InternalCNL.g:253:1: entryRuleDelFin : ruleDelFin EOF ;
    public final void entryRuleDelFin() throws RecognitionException {
        try {
            // InternalCNL.g:254:1: ( ruleDelFin EOF )
            // InternalCNL.g:255:1: ruleDelFin EOF
            {
             before(grammarAccess.getDelFinRule()); 
            pushFollow(FOLLOW_1);
            ruleDelFin();

            state._fsp--;

             after(grammarAccess.getDelFinRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDelFin"


    // $ANTLR start "ruleDelFin"
    // InternalCNL.g:262:1: ruleDelFin : ( ( rule__DelFin__Group__0 ) ) ;
    public final void ruleDelFin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:266:2: ( ( ( rule__DelFin__Group__0 ) ) )
            // InternalCNL.g:267:2: ( ( rule__DelFin__Group__0 ) )
            {
            // InternalCNL.g:267:2: ( ( rule__DelFin__Group__0 ) )
            // InternalCNL.g:268:3: ( rule__DelFin__Group__0 )
            {
             before(grammarAccess.getDelFinAccess().getGroup()); 
            // InternalCNL.g:269:3: ( rule__DelFin__Group__0 )
            // InternalCNL.g:269:4: rule__DelFin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDelFinAccess().getGroup()); 

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
    // $ANTLR end "ruleDelFin"


    // $ANTLR start "entryRuleDelay"
    // InternalCNL.g:278:1: entryRuleDelay : ruleDelay EOF ;
    public final void entryRuleDelay() throws RecognitionException {
        try {
            // InternalCNL.g:279:1: ( ruleDelay EOF )
            // InternalCNL.g:280:1: ruleDelay EOF
            {
             before(grammarAccess.getDelayRule()); 
            pushFollow(FOLLOW_1);
            ruleDelay();

            state._fsp--;

             after(grammarAccess.getDelayRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDelay"


    // $ANTLR start "ruleDelay"
    // InternalCNL.g:287:1: ruleDelay : ( ( rule__Delay__Group__0 ) ) ;
    public final void ruleDelay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:291:2: ( ( ( rule__Delay__Group__0 ) ) )
            // InternalCNL.g:292:2: ( ( rule__Delay__Group__0 ) )
            {
            // InternalCNL.g:292:2: ( ( rule__Delay__Group__0 ) )
            // InternalCNL.g:293:3: ( rule__Delay__Group__0 )
            {
             before(grammarAccess.getDelayAccess().getGroup()); 
            // InternalCNL.g:294:3: ( rule__Delay__Group__0 )
            // InternalCNL.g:294:4: rule__Delay__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Delay__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDelayAccess().getGroup()); 

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
    // $ANTLR end "ruleDelay"


    // $ANTLR start "entryRuleSentence"
    // InternalCNL.g:303:1: entryRuleSentence : ruleSentence EOF ;
    public final void entryRuleSentence() throws RecognitionException {
        try {
            // InternalCNL.g:304:1: ( ruleSentence EOF )
            // InternalCNL.g:305:1: ruleSentence EOF
            {
             before(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getSentenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // InternalCNL.g:312:1: ruleSentence : ( ( rule__Sentence__Group__0 ) ) ;
    public final void ruleSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:316:2: ( ( ( rule__Sentence__Group__0 ) ) )
            // InternalCNL.g:317:2: ( ( rule__Sentence__Group__0 ) )
            {
            // InternalCNL.g:317:2: ( ( rule__Sentence__Group__0 ) )
            // InternalCNL.g:318:3: ( rule__Sentence__Group__0 )
            {
             before(grammarAccess.getSentenceAccess().getGroup()); 
            // InternalCNL.g:319:3: ( rule__Sentence__Group__0 )
            // InternalCNL.g:319:4: rule__Sentence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sentence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getGroup()); 

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
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleID_or_INTEGER"
    // InternalCNL.g:328:1: entryRuleID_or_INTEGER : ruleID_or_INTEGER EOF ;
    public final void entryRuleID_or_INTEGER() throws RecognitionException {
        try {
            // InternalCNL.g:329:1: ( ruleID_or_INTEGER EOF )
            // InternalCNL.g:330:1: ruleID_or_INTEGER EOF
            {
             before(grammarAccess.getID_or_INTEGERRule()); 
            pushFollow(FOLLOW_1);
            ruleID_or_INTEGER();

            state._fsp--;

             after(grammarAccess.getID_or_INTEGERRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleID_or_INTEGER"


    // $ANTLR start "ruleID_or_INTEGER"
    // InternalCNL.g:337:1: ruleID_or_INTEGER : ( ( rule__ID_or_INTEGER__Group__0 ) ) ;
    public final void ruleID_or_INTEGER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:341:2: ( ( ( rule__ID_or_INTEGER__Group__0 ) ) )
            // InternalCNL.g:342:2: ( ( rule__ID_or_INTEGER__Group__0 ) )
            {
            // InternalCNL.g:342:2: ( ( rule__ID_or_INTEGER__Group__0 ) )
            // InternalCNL.g:343:3: ( rule__ID_or_INTEGER__Group__0 )
            {
             before(grammarAccess.getID_or_INTEGERAccess().getGroup()); 
            // InternalCNL.g:344:3: ( rule__ID_or_INTEGER__Group__0 )
            // InternalCNL.g:344:4: rule__ID_or_INTEGER__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ID_or_INTEGER__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getID_or_INTEGERAccess().getGroup()); 

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
    // $ANTLR end "ruleID_or_INTEGER"


    // $ANTLR start "entryRuleComma"
    // InternalCNL.g:353:1: entryRuleComma : ruleComma EOF ;
    public final void entryRuleComma() throws RecognitionException {
        try {
            // InternalCNL.g:354:1: ( ruleComma EOF )
            // InternalCNL.g:355:1: ruleComma EOF
            {
             before(grammarAccess.getCommaRule()); 
            pushFollow(FOLLOW_1);
            ruleComma();

            state._fsp--;

             after(grammarAccess.getCommaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComma"


    // $ANTLR start "ruleComma"
    // InternalCNL.g:362:1: ruleComma : ( ',' ) ;
    public final void ruleComma() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:366:2: ( ( ',' ) )
            // InternalCNL.g:367:2: ( ',' )
            {
            // InternalCNL.g:367:2: ( ',' )
            // InternalCNL.g:368:3: ','
            {
             before(grammarAccess.getCommaAccess().getCommaKeyword()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCommaAccess().getCommaKeyword()); 

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
    // $ANTLR end "ruleComma"


    // $ANTLR start "entryRuleVariableType"
    // InternalCNL.g:378:1: entryRuleVariableType : ruleVariableType EOF ;
    public final void entryRuleVariableType() throws RecognitionException {
        try {
            // InternalCNL.g:379:1: ( ruleVariableType EOF )
            // InternalCNL.g:380:1: ruleVariableType EOF
            {
             before(grammarAccess.getVariableTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableType();

            state._fsp--;

             after(grammarAccess.getVariableTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariableType"


    // $ANTLR start "ruleVariableType"
    // InternalCNL.g:387:1: ruleVariableType : ( ( rule__VariableType__Alternatives ) ) ;
    public final void ruleVariableType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:391:2: ( ( ( rule__VariableType__Alternatives ) ) )
            // InternalCNL.g:392:2: ( ( rule__VariableType__Alternatives ) )
            {
            // InternalCNL.g:392:2: ( ( rule__VariableType__Alternatives ) )
            // InternalCNL.g:393:3: ( rule__VariableType__Alternatives )
            {
             before(grammarAccess.getVariableTypeAccess().getAlternatives()); 
            // InternalCNL.g:394:3: ( rule__VariableType__Alternatives )
            // InternalCNL.g:394:4: rule__VariableType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariableType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVariableType"


    // $ANTLR start "entryRuleDeclVarInput"
    // InternalCNL.g:403:1: entryRuleDeclVarInput : ruleDeclVarInput EOF ;
    public final void entryRuleDeclVarInput() throws RecognitionException {
        try {
            // InternalCNL.g:404:1: ( ruleDeclVarInput EOF )
            // InternalCNL.g:405:1: ruleDeclVarInput EOF
            {
             before(grammarAccess.getDeclVarInputRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclVarInput();

            state._fsp--;

             after(grammarAccess.getDeclVarInputRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclVarInput"


    // $ANTLR start "ruleDeclVarInput"
    // InternalCNL.g:412:1: ruleDeclVarInput : ( ( rule__DeclVarInput__Group__0 ) ) ;
    public final void ruleDeclVarInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:416:2: ( ( ( rule__DeclVarInput__Group__0 ) ) )
            // InternalCNL.g:417:2: ( ( rule__DeclVarInput__Group__0 ) )
            {
            // InternalCNL.g:417:2: ( ( rule__DeclVarInput__Group__0 ) )
            // InternalCNL.g:418:3: ( rule__DeclVarInput__Group__0 )
            {
             before(grammarAccess.getDeclVarInputAccess().getGroup()); 
            // InternalCNL.g:419:3: ( rule__DeclVarInput__Group__0 )
            // InternalCNL.g:419:4: rule__DeclVarInput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeclVarInput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclVarInputAccess().getGroup()); 

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
    // $ANTLR end "ruleDeclVarInput"


    // $ANTLR start "entryRuleDeclVarOutput"
    // InternalCNL.g:428:1: entryRuleDeclVarOutput : ruleDeclVarOutput EOF ;
    public final void entryRuleDeclVarOutput() throws RecognitionException {
        try {
            // InternalCNL.g:429:1: ( ruleDeclVarOutput EOF )
            // InternalCNL.g:430:1: ruleDeclVarOutput EOF
            {
             before(grammarAccess.getDeclVarOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclVarOutput();

            state._fsp--;

             after(grammarAccess.getDeclVarOutputRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclVarOutput"


    // $ANTLR start "ruleDeclVarOutput"
    // InternalCNL.g:437:1: ruleDeclVarOutput : ( ( rule__DeclVarOutput__Group__0 ) ) ;
    public final void ruleDeclVarOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:441:2: ( ( ( rule__DeclVarOutput__Group__0 ) ) )
            // InternalCNL.g:442:2: ( ( rule__DeclVarOutput__Group__0 ) )
            {
            // InternalCNL.g:442:2: ( ( rule__DeclVarOutput__Group__0 ) )
            // InternalCNL.g:443:3: ( rule__DeclVarOutput__Group__0 )
            {
             before(grammarAccess.getDeclVarOutputAccess().getGroup()); 
            // InternalCNL.g:444:3: ( rule__DeclVarOutput__Group__0 )
            // InternalCNL.g:444:4: rule__DeclVarOutput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeclVarOutput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclVarOutputAccess().getGroup()); 

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
    // $ANTLR end "ruleDeclVarOutput"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalCNL.g:453:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // InternalCNL.g:454:1: ( ruleVarDeclaration EOF )
            // InternalCNL.g:455:1: ruleVarDeclaration EOF
            {
             before(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getVarDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalCNL.g:462:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:466:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // InternalCNL.g:467:2: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // InternalCNL.g:467:2: ( ( rule__VarDeclaration__Group__0 ) )
            // InternalCNL.g:468:3: ( rule__VarDeclaration__Group__0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            // InternalCNL.g:469:3: ( rule__VarDeclaration__Group__0 )
            // InternalCNL.g:469:4: rule__VarDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleSentDeclaration"
    // InternalCNL.g:478:1: entryRuleSentDeclaration : ruleSentDeclaration EOF ;
    public final void entryRuleSentDeclaration() throws RecognitionException {
        try {
            // InternalCNL.g:479:1: ( ruleSentDeclaration EOF )
            // InternalCNL.g:480:1: ruleSentDeclaration EOF
            {
             before(grammarAccess.getSentDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleSentDeclaration();

            state._fsp--;

             after(grammarAccess.getSentDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSentDeclaration"


    // $ANTLR start "ruleSentDeclaration"
    // InternalCNL.g:487:1: ruleSentDeclaration : ( ( rule__SentDeclaration__Group__0 ) ) ;
    public final void ruleSentDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:491:2: ( ( ( rule__SentDeclaration__Group__0 ) ) )
            // InternalCNL.g:492:2: ( ( rule__SentDeclaration__Group__0 ) )
            {
            // InternalCNL.g:492:2: ( ( rule__SentDeclaration__Group__0 ) )
            // InternalCNL.g:493:3: ( rule__SentDeclaration__Group__0 )
            {
             before(grammarAccess.getSentDeclarationAccess().getGroup()); 
            // InternalCNL.g:494:3: ( rule__SentDeclaration__Group__0 )
            // InternalCNL.g:494:4: rule__SentDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SentDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSentDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleSentDeclaration"


    // $ANTLR start "entryRuleSentenceDeclaration"
    // InternalCNL.g:503:1: entryRuleSentenceDeclaration : ruleSentenceDeclaration EOF ;
    public final void entryRuleSentenceDeclaration() throws RecognitionException {
        try {
            // InternalCNL.g:504:1: ( ruleSentenceDeclaration EOF )
            // InternalCNL.g:505:1: ruleSentenceDeclaration EOF
            {
             before(grammarAccess.getSentenceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleSentenceDeclaration();

            state._fsp--;

             after(grammarAccess.getSentenceDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSentenceDeclaration"


    // $ANTLR start "ruleSentenceDeclaration"
    // InternalCNL.g:512:1: ruleSentenceDeclaration : ( ( rule__SentenceDeclaration__Group__0 ) ) ;
    public final void ruleSentenceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:516:2: ( ( ( rule__SentenceDeclaration__Group__0 ) ) )
            // InternalCNL.g:517:2: ( ( rule__SentenceDeclaration__Group__0 ) )
            {
            // InternalCNL.g:517:2: ( ( rule__SentenceDeclaration__Group__0 ) )
            // InternalCNL.g:518:3: ( rule__SentenceDeclaration__Group__0 )
            {
             before(grammarAccess.getSentenceDeclarationAccess().getGroup()); 
            // InternalCNL.g:519:3: ( rule__SentenceDeclaration__Group__0 )
            // InternalCNL.g:519:4: rule__SentenceDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SentenceDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleSentenceDeclaration"


    // $ANTLR start "entryRuleExpression"
    // InternalCNL.g:528:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalCNL.g:529:1: ( ruleExpression EOF )
            // InternalCNL.g:530:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCNL.g:537:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:541:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalCNL.g:542:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalCNL.g:542:2: ( ( rule__Expression__Group__0 ) )
            // InternalCNL.g:543:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalCNL.g:544:3: ( rule__Expression__Group__0 )
            // InternalCNL.g:544:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

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


    // $ANTLR start "entryRuleXorExpression"
    // InternalCNL.g:553:1: entryRuleXorExpression : ruleXorExpression EOF ;
    public final void entryRuleXorExpression() throws RecognitionException {
        try {
            // InternalCNL.g:554:1: ( ruleXorExpression EOF )
            // InternalCNL.g:555:1: ruleXorExpression EOF
            {
             before(grammarAccess.getXorExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleXorExpression();

            state._fsp--;

             after(grammarAccess.getXorExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalCNL.g:562:1: ruleXorExpression : ( ( rule__XorExpression__Group__0 ) ) ;
    public final void ruleXorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:566:2: ( ( ( rule__XorExpression__Group__0 ) ) )
            // InternalCNL.g:567:2: ( ( rule__XorExpression__Group__0 ) )
            {
            // InternalCNL.g:567:2: ( ( rule__XorExpression__Group__0 ) )
            // InternalCNL.g:568:3: ( rule__XorExpression__Group__0 )
            {
             before(grammarAccess.getXorExpressionAccess().getGroup()); 
            // InternalCNL.g:569:3: ( rule__XorExpression__Group__0 )
            // InternalCNL.g:569:4: rule__XorExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXorExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleXOR_OPERATOR"
    // InternalCNL.g:578:1: entryRuleXOR_OPERATOR : ruleXOR_OPERATOR EOF ;
    public final void entryRuleXOR_OPERATOR() throws RecognitionException {
        try {
            // InternalCNL.g:579:1: ( ruleXOR_OPERATOR EOF )
            // InternalCNL.g:580:1: ruleXOR_OPERATOR EOF
            {
             before(grammarAccess.getXOR_OPERATORRule()); 
            pushFollow(FOLLOW_1);
            ruleXOR_OPERATOR();

            state._fsp--;

             after(grammarAccess.getXOR_OPERATORRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleXOR_OPERATOR"


    // $ANTLR start "ruleXOR_OPERATOR"
    // InternalCNL.g:587:1: ruleXOR_OPERATOR : ( 'XOR' ) ;
    public final void ruleXOR_OPERATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:591:2: ( ( 'XOR' ) )
            // InternalCNL.g:592:2: ( 'XOR' )
            {
            // InternalCNL.g:592:2: ( 'XOR' )
            // InternalCNL.g:593:3: 'XOR'
            {
             before(grammarAccess.getXOR_OPERATORAccess().getXORKeyword()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getXOR_OPERATORAccess().getXORKeyword()); 

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
    // $ANTLR end "ruleXOR_OPERATOR"


    // $ANTLR start "entryRuleAndExpression"
    // InternalCNL.g:603:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalCNL.g:604:1: ( ruleAndExpression EOF )
            // InternalCNL.g:605:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalCNL.g:612:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:616:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalCNL.g:617:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalCNL.g:617:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalCNL.g:618:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalCNL.g:619:3: ( rule__AndExpression__Group__0 )
            // InternalCNL.g:619:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleAND_OPERATOR"
    // InternalCNL.g:628:1: entryRuleAND_OPERATOR : ruleAND_OPERATOR EOF ;
    public final void entryRuleAND_OPERATOR() throws RecognitionException {
        try {
            // InternalCNL.g:629:1: ( ruleAND_OPERATOR EOF )
            // InternalCNL.g:630:1: ruleAND_OPERATOR EOF
            {
             before(grammarAccess.getAND_OPERATORRule()); 
            pushFollow(FOLLOW_1);
            ruleAND_OPERATOR();

            state._fsp--;

             after(grammarAccess.getAND_OPERATORRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAND_OPERATOR"


    // $ANTLR start "ruleAND_OPERATOR"
    // InternalCNL.g:637:1: ruleAND_OPERATOR : ( ( rule__AND_OPERATOR__Alternatives ) ) ;
    public final void ruleAND_OPERATOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:641:2: ( ( ( rule__AND_OPERATOR__Alternatives ) ) )
            // InternalCNL.g:642:2: ( ( rule__AND_OPERATOR__Alternatives ) )
            {
            // InternalCNL.g:642:2: ( ( rule__AND_OPERATOR__Alternatives ) )
            // InternalCNL.g:643:3: ( rule__AND_OPERATOR__Alternatives )
            {
             before(grammarAccess.getAND_OPERATORAccess().getAlternatives()); 
            // InternalCNL.g:644:3: ( rule__AND_OPERATOR__Alternatives )
            // InternalCNL.g:644:4: rule__AND_OPERATOR__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AND_OPERATOR__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAND_OPERATORAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAND_OPERATOR"


    // $ANTLR start "entryRuleCompExpression"
    // InternalCNL.g:653:1: entryRuleCompExpression : ruleCompExpression EOF ;
    public final void entryRuleCompExpression() throws RecognitionException {
        try {
            // InternalCNL.g:654:1: ( ruleCompExpression EOF )
            // InternalCNL.g:655:1: ruleCompExpression EOF
            {
             before(grammarAccess.getCompExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleCompExpression();

            state._fsp--;

             after(grammarAccess.getCompExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompExpression"


    // $ANTLR start "ruleCompExpression"
    // InternalCNL.g:662:1: ruleCompExpression : ( ( rule__CompExpression__Group__0 ) ) ;
    public final void ruleCompExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:666:2: ( ( ( rule__CompExpression__Group__0 ) ) )
            // InternalCNL.g:667:2: ( ( rule__CompExpression__Group__0 ) )
            {
            // InternalCNL.g:667:2: ( ( rule__CompExpression__Group__0 ) )
            // InternalCNL.g:668:3: ( rule__CompExpression__Group__0 )
            {
             before(grammarAccess.getCompExpressionAccess().getGroup()); 
            // InternalCNL.g:669:3: ( rule__CompExpression__Group__0 )
            // InternalCNL.g:669:4: rule__CompExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleCompExpression"


    // $ANTLR start "entryRuleEquExpression"
    // InternalCNL.g:678:1: entryRuleEquExpression : ruleEquExpression EOF ;
    public final void entryRuleEquExpression() throws RecognitionException {
        try {
            // InternalCNL.g:679:1: ( ruleEquExpression EOF )
            // InternalCNL.g:680:1: ruleEquExpression EOF
            {
             before(grammarAccess.getEquExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEquExpression();

            state._fsp--;

             after(grammarAccess.getEquExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEquExpression"


    // $ANTLR start "ruleEquExpression"
    // InternalCNL.g:687:1: ruleEquExpression : ( ( rule__EquExpression__Group__0 ) ) ;
    public final void ruleEquExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:691:2: ( ( ( rule__EquExpression__Group__0 ) ) )
            // InternalCNL.g:692:2: ( ( rule__EquExpression__Group__0 ) )
            {
            // InternalCNL.g:692:2: ( ( rule__EquExpression__Group__0 ) )
            // InternalCNL.g:693:3: ( rule__EquExpression__Group__0 )
            {
             before(grammarAccess.getEquExpressionAccess().getGroup()); 
            // InternalCNL.g:694:3: ( rule__EquExpression__Group__0 )
            // InternalCNL.g:694:4: rule__EquExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEquExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleEquExpression"


    // $ANTLR start "entryRuleUnOperator"
    // InternalCNL.g:703:1: entryRuleUnOperator : ruleUnOperator EOF ;
    public final void entryRuleUnOperator() throws RecognitionException {
        try {
            // InternalCNL.g:704:1: ( ruleUnOperator EOF )
            // InternalCNL.g:705:1: ruleUnOperator EOF
            {
             before(grammarAccess.getUnOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleUnOperator();

            state._fsp--;

             after(grammarAccess.getUnOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnOperator"


    // $ANTLR start "ruleUnOperator"
    // InternalCNL.g:712:1: ruleUnOperator : ( ( rule__UnOperator__Alternatives ) ) ;
    public final void ruleUnOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:716:2: ( ( ( rule__UnOperator__Alternatives ) ) )
            // InternalCNL.g:717:2: ( ( rule__UnOperator__Alternatives ) )
            {
            // InternalCNL.g:717:2: ( ( rule__UnOperator__Alternatives ) )
            // InternalCNL.g:718:3: ( rule__UnOperator__Alternatives )
            {
             before(grammarAccess.getUnOperatorAccess().getAlternatives()); 
            // InternalCNL.g:719:3: ( rule__UnOperator__Alternatives )
            // InternalCNL.g:719:4: rule__UnOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleUnOperator"


    // $ANTLR start "entryRuleNotOperator"
    // InternalCNL.g:728:1: entryRuleNotOperator : ruleNotOperator EOF ;
    public final void entryRuleNotOperator() throws RecognitionException {
        try {
            // InternalCNL.g:729:1: ( ruleNotOperator EOF )
            // InternalCNL.g:730:1: ruleNotOperator EOF
            {
             before(grammarAccess.getNotOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleNotOperator();

            state._fsp--;

             after(grammarAccess.getNotOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNotOperator"


    // $ANTLR start "ruleNotOperator"
    // InternalCNL.g:737:1: ruleNotOperator : ( ( rule__NotOperator__Alternatives ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:741:2: ( ( ( rule__NotOperator__Alternatives ) ) )
            // InternalCNL.g:742:2: ( ( rule__NotOperator__Alternatives ) )
            {
            // InternalCNL.g:742:2: ( ( rule__NotOperator__Alternatives ) )
            // InternalCNL.g:743:3: ( rule__NotOperator__Alternatives )
            {
             before(grammarAccess.getNotOperatorAccess().getAlternatives()); 
            // InternalCNL.g:744:3: ( rule__NotOperator__Alternatives )
            // InternalCNL.g:744:4: rule__NotOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NotOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNotOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "entryRuleUnExpression"
    // InternalCNL.g:753:1: entryRuleUnExpression : ruleUnExpression EOF ;
    public final void entryRuleUnExpression() throws RecognitionException {
        try {
            // InternalCNL.g:754:1: ( ruleUnExpression EOF )
            // InternalCNL.g:755:1: ruleUnExpression EOF
            {
             before(grammarAccess.getUnExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleUnExpression();

            state._fsp--;

             after(grammarAccess.getUnExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnExpression"


    // $ANTLR start "ruleUnExpression"
    // InternalCNL.g:762:1: ruleUnExpression : ( ( rule__UnExpression__Alternatives ) ) ;
    public final void ruleUnExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:766:2: ( ( ( rule__UnExpression__Alternatives ) ) )
            // InternalCNL.g:767:2: ( ( rule__UnExpression__Alternatives ) )
            {
            // InternalCNL.g:767:2: ( ( rule__UnExpression__Alternatives ) )
            // InternalCNL.g:768:3: ( rule__UnExpression__Alternatives )
            {
             before(grammarAccess.getUnExpressionAccess().getAlternatives()); 
            // InternalCNL.g:769:3: ( rule__UnExpression__Alternatives )
            // InternalCNL.g:769:4: rule__UnExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleUnExpression"


    // $ANTLR start "entryRuleTauExpression"
    // InternalCNL.g:778:1: entryRuleTauExpression : ruleTauExpression EOF ;
    public final void entryRuleTauExpression() throws RecognitionException {
        try {
            // InternalCNL.g:779:1: ( ruleTauExpression EOF )
            // InternalCNL.g:780:1: ruleTauExpression EOF
            {
             before(grammarAccess.getTauExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleTauExpression();

            state._fsp--;

             after(grammarAccess.getTauExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTauExpression"


    // $ANTLR start "ruleTauExpression"
    // InternalCNL.g:787:1: ruleTauExpression : ( ( rule__TauExpression__Group__0 ) ) ;
    public final void ruleTauExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:791:2: ( ( ( rule__TauExpression__Group__0 ) ) )
            // InternalCNL.g:792:2: ( ( rule__TauExpression__Group__0 ) )
            {
            // InternalCNL.g:792:2: ( ( rule__TauExpression__Group__0 ) )
            // InternalCNL.g:793:3: ( rule__TauExpression__Group__0 )
            {
             before(grammarAccess.getTauExpressionAccess().getGroup()); 
            // InternalCNL.g:794:3: ( rule__TauExpression__Group__0 )
            // InternalCNL.g:794:4: rule__TauExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TauExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTauExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleTauExpression"


    // $ANTLR start "entryRuleTimeLiteral"
    // InternalCNL.g:803:1: entryRuleTimeLiteral : ruleTimeLiteral EOF ;
    public final void entryRuleTimeLiteral() throws RecognitionException {
        try {
            // InternalCNL.g:804:1: ( ruleTimeLiteral EOF )
            // InternalCNL.g:805:1: ruleTimeLiteral EOF
            {
             before(grammarAccess.getTimeLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeLiteral();

            state._fsp--;

             after(grammarAccess.getTimeLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTimeLiteral"


    // $ANTLR start "ruleTimeLiteral"
    // InternalCNL.g:812:1: ruleTimeLiteral : ( ( rule__TimeLiteral__Group__0 ) ) ;
    public final void ruleTimeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:816:2: ( ( ( rule__TimeLiteral__Group__0 ) ) )
            // InternalCNL.g:817:2: ( ( rule__TimeLiteral__Group__0 ) )
            {
            // InternalCNL.g:817:2: ( ( rule__TimeLiteral__Group__0 ) )
            // InternalCNL.g:818:3: ( rule__TimeLiteral__Group__0 )
            {
             before(grammarAccess.getTimeLiteralAccess().getGroup()); 
            // InternalCNL.g:819:3: ( rule__TimeLiteral__Group__0 )
            // InternalCNL.g:819:4: rule__TimeLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeLiteralAccess().getGroup()); 

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
    // $ANTLR end "ruleTimeLiteral"


    // $ANTLR start "entryRuleTIME_PREF_LITERAL"
    // InternalCNL.g:828:1: entryRuleTIME_PREF_LITERAL : ruleTIME_PREF_LITERAL EOF ;
    public final void entryRuleTIME_PREF_LITERAL() throws RecognitionException {
        try {
            // InternalCNL.g:829:1: ( ruleTIME_PREF_LITERAL EOF )
            // InternalCNL.g:830:1: ruleTIME_PREF_LITERAL EOF
            {
             before(grammarAccess.getTIME_PREF_LITERALRule()); 
            pushFollow(FOLLOW_1);
            ruleTIME_PREF_LITERAL();

            state._fsp--;

             after(grammarAccess.getTIME_PREF_LITERALRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTIME_PREF_LITERAL"


    // $ANTLR start "ruleTIME_PREF_LITERAL"
    // InternalCNL.g:837:1: ruleTIME_PREF_LITERAL : ( '#T' ) ;
    public final void ruleTIME_PREF_LITERAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:841:2: ( ( '#T' ) )
            // InternalCNL.g:842:2: ( '#T' )
            {
            // InternalCNL.g:842:2: ( '#T' )
            // InternalCNL.g:843:3: '#T'
            {
             before(grammarAccess.getTIME_PREF_LITERALAccess().getTKeyword()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTIME_PREF_LITERALAccess().getTKeyword()); 

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
    // $ANTLR end "ruleTIME_PREF_LITERAL"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalCNL.g:853:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalCNL.g:854:1: ( rulePrimaryExpression EOF )
            // InternalCNL.g:855:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalCNL.g:862:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:866:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalCNL.g:867:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalCNL.g:867:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalCNL.g:868:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalCNL.g:869:3: ( rule__PrimaryExpression__Alternatives )
            // InternalCNL.g:869:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleConstant"
    // InternalCNL.g:878:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalCNL.g:879:1: ( ruleConstant EOF )
            // InternalCNL.g:880:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalCNL.g:887:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:891:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalCNL.g:892:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalCNL.g:892:2: ( ( rule__Constant__Alternatives ) )
            // InternalCNL.g:893:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalCNL.g:894:3: ( rule__Constant__Alternatives )
            // InternalCNL.g:894:4: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives()); 

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "ruleEquOperator"
    // InternalCNL.g:903:1: ruleEquOperator : ( ( rule__EquOperator__Alternatives ) ) ;
    public final void ruleEquOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:907:1: ( ( ( rule__EquOperator__Alternatives ) ) )
            // InternalCNL.g:908:2: ( ( rule__EquOperator__Alternatives ) )
            {
            // InternalCNL.g:908:2: ( ( rule__EquOperator__Alternatives ) )
            // InternalCNL.g:909:3: ( rule__EquOperator__Alternatives )
            {
             before(grammarAccess.getEquOperatorAccess().getAlternatives()); 
            // InternalCNL.g:910:3: ( rule__EquOperator__Alternatives )
            // InternalCNL.g:910:4: rule__EquOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EquOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEquOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEquOperator"


    // $ANTLR start "ruleCompOperator"
    // InternalCNL.g:919:1: ruleCompOperator : ( ( rule__CompOperator__Alternatives ) ) ;
    public final void ruleCompOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:923:1: ( ( ( rule__CompOperator__Alternatives ) ) )
            // InternalCNL.g:924:2: ( ( rule__CompOperator__Alternatives ) )
            {
            // InternalCNL.g:924:2: ( ( rule__CompOperator__Alternatives ) )
            // InternalCNL.g:925:3: ( rule__CompOperator__Alternatives )
            {
             before(grammarAccess.getCompOperatorAccess().getAlternatives()); 
            // InternalCNL.g:926:3: ( rule__CompOperator__Alternatives )
            // InternalCNL.g:926:4: rule__CompOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompOperatorAccess().getAlternatives()); 

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


    // $ANTLR start "rule__Model__Alternatives"
    // InternalCNL.g:934:1: rule__Model__Alternatives : ( ( ( rule__Model__DeclVarInputAssignment_0 ) ) | ( ( rule__Model__DeclVarOutputAssignment_1 ) ) | ( ( rule__Model__SentDeclarationAssignment_2 ) ) | ( ( rule__Model__ReqDeclarationAssignment_3 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:938:1: ( ( ( rule__Model__DeclVarInputAssignment_0 ) ) | ( ( rule__Model__DeclVarOutputAssignment_1 ) ) | ( ( rule__Model__SentDeclarationAssignment_2 ) ) | ( ( rule__Model__ReqDeclarationAssignment_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt2=1;
                }
                break;
            case 68:
                {
                alt2=2;
                }
                break;
            case 70:
                {
                alt2=3;
                }
                break;
            case 43:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCNL.g:939:2: ( ( rule__Model__DeclVarInputAssignment_0 ) )
                    {
                    // InternalCNL.g:939:2: ( ( rule__Model__DeclVarInputAssignment_0 ) )
                    // InternalCNL.g:940:3: ( rule__Model__DeclVarInputAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getDeclVarInputAssignment_0()); 
                    // InternalCNL.g:941:3: ( rule__Model__DeclVarInputAssignment_0 )
                    // InternalCNL.g:941:4: rule__Model__DeclVarInputAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__DeclVarInputAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDeclVarInputAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:945:2: ( ( rule__Model__DeclVarOutputAssignment_1 ) )
                    {
                    // InternalCNL.g:945:2: ( ( rule__Model__DeclVarOutputAssignment_1 ) )
                    // InternalCNL.g:946:3: ( rule__Model__DeclVarOutputAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getDeclVarOutputAssignment_1()); 
                    // InternalCNL.g:947:3: ( rule__Model__DeclVarOutputAssignment_1 )
                    // InternalCNL.g:947:4: rule__Model__DeclVarOutputAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__DeclVarOutputAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDeclVarOutputAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCNL.g:951:2: ( ( rule__Model__SentDeclarationAssignment_2 ) )
                    {
                    // InternalCNL.g:951:2: ( ( rule__Model__SentDeclarationAssignment_2 ) )
                    // InternalCNL.g:952:3: ( rule__Model__SentDeclarationAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getSentDeclarationAssignment_2()); 
                    // InternalCNL.g:953:3: ( rule__Model__SentDeclarationAssignment_2 )
                    // InternalCNL.g:953:4: rule__Model__SentDeclarationAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__SentDeclarationAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getSentDeclarationAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCNL.g:957:2: ( ( rule__Model__ReqDeclarationAssignment_3 ) )
                    {
                    // InternalCNL.g:957:2: ( ( rule__Model__ReqDeclarationAssignment_3 ) )
                    // InternalCNL.g:958:3: ( rule__Model__ReqDeclarationAssignment_3 )
                    {
                     before(grammarAccess.getModelAccess().getReqDeclarationAssignment_3()); 
                    // InternalCNL.g:959:3: ( rule__Model__ReqDeclarationAssignment_3 )
                    // InternalCNL.g:959:4: rule__Model__ReqDeclarationAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ReqDeclarationAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getReqDeclarationAssignment_3()); 

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
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Requirement__Alternatives_0"
    // InternalCNL.g:967:1: rule__Requirement__Alternatives_0 : ( ( ( rule__Requirement__TriggerAssignment_0_0 ) ) | ( ( rule__Requirement__InvariantAssignment_0_1 ) ) );
    public final void rule__Requirement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:971:1: ( ( ( rule__Requirement__TriggerAssignment_0_0 ) ) | ( ( rule__Requirement__InvariantAssignment_0_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26||LA3_0==46) ) {
                alt3=1;
            }
            else if ( (LA3_0==64) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCNL.g:972:2: ( ( rule__Requirement__TriggerAssignment_0_0 ) )
                    {
                    // InternalCNL.g:972:2: ( ( rule__Requirement__TriggerAssignment_0_0 ) )
                    // InternalCNL.g:973:3: ( rule__Requirement__TriggerAssignment_0_0 )
                    {
                     before(grammarAccess.getRequirementAccess().getTriggerAssignment_0_0()); 
                    // InternalCNL.g:974:3: ( rule__Requirement__TriggerAssignment_0_0 )
                    // InternalCNL.g:974:4: rule__Requirement__TriggerAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Requirement__TriggerAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRequirementAccess().getTriggerAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:978:2: ( ( rule__Requirement__InvariantAssignment_0_1 ) )
                    {
                    // InternalCNL.g:978:2: ( ( rule__Requirement__InvariantAssignment_0_1 ) )
                    // InternalCNL.g:979:3: ( rule__Requirement__InvariantAssignment_0_1 )
                    {
                     before(grammarAccess.getRequirementAccess().getInvariantAssignment_0_1()); 
                    // InternalCNL.g:980:3: ( rule__Requirement__InvariantAssignment_0_1 )
                    // InternalCNL.g:980:4: rule__Requirement__InvariantAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Requirement__InvariantAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRequirementAccess().getInvariantAssignment_0_1()); 

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
    // $ANTLR end "rule__Requirement__Alternatives_0"


    // $ANTLR start "rule__Trig__Alternatives_0"
    // InternalCNL.g:988:1: rule__Trig__Alternatives_0 : ( ( ( rule__Trig__Group_0_0__0 ) ) | ( 'Always' ) );
    public final void rule__Trig__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:992:1: ( ( ( rule__Trig__Group_0_0__0 ) ) | ( 'Always' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==46) ) {
                alt4=1;
            }
            else if ( (LA4_0==26) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCNL.g:993:2: ( ( rule__Trig__Group_0_0__0 ) )
                    {
                    // InternalCNL.g:993:2: ( ( rule__Trig__Group_0_0__0 ) )
                    // InternalCNL.g:994:3: ( rule__Trig__Group_0_0__0 )
                    {
                     before(grammarAccess.getTrigAccess().getGroup_0_0()); 
                    // InternalCNL.g:995:3: ( rule__Trig__Group_0_0__0 )
                    // InternalCNL.g:995:4: rule__Trig__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Trig__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTrigAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:999:2: ( 'Always' )
                    {
                    // InternalCNL.g:999:2: ( 'Always' )
                    // InternalCNL.g:1000:3: 'Always'
                    {
                     before(grammarAccess.getTrigAccess().getAlwaysKeyword_0_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getTrigAccess().getAlwaysKeyword_0_1()); 

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
    // $ANTLR end "rule__Trig__Alternatives_0"


    // $ANTLR start "rule__Trig__Alternatives_1"
    // InternalCNL.g:1009:1: rule__Trig__Alternatives_1 : ( ( ( rule__Trig__InvariantAssignment_1_0 ) ) | ( ( rule__Trig__Release_reactionAssignment_1_1 ) ) | ( ( rule__Trig__Delay_finalAssignment_1_2 ) ) );
    public final void rule__Trig__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1013:1: ( ( ( rule__Trig__InvariantAssignment_1_0 ) ) | ( ( rule__Trig__Release_reactionAssignment_1_1 ) ) | ( ( rule__Trig__Delay_finalAssignment_1_2 ) ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalCNL.g:1014:2: ( ( rule__Trig__InvariantAssignment_1_0 ) )
                    {
                    // InternalCNL.g:1014:2: ( ( rule__Trig__InvariantAssignment_1_0 ) )
                    // InternalCNL.g:1015:3: ( rule__Trig__InvariantAssignment_1_0 )
                    {
                     before(grammarAccess.getTrigAccess().getInvariantAssignment_1_0()); 
                    // InternalCNL.g:1016:3: ( rule__Trig__InvariantAssignment_1_0 )
                    // InternalCNL.g:1016:4: rule__Trig__InvariantAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Trig__InvariantAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTrigAccess().getInvariantAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1020:2: ( ( rule__Trig__Release_reactionAssignment_1_1 ) )
                    {
                    // InternalCNL.g:1020:2: ( ( rule__Trig__Release_reactionAssignment_1_1 ) )
                    // InternalCNL.g:1021:3: ( rule__Trig__Release_reactionAssignment_1_1 )
                    {
                     before(grammarAccess.getTrigAccess().getRelease_reactionAssignment_1_1()); 
                    // InternalCNL.g:1022:3: ( rule__Trig__Release_reactionAssignment_1_1 )
                    // InternalCNL.g:1022:4: rule__Trig__Release_reactionAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Trig__Release_reactionAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTrigAccess().getRelease_reactionAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCNL.g:1026:2: ( ( rule__Trig__Delay_finalAssignment_1_2 ) )
                    {
                    // InternalCNL.g:1026:2: ( ( rule__Trig__Delay_finalAssignment_1_2 ) )
                    // InternalCNL.g:1027:3: ( rule__Trig__Delay_finalAssignment_1_2 )
                    {
                     before(grammarAccess.getTrigAccess().getDelay_finalAssignment_1_2()); 
                    // InternalCNL.g:1028:3: ( rule__Trig__Delay_finalAssignment_1_2 )
                    // InternalCNL.g:1028:4: rule__Trig__Delay_finalAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Trig__Delay_finalAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTrigAccess().getDelay_finalAssignment_1_2()); 

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
    // $ANTLR end "rule__Trig__Alternatives_1"


    // $ANTLR start "rule__Inv__Alternatives_2"
    // InternalCNL.g:1036:1: rule__Inv__Alternatives_2 : ( ( ( rule__Inv__Group_2_0__0 ) ) | ( ( rule__Inv__Group_2_1__0 ) ) );
    public final void rule__Inv__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1040:1: ( ( ( rule__Inv__Group_2_0__0 ) ) | ( ( rule__Inv__Group_2_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==47) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCNL.g:1041:2: ( ( rule__Inv__Group_2_0__0 ) )
                    {
                    // InternalCNL.g:1041:2: ( ( rule__Inv__Group_2_0__0 ) )
                    // InternalCNL.g:1042:3: ( rule__Inv__Group_2_0__0 )
                    {
                     before(grammarAccess.getInvAccess().getGroup_2_0()); 
                    // InternalCNL.g:1043:3: ( rule__Inv__Group_2_0__0 )
                    // InternalCNL.g:1043:4: rule__Inv__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inv__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInvAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1047:2: ( ( rule__Inv__Group_2_1__0 ) )
                    {
                    // InternalCNL.g:1047:2: ( ( rule__Inv__Group_2_1__0 ) )
                    // InternalCNL.g:1048:3: ( rule__Inv__Group_2_1__0 )
                    {
                     before(grammarAccess.getInvAccess().getGroup_2_1()); 
                    // InternalCNL.g:1049:3: ( rule__Inv__Group_2_1__0 )
                    // InternalCNL.g:1049:4: rule__Inv__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inv__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInvAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Inv__Alternatives_2"


    // $ANTLR start "rule__RelRea__Alternatives"
    // InternalCNL.g:1057:1: rule__RelRea__Alternatives : ( ( ( rule__RelRea__Group_0__0 ) ) | ( ( rule__RelRea__Group_1__0 ) ) | ( ( rule__RelRea__Group_2__0 ) ) | ( ( rule__RelRea__Group_3__0 ) ) );
    public final void rule__RelRea__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1061:1: ( ( ( rule__RelRea__Group_0__0 ) ) | ( ( rule__RelRea__Group_1__0 ) ) | ( ( rule__RelRea__Group_2__0 ) ) | ( ( rule__RelRea__Group_3__0 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt7=1;
                }
                break;
            case 64:
                {
                alt7=2;
                }
                break;
            case 56:
                {
                alt7=3;
                }
                break;
            case 54:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCNL.g:1062:2: ( ( rule__RelRea__Group_0__0 ) )
                    {
                    // InternalCNL.g:1062:2: ( ( rule__RelRea__Group_0__0 ) )
                    // InternalCNL.g:1063:3: ( rule__RelRea__Group_0__0 )
                    {
                     before(grammarAccess.getRelReaAccess().getGroup_0()); 
                    // InternalCNL.g:1064:3: ( rule__RelRea__Group_0__0 )
                    // InternalCNL.g:1064:4: rule__RelRea__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelRea__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelReaAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1068:2: ( ( rule__RelRea__Group_1__0 ) )
                    {
                    // InternalCNL.g:1068:2: ( ( rule__RelRea__Group_1__0 ) )
                    // InternalCNL.g:1069:3: ( rule__RelRea__Group_1__0 )
                    {
                     before(grammarAccess.getRelReaAccess().getGroup_1()); 
                    // InternalCNL.g:1070:3: ( rule__RelRea__Group_1__0 )
                    // InternalCNL.g:1070:4: rule__RelRea__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelRea__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelReaAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCNL.g:1074:2: ( ( rule__RelRea__Group_2__0 ) )
                    {
                    // InternalCNL.g:1074:2: ( ( rule__RelRea__Group_2__0 ) )
                    // InternalCNL.g:1075:3: ( rule__RelRea__Group_2__0 )
                    {
                     before(grammarAccess.getRelReaAccess().getGroup_2()); 
                    // InternalCNL.g:1076:3: ( rule__RelRea__Group_2__0 )
                    // InternalCNL.g:1076:4: rule__RelRea__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelRea__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelReaAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCNL.g:1080:2: ( ( rule__RelRea__Group_3__0 ) )
                    {
                    // InternalCNL.g:1080:2: ( ( rule__RelRea__Group_3__0 ) )
                    // InternalCNL.g:1081:3: ( rule__RelRea__Group_3__0 )
                    {
                     before(grammarAccess.getRelReaAccess().getGroup_3()); 
                    // InternalCNL.g:1082:3: ( rule__RelRea__Group_3__0 )
                    // InternalCNL.g:1082:4: rule__RelRea__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelRea__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelReaAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RelRea__Alternatives"


    // $ANTLR start "rule__DelFin__Alternatives_1"
    // InternalCNL.g:1090:1: rule__DelFin__Alternatives_1 : ( ( ( rule__DelFin__Group_1_0__0 ) ) | ( ( rule__DelFin__FinAssignment_1_1 ) ) );
    public final void rule__DelFin__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1094:1: ( ( ( rule__DelFin__Group_1_0__0 ) ) | ( ( rule__DelFin__FinAssignment_1_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==57) ) {
                alt8=1;
            }
            else if ( (LA8_0==64) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCNL.g:1095:2: ( ( rule__DelFin__Group_1_0__0 ) )
                    {
                    // InternalCNL.g:1095:2: ( ( rule__DelFin__Group_1_0__0 ) )
                    // InternalCNL.g:1096:3: ( rule__DelFin__Group_1_0__0 )
                    {
                     before(grammarAccess.getDelFinAccess().getGroup_1_0()); 
                    // InternalCNL.g:1097:3: ( rule__DelFin__Group_1_0__0 )
                    // InternalCNL.g:1097:4: rule__DelFin__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DelFin__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDelFinAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1101:2: ( ( rule__DelFin__FinAssignment_1_1 ) )
                    {
                    // InternalCNL.g:1101:2: ( ( rule__DelFin__FinAssignment_1_1 ) )
                    // InternalCNL.g:1102:3: ( rule__DelFin__FinAssignment_1_1 )
                    {
                     before(grammarAccess.getDelFinAccess().getFinAssignment_1_1()); 
                    // InternalCNL.g:1103:3: ( rule__DelFin__FinAssignment_1_1 )
                    // InternalCNL.g:1103:4: rule__DelFin__FinAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DelFin__FinAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDelFinAccess().getFinAssignment_1_1()); 

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
    // $ANTLR end "rule__DelFin__Alternatives_1"


    // $ANTLR start "rule__DelFin__Alternatives_1_0_1"
    // InternalCNL.g:1111:1: rule__DelFin__Alternatives_1_0_1 : ( ( ( rule__DelFin__Group_1_0_1_0__0 ) ) | ( ( rule__DelFin__Group_1_0_1_1__0 ) ) );
    public final void rule__DelFin__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1115:1: ( ( ( rule__DelFin__Group_1_0_1_0__0 ) ) | ( ( rule__DelFin__Group_1_0_1_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==63) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=61 && LA9_0<=62)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCNL.g:1116:2: ( ( rule__DelFin__Group_1_0_1_0__0 ) )
                    {
                    // InternalCNL.g:1116:2: ( ( rule__DelFin__Group_1_0_1_0__0 ) )
                    // InternalCNL.g:1117:3: ( rule__DelFin__Group_1_0_1_0__0 )
                    {
                     before(grammarAccess.getDelFinAccess().getGroup_1_0_1_0()); 
                    // InternalCNL.g:1118:3: ( rule__DelFin__Group_1_0_1_0__0 )
                    // InternalCNL.g:1118:4: rule__DelFin__Group_1_0_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DelFin__Group_1_0_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDelFinAccess().getGroup_1_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1122:2: ( ( rule__DelFin__Group_1_0_1_1__0 ) )
                    {
                    // InternalCNL.g:1122:2: ( ( rule__DelFin__Group_1_0_1_1__0 ) )
                    // InternalCNL.g:1123:3: ( rule__DelFin__Group_1_0_1_1__0 )
                    {
                     before(grammarAccess.getDelFinAccess().getGroup_1_0_1_1()); 
                    // InternalCNL.g:1124:3: ( rule__DelFin__Group_1_0_1_1__0 )
                    // InternalCNL.g:1124:4: rule__DelFin__Group_1_0_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DelFin__Group_1_0_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDelFinAccess().getGroup_1_0_1_1()); 

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
    // $ANTLR end "rule__DelFin__Alternatives_1_0_1"


    // $ANTLR start "rule__ID_or_INTEGER__Alternatives_1"
    // InternalCNL.g:1132:1: rule__ID_or_INTEGER__Alternatives_1 : ( ( RULE_ID ) | ( RULE_INTEGER ) );
    public final void rule__ID_or_INTEGER__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1136:1: ( ( RULE_ID ) | ( RULE_INTEGER ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INTEGER) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCNL.g:1137:2: ( RULE_ID )
                    {
                    // InternalCNL.g:1137:2: ( RULE_ID )
                    // InternalCNL.g:1138:3: RULE_ID
                    {
                     before(grammarAccess.getID_or_INTEGERAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getID_or_INTEGERAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1143:2: ( RULE_INTEGER )
                    {
                    // InternalCNL.g:1143:2: ( RULE_INTEGER )
                    // InternalCNL.g:1144:3: RULE_INTEGER
                    {
                     before(grammarAccess.getID_or_INTEGERAccess().getINTEGERTerminalRuleCall_1_1()); 
                    match(input,RULE_INTEGER,FOLLOW_2); 
                     after(grammarAccess.getID_or_INTEGERAccess().getINTEGERTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__ID_or_INTEGER__Alternatives_1"


    // $ANTLR start "rule__VariableType__Alternatives"
    // InternalCNL.g:1153:1: rule__VariableType__Alternatives : ( ( 'BOOL' ) | ( 'INT' ) );
    public final void rule__VariableType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1157:1: ( ( 'BOOL' ) | ( 'INT' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            else if ( (LA11_0==28) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCNL.g:1158:2: ( 'BOOL' )
                    {
                    // InternalCNL.g:1158:2: ( 'BOOL' )
                    // InternalCNL.g:1159:3: 'BOOL'
                    {
                     before(grammarAccess.getVariableTypeAccess().getBOOLKeyword_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getVariableTypeAccess().getBOOLKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1164:2: ( 'INT' )
                    {
                    // InternalCNL.g:1164:2: ( 'INT' )
                    // InternalCNL.g:1165:3: 'INT'
                    {
                     before(grammarAccess.getVariableTypeAccess().getINTKeyword_1()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getVariableTypeAccess().getINTKeyword_1()); 

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
    // $ANTLR end "rule__VariableType__Alternatives"


    // $ANTLR start "rule__AND_OPERATOR__Alternatives"
    // InternalCNL.g:1174:1: rule__AND_OPERATOR__Alternatives : ( ( '&&' ) | ( 'AND' ) );
    public final void rule__AND_OPERATOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1178:1: ( ( '&&' ) | ( 'AND' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            else if ( (LA12_0==30) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCNL.g:1179:2: ( '&&' )
                    {
                    // InternalCNL.g:1179:2: ( '&&' )
                    // InternalCNL.g:1180:3: '&&'
                    {
                     before(grammarAccess.getAND_OPERATORAccess().getAmpersandAmpersandKeyword_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getAND_OPERATORAccess().getAmpersandAmpersandKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1185:2: ( 'AND' )
                    {
                    // InternalCNL.g:1185:2: ( 'AND' )
                    // InternalCNL.g:1186:3: 'AND'
                    {
                     before(grammarAccess.getAND_OPERATORAccess().getANDKeyword_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getAND_OPERATORAccess().getANDKeyword_1()); 

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
    // $ANTLR end "rule__AND_OPERATOR__Alternatives"


    // $ANTLR start "rule__UnOperator__Alternatives"
    // InternalCNL.g:1195:1: rule__UnOperator__Alternatives : ( ( ruleNotOperator ) | ( 'FE' ) | ( 'RE' ) | ( 'HIGH' ) | ( 'LOW' ) );
    public final void rule__UnOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1199:1: ( ( ruleNotOperator ) | ( 'FE' ) | ( 'RE' ) | ( 'HIGH' ) | ( 'LOW' ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 35:
            case 36:
                {
                alt13=1;
                }
                break;
            case 31:
                {
                alt13=2;
                }
                break;
            case 32:
                {
                alt13=3;
                }
                break;
            case 33:
                {
                alt13=4;
                }
                break;
            case 34:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalCNL.g:1200:2: ( ruleNotOperator )
                    {
                    // InternalCNL.g:1200:2: ( ruleNotOperator )
                    // InternalCNL.g:1201:3: ruleNotOperator
                    {
                     before(grammarAccess.getUnOperatorAccess().getNotOperatorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNotOperator();

                    state._fsp--;

                     after(grammarAccess.getUnOperatorAccess().getNotOperatorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1206:2: ( 'FE' )
                    {
                    // InternalCNL.g:1206:2: ( 'FE' )
                    // InternalCNL.g:1207:3: 'FE'
                    {
                     before(grammarAccess.getUnOperatorAccess().getFEKeyword_1()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getUnOperatorAccess().getFEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCNL.g:1212:2: ( 'RE' )
                    {
                    // InternalCNL.g:1212:2: ( 'RE' )
                    // InternalCNL.g:1213:3: 'RE'
                    {
                     before(grammarAccess.getUnOperatorAccess().getREKeyword_2()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getUnOperatorAccess().getREKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCNL.g:1218:2: ( 'HIGH' )
                    {
                    // InternalCNL.g:1218:2: ( 'HIGH' )
                    // InternalCNL.g:1219:3: 'HIGH'
                    {
                     before(grammarAccess.getUnOperatorAccess().getHIGHKeyword_3()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getUnOperatorAccess().getHIGHKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCNL.g:1224:2: ( 'LOW' )
                    {
                    // InternalCNL.g:1224:2: ( 'LOW' )
                    // InternalCNL.g:1225:3: 'LOW'
                    {
                     before(grammarAccess.getUnOperatorAccess().getLOWKeyword_4()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getUnOperatorAccess().getLOWKeyword_4()); 

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
    // $ANTLR end "rule__UnOperator__Alternatives"


    // $ANTLR start "rule__NotOperator__Alternatives"
    // InternalCNL.g:1234:1: rule__NotOperator__Alternatives : ( ( 'NOT' ) | ( '!' ) );
    public final void rule__NotOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1238:1: ( ( 'NOT' ) | ( '!' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            else if ( (LA14_0==36) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCNL.g:1239:2: ( 'NOT' )
                    {
                    // InternalCNL.g:1239:2: ( 'NOT' )
                    // InternalCNL.g:1240:3: 'NOT'
                    {
                     before(grammarAccess.getNotOperatorAccess().getNOTKeyword_0()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getNotOperatorAccess().getNOTKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1245:2: ( '!' )
                    {
                    // InternalCNL.g:1245:2: ( '!' )
                    // InternalCNL.g:1246:3: '!'
                    {
                     before(grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1()); 

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
    // $ANTLR end "rule__NotOperator__Alternatives"


    // $ANTLR start "rule__UnExpression__Alternatives"
    // InternalCNL.g:1255:1: rule__UnExpression__Alternatives : ( ( rulePrimaryExpression ) | ( ( rule__UnExpression__Group_1__0 ) ) );
    public final void rule__UnExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1259:1: ( ( rulePrimaryExpression ) | ( ( rule__UnExpression__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_BOOLEAN_LITERAL)||(LA15_0>=73 && LA15_0<=74)) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=31 && LA15_0<=36)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCNL.g:1260:2: ( rulePrimaryExpression )
                    {
                    // InternalCNL.g:1260:2: ( rulePrimaryExpression )
                    // InternalCNL.g:1261:3: rulePrimaryExpression
                    {
                     before(grammarAccess.getUnExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimaryExpression();

                    state._fsp--;

                     after(grammarAccess.getUnExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1266:2: ( ( rule__UnExpression__Group_1__0 ) )
                    {
                    // InternalCNL.g:1266:2: ( ( rule__UnExpression__Group_1__0 ) )
                    // InternalCNL.g:1267:3: ( rule__UnExpression__Group_1__0 )
                    {
                     before(grammarAccess.getUnExpressionAccess().getGroup_1()); 
                    // InternalCNL.g:1268:3: ( rule__UnExpression__Group_1__0 )
                    // InternalCNL.g:1268:4: rule__UnExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__UnExpression__Alternatives"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalCNL.g:1276:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__ConstantAssignment_0 ) ) | ( ( rule__PrimaryExpression__TauAssignment_1 ) ) | ( ( rule__PrimaryExpression__VAssignment_2 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1280:1: ( ( ( rule__PrimaryExpression__ConstantAssignment_0 ) ) | ( ( rule__PrimaryExpression__TauAssignment_1 ) ) | ( ( rule__PrimaryExpression__VAssignment_2 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
            case RULE_BOOLEAN_LITERAL:
                {
                alt16=1;
                }
                break;
            case 73:
                {
                alt16=2;
                }
                break;
            case RULE_ID:
                {
                alt16=3;
                }
                break;
            case 74:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalCNL.g:1281:2: ( ( rule__PrimaryExpression__ConstantAssignment_0 ) )
                    {
                    // InternalCNL.g:1281:2: ( ( rule__PrimaryExpression__ConstantAssignment_0 ) )
                    // InternalCNL.g:1282:3: ( rule__PrimaryExpression__ConstantAssignment_0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getConstantAssignment_0()); 
                    // InternalCNL.g:1283:3: ( rule__PrimaryExpression__ConstantAssignment_0 )
                    // InternalCNL.g:1283:4: rule__PrimaryExpression__ConstantAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__ConstantAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getConstantAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1287:2: ( ( rule__PrimaryExpression__TauAssignment_1 ) )
                    {
                    // InternalCNL.g:1287:2: ( ( rule__PrimaryExpression__TauAssignment_1 ) )
                    // InternalCNL.g:1288:3: ( rule__PrimaryExpression__TauAssignment_1 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getTauAssignment_1()); 
                    // InternalCNL.g:1289:3: ( rule__PrimaryExpression__TauAssignment_1 )
                    // InternalCNL.g:1289:4: rule__PrimaryExpression__TauAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__TauAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getTauAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCNL.g:1293:2: ( ( rule__PrimaryExpression__VAssignment_2 ) )
                    {
                    // InternalCNL.g:1293:2: ( ( rule__PrimaryExpression__VAssignment_2 ) )
                    // InternalCNL.g:1294:3: ( rule__PrimaryExpression__VAssignment_2 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getVAssignment_2()); 
                    // InternalCNL.g:1295:3: ( rule__PrimaryExpression__VAssignment_2 )
                    // InternalCNL.g:1295:4: rule__PrimaryExpression__VAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__VAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getVAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCNL.g:1299:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // InternalCNL.g:1299:2: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // InternalCNL.g:1300:3: ( rule__PrimaryExpression__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    // InternalCNL.g:1301:3: ( rule__PrimaryExpression__Group_3__0 )
                    // InternalCNL.g:1301:4: rule__PrimaryExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__Constant__Alternatives"
    // InternalCNL.g:1309:1: rule__Constant__Alternatives : ( ( RULE_INTEGER ) | ( RULE_BOOLEAN_LITERAL ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1313:1: ( ( RULE_INTEGER ) | ( RULE_BOOLEAN_LITERAL ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INTEGER) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_BOOLEAN_LITERAL) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalCNL.g:1314:2: ( RULE_INTEGER )
                    {
                    // InternalCNL.g:1314:2: ( RULE_INTEGER )
                    // InternalCNL.g:1315:3: RULE_INTEGER
                    {
                     before(grammarAccess.getConstantAccess().getINTEGERTerminalRuleCall_0()); 
                    match(input,RULE_INTEGER,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getINTEGERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1320:2: ( RULE_BOOLEAN_LITERAL )
                    {
                    // InternalCNL.g:1320:2: ( RULE_BOOLEAN_LITERAL )
                    // InternalCNL.g:1321:3: RULE_BOOLEAN_LITERAL
                    {
                     before(grammarAccess.getConstantAccess().getBOOLEAN_LITERALTerminalRuleCall_1()); 
                    match(input,RULE_BOOLEAN_LITERAL,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getBOOLEAN_LITERALTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Constant__Alternatives"


    // $ANTLR start "rule__EquOperator__Alternatives"
    // InternalCNL.g:1330:1: rule__EquOperator__Alternatives : ( ( ( '==' ) ) | ( ( '<>' ) ) );
    public final void rule__EquOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1334:1: ( ( ( '==' ) ) | ( ( '<>' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            else if ( (LA18_0==38) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalCNL.g:1335:2: ( ( '==' ) )
                    {
                    // InternalCNL.g:1335:2: ( ( '==' ) )
                    // InternalCNL.g:1336:3: ( '==' )
                    {
                     before(grammarAccess.getEquOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // InternalCNL.g:1337:3: ( '==' )
                    // InternalCNL.g:1337:4: '=='
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getEquOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1341:2: ( ( '<>' ) )
                    {
                    // InternalCNL.g:1341:2: ( ( '<>' ) )
                    // InternalCNL.g:1342:3: ( '<>' )
                    {
                     before(grammarAccess.getEquOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1()); 
                    // InternalCNL.g:1343:3: ( '<>' )
                    // InternalCNL.g:1343:4: '<>'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getEquOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__EquOperator__Alternatives"


    // $ANTLR start "rule__CompOperator__Alternatives"
    // InternalCNL.g:1351:1: rule__CompOperator__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) );
    public final void rule__CompOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1355:1: ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt19=1;
                }
                break;
            case 40:
                {
                alt19=2;
                }
                break;
            case 41:
                {
                alt19=3;
                }
                break;
            case 42:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalCNL.g:1356:2: ( ( '<' ) )
                    {
                    // InternalCNL.g:1356:2: ( ( '<' ) )
                    // InternalCNL.g:1357:3: ( '<' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                    // InternalCNL.g:1358:3: ( '<' )
                    // InternalCNL.g:1358:4: '<'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1362:2: ( ( '>' ) )
                    {
                    // InternalCNL.g:1362:2: ( ( '>' ) )
                    // InternalCNL.g:1363:3: ( '>' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                    // InternalCNL.g:1364:3: ( '>' )
                    // InternalCNL.g:1364:4: '>'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCNL.g:1368:2: ( ( '<=' ) )
                    {
                    // InternalCNL.g:1368:2: ( ( '<=' ) )
                    // InternalCNL.g:1369:3: ( '<=' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getLESS_EQUEnumLiteralDeclaration_2()); 
                    // InternalCNL.g:1370:3: ( '<=' )
                    // InternalCNL.g:1370:4: '<='
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getLESS_EQUEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCNL.g:1374:2: ( ( '>=' ) )
                    {
                    // InternalCNL.g:1374:2: ( ( '>=' ) )
                    // InternalCNL.g:1375:3: ( '>=' )
                    {
                     before(grammarAccess.getCompOperatorAccess().getGREATER_EQUEnumLiteralDeclaration_3()); 
                    // InternalCNL.g:1376:3: ( '>=' )
                    // InternalCNL.g:1376:4: '>='
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompOperatorAccess().getGREATER_EQUEnumLiteralDeclaration_3()); 

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


    // $ANTLR start "rule__ReqDeclaration__Group__0"
    // InternalCNL.g:1384:1: rule__ReqDeclaration__Group__0 : rule__ReqDeclaration__Group__0__Impl rule__ReqDeclaration__Group__1 ;
    public final void rule__ReqDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1388:1: ( rule__ReqDeclaration__Group__0__Impl rule__ReqDeclaration__Group__1 )
            // InternalCNL.g:1389:2: rule__ReqDeclaration__Group__0__Impl rule__ReqDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ReqDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReqDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqDeclaration__Group__0"


    // $ANTLR start "rule__ReqDeclaration__Group__0__Impl"
    // InternalCNL.g:1396:1: rule__ReqDeclaration__Group__0__Impl : ( 'REQUIREMENT' ) ;
    public final void rule__ReqDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1400:1: ( ( 'REQUIREMENT' ) )
            // InternalCNL.g:1401:1: ( 'REQUIREMENT' )
            {
            // InternalCNL.g:1401:1: ( 'REQUIREMENT' )
            // InternalCNL.g:1402:2: 'REQUIREMENT'
            {
             before(grammarAccess.getReqDeclarationAccess().getREQUIREMENTKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getReqDeclarationAccess().getREQUIREMENTKeyword_0()); 

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
    // $ANTLR end "rule__ReqDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ReqDeclaration__Group__1"
    // InternalCNL.g:1411:1: rule__ReqDeclaration__Group__1 : rule__ReqDeclaration__Group__1__Impl rule__ReqDeclaration__Group__2 ;
    public final void rule__ReqDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1415:1: ( rule__ReqDeclaration__Group__1__Impl rule__ReqDeclaration__Group__2 )
            // InternalCNL.g:1416:2: rule__ReqDeclaration__Group__1__Impl rule__ReqDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ReqDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReqDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqDeclaration__Group__1"


    // $ANTLR start "rule__ReqDeclaration__Group__1__Impl"
    // InternalCNL.g:1423:1: rule__ReqDeclaration__Group__1__Impl : ( ( rule__ReqDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ReqDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1427:1: ( ( ( rule__ReqDeclaration__NameAssignment_1 ) ) )
            // InternalCNL.g:1428:1: ( ( rule__ReqDeclaration__NameAssignment_1 ) )
            {
            // InternalCNL.g:1428:1: ( ( rule__ReqDeclaration__NameAssignment_1 ) )
            // InternalCNL.g:1429:2: ( rule__ReqDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getReqDeclarationAccess().getNameAssignment_1()); 
            // InternalCNL.g:1430:2: ( rule__ReqDeclaration__NameAssignment_1 )
            // InternalCNL.g:1430:3: rule__ReqDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReqDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReqDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ReqDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ReqDeclaration__Group__2"
    // InternalCNL.g:1438:1: rule__ReqDeclaration__Group__2 : rule__ReqDeclaration__Group__2__Impl rule__ReqDeclaration__Group__3 ;
    public final void rule__ReqDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1442:1: ( rule__ReqDeclaration__Group__2__Impl rule__ReqDeclaration__Group__3 )
            // InternalCNL.g:1443:2: rule__ReqDeclaration__Group__2__Impl rule__ReqDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ReqDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReqDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqDeclaration__Group__2"


    // $ANTLR start "rule__ReqDeclaration__Group__2__Impl"
    // InternalCNL.g:1450:1: rule__ReqDeclaration__Group__2__Impl : ( ( rule__ReqDeclaration__RequirementAssignment_2 ) ) ;
    public final void rule__ReqDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1454:1: ( ( ( rule__ReqDeclaration__RequirementAssignment_2 ) ) )
            // InternalCNL.g:1455:1: ( ( rule__ReqDeclaration__RequirementAssignment_2 ) )
            {
            // InternalCNL.g:1455:1: ( ( rule__ReqDeclaration__RequirementAssignment_2 ) )
            // InternalCNL.g:1456:2: ( rule__ReqDeclaration__RequirementAssignment_2 )
            {
             before(grammarAccess.getReqDeclarationAccess().getRequirementAssignment_2()); 
            // InternalCNL.g:1457:2: ( rule__ReqDeclaration__RequirementAssignment_2 )
            // InternalCNL.g:1457:3: rule__ReqDeclaration__RequirementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReqDeclaration__RequirementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReqDeclarationAccess().getRequirementAssignment_2()); 

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
    // $ANTLR end "rule__ReqDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ReqDeclaration__Group__3"
    // InternalCNL.g:1465:1: rule__ReqDeclaration__Group__3 : rule__ReqDeclaration__Group__3__Impl ;
    public final void rule__ReqDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1469:1: ( rule__ReqDeclaration__Group__3__Impl )
            // InternalCNL.g:1470:2: rule__ReqDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReqDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReqDeclaration__Group__3"


    // $ANTLR start "rule__ReqDeclaration__Group__3__Impl"
    // InternalCNL.g:1476:1: rule__ReqDeclaration__Group__3__Impl : ( 'END_REQUIREMENT' ) ;
    public final void rule__ReqDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1480:1: ( ( 'END_REQUIREMENT' ) )
            // InternalCNL.g:1481:1: ( 'END_REQUIREMENT' )
            {
            // InternalCNL.g:1481:1: ( 'END_REQUIREMENT' )
            // InternalCNL.g:1482:2: 'END_REQUIREMENT'
            {
             before(grammarAccess.getReqDeclarationAccess().getEND_REQUIREMENTKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getReqDeclarationAccess().getEND_REQUIREMENTKeyword_3()); 

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
    // $ANTLR end "rule__ReqDeclaration__Group__3__Impl"


    // $ANTLR start "rule__Requirement__Group__0"
    // InternalCNL.g:1492:1: rule__Requirement__Group__0 : rule__Requirement__Group__0__Impl rule__Requirement__Group__1 ;
    public final void rule__Requirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1496:1: ( rule__Requirement__Group__0__Impl rule__Requirement__Group__1 )
            // InternalCNL.g:1497:2: rule__Requirement__Group__0__Impl rule__Requirement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Requirement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requirement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__0"


    // $ANTLR start "rule__Requirement__Group__0__Impl"
    // InternalCNL.g:1504:1: rule__Requirement__Group__0__Impl : ( ( rule__Requirement__Alternatives_0 ) ) ;
    public final void rule__Requirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1508:1: ( ( ( rule__Requirement__Alternatives_0 ) ) )
            // InternalCNL.g:1509:1: ( ( rule__Requirement__Alternatives_0 ) )
            {
            // InternalCNL.g:1509:1: ( ( rule__Requirement__Alternatives_0 ) )
            // InternalCNL.g:1510:2: ( rule__Requirement__Alternatives_0 )
            {
             before(grammarAccess.getRequirementAccess().getAlternatives_0()); 
            // InternalCNL.g:1511:2: ( rule__Requirement__Alternatives_0 )
            // InternalCNL.g:1511:3: rule__Requirement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Requirement__Group__0__Impl"


    // $ANTLR start "rule__Requirement__Group__1"
    // InternalCNL.g:1519:1: rule__Requirement__Group__1 : rule__Requirement__Group__1__Impl ;
    public final void rule__Requirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1523:1: ( rule__Requirement__Group__1__Impl )
            // InternalCNL.g:1524:2: rule__Requirement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__1"


    // $ANTLR start "rule__Requirement__Group__1__Impl"
    // InternalCNL.g:1530:1: rule__Requirement__Group__1__Impl : ( '.' ) ;
    public final void rule__Requirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1534:1: ( ( '.' ) )
            // InternalCNL.g:1535:1: ( '.' )
            {
            // InternalCNL.g:1535:1: ( '.' )
            // InternalCNL.g:1536:2: '.'
            {
             before(grammarAccess.getRequirementAccess().getFullStopKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRequirementAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__Requirement__Group__1__Impl"


    // $ANTLR start "rule__Trig__Group__0"
    // InternalCNL.g:1546:1: rule__Trig__Group__0 : rule__Trig__Group__0__Impl rule__Trig__Group__1 ;
    public final void rule__Trig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1550:1: ( rule__Trig__Group__0__Impl rule__Trig__Group__1 )
            // InternalCNL.g:1551:2: rule__Trig__Group__0__Impl rule__Trig__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Trig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trig__Group__0"


    // $ANTLR start "rule__Trig__Group__0__Impl"
    // InternalCNL.g:1558:1: rule__Trig__Group__0__Impl : ( ( rule__Trig__Alternatives_0 ) ) ;
    public final void rule__Trig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1562:1: ( ( ( rule__Trig__Alternatives_0 ) ) )
            // InternalCNL.g:1563:1: ( ( rule__Trig__Alternatives_0 ) )
            {
            // InternalCNL.g:1563:1: ( ( rule__Trig__Alternatives_0 ) )
            // InternalCNL.g:1564:2: ( rule__Trig__Alternatives_0 )
            {
             before(grammarAccess.getTrigAccess().getAlternatives_0()); 
            // InternalCNL.g:1565:2: ( rule__Trig__Alternatives_0 )
            // InternalCNL.g:1565:3: rule__Trig__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Trig__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTrigAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Trig__Group__0__Impl"


    // $ANTLR start "rule__Trig__Group__1"
    // InternalCNL.g:1573:1: rule__Trig__Group__1 : rule__Trig__Group__1__Impl ;
    public final void rule__Trig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1577:1: ( rule__Trig__Group__1__Impl )
            // InternalCNL.g:1578:2: rule__Trig__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trig__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trig__Group__1"


    // $ANTLR start "rule__Trig__Group__1__Impl"
    // InternalCNL.g:1584:1: rule__Trig__Group__1__Impl : ( ( rule__Trig__Alternatives_1 ) ) ;
    public final void rule__Trig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1588:1: ( ( ( rule__Trig__Alternatives_1 ) ) )
            // InternalCNL.g:1589:1: ( ( rule__Trig__Alternatives_1 ) )
            {
            // InternalCNL.g:1589:1: ( ( rule__Trig__Alternatives_1 ) )
            // InternalCNL.g:1590:2: ( rule__Trig__Alternatives_1 )
            {
             before(grammarAccess.getTrigAccess().getAlternatives_1()); 
            // InternalCNL.g:1591:2: ( rule__Trig__Alternatives_1 )
            // InternalCNL.g:1591:3: rule__Trig__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Trig__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTrigAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Trig__Group__1__Impl"


    // $ANTLR start "rule__Trig__Group_0_0__0"
    // InternalCNL.g:1600:1: rule__Trig__Group_0_0__0 : rule__Trig__Group_0_0__0__Impl rule__Trig__Group_0_0__1 ;
    public final void rule__Trig__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1604:1: ( rule__Trig__Group_0_0__0__Impl rule__Trig__Group_0_0__1 )
            // InternalCNL.g:1605:2: rule__Trig__Group_0_0__0__Impl rule__Trig__Group_0_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Trig__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trig__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trig__Group_0_0__0"


    // $ANTLR start "rule__Trig__Group_0_0__0__Impl"
    // InternalCNL.g:1612:1: rule__Trig__Group_0_0__0__Impl : ( () ) ;
    public final void rule__Trig__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1616:1: ( ( () ) )
            // InternalCNL.g:1617:1: ( () )
            {
            // InternalCNL.g:1617:1: ( () )
            // InternalCNL.g:1618:2: ()
            {
             before(grammarAccess.getTrigAccess().getTrigAction_0_0_0()); 
            // InternalCNL.g:1619:2: ()
            // InternalCNL.g:1619:3: 
            {
            }

             after(grammarAccess.getTrigAccess().getTrigAction_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trig__Group_0_0__0__Impl"


    // $ANTLR start "rule__Trig__Group_0_0__1"
    // InternalCNL.g:1627:1: rule__Trig__Group_0_0__1 : rule__Trig__Group_0_0__1__Impl ;
    public final void rule__Trig__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1631:1: ( rule__Trig__Group_0_0__1__Impl )
            // InternalCNL.g:1632:2: rule__Trig__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trig__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trig__Group_0_0__1"


    // $ANTLR start "rule__Trig__Group_0_0__1__Impl"
    // InternalCNL.g:1638:1: rule__Trig__Group_0_0__1__Impl : ( ( rule__Trig__Group_0_0_1__0 ) ) ;
    public final void rule__Trig__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1642:1: ( ( ( rule__Trig__Group_0_0_1__0 ) ) )
            // InternalCNL.g:1643:1: ( ( rule__Trig__Group_0_0_1__0 ) )
            {
            // InternalCNL.g:1643:1: ( ( rule__Trig__Group_0_0_1__0 ) )
            // InternalCNL.g:1644:2: ( rule__Trig__Group_0_0_1__0 )
            {
             before(grammarAccess.getTrigAccess().getGroup_0_0_1()); 
            // InternalCNL.g:1645:2: ( rule__Trig__Group_0_0_1__0 )
            // InternalCNL.g:1645:3: rule__Trig__Group_0_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Trig__Group_0_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getTrigAccess().getGroup_0_0_1()); 

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
    // $ANTLR end "rule__Trig__Group_0_0__1__Impl"


    // $ANTLR start "rule__Trig__Group_0_0_1__0"
    // InternalCNL.g:1654:1: rule__Trig__Group_0_0_1__0 : rule__Trig__Group_0_0_1__0__Impl rule__Trig__Group_0_0_1__1 ;
    public final void rule__Trig__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1658:1: ( rule__Trig__Group_0_0_1__0__Impl rule__Trig__Group_0_0_1__1 )
            // InternalCNL.g:1659:2: rule__Trig__Group_0_0_1__0__Impl rule__Trig__Group_0_0_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Trig__Group_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trig__Group_0_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trig__Group_0_0_1__0"


    // $ANTLR start "rule__Trig__Group_0_0_1__0__Impl"
    // InternalCNL.g:1666:1: rule__Trig__Group_0_0_1__0__Impl : ( 'After' ) ;
    public final void rule__Trig__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1670:1: ( ( 'After' ) )
            // InternalCNL.g:1671:1: ( 'After' )
            {
            // InternalCNL.g:1671:1: ( 'After' )
            // InternalCNL.g:1672:2: 'After'
            {
             before(grammarAccess.getTrigAccess().getAfterKeyword_0_0_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTrigAccess().getAfterKeyword_0_0_1_0()); 

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
    // $ANTLR end "rule__Trig__Group_0_0_1__0__Impl"


    // $ANTLR start "rule__Trig__Group_0_0_1__1"
    // InternalCNL.g:1681:1: rule__Trig__Group_0_0_1__1 : rule__Trig__Group_0_0_1__1__Impl rule__Trig__Group_0_0_1__2 ;
    public final void rule__Trig__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1685:1: ( rule__Trig__Group_0_0_1__1__Impl rule__Trig__Group_0_0_1__2 )
            // InternalCNL.g:1686:2: rule__Trig__Group_0_0_1__1__Impl rule__Trig__Group_0_0_1__2
            {
            pushFollow(FOLLOW_10);
            rule__Trig__Group_0_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trig__Group_0_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trig__Group_0_0_1__1"


    // $ANTLR start "rule__Trig__Group_0_0_1__1__Impl"
    // InternalCNL.g:1693:1: rule__Trig__Group_0_0_1__1__Impl : ( ( rule__Trig__TrigAssignment_0_0_1_1 ) ) ;
    public final void rule__Trig__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1697:1: ( ( ( rule__Trig__TrigAssignment_0_0_1_1 ) ) )
            // InternalCNL.g:1698:1: ( ( rule__Trig__TrigAssignment_0_0_1_1 ) )
            {
            // InternalCNL.g:1698:1: ( ( rule__Trig__TrigAssignment_0_0_1_1 ) )
            // InternalCNL.g:1699:2: ( rule__Trig__TrigAssignment_0_0_1_1 )
            {
             before(grammarAccess.getTrigAccess().getTrigAssignment_0_0_1_1()); 
            // InternalCNL.g:1700:2: ( rule__Trig__TrigAssignment_0_0_1_1 )
            // InternalCNL.g:1700:3: rule__Trig__TrigAssignment_0_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Trig__TrigAssignment_0_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTrigAccess().getTrigAssignment_0_0_1_1()); 

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
    // $ANTLR end "rule__Trig__Group_0_0_1__1__Impl"


    // $ANTLR start "rule__Trig__Group_0_0_1__2"
    // InternalCNL.g:1708:1: rule__Trig__Group_0_0_1__2 : rule__Trig__Group_0_0_1__2__Impl ;
    public final void rule__Trig__Group_0_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1712:1: ( rule__Trig__Group_0_0_1__2__Impl )
            // InternalCNL.g:1713:2: rule__Trig__Group_0_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trig__Group_0_0_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trig__Group_0_0_1__2"


    // $ANTLR start "rule__Trig__Group_0_0_1__2__Impl"
    // InternalCNL.g:1719:1: rule__Trig__Group_0_0_1__2__Impl : ( ruleComma ) ;
    public final void rule__Trig__Group_0_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1723:1: ( ( ruleComma ) )
            // InternalCNL.g:1724:1: ( ruleComma )
            {
            // InternalCNL.g:1724:1: ( ruleComma )
            // InternalCNL.g:1725:2: ruleComma
            {
             before(grammarAccess.getTrigAccess().getCommaParserRuleCall_0_0_1_2()); 
            pushFollow(FOLLOW_2);
            ruleComma();

            state._fsp--;

             after(grammarAccess.getTrigAccess().getCommaParserRuleCall_0_0_1_2()); 

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
    // $ANTLR end "rule__Trig__Group_0_0_1__2__Impl"


    // $ANTLR start "rule__Inv__Group__0"
    // InternalCNL.g:1735:1: rule__Inv__Group__0 : rule__Inv__Group__0__Impl rule__Inv__Group__1 ;
    public final void rule__Inv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1739:1: ( rule__Inv__Group__0__Impl rule__Inv__Group__1 )
            // InternalCNL.g:1740:2: rule__Inv__Group__0__Impl rule__Inv__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Inv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group__0"


    // $ANTLR start "rule__Inv__Group__0__Impl"
    // InternalCNL.g:1747:1: rule__Inv__Group__0__Impl : ( () ) ;
    public final void rule__Inv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1751:1: ( ( () ) )
            // InternalCNL.g:1752:1: ( () )
            {
            // InternalCNL.g:1752:1: ( () )
            // InternalCNL.g:1753:2: ()
            {
             before(grammarAccess.getInvAccess().getInvAction_0()); 
            // InternalCNL.g:1754:2: ()
            // InternalCNL.g:1754:3: 
            {
            }

             after(grammarAccess.getInvAccess().getInvAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group__0__Impl"


    // $ANTLR start "rule__Inv__Group__1"
    // InternalCNL.g:1762:1: rule__Inv__Group__1 : rule__Inv__Group__1__Impl rule__Inv__Group__2 ;
    public final void rule__Inv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1766:1: ( rule__Inv__Group__1__Impl rule__Inv__Group__2 )
            // InternalCNL.g:1767:2: rule__Inv__Group__1__Impl rule__Inv__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Inv__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group__1"


    // $ANTLR start "rule__Inv__Group__1__Impl"
    // InternalCNL.g:1774:1: rule__Inv__Group__1__Impl : ( ( rule__Inv__InvAssignment_1 ) ) ;
    public final void rule__Inv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1778:1: ( ( ( rule__Inv__InvAssignment_1 ) ) )
            // InternalCNL.g:1779:1: ( ( rule__Inv__InvAssignment_1 ) )
            {
            // InternalCNL.g:1779:1: ( ( rule__Inv__InvAssignment_1 ) )
            // InternalCNL.g:1780:2: ( rule__Inv__InvAssignment_1 )
            {
             before(grammarAccess.getInvAccess().getInvAssignment_1()); 
            // InternalCNL.g:1781:2: ( rule__Inv__InvAssignment_1 )
            // InternalCNL.g:1781:3: rule__Inv__InvAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Inv__InvAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInvAccess().getInvAssignment_1()); 

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
    // $ANTLR end "rule__Inv__Group__1__Impl"


    // $ANTLR start "rule__Inv__Group__2"
    // InternalCNL.g:1789:1: rule__Inv__Group__2 : rule__Inv__Group__2__Impl ;
    public final void rule__Inv__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1793:1: ( rule__Inv__Group__2__Impl )
            // InternalCNL.g:1794:2: rule__Inv__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inv__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group__2"


    // $ANTLR start "rule__Inv__Group__2__Impl"
    // InternalCNL.g:1800:1: rule__Inv__Group__2__Impl : ( ( rule__Inv__Alternatives_2 )? ) ;
    public final void rule__Inv__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1804:1: ( ( ( rule__Inv__Alternatives_2 )? ) )
            // InternalCNL.g:1805:1: ( ( rule__Inv__Alternatives_2 )? )
            {
            // InternalCNL.g:1805:1: ( ( rule__Inv__Alternatives_2 )? )
            // InternalCNL.g:1806:2: ( rule__Inv__Alternatives_2 )?
            {
             before(grammarAccess.getInvAccess().getAlternatives_2()); 
            // InternalCNL.g:1807:2: ( rule__Inv__Alternatives_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23||LA20_0==47) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCNL.g:1807:3: rule__Inv__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inv__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInvAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Inv__Group__2__Impl"


    // $ANTLR start "rule__Inv__Group_2_0__0"
    // InternalCNL.g:1816:1: rule__Inv__Group_2_0__0 : rule__Inv__Group_2_0__0__Impl rule__Inv__Group_2_0__1 ;
    public final void rule__Inv__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1820:1: ( rule__Inv__Group_2_0__0__Impl rule__Inv__Group_2_0__1 )
            // InternalCNL.g:1821:2: rule__Inv__Group_2_0__0__Impl rule__Inv__Group_2_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Inv__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group_2_0__0"


    // $ANTLR start "rule__Inv__Group_2_0__0__Impl"
    // InternalCNL.g:1828:1: rule__Inv__Group_2_0__0__Impl : ( ruleComma ) ;
    public final void rule__Inv__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1832:1: ( ( ruleComma ) )
            // InternalCNL.g:1833:1: ( ruleComma )
            {
            // InternalCNL.g:1833:1: ( ruleComma )
            // InternalCNL.g:1834:2: ruleComma
            {
             before(grammarAccess.getInvAccess().getCommaParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComma();

            state._fsp--;

             after(grammarAccess.getInvAccess().getCommaParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Inv__Group_2_0__0__Impl"


    // $ANTLR start "rule__Inv__Group_2_0__1"
    // InternalCNL.g:1843:1: rule__Inv__Group_2_0__1 : rule__Inv__Group_2_0__1__Impl ;
    public final void rule__Inv__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1847:1: ( rule__Inv__Group_2_0__1__Impl )
            // InternalCNL.g:1848:2: rule__Inv__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inv__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group_2_0__1"


    // $ANTLR start "rule__Inv__Group_2_0__1__Impl"
    // InternalCNL.g:1854:1: rule__Inv__Group_2_0__1__Impl : ( ( rule__Inv__Delay_finalAssignment_2_0_1 ) ) ;
    public final void rule__Inv__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1858:1: ( ( ( rule__Inv__Delay_finalAssignment_2_0_1 ) ) )
            // InternalCNL.g:1859:1: ( ( rule__Inv__Delay_finalAssignment_2_0_1 ) )
            {
            // InternalCNL.g:1859:1: ( ( rule__Inv__Delay_finalAssignment_2_0_1 ) )
            // InternalCNL.g:1860:2: ( rule__Inv__Delay_finalAssignment_2_0_1 )
            {
             before(grammarAccess.getInvAccess().getDelay_finalAssignment_2_0_1()); 
            // InternalCNL.g:1861:2: ( rule__Inv__Delay_finalAssignment_2_0_1 )
            // InternalCNL.g:1861:3: rule__Inv__Delay_finalAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Inv__Delay_finalAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getInvAccess().getDelay_finalAssignment_2_0_1()); 

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
    // $ANTLR end "rule__Inv__Group_2_0__1__Impl"


    // $ANTLR start "rule__Inv__Group_2_1__0"
    // InternalCNL.g:1870:1: rule__Inv__Group_2_1__0 : rule__Inv__Group_2_1__0__Impl rule__Inv__Group_2_1__1 ;
    public final void rule__Inv__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1874:1: ( rule__Inv__Group_2_1__0__Impl rule__Inv__Group_2_1__1 )
            // InternalCNL.g:1875:2: rule__Inv__Group_2_1__0__Impl rule__Inv__Group_2_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Inv__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group_2_1__0"


    // $ANTLR start "rule__Inv__Group_2_1__0__Impl"
    // InternalCNL.g:1882:1: rule__Inv__Group_2_1__0__Impl : ( 'should' ) ;
    public final void rule__Inv__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1886:1: ( ( 'should' ) )
            // InternalCNL.g:1887:1: ( 'should' )
            {
            // InternalCNL.g:1887:1: ( 'should' )
            // InternalCNL.g:1888:2: 'should'
            {
             before(grammarAccess.getInvAccess().getShouldKeyword_2_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getInvAccess().getShouldKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Inv__Group_2_1__0__Impl"


    // $ANTLR start "rule__Inv__Group_2_1__1"
    // InternalCNL.g:1897:1: rule__Inv__Group_2_1__1 : rule__Inv__Group_2_1__1__Impl rule__Inv__Group_2_1__2 ;
    public final void rule__Inv__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1901:1: ( rule__Inv__Group_2_1__1__Impl rule__Inv__Group_2_1__2 )
            // InternalCNL.g:1902:2: rule__Inv__Group_2_1__1__Impl rule__Inv__Group_2_1__2
            {
            pushFollow(FOLLOW_13);
            rule__Inv__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group_2_1__1"


    // $ANTLR start "rule__Inv__Group_2_1__1__Impl"
    // InternalCNL.g:1909:1: rule__Inv__Group_2_1__1__Impl : ( 'remain' ) ;
    public final void rule__Inv__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1913:1: ( ( 'remain' ) )
            // InternalCNL.g:1914:1: ( 'remain' )
            {
            // InternalCNL.g:1914:1: ( 'remain' )
            // InternalCNL.g:1915:2: 'remain'
            {
             before(grammarAccess.getInvAccess().getRemainKeyword_2_1_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInvAccess().getRemainKeyword_2_1_1()); 

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
    // $ANTLR end "rule__Inv__Group_2_1__1__Impl"


    // $ANTLR start "rule__Inv__Group_2_1__2"
    // InternalCNL.g:1924:1: rule__Inv__Group_2_1__2 : rule__Inv__Group_2_1__2__Impl rule__Inv__Group_2_1__3 ;
    public final void rule__Inv__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1928:1: ( rule__Inv__Group_2_1__2__Impl rule__Inv__Group_2_1__3 )
            // InternalCNL.g:1929:2: rule__Inv__Group_2_1__2__Impl rule__Inv__Group_2_1__3
            {
            pushFollow(FOLLOW_14);
            rule__Inv__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group_2_1__2"


    // $ANTLR start "rule__Inv__Group_2_1__2__Impl"
    // InternalCNL.g:1936:1: rule__Inv__Group_2_1__2__Impl : ( 'valid' ) ;
    public final void rule__Inv__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1940:1: ( ( 'valid' ) )
            // InternalCNL.g:1941:1: ( 'valid' )
            {
            // InternalCNL.g:1941:1: ( 'valid' )
            // InternalCNL.g:1942:2: 'valid'
            {
             before(grammarAccess.getInvAccess().getValidKeyword_2_1_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getInvAccess().getValidKeyword_2_1_2()); 

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
    // $ANTLR end "rule__Inv__Group_2_1__2__Impl"


    // $ANTLR start "rule__Inv__Group_2_1__3"
    // InternalCNL.g:1951:1: rule__Inv__Group_2_1__3 : rule__Inv__Group_2_1__3__Impl rule__Inv__Group_2_1__4 ;
    public final void rule__Inv__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1955:1: ( rule__Inv__Group_2_1__3__Impl rule__Inv__Group_2_1__4 )
            // InternalCNL.g:1956:2: rule__Inv__Group_2_1__3__Impl rule__Inv__Group_2_1__4
            {
            pushFollow(FOLLOW_15);
            rule__Inv__Group_2_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv__Group_2_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group_2_1__3"


    // $ANTLR start "rule__Inv__Group_2_1__3__Impl"
    // InternalCNL.g:1963:1: rule__Inv__Group_2_1__3__Impl : ( 'until' ) ;
    public final void rule__Inv__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1967:1: ( ( 'until' ) )
            // InternalCNL.g:1968:1: ( 'until' )
            {
            // InternalCNL.g:1968:1: ( 'until' )
            // InternalCNL.g:1969:2: 'until'
            {
             before(grammarAccess.getInvAccess().getUntilKeyword_2_1_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getInvAccess().getUntilKeyword_2_1_3()); 

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
    // $ANTLR end "rule__Inv__Group_2_1__3__Impl"


    // $ANTLR start "rule__Inv__Group_2_1__4"
    // InternalCNL.g:1978:1: rule__Inv__Group_2_1__4 : rule__Inv__Group_2_1__4__Impl ;
    public final void rule__Inv__Group_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1982:1: ( rule__Inv__Group_2_1__4__Impl )
            // InternalCNL.g:1983:2: rule__Inv__Group_2_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inv__Group_2_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv__Group_2_1__4"


    // $ANTLR start "rule__Inv__Group_2_1__4__Impl"
    // InternalCNL.g:1989:1: rule__Inv__Group_2_1__4__Impl : ( ( rule__Inv__Release_reactionAssignment_2_1_4 ) ) ;
    public final void rule__Inv__Group_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:1993:1: ( ( ( rule__Inv__Release_reactionAssignment_2_1_4 ) ) )
            // InternalCNL.g:1994:1: ( ( rule__Inv__Release_reactionAssignment_2_1_4 ) )
            {
            // InternalCNL.g:1994:1: ( ( rule__Inv__Release_reactionAssignment_2_1_4 ) )
            // InternalCNL.g:1995:2: ( rule__Inv__Release_reactionAssignment_2_1_4 )
            {
             before(grammarAccess.getInvAccess().getRelease_reactionAssignment_2_1_4()); 
            // InternalCNL.g:1996:2: ( rule__Inv__Release_reactionAssignment_2_1_4 )
            // InternalCNL.g:1996:3: rule__Inv__Release_reactionAssignment_2_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Inv__Release_reactionAssignment_2_1_4();

            state._fsp--;


            }

             after(grammarAccess.getInvAccess().getRelease_reactionAssignment_2_1_4()); 

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
    // $ANTLR end "rule__Inv__Group_2_1__4__Impl"


    // $ANTLR start "rule__Inv_always__Group__0"
    // InternalCNL.g:2005:1: rule__Inv_always__Group__0 : rule__Inv_always__Group__0__Impl rule__Inv_always__Group__1 ;
    public final void rule__Inv_always__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2009:1: ( rule__Inv_always__Group__0__Impl rule__Inv_always__Group__1 )
            // InternalCNL.g:2010:2: rule__Inv_always__Group__0__Impl rule__Inv_always__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Inv_always__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv_always__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__Group__0"


    // $ANTLR start "rule__Inv_always__Group__0__Impl"
    // InternalCNL.g:2017:1: rule__Inv_always__Group__0__Impl : ( () ) ;
    public final void rule__Inv_always__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2021:1: ( ( () ) )
            // InternalCNL.g:2022:1: ( () )
            {
            // InternalCNL.g:2022:1: ( () )
            // InternalCNL.g:2023:2: ()
            {
             before(grammarAccess.getInv_alwaysAccess().getInv_alwaysAction_0()); 
            // InternalCNL.g:2024:2: ()
            // InternalCNL.g:2024:3: 
            {
            }

             after(grammarAccess.getInv_alwaysAccess().getInv_alwaysAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__Group__0__Impl"


    // $ANTLR start "rule__Inv_always__Group__1"
    // InternalCNL.g:2032:1: rule__Inv_always__Group__1 : rule__Inv_always__Group__1__Impl ;
    public final void rule__Inv_always__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2036:1: ( rule__Inv_always__Group__1__Impl )
            // InternalCNL.g:2037:2: rule__Inv_always__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inv_always__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__Group__1"


    // $ANTLR start "rule__Inv_always__Group__1__Impl"
    // InternalCNL.g:2043:1: rule__Inv_always__Group__1__Impl : ( ( rule__Inv_always__Group_1__0 ) ) ;
    public final void rule__Inv_always__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2047:1: ( ( ( rule__Inv_always__Group_1__0 ) ) )
            // InternalCNL.g:2048:1: ( ( rule__Inv_always__Group_1__0 ) )
            {
            // InternalCNL.g:2048:1: ( ( rule__Inv_always__Group_1__0 ) )
            // InternalCNL.g:2049:2: ( rule__Inv_always__Group_1__0 )
            {
             before(grammarAccess.getInv_alwaysAccess().getGroup_1()); 
            // InternalCNL.g:2050:2: ( rule__Inv_always__Group_1__0 )
            // InternalCNL.g:2050:3: rule__Inv_always__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Inv_always__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getInv_alwaysAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Inv_always__Group__1__Impl"


    // $ANTLR start "rule__Inv_always__Group_1__0"
    // InternalCNL.g:2059:1: rule__Inv_always__Group_1__0 : rule__Inv_always__Group_1__0__Impl rule__Inv_always__Group_1__1 ;
    public final void rule__Inv_always__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2063:1: ( rule__Inv_always__Group_1__0__Impl rule__Inv_always__Group_1__1 )
            // InternalCNL.g:2064:2: rule__Inv_always__Group_1__0__Impl rule__Inv_always__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Inv_always__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv_always__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__Group_1__0"


    // $ANTLR start "rule__Inv_always__Group_1__0__Impl"
    // InternalCNL.g:2071:1: rule__Inv_always__Group_1__0__Impl : ( ( rule__Inv_always__InvAssignment_1_0 ) ) ;
    public final void rule__Inv_always__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2075:1: ( ( ( rule__Inv_always__InvAssignment_1_0 ) ) )
            // InternalCNL.g:2076:1: ( ( rule__Inv_always__InvAssignment_1_0 ) )
            {
            // InternalCNL.g:2076:1: ( ( rule__Inv_always__InvAssignment_1_0 ) )
            // InternalCNL.g:2077:2: ( rule__Inv_always__InvAssignment_1_0 )
            {
             before(grammarAccess.getInv_alwaysAccess().getInvAssignment_1_0()); 
            // InternalCNL.g:2078:2: ( rule__Inv_always__InvAssignment_1_0 )
            // InternalCNL.g:2078:3: rule__Inv_always__InvAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Inv_always__InvAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getInv_alwaysAccess().getInvAssignment_1_0()); 

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
    // $ANTLR end "rule__Inv_always__Group_1__0__Impl"


    // $ANTLR start "rule__Inv_always__Group_1__1"
    // InternalCNL.g:2086:1: rule__Inv_always__Group_1__1 : rule__Inv_always__Group_1__1__Impl rule__Inv_always__Group_1__2 ;
    public final void rule__Inv_always__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2090:1: ( rule__Inv_always__Group_1__1__Impl rule__Inv_always__Group_1__2 )
            // InternalCNL.g:2091:2: rule__Inv_always__Group_1__1__Impl rule__Inv_always__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__Inv_always__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv_always__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__Group_1__1"


    // $ANTLR start "rule__Inv_always__Group_1__1__Impl"
    // InternalCNL.g:2098:1: rule__Inv_always__Group_1__1__Impl : ( 'should' ) ;
    public final void rule__Inv_always__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2102:1: ( ( 'should' ) )
            // InternalCNL.g:2103:1: ( 'should' )
            {
            // InternalCNL.g:2103:1: ( 'should' )
            // InternalCNL.g:2104:2: 'should'
            {
             before(grammarAccess.getInv_alwaysAccess().getShouldKeyword_1_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getInv_alwaysAccess().getShouldKeyword_1_1()); 

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
    // $ANTLR end "rule__Inv_always__Group_1__1__Impl"


    // $ANTLR start "rule__Inv_always__Group_1__2"
    // InternalCNL.g:2113:1: rule__Inv_always__Group_1__2 : rule__Inv_always__Group_1__2__Impl rule__Inv_always__Group_1__3 ;
    public final void rule__Inv_always__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2117:1: ( rule__Inv_always__Group_1__2__Impl rule__Inv_always__Group_1__3 )
            // InternalCNL.g:2118:2: rule__Inv_always__Group_1__2__Impl rule__Inv_always__Group_1__3
            {
            pushFollow(FOLLOW_12);
            rule__Inv_always__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv_always__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__Group_1__2"


    // $ANTLR start "rule__Inv_always__Group_1__2__Impl"
    // InternalCNL.g:2125:1: rule__Inv_always__Group_1__2__Impl : ( 'always' ) ;
    public final void rule__Inv_always__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2129:1: ( ( 'always' ) )
            // InternalCNL.g:2130:1: ( 'always' )
            {
            // InternalCNL.g:2130:1: ( 'always' )
            // InternalCNL.g:2131:2: 'always'
            {
             before(grammarAccess.getInv_alwaysAccess().getAlwaysKeyword_1_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getInv_alwaysAccess().getAlwaysKeyword_1_2()); 

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
    // $ANTLR end "rule__Inv_always__Group_1__2__Impl"


    // $ANTLR start "rule__Inv_always__Group_1__3"
    // InternalCNL.g:2140:1: rule__Inv_always__Group_1__3 : rule__Inv_always__Group_1__3__Impl rule__Inv_always__Group_1__4 ;
    public final void rule__Inv_always__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2144:1: ( rule__Inv_always__Group_1__3__Impl rule__Inv_always__Group_1__4 )
            // InternalCNL.g:2145:2: rule__Inv_always__Group_1__3__Impl rule__Inv_always__Group_1__4
            {
            pushFollow(FOLLOW_13);
            rule__Inv_always__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv_always__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__Group_1__3"


    // $ANTLR start "rule__Inv_always__Group_1__3__Impl"
    // InternalCNL.g:2152:1: rule__Inv_always__Group_1__3__Impl : ( 'remain' ) ;
    public final void rule__Inv_always__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2156:1: ( ( 'remain' ) )
            // InternalCNL.g:2157:1: ( 'remain' )
            {
            // InternalCNL.g:2157:1: ( 'remain' )
            // InternalCNL.g:2158:2: 'remain'
            {
             before(grammarAccess.getInv_alwaysAccess().getRemainKeyword_1_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInv_alwaysAccess().getRemainKeyword_1_3()); 

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
    // $ANTLR end "rule__Inv_always__Group_1__3__Impl"


    // $ANTLR start "rule__Inv_always__Group_1__4"
    // InternalCNL.g:2167:1: rule__Inv_always__Group_1__4 : rule__Inv_always__Group_1__4__Impl rule__Inv_always__Group_1__5 ;
    public final void rule__Inv_always__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2171:1: ( rule__Inv_always__Group_1__4__Impl rule__Inv_always__Group_1__5 )
            // InternalCNL.g:2172:2: rule__Inv_always__Group_1__4__Impl rule__Inv_always__Group_1__5
            {
            pushFollow(FOLLOW_14);
            rule__Inv_always__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv_always__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__Group_1__4"


    // $ANTLR start "rule__Inv_always__Group_1__4__Impl"
    // InternalCNL.g:2179:1: rule__Inv_always__Group_1__4__Impl : ( 'valid' ) ;
    public final void rule__Inv_always__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2183:1: ( ( 'valid' ) )
            // InternalCNL.g:2184:1: ( 'valid' )
            {
            // InternalCNL.g:2184:1: ( 'valid' )
            // InternalCNL.g:2185:2: 'valid'
            {
             before(grammarAccess.getInv_alwaysAccess().getValidKeyword_1_4()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getInv_alwaysAccess().getValidKeyword_1_4()); 

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
    // $ANTLR end "rule__Inv_always__Group_1__4__Impl"


    // $ANTLR start "rule__Inv_always__Group_1__5"
    // InternalCNL.g:2194:1: rule__Inv_always__Group_1__5 : rule__Inv_always__Group_1__5__Impl rule__Inv_always__Group_1__6 ;
    public final void rule__Inv_always__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2198:1: ( rule__Inv_always__Group_1__5__Impl rule__Inv_always__Group_1__6 )
            // InternalCNL.g:2199:2: rule__Inv_always__Group_1__5__Impl rule__Inv_always__Group_1__6
            {
            pushFollow(FOLLOW_15);
            rule__Inv_always__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inv_always__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__Group_1__5"


    // $ANTLR start "rule__Inv_always__Group_1__5__Impl"
    // InternalCNL.g:2206:1: rule__Inv_always__Group_1__5__Impl : ( 'until' ) ;
    public final void rule__Inv_always__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2210:1: ( ( 'until' ) )
            // InternalCNL.g:2211:1: ( 'until' )
            {
            // InternalCNL.g:2211:1: ( 'until' )
            // InternalCNL.g:2212:2: 'until'
            {
             before(grammarAccess.getInv_alwaysAccess().getUntilKeyword_1_5()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getInv_alwaysAccess().getUntilKeyword_1_5()); 

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
    // $ANTLR end "rule__Inv_always__Group_1__5__Impl"


    // $ANTLR start "rule__Inv_always__Group_1__6"
    // InternalCNL.g:2221:1: rule__Inv_always__Group_1__6 : rule__Inv_always__Group_1__6__Impl ;
    public final void rule__Inv_always__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2225:1: ( rule__Inv_always__Group_1__6__Impl )
            // InternalCNL.g:2226:2: rule__Inv_always__Group_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inv_always__Group_1__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inv_always__Group_1__6"


    // $ANTLR start "rule__Inv_always__Group_1__6__Impl"
    // InternalCNL.g:2232:1: rule__Inv_always__Group_1__6__Impl : ( ( rule__Inv_always__Release_reactionAssignment_1_6 ) ) ;
    public final void rule__Inv_always__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2236:1: ( ( ( rule__Inv_always__Release_reactionAssignment_1_6 ) ) )
            // InternalCNL.g:2237:1: ( ( rule__Inv_always__Release_reactionAssignment_1_6 ) )
            {
            // InternalCNL.g:2237:1: ( ( rule__Inv_always__Release_reactionAssignment_1_6 ) )
            // InternalCNL.g:2238:2: ( rule__Inv_always__Release_reactionAssignment_1_6 )
            {
             before(grammarAccess.getInv_alwaysAccess().getRelease_reactionAssignment_1_6()); 
            // InternalCNL.g:2239:2: ( rule__Inv_always__Release_reactionAssignment_1_6 )
            // InternalCNL.g:2239:3: rule__Inv_always__Release_reactionAssignment_1_6
            {
            pushFollow(FOLLOW_2);
            rule__Inv_always__Release_reactionAssignment_1_6();

            state._fsp--;


            }

             after(grammarAccess.getInv_alwaysAccess().getRelease_reactionAssignment_1_6()); 

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
    // $ANTLR end "rule__Inv_always__Group_1__6__Impl"


    // $ANTLR start "rule__RelRea__Group_0__0"
    // InternalCNL.g:2248:1: rule__RelRea__Group_0__0 : rule__RelRea__Group_0__0__Impl rule__RelRea__Group_0__1 ;
    public final void rule__RelRea__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2252:1: ( rule__RelRea__Group_0__0__Impl rule__RelRea__Group_0__1 )
            // InternalCNL.g:2253:2: rule__RelRea__Group_0__0__Impl rule__RelRea__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__RelRea__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_0__0"


    // $ANTLR start "rule__RelRea__Group_0__0__Impl"
    // InternalCNL.g:2260:1: rule__RelRea__Group_0__0__Impl : ( 'either' ) ;
    public final void rule__RelRea__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2264:1: ( ( 'either' ) )
            // InternalCNL.g:2265:1: ( 'either' )
            {
            // InternalCNL.g:2265:1: ( 'either' )
            // InternalCNL.g:2266:2: 'either'
            {
             before(grammarAccess.getRelReaAccess().getEitherKeyword_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getRelReaAccess().getEitherKeyword_0_0()); 

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
    // $ANTLR end "rule__RelRea__Group_0__0__Impl"


    // $ANTLR start "rule__RelRea__Group_0__1"
    // InternalCNL.g:2275:1: rule__RelRea__Group_0__1 : rule__RelRea__Group_0__1__Impl rule__RelRea__Group_0__2 ;
    public final void rule__RelRea__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2279:1: ( rule__RelRea__Group_0__1__Impl rule__RelRea__Group_0__2 )
            // InternalCNL.g:2280:2: rule__RelRea__Group_0__1__Impl rule__RelRea__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__RelRea__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_0__1"


    // $ANTLR start "rule__RelRea__Group_0__1__Impl"
    // InternalCNL.g:2287:1: rule__RelRea__Group_0__1__Impl : ( () ) ;
    public final void rule__RelRea__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2291:1: ( ( () ) )
            // InternalCNL.g:2292:1: ( () )
            {
            // InternalCNL.g:2292:1: ( () )
            // InternalCNL.g:2293:2: ()
            {
             before(grammarAccess.getRelReaAccess().getRelAction_0_1()); 
            // InternalCNL.g:2294:2: ()
            // InternalCNL.g:2294:3: 
            {
            }

             after(grammarAccess.getRelReaAccess().getRelAction_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_0__1__Impl"


    // $ANTLR start "rule__RelRea__Group_0__2"
    // InternalCNL.g:2302:1: rule__RelRea__Group_0__2 : rule__RelRea__Group_0__2__Impl rule__RelRea__Group_0__3 ;
    public final void rule__RelRea__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2306:1: ( rule__RelRea__Group_0__2__Impl rule__RelRea__Group_0__3 )
            // InternalCNL.g:2307:2: rule__RelRea__Group_0__2__Impl rule__RelRea__Group_0__3
            {
            pushFollow(FOLLOW_18);
            rule__RelRea__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_0__2"


    // $ANTLR start "rule__RelRea__Group_0__2__Impl"
    // InternalCNL.g:2314:1: rule__RelRea__Group_0__2__Impl : ( ( rule__RelRea__RelAssignment_0_2 ) ) ;
    public final void rule__RelRea__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2318:1: ( ( ( rule__RelRea__RelAssignment_0_2 ) ) )
            // InternalCNL.g:2319:1: ( ( rule__RelRea__RelAssignment_0_2 ) )
            {
            // InternalCNL.g:2319:1: ( ( rule__RelRea__RelAssignment_0_2 ) )
            // InternalCNL.g:2320:2: ( rule__RelRea__RelAssignment_0_2 )
            {
             before(grammarAccess.getRelReaAccess().getRelAssignment_0_2()); 
            // InternalCNL.g:2321:2: ( rule__RelRea__RelAssignment_0_2 )
            // InternalCNL.g:2321:3: rule__RelRea__RelAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__RelAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getRelAssignment_0_2()); 

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
    // $ANTLR end "rule__RelRea__Group_0__2__Impl"


    // $ANTLR start "rule__RelRea__Group_0__3"
    // InternalCNL.g:2329:1: rule__RelRea__Group_0__3 : rule__RelRea__Group_0__3__Impl rule__RelRea__Group_0__4 ;
    public final void rule__RelRea__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2333:1: ( rule__RelRea__Group_0__3__Impl rule__RelRea__Group_0__4 )
            // InternalCNL.g:2334:2: rule__RelRea__Group_0__3__Impl rule__RelRea__Group_0__4
            {
            pushFollow(FOLLOW_19);
            rule__RelRea__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_0__3"


    // $ANTLR start "rule__RelRea__Group_0__3__Impl"
    // InternalCNL.g:2341:1: rule__RelRea__Group_0__3__Impl : ( 'or' ) ;
    public final void rule__RelRea__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2345:1: ( ( 'or' ) )
            // InternalCNL.g:2346:1: ( 'or' )
            {
            // InternalCNL.g:2346:1: ( 'or' )
            // InternalCNL.g:2347:2: 'or'
            {
             before(grammarAccess.getRelReaAccess().getOrKeyword_0_3()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getRelReaAccess().getOrKeyword_0_3()); 

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
    // $ANTLR end "rule__RelRea__Group_0__3__Impl"


    // $ANTLR start "rule__RelRea__Group_0__4"
    // InternalCNL.g:2356:1: rule__RelRea__Group_0__4 : rule__RelRea__Group_0__4__Impl rule__RelRea__Group_0__5 ;
    public final void rule__RelRea__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2360:1: ( rule__RelRea__Group_0__4__Impl rule__RelRea__Group_0__5 )
            // InternalCNL.g:2361:2: rule__RelRea__Group_0__4__Impl rule__RelRea__Group_0__5
            {
            pushFollow(FOLLOW_10);
            rule__RelRea__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_0__4"


    // $ANTLR start "rule__RelRea__Group_0__4__Impl"
    // InternalCNL.g:2368:1: rule__RelRea__Group_0__4__Impl : ( ( rule__RelRea__ReactionAssignment_0_4 ) ) ;
    public final void rule__RelRea__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2372:1: ( ( ( rule__RelRea__ReactionAssignment_0_4 ) ) )
            // InternalCNL.g:2373:1: ( ( rule__RelRea__ReactionAssignment_0_4 ) )
            {
            // InternalCNL.g:2373:1: ( ( rule__RelRea__ReactionAssignment_0_4 ) )
            // InternalCNL.g:2374:2: ( rule__RelRea__ReactionAssignment_0_4 )
            {
             before(grammarAccess.getRelReaAccess().getReactionAssignment_0_4()); 
            // InternalCNL.g:2375:2: ( rule__RelRea__ReactionAssignment_0_4 )
            // InternalCNL.g:2375:3: rule__RelRea__ReactionAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__ReactionAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getReactionAssignment_0_4()); 

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
    // $ANTLR end "rule__RelRea__Group_0__4__Impl"


    // $ANTLR start "rule__RelRea__Group_0__5"
    // InternalCNL.g:2383:1: rule__RelRea__Group_0__5 : rule__RelRea__Group_0__5__Impl ;
    public final void rule__RelRea__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2387:1: ( rule__RelRea__Group_0__5__Impl )
            // InternalCNL.g:2388:2: rule__RelRea__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_0__5"


    // $ANTLR start "rule__RelRea__Group_0__5__Impl"
    // InternalCNL.g:2394:1: rule__RelRea__Group_0__5__Impl : ( ( rule__RelRea__Group_0_5__0 )? ) ;
    public final void rule__RelRea__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2398:1: ( ( ( rule__RelRea__Group_0_5__0 )? ) )
            // InternalCNL.g:2399:1: ( ( rule__RelRea__Group_0_5__0 )? )
            {
            // InternalCNL.g:2399:1: ( ( rule__RelRea__Group_0_5__0 )? )
            // InternalCNL.g:2400:2: ( rule__RelRea__Group_0_5__0 )?
            {
             before(grammarAccess.getRelReaAccess().getGroup_0_5()); 
            // InternalCNL.g:2401:2: ( rule__RelRea__Group_0_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCNL.g:2401:3: rule__RelRea__Group_0_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelRea__Group_0_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelReaAccess().getGroup_0_5()); 

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
    // $ANTLR end "rule__RelRea__Group_0__5__Impl"


    // $ANTLR start "rule__RelRea__Group_0_5__0"
    // InternalCNL.g:2410:1: rule__RelRea__Group_0_5__0 : rule__RelRea__Group_0_5__0__Impl rule__RelRea__Group_0_5__1 ;
    public final void rule__RelRea__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2414:1: ( rule__RelRea__Group_0_5__0__Impl rule__RelRea__Group_0_5__1 )
            // InternalCNL.g:2415:2: rule__RelRea__Group_0_5__0__Impl rule__RelRea__Group_0_5__1
            {
            pushFollow(FOLLOW_8);
            rule__RelRea__Group_0_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_0_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_0_5__0"


    // $ANTLR start "rule__RelRea__Group_0_5__0__Impl"
    // InternalCNL.g:2422:1: rule__RelRea__Group_0_5__0__Impl : ( ruleComma ) ;
    public final void rule__RelRea__Group_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2426:1: ( ( ruleComma ) )
            // InternalCNL.g:2427:1: ( ruleComma )
            {
            // InternalCNL.g:2427:1: ( ruleComma )
            // InternalCNL.g:2428:2: ruleComma
            {
             before(grammarAccess.getRelReaAccess().getCommaParserRuleCall_0_5_0()); 
            pushFollow(FOLLOW_2);
            ruleComma();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getCommaParserRuleCall_0_5_0()); 

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
    // $ANTLR end "rule__RelRea__Group_0_5__0__Impl"


    // $ANTLR start "rule__RelRea__Group_0_5__1"
    // InternalCNL.g:2437:1: rule__RelRea__Group_0_5__1 : rule__RelRea__Group_0_5__1__Impl ;
    public final void rule__RelRea__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2441:1: ( rule__RelRea__Group_0_5__1__Impl )
            // InternalCNL.g:2442:2: rule__RelRea__Group_0_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_0_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_0_5__1"


    // $ANTLR start "rule__RelRea__Group_0_5__1__Impl"
    // InternalCNL.g:2448:1: rule__RelRea__Group_0_5__1__Impl : ( ( rule__RelRea__Delay_finalAssignment_0_5_1 ) ) ;
    public final void rule__RelRea__Group_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2452:1: ( ( ( rule__RelRea__Delay_finalAssignment_0_5_1 ) ) )
            // InternalCNL.g:2453:1: ( ( rule__RelRea__Delay_finalAssignment_0_5_1 ) )
            {
            // InternalCNL.g:2453:1: ( ( rule__RelRea__Delay_finalAssignment_0_5_1 ) )
            // InternalCNL.g:2454:2: ( rule__RelRea__Delay_finalAssignment_0_5_1 )
            {
             before(grammarAccess.getRelReaAccess().getDelay_finalAssignment_0_5_1()); 
            // InternalCNL.g:2455:2: ( rule__RelRea__Delay_finalAssignment_0_5_1 )
            // InternalCNL.g:2455:3: rule__RelRea__Delay_finalAssignment_0_5_1
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Delay_finalAssignment_0_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getDelay_finalAssignment_0_5_1()); 

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
    // $ANTLR end "rule__RelRea__Group_0_5__1__Impl"


    // $ANTLR start "rule__RelRea__Group_1__0"
    // InternalCNL.g:2464:1: rule__RelRea__Group_1__0 : rule__RelRea__Group_1__0__Impl rule__RelRea__Group_1__1 ;
    public final void rule__RelRea__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2468:1: ( rule__RelRea__Group_1__0__Impl rule__RelRea__Group_1__1 )
            // InternalCNL.g:2469:2: rule__RelRea__Group_1__0__Impl rule__RelRea__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__RelRea__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_1__0"


    // $ANTLR start "rule__RelRea__Group_1__0__Impl"
    // InternalCNL.g:2476:1: rule__RelRea__Group_1__0__Impl : ( () ) ;
    public final void rule__RelRea__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2480:1: ( ( () ) )
            // InternalCNL.g:2481:1: ( () )
            {
            // InternalCNL.g:2481:1: ( () )
            // InternalCNL.g:2482:2: ()
            {
             before(grammarAccess.getRelReaAccess().getRelAction_1_0()); 
            // InternalCNL.g:2483:2: ()
            // InternalCNL.g:2483:3: 
            {
            }

             after(grammarAccess.getRelReaAccess().getRelAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_1__0__Impl"


    // $ANTLR start "rule__RelRea__Group_1__1"
    // InternalCNL.g:2491:1: rule__RelRea__Group_1__1 : rule__RelRea__Group_1__1__Impl ;
    public final void rule__RelRea__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2495:1: ( rule__RelRea__Group_1__1__Impl )
            // InternalCNL.g:2496:2: rule__RelRea__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_1__1"


    // $ANTLR start "rule__RelRea__Group_1__1__Impl"
    // InternalCNL.g:2502:1: rule__RelRea__Group_1__1__Impl : ( ( rule__RelRea__RelAssignment_1_1 ) ) ;
    public final void rule__RelRea__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2506:1: ( ( ( rule__RelRea__RelAssignment_1_1 ) ) )
            // InternalCNL.g:2507:1: ( ( rule__RelRea__RelAssignment_1_1 ) )
            {
            // InternalCNL.g:2507:1: ( ( rule__RelRea__RelAssignment_1_1 ) )
            // InternalCNL.g:2508:2: ( rule__RelRea__RelAssignment_1_1 )
            {
             before(grammarAccess.getRelReaAccess().getRelAssignment_1_1()); 
            // InternalCNL.g:2509:2: ( rule__RelRea__RelAssignment_1_1 )
            // InternalCNL.g:2509:3: rule__RelRea__RelAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__RelAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getRelAssignment_1_1()); 

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
    // $ANTLR end "rule__RelRea__Group_1__1__Impl"


    // $ANTLR start "rule__RelRea__Group_2__0"
    // InternalCNL.g:2518:1: rule__RelRea__Group_2__0 : rule__RelRea__Group_2__0__Impl rule__RelRea__Group_2__1 ;
    public final void rule__RelRea__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2522:1: ( rule__RelRea__Group_2__0__Impl rule__RelRea__Group_2__1 )
            // InternalCNL.g:2523:2: rule__RelRea__Group_2__0__Impl rule__RelRea__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__RelRea__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_2__0"


    // $ANTLR start "rule__RelRea__Group_2__0__Impl"
    // InternalCNL.g:2530:1: rule__RelRea__Group_2__0__Impl : ( () ) ;
    public final void rule__RelRea__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2534:1: ( ( () ) )
            // InternalCNL.g:2535:1: ( () )
            {
            // InternalCNL.g:2535:1: ( () )
            // InternalCNL.g:2536:2: ()
            {
             before(grammarAccess.getRelReaAccess().getReaAction_2_0()); 
            // InternalCNL.g:2537:2: ()
            // InternalCNL.g:2537:3: 
            {
            }

             after(grammarAccess.getRelReaAccess().getReaAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_2__0__Impl"


    // $ANTLR start "rule__RelRea__Group_2__1"
    // InternalCNL.g:2545:1: rule__RelRea__Group_2__1 : rule__RelRea__Group_2__1__Impl ;
    public final void rule__RelRea__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2549:1: ( rule__RelRea__Group_2__1__Impl )
            // InternalCNL.g:2550:2: rule__RelRea__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_2__1"


    // $ANTLR start "rule__RelRea__Group_2__1__Impl"
    // InternalCNL.g:2556:1: rule__RelRea__Group_2__1__Impl : ( ( rule__RelRea__Group_2_1__0 ) ) ;
    public final void rule__RelRea__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2560:1: ( ( ( rule__RelRea__Group_2_1__0 ) ) )
            // InternalCNL.g:2561:1: ( ( rule__RelRea__Group_2_1__0 ) )
            {
            // InternalCNL.g:2561:1: ( ( rule__RelRea__Group_2_1__0 ) )
            // InternalCNL.g:2562:2: ( rule__RelRea__Group_2_1__0 )
            {
             before(grammarAccess.getRelReaAccess().getGroup_2_1()); 
            // InternalCNL.g:2563:2: ( rule__RelRea__Group_2_1__0 )
            // InternalCNL.g:2563:3: rule__RelRea__Group_2_1__0
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_2_1__0();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__RelRea__Group_2__1__Impl"


    // $ANTLR start "rule__RelRea__Group_2_1__0"
    // InternalCNL.g:2572:1: rule__RelRea__Group_2_1__0 : rule__RelRea__Group_2_1__0__Impl rule__RelRea__Group_2_1__1 ;
    public final void rule__RelRea__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2576:1: ( rule__RelRea__Group_2_1__0__Impl rule__RelRea__Group_2_1__1 )
            // InternalCNL.g:2577:2: rule__RelRea__Group_2_1__0__Impl rule__RelRea__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__RelRea__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_2_1__0"


    // $ANTLR start "rule__RelRea__Group_2_1__0__Impl"
    // InternalCNL.g:2584:1: rule__RelRea__Group_2_1__0__Impl : ( ( rule__RelRea__ReactionAssignment_2_1_0 ) ) ;
    public final void rule__RelRea__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2588:1: ( ( ( rule__RelRea__ReactionAssignment_2_1_0 ) ) )
            // InternalCNL.g:2589:1: ( ( rule__RelRea__ReactionAssignment_2_1_0 ) )
            {
            // InternalCNL.g:2589:1: ( ( rule__RelRea__ReactionAssignment_2_1_0 ) )
            // InternalCNL.g:2590:2: ( rule__RelRea__ReactionAssignment_2_1_0 )
            {
             before(grammarAccess.getRelReaAccess().getReactionAssignment_2_1_0()); 
            // InternalCNL.g:2591:2: ( rule__RelRea__ReactionAssignment_2_1_0 )
            // InternalCNL.g:2591:3: rule__RelRea__ReactionAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__ReactionAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getReactionAssignment_2_1_0()); 

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
    // $ANTLR end "rule__RelRea__Group_2_1__0__Impl"


    // $ANTLR start "rule__RelRea__Group_2_1__1"
    // InternalCNL.g:2599:1: rule__RelRea__Group_2_1__1 : rule__RelRea__Group_2_1__1__Impl ;
    public final void rule__RelRea__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2603:1: ( rule__RelRea__Group_2_1__1__Impl )
            // InternalCNL.g:2604:2: rule__RelRea__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_2_1__1"


    // $ANTLR start "rule__RelRea__Group_2_1__1__Impl"
    // InternalCNL.g:2610:1: rule__RelRea__Group_2_1__1__Impl : ( ( rule__RelRea__Group_2_1_1__0 )? ) ;
    public final void rule__RelRea__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2614:1: ( ( ( rule__RelRea__Group_2_1_1__0 )? ) )
            // InternalCNL.g:2615:1: ( ( rule__RelRea__Group_2_1_1__0 )? )
            {
            // InternalCNL.g:2615:1: ( ( rule__RelRea__Group_2_1_1__0 )? )
            // InternalCNL.g:2616:2: ( rule__RelRea__Group_2_1_1__0 )?
            {
             before(grammarAccess.getRelReaAccess().getGroup_2_1_1()); 
            // InternalCNL.g:2617:2: ( rule__RelRea__Group_2_1_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCNL.g:2617:3: rule__RelRea__Group_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelRea__Group_2_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelReaAccess().getGroup_2_1_1()); 

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
    // $ANTLR end "rule__RelRea__Group_2_1__1__Impl"


    // $ANTLR start "rule__RelRea__Group_2_1_1__0"
    // InternalCNL.g:2626:1: rule__RelRea__Group_2_1_1__0 : rule__RelRea__Group_2_1_1__0__Impl rule__RelRea__Group_2_1_1__1 ;
    public final void rule__RelRea__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2630:1: ( rule__RelRea__Group_2_1_1__0__Impl rule__RelRea__Group_2_1_1__1 )
            // InternalCNL.g:2631:2: rule__RelRea__Group_2_1_1__0__Impl rule__RelRea__Group_2_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__RelRea__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_2_1_1__0"


    // $ANTLR start "rule__RelRea__Group_2_1_1__0__Impl"
    // InternalCNL.g:2638:1: rule__RelRea__Group_2_1_1__0__Impl : ( ruleComma ) ;
    public final void rule__RelRea__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2642:1: ( ( ruleComma ) )
            // InternalCNL.g:2643:1: ( ruleComma )
            {
            // InternalCNL.g:2643:1: ( ruleComma )
            // InternalCNL.g:2644:2: ruleComma
            {
             before(grammarAccess.getRelReaAccess().getCommaParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComma();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getCommaParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__RelRea__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__RelRea__Group_2_1_1__1"
    // InternalCNL.g:2653:1: rule__RelRea__Group_2_1_1__1 : rule__RelRea__Group_2_1_1__1__Impl ;
    public final void rule__RelRea__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2657:1: ( rule__RelRea__Group_2_1_1__1__Impl )
            // InternalCNL.g:2658:2: rule__RelRea__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_2_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_2_1_1__1"


    // $ANTLR start "rule__RelRea__Group_2_1_1__1__Impl"
    // InternalCNL.g:2664:1: rule__RelRea__Group_2_1_1__1__Impl : ( ( rule__RelRea__Delay_finalAssignment_2_1_1_1 ) ) ;
    public final void rule__RelRea__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2668:1: ( ( ( rule__RelRea__Delay_finalAssignment_2_1_1_1 ) ) )
            // InternalCNL.g:2669:1: ( ( rule__RelRea__Delay_finalAssignment_2_1_1_1 ) )
            {
            // InternalCNL.g:2669:1: ( ( rule__RelRea__Delay_finalAssignment_2_1_1_1 ) )
            // InternalCNL.g:2670:2: ( rule__RelRea__Delay_finalAssignment_2_1_1_1 )
            {
             before(grammarAccess.getRelReaAccess().getDelay_finalAssignment_2_1_1_1()); 
            // InternalCNL.g:2671:2: ( rule__RelRea__Delay_finalAssignment_2_1_1_1 )
            // InternalCNL.g:2671:3: rule__RelRea__Delay_finalAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Delay_finalAssignment_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getDelay_finalAssignment_2_1_1_1()); 

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
    // $ANTLR end "rule__RelRea__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__RelRea__Group_3__0"
    // InternalCNL.g:2680:1: rule__RelRea__Group_3__0 : rule__RelRea__Group_3__0__Impl rule__RelRea__Group_3__1 ;
    public final void rule__RelRea__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2684:1: ( rule__RelRea__Group_3__0__Impl rule__RelRea__Group_3__1 )
            // InternalCNL.g:2685:2: rule__RelRea__Group_3__0__Impl rule__RelRea__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__RelRea__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_3__0"


    // $ANTLR start "rule__RelRea__Group_3__0__Impl"
    // InternalCNL.g:2692:1: rule__RelRea__Group_3__0__Impl : ( () ) ;
    public final void rule__RelRea__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2696:1: ( ( () ) )
            // InternalCNL.g:2697:1: ( () )
            {
            // InternalCNL.g:2697:1: ( () )
            // InternalCNL.g:2698:2: ()
            {
             before(grammarAccess.getRelReaAccess().getReaAction_3_0()); 
            // InternalCNL.g:2699:2: ()
            // InternalCNL.g:2699:3: 
            {
            }

             after(grammarAccess.getRelReaAccess().getReaAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_3__0__Impl"


    // $ANTLR start "rule__RelRea__Group_3__1"
    // InternalCNL.g:2707:1: rule__RelRea__Group_3__1 : rule__RelRea__Group_3__1__Impl ;
    public final void rule__RelRea__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2711:1: ( rule__RelRea__Group_3__1__Impl )
            // InternalCNL.g:2712:2: rule__RelRea__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_3__1"


    // $ANTLR start "rule__RelRea__Group_3__1__Impl"
    // InternalCNL.g:2718:1: rule__RelRea__Group_3__1__Impl : ( ( rule__RelRea__Group_3_1__0 ) ) ;
    public final void rule__RelRea__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2722:1: ( ( ( rule__RelRea__Group_3_1__0 ) ) )
            // InternalCNL.g:2723:1: ( ( rule__RelRea__Group_3_1__0 ) )
            {
            // InternalCNL.g:2723:1: ( ( rule__RelRea__Group_3_1__0 ) )
            // InternalCNL.g:2724:2: ( rule__RelRea__Group_3_1__0 )
            {
             before(grammarAccess.getRelReaAccess().getGroup_3_1()); 
            // InternalCNL.g:2725:2: ( rule__RelRea__Group_3_1__0 )
            // InternalCNL.g:2725:3: rule__RelRea__Group_3_1__0
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_3_1__0();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__RelRea__Group_3__1__Impl"


    // $ANTLR start "rule__RelRea__Group_3_1__0"
    // InternalCNL.g:2734:1: rule__RelRea__Group_3_1__0 : rule__RelRea__Group_3_1__0__Impl rule__RelRea__Group_3_1__1 ;
    public final void rule__RelRea__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2738:1: ( rule__RelRea__Group_3_1__0__Impl rule__RelRea__Group_3_1__1 )
            // InternalCNL.g:2739:2: rule__RelRea__Group_3_1__0__Impl rule__RelRea__Group_3_1__1
            {
            pushFollow(FOLLOW_20);
            rule__RelRea__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_3_1__0"


    // $ANTLR start "rule__RelRea__Group_3_1__0__Impl"
    // InternalCNL.g:2746:1: rule__RelRea__Group_3_1__0__Impl : ( 'Reaction' ) ;
    public final void rule__RelRea__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2750:1: ( ( 'Reaction' ) )
            // InternalCNL.g:2751:1: ( 'Reaction' )
            {
            // InternalCNL.g:2751:1: ( 'Reaction' )
            // InternalCNL.g:2752:2: 'Reaction'
            {
             before(grammarAccess.getRelReaAccess().getReactionKeyword_3_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getRelReaAccess().getReactionKeyword_3_1_0()); 

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
    // $ANTLR end "rule__RelRea__Group_3_1__0__Impl"


    // $ANTLR start "rule__RelRea__Group_3_1__1"
    // InternalCNL.g:2761:1: rule__RelRea__Group_3_1__1 : rule__RelRea__Group_3_1__1__Impl rule__RelRea__Group_3_1__2 ;
    public final void rule__RelRea__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2765:1: ( rule__RelRea__Group_3_1__1__Impl rule__RelRea__Group_3_1__2 )
            // InternalCNL.g:2766:2: rule__RelRea__Group_3_1__1__Impl rule__RelRea__Group_3_1__2
            {
            pushFollow(FOLLOW_17);
            rule__RelRea__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_3_1__1"


    // $ANTLR start "rule__RelRea__Group_3_1__1__Impl"
    // InternalCNL.g:2773:1: rule__RelRea__Group_3_1__1__Impl : ( 'is' ) ;
    public final void rule__RelRea__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2777:1: ( ( 'is' ) )
            // InternalCNL.g:2778:1: ( 'is' )
            {
            // InternalCNL.g:2778:1: ( 'is' )
            // InternalCNL.g:2779:2: 'is'
            {
             before(grammarAccess.getRelReaAccess().getIsKeyword_3_1_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getRelReaAccess().getIsKeyword_3_1_1()); 

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
    // $ANTLR end "rule__RelRea__Group_3_1__1__Impl"


    // $ANTLR start "rule__RelRea__Group_3_1__2"
    // InternalCNL.g:2788:1: rule__RelRea__Group_3_1__2 : rule__RelRea__Group_3_1__2__Impl rule__RelRea__Group_3_1__3 ;
    public final void rule__RelRea__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2792:1: ( rule__RelRea__Group_3_1__2__Impl rule__RelRea__Group_3_1__3 )
            // InternalCNL.g:2793:2: rule__RelRea__Group_3_1__2__Impl rule__RelRea__Group_3_1__3
            {
            pushFollow(FOLLOW_5);
            rule__RelRea__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_3_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_3_1__2"


    // $ANTLR start "rule__RelRea__Group_3_1__2__Impl"
    // InternalCNL.g:2800:1: rule__RelRea__Group_3_1__2__Impl : ( 'always' ) ;
    public final void rule__RelRea__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2804:1: ( ( 'always' ) )
            // InternalCNL.g:2805:1: ( 'always' )
            {
            // InternalCNL.g:2805:1: ( 'always' )
            // InternalCNL.g:2806:2: 'always'
            {
             before(grammarAccess.getRelReaAccess().getAlwaysKeyword_3_1_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getRelReaAccess().getAlwaysKeyword_3_1_2()); 

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
    // $ANTLR end "rule__RelRea__Group_3_1__2__Impl"


    // $ANTLR start "rule__RelRea__Group_3_1__3"
    // InternalCNL.g:2815:1: rule__RelRea__Group_3_1__3 : rule__RelRea__Group_3_1__3__Impl rule__RelRea__Group_3_1__4 ;
    public final void rule__RelRea__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2819:1: ( rule__RelRea__Group_3_1__3__Impl rule__RelRea__Group_3_1__4 )
            // InternalCNL.g:2820:2: rule__RelRea__Group_3_1__3__Impl rule__RelRea__Group_3_1__4
            {
            pushFollow(FOLLOW_10);
            rule__RelRea__Group_3_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_3_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_3_1__3"


    // $ANTLR start "rule__RelRea__Group_3_1__3__Impl"
    // InternalCNL.g:2827:1: rule__RelRea__Group_3_1__3__Impl : ( ( rule__RelRea__ReaAssignment_3_1_3 ) ) ;
    public final void rule__RelRea__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2831:1: ( ( ( rule__RelRea__ReaAssignment_3_1_3 ) ) )
            // InternalCNL.g:2832:1: ( ( rule__RelRea__ReaAssignment_3_1_3 ) )
            {
            // InternalCNL.g:2832:1: ( ( rule__RelRea__ReaAssignment_3_1_3 ) )
            // InternalCNL.g:2833:2: ( rule__RelRea__ReaAssignment_3_1_3 )
            {
             before(grammarAccess.getRelReaAccess().getReaAssignment_3_1_3()); 
            // InternalCNL.g:2834:2: ( rule__RelRea__ReaAssignment_3_1_3 )
            // InternalCNL.g:2834:3: rule__RelRea__ReaAssignment_3_1_3
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__ReaAssignment_3_1_3();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getReaAssignment_3_1_3()); 

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
    // $ANTLR end "rule__RelRea__Group_3_1__3__Impl"


    // $ANTLR start "rule__RelRea__Group_3_1__4"
    // InternalCNL.g:2842:1: rule__RelRea__Group_3_1__4 : rule__RelRea__Group_3_1__4__Impl ;
    public final void rule__RelRea__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2846:1: ( rule__RelRea__Group_3_1__4__Impl )
            // InternalCNL.g:2847:2: rule__RelRea__Group_3_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_3_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_3_1__4"


    // $ANTLR start "rule__RelRea__Group_3_1__4__Impl"
    // InternalCNL.g:2853:1: rule__RelRea__Group_3_1__4__Impl : ( ( rule__RelRea__Group_3_1_4__0 )? ) ;
    public final void rule__RelRea__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2857:1: ( ( ( rule__RelRea__Group_3_1_4__0 )? ) )
            // InternalCNL.g:2858:1: ( ( rule__RelRea__Group_3_1_4__0 )? )
            {
            // InternalCNL.g:2858:1: ( ( rule__RelRea__Group_3_1_4__0 )? )
            // InternalCNL.g:2859:2: ( rule__RelRea__Group_3_1_4__0 )?
            {
             before(grammarAccess.getRelReaAccess().getGroup_3_1_4()); 
            // InternalCNL.g:2860:2: ( rule__RelRea__Group_3_1_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCNL.g:2860:3: rule__RelRea__Group_3_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelRea__Group_3_1_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelReaAccess().getGroup_3_1_4()); 

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
    // $ANTLR end "rule__RelRea__Group_3_1__4__Impl"


    // $ANTLR start "rule__RelRea__Group_3_1_4__0"
    // InternalCNL.g:2869:1: rule__RelRea__Group_3_1_4__0 : rule__RelRea__Group_3_1_4__0__Impl rule__RelRea__Group_3_1_4__1 ;
    public final void rule__RelRea__Group_3_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2873:1: ( rule__RelRea__Group_3_1_4__0__Impl rule__RelRea__Group_3_1_4__1 )
            // InternalCNL.g:2874:2: rule__RelRea__Group_3_1_4__0__Impl rule__RelRea__Group_3_1_4__1
            {
            pushFollow(FOLLOW_8);
            rule__RelRea__Group_3_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelRea__Group_3_1_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_3_1_4__0"


    // $ANTLR start "rule__RelRea__Group_3_1_4__0__Impl"
    // InternalCNL.g:2881:1: rule__RelRea__Group_3_1_4__0__Impl : ( ruleComma ) ;
    public final void rule__RelRea__Group_3_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2885:1: ( ( ruleComma ) )
            // InternalCNL.g:2886:1: ( ruleComma )
            {
            // InternalCNL.g:2886:1: ( ruleComma )
            // InternalCNL.g:2887:2: ruleComma
            {
             before(grammarAccess.getRelReaAccess().getCommaParserRuleCall_3_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleComma();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getCommaParserRuleCall_3_1_4_0()); 

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
    // $ANTLR end "rule__RelRea__Group_3_1_4__0__Impl"


    // $ANTLR start "rule__RelRea__Group_3_1_4__1"
    // InternalCNL.g:2896:1: rule__RelRea__Group_3_1_4__1 : rule__RelRea__Group_3_1_4__1__Impl ;
    public final void rule__RelRea__Group_3_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2900:1: ( rule__RelRea__Group_3_1_4__1__Impl )
            // InternalCNL.g:2901:2: rule__RelRea__Group_3_1_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Group_3_1_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelRea__Group_3_1_4__1"


    // $ANTLR start "rule__RelRea__Group_3_1_4__1__Impl"
    // InternalCNL.g:2907:1: rule__RelRea__Group_3_1_4__1__Impl : ( ( rule__RelRea__Delay_finalAssignment_3_1_4_1 ) ) ;
    public final void rule__RelRea__Group_3_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2911:1: ( ( ( rule__RelRea__Delay_finalAssignment_3_1_4_1 ) ) )
            // InternalCNL.g:2912:1: ( ( rule__RelRea__Delay_finalAssignment_3_1_4_1 ) )
            {
            // InternalCNL.g:2912:1: ( ( rule__RelRea__Delay_finalAssignment_3_1_4_1 ) )
            // InternalCNL.g:2913:2: ( rule__RelRea__Delay_finalAssignment_3_1_4_1 )
            {
             before(grammarAccess.getRelReaAccess().getDelay_finalAssignment_3_1_4_1()); 
            // InternalCNL.g:2914:2: ( rule__RelRea__Delay_finalAssignment_3_1_4_1 )
            // InternalCNL.g:2914:3: rule__RelRea__Delay_finalAssignment_3_1_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RelRea__Delay_finalAssignment_3_1_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRelReaAccess().getDelay_finalAssignment_3_1_4_1()); 

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
    // $ANTLR end "rule__RelRea__Group_3_1_4__1__Impl"


    // $ANTLR start "rule__Reaction__Group__0"
    // InternalCNL.g:2923:1: rule__Reaction__Group__0 : rule__Reaction__Group__0__Impl rule__Reaction__Group__1 ;
    public final void rule__Reaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2927:1: ( rule__Reaction__Group__0__Impl rule__Reaction__Group__1 )
            // InternalCNL.g:2928:2: rule__Reaction__Group__0__Impl rule__Reaction__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Reaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reaction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__Group__0"


    // $ANTLR start "rule__Reaction__Group__0__Impl"
    // InternalCNL.g:2935:1: rule__Reaction__Group__0__Impl : ( () ) ;
    public final void rule__Reaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2939:1: ( ( () ) )
            // InternalCNL.g:2940:1: ( () )
            {
            // InternalCNL.g:2940:1: ( () )
            // InternalCNL.g:2941:2: ()
            {
             before(grammarAccess.getReactionAccess().getReaAction_0()); 
            // InternalCNL.g:2942:2: ()
            // InternalCNL.g:2942:3: 
            {
            }

             after(grammarAccess.getReactionAccess().getReaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__Group__0__Impl"


    // $ANTLR start "rule__Reaction__Group__1"
    // InternalCNL.g:2950:1: rule__Reaction__Group__1 : rule__Reaction__Group__1__Impl rule__Reaction__Group__2 ;
    public final void rule__Reaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2954:1: ( rule__Reaction__Group__1__Impl rule__Reaction__Group__2 )
            // InternalCNL.g:2955:2: rule__Reaction__Group__1__Impl rule__Reaction__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Reaction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reaction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__Group__1"


    // $ANTLR start "rule__Reaction__Group__1__Impl"
    // InternalCNL.g:2962:1: rule__Reaction__Group__1__Impl : ( 'reaction' ) ;
    public final void rule__Reaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2966:1: ( ( 'reaction' ) )
            // InternalCNL.g:2967:1: ( 'reaction' )
            {
            // InternalCNL.g:2967:1: ( 'reaction' )
            // InternalCNL.g:2968:2: 'reaction'
            {
             before(grammarAccess.getReactionAccess().getReactionKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getReactionAccess().getReactionKeyword_1()); 

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
    // $ANTLR end "rule__Reaction__Group__1__Impl"


    // $ANTLR start "rule__Reaction__Group__2"
    // InternalCNL.g:2977:1: rule__Reaction__Group__2 : rule__Reaction__Group__2__Impl rule__Reaction__Group__3 ;
    public final void rule__Reaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2981:1: ( rule__Reaction__Group__2__Impl rule__Reaction__Group__3 )
            // InternalCNL.g:2982:2: rule__Reaction__Group__2__Impl rule__Reaction__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Reaction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reaction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__Group__2"


    // $ANTLR start "rule__Reaction__Group__2__Impl"
    // InternalCNL.g:2989:1: rule__Reaction__Group__2__Impl : ( 'is' ) ;
    public final void rule__Reaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:2993:1: ( ( 'is' ) )
            // InternalCNL.g:2994:1: ( 'is' )
            {
            // InternalCNL.g:2994:1: ( 'is' )
            // InternalCNL.g:2995:2: 'is'
            {
             before(grammarAccess.getReactionAccess().getIsKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getReactionAccess().getIsKeyword_2()); 

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
    // $ANTLR end "rule__Reaction__Group__2__Impl"


    // $ANTLR start "rule__Reaction__Group__3"
    // InternalCNL.g:3004:1: rule__Reaction__Group__3 : rule__Reaction__Group__3__Impl ;
    public final void rule__Reaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3008:1: ( rule__Reaction__Group__3__Impl )
            // InternalCNL.g:3009:2: rule__Reaction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reaction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__Group__3"


    // $ANTLR start "rule__Reaction__Group__3__Impl"
    // InternalCNL.g:3015:1: rule__Reaction__Group__3__Impl : ( ( rule__Reaction__ReaAssignment_3 ) ) ;
    public final void rule__Reaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3019:1: ( ( ( rule__Reaction__ReaAssignment_3 ) ) )
            // InternalCNL.g:3020:1: ( ( rule__Reaction__ReaAssignment_3 ) )
            {
            // InternalCNL.g:3020:1: ( ( rule__Reaction__ReaAssignment_3 ) )
            // InternalCNL.g:3021:2: ( rule__Reaction__ReaAssignment_3 )
            {
             before(grammarAccess.getReactionAccess().getReaAssignment_3()); 
            // InternalCNL.g:3022:2: ( rule__Reaction__ReaAssignment_3 )
            // InternalCNL.g:3022:3: rule__Reaction__ReaAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Reaction__ReaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReactionAccess().getReaAssignment_3()); 

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
    // $ANTLR end "rule__Reaction__Group__3__Impl"


    // $ANTLR start "rule__DelFin__Group__0"
    // InternalCNL.g:3031:1: rule__DelFin__Group__0 : rule__DelFin__Group__0__Impl rule__DelFin__Group__1 ;
    public final void rule__DelFin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3035:1: ( rule__DelFin__Group__0__Impl rule__DelFin__Group__1 )
            // InternalCNL.g:3036:2: rule__DelFin__Group__0__Impl rule__DelFin__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__DelFin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelFin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group__0"


    // $ANTLR start "rule__DelFin__Group__0__Impl"
    // InternalCNL.g:3043:1: rule__DelFin__Group__0__Impl : ( () ) ;
    public final void rule__DelFin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3047:1: ( ( () ) )
            // InternalCNL.g:3048:1: ( () )
            {
            // InternalCNL.g:3048:1: ( () )
            // InternalCNL.g:3049:2: ()
            {
             before(grammarAccess.getDelFinAccess().getSentenceAction_0()); 
            // InternalCNL.g:3050:2: ()
            // InternalCNL.g:3050:3: 
            {
            }

             after(grammarAccess.getDelFinAccess().getSentenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group__0__Impl"


    // $ANTLR start "rule__DelFin__Group__1"
    // InternalCNL.g:3058:1: rule__DelFin__Group__1 : rule__DelFin__Group__1__Impl ;
    public final void rule__DelFin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3062:1: ( rule__DelFin__Group__1__Impl )
            // InternalCNL.g:3063:2: rule__DelFin__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group__1"


    // $ANTLR start "rule__DelFin__Group__1__Impl"
    // InternalCNL.g:3069:1: rule__DelFin__Group__1__Impl : ( ( rule__DelFin__Alternatives_1 ) ) ;
    public final void rule__DelFin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3073:1: ( ( ( rule__DelFin__Alternatives_1 ) ) )
            // InternalCNL.g:3074:1: ( ( rule__DelFin__Alternatives_1 ) )
            {
            // InternalCNL.g:3074:1: ( ( rule__DelFin__Alternatives_1 ) )
            // InternalCNL.g:3075:2: ( rule__DelFin__Alternatives_1 )
            {
             before(grammarAccess.getDelFinAccess().getAlternatives_1()); 
            // InternalCNL.g:3076:2: ( rule__DelFin__Alternatives_1 )
            // InternalCNL.g:3076:3: rule__DelFin__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDelFinAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__DelFin__Group__1__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0__0"
    // InternalCNL.g:3085:1: rule__DelFin__Group_1_0__0 : rule__DelFin__Group_1_0__0__Impl rule__DelFin__Group_1_0__1 ;
    public final void rule__DelFin__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3089:1: ( rule__DelFin__Group_1_0__0__Impl rule__DelFin__Group_1_0__1 )
            // InternalCNL.g:3090:2: rule__DelFin__Group_1_0__0__Impl rule__DelFin__Group_1_0__1
            {
            pushFollow(FOLLOW_21);
            rule__DelFin__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0__0"


    // $ANTLR start "rule__DelFin__Group_1_0__0__Impl"
    // InternalCNL.g:3097:1: rule__DelFin__Group_1_0__0__Impl : ( ( rule__DelFin__Group_1_0_0__0 ) ) ;
    public final void rule__DelFin__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3101:1: ( ( ( rule__DelFin__Group_1_0_0__0 ) ) )
            // InternalCNL.g:3102:1: ( ( rule__DelFin__Group_1_0_0__0 ) )
            {
            // InternalCNL.g:3102:1: ( ( rule__DelFin__Group_1_0_0__0 ) )
            // InternalCNL.g:3103:2: ( rule__DelFin__Group_1_0_0__0 )
            {
             before(grammarAccess.getDelFinAccess().getGroup_1_0_0()); 
            // InternalCNL.g:3104:2: ( rule__DelFin__Group_1_0_0__0 )
            // InternalCNL.g:3104:3: rule__DelFin__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_0__0();

            state._fsp--;


            }

             after(grammarAccess.getDelFinAccess().getGroup_1_0_0()); 

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
    // $ANTLR end "rule__DelFin__Group_1_0__0__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0__1"
    // InternalCNL.g:3112:1: rule__DelFin__Group_1_0__1 : rule__DelFin__Group_1_0__1__Impl ;
    public final void rule__DelFin__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3116:1: ( rule__DelFin__Group_1_0__1__Impl )
            // InternalCNL.g:3117:2: rule__DelFin__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0__1"


    // $ANTLR start "rule__DelFin__Group_1_0__1__Impl"
    // InternalCNL.g:3123:1: rule__DelFin__Group_1_0__1__Impl : ( ( rule__DelFin__Alternatives_1_0_1 ) ) ;
    public final void rule__DelFin__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3127:1: ( ( ( rule__DelFin__Alternatives_1_0_1 ) ) )
            // InternalCNL.g:3128:1: ( ( rule__DelFin__Alternatives_1_0_1 ) )
            {
            // InternalCNL.g:3128:1: ( ( rule__DelFin__Alternatives_1_0_1 ) )
            // InternalCNL.g:3129:2: ( rule__DelFin__Alternatives_1_0_1 )
            {
             before(grammarAccess.getDelFinAccess().getAlternatives_1_0_1()); 
            // InternalCNL.g:3130:2: ( rule__DelFin__Alternatives_1_0_1 )
            // InternalCNL.g:3130:3: rule__DelFin__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__Alternatives_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDelFinAccess().getAlternatives_1_0_1()); 

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
    // $ANTLR end "rule__DelFin__Group_1_0__1__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0_0__0"
    // InternalCNL.g:3139:1: rule__DelFin__Group_1_0_0__0 : rule__DelFin__Group_1_0_0__0__Impl rule__DelFin__Group_1_0_0__1 ;
    public final void rule__DelFin__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3143:1: ( rule__DelFin__Group_1_0_0__0__Impl rule__DelFin__Group_1_0_0__1 )
            // InternalCNL.g:3144:2: rule__DelFin__Group_1_0_0__0__Impl rule__DelFin__Group_1_0_0__1
            {
            pushFollow(FOLLOW_22);
            rule__DelFin__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0_0__0"


    // $ANTLR start "rule__DelFin__Group_1_0_0__0__Impl"
    // InternalCNL.g:3151:1: rule__DelFin__Group_1_0_0__0__Impl : ( 'which' ) ;
    public final void rule__DelFin__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3155:1: ( ( 'which' ) )
            // InternalCNL.g:3156:1: ( 'which' )
            {
            // InternalCNL.g:3156:1: ( 'which' )
            // InternalCNL.g:3157:2: 'which'
            {
             before(grammarAccess.getDelFinAccess().getWhichKeyword_1_0_0_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getDelFinAccess().getWhichKeyword_1_0_0_0()); 

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
    // $ANTLR end "rule__DelFin__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0_0__1"
    // InternalCNL.g:3166:1: rule__DelFin__Group_1_0_0__1 : rule__DelFin__Group_1_0_0__1__Impl rule__DelFin__Group_1_0_0__2 ;
    public final void rule__DelFin__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3170:1: ( rule__DelFin__Group_1_0_0__1__Impl rule__DelFin__Group_1_0_0__2 )
            // InternalCNL.g:3171:2: rule__DelFin__Group_1_0_0__1__Impl rule__DelFin__Group_1_0_0__2
            {
            pushFollow(FOLLOW_23);
            rule__DelFin__Group_1_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0_0__1"


    // $ANTLR start "rule__DelFin__Group_1_0_0__1__Impl"
    // InternalCNL.g:3178:1: rule__DelFin__Group_1_0_0__1__Impl : ( 'must' ) ;
    public final void rule__DelFin__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3182:1: ( ( 'must' ) )
            // InternalCNL.g:3183:1: ( 'must' )
            {
            // InternalCNL.g:3183:1: ( 'must' )
            // InternalCNL.g:3184:2: 'must'
            {
             before(grammarAccess.getDelFinAccess().getMustKeyword_1_0_0_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getDelFinAccess().getMustKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__DelFin__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0_0__2"
    // InternalCNL.g:3193:1: rule__DelFin__Group_1_0_0__2 : rule__DelFin__Group_1_0_0__2__Impl ;
    public final void rule__DelFin__Group_1_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3197:1: ( rule__DelFin__Group_1_0_0__2__Impl )
            // InternalCNL.g:3198:2: rule__DelFin__Group_1_0_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0_0__2"


    // $ANTLR start "rule__DelFin__Group_1_0_0__2__Impl"
    // InternalCNL.g:3204:1: rule__DelFin__Group_1_0_0__2__Impl : ( 'occur' ) ;
    public final void rule__DelFin__Group_1_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3208:1: ( ( 'occur' ) )
            // InternalCNL.g:3209:1: ( 'occur' )
            {
            // InternalCNL.g:3209:1: ( 'occur' )
            // InternalCNL.g:3210:2: 'occur'
            {
             before(grammarAccess.getDelFinAccess().getOccurKeyword_1_0_0_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getDelFinAccess().getOccurKeyword_1_0_0_2()); 

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
    // $ANTLR end "rule__DelFin__Group_1_0_0__2__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0_1_0__0"
    // InternalCNL.g:3220:1: rule__DelFin__Group_1_0_1_0__0 : rule__DelFin__Group_1_0_1_0__0__Impl rule__DelFin__Group_1_0_1_0__1 ;
    public final void rule__DelFin__Group_1_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3224:1: ( rule__DelFin__Group_1_0_1_0__0__Impl rule__DelFin__Group_1_0_1_0__1 )
            // InternalCNL.g:3225:2: rule__DelFin__Group_1_0_1_0__0__Impl rule__DelFin__Group_1_0_1_0__1
            {
            pushFollow(FOLLOW_24);
            rule__DelFin__Group_1_0_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0_1_0__0"


    // $ANTLR start "rule__DelFin__Group_1_0_1_0__0__Impl"
    // InternalCNL.g:3232:1: rule__DelFin__Group_1_0_1_0__0__Impl : ( ( rule__DelFin__DelayAssignment_1_0_1_0_0 ) ) ;
    public final void rule__DelFin__Group_1_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3236:1: ( ( ( rule__DelFin__DelayAssignment_1_0_1_0_0 ) ) )
            // InternalCNL.g:3237:1: ( ( rule__DelFin__DelayAssignment_1_0_1_0_0 ) )
            {
            // InternalCNL.g:3237:1: ( ( rule__DelFin__DelayAssignment_1_0_1_0_0 ) )
            // InternalCNL.g:3238:2: ( rule__DelFin__DelayAssignment_1_0_1_0_0 )
            {
             before(grammarAccess.getDelFinAccess().getDelayAssignment_1_0_1_0_0()); 
            // InternalCNL.g:3239:2: ( rule__DelFin__DelayAssignment_1_0_1_0_0 )
            // InternalCNL.g:3239:3: rule__DelFin__DelayAssignment_1_0_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__DelayAssignment_1_0_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDelFinAccess().getDelayAssignment_1_0_1_0_0()); 

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
    // $ANTLR end "rule__DelFin__Group_1_0_1_0__0__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0_1_0__1"
    // InternalCNL.g:3247:1: rule__DelFin__Group_1_0_1_0__1 : rule__DelFin__Group_1_0_1_0__1__Impl ;
    public final void rule__DelFin__Group_1_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3251:1: ( rule__DelFin__Group_1_0_1_0__1__Impl )
            // InternalCNL.g:3252:2: rule__DelFin__Group_1_0_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0_1_0__1"


    // $ANTLR start "rule__DelFin__Group_1_0_1_0__1__Impl"
    // InternalCNL.g:3258:1: rule__DelFin__Group_1_0_1_0__1__Impl : ( ( rule__DelFin__Group_1_0_1_0_1__0 )? ) ;
    public final void rule__DelFin__Group_1_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3262:1: ( ( ( rule__DelFin__Group_1_0_1_0_1__0 )? ) )
            // InternalCNL.g:3263:1: ( ( rule__DelFin__Group_1_0_1_0_1__0 )? )
            {
            // InternalCNL.g:3263:1: ( ( rule__DelFin__Group_1_0_1_0_1__0 )? )
            // InternalCNL.g:3264:2: ( rule__DelFin__Group_1_0_1_0_1__0 )?
            {
             before(grammarAccess.getDelFinAccess().getGroup_1_0_1_0_1()); 
            // InternalCNL.g:3265:2: ( rule__DelFin__Group_1_0_1_0_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==60) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCNL.g:3265:3: rule__DelFin__Group_1_0_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DelFin__Group_1_0_1_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDelFinAccess().getGroup_1_0_1_0_1()); 

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
    // $ANTLR end "rule__DelFin__Group_1_0_1_0__1__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0_1_0_1__0"
    // InternalCNL.g:3274:1: rule__DelFin__Group_1_0_1_0_1__0 : rule__DelFin__Group_1_0_1_0_1__0__Impl rule__DelFin__Group_1_0_1_0_1__1 ;
    public final void rule__DelFin__Group_1_0_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3278:1: ( rule__DelFin__Group_1_0_1_0_1__0__Impl rule__DelFin__Group_1_0_1_0_1__1 )
            // InternalCNL.g:3279:2: rule__DelFin__Group_1_0_1_0_1__0__Impl rule__DelFin__Group_1_0_1_0_1__1
            {
            pushFollow(FOLLOW_5);
            rule__DelFin__Group_1_0_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0_1_0_1__0"


    // $ANTLR start "rule__DelFin__Group_1_0_1_0_1__0__Impl"
    // InternalCNL.g:3286:1: rule__DelFin__Group_1_0_1_0_1__0__Impl : ( 'from' ) ;
    public final void rule__DelFin__Group_1_0_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3290:1: ( ( 'from' ) )
            // InternalCNL.g:3291:1: ( 'from' )
            {
            // InternalCNL.g:3291:1: ( 'from' )
            // InternalCNL.g:3292:2: 'from'
            {
             before(grammarAccess.getDelFinAccess().getFromKeyword_1_0_1_0_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getDelFinAccess().getFromKeyword_1_0_1_0_1_0()); 

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
    // $ANTLR end "rule__DelFin__Group_1_0_1_0_1__0__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0_1_0_1__1"
    // InternalCNL.g:3301:1: rule__DelFin__Group_1_0_1_0_1__1 : rule__DelFin__Group_1_0_1_0_1__1__Impl ;
    public final void rule__DelFin__Group_1_0_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3305:1: ( rule__DelFin__Group_1_0_1_0_1__1__Impl )
            // InternalCNL.g:3306:2: rule__DelFin__Group_1_0_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0_1_0_1__1"


    // $ANTLR start "rule__DelFin__Group_1_0_1_0_1__1__Impl"
    // InternalCNL.g:3312:1: rule__DelFin__Group_1_0_1_0_1__1__Impl : ( ( rule__DelFin__FinAssignment_1_0_1_0_1_1 ) ) ;
    public final void rule__DelFin__Group_1_0_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3316:1: ( ( ( rule__DelFin__FinAssignment_1_0_1_0_1_1 ) ) )
            // InternalCNL.g:3317:1: ( ( rule__DelFin__FinAssignment_1_0_1_0_1_1 ) )
            {
            // InternalCNL.g:3317:1: ( ( rule__DelFin__FinAssignment_1_0_1_0_1_1 ) )
            // InternalCNL.g:3318:2: ( rule__DelFin__FinAssignment_1_0_1_0_1_1 )
            {
             before(grammarAccess.getDelFinAccess().getFinAssignment_1_0_1_0_1_1()); 
            // InternalCNL.g:3319:2: ( rule__DelFin__FinAssignment_1_0_1_0_1_1 )
            // InternalCNL.g:3319:3: rule__DelFin__FinAssignment_1_0_1_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__FinAssignment_1_0_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDelFinAccess().getFinAssignment_1_0_1_0_1_1()); 

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
    // $ANTLR end "rule__DelFin__Group_1_0_1_0_1__1__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0_1_1__0"
    // InternalCNL.g:3328:1: rule__DelFin__Group_1_0_1_1__0 : rule__DelFin__Group_1_0_1_1__0__Impl rule__DelFin__Group_1_0_1_1__1 ;
    public final void rule__DelFin__Group_1_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3332:1: ( rule__DelFin__Group_1_0_1_1__0__Impl rule__DelFin__Group_1_0_1_1__1 )
            // InternalCNL.g:3333:2: rule__DelFin__Group_1_0_1_1__0__Impl rule__DelFin__Group_1_0_1_1__1
            {
            pushFollow(FOLLOW_21);
            rule__DelFin__Group_1_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0_1_1__0"


    // $ANTLR start "rule__DelFin__Group_1_0_1_1__0__Impl"
    // InternalCNL.g:3340:1: rule__DelFin__Group_1_0_1_1__0__Impl : ( ( 'immediately' )? ) ;
    public final void rule__DelFin__Group_1_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3344:1: ( ( ( 'immediately' )? ) )
            // InternalCNL.g:3345:1: ( ( 'immediately' )? )
            {
            // InternalCNL.g:3345:1: ( ( 'immediately' )? )
            // InternalCNL.g:3346:2: ( 'immediately' )?
            {
             before(grammarAccess.getDelFinAccess().getImmediatelyKeyword_1_0_1_1_0()); 
            // InternalCNL.g:3347:2: ( 'immediately' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==61) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCNL.g:3347:3: 'immediately'
                    {
                    match(input,61,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDelFinAccess().getImmediatelyKeyword_1_0_1_1_0()); 

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
    // $ANTLR end "rule__DelFin__Group_1_0_1_1__0__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0_1_1__1"
    // InternalCNL.g:3355:1: rule__DelFin__Group_1_0_1_1__1 : rule__DelFin__Group_1_0_1_1__1__Impl rule__DelFin__Group_1_0_1_1__2 ;
    public final void rule__DelFin__Group_1_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3359:1: ( rule__DelFin__Group_1_0_1_1__1__Impl rule__DelFin__Group_1_0_1_1__2 )
            // InternalCNL.g:3360:2: rule__DelFin__Group_1_0_1_1__1__Impl rule__DelFin__Group_1_0_1_1__2
            {
            pushFollow(FOLLOW_5);
            rule__DelFin__Group_1_0_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0_1_1__1"


    // $ANTLR start "rule__DelFin__Group_1_0_1_1__1__Impl"
    // InternalCNL.g:3367:1: rule__DelFin__Group_1_0_1_1__1__Impl : ( 'after' ) ;
    public final void rule__DelFin__Group_1_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3371:1: ( ( 'after' ) )
            // InternalCNL.g:3372:1: ( 'after' )
            {
            // InternalCNL.g:3372:1: ( 'after' )
            // InternalCNL.g:3373:2: 'after'
            {
             before(grammarAccess.getDelFinAccess().getAfterKeyword_1_0_1_1_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getDelFinAccess().getAfterKeyword_1_0_1_1_1()); 

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
    // $ANTLR end "rule__DelFin__Group_1_0_1_1__1__Impl"


    // $ANTLR start "rule__DelFin__Group_1_0_1_1__2"
    // InternalCNL.g:3382:1: rule__DelFin__Group_1_0_1_1__2 : rule__DelFin__Group_1_0_1_1__2__Impl ;
    public final void rule__DelFin__Group_1_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3386:1: ( rule__DelFin__Group_1_0_1_1__2__Impl )
            // InternalCNL.g:3387:2: rule__DelFin__Group_1_0_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__Group_1_0_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelFin__Group_1_0_1_1__2"


    // $ANTLR start "rule__DelFin__Group_1_0_1_1__2__Impl"
    // InternalCNL.g:3393:1: rule__DelFin__Group_1_0_1_1__2__Impl : ( ( rule__DelFin__FinAssignment_1_0_1_1_2 ) ) ;
    public final void rule__DelFin__Group_1_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3397:1: ( ( ( rule__DelFin__FinAssignment_1_0_1_1_2 ) ) )
            // InternalCNL.g:3398:1: ( ( rule__DelFin__FinAssignment_1_0_1_1_2 ) )
            {
            // InternalCNL.g:3398:1: ( ( rule__DelFin__FinAssignment_1_0_1_1_2 ) )
            // InternalCNL.g:3399:2: ( rule__DelFin__FinAssignment_1_0_1_1_2 )
            {
             before(grammarAccess.getDelFinAccess().getFinAssignment_1_0_1_1_2()); 
            // InternalCNL.g:3400:2: ( rule__DelFin__FinAssignment_1_0_1_1_2 )
            // InternalCNL.g:3400:3: rule__DelFin__FinAssignment_1_0_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__DelFin__FinAssignment_1_0_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDelFinAccess().getFinAssignment_1_0_1_1_2()); 

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
    // $ANTLR end "rule__DelFin__Group_1_0_1_1__2__Impl"


    // $ANTLR start "rule__Delay__Group__0"
    // InternalCNL.g:3409:1: rule__Delay__Group__0 : rule__Delay__Group__0__Impl rule__Delay__Group__1 ;
    public final void rule__Delay__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3413:1: ( rule__Delay__Group__0__Impl rule__Delay__Group__1 )
            // InternalCNL.g:3414:2: rule__Delay__Group__0__Impl rule__Delay__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Delay__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delay__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delay__Group__0"


    // $ANTLR start "rule__Delay__Group__0__Impl"
    // InternalCNL.g:3421:1: rule__Delay__Group__0__Impl : ( 'within' ) ;
    public final void rule__Delay__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3425:1: ( ( 'within' ) )
            // InternalCNL.g:3426:1: ( 'within' )
            {
            // InternalCNL.g:3426:1: ( 'within' )
            // InternalCNL.g:3427:2: 'within'
            {
             before(grammarAccess.getDelayAccess().getWithinKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getDelayAccess().getWithinKeyword_0()); 

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
    // $ANTLR end "rule__Delay__Group__0__Impl"


    // $ANTLR start "rule__Delay__Group__1"
    // InternalCNL.g:3436:1: rule__Delay__Group__1 : rule__Delay__Group__1__Impl rule__Delay__Group__2 ;
    public final void rule__Delay__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3440:1: ( rule__Delay__Group__1__Impl rule__Delay__Group__2 )
            // InternalCNL.g:3441:2: rule__Delay__Group__1__Impl rule__Delay__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Delay__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delay__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delay__Group__1"


    // $ANTLR start "rule__Delay__Group__1__Impl"
    // InternalCNL.g:3448:1: rule__Delay__Group__1__Impl : ( () ) ;
    public final void rule__Delay__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3452:1: ( ( () ) )
            // InternalCNL.g:3453:1: ( () )
            {
            // InternalCNL.g:3453:1: ( () )
            // InternalCNL.g:3454:2: ()
            {
             before(grammarAccess.getDelayAccess().getDelAction_1()); 
            // InternalCNL.g:3455:2: ()
            // InternalCNL.g:3455:3: 
            {
            }

             after(grammarAccess.getDelayAccess().getDelAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delay__Group__1__Impl"


    // $ANTLR start "rule__Delay__Group__2"
    // InternalCNL.g:3463:1: rule__Delay__Group__2 : rule__Delay__Group__2__Impl ;
    public final void rule__Delay__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3467:1: ( rule__Delay__Group__2__Impl )
            // InternalCNL.g:3468:2: rule__Delay__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delay__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delay__Group__2"


    // $ANTLR start "rule__Delay__Group__2__Impl"
    // InternalCNL.g:3474:1: rule__Delay__Group__2__Impl : ( ( rule__Delay__DelAssignment_2 ) ) ;
    public final void rule__Delay__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3478:1: ( ( ( rule__Delay__DelAssignment_2 ) ) )
            // InternalCNL.g:3479:1: ( ( rule__Delay__DelAssignment_2 ) )
            {
            // InternalCNL.g:3479:1: ( ( rule__Delay__DelAssignment_2 ) )
            // InternalCNL.g:3480:2: ( rule__Delay__DelAssignment_2 )
            {
             before(grammarAccess.getDelayAccess().getDelAssignment_2()); 
            // InternalCNL.g:3481:2: ( rule__Delay__DelAssignment_2 )
            // InternalCNL.g:3481:3: rule__Delay__DelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Delay__DelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDelayAccess().getDelAssignment_2()); 

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
    // $ANTLR end "rule__Delay__Group__2__Impl"


    // $ANTLR start "rule__Sentence__Group__0"
    // InternalCNL.g:3490:1: rule__Sentence__Group__0 : rule__Sentence__Group__0__Impl rule__Sentence__Group__1 ;
    public final void rule__Sentence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3494:1: ( rule__Sentence__Group__0__Impl rule__Sentence__Group__1 )
            // InternalCNL.g:3495:2: rule__Sentence__Group__0__Impl rule__Sentence__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Sentence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sentence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__0"


    // $ANTLR start "rule__Sentence__Group__0__Impl"
    // InternalCNL.g:3502:1: rule__Sentence__Group__0__Impl : ( () ) ;
    public final void rule__Sentence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3506:1: ( ( () ) )
            // InternalCNL.g:3507:1: ( () )
            {
            // InternalCNL.g:3507:1: ( () )
            // InternalCNL.g:3508:2: ()
            {
             before(grammarAccess.getSentenceAccess().getSentenceAction_0()); 
            // InternalCNL.g:3509:2: ()
            // InternalCNL.g:3509:3: 
            {
            }

             after(grammarAccess.getSentenceAccess().getSentenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__0__Impl"


    // $ANTLR start "rule__Sentence__Group__1"
    // InternalCNL.g:3517:1: rule__Sentence__Group__1 : rule__Sentence__Group__1__Impl ;
    public final void rule__Sentence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3521:1: ( rule__Sentence__Group__1__Impl )
            // InternalCNL.g:3522:2: rule__Sentence__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sentence__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Group__1"


    // $ANTLR start "rule__Sentence__Group__1__Impl"
    // InternalCNL.g:3528:1: rule__Sentence__Group__1__Impl : ( ( rule__Sentence__NameAssignment_1 ) ) ;
    public final void rule__Sentence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3532:1: ( ( ( rule__Sentence__NameAssignment_1 ) ) )
            // InternalCNL.g:3533:1: ( ( rule__Sentence__NameAssignment_1 ) )
            {
            // InternalCNL.g:3533:1: ( ( rule__Sentence__NameAssignment_1 ) )
            // InternalCNL.g:3534:2: ( rule__Sentence__NameAssignment_1 )
            {
             before(grammarAccess.getSentenceAccess().getNameAssignment_1()); 
            // InternalCNL.g:3535:2: ( rule__Sentence__NameAssignment_1 )
            // InternalCNL.g:3535:3: rule__Sentence__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sentence__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Sentence__Group__1__Impl"


    // $ANTLR start "rule__ID_or_INTEGER__Group__0"
    // InternalCNL.g:3544:1: rule__ID_or_INTEGER__Group__0 : rule__ID_or_INTEGER__Group__0__Impl rule__ID_or_INTEGER__Group__1 ;
    public final void rule__ID_or_INTEGER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3548:1: ( rule__ID_or_INTEGER__Group__0__Impl rule__ID_or_INTEGER__Group__1 )
            // InternalCNL.g:3549:2: rule__ID_or_INTEGER__Group__0__Impl rule__ID_or_INTEGER__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ID_or_INTEGER__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ID_or_INTEGER__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ID_or_INTEGER__Group__0"


    // $ANTLR start "rule__ID_or_INTEGER__Group__0__Impl"
    // InternalCNL.g:3556:1: rule__ID_or_INTEGER__Group__0__Impl : ( '\"' ) ;
    public final void rule__ID_or_INTEGER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3560:1: ( ( '\"' ) )
            // InternalCNL.g:3561:1: ( '\"' )
            {
            // InternalCNL.g:3561:1: ( '\"' )
            // InternalCNL.g:3562:2: '\"'
            {
             before(grammarAccess.getID_or_INTEGERAccess().getQuotationMarkKeyword_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getID_or_INTEGERAccess().getQuotationMarkKeyword_0()); 

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
    // $ANTLR end "rule__ID_or_INTEGER__Group__0__Impl"


    // $ANTLR start "rule__ID_or_INTEGER__Group__1"
    // InternalCNL.g:3571:1: rule__ID_or_INTEGER__Group__1 : rule__ID_or_INTEGER__Group__1__Impl rule__ID_or_INTEGER__Group__2 ;
    public final void rule__ID_or_INTEGER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3575:1: ( rule__ID_or_INTEGER__Group__1__Impl rule__ID_or_INTEGER__Group__2 )
            // InternalCNL.g:3576:2: rule__ID_or_INTEGER__Group__1__Impl rule__ID_or_INTEGER__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__ID_or_INTEGER__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ID_or_INTEGER__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ID_or_INTEGER__Group__1"


    // $ANTLR start "rule__ID_or_INTEGER__Group__1__Impl"
    // InternalCNL.g:3583:1: rule__ID_or_INTEGER__Group__1__Impl : ( ( ( rule__ID_or_INTEGER__Alternatives_1 ) ) ( ( rule__ID_or_INTEGER__Alternatives_1 )* ) ) ;
    public final void rule__ID_or_INTEGER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3587:1: ( ( ( ( rule__ID_or_INTEGER__Alternatives_1 ) ) ( ( rule__ID_or_INTEGER__Alternatives_1 )* ) ) )
            // InternalCNL.g:3588:1: ( ( ( rule__ID_or_INTEGER__Alternatives_1 ) ) ( ( rule__ID_or_INTEGER__Alternatives_1 )* ) )
            {
            // InternalCNL.g:3588:1: ( ( ( rule__ID_or_INTEGER__Alternatives_1 ) ) ( ( rule__ID_or_INTEGER__Alternatives_1 )* ) )
            // InternalCNL.g:3589:2: ( ( rule__ID_or_INTEGER__Alternatives_1 ) ) ( ( rule__ID_or_INTEGER__Alternatives_1 )* )
            {
            // InternalCNL.g:3589:2: ( ( rule__ID_or_INTEGER__Alternatives_1 ) )
            // InternalCNL.g:3590:3: ( rule__ID_or_INTEGER__Alternatives_1 )
            {
             before(grammarAccess.getID_or_INTEGERAccess().getAlternatives_1()); 
            // InternalCNL.g:3591:3: ( rule__ID_or_INTEGER__Alternatives_1 )
            // InternalCNL.g:3591:4: rule__ID_or_INTEGER__Alternatives_1
            {
            pushFollow(FOLLOW_27);
            rule__ID_or_INTEGER__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getID_or_INTEGERAccess().getAlternatives_1()); 

            }

            // InternalCNL.g:3594:2: ( ( rule__ID_or_INTEGER__Alternatives_1 )* )
            // InternalCNL.g:3595:3: ( rule__ID_or_INTEGER__Alternatives_1 )*
            {
             before(grammarAccess.getID_or_INTEGERAccess().getAlternatives_1()); 
            // InternalCNL.g:3596:3: ( rule__ID_or_INTEGER__Alternatives_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_INTEGER)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCNL.g:3596:4: rule__ID_or_INTEGER__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__ID_or_INTEGER__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getID_or_INTEGERAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__ID_or_INTEGER__Group__1__Impl"


    // $ANTLR start "rule__ID_or_INTEGER__Group__2"
    // InternalCNL.g:3605:1: rule__ID_or_INTEGER__Group__2 : rule__ID_or_INTEGER__Group__2__Impl ;
    public final void rule__ID_or_INTEGER__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3609:1: ( rule__ID_or_INTEGER__Group__2__Impl )
            // InternalCNL.g:3610:2: rule__ID_or_INTEGER__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ID_or_INTEGER__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ID_or_INTEGER__Group__2"


    // $ANTLR start "rule__ID_or_INTEGER__Group__2__Impl"
    // InternalCNL.g:3616:1: rule__ID_or_INTEGER__Group__2__Impl : ( '\"' ) ;
    public final void rule__ID_or_INTEGER__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3620:1: ( ( '\"' ) )
            // InternalCNL.g:3621:1: ( '\"' )
            {
            // InternalCNL.g:3621:1: ( '\"' )
            // InternalCNL.g:3622:2: '\"'
            {
             before(grammarAccess.getID_or_INTEGERAccess().getQuotationMarkKeyword_2()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getID_or_INTEGERAccess().getQuotationMarkKeyword_2()); 

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
    // $ANTLR end "rule__ID_or_INTEGER__Group__2__Impl"


    // $ANTLR start "rule__DeclVarInput__Group__0"
    // InternalCNL.g:3632:1: rule__DeclVarInput__Group__0 : rule__DeclVarInput__Group__0__Impl rule__DeclVarInput__Group__1 ;
    public final void rule__DeclVarInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3636:1: ( rule__DeclVarInput__Group__0__Impl rule__DeclVarInput__Group__1 )
            // InternalCNL.g:3637:2: rule__DeclVarInput__Group__0__Impl rule__DeclVarInput__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__DeclVarInput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclVarInput__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarInput__Group__0"


    // $ANTLR start "rule__DeclVarInput__Group__0__Impl"
    // InternalCNL.g:3644:1: rule__DeclVarInput__Group__0__Impl : ( () ) ;
    public final void rule__DeclVarInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3648:1: ( ( () ) )
            // InternalCNL.g:3649:1: ( () )
            {
            // InternalCNL.g:3649:1: ( () )
            // InternalCNL.g:3650:2: ()
            {
             before(grammarAccess.getDeclVarInputAccess().getDeclVarInputAction_0()); 
            // InternalCNL.g:3651:2: ()
            // InternalCNL.g:3651:3: 
            {
            }

             after(grammarAccess.getDeclVarInputAccess().getDeclVarInputAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarInput__Group__0__Impl"


    // $ANTLR start "rule__DeclVarInput__Group__1"
    // InternalCNL.g:3659:1: rule__DeclVarInput__Group__1 : rule__DeclVarInput__Group__1__Impl rule__DeclVarInput__Group__2 ;
    public final void rule__DeclVarInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3663:1: ( rule__DeclVarInput__Group__1__Impl rule__DeclVarInput__Group__2 )
            // InternalCNL.g:3664:2: rule__DeclVarInput__Group__1__Impl rule__DeclVarInput__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DeclVarInput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclVarInput__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarInput__Group__1"


    // $ANTLR start "rule__DeclVarInput__Group__1__Impl"
    // InternalCNL.g:3671:1: rule__DeclVarInput__Group__1__Impl : ( 'VAR_INPUT' ) ;
    public final void rule__DeclVarInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3675:1: ( ( 'VAR_INPUT' ) )
            // InternalCNL.g:3676:1: ( 'VAR_INPUT' )
            {
            // InternalCNL.g:3676:1: ( 'VAR_INPUT' )
            // InternalCNL.g:3677:2: 'VAR_INPUT'
            {
             before(grammarAccess.getDeclVarInputAccess().getVAR_INPUTKeyword_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getDeclVarInputAccess().getVAR_INPUTKeyword_1()); 

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
    // $ANTLR end "rule__DeclVarInput__Group__1__Impl"


    // $ANTLR start "rule__DeclVarInput__Group__2"
    // InternalCNL.g:3686:1: rule__DeclVarInput__Group__2 : rule__DeclVarInput__Group__2__Impl rule__DeclVarInput__Group__3 ;
    public final void rule__DeclVarInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3690:1: ( rule__DeclVarInput__Group__2__Impl rule__DeclVarInput__Group__3 )
            // InternalCNL.g:3691:2: rule__DeclVarInput__Group__2__Impl rule__DeclVarInput__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__DeclVarInput__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclVarInput__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarInput__Group__2"


    // $ANTLR start "rule__DeclVarInput__Group__2__Impl"
    // InternalCNL.g:3698:1: rule__DeclVarInput__Group__2__Impl : ( ( ( rule__DeclVarInput__Group_2__0 ) ) ( ( rule__DeclVarInput__Group_2__0 )* ) ) ;
    public final void rule__DeclVarInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3702:1: ( ( ( ( rule__DeclVarInput__Group_2__0 ) ) ( ( rule__DeclVarInput__Group_2__0 )* ) ) )
            // InternalCNL.g:3703:1: ( ( ( rule__DeclVarInput__Group_2__0 ) ) ( ( rule__DeclVarInput__Group_2__0 )* ) )
            {
            // InternalCNL.g:3703:1: ( ( ( rule__DeclVarInput__Group_2__0 ) ) ( ( rule__DeclVarInput__Group_2__0 )* ) )
            // InternalCNL.g:3704:2: ( ( rule__DeclVarInput__Group_2__0 ) ) ( ( rule__DeclVarInput__Group_2__0 )* )
            {
            // InternalCNL.g:3704:2: ( ( rule__DeclVarInput__Group_2__0 ) )
            // InternalCNL.g:3705:3: ( rule__DeclVarInput__Group_2__0 )
            {
             before(grammarAccess.getDeclVarInputAccess().getGroup_2()); 
            // InternalCNL.g:3706:3: ( rule__DeclVarInput__Group_2__0 )
            // InternalCNL.g:3706:4: rule__DeclVarInput__Group_2__0
            {
            pushFollow(FOLLOW_30);
            rule__DeclVarInput__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclVarInputAccess().getGroup_2()); 

            }

            // InternalCNL.g:3709:2: ( ( rule__DeclVarInput__Group_2__0 )* )
            // InternalCNL.g:3710:3: ( rule__DeclVarInput__Group_2__0 )*
            {
             before(grammarAccess.getDeclVarInputAccess().getGroup_2()); 
            // InternalCNL.g:3711:3: ( rule__DeclVarInput__Group_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCNL.g:3711:4: rule__DeclVarInput__Group_2__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__DeclVarInput__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getDeclVarInputAccess().getGroup_2()); 

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
    // $ANTLR end "rule__DeclVarInput__Group__2__Impl"


    // $ANTLR start "rule__DeclVarInput__Group__3"
    // InternalCNL.g:3720:1: rule__DeclVarInput__Group__3 : rule__DeclVarInput__Group__3__Impl ;
    public final void rule__DeclVarInput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3724:1: ( rule__DeclVarInput__Group__3__Impl )
            // InternalCNL.g:3725:2: rule__DeclVarInput__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclVarInput__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarInput__Group__3"


    // $ANTLR start "rule__DeclVarInput__Group__3__Impl"
    // InternalCNL.g:3731:1: rule__DeclVarInput__Group__3__Impl : ( 'END_VAR' ) ;
    public final void rule__DeclVarInput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3735:1: ( ( 'END_VAR' ) )
            // InternalCNL.g:3736:1: ( 'END_VAR' )
            {
            // InternalCNL.g:3736:1: ( 'END_VAR' )
            // InternalCNL.g:3737:2: 'END_VAR'
            {
             before(grammarAccess.getDeclVarInputAccess().getEND_VARKeyword_3()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getDeclVarInputAccess().getEND_VARKeyword_3()); 

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
    // $ANTLR end "rule__DeclVarInput__Group__3__Impl"


    // $ANTLR start "rule__DeclVarInput__Group_2__0"
    // InternalCNL.g:3747:1: rule__DeclVarInput__Group_2__0 : rule__DeclVarInput__Group_2__0__Impl rule__DeclVarInput__Group_2__1 ;
    public final void rule__DeclVarInput__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3751:1: ( rule__DeclVarInput__Group_2__0__Impl rule__DeclVarInput__Group_2__1 )
            // InternalCNL.g:3752:2: rule__DeclVarInput__Group_2__0__Impl rule__DeclVarInput__Group_2__1
            {
            pushFollow(FOLLOW_31);
            rule__DeclVarInput__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclVarInput__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarInput__Group_2__0"


    // $ANTLR start "rule__DeclVarInput__Group_2__0__Impl"
    // InternalCNL.g:3759:1: rule__DeclVarInput__Group_2__0__Impl : ( ( rule__DeclVarInput__VarDeclsAssignment_2_0 ) ) ;
    public final void rule__DeclVarInput__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3763:1: ( ( ( rule__DeclVarInput__VarDeclsAssignment_2_0 ) ) )
            // InternalCNL.g:3764:1: ( ( rule__DeclVarInput__VarDeclsAssignment_2_0 ) )
            {
            // InternalCNL.g:3764:1: ( ( rule__DeclVarInput__VarDeclsAssignment_2_0 ) )
            // InternalCNL.g:3765:2: ( rule__DeclVarInput__VarDeclsAssignment_2_0 )
            {
             before(grammarAccess.getDeclVarInputAccess().getVarDeclsAssignment_2_0()); 
            // InternalCNL.g:3766:2: ( rule__DeclVarInput__VarDeclsAssignment_2_0 )
            // InternalCNL.g:3766:3: rule__DeclVarInput__VarDeclsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__DeclVarInput__VarDeclsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclVarInputAccess().getVarDeclsAssignment_2_0()); 

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
    // $ANTLR end "rule__DeclVarInput__Group_2__0__Impl"


    // $ANTLR start "rule__DeclVarInput__Group_2__1"
    // InternalCNL.g:3774:1: rule__DeclVarInput__Group_2__1 : rule__DeclVarInput__Group_2__1__Impl ;
    public final void rule__DeclVarInput__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3778:1: ( rule__DeclVarInput__Group_2__1__Impl )
            // InternalCNL.g:3779:2: rule__DeclVarInput__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclVarInput__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarInput__Group_2__1"


    // $ANTLR start "rule__DeclVarInput__Group_2__1__Impl"
    // InternalCNL.g:3785:1: rule__DeclVarInput__Group_2__1__Impl : ( ';' ) ;
    public final void rule__DeclVarInput__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3789:1: ( ( ';' ) )
            // InternalCNL.g:3790:1: ( ';' )
            {
            // InternalCNL.g:3790:1: ( ';' )
            // InternalCNL.g:3791:2: ';'
            {
             before(grammarAccess.getDeclVarInputAccess().getSemicolonKeyword_2_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getDeclVarInputAccess().getSemicolonKeyword_2_1()); 

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
    // $ANTLR end "rule__DeclVarInput__Group_2__1__Impl"


    // $ANTLR start "rule__DeclVarOutput__Group__0"
    // InternalCNL.g:3801:1: rule__DeclVarOutput__Group__0 : rule__DeclVarOutput__Group__0__Impl rule__DeclVarOutput__Group__1 ;
    public final void rule__DeclVarOutput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3805:1: ( rule__DeclVarOutput__Group__0__Impl rule__DeclVarOutput__Group__1 )
            // InternalCNL.g:3806:2: rule__DeclVarOutput__Group__0__Impl rule__DeclVarOutput__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__DeclVarOutput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclVarOutput__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarOutput__Group__0"


    // $ANTLR start "rule__DeclVarOutput__Group__0__Impl"
    // InternalCNL.g:3813:1: rule__DeclVarOutput__Group__0__Impl : ( () ) ;
    public final void rule__DeclVarOutput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3817:1: ( ( () ) )
            // InternalCNL.g:3818:1: ( () )
            {
            // InternalCNL.g:3818:1: ( () )
            // InternalCNL.g:3819:2: ()
            {
             before(grammarAccess.getDeclVarOutputAccess().getDeclVarOutputAction_0()); 
            // InternalCNL.g:3820:2: ()
            // InternalCNL.g:3820:3: 
            {
            }

             after(grammarAccess.getDeclVarOutputAccess().getDeclVarOutputAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarOutput__Group__0__Impl"


    // $ANTLR start "rule__DeclVarOutput__Group__1"
    // InternalCNL.g:3828:1: rule__DeclVarOutput__Group__1 : rule__DeclVarOutput__Group__1__Impl rule__DeclVarOutput__Group__2 ;
    public final void rule__DeclVarOutput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3832:1: ( rule__DeclVarOutput__Group__1__Impl rule__DeclVarOutput__Group__2 )
            // InternalCNL.g:3833:2: rule__DeclVarOutput__Group__1__Impl rule__DeclVarOutput__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DeclVarOutput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclVarOutput__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarOutput__Group__1"


    // $ANTLR start "rule__DeclVarOutput__Group__1__Impl"
    // InternalCNL.g:3840:1: rule__DeclVarOutput__Group__1__Impl : ( 'VAR_OUTPUT' ) ;
    public final void rule__DeclVarOutput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3844:1: ( ( 'VAR_OUTPUT' ) )
            // InternalCNL.g:3845:1: ( 'VAR_OUTPUT' )
            {
            // InternalCNL.g:3845:1: ( 'VAR_OUTPUT' )
            // InternalCNL.g:3846:2: 'VAR_OUTPUT'
            {
             before(grammarAccess.getDeclVarOutputAccess().getVAR_OUTPUTKeyword_1()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getDeclVarOutputAccess().getVAR_OUTPUTKeyword_1()); 

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
    // $ANTLR end "rule__DeclVarOutput__Group__1__Impl"


    // $ANTLR start "rule__DeclVarOutput__Group__2"
    // InternalCNL.g:3855:1: rule__DeclVarOutput__Group__2 : rule__DeclVarOutput__Group__2__Impl rule__DeclVarOutput__Group__3 ;
    public final void rule__DeclVarOutput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3859:1: ( rule__DeclVarOutput__Group__2__Impl rule__DeclVarOutput__Group__3 )
            // InternalCNL.g:3860:2: rule__DeclVarOutput__Group__2__Impl rule__DeclVarOutput__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__DeclVarOutput__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclVarOutput__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarOutput__Group__2"


    // $ANTLR start "rule__DeclVarOutput__Group__2__Impl"
    // InternalCNL.g:3867:1: rule__DeclVarOutput__Group__2__Impl : ( ( ( rule__DeclVarOutput__Group_2__0 ) ) ( ( rule__DeclVarOutput__Group_2__0 )* ) ) ;
    public final void rule__DeclVarOutput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3871:1: ( ( ( ( rule__DeclVarOutput__Group_2__0 ) ) ( ( rule__DeclVarOutput__Group_2__0 )* ) ) )
            // InternalCNL.g:3872:1: ( ( ( rule__DeclVarOutput__Group_2__0 ) ) ( ( rule__DeclVarOutput__Group_2__0 )* ) )
            {
            // InternalCNL.g:3872:1: ( ( ( rule__DeclVarOutput__Group_2__0 ) ) ( ( rule__DeclVarOutput__Group_2__0 )* ) )
            // InternalCNL.g:3873:2: ( ( rule__DeclVarOutput__Group_2__0 ) ) ( ( rule__DeclVarOutput__Group_2__0 )* )
            {
            // InternalCNL.g:3873:2: ( ( rule__DeclVarOutput__Group_2__0 ) )
            // InternalCNL.g:3874:3: ( rule__DeclVarOutput__Group_2__0 )
            {
             before(grammarAccess.getDeclVarOutputAccess().getGroup_2()); 
            // InternalCNL.g:3875:3: ( rule__DeclVarOutput__Group_2__0 )
            // InternalCNL.g:3875:4: rule__DeclVarOutput__Group_2__0
            {
            pushFollow(FOLLOW_30);
            rule__DeclVarOutput__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclVarOutputAccess().getGroup_2()); 

            }

            // InternalCNL.g:3878:2: ( ( rule__DeclVarOutput__Group_2__0 )* )
            // InternalCNL.g:3879:3: ( rule__DeclVarOutput__Group_2__0 )*
            {
             before(grammarAccess.getDeclVarOutputAccess().getGroup_2()); 
            // InternalCNL.g:3880:3: ( rule__DeclVarOutput__Group_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCNL.g:3880:4: rule__DeclVarOutput__Group_2__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__DeclVarOutput__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getDeclVarOutputAccess().getGroup_2()); 

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
    // $ANTLR end "rule__DeclVarOutput__Group__2__Impl"


    // $ANTLR start "rule__DeclVarOutput__Group__3"
    // InternalCNL.g:3889:1: rule__DeclVarOutput__Group__3 : rule__DeclVarOutput__Group__3__Impl ;
    public final void rule__DeclVarOutput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3893:1: ( rule__DeclVarOutput__Group__3__Impl )
            // InternalCNL.g:3894:2: rule__DeclVarOutput__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclVarOutput__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarOutput__Group__3"


    // $ANTLR start "rule__DeclVarOutput__Group__3__Impl"
    // InternalCNL.g:3900:1: rule__DeclVarOutput__Group__3__Impl : ( 'END_VAR' ) ;
    public final void rule__DeclVarOutput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3904:1: ( ( 'END_VAR' ) )
            // InternalCNL.g:3905:1: ( 'END_VAR' )
            {
            // InternalCNL.g:3905:1: ( 'END_VAR' )
            // InternalCNL.g:3906:2: 'END_VAR'
            {
             before(grammarAccess.getDeclVarOutputAccess().getEND_VARKeyword_3()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getDeclVarOutputAccess().getEND_VARKeyword_3()); 

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
    // $ANTLR end "rule__DeclVarOutput__Group__3__Impl"


    // $ANTLR start "rule__DeclVarOutput__Group_2__0"
    // InternalCNL.g:3916:1: rule__DeclVarOutput__Group_2__0 : rule__DeclVarOutput__Group_2__0__Impl rule__DeclVarOutput__Group_2__1 ;
    public final void rule__DeclVarOutput__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3920:1: ( rule__DeclVarOutput__Group_2__0__Impl rule__DeclVarOutput__Group_2__1 )
            // InternalCNL.g:3921:2: rule__DeclVarOutput__Group_2__0__Impl rule__DeclVarOutput__Group_2__1
            {
            pushFollow(FOLLOW_31);
            rule__DeclVarOutput__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclVarOutput__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarOutput__Group_2__0"


    // $ANTLR start "rule__DeclVarOutput__Group_2__0__Impl"
    // InternalCNL.g:3928:1: rule__DeclVarOutput__Group_2__0__Impl : ( ( rule__DeclVarOutput__VarDeclsAssignment_2_0 ) ) ;
    public final void rule__DeclVarOutput__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3932:1: ( ( ( rule__DeclVarOutput__VarDeclsAssignment_2_0 ) ) )
            // InternalCNL.g:3933:1: ( ( rule__DeclVarOutput__VarDeclsAssignment_2_0 ) )
            {
            // InternalCNL.g:3933:1: ( ( rule__DeclVarOutput__VarDeclsAssignment_2_0 ) )
            // InternalCNL.g:3934:2: ( rule__DeclVarOutput__VarDeclsAssignment_2_0 )
            {
             before(grammarAccess.getDeclVarOutputAccess().getVarDeclsAssignment_2_0()); 
            // InternalCNL.g:3935:2: ( rule__DeclVarOutput__VarDeclsAssignment_2_0 )
            // InternalCNL.g:3935:3: rule__DeclVarOutput__VarDeclsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__DeclVarOutput__VarDeclsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclVarOutputAccess().getVarDeclsAssignment_2_0()); 

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
    // $ANTLR end "rule__DeclVarOutput__Group_2__0__Impl"


    // $ANTLR start "rule__DeclVarOutput__Group_2__1"
    // InternalCNL.g:3943:1: rule__DeclVarOutput__Group_2__1 : rule__DeclVarOutput__Group_2__1__Impl ;
    public final void rule__DeclVarOutput__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3947:1: ( rule__DeclVarOutput__Group_2__1__Impl )
            // InternalCNL.g:3948:2: rule__DeclVarOutput__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclVarOutput__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclVarOutput__Group_2__1"


    // $ANTLR start "rule__DeclVarOutput__Group_2__1__Impl"
    // InternalCNL.g:3954:1: rule__DeclVarOutput__Group_2__1__Impl : ( ';' ) ;
    public final void rule__DeclVarOutput__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3958:1: ( ( ';' ) )
            // InternalCNL.g:3959:1: ( ';' )
            {
            // InternalCNL.g:3959:1: ( ';' )
            // InternalCNL.g:3960:2: ';'
            {
             before(grammarAccess.getDeclVarOutputAccess().getSemicolonKeyword_2_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getDeclVarOutputAccess().getSemicolonKeyword_2_1()); 

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
    // $ANTLR end "rule__DeclVarOutput__Group_2__1__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__0"
    // InternalCNL.g:3970:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3974:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalCNL.g:3975:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__VarDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__0"


    // $ANTLR start "rule__VarDeclaration__Group__0__Impl"
    // InternalCNL.g:3982:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__NameAssignment_0 ) ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:3986:1: ( ( ( rule__VarDeclaration__NameAssignment_0 ) ) )
            // InternalCNL.g:3987:1: ( ( rule__VarDeclaration__NameAssignment_0 ) )
            {
            // InternalCNL.g:3987:1: ( ( rule__VarDeclaration__NameAssignment_0 ) )
            // InternalCNL.g:3988:2: ( rule__VarDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getNameAssignment_0()); 
            // InternalCNL.g:3989:2: ( rule__VarDeclaration__NameAssignment_0 )
            // InternalCNL.g:3989:3: rule__VarDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__VarDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__1"
    // InternalCNL.g:3997:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4001:1: ( rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2 )
            // InternalCNL.g:4002:2: rule__VarDeclaration__Group__1__Impl rule__VarDeclaration__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__VarDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__1"


    // $ANTLR start "rule__VarDeclaration__Group__1__Impl"
    // InternalCNL.g:4009:1: rule__VarDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4013:1: ( ( ':' ) )
            // InternalCNL.g:4014:1: ( ':' )
            {
            // InternalCNL.g:4014:1: ( ':' )
            // InternalCNL.g:4015:2: ':'
            {
             before(grammarAccess.getVarDeclarationAccess().getColonKeyword_1()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__VarDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__2"
    // InternalCNL.g:4024:1: rule__VarDeclaration__Group__2 : rule__VarDeclaration__Group__2__Impl ;
    public final void rule__VarDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4028:1: ( rule__VarDeclaration__Group__2__Impl )
            // InternalCNL.g:4029:2: rule__VarDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__2"


    // $ANTLR start "rule__VarDeclaration__Group__2__Impl"
    // InternalCNL.g:4035:1: rule__VarDeclaration__Group__2__Impl : ( ( rule__VarDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__VarDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4039:1: ( ( ( rule__VarDeclaration__TypeAssignment_2 ) ) )
            // InternalCNL.g:4040:1: ( ( rule__VarDeclaration__TypeAssignment_2 ) )
            {
            // InternalCNL.g:4040:1: ( ( rule__VarDeclaration__TypeAssignment_2 ) )
            // InternalCNL.g:4041:2: ( rule__VarDeclaration__TypeAssignment_2 )
            {
             before(grammarAccess.getVarDeclarationAccess().getTypeAssignment_2()); 
            // InternalCNL.g:4042:2: ( rule__VarDeclaration__TypeAssignment_2 )
            // InternalCNL.g:4042:3: rule__VarDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__VarDeclaration__Group__2__Impl"


    // $ANTLR start "rule__SentDeclaration__Group__0"
    // InternalCNL.g:4051:1: rule__SentDeclaration__Group__0 : rule__SentDeclaration__Group__0__Impl rule__SentDeclaration__Group__1 ;
    public final void rule__SentDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4055:1: ( rule__SentDeclaration__Group__0__Impl rule__SentDeclaration__Group__1 )
            // InternalCNL.g:4056:2: rule__SentDeclaration__Group__0__Impl rule__SentDeclaration__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__SentDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentDeclaration__Group__0"


    // $ANTLR start "rule__SentDeclaration__Group__0__Impl"
    // InternalCNL.g:4063:1: rule__SentDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__SentDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4067:1: ( ( () ) )
            // InternalCNL.g:4068:1: ( () )
            {
            // InternalCNL.g:4068:1: ( () )
            // InternalCNL.g:4069:2: ()
            {
             before(grammarAccess.getSentDeclarationAccess().getSentDeclarationAction_0()); 
            // InternalCNL.g:4070:2: ()
            // InternalCNL.g:4070:3: 
            {
            }

             after(grammarAccess.getSentDeclarationAccess().getSentDeclarationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentDeclaration__Group__0__Impl"


    // $ANTLR start "rule__SentDeclaration__Group__1"
    // InternalCNL.g:4078:1: rule__SentDeclaration__Group__1 : rule__SentDeclaration__Group__1__Impl rule__SentDeclaration__Group__2 ;
    public final void rule__SentDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4082:1: ( rule__SentDeclaration__Group__1__Impl rule__SentDeclaration__Group__2 )
            // InternalCNL.g:4083:2: rule__SentDeclaration__Group__1__Impl rule__SentDeclaration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SentDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentDeclaration__Group__1"


    // $ANTLR start "rule__SentDeclaration__Group__1__Impl"
    // InternalCNL.g:4090:1: rule__SentDeclaration__Group__1__Impl : ( 'SENTENCE' ) ;
    public final void rule__SentDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4094:1: ( ( 'SENTENCE' ) )
            // InternalCNL.g:4095:1: ( 'SENTENCE' )
            {
            // InternalCNL.g:4095:1: ( 'SENTENCE' )
            // InternalCNL.g:4096:2: 'SENTENCE'
            {
             before(grammarAccess.getSentDeclarationAccess().getSENTENCEKeyword_1()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getSentDeclarationAccess().getSENTENCEKeyword_1()); 

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
    // $ANTLR end "rule__SentDeclaration__Group__1__Impl"


    // $ANTLR start "rule__SentDeclaration__Group__2"
    // InternalCNL.g:4105:1: rule__SentDeclaration__Group__2 : rule__SentDeclaration__Group__2__Impl rule__SentDeclaration__Group__3 ;
    public final void rule__SentDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4109:1: ( rule__SentDeclaration__Group__2__Impl rule__SentDeclaration__Group__3 )
            // InternalCNL.g:4110:2: rule__SentDeclaration__Group__2__Impl rule__SentDeclaration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SentDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentDeclaration__Group__2"


    // $ANTLR start "rule__SentDeclaration__Group__2__Impl"
    // InternalCNL.g:4117:1: rule__SentDeclaration__Group__2__Impl : ( ( rule__SentDeclaration__NameAssignment_2 ) ) ;
    public final void rule__SentDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4121:1: ( ( ( rule__SentDeclaration__NameAssignment_2 ) ) )
            // InternalCNL.g:4122:1: ( ( rule__SentDeclaration__NameAssignment_2 ) )
            {
            // InternalCNL.g:4122:1: ( ( rule__SentDeclaration__NameAssignment_2 ) )
            // InternalCNL.g:4123:2: ( rule__SentDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getSentDeclarationAccess().getNameAssignment_2()); 
            // InternalCNL.g:4124:2: ( rule__SentDeclaration__NameAssignment_2 )
            // InternalCNL.g:4124:3: rule__SentDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SentDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSentDeclarationAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__SentDeclaration__Group__2__Impl"


    // $ANTLR start "rule__SentDeclaration__Group__3"
    // InternalCNL.g:4132:1: rule__SentDeclaration__Group__3 : rule__SentDeclaration__Group__3__Impl rule__SentDeclaration__Group__4 ;
    public final void rule__SentDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4136:1: ( rule__SentDeclaration__Group__3__Impl rule__SentDeclaration__Group__4 )
            // InternalCNL.g:4137:2: rule__SentDeclaration__Group__3__Impl rule__SentDeclaration__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__SentDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentDeclaration__Group__3"


    // $ANTLR start "rule__SentDeclaration__Group__3__Impl"
    // InternalCNL.g:4144:1: rule__SentDeclaration__Group__3__Impl : ( ( rule__SentDeclaration__SentenceDeclarationAssignment_3 ) ) ;
    public final void rule__SentDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4148:1: ( ( ( rule__SentDeclaration__SentenceDeclarationAssignment_3 ) ) )
            // InternalCNL.g:4149:1: ( ( rule__SentDeclaration__SentenceDeclarationAssignment_3 ) )
            {
            // InternalCNL.g:4149:1: ( ( rule__SentDeclaration__SentenceDeclarationAssignment_3 ) )
            // InternalCNL.g:4150:2: ( rule__SentDeclaration__SentenceDeclarationAssignment_3 )
            {
             before(grammarAccess.getSentDeclarationAccess().getSentenceDeclarationAssignment_3()); 
            // InternalCNL.g:4151:2: ( rule__SentDeclaration__SentenceDeclarationAssignment_3 )
            // InternalCNL.g:4151:3: rule__SentDeclaration__SentenceDeclarationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SentDeclaration__SentenceDeclarationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSentDeclarationAccess().getSentenceDeclarationAssignment_3()); 

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
    // $ANTLR end "rule__SentDeclaration__Group__3__Impl"


    // $ANTLR start "rule__SentDeclaration__Group__4"
    // InternalCNL.g:4159:1: rule__SentDeclaration__Group__4 : rule__SentDeclaration__Group__4__Impl ;
    public final void rule__SentDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4163:1: ( rule__SentDeclaration__Group__4__Impl )
            // InternalCNL.g:4164:2: rule__SentDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SentDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentDeclaration__Group__4"


    // $ANTLR start "rule__SentDeclaration__Group__4__Impl"
    // InternalCNL.g:4170:1: rule__SentDeclaration__Group__4__Impl : ( 'END_SENTENCE' ) ;
    public final void rule__SentDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4174:1: ( ( 'END_SENTENCE' ) )
            // InternalCNL.g:4175:1: ( 'END_SENTENCE' )
            {
            // InternalCNL.g:4175:1: ( 'END_SENTENCE' )
            // InternalCNL.g:4176:2: 'END_SENTENCE'
            {
             before(grammarAccess.getSentDeclarationAccess().getEND_SENTENCEKeyword_4()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getSentDeclarationAccess().getEND_SENTENCEKeyword_4()); 

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
    // $ANTLR end "rule__SentDeclaration__Group__4__Impl"


    // $ANTLR start "rule__SentenceDeclaration__Group__0"
    // InternalCNL.g:4186:1: rule__SentenceDeclaration__Group__0 : rule__SentenceDeclaration__Group__0__Impl rule__SentenceDeclaration__Group__1 ;
    public final void rule__SentenceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4190:1: ( rule__SentenceDeclaration__Group__0__Impl rule__SentenceDeclaration__Group__1 )
            // InternalCNL.g:4191:2: rule__SentenceDeclaration__Group__0__Impl rule__SentenceDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SentenceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentenceDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenceDeclaration__Group__0"


    // $ANTLR start "rule__SentenceDeclaration__Group__0__Impl"
    // InternalCNL.g:4198:1: rule__SentenceDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__SentenceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4202:1: ( ( () ) )
            // InternalCNL.g:4203:1: ( () )
            {
            // InternalCNL.g:4203:1: ( () )
            // InternalCNL.g:4204:2: ()
            {
             before(grammarAccess.getSentenceDeclarationAccess().getSentenceDeclarationAction_0()); 
            // InternalCNL.g:4205:2: ()
            // InternalCNL.g:4205:3: 
            {
            }

             after(grammarAccess.getSentenceDeclarationAccess().getSentenceDeclarationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenceDeclaration__Group__0__Impl"


    // $ANTLR start "rule__SentenceDeclaration__Group__1"
    // InternalCNL.g:4213:1: rule__SentenceDeclaration__Group__1 : rule__SentenceDeclaration__Group__1__Impl rule__SentenceDeclaration__Group__2 ;
    public final void rule__SentenceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4217:1: ( rule__SentenceDeclaration__Group__1__Impl rule__SentenceDeclaration__Group__2 )
            // InternalCNL.g:4218:2: rule__SentenceDeclaration__Group__1__Impl rule__SentenceDeclaration__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__SentenceDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentenceDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenceDeclaration__Group__1"


    // $ANTLR start "rule__SentenceDeclaration__Group__1__Impl"
    // InternalCNL.g:4225:1: rule__SentenceDeclaration__Group__1__Impl : ( ( rule__SentenceDeclaration__NameAssignment_1 ) ) ;
    public final void rule__SentenceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4229:1: ( ( ( rule__SentenceDeclaration__NameAssignment_1 ) ) )
            // InternalCNL.g:4230:1: ( ( rule__SentenceDeclaration__NameAssignment_1 ) )
            {
            // InternalCNL.g:4230:1: ( ( rule__SentenceDeclaration__NameAssignment_1 ) )
            // InternalCNL.g:4231:2: ( rule__SentenceDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getSentenceDeclarationAccess().getNameAssignment_1()); 
            // InternalCNL.g:4232:2: ( rule__SentenceDeclaration__NameAssignment_1 )
            // InternalCNL.g:4232:3: rule__SentenceDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SentenceDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SentenceDeclaration__Group__1__Impl"


    // $ANTLR start "rule__SentenceDeclaration__Group__2"
    // InternalCNL.g:4240:1: rule__SentenceDeclaration__Group__2 : rule__SentenceDeclaration__Group__2__Impl rule__SentenceDeclaration__Group__3 ;
    public final void rule__SentenceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4244:1: ( rule__SentenceDeclaration__Group__2__Impl rule__SentenceDeclaration__Group__3 )
            // InternalCNL.g:4245:2: rule__SentenceDeclaration__Group__2__Impl rule__SentenceDeclaration__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__SentenceDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentenceDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenceDeclaration__Group__2"


    // $ANTLR start "rule__SentenceDeclaration__Group__2__Impl"
    // InternalCNL.g:4252:1: rule__SentenceDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__SentenceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4256:1: ( ( '=' ) )
            // InternalCNL.g:4257:1: ( '=' )
            {
            // InternalCNL.g:4257:1: ( '=' )
            // InternalCNL.g:4258:2: '='
            {
             before(grammarAccess.getSentenceDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getSentenceDeclarationAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__SentenceDeclaration__Group__2__Impl"


    // $ANTLR start "rule__SentenceDeclaration__Group__3"
    // InternalCNL.g:4267:1: rule__SentenceDeclaration__Group__3 : rule__SentenceDeclaration__Group__3__Impl ;
    public final void rule__SentenceDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4271:1: ( rule__SentenceDeclaration__Group__3__Impl )
            // InternalCNL.g:4272:2: rule__SentenceDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SentenceDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SentenceDeclaration__Group__3"


    // $ANTLR start "rule__SentenceDeclaration__Group__3__Impl"
    // InternalCNL.g:4278:1: rule__SentenceDeclaration__Group__3__Impl : ( ( rule__SentenceDeclaration__LogicExpressionAssignment_3 ) ) ;
    public final void rule__SentenceDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4282:1: ( ( ( rule__SentenceDeclaration__LogicExpressionAssignment_3 ) ) )
            // InternalCNL.g:4283:1: ( ( rule__SentenceDeclaration__LogicExpressionAssignment_3 ) )
            {
            // InternalCNL.g:4283:1: ( ( rule__SentenceDeclaration__LogicExpressionAssignment_3 ) )
            // InternalCNL.g:4284:2: ( rule__SentenceDeclaration__LogicExpressionAssignment_3 )
            {
             before(grammarAccess.getSentenceDeclarationAccess().getLogicExpressionAssignment_3()); 
            // InternalCNL.g:4285:2: ( rule__SentenceDeclaration__LogicExpressionAssignment_3 )
            // InternalCNL.g:4285:3: rule__SentenceDeclaration__LogicExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SentenceDeclaration__LogicExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSentenceDeclarationAccess().getLogicExpressionAssignment_3()); 

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
    // $ANTLR end "rule__SentenceDeclaration__Group__3__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalCNL.g:4294:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4298:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalCNL.g:4299:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalCNL.g:4306:1: rule__Expression__Group__0__Impl : ( ruleXorExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4310:1: ( ( ruleXorExpression ) )
            // InternalCNL.g:4311:1: ( ruleXorExpression )
            {
            // InternalCNL.g:4311:1: ( ruleXorExpression )
            // InternalCNL.g:4312:2: ruleXorExpression
            {
             before(grammarAccess.getExpressionAccess().getXorExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleXorExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getXorExpressionParserRuleCall_0()); 

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
    // InternalCNL.g:4321:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4325:1: ( rule__Expression__Group__1__Impl )
            // InternalCNL.g:4326:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCNL.g:4332:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4336:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // InternalCNL.g:4337:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // InternalCNL.g:4337:1: ( ( rule__Expression__Group_1__0 )* )
            // InternalCNL.g:4338:2: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalCNL.g:4339:2: ( rule__Expression__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_OR_OPERATOR) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCNL.g:4339:3: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

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
    // InternalCNL.g:4348:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4352:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalCNL.g:4353:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_39);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalCNL.g:4360:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4364:1: ( ( () ) )
            // InternalCNL.g:4365:1: ( () )
            {
            // InternalCNL.g:4365:1: ( () )
            // InternalCNL.g:4366:2: ()
            {
             before(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0()); 
            // InternalCNL.g:4367:2: ()
            // InternalCNL.g:4367:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0()); 

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
    // InternalCNL.g:4375:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4379:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalCNL.g:4380:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_38);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalCNL.g:4387:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OrOpAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4391:1: ( ( ( rule__Expression__OrOpAssignment_1_1 ) ) )
            // InternalCNL.g:4392:1: ( ( rule__Expression__OrOpAssignment_1_1 ) )
            {
            // InternalCNL.g:4392:1: ( ( rule__Expression__OrOpAssignment_1_1 ) )
            // InternalCNL.g:4393:2: ( rule__Expression__OrOpAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOrOpAssignment_1_1()); 
            // InternalCNL.g:4394:2: ( rule__Expression__OrOpAssignment_1_1 )
            // InternalCNL.g:4394:3: rule__Expression__OrOpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__OrOpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOrOpAssignment_1_1()); 

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
    // InternalCNL.g:4402:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4406:1: ( rule__Expression__Group_1__2__Impl )
            // InternalCNL.g:4407:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalCNL.g:4413:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RightAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4417:1: ( ( ( rule__Expression__RightAssignment_1_2 ) ) )
            // InternalCNL.g:4418:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            {
            // InternalCNL.g:4418:1: ( ( rule__Expression__RightAssignment_1_2 ) )
            // InternalCNL.g:4419:2: ( rule__Expression__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 
            // InternalCNL.g:4420:2: ( rule__Expression__RightAssignment_1_2 )
            // InternalCNL.g:4420:3: rule__Expression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_2()); 

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


    // $ANTLR start "rule__XorExpression__Group__0"
    // InternalCNL.g:4429:1: rule__XorExpression__Group__0 : rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 ;
    public final void rule__XorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4433:1: ( rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 )
            // InternalCNL.g:4434:2: rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__XorExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group__0"


    // $ANTLR start "rule__XorExpression__Group__0__Impl"
    // InternalCNL.g:4441:1: rule__XorExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__XorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4445:1: ( ( ruleAndExpression ) )
            // InternalCNL.g:4446:1: ( ruleAndExpression )
            {
            // InternalCNL.g:4446:1: ( ruleAndExpression )
            // InternalCNL.g:4447:2: ruleAndExpression
            {
             before(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__XorExpression__Group__0__Impl"


    // $ANTLR start "rule__XorExpression__Group__1"
    // InternalCNL.g:4456:1: rule__XorExpression__Group__1 : rule__XorExpression__Group__1__Impl ;
    public final void rule__XorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4460:1: ( rule__XorExpression__Group__1__Impl )
            // InternalCNL.g:4461:2: rule__XorExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group__1"


    // $ANTLR start "rule__XorExpression__Group__1__Impl"
    // InternalCNL.g:4467:1: rule__XorExpression__Group__1__Impl : ( ( rule__XorExpression__Group_1__0 )* ) ;
    public final void rule__XorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4471:1: ( ( ( rule__XorExpression__Group_1__0 )* ) )
            // InternalCNL.g:4472:1: ( ( rule__XorExpression__Group_1__0 )* )
            {
            // InternalCNL.g:4472:1: ( ( rule__XorExpression__Group_1__0 )* )
            // InternalCNL.g:4473:2: ( rule__XorExpression__Group_1__0 )*
            {
             before(grammarAccess.getXorExpressionAccess().getGroup_1()); 
            // InternalCNL.g:4474:2: ( rule__XorExpression__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==24) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCNL.g:4474:3: rule__XorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__XorExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getXorExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__XorExpression__Group__1__Impl"


    // $ANTLR start "rule__XorExpression__Group_1__0"
    // InternalCNL.g:4483:1: rule__XorExpression__Group_1__0 : rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 ;
    public final void rule__XorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4487:1: ( rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 )
            // InternalCNL.g:4488:2: rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1
            {
            pushFollow(FOLLOW_41);
            rule__XorExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__0"


    // $ANTLR start "rule__XorExpression__Group_1__0__Impl"
    // InternalCNL.g:4495:1: rule__XorExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__XorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4499:1: ( ( () ) )
            // InternalCNL.g:4500:1: ( () )
            {
            // InternalCNL.g:4500:1: ( () )
            // InternalCNL.g:4501:2: ()
            {
             before(grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0()); 
            // InternalCNL.g:4502:2: ()
            // InternalCNL.g:4502:3: 
            {
            }

             after(grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__0__Impl"


    // $ANTLR start "rule__XorExpression__Group_1__1"
    // InternalCNL.g:4510:1: rule__XorExpression__Group_1__1 : rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2 ;
    public final void rule__XorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4514:1: ( rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2 )
            // InternalCNL.g:4515:2: rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2
            {
            pushFollow(FOLLOW_38);
            rule__XorExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__1"


    // $ANTLR start "rule__XorExpression__Group_1__1__Impl"
    // InternalCNL.g:4522:1: rule__XorExpression__Group_1__1__Impl : ( ruleXOR_OPERATOR ) ;
    public final void rule__XorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4526:1: ( ( ruleXOR_OPERATOR ) )
            // InternalCNL.g:4527:1: ( ruleXOR_OPERATOR )
            {
            // InternalCNL.g:4527:1: ( ruleXOR_OPERATOR )
            // InternalCNL.g:4528:2: ruleXOR_OPERATOR
            {
             before(grammarAccess.getXorExpressionAccess().getXOR_OPERATORParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleXOR_OPERATOR();

            state._fsp--;

             after(grammarAccess.getXorExpressionAccess().getXOR_OPERATORParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__XorExpression__Group_1__1__Impl"


    // $ANTLR start "rule__XorExpression__Group_1__2"
    // InternalCNL.g:4537:1: rule__XorExpression__Group_1__2 : rule__XorExpression__Group_1__2__Impl ;
    public final void rule__XorExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4541:1: ( rule__XorExpression__Group_1__2__Impl )
            // InternalCNL.g:4542:2: rule__XorExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__2"


    // $ANTLR start "rule__XorExpression__Group_1__2__Impl"
    // InternalCNL.g:4548:1: rule__XorExpression__Group_1__2__Impl : ( ( rule__XorExpression__RightAssignment_1_2 ) ) ;
    public final void rule__XorExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4552:1: ( ( ( rule__XorExpression__RightAssignment_1_2 ) ) )
            // InternalCNL.g:4553:1: ( ( rule__XorExpression__RightAssignment_1_2 ) )
            {
            // InternalCNL.g:4553:1: ( ( rule__XorExpression__RightAssignment_1_2 ) )
            // InternalCNL.g:4554:2: ( rule__XorExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getXorExpressionAccess().getRightAssignment_1_2()); 
            // InternalCNL.g:4555:2: ( rule__XorExpression__RightAssignment_1_2 )
            // InternalCNL.g:4555:3: rule__XorExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getXorExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__XorExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalCNL.g:4564:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4568:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalCNL.g:4569:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalCNL.g:4576:1: rule__AndExpression__Group__0__Impl : ( ruleCompExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4580:1: ( ( ruleCompExpression ) )
            // InternalCNL.g:4581:1: ( ruleCompExpression )
            {
            // InternalCNL.g:4581:1: ( ruleCompExpression )
            // InternalCNL.g:4582:2: ruleCompExpression
            {
             before(grammarAccess.getAndExpressionAccess().getCompExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCompExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getCompExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalCNL.g:4591:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4595:1: ( rule__AndExpression__Group__1__Impl )
            // InternalCNL.g:4596:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalCNL.g:4602:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4606:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalCNL.g:4607:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalCNL.g:4607:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalCNL.g:4608:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalCNL.g:4609:2: ( rule__AndExpression__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==29) ) {
                    alt31=1;
                }
                else if ( (LA31_0==30) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalCNL.g:4609:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalCNL.g:4618:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4622:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalCNL.g:4623:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_43);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalCNL.g:4630:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4634:1: ( ( () ) )
            // InternalCNL.g:4635:1: ( () )
            {
            // InternalCNL.g:4635:1: ( () )
            // InternalCNL.g:4636:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 
            // InternalCNL.g:4637:2: ()
            // InternalCNL.g:4637:3: 
            {
            }

             after(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalCNL.g:4645:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4649:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalCNL.g:4650:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_38);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalCNL.g:4657:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__AndOpAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4661:1: ( ( ( rule__AndExpression__AndOpAssignment_1_1 ) ) )
            // InternalCNL.g:4662:1: ( ( rule__AndExpression__AndOpAssignment_1_1 ) )
            {
            // InternalCNL.g:4662:1: ( ( rule__AndExpression__AndOpAssignment_1_1 ) )
            // InternalCNL.g:4663:2: ( rule__AndExpression__AndOpAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getAndOpAssignment_1_1()); 
            // InternalCNL.g:4664:2: ( rule__AndExpression__AndOpAssignment_1_1 )
            // InternalCNL.g:4664:3: rule__AndExpression__AndOpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__AndOpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getAndOpAssignment_1_1()); 

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
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // InternalCNL.g:4672:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4676:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalCNL.g:4677:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // InternalCNL.g:4683:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4687:1: ( ( ( rule__AndExpression__RightAssignment_1_2 ) ) )
            // InternalCNL.g:4688:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            {
            // InternalCNL.g:4688:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            // InternalCNL.g:4689:2: ( rule__AndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            // InternalCNL.g:4690:2: ( rule__AndExpression__RightAssignment_1_2 )
            // InternalCNL.g:4690:3: rule__AndExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__CompExpression__Group__0"
    // InternalCNL.g:4699:1: rule__CompExpression__Group__0 : rule__CompExpression__Group__0__Impl rule__CompExpression__Group__1 ;
    public final void rule__CompExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4703:1: ( rule__CompExpression__Group__0__Impl rule__CompExpression__Group__1 )
            // InternalCNL.g:4704:2: rule__CompExpression__Group__0__Impl rule__CompExpression__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__CompExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompExpression__Group__0"


    // $ANTLR start "rule__CompExpression__Group__0__Impl"
    // InternalCNL.g:4711:1: rule__CompExpression__Group__0__Impl : ( ruleEquExpression ) ;
    public final void rule__CompExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4715:1: ( ( ruleEquExpression ) )
            // InternalCNL.g:4716:1: ( ruleEquExpression )
            {
            // InternalCNL.g:4716:1: ( ruleEquExpression )
            // InternalCNL.g:4717:2: ruleEquExpression
            {
             before(grammarAccess.getCompExpressionAccess().getEquExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEquExpression();

            state._fsp--;

             after(grammarAccess.getCompExpressionAccess().getEquExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__CompExpression__Group__0__Impl"


    // $ANTLR start "rule__CompExpression__Group__1"
    // InternalCNL.g:4726:1: rule__CompExpression__Group__1 : rule__CompExpression__Group__1__Impl ;
    public final void rule__CompExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4730:1: ( rule__CompExpression__Group__1__Impl )
            // InternalCNL.g:4731:2: rule__CompExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompExpression__Group__1"


    // $ANTLR start "rule__CompExpression__Group__1__Impl"
    // InternalCNL.g:4737:1: rule__CompExpression__Group__1__Impl : ( ( rule__CompExpression__Group_1__0 )* ) ;
    public final void rule__CompExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4741:1: ( ( ( rule__CompExpression__Group_1__0 )* ) )
            // InternalCNL.g:4742:1: ( ( rule__CompExpression__Group_1__0 )* )
            {
            // InternalCNL.g:4742:1: ( ( rule__CompExpression__Group_1__0 )* )
            // InternalCNL.g:4743:2: ( rule__CompExpression__Group_1__0 )*
            {
             before(grammarAccess.getCompExpressionAccess().getGroup_1()); 
            // InternalCNL.g:4744:2: ( rule__CompExpression__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    alt32=1;
                    }
                    break;
                case 40:
                    {
                    alt32=1;
                    }
                    break;
                case 41:
                    {
                    alt32=1;
                    }
                    break;
                case 42:
                    {
                    alt32=1;
                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // InternalCNL.g:4744:3: rule__CompExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__CompExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getCompExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__CompExpression__Group__1__Impl"


    // $ANTLR start "rule__CompExpression__Group_1__0"
    // InternalCNL.g:4753:1: rule__CompExpression__Group_1__0 : rule__CompExpression__Group_1__0__Impl rule__CompExpression__Group_1__1 ;
    public final void rule__CompExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4757:1: ( rule__CompExpression__Group_1__0__Impl rule__CompExpression__Group_1__1 )
            // InternalCNL.g:4758:2: rule__CompExpression__Group_1__0__Impl rule__CompExpression__Group_1__1
            {
            pushFollow(FOLLOW_45);
            rule__CompExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompExpression__Group_1__0"


    // $ANTLR start "rule__CompExpression__Group_1__0__Impl"
    // InternalCNL.g:4765:1: rule__CompExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__CompExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4769:1: ( ( () ) )
            // InternalCNL.g:4770:1: ( () )
            {
            // InternalCNL.g:4770:1: ( () )
            // InternalCNL.g:4771:2: ()
            {
             before(grammarAccess.getCompExpressionAccess().getCompExpressionLeftAction_1_0()); 
            // InternalCNL.g:4772:2: ()
            // InternalCNL.g:4772:3: 
            {
            }

             after(grammarAccess.getCompExpressionAccess().getCompExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompExpression__Group_1__0__Impl"


    // $ANTLR start "rule__CompExpression__Group_1__1"
    // InternalCNL.g:4780:1: rule__CompExpression__Group_1__1 : rule__CompExpression__Group_1__1__Impl rule__CompExpression__Group_1__2 ;
    public final void rule__CompExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4784:1: ( rule__CompExpression__Group_1__1__Impl rule__CompExpression__Group_1__2 )
            // InternalCNL.g:4785:2: rule__CompExpression__Group_1__1__Impl rule__CompExpression__Group_1__2
            {
            pushFollow(FOLLOW_38);
            rule__CompExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompExpression__Group_1__1"


    // $ANTLR start "rule__CompExpression__Group_1__1__Impl"
    // InternalCNL.g:4792:1: rule__CompExpression__Group_1__1__Impl : ( ( rule__CompExpression__CompOpAssignment_1_1 ) ) ;
    public final void rule__CompExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4796:1: ( ( ( rule__CompExpression__CompOpAssignment_1_1 ) ) )
            // InternalCNL.g:4797:1: ( ( rule__CompExpression__CompOpAssignment_1_1 ) )
            {
            // InternalCNL.g:4797:1: ( ( rule__CompExpression__CompOpAssignment_1_1 ) )
            // InternalCNL.g:4798:2: ( rule__CompExpression__CompOpAssignment_1_1 )
            {
             before(grammarAccess.getCompExpressionAccess().getCompOpAssignment_1_1()); 
            // InternalCNL.g:4799:2: ( rule__CompExpression__CompOpAssignment_1_1 )
            // InternalCNL.g:4799:3: rule__CompExpression__CompOpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompExpression__CompOpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompExpressionAccess().getCompOpAssignment_1_1()); 

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
    // $ANTLR end "rule__CompExpression__Group_1__1__Impl"


    // $ANTLR start "rule__CompExpression__Group_1__2"
    // InternalCNL.g:4807:1: rule__CompExpression__Group_1__2 : rule__CompExpression__Group_1__2__Impl ;
    public final void rule__CompExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4811:1: ( rule__CompExpression__Group_1__2__Impl )
            // InternalCNL.g:4812:2: rule__CompExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompExpression__Group_1__2"


    // $ANTLR start "rule__CompExpression__Group_1__2__Impl"
    // InternalCNL.g:4818:1: rule__CompExpression__Group_1__2__Impl : ( ( rule__CompExpression__RightAssignment_1_2 ) ) ;
    public final void rule__CompExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4822:1: ( ( ( rule__CompExpression__RightAssignment_1_2 ) ) )
            // InternalCNL.g:4823:1: ( ( rule__CompExpression__RightAssignment_1_2 ) )
            {
            // InternalCNL.g:4823:1: ( ( rule__CompExpression__RightAssignment_1_2 ) )
            // InternalCNL.g:4824:2: ( rule__CompExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getCompExpressionAccess().getRightAssignment_1_2()); 
            // InternalCNL.g:4825:2: ( rule__CompExpression__RightAssignment_1_2 )
            // InternalCNL.g:4825:3: rule__CompExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__CompExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCompExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__CompExpression__Group_1__2__Impl"


    // $ANTLR start "rule__EquExpression__Group__0"
    // InternalCNL.g:4834:1: rule__EquExpression__Group__0 : rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1 ;
    public final void rule__EquExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4838:1: ( rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1 )
            // InternalCNL.g:4839:2: rule__EquExpression__Group__0__Impl rule__EquExpression__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__EquExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EquExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EquExpression__Group__0"


    // $ANTLR start "rule__EquExpression__Group__0__Impl"
    // InternalCNL.g:4846:1: rule__EquExpression__Group__0__Impl : ( ruleUnExpression ) ;
    public final void rule__EquExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4850:1: ( ( ruleUnExpression ) )
            // InternalCNL.g:4851:1: ( ruleUnExpression )
            {
            // InternalCNL.g:4851:1: ( ruleUnExpression )
            // InternalCNL.g:4852:2: ruleUnExpression
            {
             before(grammarAccess.getEquExpressionAccess().getUnExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUnExpression();

            state._fsp--;

             after(grammarAccess.getEquExpressionAccess().getUnExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__EquExpression__Group__0__Impl"


    // $ANTLR start "rule__EquExpression__Group__1"
    // InternalCNL.g:4861:1: rule__EquExpression__Group__1 : rule__EquExpression__Group__1__Impl ;
    public final void rule__EquExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4865:1: ( rule__EquExpression__Group__1__Impl )
            // InternalCNL.g:4866:2: rule__EquExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EquExpression__Group__1"


    // $ANTLR start "rule__EquExpression__Group__1__Impl"
    // InternalCNL.g:4872:1: rule__EquExpression__Group__1__Impl : ( ( rule__EquExpression__Group_1__0 )* ) ;
    public final void rule__EquExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4876:1: ( ( ( rule__EquExpression__Group_1__0 )* ) )
            // InternalCNL.g:4877:1: ( ( rule__EquExpression__Group_1__0 )* )
            {
            // InternalCNL.g:4877:1: ( ( rule__EquExpression__Group_1__0 )* )
            // InternalCNL.g:4878:2: ( rule__EquExpression__Group_1__0 )*
            {
             before(grammarAccess.getEquExpressionAccess().getGroup_1()); 
            // InternalCNL.g:4879:2: ( rule__EquExpression__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=37 && LA33_0<=38)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalCNL.g:4879:3: rule__EquExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__EquExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getEquExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EquExpression__Group__1__Impl"


    // $ANTLR start "rule__EquExpression__Group_1__0"
    // InternalCNL.g:4888:1: rule__EquExpression__Group_1__0 : rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1 ;
    public final void rule__EquExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4892:1: ( rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1 )
            // InternalCNL.g:4893:2: rule__EquExpression__Group_1__0__Impl rule__EquExpression__Group_1__1
            {
            pushFollow(FOLLOW_47);
            rule__EquExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EquExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EquExpression__Group_1__0"


    // $ANTLR start "rule__EquExpression__Group_1__0__Impl"
    // InternalCNL.g:4900:1: rule__EquExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EquExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4904:1: ( ( () ) )
            // InternalCNL.g:4905:1: ( () )
            {
            // InternalCNL.g:4905:1: ( () )
            // InternalCNL.g:4906:2: ()
            {
             before(grammarAccess.getEquExpressionAccess().getEquExpressionLeftAction_1_0()); 
            // InternalCNL.g:4907:2: ()
            // InternalCNL.g:4907:3: 
            {
            }

             after(grammarAccess.getEquExpressionAccess().getEquExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EquExpression__Group_1__0__Impl"


    // $ANTLR start "rule__EquExpression__Group_1__1"
    // InternalCNL.g:4915:1: rule__EquExpression__Group_1__1 : rule__EquExpression__Group_1__1__Impl rule__EquExpression__Group_1__2 ;
    public final void rule__EquExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4919:1: ( rule__EquExpression__Group_1__1__Impl rule__EquExpression__Group_1__2 )
            // InternalCNL.g:4920:2: rule__EquExpression__Group_1__1__Impl rule__EquExpression__Group_1__2
            {
            pushFollow(FOLLOW_38);
            rule__EquExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EquExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EquExpression__Group_1__1"


    // $ANTLR start "rule__EquExpression__Group_1__1__Impl"
    // InternalCNL.g:4927:1: rule__EquExpression__Group_1__1__Impl : ( ( rule__EquExpression__EquOpAssignment_1_1 ) ) ;
    public final void rule__EquExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4931:1: ( ( ( rule__EquExpression__EquOpAssignment_1_1 ) ) )
            // InternalCNL.g:4932:1: ( ( rule__EquExpression__EquOpAssignment_1_1 ) )
            {
            // InternalCNL.g:4932:1: ( ( rule__EquExpression__EquOpAssignment_1_1 ) )
            // InternalCNL.g:4933:2: ( rule__EquExpression__EquOpAssignment_1_1 )
            {
             before(grammarAccess.getEquExpressionAccess().getEquOpAssignment_1_1()); 
            // InternalCNL.g:4934:2: ( rule__EquExpression__EquOpAssignment_1_1 )
            // InternalCNL.g:4934:3: rule__EquExpression__EquOpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__EquOpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEquExpressionAccess().getEquOpAssignment_1_1()); 

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
    // $ANTLR end "rule__EquExpression__Group_1__1__Impl"


    // $ANTLR start "rule__EquExpression__Group_1__2"
    // InternalCNL.g:4942:1: rule__EquExpression__Group_1__2 : rule__EquExpression__Group_1__2__Impl ;
    public final void rule__EquExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4946:1: ( rule__EquExpression__Group_1__2__Impl )
            // InternalCNL.g:4947:2: rule__EquExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EquExpression__Group_1__2"


    // $ANTLR start "rule__EquExpression__Group_1__2__Impl"
    // InternalCNL.g:4953:1: rule__EquExpression__Group_1__2__Impl : ( ( rule__EquExpression__RightAssignment_1_2 ) ) ;
    public final void rule__EquExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4957:1: ( ( ( rule__EquExpression__RightAssignment_1_2 ) ) )
            // InternalCNL.g:4958:1: ( ( rule__EquExpression__RightAssignment_1_2 ) )
            {
            // InternalCNL.g:4958:1: ( ( rule__EquExpression__RightAssignment_1_2 ) )
            // InternalCNL.g:4959:2: ( rule__EquExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getEquExpressionAccess().getRightAssignment_1_2()); 
            // InternalCNL.g:4960:2: ( rule__EquExpression__RightAssignment_1_2 )
            // InternalCNL.g:4960:3: rule__EquExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EquExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEquExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__EquExpression__Group_1__2__Impl"


    // $ANTLR start "rule__UnExpression__Group_1__0"
    // InternalCNL.g:4969:1: rule__UnExpression__Group_1__0 : rule__UnExpression__Group_1__0__Impl rule__UnExpression__Group_1__1 ;
    public final void rule__UnExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4973:1: ( rule__UnExpression__Group_1__0__Impl rule__UnExpression__Group_1__1 )
            // InternalCNL.g:4974:2: rule__UnExpression__Group_1__0__Impl rule__UnExpression__Group_1__1
            {
            pushFollow(FOLLOW_49);
            rule__UnExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnExpression__Group_1__0"


    // $ANTLR start "rule__UnExpression__Group_1__0__Impl"
    // InternalCNL.g:4981:1: rule__UnExpression__Group_1__0__Impl : ( ( rule__UnExpression__UnOpAssignment_1_0 ) ) ;
    public final void rule__UnExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:4985:1: ( ( ( rule__UnExpression__UnOpAssignment_1_0 ) ) )
            // InternalCNL.g:4986:1: ( ( rule__UnExpression__UnOpAssignment_1_0 ) )
            {
            // InternalCNL.g:4986:1: ( ( rule__UnExpression__UnOpAssignment_1_0 ) )
            // InternalCNL.g:4987:2: ( rule__UnExpression__UnOpAssignment_1_0 )
            {
             before(grammarAccess.getUnExpressionAccess().getUnOpAssignment_1_0()); 
            // InternalCNL.g:4988:2: ( rule__UnExpression__UnOpAssignment_1_0 )
            // InternalCNL.g:4988:3: rule__UnExpression__UnOpAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__UnExpression__UnOpAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getUnExpressionAccess().getUnOpAssignment_1_0()); 

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
    // $ANTLR end "rule__UnExpression__Group_1__0__Impl"


    // $ANTLR start "rule__UnExpression__Group_1__1"
    // InternalCNL.g:4996:1: rule__UnExpression__Group_1__1 : rule__UnExpression__Group_1__1__Impl ;
    public final void rule__UnExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5000:1: ( rule__UnExpression__Group_1__1__Impl )
            // InternalCNL.g:5001:2: rule__UnExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnExpression__Group_1__1"


    // $ANTLR start "rule__UnExpression__Group_1__1__Impl"
    // InternalCNL.g:5007:1: rule__UnExpression__Group_1__1__Impl : ( ( rule__UnExpression__RightAssignment_1_1 ) ) ;
    public final void rule__UnExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5011:1: ( ( ( rule__UnExpression__RightAssignment_1_1 ) ) )
            // InternalCNL.g:5012:1: ( ( rule__UnExpression__RightAssignment_1_1 ) )
            {
            // InternalCNL.g:5012:1: ( ( rule__UnExpression__RightAssignment_1_1 ) )
            // InternalCNL.g:5013:2: ( rule__UnExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getUnExpressionAccess().getRightAssignment_1_1()); 
            // InternalCNL.g:5014:2: ( rule__UnExpression__RightAssignment_1_1 )
            // InternalCNL.g:5014:3: rule__UnExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__UnExpression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUnExpressionAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__UnExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TauExpression__Group__0"
    // InternalCNL.g:5023:1: rule__TauExpression__Group__0 : rule__TauExpression__Group__0__Impl rule__TauExpression__Group__1 ;
    public final void rule__TauExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5027:1: ( rule__TauExpression__Group__0__Impl rule__TauExpression__Group__1 )
            // InternalCNL.g:5028:2: rule__TauExpression__Group__0__Impl rule__TauExpression__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__TauExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TauExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TauExpression__Group__0"


    // $ANTLR start "rule__TauExpression__Group__0__Impl"
    // InternalCNL.g:5035:1: rule__TauExpression__Group__0__Impl : ( 'TAU' ) ;
    public final void rule__TauExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5039:1: ( ( 'TAU' ) )
            // InternalCNL.g:5040:1: ( 'TAU' )
            {
            // InternalCNL.g:5040:1: ( 'TAU' )
            // InternalCNL.g:5041:2: 'TAU'
            {
             before(grammarAccess.getTauExpressionAccess().getTAUKeyword_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getTauExpressionAccess().getTAUKeyword_0()); 

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
    // $ANTLR end "rule__TauExpression__Group__0__Impl"


    // $ANTLR start "rule__TauExpression__Group__1"
    // InternalCNL.g:5050:1: rule__TauExpression__Group__1 : rule__TauExpression__Group__1__Impl rule__TauExpression__Group__2 ;
    public final void rule__TauExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5054:1: ( rule__TauExpression__Group__1__Impl rule__TauExpression__Group__2 )
            // InternalCNL.g:5055:2: rule__TauExpression__Group__1__Impl rule__TauExpression__Group__2
            {
            pushFollow(FOLLOW_51);
            rule__TauExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TauExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TauExpression__Group__1"


    // $ANTLR start "rule__TauExpression__Group__1__Impl"
    // InternalCNL.g:5062:1: rule__TauExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__TauExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5066:1: ( ( '(' ) )
            // InternalCNL.g:5067:1: ( '(' )
            {
            // InternalCNL.g:5067:1: ( '(' )
            // InternalCNL.g:5068:2: '('
            {
             before(grammarAccess.getTauExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getTauExpressionAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__TauExpression__Group__1__Impl"


    // $ANTLR start "rule__TauExpression__Group__2"
    // InternalCNL.g:5077:1: rule__TauExpression__Group__2 : rule__TauExpression__Group__2__Impl rule__TauExpression__Group__3 ;
    public final void rule__TauExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5081:1: ( rule__TauExpression__Group__2__Impl rule__TauExpression__Group__3 )
            // InternalCNL.g:5082:2: rule__TauExpression__Group__2__Impl rule__TauExpression__Group__3
            {
            pushFollow(FOLLOW_52);
            rule__TauExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TauExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TauExpression__Group__2"


    // $ANTLR start "rule__TauExpression__Group__2__Impl"
    // InternalCNL.g:5089:1: rule__TauExpression__Group__2__Impl : ( ( rule__TauExpression__TimeAssignment_2 ) ) ;
    public final void rule__TauExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5093:1: ( ( ( rule__TauExpression__TimeAssignment_2 ) ) )
            // InternalCNL.g:5094:1: ( ( rule__TauExpression__TimeAssignment_2 ) )
            {
            // InternalCNL.g:5094:1: ( ( rule__TauExpression__TimeAssignment_2 ) )
            // InternalCNL.g:5095:2: ( rule__TauExpression__TimeAssignment_2 )
            {
             before(grammarAccess.getTauExpressionAccess().getTimeAssignment_2()); 
            // InternalCNL.g:5096:2: ( rule__TauExpression__TimeAssignment_2 )
            // InternalCNL.g:5096:3: rule__TauExpression__TimeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TauExpression__TimeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTauExpressionAccess().getTimeAssignment_2()); 

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
    // $ANTLR end "rule__TauExpression__Group__2__Impl"


    // $ANTLR start "rule__TauExpression__Group__3"
    // InternalCNL.g:5104:1: rule__TauExpression__Group__3 : rule__TauExpression__Group__3__Impl ;
    public final void rule__TauExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5108:1: ( rule__TauExpression__Group__3__Impl )
            // InternalCNL.g:5109:2: rule__TauExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TauExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TauExpression__Group__3"


    // $ANTLR start "rule__TauExpression__Group__3__Impl"
    // InternalCNL.g:5115:1: rule__TauExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__TauExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5119:1: ( ( ')' ) )
            // InternalCNL.g:5120:1: ( ')' )
            {
            // InternalCNL.g:5120:1: ( ')' )
            // InternalCNL.g:5121:2: ')'
            {
             before(grammarAccess.getTauExpressionAccess().getRightParenthesisKeyword_3()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getTauExpressionAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__TauExpression__Group__3__Impl"


    // $ANTLR start "rule__TimeLiteral__Group__0"
    // InternalCNL.g:5131:1: rule__TimeLiteral__Group__0 : rule__TimeLiteral__Group__0__Impl rule__TimeLiteral__Group__1 ;
    public final void rule__TimeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5135:1: ( rule__TimeLiteral__Group__0__Impl rule__TimeLiteral__Group__1 )
            // InternalCNL.g:5136:2: rule__TimeLiteral__Group__0__Impl rule__TimeLiteral__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__TimeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLiteral__Group__0"


    // $ANTLR start "rule__TimeLiteral__Group__0__Impl"
    // InternalCNL.g:5143:1: rule__TimeLiteral__Group__0__Impl : ( ruleTIME_PREF_LITERAL ) ;
    public final void rule__TimeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5147:1: ( ( ruleTIME_PREF_LITERAL ) )
            // InternalCNL.g:5148:1: ( ruleTIME_PREF_LITERAL )
            {
            // InternalCNL.g:5148:1: ( ruleTIME_PREF_LITERAL )
            // InternalCNL.g:5149:2: ruleTIME_PREF_LITERAL
            {
             before(grammarAccess.getTimeLiteralAccess().getTIME_PREF_LITERALParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTIME_PREF_LITERAL();

            state._fsp--;

             after(grammarAccess.getTimeLiteralAccess().getTIME_PREF_LITERALParserRuleCall_0()); 

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
    // $ANTLR end "rule__TimeLiteral__Group__0__Impl"


    // $ANTLR start "rule__TimeLiteral__Group__1"
    // InternalCNL.g:5158:1: rule__TimeLiteral__Group__1 : rule__TimeLiteral__Group__1__Impl ;
    public final void rule__TimeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5162:1: ( rule__TimeLiteral__Group__1__Impl )
            // InternalCNL.g:5163:2: rule__TimeLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLiteral__Group__1"


    // $ANTLR start "rule__TimeLiteral__Group__1__Impl"
    // InternalCNL.g:5169:1: rule__TimeLiteral__Group__1__Impl : ( ( rule__TimeLiteral__IntervalAssignment_1 ) ) ;
    public final void rule__TimeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5173:1: ( ( ( rule__TimeLiteral__IntervalAssignment_1 ) ) )
            // InternalCNL.g:5174:1: ( ( rule__TimeLiteral__IntervalAssignment_1 ) )
            {
            // InternalCNL.g:5174:1: ( ( rule__TimeLiteral__IntervalAssignment_1 ) )
            // InternalCNL.g:5175:2: ( rule__TimeLiteral__IntervalAssignment_1 )
            {
             before(grammarAccess.getTimeLiteralAccess().getIntervalAssignment_1()); 
            // InternalCNL.g:5176:2: ( rule__TimeLiteral__IntervalAssignment_1 )
            // InternalCNL.g:5176:3: rule__TimeLiteral__IntervalAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TimeLiteral__IntervalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeLiteralAccess().getIntervalAssignment_1()); 

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
    // $ANTLR end "rule__TimeLiteral__Group__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__0"
    // InternalCNL.g:5185:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5189:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // InternalCNL.g:5190:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_38);
            rule__PrimaryExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__0"


    // $ANTLR start "rule__PrimaryExpression__Group_3__0__Impl"
    // InternalCNL.g:5197:1: rule__PrimaryExpression__Group_3__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5201:1: ( ( '(' ) )
            // InternalCNL.g:5202:1: ( '(' )
            {
            // InternalCNL.g:5202:1: ( '(' )
            // InternalCNL.g:5203:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_3__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__1"
    // InternalCNL.g:5212:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5216:1: ( rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2 )
            // InternalCNL.g:5217:2: rule__PrimaryExpression__Group_3__1__Impl rule__PrimaryExpression__Group_3__2
            {
            pushFollow(FOLLOW_52);
            rule__PrimaryExpression__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__1"


    // $ANTLR start "rule__PrimaryExpression__Group_3__1__Impl"
    // InternalCNL.g:5224:1: rule__PrimaryExpression__Group_3__1__Impl : ( ( rule__PrimaryExpression__NestExprAssignment_3_1 ) ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5228:1: ( ( ( rule__PrimaryExpression__NestExprAssignment_3_1 ) ) )
            // InternalCNL.g:5229:1: ( ( rule__PrimaryExpression__NestExprAssignment_3_1 ) )
            {
            // InternalCNL.g:5229:1: ( ( rule__PrimaryExpression__NestExprAssignment_3_1 ) )
            // InternalCNL.g:5230:2: ( rule__PrimaryExpression__NestExprAssignment_3_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNestExprAssignment_3_1()); 
            // InternalCNL.g:5231:2: ( rule__PrimaryExpression__NestExprAssignment_3_1 )
            // InternalCNL.g:5231:3: rule__PrimaryExpression__NestExprAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__NestExprAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getNestExprAssignment_3_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_3__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__2"
    // InternalCNL.g:5239:1: rule__PrimaryExpression__Group_3__2 : rule__PrimaryExpression__Group_3__2__Impl ;
    public final void rule__PrimaryExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5243:1: ( rule__PrimaryExpression__Group_3__2__Impl )
            // InternalCNL.g:5244:2: rule__PrimaryExpression__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__2"


    // $ANTLR start "rule__PrimaryExpression__Group_3__2__Impl"
    // InternalCNL.g:5250:1: rule__PrimaryExpression__Group_3__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5254:1: ( ( ')' ) )
            // InternalCNL.g:5255:1: ( ')' )
            {
            // InternalCNL.g:5255:1: ( ')' )
            // InternalCNL.g:5256:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_2()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_2()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_3__2__Impl"


    // $ANTLR start "rule__Model__DeclVarInputAssignment_0"
    // InternalCNL.g:5266:1: rule__Model__DeclVarInputAssignment_0 : ( ruleDeclVarInput ) ;
    public final void rule__Model__DeclVarInputAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5270:1: ( ( ruleDeclVarInput ) )
            // InternalCNL.g:5271:2: ( ruleDeclVarInput )
            {
            // InternalCNL.g:5271:2: ( ruleDeclVarInput )
            // InternalCNL.g:5272:3: ruleDeclVarInput
            {
             before(grammarAccess.getModelAccess().getDeclVarInputDeclVarInputParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclVarInput();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDeclVarInputDeclVarInputParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__DeclVarInputAssignment_0"


    // $ANTLR start "rule__Model__DeclVarOutputAssignment_1"
    // InternalCNL.g:5281:1: rule__Model__DeclVarOutputAssignment_1 : ( ruleDeclVarOutput ) ;
    public final void rule__Model__DeclVarOutputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5285:1: ( ( ruleDeclVarOutput ) )
            // InternalCNL.g:5286:2: ( ruleDeclVarOutput )
            {
            // InternalCNL.g:5286:2: ( ruleDeclVarOutput )
            // InternalCNL.g:5287:3: ruleDeclVarOutput
            {
             before(grammarAccess.getModelAccess().getDeclVarOutputDeclVarOutputParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclVarOutput();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDeclVarOutputDeclVarOutputParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__DeclVarOutputAssignment_1"


    // $ANTLR start "rule__Model__SentDeclarationAssignment_2"
    // InternalCNL.g:5296:1: rule__Model__SentDeclarationAssignment_2 : ( ruleSentDeclaration ) ;
    public final void rule__Model__SentDeclarationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5300:1: ( ( ruleSentDeclaration ) )
            // InternalCNL.g:5301:2: ( ruleSentDeclaration )
            {
            // InternalCNL.g:5301:2: ( ruleSentDeclaration )
            // InternalCNL.g:5302:3: ruleSentDeclaration
            {
             before(grammarAccess.getModelAccess().getSentDeclarationSentDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSentDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSentDeclarationSentDeclarationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__SentDeclarationAssignment_2"


    // $ANTLR start "rule__Model__ReqDeclarationAssignment_3"
    // InternalCNL.g:5311:1: rule__Model__ReqDeclarationAssignment_3 : ( ruleReqDeclaration ) ;
    public final void rule__Model__ReqDeclarationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5315:1: ( ( ruleReqDeclaration ) )
            // InternalCNL.g:5316:2: ( ruleReqDeclaration )
            {
            // InternalCNL.g:5316:2: ( ruleReqDeclaration )
            // InternalCNL.g:5317:3: ruleReqDeclaration
            {
             before(grammarAccess.getModelAccess().getReqDeclarationReqDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReqDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getReqDeclarationReqDeclarationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Model__ReqDeclarationAssignment_3"


    // $ANTLR start "rule__ReqDeclaration__NameAssignment_1"
    // InternalCNL.g:5326:1: rule__ReqDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ReqDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5330:1: ( ( RULE_ID ) )
            // InternalCNL.g:5331:2: ( RULE_ID )
            {
            // InternalCNL.g:5331:2: ( RULE_ID )
            // InternalCNL.g:5332:3: RULE_ID
            {
             before(grammarAccess.getReqDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReqDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ReqDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ReqDeclaration__RequirementAssignment_2"
    // InternalCNL.g:5341:1: rule__ReqDeclaration__RequirementAssignment_2 : ( ruleRequirement ) ;
    public final void rule__ReqDeclaration__RequirementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5345:1: ( ( ruleRequirement ) )
            // InternalCNL.g:5346:2: ( ruleRequirement )
            {
            // InternalCNL.g:5346:2: ( ruleRequirement )
            // InternalCNL.g:5347:3: ruleRequirement
            {
             before(grammarAccess.getReqDeclarationAccess().getRequirementRequirementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirement();

            state._fsp--;

             after(grammarAccess.getReqDeclarationAccess().getRequirementRequirementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ReqDeclaration__RequirementAssignment_2"


    // $ANTLR start "rule__Requirement__TriggerAssignment_0_0"
    // InternalCNL.g:5356:1: rule__Requirement__TriggerAssignment_0_0 : ( ruleTrig ) ;
    public final void rule__Requirement__TriggerAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5360:1: ( ( ruleTrig ) )
            // InternalCNL.g:5361:2: ( ruleTrig )
            {
            // InternalCNL.g:5361:2: ( ruleTrig )
            // InternalCNL.g:5362:3: ruleTrig
            {
             before(grammarAccess.getRequirementAccess().getTriggerTrigParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTrig();

            state._fsp--;

             after(grammarAccess.getRequirementAccess().getTriggerTrigParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Requirement__TriggerAssignment_0_0"


    // $ANTLR start "rule__Requirement__InvariantAssignment_0_1"
    // InternalCNL.g:5371:1: rule__Requirement__InvariantAssignment_0_1 : ( ruleInv_always ) ;
    public final void rule__Requirement__InvariantAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5375:1: ( ( ruleInv_always ) )
            // InternalCNL.g:5376:2: ( ruleInv_always )
            {
            // InternalCNL.g:5376:2: ( ruleInv_always )
            // InternalCNL.g:5377:3: ruleInv_always
            {
             before(grammarAccess.getRequirementAccess().getInvariantInv_alwaysParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInv_always();

            state._fsp--;

             after(grammarAccess.getRequirementAccess().getInvariantInv_alwaysParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Requirement__InvariantAssignment_0_1"


    // $ANTLR start "rule__Trig__TrigAssignment_0_0_1_1"
    // InternalCNL.g:5386:1: rule__Trig__TrigAssignment_0_0_1_1 : ( ruleSentence ) ;
    public final void rule__Trig__TrigAssignment_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5390:1: ( ( ruleSentence ) )
            // InternalCNL.g:5391:2: ( ruleSentence )
            {
            // InternalCNL.g:5391:2: ( ruleSentence )
            // InternalCNL.g:5392:3: ruleSentence
            {
             before(grammarAccess.getTrigAccess().getTrigSentenceParserRuleCall_0_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getTrigAccess().getTrigSentenceParserRuleCall_0_0_1_1_0()); 

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
    // $ANTLR end "rule__Trig__TrigAssignment_0_0_1_1"


    // $ANTLR start "rule__Trig__InvariantAssignment_1_0"
    // InternalCNL.g:5401:1: rule__Trig__InvariantAssignment_1_0 : ( ruleInv ) ;
    public final void rule__Trig__InvariantAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5405:1: ( ( ruleInv ) )
            // InternalCNL.g:5406:2: ( ruleInv )
            {
            // InternalCNL.g:5406:2: ( ruleInv )
            // InternalCNL.g:5407:3: ruleInv
            {
             before(grammarAccess.getTrigAccess().getInvariantInvParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInv();

            state._fsp--;

             after(grammarAccess.getTrigAccess().getInvariantInvParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Trig__InvariantAssignment_1_0"


    // $ANTLR start "rule__Trig__Release_reactionAssignment_1_1"
    // InternalCNL.g:5416:1: rule__Trig__Release_reactionAssignment_1_1 : ( ruleRelRea ) ;
    public final void rule__Trig__Release_reactionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5420:1: ( ( ruleRelRea ) )
            // InternalCNL.g:5421:2: ( ruleRelRea )
            {
            // InternalCNL.g:5421:2: ( ruleRelRea )
            // InternalCNL.g:5422:3: ruleRelRea
            {
             before(grammarAccess.getTrigAccess().getRelease_reactionRelReaParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelRea();

            state._fsp--;

             after(grammarAccess.getTrigAccess().getRelease_reactionRelReaParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Trig__Release_reactionAssignment_1_1"


    // $ANTLR start "rule__Trig__Delay_finalAssignment_1_2"
    // InternalCNL.g:5431:1: rule__Trig__Delay_finalAssignment_1_2 : ( ruleDelFin ) ;
    public final void rule__Trig__Delay_finalAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5435:1: ( ( ruleDelFin ) )
            // InternalCNL.g:5436:2: ( ruleDelFin )
            {
            // InternalCNL.g:5436:2: ( ruleDelFin )
            // InternalCNL.g:5437:3: ruleDelFin
            {
             before(grammarAccess.getTrigAccess().getDelay_finalDelFinParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDelFin();

            state._fsp--;

             after(grammarAccess.getTrigAccess().getDelay_finalDelFinParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Trig__Delay_finalAssignment_1_2"


    // $ANTLR start "rule__Inv__InvAssignment_1"
    // InternalCNL.g:5446:1: rule__Inv__InvAssignment_1 : ( ruleSentence ) ;
    public final void rule__Inv__InvAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5450:1: ( ( ruleSentence ) )
            // InternalCNL.g:5451:2: ( ruleSentence )
            {
            // InternalCNL.g:5451:2: ( ruleSentence )
            // InternalCNL.g:5452:3: ruleSentence
            {
             before(grammarAccess.getInvAccess().getInvSentenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getInvAccess().getInvSentenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Inv__InvAssignment_1"


    // $ANTLR start "rule__Inv__Delay_finalAssignment_2_0_1"
    // InternalCNL.g:5461:1: rule__Inv__Delay_finalAssignment_2_0_1 : ( ruleDelFin ) ;
    public final void rule__Inv__Delay_finalAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5465:1: ( ( ruleDelFin ) )
            // InternalCNL.g:5466:2: ( ruleDelFin )
            {
            // InternalCNL.g:5466:2: ( ruleDelFin )
            // InternalCNL.g:5467:3: ruleDelFin
            {
             before(grammarAccess.getInvAccess().getDelay_finalDelFinParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDelFin();

            state._fsp--;

             after(grammarAccess.getInvAccess().getDelay_finalDelFinParserRuleCall_2_0_1_0()); 

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
    // $ANTLR end "rule__Inv__Delay_finalAssignment_2_0_1"


    // $ANTLR start "rule__Inv__Release_reactionAssignment_2_1_4"
    // InternalCNL.g:5476:1: rule__Inv__Release_reactionAssignment_2_1_4 : ( ruleRelRea ) ;
    public final void rule__Inv__Release_reactionAssignment_2_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5480:1: ( ( ruleRelRea ) )
            // InternalCNL.g:5481:2: ( ruleRelRea )
            {
            // InternalCNL.g:5481:2: ( ruleRelRea )
            // InternalCNL.g:5482:3: ruleRelRea
            {
             before(grammarAccess.getInvAccess().getRelease_reactionRelReaParserRuleCall_2_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRelRea();

            state._fsp--;

             after(grammarAccess.getInvAccess().getRelease_reactionRelReaParserRuleCall_2_1_4_0()); 

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
    // $ANTLR end "rule__Inv__Release_reactionAssignment_2_1_4"


    // $ANTLR start "rule__Inv_always__InvAssignment_1_0"
    // InternalCNL.g:5491:1: rule__Inv_always__InvAssignment_1_0 : ( ruleSentence ) ;
    public final void rule__Inv_always__InvAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5495:1: ( ( ruleSentence ) )
            // InternalCNL.g:5496:2: ( ruleSentence )
            {
            // InternalCNL.g:5496:2: ( ruleSentence )
            // InternalCNL.g:5497:3: ruleSentence
            {
             before(grammarAccess.getInv_alwaysAccess().getInvSentenceParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getInv_alwaysAccess().getInvSentenceParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Inv_always__InvAssignment_1_0"


    // $ANTLR start "rule__Inv_always__Release_reactionAssignment_1_6"
    // InternalCNL.g:5506:1: rule__Inv_always__Release_reactionAssignment_1_6 : ( ruleRelRea ) ;
    public final void rule__Inv_always__Release_reactionAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5510:1: ( ( ruleRelRea ) )
            // InternalCNL.g:5511:2: ( ruleRelRea )
            {
            // InternalCNL.g:5511:2: ( ruleRelRea )
            // InternalCNL.g:5512:3: ruleRelRea
            {
             before(grammarAccess.getInv_alwaysAccess().getRelease_reactionRelReaParserRuleCall_1_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRelRea();

            state._fsp--;

             after(grammarAccess.getInv_alwaysAccess().getRelease_reactionRelReaParserRuleCall_1_6_0()); 

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
    // $ANTLR end "rule__Inv_always__Release_reactionAssignment_1_6"


    // $ANTLR start "rule__RelRea__RelAssignment_0_2"
    // InternalCNL.g:5521:1: rule__RelRea__RelAssignment_0_2 : ( ruleSentence ) ;
    public final void rule__RelRea__RelAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5525:1: ( ( ruleSentence ) )
            // InternalCNL.g:5526:2: ( ruleSentence )
            {
            // InternalCNL.g:5526:2: ( ruleSentence )
            // InternalCNL.g:5527:3: ruleSentence
            {
             before(grammarAccess.getRelReaAccess().getRelSentenceParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getRelSentenceParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__RelRea__RelAssignment_0_2"


    // $ANTLR start "rule__RelRea__ReactionAssignment_0_4"
    // InternalCNL.g:5536:1: rule__RelRea__ReactionAssignment_0_4 : ( ruleReaction ) ;
    public final void rule__RelRea__ReactionAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5540:1: ( ( ruleReaction ) )
            // InternalCNL.g:5541:2: ( ruleReaction )
            {
            // InternalCNL.g:5541:2: ( ruleReaction )
            // InternalCNL.g:5542:3: ruleReaction
            {
             before(grammarAccess.getRelReaAccess().getReactionReactionParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleReaction();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getReactionReactionParserRuleCall_0_4_0()); 

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
    // $ANTLR end "rule__RelRea__ReactionAssignment_0_4"


    // $ANTLR start "rule__RelRea__Delay_finalAssignment_0_5_1"
    // InternalCNL.g:5551:1: rule__RelRea__Delay_finalAssignment_0_5_1 : ( ruleDelFin ) ;
    public final void rule__RelRea__Delay_finalAssignment_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5555:1: ( ( ruleDelFin ) )
            // InternalCNL.g:5556:2: ( ruleDelFin )
            {
            // InternalCNL.g:5556:2: ( ruleDelFin )
            // InternalCNL.g:5557:3: ruleDelFin
            {
             before(grammarAccess.getRelReaAccess().getDelay_finalDelFinParserRuleCall_0_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDelFin();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getDelay_finalDelFinParserRuleCall_0_5_1_0()); 

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
    // $ANTLR end "rule__RelRea__Delay_finalAssignment_0_5_1"


    // $ANTLR start "rule__RelRea__RelAssignment_1_1"
    // InternalCNL.g:5566:1: rule__RelRea__RelAssignment_1_1 : ( ruleSentence ) ;
    public final void rule__RelRea__RelAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5570:1: ( ( ruleSentence ) )
            // InternalCNL.g:5571:2: ( ruleSentence )
            {
            // InternalCNL.g:5571:2: ( ruleSentence )
            // InternalCNL.g:5572:3: ruleSentence
            {
             before(grammarAccess.getRelReaAccess().getRelSentenceParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getRelSentenceParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__RelRea__RelAssignment_1_1"


    // $ANTLR start "rule__RelRea__ReactionAssignment_2_1_0"
    // InternalCNL.g:5581:1: rule__RelRea__ReactionAssignment_2_1_0 : ( ruleReaction ) ;
    public final void rule__RelRea__ReactionAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5585:1: ( ( ruleReaction ) )
            // InternalCNL.g:5586:2: ( ruleReaction )
            {
            // InternalCNL.g:5586:2: ( ruleReaction )
            // InternalCNL.g:5587:3: ruleReaction
            {
             before(grammarAccess.getRelReaAccess().getReactionReactionParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleReaction();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getReactionReactionParserRuleCall_2_1_0_0()); 

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
    // $ANTLR end "rule__RelRea__ReactionAssignment_2_1_0"


    // $ANTLR start "rule__RelRea__Delay_finalAssignment_2_1_1_1"
    // InternalCNL.g:5596:1: rule__RelRea__Delay_finalAssignment_2_1_1_1 : ( ruleDelFin ) ;
    public final void rule__RelRea__Delay_finalAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5600:1: ( ( ruleDelFin ) )
            // InternalCNL.g:5601:2: ( ruleDelFin )
            {
            // InternalCNL.g:5601:2: ( ruleDelFin )
            // InternalCNL.g:5602:3: ruleDelFin
            {
             before(grammarAccess.getRelReaAccess().getDelay_finalDelFinParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDelFin();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getDelay_finalDelFinParserRuleCall_2_1_1_1_0()); 

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
    // $ANTLR end "rule__RelRea__Delay_finalAssignment_2_1_1_1"


    // $ANTLR start "rule__RelRea__ReaAssignment_3_1_3"
    // InternalCNL.g:5611:1: rule__RelRea__ReaAssignment_3_1_3 : ( ruleSentence ) ;
    public final void rule__RelRea__ReaAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5615:1: ( ( ruleSentence ) )
            // InternalCNL.g:5616:2: ( ruleSentence )
            {
            // InternalCNL.g:5616:2: ( ruleSentence )
            // InternalCNL.g:5617:3: ruleSentence
            {
             before(grammarAccess.getRelReaAccess().getReaSentenceParserRuleCall_3_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getReaSentenceParserRuleCall_3_1_3_0()); 

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
    // $ANTLR end "rule__RelRea__ReaAssignment_3_1_3"


    // $ANTLR start "rule__RelRea__Delay_finalAssignment_3_1_4_1"
    // InternalCNL.g:5626:1: rule__RelRea__Delay_finalAssignment_3_1_4_1 : ( ruleDelFin ) ;
    public final void rule__RelRea__Delay_finalAssignment_3_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5630:1: ( ( ruleDelFin ) )
            // InternalCNL.g:5631:2: ( ruleDelFin )
            {
            // InternalCNL.g:5631:2: ( ruleDelFin )
            // InternalCNL.g:5632:3: ruleDelFin
            {
             before(grammarAccess.getRelReaAccess().getDelay_finalDelFinParserRuleCall_3_1_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDelFin();

            state._fsp--;

             after(grammarAccess.getRelReaAccess().getDelay_finalDelFinParserRuleCall_3_1_4_1_0()); 

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
    // $ANTLR end "rule__RelRea__Delay_finalAssignment_3_1_4_1"


    // $ANTLR start "rule__Reaction__ReaAssignment_3"
    // InternalCNL.g:5641:1: rule__Reaction__ReaAssignment_3 : ( ruleSentence ) ;
    public final void rule__Reaction__ReaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5645:1: ( ( ruleSentence ) )
            // InternalCNL.g:5646:2: ( ruleSentence )
            {
            // InternalCNL.g:5646:2: ( ruleSentence )
            // InternalCNL.g:5647:3: ruleSentence
            {
             before(grammarAccess.getReactionAccess().getReaSentenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getReactionAccess().getReaSentenceParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Reaction__ReaAssignment_3"


    // $ANTLR start "rule__DelFin__DelayAssignment_1_0_1_0_0"
    // InternalCNL.g:5656:1: rule__DelFin__DelayAssignment_1_0_1_0_0 : ( ruleDelay ) ;
    public final void rule__DelFin__DelayAssignment_1_0_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5660:1: ( ( ruleDelay ) )
            // InternalCNL.g:5661:2: ( ruleDelay )
            {
            // InternalCNL.g:5661:2: ( ruleDelay )
            // InternalCNL.g:5662:3: ruleDelay
            {
             before(grammarAccess.getDelFinAccess().getDelayDelayParserRuleCall_1_0_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDelay();

            state._fsp--;

             after(grammarAccess.getDelFinAccess().getDelayDelayParserRuleCall_1_0_1_0_0_0()); 

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
    // $ANTLR end "rule__DelFin__DelayAssignment_1_0_1_0_0"


    // $ANTLR start "rule__DelFin__FinAssignment_1_0_1_0_1_1"
    // InternalCNL.g:5671:1: rule__DelFin__FinAssignment_1_0_1_0_1_1 : ( ruleSentence ) ;
    public final void rule__DelFin__FinAssignment_1_0_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5675:1: ( ( ruleSentence ) )
            // InternalCNL.g:5676:2: ( ruleSentence )
            {
            // InternalCNL.g:5676:2: ( ruleSentence )
            // InternalCNL.g:5677:3: ruleSentence
            {
             before(grammarAccess.getDelFinAccess().getFinSentenceParserRuleCall_1_0_1_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getDelFinAccess().getFinSentenceParserRuleCall_1_0_1_0_1_1_0()); 

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
    // $ANTLR end "rule__DelFin__FinAssignment_1_0_1_0_1_1"


    // $ANTLR start "rule__DelFin__FinAssignment_1_0_1_1_2"
    // InternalCNL.g:5686:1: rule__DelFin__FinAssignment_1_0_1_1_2 : ( ruleSentence ) ;
    public final void rule__DelFin__FinAssignment_1_0_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5690:1: ( ( ruleSentence ) )
            // InternalCNL.g:5691:2: ( ruleSentence )
            {
            // InternalCNL.g:5691:2: ( ruleSentence )
            // InternalCNL.g:5692:3: ruleSentence
            {
             before(grammarAccess.getDelFinAccess().getFinSentenceParserRuleCall_1_0_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getDelFinAccess().getFinSentenceParserRuleCall_1_0_1_1_2_0()); 

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
    // $ANTLR end "rule__DelFin__FinAssignment_1_0_1_1_2"


    // $ANTLR start "rule__DelFin__FinAssignment_1_1"
    // InternalCNL.g:5701:1: rule__DelFin__FinAssignment_1_1 : ( ruleSentence ) ;
    public final void rule__DelFin__FinAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5705:1: ( ( ruleSentence ) )
            // InternalCNL.g:5706:2: ( ruleSentence )
            {
            // InternalCNL.g:5706:2: ( ruleSentence )
            // InternalCNL.g:5707:3: ruleSentence
            {
             before(grammarAccess.getDelFinAccess().getFinSentenceParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getDelFinAccess().getFinSentenceParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__DelFin__FinAssignment_1_1"


    // $ANTLR start "rule__Delay__DelAssignment_2"
    // InternalCNL.g:5716:1: rule__Delay__DelAssignment_2 : ( ruleSentence ) ;
    public final void rule__Delay__DelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5720:1: ( ( ruleSentence ) )
            // InternalCNL.g:5721:2: ( ruleSentence )
            {
            // InternalCNL.g:5721:2: ( ruleSentence )
            // InternalCNL.g:5722:3: ruleSentence
            {
             before(grammarAccess.getDelayAccess().getDelSentenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getDelayAccess().getDelSentenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Delay__DelAssignment_2"


    // $ANTLR start "rule__Sentence__NameAssignment_1"
    // InternalCNL.g:5731:1: rule__Sentence__NameAssignment_1 : ( ruleID_or_INTEGER ) ;
    public final void rule__Sentence__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5735:1: ( ( ruleID_or_INTEGER ) )
            // InternalCNL.g:5736:2: ( ruleID_or_INTEGER )
            {
            // InternalCNL.g:5736:2: ( ruleID_or_INTEGER )
            // InternalCNL.g:5737:3: ruleID_or_INTEGER
            {
             before(grammarAccess.getSentenceAccess().getNameID_or_INTEGERParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleID_or_INTEGER();

            state._fsp--;

             after(grammarAccess.getSentenceAccess().getNameID_or_INTEGERParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Sentence__NameAssignment_1"


    // $ANTLR start "rule__DeclVarInput__VarDeclsAssignment_2_0"
    // InternalCNL.g:5746:1: rule__DeclVarInput__VarDeclsAssignment_2_0 : ( ruleVarDeclaration ) ;
    public final void rule__DeclVarInput__VarDeclsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5750:1: ( ( ruleVarDeclaration ) )
            // InternalCNL.g:5751:2: ( ruleVarDeclaration )
            {
            // InternalCNL.g:5751:2: ( ruleVarDeclaration )
            // InternalCNL.g:5752:3: ruleVarDeclaration
            {
             before(grammarAccess.getDeclVarInputAccess().getVarDeclsVarDeclarationParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclVarInputAccess().getVarDeclsVarDeclarationParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__DeclVarInput__VarDeclsAssignment_2_0"


    // $ANTLR start "rule__DeclVarOutput__VarDeclsAssignment_2_0"
    // InternalCNL.g:5761:1: rule__DeclVarOutput__VarDeclsAssignment_2_0 : ( ruleVarDeclaration ) ;
    public final void rule__DeclVarOutput__VarDeclsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5765:1: ( ( ruleVarDeclaration ) )
            // InternalCNL.g:5766:2: ( ruleVarDeclaration )
            {
            // InternalCNL.g:5766:2: ( ruleVarDeclaration )
            // InternalCNL.g:5767:3: ruleVarDeclaration
            {
             before(grammarAccess.getDeclVarOutputAccess().getVarDeclsVarDeclarationParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclVarOutputAccess().getVarDeclsVarDeclarationParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__DeclVarOutput__VarDeclsAssignment_2_0"


    // $ANTLR start "rule__VarDeclaration__NameAssignment_0"
    // InternalCNL.g:5776:1: rule__VarDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VarDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5780:1: ( ( RULE_ID ) )
            // InternalCNL.g:5781:2: ( RULE_ID )
            {
            // InternalCNL.g:5781:2: ( RULE_ID )
            // InternalCNL.g:5782:3: RULE_ID
            {
             before(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__VarDeclaration__NameAssignment_0"


    // $ANTLR start "rule__VarDeclaration__TypeAssignment_2"
    // InternalCNL.g:5791:1: rule__VarDeclaration__TypeAssignment_2 : ( ruleVariableType ) ;
    public final void rule__VarDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5795:1: ( ( ruleVariableType ) )
            // InternalCNL.g:5796:2: ( ruleVariableType )
            {
            // InternalCNL.g:5796:2: ( ruleVariableType )
            // InternalCNL.g:5797:3: ruleVariableType
            {
             before(grammarAccess.getVarDeclarationAccess().getTypeVariableTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableType();

            state._fsp--;

             after(grammarAccess.getVarDeclarationAccess().getTypeVariableTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__VarDeclaration__TypeAssignment_2"


    // $ANTLR start "rule__SentDeclaration__NameAssignment_2"
    // InternalCNL.g:5806:1: rule__SentDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SentDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5810:1: ( ( RULE_ID ) )
            // InternalCNL.g:5811:2: ( RULE_ID )
            {
            // InternalCNL.g:5811:2: ( RULE_ID )
            // InternalCNL.g:5812:3: RULE_ID
            {
             before(grammarAccess.getSentDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSentDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__SentDeclaration__NameAssignment_2"


    // $ANTLR start "rule__SentDeclaration__SentenceDeclarationAssignment_3"
    // InternalCNL.g:5821:1: rule__SentDeclaration__SentenceDeclarationAssignment_3 : ( ruleSentenceDeclaration ) ;
    public final void rule__SentDeclaration__SentenceDeclarationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5825:1: ( ( ruleSentenceDeclaration ) )
            // InternalCNL.g:5826:2: ( ruleSentenceDeclaration )
            {
            // InternalCNL.g:5826:2: ( ruleSentenceDeclaration )
            // InternalCNL.g:5827:3: ruleSentenceDeclaration
            {
             before(grammarAccess.getSentDeclarationAccess().getSentenceDeclarationSentenceDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSentenceDeclaration();

            state._fsp--;

             after(grammarAccess.getSentDeclarationAccess().getSentenceDeclarationSentenceDeclarationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SentDeclaration__SentenceDeclarationAssignment_3"


    // $ANTLR start "rule__SentenceDeclaration__NameAssignment_1"
    // InternalCNL.g:5836:1: rule__SentenceDeclaration__NameAssignment_1 : ( ruleSentence ) ;
    public final void rule__SentenceDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5840:1: ( ( ruleSentence ) )
            // InternalCNL.g:5841:2: ( ruleSentence )
            {
            // InternalCNL.g:5841:2: ( ruleSentence )
            // InternalCNL.g:5842:3: ruleSentence
            {
             before(grammarAccess.getSentenceDeclarationAccess().getNameSentenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getSentenceDeclarationAccess().getNameSentenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SentenceDeclaration__NameAssignment_1"


    // $ANTLR start "rule__SentenceDeclaration__LogicExpressionAssignment_3"
    // InternalCNL.g:5851:1: rule__SentenceDeclaration__LogicExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__SentenceDeclaration__LogicExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5855:1: ( ( ruleExpression ) )
            // InternalCNL.g:5856:2: ( ruleExpression )
            {
            // InternalCNL.g:5856:2: ( ruleExpression )
            // InternalCNL.g:5857:3: ruleExpression
            {
             before(grammarAccess.getSentenceDeclarationAccess().getLogicExpressionExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSentenceDeclarationAccess().getLogicExpressionExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SentenceDeclaration__LogicExpressionAssignment_3"


    // $ANTLR start "rule__Expression__OrOpAssignment_1_1"
    // InternalCNL.g:5866:1: rule__Expression__OrOpAssignment_1_1 : ( RULE_OR_OPERATOR ) ;
    public final void rule__Expression__OrOpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5870:1: ( ( RULE_OR_OPERATOR ) )
            // InternalCNL.g:5871:2: ( RULE_OR_OPERATOR )
            {
            // InternalCNL.g:5871:2: ( RULE_OR_OPERATOR )
            // InternalCNL.g:5872:3: RULE_OR_OPERATOR
            {
             before(grammarAccess.getExpressionAccess().getOrOpOR_OPERATORTerminalRuleCall_1_1_0()); 
            match(input,RULE_OR_OPERATOR,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getOrOpOR_OPERATORTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Expression__OrOpAssignment_1_1"


    // $ANTLR start "rule__Expression__RightAssignment_1_2"
    // InternalCNL.g:5881:1: rule__Expression__RightAssignment_1_2 : ( ruleXorExpression ) ;
    public final void rule__Expression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5885:1: ( ( ruleXorExpression ) )
            // InternalCNL.g:5886:2: ( ruleXorExpression )
            {
            // InternalCNL.g:5886:2: ( ruleXorExpression )
            // InternalCNL.g:5887:3: ruleXorExpression
            {
             before(grammarAccess.getExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXorExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0()); 

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


    // $ANTLR start "rule__XorExpression__RightAssignment_1_2"
    // InternalCNL.g:5896:1: rule__XorExpression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__XorExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5900:1: ( ( ruleAndExpression ) )
            // InternalCNL.g:5901:2: ( ruleAndExpression )
            {
            // InternalCNL.g:5901:2: ( ruleAndExpression )
            // InternalCNL.g:5902:3: ruleAndExpression
            {
             before(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__XorExpression__RightAssignment_1_2"


    // $ANTLR start "rule__AndExpression__AndOpAssignment_1_1"
    // InternalCNL.g:5911:1: rule__AndExpression__AndOpAssignment_1_1 : ( ruleAND_OPERATOR ) ;
    public final void rule__AndExpression__AndOpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5915:1: ( ( ruleAND_OPERATOR ) )
            // InternalCNL.g:5916:2: ( ruleAND_OPERATOR )
            {
            // InternalCNL.g:5916:2: ( ruleAND_OPERATOR )
            // InternalCNL.g:5917:3: ruleAND_OPERATOR
            {
             before(grammarAccess.getAndExpressionAccess().getAndOpAND_OPERATORParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAND_OPERATOR();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getAndOpAND_OPERATORParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__AndExpression__AndOpAssignment_1_1"


    // $ANTLR start "rule__AndExpression__RightAssignment_1_2"
    // InternalCNL.g:5926:1: rule__AndExpression__RightAssignment_1_2 : ( ruleCompExpression ) ;
    public final void rule__AndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5930:1: ( ( ruleCompExpression ) )
            // InternalCNL.g:5931:2: ( ruleCompExpression )
            {
            // InternalCNL.g:5931:2: ( ruleCompExpression )
            // InternalCNL.g:5932:3: ruleCompExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRightCompExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCompExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getRightCompExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__AndExpression__RightAssignment_1_2"


    // $ANTLR start "rule__CompExpression__CompOpAssignment_1_1"
    // InternalCNL.g:5941:1: rule__CompExpression__CompOpAssignment_1_1 : ( ruleCompOperator ) ;
    public final void rule__CompExpression__CompOpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5945:1: ( ( ruleCompOperator ) )
            // InternalCNL.g:5946:2: ( ruleCompOperator )
            {
            // InternalCNL.g:5946:2: ( ruleCompOperator )
            // InternalCNL.g:5947:3: ruleCompOperator
            {
             before(grammarAccess.getCompExpressionAccess().getCompOpCompOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompOperator();

            state._fsp--;

             after(grammarAccess.getCompExpressionAccess().getCompOpCompOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__CompExpression__CompOpAssignment_1_1"


    // $ANTLR start "rule__CompExpression__RightAssignment_1_2"
    // InternalCNL.g:5956:1: rule__CompExpression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__CompExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5960:1: ( ( ruleAndExpression ) )
            // InternalCNL.g:5961:2: ( ruleAndExpression )
            {
            // InternalCNL.g:5961:2: ( ruleAndExpression )
            // InternalCNL.g:5962:3: ruleAndExpression
            {
             before(grammarAccess.getCompExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getCompExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__CompExpression__RightAssignment_1_2"


    // $ANTLR start "rule__EquExpression__EquOpAssignment_1_1"
    // InternalCNL.g:5971:1: rule__EquExpression__EquOpAssignment_1_1 : ( ruleEquOperator ) ;
    public final void rule__EquExpression__EquOpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5975:1: ( ( ruleEquOperator ) )
            // InternalCNL.g:5976:2: ( ruleEquOperator )
            {
            // InternalCNL.g:5976:2: ( ruleEquOperator )
            // InternalCNL.g:5977:3: ruleEquOperator
            {
             before(grammarAccess.getEquExpressionAccess().getEquOpEquOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEquOperator();

            state._fsp--;

             after(grammarAccess.getEquExpressionAccess().getEquOpEquOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__EquExpression__EquOpAssignment_1_1"


    // $ANTLR start "rule__EquExpression__RightAssignment_1_2"
    // InternalCNL.g:5986:1: rule__EquExpression__RightAssignment_1_2 : ( ruleUnExpression ) ;
    public final void rule__EquExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:5990:1: ( ( ruleUnExpression ) )
            // InternalCNL.g:5991:2: ( ruleUnExpression )
            {
            // InternalCNL.g:5991:2: ( ruleUnExpression )
            // InternalCNL.g:5992:3: ruleUnExpression
            {
             before(grammarAccess.getEquExpressionAccess().getRightUnExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnExpression();

            state._fsp--;

             after(grammarAccess.getEquExpressionAccess().getRightUnExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__EquExpression__RightAssignment_1_2"


    // $ANTLR start "rule__UnExpression__UnOpAssignment_1_0"
    // InternalCNL.g:6001:1: rule__UnExpression__UnOpAssignment_1_0 : ( ruleUnOperator ) ;
    public final void rule__UnExpression__UnOpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:6005:1: ( ( ruleUnOperator ) )
            // InternalCNL.g:6006:2: ( ruleUnOperator )
            {
            // InternalCNL.g:6006:2: ( ruleUnOperator )
            // InternalCNL.g:6007:3: ruleUnOperator
            {
             before(grammarAccess.getUnExpressionAccess().getUnOpUnOperatorParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnOperator();

            state._fsp--;

             after(grammarAccess.getUnExpressionAccess().getUnOpUnOperatorParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__UnExpression__UnOpAssignment_1_0"


    // $ANTLR start "rule__UnExpression__RightAssignment_1_1"
    // InternalCNL.g:6016:1: rule__UnExpression__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__UnExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:6020:1: ( ( rulePrimaryExpression ) )
            // InternalCNL.g:6021:2: ( rulePrimaryExpression )
            {
            // InternalCNL.g:6021:2: ( rulePrimaryExpression )
            // InternalCNL.g:6022:3: rulePrimaryExpression
            {
             before(grammarAccess.getUnExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getUnExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__UnExpression__RightAssignment_1_1"


    // $ANTLR start "rule__TauExpression__TimeAssignment_2"
    // InternalCNL.g:6031:1: rule__TauExpression__TimeAssignment_2 : ( ruleTimeLiteral ) ;
    public final void rule__TauExpression__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:6035:1: ( ( ruleTimeLiteral ) )
            // InternalCNL.g:6036:2: ( ruleTimeLiteral )
            {
            // InternalCNL.g:6036:2: ( ruleTimeLiteral )
            // InternalCNL.g:6037:3: ruleTimeLiteral
            {
             before(grammarAccess.getTauExpressionAccess().getTimeTimeLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeLiteral();

            state._fsp--;

             after(grammarAccess.getTauExpressionAccess().getTimeTimeLiteralParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TauExpression__TimeAssignment_2"


    // $ANTLR start "rule__TimeLiteral__IntervalAssignment_1"
    // InternalCNL.g:6046:1: rule__TimeLiteral__IntervalAssignment_1 : ( RULE_INTERVAL ) ;
    public final void rule__TimeLiteral__IntervalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:6050:1: ( ( RULE_INTERVAL ) )
            // InternalCNL.g:6051:2: ( RULE_INTERVAL )
            {
            // InternalCNL.g:6051:2: ( RULE_INTERVAL )
            // InternalCNL.g:6052:3: RULE_INTERVAL
            {
             before(grammarAccess.getTimeLiteralAccess().getIntervalINTERVALTerminalRuleCall_1_0()); 
            match(input,RULE_INTERVAL,FOLLOW_2); 
             after(grammarAccess.getTimeLiteralAccess().getIntervalINTERVALTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TimeLiteral__IntervalAssignment_1"


    // $ANTLR start "rule__PrimaryExpression__ConstantAssignment_0"
    // InternalCNL.g:6061:1: rule__PrimaryExpression__ConstantAssignment_0 : ( ruleConstant ) ;
    public final void rule__PrimaryExpression__ConstantAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:6065:1: ( ( ruleConstant ) )
            // InternalCNL.g:6066:2: ( ruleConstant )
            {
            // InternalCNL.g:6066:2: ( ruleConstant )
            // InternalCNL.g:6067:3: ruleConstant
            {
             before(grammarAccess.getPrimaryExpressionAccess().getConstantConstantParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getConstantConstantParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__ConstantAssignment_0"


    // $ANTLR start "rule__PrimaryExpression__TauAssignment_1"
    // InternalCNL.g:6076:1: rule__PrimaryExpression__TauAssignment_1 : ( ruleTauExpression ) ;
    public final void rule__PrimaryExpression__TauAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:6080:1: ( ( ruleTauExpression ) )
            // InternalCNL.g:6081:2: ( ruleTauExpression )
            {
            // InternalCNL.g:6081:2: ( ruleTauExpression )
            // InternalCNL.g:6082:3: ruleTauExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getTauTauExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTauExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getTauTauExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__TauAssignment_1"


    // $ANTLR start "rule__PrimaryExpression__VAssignment_2"
    // InternalCNL.g:6091:1: rule__PrimaryExpression__VAssignment_2 : ( RULE_ID ) ;
    public final void rule__PrimaryExpression__VAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:6095:1: ( ( RULE_ID ) )
            // InternalCNL.g:6096:2: ( RULE_ID )
            {
            // InternalCNL.g:6096:2: ( RULE_ID )
            // InternalCNL.g:6097:3: RULE_ID
            {
             before(grammarAccess.getPrimaryExpressionAccess().getVIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getVIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__VAssignment_2"


    // $ANTLR start "rule__PrimaryExpression__NestExprAssignment_3_1"
    // InternalCNL.g:6106:1: rule__PrimaryExpression__NestExprAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__NestExprAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCNL.g:6110:1: ( ( ruleExpression ) )
            // InternalCNL.g:6111:2: ( ruleExpression )
            {
            // InternalCNL.g:6111:2: ( ruleExpression )
            // InternalCNL.g:6112:3: ruleExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNestExprExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getNestExprExpressionParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__NestExprAssignment_3_1"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\64\1\4\2\uffff\4\4\1\uffff";
    static final String dfa_3s = "\1\100\1\5\2\uffff\4\100\1\uffff";
    static final String dfa_4s = "\2\uffff\1\2\1\3\4\uffff\1\1";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\uffff\1\2\1\uffff\1\2\1\3\6\uffff\1\1",
            "\1\4\1\5",
            "",
            "",
            "\1\6\1\7\72\uffff\1\10",
            "\1\6\1\7\72\uffff\1\10",
            "\1\6\1\7\72\uffff\1\10",
            "\1\6\1\7\72\uffff\1\10",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1009:1: rule__Trig__Alternatives_1 : ( ( ( rule__Trig__InvariantAssignment_1_0 ) ) | ( ( rule__Trig__Release_reactionAssignment_1_1 ) ) | ( ( rule__Trig__Delay_finalAssignment_1_2 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000080000000002L,0x0000000000000052L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000400004000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0350400004000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000800000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0150400004000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001F80000070L,0x0000000000000600L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000070L,0x0000000000000600L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000100L});

}