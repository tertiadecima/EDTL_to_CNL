package org.example.domainmodel.ide.contentassist.antlr.internal;

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
import org.example.domainmodel.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SEPARATOR", "RULE_EXPONENT", "RULE_SIGN", "RULE_INTEGER", "RULE_DIGIT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'"
    };
    public static final int RULE_ID=9;
    public static final int RULE_WS=14;
    public static final int RULE_SIGN=6;
    public static final int RULE_DIGIT=8;
    public static final int RULE_STRING=11;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_SEPARATOR=4;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_EXPONENT=5;
    public static final int T__16=16;
    public static final int RULE_INT=10;
    public static final int RULE_ML_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_INTEGER=7;

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

    	public void setGrammarAccess(DomainmodelGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDomainmodel"
    // InternalDomainmodel.g:53:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalDomainmodel.g:54:1: ( ruleDomainmodel EOF )
            // InternalDomainmodel.g:55:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalDomainmodel.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__Group__0 )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:66:2: ( ( ( rule__Domainmodel__Group__0 )* ) )
            // InternalDomainmodel.g:67:2: ( ( rule__Domainmodel__Group__0 )* )
            {
            // InternalDomainmodel.g:67:2: ( ( rule__Domainmodel__Group__0 )* )
            // InternalDomainmodel.g:68:3: ( rule__Domainmodel__Group__0 )*
            {
             before(grammarAccess.getDomainmodelAccess().getGroup()); 
            // InternalDomainmodel.g:69:3: ( rule__Domainmodel__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_SIGN && LA1_0<=RULE_INTEGER)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainmodel.g:69:4: rule__Domainmodel__Group__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Domainmodel__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleNumber"
    // InternalDomainmodel.g:78:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalDomainmodel.g:79:1: ( ruleNumber EOF )
            // InternalDomainmodel.g:80:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalDomainmodel.g:87:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:91:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalDomainmodel.g:92:2: ( ( rule__Number__Group__0 ) )
            {
            // InternalDomainmodel.g:92:2: ( ( rule__Number__Group__0 ) )
            // InternalDomainmodel.g:93:3: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // InternalDomainmodel.g:94:3: ( rule__Number__Group__0 )
            // InternalDomainmodel.g:94:4: rule__Number__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__Domainmodel__Group__0"
    // InternalDomainmodel.g:102:1: rule__Domainmodel__Group__0 : rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 ;
    public final void rule__Domainmodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:106:1: ( rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 )
            // InternalDomainmodel.g:107:2: rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Domainmodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domainmodel__Group__1();

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
    // $ANTLR end "rule__Domainmodel__Group__0"


    // $ANTLR start "rule__Domainmodel__Group__0__Impl"
    // InternalDomainmodel.g:114:1: rule__Domainmodel__Group__0__Impl : ( ( rule__Domainmodel__NumbersAssignment_0 ) ) ;
    public final void rule__Domainmodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:118:1: ( ( ( rule__Domainmodel__NumbersAssignment_0 ) ) )
            // InternalDomainmodel.g:119:1: ( ( rule__Domainmodel__NumbersAssignment_0 ) )
            {
            // InternalDomainmodel.g:119:1: ( ( rule__Domainmodel__NumbersAssignment_0 ) )
            // InternalDomainmodel.g:120:2: ( rule__Domainmodel__NumbersAssignment_0 )
            {
             before(grammarAccess.getDomainmodelAccess().getNumbersAssignment_0()); 
            // InternalDomainmodel.g:121:2: ( rule__Domainmodel__NumbersAssignment_0 )
            // InternalDomainmodel.g:121:3: rule__Domainmodel__NumbersAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Domainmodel__NumbersAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDomainmodelAccess().getNumbersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__Group__0__Impl"


    // $ANTLR start "rule__Domainmodel__Group__1"
    // InternalDomainmodel.g:129:1: rule__Domainmodel__Group__1 : rule__Domainmodel__Group__1__Impl ;
    public final void rule__Domainmodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:133:1: ( rule__Domainmodel__Group__1__Impl )
            // InternalDomainmodel.g:134:2: rule__Domainmodel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domainmodel__Group__1__Impl();

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
    // $ANTLR end "rule__Domainmodel__Group__1"


    // $ANTLR start "rule__Domainmodel__Group__1__Impl"
    // InternalDomainmodel.g:140:1: rule__Domainmodel__Group__1__Impl : ( ';' ) ;
    public final void rule__Domainmodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:144:1: ( ( ';' ) )
            // InternalDomainmodel.g:145:1: ( ';' )
            {
            // InternalDomainmodel.g:145:1: ( ';' )
            // InternalDomainmodel.g:146:2: ';'
            {
             before(grammarAccess.getDomainmodelAccess().getSemicolonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDomainmodelAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__Group__1__Impl"


    // $ANTLR start "rule__Number__Group__0"
    // InternalDomainmodel.g:156:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:160:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalDomainmodel.g:161:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__1();

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
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // InternalDomainmodel.g:168:1: rule__Number__Group__0__Impl : ( () ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:172:1: ( ( () ) )
            // InternalDomainmodel.g:173:1: ( () )
            {
            // InternalDomainmodel.g:173:1: ( () )
            // InternalDomainmodel.g:174:2: ()
            {
             before(grammarAccess.getNumberAccess().getNumberAction_0()); 
            // InternalDomainmodel.g:175:2: ()
            // InternalDomainmodel.g:175:3: 
            {
            }

             after(grammarAccess.getNumberAccess().getNumberAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // InternalDomainmodel.g:183:1: rule__Number__Group__1 : rule__Number__Group__1__Impl rule__Number__Group__2 ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:187:1: ( rule__Number__Group__1__Impl rule__Number__Group__2 )
            // InternalDomainmodel.g:188:2: rule__Number__Group__1__Impl rule__Number__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Number__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__2();

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
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // InternalDomainmodel.g:195:1: rule__Number__Group__1__Impl : ( ( rule__Number__SignAssignment_1 )? ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:199:1: ( ( ( rule__Number__SignAssignment_1 )? ) )
            // InternalDomainmodel.g:200:1: ( ( rule__Number__SignAssignment_1 )? )
            {
            // InternalDomainmodel.g:200:1: ( ( rule__Number__SignAssignment_1 )? )
            // InternalDomainmodel.g:201:2: ( rule__Number__SignAssignment_1 )?
            {
             before(grammarAccess.getNumberAccess().getSignAssignment_1()); 
            // InternalDomainmodel.g:202:2: ( rule__Number__SignAssignment_1 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_SIGN) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomainmodel.g:202:3: rule__Number__SignAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Number__SignAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getSignAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Number__Group__2"
    // InternalDomainmodel.g:210:1: rule__Number__Group__2 : rule__Number__Group__2__Impl rule__Number__Group__3 ;
    public final void rule__Number__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:214:1: ( rule__Number__Group__2__Impl rule__Number__Group__3 )
            // InternalDomainmodel.g:215:2: rule__Number__Group__2__Impl rule__Number__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Number__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__3();

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
    // $ANTLR end "rule__Number__Group__2"


    // $ANTLR start "rule__Number__Group__2__Impl"
    // InternalDomainmodel.g:222:1: rule__Number__Group__2__Impl : ( ( rule__Number__Before_pointAssignment_2 ) ) ;
    public final void rule__Number__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:226:1: ( ( ( rule__Number__Before_pointAssignment_2 ) ) )
            // InternalDomainmodel.g:227:1: ( ( rule__Number__Before_pointAssignment_2 ) )
            {
            // InternalDomainmodel.g:227:1: ( ( rule__Number__Before_pointAssignment_2 ) )
            // InternalDomainmodel.g:228:2: ( rule__Number__Before_pointAssignment_2 )
            {
             before(grammarAccess.getNumberAccess().getBefore_pointAssignment_2()); 
            // InternalDomainmodel.g:229:2: ( rule__Number__Before_pointAssignment_2 )
            // InternalDomainmodel.g:229:3: rule__Number__Before_pointAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Number__Before_pointAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getBefore_pointAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__2__Impl"


    // $ANTLR start "rule__Number__Group__3"
    // InternalDomainmodel.g:237:1: rule__Number__Group__3 : rule__Number__Group__3__Impl rule__Number__Group__4 ;
    public final void rule__Number__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:241:1: ( rule__Number__Group__3__Impl rule__Number__Group__4 )
            // InternalDomainmodel.g:242:2: rule__Number__Group__3__Impl rule__Number__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Number__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__4();

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
    // $ANTLR end "rule__Number__Group__3"


    // $ANTLR start "rule__Number__Group__3__Impl"
    // InternalDomainmodel.g:249:1: rule__Number__Group__3__Impl : ( ( rule__Number__Group_3__0 )? ) ;
    public final void rule__Number__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:253:1: ( ( ( rule__Number__Group_3__0 )? ) )
            // InternalDomainmodel.g:254:1: ( ( rule__Number__Group_3__0 )? )
            {
            // InternalDomainmodel.g:254:1: ( ( rule__Number__Group_3__0 )? )
            // InternalDomainmodel.g:255:2: ( rule__Number__Group_3__0 )?
            {
             before(grammarAccess.getNumberAccess().getGroup_3()); 
            // InternalDomainmodel.g:256:2: ( rule__Number__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_SEPARATOR) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDomainmodel.g:256:3: rule__Number__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Number__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__3__Impl"


    // $ANTLR start "rule__Number__Group__4"
    // InternalDomainmodel.g:264:1: rule__Number__Group__4 : rule__Number__Group__4__Impl ;
    public final void rule__Number__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:268:1: ( rule__Number__Group__4__Impl )
            // InternalDomainmodel.g:269:2: rule__Number__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__4__Impl();

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
    // $ANTLR end "rule__Number__Group__4"


    // $ANTLR start "rule__Number__Group__4__Impl"
    // InternalDomainmodel.g:275:1: rule__Number__Group__4__Impl : ( ( rule__Number__Group_4__0 )? ) ;
    public final void rule__Number__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:279:1: ( ( ( rule__Number__Group_4__0 )? ) )
            // InternalDomainmodel.g:280:1: ( ( rule__Number__Group_4__0 )? )
            {
            // InternalDomainmodel.g:280:1: ( ( rule__Number__Group_4__0 )? )
            // InternalDomainmodel.g:281:2: ( rule__Number__Group_4__0 )?
            {
             before(grammarAccess.getNumberAccess().getGroup_4()); 
            // InternalDomainmodel.g:282:2: ( rule__Number__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_EXPONENT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDomainmodel.g:282:3: rule__Number__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Number__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__4__Impl"


    // $ANTLR start "rule__Number__Group_3__0"
    // InternalDomainmodel.g:291:1: rule__Number__Group_3__0 : rule__Number__Group_3__0__Impl rule__Number__Group_3__1 ;
    public final void rule__Number__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:295:1: ( rule__Number__Group_3__0__Impl rule__Number__Group_3__1 )
            // InternalDomainmodel.g:296:2: rule__Number__Group_3__0__Impl rule__Number__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Number__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group_3__1();

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
    // $ANTLR end "rule__Number__Group_3__0"


    // $ANTLR start "rule__Number__Group_3__0__Impl"
    // InternalDomainmodel.g:303:1: rule__Number__Group_3__0__Impl : ( RULE_SEPARATOR ) ;
    public final void rule__Number__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:307:1: ( ( RULE_SEPARATOR ) )
            // InternalDomainmodel.g:308:1: ( RULE_SEPARATOR )
            {
            // InternalDomainmodel.g:308:1: ( RULE_SEPARATOR )
            // InternalDomainmodel.g:309:2: RULE_SEPARATOR
            {
             before(grammarAccess.getNumberAccess().getSEPARATORTerminalRuleCall_3_0()); 
            match(input,RULE_SEPARATOR,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getSEPARATORTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_3__0__Impl"


    // $ANTLR start "rule__Number__Group_3__1"
    // InternalDomainmodel.g:318:1: rule__Number__Group_3__1 : rule__Number__Group_3__1__Impl ;
    public final void rule__Number__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:322:1: ( rule__Number__Group_3__1__Impl )
            // InternalDomainmodel.g:323:2: rule__Number__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group_3__1__Impl();

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
    // $ANTLR end "rule__Number__Group_3__1"


    // $ANTLR start "rule__Number__Group_3__1__Impl"
    // InternalDomainmodel.g:329:1: rule__Number__Group_3__1__Impl : ( ( rule__Number__After_pointAssignment_3_1 ) ) ;
    public final void rule__Number__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:333:1: ( ( ( rule__Number__After_pointAssignment_3_1 ) ) )
            // InternalDomainmodel.g:334:1: ( ( rule__Number__After_pointAssignment_3_1 ) )
            {
            // InternalDomainmodel.g:334:1: ( ( rule__Number__After_pointAssignment_3_1 ) )
            // InternalDomainmodel.g:335:2: ( rule__Number__After_pointAssignment_3_1 )
            {
             before(grammarAccess.getNumberAccess().getAfter_pointAssignment_3_1()); 
            // InternalDomainmodel.g:336:2: ( rule__Number__After_pointAssignment_3_1 )
            // InternalDomainmodel.g:336:3: rule__Number__After_pointAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Number__After_pointAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAfter_pointAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_3__1__Impl"


    // $ANTLR start "rule__Number__Group_4__0"
    // InternalDomainmodel.g:345:1: rule__Number__Group_4__0 : rule__Number__Group_4__0__Impl rule__Number__Group_4__1 ;
    public final void rule__Number__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:349:1: ( rule__Number__Group_4__0__Impl rule__Number__Group_4__1 )
            // InternalDomainmodel.g:350:2: rule__Number__Group_4__0__Impl rule__Number__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Number__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group_4__1();

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
    // $ANTLR end "rule__Number__Group_4__0"


    // $ANTLR start "rule__Number__Group_4__0__Impl"
    // InternalDomainmodel.g:357:1: rule__Number__Group_4__0__Impl : ( RULE_EXPONENT ) ;
    public final void rule__Number__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:361:1: ( ( RULE_EXPONENT ) )
            // InternalDomainmodel.g:362:1: ( RULE_EXPONENT )
            {
            // InternalDomainmodel.g:362:1: ( RULE_EXPONENT )
            // InternalDomainmodel.g:363:2: RULE_EXPONENT
            {
             before(grammarAccess.getNumberAccess().getEXPONENTTerminalRuleCall_4_0()); 
            match(input,RULE_EXPONENT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getEXPONENTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_4__0__Impl"


    // $ANTLR start "rule__Number__Group_4__1"
    // InternalDomainmodel.g:372:1: rule__Number__Group_4__1 : rule__Number__Group_4__1__Impl rule__Number__Group_4__2 ;
    public final void rule__Number__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:376:1: ( rule__Number__Group_4__1__Impl rule__Number__Group_4__2 )
            // InternalDomainmodel.g:377:2: rule__Number__Group_4__1__Impl rule__Number__Group_4__2
            {
            pushFollow(FOLLOW_5);
            rule__Number__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group_4__2();

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
    // $ANTLR end "rule__Number__Group_4__1"


    // $ANTLR start "rule__Number__Group_4__1__Impl"
    // InternalDomainmodel.g:384:1: rule__Number__Group_4__1__Impl : ( ( RULE_SIGN )? ) ;
    public final void rule__Number__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:388:1: ( ( ( RULE_SIGN )? ) )
            // InternalDomainmodel.g:389:1: ( ( RULE_SIGN )? )
            {
            // InternalDomainmodel.g:389:1: ( ( RULE_SIGN )? )
            // InternalDomainmodel.g:390:2: ( RULE_SIGN )?
            {
             before(grammarAccess.getNumberAccess().getSIGNTerminalRuleCall_4_1()); 
            // InternalDomainmodel.g:391:2: ( RULE_SIGN )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_SIGN) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomainmodel.g:391:3: RULE_SIGN
                    {
                    match(input,RULE_SIGN,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getSIGNTerminalRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_4__1__Impl"


    // $ANTLR start "rule__Number__Group_4__2"
    // InternalDomainmodel.g:399:1: rule__Number__Group_4__2 : rule__Number__Group_4__2__Impl ;
    public final void rule__Number__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:403:1: ( rule__Number__Group_4__2__Impl )
            // InternalDomainmodel.g:404:2: rule__Number__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group_4__2__Impl();

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
    // $ANTLR end "rule__Number__Group_4__2"


    // $ANTLR start "rule__Number__Group_4__2__Impl"
    // InternalDomainmodel.g:410:1: rule__Number__Group_4__2__Impl : ( ( rule__Number__ExponentAssignment_4_2 ) ) ;
    public final void rule__Number__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:414:1: ( ( ( rule__Number__ExponentAssignment_4_2 ) ) )
            // InternalDomainmodel.g:415:1: ( ( rule__Number__ExponentAssignment_4_2 ) )
            {
            // InternalDomainmodel.g:415:1: ( ( rule__Number__ExponentAssignment_4_2 ) )
            // InternalDomainmodel.g:416:2: ( rule__Number__ExponentAssignment_4_2 )
            {
             before(grammarAccess.getNumberAccess().getExponentAssignment_4_2()); 
            // InternalDomainmodel.g:417:2: ( rule__Number__ExponentAssignment_4_2 )
            // InternalDomainmodel.g:417:3: rule__Number__ExponentAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Number__ExponentAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getExponentAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_4__2__Impl"


    // $ANTLR start "rule__Domainmodel__NumbersAssignment_0"
    // InternalDomainmodel.g:426:1: rule__Domainmodel__NumbersAssignment_0 : ( ruleNumber ) ;
    public final void rule__Domainmodel__NumbersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:430:1: ( ( ruleNumber ) )
            // InternalDomainmodel.g:431:2: ( ruleNumber )
            {
            // InternalDomainmodel.g:431:2: ( ruleNumber )
            // InternalDomainmodel.g:432:3: ruleNumber
            {
             before(grammarAccess.getDomainmodelAccess().getNumbersNumberParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getNumbersNumberParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__NumbersAssignment_0"


    // $ANTLR start "rule__Number__SignAssignment_1"
    // InternalDomainmodel.g:441:1: rule__Number__SignAssignment_1 : ( RULE_SIGN ) ;
    public final void rule__Number__SignAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:445:1: ( ( RULE_SIGN ) )
            // InternalDomainmodel.g:446:2: ( RULE_SIGN )
            {
            // InternalDomainmodel.g:446:2: ( RULE_SIGN )
            // InternalDomainmodel.g:447:3: RULE_SIGN
            {
             before(grammarAccess.getNumberAccess().getSignSIGNTerminalRuleCall_1_0()); 
            match(input,RULE_SIGN,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getSignSIGNTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__SignAssignment_1"


    // $ANTLR start "rule__Number__Before_pointAssignment_2"
    // InternalDomainmodel.g:456:1: rule__Number__Before_pointAssignment_2 : ( RULE_INTEGER ) ;
    public final void rule__Number__Before_pointAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:460:1: ( ( RULE_INTEGER ) )
            // InternalDomainmodel.g:461:2: ( RULE_INTEGER )
            {
            // InternalDomainmodel.g:461:2: ( RULE_INTEGER )
            // InternalDomainmodel.g:462:3: RULE_INTEGER
            {
             before(grammarAccess.getNumberAccess().getBefore_pointINTEGERTerminalRuleCall_2_0()); 
            match(input,RULE_INTEGER,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getBefore_pointINTEGERTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Before_pointAssignment_2"


    // $ANTLR start "rule__Number__After_pointAssignment_3_1"
    // InternalDomainmodel.g:471:1: rule__Number__After_pointAssignment_3_1 : ( RULE_INTEGER ) ;
    public final void rule__Number__After_pointAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:475:1: ( ( RULE_INTEGER ) )
            // InternalDomainmodel.g:476:2: ( RULE_INTEGER )
            {
            // InternalDomainmodel.g:476:2: ( RULE_INTEGER )
            // InternalDomainmodel.g:477:3: RULE_INTEGER
            {
             before(grammarAccess.getNumberAccess().getAfter_pointINTEGERTerminalRuleCall_3_1_0()); 
            match(input,RULE_INTEGER,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getAfter_pointINTEGERTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__After_pointAssignment_3_1"


    // $ANTLR start "rule__Number__ExponentAssignment_4_2"
    // InternalDomainmodel.g:486:1: rule__Number__ExponentAssignment_4_2 : ( RULE_INTEGER ) ;
    public final void rule__Number__ExponentAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:490:1: ( ( RULE_INTEGER ) )
            // InternalDomainmodel.g:491:2: ( RULE_INTEGER )
            {
            // InternalDomainmodel.g:491:2: ( RULE_INTEGER )
            // InternalDomainmodel.g:492:3: RULE_INTEGER
            {
             before(grammarAccess.getNumberAccess().getExponentINTEGERTerminalRuleCall_4_2_0()); 
            match(input,RULE_INTEGER,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getExponentINTEGERTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__ExponentAssignment_4_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});

}