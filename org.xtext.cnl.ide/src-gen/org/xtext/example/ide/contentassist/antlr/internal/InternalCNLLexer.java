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

    public InternalCNLLexer() {;} 
    public InternalCNLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCNLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCNL.g"; }

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:12:7: ( 'XOR' )
            // InternalCNL.g:12:9: 'XOR'
            {
            match("XOR"); 


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
            // InternalCNL.g:13:7: ( '#T' )
            // InternalCNL.g:13:9: '#T'
            {
            match("#T"); 


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
            // InternalCNL.g:14:7: ( 'Always' )
            // InternalCNL.g:14:9: 'Always'
            {
            match("Always"); 


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
            // InternalCNL.g:15:7: ( 'BOOL' )
            // InternalCNL.g:15:9: 'BOOL'
            {
            match("BOOL"); 


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
            // InternalCNL.g:16:7: ( 'INT' )
            // InternalCNL.g:16:9: 'INT'
            {
            match("INT"); 


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
            // InternalCNL.g:17:7: ( '&&' )
            // InternalCNL.g:17:9: '&&'
            {
            match("&&"); 


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
            // InternalCNL.g:18:7: ( 'AND' )
            // InternalCNL.g:18:9: 'AND'
            {
            match("AND"); 


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
            // InternalCNL.g:19:7: ( 'FE' )
            // InternalCNL.g:19:9: 'FE'
            {
            match("FE"); 


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
            // InternalCNL.g:20:7: ( 'RE' )
            // InternalCNL.g:20:9: 'RE'
            {
            match("RE"); 


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
            // InternalCNL.g:21:7: ( 'HIGH' )
            // InternalCNL.g:21:9: 'HIGH'
            {
            match("HIGH"); 


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
            // InternalCNL.g:22:7: ( 'LOW' )
            // InternalCNL.g:22:9: 'LOW'
            {
            match("LOW"); 


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
            // InternalCNL.g:23:7: ( 'NOT' )
            // InternalCNL.g:23:9: 'NOT'
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
            // InternalCNL.g:24:7: ( '!' )
            // InternalCNL.g:24:9: '!'
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
            // InternalCNL.g:25:7: ( '==' )
            // InternalCNL.g:25:9: '=='
            {
            match("=="); 


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
            // InternalCNL.g:26:7: ( '<>' )
            // InternalCNL.g:26:9: '<>'
            {
            match("<>"); 


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
            // InternalCNL.g:27:7: ( '<' )
            // InternalCNL.g:27:9: '<'
            {
            match('<'); 

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
            // InternalCNL.g:28:7: ( '>' )
            // InternalCNL.g:28:9: '>'
            {
            match('>'); 

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
            // InternalCNL.g:29:7: ( '<=' )
            // InternalCNL.g:29:9: '<='
            {
            match("<="); 


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
            // InternalCNL.g:30:7: ( '>=' )
            // InternalCNL.g:30:9: '>='
            {
            match(">="); 


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
            // InternalCNL.g:31:7: ( 'REQUIREMENT' )
            // InternalCNL.g:31:9: 'REQUIREMENT'
            {
            match("REQUIREMENT"); 


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
            // InternalCNL.g:32:7: ( 'END_REQUIREMENT' )
            // InternalCNL.g:32:9: 'END_REQUIREMENT'
            {
            match("END_REQUIREMENT"); 


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
            // InternalCNL.g:33:7: ( '.' )
            // InternalCNL.g:33:9: '.'
            {
            match('.'); 

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
            // InternalCNL.g:34:7: ( 'After' )
            // InternalCNL.g:34:9: 'After'
            {
            match("After"); 


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
            // InternalCNL.g:35:7: ( 'should' )
            // InternalCNL.g:35:9: 'should'
            {
            match("should"); 


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
            // InternalCNL.g:36:7: ( 'remain' )
            // InternalCNL.g:36:9: 'remain'
            {
            match("remain"); 


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
            // InternalCNL.g:37:7: ( 'valid' )
            // InternalCNL.g:37:9: 'valid'
            {
            match("valid"); 


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
            // InternalCNL.g:38:7: ( 'until' )
            // InternalCNL.g:38:9: 'until'
            {
            match("until"); 


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
            // InternalCNL.g:39:7: ( 'always' )
            // InternalCNL.g:39:9: 'always'
            {
            match("always"); 


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
            // InternalCNL.g:40:7: ( 'either' )
            // InternalCNL.g:40:9: 'either'
            {
            match("either"); 


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
            // InternalCNL.g:41:7: ( 'or' )
            // InternalCNL.g:41:9: 'or'
            {
            match("or"); 


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
            // InternalCNL.g:42:7: ( 'Reaction' )
            // InternalCNL.g:42:9: 'Reaction'
            {
            match("Reaction"); 


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
            // InternalCNL.g:43:7: ( 'is' )
            // InternalCNL.g:43:9: 'is'
            {
            match("is"); 


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
            // InternalCNL.g:44:7: ( 'reaction' )
            // InternalCNL.g:44:9: 'reaction'
            {
            match("reaction"); 


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
            // InternalCNL.g:45:7: ( 'which' )
            // InternalCNL.g:45:9: 'which'
            {
            match("which"); 


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
            // InternalCNL.g:46:7: ( 'must' )
            // InternalCNL.g:46:9: 'must'
            {
            match("must"); 


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
            // InternalCNL.g:47:7: ( 'occur' )
            // InternalCNL.g:47:9: 'occur'
            {
            match("occur"); 


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
            // InternalCNL.g:48:7: ( 'from' )
            // InternalCNL.g:48:9: 'from'
            {
            match("from"); 


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
            // InternalCNL.g:49:7: ( 'immediately' )
            // InternalCNL.g:49:9: 'immediately'
            {
            match("immediately"); 


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
            // InternalCNL.g:50:7: ( 'after' )
            // InternalCNL.g:50:9: 'after'
            {
            match("after"); 


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
            // InternalCNL.g:51:7: ( 'within' )
            // InternalCNL.g:51:9: 'within'
            {
            match("within"); 


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
            // InternalCNL.g:52:7: ( '\"' )
            // InternalCNL.g:52:9: '\"'
            {
            match('\"'); 

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
            // InternalCNL.g:53:7: ( 'VAR_INPUT' )
            // InternalCNL.g:53:9: 'VAR_INPUT'
            {
            match("VAR_INPUT"); 


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
            // InternalCNL.g:54:7: ( 'END_VAR' )
            // InternalCNL.g:54:9: 'END_VAR'
            {
            match("END_VAR"); 


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
            // InternalCNL.g:55:7: ( ';' )
            // InternalCNL.g:55:9: ';'
            {
            match(';'); 

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
            // InternalCNL.g:56:7: ( 'VAR_OUTPUT' )
            // InternalCNL.g:56:9: 'VAR_OUTPUT'
            {
            match("VAR_OUTPUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:57:7: ( ':' )
            // InternalCNL.g:57:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:58:7: ( 'SENTENCE' )
            // InternalCNL.g:58:9: 'SENTENCE'
            {
            match("SENTENCE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:59:7: ( 'END_SENTENCE' )
            // InternalCNL.g:59:9: 'END_SENTENCE'
            {
            match("END_SENTENCE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:60:7: ( '=' )
            // InternalCNL.g:60:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:61:7: ( 'TAU' )
            // InternalCNL.g:61:9: 'TAU'
            {
            match("TAU"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:62:7: ( '(' )
            // InternalCNL.g:62:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:63:7: ( ')' )
            // InternalCNL.g:63:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "RULE_OR_OPERATOR"
    public final void mRULE_OR_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_OR_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:6121:18: ( ( '||' | 'OR' ) )
            // InternalCNL.g:6121:20: ( '||' | 'OR' )
            {
            // InternalCNL.g:6121:20: ( '||' | 'OR' )
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
                    // InternalCNL.g:6121:21: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // InternalCNL.g:6121:26: 'OR'
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

    // $ANTLR start "RULE_INTERVAL"
    public final void mRULE_INTERVAL() throws RecognitionException {
        try {
            int _type = RULE_INTERVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:6123:15: ( ( RULE_INTEGER 'd' )? ( RULE_INTEGER 'h' )? ( RULE_INTEGER 'm' )? ( RULE_INTEGER 's' )? ( RULE_INTEGER 'ms' )? )
            // InternalCNL.g:6123:17: ( RULE_INTEGER 'd' )? ( RULE_INTEGER 'h' )? ( RULE_INTEGER 'm' )? ( RULE_INTEGER 's' )? ( RULE_INTEGER 'ms' )?
            {
            // InternalCNL.g:6123:17: ( RULE_INTEGER 'd' )?
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalCNL.g:6123:18: RULE_INTEGER 'd'
                    {
                    mRULE_INTEGER(); 
                    match('d'); 

                    }
                    break;

            }

            // InternalCNL.g:6123:37: ( RULE_INTEGER 'h' )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalCNL.g:6123:38: RULE_INTEGER 'h'
                    {
                    mRULE_INTEGER(); 
                    match('h'); 

                    }
                    break;

            }

            // InternalCNL.g:6123:57: ( RULE_INTEGER 'm' )?
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalCNL.g:6123:58: RULE_INTEGER 'm'
                    {
                    mRULE_INTEGER(); 
                    match('m'); 

                    }
                    break;

            }

            // InternalCNL.g:6123:77: ( RULE_INTEGER 's' )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalCNL.g:6123:78: RULE_INTEGER 's'
                    {
                    mRULE_INTEGER(); 
                    match('s'); 

                    }
                    break;

            }

            // InternalCNL.g:6123:97: ( RULE_INTEGER 'ms' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCNL.g:6123:98: RULE_INTEGER 'ms'
                    {
                    mRULE_INTEGER(); 
                    match("ms"); 


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
    // $ANTLR end "RULE_INTERVAL"

    // $ANTLR start "RULE_DIRECT_VARIABLE"
    public final void mRULE_DIRECT_VARIABLE() throws RecognitionException {
        try {
            int _type = RULE_DIRECT_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:6125:22: ( '%' RULE_DIRECT_TYPE_PREFIX RULE_DIRECT_SIZE_PREFIX RULE_OCTAL_DIGIT ( '.' RULE_OCTAL_DIGIT )* )
            // InternalCNL.g:6125:24: '%' RULE_DIRECT_TYPE_PREFIX RULE_DIRECT_SIZE_PREFIX RULE_OCTAL_DIGIT ( '.' RULE_OCTAL_DIGIT )*
            {
            match('%'); 
            mRULE_DIRECT_TYPE_PREFIX(); 
            mRULE_DIRECT_SIZE_PREFIX(); 
            mRULE_OCTAL_DIGIT(); 
            // InternalCNL.g:6125:93: ( '.' RULE_OCTAL_DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='.') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCNL.g:6125:94: '.' RULE_OCTAL_DIGIT
            	    {
            	    match('.'); 
            	    mRULE_OCTAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // InternalCNL.g:6127:34: ( ( 'I' | 'Q' | 'M' ) )
            // InternalCNL.g:6127:36: ( 'I' | 'Q' | 'M' )
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
            // InternalCNL.g:6129:34: ( ( 'X' | 'B' | 'W' | 'D' | 'L' ) )
            // InternalCNL.g:6129:36: ( 'X' | 'B' | 'W' | 'D' | 'L' )
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
            // InternalCNL.g:6131:14: ( ( RULE_DIGIT )+ )
            // InternalCNL.g:6131:16: ( RULE_DIGIT )+
            {
            // InternalCNL.g:6131:16: ( RULE_DIGIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCNL.g:6131:16: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // InternalCNL.g:6133:22: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) )
            // InternalCNL.g:6133:24: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
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
            // InternalCNL.g:6135:19: ( ( '0' | '1' ) )
            // InternalCNL.g:6135:21: ( '0' | '1' )
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
            // InternalCNL.g:6137:27: ( '0' .. '7' )
            // InternalCNL.g:6137:29: '0' .. '7'
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
            // InternalCNL.g:6139:21: ( '0' .. '9' )
            // InternalCNL.g:6139:23: '0' .. '9'
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
            // InternalCNL.g:6141:25: ( ( RULE_DIGIT | 'A' .. 'F' ) )
            // InternalCNL.g:6141:27: ( RULE_DIGIT | 'A' .. 'F' )
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
            // InternalCNL.g:6143:22: ( ( 'TRUE' | 'FALSE' ) )
            // InternalCNL.g:6143:24: ( 'TRUE' | 'FALSE' )
            {
            // InternalCNL.g:6143:24: ( 'TRUE' | 'FALSE' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='T') ) {
                alt9=1;
            }
            else if ( (LA9_0=='F') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCNL.g:6143:25: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;
                case 2 :
                    // InternalCNL.g:6143:32: 'FALSE'
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
            // InternalCNL.g:6145:17: ( ( '/*' ( options {greedy=false; } : . )* '*/' | '(*' ( options {greedy=false; } : . )* '*)' ) )
            // InternalCNL.g:6145:19: ( '/*' ( options {greedy=false; } : . )* '*/' | '(*' ( options {greedy=false; } : . )* '*)' )
            {
            // InternalCNL.g:6145:19: ( '/*' ( options {greedy=false; } : . )* '*/' | '(*' ( options {greedy=false; } : . )* '*)' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='/') ) {
                alt12=1;
            }
            else if ( (LA12_0=='(') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCNL.g:6145:20: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // InternalCNL.g:6145:25: ( options {greedy=false; } : . )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='*') ) {
                            int LA10_1 = input.LA(2);

                            if ( (LA10_1=='/') ) {
                                alt10=2;
                            }
                            else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                                alt10=1;
                            }


                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalCNL.g:6145:53: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match("*/"); 


                    }
                    break;
                case 2 :
                    // InternalCNL.g:6145:62: '(*' ( options {greedy=false; } : . )* '*)'
                    {
                    match("(*"); 

                    // InternalCNL.g:6145:67: ( options {greedy=false; } : . )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='*') ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==')') ) {
                                alt11=2;
                            }
                            else if ( ((LA11_1>='\u0000' && LA11_1<='(')||(LA11_1>='*' && LA11_1<='\uFFFF')) ) {
                                alt11=1;
                            }


                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalCNL.g:6145:95: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
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
            // InternalCNL.g:6147:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCNL.g:6147:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCNL.g:6147:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCNL.g:6147:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop13;
                }
            } while (true);

            // InternalCNL.g:6147:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCNL.g:6147:41: ( '\\r' )? '\\n'
                    {
                    // InternalCNL.g:6147:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalCNL.g:6147:41: '\\r'
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
            // InternalCNL.g:6149:13: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalCNL.g:6149:15: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalCNL.g:6149:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\\') ) {
                    alt16=1;
                }
                else if ( ((LA16_0>='\u0000' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCNL.g:6149:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
            	    // InternalCNL.g:6149:66: ~ ( ( '\\\\' | '\\'' ) )
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
            	    break loop16;
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
            // InternalCNL.g:6151:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCNL.g:6151:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCNL.g:6151:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // InternalCNL.g:6153:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCNL.g:6153:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCNL.g:6153:11: ( '^' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='^') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCNL.g:6153:11: '^'
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

            // InternalCNL.g:6153:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')) ) {
                    alt19=1;
                }


                switch (alt19) {
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
            	    break loop19;
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
            // InternalCNL.g:6155:10: ( ( '0' .. '9' )+ )
            // InternalCNL.g:6155:12: ( '0' .. '9' )+
            {
            // InternalCNL.g:6155:12: ( '0' .. '9' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='9')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCNL.g:6155:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
            // InternalCNL.g:6157:16: ( . )
            // InternalCNL.g:6157:18: .
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
        // InternalCNL.g:1:8: ( T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | RULE_OR_OPERATOR | RULE_INTERVAL | RULE_DIRECT_VARIABLE | RULE_INTEGER | RULE_BOOLEAN_LITERAL | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_STRING | RULE_WS | RULE_ID | RULE_INT | RULE_ANY_OTHER )
        int alt21=65;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalCNL.g:1:10: T__23
                {
                mT__23(); 

                }
                break;
            case 2 :
                // InternalCNL.g:1:16: T__24
                {
                mT__24(); 

                }
                break;
            case 3 :
                // InternalCNL.g:1:22: T__25
                {
                mT__25(); 

                }
                break;
            case 4 :
                // InternalCNL.g:1:28: T__26
                {
                mT__26(); 

                }
                break;
            case 5 :
                // InternalCNL.g:1:34: T__27
                {
                mT__27(); 

                }
                break;
            case 6 :
                // InternalCNL.g:1:40: T__28
                {
                mT__28(); 

                }
                break;
            case 7 :
                // InternalCNL.g:1:46: T__29
                {
                mT__29(); 

                }
                break;
            case 8 :
                // InternalCNL.g:1:52: T__30
                {
                mT__30(); 

                }
                break;
            case 9 :
                // InternalCNL.g:1:58: T__31
                {
                mT__31(); 

                }
                break;
            case 10 :
                // InternalCNL.g:1:64: T__32
                {
                mT__32(); 

                }
                break;
            case 11 :
                // InternalCNL.g:1:70: T__33
                {
                mT__33(); 

                }
                break;
            case 12 :
                // InternalCNL.g:1:76: T__34
                {
                mT__34(); 

                }
                break;
            case 13 :
                // InternalCNL.g:1:82: T__35
                {
                mT__35(); 

                }
                break;
            case 14 :
                // InternalCNL.g:1:88: T__36
                {
                mT__36(); 

                }
                break;
            case 15 :
                // InternalCNL.g:1:94: T__37
                {
                mT__37(); 

                }
                break;
            case 16 :
                // InternalCNL.g:1:100: T__38
                {
                mT__38(); 

                }
                break;
            case 17 :
                // InternalCNL.g:1:106: T__39
                {
                mT__39(); 

                }
                break;
            case 18 :
                // InternalCNL.g:1:112: T__40
                {
                mT__40(); 

                }
                break;
            case 19 :
                // InternalCNL.g:1:118: T__41
                {
                mT__41(); 

                }
                break;
            case 20 :
                // InternalCNL.g:1:124: T__42
                {
                mT__42(); 

                }
                break;
            case 21 :
                // InternalCNL.g:1:130: T__43
                {
                mT__43(); 

                }
                break;
            case 22 :
                // InternalCNL.g:1:136: T__44
                {
                mT__44(); 

                }
                break;
            case 23 :
                // InternalCNL.g:1:142: T__45
                {
                mT__45(); 

                }
                break;
            case 24 :
                // InternalCNL.g:1:148: T__46
                {
                mT__46(); 

                }
                break;
            case 25 :
                // InternalCNL.g:1:154: T__47
                {
                mT__47(); 

                }
                break;
            case 26 :
                // InternalCNL.g:1:160: T__48
                {
                mT__48(); 

                }
                break;
            case 27 :
                // InternalCNL.g:1:166: T__49
                {
                mT__49(); 

                }
                break;
            case 28 :
                // InternalCNL.g:1:172: T__50
                {
                mT__50(); 

                }
                break;
            case 29 :
                // InternalCNL.g:1:178: T__51
                {
                mT__51(); 

                }
                break;
            case 30 :
                // InternalCNL.g:1:184: T__52
                {
                mT__52(); 

                }
                break;
            case 31 :
                // InternalCNL.g:1:190: T__53
                {
                mT__53(); 

                }
                break;
            case 32 :
                // InternalCNL.g:1:196: T__54
                {
                mT__54(); 

                }
                break;
            case 33 :
                // InternalCNL.g:1:202: T__55
                {
                mT__55(); 

                }
                break;
            case 34 :
                // InternalCNL.g:1:208: T__56
                {
                mT__56(); 

                }
                break;
            case 35 :
                // InternalCNL.g:1:214: T__57
                {
                mT__57(); 

                }
                break;
            case 36 :
                // InternalCNL.g:1:220: T__58
                {
                mT__58(); 

                }
                break;
            case 37 :
                // InternalCNL.g:1:226: T__59
                {
                mT__59(); 

                }
                break;
            case 38 :
                // InternalCNL.g:1:232: T__60
                {
                mT__60(); 

                }
                break;
            case 39 :
                // InternalCNL.g:1:238: T__61
                {
                mT__61(); 

                }
                break;
            case 40 :
                // InternalCNL.g:1:244: T__62
                {
                mT__62(); 

                }
                break;
            case 41 :
                // InternalCNL.g:1:250: T__63
                {
                mT__63(); 

                }
                break;
            case 42 :
                // InternalCNL.g:1:256: T__64
                {
                mT__64(); 

                }
                break;
            case 43 :
                // InternalCNL.g:1:262: T__65
                {
                mT__65(); 

                }
                break;
            case 44 :
                // InternalCNL.g:1:268: T__66
                {
                mT__66(); 

                }
                break;
            case 45 :
                // InternalCNL.g:1:274: T__67
                {
                mT__67(); 

                }
                break;
            case 46 :
                // InternalCNL.g:1:280: T__68
                {
                mT__68(); 

                }
                break;
            case 47 :
                // InternalCNL.g:1:286: T__69
                {
                mT__69(); 

                }
                break;
            case 48 :
                // InternalCNL.g:1:292: T__70
                {
                mT__70(); 

                }
                break;
            case 49 :
                // InternalCNL.g:1:298: T__71
                {
                mT__71(); 

                }
                break;
            case 50 :
                // InternalCNL.g:1:304: T__72
                {
                mT__72(); 

                }
                break;
            case 51 :
                // InternalCNL.g:1:310: T__73
                {
                mT__73(); 

                }
                break;
            case 52 :
                // InternalCNL.g:1:316: T__74
                {
                mT__74(); 

                }
                break;
            case 53 :
                // InternalCNL.g:1:322: T__75
                {
                mT__75(); 

                }
                break;
            case 54 :
                // InternalCNL.g:1:328: RULE_OR_OPERATOR
                {
                mRULE_OR_OPERATOR(); 

                }
                break;
            case 55 :
                // InternalCNL.g:1:345: RULE_INTERVAL
                {
                mRULE_INTERVAL(); 

                }
                break;
            case 56 :
                // InternalCNL.g:1:359: RULE_DIRECT_VARIABLE
                {
                mRULE_DIRECT_VARIABLE(); 

                }
                break;
            case 57 :
                // InternalCNL.g:1:380: RULE_INTEGER
                {
                mRULE_INTEGER(); 

                }
                break;
            case 58 :
                // InternalCNL.g:1:393: RULE_BOOLEAN_LITERAL
                {
                mRULE_BOOLEAN_LITERAL(); 

                }
                break;
            case 59 :
                // InternalCNL.g:1:414: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 60 :
                // InternalCNL.g:1:430: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 61 :
                // InternalCNL.g:1:446: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 62 :
                // InternalCNL.g:1:458: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 63 :
                // InternalCNL.g:1:466: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 64 :
                // InternalCNL.g:1:474: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 65 :
                // InternalCNL.g:1:483: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA2_eotS =
        "\1\2\3\uffff";
    static final String DFA2_eofS =
        "\4\uffff";
    static final String DFA2_minS =
        "\2\60\2\uffff";
    static final String DFA2_maxS =
        "\1\71\1\163\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\12\1",
            "\12\1\52\uffff\1\3\3\uffff\1\2\4\uffff\1\2\5\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "6123:17: ( RULE_INTEGER 'd' )?";
        }
    }
    static final String DFA3_eotS =
        "\1\2\3\uffff";
    static final String DFA3_eofS =
        "\4\uffff";
    static final String DFA3_minS =
        "\2\60\2\uffff";
    static final String DFA3_maxS =
        "\1\71\1\163\2\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA3_specialS =
        "\4\uffff}>";
    static final String[] DFA3_transitionS = {
            "\12\1",
            "\12\1\56\uffff\1\3\4\uffff\1\2\5\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "6123:37: ( RULE_INTEGER 'h' )?";
        }
    }
    static final String DFA4_eotS =
        "\1\2\2\uffff\1\4\1\uffff";
    static final String DFA4_eofS =
        "\5\uffff";
    static final String DFA4_minS =
        "\2\60\1\uffff\1\163\1\uffff";
    static final String DFA4_maxS =
        "\1\71\1\163\1\uffff\1\163\1\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA4_specialS =
        "\5\uffff}>";
    static final String[] DFA4_transitionS = {
            "\12\1",
            "\12\1\63\uffff\1\3\5\uffff\1\2",
            "",
            "\1\2",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "6123:57: ( RULE_INTEGER 'm' )?";
        }
    }
    static final String DFA5_eotS =
        "\1\2\3\uffff";
    static final String DFA5_eofS =
        "\4\uffff";
    static final String DFA5_minS =
        "\2\60\2\uffff";
    static final String DFA5_maxS =
        "\1\71\1\163\2\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\4\uffff}>";
    static final String[] DFA5_transitionS = {
            "\12\1",
            "\12\1\63\uffff\1\2\5\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "6123:77: ( RULE_INTEGER 's' )?";
        }
    }
    static final String DFA21_eotS =
        "\1\51\1\uffff\1\63\1\60\3\63\1\60\5\63\1\uffff\1\104\1\107\1\111\1\63\1\uffff\13\63\1\uffff\1\63\2\uffff\2\63\1\143\1\uffff\1\60\1\63\1\147\1\uffff\3\60\1\uffff\1\60\3\uffff\1\63\2\uffff\5\63\1\uffff\1\163\1\63\1\166\4\63\10\uffff\1\63\1\uffff\7\63\1\u0084\1\63\1\u0086\5\63\1\uffff\1\63\2\uffff\3\63\4\uffff\1\145\1\uffff\1\147\4\uffff\1\u0090\1\63\1\u0092\2\63\1\u0095\1\uffff\2\63\1\uffff\2\63\1\u009a\1\u009b\11\63\1\uffff\1\63\1\uffff\7\63\1\u00ad\1\63\1\uffff\1\63\1\uffff\1\63\1\u00b1\1\uffff\3\63\1\u00b5\2\uffff\15\63\1\u00c5\1\u00c6\2\63\1\uffff\1\u00ca\1\63\1\u00cc\1\uffff\1\u00ca\2\63\1\uffff\6\63\1\u00d5\1\u00d6\1\63\1\u00d8\1\63\1\u00da\1\63\1\u00dc\1\63\2\uffff\3\63\1\uffff\1\u00e1\1\uffff\5\63\1\u00e7\1\u00e8\1\63\2\uffff\1\u00ea\1\uffff\1\u00eb\1\uffff\1\63\1\uffff\1\u00ed\3\63\1\uffff\3\63\1\u00f4\1\63\2\uffff\1\63\2\uffff\1\63\1\uffff\4\63\1\u00fc\1\63\1\uffff\1\63\1\u00ff\3\63\1\u0103\1\63\1\uffff\2\63\1\uffff\1\63\1\u0108\1\63\1\uffff\4\63\1\uffff\1\u010e\1\u010f\2\63\1\u0112\2\uffff\1\63\1\u0114\1\uffff\1\63\1\uffff\1\63\1\u0117\1\uffff";
    static final String DFA21_eofS =
        "\u0118\uffff";
    static final String DFA21_minS =
        "\1\0\1\uffff\1\117\1\124\1\116\1\117\1\116\1\46\1\101\1\105\1\111\2\117\1\uffff\3\75\1\116\1\uffff\1\150\1\145\1\141\1\156\1\146\1\151\1\143\1\155\1\150\1\165\1\162\1\uffff\1\101\2\uffff\1\105\1\101\1\52\1\uffff\1\174\1\122\1\60\1\uffff\1\111\1\52\1\0\1\uffff\1\101\3\uffff\1\122\2\uffff\1\167\1\104\1\164\1\117\1\124\1\uffff\1\60\1\114\1\60\1\141\1\107\1\127\1\124\10\uffff\1\104\1\uffff\1\157\1\141\1\154\1\164\1\167\2\164\1\60\1\143\1\60\1\155\1\151\1\164\1\163\1\157\1\uffff\1\122\2\uffff\1\116\2\125\4\uffff\1\60\1\uffff\1\60\4\uffff\1\60\1\141\1\60\1\145\1\114\1\60\1\uffff\1\123\1\125\1\uffff\1\143\1\110\2\60\1\137\1\165\1\141\1\143\2\151\1\141\1\145\1\150\1\uffff\1\165\1\uffff\1\145\1\143\1\150\1\164\1\155\1\137\1\124\1\60\1\105\1\uffff\1\171\1\uffff\1\162\1\60\1\uffff\1\105\1\111\1\164\1\60\2\uffff\1\122\1\154\1\151\1\164\1\144\1\154\1\171\1\162\1\145\1\162\1\144\1\150\1\151\2\60\1\111\1\105\1\uffff\1\60\1\163\1\60\1\uffff\1\60\1\122\1\151\1\uffff\1\105\1\101\1\105\1\144\1\156\1\151\2\60\1\163\1\60\1\162\1\60\1\151\1\60\1\156\2\uffff\1\116\1\125\1\116\1\uffff\1\60\1\uffff\1\105\1\157\1\121\1\122\1\116\2\60\1\157\2\uffff\1\60\1\uffff\1\60\1\uffff\1\141\1\uffff\1\60\1\120\1\124\1\103\1\uffff\1\115\1\156\1\125\1\60\1\124\2\uffff\1\156\2\uffff\1\164\1\uffff\1\125\1\120\2\105\1\60\1\111\1\uffff\1\105\1\60\1\145\1\124\1\125\1\60\1\116\1\uffff\1\122\1\116\1\uffff\1\154\1\60\1\124\1\uffff\1\124\1\105\1\103\1\171\1\uffff\2\60\1\115\1\105\1\60\2\uffff\1\105\1\60\1\uffff\1\116\1\uffff\1\124\1\60\1\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\uffff\1\117\1\124\1\154\1\117\1\116\1\46\1\105\1\145\1\111\2\117\1\uffff\1\75\1\76\1\75\1\116\1\uffff\1\150\1\145\1\141\1\156\1\154\1\151\1\162\1\163\1\151\1\165\1\162\1\uffff\1\101\2\uffff\1\105\1\122\1\52\1\uffff\1\174\1\122\1\163\1\uffff\1\121\1\57\1\uffff\1\uffff\1\172\3\uffff\1\122\2\uffff\1\167\1\104\1\164\1\117\1\124\1\uffff\1\172\1\114\1\172\1\141\1\107\1\127\1\124\10\uffff\1\104\1\uffff\1\157\1\155\1\154\1\164\1\167\2\164\1\172\1\143\1\172\1\155\1\151\1\164\1\163\1\157\1\uffff\1\122\2\uffff\1\116\2\125\4\uffff\1\172\1\uffff\1\163\4\uffff\1\172\1\141\1\172\1\145\1\114\1\172\1\uffff\1\123\1\125\1\uffff\1\143\1\110\2\172\1\137\1\165\1\141\1\143\2\151\1\141\1\145\1\150\1\uffff\1\165\1\uffff\1\145\1\143\1\150\1\164\1\155\1\137\1\124\1\172\1\105\1\uffff\1\171\1\uffff\1\162\1\172\1\uffff\1\105\1\111\1\164\1\172\2\uffff\1\126\1\154\1\151\1\164\1\144\1\154\1\171\1\162\1\145\1\162\1\144\1\150\1\151\2\172\1\117\1\105\1\uffff\1\172\1\163\1\172\1\uffff\1\172\1\122\1\151\1\uffff\1\105\1\101\1\105\1\144\1\156\1\151\2\172\1\163\1\172\1\162\1\172\1\151\1\172\1\156\2\uffff\1\116\1\125\1\116\1\uffff\1\172\1\uffff\1\105\1\157\1\121\1\122\1\116\2\172\1\157\2\uffff\1\172\1\uffff\1\172\1\uffff\1\141\1\uffff\1\172\1\120\1\124\1\103\1\uffff\1\115\1\156\1\125\1\172\1\124\2\uffff\1\156\2\uffff\1\164\1\uffff\1\125\1\120\2\105\1\172\1\111\1\uffff\1\105\1\172\1\145\1\124\1\125\1\172\1\116\1\uffff\1\122\1\116\1\uffff\1\154\1\172\1\124\1\uffff\1\124\1\105\1\103\1\171\1\uffff\2\172\1\115\1\105\1\172\2\uffff\1\105\1\172\1\uffff\1\116\1\uffff\1\124\1\172\1\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\13\uffff\1\16\4\uffff\1\27\13\uffff\1\52\1\uffff\1\55\1\57\3\uffff\1\65\3\uffff\1\67\3\uffff\1\76\1\uffff\1\77\1\101\1\1\1\uffff\1\77\1\3\5\uffff\1\7\7\uffff\1\16\1\17\1\62\1\20\1\23\1\21\1\24\1\22\1\uffff\1\27\17\uffff\1\52\1\uffff\1\55\1\57\3\uffff\1\73\1\64\1\65\1\66\1\uffff\1\71\1\uffff\1\70\1\74\1\75\1\76\6\uffff\1\11\2\uffff\1\12\15\uffff\1\37\1\uffff\1\41\11\uffff\1\2\1\uffff\1\10\2\uffff\1\6\4\uffff\1\14\1\15\21\uffff\1\63\3\uffff\1\5\3\uffff\1\13\17\uffff\1\44\1\46\3\uffff\1\72\1\uffff\1\30\10\uffff\1\33\1\34\1\uffff\1\50\1\uffff\1\45\1\uffff\1\43\4\uffff\1\4\5\uffff\1\31\1\32\1\uffff\1\35\1\36\1\uffff\1\51\6\uffff\1\54\7\uffff\1\40\2\uffff\1\42\3\uffff\1\60\4\uffff\1\53\5\uffff\1\56\1\25\2\uffff\1\47\1\uffff\1\61\2\uffff\1\26";
    static final String DFA21_specialS =
        "\1\0\53\uffff\1\1\u00eb\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\60\2\55\2\60\1\55\22\60\1\55\1\15\1\36\1\3\1\60\1\52\1\7\1\54\1\44\1\45\2\60\1\1\1\60\1\22\1\53\12\50\1\41\1\40\1\17\1\16\1\20\2\60\1\4\1\5\2\57\1\21\1\10\1\57\1\12\1\6\2\57\1\13\1\57\1\14\1\47\2\57\1\11\1\42\1\43\1\57\1\37\1\57\1\2\2\57\3\60\1\56\1\57\1\60\1\27\3\57\1\30\1\35\2\57\1\32\3\57\1\34\1\57\1\31\2\57\1\24\1\23\1\57\1\26\1\25\1\33\3\57\1\60\1\46\uff83\60",
            "",
            "\1\62",
            "\1\64",
            "\1\66\27\uffff\1\67\5\uffff\1\65",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\74\3\uffff\1\73",
            "\1\75\37\uffff\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "",
            "\1\103",
            "\1\106\1\105",
            "\1\110",
            "\1\112",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\121\5\uffff\1\120",
            "\1\122",
            "\1\124\16\uffff\1\123",
            "\1\126\5\uffff\1\125",
            "\1\127\1\130",
            "\1\131",
            "\1\132",
            "",
            "\1\134",
            "",
            "",
            "\1\137",
            "\1\140\20\uffff\1\141",
            "\1\142",
            "",
            "\1\145",
            "\1\146",
            "\12\150\52\uffff\1\51\3\uffff\1\51\4\uffff\1\51\5\uffff\1\51",
            "",
            "\1\151\3\uffff\1\151\3\uffff\1\151",
            "\1\142\4\uffff\1\152",
            "\0\153",
            "",
            "\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "\1\155",
            "",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\164",
            "\12\63\7\uffff\20\63\1\165\11\63\4\uffff\1\63\1\uffff\32\63",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\173",
            "",
            "\1\174",
            "\1\176\13\uffff\1\175",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0085",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "",
            "\1\u008c",
            "",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\150\52\uffff\1\51\3\uffff\1\51\4\uffff\1\51\5\uffff\1\51",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0091",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0093",
            "\1\u0094",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0096",
            "\1\u0097",
            "",
            "\1\u0098",
            "\1\u0099",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ae",
            "",
            "\1\u00af",
            "",
            "\1\u00b0",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u00b6\1\u00b8\2\uffff\1\u00b7",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00c7\5\uffff\1\u00c8",
            "\1\u00c9",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00cb",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00cd",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00d7",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00d9",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00db",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00dd",
            "",
            "",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00e9",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u00ec",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00f5",
            "",
            "",
            "\1\u00f6",
            "",
            "",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00fd",
            "",
            "\1\u00fe",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0104",
            "",
            "\1\u0105",
            "\1\u0106",
            "",
            "\1\u0107",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0109",
            "",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0110",
            "\1\u0111",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u0113",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0115",
            "",
            "\1\u0116",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | RULE_OR_OPERATOR | RULE_INTERVAL | RULE_DIRECT_VARIABLE | RULE_INTEGER | RULE_BOOLEAN_LITERAL | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_STRING | RULE_WS | RULE_ID | RULE_INT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0==',') ) {s = 1;}

                        else if ( (LA21_0=='X') ) {s = 2;}

                        else if ( (LA21_0=='#') ) {s = 3;}

                        else if ( (LA21_0=='A') ) {s = 4;}

                        else if ( (LA21_0=='B') ) {s = 5;}

                        else if ( (LA21_0=='I') ) {s = 6;}

                        else if ( (LA21_0=='&') ) {s = 7;}

                        else if ( (LA21_0=='F') ) {s = 8;}

                        else if ( (LA21_0=='R') ) {s = 9;}

                        else if ( (LA21_0=='H') ) {s = 10;}

                        else if ( (LA21_0=='L') ) {s = 11;}

                        else if ( (LA21_0=='N') ) {s = 12;}

                        else if ( (LA21_0=='!') ) {s = 13;}

                        else if ( (LA21_0=='=') ) {s = 14;}

                        else if ( (LA21_0=='<') ) {s = 15;}

                        else if ( (LA21_0=='>') ) {s = 16;}

                        else if ( (LA21_0=='E') ) {s = 17;}

                        else if ( (LA21_0=='.') ) {s = 18;}

                        else if ( (LA21_0=='s') ) {s = 19;}

                        else if ( (LA21_0=='r') ) {s = 20;}

                        else if ( (LA21_0=='v') ) {s = 21;}

                        else if ( (LA21_0=='u') ) {s = 22;}

                        else if ( (LA21_0=='a') ) {s = 23;}

                        else if ( (LA21_0=='e') ) {s = 24;}

                        else if ( (LA21_0=='o') ) {s = 25;}

                        else if ( (LA21_0=='i') ) {s = 26;}

                        else if ( (LA21_0=='w') ) {s = 27;}

                        else if ( (LA21_0=='m') ) {s = 28;}

                        else if ( (LA21_0=='f') ) {s = 29;}

                        else if ( (LA21_0=='\"') ) {s = 30;}

                        else if ( (LA21_0=='V') ) {s = 31;}

                        else if ( (LA21_0==';') ) {s = 32;}

                        else if ( (LA21_0==':') ) {s = 33;}

                        else if ( (LA21_0=='S') ) {s = 34;}

                        else if ( (LA21_0=='T') ) {s = 35;}

                        else if ( (LA21_0=='(') ) {s = 36;}

                        else if ( (LA21_0==')') ) {s = 37;}

                        else if ( (LA21_0=='|') ) {s = 38;}

                        else if ( (LA21_0=='O') ) {s = 39;}

                        else if ( ((LA21_0>='0' && LA21_0<='9')) ) {s = 40;}

                        else if ( (LA21_0=='%') ) {s = 42;}

                        else if ( (LA21_0=='/') ) {s = 43;}

                        else if ( (LA21_0=='\'') ) {s = 44;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 45;}

                        else if ( (LA21_0=='^') ) {s = 46;}

                        else if ( ((LA21_0>='C' && LA21_0<='D')||LA21_0=='G'||(LA21_0>='J' && LA21_0<='K')||LA21_0=='M'||(LA21_0>='P' && LA21_0<='Q')||LA21_0=='U'||LA21_0=='W'||(LA21_0>='Y' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='b' && LA21_0<='d')||(LA21_0>='g' && LA21_0<='h')||(LA21_0>='j' && LA21_0<='l')||LA21_0=='n'||(LA21_0>='p' && LA21_0<='q')||LA21_0=='t'||(LA21_0>='x' && LA21_0<='z')) ) {s = 47;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='$'||(LA21_0>='*' && LA21_0<='+')||LA21_0=='-'||(LA21_0>='?' && LA21_0<='@')||(LA21_0>='[' && LA21_0<=']')||LA21_0=='`'||LA21_0=='{'||(LA21_0>='}' && LA21_0<='\uFFFF')) ) {s = 48;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_44 = input.LA(1);

                        s = -1;
                        if ( ((LA21_44>='\u0000' && LA21_44<='\uFFFF')) ) {s = 107;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}