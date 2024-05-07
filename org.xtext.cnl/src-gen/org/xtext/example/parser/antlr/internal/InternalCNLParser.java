package org.xtext.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.CNLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCNLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_OR_OPERATOR", "RULE_INTERVAL", "RULE_INTEGER", "RULE_BOOLEAN_LITERAL", "RULE_STRING", "RULE_DIGIT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BOOL'", "'INT'", "'VAR_INPUT'", "';'", "'END_VAR'", "'VAR_OUTPUT'", "':'", "'SENTENCE'", "'END_SENTENCE'", "'='", "'XOR'", "'AND'", "'&&'", "'FE'", "'RE'", "'HIGH'", "'LOW'", "'NOT'", "'!'", "'TAU'", "'('", "')'", "'#T'", "'REQUIREMENT'", "'END_REQUIREMENT'", "'.'", "'After'", "'Always'", "'should'", "'remain'", "'valid'", "'until'", "'always'", "'either'", "'or'", "'Reaction'", "'is'", "'reaction'", "'which'", "'must'", "'occur'", "'from'", "'immediately'", "'after'", "'within'", "','", "'=='", "'<>'", "'<='", "'>='", "'<'", "'>'"
    };
    public static final int T__50=50;
    public static final int RULE_INTERVAL=6;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int RULE_ID=4;
    public static final int RULE_BOOLEAN_LITERAL=8;
    public static final int RULE_DIGIT=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_OR_OPERATOR=5;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_INTEGER=7;
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

        public InternalCNLParser(TokenStream input, CNLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected CNLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalCNL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalCNL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalCNL.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalCNL.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_declVarInput_0_0= ruleDeclVarInput ) ) | ( (lv_declVarOutput_1_0= ruleDeclVarOutput ) ) | ( (lv_sentDeclaration_2_0= ruleSentDeclaration ) ) | ( (lv_reqDeclaration_3_0= ruleReqDeclaration ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_declVarInput_0_0 = null;

        EObject lv_declVarOutput_1_0 = null;

        EObject lv_sentDeclaration_2_0 = null;

        EObject lv_reqDeclaration_3_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:78:2: ( ( ( (lv_declVarInput_0_0= ruleDeclVarInput ) ) | ( (lv_declVarOutput_1_0= ruleDeclVarOutput ) ) | ( (lv_sentDeclaration_2_0= ruleSentDeclaration ) ) | ( (lv_reqDeclaration_3_0= ruleReqDeclaration ) ) )* )
            // InternalCNL.g:79:2: ( ( (lv_declVarInput_0_0= ruleDeclVarInput ) ) | ( (lv_declVarOutput_1_0= ruleDeclVarOutput ) ) | ( (lv_sentDeclaration_2_0= ruleSentDeclaration ) ) | ( (lv_reqDeclaration_3_0= ruleReqDeclaration ) ) )*
            {
            // InternalCNL.g:79:2: ( ( (lv_declVarInput_0_0= ruleDeclVarInput ) ) | ( (lv_declVarOutput_1_0= ruleDeclVarOutput ) ) | ( (lv_sentDeclaration_2_0= ruleSentDeclaration ) ) | ( (lv_reqDeclaration_3_0= ruleReqDeclaration ) ) )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    alt1=1;
                    }
                    break;
                case 21:
                    {
                    alt1=2;
                    }
                    break;
                case 23:
                    {
                    alt1=3;
                    }
                    break;
                case 39:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalCNL.g:80:3: ( (lv_declVarInput_0_0= ruleDeclVarInput ) )
            	    {
            	    // InternalCNL.g:80:3: ( (lv_declVarInput_0_0= ruleDeclVarInput ) )
            	    // InternalCNL.g:81:4: (lv_declVarInput_0_0= ruleDeclVarInput )
            	    {
            	    // InternalCNL.g:81:4: (lv_declVarInput_0_0= ruleDeclVarInput )
            	    // InternalCNL.g:82:5: lv_declVarInput_0_0= ruleDeclVarInput
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDeclVarInputDeclVarInputParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_declVarInput_0_0=ruleDeclVarInput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declVarInput",
            	    						lv_declVarInput_0_0,
            	    						"org.xtext.example.CNL.DeclVarInput");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCNL.g:100:3: ( (lv_declVarOutput_1_0= ruleDeclVarOutput ) )
            	    {
            	    // InternalCNL.g:100:3: ( (lv_declVarOutput_1_0= ruleDeclVarOutput ) )
            	    // InternalCNL.g:101:4: (lv_declVarOutput_1_0= ruleDeclVarOutput )
            	    {
            	    // InternalCNL.g:101:4: (lv_declVarOutput_1_0= ruleDeclVarOutput )
            	    // InternalCNL.g:102:5: lv_declVarOutput_1_0= ruleDeclVarOutput
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDeclVarOutputDeclVarOutputParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_declVarOutput_1_0=ruleDeclVarOutput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declVarOutput",
            	    						lv_declVarOutput_1_0,
            	    						"org.xtext.example.CNL.DeclVarOutput");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCNL.g:120:3: ( (lv_sentDeclaration_2_0= ruleSentDeclaration ) )
            	    {
            	    // InternalCNL.g:120:3: ( (lv_sentDeclaration_2_0= ruleSentDeclaration ) )
            	    // InternalCNL.g:121:4: (lv_sentDeclaration_2_0= ruleSentDeclaration )
            	    {
            	    // InternalCNL.g:121:4: (lv_sentDeclaration_2_0= ruleSentDeclaration )
            	    // InternalCNL.g:122:5: lv_sentDeclaration_2_0= ruleSentDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSentDeclarationSentDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_sentDeclaration_2_0=ruleSentDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sentDeclaration",
            	    						lv_sentDeclaration_2_0,
            	    						"org.xtext.example.CNL.SentDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalCNL.g:140:3: ( (lv_reqDeclaration_3_0= ruleReqDeclaration ) )
            	    {
            	    // InternalCNL.g:140:3: ( (lv_reqDeclaration_3_0= ruleReqDeclaration ) )
            	    // InternalCNL.g:141:4: (lv_reqDeclaration_3_0= ruleReqDeclaration )
            	    {
            	    // InternalCNL.g:141:4: (lv_reqDeclaration_3_0= ruleReqDeclaration )
            	    // InternalCNL.g:142:5: lv_reqDeclaration_3_0= ruleReqDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getReqDeclarationReqDeclarationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_reqDeclaration_3_0=ruleReqDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reqDeclaration",
            	    						lv_reqDeclaration_3_0,
            	    						"org.xtext.example.CNL.ReqDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleVariableType"
    // InternalCNL.g:163:1: entryRuleVariableType returns [String current=null] : iv_ruleVariableType= ruleVariableType EOF ;
    public final String entryRuleVariableType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableType = null;


        try {
            // InternalCNL.g:163:52: (iv_ruleVariableType= ruleVariableType EOF )
            // InternalCNL.g:164:2: iv_ruleVariableType= ruleVariableType EOF
            {
             newCompositeNode(grammarAccess.getVariableTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableType=ruleVariableType();

            state._fsp--;

             current =iv_ruleVariableType.getText(); 
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
    // $ANTLR end "entryRuleVariableType"


    // $ANTLR start "ruleVariableType"
    // InternalCNL.g:170:1: ruleVariableType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'BOOL' | kw= 'INT' ) ;
    public final AntlrDatatypeRuleToken ruleVariableType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCNL.g:176:2: ( (kw= 'BOOL' | kw= 'INT' ) )
            // InternalCNL.g:177:2: (kw= 'BOOL' | kw= 'INT' )
            {
            // InternalCNL.g:177:2: (kw= 'BOOL' | kw= 'INT' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCNL.g:178:3: kw= 'BOOL'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableTypeAccess().getBOOLKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCNL.g:184:3: kw= 'INT'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableTypeAccess().getINTKeyword_1());
                    		

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
    // $ANTLR end "ruleVariableType"


    // $ANTLR start "entryRuleDeclVarInput"
    // InternalCNL.g:193:1: entryRuleDeclVarInput returns [EObject current=null] : iv_ruleDeclVarInput= ruleDeclVarInput EOF ;
    public final EObject entryRuleDeclVarInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclVarInput = null;


        try {
            // InternalCNL.g:193:53: (iv_ruleDeclVarInput= ruleDeclVarInput EOF )
            // InternalCNL.g:194:2: iv_ruleDeclVarInput= ruleDeclVarInput EOF
            {
             newCompositeNode(grammarAccess.getDeclVarInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclVarInput=ruleDeclVarInput();

            state._fsp--;

             current =iv_ruleDeclVarInput; 
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
    // $ANTLR end "entryRuleDeclVarInput"


    // $ANTLR start "ruleDeclVarInput"
    // InternalCNL.g:200:1: ruleDeclVarInput returns [EObject current=null] : ( () otherlv_1= 'VAR_INPUT' ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' ) ;
    public final EObject ruleDeclVarInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_varDecls_2_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:206:2: ( ( () otherlv_1= 'VAR_INPUT' ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' ) )
            // InternalCNL.g:207:2: ( () otherlv_1= 'VAR_INPUT' ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' )
            {
            // InternalCNL.g:207:2: ( () otherlv_1= 'VAR_INPUT' ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' )
            // InternalCNL.g:208:3: () otherlv_1= 'VAR_INPUT' ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR'
            {
            // InternalCNL.g:208:3: ()
            // InternalCNL.g:209:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeclVarInputAccess().getDeclVarInputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclVarInputAccess().getVAR_INPUTKeyword_1());
            		
            // InternalCNL.g:219:3: ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCNL.g:220:4: ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';'
            	    {
            	    // InternalCNL.g:220:4: ( (lv_varDecls_2_0= ruleVarDeclaration ) )
            	    // InternalCNL.g:221:5: (lv_varDecls_2_0= ruleVarDeclaration )
            	    {
            	    // InternalCNL.g:221:5: (lv_varDecls_2_0= ruleVarDeclaration )
            	    // InternalCNL.g:222:6: lv_varDecls_2_0= ruleVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getDeclVarInputAccess().getVarDeclsVarDeclarationParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_varDecls_2_0=ruleVarDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeclVarInputRule());
            	    						}
            	    						add(
            	    							current,
            	    							"varDecls",
            	    							lv_varDecls_2_0,
            	    							"org.xtext.example.CNL.VarDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,19,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDeclVarInputAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDeclVarInputAccess().getEND_VARKeyword_3());
            		

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
    // $ANTLR end "ruleDeclVarInput"


    // $ANTLR start "entryRuleDeclVarOutput"
    // InternalCNL.g:252:1: entryRuleDeclVarOutput returns [EObject current=null] : iv_ruleDeclVarOutput= ruleDeclVarOutput EOF ;
    public final EObject entryRuleDeclVarOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclVarOutput = null;


        try {
            // InternalCNL.g:252:54: (iv_ruleDeclVarOutput= ruleDeclVarOutput EOF )
            // InternalCNL.g:253:2: iv_ruleDeclVarOutput= ruleDeclVarOutput EOF
            {
             newCompositeNode(grammarAccess.getDeclVarOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclVarOutput=ruleDeclVarOutput();

            state._fsp--;

             current =iv_ruleDeclVarOutput; 
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
    // $ANTLR end "entryRuleDeclVarOutput"


    // $ANTLR start "ruleDeclVarOutput"
    // InternalCNL.g:259:1: ruleDeclVarOutput returns [EObject current=null] : ( () otherlv_1= 'VAR_OUTPUT' ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' ) ;
    public final EObject ruleDeclVarOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_varDecls_2_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:265:2: ( ( () otherlv_1= 'VAR_OUTPUT' ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' ) )
            // InternalCNL.g:266:2: ( () otherlv_1= 'VAR_OUTPUT' ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' )
            {
            // InternalCNL.g:266:2: ( () otherlv_1= 'VAR_OUTPUT' ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' )
            // InternalCNL.g:267:3: () otherlv_1= 'VAR_OUTPUT' ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR'
            {
            // InternalCNL.g:267:3: ()
            // InternalCNL.g:268:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeclVarOutputAccess().getDeclVarOutputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclVarOutputAccess().getVAR_OUTPUTKeyword_1());
            		
            // InternalCNL.g:278:3: ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCNL.g:279:4: ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';'
            	    {
            	    // InternalCNL.g:279:4: ( (lv_varDecls_2_0= ruleVarDeclaration ) )
            	    // InternalCNL.g:280:5: (lv_varDecls_2_0= ruleVarDeclaration )
            	    {
            	    // InternalCNL.g:280:5: (lv_varDecls_2_0= ruleVarDeclaration )
            	    // InternalCNL.g:281:6: lv_varDecls_2_0= ruleVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getDeclVarOutputAccess().getVarDeclsVarDeclarationParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_varDecls_2_0=ruleVarDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeclVarOutputRule());
            	    						}
            	    						add(
            	    							current,
            	    							"varDecls",
            	    							lv_varDecls_2_0,
            	    							"org.xtext.example.CNL.VarDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,19,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDeclVarOutputAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDeclVarOutputAccess().getEND_VARKeyword_3());
            		

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
    // $ANTLR end "ruleDeclVarOutput"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalCNL.g:311:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalCNL.g:311:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalCNL.g:312:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;

             current =iv_ruleVarDeclaration; 
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
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalCNL.g:318:1: ruleVarDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVariableType ) ) ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:324:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVariableType ) ) ) )
            // InternalCNL.g:325:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVariableType ) ) )
            {
            // InternalCNL.g:325:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVariableType ) ) )
            // InternalCNL.g:326:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVariableType ) )
            {
            // InternalCNL.g:326:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCNL.g:327:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCNL.g:327:4: (lv_name_0_0= RULE_ID )
            // InternalCNL.g:328:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getVarDeclarationAccess().getColonKeyword_1());
            		
            // InternalCNL.g:348:3: ( (lv_type_2_0= ruleVariableType ) )
            // InternalCNL.g:349:4: (lv_type_2_0= ruleVariableType )
            {
            // InternalCNL.g:349:4: (lv_type_2_0= ruleVariableType )
            // InternalCNL.g:350:5: lv_type_2_0= ruleVariableType
            {

            					newCompositeNode(grammarAccess.getVarDeclarationAccess().getTypeVariableTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleVariableType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.CNL.VariableType");
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
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleSentDeclaration"
    // InternalCNL.g:371:1: entryRuleSentDeclaration returns [EObject current=null] : iv_ruleSentDeclaration= ruleSentDeclaration EOF ;
    public final EObject entryRuleSentDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentDeclaration = null;


        try {
            // InternalCNL.g:371:56: (iv_ruleSentDeclaration= ruleSentDeclaration EOF )
            // InternalCNL.g:372:2: iv_ruleSentDeclaration= ruleSentDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSentDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentDeclaration=ruleSentDeclaration();

            state._fsp--;

             current =iv_ruleSentDeclaration; 
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
    // $ANTLR end "entryRuleSentDeclaration"


    // $ANTLR start "ruleSentDeclaration"
    // InternalCNL.g:378:1: ruleSentDeclaration returns [EObject current=null] : ( () otherlv_1= 'SENTENCE' ( (lv_DeclarationName_2_0= RULE_ID ) ) ( (lv_sentenceDeclaration_3_0= ruleSentenceDeclaration ) ) otherlv_4= 'END_SENTENCE' ) ;
    public final EObject ruleSentDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_DeclarationName_2_0=null;
        Token otherlv_4=null;
        EObject lv_sentenceDeclaration_3_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:384:2: ( ( () otherlv_1= 'SENTENCE' ( (lv_DeclarationName_2_0= RULE_ID ) ) ( (lv_sentenceDeclaration_3_0= ruleSentenceDeclaration ) ) otherlv_4= 'END_SENTENCE' ) )
            // InternalCNL.g:385:2: ( () otherlv_1= 'SENTENCE' ( (lv_DeclarationName_2_0= RULE_ID ) ) ( (lv_sentenceDeclaration_3_0= ruleSentenceDeclaration ) ) otherlv_4= 'END_SENTENCE' )
            {
            // InternalCNL.g:385:2: ( () otherlv_1= 'SENTENCE' ( (lv_DeclarationName_2_0= RULE_ID ) ) ( (lv_sentenceDeclaration_3_0= ruleSentenceDeclaration ) ) otherlv_4= 'END_SENTENCE' )
            // InternalCNL.g:386:3: () otherlv_1= 'SENTENCE' ( (lv_DeclarationName_2_0= RULE_ID ) ) ( (lv_sentenceDeclaration_3_0= ruleSentenceDeclaration ) ) otherlv_4= 'END_SENTENCE'
            {
            // InternalCNL.g:386:3: ()
            // InternalCNL.g:387:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSentDeclarationAccess().getSentDeclarationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSentDeclarationAccess().getSENTENCEKeyword_1());
            		
            // InternalCNL.g:397:3: ( (lv_DeclarationName_2_0= RULE_ID ) )
            // InternalCNL.g:398:4: (lv_DeclarationName_2_0= RULE_ID )
            {
            // InternalCNL.g:398:4: (lv_DeclarationName_2_0= RULE_ID )
            // InternalCNL.g:399:5: lv_DeclarationName_2_0= RULE_ID
            {
            lv_DeclarationName_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_DeclarationName_2_0, grammarAccess.getSentDeclarationAccess().getDeclarationNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSentDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"DeclarationName",
            						lv_DeclarationName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCNL.g:415:3: ( (lv_sentenceDeclaration_3_0= ruleSentenceDeclaration ) )
            // InternalCNL.g:416:4: (lv_sentenceDeclaration_3_0= ruleSentenceDeclaration )
            {
            // InternalCNL.g:416:4: (lv_sentenceDeclaration_3_0= ruleSentenceDeclaration )
            // InternalCNL.g:417:5: lv_sentenceDeclaration_3_0= ruleSentenceDeclaration
            {

            					newCompositeNode(grammarAccess.getSentDeclarationAccess().getSentenceDeclarationSentenceDeclarationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_sentenceDeclaration_3_0=ruleSentenceDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSentDeclarationRule());
            					}
            					set(
            						current,
            						"sentenceDeclaration",
            						lv_sentenceDeclaration_3_0,
            						"org.xtext.example.CNL.SentenceDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSentDeclarationAccess().getEND_SENTENCEKeyword_4());
            		

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
    // $ANTLR end "ruleSentDeclaration"


    // $ANTLR start "entryRuleSentenceDeclaration"
    // InternalCNL.g:442:1: entryRuleSentenceDeclaration returns [EObject current=null] : iv_ruleSentenceDeclaration= ruleSentenceDeclaration EOF ;
    public final EObject entryRuleSentenceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentenceDeclaration = null;


        try {
            // InternalCNL.g:442:60: (iv_ruleSentenceDeclaration= ruleSentenceDeclaration EOF )
            // InternalCNL.g:443:2: iv_ruleSentenceDeclaration= ruleSentenceDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSentenceDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentenceDeclaration=ruleSentenceDeclaration();

            state._fsp--;

             current =iv_ruleSentenceDeclaration; 
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
    // $ANTLR end "entryRuleSentenceDeclaration"


    // $ANTLR start "ruleSentenceDeclaration"
    // InternalCNL.g:449:1: ruleSentenceDeclaration returns [EObject current=null] : ( () ( (lv_name_1_0= ruleSentence ) ) otherlv_2= '=' ( (lv_logicExpression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleSentenceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_logicExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:455:2: ( ( () ( (lv_name_1_0= ruleSentence ) ) otherlv_2= '=' ( (lv_logicExpression_3_0= ruleExpression ) ) ) )
            // InternalCNL.g:456:2: ( () ( (lv_name_1_0= ruleSentence ) ) otherlv_2= '=' ( (lv_logicExpression_3_0= ruleExpression ) ) )
            {
            // InternalCNL.g:456:2: ( () ( (lv_name_1_0= ruleSentence ) ) otherlv_2= '=' ( (lv_logicExpression_3_0= ruleExpression ) ) )
            // InternalCNL.g:457:3: () ( (lv_name_1_0= ruleSentence ) ) otherlv_2= '=' ( (lv_logicExpression_3_0= ruleExpression ) )
            {
            // InternalCNL.g:457:3: ()
            // InternalCNL.g:458:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSentenceDeclarationAccess().getSentenceDeclarationAction_0(),
            					current);
            			

            }

            // InternalCNL.g:464:3: ( (lv_name_1_0= ruleSentence ) )
            // InternalCNL.g:465:4: (lv_name_1_0= ruleSentence )
            {
            // InternalCNL.g:465:4: (lv_name_1_0= ruleSentence )
            // InternalCNL.g:466:5: lv_name_1_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getSentenceDeclarationAccess().getNameSentenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleSentence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSentenceDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.CNL.Sentence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSentenceDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalCNL.g:487:3: ( (lv_logicExpression_3_0= ruleExpression ) )
            // InternalCNL.g:488:4: (lv_logicExpression_3_0= ruleExpression )
            {
            // InternalCNL.g:488:4: (lv_logicExpression_3_0= ruleExpression )
            // InternalCNL.g:489:5: lv_logicExpression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSentenceDeclarationAccess().getLogicExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_logicExpression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSentenceDeclarationRule());
            					}
            					set(
            						current,
            						"logicExpression",
            						lv_logicExpression_3_0,
            						"org.xtext.example.CNL.Expression");
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
    // $ANTLR end "ruleSentenceDeclaration"


    // $ANTLR start "entryRuleExpression"
    // InternalCNL.g:510:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalCNL.g:510:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalCNL.g:511:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalCNL.g:517:1: ruleExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_orOp_2_0=null;
        EObject this_XorExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:523:2: ( (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) )
            // InternalCNL.g:524:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            {
            // InternalCNL.g:524:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            // InternalCNL.g:525:3: this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getXorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;


            			current = this_XorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCNL.g:533:3: ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_OR_OPERATOR) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCNL.g:534:4: () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) )
            	    {
            	    // InternalCNL.g:534:4: ()
            	    // InternalCNL.g:535:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCNL.g:541:4: ( (lv_orOp_2_0= RULE_OR_OPERATOR ) )
            	    // InternalCNL.g:542:5: (lv_orOp_2_0= RULE_OR_OPERATOR )
            	    {
            	    // InternalCNL.g:542:5: (lv_orOp_2_0= RULE_OR_OPERATOR )
            	    // InternalCNL.g:543:6: lv_orOp_2_0= RULE_OR_OPERATOR
            	    {
            	    lv_orOp_2_0=(Token)match(input,RULE_OR_OPERATOR,FOLLOW_12); 

            	    						newLeafNode(lv_orOp_2_0, grammarAccess.getExpressionAccess().getOrOpOR_OPERATORTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExpressionRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"orOp",
            	    							lv_orOp_2_0,
            	    							"org.xtext.example.CNL.OR_OPERATOR");
            	    					

            	    }


            	    }

            	    // InternalCNL.g:559:4: ( (lv_right_3_0= ruleXorExpression ) )
            	    // InternalCNL.g:560:5: (lv_right_3_0= ruleXorExpression )
            	    {
            	    // InternalCNL.g:560:5: (lv_right_3_0= ruleXorExpression )
            	    // InternalCNL.g:561:6: lv_right_3_0= ruleXorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_right_3_0=ruleXorExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.CNL.XorExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalCNL.g:583:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalCNL.g:583:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalCNL.g:584:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
             newCompositeNode(grammarAccess.getXorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXorExpression=ruleXorExpression();

            state._fsp--;

             current =iv_ruleXorExpression; 
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
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalCNL.g:590:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:596:2: ( (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalCNL.g:597:2: (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalCNL.g:597:2: (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalCNL.g:598:3: this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCNL.g:606:3: ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCNL.g:607:4: () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalCNL.g:607:4: ()
            	    // InternalCNL.g:608:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getXorExpressionAccess().getXOR_OPERATORParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_12);
            	    ruleXOR_OPERATOR();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCNL.g:621:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalCNL.g:622:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalCNL.g:622:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalCNL.g:623:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXorExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.CNL.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleXOR_OPERATOR"
    // InternalCNL.g:645:1: entryRuleXOR_OPERATOR returns [String current=null] : iv_ruleXOR_OPERATOR= ruleXOR_OPERATOR EOF ;
    public final String entryRuleXOR_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXOR_OPERATOR = null;


        try {
            // InternalCNL.g:645:52: (iv_ruleXOR_OPERATOR= ruleXOR_OPERATOR EOF )
            // InternalCNL.g:646:2: iv_ruleXOR_OPERATOR= ruleXOR_OPERATOR EOF
            {
             newCompositeNode(grammarAccess.getXOR_OPERATORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXOR_OPERATOR=ruleXOR_OPERATOR();

            state._fsp--;

             current =iv_ruleXOR_OPERATOR.getText(); 
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
    // $ANTLR end "entryRuleXOR_OPERATOR"


    // $ANTLR start "ruleXOR_OPERATOR"
    // InternalCNL.g:652:1: ruleXOR_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'XOR' ;
    public final AntlrDatatypeRuleToken ruleXOR_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCNL.g:658:2: (kw= 'XOR' )
            // InternalCNL.g:659:2: kw= 'XOR'
            {
            kw=(Token)match(input,26,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getXOR_OPERATORAccess().getXORKeyword());
            	

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
    // $ANTLR end "ruleXOR_OPERATOR"


    // $ANTLR start "entryRuleAndExpression"
    // InternalCNL.g:667:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalCNL.g:667:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalCNL.g:668:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalCNL.g:674:1: ruleAndExpression returns [EObject current=null] : (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompExpression_0 = null;

        AntlrDatatypeRuleToken lv_andOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:680:2: ( (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* ) )
            // InternalCNL.g:681:2: (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* )
            {
            // InternalCNL.g:681:2: (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* )
            // InternalCNL.g:682:3: this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getCompExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_CompExpression_0=ruleCompExpression();

            state._fsp--;


            			current = this_CompExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCNL.g:690:3: ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }
                else if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCNL.g:691:4: () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) )
            	    {
            	    // InternalCNL.g:691:4: ()
            	    // InternalCNL.g:692:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCNL.g:698:4: ( (lv_andOp_2_0= ruleAND_OPERATOR ) )
            	    // InternalCNL.g:699:5: (lv_andOp_2_0= ruleAND_OPERATOR )
            	    {
            	    // InternalCNL.g:699:5: (lv_andOp_2_0= ruleAND_OPERATOR )
            	    // InternalCNL.g:700:6: lv_andOp_2_0= ruleAND_OPERATOR
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getAndOpAND_OPERATORParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_andOp_2_0=ruleAND_OPERATOR();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"andOp",
            	    							lv_andOp_2_0,
            	    							"org.xtext.example.CNL.AND_OPERATOR");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalCNL.g:717:4: ( (lv_right_3_0= ruleCompExpression ) )
            	    // InternalCNL.g:718:5: (lv_right_3_0= ruleCompExpression )
            	    {
            	    // InternalCNL.g:718:5: (lv_right_3_0= ruleCompExpression )
            	    // InternalCNL.g:719:6: lv_right_3_0= ruleCompExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightCompExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_right_3_0=ruleCompExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.CNL.CompExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleAND_OPERATOR"
    // InternalCNL.g:741:1: entryRuleAND_OPERATOR returns [String current=null] : iv_ruleAND_OPERATOR= ruleAND_OPERATOR EOF ;
    public final String entryRuleAND_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAND_OPERATOR = null;


        try {
            // InternalCNL.g:741:52: (iv_ruleAND_OPERATOR= ruleAND_OPERATOR EOF )
            // InternalCNL.g:742:2: iv_ruleAND_OPERATOR= ruleAND_OPERATOR EOF
            {
             newCompositeNode(grammarAccess.getAND_OPERATORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAND_OPERATOR=ruleAND_OPERATOR();

            state._fsp--;

             current =iv_ruleAND_OPERATOR.getText(); 
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
    // $ANTLR end "entryRuleAND_OPERATOR"


    // $ANTLR start "ruleAND_OPERATOR"
    // InternalCNL.g:748:1: ruleAND_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AND' | kw= '&&' ) ;
    public final AntlrDatatypeRuleToken ruleAND_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCNL.g:754:2: ( (kw= 'AND' | kw= '&&' ) )
            // InternalCNL.g:755:2: (kw= 'AND' | kw= '&&' )
            {
            // InternalCNL.g:755:2: (kw= 'AND' | kw= '&&' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            else if ( (LA8_0==28) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCNL.g:756:3: kw= 'AND'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAND_OPERATORAccess().getANDKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCNL.g:762:3: kw= '&&'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAND_OPERATORAccess().getAmpersandAmpersandKeyword_1());
                    		

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
    // $ANTLR end "ruleAND_OPERATOR"


    // $ANTLR start "entryRuleCompExpression"
    // InternalCNL.g:771:1: entryRuleCompExpression returns [EObject current=null] : iv_ruleCompExpression= ruleCompExpression EOF ;
    public final EObject entryRuleCompExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompExpression = null;


        try {
            // InternalCNL.g:771:55: (iv_ruleCompExpression= ruleCompExpression EOF )
            // InternalCNL.g:772:2: iv_ruleCompExpression= ruleCompExpression EOF
            {
             newCompositeNode(grammarAccess.getCompExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompExpression=ruleCompExpression();

            state._fsp--;

             current =iv_ruleCompExpression; 
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
    // $ANTLR end "entryRuleCompExpression"


    // $ANTLR start "ruleCompExpression"
    // InternalCNL.g:778:1: ruleCompExpression returns [EObject current=null] : (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleCompExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EquExpression_0 = null;

        Enumerator lv_compOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:784:2: ( (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalCNL.g:785:2: (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalCNL.g:785:2: (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalCNL.g:786:3: this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompExpressionAccess().getEquExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_EquExpression_0=ruleEquExpression();

            state._fsp--;


            			current = this_EquExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCNL.g:794:3: ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                switch ( input.LA(1) ) {
                case 64:
                    {
                    alt9=1;
                    }
                    break;
                case 65:
                    {
                    alt9=1;
                    }
                    break;
                case 66:
                    {
                    alt9=1;
                    }
                    break;
                case 67:
                    {
                    alt9=1;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // InternalCNL.g:795:4: () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalCNL.g:795:4: ()
            	    // InternalCNL.g:796:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCompExpressionAccess().getCompExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCNL.g:802:4: ( (lv_compOp_2_0= ruleCompOperator ) )
            	    // InternalCNL.g:803:5: (lv_compOp_2_0= ruleCompOperator )
            	    {
            	    // InternalCNL.g:803:5: (lv_compOp_2_0= ruleCompOperator )
            	    // InternalCNL.g:804:6: lv_compOp_2_0= ruleCompOperator
            	    {

            	    						newCompositeNode(grammarAccess.getCompExpressionAccess().getCompOpCompOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_compOp_2_0=ruleCompOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"compOp",
            	    							lv_compOp_2_0,
            	    							"org.xtext.example.CNL.CompOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalCNL.g:821:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalCNL.g:822:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalCNL.g:822:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalCNL.g:823:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getCompExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.CNL.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleCompExpression"


    // $ANTLR start "entryRuleEquExpression"
    // InternalCNL.g:845:1: entryRuleEquExpression returns [EObject current=null] : iv_ruleEquExpression= ruleEquExpression EOF ;
    public final EObject entryRuleEquExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquExpression = null;


        try {
            // InternalCNL.g:845:54: (iv_ruleEquExpression= ruleEquExpression EOF )
            // InternalCNL.g:846:2: iv_ruleEquExpression= ruleEquExpression EOF
            {
             newCompositeNode(grammarAccess.getEquExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquExpression=ruleEquExpression();

            state._fsp--;

             current =iv_ruleEquExpression; 
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
    // $ANTLR end "entryRuleEquExpression"


    // $ANTLR start "ruleEquExpression"
    // InternalCNL.g:852:1: ruleEquExpression returns [EObject current=null] : (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* ) ;
    public final EObject ruleEquExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnExpression_0 = null;

        Enumerator lv_equOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:858:2: ( (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* ) )
            // InternalCNL.g:859:2: (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* )
            {
            // InternalCNL.g:859:2: (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* )
            // InternalCNL.g:860:3: this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEquExpressionAccess().getUnExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_UnExpression_0=ruleUnExpression();

            state._fsp--;


            			current = this_UnExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCNL.g:868:3: ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=62 && LA10_0<=63)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCNL.g:869:4: () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) )
            	    {
            	    // InternalCNL.g:869:4: ()
            	    // InternalCNL.g:870:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEquExpressionAccess().getEquExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCNL.g:876:4: ( (lv_equOp_2_0= ruleEquOperator ) )
            	    // InternalCNL.g:877:5: (lv_equOp_2_0= ruleEquOperator )
            	    {
            	    // InternalCNL.g:877:5: (lv_equOp_2_0= ruleEquOperator )
            	    // InternalCNL.g:878:6: lv_equOp_2_0= ruleEquOperator
            	    {

            	    						newCompositeNode(grammarAccess.getEquExpressionAccess().getEquOpEquOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_equOp_2_0=ruleEquOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEquExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"equOp",
            	    							lv_equOp_2_0,
            	    							"org.xtext.example.CNL.EquOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalCNL.g:895:4: ( (lv_right_3_0= ruleUnExpression ) )
            	    // InternalCNL.g:896:5: (lv_right_3_0= ruleUnExpression )
            	    {
            	    // InternalCNL.g:896:5: (lv_right_3_0= ruleUnExpression )
            	    // InternalCNL.g:897:6: lv_right_3_0= ruleUnExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEquExpressionAccess().getRightUnExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_right_3_0=ruleUnExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEquExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.CNL.UnExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleEquExpression"


    // $ANTLR start "entryRuleUnOperator"
    // InternalCNL.g:919:1: entryRuleUnOperator returns [String current=null] : iv_ruleUnOperator= ruleUnOperator EOF ;
    public final String entryRuleUnOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnOperator = null;


        try {
            // InternalCNL.g:919:50: (iv_ruleUnOperator= ruleUnOperator EOF )
            // InternalCNL.g:920:2: iv_ruleUnOperator= ruleUnOperator EOF
            {
             newCompositeNode(grammarAccess.getUnOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnOperator=ruleUnOperator();

            state._fsp--;

             current =iv_ruleUnOperator.getText(); 
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
    // $ANTLR end "entryRuleUnOperator"


    // $ANTLR start "ruleUnOperator"
    // InternalCNL.g:926:1: ruleUnOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' ) ;
    public final AntlrDatatypeRuleToken ruleUnOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NotOperator_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:932:2: ( (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' ) )
            // InternalCNL.g:933:2: (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' )
            {
            // InternalCNL.g:933:2: (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 33:
            case 34:
                {
                alt11=1;
                }
                break;
            case 29:
                {
                alt11=2;
                }
                break;
            case 30:
                {
                alt11=3;
                }
                break;
            case 31:
                {
                alt11=4;
                }
                break;
            case 32:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalCNL.g:934:3: this_NotOperator_0= ruleNotOperator
                    {

                    			newCompositeNode(grammarAccess.getUnOperatorAccess().getNotOperatorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NotOperator_0=ruleNotOperator();

                    state._fsp--;


                    			current.merge(this_NotOperator_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCNL.g:945:3: kw= 'FE'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getFEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCNL.g:951:3: kw= 'RE'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getREKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalCNL.g:957:3: kw= 'HIGH'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getHIGHKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalCNL.g:963:3: kw= 'LOW'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getLOWKeyword_4());
                    		

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
    // $ANTLR end "ruleUnOperator"


    // $ANTLR start "entryRuleNotOperator"
    // InternalCNL.g:972:1: entryRuleNotOperator returns [String current=null] : iv_ruleNotOperator= ruleNotOperator EOF ;
    public final String entryRuleNotOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNotOperator = null;


        try {
            // InternalCNL.g:972:51: (iv_ruleNotOperator= ruleNotOperator EOF )
            // InternalCNL.g:973:2: iv_ruleNotOperator= ruleNotOperator EOF
            {
             newCompositeNode(grammarAccess.getNotOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotOperator=ruleNotOperator();

            state._fsp--;

             current =iv_ruleNotOperator.getText(); 
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
    // $ANTLR end "entryRuleNotOperator"


    // $ANTLR start "ruleNotOperator"
    // InternalCNL.g:979:1: ruleNotOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NOT' | kw= '!' ) ;
    public final AntlrDatatypeRuleToken ruleNotOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCNL.g:985:2: ( (kw= 'NOT' | kw= '!' ) )
            // InternalCNL.g:986:2: (kw= 'NOT' | kw= '!' )
            {
            // InternalCNL.g:986:2: (kw= 'NOT' | kw= '!' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            else if ( (LA12_0==34) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCNL.g:987:3: kw= 'NOT'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNotOperatorAccess().getNOTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCNL.g:993:3: kw= '!'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1());
                    		

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
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "entryRuleUnExpression"
    // InternalCNL.g:1002:1: entryRuleUnExpression returns [EObject current=null] : iv_ruleUnExpression= ruleUnExpression EOF ;
    public final EObject entryRuleUnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnExpression = null;


        try {
            // InternalCNL.g:1002:53: (iv_ruleUnExpression= ruleUnExpression EOF )
            // InternalCNL.g:1003:2: iv_ruleUnExpression= ruleUnExpression EOF
            {
             newCompositeNode(grammarAccess.getUnExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnExpression=ruleUnExpression();

            state._fsp--;

             current =iv_ruleUnExpression; 
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
    // $ANTLR end "entryRuleUnExpression"


    // $ANTLR start "ruleUnExpression"
    // InternalCNL.g:1009:1: ruleUnExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleUnExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        AntlrDatatypeRuleToken lv_unOp_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1015:2: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) ) )
            // InternalCNL.g:1016:2: (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) )
            {
            // InternalCNL.g:1016:2: (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||(LA13_0>=RULE_INTEGER && LA13_0<=RULE_BOOLEAN_LITERAL)||(LA13_0>=35 && LA13_0<=36)) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=29 && LA13_0<=34)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCNL.g:1017:3: this_PrimaryExpression_0= rulePrimaryExpression
                    {

                    			newCompositeNode(grammarAccess.getUnExpressionAccess().getPrimaryExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_0=rulePrimaryExpression();

                    state._fsp--;


                    			current = this_PrimaryExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCNL.g:1026:3: ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) )
                    {
                    // InternalCNL.g:1026:3: ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) )
                    // InternalCNL.g:1027:4: ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) )
                    {
                    // InternalCNL.g:1027:4: ( (lv_unOp_1_0= ruleUnOperator ) )
                    // InternalCNL.g:1028:5: (lv_unOp_1_0= ruleUnOperator )
                    {
                    // InternalCNL.g:1028:5: (lv_unOp_1_0= ruleUnOperator )
                    // InternalCNL.g:1029:6: lv_unOp_1_0= ruleUnOperator
                    {

                    						newCompositeNode(grammarAccess.getUnExpressionAccess().getUnOpUnOperatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_unOp_1_0=ruleUnOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnExpressionRule());
                    						}
                    						set(
                    							current,
                    							"unOp",
                    							lv_unOp_1_0,
                    							"org.xtext.example.CNL.UnOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCNL.g:1046:4: ( (lv_right_2_0= rulePrimaryExpression ) )
                    // InternalCNL.g:1047:5: (lv_right_2_0= rulePrimaryExpression )
                    {
                    // InternalCNL.g:1047:5: (lv_right_2_0= rulePrimaryExpression )
                    // InternalCNL.g:1048:6: lv_right_2_0= rulePrimaryExpression
                    {

                    						newCompositeNode(grammarAccess.getUnExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=rulePrimaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"org.xtext.example.CNL.PrimaryExpression");
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
    // $ANTLR end "ruleUnExpression"


    // $ANTLR start "entryRuleTauExpression"
    // InternalCNL.g:1070:1: entryRuleTauExpression returns [EObject current=null] : iv_ruleTauExpression= ruleTauExpression EOF ;
    public final EObject entryRuleTauExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTauExpression = null;


        try {
            // InternalCNL.g:1070:54: (iv_ruleTauExpression= ruleTauExpression EOF )
            // InternalCNL.g:1071:2: iv_ruleTauExpression= ruleTauExpression EOF
            {
             newCompositeNode(grammarAccess.getTauExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTauExpression=ruleTauExpression();

            state._fsp--;

             current =iv_ruleTauExpression; 
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
    // $ANTLR end "entryRuleTauExpression"


    // $ANTLR start "ruleTauExpression"
    // InternalCNL.g:1077:1: ruleTauExpression returns [EObject current=null] : (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' ) ;
    public final EObject ruleTauExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1083:2: ( (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' ) )
            // InternalCNL.g:1084:2: (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' )
            {
            // InternalCNL.g:1084:2: (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' )
            // InternalCNL.g:1085:3: otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getTauExpressionAccess().getTAUKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getTauExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCNL.g:1093:3: ( (lv_time_2_0= ruleTimeLiteral ) )
            // InternalCNL.g:1094:4: (lv_time_2_0= ruleTimeLiteral )
            {
            // InternalCNL.g:1094:4: (lv_time_2_0= ruleTimeLiteral )
            // InternalCNL.g:1095:5: lv_time_2_0= ruleTimeLiteral
            {

            					newCompositeNode(grammarAccess.getTauExpressionAccess().getTimeTimeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_time_2_0=ruleTimeLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTauExpressionRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_2_0,
            						"org.xtext.example.CNL.TimeLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTauExpressionAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleTauExpression"


    // $ANTLR start "entryRuleTimeLiteral"
    // InternalCNL.g:1120:1: entryRuleTimeLiteral returns [EObject current=null] : iv_ruleTimeLiteral= ruleTimeLiteral EOF ;
    public final EObject entryRuleTimeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeLiteral = null;


        try {
            // InternalCNL.g:1120:52: (iv_ruleTimeLiteral= ruleTimeLiteral EOF )
            // InternalCNL.g:1121:2: iv_ruleTimeLiteral= ruleTimeLiteral EOF
            {
             newCompositeNode(grammarAccess.getTimeLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeLiteral=ruleTimeLiteral();

            state._fsp--;

             current =iv_ruleTimeLiteral; 
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
    // $ANTLR end "entryRuleTimeLiteral"


    // $ANTLR start "ruleTimeLiteral"
    // InternalCNL.g:1127:1: ruleTimeLiteral returns [EObject current=null] : ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) ) ;
    public final EObject ruleTimeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_interval_1_0=null;


        	enterRule();

        try {
            // InternalCNL.g:1133:2: ( ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) ) )
            // InternalCNL.g:1134:2: ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) )
            {
            // InternalCNL.g:1134:2: ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) )
            // InternalCNL.g:1135:3: ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) )
            {

            			newCompositeNode(grammarAccess.getTimeLiteralAccess().getTIME_PREF_LITERALParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            ruleTIME_PREF_LITERAL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCNL.g:1142:3: ( (lv_interval_1_0= RULE_INTERVAL ) )
            // InternalCNL.g:1143:4: (lv_interval_1_0= RULE_INTERVAL )
            {
            // InternalCNL.g:1143:4: (lv_interval_1_0= RULE_INTERVAL )
            // InternalCNL.g:1144:5: lv_interval_1_0= RULE_INTERVAL
            {
            lv_interval_1_0=(Token)match(input,RULE_INTERVAL,FOLLOW_2); 

            					newLeafNode(lv_interval_1_0, grammarAccess.getTimeLiteralAccess().getIntervalINTERVALTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"interval",
            						lv_interval_1_0,
            						"org.xtext.example.CNL.INTERVAL");
            				

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
    // $ANTLR end "ruleTimeLiteral"


    // $ANTLR start "entryRuleTIME_PREF_LITERAL"
    // InternalCNL.g:1164:1: entryRuleTIME_PREF_LITERAL returns [String current=null] : iv_ruleTIME_PREF_LITERAL= ruleTIME_PREF_LITERAL EOF ;
    public final String entryRuleTIME_PREF_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTIME_PREF_LITERAL = null;


        try {
            // InternalCNL.g:1164:57: (iv_ruleTIME_PREF_LITERAL= ruleTIME_PREF_LITERAL EOF )
            // InternalCNL.g:1165:2: iv_ruleTIME_PREF_LITERAL= ruleTIME_PREF_LITERAL EOF
            {
             newCompositeNode(grammarAccess.getTIME_PREF_LITERALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTIME_PREF_LITERAL=ruleTIME_PREF_LITERAL();

            state._fsp--;

             current =iv_ruleTIME_PREF_LITERAL.getText(); 
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
    // $ANTLR end "entryRuleTIME_PREF_LITERAL"


    // $ANTLR start "ruleTIME_PREF_LITERAL"
    // InternalCNL.g:1171:1: ruleTIME_PREF_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '#T' ;
    public final AntlrDatatypeRuleToken ruleTIME_PREF_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCNL.g:1177:2: (kw= '#T' )
            // InternalCNL.g:1178:2: kw= '#T'
            {
            kw=(Token)match(input,38,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTIME_PREF_LITERALAccess().getTKeyword());
            	

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
    // $ANTLR end "ruleTIME_PREF_LITERAL"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalCNL.g:1186:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalCNL.g:1186:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalCNL.g:1187:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalCNL.g:1193:1: rulePrimaryExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_constant_1_0= ruleConstant ) ) | ( (lv_tau_2_0= ruleTauExpression ) ) | (otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_constant_1_0 = null;

        EObject lv_tau_2_0 = null;

        EObject lv_nestExpr_4_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1199:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_constant_1_0= ruleConstant ) ) | ( (lv_tau_2_0= ruleTauExpression ) ) | (otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) ) )
            // InternalCNL.g:1200:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_constant_1_0= ruleConstant ) ) | ( (lv_tau_2_0= ruleTauExpression ) ) | (otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            {
            // InternalCNL.g:1200:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_constant_1_0= ruleConstant ) ) | ( (lv_tau_2_0= ruleTauExpression ) ) | (otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt14=1;
                }
                break;
            case RULE_INTEGER:
            case RULE_BOOLEAN_LITERAL:
                {
                alt14=2;
                }
                break;
            case 35:
                {
                alt14=3;
                }
                break;
            case 36:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalCNL.g:1201:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalCNL.g:1201:3: ( (otherlv_0= RULE_ID ) )
                    // InternalCNL.g:1202:4: (otherlv_0= RULE_ID )
                    {
                    // InternalCNL.g:1202:4: (otherlv_0= RULE_ID )
                    // InternalCNL.g:1203:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getNameVarDeclarationCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1215:3: ( (lv_constant_1_0= ruleConstant ) )
                    {
                    // InternalCNL.g:1215:3: ( (lv_constant_1_0= ruleConstant ) )
                    // InternalCNL.g:1216:4: (lv_constant_1_0= ruleConstant )
                    {
                    // InternalCNL.g:1216:4: (lv_constant_1_0= ruleConstant )
                    // InternalCNL.g:1217:5: lv_constant_1_0= ruleConstant
                    {

                    					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getConstantConstantParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_constant_1_0=ruleConstant();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					set(
                    						current,
                    						"constant",
                    						lv_constant_1_0,
                    						"org.xtext.example.CNL.Constant");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCNL.g:1235:3: ( (lv_tau_2_0= ruleTauExpression ) )
                    {
                    // InternalCNL.g:1235:3: ( (lv_tau_2_0= ruleTauExpression ) )
                    // InternalCNL.g:1236:4: (lv_tau_2_0= ruleTauExpression )
                    {
                    // InternalCNL.g:1236:4: (lv_tau_2_0= ruleTauExpression )
                    // InternalCNL.g:1237:5: lv_tau_2_0= ruleTauExpression
                    {

                    					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTauTauExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_tau_2_0=ruleTauExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					set(
                    						current,
                    						"tau",
                    						lv_tau_2_0,
                    						"org.xtext.example.CNL.TauExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCNL.g:1255:3: (otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')' )
                    {
                    // InternalCNL.g:1255:3: (otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')' )
                    // InternalCNL.g:1256:4: otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalCNL.g:1260:4: ( (lv_nestExpr_4_0= ruleExpression ) )
                    // InternalCNL.g:1261:5: (lv_nestExpr_4_0= ruleExpression )
                    {
                    // InternalCNL.g:1261:5: (lv_nestExpr_4_0= ruleExpression )
                    // InternalCNL.g:1262:6: lv_nestExpr_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNestExprExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_nestExpr_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"nestExpr",
                    							lv_nestExpr_4_0,
                    							"org.xtext.example.CNL.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_2());
                    			

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleConstant"
    // InternalCNL.g:1288:1: entryRuleConstant returns [String current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final String entryRuleConstant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstant = null;


        try {
            // InternalCNL.g:1288:48: (iv_ruleConstant= ruleConstant EOF )
            // InternalCNL.g:1289:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant.getText(); 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalCNL.g:1295:1: ruleConstant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTEGER_0= RULE_INTEGER | this_BOOLEAN_LITERAL_1= RULE_BOOLEAN_LITERAL ) ;
    public final AntlrDatatypeRuleToken ruleConstant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_0=null;
        Token this_BOOLEAN_LITERAL_1=null;


        	enterRule();

        try {
            // InternalCNL.g:1301:2: ( (this_INTEGER_0= RULE_INTEGER | this_BOOLEAN_LITERAL_1= RULE_BOOLEAN_LITERAL ) )
            // InternalCNL.g:1302:2: (this_INTEGER_0= RULE_INTEGER | this_BOOLEAN_LITERAL_1= RULE_BOOLEAN_LITERAL )
            {
            // InternalCNL.g:1302:2: (this_INTEGER_0= RULE_INTEGER | this_BOOLEAN_LITERAL_1= RULE_BOOLEAN_LITERAL )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INTEGER) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_BOOLEAN_LITERAL) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCNL.g:1303:3: this_INTEGER_0= RULE_INTEGER
                    {
                    this_INTEGER_0=(Token)match(input,RULE_INTEGER,FOLLOW_2); 

                    			current.merge(this_INTEGER_0);
                    		

                    			newLeafNode(this_INTEGER_0, grammarAccess.getConstantAccess().getINTEGERTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCNL.g:1311:3: this_BOOLEAN_LITERAL_1= RULE_BOOLEAN_LITERAL
                    {
                    this_BOOLEAN_LITERAL_1=(Token)match(input,RULE_BOOLEAN_LITERAL,FOLLOW_2); 

                    			current.merge(this_BOOLEAN_LITERAL_1);
                    		

                    			newLeafNode(this_BOOLEAN_LITERAL_1, grammarAccess.getConstantAccess().getBOOLEAN_LITERALTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleReqDeclaration"
    // InternalCNL.g:1322:1: entryRuleReqDeclaration returns [EObject current=null] : iv_ruleReqDeclaration= ruleReqDeclaration EOF ;
    public final EObject entryRuleReqDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReqDeclaration = null;


        try {
            // InternalCNL.g:1322:55: (iv_ruleReqDeclaration= ruleReqDeclaration EOF )
            // InternalCNL.g:1323:2: iv_ruleReqDeclaration= ruleReqDeclaration EOF
            {
             newCompositeNode(grammarAccess.getReqDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReqDeclaration=ruleReqDeclaration();

            state._fsp--;

             current =iv_ruleReqDeclaration; 
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
    // $ANTLR end "entryRuleReqDeclaration"


    // $ANTLR start "ruleReqDeclaration"
    // InternalCNL.g:1329:1: ruleReqDeclaration returns [EObject current=null] : (otherlv_0= 'REQUIREMENT' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= 'END_REQUIREMENT' ) ;
    public final EObject ruleReqDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_requirement_2_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1335:2: ( (otherlv_0= 'REQUIREMENT' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= 'END_REQUIREMENT' ) )
            // InternalCNL.g:1336:2: (otherlv_0= 'REQUIREMENT' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= 'END_REQUIREMENT' )
            {
            // InternalCNL.g:1336:2: (otherlv_0= 'REQUIREMENT' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= 'END_REQUIREMENT' )
            // InternalCNL.g:1337:3: otherlv_0= 'REQUIREMENT' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= 'END_REQUIREMENT'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReqDeclarationAccess().getREQUIREMENTKeyword_0());
            		
            // InternalCNL.g:1341:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCNL.g:1342:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCNL.g:1342:4: (lv_name_1_0= RULE_ID )
            // InternalCNL.g:1343:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReqDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReqDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCNL.g:1359:3: ( (lv_requirement_2_0= ruleRequirement ) )
            // InternalCNL.g:1360:4: (lv_requirement_2_0= ruleRequirement )
            {
            // InternalCNL.g:1360:4: (lv_requirement_2_0= ruleRequirement )
            // InternalCNL.g:1361:5: lv_requirement_2_0= ruleRequirement
            {

            					newCompositeNode(grammarAccess.getReqDeclarationAccess().getRequirementRequirementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_requirement_2_0=ruleRequirement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReqDeclarationRule());
            					}
            					set(
            						current,
            						"requirement",
            						lv_requirement_2_0,
            						"org.xtext.example.CNL.Requirement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getReqDeclarationAccess().getEND_REQUIREMENTKeyword_3());
            		

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
    // $ANTLR end "ruleReqDeclaration"


    // $ANTLR start "entryRuleRequirement"
    // InternalCNL.g:1386:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalCNL.g:1386:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalCNL.g:1387:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
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
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalCNL.g:1393:1: ruleRequirement returns [EObject current=null] : ( ( ( (lv_trigger_0_0= ruleTrig ) ) | ( (lv_invariant_1_0= ruleInv_always ) ) ) otherlv_2= '.' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_trigger_0_0 = null;

        EObject lv_invariant_1_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1399:2: ( ( ( ( (lv_trigger_0_0= ruleTrig ) ) | ( (lv_invariant_1_0= ruleInv_always ) ) ) otherlv_2= '.' ) )
            // InternalCNL.g:1400:2: ( ( ( (lv_trigger_0_0= ruleTrig ) ) | ( (lv_invariant_1_0= ruleInv_always ) ) ) otherlv_2= '.' )
            {
            // InternalCNL.g:1400:2: ( ( ( (lv_trigger_0_0= ruleTrig ) ) | ( (lv_invariant_1_0= ruleInv_always ) ) ) otherlv_2= '.' )
            // InternalCNL.g:1401:3: ( ( (lv_trigger_0_0= ruleTrig ) ) | ( (lv_invariant_1_0= ruleInv_always ) ) ) otherlv_2= '.'
            {
            // InternalCNL.g:1401:3: ( ( (lv_trigger_0_0= ruleTrig ) ) | ( (lv_invariant_1_0= ruleInv_always ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=42 && LA16_0<=43)) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_STRING) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalCNL.g:1402:4: ( (lv_trigger_0_0= ruleTrig ) )
                    {
                    // InternalCNL.g:1402:4: ( (lv_trigger_0_0= ruleTrig ) )
                    // InternalCNL.g:1403:5: (lv_trigger_0_0= ruleTrig )
                    {
                    // InternalCNL.g:1403:5: (lv_trigger_0_0= ruleTrig )
                    // InternalCNL.g:1404:6: lv_trigger_0_0= ruleTrig
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getTriggerTrigParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_trigger_0_0=ruleTrig();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"trigger",
                    							lv_trigger_0_0,
                    							"org.xtext.example.CNL.Trig");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1422:4: ( (lv_invariant_1_0= ruleInv_always ) )
                    {
                    // InternalCNL.g:1422:4: ( (lv_invariant_1_0= ruleInv_always ) )
                    // InternalCNL.g:1423:5: (lv_invariant_1_0= ruleInv_always )
                    {
                    // InternalCNL.g:1423:5: (lv_invariant_1_0= ruleInv_always )
                    // InternalCNL.g:1424:6: lv_invariant_1_0= ruleInv_always
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getInvariantInv_alwaysParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_invariant_1_0=ruleInv_always();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"invariant",
                    							lv_invariant_1_0,
                    							"org.xtext.example.CNL.Inv_always");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getFullStopKeyword_1());
            		

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
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleTrig"
    // InternalCNL.g:1450:1: entryRuleTrig returns [EObject current=null] : iv_ruleTrig= ruleTrig EOF ;
    public final EObject entryRuleTrig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrig = null;


        try {
            // InternalCNL.g:1450:45: (iv_ruleTrig= ruleTrig EOF )
            // InternalCNL.g:1451:2: iv_ruleTrig= ruleTrig EOF
            {
             newCompositeNode(grammarAccess.getTrigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrig=ruleTrig();

            state._fsp--;

             current =iv_ruleTrig; 
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
    // $ANTLR end "entryRuleTrig"


    // $ANTLR start "ruleTrig"
    // InternalCNL.g:1457:1: ruleTrig returns [EObject current=null] : ( ( (otherlv_0= 'After' ( ( ruleSentence ) ) ruleCOMMA ) | otherlv_3= 'Always' ) ( ( (lv_invariant_4_0= ruleInv ) ) | ( (lv_release_reaction_5_0= ruleRelRea ) ) | ( (lv_delay_final_6_0= ruleDelFin ) ) ) ) ;
    public final EObject ruleTrig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_invariant_4_0 = null;

        EObject lv_release_reaction_5_0 = null;

        EObject lv_delay_final_6_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1463:2: ( ( ( (otherlv_0= 'After' ( ( ruleSentence ) ) ruleCOMMA ) | otherlv_3= 'Always' ) ( ( (lv_invariant_4_0= ruleInv ) ) | ( (lv_release_reaction_5_0= ruleRelRea ) ) | ( (lv_delay_final_6_0= ruleDelFin ) ) ) ) )
            // InternalCNL.g:1464:2: ( ( (otherlv_0= 'After' ( ( ruleSentence ) ) ruleCOMMA ) | otherlv_3= 'Always' ) ( ( (lv_invariant_4_0= ruleInv ) ) | ( (lv_release_reaction_5_0= ruleRelRea ) ) | ( (lv_delay_final_6_0= ruleDelFin ) ) ) )
            {
            // InternalCNL.g:1464:2: ( ( (otherlv_0= 'After' ( ( ruleSentence ) ) ruleCOMMA ) | otherlv_3= 'Always' ) ( ( (lv_invariant_4_0= ruleInv ) ) | ( (lv_release_reaction_5_0= ruleRelRea ) ) | ( (lv_delay_final_6_0= ruleDelFin ) ) ) )
            // InternalCNL.g:1465:3: ( (otherlv_0= 'After' ( ( ruleSentence ) ) ruleCOMMA ) | otherlv_3= 'Always' ) ( ( (lv_invariant_4_0= ruleInv ) ) | ( (lv_release_reaction_5_0= ruleRelRea ) ) | ( (lv_delay_final_6_0= ruleDelFin ) ) )
            {
            // InternalCNL.g:1465:3: ( (otherlv_0= 'After' ( ( ruleSentence ) ) ruleCOMMA ) | otherlv_3= 'Always' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            else if ( (LA17_0==43) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalCNL.g:1466:4: (otherlv_0= 'After' ( ( ruleSentence ) ) ruleCOMMA )
                    {
                    // InternalCNL.g:1466:4: (otherlv_0= 'After' ( ( ruleSentence ) ) ruleCOMMA )
                    // InternalCNL.g:1467:5: otherlv_0= 'After' ( ( ruleSentence ) ) ruleCOMMA
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_9); 

                    					newLeafNode(otherlv_0, grammarAccess.getTrigAccess().getAfterKeyword_0_0_0());
                    				
                    // InternalCNL.g:1471:5: ( ( ruleSentence ) )
                    // InternalCNL.g:1472:6: ( ruleSentence )
                    {
                    // InternalCNL.g:1472:6: ( ruleSentence )
                    // InternalCNL.g:1473:7: ruleSentence
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTrigRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getTrigAccess().getNameSentenceDeclarationCrossReference_0_0_1_0());
                    						
                    pushFollow(FOLLOW_26);
                    ruleSentence();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    					newCompositeNode(grammarAccess.getTrigAccess().getCOMMAParserRuleCall_0_0_2());
                    				
                    pushFollow(FOLLOW_27);
                    ruleCOMMA();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1496:4: otherlv_3= 'Always'
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getTrigAccess().getAlwaysKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCNL.g:1501:3: ( ( (lv_invariant_4_0= ruleInv ) ) | ( (lv_release_reaction_5_0= ruleRelRea ) ) | ( (lv_delay_final_6_0= ruleDelFin ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt18=1;
                }
                break;
            case 49:
            case 51:
            case 53:
                {
                alt18=2;
                }
                break;
            case 54:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalCNL.g:1502:4: ( (lv_invariant_4_0= ruleInv ) )
                    {
                    // InternalCNL.g:1502:4: ( (lv_invariant_4_0= ruleInv ) )
                    // InternalCNL.g:1503:5: (lv_invariant_4_0= ruleInv )
                    {
                    // InternalCNL.g:1503:5: (lv_invariant_4_0= ruleInv )
                    // InternalCNL.g:1504:6: lv_invariant_4_0= ruleInv
                    {

                    						newCompositeNode(grammarAccess.getTrigAccess().getInvariantInvParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_invariant_4_0=ruleInv();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrigRule());
                    						}
                    						set(
                    							current,
                    							"invariant",
                    							lv_invariant_4_0,
                    							"org.xtext.example.CNL.Inv");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1522:4: ( (lv_release_reaction_5_0= ruleRelRea ) )
                    {
                    // InternalCNL.g:1522:4: ( (lv_release_reaction_5_0= ruleRelRea ) )
                    // InternalCNL.g:1523:5: (lv_release_reaction_5_0= ruleRelRea )
                    {
                    // InternalCNL.g:1523:5: (lv_release_reaction_5_0= ruleRelRea )
                    // InternalCNL.g:1524:6: lv_release_reaction_5_0= ruleRelRea
                    {

                    						newCompositeNode(grammarAccess.getTrigAccess().getRelease_reactionRelReaParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_release_reaction_5_0=ruleRelRea();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrigRule());
                    						}
                    						set(
                    							current,
                    							"release_reaction",
                    							lv_release_reaction_5_0,
                    							"org.xtext.example.CNL.RelRea");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCNL.g:1542:4: ( (lv_delay_final_6_0= ruleDelFin ) )
                    {
                    // InternalCNL.g:1542:4: ( (lv_delay_final_6_0= ruleDelFin ) )
                    // InternalCNL.g:1543:5: (lv_delay_final_6_0= ruleDelFin )
                    {
                    // InternalCNL.g:1543:5: (lv_delay_final_6_0= ruleDelFin )
                    // InternalCNL.g:1544:6: lv_delay_final_6_0= ruleDelFin
                    {

                    						newCompositeNode(grammarAccess.getTrigAccess().getDelay_finalDelFinParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_delay_final_6_0=ruleDelFin();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrigRule());
                    						}
                    						set(
                    							current,
                    							"delay_final",
                    							lv_delay_final_6_0,
                    							"org.xtext.example.CNL.DelFin");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleTrig"


    // $ANTLR start "entryRuleInv"
    // InternalCNL.g:1566:1: entryRuleInv returns [EObject current=null] : iv_ruleInv= ruleInv EOF ;
    public final EObject entryRuleInv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInv = null;


        try {
            // InternalCNL.g:1566:44: (iv_ruleInv= ruleInv EOF )
            // InternalCNL.g:1567:2: iv_ruleInv= ruleInv EOF
            {
             newCompositeNode(grammarAccess.getInvRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInv=ruleInv();

            state._fsp--;

             current =iv_ruleInv; 
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
    // $ANTLR end "entryRuleInv"


    // $ANTLR start "ruleInv"
    // InternalCNL.g:1573:1: ruleInv returns [EObject current=null] : ( () ( ( ruleSentence ) ) ( ( ruleCOMMA ( (lv_delay_final_3_0= ruleDelFin ) ) ) | (otherlv_4= 'should' otherlv_5= 'remain' otherlv_6= 'valid' otherlv_7= 'until' ( (lv_release_reaction_8_0= ruleRelRea ) ) ) )? ) ;
    public final EObject ruleInv() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_delay_final_3_0 = null;

        EObject lv_release_reaction_8_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1579:2: ( ( () ( ( ruleSentence ) ) ( ( ruleCOMMA ( (lv_delay_final_3_0= ruleDelFin ) ) ) | (otherlv_4= 'should' otherlv_5= 'remain' otherlv_6= 'valid' otherlv_7= 'until' ( (lv_release_reaction_8_0= ruleRelRea ) ) ) )? ) )
            // InternalCNL.g:1580:2: ( () ( ( ruleSentence ) ) ( ( ruleCOMMA ( (lv_delay_final_3_0= ruleDelFin ) ) ) | (otherlv_4= 'should' otherlv_5= 'remain' otherlv_6= 'valid' otherlv_7= 'until' ( (lv_release_reaction_8_0= ruleRelRea ) ) ) )? )
            {
            // InternalCNL.g:1580:2: ( () ( ( ruleSentence ) ) ( ( ruleCOMMA ( (lv_delay_final_3_0= ruleDelFin ) ) ) | (otherlv_4= 'should' otherlv_5= 'remain' otherlv_6= 'valid' otherlv_7= 'until' ( (lv_release_reaction_8_0= ruleRelRea ) ) ) )? )
            // InternalCNL.g:1581:3: () ( ( ruleSentence ) ) ( ( ruleCOMMA ( (lv_delay_final_3_0= ruleDelFin ) ) ) | (otherlv_4= 'should' otherlv_5= 'remain' otherlv_6= 'valid' otherlv_7= 'until' ( (lv_release_reaction_8_0= ruleRelRea ) ) ) )?
            {
            // InternalCNL.g:1581:3: ()
            // InternalCNL.g:1582:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInvAccess().getInvAction_0(),
            					current);
            			

            }

            // InternalCNL.g:1588:3: ( ( ruleSentence ) )
            // InternalCNL.g:1589:4: ( ruleSentence )
            {
            // InternalCNL.g:1589:4: ( ruleSentence )
            // InternalCNL.g:1590:5: ruleSentence
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInvRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInvAccess().getInvSentenceDeclarationCrossReference_1_0());
            				
            pushFollow(FOLLOW_28);
            ruleSentence();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCNL.g:1604:3: ( ( ruleCOMMA ( (lv_delay_final_3_0= ruleDelFin ) ) ) | (otherlv_4= 'should' otherlv_5= 'remain' otherlv_6= 'valid' otherlv_7= 'until' ( (lv_release_reaction_8_0= ruleRelRea ) ) ) )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==61) ) {
                alt19=1;
            }
            else if ( (LA19_0==44) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // InternalCNL.g:1605:4: ( ruleCOMMA ( (lv_delay_final_3_0= ruleDelFin ) ) )
                    {
                    // InternalCNL.g:1605:4: ( ruleCOMMA ( (lv_delay_final_3_0= ruleDelFin ) ) )
                    // InternalCNL.g:1606:5: ruleCOMMA ( (lv_delay_final_3_0= ruleDelFin ) )
                    {

                    					newCompositeNode(grammarAccess.getInvAccess().getCOMMAParserRuleCall_2_0_0());
                    				
                    pushFollow(FOLLOW_27);
                    ruleCOMMA();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalCNL.g:1613:5: ( (lv_delay_final_3_0= ruleDelFin ) )
                    // InternalCNL.g:1614:6: (lv_delay_final_3_0= ruleDelFin )
                    {
                    // InternalCNL.g:1614:6: (lv_delay_final_3_0= ruleDelFin )
                    // InternalCNL.g:1615:7: lv_delay_final_3_0= ruleDelFin
                    {

                    							newCompositeNode(grammarAccess.getInvAccess().getDelay_finalDelFinParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_delay_final_3_0=ruleDelFin();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInvRule());
                    							}
                    							set(
                    								current,
                    								"delay_final",
                    								lv_delay_final_3_0,
                    								"org.xtext.example.CNL.DelFin");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1634:4: (otherlv_4= 'should' otherlv_5= 'remain' otherlv_6= 'valid' otherlv_7= 'until' ( (lv_release_reaction_8_0= ruleRelRea ) ) )
                    {
                    // InternalCNL.g:1634:4: (otherlv_4= 'should' otherlv_5= 'remain' otherlv_6= 'valid' otherlv_7= 'until' ( (lv_release_reaction_8_0= ruleRelRea ) ) )
                    // InternalCNL.g:1635:5: otherlv_4= 'should' otherlv_5= 'remain' otherlv_6= 'valid' otherlv_7= 'until' ( (lv_release_reaction_8_0= ruleRelRea ) )
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_29); 

                    					newLeafNode(otherlv_4, grammarAccess.getInvAccess().getShouldKeyword_2_1_0());
                    				
                    otherlv_5=(Token)match(input,45,FOLLOW_30); 

                    					newLeafNode(otherlv_5, grammarAccess.getInvAccess().getRemainKeyword_2_1_1());
                    				
                    otherlv_6=(Token)match(input,46,FOLLOW_31); 

                    					newLeafNode(otherlv_6, grammarAccess.getInvAccess().getValidKeyword_2_1_2());
                    				
                    otherlv_7=(Token)match(input,47,FOLLOW_32); 

                    					newLeafNode(otherlv_7, grammarAccess.getInvAccess().getUntilKeyword_2_1_3());
                    				
                    // InternalCNL.g:1651:5: ( (lv_release_reaction_8_0= ruleRelRea ) )
                    // InternalCNL.g:1652:6: (lv_release_reaction_8_0= ruleRelRea )
                    {
                    // InternalCNL.g:1652:6: (lv_release_reaction_8_0= ruleRelRea )
                    // InternalCNL.g:1653:7: lv_release_reaction_8_0= ruleRelRea
                    {

                    							newCompositeNode(grammarAccess.getInvAccess().getRelease_reactionRelReaParserRuleCall_2_1_4_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_release_reaction_8_0=ruleRelRea();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInvRule());
                    							}
                    							set(
                    								current,
                    								"release_reaction",
                    								lv_release_reaction_8_0,
                    								"org.xtext.example.CNL.RelRea");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


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
    // $ANTLR end "ruleInv"


    // $ANTLR start "entryRuleInv_always"
    // InternalCNL.g:1676:1: entryRuleInv_always returns [EObject current=null] : iv_ruleInv_always= ruleInv_always EOF ;
    public final EObject entryRuleInv_always() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInv_always = null;


        try {
            // InternalCNL.g:1676:51: (iv_ruleInv_always= ruleInv_always EOF )
            // InternalCNL.g:1677:2: iv_ruleInv_always= ruleInv_always EOF
            {
             newCompositeNode(grammarAccess.getInv_alwaysRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInv_always=ruleInv_always();

            state._fsp--;

             current =iv_ruleInv_always; 
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
    // $ANTLR end "entryRuleInv_always"


    // $ANTLR start "ruleInv_always"
    // InternalCNL.g:1683:1: ruleInv_always returns [EObject current=null] : ( () ( ( ( ruleSentence ) ) otherlv_2= 'should' otherlv_3= 'always' otherlv_4= 'remain' otherlv_5= 'valid' otherlv_6= 'until' ( (lv_release_reaction_7_0= ruleRelRea ) ) ) ) ;
    public final EObject ruleInv_always() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_release_reaction_7_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1689:2: ( ( () ( ( ( ruleSentence ) ) otherlv_2= 'should' otherlv_3= 'always' otherlv_4= 'remain' otherlv_5= 'valid' otherlv_6= 'until' ( (lv_release_reaction_7_0= ruleRelRea ) ) ) ) )
            // InternalCNL.g:1690:2: ( () ( ( ( ruleSentence ) ) otherlv_2= 'should' otherlv_3= 'always' otherlv_4= 'remain' otherlv_5= 'valid' otherlv_6= 'until' ( (lv_release_reaction_7_0= ruleRelRea ) ) ) )
            {
            // InternalCNL.g:1690:2: ( () ( ( ( ruleSentence ) ) otherlv_2= 'should' otherlv_3= 'always' otherlv_4= 'remain' otherlv_5= 'valid' otherlv_6= 'until' ( (lv_release_reaction_7_0= ruleRelRea ) ) ) )
            // InternalCNL.g:1691:3: () ( ( ( ruleSentence ) ) otherlv_2= 'should' otherlv_3= 'always' otherlv_4= 'remain' otherlv_5= 'valid' otherlv_6= 'until' ( (lv_release_reaction_7_0= ruleRelRea ) ) )
            {
            // InternalCNL.g:1691:3: ()
            // InternalCNL.g:1692:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInv_alwaysAccess().getInv_alwaysAction_0(),
            					current);
            			

            }

            // InternalCNL.g:1698:3: ( ( ( ruleSentence ) ) otherlv_2= 'should' otherlv_3= 'always' otherlv_4= 'remain' otherlv_5= 'valid' otherlv_6= 'until' ( (lv_release_reaction_7_0= ruleRelRea ) ) )
            // InternalCNL.g:1699:4: ( ( ruleSentence ) ) otherlv_2= 'should' otherlv_3= 'always' otherlv_4= 'remain' otherlv_5= 'valid' otherlv_6= 'until' ( (lv_release_reaction_7_0= ruleRelRea ) )
            {
            // InternalCNL.g:1699:4: ( ( ruleSentence ) )
            // InternalCNL.g:1700:5: ( ruleSentence )
            {
            // InternalCNL.g:1700:5: ( ruleSentence )
            // InternalCNL.g:1701:6: ruleSentence
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getInv_alwaysRule());
            						}
            					

            						newCompositeNode(grammarAccess.getInv_alwaysAccess().getInvSentenceDeclarationCrossReference_1_0_0());
            					
            pushFollow(FOLLOW_33);
            ruleSentence();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_34); 

            				newLeafNode(otherlv_2, grammarAccess.getInv_alwaysAccess().getShouldKeyword_1_1());
            			
            otherlv_3=(Token)match(input,48,FOLLOW_29); 

            				newLeafNode(otherlv_3, grammarAccess.getInv_alwaysAccess().getAlwaysKeyword_1_2());
            			
            otherlv_4=(Token)match(input,45,FOLLOW_30); 

            				newLeafNode(otherlv_4, grammarAccess.getInv_alwaysAccess().getRemainKeyword_1_3());
            			
            otherlv_5=(Token)match(input,46,FOLLOW_31); 

            				newLeafNode(otherlv_5, grammarAccess.getInv_alwaysAccess().getValidKeyword_1_4());
            			
            otherlv_6=(Token)match(input,47,FOLLOW_32); 

            				newLeafNode(otherlv_6, grammarAccess.getInv_alwaysAccess().getUntilKeyword_1_5());
            			
            // InternalCNL.g:1735:4: ( (lv_release_reaction_7_0= ruleRelRea ) )
            // InternalCNL.g:1736:5: (lv_release_reaction_7_0= ruleRelRea )
            {
            // InternalCNL.g:1736:5: (lv_release_reaction_7_0= ruleRelRea )
            // InternalCNL.g:1737:6: lv_release_reaction_7_0= ruleRelRea
            {

            						newCompositeNode(grammarAccess.getInv_alwaysAccess().getRelease_reactionRelReaParserRuleCall_1_6_0());
            					
            pushFollow(FOLLOW_2);
            lv_release_reaction_7_0=ruleRelRea();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getInv_alwaysRule());
            						}
            						set(
            							current,
            							"release_reaction",
            							lv_release_reaction_7_0,
            							"org.xtext.example.CNL.RelRea");
            						afterParserOrEnumRuleCall();
            					

            }


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
    // $ANTLR end "ruleInv_always"


    // $ANTLR start "entryRuleRelRea"
    // InternalCNL.g:1759:1: entryRuleRelRea returns [EObject current=null] : iv_ruleRelRea= ruleRelRea EOF ;
    public final EObject entryRuleRelRea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelRea = null;


        try {
            // InternalCNL.g:1759:47: (iv_ruleRelRea= ruleRelRea EOF )
            // InternalCNL.g:1760:2: iv_ruleRelRea= ruleRelRea EOF
            {
             newCompositeNode(grammarAccess.getRelReaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelRea=ruleRelRea();

            state._fsp--;

             current =iv_ruleRelRea; 
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
    // $ANTLR end "entryRuleRelRea"


    // $ANTLR start "ruleRelRea"
    // InternalCNL.g:1766:1: ruleRelRea returns [EObject current=null] : ( (otherlv_0= 'either' () ( ( ruleSentence ) ) otherlv_3= 'or' ( (lv_reaction_4_0= ruleReaction ) ) ( ruleCOMMA ( (lv_delay_final_6_0= ruleDelFin ) ) )? ) | ( () ( ( ruleSentence ) ) ) | ( () ( ( (lv_reaction_10_0= ruleReaction ) ) ( ruleCOMMA ( (lv_delay_final_12_0= ruleDelFin ) ) )? ) ) | ( () (otherlv_14= 'Reaction' otherlv_15= 'is' otherlv_16= 'always' ( ( ruleSentence ) ) ( ruleCOMMA ( (lv_delay_final_19_0= ruleDelFin ) ) )? ) ) ) ;
    public final EObject ruleRelRea() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_reaction_4_0 = null;

        EObject lv_delay_final_6_0 = null;

        EObject lv_reaction_10_0 = null;

        EObject lv_delay_final_12_0 = null;

        EObject lv_delay_final_19_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1772:2: ( ( (otherlv_0= 'either' () ( ( ruleSentence ) ) otherlv_3= 'or' ( (lv_reaction_4_0= ruleReaction ) ) ( ruleCOMMA ( (lv_delay_final_6_0= ruleDelFin ) ) )? ) | ( () ( ( ruleSentence ) ) ) | ( () ( ( (lv_reaction_10_0= ruleReaction ) ) ( ruleCOMMA ( (lv_delay_final_12_0= ruleDelFin ) ) )? ) ) | ( () (otherlv_14= 'Reaction' otherlv_15= 'is' otherlv_16= 'always' ( ( ruleSentence ) ) ( ruleCOMMA ( (lv_delay_final_19_0= ruleDelFin ) ) )? ) ) ) )
            // InternalCNL.g:1773:2: ( (otherlv_0= 'either' () ( ( ruleSentence ) ) otherlv_3= 'or' ( (lv_reaction_4_0= ruleReaction ) ) ( ruleCOMMA ( (lv_delay_final_6_0= ruleDelFin ) ) )? ) | ( () ( ( ruleSentence ) ) ) | ( () ( ( (lv_reaction_10_0= ruleReaction ) ) ( ruleCOMMA ( (lv_delay_final_12_0= ruleDelFin ) ) )? ) ) | ( () (otherlv_14= 'Reaction' otherlv_15= 'is' otherlv_16= 'always' ( ( ruleSentence ) ) ( ruleCOMMA ( (lv_delay_final_19_0= ruleDelFin ) ) )? ) ) )
            {
            // InternalCNL.g:1773:2: ( (otherlv_0= 'either' () ( ( ruleSentence ) ) otherlv_3= 'or' ( (lv_reaction_4_0= ruleReaction ) ) ( ruleCOMMA ( (lv_delay_final_6_0= ruleDelFin ) ) )? ) | ( () ( ( ruleSentence ) ) ) | ( () ( ( (lv_reaction_10_0= ruleReaction ) ) ( ruleCOMMA ( (lv_delay_final_12_0= ruleDelFin ) ) )? ) ) | ( () (otherlv_14= 'Reaction' otherlv_15= 'is' otherlv_16= 'always' ( ( ruleSentence ) ) ( ruleCOMMA ( (lv_delay_final_19_0= ruleDelFin ) ) )? ) ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt23=1;
                }
                break;
            case RULE_STRING:
                {
                alt23=2;
                }
                break;
            case 53:
                {
                alt23=3;
                }
                break;
            case 51:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalCNL.g:1774:3: (otherlv_0= 'either' () ( ( ruleSentence ) ) otherlv_3= 'or' ( (lv_reaction_4_0= ruleReaction ) ) ( ruleCOMMA ( (lv_delay_final_6_0= ruleDelFin ) ) )? )
                    {
                    // InternalCNL.g:1774:3: (otherlv_0= 'either' () ( ( ruleSentence ) ) otherlv_3= 'or' ( (lv_reaction_4_0= ruleReaction ) ) ( ruleCOMMA ( (lv_delay_final_6_0= ruleDelFin ) ) )? )
                    // InternalCNL.g:1775:4: otherlv_0= 'either' () ( ( ruleSentence ) ) otherlv_3= 'or' ( (lv_reaction_4_0= ruleReaction ) ) ( ruleCOMMA ( (lv_delay_final_6_0= ruleDelFin ) ) )?
                    {
                    otherlv_0=(Token)match(input,49,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getRelReaAccess().getEitherKeyword_0_0());
                    			
                    // InternalCNL.g:1779:4: ()
                    // InternalCNL.g:1780:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelReaAccess().getRelAction_0_1(),
                    						current);
                    				

                    }

                    // InternalCNL.g:1786:4: ( ( ruleSentence ) )
                    // InternalCNL.g:1787:5: ( ruleSentence )
                    {
                    // InternalCNL.g:1787:5: ( ruleSentence )
                    // InternalCNL.g:1788:6: ruleSentence
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelReaRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRelReaAccess().getRelSentenceDeclarationCrossReference_0_2_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleSentence();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,50,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelReaAccess().getOrKeyword_0_3());
                    			
                    // InternalCNL.g:1806:4: ( (lv_reaction_4_0= ruleReaction ) )
                    // InternalCNL.g:1807:5: (lv_reaction_4_0= ruleReaction )
                    {
                    // InternalCNL.g:1807:5: (lv_reaction_4_0= ruleReaction )
                    // InternalCNL.g:1808:6: lv_reaction_4_0= ruleReaction
                    {

                    						newCompositeNode(grammarAccess.getRelReaAccess().getReactionReactionParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_reaction_4_0=ruleReaction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelReaRule());
                    						}
                    						set(
                    							current,
                    							"reaction",
                    							lv_reaction_4_0,
                    							"org.xtext.example.CNL.Reaction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCNL.g:1825:4: ( ruleCOMMA ( (lv_delay_final_6_0= ruleDelFin ) ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==61) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalCNL.g:1826:5: ruleCOMMA ( (lv_delay_final_6_0= ruleDelFin ) )
                            {

                            					newCompositeNode(grammarAccess.getRelReaAccess().getCOMMAParserRuleCall_0_5_0());
                            				
                            pushFollow(FOLLOW_27);
                            ruleCOMMA();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				
                            // InternalCNL.g:1833:5: ( (lv_delay_final_6_0= ruleDelFin ) )
                            // InternalCNL.g:1834:6: (lv_delay_final_6_0= ruleDelFin )
                            {
                            // InternalCNL.g:1834:6: (lv_delay_final_6_0= ruleDelFin )
                            // InternalCNL.g:1835:7: lv_delay_final_6_0= ruleDelFin
                            {

                            							newCompositeNode(grammarAccess.getRelReaAccess().getDelay_finalDelFinParserRuleCall_0_5_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_delay_final_6_0=ruleDelFin();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRelReaRule());
                            							}
                            							set(
                            								current,
                            								"delay_final",
                            								lv_delay_final_6_0,
                            								"org.xtext.example.CNL.DelFin");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:1855:3: ( () ( ( ruleSentence ) ) )
                    {
                    // InternalCNL.g:1855:3: ( () ( ( ruleSentence ) ) )
                    // InternalCNL.g:1856:4: () ( ( ruleSentence ) )
                    {
                    // InternalCNL.g:1856:4: ()
                    // InternalCNL.g:1857:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelReaAccess().getRelAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCNL.g:1863:4: ( ( ruleSentence ) )
                    // InternalCNL.g:1864:5: ( ruleSentence )
                    {
                    // InternalCNL.g:1864:5: ( ruleSentence )
                    // InternalCNL.g:1865:6: ruleSentence
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelReaRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRelReaAccess().getRelSentenceDeclarationCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleSentence();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCNL.g:1881:3: ( () ( ( (lv_reaction_10_0= ruleReaction ) ) ( ruleCOMMA ( (lv_delay_final_12_0= ruleDelFin ) ) )? ) )
                    {
                    // InternalCNL.g:1881:3: ( () ( ( (lv_reaction_10_0= ruleReaction ) ) ( ruleCOMMA ( (lv_delay_final_12_0= ruleDelFin ) ) )? ) )
                    // InternalCNL.g:1882:4: () ( ( (lv_reaction_10_0= ruleReaction ) ) ( ruleCOMMA ( (lv_delay_final_12_0= ruleDelFin ) ) )? )
                    {
                    // InternalCNL.g:1882:4: ()
                    // InternalCNL.g:1883:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelReaAccess().getReaAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCNL.g:1889:4: ( ( (lv_reaction_10_0= ruleReaction ) ) ( ruleCOMMA ( (lv_delay_final_12_0= ruleDelFin ) ) )? )
                    // InternalCNL.g:1890:5: ( (lv_reaction_10_0= ruleReaction ) ) ( ruleCOMMA ( (lv_delay_final_12_0= ruleDelFin ) ) )?
                    {
                    // InternalCNL.g:1890:5: ( (lv_reaction_10_0= ruleReaction ) )
                    // InternalCNL.g:1891:6: (lv_reaction_10_0= ruleReaction )
                    {
                    // InternalCNL.g:1891:6: (lv_reaction_10_0= ruleReaction )
                    // InternalCNL.g:1892:7: lv_reaction_10_0= ruleReaction
                    {

                    							newCompositeNode(grammarAccess.getRelReaAccess().getReactionReactionParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_37);
                    lv_reaction_10_0=ruleReaction();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRelReaRule());
                    							}
                    							set(
                    								current,
                    								"reaction",
                    								lv_reaction_10_0,
                    								"org.xtext.example.CNL.Reaction");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalCNL.g:1909:5: ( ruleCOMMA ( (lv_delay_final_12_0= ruleDelFin ) ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==61) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalCNL.g:1910:6: ruleCOMMA ( (lv_delay_final_12_0= ruleDelFin ) )
                            {

                            						newCompositeNode(grammarAccess.getRelReaAccess().getCOMMAParserRuleCall_2_1_1_0());
                            					
                            pushFollow(FOLLOW_27);
                            ruleCOMMA();

                            state._fsp--;


                            						afterParserOrEnumRuleCall();
                            					
                            // InternalCNL.g:1917:6: ( (lv_delay_final_12_0= ruleDelFin ) )
                            // InternalCNL.g:1918:7: (lv_delay_final_12_0= ruleDelFin )
                            {
                            // InternalCNL.g:1918:7: (lv_delay_final_12_0= ruleDelFin )
                            // InternalCNL.g:1919:8: lv_delay_final_12_0= ruleDelFin
                            {

                            								newCompositeNode(grammarAccess.getRelReaAccess().getDelay_finalDelFinParserRuleCall_2_1_1_1_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_delay_final_12_0=ruleDelFin();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getRelReaRule());
                            								}
                            								set(
                            									current,
                            									"delay_final",
                            									lv_delay_final_12_0,
                            									"org.xtext.example.CNL.DelFin");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCNL.g:1940:3: ( () (otherlv_14= 'Reaction' otherlv_15= 'is' otherlv_16= 'always' ( ( ruleSentence ) ) ( ruleCOMMA ( (lv_delay_final_19_0= ruleDelFin ) ) )? ) )
                    {
                    // InternalCNL.g:1940:3: ( () (otherlv_14= 'Reaction' otherlv_15= 'is' otherlv_16= 'always' ( ( ruleSentence ) ) ( ruleCOMMA ( (lv_delay_final_19_0= ruleDelFin ) ) )? ) )
                    // InternalCNL.g:1941:4: () (otherlv_14= 'Reaction' otherlv_15= 'is' otherlv_16= 'always' ( ( ruleSentence ) ) ( ruleCOMMA ( (lv_delay_final_19_0= ruleDelFin ) ) )? )
                    {
                    // InternalCNL.g:1941:4: ()
                    // InternalCNL.g:1942:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelReaAccess().getReaAction_3_0(),
                    						current);
                    				

                    }

                    // InternalCNL.g:1948:4: (otherlv_14= 'Reaction' otherlv_15= 'is' otherlv_16= 'always' ( ( ruleSentence ) ) ( ruleCOMMA ( (lv_delay_final_19_0= ruleDelFin ) ) )? )
                    // InternalCNL.g:1949:5: otherlv_14= 'Reaction' otherlv_15= 'is' otherlv_16= 'always' ( ( ruleSentence ) ) ( ruleCOMMA ( (lv_delay_final_19_0= ruleDelFin ) ) )?
                    {
                    otherlv_14=(Token)match(input,51,FOLLOW_38); 

                    					newLeafNode(otherlv_14, grammarAccess.getRelReaAccess().getReactionKeyword_3_1_0());
                    				
                    otherlv_15=(Token)match(input,52,FOLLOW_34); 

                    					newLeafNode(otherlv_15, grammarAccess.getRelReaAccess().getIsKeyword_3_1_1());
                    				
                    otherlv_16=(Token)match(input,48,FOLLOW_9); 

                    					newLeafNode(otherlv_16, grammarAccess.getRelReaAccess().getAlwaysKeyword_3_1_2());
                    				
                    // InternalCNL.g:1961:5: ( ( ruleSentence ) )
                    // InternalCNL.g:1962:6: ( ruleSentence )
                    {
                    // InternalCNL.g:1962:6: ( ruleSentence )
                    // InternalCNL.g:1963:7: ruleSentence
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRelReaRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getRelReaAccess().getReaSentenceDeclarationCrossReference_3_1_3_0());
                    						
                    pushFollow(FOLLOW_37);
                    ruleSentence();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalCNL.g:1977:5: ( ruleCOMMA ( (lv_delay_final_19_0= ruleDelFin ) ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==61) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalCNL.g:1978:6: ruleCOMMA ( (lv_delay_final_19_0= ruleDelFin ) )
                            {

                            						newCompositeNode(grammarAccess.getRelReaAccess().getCOMMAParserRuleCall_3_1_4_0());
                            					
                            pushFollow(FOLLOW_27);
                            ruleCOMMA();

                            state._fsp--;


                            						afterParserOrEnumRuleCall();
                            					
                            // InternalCNL.g:1985:6: ( (lv_delay_final_19_0= ruleDelFin ) )
                            // InternalCNL.g:1986:7: (lv_delay_final_19_0= ruleDelFin )
                            {
                            // InternalCNL.g:1986:7: (lv_delay_final_19_0= ruleDelFin )
                            // InternalCNL.g:1987:8: lv_delay_final_19_0= ruleDelFin
                            {

                            								newCompositeNode(grammarAccess.getRelReaAccess().getDelay_finalDelFinParserRuleCall_3_1_4_1_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_delay_final_19_0=ruleDelFin();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getRelReaRule());
                            								}
                            								set(
                            									current,
                            									"delay_final",
                            									lv_delay_final_19_0,
                            									"org.xtext.example.CNL.DelFin");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleRelRea"


    // $ANTLR start "entryRuleReaction"
    // InternalCNL.g:2011:1: entryRuleReaction returns [EObject current=null] : iv_ruleReaction= ruleReaction EOF ;
    public final EObject entryRuleReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaction = null;


        try {
            // InternalCNL.g:2011:49: (iv_ruleReaction= ruleReaction EOF )
            // InternalCNL.g:2012:2: iv_ruleReaction= ruleReaction EOF
            {
             newCompositeNode(grammarAccess.getReactionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReaction=ruleReaction();

            state._fsp--;

             current =iv_ruleReaction; 
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
    // $ANTLR end "entryRuleReaction"


    // $ANTLR start "ruleReaction"
    // InternalCNL.g:2018:1: ruleReaction returns [EObject current=null] : ( () otherlv_1= 'reaction' otherlv_2= 'is' ( ( ruleSentence ) ) ) ;
    public final EObject ruleReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCNL.g:2024:2: ( ( () otherlv_1= 'reaction' otherlv_2= 'is' ( ( ruleSentence ) ) ) )
            // InternalCNL.g:2025:2: ( () otherlv_1= 'reaction' otherlv_2= 'is' ( ( ruleSentence ) ) )
            {
            // InternalCNL.g:2025:2: ( () otherlv_1= 'reaction' otherlv_2= 'is' ( ( ruleSentence ) ) )
            // InternalCNL.g:2026:3: () otherlv_1= 'reaction' otherlv_2= 'is' ( ( ruleSentence ) )
            {
            // InternalCNL.g:2026:3: ()
            // InternalCNL.g:2027:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReactionAccess().getReaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getReactionAccess().getReactionKeyword_1());
            		
            otherlv_2=(Token)match(input,52,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getReactionAccess().getIsKeyword_2());
            		
            // InternalCNL.g:2041:3: ( ( ruleSentence ) )
            // InternalCNL.g:2042:4: ( ruleSentence )
            {
            // InternalCNL.g:2042:4: ( ruleSentence )
            // InternalCNL.g:2043:5: ruleSentence
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReactionAccess().getReaSentenceDeclarationCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;


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
    // $ANTLR end "ruleReaction"


    // $ANTLR start "entryRuleDelFin"
    // InternalCNL.g:2061:1: entryRuleDelFin returns [EObject current=null] : iv_ruleDelFin= ruleDelFin EOF ;
    public final EObject entryRuleDelFin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelFin = null;


        try {
            // InternalCNL.g:2061:47: (iv_ruleDelFin= ruleDelFin EOF )
            // InternalCNL.g:2062:2: iv_ruleDelFin= ruleDelFin EOF
            {
             newCompositeNode(grammarAccess.getDelFinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelFin=ruleDelFin();

            state._fsp--;

             current =iv_ruleDelFin; 
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
    // $ANTLR end "entryRuleDelFin"


    // $ANTLR start "ruleDelFin"
    // InternalCNL.g:2068:1: ruleDelFin returns [EObject current=null] : ( () ( ( (otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur' ) ( ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( ( ruleSentence ) ) )? ) | ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( ( ruleSentence ) ) ) ) ) | ( ( ruleSentence ) ) ) ) ;
    public final EObject ruleDelFin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_delay_4_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:2074:2: ( ( () ( ( (otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur' ) ( ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( ( ruleSentence ) ) )? ) | ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( ( ruleSentence ) ) ) ) ) | ( ( ruleSentence ) ) ) ) )
            // InternalCNL.g:2075:2: ( () ( ( (otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur' ) ( ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( ( ruleSentence ) ) )? ) | ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( ( ruleSentence ) ) ) ) ) | ( ( ruleSentence ) ) ) )
            {
            // InternalCNL.g:2075:2: ( () ( ( (otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur' ) ( ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( ( ruleSentence ) ) )? ) | ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( ( ruleSentence ) ) ) ) ) | ( ( ruleSentence ) ) ) )
            // InternalCNL.g:2076:3: () ( ( (otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur' ) ( ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( ( ruleSentence ) ) )? ) | ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( ( ruleSentence ) ) ) ) ) | ( ( ruleSentence ) ) )
            {
            // InternalCNL.g:2076:3: ()
            // InternalCNL.g:2077:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDelFinAccess().getSentenceAction_0(),
            					current);
            			

            }

            // InternalCNL.g:2083:3: ( ( (otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur' ) ( ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( ( ruleSentence ) ) )? ) | ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( ( ruleSentence ) ) ) ) ) | ( ( ruleSentence ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==54) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_STRING) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalCNL.g:2084:4: ( (otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur' ) ( ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( ( ruleSentence ) ) )? ) | ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( ( ruleSentence ) ) ) ) )
                    {
                    // InternalCNL.g:2084:4: ( (otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur' ) ( ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( ( ruleSentence ) ) )? ) | ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( ( ruleSentence ) ) ) ) )
                    // InternalCNL.g:2085:5: (otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur' ) ( ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( ( ruleSentence ) ) )? ) | ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( ( ruleSentence ) ) ) )
                    {
                    // InternalCNL.g:2085:5: (otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur' )
                    // InternalCNL.g:2086:6: otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur'
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_39); 

                    						newLeafNode(otherlv_1, grammarAccess.getDelFinAccess().getWhichKeyword_1_0_0_0());
                    					
                    otherlv_2=(Token)match(input,55,FOLLOW_40); 

                    						newLeafNode(otherlv_2, grammarAccess.getDelFinAccess().getMustKeyword_1_0_0_1());
                    					
                    otherlv_3=(Token)match(input,56,FOLLOW_41); 

                    						newLeafNode(otherlv_3, grammarAccess.getDelFinAccess().getOccurKeyword_1_0_0_2());
                    					

                    }

                    // InternalCNL.g:2099:5: ( ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( ( ruleSentence ) ) )? ) | ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( ( ruleSentence ) ) ) )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==60) ) {
                        alt26=1;
                    }
                    else if ( ((LA26_0>=58 && LA26_0<=59)) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalCNL.g:2100:6: ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( ( ruleSentence ) ) )? )
                            {
                            // InternalCNL.g:2100:6: ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( ( ruleSentence ) ) )? )
                            // InternalCNL.g:2101:7: ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( ( ruleSentence ) ) )?
                            {
                            // InternalCNL.g:2101:7: ( (lv_delay_4_0= ruleDelay ) )
                            // InternalCNL.g:2102:8: (lv_delay_4_0= ruleDelay )
                            {
                            // InternalCNL.g:2102:8: (lv_delay_4_0= ruleDelay )
                            // InternalCNL.g:2103:9: lv_delay_4_0= ruleDelay
                            {

                            									newCompositeNode(grammarAccess.getDelFinAccess().getDelayDelayParserRuleCall_1_0_1_0_0_0());
                            								
                            pushFollow(FOLLOW_42);
                            lv_delay_4_0=ruleDelay();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getDelFinRule());
                            									}
                            									set(
                            										current,
                            										"delay",
                            										lv_delay_4_0,
                            										"org.xtext.example.CNL.Delay");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            // InternalCNL.g:2120:7: (otherlv_5= 'from' ( ( ruleSentence ) ) )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==57) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // InternalCNL.g:2121:8: otherlv_5= 'from' ( ( ruleSentence ) )
                                    {
                                    otherlv_5=(Token)match(input,57,FOLLOW_9); 

                                    								newLeafNode(otherlv_5, grammarAccess.getDelFinAccess().getFromKeyword_1_0_1_0_1_0());
                                    							
                                    // InternalCNL.g:2125:8: ( ( ruleSentence ) )
                                    // InternalCNL.g:2126:9: ( ruleSentence )
                                    {
                                    // InternalCNL.g:2126:9: ( ruleSentence )
                                    // InternalCNL.g:2127:10: ruleSentence
                                    {

                                    										if (current==null) {
                                    											current = createModelElement(grammarAccess.getDelFinRule());
                                    										}
                                    									

                                    										newCompositeNode(grammarAccess.getDelFinAccess().getFinSentenceDeclarationCrossReference_1_0_1_0_1_1_0());
                                    									
                                    pushFollow(FOLLOW_2);
                                    ruleSentence();

                                    state._fsp--;


                                    										afterParserOrEnumRuleCall();
                                    									

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalCNL.g:2144:6: ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( ( ruleSentence ) ) )
                            {
                            // InternalCNL.g:2144:6: ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( ( ruleSentence ) ) )
                            // InternalCNL.g:2145:7: (otherlv_7= 'immediately' )? otherlv_8= 'after' ( ( ruleSentence ) )
                            {
                            // InternalCNL.g:2145:7: (otherlv_7= 'immediately' )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==58) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // InternalCNL.g:2146:8: otherlv_7= 'immediately'
                                    {
                                    otherlv_7=(Token)match(input,58,FOLLOW_43); 

                                    								newLeafNode(otherlv_7, grammarAccess.getDelFinAccess().getImmediatelyKeyword_1_0_1_1_0());
                                    							

                                    }
                                    break;

                            }

                            otherlv_8=(Token)match(input,59,FOLLOW_9); 

                            							newLeafNode(otherlv_8, grammarAccess.getDelFinAccess().getAfterKeyword_1_0_1_1_1());
                            						
                            // InternalCNL.g:2155:7: ( ( ruleSentence ) )
                            // InternalCNL.g:2156:8: ( ruleSentence )
                            {
                            // InternalCNL.g:2156:8: ( ruleSentence )
                            // InternalCNL.g:2157:9: ruleSentence
                            {

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getDelFinRule());
                            									}
                            								

                            									newCompositeNode(grammarAccess.getDelFinAccess().getFinSentenceDeclarationCrossReference_1_0_1_1_2_0());
                            								
                            pushFollow(FOLLOW_2);
                            ruleSentence();

                            state._fsp--;


                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:2175:4: ( ( ruleSentence ) )
                    {
                    // InternalCNL.g:2175:4: ( ( ruleSentence ) )
                    // InternalCNL.g:2176:5: ( ruleSentence )
                    {
                    // InternalCNL.g:2176:5: ( ruleSentence )
                    // InternalCNL.g:2177:6: ruleSentence
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDelFinRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDelFinAccess().getFinSentenceDeclarationCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleSentence();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleDelFin"


    // $ANTLR start "entryRuleDelay"
    // InternalCNL.g:2196:1: entryRuleDelay returns [EObject current=null] : iv_ruleDelay= ruleDelay EOF ;
    public final EObject entryRuleDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelay = null;


        try {
            // InternalCNL.g:2196:46: (iv_ruleDelay= ruleDelay EOF )
            // InternalCNL.g:2197:2: iv_ruleDelay= ruleDelay EOF
            {
             newCompositeNode(grammarAccess.getDelayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelay=ruleDelay();

            state._fsp--;

             current =iv_ruleDelay; 
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
    // $ANTLR end "entryRuleDelay"


    // $ANTLR start "ruleDelay"
    // InternalCNL.g:2203:1: ruleDelay returns [EObject current=null] : (otherlv_0= 'within' () ( ( ruleSentence ) ) ) ;
    public final EObject ruleDelay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCNL.g:2209:2: ( (otherlv_0= 'within' () ( ( ruleSentence ) ) ) )
            // InternalCNL.g:2210:2: (otherlv_0= 'within' () ( ( ruleSentence ) ) )
            {
            // InternalCNL.g:2210:2: (otherlv_0= 'within' () ( ( ruleSentence ) ) )
            // InternalCNL.g:2211:3: otherlv_0= 'within' () ( ( ruleSentence ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDelayAccess().getWithinKeyword_0());
            		
            // InternalCNL.g:2215:3: ()
            // InternalCNL.g:2216:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDelayAccess().getDelAction_1(),
            					current);
            			

            }

            // InternalCNL.g:2222:3: ( ( ruleSentence ) )
            // InternalCNL.g:2223:4: ( ruleSentence )
            {
            // InternalCNL.g:2223:4: ( ruleSentence )
            // InternalCNL.g:2224:5: ruleSentence
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelayRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDelayAccess().getDelSentenceDeclarationCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;


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
    // $ANTLR end "ruleDelay"


    // $ANTLR start "entryRuleSentence"
    // InternalCNL.g:2242:1: entryRuleSentence returns [String current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final String entryRuleSentence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSentence = null;


        try {
            // InternalCNL.g:2242:48: (iv_ruleSentence= ruleSentence EOF )
            // InternalCNL.g:2243:2: iv_ruleSentence= ruleSentence EOF
            {
             newCompositeNode(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentence=ruleSentence();

            state._fsp--;

             current =iv_ruleSentence.getText(); 
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
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // InternalCNL.g:2249:1: ruleSentence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleSentence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalCNL.g:2255:2: (this_STRING_0= RULE_STRING )
            // InternalCNL.g:2256:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getSentenceAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleCOMMA"
    // InternalCNL.g:2266:1: entryRuleCOMMA returns [String current=null] : iv_ruleCOMMA= ruleCOMMA EOF ;
    public final String entryRuleCOMMA() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOMMA = null;


        try {
            // InternalCNL.g:2266:45: (iv_ruleCOMMA= ruleCOMMA EOF )
            // InternalCNL.g:2267:2: iv_ruleCOMMA= ruleCOMMA EOF
            {
             newCompositeNode(grammarAccess.getCOMMARule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCOMMA=ruleCOMMA();

            state._fsp--;

             current =iv_ruleCOMMA.getText(); 
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
    // $ANTLR end "entryRuleCOMMA"


    // $ANTLR start "ruleCOMMA"
    // InternalCNL.g:2273:1: ruleCOMMA returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ',' ;
    public final AntlrDatatypeRuleToken ruleCOMMA() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCNL.g:2279:2: (kw= ',' )
            // InternalCNL.g:2280:2: kw= ','
            {
            kw=(Token)match(input,61,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCOMMAAccess().getCommaKeyword());
            	

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
    // $ANTLR end "ruleCOMMA"


    // $ANTLR start "ruleEquOperator"
    // InternalCNL.g:2288:1: ruleEquOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleEquOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCNL.g:2294:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) )
            // InternalCNL.g:2295:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalCNL.g:2295:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==62) ) {
                alt28=1;
            }
            else if ( (LA28_0==63) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalCNL.g:2296:3: (enumLiteral_0= '==' )
                    {
                    // InternalCNL.g:2296:3: (enumLiteral_0= '==' )
                    // InternalCNL.g:2297:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getEquOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEquOperatorAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:2304:3: (enumLiteral_1= '<>' )
                    {
                    // InternalCNL.g:2304:3: (enumLiteral_1= '<>' )
                    // InternalCNL.g:2305:4: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getEquOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEquOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleEquOperator"


    // $ANTLR start "ruleCompOperator"
    // InternalCNL.g:2315:1: ruleCompOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<=' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) ) ;
    public final Enumerator ruleCompOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCNL.g:2321:2: ( ( (enumLiteral_0= '<=' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) ) )
            // InternalCNL.g:2322:2: ( (enumLiteral_0= '<=' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) )
            {
            // InternalCNL.g:2322:2: ( (enumLiteral_0= '<=' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt29=1;
                }
                break;
            case 65:
                {
                alt29=2;
                }
                break;
            case 66:
                {
                alt29=3;
                }
                break;
            case 67:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalCNL.g:2323:3: (enumLiteral_0= '<=' )
                    {
                    // InternalCNL.g:2323:3: (enumLiteral_0= '<=' )
                    // InternalCNL.g:2324:4: enumLiteral_0= '<='
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getLESS_EQUEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompOperatorAccess().getLESS_EQUEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:2331:3: (enumLiteral_1= '>=' )
                    {
                    // InternalCNL.g:2331:3: (enumLiteral_1= '>=' )
                    // InternalCNL.g:2332:4: enumLiteral_1= '>='
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getGREATER_EQUEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompOperatorAccess().getGREATER_EQUEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCNL.g:2339:3: (enumLiteral_2= '<' )
                    {
                    // InternalCNL.g:2339:3: (enumLiteral_2= '<' )
                    // InternalCNL.g:2340:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCNL.g:2347:3: (enumLiteral_3= '>' )
                    {
                    // InternalCNL.g:2347:3: (enumLiteral_3= '>' )
                    // InternalCNL.g:2348:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_3());
                    			

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008000A40002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001FE0000190L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000FL});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001800000190L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000C0000000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x006A000000000200L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x2000100000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x002A000000000200L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0800000000000000L});

}