package org.example.domainmodel.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.domainmodel.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SIGN", "RULE_INTEGER", "RULE_SEPARATOR", "RULE_EXPONENT", "RULE_DIGIT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'"
    };
    public static final int RULE_ID=9;
    public static final int RULE_WS=14;
    public static final int RULE_SIGN=4;
    public static final int RULE_DIGIT=8;
    public static final int RULE_STRING=11;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_SEPARATOR=6;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_EXPONENT=7;
    public static final int T__16=16;
    public static final int RULE_INT=10;
    public static final int RULE_ML_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_INTEGER=5;

    // delegates
    // delegators


        public InternalDomainmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainmodelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomainmodel.g"; }



     	private DomainmodelGrammarAccess grammarAccess;

        public InternalDomainmodelParser(TokenStream input, DomainmodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected DomainmodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalDomainmodel.g:64:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalDomainmodel.g:64:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalDomainmodel.g:65:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalDomainmodel.g:71:1: ruleDomainmodel returns [EObject current=null] : ( ( (lv_numbers_0_0= ruleNumber ) ) otherlv_1= ';' )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_numbers_0_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:77:2: ( ( ( (lv_numbers_0_0= ruleNumber ) ) otherlv_1= ';' )* )
            // InternalDomainmodel.g:78:2: ( ( (lv_numbers_0_0= ruleNumber ) ) otherlv_1= ';' )*
            {
            // InternalDomainmodel.g:78:2: ( ( (lv_numbers_0_0= ruleNumber ) ) otherlv_1= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_SIGN && LA1_0<=RULE_INTEGER)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainmodel.g:79:3: ( (lv_numbers_0_0= ruleNumber ) ) otherlv_1= ';'
            	    {
            	    // InternalDomainmodel.g:79:3: ( (lv_numbers_0_0= ruleNumber ) )
            	    // InternalDomainmodel.g:80:4: (lv_numbers_0_0= ruleNumber )
            	    {
            	    // InternalDomainmodel.g:80:4: (lv_numbers_0_0= ruleNumber )
            	    // InternalDomainmodel.g:81:5: lv_numbers_0_0= ruleNumber
            	    {

            	    					newCompositeNode(grammarAccess.getDomainmodelAccess().getNumbersNumberParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_numbers_0_0=ruleNumber();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"numbers",
            	    						lv_numbers_0_0,
            	    						"org.example.domainmodel.Domainmodel.Number");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }

            	    otherlv_1=(Token)match(input,16,FOLLOW_4); 

            	    			newLeafNode(otherlv_1, grammarAccess.getDomainmodelAccess().getSemicolonKeyword_1());
            	    		

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
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleNumber"
    // InternalDomainmodel.g:106:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalDomainmodel.g:106:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalDomainmodel.g:107:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalDomainmodel.g:113:1: ruleNumber returns [EObject current=null] : ( () ( (lv_sign_1_0= RULE_SIGN ) )? ( (lv_before_point_2_0= RULE_INTEGER ) ) (this_SEPARATOR_3= RULE_SEPARATOR ( (lv_after_point_4_0= RULE_INTEGER ) ) )? (this_EXPONENT_5= RULE_EXPONENT (this_SIGN_6= RULE_SIGN )? ( (lv_exponent_7_0= RULE_INTEGER ) ) )? ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_sign_1_0=null;
        Token lv_before_point_2_0=null;
        Token this_SEPARATOR_3=null;
        Token lv_after_point_4_0=null;
        Token this_EXPONENT_5=null;
        Token this_SIGN_6=null;
        Token lv_exponent_7_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:119:2: ( ( () ( (lv_sign_1_0= RULE_SIGN ) )? ( (lv_before_point_2_0= RULE_INTEGER ) ) (this_SEPARATOR_3= RULE_SEPARATOR ( (lv_after_point_4_0= RULE_INTEGER ) ) )? (this_EXPONENT_5= RULE_EXPONENT (this_SIGN_6= RULE_SIGN )? ( (lv_exponent_7_0= RULE_INTEGER ) ) )? ) )
            // InternalDomainmodel.g:120:2: ( () ( (lv_sign_1_0= RULE_SIGN ) )? ( (lv_before_point_2_0= RULE_INTEGER ) ) (this_SEPARATOR_3= RULE_SEPARATOR ( (lv_after_point_4_0= RULE_INTEGER ) ) )? (this_EXPONENT_5= RULE_EXPONENT (this_SIGN_6= RULE_SIGN )? ( (lv_exponent_7_0= RULE_INTEGER ) ) )? )
            {
            // InternalDomainmodel.g:120:2: ( () ( (lv_sign_1_0= RULE_SIGN ) )? ( (lv_before_point_2_0= RULE_INTEGER ) ) (this_SEPARATOR_3= RULE_SEPARATOR ( (lv_after_point_4_0= RULE_INTEGER ) ) )? (this_EXPONENT_5= RULE_EXPONENT (this_SIGN_6= RULE_SIGN )? ( (lv_exponent_7_0= RULE_INTEGER ) ) )? )
            // InternalDomainmodel.g:121:3: () ( (lv_sign_1_0= RULE_SIGN ) )? ( (lv_before_point_2_0= RULE_INTEGER ) ) (this_SEPARATOR_3= RULE_SEPARATOR ( (lv_after_point_4_0= RULE_INTEGER ) ) )? (this_EXPONENT_5= RULE_EXPONENT (this_SIGN_6= RULE_SIGN )? ( (lv_exponent_7_0= RULE_INTEGER ) ) )?
            {
            // InternalDomainmodel.g:121:3: ()
            // InternalDomainmodel.g:122:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumberAction_0(),
            					current);
            			

            }

            // InternalDomainmodel.g:128:3: ( (lv_sign_1_0= RULE_SIGN ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_SIGN) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomainmodel.g:129:4: (lv_sign_1_0= RULE_SIGN )
                    {
                    // InternalDomainmodel.g:129:4: (lv_sign_1_0= RULE_SIGN )
                    // InternalDomainmodel.g:130:5: lv_sign_1_0= RULE_SIGN
                    {
                    lv_sign_1_0=(Token)match(input,RULE_SIGN,FOLLOW_5); 

                    					newLeafNode(lv_sign_1_0, grammarAccess.getNumberAccess().getSignSIGNTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNumberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"sign",
                    						lv_sign_1_0,
                    						"org.example.domainmodel.Domainmodel.SIGN");
                    				

                    }


                    }
                    break;

            }

            // InternalDomainmodel.g:146:3: ( (lv_before_point_2_0= RULE_INTEGER ) )
            // InternalDomainmodel.g:147:4: (lv_before_point_2_0= RULE_INTEGER )
            {
            // InternalDomainmodel.g:147:4: (lv_before_point_2_0= RULE_INTEGER )
            // InternalDomainmodel.g:148:5: lv_before_point_2_0= RULE_INTEGER
            {
            lv_before_point_2_0=(Token)match(input,RULE_INTEGER,FOLLOW_6); 

            					newLeafNode(lv_before_point_2_0, grammarAccess.getNumberAccess().getBefore_pointINTEGERTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"before_point",
            						lv_before_point_2_0,
            						"org.example.domainmodel.Domainmodel.INTEGER");
            				

            }


            }

            // InternalDomainmodel.g:164:3: (this_SEPARATOR_3= RULE_SEPARATOR ( (lv_after_point_4_0= RULE_INTEGER ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_SEPARATOR) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDomainmodel.g:165:4: this_SEPARATOR_3= RULE_SEPARATOR ( (lv_after_point_4_0= RULE_INTEGER ) )
                    {
                    this_SEPARATOR_3=(Token)match(input,RULE_SEPARATOR,FOLLOW_5); 

                    				newLeafNode(this_SEPARATOR_3, grammarAccess.getNumberAccess().getSEPARATORTerminalRuleCall_3_0());
                    			
                    // InternalDomainmodel.g:169:4: ( (lv_after_point_4_0= RULE_INTEGER ) )
                    // InternalDomainmodel.g:170:5: (lv_after_point_4_0= RULE_INTEGER )
                    {
                    // InternalDomainmodel.g:170:5: (lv_after_point_4_0= RULE_INTEGER )
                    // InternalDomainmodel.g:171:6: lv_after_point_4_0= RULE_INTEGER
                    {
                    lv_after_point_4_0=(Token)match(input,RULE_INTEGER,FOLLOW_7); 

                    						newLeafNode(lv_after_point_4_0, grammarAccess.getNumberAccess().getAfter_pointINTEGERTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumberRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"after_point",
                    							lv_after_point_4_0,
                    							"org.example.domainmodel.Domainmodel.INTEGER");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomainmodel.g:188:3: (this_EXPONENT_5= RULE_EXPONENT (this_SIGN_6= RULE_SIGN )? ( (lv_exponent_7_0= RULE_INTEGER ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_EXPONENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomainmodel.g:189:4: this_EXPONENT_5= RULE_EXPONENT (this_SIGN_6= RULE_SIGN )? ( (lv_exponent_7_0= RULE_INTEGER ) )
                    {
                    this_EXPONENT_5=(Token)match(input,RULE_EXPONENT,FOLLOW_8); 

                    				newLeafNode(this_EXPONENT_5, grammarAccess.getNumberAccess().getEXPONENTTerminalRuleCall_4_0());
                    			
                    // InternalDomainmodel.g:193:4: (this_SIGN_6= RULE_SIGN )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_SIGN) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalDomainmodel.g:194:5: this_SIGN_6= RULE_SIGN
                            {
                            this_SIGN_6=(Token)match(input,RULE_SIGN,FOLLOW_5); 

                            					newLeafNode(this_SIGN_6, grammarAccess.getNumberAccess().getSIGNTerminalRuleCall_4_1());
                            				

                            }
                            break;

                    }

                    // InternalDomainmodel.g:199:4: ( (lv_exponent_7_0= RULE_INTEGER ) )
                    // InternalDomainmodel.g:200:5: (lv_exponent_7_0= RULE_INTEGER )
                    {
                    // InternalDomainmodel.g:200:5: (lv_exponent_7_0= RULE_INTEGER )
                    // InternalDomainmodel.g:201:6: lv_exponent_7_0= RULE_INTEGER
                    {
                    lv_exponent_7_0=(Token)match(input,RULE_INTEGER,FOLLOW_2); 

                    						newLeafNode(lv_exponent_7_0, grammarAccess.getNumberAccess().getExponentINTEGERTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumberRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"exponent",
                    							lv_exponent_7_0,
                    							"org.example.domainmodel.Domainmodel.INTEGER");
                    					

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
    // $ANTLR end "ruleNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});

}