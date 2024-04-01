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
    public static final int T__50=50;
    public static final int RULE_BIT=13;
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
    public static final int RULE_DIRECT_SIZE_PREFIX=8;
    public static final int RULE_ID=4;
    public static final int RULE_BOOLEAN_LITERAL=15;
    public static final int RULE_DIGIT=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=20;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=16;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_DIRECT_TYPE_PREFIX=7;
    public static final int RULE_DIRECT_VARIABLE=10;
    public static final int RULE_OR_OPERATOR=6;
    public static final int RULE_STRING=18;
    public static final int RULE_SL_COMMENT=17;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_OCTAL_DIGIT=9;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=19;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_LETTER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_HEX_DIGIT=14;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_INTEGER=5;
    public static final int T__42=42;
    public static final int T__43=43;

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

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:12:7: ( '=>' )
            // InternalCNL.g:12:9: '=>'
            {
            match("=>"); 


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
            // InternalCNL.g:13:7: ( 'Always' )
            // InternalCNL.g:13:9: 'Always'
            {
            match("Always"); 


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
            // InternalCNL.g:14:7: ( 'BOOL' )
            // InternalCNL.g:14:9: 'BOOL'
            {
            match("BOOL"); 


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
            // InternalCNL.g:15:7: ( 'INT' )
            // InternalCNL.g:15:9: 'INT'
            {
            match("INT"); 


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
            // InternalCNL.g:16:7: ( '==' )
            // InternalCNL.g:16:9: '=='
            {
            match("=="); 


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
            // InternalCNL.g:17:7: ( '<>' )
            // InternalCNL.g:17:9: '<>'
            {
            match("<>"); 


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
            // InternalCNL.g:18:7: ( '<' )
            // InternalCNL.g:18:9: '<'
            {
            match('<'); 

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
            // InternalCNL.g:19:7: ( '>' )
            // InternalCNL.g:19:9: '>'
            {
            match('>'); 

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
            // InternalCNL.g:20:7: ( '<=' )
            // InternalCNL.g:20:9: '<='
            {
            match("<="); 


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
            // InternalCNL.g:21:7: ( '>=' )
            // InternalCNL.g:21:9: '>='
            {
            match(">="); 


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
            // InternalCNL.g:22:7: ( '&&' )
            // InternalCNL.g:22:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:23:7: ( 'AND' )
            // InternalCNL.g:23:9: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:24:7: ( 'NOT' )
            // InternalCNL.g:24:9: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:25:7: ( '!' )
            // InternalCNL.g:25:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:26:7: ( 'REQUIREMENT' )
            // InternalCNL.g:26:9: 'REQUIREMENT'
            {
            match("REQUIREMENT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:27:7: ( 'END_REQUIREMENT' )
            // InternalCNL.g:27:9: 'END_REQUIREMENT'
            {
            match("END_REQUIREMENT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:28:7: ( '.' )
            // InternalCNL.g:28:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:29:7: ( 'After' )
            // InternalCNL.g:29:9: 'After'
            {
            match("After"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:30:7: ( 'should' )
            // InternalCNL.g:30:9: 'should'
            {
            match("should"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:31:7: ( 'remain' )
            // InternalCNL.g:31:9: 'remain'
            {
            match("remain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:32:7: ( 'valid' )
            // InternalCNL.g:32:9: 'valid'
            {
            match("valid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:33:7: ( 'until' )
            // InternalCNL.g:33:9: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:34:7: ( 'always' )
            // InternalCNL.g:34:9: 'always'
            {
            match("always"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:35:7: ( 'either' )
            // InternalCNL.g:35:9: 'either'
            {
            match("either"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:36:7: ( 'or' )
            // InternalCNL.g:36:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:37:7: ( 'reaction' )
            // InternalCNL.g:37:9: 'reaction'
            {
            match("reaction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:38:7: ( 'is' )
            // InternalCNL.g:38:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:39:7: ( 'Reaction' )
            // InternalCNL.g:39:9: 'Reaction'
            {
            match("Reaction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:40:7: ( 'which' )
            // InternalCNL.g:40:9: 'which'
            {
            match("which"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:41:7: ( 'must' )
            // InternalCNL.g:41:9: 'must'
            {
            match("must"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:42:7: ( 'occur' )
            // InternalCNL.g:42:9: 'occur'
            {
            match("occur"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:43:7: ( 'within' )
            // InternalCNL.g:43:9: 'within'
            {
            match("within"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:44:7: ( 'from' )
            // InternalCNL.g:44:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:45:7: ( 'immediately' )
            // InternalCNL.g:45:9: 'immediately'
            {
            match("immediately"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:46:7: ( 'after' )
            // InternalCNL.g:46:9: 'after'
            {
            match("after"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:47:7: ( '\"' )
            // InternalCNL.g:47:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:48:7: ( 'VAR_INPUT' )
            // InternalCNL.g:48:9: 'VAR_INPUT'
            {
            match("VAR_INPUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:49:7: ( 'END_VAR' )
            // InternalCNL.g:49:9: 'END_VAR'
            {
            match("END_VAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:50:7: ( ';' )
            // InternalCNL.g:50:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:51:7: ( 'VAR_OUTPUT' )
            // InternalCNL.g:51:9: 'VAR_OUTPUT'
            {
            match("VAR_OUTPUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:52:7: ( ':' )
            // InternalCNL.g:52:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:53:7: ( 'SENTENCE' )
            // InternalCNL.g:53:9: 'SENTENCE'
            {
            match("SENTENCE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:54:7: ( '=' )
            // InternalCNL.g:54:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:55:7: ( 'END_SENTENCE' )
            // InternalCNL.g:55:9: 'END_SENTENCE'
            {
            match("END_SENTENCE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:56:7: ( ')' )
            // InternalCNL.g:56:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:57:7: ( '(' )
            // InternalCNL.g:57:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "RULE_OR_OPERATOR"
    public final void mRULE_OR_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_OR_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:4581:18: ( ( '||' | 'OR' ) )
            // InternalCNL.g:4581:20: ( '||' | 'OR' )
            {
            // InternalCNL.g:4581:20: ( '||' | 'OR' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='|') ) {
                alt1=1;
            }
            else if ( (LA1_0=='O') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCNL.g:4581:21: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // InternalCNL.g:4581:26: 'OR'
                    {
                    match("OR"); 


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
    // $ANTLR end "RULE_OR_OPERATOR"

    // $ANTLR start "RULE_DIRECT_VARIABLE"
    public final void mRULE_DIRECT_VARIABLE() throws RecognitionException {
        try {
            int _type = RULE_DIRECT_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:4583:22: ( '%' RULE_DIRECT_TYPE_PREFIX RULE_DIRECT_SIZE_PREFIX RULE_OCTAL_DIGIT ( '.' RULE_OCTAL_DIGIT )* )
            // InternalCNL.g:4583:24: '%' RULE_DIRECT_TYPE_PREFIX RULE_DIRECT_SIZE_PREFIX RULE_OCTAL_DIGIT ( '.' RULE_OCTAL_DIGIT )*
            {
            match('%'); 
            mRULE_DIRECT_TYPE_PREFIX(); 
            mRULE_DIRECT_SIZE_PREFIX(); 
            mRULE_OCTAL_DIGIT(); 
            // InternalCNL.g:4583:93: ( '.' RULE_OCTAL_DIGIT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='.') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCNL.g:4583:94: '.' RULE_OCTAL_DIGIT
            	    {
            	    match('.'); 
            	    mRULE_OCTAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIRECT_VARIABLE"

    // $ANTLR start "RULE_DIRECT_TYPE_PREFIX"
    public final void mRULE_DIRECT_TYPE_PREFIX() throws RecognitionException {
        try {
            // InternalCNL.g:4585:34: ( ( 'I' | 'Q' | 'M' ) )
            // InternalCNL.g:4585:36: ( 'I' | 'Q' | 'M' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='M'||input.LA(1)=='Q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIRECT_TYPE_PREFIX"

    // $ANTLR start "RULE_DIRECT_SIZE_PREFIX"
    public final void mRULE_DIRECT_SIZE_PREFIX() throws RecognitionException {
        try {
            // InternalCNL.g:4587:34: ( ( 'X' | 'B' | 'W' | 'D' | 'L' ) )
            // InternalCNL.g:4587:36: ( 'X' | 'B' | 'W' | 'D' | 'L' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='D'||input.LA(1)=='L'||(input.LA(1)>='W' && input.LA(1)<='X') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIRECT_SIZE_PREFIX"

    // $ANTLR start "RULE_INTEGER"
    public final void mRULE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:4589:14: ( ( RULE_DIGIT )+ )
            // InternalCNL.g:4589:16: ( RULE_DIGIT )+
            {
            // InternalCNL.g:4589:16: ( RULE_DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCNL.g:4589:16: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // InternalCNL.g:4591:22: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) )
            // InternalCNL.g:4591:24: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_BIT"
    public final void mRULE_BIT() throws RecognitionException {
        try {
            // InternalCNL.g:4593:19: ( ( '0' | '1' ) )
            // InternalCNL.g:4593:21: ( '0' | '1' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIT"

    // $ANTLR start "RULE_OCTAL_DIGIT"
    public final void mRULE_OCTAL_DIGIT() throws RecognitionException {
        try {
            // InternalCNL.g:4595:27: ( '0' .. '7' )
            // InternalCNL.g:4595:29: '0' .. '7'
            {
            matchRange('0','7'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_DIGIT"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalCNL.g:4597:21: ( '0' .. '9' )
            // InternalCNL.g:4597:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            // InternalCNL.g:4599:25: ( ( RULE_DIGIT | 'A' .. 'F' ) )
            // InternalCNL.g:4599:27: ( RULE_DIGIT | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_BOOLEAN_LITERAL"
    public final void mRULE_BOOLEAN_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:4601:22: ( ( 'TRUE' | 'FALSE' ) )
            // InternalCNL.g:4601:24: ( 'TRUE' | 'FALSE' )
            {
            // InternalCNL.g:4601:24: ( 'TRUE' | 'FALSE' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='T') ) {
                alt4=1;
            }
            else if ( (LA4_0=='F') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCNL.g:4601:25: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;
                case 2 :
                    // InternalCNL.g:4601:32: 'FALSE'
                    {
                    match("FALSE"); 


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
    // $ANTLR end "RULE_BOOLEAN_LITERAL"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:4603:17: ( ( '/*' ( options {greedy=false; } : . )* '*/' | '(*' ( options {greedy=false; } : . )* '*)' ) )
            // InternalCNL.g:4603:19: ( '/*' ( options {greedy=false; } : . )* '*/' | '(*' ( options {greedy=false; } : . )* '*)' )
            {
            // InternalCNL.g:4603:19: ( '/*' ( options {greedy=false; } : . )* '*/' | '(*' ( options {greedy=false; } : . )* '*)' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='/') ) {
                alt7=1;
            }
            else if ( (LA7_0=='(') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCNL.g:4603:20: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // InternalCNL.g:4603:25: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCNL.g:4603:53: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match("*/"); 


                    }
                    break;
                case 2 :
                    // InternalCNL.g:4603:62: '(*' ( options {greedy=false; } : . )* '*)'
                    {
                    match("(*"); 

                    // InternalCNL.g:4603:67: ( options {greedy=false; } : . )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='*') ) {
                            int LA6_1 = input.LA(2);

                            if ( (LA6_1==')') ) {
                                alt6=2;
                            }
                            else if ( ((LA6_1>='\u0000' && LA6_1<='(')||(LA6_1>='*' && LA6_1<='\uFFFF')) ) {
                                alt6=1;
                            }


                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalCNL.g:4603:95: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match("*)"); 


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
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:4605:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCNL.g:4605:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCNL.g:4605:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCNL.g:4605:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalCNL.g:4605:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCNL.g:4605:41: ( '\\r' )? '\\n'
                    {
                    // InternalCNL.g:4605:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalCNL.g:4605:41: '\\r'
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:4607:13: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalCNL.g:4607:15: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalCNL.g:4607:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\\') ) {
                    alt11=1;
                }
                else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCNL.g:4607:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalCNL.g:4607:66: ~ ( ( '\\\\' | '\\'' ) )
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
            	    break loop11;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:4609:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCNL.g:4609:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCNL.g:4609:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:4611:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCNL.g:4611:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCNL.g:4611:11: ( '^' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='^') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCNL.g:4611:11: '^'
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

            // InternalCNL.g:4611:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                    alt14=1;
                }


                switch (alt14) {
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
            	    break loop14;
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
            // InternalCNL.g:4613:10: ( ( '0' .. '9' )+ )
            // InternalCNL.g:4613:12: ( '0' .. '9' )+
            {
            // InternalCNL.g:4613:12: ( '0' .. '9' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCNL.g:4613:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:4615:16: ( . )
            // InternalCNL.g:4615:18: .
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
        // InternalCNL.g:1:8: ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | RULE_OR_OPERATOR | RULE_DIRECT_VARIABLE | RULE_INTEGER | RULE_BOOLEAN_LITERAL | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_STRING | RULE_WS | RULE_ID | RULE_INT | RULE_ANY_OTHER )
        int alt16=58;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalCNL.g:1:10: T__22
                {
                mT__22(); 

                }
                break;
            case 2 :
                // InternalCNL.g:1:16: T__23
                {
                mT__23(); 

                }
                break;
            case 3 :
                // InternalCNL.g:1:22: T__24
                {
                mT__24(); 

                }
                break;
            case 4 :
                // InternalCNL.g:1:28: T__25
                {
                mT__25(); 

                }
                break;
            case 5 :
                // InternalCNL.g:1:34: T__26
                {
                mT__26(); 

                }
                break;
            case 6 :
                // InternalCNL.g:1:40: T__27
                {
                mT__27(); 

                }
                break;
            case 7 :
                // InternalCNL.g:1:46: T__28
                {
                mT__28(); 

                }
                break;
            case 8 :
                // InternalCNL.g:1:52: T__29
                {
                mT__29(); 

                }
                break;
            case 9 :
                // InternalCNL.g:1:58: T__30
                {
                mT__30(); 

                }
                break;
            case 10 :
                // InternalCNL.g:1:64: T__31
                {
                mT__31(); 

                }
                break;
            case 11 :
                // InternalCNL.g:1:70: T__32
                {
                mT__32(); 

                }
                break;
            case 12 :
                // InternalCNL.g:1:76: T__33
                {
                mT__33(); 

                }
                break;
            case 13 :
                // InternalCNL.g:1:82: T__34
                {
                mT__34(); 

                }
                break;
            case 14 :
                // InternalCNL.g:1:88: T__35
                {
                mT__35(); 

                }
                break;
            case 15 :
                // InternalCNL.g:1:94: T__36
                {
                mT__36(); 

                }
                break;
            case 16 :
                // InternalCNL.g:1:100: T__37
                {
                mT__37(); 

                }
                break;
            case 17 :
                // InternalCNL.g:1:106: T__38
                {
                mT__38(); 

                }
                break;
            case 18 :
                // InternalCNL.g:1:112: T__39
                {
                mT__39(); 

                }
                break;
            case 19 :
                // InternalCNL.g:1:118: T__40
                {
                mT__40(); 

                }
                break;
            case 20 :
                // InternalCNL.g:1:124: T__41
                {
                mT__41(); 

                }
                break;
            case 21 :
                // InternalCNL.g:1:130: T__42
                {
                mT__42(); 

                }
                break;
            case 22 :
                // InternalCNL.g:1:136: T__43
                {
                mT__43(); 

                }
                break;
            case 23 :
                // InternalCNL.g:1:142: T__44
                {
                mT__44(); 

                }
                break;
            case 24 :
                // InternalCNL.g:1:148: T__45
                {
                mT__45(); 

                }
                break;
            case 25 :
                // InternalCNL.g:1:154: T__46
                {
                mT__46(); 

                }
                break;
            case 26 :
                // InternalCNL.g:1:160: T__47
                {
                mT__47(); 

                }
                break;
            case 27 :
                // InternalCNL.g:1:166: T__48
                {
                mT__48(); 

                }
                break;
            case 28 :
                // InternalCNL.g:1:172: T__49
                {
                mT__49(); 

                }
                break;
            case 29 :
                // InternalCNL.g:1:178: T__50
                {
                mT__50(); 

                }
                break;
            case 30 :
                // InternalCNL.g:1:184: T__51
                {
                mT__51(); 

                }
                break;
            case 31 :
                // InternalCNL.g:1:190: T__52
                {
                mT__52(); 

                }
                break;
            case 32 :
                // InternalCNL.g:1:196: T__53
                {
                mT__53(); 

                }
                break;
            case 33 :
                // InternalCNL.g:1:202: T__54
                {
                mT__54(); 

                }
                break;
            case 34 :
                // InternalCNL.g:1:208: T__55
                {
                mT__55(); 

                }
                break;
            case 35 :
                // InternalCNL.g:1:214: T__56
                {
                mT__56(); 

                }
                break;
            case 36 :
                // InternalCNL.g:1:220: T__57
                {
                mT__57(); 

                }
                break;
            case 37 :
                // InternalCNL.g:1:226: T__58
                {
                mT__58(); 

                }
                break;
            case 38 :
                // InternalCNL.g:1:232: T__59
                {
                mT__59(); 

                }
                break;
            case 39 :
                // InternalCNL.g:1:238: T__60
                {
                mT__60(); 

                }
                break;
            case 40 :
                // InternalCNL.g:1:244: T__61
                {
                mT__61(); 

                }
                break;
            case 41 :
                // InternalCNL.g:1:250: T__62
                {
                mT__62(); 

                }
                break;
            case 42 :
                // InternalCNL.g:1:256: T__63
                {
                mT__63(); 

                }
                break;
            case 43 :
                // InternalCNL.g:1:262: T__64
                {
                mT__64(); 

                }
                break;
            case 44 :
                // InternalCNL.g:1:268: T__65
                {
                mT__65(); 

                }
                break;
            case 45 :
                // InternalCNL.g:1:274: T__66
                {
                mT__66(); 

                }
                break;
            case 46 :
                // InternalCNL.g:1:280: T__67
                {
                mT__67(); 

                }
                break;
            case 47 :
                // InternalCNL.g:1:286: T__68
                {
                mT__68(); 

                }
                break;
            case 48 :
                // InternalCNL.g:1:292: RULE_OR_OPERATOR
                {
                mRULE_OR_OPERATOR(); 

                }
                break;
            case 49 :
                // InternalCNL.g:1:309: RULE_DIRECT_VARIABLE
                {
                mRULE_DIRECT_VARIABLE(); 

                }
                break;
            case 50 :
                // InternalCNL.g:1:330: RULE_INTEGER
                {
                mRULE_INTEGER(); 

                }
                break;
            case 51 :
                // InternalCNL.g:1:343: RULE_BOOLEAN_LITERAL
                {
                mRULE_BOOLEAN_LITERAL(); 

                }
                break;
            case 52 :
                // InternalCNL.g:1:364: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 53 :
                // InternalCNL.g:1:380: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 54 :
                // InternalCNL.g:1:396: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 55 :
                // InternalCNL.g:1:408: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 56 :
                // InternalCNL.g:1:416: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 57 :
                // InternalCNL.g:1:424: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 58 :
                // InternalCNL.g:1:433: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\2\uffff\1\57\3\63\1\70\1\72\1\53\1\63\1\uffff\2\63\1\uffff\13\63\1\uffff\1\63\2\uffff\1\63\1\uffff\1\130\1\53\1\63\1\53\1\134\2\63\2\53\1\uffff\1\53\6\uffff\3\63\1\uffff\2\63\6\uffff\1\63\1\uffff\3\63\1\uffff\7\63\1\164\1\63\1\166\5\63\1\uffff\1\63\2\uffff\1\63\4\uffff\1\131\2\uffff\1\134\2\63\3\uffff\1\63\1\u0081\2\63\1\u0084\1\u0085\13\63\1\uffff\1\63\1\uffff\12\63\1\uffff\1\63\1\u009d\2\uffff\17\63\1\u00af\1\u00b0\2\63\1\u00b4\2\63\1\u00b7\1\uffff\10\63\1\u00c0\1\u00c1\1\63\1\u00c3\1\63\1\u00c5\1\63\1\u00c7\1\63\2\uffff\3\63\1\uffff\1\u00b4\1\u00cc\1\uffff\5\63\1\u00d2\1\u00d3\1\63\2\uffff\1\u00d5\1\uffff\1\u00d6\1\uffff\1\63\1\uffff\1\u00d8\3\63\1\uffff\3\63\1\u00df\1\63\2\uffff\1\63\2\uffff\1\63\1\uffff\4\63\1\u00e7\1\63\1\uffff\1\63\1\u00ea\3\63\1\u00ee\1\63\1\uffff\2\63\1\uffff\1\63\1\u00f3\1\63\1\uffff\4\63\1\uffff\1\u00f9\1\u00fa\2\63\1\u00fd\2\uffff\1\63\1\u00ff\1\uffff\1\63\1\uffff\1\63\1\u0102\1\uffff";
    static final String DFA16_eofS =
        "\u0103\uffff";
    static final String DFA16_minS =
        "\1\0\1\uffff\1\75\1\116\1\117\1\116\2\75\1\46\1\117\1\uffff\1\105\1\116\1\uffff\1\150\1\145\1\141\1\156\1\146\1\151\1\143\1\155\1\150\1\165\1\162\1\uffff\1\101\2\uffff\1\105\1\uffff\1\52\1\174\1\122\1\111\1\60\1\122\1\101\1\52\1\0\1\uffff\1\101\6\uffff\1\167\1\104\1\164\1\uffff\1\117\1\124\6\uffff\1\124\1\uffff\1\121\1\141\1\104\1\uffff\1\157\1\141\1\154\1\164\1\167\2\164\1\60\1\143\1\60\1\155\1\151\1\164\1\163\1\157\1\uffff\1\122\2\uffff\1\116\4\uffff\1\60\2\uffff\1\60\1\125\1\114\3\uffff\1\141\1\60\1\145\1\114\2\60\1\125\1\143\1\137\1\165\1\141\1\143\2\151\1\141\1\145\1\150\1\uffff\1\165\1\uffff\1\145\1\143\1\150\1\164\1\155\1\137\1\124\1\105\1\123\1\171\1\uffff\1\162\1\60\2\uffff\1\111\1\164\1\122\1\154\1\151\1\164\1\144\1\154\1\171\1\162\1\145\1\162\1\144\1\150\1\151\2\60\1\111\1\105\1\60\1\105\1\163\1\60\1\uffff\1\122\1\151\1\105\1\101\1\105\1\144\1\156\1\151\2\60\1\163\1\60\1\162\1\60\1\151\1\60\1\156\2\uffff\1\116\1\125\1\116\1\uffff\2\60\1\uffff\1\105\1\157\1\121\1\122\1\116\2\60\1\157\2\uffff\1\60\1\uffff\1\60\1\uffff\1\141\1\uffff\1\60\1\120\1\124\1\103\1\uffff\1\115\1\156\1\125\1\60\1\124\2\uffff\1\156\2\uffff\1\164\1\uffff\1\125\1\120\2\105\1\60\1\111\1\uffff\1\105\1\60\1\145\1\124\1\125\1\60\1\116\1\uffff\1\122\1\116\1\uffff\1\154\1\60\1\124\1\uffff\1\124\1\105\1\103\1\171\1\uffff\2\60\1\115\1\105\1\60\2\uffff\1\105\1\60\1\uffff\1\116\1\uffff\1\124\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\uffff\1\76\1\154\1\117\1\116\1\76\1\75\1\46\1\117\1\uffff\1\145\1\116\1\uffff\1\150\1\145\1\141\1\156\1\154\1\151\1\162\1\163\1\151\1\165\1\162\1\uffff\1\101\2\uffff\1\105\1\uffff\1\52\1\174\1\122\1\121\1\71\1\122\1\101\1\57\1\uffff\1\uffff\1\172\6\uffff\1\167\1\104\1\164\1\uffff\1\117\1\124\6\uffff\1\124\1\uffff\1\121\1\141\1\104\1\uffff\1\157\1\155\1\154\1\164\1\167\2\164\1\172\1\143\1\172\1\155\1\151\1\164\1\163\1\157\1\uffff\1\122\2\uffff\1\116\4\uffff\1\172\2\uffff\1\71\1\125\1\114\3\uffff\1\141\1\172\1\145\1\114\2\172\1\125\1\143\1\137\1\165\1\141\1\143\2\151\1\141\1\145\1\150\1\uffff\1\165\1\uffff\1\145\1\143\1\150\1\164\1\155\1\137\1\124\1\105\1\123\1\171\1\uffff\1\162\1\172\2\uffff\1\111\1\164\1\126\1\154\1\151\1\164\1\144\1\154\1\171\1\162\1\145\1\162\1\144\1\150\1\151\2\172\1\117\1\105\1\172\1\105\1\163\1\172\1\uffff\1\122\1\151\1\105\1\101\1\105\1\144\1\156\1\151\2\172\1\163\1\172\1\162\1\172\1\151\1\172\1\156\2\uffff\1\116\1\125\1\116\1\uffff\2\172\1\uffff\1\105\1\157\1\121\1\122\1\116\2\172\1\157\2\uffff\1\172\1\uffff\1\172\1\uffff\1\141\1\uffff\1\172\1\120\1\124\1\103\1\uffff\1\115\1\156\1\125\1\172\1\124\2\uffff\1\156\2\uffff\1\164\1\uffff\1\125\1\120\2\105\1\172\1\111\1\uffff\1\105\1\172\1\145\1\124\1\125\1\172\1\116\1\uffff\1\122\1\116\1\uffff\1\154\1\172\1\124\1\uffff\1\124\1\105\1\103\1\171\1\uffff\2\172\1\115\1\105\1\172\2\uffff\1\105\1\172\1\uffff\1\116\1\uffff\1\124\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\10\uffff\1\17\2\uffff\1\22\13\uffff\1\45\1\uffff\1\50\1\52\1\uffff\1\56\11\uffff\1\67\1\uffff\1\70\1\72\1\1\1\2\1\6\1\54\3\uffff\1\70\2\uffff\1\7\1\12\1\10\1\13\1\11\1\14\1\uffff\1\17\3\uffff\1\22\17\uffff\1\45\1\uffff\1\50\1\52\1\uffff\1\56\1\64\1\57\1\60\1\uffff\1\61\1\62\3\uffff\1\65\1\66\1\67\21\uffff\1\32\1\uffff\1\34\12\uffff\1\15\2\uffff\1\5\1\16\27\uffff\1\4\21\uffff\1\37\1\42\3\uffff\1\63\2\uffff\1\23\10\uffff\1\26\1\27\1\uffff\1\44\1\uffff\1\40\1\uffff\1\36\4\uffff\1\3\5\uffff\1\24\1\25\1\uffff\1\30\1\31\1\uffff\1\41\6\uffff\1\47\7\uffff\1\35\2\uffff\1\33\3\uffff\1\53\4\uffff\1\46\5\uffff\1\51\1\20\2\uffff\1\43\1\uffff\1\55\2\uffff\1\21";
    static final String DFA16_specialS =
        "\1\0\46\uffff\1\1\u00db\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\53\2\50\2\53\1\50\22\53\1\50\1\12\1\31\2\53\1\42\1\10\1\47\1\37\1\36\2\53\1\1\1\53\1\15\1\46\12\43\1\34\1\33\1\6\1\2\1\7\2\53\1\3\1\4\2\52\1\14\1\45\2\52\1\5\4\52\1\11\1\41\2\52\1\13\1\35\1\44\1\52\1\32\4\52\3\53\1\51\1\52\1\53\1\22\3\52\1\23\1\30\2\52\1\25\3\52\1\27\1\52\1\24\2\52\1\17\1\16\1\52\1\21\1\20\1\26\3\52\1\53\1\40\uff83\53",
            "",
            "\1\56\1\55",
            "\1\61\27\uffff\1\62\5\uffff\1\60",
            "\1\64",
            "\1\65",
            "\1\67\1\66",
            "\1\71",
            "\1\73",
            "\1\74",
            "",
            "\1\76\37\uffff\1\77",
            "\1\100",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\107\5\uffff\1\106",
            "\1\110",
            "\1\112\16\uffff\1\111",
            "\1\114\5\uffff\1\113",
            "\1\115\1\116",
            "\1\117",
            "\1\120",
            "",
            "\1\122",
            "",
            "",
            "\1\125",
            "",
            "\1\127",
            "\1\131",
            "\1\132",
            "\1\133\3\uffff\1\133\3\uffff\1\133",
            "\12\135",
            "\1\136",
            "\1\137",
            "\1\127\4\uffff\1\140",
            "\0\141",
            "",
            "\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "\1\146",
            "\1\147",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\150",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\1\156\13\uffff\1\155",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\165",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "\1\174",
            "",
            "",
            "\1\175",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\135",
            "\1\176",
            "\1\177",
            "",
            "",
            "",
            "\1\u0080",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0082",
            "\1\u0083",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "",
            "\1\u009c",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0\1\u00a2\2\uffff\1\u00a1",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00b1\5\uffff\1\u00b2",
            "\1\u00b3",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00b5",
            "\1\u00b6",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00c2",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00c4",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00c6",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00c8",
            "",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00d4",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00d7",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00e0",
            "",
            "",
            "\1\u00e1",
            "",
            "",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00e8",
            "",
            "\1\u00e9",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "",
            "\1\u00f2",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00f4",
            "",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00fb",
            "\1\u00fc",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u00fe",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0100",
            "",
            "\1\u0101",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | RULE_OR_OPERATOR | RULE_DIRECT_VARIABLE | RULE_INTEGER | RULE_BOOLEAN_LITERAL | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_STRING | RULE_WS | RULE_ID | RULE_INT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0==',') ) {s = 1;}

                        else if ( (LA16_0=='=') ) {s = 2;}

                        else if ( (LA16_0=='A') ) {s = 3;}

                        else if ( (LA16_0=='B') ) {s = 4;}

                        else if ( (LA16_0=='I') ) {s = 5;}

                        else if ( (LA16_0=='<') ) {s = 6;}

                        else if ( (LA16_0=='>') ) {s = 7;}

                        else if ( (LA16_0=='&') ) {s = 8;}

                        else if ( (LA16_0=='N') ) {s = 9;}

                        else if ( (LA16_0=='!') ) {s = 10;}

                        else if ( (LA16_0=='R') ) {s = 11;}

                        else if ( (LA16_0=='E') ) {s = 12;}

                        else if ( (LA16_0=='.') ) {s = 13;}

                        else if ( (LA16_0=='s') ) {s = 14;}

                        else if ( (LA16_0=='r') ) {s = 15;}

                        else if ( (LA16_0=='v') ) {s = 16;}

                        else if ( (LA16_0=='u') ) {s = 17;}

                        else if ( (LA16_0=='a') ) {s = 18;}

                        else if ( (LA16_0=='e') ) {s = 19;}

                        else if ( (LA16_0=='o') ) {s = 20;}

                        else if ( (LA16_0=='i') ) {s = 21;}

                        else if ( (LA16_0=='w') ) {s = 22;}

                        else if ( (LA16_0=='m') ) {s = 23;}

                        else if ( (LA16_0=='f') ) {s = 24;}

                        else if ( (LA16_0=='\"') ) {s = 25;}

                        else if ( (LA16_0=='V') ) {s = 26;}

                        else if ( (LA16_0==';') ) {s = 27;}

                        else if ( (LA16_0==':') ) {s = 28;}

                        else if ( (LA16_0=='S') ) {s = 29;}

                        else if ( (LA16_0==')') ) {s = 30;}

                        else if ( (LA16_0=='(') ) {s = 31;}

                        else if ( (LA16_0=='|') ) {s = 32;}

                        else if ( (LA16_0=='O') ) {s = 33;}

                        else if ( (LA16_0=='%') ) {s = 34;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 35;}

                        else if ( (LA16_0=='T') ) {s = 36;}

                        else if ( (LA16_0=='F') ) {s = 37;}

                        else if ( (LA16_0=='/') ) {s = 38;}

                        else if ( (LA16_0=='\'') ) {s = 39;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 40;}

                        else if ( (LA16_0=='^') ) {s = 41;}

                        else if ( ((LA16_0>='C' && LA16_0<='D')||(LA16_0>='G' && LA16_0<='H')||(LA16_0>='J' && LA16_0<='M')||(LA16_0>='P' && LA16_0<='Q')||LA16_0=='U'||(LA16_0>='W' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='b' && LA16_0<='d')||(LA16_0>='g' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='l')||LA16_0=='n'||(LA16_0>='p' && LA16_0<='q')||LA16_0=='t'||(LA16_0>='x' && LA16_0<='z')) ) {s = 42;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||(LA16_0>='#' && LA16_0<='$')||(LA16_0>='*' && LA16_0<='+')||LA16_0=='-'||(LA16_0>='?' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||LA16_0=='{'||(LA16_0>='}' && LA16_0<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_39 = input.LA(1);

                        s = -1;
                        if ( ((LA16_39>='\u0000' && LA16_39<='\uFFFF')) ) {s = 97;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}