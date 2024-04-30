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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INTEGER", "RULE_OR_OPERATOR", "RULE_INTERVAL", "RULE_BOOLEAN_LITERAL", "RULE_DIRECT_TYPE_PREFIX", "RULE_DIRECT_SIZE_PREFIX", "RULE_OCTAL_DIGIT", "RULE_DIRECT_VARIABLE", "RULE_DIGIT", "RULE_LETTER", "RULE_BIT", "RULE_HEX_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_WS", "RULE_INT", "RULE_ANY_OTHER", "'REQUIREMENT'", "'END_REQUIREMENT'", "'.'", "'After'", "'Always'", "'should'", "'remain'", "'valid'", "'until'", "'always'", "'either'", "'or'", "'Reaction'", "'is'", "'reaction'", "'which'", "'must'", "'occur'", "'from'", "'immediately'", "'after'", "'within'", "'\"'", "','", "'BOOL'", "'INT'", "'VAR_INPUT'", "';'", "'END_VAR'", "'VAR_OUTPUT'", "':'", "'SENTENCE'", "'END_SENTENCE'", "'='", "'XOR'", "'&&'", "'AND'", "'FE'", "'RE'", "'HIGH'", "'LOW'", "'NOT'", "'!'", "'TAU'", "'('", "')'", "'#T'", "'=='", "'<>'", "'<'", "'>'", "'<='", "'>='"
    };
    public static final int T__50=50;
    public static final int RULE_INTERVAL=7;
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
    public static final int RULE_BOOLEAN_LITERAL=8;
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
    public static final int RULE_OR_OPERATOR=6;
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
                case 49:
                    {
                    alt1=1;
                    }
                    break;
                case 52:
                    {
                    alt1=2;
                    }
                    break;
                case 54:
                    {
                    alt1=3;
                    }
                    break;
                case 23:
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


    // $ANTLR start "entryRuleReqDeclaration"
    // InternalCNL.g:163:1: entryRuleReqDeclaration returns [EObject current=null] : iv_ruleReqDeclaration= ruleReqDeclaration EOF ;
    public final EObject entryRuleReqDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReqDeclaration = null;


        try {
            // InternalCNL.g:163:55: (iv_ruleReqDeclaration= ruleReqDeclaration EOF )
            // InternalCNL.g:164:2: iv_ruleReqDeclaration= ruleReqDeclaration EOF
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
    // InternalCNL.g:170:1: ruleReqDeclaration returns [EObject current=null] : (otherlv_0= 'REQUIREMENT' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= 'END_REQUIREMENT' ) ;
    public final EObject ruleReqDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_requirement_2_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:176:2: ( (otherlv_0= 'REQUIREMENT' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= 'END_REQUIREMENT' ) )
            // InternalCNL.g:177:2: (otherlv_0= 'REQUIREMENT' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= 'END_REQUIREMENT' )
            {
            // InternalCNL.g:177:2: (otherlv_0= 'REQUIREMENT' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= 'END_REQUIREMENT' )
            // InternalCNL.g:178:3: otherlv_0= 'REQUIREMENT' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirement_2_0= ruleRequirement ) ) otherlv_3= 'END_REQUIREMENT'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReqDeclarationAccess().getREQUIREMENTKeyword_0());
            		
            // InternalCNL.g:182:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCNL.g:183:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCNL.g:183:4: (lv_name_1_0= RULE_ID )
            // InternalCNL.g:184:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            // InternalCNL.g:200:3: ( (lv_requirement_2_0= ruleRequirement ) )
            // InternalCNL.g:201:4: (lv_requirement_2_0= ruleRequirement )
            {
            // InternalCNL.g:201:4: (lv_requirement_2_0= ruleRequirement )
            // InternalCNL.g:202:5: lv_requirement_2_0= ruleRequirement
            {

            					newCompositeNode(grammarAccess.getReqDeclarationAccess().getRequirementRequirementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

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
    // InternalCNL.g:227:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalCNL.g:227:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalCNL.g:228:2: iv_ruleRequirement= ruleRequirement EOF
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
    // InternalCNL.g:234:1: ruleRequirement returns [EObject current=null] : ( ( ( (lv_trigger_0_0= ruleTrig ) ) | ( (lv_invariant_1_0= ruleInv_always ) ) ) otherlv_2= '.' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_trigger_0_0 = null;

        EObject lv_invariant_1_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:240:2: ( ( ( ( (lv_trigger_0_0= ruleTrig ) ) | ( (lv_invariant_1_0= ruleInv_always ) ) ) otherlv_2= '.' ) )
            // InternalCNL.g:241:2: ( ( ( (lv_trigger_0_0= ruleTrig ) ) | ( (lv_invariant_1_0= ruleInv_always ) ) ) otherlv_2= '.' )
            {
            // InternalCNL.g:241:2: ( ( ( (lv_trigger_0_0= ruleTrig ) ) | ( (lv_invariant_1_0= ruleInv_always ) ) ) otherlv_2= '.' )
            // InternalCNL.g:242:3: ( ( (lv_trigger_0_0= ruleTrig ) ) | ( (lv_invariant_1_0= ruleInv_always ) ) ) otherlv_2= '.'
            {
            // InternalCNL.g:242:3: ( ( (lv_trigger_0_0= ruleTrig ) ) | ( (lv_invariant_1_0= ruleInv_always ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=26 && LA2_0<=27)) ) {
                alt2=1;
            }
            else if ( (LA2_0==45) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCNL.g:243:4: ( (lv_trigger_0_0= ruleTrig ) )
                    {
                    // InternalCNL.g:243:4: ( (lv_trigger_0_0= ruleTrig ) )
                    // InternalCNL.g:244:5: (lv_trigger_0_0= ruleTrig )
                    {
                    // InternalCNL.g:244:5: (lv_trigger_0_0= ruleTrig )
                    // InternalCNL.g:245:6: lv_trigger_0_0= ruleTrig
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getTriggerTrigParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_7);
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
                    // InternalCNL.g:263:4: ( (lv_invariant_1_0= ruleInv_always ) )
                    {
                    // InternalCNL.g:263:4: ( (lv_invariant_1_0= ruleInv_always ) )
                    // InternalCNL.g:264:5: (lv_invariant_1_0= ruleInv_always )
                    {
                    // InternalCNL.g:264:5: (lv_invariant_1_0= ruleInv_always )
                    // InternalCNL.g:265:6: lv_invariant_1_0= ruleInv_always
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getInvariantInv_alwaysParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

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
    // InternalCNL.g:291:1: entryRuleTrig returns [EObject current=null] : iv_ruleTrig= ruleTrig EOF ;
    public final EObject entryRuleTrig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrig = null;


        try {
            // InternalCNL.g:291:45: (iv_ruleTrig= ruleTrig EOF )
            // InternalCNL.g:292:2: iv_ruleTrig= ruleTrig EOF
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
    // InternalCNL.g:298:1: ruleTrig returns [EObject current=null] : ( ( ( () (otherlv_1= 'After' ( (lv_trig_2_0= ruleSentence ) ) ruleComma ) ) | otherlv_4= 'Always' ) ( ( (lv_invariant_5_0= ruleInv ) ) | ( (lv_release_reaction_6_0= ruleRelRea ) ) | ( (lv_delay_final_7_0= ruleDelFin ) ) ) ) ;
    public final EObject ruleTrig() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_trig_2_0 = null;

        EObject lv_invariant_5_0 = null;

        EObject lv_release_reaction_6_0 = null;

        EObject lv_delay_final_7_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:304:2: ( ( ( ( () (otherlv_1= 'After' ( (lv_trig_2_0= ruleSentence ) ) ruleComma ) ) | otherlv_4= 'Always' ) ( ( (lv_invariant_5_0= ruleInv ) ) | ( (lv_release_reaction_6_0= ruleRelRea ) ) | ( (lv_delay_final_7_0= ruleDelFin ) ) ) ) )
            // InternalCNL.g:305:2: ( ( ( () (otherlv_1= 'After' ( (lv_trig_2_0= ruleSentence ) ) ruleComma ) ) | otherlv_4= 'Always' ) ( ( (lv_invariant_5_0= ruleInv ) ) | ( (lv_release_reaction_6_0= ruleRelRea ) ) | ( (lv_delay_final_7_0= ruleDelFin ) ) ) )
            {
            // InternalCNL.g:305:2: ( ( ( () (otherlv_1= 'After' ( (lv_trig_2_0= ruleSentence ) ) ruleComma ) ) | otherlv_4= 'Always' ) ( ( (lv_invariant_5_0= ruleInv ) ) | ( (lv_release_reaction_6_0= ruleRelRea ) ) | ( (lv_delay_final_7_0= ruleDelFin ) ) ) )
            // InternalCNL.g:306:3: ( ( () (otherlv_1= 'After' ( (lv_trig_2_0= ruleSentence ) ) ruleComma ) ) | otherlv_4= 'Always' ) ( ( (lv_invariant_5_0= ruleInv ) ) | ( (lv_release_reaction_6_0= ruleRelRea ) ) | ( (lv_delay_final_7_0= ruleDelFin ) ) )
            {
            // InternalCNL.g:306:3: ( ( () (otherlv_1= 'After' ( (lv_trig_2_0= ruleSentence ) ) ruleComma ) ) | otherlv_4= 'Always' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            else if ( (LA3_0==27) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCNL.g:307:4: ( () (otherlv_1= 'After' ( (lv_trig_2_0= ruleSentence ) ) ruleComma ) )
                    {
                    // InternalCNL.g:307:4: ( () (otherlv_1= 'After' ( (lv_trig_2_0= ruleSentence ) ) ruleComma ) )
                    // InternalCNL.g:308:5: () (otherlv_1= 'After' ( (lv_trig_2_0= ruleSentence ) ) ruleComma )
                    {
                    // InternalCNL.g:308:5: ()
                    // InternalCNL.g:309:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getTrigAccess().getTrigAction_0_0_0(),
                    							current);
                    					

                    }

                    // InternalCNL.g:315:5: (otherlv_1= 'After' ( (lv_trig_2_0= ruleSentence ) ) ruleComma )
                    // InternalCNL.g:316:6: otherlv_1= 'After' ( (lv_trig_2_0= ruleSentence ) ) ruleComma
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_5); 

                    						newLeafNode(otherlv_1, grammarAccess.getTrigAccess().getAfterKeyword_0_0_1_0());
                    					
                    // InternalCNL.g:320:6: ( (lv_trig_2_0= ruleSentence ) )
                    // InternalCNL.g:321:7: (lv_trig_2_0= ruleSentence )
                    {
                    // InternalCNL.g:321:7: (lv_trig_2_0= ruleSentence )
                    // InternalCNL.g:322:8: lv_trig_2_0= ruleSentence
                    {

                    								newCompositeNode(grammarAccess.getTrigAccess().getTrigSentenceParserRuleCall_0_0_1_1_0());
                    							
                    pushFollow(FOLLOW_8);
                    lv_trig_2_0=ruleSentence();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getTrigRule());
                    								}
                    								set(
                    									current,
                    									"trig",
                    									lv_trig_2_0,
                    									"org.xtext.example.CNL.Sentence");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }


                    						newCompositeNode(grammarAccess.getTrigAccess().getCommaParserRuleCall_0_0_1_2());
                    					
                    pushFollow(FOLLOW_9);
                    ruleComma();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:349:4: otherlv_4= 'Always'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getTrigAccess().getAlwaysKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalCNL.g:354:3: ( ( (lv_invariant_5_0= ruleInv ) ) | ( (lv_release_reaction_6_0= ruleRelRea ) ) | ( (lv_delay_final_7_0= ruleDelFin ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalCNL.g:355:4: ( (lv_invariant_5_0= ruleInv ) )
                    {
                    // InternalCNL.g:355:4: ( (lv_invariant_5_0= ruleInv ) )
                    // InternalCNL.g:356:5: (lv_invariant_5_0= ruleInv )
                    {
                    // InternalCNL.g:356:5: (lv_invariant_5_0= ruleInv )
                    // InternalCNL.g:357:6: lv_invariant_5_0= ruleInv
                    {

                    						newCompositeNode(grammarAccess.getTrigAccess().getInvariantInvParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_invariant_5_0=ruleInv();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrigRule());
                    						}
                    						set(
                    							current,
                    							"invariant",
                    							lv_invariant_5_0,
                    							"org.xtext.example.CNL.Inv");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:375:4: ( (lv_release_reaction_6_0= ruleRelRea ) )
                    {
                    // InternalCNL.g:375:4: ( (lv_release_reaction_6_0= ruleRelRea ) )
                    // InternalCNL.g:376:5: (lv_release_reaction_6_0= ruleRelRea )
                    {
                    // InternalCNL.g:376:5: (lv_release_reaction_6_0= ruleRelRea )
                    // InternalCNL.g:377:6: lv_release_reaction_6_0= ruleRelRea
                    {

                    						newCompositeNode(grammarAccess.getTrigAccess().getRelease_reactionRelReaParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_release_reaction_6_0=ruleRelRea();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrigRule());
                    						}
                    						set(
                    							current,
                    							"release_reaction",
                    							lv_release_reaction_6_0,
                    							"org.xtext.example.CNL.RelRea");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCNL.g:395:4: ( (lv_delay_final_7_0= ruleDelFin ) )
                    {
                    // InternalCNL.g:395:4: ( (lv_delay_final_7_0= ruleDelFin ) )
                    // InternalCNL.g:396:5: (lv_delay_final_7_0= ruleDelFin )
                    {
                    // InternalCNL.g:396:5: (lv_delay_final_7_0= ruleDelFin )
                    // InternalCNL.g:397:6: lv_delay_final_7_0= ruleDelFin
                    {

                    						newCompositeNode(grammarAccess.getTrigAccess().getDelay_finalDelFinParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_delay_final_7_0=ruleDelFin();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrigRule());
                    						}
                    						set(
                    							current,
                    							"delay_final",
                    							lv_delay_final_7_0,
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
    // InternalCNL.g:419:1: entryRuleInv returns [EObject current=null] : iv_ruleInv= ruleInv EOF ;
    public final EObject entryRuleInv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInv = null;


        try {
            // InternalCNL.g:419:44: (iv_ruleInv= ruleInv EOF )
            // InternalCNL.g:420:2: iv_ruleInv= ruleInv EOF
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
    // InternalCNL.g:426:1: ruleInv returns [EObject current=null] : ( () ( (lv_inv_1_0= ruleSentence ) ) ( ( ruleComma ( (lv_delay_final_3_0= ruleDelFin ) ) ) | (otherlv_4= 'should' otherlv_5= 'remain' otherlv_6= 'valid' otherlv_7= 'until' ( (lv_release_reaction_8_0= ruleRelRea ) ) ) )? ) ;
    public final EObject ruleInv() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_inv_1_0 = null;

        EObject lv_delay_final_3_0 = null;

        EObject lv_release_reaction_8_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:432:2: ( ( () ( (lv_inv_1_0= ruleSentence ) ) ( ( ruleComma ( (lv_delay_final_3_0= ruleDelFin ) ) ) | (otherlv_4= 'should' otherlv_5= 'remain' otherlv_6= 'valid' otherlv_7= 'until' ( (lv_release_reaction_8_0= ruleRelRea ) ) ) )? ) )
            // InternalCNL.g:433:2: ( () ( (lv_inv_1_0= ruleSentence ) ) ( ( ruleComma ( (lv_delay_final_3_0= ruleDelFin ) ) ) | (otherlv_4= 'should' otherlv_5= 'remain' otherlv_6= 'valid' otherlv_7= 'until' ( (lv_release_reaction_8_0= ruleRelRea ) ) ) )? )
            {
            // InternalCNL.g:433:2: ( () ( (lv_inv_1_0= ruleSentence ) ) ( ( ruleComma ( (lv_delay_final_3_0= ruleDelFin ) ) ) | (otherlv_4= 'should' otherlv_5= 'remain' otherlv_6= 'valid' otherlv_7= 'until' ( (lv_release_reaction_8_0= ruleRelRea ) ) ) )? )
            // InternalCNL.g:434:3: () ( (lv_inv_1_0= ruleSentence ) ) ( ( ruleComma ( (lv_delay_final_3_0= ruleDelFin ) ) ) | (otherlv_4= 'should' otherlv_5= 'remain' otherlv_6= 'valid' otherlv_7= 'until' ( (lv_release_reaction_8_0= ruleRelRea ) ) ) )?
            {
            // InternalCNL.g:434:3: ()
            // InternalCNL.g:435:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInvAccess().getInvAction_0(),
            					current);
            			

            }

            // InternalCNL.g:441:3: ( (lv_inv_1_0= ruleSentence ) )
            // InternalCNL.g:442:4: (lv_inv_1_0= ruleSentence )
            {
            // InternalCNL.g:442:4: (lv_inv_1_0= ruleSentence )
            // InternalCNL.g:443:5: lv_inv_1_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getInvAccess().getInvSentenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_inv_1_0=ruleSentence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInvRule());
            					}
            					set(
            						current,
            						"inv",
            						lv_inv_1_0,
            						"org.xtext.example.CNL.Sentence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCNL.g:460:3: ( ( ruleComma ( (lv_delay_final_3_0= ruleDelFin ) ) ) | (otherlv_4= 'should' otherlv_5= 'remain' otherlv_6= 'valid' otherlv_7= 'until' ( (lv_release_reaction_8_0= ruleRelRea ) ) ) )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==46) ) {
                alt5=1;
            }
            else if ( (LA5_0==28) ) {
                alt5=2;
            }
            switch (alt5) {
                case 1 :
                    // InternalCNL.g:461:4: ( ruleComma ( (lv_delay_final_3_0= ruleDelFin ) ) )
                    {
                    // InternalCNL.g:461:4: ( ruleComma ( (lv_delay_final_3_0= ruleDelFin ) ) )
                    // InternalCNL.g:462:5: ruleComma ( (lv_delay_final_3_0= ruleDelFin ) )
                    {

                    					newCompositeNode(grammarAccess.getInvAccess().getCommaParserRuleCall_2_0_0());
                    				
                    pushFollow(FOLLOW_9);
                    ruleComma();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalCNL.g:469:5: ( (lv_delay_final_3_0= ruleDelFin ) )
                    // InternalCNL.g:470:6: (lv_delay_final_3_0= ruleDelFin )
                    {
                    // InternalCNL.g:470:6: (lv_delay_final_3_0= ruleDelFin )
                    // InternalCNL.g:471:7: lv_delay_final_3_0= ruleDelFin
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
                    // InternalCNL.g:490:4: (otherlv_4= 'should' otherlv_5= 'remain' otherlv_6= 'valid' otherlv_7= 'until' ( (lv_release_reaction_8_0= ruleRelRea ) ) )
                    {
                    // InternalCNL.g:490:4: (otherlv_4= 'should' otherlv_5= 'remain' otherlv_6= 'valid' otherlv_7= 'until' ( (lv_release_reaction_8_0= ruleRelRea ) ) )
                    // InternalCNL.g:491:5: otherlv_4= 'should' otherlv_5= 'remain' otherlv_6= 'valid' otherlv_7= 'until' ( (lv_release_reaction_8_0= ruleRelRea ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_11); 

                    					newLeafNode(otherlv_4, grammarAccess.getInvAccess().getShouldKeyword_2_1_0());
                    				
                    otherlv_5=(Token)match(input,29,FOLLOW_12); 

                    					newLeafNode(otherlv_5, grammarAccess.getInvAccess().getRemainKeyword_2_1_1());
                    				
                    otherlv_6=(Token)match(input,30,FOLLOW_13); 

                    					newLeafNode(otherlv_6, grammarAccess.getInvAccess().getValidKeyword_2_1_2());
                    				
                    otherlv_7=(Token)match(input,31,FOLLOW_14); 

                    					newLeafNode(otherlv_7, grammarAccess.getInvAccess().getUntilKeyword_2_1_3());
                    				
                    // InternalCNL.g:507:5: ( (lv_release_reaction_8_0= ruleRelRea ) )
                    // InternalCNL.g:508:6: (lv_release_reaction_8_0= ruleRelRea )
                    {
                    // InternalCNL.g:508:6: (lv_release_reaction_8_0= ruleRelRea )
                    // InternalCNL.g:509:7: lv_release_reaction_8_0= ruleRelRea
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
    // InternalCNL.g:532:1: entryRuleInv_always returns [EObject current=null] : iv_ruleInv_always= ruleInv_always EOF ;
    public final EObject entryRuleInv_always() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInv_always = null;


        try {
            // InternalCNL.g:532:51: (iv_ruleInv_always= ruleInv_always EOF )
            // InternalCNL.g:533:2: iv_ruleInv_always= ruleInv_always EOF
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
    // InternalCNL.g:539:1: ruleInv_always returns [EObject current=null] : ( () ( ( (lv_inv_1_0= ruleSentence ) ) otherlv_2= 'should' otherlv_3= 'always' otherlv_4= 'remain' otherlv_5= 'valid' otherlv_6= 'until' ( (lv_release_reaction_7_0= ruleRelRea ) ) ) ) ;
    public final EObject ruleInv_always() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_inv_1_0 = null;

        EObject lv_release_reaction_7_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:545:2: ( ( () ( ( (lv_inv_1_0= ruleSentence ) ) otherlv_2= 'should' otherlv_3= 'always' otherlv_4= 'remain' otherlv_5= 'valid' otherlv_6= 'until' ( (lv_release_reaction_7_0= ruleRelRea ) ) ) ) )
            // InternalCNL.g:546:2: ( () ( ( (lv_inv_1_0= ruleSentence ) ) otherlv_2= 'should' otherlv_3= 'always' otherlv_4= 'remain' otherlv_5= 'valid' otherlv_6= 'until' ( (lv_release_reaction_7_0= ruleRelRea ) ) ) )
            {
            // InternalCNL.g:546:2: ( () ( ( (lv_inv_1_0= ruleSentence ) ) otherlv_2= 'should' otherlv_3= 'always' otherlv_4= 'remain' otherlv_5= 'valid' otherlv_6= 'until' ( (lv_release_reaction_7_0= ruleRelRea ) ) ) )
            // InternalCNL.g:547:3: () ( ( (lv_inv_1_0= ruleSentence ) ) otherlv_2= 'should' otherlv_3= 'always' otherlv_4= 'remain' otherlv_5= 'valid' otherlv_6= 'until' ( (lv_release_reaction_7_0= ruleRelRea ) ) )
            {
            // InternalCNL.g:547:3: ()
            // InternalCNL.g:548:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInv_alwaysAccess().getInv_alwaysAction_0(),
            					current);
            			

            }

            // InternalCNL.g:554:3: ( ( (lv_inv_1_0= ruleSentence ) ) otherlv_2= 'should' otherlv_3= 'always' otherlv_4= 'remain' otherlv_5= 'valid' otherlv_6= 'until' ( (lv_release_reaction_7_0= ruleRelRea ) ) )
            // InternalCNL.g:555:4: ( (lv_inv_1_0= ruleSentence ) ) otherlv_2= 'should' otherlv_3= 'always' otherlv_4= 'remain' otherlv_5= 'valid' otherlv_6= 'until' ( (lv_release_reaction_7_0= ruleRelRea ) )
            {
            // InternalCNL.g:555:4: ( (lv_inv_1_0= ruleSentence ) )
            // InternalCNL.g:556:5: (lv_inv_1_0= ruleSentence )
            {
            // InternalCNL.g:556:5: (lv_inv_1_0= ruleSentence )
            // InternalCNL.g:557:6: lv_inv_1_0= ruleSentence
            {

            						newCompositeNode(grammarAccess.getInv_alwaysAccess().getInvSentenceParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_15);
            lv_inv_1_0=ruleSentence();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getInv_alwaysRule());
            						}
            						set(
            							current,
            							"inv",
            							lv_inv_1_0,
            							"org.xtext.example.CNL.Sentence");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_16); 

            				newLeafNode(otherlv_2, grammarAccess.getInv_alwaysAccess().getShouldKeyword_1_1());
            			
            otherlv_3=(Token)match(input,32,FOLLOW_11); 

            				newLeafNode(otherlv_3, grammarAccess.getInv_alwaysAccess().getAlwaysKeyword_1_2());
            			
            otherlv_4=(Token)match(input,29,FOLLOW_12); 

            				newLeafNode(otherlv_4, grammarAccess.getInv_alwaysAccess().getRemainKeyword_1_3());
            			
            otherlv_5=(Token)match(input,30,FOLLOW_13); 

            				newLeafNode(otherlv_5, grammarAccess.getInv_alwaysAccess().getValidKeyword_1_4());
            			
            otherlv_6=(Token)match(input,31,FOLLOW_14); 

            				newLeafNode(otherlv_6, grammarAccess.getInv_alwaysAccess().getUntilKeyword_1_5());
            			
            // InternalCNL.g:594:4: ( (lv_release_reaction_7_0= ruleRelRea ) )
            // InternalCNL.g:595:5: (lv_release_reaction_7_0= ruleRelRea )
            {
            // InternalCNL.g:595:5: (lv_release_reaction_7_0= ruleRelRea )
            // InternalCNL.g:596:6: lv_release_reaction_7_0= ruleRelRea
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
    // InternalCNL.g:618:1: entryRuleRelRea returns [EObject current=null] : iv_ruleRelRea= ruleRelRea EOF ;
    public final EObject entryRuleRelRea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelRea = null;


        try {
            // InternalCNL.g:618:47: (iv_ruleRelRea= ruleRelRea EOF )
            // InternalCNL.g:619:2: iv_ruleRelRea= ruleRelRea EOF
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
    // InternalCNL.g:625:1: ruleRelRea returns [EObject current=null] : ( (otherlv_0= 'either' () ( (lv_rel_2_0= ruleSentence ) ) otherlv_3= 'or' ( (lv_reaction_4_0= ruleReaction ) ) ( ruleComma ( (lv_delay_final_6_0= ruleDelFin ) ) )? ) | ( () ( (lv_rel_8_0= ruleSentence ) ) ) | ( () ( ( (lv_reaction_10_0= ruleReaction ) ) ( ruleComma ( (lv_delay_final_12_0= ruleDelFin ) ) )? ) ) | ( () (otherlv_14= 'Reaction' otherlv_15= 'is' otherlv_16= 'always' ( (lv_rea_17_0= ruleSentence ) ) ( ruleComma ( (lv_delay_final_19_0= ruleDelFin ) ) )? ) ) ) ;
    public final EObject ruleRelRea() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_rel_2_0 = null;

        EObject lv_reaction_4_0 = null;

        EObject lv_delay_final_6_0 = null;

        EObject lv_rel_8_0 = null;

        EObject lv_reaction_10_0 = null;

        EObject lv_delay_final_12_0 = null;

        EObject lv_rea_17_0 = null;

        EObject lv_delay_final_19_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:631:2: ( ( (otherlv_0= 'either' () ( (lv_rel_2_0= ruleSentence ) ) otherlv_3= 'or' ( (lv_reaction_4_0= ruleReaction ) ) ( ruleComma ( (lv_delay_final_6_0= ruleDelFin ) ) )? ) | ( () ( (lv_rel_8_0= ruleSentence ) ) ) | ( () ( ( (lv_reaction_10_0= ruleReaction ) ) ( ruleComma ( (lv_delay_final_12_0= ruleDelFin ) ) )? ) ) | ( () (otherlv_14= 'Reaction' otherlv_15= 'is' otherlv_16= 'always' ( (lv_rea_17_0= ruleSentence ) ) ( ruleComma ( (lv_delay_final_19_0= ruleDelFin ) ) )? ) ) ) )
            // InternalCNL.g:632:2: ( (otherlv_0= 'either' () ( (lv_rel_2_0= ruleSentence ) ) otherlv_3= 'or' ( (lv_reaction_4_0= ruleReaction ) ) ( ruleComma ( (lv_delay_final_6_0= ruleDelFin ) ) )? ) | ( () ( (lv_rel_8_0= ruleSentence ) ) ) | ( () ( ( (lv_reaction_10_0= ruleReaction ) ) ( ruleComma ( (lv_delay_final_12_0= ruleDelFin ) ) )? ) ) | ( () (otherlv_14= 'Reaction' otherlv_15= 'is' otherlv_16= 'always' ( (lv_rea_17_0= ruleSentence ) ) ( ruleComma ( (lv_delay_final_19_0= ruleDelFin ) ) )? ) ) )
            {
            // InternalCNL.g:632:2: ( (otherlv_0= 'either' () ( (lv_rel_2_0= ruleSentence ) ) otherlv_3= 'or' ( (lv_reaction_4_0= ruleReaction ) ) ( ruleComma ( (lv_delay_final_6_0= ruleDelFin ) ) )? ) | ( () ( (lv_rel_8_0= ruleSentence ) ) ) | ( () ( ( (lv_reaction_10_0= ruleReaction ) ) ( ruleComma ( (lv_delay_final_12_0= ruleDelFin ) ) )? ) ) | ( () (otherlv_14= 'Reaction' otherlv_15= 'is' otherlv_16= 'always' ( (lv_rea_17_0= ruleSentence ) ) ( ruleComma ( (lv_delay_final_19_0= ruleDelFin ) ) )? ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt9=1;
                }
                break;
            case 45:
                {
                alt9=2;
                }
                break;
            case 37:
                {
                alt9=3;
                }
                break;
            case 35:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalCNL.g:633:3: (otherlv_0= 'either' () ( (lv_rel_2_0= ruleSentence ) ) otherlv_3= 'or' ( (lv_reaction_4_0= ruleReaction ) ) ( ruleComma ( (lv_delay_final_6_0= ruleDelFin ) ) )? )
                    {
                    // InternalCNL.g:633:3: (otherlv_0= 'either' () ( (lv_rel_2_0= ruleSentence ) ) otherlv_3= 'or' ( (lv_reaction_4_0= ruleReaction ) ) ( ruleComma ( (lv_delay_final_6_0= ruleDelFin ) ) )? )
                    // InternalCNL.g:634:4: otherlv_0= 'either' () ( (lv_rel_2_0= ruleSentence ) ) otherlv_3= 'or' ( (lv_reaction_4_0= ruleReaction ) ) ( ruleComma ( (lv_delay_final_6_0= ruleDelFin ) ) )?
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getRelReaAccess().getEitherKeyword_0_0());
                    			
                    // InternalCNL.g:638:4: ()
                    // InternalCNL.g:639:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelReaAccess().getRelAction_0_1(),
                    						current);
                    				

                    }

                    // InternalCNL.g:645:4: ( (lv_rel_2_0= ruleSentence ) )
                    // InternalCNL.g:646:5: (lv_rel_2_0= ruleSentence )
                    {
                    // InternalCNL.g:646:5: (lv_rel_2_0= ruleSentence )
                    // InternalCNL.g:647:6: lv_rel_2_0= ruleSentence
                    {

                    						newCompositeNode(grammarAccess.getRelReaAccess().getRelSentenceParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_rel_2_0=ruleSentence();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelReaRule());
                    						}
                    						set(
                    							current,
                    							"rel",
                    							lv_rel_2_0,
                    							"org.xtext.example.CNL.Sentence");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelReaAccess().getOrKeyword_0_3());
                    			
                    // InternalCNL.g:668:4: ( (lv_reaction_4_0= ruleReaction ) )
                    // InternalCNL.g:669:5: (lv_reaction_4_0= ruleReaction )
                    {
                    // InternalCNL.g:669:5: (lv_reaction_4_0= ruleReaction )
                    // InternalCNL.g:670:6: lv_reaction_4_0= ruleReaction
                    {

                    						newCompositeNode(grammarAccess.getRelReaAccess().getReactionReactionParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalCNL.g:687:4: ( ruleComma ( (lv_delay_final_6_0= ruleDelFin ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==46) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalCNL.g:688:5: ruleComma ( (lv_delay_final_6_0= ruleDelFin ) )
                            {

                            					newCompositeNode(grammarAccess.getRelReaAccess().getCommaParserRuleCall_0_5_0());
                            				
                            pushFollow(FOLLOW_9);
                            ruleComma();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				
                            // InternalCNL.g:695:5: ( (lv_delay_final_6_0= ruleDelFin ) )
                            // InternalCNL.g:696:6: (lv_delay_final_6_0= ruleDelFin )
                            {
                            // InternalCNL.g:696:6: (lv_delay_final_6_0= ruleDelFin )
                            // InternalCNL.g:697:7: lv_delay_final_6_0= ruleDelFin
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
                    // InternalCNL.g:717:3: ( () ( (lv_rel_8_0= ruleSentence ) ) )
                    {
                    // InternalCNL.g:717:3: ( () ( (lv_rel_8_0= ruleSentence ) ) )
                    // InternalCNL.g:718:4: () ( (lv_rel_8_0= ruleSentence ) )
                    {
                    // InternalCNL.g:718:4: ()
                    // InternalCNL.g:719:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelReaAccess().getRelAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCNL.g:725:4: ( (lv_rel_8_0= ruleSentence ) )
                    // InternalCNL.g:726:5: (lv_rel_8_0= ruleSentence )
                    {
                    // InternalCNL.g:726:5: (lv_rel_8_0= ruleSentence )
                    // InternalCNL.g:727:6: lv_rel_8_0= ruleSentence
                    {

                    						newCompositeNode(grammarAccess.getRelReaAccess().getRelSentenceParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rel_8_0=ruleSentence();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelReaRule());
                    						}
                    						set(
                    							current,
                    							"rel",
                    							lv_rel_8_0,
                    							"org.xtext.example.CNL.Sentence");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCNL.g:746:3: ( () ( ( (lv_reaction_10_0= ruleReaction ) ) ( ruleComma ( (lv_delay_final_12_0= ruleDelFin ) ) )? ) )
                    {
                    // InternalCNL.g:746:3: ( () ( ( (lv_reaction_10_0= ruleReaction ) ) ( ruleComma ( (lv_delay_final_12_0= ruleDelFin ) ) )? ) )
                    // InternalCNL.g:747:4: () ( ( (lv_reaction_10_0= ruleReaction ) ) ( ruleComma ( (lv_delay_final_12_0= ruleDelFin ) ) )? )
                    {
                    // InternalCNL.g:747:4: ()
                    // InternalCNL.g:748:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelReaAccess().getReaAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCNL.g:754:4: ( ( (lv_reaction_10_0= ruleReaction ) ) ( ruleComma ( (lv_delay_final_12_0= ruleDelFin ) ) )? )
                    // InternalCNL.g:755:5: ( (lv_reaction_10_0= ruleReaction ) ) ( ruleComma ( (lv_delay_final_12_0= ruleDelFin ) ) )?
                    {
                    // InternalCNL.g:755:5: ( (lv_reaction_10_0= ruleReaction ) )
                    // InternalCNL.g:756:6: (lv_reaction_10_0= ruleReaction )
                    {
                    // InternalCNL.g:756:6: (lv_reaction_10_0= ruleReaction )
                    // InternalCNL.g:757:7: lv_reaction_10_0= ruleReaction
                    {

                    							newCompositeNode(grammarAccess.getRelReaAccess().getReactionReactionParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_19);
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

                    // InternalCNL.g:774:5: ( ruleComma ( (lv_delay_final_12_0= ruleDelFin ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==46) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalCNL.g:775:6: ruleComma ( (lv_delay_final_12_0= ruleDelFin ) )
                            {

                            						newCompositeNode(grammarAccess.getRelReaAccess().getCommaParserRuleCall_2_1_1_0());
                            					
                            pushFollow(FOLLOW_9);
                            ruleComma();

                            state._fsp--;


                            						afterParserOrEnumRuleCall();
                            					
                            // InternalCNL.g:782:6: ( (lv_delay_final_12_0= ruleDelFin ) )
                            // InternalCNL.g:783:7: (lv_delay_final_12_0= ruleDelFin )
                            {
                            // InternalCNL.g:783:7: (lv_delay_final_12_0= ruleDelFin )
                            // InternalCNL.g:784:8: lv_delay_final_12_0= ruleDelFin
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
                    // InternalCNL.g:805:3: ( () (otherlv_14= 'Reaction' otherlv_15= 'is' otherlv_16= 'always' ( (lv_rea_17_0= ruleSentence ) ) ( ruleComma ( (lv_delay_final_19_0= ruleDelFin ) ) )? ) )
                    {
                    // InternalCNL.g:805:3: ( () (otherlv_14= 'Reaction' otherlv_15= 'is' otherlv_16= 'always' ( (lv_rea_17_0= ruleSentence ) ) ( ruleComma ( (lv_delay_final_19_0= ruleDelFin ) ) )? ) )
                    // InternalCNL.g:806:4: () (otherlv_14= 'Reaction' otherlv_15= 'is' otherlv_16= 'always' ( (lv_rea_17_0= ruleSentence ) ) ( ruleComma ( (lv_delay_final_19_0= ruleDelFin ) ) )? )
                    {
                    // InternalCNL.g:806:4: ()
                    // InternalCNL.g:807:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelReaAccess().getReaAction_3_0(),
                    						current);
                    				

                    }

                    // InternalCNL.g:813:4: (otherlv_14= 'Reaction' otherlv_15= 'is' otherlv_16= 'always' ( (lv_rea_17_0= ruleSentence ) ) ( ruleComma ( (lv_delay_final_19_0= ruleDelFin ) ) )? )
                    // InternalCNL.g:814:5: otherlv_14= 'Reaction' otherlv_15= 'is' otherlv_16= 'always' ( (lv_rea_17_0= ruleSentence ) ) ( ruleComma ( (lv_delay_final_19_0= ruleDelFin ) ) )?
                    {
                    otherlv_14=(Token)match(input,35,FOLLOW_20); 

                    					newLeafNode(otherlv_14, grammarAccess.getRelReaAccess().getReactionKeyword_3_1_0());
                    				
                    otherlv_15=(Token)match(input,36,FOLLOW_16); 

                    					newLeafNode(otherlv_15, grammarAccess.getRelReaAccess().getIsKeyword_3_1_1());
                    				
                    otherlv_16=(Token)match(input,32,FOLLOW_5); 

                    					newLeafNode(otherlv_16, grammarAccess.getRelReaAccess().getAlwaysKeyword_3_1_2());
                    				
                    // InternalCNL.g:826:5: ( (lv_rea_17_0= ruleSentence ) )
                    // InternalCNL.g:827:6: (lv_rea_17_0= ruleSentence )
                    {
                    // InternalCNL.g:827:6: (lv_rea_17_0= ruleSentence )
                    // InternalCNL.g:828:7: lv_rea_17_0= ruleSentence
                    {

                    							newCompositeNode(grammarAccess.getRelReaAccess().getReaSentenceParserRuleCall_3_1_3_0());
                    						
                    pushFollow(FOLLOW_19);
                    lv_rea_17_0=ruleSentence();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRelReaRule());
                    							}
                    							set(
                    								current,
                    								"rea",
                    								lv_rea_17_0,
                    								"org.xtext.example.CNL.Sentence");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalCNL.g:845:5: ( ruleComma ( (lv_delay_final_19_0= ruleDelFin ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==46) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalCNL.g:846:6: ruleComma ( (lv_delay_final_19_0= ruleDelFin ) )
                            {

                            						newCompositeNode(grammarAccess.getRelReaAccess().getCommaParserRuleCall_3_1_4_0());
                            					
                            pushFollow(FOLLOW_9);
                            ruleComma();

                            state._fsp--;


                            						afterParserOrEnumRuleCall();
                            					
                            // InternalCNL.g:853:6: ( (lv_delay_final_19_0= ruleDelFin ) )
                            // InternalCNL.g:854:7: (lv_delay_final_19_0= ruleDelFin )
                            {
                            // InternalCNL.g:854:7: (lv_delay_final_19_0= ruleDelFin )
                            // InternalCNL.g:855:8: lv_delay_final_19_0= ruleDelFin
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
    // InternalCNL.g:879:1: entryRuleReaction returns [EObject current=null] : iv_ruleReaction= ruleReaction EOF ;
    public final EObject entryRuleReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaction = null;


        try {
            // InternalCNL.g:879:49: (iv_ruleReaction= ruleReaction EOF )
            // InternalCNL.g:880:2: iv_ruleReaction= ruleReaction EOF
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
    // InternalCNL.g:886:1: ruleReaction returns [EObject current=null] : ( () otherlv_1= 'reaction' otherlv_2= 'is' ( (lv_rea_3_0= ruleSentence ) ) ) ;
    public final EObject ruleReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_rea_3_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:892:2: ( ( () otherlv_1= 'reaction' otherlv_2= 'is' ( (lv_rea_3_0= ruleSentence ) ) ) )
            // InternalCNL.g:893:2: ( () otherlv_1= 'reaction' otherlv_2= 'is' ( (lv_rea_3_0= ruleSentence ) ) )
            {
            // InternalCNL.g:893:2: ( () otherlv_1= 'reaction' otherlv_2= 'is' ( (lv_rea_3_0= ruleSentence ) ) )
            // InternalCNL.g:894:3: () otherlv_1= 'reaction' otherlv_2= 'is' ( (lv_rea_3_0= ruleSentence ) )
            {
            // InternalCNL.g:894:3: ()
            // InternalCNL.g:895:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReactionAccess().getReaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getReactionAccess().getReactionKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getReactionAccess().getIsKeyword_2());
            		
            // InternalCNL.g:909:3: ( (lv_rea_3_0= ruleSentence ) )
            // InternalCNL.g:910:4: (lv_rea_3_0= ruleSentence )
            {
            // InternalCNL.g:910:4: (lv_rea_3_0= ruleSentence )
            // InternalCNL.g:911:5: lv_rea_3_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getReactionAccess().getReaSentenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_rea_3_0=ruleSentence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactionRule());
            					}
            					set(
            						current,
            						"rea",
            						lv_rea_3_0,
            						"org.xtext.example.CNL.Sentence");
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
    // InternalCNL.g:932:1: entryRuleDelFin returns [EObject current=null] : iv_ruleDelFin= ruleDelFin EOF ;
    public final EObject entryRuleDelFin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelFin = null;


        try {
            // InternalCNL.g:932:47: (iv_ruleDelFin= ruleDelFin EOF )
            // InternalCNL.g:933:2: iv_ruleDelFin= ruleDelFin EOF
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
    // InternalCNL.g:939:1: ruleDelFin returns [EObject current=null] : ( () ( ( (otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur' ) ( ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( (lv_fin_6_0= ruleSentence ) ) )? ) | ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( (lv_fin_9_0= ruleSentence ) ) ) ) ) | ( (lv_fin_10_0= ruleSentence ) ) ) ) ;
    public final EObject ruleDelFin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_delay_4_0 = null;

        EObject lv_fin_6_0 = null;

        EObject lv_fin_9_0 = null;

        EObject lv_fin_10_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:945:2: ( ( () ( ( (otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur' ) ( ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( (lv_fin_6_0= ruleSentence ) ) )? ) | ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( (lv_fin_9_0= ruleSentence ) ) ) ) ) | ( (lv_fin_10_0= ruleSentence ) ) ) ) )
            // InternalCNL.g:946:2: ( () ( ( (otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur' ) ( ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( (lv_fin_6_0= ruleSentence ) ) )? ) | ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( (lv_fin_9_0= ruleSentence ) ) ) ) ) | ( (lv_fin_10_0= ruleSentence ) ) ) )
            {
            // InternalCNL.g:946:2: ( () ( ( (otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur' ) ( ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( (lv_fin_6_0= ruleSentence ) ) )? ) | ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( (lv_fin_9_0= ruleSentence ) ) ) ) ) | ( (lv_fin_10_0= ruleSentence ) ) ) )
            // InternalCNL.g:947:3: () ( ( (otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur' ) ( ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( (lv_fin_6_0= ruleSentence ) ) )? ) | ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( (lv_fin_9_0= ruleSentence ) ) ) ) ) | ( (lv_fin_10_0= ruleSentence ) ) )
            {
            // InternalCNL.g:947:3: ()
            // InternalCNL.g:948:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDelFinAccess().getSentenceAction_0(),
            					current);
            			

            }

            // InternalCNL.g:954:3: ( ( (otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur' ) ( ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( (lv_fin_6_0= ruleSentence ) ) )? ) | ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( (lv_fin_9_0= ruleSentence ) ) ) ) ) | ( (lv_fin_10_0= ruleSentence ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            else if ( (LA13_0==45) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCNL.g:955:4: ( (otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur' ) ( ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( (lv_fin_6_0= ruleSentence ) ) )? ) | ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( (lv_fin_9_0= ruleSentence ) ) ) ) )
                    {
                    // InternalCNL.g:955:4: ( (otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur' ) ( ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( (lv_fin_6_0= ruleSentence ) ) )? ) | ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( (lv_fin_9_0= ruleSentence ) ) ) ) )
                    // InternalCNL.g:956:5: (otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur' ) ( ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( (lv_fin_6_0= ruleSentence ) ) )? ) | ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( (lv_fin_9_0= ruleSentence ) ) ) )
                    {
                    // InternalCNL.g:956:5: (otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur' )
                    // InternalCNL.g:957:6: otherlv_1= 'which' otherlv_2= 'must' otherlv_3= 'occur'
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_21); 

                    						newLeafNode(otherlv_1, grammarAccess.getDelFinAccess().getWhichKeyword_1_0_0_0());
                    					
                    otherlv_2=(Token)match(input,39,FOLLOW_22); 

                    						newLeafNode(otherlv_2, grammarAccess.getDelFinAccess().getMustKeyword_1_0_0_1());
                    					
                    otherlv_3=(Token)match(input,40,FOLLOW_23); 

                    						newLeafNode(otherlv_3, grammarAccess.getDelFinAccess().getOccurKeyword_1_0_0_2());
                    					

                    }

                    // InternalCNL.g:970:5: ( ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( (lv_fin_6_0= ruleSentence ) ) )? ) | ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( (lv_fin_9_0= ruleSentence ) ) ) )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==44) ) {
                        alt12=1;
                    }
                    else if ( ((LA12_0>=42 && LA12_0<=43)) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalCNL.g:971:6: ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( (lv_fin_6_0= ruleSentence ) ) )? )
                            {
                            // InternalCNL.g:971:6: ( ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( (lv_fin_6_0= ruleSentence ) ) )? )
                            // InternalCNL.g:972:7: ( (lv_delay_4_0= ruleDelay ) ) (otherlv_5= 'from' ( (lv_fin_6_0= ruleSentence ) ) )?
                            {
                            // InternalCNL.g:972:7: ( (lv_delay_4_0= ruleDelay ) )
                            // InternalCNL.g:973:8: (lv_delay_4_0= ruleDelay )
                            {
                            // InternalCNL.g:973:8: (lv_delay_4_0= ruleDelay )
                            // InternalCNL.g:974:9: lv_delay_4_0= ruleDelay
                            {

                            									newCompositeNode(grammarAccess.getDelFinAccess().getDelayDelayParserRuleCall_1_0_1_0_0_0());
                            								
                            pushFollow(FOLLOW_24);
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

                            // InternalCNL.g:991:7: (otherlv_5= 'from' ( (lv_fin_6_0= ruleSentence ) ) )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==41) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // InternalCNL.g:992:8: otherlv_5= 'from' ( (lv_fin_6_0= ruleSentence ) )
                                    {
                                    otherlv_5=(Token)match(input,41,FOLLOW_5); 

                                    								newLeafNode(otherlv_5, grammarAccess.getDelFinAccess().getFromKeyword_1_0_1_0_1_0());
                                    							
                                    // InternalCNL.g:996:8: ( (lv_fin_6_0= ruleSentence ) )
                                    // InternalCNL.g:997:9: (lv_fin_6_0= ruleSentence )
                                    {
                                    // InternalCNL.g:997:9: (lv_fin_6_0= ruleSentence )
                                    // InternalCNL.g:998:10: lv_fin_6_0= ruleSentence
                                    {

                                    										newCompositeNode(grammarAccess.getDelFinAccess().getFinSentenceParserRuleCall_1_0_1_0_1_1_0());
                                    									
                                    pushFollow(FOLLOW_2);
                                    lv_fin_6_0=ruleSentence();

                                    state._fsp--;


                                    										if (current==null) {
                                    											current = createModelElementForParent(grammarAccess.getDelFinRule());
                                    										}
                                    										set(
                                    											current,
                                    											"fin",
                                    											lv_fin_6_0,
                                    											"org.xtext.example.CNL.Sentence");
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
                            // InternalCNL.g:1018:6: ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( (lv_fin_9_0= ruleSentence ) ) )
                            {
                            // InternalCNL.g:1018:6: ( (otherlv_7= 'immediately' )? otherlv_8= 'after' ( (lv_fin_9_0= ruleSentence ) ) )
                            // InternalCNL.g:1019:7: (otherlv_7= 'immediately' )? otherlv_8= 'after' ( (lv_fin_9_0= ruleSentence ) )
                            {
                            // InternalCNL.g:1019:7: (otherlv_7= 'immediately' )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==42) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // InternalCNL.g:1020:8: otherlv_7= 'immediately'
                                    {
                                    otherlv_7=(Token)match(input,42,FOLLOW_25); 

                                    								newLeafNode(otherlv_7, grammarAccess.getDelFinAccess().getImmediatelyKeyword_1_0_1_1_0());
                                    							

                                    }
                                    break;

                            }

                            otherlv_8=(Token)match(input,43,FOLLOW_5); 

                            							newLeafNode(otherlv_8, grammarAccess.getDelFinAccess().getAfterKeyword_1_0_1_1_1());
                            						
                            // InternalCNL.g:1029:7: ( (lv_fin_9_0= ruleSentence ) )
                            // InternalCNL.g:1030:8: (lv_fin_9_0= ruleSentence )
                            {
                            // InternalCNL.g:1030:8: (lv_fin_9_0= ruleSentence )
                            // InternalCNL.g:1031:9: lv_fin_9_0= ruleSentence
                            {

                            									newCompositeNode(grammarAccess.getDelFinAccess().getFinSentenceParserRuleCall_1_0_1_1_2_0());
                            								
                            pushFollow(FOLLOW_2);
                            lv_fin_9_0=ruleSentence();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getDelFinRule());
                            									}
                            									set(
                            										current,
                            										"fin",
                            										lv_fin_9_0,
                            										"org.xtext.example.CNL.Sentence");
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
                    // InternalCNL.g:1052:4: ( (lv_fin_10_0= ruleSentence ) )
                    {
                    // InternalCNL.g:1052:4: ( (lv_fin_10_0= ruleSentence ) )
                    // InternalCNL.g:1053:5: (lv_fin_10_0= ruleSentence )
                    {
                    // InternalCNL.g:1053:5: (lv_fin_10_0= ruleSentence )
                    // InternalCNL.g:1054:6: lv_fin_10_0= ruleSentence
                    {

                    						newCompositeNode(grammarAccess.getDelFinAccess().getFinSentenceParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_fin_10_0=ruleSentence();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDelFinRule());
                    						}
                    						set(
                    							current,
                    							"fin",
                    							lv_fin_10_0,
                    							"org.xtext.example.CNL.Sentence");
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
    // InternalCNL.g:1076:1: entryRuleDelay returns [EObject current=null] : iv_ruleDelay= ruleDelay EOF ;
    public final EObject entryRuleDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelay = null;


        try {
            // InternalCNL.g:1076:46: (iv_ruleDelay= ruleDelay EOF )
            // InternalCNL.g:1077:2: iv_ruleDelay= ruleDelay EOF
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
    // InternalCNL.g:1083:1: ruleDelay returns [EObject current=null] : (otherlv_0= 'within' () ( (lv_del_2_0= ruleSentence ) ) ) ;
    public final EObject ruleDelay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_del_2_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1089:2: ( (otherlv_0= 'within' () ( (lv_del_2_0= ruleSentence ) ) ) )
            // InternalCNL.g:1090:2: (otherlv_0= 'within' () ( (lv_del_2_0= ruleSentence ) ) )
            {
            // InternalCNL.g:1090:2: (otherlv_0= 'within' () ( (lv_del_2_0= ruleSentence ) ) )
            // InternalCNL.g:1091:3: otherlv_0= 'within' () ( (lv_del_2_0= ruleSentence ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDelayAccess().getWithinKeyword_0());
            		
            // InternalCNL.g:1095:3: ()
            // InternalCNL.g:1096:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDelayAccess().getDelAction_1(),
            					current);
            			

            }

            // InternalCNL.g:1102:3: ( (lv_del_2_0= ruleSentence ) )
            // InternalCNL.g:1103:4: (lv_del_2_0= ruleSentence )
            {
            // InternalCNL.g:1103:4: (lv_del_2_0= ruleSentence )
            // InternalCNL.g:1104:5: lv_del_2_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getDelayAccess().getDelSentenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_del_2_0=ruleSentence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDelayRule());
            					}
            					set(
            						current,
            						"del",
            						lv_del_2_0,
            						"org.xtext.example.CNL.Sentence");
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
    // InternalCNL.g:1125:1: entryRuleSentence returns [EObject current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final EObject entryRuleSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentence = null;


        try {
            // InternalCNL.g:1125:49: (iv_ruleSentence= ruleSentence EOF )
            // InternalCNL.g:1126:2: iv_ruleSentence= ruleSentence EOF
            {
             newCompositeNode(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentence=ruleSentence();

            state._fsp--;

             current =iv_ruleSentence; 
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
    // InternalCNL.g:1132:1: ruleSentence returns [EObject current=null] : ( () ( (lv_name_1_0= ruleID_or_INTEGER ) ) ) ;
    public final EObject ruleSentence() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1138:2: ( ( () ( (lv_name_1_0= ruleID_or_INTEGER ) ) ) )
            // InternalCNL.g:1139:2: ( () ( (lv_name_1_0= ruleID_or_INTEGER ) ) )
            {
            // InternalCNL.g:1139:2: ( () ( (lv_name_1_0= ruleID_or_INTEGER ) ) )
            // InternalCNL.g:1140:3: () ( (lv_name_1_0= ruleID_or_INTEGER ) )
            {
            // InternalCNL.g:1140:3: ()
            // InternalCNL.g:1141:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSentenceAccess().getSentenceAction_0(),
            					current);
            			

            }

            // InternalCNL.g:1147:3: ( (lv_name_1_0= ruleID_or_INTEGER ) )
            // InternalCNL.g:1148:4: (lv_name_1_0= ruleID_or_INTEGER )
            {
            // InternalCNL.g:1148:4: (lv_name_1_0= ruleID_or_INTEGER )
            // InternalCNL.g:1149:5: lv_name_1_0= ruleID_or_INTEGER
            {

            					newCompositeNode(grammarAccess.getSentenceAccess().getNameID_or_INTEGERParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleID_or_INTEGER();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSentenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.CNL.ID_or_INTEGER");
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
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleID_or_INTEGER"
    // InternalCNL.g:1170:1: entryRuleID_or_INTEGER returns [String current=null] : iv_ruleID_or_INTEGER= ruleID_or_INTEGER EOF ;
    public final String entryRuleID_or_INTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID_or_INTEGER = null;


        try {
            // InternalCNL.g:1170:53: (iv_ruleID_or_INTEGER= ruleID_or_INTEGER EOF )
            // InternalCNL.g:1171:2: iv_ruleID_or_INTEGER= ruleID_or_INTEGER EOF
            {
             newCompositeNode(grammarAccess.getID_or_INTEGERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleID_or_INTEGER=ruleID_or_INTEGER();

            state._fsp--;

             current =iv_ruleID_or_INTEGER.getText(); 
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
    // $ANTLR end "entryRuleID_or_INTEGER"


    // $ANTLR start "ruleID_or_INTEGER"
    // InternalCNL.g:1177:1: ruleID_or_INTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"' (this_ID_1= RULE_ID | this_INTEGER_2= RULE_INTEGER )+ kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleID_or_INTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_INTEGER_2=null;


        	enterRule();

        try {
            // InternalCNL.g:1183:2: ( (kw= '\"' (this_ID_1= RULE_ID | this_INTEGER_2= RULE_INTEGER )+ kw= '\"' ) )
            // InternalCNL.g:1184:2: (kw= '\"' (this_ID_1= RULE_ID | this_INTEGER_2= RULE_INTEGER )+ kw= '\"' )
            {
            // InternalCNL.g:1184:2: (kw= '\"' (this_ID_1= RULE_ID | this_INTEGER_2= RULE_INTEGER )+ kw= '\"' )
            // InternalCNL.g:1185:3: kw= '\"' (this_ID_1= RULE_ID | this_INTEGER_2= RULE_INTEGER )+ kw= '\"'
            {
            kw=(Token)match(input,45,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getID_or_INTEGERAccess().getQuotationMarkKeyword_0());
            		
            // InternalCNL.g:1190:3: (this_ID_1= RULE_ID | this_INTEGER_2= RULE_INTEGER )+
            int cnt14=0;
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }
                else if ( (LA14_0==RULE_INTEGER) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCNL.g:1191:4: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    				current.merge(this_ID_1);
            	    			

            	    				newLeafNode(this_ID_1, grammarAccess.getID_or_INTEGERAccess().getIDTerminalRuleCall_1_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalCNL.g:1199:4: this_INTEGER_2= RULE_INTEGER
            	    {
            	    this_INTEGER_2=(Token)match(input,RULE_INTEGER,FOLLOW_27); 

            	    				current.merge(this_INTEGER_2);
            	    			

            	    				newLeafNode(this_INTEGER_2, grammarAccess.getID_or_INTEGERAccess().getINTEGERTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            kw=(Token)match(input,45,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getID_or_INTEGERAccess().getQuotationMarkKeyword_2());
            		

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
    // $ANTLR end "ruleID_or_INTEGER"


    // $ANTLR start "entryRuleComma"
    // InternalCNL.g:1216:1: entryRuleComma returns [String current=null] : iv_ruleComma= ruleComma EOF ;
    public final String entryRuleComma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComma = null;


        try {
            // InternalCNL.g:1216:45: (iv_ruleComma= ruleComma EOF )
            // InternalCNL.g:1217:2: iv_ruleComma= ruleComma EOF
            {
             newCompositeNode(grammarAccess.getCommaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComma=ruleComma();

            state._fsp--;

             current =iv_ruleComma.getText(); 
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
    // $ANTLR end "entryRuleComma"


    // $ANTLR start "ruleComma"
    // InternalCNL.g:1223:1: ruleComma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ',' ;
    public final AntlrDatatypeRuleToken ruleComma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCNL.g:1229:2: (kw= ',' )
            // InternalCNL.g:1230:2: kw= ','
            {
            kw=(Token)match(input,46,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCommaAccess().getCommaKeyword());
            	

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
    // $ANTLR end "ruleComma"


    // $ANTLR start "entryRuleVariableType"
    // InternalCNL.g:1238:1: entryRuleVariableType returns [String current=null] : iv_ruleVariableType= ruleVariableType EOF ;
    public final String entryRuleVariableType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableType = null;


        try {
            // InternalCNL.g:1238:52: (iv_ruleVariableType= ruleVariableType EOF )
            // InternalCNL.g:1239:2: iv_ruleVariableType= ruleVariableType EOF
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
    // InternalCNL.g:1245:1: ruleVariableType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'BOOL' | kw= 'INT' ) ;
    public final AntlrDatatypeRuleToken ruleVariableType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCNL.g:1251:2: ( (kw= 'BOOL' | kw= 'INT' ) )
            // InternalCNL.g:1252:2: (kw= 'BOOL' | kw= 'INT' )
            {
            // InternalCNL.g:1252:2: (kw= 'BOOL' | kw= 'INT' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==47) ) {
                alt15=1;
            }
            else if ( (LA15_0==48) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCNL.g:1253:3: kw= 'BOOL'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableTypeAccess().getBOOLKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCNL.g:1259:3: kw= 'INT'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

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
    // InternalCNL.g:1268:1: entryRuleDeclVarInput returns [EObject current=null] : iv_ruleDeclVarInput= ruleDeclVarInput EOF ;
    public final EObject entryRuleDeclVarInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclVarInput = null;


        try {
            // InternalCNL.g:1268:53: (iv_ruleDeclVarInput= ruleDeclVarInput EOF )
            // InternalCNL.g:1269:2: iv_ruleDeclVarInput= ruleDeclVarInput EOF
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
    // InternalCNL.g:1275:1: ruleDeclVarInput returns [EObject current=null] : ( () otherlv_1= 'VAR_INPUT' ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' ) ;
    public final EObject ruleDeclVarInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_varDecls_2_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1281:2: ( ( () otherlv_1= 'VAR_INPUT' ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' ) )
            // InternalCNL.g:1282:2: ( () otherlv_1= 'VAR_INPUT' ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' )
            {
            // InternalCNL.g:1282:2: ( () otherlv_1= 'VAR_INPUT' ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' )
            // InternalCNL.g:1283:3: () otherlv_1= 'VAR_INPUT' ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR'
            {
            // InternalCNL.g:1283:3: ()
            // InternalCNL.g:1284:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeclVarInputAccess().getDeclVarInputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclVarInputAccess().getVAR_INPUTKeyword_1());
            		
            // InternalCNL.g:1294:3: ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCNL.g:1295:4: ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';'
            	    {
            	    // InternalCNL.g:1295:4: ( (lv_varDecls_2_0= ruleVarDeclaration ) )
            	    // InternalCNL.g:1296:5: (lv_varDecls_2_0= ruleVarDeclaration )
            	    {
            	    // InternalCNL.g:1296:5: (lv_varDecls_2_0= ruleVarDeclaration )
            	    // InternalCNL.g:1297:6: lv_varDecls_2_0= ruleVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getDeclVarInputAccess().getVarDeclsVarDeclarationParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_28);
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

            	    otherlv_3=(Token)match(input,50,FOLLOW_29); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDeclVarInputAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_4=(Token)match(input,51,FOLLOW_2); 

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
    // InternalCNL.g:1327:1: entryRuleDeclVarOutput returns [EObject current=null] : iv_ruleDeclVarOutput= ruleDeclVarOutput EOF ;
    public final EObject entryRuleDeclVarOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclVarOutput = null;


        try {
            // InternalCNL.g:1327:54: (iv_ruleDeclVarOutput= ruleDeclVarOutput EOF )
            // InternalCNL.g:1328:2: iv_ruleDeclVarOutput= ruleDeclVarOutput EOF
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
    // InternalCNL.g:1334:1: ruleDeclVarOutput returns [EObject current=null] : ( () otherlv_1= 'VAR_OUTPUT' ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' ) ;
    public final EObject ruleDeclVarOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_varDecls_2_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1340:2: ( ( () otherlv_1= 'VAR_OUTPUT' ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' ) )
            // InternalCNL.g:1341:2: ( () otherlv_1= 'VAR_OUTPUT' ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' )
            {
            // InternalCNL.g:1341:2: ( () otherlv_1= 'VAR_OUTPUT' ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' )
            // InternalCNL.g:1342:3: () otherlv_1= 'VAR_OUTPUT' ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR'
            {
            // InternalCNL.g:1342:3: ()
            // InternalCNL.g:1343:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeclVarOutputAccess().getDeclVarOutputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclVarOutputAccess().getVAR_OUTPUTKeyword_1());
            		
            // InternalCNL.g:1353:3: ( ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCNL.g:1354:4: ( (lv_varDecls_2_0= ruleVarDeclaration ) ) otherlv_3= ';'
            	    {
            	    // InternalCNL.g:1354:4: ( (lv_varDecls_2_0= ruleVarDeclaration ) )
            	    // InternalCNL.g:1355:5: (lv_varDecls_2_0= ruleVarDeclaration )
            	    {
            	    // InternalCNL.g:1355:5: (lv_varDecls_2_0= ruleVarDeclaration )
            	    // InternalCNL.g:1356:6: lv_varDecls_2_0= ruleVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getDeclVarOutputAccess().getVarDeclsVarDeclarationParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_28);
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

            	    otherlv_3=(Token)match(input,50,FOLLOW_29); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDeclVarOutputAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_4=(Token)match(input,51,FOLLOW_2); 

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
    // InternalCNL.g:1386:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalCNL.g:1386:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalCNL.g:1387:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
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
    // InternalCNL.g:1393:1: ruleVarDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVariableType ) ) ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1399:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVariableType ) ) ) )
            // InternalCNL.g:1400:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVariableType ) ) )
            {
            // InternalCNL.g:1400:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVariableType ) ) )
            // InternalCNL.g:1401:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVariableType ) )
            {
            // InternalCNL.g:1401:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCNL.g:1402:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCNL.g:1402:4: (lv_name_0_0= RULE_ID )
            // InternalCNL.g:1403:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            otherlv_1=(Token)match(input,53,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getVarDeclarationAccess().getColonKeyword_1());
            		
            // InternalCNL.g:1423:3: ( (lv_type_2_0= ruleVariableType ) )
            // InternalCNL.g:1424:4: (lv_type_2_0= ruleVariableType )
            {
            // InternalCNL.g:1424:4: (lv_type_2_0= ruleVariableType )
            // InternalCNL.g:1425:5: lv_type_2_0= ruleVariableType
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
    // InternalCNL.g:1446:1: entryRuleSentDeclaration returns [EObject current=null] : iv_ruleSentDeclaration= ruleSentDeclaration EOF ;
    public final EObject entryRuleSentDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentDeclaration = null;


        try {
            // InternalCNL.g:1446:56: (iv_ruleSentDeclaration= ruleSentDeclaration EOF )
            // InternalCNL.g:1447:2: iv_ruleSentDeclaration= ruleSentDeclaration EOF
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
    // InternalCNL.g:1453:1: ruleSentDeclaration returns [EObject current=null] : ( () otherlv_1= 'SENTENCE' ( (lv_name_2_0= RULE_ID ) ) ( (lv_sentenceDeclaration_3_0= ruleSentenceDeclaration ) ) otherlv_4= 'END_SENTENCE' ) ;
    public final EObject ruleSentDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_sentenceDeclaration_3_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1459:2: ( ( () otherlv_1= 'SENTENCE' ( (lv_name_2_0= RULE_ID ) ) ( (lv_sentenceDeclaration_3_0= ruleSentenceDeclaration ) ) otherlv_4= 'END_SENTENCE' ) )
            // InternalCNL.g:1460:2: ( () otherlv_1= 'SENTENCE' ( (lv_name_2_0= RULE_ID ) ) ( (lv_sentenceDeclaration_3_0= ruleSentenceDeclaration ) ) otherlv_4= 'END_SENTENCE' )
            {
            // InternalCNL.g:1460:2: ( () otherlv_1= 'SENTENCE' ( (lv_name_2_0= RULE_ID ) ) ( (lv_sentenceDeclaration_3_0= ruleSentenceDeclaration ) ) otherlv_4= 'END_SENTENCE' )
            // InternalCNL.g:1461:3: () otherlv_1= 'SENTENCE' ( (lv_name_2_0= RULE_ID ) ) ( (lv_sentenceDeclaration_3_0= ruleSentenceDeclaration ) ) otherlv_4= 'END_SENTENCE'
            {
            // InternalCNL.g:1461:3: ()
            // InternalCNL.g:1462:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSentDeclarationAccess().getSentDeclarationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSentDeclarationAccess().getSENTENCEKeyword_1());
            		
            // InternalCNL.g:1472:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCNL.g:1473:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCNL.g:1473:4: (lv_name_2_0= RULE_ID )
            // InternalCNL.g:1474:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSentDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSentDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCNL.g:1490:3: ( (lv_sentenceDeclaration_3_0= ruleSentenceDeclaration ) )
            // InternalCNL.g:1491:4: (lv_sentenceDeclaration_3_0= ruleSentenceDeclaration )
            {
            // InternalCNL.g:1491:4: (lv_sentenceDeclaration_3_0= ruleSentenceDeclaration )
            // InternalCNL.g:1492:5: lv_sentenceDeclaration_3_0= ruleSentenceDeclaration
            {

            					newCompositeNode(grammarAccess.getSentDeclarationAccess().getSentenceDeclarationSentenceDeclarationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
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

            otherlv_4=(Token)match(input,55,FOLLOW_2); 

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
    // InternalCNL.g:1517:1: entryRuleSentenceDeclaration returns [EObject current=null] : iv_ruleSentenceDeclaration= ruleSentenceDeclaration EOF ;
    public final EObject entryRuleSentenceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentenceDeclaration = null;


        try {
            // InternalCNL.g:1517:60: (iv_ruleSentenceDeclaration= ruleSentenceDeclaration EOF )
            // InternalCNL.g:1518:2: iv_ruleSentenceDeclaration= ruleSentenceDeclaration EOF
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
    // InternalCNL.g:1524:1: ruleSentenceDeclaration returns [EObject current=null] : ( () ( (lv_name_1_0= ruleSentence ) ) otherlv_2= '=' ( (lv_logicExpression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleSentenceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_name_1_0 = null;

        EObject lv_logicExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1530:2: ( ( () ( (lv_name_1_0= ruleSentence ) ) otherlv_2= '=' ( (lv_logicExpression_3_0= ruleExpression ) ) ) )
            // InternalCNL.g:1531:2: ( () ( (lv_name_1_0= ruleSentence ) ) otherlv_2= '=' ( (lv_logicExpression_3_0= ruleExpression ) ) )
            {
            // InternalCNL.g:1531:2: ( () ( (lv_name_1_0= ruleSentence ) ) otherlv_2= '=' ( (lv_logicExpression_3_0= ruleExpression ) ) )
            // InternalCNL.g:1532:3: () ( (lv_name_1_0= ruleSentence ) ) otherlv_2= '=' ( (lv_logicExpression_3_0= ruleExpression ) )
            {
            // InternalCNL.g:1532:3: ()
            // InternalCNL.g:1533:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSentenceDeclarationAccess().getSentenceDeclarationAction_0(),
            					current);
            			

            }

            // InternalCNL.g:1539:3: ( (lv_name_1_0= ruleSentence ) )
            // InternalCNL.g:1540:4: (lv_name_1_0= ruleSentence )
            {
            // InternalCNL.g:1540:4: (lv_name_1_0= ruleSentence )
            // InternalCNL.g:1541:5: lv_name_1_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getSentenceDeclarationAccess().getNameSentenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
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

            otherlv_2=(Token)match(input,56,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getSentenceDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalCNL.g:1562:3: ( (lv_logicExpression_3_0= ruleExpression ) )
            // InternalCNL.g:1563:4: (lv_logicExpression_3_0= ruleExpression )
            {
            // InternalCNL.g:1563:4: (lv_logicExpression_3_0= ruleExpression )
            // InternalCNL.g:1564:5: lv_logicExpression_3_0= ruleExpression
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
    // InternalCNL.g:1585:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalCNL.g:1585:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalCNL.g:1586:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalCNL.g:1592:1: ruleExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_orOp_2_0=null;
        EObject this_XorExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1598:2: ( (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) )
            // InternalCNL.g:1599:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            {
            // InternalCNL.g:1599:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            // InternalCNL.g:1600:3: this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getXorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;


            			current = this_XorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCNL.g:1608:3: ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_OR_OPERATOR) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCNL.g:1609:4: () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) )
            	    {
            	    // InternalCNL.g:1609:4: ()
            	    // InternalCNL.g:1610:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCNL.g:1616:4: ( (lv_orOp_2_0= RULE_OR_OPERATOR ) )
            	    // InternalCNL.g:1617:5: (lv_orOp_2_0= RULE_OR_OPERATOR )
            	    {
            	    // InternalCNL.g:1617:5: (lv_orOp_2_0= RULE_OR_OPERATOR )
            	    // InternalCNL.g:1618:6: lv_orOp_2_0= RULE_OR_OPERATOR
            	    {
            	    lv_orOp_2_0=(Token)match(input,RULE_OR_OPERATOR,FOLLOW_34); 

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

            	    // InternalCNL.g:1634:4: ( (lv_right_3_0= ruleXorExpression ) )
            	    // InternalCNL.g:1635:5: (lv_right_3_0= ruleXorExpression )
            	    {
            	    // InternalCNL.g:1635:5: (lv_right_3_0= ruleXorExpression )
            	    // InternalCNL.g:1636:6: lv_right_3_0= ruleXorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
            	    break loop18;
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
    // InternalCNL.g:1658:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalCNL.g:1658:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalCNL.g:1659:2: iv_ruleXorExpression= ruleXorExpression EOF
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
    // InternalCNL.g:1665:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1671:2: ( (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalCNL.g:1672:2: (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalCNL.g:1672:2: (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalCNL.g:1673:3: this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCNL.g:1681:3: ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==57) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCNL.g:1682:4: () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalCNL.g:1682:4: ()
            	    // InternalCNL.g:1683:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getXorExpressionAccess().getXOR_OPERATORParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_34);
            	    ruleXOR_OPERATOR();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalCNL.g:1696:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalCNL.g:1697:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalCNL.g:1697:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalCNL.g:1698:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_36);
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
            	    break loop19;
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
    // InternalCNL.g:1720:1: entryRuleXOR_OPERATOR returns [String current=null] : iv_ruleXOR_OPERATOR= ruleXOR_OPERATOR EOF ;
    public final String entryRuleXOR_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXOR_OPERATOR = null;


        try {
            // InternalCNL.g:1720:52: (iv_ruleXOR_OPERATOR= ruleXOR_OPERATOR EOF )
            // InternalCNL.g:1721:2: iv_ruleXOR_OPERATOR= ruleXOR_OPERATOR EOF
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
    // InternalCNL.g:1727:1: ruleXOR_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'XOR' ;
    public final AntlrDatatypeRuleToken ruleXOR_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCNL.g:1733:2: (kw= 'XOR' )
            // InternalCNL.g:1734:2: kw= 'XOR'
            {
            kw=(Token)match(input,57,FOLLOW_2); 

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
    // InternalCNL.g:1742:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalCNL.g:1742:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalCNL.g:1743:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalCNL.g:1749:1: ruleAndExpression returns [EObject current=null] : (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompExpression_0 = null;

        AntlrDatatypeRuleToken lv_andOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1755:2: ( (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* ) )
            // InternalCNL.g:1756:2: (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* )
            {
            // InternalCNL.g:1756:2: (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* )
            // InternalCNL.g:1757:3: this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getCompExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_CompExpression_0=ruleCompExpression();

            state._fsp--;


            			current = this_CompExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCNL.g:1765:3: ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==58) ) {
                    alt20=1;
                }
                else if ( (LA20_0==59) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCNL.g:1766:4: () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) )
            	    {
            	    // InternalCNL.g:1766:4: ()
            	    // InternalCNL.g:1767:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCNL.g:1773:4: ( (lv_andOp_2_0= ruleAND_OPERATOR ) )
            	    // InternalCNL.g:1774:5: (lv_andOp_2_0= ruleAND_OPERATOR )
            	    {
            	    // InternalCNL.g:1774:5: (lv_andOp_2_0= ruleAND_OPERATOR )
            	    // InternalCNL.g:1775:6: lv_andOp_2_0= ruleAND_OPERATOR
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getAndOpAND_OPERATORParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
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

            	    // InternalCNL.g:1792:4: ( (lv_right_3_0= ruleCompExpression ) )
            	    // InternalCNL.g:1793:5: (lv_right_3_0= ruleCompExpression )
            	    {
            	    // InternalCNL.g:1793:5: (lv_right_3_0= ruleCompExpression )
            	    // InternalCNL.g:1794:6: lv_right_3_0= ruleCompExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightCompExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
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
            	    break loop20;
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
    // InternalCNL.g:1816:1: entryRuleAND_OPERATOR returns [String current=null] : iv_ruleAND_OPERATOR= ruleAND_OPERATOR EOF ;
    public final String entryRuleAND_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAND_OPERATOR = null;


        try {
            // InternalCNL.g:1816:52: (iv_ruleAND_OPERATOR= ruleAND_OPERATOR EOF )
            // InternalCNL.g:1817:2: iv_ruleAND_OPERATOR= ruleAND_OPERATOR EOF
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
    // InternalCNL.g:1823:1: ruleAND_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&&' | kw= 'AND' ) ;
    public final AntlrDatatypeRuleToken ruleAND_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCNL.g:1829:2: ( (kw= '&&' | kw= 'AND' ) )
            // InternalCNL.g:1830:2: (kw= '&&' | kw= 'AND' )
            {
            // InternalCNL.g:1830:2: (kw= '&&' | kw= 'AND' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==58) ) {
                alt21=1;
            }
            else if ( (LA21_0==59) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalCNL.g:1831:3: kw= '&&'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAND_OPERATORAccess().getAmpersandAmpersandKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCNL.g:1837:3: kw= 'AND'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAND_OPERATORAccess().getANDKeyword_1());
                    		

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
    // InternalCNL.g:1846:1: entryRuleCompExpression returns [EObject current=null] : iv_ruleCompExpression= ruleCompExpression EOF ;
    public final EObject entryRuleCompExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompExpression = null;


        try {
            // InternalCNL.g:1846:55: (iv_ruleCompExpression= ruleCompExpression EOF )
            // InternalCNL.g:1847:2: iv_ruleCompExpression= ruleCompExpression EOF
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
    // InternalCNL.g:1853:1: ruleCompExpression returns [EObject current=null] : (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleCompExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EquExpression_0 = null;

        Enumerator lv_compOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1859:2: ( (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalCNL.g:1860:2: (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalCNL.g:1860:2: (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalCNL.g:1861:3: this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompExpressionAccess().getEquExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_EquExpression_0=ruleEquExpression();

            state._fsp--;


            			current = this_EquExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCNL.g:1869:3: ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                switch ( input.LA(1) ) {
                case 72:
                    {
                    alt22=1;
                    }
                    break;
                case 73:
                    {
                    alt22=1;
                    }
                    break;
                case 74:
                    {
                    alt22=1;
                    }
                    break;
                case 75:
                    {
                    alt22=1;
                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // InternalCNL.g:1870:4: () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalCNL.g:1870:4: ()
            	    // InternalCNL.g:1871:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCompExpressionAccess().getCompExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCNL.g:1877:4: ( (lv_compOp_2_0= ruleCompOperator ) )
            	    // InternalCNL.g:1878:5: (lv_compOp_2_0= ruleCompOperator )
            	    {
            	    // InternalCNL.g:1878:5: (lv_compOp_2_0= ruleCompOperator )
            	    // InternalCNL.g:1879:6: lv_compOp_2_0= ruleCompOperator
            	    {

            	    						newCompositeNode(grammarAccess.getCompExpressionAccess().getCompOpCompOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
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

            	    // InternalCNL.g:1896:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalCNL.g:1897:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalCNL.g:1897:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalCNL.g:1898:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getCompExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_38);
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
            	    break loop22;
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
    // InternalCNL.g:1920:1: entryRuleEquExpression returns [EObject current=null] : iv_ruleEquExpression= ruleEquExpression EOF ;
    public final EObject entryRuleEquExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquExpression = null;


        try {
            // InternalCNL.g:1920:54: (iv_ruleEquExpression= ruleEquExpression EOF )
            // InternalCNL.g:1921:2: iv_ruleEquExpression= ruleEquExpression EOF
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
    // InternalCNL.g:1927:1: ruleEquExpression returns [EObject current=null] : (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* ) ;
    public final EObject ruleEquExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnExpression_0 = null;

        Enumerator lv_equOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:1933:2: ( (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* ) )
            // InternalCNL.g:1934:2: (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* )
            {
            // InternalCNL.g:1934:2: (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* )
            // InternalCNL.g:1935:3: this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEquExpressionAccess().getUnExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            this_UnExpression_0=ruleUnExpression();

            state._fsp--;


            			current = this_UnExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCNL.g:1943:3: ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=70 && LA23_0<=71)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCNL.g:1944:4: () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) )
            	    {
            	    // InternalCNL.g:1944:4: ()
            	    // InternalCNL.g:1945:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEquExpressionAccess().getEquExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCNL.g:1951:4: ( (lv_equOp_2_0= ruleEquOperator ) )
            	    // InternalCNL.g:1952:5: (lv_equOp_2_0= ruleEquOperator )
            	    {
            	    // InternalCNL.g:1952:5: (lv_equOp_2_0= ruleEquOperator )
            	    // InternalCNL.g:1953:6: lv_equOp_2_0= ruleEquOperator
            	    {

            	    						newCompositeNode(grammarAccess.getEquExpressionAccess().getEquOpEquOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
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

            	    // InternalCNL.g:1970:4: ( (lv_right_3_0= ruleUnExpression ) )
            	    // InternalCNL.g:1971:5: (lv_right_3_0= ruleUnExpression )
            	    {
            	    // InternalCNL.g:1971:5: (lv_right_3_0= ruleUnExpression )
            	    // InternalCNL.g:1972:6: lv_right_3_0= ruleUnExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEquExpressionAccess().getRightUnExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_39);
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
            	    break loop23;
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
    // InternalCNL.g:1994:1: entryRuleUnOperator returns [String current=null] : iv_ruleUnOperator= ruleUnOperator EOF ;
    public final String entryRuleUnOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnOperator = null;


        try {
            // InternalCNL.g:1994:50: (iv_ruleUnOperator= ruleUnOperator EOF )
            // InternalCNL.g:1995:2: iv_ruleUnOperator= ruleUnOperator EOF
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
    // InternalCNL.g:2001:1: ruleUnOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' ) ;
    public final AntlrDatatypeRuleToken ruleUnOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NotOperator_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:2007:2: ( (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' ) )
            // InternalCNL.g:2008:2: (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' )
            {
            // InternalCNL.g:2008:2: (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' )
            int alt24=5;
            switch ( input.LA(1) ) {
            case 64:
            case 65:
                {
                alt24=1;
                }
                break;
            case 60:
                {
                alt24=2;
                }
                break;
            case 61:
                {
                alt24=3;
                }
                break;
            case 62:
                {
                alt24=4;
                }
                break;
            case 63:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalCNL.g:2009:3: this_NotOperator_0= ruleNotOperator
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
                    // InternalCNL.g:2020:3: kw= 'FE'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getFEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCNL.g:2026:3: kw= 'RE'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getREKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalCNL.g:2032:3: kw= 'HIGH'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getHIGHKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalCNL.g:2038:3: kw= 'LOW'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

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
    // InternalCNL.g:2047:1: entryRuleNotOperator returns [String current=null] : iv_ruleNotOperator= ruleNotOperator EOF ;
    public final String entryRuleNotOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNotOperator = null;


        try {
            // InternalCNL.g:2047:51: (iv_ruleNotOperator= ruleNotOperator EOF )
            // InternalCNL.g:2048:2: iv_ruleNotOperator= ruleNotOperator EOF
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
    // InternalCNL.g:2054:1: ruleNotOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NOT' | kw= '!' ) ;
    public final AntlrDatatypeRuleToken ruleNotOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCNL.g:2060:2: ( (kw= 'NOT' | kw= '!' ) )
            // InternalCNL.g:2061:2: (kw= 'NOT' | kw= '!' )
            {
            // InternalCNL.g:2061:2: (kw= 'NOT' | kw= '!' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==64) ) {
                alt25=1;
            }
            else if ( (LA25_0==65) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalCNL.g:2062:3: kw= 'NOT'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNotOperatorAccess().getNOTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCNL.g:2068:3: kw= '!'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

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
    // InternalCNL.g:2077:1: entryRuleUnExpression returns [EObject current=null] : iv_ruleUnExpression= ruleUnExpression EOF ;
    public final EObject entryRuleUnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnExpression = null;


        try {
            // InternalCNL.g:2077:53: (iv_ruleUnExpression= ruleUnExpression EOF )
            // InternalCNL.g:2078:2: iv_ruleUnExpression= ruleUnExpression EOF
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
    // InternalCNL.g:2084:1: ruleUnExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleUnExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        AntlrDatatypeRuleToken lv_unOp_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:2090:2: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) ) )
            // InternalCNL.g:2091:2: (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) )
            {
            // InternalCNL.g:2091:2: (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_INTEGER)||LA26_0==RULE_BOOLEAN_LITERAL||(LA26_0>=66 && LA26_0<=67)) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=60 && LA26_0<=65)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalCNL.g:2092:3: this_PrimaryExpression_0= rulePrimaryExpression
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
                    // InternalCNL.g:2101:3: ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) )
                    {
                    // InternalCNL.g:2101:3: ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) )
                    // InternalCNL.g:2102:4: ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) )
                    {
                    // InternalCNL.g:2102:4: ( (lv_unOp_1_0= ruleUnOperator ) )
                    // InternalCNL.g:2103:5: (lv_unOp_1_0= ruleUnOperator )
                    {
                    // InternalCNL.g:2103:5: (lv_unOp_1_0= ruleUnOperator )
                    // InternalCNL.g:2104:6: lv_unOp_1_0= ruleUnOperator
                    {

                    						newCompositeNode(grammarAccess.getUnExpressionAccess().getUnOpUnOperatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_40);
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

                    // InternalCNL.g:2121:4: ( (lv_right_2_0= rulePrimaryExpression ) )
                    // InternalCNL.g:2122:5: (lv_right_2_0= rulePrimaryExpression )
                    {
                    // InternalCNL.g:2122:5: (lv_right_2_0= rulePrimaryExpression )
                    // InternalCNL.g:2123:6: lv_right_2_0= rulePrimaryExpression
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
    // InternalCNL.g:2145:1: entryRuleTauExpression returns [EObject current=null] : iv_ruleTauExpression= ruleTauExpression EOF ;
    public final EObject entryRuleTauExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTauExpression = null;


        try {
            // InternalCNL.g:2145:54: (iv_ruleTauExpression= ruleTauExpression EOF )
            // InternalCNL.g:2146:2: iv_ruleTauExpression= ruleTauExpression EOF
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
    // InternalCNL.g:2152:1: ruleTauExpression returns [EObject current=null] : (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' ) ;
    public final EObject ruleTauExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:2158:2: ( (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' ) )
            // InternalCNL.g:2159:2: (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' )
            {
            // InternalCNL.g:2159:2: (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' )
            // InternalCNL.g:2160:3: otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getTauExpressionAccess().getTAUKeyword_0());
            		
            otherlv_1=(Token)match(input,67,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getTauExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCNL.g:2168:3: ( (lv_time_2_0= ruleTimeLiteral ) )
            // InternalCNL.g:2169:4: (lv_time_2_0= ruleTimeLiteral )
            {
            // InternalCNL.g:2169:4: (lv_time_2_0= ruleTimeLiteral )
            // InternalCNL.g:2170:5: lv_time_2_0= ruleTimeLiteral
            {

            					newCompositeNode(grammarAccess.getTauExpressionAccess().getTimeTimeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_43);
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

            otherlv_3=(Token)match(input,68,FOLLOW_2); 

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
    // InternalCNL.g:2195:1: entryRuleTimeLiteral returns [EObject current=null] : iv_ruleTimeLiteral= ruleTimeLiteral EOF ;
    public final EObject entryRuleTimeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeLiteral = null;


        try {
            // InternalCNL.g:2195:52: (iv_ruleTimeLiteral= ruleTimeLiteral EOF )
            // InternalCNL.g:2196:2: iv_ruleTimeLiteral= ruleTimeLiteral EOF
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
    // InternalCNL.g:2202:1: ruleTimeLiteral returns [EObject current=null] : ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) ) ;
    public final EObject ruleTimeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_interval_1_0=null;


        	enterRule();

        try {
            // InternalCNL.g:2208:2: ( ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) ) )
            // InternalCNL.g:2209:2: ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) )
            {
            // InternalCNL.g:2209:2: ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) )
            // InternalCNL.g:2210:3: ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) )
            {

            			newCompositeNode(grammarAccess.getTimeLiteralAccess().getTIME_PREF_LITERALParserRuleCall_0());
            		
            pushFollow(FOLLOW_44);
            ruleTIME_PREF_LITERAL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalCNL.g:2217:3: ( (lv_interval_1_0= RULE_INTERVAL ) )
            // InternalCNL.g:2218:4: (lv_interval_1_0= RULE_INTERVAL )
            {
            // InternalCNL.g:2218:4: (lv_interval_1_0= RULE_INTERVAL )
            // InternalCNL.g:2219:5: lv_interval_1_0= RULE_INTERVAL
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
    // InternalCNL.g:2239:1: entryRuleTIME_PREF_LITERAL returns [String current=null] : iv_ruleTIME_PREF_LITERAL= ruleTIME_PREF_LITERAL EOF ;
    public final String entryRuleTIME_PREF_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTIME_PREF_LITERAL = null;


        try {
            // InternalCNL.g:2239:57: (iv_ruleTIME_PREF_LITERAL= ruleTIME_PREF_LITERAL EOF )
            // InternalCNL.g:2240:2: iv_ruleTIME_PREF_LITERAL= ruleTIME_PREF_LITERAL EOF
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
    // InternalCNL.g:2246:1: ruleTIME_PREF_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '#T' ;
    public final AntlrDatatypeRuleToken ruleTIME_PREF_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCNL.g:2252:2: (kw= '#T' )
            // InternalCNL.g:2253:2: kw= '#T'
            {
            kw=(Token)match(input,69,FOLLOW_2); 

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
    // InternalCNL.g:2261:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalCNL.g:2261:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalCNL.g:2262:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalCNL.g:2268:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_tau_1_0= ruleTauExpression ) ) | ( (lv_v_2_0= RULE_ID ) ) | (otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_v_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_constant_0_0 = null;

        EObject lv_tau_1_0 = null;

        EObject lv_nestExpr_4_0 = null;



        	enterRule();

        try {
            // InternalCNL.g:2274:2: ( ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_tau_1_0= ruleTauExpression ) ) | ( (lv_v_2_0= RULE_ID ) ) | (otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) ) )
            // InternalCNL.g:2275:2: ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_tau_1_0= ruleTauExpression ) ) | ( (lv_v_2_0= RULE_ID ) ) | (otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            {
            // InternalCNL.g:2275:2: ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_tau_1_0= ruleTauExpression ) ) | ( (lv_v_2_0= RULE_ID ) ) | (otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
            case RULE_BOOLEAN_LITERAL:
                {
                alt27=1;
                }
                break;
            case 66:
                {
                alt27=2;
                }
                break;
            case RULE_ID:
                {
                alt27=3;
                }
                break;
            case 67:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalCNL.g:2276:3: ( (lv_constant_0_0= ruleConstant ) )
                    {
                    // InternalCNL.g:2276:3: ( (lv_constant_0_0= ruleConstant ) )
                    // InternalCNL.g:2277:4: (lv_constant_0_0= ruleConstant )
                    {
                    // InternalCNL.g:2277:4: (lv_constant_0_0= ruleConstant )
                    // InternalCNL.g:2278:5: lv_constant_0_0= ruleConstant
                    {

                    					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getConstantConstantParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_constant_0_0=ruleConstant();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					set(
                    						current,
                    						"constant",
                    						lv_constant_0_0,
                    						"org.xtext.example.CNL.Constant");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:2296:3: ( (lv_tau_1_0= ruleTauExpression ) )
                    {
                    // InternalCNL.g:2296:3: ( (lv_tau_1_0= ruleTauExpression ) )
                    // InternalCNL.g:2297:4: (lv_tau_1_0= ruleTauExpression )
                    {
                    // InternalCNL.g:2297:4: (lv_tau_1_0= ruleTauExpression )
                    // InternalCNL.g:2298:5: lv_tau_1_0= ruleTauExpression
                    {

                    					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTauTauExpressionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_tau_1_0=ruleTauExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					set(
                    						current,
                    						"tau",
                    						lv_tau_1_0,
                    						"org.xtext.example.CNL.TauExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCNL.g:2316:3: ( (lv_v_2_0= RULE_ID ) )
                    {
                    // InternalCNL.g:2316:3: ( (lv_v_2_0= RULE_ID ) )
                    // InternalCNL.g:2317:4: (lv_v_2_0= RULE_ID )
                    {
                    // InternalCNL.g:2317:4: (lv_v_2_0= RULE_ID )
                    // InternalCNL.g:2318:5: lv_v_2_0= RULE_ID
                    {
                    lv_v_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_v_2_0, grammarAccess.getPrimaryExpressionAccess().getVIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"v",
                    						lv_v_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCNL.g:2335:3: (otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')' )
                    {
                    // InternalCNL.g:2335:3: (otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')' )
                    // InternalCNL.g:2336:4: otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,67,FOLLOW_34); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalCNL.g:2340:4: ( (lv_nestExpr_4_0= ruleExpression ) )
                    // InternalCNL.g:2341:5: (lv_nestExpr_4_0= ruleExpression )
                    {
                    // InternalCNL.g:2341:5: (lv_nestExpr_4_0= ruleExpression )
                    // InternalCNL.g:2342:6: lv_nestExpr_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNestExprExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_43);
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

                    otherlv_5=(Token)match(input,68,FOLLOW_2); 

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
    // InternalCNL.g:2368:1: entryRuleConstant returns [String current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final String entryRuleConstant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstant = null;


        try {
            // InternalCNL.g:2368:48: (iv_ruleConstant= ruleConstant EOF )
            // InternalCNL.g:2369:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalCNL.g:2375:1: ruleConstant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTEGER_0= RULE_INTEGER | this_BOOLEAN_LITERAL_1= RULE_BOOLEAN_LITERAL ) ;
    public final AntlrDatatypeRuleToken ruleConstant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_0=null;
        Token this_BOOLEAN_LITERAL_1=null;


        	enterRule();

        try {
            // InternalCNL.g:2381:2: ( (this_INTEGER_0= RULE_INTEGER | this_BOOLEAN_LITERAL_1= RULE_BOOLEAN_LITERAL ) )
            // InternalCNL.g:2382:2: (this_INTEGER_0= RULE_INTEGER | this_BOOLEAN_LITERAL_1= RULE_BOOLEAN_LITERAL )
            {
            // InternalCNL.g:2382:2: (this_INTEGER_0= RULE_INTEGER | this_BOOLEAN_LITERAL_1= RULE_BOOLEAN_LITERAL )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INTEGER) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_BOOLEAN_LITERAL) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalCNL.g:2383:3: this_INTEGER_0= RULE_INTEGER
                    {
                    this_INTEGER_0=(Token)match(input,RULE_INTEGER,FOLLOW_2); 

                    			current.merge(this_INTEGER_0);
                    		

                    			newLeafNode(this_INTEGER_0, grammarAccess.getConstantAccess().getINTEGERTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCNL.g:2391:3: this_BOOLEAN_LITERAL_1= RULE_BOOLEAN_LITERAL
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


    // $ANTLR start "ruleEquOperator"
    // InternalCNL.g:2402:1: ruleEquOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleEquOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCNL.g:2408:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) )
            // InternalCNL.g:2409:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalCNL.g:2409:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==70) ) {
                alt29=1;
            }
            else if ( (LA29_0==71) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalCNL.g:2410:3: (enumLiteral_0= '==' )
                    {
                    // InternalCNL.g:2410:3: (enumLiteral_0= '==' )
                    // InternalCNL.g:2411:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getEquOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEquOperatorAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:2418:3: (enumLiteral_1= '<>' )
                    {
                    // InternalCNL.g:2418:3: (enumLiteral_1= '<>' )
                    // InternalCNL.g:2419:4: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

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
    // InternalCNL.g:2429:1: ruleCompOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleCompOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCNL.g:2435:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) )
            // InternalCNL.g:2436:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            {
            // InternalCNL.g:2436:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt30=1;
                }
                break;
            case 73:
                {
                alt30=2;
                }
                break;
            case 74:
                {
                alt30=3;
                }
                break;
            case 75:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalCNL.g:2437:3: (enumLiteral_0= '<' )
                    {
                    // InternalCNL.g:2437:3: (enumLiteral_0= '<' )
                    // InternalCNL.g:2438:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCNL.g:2445:3: (enumLiteral_1= '>' )
                    {
                    // InternalCNL.g:2445:3: (enumLiteral_1= '>' )
                    // InternalCNL.g:2446:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCNL.g:2453:3: (enumLiteral_2= '<=' )
                    {
                    // InternalCNL.g:2453:3: (enumLiteral_2= '<=' )
                    // InternalCNL.g:2454:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getLESS_EQUEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompOperatorAccess().getLESS_EQUEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCNL.g:2461:3: (enumLiteral_3= '>=' )
                    {
                    // InternalCNL.g:2461:3: (enumLiteral_3= '>=' )
                    // InternalCNL.g:2462:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getGREATER_EQUEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCompOperatorAccess().getGREATER_EQUEnumLiteralDeclaration_3());
                    			

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


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\41\1\4\2\uffff\2\4\1\uffff";
    static final String dfa_3s = "\1\55\1\5\2\uffff\2\55\1\uffff";
    static final String dfa_4s = "\2\uffff\1\2\1\3\2\uffff\1\1";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\uffff\1\2\1\uffff\1\2\1\3\6\uffff\1\1",
            "\1\4\1\5",
            "",
            "",
            "\1\4\1\5\47\uffff\1\6",
            "\1\4\1\5\47\uffff\1\6",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "354:3: ( ( (lv_invariant_5_0= ruleInv ) ) | ( (lv_release_reaction_6_0= ruleRelRea ) ) | ( (lv_delay_final_7_0= ruleDelFin ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0052000000800002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000020000C000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000206A0C000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000400010000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000202A0C000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xF000000000000130L,0x000000000000000FL});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000130L,0x000000000000000CL});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000080L});

}