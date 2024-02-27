package org.xtext.example.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCNLLexer extends Lexer {
    public static final int RULE_WORD=4;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalCNLLexer() {;} 
    public InternalCNLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCNLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCNL.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:11:7: ( ',' )
            // InternalCNL.g:11:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:12:7: ( 'Always' )
            // InternalCNL.g:12:9: 'Always'
            {
            match("Always"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:13:7: ( 'After' )
            // InternalCNL.g:13:9: 'After'
            {
            match("After"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:14:7: ( '{' )
            // InternalCNL.g:14:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:15:7: ( '}' )
            // InternalCNL.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:16:7: ( 'should' )
            // InternalCNL.g:16:9: 'should'
            {
            match("should"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:17:7: ( 'remain' )
            // InternalCNL.g:17:9: 'remain'
            {
            match("remain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:18:7: ( 'valid' )
            // InternalCNL.g:18:9: 'valid'
            {
            match("valid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:19:7: ( 'until' )
            // InternalCNL.g:19:9: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:20:7: ( 'always' )
            // InternalCNL.g:20:9: 'always'
            {
            match("always"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:21:7: ( 'either' )
            // InternalCNL.g:21:9: 'either'
            {
            match("either"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:22:7: ( 'or' )
            // InternalCNL.g:22:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:23:7: ( 'reaction' )
            // InternalCNL.g:23:9: 'reaction'
            {
            match("reaction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:24:7: ( 'is' )
            // InternalCNL.g:24:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:25:7: ( 'Reaction' )
            // InternalCNL.g:25:9: 'Reaction'
            {
            match("Reaction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:26:7: ( 'which' )
            // InternalCNL.g:26:9: 'which'
            {
            match("which"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:27:7: ( 'must' )
            // InternalCNL.g:27:9: 'must'
            {
            match("must"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:28:7: ( 'occur' )
            // InternalCNL.g:28:9: 'occur'
            {
            match("occur"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:29:7: ( 'within' )
            // InternalCNL.g:29:9: 'within'
            {
            match("within"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:30:7: ( 'from' )
            // InternalCNL.g:30:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:31:7: ( 'immediately' )
            // InternalCNL.g:31:9: 'immediately'
            {
            match("immediately"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:32:7: ( 'after' )
            // InternalCNL.g:32:9: 'after'
            {
            match("after"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:3593:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCNL.g:3593:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCNL.g:3593:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCNL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:3595:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCNL.g:3595:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCNL.g:3595:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCNL.g:3595:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalCNL.g:3595:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCNL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:3597:10: ( ( '0' .. '9' )+ )
            // InternalCNL.g:3597:12: ( '0' .. '9' )+
            {
            // InternalCNL.g:3597:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCNL.g:3597:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:3599:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCNL.g:3599:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCNL.g:3599:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCNL.g:3599:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCNL.g:3599:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCNL.g:3599:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCNL.g:3599:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCNL.g:3599:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCNL.g:3599:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalCNL.g:3599:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCNL.g:3599:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:3601:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCNL.g:3601:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCNL.g:3601:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCNL.g:3601:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:3603:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCNL.g:3603:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCNL.g:3603:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCNL.g:3603:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalCNL.g:3603:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCNL.g:3603:41: ( '\\r' )? '\\n'
                    {
                    // InternalCNL.g:3603:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalCNL.g:3603:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:3605:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCNL.g:3605:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCNL.g:3605:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCNL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:3607:16: ( . )
            // InternalCNL.g:3607:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalCNL.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_WORD | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=30;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalCNL.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalCNL.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalCNL.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalCNL.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalCNL.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalCNL.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalCNL.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalCNL.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalCNL.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalCNL.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalCNL.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalCNL.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalCNL.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalCNL.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalCNL.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalCNL.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalCNL.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalCNL.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalCNL.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalCNL.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalCNL.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalCNL.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalCNL.g:1:142: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 24 :
                // InternalCNL.g:1:152: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // InternalCNL.g:1:160: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // InternalCNL.g:1:169: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 27 :
                // InternalCNL.g:1:181: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // InternalCNL.g:1:197: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // InternalCNL.g:1:213: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // InternalCNL.g:1:221: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\22\1\uffff\1\22\2\uffff\15\22\1\uffff\1\31\1\22\3\31\3\uffff\3\22\2\uffff\7\22\1\100\1\22\1\102\6\22\1\uffff\1\22\4\uffff\12\22\1\uffff\1\22\1\uffff\25\22\1\151\1\152\1\22\1\154\3\22\1\160\1\161\1\22\1\163\1\22\1\165\2\22\1\170\1\22\2\uffff\1\172\1\uffff\1\173\1\174\1\22\2\uffff\1\176\1\uffff\1\177\1\uffff\2\22\1\uffff\1\u0082\3\uffff\1\22\2\uffff\2\22\1\uffff\1\u0086\1\22\1\u0088\1\uffff\1\22\1\uffff\1\22\1\u008b\1\uffff";
    static final String DFA13_eofS =
        "\u008c\uffff";
    static final String DFA13_minS =
        "\1\0\1\uffff\1\60\2\uffff\15\60\1\uffff\1\101\1\60\2\0\1\52\3\uffff\3\60\2\uffff\20\60\1\uffff\1\60\4\uffff\12\60\1\uffff\1\60\1\uffff\46\60\2\uffff\1\60\1\uffff\3\60\2\uffff\1\60\1\uffff\1\60\1\uffff\2\60\1\uffff\1\60\3\uffff\1\60\2\uffff\2\60\1\uffff\3\60\1\uffff\1\60\1\uffff\2\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\uffff\1\172\2\uffff\15\172\1\uffff\1\172\1\71\2\uffff\1\57\3\uffff\3\172\2\uffff\20\172\1\uffff\1\71\4\uffff\12\172\1\uffff\1\172\1\uffff\46\172\2\uffff\1\172\1\uffff\3\172\2\uffff\1\172\1\uffff\1\172\1\uffff\2\172\1\uffff\1\172\3\uffff\1\172\2\uffff\2\172\1\uffff\3\172\1\uffff\1\172\1\uffff\2\172\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\15\uffff\1\27\5\uffff\1\35\1\36\1\1\3\uffff\1\4\1\5\20\uffff\1\30\1\uffff\1\32\1\33\1\34\1\35\12\uffff\1\14\1\uffff\1\16\46\uffff\1\21\1\24\1\uffff\1\3\3\uffff\1\10\1\11\1\uffff\1\26\1\uffff\1\22\2\uffff\1\20\1\uffff\1\2\1\6\1\7\1\uffff\1\12\1\13\2\uffff\1\23\3\uffff\1\15\1\uffff\1\17\2\uffff\1\25";
    static final String DFA13_specialS =
        "\1\1\24\uffff\1\0\1\2\165\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\31\2\30\2\31\1\30\22\31\1\30\1\31\1\25\4\31\1\26\4\31\1\1\2\31\1\27\12\24\7\31\1\2\20\21\1\15\10\21\3\31\1\23\1\21\1\31\1\11\3\21\1\12\1\20\2\21\1\14\3\21\1\17\1\21\1\13\2\21\1\6\1\5\1\21\1\10\1\7\1\16\3\21\1\3\1\31\1\4\uff82\31",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\5\35\1\34\5\35\1\33\16\35",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\7\35\1\40\22\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\4\35\1\41\25\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\1\42\31\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\15\35\1\43\14\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\5\35\1\45\5\35\1\44\16\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\10\35\1\46\21\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\2\35\1\50\16\35\1\47\10\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\14\35\1\52\5\35\1\51\7\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\4\35\1\53\25\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\7\35\1\54\1\55\21\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\24\35\1\56\5\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\21\35\1\57\10\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\61",
            "\0\62",
            "\0\62",
            "\1\63\4\uffff\1\64",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\26\35\1\66\3\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\23\35\1\67\6\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\16\35\1\70\13\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\1\72\13\35\1\71\15\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\13\35\1\73\16\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\23\35\1\74\6\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\26\35\1\75\3\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\23\35\1\76\6\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\23\35\1\77\6\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\2\35\1\101\27\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\14\35\1\103\15\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\1\104\31\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\10\35\1\105\21\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\23\35\1\106\6\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\22\35\1\107\7\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\16\35\1\110\13\35",
            "",
            "\12\61",
            "",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\1\111\31\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\4\35\1\112\25\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\24\35\1\113\5\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\1\114\31\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\2\35\1\115\27\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\10\35\1\116\21\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\10\35\1\117\21\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\1\120\31\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\4\35\1\121\25\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\7\35\1\122\22\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\24\35\1\123\5\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\4\35\1\124\25\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\2\35\1\125\27\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\2\35\1\126\27\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\7\35\1\127\22\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\23\35\1\130\6\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\14\35\1\131\15\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\30\35\1\132\1\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\21\35\1\133\10\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\13\35\1\134\16\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\10\35\1\135\21\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\23\35\1\136\6\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\3\35\1\137\26\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\13\35\1\140\16\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\30\35\1\141\1\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\21\35\1\142\10\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\4\35\1\143\25\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\21\35\1\144\10\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\3\35\1\145\26\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\23\35\1\146\6\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\7\35\1\147\22\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\10\35\1\150\21\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\22\35\1\153\7\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\3\35\1\155\26\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\15\35\1\156\14\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\10\35\1\157\21\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\22\35\1\162\7\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\21\35\1\164\10\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\10\35\1\166\21\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\10\35\1\167\21\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\15\35\1\171\14\35",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\16\35\1\175\13\35",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\1\u0080\31\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\16\35\1\u0081\13\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\15\35\1\u0083\14\35",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\23\35\1\u0084\6\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\15\35\1\u0085\14\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\4\35\1\u0087\25\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\13\35\1\u0089\16\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\30\35\1\u008a\1\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_WORD | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_21 = input.LA(1);

                        s = -1;
                        if ( ((LA13_21>='\u0000' && LA13_21<='\uFFFF')) ) {s = 50;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0==',') ) {s = 1;}

                        else if ( (LA13_0=='A') ) {s = 2;}

                        else if ( (LA13_0=='{') ) {s = 3;}

                        else if ( (LA13_0=='}') ) {s = 4;}

                        else if ( (LA13_0=='s') ) {s = 5;}

                        else if ( (LA13_0=='r') ) {s = 6;}

                        else if ( (LA13_0=='v') ) {s = 7;}

                        else if ( (LA13_0=='u') ) {s = 8;}

                        else if ( (LA13_0=='a') ) {s = 9;}

                        else if ( (LA13_0=='e') ) {s = 10;}

                        else if ( (LA13_0=='o') ) {s = 11;}

                        else if ( (LA13_0=='i') ) {s = 12;}

                        else if ( (LA13_0=='R') ) {s = 13;}

                        else if ( (LA13_0=='w') ) {s = 14;}

                        else if ( (LA13_0=='m') ) {s = 15;}

                        else if ( (LA13_0=='f') ) {s = 16;}

                        else if ( ((LA13_0>='B' && LA13_0<='Q')||(LA13_0>='S' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='b' && LA13_0<='d')||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='l')||LA13_0=='n'||(LA13_0>='p' && LA13_0<='q')||LA13_0=='t'||(LA13_0>='x' && LA13_0<='z')) ) {s = 17;}

                        else if ( (LA13_0=='^') ) {s = 19;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 20;}

                        else if ( (LA13_0=='\"') ) {s = 21;}

                        else if ( (LA13_0=='\'') ) {s = 22;}

                        else if ( (LA13_0=='/') ) {s = 23;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 24;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='+')||(LA13_0>='-' && LA13_0<='.')||(LA13_0>=':' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 25;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_22 = input.LA(1);

                        s = -1;
                        if ( ((LA13_22>='\u0000' && LA13_22<='\uFFFF')) ) {s = 50;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}