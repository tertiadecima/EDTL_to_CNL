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
    public static final int RULE_INTERVAL=9;
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
    public static final int RULE_ID=7;
    public static final int RULE_BOOLEAN_LITERAL=6;
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
    public static final int RULE_STRING=4;
    public static final int RULE_OR_OPERATOR=8;
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

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:11:7: ( 'XOR' )
            // InternalCNL.g:11:9: 'XOR'
            {
            match("XOR"); 


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
            // InternalCNL.g:12:7: ( '#T' )
            // InternalCNL.g:12:9: '#T'
            {
            match("#T"); 


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
            // InternalCNL.g:13:7: ( ',' )
            // InternalCNL.g:13:9: ','
            {
            match(','); 

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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:16:7: ( 'AND' )
            // InternalCNL.g:16:9: 'AND'
            {
            match("AND"); 


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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:18:7: ( 'FE' )
            // InternalCNL.g:18:9: 'FE'
            {
            match("FE"); 


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
            // InternalCNL.g:19:7: ( 'RE' )
            // InternalCNL.g:19:9: 'RE'
            {
            match("RE"); 


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
            // InternalCNL.g:20:7: ( 'HIGH' )
            // InternalCNL.g:20:9: 'HIGH'
            {
            match("HIGH"); 


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
            // InternalCNL.g:21:7: ( 'LOW' )
            // InternalCNL.g:21:9: 'LOW'
            {
            match("LOW"); 


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
            // InternalCNL.g:22:7: ( 'NOT' )
            // InternalCNL.g:22:9: 'NOT'
            {
            match("NOT"); 


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
            // InternalCNL.g:23:7: ( '!' )
            // InternalCNL.g:23:9: '!'
            {
            match('!'); 

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
            // InternalCNL.g:24:7: ( 'Always' )
            // InternalCNL.g:24:9: 'Always'
            {
            match("Always"); 


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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:27:7: ( '<=' )
            // InternalCNL.g:27:9: '<='
            {
            match("<="); 


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
            // InternalCNL.g:28:7: ( '>=' )
            // InternalCNL.g:28:9: '>='
            {
            match(">="); 


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
            // InternalCNL.g:29:7: ( '<' )
            // InternalCNL.g:29:9: '<'
            {
            match('<'); 

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
            // InternalCNL.g:30:7: ( '>' )
            // InternalCNL.g:30:9: '>'
            {
            match('>'); 

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
            // InternalCNL.g:31:7: ( 'VAR_INPUT' )
            // InternalCNL.g:31:9: 'VAR_INPUT'
            {
            match("VAR_INPUT"); 


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
            // InternalCNL.g:32:7: ( 'END_VAR' )
            // InternalCNL.g:32:9: 'END_VAR'
            {
            match("END_VAR"); 


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
            // InternalCNL.g:33:7: ( ';' )
            // InternalCNL.g:33:9: ';'
            {
            match(';'); 

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
            // InternalCNL.g:34:7: ( 'VAR_OUTPUT' )
            // InternalCNL.g:34:9: 'VAR_OUTPUT'
            {
            match("VAR_OUTPUT"); 


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
            // InternalCNL.g:35:7: ( ':' )
            // InternalCNL.g:35:9: ':'
            {
            match(':'); 

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
            // InternalCNL.g:36:7: ( 'SENTENCE' )
            // InternalCNL.g:36:9: 'SENTENCE'
            {
            match("SENTENCE"); 


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
            // InternalCNL.g:37:7: ( 'END_SENTENCE' )
            // InternalCNL.g:37:9: 'END_SENTENCE'
            {
            match("END_SENTENCE"); 


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
            // InternalCNL.g:38:7: ( '=' )
            // InternalCNL.g:38:9: '='
            {
            match('='); 

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
            // InternalCNL.g:39:7: ( 'TAU' )
            // InternalCNL.g:39:9: 'TAU'
            {
            match("TAU"); 


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
            // InternalCNL.g:40:7: ( '(' )
            // InternalCNL.g:40:9: '('
            {
            match('('); 

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
            // InternalCNL.g:41:7: ( ')' )
            // InternalCNL.g:41:9: ')'
            {
            match(')'); 

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
            // InternalCNL.g:42:7: ( 'REQUIREMENT' )
            // InternalCNL.g:42:9: 'REQUIREMENT'
            {
            match("REQUIREMENT"); 


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
            // InternalCNL.g:43:7: ( 'END_REQUIREMENT' )
            // InternalCNL.g:43:9: 'END_REQUIREMENT'
            {
            match("END_REQUIREMENT"); 


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
            // InternalCNL.g:44:7: ( '.' )
            // InternalCNL.g:44:9: '.'
            {
            match('.'); 

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
            // InternalCNL.g:45:7: ( 'After' )
            // InternalCNL.g:45:9: 'After'
            {
            match("After"); 


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
            // InternalCNL.g:46:7: ( 'should' )
            // InternalCNL.g:46:9: 'should'
            {
            match("should"); 


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
            // InternalCNL.g:47:7: ( 'remain' )
            // InternalCNL.g:47:9: 'remain'
            {
            match("remain"); 


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
            // InternalCNL.g:48:7: ( 'valid' )
            // InternalCNL.g:48:9: 'valid'
            {
            match("valid"); 


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
            // InternalCNL.g:49:7: ( 'until' )
            // InternalCNL.g:49:9: 'until'
            {
            match("until"); 


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
            // InternalCNL.g:50:7: ( 'always' )
            // InternalCNL.g:50:9: 'always'
            {
            match("always"); 


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
            // InternalCNL.g:51:7: ( 'either' )
            // InternalCNL.g:51:9: 'either'
            {
            match("either"); 


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
            // InternalCNL.g:52:7: ( 'or' )
            // InternalCNL.g:52:9: 'or'
            {
            match("or"); 


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
            // InternalCNL.g:53:7: ( 'Reaction' )
            // InternalCNL.g:53:9: 'Reaction'
            {
            match("Reaction"); 


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
            // InternalCNL.g:54:7: ( 'is' )
            // InternalCNL.g:54:9: 'is'
            {
            match("is"); 


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
            // InternalCNL.g:55:7: ( 'reaction' )
            // InternalCNL.g:55:9: 'reaction'
            {
            match("reaction"); 


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
            // InternalCNL.g:56:7: ( 'which' )
            // InternalCNL.g:56:9: 'which'
            {
            match("which"); 


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
            // InternalCNL.g:57:7: ( 'must' )
            // InternalCNL.g:57:9: 'must'
            {
            match("must"); 


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
            // InternalCNL.g:58:7: ( 'occur' )
            // InternalCNL.g:58:9: 'occur'
            {
            match("occur"); 


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
            // InternalCNL.g:59:7: ( 'from' )
            // InternalCNL.g:59:9: 'from'
            {
            match("from"); 


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
            // InternalCNL.g:60:7: ( 'immediately' )
            // InternalCNL.g:60:9: 'immediately'
            {
            match("immediately"); 


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
            // InternalCNL.g:61:7: ( 'after' )
            // InternalCNL.g:61:9: 'after'
            {
            match("after"); 


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
            // InternalCNL.g:62:7: ( 'within' )
            // InternalCNL.g:62:9: 'within'
            {
            match("within"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "RULE_OR_OPERATOR"
    public final void mRULE_OR_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_OR_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:5912:18: ( ( '||' | 'OR' ) )
            // InternalCNL.g:5912:20: ( '||' | 'OR' )
            {
            // InternalCNL.g:5912:20: ( '||' | 'OR' )
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
                    // InternalCNL.g:5912:21: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // InternalCNL.g:5912:26: 'OR'
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
            // InternalCNL.g:5914:15: ( ( RULE_INTEGER 'd' )? ( RULE_INTEGER 'h' )? ( RULE_INTEGER 'm' )? ( RULE_INTEGER 's' )? ( RULE_INTEGER 'ms' )? )
            // InternalCNL.g:5914:17: ( RULE_INTEGER 'd' )? ( RULE_INTEGER 'h' )? ( RULE_INTEGER 'm' )? ( RULE_INTEGER 's' )? ( RULE_INTEGER 'ms' )?
            {
            // InternalCNL.g:5914:17: ( RULE_INTEGER 'd' )?
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalCNL.g:5914:18: RULE_INTEGER 'd'
                    {
                    mRULE_INTEGER(); 
                    match('d'); 

                    }
                    break;

            }

            // InternalCNL.g:5914:37: ( RULE_INTEGER 'h' )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalCNL.g:5914:38: RULE_INTEGER 'h'
                    {
                    mRULE_INTEGER(); 
                    match('h'); 

                    }
                    break;

            }

            // InternalCNL.g:5914:57: ( RULE_INTEGER 'm' )?
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalCNL.g:5914:58: RULE_INTEGER 'm'
                    {
                    mRULE_INTEGER(); 
                    match('m'); 

                    }
                    break;

            }

            // InternalCNL.g:5914:77: ( RULE_INTEGER 's' )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalCNL.g:5914:78: RULE_INTEGER 's'
                    {
                    mRULE_INTEGER(); 
                    match('s'); 

                    }
                    break;

            }

            // InternalCNL.g:5914:97: ( RULE_INTEGER 'ms' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCNL.g:5914:98: RULE_INTEGER 'ms'
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

    // $ANTLR start "RULE_INTEGER"
    public final void mRULE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:5916:14: ( ( RULE_DIGIT )+ )
            // InternalCNL.g:5916:16: ( RULE_DIGIT )+
            {
            // InternalCNL.g:5916:16: ( RULE_DIGIT )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCNL.g:5916:16: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalCNL.g:5918:21: ( '0' .. '9' )
            // InternalCNL.g:5918:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_BOOLEAN_LITERAL"
    public final void mRULE_BOOLEAN_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:5920:22: ( ( 'TRUE' | 'FALSE' ) )
            // InternalCNL.g:5920:24: ( 'TRUE' | 'FALSE' )
            {
            // InternalCNL.g:5920:24: ( 'TRUE' | 'FALSE' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='T') ) {
                alt8=1;
            }
            else if ( (LA8_0=='F') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCNL.g:5920:25: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;
                case 2 :
                    // InternalCNL.g:5920:32: 'FALSE'
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCNL.g:5922:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCNL.g:5922:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCNL.g:5922:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCNL.g:5922:11: '^'
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

            // InternalCNL.g:5922:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
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
            	    break loop10;
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
            // InternalCNL.g:5924:10: ( ( '0' .. '9' )+ )
            // InternalCNL.g:5924:12: ( '0' .. '9' )+
            {
            // InternalCNL.g:5924:12: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCNL.g:5924:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // InternalCNL.g:5926:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCNL.g:5926:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCNL.g:5926:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCNL.g:5926:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCNL.g:5926:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalCNL.g:5926:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCNL.g:5926:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCNL.g:5926:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCNL.g:5926:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalCNL.g:5926:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCNL.g:5926:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop13;
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
            // InternalCNL.g:5928:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCNL.g:5928:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCNL.g:5928:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCNL.g:5928:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
            // InternalCNL.g:5930:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCNL.g:5930:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCNL.g:5930:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCNL.g:5930:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop16;
                }
            } while (true);

            // InternalCNL.g:5930:40: ( ( '\\r' )? '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCNL.g:5930:41: ( '\\r' )? '\\n'
                    {
                    // InternalCNL.g:5930:41: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalCNL.g:5930:41: '\\r'
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
            // InternalCNL.g:5932:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCNL.g:5932:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCNL.g:5932:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
            // InternalCNL.g:5934:16: ( . )
            // InternalCNL.g:5934:18: .
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
        // InternalCNL.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | RULE_OR_OPERATOR | RULE_INTERVAL | RULE_INTEGER | RULE_BOOLEAN_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt20=63;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // InternalCNL.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalCNL.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalCNL.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalCNL.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalCNL.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalCNL.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalCNL.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalCNL.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalCNL.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalCNL.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalCNL.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalCNL.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalCNL.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalCNL.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalCNL.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalCNL.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalCNL.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalCNL.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalCNL.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalCNL.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalCNL.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalCNL.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalCNL.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // InternalCNL.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // InternalCNL.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // InternalCNL.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // InternalCNL.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // InternalCNL.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // InternalCNL.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // InternalCNL.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // InternalCNL.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // InternalCNL.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // InternalCNL.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // InternalCNL.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // InternalCNL.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // InternalCNL.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // InternalCNL.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // InternalCNL.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // InternalCNL.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // InternalCNL.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // InternalCNL.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // InternalCNL.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // InternalCNL.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // InternalCNL.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // InternalCNL.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // InternalCNL.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // InternalCNL.g:1:286: T__62
                {
                mT__62(); 

                }
                break;
            case 48 :
                // InternalCNL.g:1:292: T__63
                {
                mT__63(); 

                }
                break;
            case 49 :
                // InternalCNL.g:1:298: T__64
                {
                mT__64(); 

                }
                break;
            case 50 :
                // InternalCNL.g:1:304: T__65
                {
                mT__65(); 

                }
                break;
            case 51 :
                // InternalCNL.g:1:310: T__66
                {
                mT__66(); 

                }
                break;
            case 52 :
                // InternalCNL.g:1:316: T__67
                {
                mT__67(); 

                }
                break;
            case 53 :
                // InternalCNL.g:1:322: RULE_OR_OPERATOR
                {
                mRULE_OR_OPERATOR(); 

                }
                break;
            case 54 :
                // InternalCNL.g:1:339: RULE_INTERVAL
                {
                mRULE_INTERVAL(); 

                }
                break;
            case 55 :
                // InternalCNL.g:1:353: RULE_INTEGER
                {
                mRULE_INTEGER(); 

                }
                break;
            case 56 :
                // InternalCNL.g:1:366: RULE_BOOLEAN_LITERAL
                {
                mRULE_BOOLEAN_LITERAL(); 

                }
                break;
            case 57 :
                // InternalCNL.g:1:387: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 58 :
                // InternalCNL.g:1:395: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 59 :
                // InternalCNL.g:1:404: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 60 :
                // InternalCNL.g:1:416: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 61 :
                // InternalCNL.g:1:432: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 62 :
                // InternalCNL.g:1:448: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 63 :
                // InternalCNL.g:1:456: RULE_ANY_OTHER
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
    protected DFA20 dfa20 = new DFA20(this);
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
            return "5914:17: ( RULE_INTEGER 'd' )?";
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
            return "5914:37: ( RULE_INTEGER 'h' )?";
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
            return "5914:57: ( RULE_INTEGER 'm' )?";
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
            return "5914:77: ( RULE_INTEGER 's' )?";
        }
    }
    static final String DFA20_eotS =
        "\1\50\1\61\1\57\1\uffff\3\61\1\57\5\61\1\uffff\1\103\1\106\1\110\2\61\2\uffff\2\61\3\uffff\13\61\1\57\1\61\1\144\1\uffff\1\57\1\uffff\3\57\2\uffff\1\61\3\uffff\5\61\1\uffff\1\160\1\61\1\163\4\61\10\uffff\2\61\2\uffff\3\61\3\uffff\7\61\1\u0085\1\61\1\u0087\5\61\1\uffff\1\142\1\uffff\1\144\4\uffff\1\u008d\1\61\1\u008f\1\u0090\2\61\1\uffff\2\61\1\uffff\2\61\1\u0097\1\u0098\3\61\1\u009c\11\61\1\uffff\1\61\1\uffff\5\61\1\uffff\1\u00ac\2\uffff\5\61\1\u00b2\2\uffff\3\61\1\uffff\1\u00b9\14\61\1\u00c6\1\u00c7\1\uffff\1\61\1\u00c9\1\u00b9\2\61\1\uffff\6\61\1\uffff\3\61\1\u00d5\1\u00d6\1\61\1\u00d8\1\61\1\u00da\1\61\1\u00dc\1\61\2\uffff\1\u00de\1\uffff\10\61\1\u00e7\1\u00e8\1\61\2\uffff\1\u00ea\1\uffff\1\u00eb\1\uffff\1\61\1\uffff\1\u00ed\1\uffff\4\61\1\u00f2\3\61\2\uffff\1\61\2\uffff\1\61\1\uffff\1\61\1\u00f9\2\61\1\uffff\2\61\1\u00fe\1\u00ff\2\61\1\uffff\1\u0102\3\61\2\uffff\2\61\1\uffff\1\u0108\3\61\1\u010c\1\uffff\2\61\1\u010f\1\uffff\1\u0110\1\61\2\uffff\2\61\1\u0114\1\uffff";
    static final String DFA20_eofS =
        "\u0115\uffff";
    static final String DFA20_minS =
        "\1\0\1\117\1\124\1\uffff\1\117\2\116\1\46\1\101\1\105\1\111\2\117\1\uffff\3\75\1\101\1\116\2\uffff\1\105\1\101\3\uffff\1\150\1\145\1\141\1\156\1\146\1\151\1\143\1\155\1\150\1\165\1\162\1\174\1\122\1\60\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\122\3\uffff\1\117\1\124\1\104\1\167\1\164\1\uffff\1\60\1\114\1\60\1\141\1\107\1\127\1\124\10\uffff\1\122\1\104\2\uffff\1\116\2\125\3\uffff\1\157\1\141\1\154\1\164\1\167\2\164\1\60\1\143\1\60\1\155\1\151\1\164\1\163\1\157\1\uffff\1\60\1\uffff\1\60\4\uffff\1\60\1\114\2\60\1\141\1\145\1\uffff\1\123\1\125\1\uffff\1\143\1\110\2\60\2\137\1\124\1\60\1\105\1\165\1\141\1\143\2\151\1\141\1\145\1\150\1\uffff\1\165\1\uffff\1\145\1\143\1\150\1\164\1\155\1\uffff\1\60\2\uffff\1\171\1\162\1\105\1\111\1\164\1\60\2\uffff\1\111\1\122\1\105\1\uffff\1\60\1\154\1\151\1\164\1\144\1\154\1\171\1\162\1\145\1\162\1\144\1\150\1\151\2\60\1\uffff\1\163\2\60\1\122\1\151\1\uffff\1\116\1\125\1\101\2\105\1\116\1\uffff\1\144\1\156\1\151\2\60\1\163\1\60\1\162\1\60\1\151\1\60\1\156\2\uffff\1\60\1\uffff\1\105\1\157\1\120\1\124\1\122\1\116\1\121\1\103\2\60\1\157\2\uffff\1\60\1\uffff\1\60\1\uffff\1\141\1\uffff\1\60\1\uffff\1\115\1\156\1\125\1\120\1\60\1\124\1\125\1\105\2\uffff\1\156\2\uffff\1\164\1\uffff\1\105\1\60\1\124\1\125\1\uffff\1\105\1\111\2\60\1\145\1\116\1\uffff\1\60\1\124\1\116\1\122\2\uffff\1\154\1\124\1\uffff\1\60\1\103\1\105\1\171\1\60\1\uffff\1\105\1\115\1\60\1\uffff\1\60\1\105\2\uffff\1\116\1\124\1\60\1\uffff";
    static final String DFA20_maxS =
        "\1\uffff\1\117\1\124\1\uffff\1\117\1\116\1\154\1\46\1\105\1\145\1\111\2\117\1\uffff\1\75\1\76\1\75\1\101\1\116\2\uffff\1\105\1\122\3\uffff\1\150\1\145\1\141\1\156\1\154\1\151\1\162\1\163\1\151\1\165\1\162\1\174\1\122\1\163\1\uffff\1\172\1\uffff\2\uffff\1\57\2\uffff\1\122\3\uffff\1\117\1\124\1\104\1\167\1\164\1\uffff\1\172\1\114\1\172\1\141\1\107\1\127\1\124\10\uffff\1\122\1\104\2\uffff\1\116\2\125\3\uffff\1\157\1\155\1\154\1\164\1\167\2\164\1\172\1\143\1\172\1\155\1\151\1\164\1\163\1\157\1\uffff\1\172\1\uffff\1\163\4\uffff\1\172\1\114\2\172\1\141\1\145\1\uffff\1\123\1\125\1\uffff\1\143\1\110\2\172\2\137\1\124\1\172\1\105\1\165\1\141\1\143\2\151\1\141\1\145\1\150\1\uffff\1\165\1\uffff\1\145\1\143\1\150\1\164\1\155\1\uffff\1\172\2\uffff\1\171\1\162\1\105\1\111\1\164\1\172\2\uffff\1\117\1\126\1\105\1\uffff\1\172\1\154\1\151\1\164\1\144\1\154\1\171\1\162\1\145\1\162\1\144\1\150\1\151\2\172\1\uffff\1\163\2\172\1\122\1\151\1\uffff\1\116\1\125\1\101\2\105\1\116\1\uffff\1\144\1\156\1\151\2\172\1\163\1\172\1\162\1\172\1\151\1\172\1\156\2\uffff\1\172\1\uffff\1\105\1\157\1\120\1\124\1\122\1\116\1\121\1\103\2\172\1\157\2\uffff\1\172\1\uffff\1\172\1\uffff\1\141\1\uffff\1\172\1\uffff\1\115\1\156\1\125\1\120\1\172\1\124\1\125\1\105\2\uffff\1\156\2\uffff\1\164\1\uffff\1\105\1\172\1\124\1\125\1\uffff\1\105\1\111\2\172\1\145\1\116\1\uffff\1\172\1\124\1\116\1\122\2\uffff\1\154\1\124\1\uffff\1\172\1\103\1\105\1\171\1\172\1\uffff\1\105\1\115\1\172\1\uffff\1\172\1\105\2\uffff\1\116\1\124\1\172\1\uffff";
    static final String DFA20_acceptS =
        "\3\uffff\1\3\11\uffff\1\15\5\uffff\1\27\1\31\2\uffff\1\36\1\37\1\42\16\uffff\1\66\1\uffff\1\71\3\uffff\1\76\1\77\1\uffff\1\71\1\2\1\3\5\uffff\1\7\7\uffff\1\15\1\17\1\34\1\20\1\21\1\23\1\22\1\24\2\uffff\1\27\1\31\3\uffff\1\36\1\37\1\42\17\uffff\1\65\1\uffff\1\67\1\uffff\1\73\1\74\1\75\1\76\6\uffff\1\10\2\uffff\1\11\21\uffff\1\52\1\uffff\1\54\5\uffff\1\1\1\uffff\1\5\1\6\6\uffff\1\13\1\14\3\uffff\1\35\17\uffff\1\4\5\uffff\1\12\6\uffff\1\70\14\uffff\1\57\1\61\1\uffff\1\43\13\uffff\1\46\1\47\1\uffff\1\63\1\uffff\1\60\1\uffff\1\56\1\uffff\1\16\10\uffff\1\44\1\45\1\uffff\1\50\1\51\1\uffff\1\64\4\uffff\1\26\6\uffff\1\53\4\uffff\1\32\1\55\2\uffff\1\25\5\uffff\1\30\3\uffff\1\40\2\uffff\1\62\1\33\3\uffff\1\41";
    static final String DFA20_specialS =
        "\1\2\52\uffff\1\0\1\1\u00e8\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\57\2\56\2\57\1\56\22\57\1\56\1\15\1\53\1\2\2\57\1\7\1\54\1\27\1\30\2\57\1\3\1\57\1\31\1\55\12\47\1\24\1\23\1\17\1\16\1\20\2\57\1\6\1\4\2\52\1\22\1\10\1\52\1\12\1\5\2\52\1\13\1\52\1\14\1\46\2\52\1\11\1\25\1\26\1\52\1\21\1\52\1\1\2\52\3\57\1\51\1\52\1\57\1\36\3\52\1\37\1\44\2\52\1\41\3\52\1\43\1\52\1\40\2\52\1\33\1\32\1\52\1\35\1\34\1\42\3\52\1\57\1\45\uff83\57",
            "\1\60",
            "\1\62",
            "",
            "\1\64",
            "\1\65",
            "\1\66\27\uffff\1\70\5\uffff\1\67",
            "\1\71",
            "\1\73\3\uffff\1\72",
            "\1\74\37\uffff\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "",
            "\1\102",
            "\1\105\1\104",
            "\1\107",
            "\1\111",
            "\1\112",
            "",
            "",
            "\1\115",
            "\1\116\20\uffff\1\117",
            "",
            "",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\130\5\uffff\1\127",
            "\1\131",
            "\1\133\16\uffff\1\132",
            "\1\135\5\uffff\1\134",
            "\1\136\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\145\52\uffff\1\50\3\uffff\1\50\4\uffff\1\50\5\uffff\1\50",
            "",
            "\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\0\146",
            "\0\146",
            "\1\147\4\uffff\1\150",
            "",
            "",
            "\1\152",
            "",
            "",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\161",
            "\12\61\7\uffff\20\61\1\162\11\61\4\uffff\1\61\1\uffff\32\61",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\170",
            "\1\171",
            "",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "",
            "",
            "\1\175",
            "\1\177\13\uffff\1\176",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0086",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\145\52\uffff\1\50\3\uffff\1\50\4\uffff\1\50\5\uffff\1\50",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u008e",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "",
            "\1\u0095",
            "\1\u0096",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u00b3\5\uffff\1\u00b4",
            "\1\u00b7\1\u00b6\2\uffff\1\u00b5",
            "\1\u00b8",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
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
            "\1\u00c5",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00c8",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00d7",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00d9",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00db",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00dd",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00e9",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00ec",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "",
            "\1\u00f6",
            "",
            "",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "\1\u00fc",
            "\1\u00fd",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0100",
            "\1\u0101",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "",
            "",
            "\1\u0106",
            "\1\u0107",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u010d",
            "\1\u010e",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0111",
            "",
            "",
            "\1\u0112",
            "\1\u0113",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | RULE_OR_OPERATOR | RULE_INTERVAL | RULE_INTEGER | RULE_BOOLEAN_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_43 = input.LA(1);

                        s = -1;
                        if ( ((LA20_43>='\u0000' && LA20_43<='\uFFFF')) ) {s = 102;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_44 = input.LA(1);

                        s = -1;
                        if ( ((LA20_44>='\u0000' && LA20_44<='\uFFFF')) ) {s = 102;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='X') ) {s = 1;}

                        else if ( (LA20_0=='#') ) {s = 2;}

                        else if ( (LA20_0==',') ) {s = 3;}

                        else if ( (LA20_0=='B') ) {s = 4;}

                        else if ( (LA20_0=='I') ) {s = 5;}

                        else if ( (LA20_0=='A') ) {s = 6;}

                        else if ( (LA20_0=='&') ) {s = 7;}

                        else if ( (LA20_0=='F') ) {s = 8;}

                        else if ( (LA20_0=='R') ) {s = 9;}

                        else if ( (LA20_0=='H') ) {s = 10;}

                        else if ( (LA20_0=='L') ) {s = 11;}

                        else if ( (LA20_0=='N') ) {s = 12;}

                        else if ( (LA20_0=='!') ) {s = 13;}

                        else if ( (LA20_0=='=') ) {s = 14;}

                        else if ( (LA20_0=='<') ) {s = 15;}

                        else if ( (LA20_0=='>') ) {s = 16;}

                        else if ( (LA20_0=='V') ) {s = 17;}

                        else if ( (LA20_0=='E') ) {s = 18;}

                        else if ( (LA20_0==';') ) {s = 19;}

                        else if ( (LA20_0==':') ) {s = 20;}

                        else if ( (LA20_0=='S') ) {s = 21;}

                        else if ( (LA20_0=='T') ) {s = 22;}

                        else if ( (LA20_0=='(') ) {s = 23;}

                        else if ( (LA20_0==')') ) {s = 24;}

                        else if ( (LA20_0=='.') ) {s = 25;}

                        else if ( (LA20_0=='s') ) {s = 26;}

                        else if ( (LA20_0=='r') ) {s = 27;}

                        else if ( (LA20_0=='v') ) {s = 28;}

                        else if ( (LA20_0=='u') ) {s = 29;}

                        else if ( (LA20_0=='a') ) {s = 30;}

                        else if ( (LA20_0=='e') ) {s = 31;}

                        else if ( (LA20_0=='o') ) {s = 32;}

                        else if ( (LA20_0=='i') ) {s = 33;}

                        else if ( (LA20_0=='w') ) {s = 34;}

                        else if ( (LA20_0=='m') ) {s = 35;}

                        else if ( (LA20_0=='f') ) {s = 36;}

                        else if ( (LA20_0=='|') ) {s = 37;}

                        else if ( (LA20_0=='O') ) {s = 38;}

                        else if ( ((LA20_0>='0' && LA20_0<='9')) ) {s = 39;}

                        else if ( (LA20_0=='^') ) {s = 41;}

                        else if ( ((LA20_0>='C' && LA20_0<='D')||LA20_0=='G'||(LA20_0>='J' && LA20_0<='K')||LA20_0=='M'||(LA20_0>='P' && LA20_0<='Q')||LA20_0=='U'||LA20_0=='W'||(LA20_0>='Y' && LA20_0<='Z')||LA20_0=='_'||(LA20_0>='b' && LA20_0<='d')||(LA20_0>='g' && LA20_0<='h')||(LA20_0>='j' && LA20_0<='l')||LA20_0=='n'||(LA20_0>='p' && LA20_0<='q')||LA20_0=='t'||(LA20_0>='x' && LA20_0<='z')) ) {s = 42;}

                        else if ( (LA20_0=='\"') ) {s = 43;}

                        else if ( (LA20_0=='\'') ) {s = 44;}

                        else if ( (LA20_0=='/') ) {s = 45;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 46;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||(LA20_0>='$' && LA20_0<='%')||(LA20_0>='*' && LA20_0<='+')||LA20_0=='-'||(LA20_0>='?' && LA20_0<='@')||(LA20_0>='[' && LA20_0<=']')||LA20_0=='`'||LA20_0=='{'||(LA20_0>='}' && LA20_0<='\uFFFF')) ) {s = 47;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}