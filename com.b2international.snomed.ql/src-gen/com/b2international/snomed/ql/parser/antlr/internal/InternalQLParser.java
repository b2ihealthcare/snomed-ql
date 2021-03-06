package com.b2international.snomed.ql.parser.antlr.internal;

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
import com.b2international.snomed.ql.services.QLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CaseSignificanceId", "LanguageRefSetId", "AcceptableIn", "LanguageCode", "Description", "PreferredIn", "ModuleId", "Concept", "Active", "TypeId", "Exact", "False", "Match", "Regex", "Term", "True", "RULE_OPEN_DOUBLE_BRACES", "RULE_CLOSE_DOUBLE_BRACES", "RULE_TERM_STRING", "RULE_REVERSED", "RULE_TO", "RULE_COMMA", "RULE_CONJUNCTION", "RULE_DISJUNCTION", "RULE_EXCLUSION", "RULE_ZERO", "RULE_DIGIT_NONZERO", "RULE_COLON", "RULE_CURLY_OPEN", "RULE_CURLY_CLOSE", "RULE_ROUND_OPEN", "RULE_ROUND_CLOSE", "RULE_SQUARE_OPEN", "RULE_SQUARE_CLOSE", "RULE_PLUS", "RULE_DASH", "RULE_CARET", "RULE_DOT", "RULE_WILDCARD", "RULE_EQUAL", "RULE_NOT_EQUAL", "RULE_LT", "RULE_GT", "RULE_DBL_LT", "RULE_DBL_GT", "RULE_LT_EM", "RULE_DBL_LT_EM", "RULE_GT_EM", "RULE_DBL_GT_EM", "RULE_GTE", "RULE_LTE", "RULE_HASH", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING"
    };
    public static final int RULE_DIGIT_NONZERO=30;
    public static final int RULE_CURLY_OPEN=32;
    public static final int RULE_TO=24;
    public static final int RULE_ROUND_CLOSE=35;
    public static final int RULE_DBL_GT=48;
    public static final int True=19;
    public static final int RULE_GT=46;
    public static final int False=15;
    public static final int RULE_GTE=53;
    public static final int LanguageCode=7;
    public static final int ModuleId=10;
    public static final int Regex=17;
    public static final int RULE_ROUND_OPEN=34;
    public static final int RULE_DBL_LT=47;
    public static final int RULE_NOT_EQUAL=44;
    public static final int Concept=11;
    public static final int AcceptableIn=6;
    public static final int TypeId=13;
    public static final int RULE_SQUARE_CLOSE=37;
    public static final int RULE_SQUARE_OPEN=36;
    public static final int RULE_EQUAL=43;
    public static final int RULE_COMMA=25;
    public static final int RULE_LT_EM=49;
    public static final int RULE_CURLY_CLOSE=33;
    public static final int RULE_ZERO=29;
    public static final int RULE_DBL_GT_EM=52;
    public static final int Term=18;
    public static final int RULE_COLON=31;
    public static final int RULE_LT=45;
    public static final int Active=12;
    public static final int RULE_ML_COMMENT=57;
    public static final int RULE_LTE=54;
    public static final int Description=8;
    public static final int RULE_STRING=59;
    public static final int RULE_REVERSED=23;
    public static final int Match=16;
    public static final int RULE_SL_COMMENT=58;
    public static final int RULE_CLOSE_DOUBLE_BRACES=21;
    public static final int PreferredIn=9;
    public static final int RULE_HASH=55;
    public static final int RULE_DASH=39;
    public static final int RULE_PLUS=38;
    public static final int Exact=14;
    public static final int RULE_DOT=41;
    public static final int EOF=-1;
    public static final int RULE_GT_EM=51;
    public static final int RULE_WS=56;
    public static final int RULE_EXCLUSION=28;
    public static final int RULE_OPEN_DOUBLE_BRACES=20;
    public static final int RULE_CARET=40;
    public static final int RULE_CONJUNCTION=26;
    public static final int RULE_WILDCARD=42;
    public static final int RULE_DISJUNCTION=27;
    public static final int LanguageRefSetId=5;
    public static final int RULE_TERM_STRING=22;
    public static final int RULE_DBL_LT_EM=50;
    public static final int CaseSignificanceId=4;

    // delegates
    // delegators


        public InternalQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQLParser.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private QLGrammarAccess grammarAccess;

        public InternalQLParser(TokenStream input, QLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Query";
       	}

       	@Override
       	protected QLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleQuery"
    // InternalQLParser.g:76:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalQLParser.g:76:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalQLParser.g:77:2: iv_ruleQuery= ruleQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuery; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalQLParser.g:83:1: ruleQuery returns [EObject current=null] : ( () ( (lv_query_1_0= ruleQueryConstraint ) )? ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_query_1_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:89:2: ( ( () ( (lv_query_1_0= ruleQueryConstraint ) )? ) )
            // InternalQLParser.g:90:2: ( () ( (lv_query_1_0= ruleQueryConstraint ) )? )
            {
            // InternalQLParser.g:90:2: ( () ( (lv_query_1_0= ruleQueryConstraint ) )? )
            // InternalQLParser.g:91:3: () ( (lv_query_1_0= ruleQueryConstraint ) )?
            {
            // InternalQLParser.g:91:3: ()
            // InternalQLParser.g:92:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getQueryAccess().getQueryAction_0(),
              					current);
              			
            }

            }

            // InternalQLParser.g:101:3: ( (lv_query_1_0= ruleQueryConstraint ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_OPEN_DOUBLE_BRACES||(LA1_0>=RULE_COMMA && LA1_0<=RULE_EXCLUSION)||LA1_0==RULE_DIGIT_NONZERO||LA1_0==RULE_ROUND_OPEN||LA1_0==RULE_CARET||LA1_0==RULE_WILDCARD||(LA1_0>=RULE_LT && LA1_0<=RULE_DBL_GT_EM)) ) {
                alt1=1;
            }
            else if ( (LA1_0==EOF) ) {
                int LA1_2 = input.LA(2);

                if ( (synpred1_InternalQLParser()) ) {
                    alt1=1;
                }
            }
            switch (alt1) {
                case 1 :
                    // InternalQLParser.g:102:4: (lv_query_1_0= ruleQueryConstraint )
                    {
                    // InternalQLParser.g:102:4: (lv_query_1_0= ruleQueryConstraint )
                    // InternalQLParser.g:103:5: lv_query_1_0= ruleQueryConstraint
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getQueryAccess().getQueryQueryConstraintParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_query_1_0=ruleQueryConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getQueryRule());
                      					}
                      					set(
                      						current,
                      						"query",
                      						lv_query_1_0,
                      						"com.b2international.snomed.ql.QL.QueryConstraint");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleQueryConstraint"
    // InternalQLParser.g:124:1: entryRuleQueryConstraint returns [EObject current=null] : iv_ruleQueryConstraint= ruleQueryConstraint EOF ;
    public final EObject entryRuleQueryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryConstraint = null;


        try {
            // InternalQLParser.g:124:56: (iv_ruleQueryConstraint= ruleQueryConstraint EOF )
            // InternalQLParser.g:125:2: iv_ruleQueryConstraint= ruleQueryConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueryConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQueryConstraint=ruleQueryConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQueryConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQueryConstraint"


    // $ANTLR start "ruleQueryConstraint"
    // InternalQLParser.g:131:1: ruleQueryConstraint returns [EObject current=null] : this_QueryDisjunction_0= ruleQueryDisjunction ;
    public final EObject ruleQueryConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_QueryDisjunction_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:137:2: (this_QueryDisjunction_0= ruleQueryDisjunction )
            // InternalQLParser.g:138:2: this_QueryDisjunction_0= ruleQueryDisjunction
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getQueryConstraintAccess().getQueryDisjunctionParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_QueryDisjunction_0=ruleQueryDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_QueryDisjunction_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQueryConstraint"


    // $ANTLR start "entryRuleQueryDisjunction"
    // InternalQLParser.g:152:1: entryRuleQueryDisjunction returns [EObject current=null] : iv_ruleQueryDisjunction= ruleQueryDisjunction EOF ;
    public final EObject entryRuleQueryDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryDisjunction = null;


        try {
            // InternalQLParser.g:152:57: (iv_ruleQueryDisjunction= ruleQueryDisjunction EOF )
            // InternalQLParser.g:153:2: iv_ruleQueryDisjunction= ruleQueryDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueryDisjunctionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQueryDisjunction=ruleQueryDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQueryDisjunction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQueryDisjunction"


    // $ANTLR start "ruleQueryDisjunction"
    // InternalQLParser.g:159:1: ruleQueryDisjunction returns [EObject current=null] : (this_QueryConjunction_0= ruleQueryConjunction ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleQueryConjunction ) ) )* ) ;
    public final EObject ruleQueryDisjunction() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_QueryConjunction_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:165:2: ( (this_QueryConjunction_0= ruleQueryConjunction ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleQueryConjunction ) ) )* ) )
            // InternalQLParser.g:166:2: (this_QueryConjunction_0= ruleQueryConjunction ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleQueryConjunction ) ) )* )
            {
            // InternalQLParser.g:166:2: (this_QueryConjunction_0= ruleQueryConjunction ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleQueryConjunction ) ) )* )
            // InternalQLParser.g:167:3: this_QueryConjunction_0= ruleQueryConjunction ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleQueryConjunction ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQueryDisjunctionAccess().getQueryConjunctionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_3);
            this_QueryConjunction_0=ruleQueryConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_QueryConjunction_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalQLParser.g:178:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleQueryConjunction ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_DISJUNCTION) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalQLParser.g:179:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleQueryConjunction ) )
            	    {
            	    // InternalQLParser.g:179:4: ()
            	    // InternalQLParser.g:180:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getQueryDisjunctionAccess().getQueryDisjunctionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DISJUNCTION_2, grammarAccess.getQueryDisjunctionAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalQLParser.g:193:4: ( (lv_right_3_0= ruleQueryConjunction ) )
            	    // InternalQLParser.g:194:5: (lv_right_3_0= ruleQueryConjunction )
            	    {
            	    // InternalQLParser.g:194:5: (lv_right_3_0= ruleQueryConjunction )
            	    // InternalQLParser.g:195:6: lv_right_3_0= ruleQueryConjunction
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getQueryDisjunctionAccess().getRightQueryConjunctionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_right_3_0=ruleQueryConjunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getQueryDisjunctionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"com.b2international.snomed.ql.QL.QueryConjunction");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQueryDisjunction"


    // $ANTLR start "entryRuleQueryConjunction"
    // InternalQLParser.g:217:1: entryRuleQueryConjunction returns [EObject current=null] : iv_ruleQueryConjunction= ruleQueryConjunction EOF ;
    public final EObject entryRuleQueryConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryConjunction = null;


        try {
            // InternalQLParser.g:217:57: (iv_ruleQueryConjunction= ruleQueryConjunction EOF )
            // InternalQLParser.g:218:2: iv_ruleQueryConjunction= ruleQueryConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueryConjunctionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQueryConjunction=ruleQueryConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQueryConjunction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQueryConjunction"


    // $ANTLR start "ruleQueryConjunction"
    // InternalQLParser.g:224:1: ruleQueryConjunction returns [EObject current=null] : (this_QueryExclusion_0= ruleQueryExclusion ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleQueryExclusion ) ) )* ) ;
    public final EObject ruleQueryConjunction() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        Token this_COMMA_3=null;
        EObject this_QueryExclusion_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:230:2: ( (this_QueryExclusion_0= ruleQueryExclusion ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleQueryExclusion ) ) )* ) )
            // InternalQLParser.g:231:2: (this_QueryExclusion_0= ruleQueryExclusion ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleQueryExclusion ) ) )* )
            {
            // InternalQLParser.g:231:2: (this_QueryExclusion_0= ruleQueryExclusion ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleQueryExclusion ) ) )* )
            // InternalQLParser.g:232:3: this_QueryExclusion_0= ruleQueryExclusion ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleQueryExclusion ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQueryConjunctionAccess().getQueryExclusionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_5);
            this_QueryExclusion_0=ruleQueryExclusion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_QueryExclusion_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalQLParser.g:243:3: ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleQueryExclusion ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_COMMA && LA4_0<=RULE_CONJUNCTION)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalQLParser.g:244:4: () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleQueryExclusion ) )
            	    {
            	    // InternalQLParser.g:244:4: ()
            	    // InternalQLParser.g:245:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getQueryConjunctionAccess().getQueryConjunctionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalQLParser.g:254:4: (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==RULE_CONJUNCTION) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==RULE_COMMA) ) {
            	        alt3=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalQLParser.g:255:5: this_CONJUNCTION_2= RULE_CONJUNCTION
            	            {
            	            this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_CONJUNCTION_2, grammarAccess.getQueryConjunctionAccess().getCONJUNCTIONTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalQLParser.g:260:5: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_COMMA_3, grammarAccess.getQueryConjunctionAccess().getCOMMATerminalRuleCall_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalQLParser.g:265:4: ( (lv_right_4_0= ruleQueryExclusion ) )
            	    // InternalQLParser.g:266:5: (lv_right_4_0= ruleQueryExclusion )
            	    {
            	    // InternalQLParser.g:266:5: (lv_right_4_0= ruleQueryExclusion )
            	    // InternalQLParser.g:267:6: lv_right_4_0= ruleQueryExclusion
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getQueryConjunctionAccess().getRightQueryExclusionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_right_4_0=ruleQueryExclusion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getQueryConjunctionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_4_0,
            	      							"com.b2international.snomed.ql.QL.QueryExclusion");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQueryConjunction"


    // $ANTLR start "entryRuleQueryExclusion"
    // InternalQLParser.g:289:1: entryRuleQueryExclusion returns [EObject current=null] : iv_ruleQueryExclusion= ruleQueryExclusion EOF ;
    public final EObject entryRuleQueryExclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryExclusion = null;


        try {
            // InternalQLParser.g:289:55: (iv_ruleQueryExclusion= ruleQueryExclusion EOF )
            // InternalQLParser.g:290:2: iv_ruleQueryExclusion= ruleQueryExclusion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueryExclusionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQueryExclusion=ruleQueryExclusion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQueryExclusion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQueryExclusion"


    // $ANTLR start "ruleQueryExclusion"
    // InternalQLParser.g:296:1: ruleQueryExclusion returns [EObject current=null] : (this_SubQuery_0= ruleSubQuery ( () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= ruleSubQuery ) ) )? ) ;
    public final EObject ruleQueryExclusion() throws RecognitionException {
        EObject current = null;

        Token this_EXCLUSION_2=null;
        EObject this_SubQuery_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:302:2: ( (this_SubQuery_0= ruleSubQuery ( () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= ruleSubQuery ) ) )? ) )
            // InternalQLParser.g:303:2: (this_SubQuery_0= ruleSubQuery ( () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= ruleSubQuery ) ) )? )
            {
            // InternalQLParser.g:303:2: (this_SubQuery_0= ruleSubQuery ( () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= ruleSubQuery ) ) )? )
            // InternalQLParser.g:304:3: this_SubQuery_0= ruleSubQuery ( () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= ruleSubQuery ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQueryExclusionAccess().getSubQueryParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_6);
            this_SubQuery_0=ruleSubQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SubQuery_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalQLParser.g:315:3: ( () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= ruleSubQuery ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_EXCLUSION) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQLParser.g:316:4: () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= ruleSubQuery ) )
                    {
                    // InternalQLParser.g:316:4: ()
                    // InternalQLParser.g:317:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getQueryExclusionAccess().getQueryExclusionLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    this_EXCLUSION_2=(Token)match(input,RULE_EXCLUSION,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_EXCLUSION_2, grammarAccess.getQueryExclusionAccess().getEXCLUSIONTerminalRuleCall_1_1());
                      			
                    }
                    // InternalQLParser.g:330:4: ( (lv_right_3_0= ruleSubQuery ) )
                    // InternalQLParser.g:331:5: (lv_right_3_0= ruleSubQuery )
                    {
                    // InternalQLParser.g:331:5: (lv_right_3_0= ruleSubQuery )
                    // InternalQLParser.g:332:6: lv_right_3_0= ruleSubQuery
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getQueryExclusionAccess().getRightSubQueryParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_right_3_0=ruleSubQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getQueryExclusionRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"com.b2international.snomed.ql.QL.SubQuery");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQueryExclusion"


    // $ANTLR start "entryRuleSubQuery"
    // InternalQLParser.g:354:1: entryRuleSubQuery returns [EObject current=null] : iv_ruleSubQuery= ruleSubQuery EOF ;
    public final EObject entryRuleSubQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubQuery = null;


        try {
            // InternalQLParser.g:354:49: (iv_ruleSubQuery= ruleSubQuery EOF )
            // InternalQLParser.g:355:2: iv_ruleSubQuery= ruleSubQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubQueryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubQuery=ruleSubQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubQuery; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubQuery"


    // $ANTLR start "ruleSubQuery"
    // InternalQLParser.g:361:1: ruleSubQuery returns [EObject current=null] : (this_DomainQuery_0= ruleDomainQuery | this_NestedQuery_1= ruleNestedQuery ) ;
    public final EObject ruleSubQuery() throws RecognitionException {
        EObject current = null;

        EObject this_DomainQuery_0 = null;

        EObject this_NestedQuery_1 = null;



        	enterRule();

        try {
            // InternalQLParser.g:367:2: ( (this_DomainQuery_0= ruleDomainQuery | this_NestedQuery_1= ruleNestedQuery ) )
            // InternalQLParser.g:368:2: (this_DomainQuery_0= ruleDomainQuery | this_NestedQuery_1= ruleNestedQuery )
            {
            // InternalQLParser.g:368:2: (this_DomainQuery_0= ruleDomainQuery | this_NestedQuery_1= ruleNestedQuery )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalQLParser.g:369:3: this_DomainQuery_0= ruleDomainQuery
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubQueryAccess().getDomainQueryParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DomainQuery_0=ruleDomainQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DomainQuery_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalQLParser.g:381:3: this_NestedQuery_1= ruleNestedQuery
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubQueryAccess().getNestedQueryParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedQuery_1=ruleNestedQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedQuery_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSubQuery"


    // $ANTLR start "entryRuleDomainQuery"
    // InternalQLParser.g:396:1: entryRuleDomainQuery returns [EObject current=null] : iv_ruleDomainQuery= ruleDomainQuery EOF ;
    public final EObject entryRuleDomainQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainQuery = null;


        try {
            // InternalQLParser.g:396:52: (iv_ruleDomainQuery= ruleDomainQuery EOF )
            // InternalQLParser.g:397:2: iv_ruleDomainQuery= ruleDomainQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainQueryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDomainQuery=ruleDomainQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainQuery; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDomainQuery"


    // $ANTLR start "ruleDomainQuery"
    // InternalQLParser.g:403:1: ruleDomainQuery returns [EObject current=null] : ( () ( (lv_ecl_1_0= ruleExpressionConstraint ) )? (this_OPEN_DOUBLE_BRACES_2= RULE_OPEN_DOUBLE_BRACES ( (lv_filter_3_0= ruleFilter ) ) this_CLOSE_DOUBLE_BRACES_4= RULE_CLOSE_DOUBLE_BRACES )? ) ;
    public final EObject ruleDomainQuery() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_DOUBLE_BRACES_2=null;
        Token this_CLOSE_DOUBLE_BRACES_4=null;
        EObject lv_ecl_1_0 = null;

        EObject lv_filter_3_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:409:2: ( ( () ( (lv_ecl_1_0= ruleExpressionConstraint ) )? (this_OPEN_DOUBLE_BRACES_2= RULE_OPEN_DOUBLE_BRACES ( (lv_filter_3_0= ruleFilter ) ) this_CLOSE_DOUBLE_BRACES_4= RULE_CLOSE_DOUBLE_BRACES )? ) )
            // InternalQLParser.g:410:2: ( () ( (lv_ecl_1_0= ruleExpressionConstraint ) )? (this_OPEN_DOUBLE_BRACES_2= RULE_OPEN_DOUBLE_BRACES ( (lv_filter_3_0= ruleFilter ) ) this_CLOSE_DOUBLE_BRACES_4= RULE_CLOSE_DOUBLE_BRACES )? )
            {
            // InternalQLParser.g:410:2: ( () ( (lv_ecl_1_0= ruleExpressionConstraint ) )? (this_OPEN_DOUBLE_BRACES_2= RULE_OPEN_DOUBLE_BRACES ( (lv_filter_3_0= ruleFilter ) ) this_CLOSE_DOUBLE_BRACES_4= RULE_CLOSE_DOUBLE_BRACES )? )
            // InternalQLParser.g:411:3: () ( (lv_ecl_1_0= ruleExpressionConstraint ) )? (this_OPEN_DOUBLE_BRACES_2= RULE_OPEN_DOUBLE_BRACES ( (lv_filter_3_0= ruleFilter ) ) this_CLOSE_DOUBLE_BRACES_4= RULE_CLOSE_DOUBLE_BRACES )?
            {
            // InternalQLParser.g:411:3: ()
            // InternalQLParser.g:412:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDomainQueryAccess().getDomainQueryAction_0(),
              					current);
              			
            }

            }

            // InternalQLParser.g:421:3: ( (lv_ecl_1_0= ruleExpressionConstraint ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_DIGIT_NONZERO||LA7_0==RULE_ROUND_OPEN||LA7_0==RULE_CARET||LA7_0==RULE_WILDCARD||(LA7_0>=RULE_LT && LA7_0<=RULE_DBL_GT_EM)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalQLParser.g:422:4: (lv_ecl_1_0= ruleExpressionConstraint )
                    {
                    // InternalQLParser.g:422:4: (lv_ecl_1_0= ruleExpressionConstraint )
                    // InternalQLParser.g:423:5: lv_ecl_1_0= ruleExpressionConstraint
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDomainQueryAccess().getEclExpressionConstraintParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_ecl_1_0=ruleExpressionConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDomainQueryRule());
                      					}
                      					set(
                      						current,
                      						"ecl",
                      						lv_ecl_1_0,
                      						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalQLParser.g:440:3: (this_OPEN_DOUBLE_BRACES_2= RULE_OPEN_DOUBLE_BRACES ( (lv_filter_3_0= ruleFilter ) ) this_CLOSE_DOUBLE_BRACES_4= RULE_CLOSE_DOUBLE_BRACES )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_OPEN_DOUBLE_BRACES) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalQLParser.g:441:4: this_OPEN_DOUBLE_BRACES_2= RULE_OPEN_DOUBLE_BRACES ( (lv_filter_3_0= ruleFilter ) ) this_CLOSE_DOUBLE_BRACES_4= RULE_CLOSE_DOUBLE_BRACES
                    {
                    this_OPEN_DOUBLE_BRACES_2=(Token)match(input,RULE_OPEN_DOUBLE_BRACES,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OPEN_DOUBLE_BRACES_2, grammarAccess.getDomainQueryAccess().getOPEN_DOUBLE_BRACESTerminalRuleCall_2_0());
                      			
                    }
                    // InternalQLParser.g:445:4: ( (lv_filter_3_0= ruleFilter ) )
                    // InternalQLParser.g:446:5: (lv_filter_3_0= ruleFilter )
                    {
                    // InternalQLParser.g:446:5: (lv_filter_3_0= ruleFilter )
                    // InternalQLParser.g:447:6: lv_filter_3_0= ruleFilter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDomainQueryAccess().getFilterFilterParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_9);
                    lv_filter_3_0=ruleFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDomainQueryRule());
                      						}
                      						set(
                      							current,
                      							"filter",
                      							lv_filter_3_0,
                      							"com.b2international.snomed.ql.QL.Filter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    this_CLOSE_DOUBLE_BRACES_4=(Token)match(input,RULE_CLOSE_DOUBLE_BRACES,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_CLOSE_DOUBLE_BRACES_4, grammarAccess.getDomainQueryAccess().getCLOSE_DOUBLE_BRACESTerminalRuleCall_2_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDomainQuery"


    // $ANTLR start "entryRuleNestedQuery"
    // InternalQLParser.g:473:1: entryRuleNestedQuery returns [EObject current=null] : iv_ruleNestedQuery= ruleNestedQuery EOF ;
    public final EObject entryRuleNestedQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedQuery = null;


        try {
            // InternalQLParser.g:473:52: (iv_ruleNestedQuery= ruleNestedQuery EOF )
            // InternalQLParser.g:474:2: iv_ruleNestedQuery= ruleNestedQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedQueryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedQuery=ruleNestedQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedQuery; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNestedQuery"


    // $ANTLR start "ruleNestedQuery"
    // InternalQLParser.g:480:1: ruleNestedQuery returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleQueryConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedQuery() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:486:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleQueryConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalQLParser.g:487:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleQueryConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalQLParser.g:487:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleQueryConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalQLParser.g:488:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleQueryConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedQueryAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:492:3: ( (lv_nested_1_0= ruleQueryConstraint ) )
            // InternalQLParser.g:493:4: (lv_nested_1_0= ruleQueryConstraint )
            {
            // InternalQLParser.g:493:4: (lv_nested_1_0= ruleQueryConstraint )
            // InternalQLParser.g:494:5: lv_nested_1_0= ruleQueryConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedQueryAccess().getNestedQueryConstraintParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_nested_1_0=ruleQueryConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNestedQueryRule());
              					}
              					set(
              						current,
              						"nested",
              						lv_nested_1_0,
              						"com.b2international.snomed.ql.QL.QueryConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedQueryAccess().getROUND_CLOSETerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNestedQuery"


    // $ANTLR start "entryRuleFilter"
    // InternalQLParser.g:519:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalQLParser.g:519:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalQLParser.g:520:2: iv_ruleFilter= ruleFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalQLParser.g:526:1: ruleFilter returns [EObject current=null] : this_DisjunctionFilter_0= ruleDisjunctionFilter ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        EObject this_DisjunctionFilter_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:532:2: (this_DisjunctionFilter_0= ruleDisjunctionFilter )
            // InternalQLParser.g:533:2: this_DisjunctionFilter_0= ruleDisjunctionFilter
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getFilterAccess().getDisjunctionFilterParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_DisjunctionFilter_0=ruleDisjunctionFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_DisjunctionFilter_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleDisjunctionFilter"
    // InternalQLParser.g:547:1: entryRuleDisjunctionFilter returns [EObject current=null] : iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF ;
    public final EObject entryRuleDisjunctionFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunctionFilter = null;


        try {
            // InternalQLParser.g:547:58: (iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF )
            // InternalQLParser.g:548:2: iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDisjunctionFilter=ruleDisjunctionFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunctionFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDisjunctionFilter"


    // $ANTLR start "ruleDisjunctionFilter"
    // InternalQLParser.g:554:1: ruleDisjunctionFilter returns [EObject current=null] : (this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) ) )* ) ;
    public final EObject ruleDisjunctionFilter() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_ConjunctionFilter_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:560:2: ( (this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) ) )* ) )
            // InternalQLParser.g:561:2: (this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) ) )* )
            {
            // InternalQLParser.g:561:2: (this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) ) )* )
            // InternalQLParser.g:562:3: this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDisjunctionFilterAccess().getConjunctionFilterParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_3);
            this_ConjunctionFilter_0=ruleConjunctionFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConjunctionFilter_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalQLParser.g:573:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_DISJUNCTION) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalQLParser.g:574:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) )
            	    {
            	    // InternalQLParser.g:574:4: ()
            	    // InternalQLParser.g:575:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getDisjunctionFilterAccess().getDisjunctionFilterLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DISJUNCTION_2, grammarAccess.getDisjunctionFilterAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalQLParser.g:588:4: ( (lv_right_3_0= ruleConjunctionFilter ) )
            	    // InternalQLParser.g:589:5: (lv_right_3_0= ruleConjunctionFilter )
            	    {
            	    // InternalQLParser.g:589:5: (lv_right_3_0= ruleConjunctionFilter )
            	    // InternalQLParser.g:590:6: lv_right_3_0= ruleConjunctionFilter
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDisjunctionFilterAccess().getRightConjunctionFilterParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_right_3_0=ruleConjunctionFilter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDisjunctionFilterRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"com.b2international.snomed.ql.QL.ConjunctionFilter");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDisjunctionFilter"


    // $ANTLR start "entryRuleConjunctionFilter"
    // InternalQLParser.g:612:1: entryRuleConjunctionFilter returns [EObject current=null] : iv_ruleConjunctionFilter= ruleConjunctionFilter EOF ;
    public final EObject entryRuleConjunctionFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionFilter = null;


        try {
            // InternalQLParser.g:612:58: (iv_ruleConjunctionFilter= ruleConjunctionFilter EOF )
            // InternalQLParser.g:613:2: iv_ruleConjunctionFilter= ruleConjunctionFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConjunctionFilter=ruleConjunctionFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunctionFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConjunctionFilter"


    // $ANTLR start "ruleConjunctionFilter"
    // InternalQLParser.g:619:1: ruleConjunctionFilter returns [EObject current=null] : (this_ExclusionFilter_0= ruleExclusionFilter ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionFilter ) ) )* ) ;
    public final EObject ruleConjunctionFilter() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        Token this_COMMA_3=null;
        EObject this_ExclusionFilter_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:625:2: ( (this_ExclusionFilter_0= ruleExclusionFilter ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionFilter ) ) )* ) )
            // InternalQLParser.g:626:2: (this_ExclusionFilter_0= ruleExclusionFilter ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionFilter ) ) )* )
            {
            // InternalQLParser.g:626:2: (this_ExclusionFilter_0= ruleExclusionFilter ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionFilter ) ) )* )
            // InternalQLParser.g:627:3: this_ExclusionFilter_0= ruleExclusionFilter ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionFilter ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConjunctionFilterAccess().getExclusionFilterParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_5);
            this_ExclusionFilter_0=ruleExclusionFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExclusionFilter_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalQLParser.g:638:3: ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionFilter ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_COMMA && LA11_0<=RULE_CONJUNCTION)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQLParser.g:639:4: () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionFilter ) )
            	    {
            	    // InternalQLParser.g:639:4: ()
            	    // InternalQLParser.g:640:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getConjunctionFilterAccess().getConjunctionFilterLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalQLParser.g:649:4: (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==RULE_CONJUNCTION) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==RULE_COMMA) ) {
            	        alt10=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalQLParser.g:650:5: this_CONJUNCTION_2= RULE_CONJUNCTION
            	            {
            	            this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_CONJUNCTION_2, grammarAccess.getConjunctionFilterAccess().getCONJUNCTIONTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalQLParser.g:655:5: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_COMMA_3, grammarAccess.getConjunctionFilterAccess().getCOMMATerminalRuleCall_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalQLParser.g:660:4: ( (lv_right_4_0= ruleExclusionFilter ) )
            	    // InternalQLParser.g:661:5: (lv_right_4_0= ruleExclusionFilter )
            	    {
            	    // InternalQLParser.g:661:5: (lv_right_4_0= ruleExclusionFilter )
            	    // InternalQLParser.g:662:6: lv_right_4_0= ruleExclusionFilter
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConjunctionFilterAccess().getRightExclusionFilterParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_right_4_0=ruleExclusionFilter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConjunctionFilterRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_4_0,
            	      							"com.b2international.snomed.ql.QL.ExclusionFilter");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConjunctionFilter"


    // $ANTLR start "entryRuleExclusionFilter"
    // InternalQLParser.g:684:1: entryRuleExclusionFilter returns [EObject current=null] : iv_ruleExclusionFilter= ruleExclusionFilter EOF ;
    public final EObject entryRuleExclusionFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusionFilter = null;


        try {
            // InternalQLParser.g:684:56: (iv_ruleExclusionFilter= ruleExclusionFilter EOF )
            // InternalQLParser.g:685:2: iv_ruleExclusionFilter= ruleExclusionFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExclusionFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExclusionFilter=ruleExclusionFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExclusionFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExclusionFilter"


    // $ANTLR start "ruleExclusionFilter"
    // InternalQLParser.g:691:1: ruleExclusionFilter returns [EObject current=null] : (this_PropertyFilter_0= rulePropertyFilter ( () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= rulePropertyFilter ) ) )? ) ;
    public final EObject ruleExclusionFilter() throws RecognitionException {
        EObject current = null;

        Token this_EXCLUSION_2=null;
        EObject this_PropertyFilter_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:697:2: ( (this_PropertyFilter_0= rulePropertyFilter ( () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= rulePropertyFilter ) ) )? ) )
            // InternalQLParser.g:698:2: (this_PropertyFilter_0= rulePropertyFilter ( () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= rulePropertyFilter ) ) )? )
            {
            // InternalQLParser.g:698:2: (this_PropertyFilter_0= rulePropertyFilter ( () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= rulePropertyFilter ) ) )? )
            // InternalQLParser.g:699:3: this_PropertyFilter_0= rulePropertyFilter ( () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= rulePropertyFilter ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExclusionFilterAccess().getPropertyFilterParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_6);
            this_PropertyFilter_0=rulePropertyFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PropertyFilter_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalQLParser.g:710:3: ( () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= rulePropertyFilter ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_EXCLUSION) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalQLParser.g:711:4: () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= rulePropertyFilter ) )
                    {
                    // InternalQLParser.g:711:4: ()
                    // InternalQLParser.g:712:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getExclusionFilterAccess().getExclusionFilterLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    this_EXCLUSION_2=(Token)match(input,RULE_EXCLUSION,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_EXCLUSION_2, grammarAccess.getExclusionFilterAccess().getEXCLUSIONTerminalRuleCall_1_1());
                      			
                    }
                    // InternalQLParser.g:725:4: ( (lv_right_3_0= rulePropertyFilter ) )
                    // InternalQLParser.g:726:5: (lv_right_3_0= rulePropertyFilter )
                    {
                    // InternalQLParser.g:726:5: (lv_right_3_0= rulePropertyFilter )
                    // InternalQLParser.g:727:6: lv_right_3_0= rulePropertyFilter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExclusionFilterAccess().getRightPropertyFilterParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_right_3_0=rulePropertyFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExclusionFilterRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"com.b2international.snomed.ql.QL.PropertyFilter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExclusionFilter"


    // $ANTLR start "entryRuleNestedFilter"
    // InternalQLParser.g:749:1: entryRuleNestedFilter returns [EObject current=null] : iv_ruleNestedFilter= ruleNestedFilter EOF ;
    public final EObject entryRuleNestedFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedFilter = null;


        try {
            // InternalQLParser.g:749:53: (iv_ruleNestedFilter= ruleNestedFilter EOF )
            // InternalQLParser.g:750:2: iv_ruleNestedFilter= ruleNestedFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedFilter=ruleNestedFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNestedFilter"


    // $ANTLR start "ruleNestedFilter"
    // InternalQLParser.g:756:1: ruleNestedFilter returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedFilter() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:762:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalQLParser.g:763:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalQLParser.g:763:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalQLParser.g:764:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedFilterAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:768:3: ( (lv_nested_1_0= ruleFilter ) )
            // InternalQLParser.g:769:4: (lv_nested_1_0= ruleFilter )
            {
            // InternalQLParser.g:769:4: (lv_nested_1_0= ruleFilter )
            // InternalQLParser.g:770:5: lv_nested_1_0= ruleFilter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedFilterAccess().getNestedFilterParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_nested_1_0=ruleFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNestedFilterRule());
              					}
              					set(
              						current,
              						"nested",
              						lv_nested_1_0,
              						"com.b2international.snomed.ql.QL.Filter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedFilterAccess().getROUND_CLOSETerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNestedFilter"


    // $ANTLR start "entryRulePropertyFilter"
    // InternalQLParser.g:795:1: entryRulePropertyFilter returns [EObject current=null] : iv_rulePropertyFilter= rulePropertyFilter EOF ;
    public final EObject entryRulePropertyFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyFilter = null;


        try {
            // InternalQLParser.g:795:55: (iv_rulePropertyFilter= rulePropertyFilter EOF )
            // InternalQLParser.g:796:2: iv_rulePropertyFilter= rulePropertyFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePropertyFilter=rulePropertyFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyFilter"


    // $ANTLR start "rulePropertyFilter"
    // InternalQLParser.g:802:1: rulePropertyFilter returns [EObject current=null] : (this_ActiveFilter_0= ruleActiveFilter | this_TermFilter_1= ruleTermFilter | this_PreferredInFilter_2= rulePreferredInFilter | this_AcceptableInFilter_3= ruleAcceptableInFilter | this_LanguageRefSetFilter_4= ruleLanguageRefSetFilter | this_TypeFilter_5= ruleTypeFilter | this_ModuleFilter_6= ruleModuleFilter | this_CaseSignificanceFilter_7= ruleCaseSignificanceFilter | this_LanguageCodeFilter_8= ruleLanguageCodeFilter | this_NestedFilter_9= ruleNestedFilter ) ;
    public final EObject rulePropertyFilter() throws RecognitionException {
        EObject current = null;

        EObject this_ActiveFilter_0 = null;

        EObject this_TermFilter_1 = null;

        EObject this_PreferredInFilter_2 = null;

        EObject this_AcceptableInFilter_3 = null;

        EObject this_LanguageRefSetFilter_4 = null;

        EObject this_TypeFilter_5 = null;

        EObject this_ModuleFilter_6 = null;

        EObject this_CaseSignificanceFilter_7 = null;

        EObject this_LanguageCodeFilter_8 = null;

        EObject this_NestedFilter_9 = null;



        	enterRule();

        try {
            // InternalQLParser.g:808:2: ( (this_ActiveFilter_0= ruleActiveFilter | this_TermFilter_1= ruleTermFilter | this_PreferredInFilter_2= rulePreferredInFilter | this_AcceptableInFilter_3= ruleAcceptableInFilter | this_LanguageRefSetFilter_4= ruleLanguageRefSetFilter | this_TypeFilter_5= ruleTypeFilter | this_ModuleFilter_6= ruleModuleFilter | this_CaseSignificanceFilter_7= ruleCaseSignificanceFilter | this_LanguageCodeFilter_8= ruleLanguageCodeFilter | this_NestedFilter_9= ruleNestedFilter ) )
            // InternalQLParser.g:809:2: (this_ActiveFilter_0= ruleActiveFilter | this_TermFilter_1= ruleTermFilter | this_PreferredInFilter_2= rulePreferredInFilter | this_AcceptableInFilter_3= ruleAcceptableInFilter | this_LanguageRefSetFilter_4= ruleLanguageRefSetFilter | this_TypeFilter_5= ruleTypeFilter | this_ModuleFilter_6= ruleModuleFilter | this_CaseSignificanceFilter_7= ruleCaseSignificanceFilter | this_LanguageCodeFilter_8= ruleLanguageCodeFilter | this_NestedFilter_9= ruleNestedFilter )
            {
            // InternalQLParser.g:809:2: (this_ActiveFilter_0= ruleActiveFilter | this_TermFilter_1= ruleTermFilter | this_PreferredInFilter_2= rulePreferredInFilter | this_AcceptableInFilter_3= ruleAcceptableInFilter | this_LanguageRefSetFilter_4= ruleLanguageRefSetFilter | this_TypeFilter_5= ruleTypeFilter | this_ModuleFilter_6= ruleModuleFilter | this_CaseSignificanceFilter_7= ruleCaseSignificanceFilter | this_LanguageCodeFilter_8= ruleLanguageCodeFilter | this_NestedFilter_9= ruleNestedFilter )
            int alt13=10;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalQLParser.g:810:3: this_ActiveFilter_0= ruleActiveFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getActiveFilterParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ActiveFilter_0=ruleActiveFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ActiveFilter_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalQLParser.g:822:3: this_TermFilter_1= ruleTermFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getTermFilterParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TermFilter_1=ruleTermFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TermFilter_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalQLParser.g:834:3: this_PreferredInFilter_2= rulePreferredInFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getPreferredInFilterParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PreferredInFilter_2=rulePreferredInFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PreferredInFilter_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalQLParser.g:846:3: this_AcceptableInFilter_3= ruleAcceptableInFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getAcceptableInFilterParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AcceptableInFilter_3=ruleAcceptableInFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AcceptableInFilter_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalQLParser.g:858:3: this_LanguageRefSetFilter_4= ruleLanguageRefSetFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getLanguageRefSetFilterParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LanguageRefSetFilter_4=ruleLanguageRefSetFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LanguageRefSetFilter_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalQLParser.g:870:3: this_TypeFilter_5= ruleTypeFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getTypeFilterParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypeFilter_5=ruleTypeFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeFilter_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalQLParser.g:882:3: this_ModuleFilter_6= ruleModuleFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getModuleFilterParserRuleCall_6());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ModuleFilter_6=ruleModuleFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ModuleFilter_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalQLParser.g:894:3: this_CaseSignificanceFilter_7= ruleCaseSignificanceFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getCaseSignificanceFilterParserRuleCall_7());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CaseSignificanceFilter_7=ruleCaseSignificanceFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CaseSignificanceFilter_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalQLParser.g:906:3: this_LanguageCodeFilter_8= ruleLanguageCodeFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getLanguageCodeFilterParserRuleCall_8());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LanguageCodeFilter_8=ruleLanguageCodeFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LanguageCodeFilter_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalQLParser.g:918:3: this_NestedFilter_9= ruleNestedFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getNestedFilterParserRuleCall_9());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedFilter_9=ruleNestedFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedFilter_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePropertyFilter"


    // $ANTLR start "entryRuleActiveFilter"
    // InternalQLParser.g:933:1: entryRuleActiveFilter returns [EObject current=null] : iv_ruleActiveFilter= ruleActiveFilter EOF ;
    public final EObject entryRuleActiveFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveFilter = null;


        try {
            // InternalQLParser.g:933:53: (iv_ruleActiveFilter= ruleActiveFilter EOF )
            // InternalQLParser.g:934:2: iv_ruleActiveFilter= ruleActiveFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleActiveFilter=ruleActiveFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActiveFilter"


    // $ANTLR start "ruleActiveFilter"
    // InternalQLParser.g:940:1: ruleActiveFilter returns [EObject current=null] : ( ( ( (lv_domain_0_0= ruleDomain ) ) this_DOT_1= RULE_DOT )? otherlv_2= Active this_EQUAL_3= RULE_EQUAL ( (lv_active_4_0= ruleBoolean ) ) ) ;
    public final EObject ruleActiveFilter() throws RecognitionException {
        EObject current = null;

        Token this_DOT_1=null;
        Token otherlv_2=null;
        Token this_EQUAL_3=null;
        Enumerator lv_domain_0_0 = null;

        AntlrDatatypeRuleToken lv_active_4_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:946:2: ( ( ( ( (lv_domain_0_0= ruleDomain ) ) this_DOT_1= RULE_DOT )? otherlv_2= Active this_EQUAL_3= RULE_EQUAL ( (lv_active_4_0= ruleBoolean ) ) ) )
            // InternalQLParser.g:947:2: ( ( ( (lv_domain_0_0= ruleDomain ) ) this_DOT_1= RULE_DOT )? otherlv_2= Active this_EQUAL_3= RULE_EQUAL ( (lv_active_4_0= ruleBoolean ) ) )
            {
            // InternalQLParser.g:947:2: ( ( ( (lv_domain_0_0= ruleDomain ) ) this_DOT_1= RULE_DOT )? otherlv_2= Active this_EQUAL_3= RULE_EQUAL ( (lv_active_4_0= ruleBoolean ) ) )
            // InternalQLParser.g:948:3: ( ( (lv_domain_0_0= ruleDomain ) ) this_DOT_1= RULE_DOT )? otherlv_2= Active this_EQUAL_3= RULE_EQUAL ( (lv_active_4_0= ruleBoolean ) )
            {
            // InternalQLParser.g:948:3: ( ( (lv_domain_0_0= ruleDomain ) ) this_DOT_1= RULE_DOT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Description||LA14_0==Concept) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalQLParser.g:949:4: ( (lv_domain_0_0= ruleDomain ) ) this_DOT_1= RULE_DOT
                    {
                    // InternalQLParser.g:949:4: ( (lv_domain_0_0= ruleDomain ) )
                    // InternalQLParser.g:950:5: (lv_domain_0_0= ruleDomain )
                    {
                    // InternalQLParser.g:950:5: (lv_domain_0_0= ruleDomain )
                    // InternalQLParser.g:951:6: lv_domain_0_0= ruleDomain
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getActiveFilterAccess().getDomainDomainEnumRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_domain_0_0=ruleDomain();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getActiveFilterRule());
                      						}
                      						set(
                      							current,
                      							"domain",
                      							lv_domain_0_0,
                      							"com.b2international.snomed.ql.QL.Domain");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    this_DOT_1=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DOT_1, grammarAccess.getActiveFilterAccess().getDOTTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,Active,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getActiveFilterAccess().getActiveKeyword_1());
              		
            }
            this_EQUAL_3=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_3, grammarAccess.getActiveFilterAccess().getEQUALTerminalRuleCall_2());
              		
            }
            // InternalQLParser.g:981:3: ( (lv_active_4_0= ruleBoolean ) )
            // InternalQLParser.g:982:4: (lv_active_4_0= ruleBoolean )
            {
            // InternalQLParser.g:982:4: (lv_active_4_0= ruleBoolean )
            // InternalQLParser.g:983:5: lv_active_4_0= ruleBoolean
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getActiveFilterAccess().getActiveBooleanParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_active_4_0=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getActiveFilterRule());
              					}
              					set(
              						current,
              						"active",
              						lv_active_4_0,
              						"com.b2international.snomed.ecl.Ecl.Boolean");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleActiveFilter"


    // $ANTLR start "entryRuleModuleFilter"
    // InternalQLParser.g:1004:1: entryRuleModuleFilter returns [EObject current=null] : iv_ruleModuleFilter= ruleModuleFilter EOF ;
    public final EObject entryRuleModuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleFilter = null;


        try {
            // InternalQLParser.g:1004:53: (iv_ruleModuleFilter= ruleModuleFilter EOF )
            // InternalQLParser.g:1005:2: iv_ruleModuleFilter= ruleModuleFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModuleFilter=ruleModuleFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModuleFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModuleFilter"


    // $ANTLR start "ruleModuleFilter"
    // InternalQLParser.g:1011:1: ruleModuleFilter returns [EObject current=null] : ( ( ( (lv_domain_0_0= ruleDomain ) ) this_DOT_1= RULE_DOT )? otherlv_2= ModuleId this_EQUAL_3= RULE_EQUAL ( (lv_moduleId_4_0= ruleExpressionConstraint ) ) ) ;
    public final EObject ruleModuleFilter() throws RecognitionException {
        EObject current = null;

        Token this_DOT_1=null;
        Token otherlv_2=null;
        Token this_EQUAL_3=null;
        Enumerator lv_domain_0_0 = null;

        EObject lv_moduleId_4_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:1017:2: ( ( ( ( (lv_domain_0_0= ruleDomain ) ) this_DOT_1= RULE_DOT )? otherlv_2= ModuleId this_EQUAL_3= RULE_EQUAL ( (lv_moduleId_4_0= ruleExpressionConstraint ) ) ) )
            // InternalQLParser.g:1018:2: ( ( ( (lv_domain_0_0= ruleDomain ) ) this_DOT_1= RULE_DOT )? otherlv_2= ModuleId this_EQUAL_3= RULE_EQUAL ( (lv_moduleId_4_0= ruleExpressionConstraint ) ) )
            {
            // InternalQLParser.g:1018:2: ( ( ( (lv_domain_0_0= ruleDomain ) ) this_DOT_1= RULE_DOT )? otherlv_2= ModuleId this_EQUAL_3= RULE_EQUAL ( (lv_moduleId_4_0= ruleExpressionConstraint ) ) )
            // InternalQLParser.g:1019:3: ( ( (lv_domain_0_0= ruleDomain ) ) this_DOT_1= RULE_DOT )? otherlv_2= ModuleId this_EQUAL_3= RULE_EQUAL ( (lv_moduleId_4_0= ruleExpressionConstraint ) )
            {
            // InternalQLParser.g:1019:3: ( ( (lv_domain_0_0= ruleDomain ) ) this_DOT_1= RULE_DOT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Description||LA15_0==Concept) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQLParser.g:1020:4: ( (lv_domain_0_0= ruleDomain ) ) this_DOT_1= RULE_DOT
                    {
                    // InternalQLParser.g:1020:4: ( (lv_domain_0_0= ruleDomain ) )
                    // InternalQLParser.g:1021:5: (lv_domain_0_0= ruleDomain )
                    {
                    // InternalQLParser.g:1021:5: (lv_domain_0_0= ruleDomain )
                    // InternalQLParser.g:1022:6: lv_domain_0_0= ruleDomain
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModuleFilterAccess().getDomainDomainEnumRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_domain_0_0=ruleDomain();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModuleFilterRule());
                      						}
                      						set(
                      							current,
                      							"domain",
                      							lv_domain_0_0,
                      							"com.b2international.snomed.ql.QL.Domain");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    this_DOT_1=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DOT_1, grammarAccess.getModuleFilterAccess().getDOTTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,ModuleId,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getModuleFilterAccess().getModuleIdKeyword_1());
              		
            }
            this_EQUAL_3=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_3, grammarAccess.getModuleFilterAccess().getEQUALTerminalRuleCall_2());
              		
            }
            // InternalQLParser.g:1052:3: ( (lv_moduleId_4_0= ruleExpressionConstraint ) )
            // InternalQLParser.g:1053:4: (lv_moduleId_4_0= ruleExpressionConstraint )
            {
            // InternalQLParser.g:1053:4: (lv_moduleId_4_0= ruleExpressionConstraint )
            // InternalQLParser.g:1054:5: lv_moduleId_4_0= ruleExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModuleFilterAccess().getModuleIdExpressionConstraintParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_moduleId_4_0=ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModuleFilterRule());
              					}
              					set(
              						current,
              						"moduleId",
              						lv_moduleId_4_0,
              						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModuleFilter"


    // $ANTLR start "entryRuleTermFilter"
    // InternalQLParser.g:1075:1: entryRuleTermFilter returns [EObject current=null] : iv_ruleTermFilter= ruleTermFilter EOF ;
    public final EObject entryRuleTermFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermFilter = null;


        try {
            // InternalQLParser.g:1075:51: (iv_ruleTermFilter= ruleTermFilter EOF )
            // InternalQLParser.g:1076:2: iv_ruleTermFilter= ruleTermFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTermFilter=ruleTermFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTermFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTermFilter"


    // $ANTLR start "ruleTermFilter"
    // InternalQLParser.g:1082:1: ruleTermFilter returns [EObject current=null] : (otherlv_0= Term this_EQUAL_1= RULE_EQUAL ( ( (lv_lexicalSearchType_2_0= ruleLexicalSearchType ) ) this_COLON_3= RULE_COLON )? ( (lv_term_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleTermFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EQUAL_1=null;
        Token this_COLON_3=null;
        Token lv_term_4_0=null;
        Enumerator lv_lexicalSearchType_2_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:1088:2: ( (otherlv_0= Term this_EQUAL_1= RULE_EQUAL ( ( (lv_lexicalSearchType_2_0= ruleLexicalSearchType ) ) this_COLON_3= RULE_COLON )? ( (lv_term_4_0= RULE_STRING ) ) ) )
            // InternalQLParser.g:1089:2: (otherlv_0= Term this_EQUAL_1= RULE_EQUAL ( ( (lv_lexicalSearchType_2_0= ruleLexicalSearchType ) ) this_COLON_3= RULE_COLON )? ( (lv_term_4_0= RULE_STRING ) ) )
            {
            // InternalQLParser.g:1089:2: (otherlv_0= Term this_EQUAL_1= RULE_EQUAL ( ( (lv_lexicalSearchType_2_0= ruleLexicalSearchType ) ) this_COLON_3= RULE_COLON )? ( (lv_term_4_0= RULE_STRING ) ) )
            // InternalQLParser.g:1090:3: otherlv_0= Term this_EQUAL_1= RULE_EQUAL ( ( (lv_lexicalSearchType_2_0= ruleLexicalSearchType ) ) this_COLON_3= RULE_COLON )? ( (lv_term_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Term,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTermFilterAccess().getTermKeyword_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getTermFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:1098:3: ( ( (lv_lexicalSearchType_2_0= ruleLexicalSearchType ) ) this_COLON_3= RULE_COLON )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Exact||(LA16_0>=Match && LA16_0<=Regex)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalQLParser.g:1099:4: ( (lv_lexicalSearchType_2_0= ruleLexicalSearchType ) ) this_COLON_3= RULE_COLON
                    {
                    // InternalQLParser.g:1099:4: ( (lv_lexicalSearchType_2_0= ruleLexicalSearchType ) )
                    // InternalQLParser.g:1100:5: (lv_lexicalSearchType_2_0= ruleLexicalSearchType )
                    {
                    // InternalQLParser.g:1100:5: (lv_lexicalSearchType_2_0= ruleLexicalSearchType )
                    // InternalQLParser.g:1101:6: lv_lexicalSearchType_2_0= ruleLexicalSearchType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTermFilterAccess().getLexicalSearchTypeLexicalSearchTypeEnumRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
                    lv_lexicalSearchType_2_0=ruleLexicalSearchType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTermFilterRule());
                      						}
                      						set(
                      							current,
                      							"lexicalSearchType",
                      							lv_lexicalSearchType_2_0,
                      							"com.b2international.snomed.ql.QL.LexicalSearchType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    this_COLON_3=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_COLON_3, grammarAccess.getTermFilterAccess().getCOLONTerminalRuleCall_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalQLParser.g:1123:3: ( (lv_term_4_0= RULE_STRING ) )
            // InternalQLParser.g:1124:4: (lv_term_4_0= RULE_STRING )
            {
            // InternalQLParser.g:1124:4: (lv_term_4_0= RULE_STRING )
            // InternalQLParser.g:1125:5: lv_term_4_0= RULE_STRING
            {
            lv_term_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_term_4_0, grammarAccess.getTermFilterAccess().getTermSTRINGTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTermFilterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"term",
              						lv_term_4_0,
              						"com.b2international.snomed.ecl.Ecl.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTermFilter"


    // $ANTLR start "entryRulePreferredInFilter"
    // InternalQLParser.g:1145:1: entryRulePreferredInFilter returns [EObject current=null] : iv_rulePreferredInFilter= rulePreferredInFilter EOF ;
    public final EObject entryRulePreferredInFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreferredInFilter = null;


        try {
            // InternalQLParser.g:1145:58: (iv_rulePreferredInFilter= rulePreferredInFilter EOF )
            // InternalQLParser.g:1146:2: iv_rulePreferredInFilter= rulePreferredInFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreferredInFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePreferredInFilter=rulePreferredInFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreferredInFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePreferredInFilter"


    // $ANTLR start "rulePreferredInFilter"
    // InternalQLParser.g:1152:1: rulePreferredInFilter returns [EObject current=null] : (otherlv_0= PreferredIn this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) ) ;
    public final EObject rulePreferredInFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:1158:2: ( (otherlv_0= PreferredIn this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) ) )
            // InternalQLParser.g:1159:2: (otherlv_0= PreferredIn this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) )
            {
            // InternalQLParser.g:1159:2: (otherlv_0= PreferredIn this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) )
            // InternalQLParser.g:1160:3: otherlv_0= PreferredIn this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) )
            {
            otherlv_0=(Token)match(input,PreferredIn,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPreferredInFilterAccess().getPreferredInKeyword_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getPreferredInFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:1168:3: ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) )
            // InternalQLParser.g:1169:4: (lv_languageRefSetId_2_0= ruleExpressionConstraint )
            {
            // InternalQLParser.g:1169:4: (lv_languageRefSetId_2_0= ruleExpressionConstraint )
            // InternalQLParser.g:1170:5: lv_languageRefSetId_2_0= ruleExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_languageRefSetId_2_0=ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPreferredInFilterRule());
              					}
              					set(
              						current,
              						"languageRefSetId",
              						lv_languageRefSetId_2_0,
              						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePreferredInFilter"


    // $ANTLR start "entryRuleAcceptableInFilter"
    // InternalQLParser.g:1191:1: entryRuleAcceptableInFilter returns [EObject current=null] : iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF ;
    public final EObject entryRuleAcceptableInFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptableInFilter = null;


        try {
            // InternalQLParser.g:1191:59: (iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF )
            // InternalQLParser.g:1192:2: iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAcceptableInFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAcceptableInFilter=ruleAcceptableInFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAcceptableInFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAcceptableInFilter"


    // $ANTLR start "ruleAcceptableInFilter"
    // InternalQLParser.g:1198:1: ruleAcceptableInFilter returns [EObject current=null] : (otherlv_0= AcceptableIn this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) ) ;
    public final EObject ruleAcceptableInFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:1204:2: ( (otherlv_0= AcceptableIn this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) ) )
            // InternalQLParser.g:1205:2: (otherlv_0= AcceptableIn this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) )
            {
            // InternalQLParser.g:1205:2: (otherlv_0= AcceptableIn this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) )
            // InternalQLParser.g:1206:3: otherlv_0= AcceptableIn this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) )
            {
            otherlv_0=(Token)match(input,AcceptableIn,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAcceptableInFilterAccess().getAcceptableInKeyword_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getAcceptableInFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:1214:3: ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) )
            // InternalQLParser.g:1215:4: (lv_languageRefSetId_2_0= ruleExpressionConstraint )
            {
            // InternalQLParser.g:1215:4: (lv_languageRefSetId_2_0= ruleExpressionConstraint )
            // InternalQLParser.g:1216:5: lv_languageRefSetId_2_0= ruleExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_languageRefSetId_2_0=ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAcceptableInFilterRule());
              					}
              					set(
              						current,
              						"languageRefSetId",
              						lv_languageRefSetId_2_0,
              						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAcceptableInFilter"


    // $ANTLR start "entryRuleLanguageRefSetFilter"
    // InternalQLParser.g:1237:1: entryRuleLanguageRefSetFilter returns [EObject current=null] : iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF ;
    public final EObject entryRuleLanguageRefSetFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageRefSetFilter = null;


        try {
            // InternalQLParser.g:1237:61: (iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF )
            // InternalQLParser.g:1238:2: iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLanguageRefSetFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLanguageRefSetFilter=ruleLanguageRefSetFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLanguageRefSetFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLanguageRefSetFilter"


    // $ANTLR start "ruleLanguageRefSetFilter"
    // InternalQLParser.g:1244:1: ruleLanguageRefSetFilter returns [EObject current=null] : (otherlv_0= LanguageRefSetId this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) ) ;
    public final EObject ruleLanguageRefSetFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:1250:2: ( (otherlv_0= LanguageRefSetId this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) ) )
            // InternalQLParser.g:1251:2: (otherlv_0= LanguageRefSetId this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) )
            {
            // InternalQLParser.g:1251:2: (otherlv_0= LanguageRefSetId this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) )
            // InternalQLParser.g:1252:3: otherlv_0= LanguageRefSetId this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) )
            {
            otherlv_0=(Token)match(input,LanguageRefSetId,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdKeyword_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getLanguageRefSetFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:1260:3: ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) )
            // InternalQLParser.g:1261:4: (lv_languageRefSetId_2_0= ruleExpressionConstraint )
            {
            // InternalQLParser.g:1261:4: (lv_languageRefSetId_2_0= ruleExpressionConstraint )
            // InternalQLParser.g:1262:5: lv_languageRefSetId_2_0= ruleExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_languageRefSetId_2_0=ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLanguageRefSetFilterRule());
              					}
              					set(
              						current,
              						"languageRefSetId",
              						lv_languageRefSetId_2_0,
              						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLanguageRefSetFilter"


    // $ANTLR start "entryRuleTypeFilter"
    // InternalQLParser.g:1283:1: entryRuleTypeFilter returns [EObject current=null] : iv_ruleTypeFilter= ruleTypeFilter EOF ;
    public final EObject entryRuleTypeFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeFilter = null;


        try {
            // InternalQLParser.g:1283:51: (iv_ruleTypeFilter= ruleTypeFilter EOF )
            // InternalQLParser.g:1284:2: iv_ruleTypeFilter= ruleTypeFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeFilter=ruleTypeFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeFilter"


    // $ANTLR start "ruleTypeFilter"
    // InternalQLParser.g:1290:1: ruleTypeFilter returns [EObject current=null] : (otherlv_0= TypeId this_EQUAL_1= RULE_EQUAL ( (lv_type_2_0= ruleExpressionConstraint ) ) ) ;
    public final EObject ruleTypeFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EQUAL_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:1296:2: ( (otherlv_0= TypeId this_EQUAL_1= RULE_EQUAL ( (lv_type_2_0= ruleExpressionConstraint ) ) ) )
            // InternalQLParser.g:1297:2: (otherlv_0= TypeId this_EQUAL_1= RULE_EQUAL ( (lv_type_2_0= ruleExpressionConstraint ) ) )
            {
            // InternalQLParser.g:1297:2: (otherlv_0= TypeId this_EQUAL_1= RULE_EQUAL ( (lv_type_2_0= ruleExpressionConstraint ) ) )
            // InternalQLParser.g:1298:3: otherlv_0= TypeId this_EQUAL_1= RULE_EQUAL ( (lv_type_2_0= ruleExpressionConstraint ) )
            {
            otherlv_0=(Token)match(input,TypeId,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypeFilterAccess().getTypeIdKeyword_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getTypeFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:1306:3: ( (lv_type_2_0= ruleExpressionConstraint ) )
            // InternalQLParser.g:1307:4: (lv_type_2_0= ruleExpressionConstraint )
            {
            // InternalQLParser.g:1307:4: (lv_type_2_0= ruleExpressionConstraint )
            // InternalQLParser.g:1308:5: lv_type_2_0= ruleExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeFilterAccess().getTypeExpressionConstraintParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_type_2_0=ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeFilterRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeFilter"


    // $ANTLR start "entryRuleCaseSignificanceFilter"
    // InternalQLParser.g:1329:1: entryRuleCaseSignificanceFilter returns [EObject current=null] : iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF ;
    public final EObject entryRuleCaseSignificanceFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseSignificanceFilter = null;


        try {
            // InternalQLParser.g:1329:63: (iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF )
            // InternalQLParser.g:1330:2: iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseSignificanceFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCaseSignificanceFilter=ruleCaseSignificanceFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCaseSignificanceFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCaseSignificanceFilter"


    // $ANTLR start "ruleCaseSignificanceFilter"
    // InternalQLParser.g:1336:1: ruleCaseSignificanceFilter returns [EObject current=null] : (otherlv_0= CaseSignificanceId this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleExpressionConstraint ) ) ) ;
    public final EObject ruleCaseSignificanceFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EQUAL_1=null;
        EObject lv_caseSignificanceId_2_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:1342:2: ( (otherlv_0= CaseSignificanceId this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleExpressionConstraint ) ) ) )
            // InternalQLParser.g:1343:2: (otherlv_0= CaseSignificanceId this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleExpressionConstraint ) ) )
            {
            // InternalQLParser.g:1343:2: (otherlv_0= CaseSignificanceId this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleExpressionConstraint ) ) )
            // InternalQLParser.g:1344:3: otherlv_0= CaseSignificanceId this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleExpressionConstraint ) )
            {
            otherlv_0=(Token)match(input,CaseSignificanceId,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdKeyword_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getCaseSignificanceFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:1352:3: ( (lv_caseSignificanceId_2_0= ruleExpressionConstraint ) )
            // InternalQLParser.g:1353:4: (lv_caseSignificanceId_2_0= ruleExpressionConstraint )
            {
            // InternalQLParser.g:1353:4: (lv_caseSignificanceId_2_0= ruleExpressionConstraint )
            // InternalQLParser.g:1354:5: lv_caseSignificanceId_2_0= ruleExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdExpressionConstraintParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_caseSignificanceId_2_0=ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCaseSignificanceFilterRule());
              					}
              					set(
              						current,
              						"caseSignificanceId",
              						lv_caseSignificanceId_2_0,
              						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCaseSignificanceFilter"


    // $ANTLR start "entryRuleLanguageCodeFilter"
    // InternalQLParser.g:1375:1: entryRuleLanguageCodeFilter returns [EObject current=null] : iv_ruleLanguageCodeFilter= ruleLanguageCodeFilter EOF ;
    public final EObject entryRuleLanguageCodeFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageCodeFilter = null;


        try {
            // InternalQLParser.g:1375:59: (iv_ruleLanguageCodeFilter= ruleLanguageCodeFilter EOF )
            // InternalQLParser.g:1376:2: iv_ruleLanguageCodeFilter= ruleLanguageCodeFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLanguageCodeFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLanguageCodeFilter=ruleLanguageCodeFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLanguageCodeFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLanguageCodeFilter"


    // $ANTLR start "ruleLanguageCodeFilter"
    // InternalQLParser.g:1382:1: ruleLanguageCodeFilter returns [EObject current=null] : (otherlv_0= LanguageCode this_EQUAL_1= RULE_EQUAL ( (lv_languageCode_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLanguageCodeFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EQUAL_1=null;
        Token lv_languageCode_2_0=null;


        	enterRule();

        try {
            // InternalQLParser.g:1388:2: ( (otherlv_0= LanguageCode this_EQUAL_1= RULE_EQUAL ( (lv_languageCode_2_0= RULE_STRING ) ) ) )
            // InternalQLParser.g:1389:2: (otherlv_0= LanguageCode this_EQUAL_1= RULE_EQUAL ( (lv_languageCode_2_0= RULE_STRING ) ) )
            {
            // InternalQLParser.g:1389:2: (otherlv_0= LanguageCode this_EQUAL_1= RULE_EQUAL ( (lv_languageCode_2_0= RULE_STRING ) ) )
            // InternalQLParser.g:1390:3: otherlv_0= LanguageCode this_EQUAL_1= RULE_EQUAL ( (lv_languageCode_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,LanguageCode,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLanguageCodeFilterAccess().getLanguageCodeKeyword_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getLanguageCodeFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:1398:3: ( (lv_languageCode_2_0= RULE_STRING ) )
            // InternalQLParser.g:1399:4: (lv_languageCode_2_0= RULE_STRING )
            {
            // InternalQLParser.g:1399:4: (lv_languageCode_2_0= RULE_STRING )
            // InternalQLParser.g:1400:5: lv_languageCode_2_0= RULE_STRING
            {
            lv_languageCode_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_languageCode_2_0, grammarAccess.getLanguageCodeFilterAccess().getLanguageCodeSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLanguageCodeFilterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"languageCode",
              						lv_languageCode_2_0,
              						"com.b2international.snomed.ecl.Ecl.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLanguageCodeFilter"


    // $ANTLR start "entryRuleExpressionConstraint"
    // InternalQLParser.g:1420:1: entryRuleExpressionConstraint returns [EObject current=null] : iv_ruleExpressionConstraint= ruleExpressionConstraint EOF ;
    public final EObject entryRuleExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstraint = null;


        try {
            // InternalQLParser.g:1420:61: (iv_ruleExpressionConstraint= ruleExpressionConstraint EOF )
            // InternalQLParser.g:1421:2: iv_ruleExpressionConstraint= ruleExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpressionConstraint=ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionConstraint"


    // $ANTLR start "ruleExpressionConstraint"
    // InternalQLParser.g:1427:1: ruleExpressionConstraint returns [EObject current=null] : this_OrExpressionConstraint_0= ruleOrExpressionConstraint ;
    public final EObject ruleExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpressionConstraint_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:1433:2: (this_OrExpressionConstraint_0= ruleOrExpressionConstraint )
            // InternalQLParser.g:1434:2: this_OrExpressionConstraint_0= ruleOrExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionConstraintAccess().getOrExpressionConstraintParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_OrExpressionConstraint_0=ruleOrExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_OrExpressionConstraint_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionConstraint"


    // $ANTLR start "entryRuleOrExpressionConstraint"
    // InternalQLParser.g:1448:1: entryRuleOrExpressionConstraint returns [EObject current=null] : iv_ruleOrExpressionConstraint= ruleOrExpressionConstraint EOF ;
    public final EObject entryRuleOrExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpressionConstraint = null;


        try {
            // InternalQLParser.g:1448:63: (iv_ruleOrExpressionConstraint= ruleOrExpressionConstraint EOF )
            // InternalQLParser.g:1449:2: iv_ruleOrExpressionConstraint= ruleOrExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOrExpressionConstraint=ruleOrExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrExpressionConstraint"


    // $ANTLR start "ruleOrExpressionConstraint"
    // InternalQLParser.g:1455:1: ruleOrExpressionConstraint returns [EObject current=null] : (this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )* ) ;
    public final EObject ruleOrExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_AndExpressionConstraint_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:1461:2: ( (this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )* ) )
            // InternalQLParser.g:1462:2: (this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )* )
            {
            // InternalQLParser.g:1462:2: (this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )* )
            // InternalQLParser.g:1463:3: this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionConstraintAccess().getAndExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_3);
            this_AndExpressionConstraint_0=ruleAndExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalQLParser.g:1474:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // InternalQLParser.g:1475:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndExpressionConstraint ) )
            	    {
            	    // InternalQLParser.g:1475:4: ()
            	    // InternalQLParser.g:1476:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrExpressionConstraintAccess().getOrExpressionConstraintLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DISJUNCTION_2, grammarAccess.getOrExpressionConstraintAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalQLParser.g:1489:4: ( (lv_right_3_0= ruleAndExpressionConstraint ) )
            	    // InternalQLParser.g:1490:5: (lv_right_3_0= ruleAndExpressionConstraint )
            	    {
            	    // InternalQLParser.g:1490:5: (lv_right_3_0= ruleAndExpressionConstraint )
            	    // InternalQLParser.g:1491:6: lv_right_3_0= ruleAndExpressionConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionConstraintAccess().getRightAndExpressionConstraintParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_right_3_0=ruleAndExpressionConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrExpressionConstraintRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"com.b2international.snomed.ecl.Ecl.AndExpressionConstraint");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOrExpressionConstraint"


    // $ANTLR start "entryRuleAndExpressionConstraint"
    // InternalQLParser.g:1513:1: entryRuleAndExpressionConstraint returns [EObject current=null] : iv_ruleAndExpressionConstraint= ruleAndExpressionConstraint EOF ;
    public final EObject entryRuleAndExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpressionConstraint = null;


        try {
            // InternalQLParser.g:1513:64: (iv_ruleAndExpressionConstraint= ruleAndExpressionConstraint EOF )
            // InternalQLParser.g:1514:2: iv_ruleAndExpressionConstraint= ruleAndExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAndExpressionConstraint=ruleAndExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndExpressionConstraint"


    // $ANTLR start "ruleAndExpressionConstraint"
    // InternalQLParser.g:1520:1: ruleAndExpressionConstraint returns [EObject current=null] : (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )* ) ;
    public final EObject ruleAndExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        Token this_COMMA_3=null;
        EObject this_ExclusionExpressionConstraint_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:1526:2: ( (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )* ) )
            // InternalQLParser.g:1527:2: (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )* )
            {
            // InternalQLParser.g:1527:2: (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )* )
            // InternalQLParser.g:1528:3: this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionConstraintAccess().getExclusionExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_5);
            this_ExclusionExpressionConstraint_0=ruleExclusionExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExclusionExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalQLParser.g:1539:3: ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // InternalQLParser.g:1540:4: () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) )
            	    {
            	    // InternalQLParser.g:1540:4: ()
            	    // InternalQLParser.g:1541:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndExpressionConstraintAccess().getAndExpressionConstraintLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalQLParser.g:1550:4: (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==RULE_CONJUNCTION) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==RULE_COMMA) ) {
            	        alt18=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalQLParser.g:1551:5: this_CONJUNCTION_2= RULE_CONJUNCTION
            	            {
            	            this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_CONJUNCTION_2, grammarAccess.getAndExpressionConstraintAccess().getCONJUNCTIONTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalQLParser.g:1556:5: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_COMMA_3, grammarAccess.getAndExpressionConstraintAccess().getCOMMATerminalRuleCall_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalQLParser.g:1561:4: ( (lv_right_4_0= ruleExclusionExpressionConstraint ) )
            	    // InternalQLParser.g:1562:5: (lv_right_4_0= ruleExclusionExpressionConstraint )
            	    {
            	    // InternalQLParser.g:1562:5: (lv_right_4_0= ruleExclusionExpressionConstraint )
            	    // InternalQLParser.g:1563:6: lv_right_4_0= ruleExclusionExpressionConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionConstraintAccess().getRightExclusionExpressionConstraintParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_right_4_0=ruleExclusionExpressionConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndExpressionConstraintRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_4_0,
            	      							"com.b2international.snomed.ecl.Ecl.ExclusionExpressionConstraint");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAndExpressionConstraint"


    // $ANTLR start "entryRuleExclusionExpressionConstraint"
    // InternalQLParser.g:1585:1: entryRuleExclusionExpressionConstraint returns [EObject current=null] : iv_ruleExclusionExpressionConstraint= ruleExclusionExpressionConstraint EOF ;
    public final EObject entryRuleExclusionExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusionExpressionConstraint = null;


        try {
            // InternalQLParser.g:1585:70: (iv_ruleExclusionExpressionConstraint= ruleExclusionExpressionConstraint EOF )
            // InternalQLParser.g:1586:2: iv_ruleExclusionExpressionConstraint= ruleExclusionExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExclusionExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExclusionExpressionConstraint=ruleExclusionExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExclusionExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExclusionExpressionConstraint"


    // $ANTLR start "ruleExclusionExpressionConstraint"
    // InternalQLParser.g:1592:1: ruleExclusionExpressionConstraint returns [EObject current=null] : (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )? ) ;
    public final EObject ruleExclusionExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_EXCLUSION_2=null;
        EObject this_RefinedExpressionConstraint_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:1598:2: ( (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )? ) )
            // InternalQLParser.g:1599:2: (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )? )
            {
            // InternalQLParser.g:1599:2: (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )? )
            // InternalQLParser.g:1600:3: this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExclusionExpressionConstraintAccess().getRefinedExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_6);
            this_RefinedExpressionConstraint_0=ruleRefinedExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RefinedExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalQLParser.g:1611:3: ( () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalQLParser.g:1612:4: () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= ruleRefinedExpressionConstraint ) )
                    {
                    // InternalQLParser.g:1612:4: ()
                    // InternalQLParser.g:1613:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getExclusionExpressionConstraintAccess().getExclusionExpressionConstraintLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    this_EXCLUSION_2=(Token)match(input,RULE_EXCLUSION,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_EXCLUSION_2, grammarAccess.getExclusionExpressionConstraintAccess().getEXCLUSIONTerminalRuleCall_1_1());
                      			
                    }
                    // InternalQLParser.g:1626:4: ( (lv_right_3_0= ruleRefinedExpressionConstraint ) )
                    // InternalQLParser.g:1627:5: (lv_right_3_0= ruleRefinedExpressionConstraint )
                    {
                    // InternalQLParser.g:1627:5: (lv_right_3_0= ruleRefinedExpressionConstraint )
                    // InternalQLParser.g:1628:6: lv_right_3_0= ruleRefinedExpressionConstraint
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExclusionExpressionConstraintAccess().getRightRefinedExpressionConstraintParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_right_3_0=ruleRefinedExpressionConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExclusionExpressionConstraintRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"com.b2international.snomed.ecl.Ecl.RefinedExpressionConstraint");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExclusionExpressionConstraint"


    // $ANTLR start "entryRuleRefinedExpressionConstraint"
    // InternalQLParser.g:1650:1: entryRuleRefinedExpressionConstraint returns [EObject current=null] : iv_ruleRefinedExpressionConstraint= ruleRefinedExpressionConstraint EOF ;
    public final EObject entryRuleRefinedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinedExpressionConstraint = null;


        try {
            // InternalQLParser.g:1650:68: (iv_ruleRefinedExpressionConstraint= ruleRefinedExpressionConstraint EOF )
            // InternalQLParser.g:1651:2: iv_ruleRefinedExpressionConstraint= ruleRefinedExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefinedExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRefinedExpressionConstraint=ruleRefinedExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefinedExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRefinedExpressionConstraint"


    // $ANTLR start "ruleRefinedExpressionConstraint"
    // InternalQLParser.g:1657:1: ruleRefinedExpressionConstraint returns [EObject current=null] : (this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )? ) ;
    public final EObject ruleRefinedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_COLON_2=null;
        EObject this_DottedExpressionConstraint_0 = null;

        EObject lv_refinement_3_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:1663:2: ( (this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )? ) )
            // InternalQLParser.g:1664:2: (this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )? )
            {
            // InternalQLParser.g:1664:2: (this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )? )
            // InternalQLParser.g:1665:3: this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRefinedExpressionConstraintAccess().getDottedExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_20);
            this_DottedExpressionConstraint_0=ruleDottedExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DottedExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalQLParser.g:1676:3: ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_COLON) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalQLParser.g:1677:4: () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) )
                    {
                    // InternalQLParser.g:1677:4: ()
                    // InternalQLParser.g:1678:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getRefinedExpressionConstraintAccess().getRefinedExpressionConstraintConstraintAction_1_0(),
                      						current);
                      				
                    }

                    }

                    this_COLON_2=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_COLON_2, grammarAccess.getRefinedExpressionConstraintAccess().getCOLONTerminalRuleCall_1_1());
                      			
                    }
                    // InternalQLParser.g:1691:4: ( (lv_refinement_3_0= ruleEclRefinement ) )
                    // InternalQLParser.g:1692:5: (lv_refinement_3_0= ruleEclRefinement )
                    {
                    // InternalQLParser.g:1692:5: (lv_refinement_3_0= ruleEclRefinement )
                    // InternalQLParser.g:1693:6: lv_refinement_3_0= ruleEclRefinement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementEclRefinementParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_refinement_3_0=ruleEclRefinement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRefinedExpressionConstraintRule());
                      						}
                      						set(
                      							current,
                      							"refinement",
                      							lv_refinement_3_0,
                      							"com.b2international.snomed.ecl.Ecl.EclRefinement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRefinedExpressionConstraint"


    // $ANTLR start "entryRuleDottedExpressionConstraint"
    // InternalQLParser.g:1715:1: entryRuleDottedExpressionConstraint returns [EObject current=null] : iv_ruleDottedExpressionConstraint= ruleDottedExpressionConstraint EOF ;
    public final EObject entryRuleDottedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDottedExpressionConstraint = null;


        try {
            // InternalQLParser.g:1715:67: (iv_ruleDottedExpressionConstraint= ruleDottedExpressionConstraint EOF )
            // InternalQLParser.g:1716:2: iv_ruleDottedExpressionConstraint= ruleDottedExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDottedExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDottedExpressionConstraint=ruleDottedExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDottedExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDottedExpressionConstraint"


    // $ANTLR start "ruleDottedExpressionConstraint"
    // InternalQLParser.g:1722:1: ruleDottedExpressionConstraint returns [EObject current=null] : (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSubExpressionConstraint ) ) )* ) ;
    public final EObject ruleDottedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_DOT_2=null;
        EObject this_SubExpressionConstraint_0 = null;

        EObject lv_attribute_3_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:1728:2: ( (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSubExpressionConstraint ) ) )* ) )
            // InternalQLParser.g:1729:2: (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSubExpressionConstraint ) ) )* )
            {
            // InternalQLParser.g:1729:2: (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSubExpressionConstraint ) ) )* )
            // InternalQLParser.g:1730:3: this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSubExpressionConstraint ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDottedExpressionConstraintAccess().getSubExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_22);
            this_SubExpressionConstraint_0=ruleSubExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SubExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalQLParser.g:1741:3: ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSubExpressionConstraint ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_DOT) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalQLParser.g:1742:4: () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSubExpressionConstraint ) )
            	    {
            	    // InternalQLParser.g:1742:4: ()
            	    // InternalQLParser.g:1743:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getDottedExpressionConstraintAccess().getDottedExpressionConstraintConstraintAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_DOT_2=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DOT_2, grammarAccess.getDottedExpressionConstraintAccess().getDOTTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalQLParser.g:1756:4: ( (lv_attribute_3_0= ruleSubExpressionConstraint ) )
            	    // InternalQLParser.g:1757:5: (lv_attribute_3_0= ruleSubExpressionConstraint )
            	    {
            	    // InternalQLParser.g:1757:5: (lv_attribute_3_0= ruleSubExpressionConstraint )
            	    // InternalQLParser.g:1758:6: lv_attribute_3_0= ruleSubExpressionConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDottedExpressionConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    lv_attribute_3_0=ruleSubExpressionConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDottedExpressionConstraintRule());
            	      						}
            	      						set(
            	      							current,
            	      							"attribute",
            	      							lv_attribute_3_0,
            	      							"com.b2international.snomed.ecl.Ecl.SubExpressionConstraint");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDottedExpressionConstraint"


    // $ANTLR start "entryRuleSubExpressionConstraint"
    // InternalQLParser.g:1780:1: entryRuleSubExpressionConstraint returns [EObject current=null] : iv_ruleSubExpressionConstraint= ruleSubExpressionConstraint EOF ;
    public final EObject entryRuleSubExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpressionConstraint = null;


        try {
            // InternalQLParser.g:1780:64: (iv_ruleSubExpressionConstraint= ruleSubExpressionConstraint EOF )
            // InternalQLParser.g:1781:2: iv_ruleSubExpressionConstraint= ruleSubExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubExpressionConstraint=ruleSubExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubExpressionConstraint"


    // $ANTLR start "ruleSubExpressionConstraint"
    // InternalQLParser.g:1787:1: ruleSubExpressionConstraint returns [EObject current=null] : (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_EclFocusConcept_8= ruleEclFocusConcept ) ;
    public final EObject ruleSubExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_ChildOf_0 = null;

        EObject this_ChildOrSelfOf_1 = null;

        EObject this_DescendantOf_2 = null;

        EObject this_DescendantOrSelfOf_3 = null;

        EObject this_ParentOf_4 = null;

        EObject this_ParentOrSelfOf_5 = null;

        EObject this_AncestorOf_6 = null;

        EObject this_AncestorOrSelfOf_7 = null;

        EObject this_EclFocusConcept_8 = null;



        	enterRule();

        try {
            // InternalQLParser.g:1793:2: ( (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_EclFocusConcept_8= ruleEclFocusConcept ) )
            // InternalQLParser.g:1794:2: (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_EclFocusConcept_8= ruleEclFocusConcept )
            {
            // InternalQLParser.g:1794:2: (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_EclFocusConcept_8= ruleEclFocusConcept )
            int alt23=9;
            switch ( input.LA(1) ) {
            case RULE_LT_EM:
                {
                alt23=1;
                }
                break;
            case RULE_DBL_LT_EM:
                {
                alt23=2;
                }
                break;
            case RULE_LT:
                {
                alt23=3;
                }
                break;
            case RULE_DBL_LT:
                {
                alt23=4;
                }
                break;
            case RULE_GT_EM:
                {
                alt23=5;
                }
                break;
            case RULE_DBL_GT_EM:
                {
                alt23=6;
                }
                break;
            case RULE_GT:
                {
                alt23=7;
                }
                break;
            case RULE_DBL_GT:
                {
                alt23=8;
                }
                break;
            case RULE_DIGIT_NONZERO:
            case RULE_ROUND_OPEN:
            case RULE_CARET:
            case RULE_WILDCARD:
                {
                alt23=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalQLParser.g:1795:3: this_ChildOf_0= ruleChildOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getChildOfParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ChildOf_0=ruleChildOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ChildOf_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalQLParser.g:1807:3: this_ChildOrSelfOf_1= ruleChildOrSelfOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getChildOrSelfOfParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ChildOrSelfOf_1=ruleChildOrSelfOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ChildOrSelfOf_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalQLParser.g:1819:3: this_DescendantOf_2= ruleDescendantOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getDescendantOfParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DescendantOf_2=ruleDescendantOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DescendantOf_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalQLParser.g:1831:3: this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getDescendantOrSelfOfParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DescendantOrSelfOf_3=ruleDescendantOrSelfOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DescendantOrSelfOf_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalQLParser.g:1843:3: this_ParentOf_4= ruleParentOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getParentOfParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ParentOf_4=ruleParentOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParentOf_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalQLParser.g:1855:3: this_ParentOrSelfOf_5= ruleParentOrSelfOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getParentOrSelfOfParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ParentOrSelfOf_5=ruleParentOrSelfOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParentOrSelfOf_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalQLParser.g:1867:3: this_AncestorOf_6= ruleAncestorOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getAncestorOfParserRuleCall_6());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AncestorOf_6=ruleAncestorOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AncestorOf_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalQLParser.g:1879:3: this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getAncestorOrSelfOfParserRuleCall_7());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AncestorOrSelfOf_7=ruleAncestorOrSelfOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AncestorOrSelfOf_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalQLParser.g:1891:3: this_EclFocusConcept_8= ruleEclFocusConcept
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getEclFocusConceptParserRuleCall_8());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EclFocusConcept_8=ruleEclFocusConcept();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EclFocusConcept_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSubExpressionConstraint"


    // $ANTLR start "entryRuleEclFocusConcept"
    // InternalQLParser.g:1906:1: entryRuleEclFocusConcept returns [EObject current=null] : iv_ruleEclFocusConcept= ruleEclFocusConcept EOF ;
    public final EObject entryRuleEclFocusConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclFocusConcept = null;


        try {
            // InternalQLParser.g:1906:56: (iv_ruleEclFocusConcept= ruleEclFocusConcept EOF )
            // InternalQLParser.g:1907:2: iv_ruleEclFocusConcept= ruleEclFocusConcept EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEclFocusConceptRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEclFocusConcept=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEclFocusConcept; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEclFocusConcept"


    // $ANTLR start "ruleEclFocusConcept"
    // InternalQLParser.g:1913:1: ruleEclFocusConcept returns [EObject current=null] : (this_MemberOf_0= ruleMemberOf | this_EclConceptReference_1= ruleEclConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression ) ;
    public final EObject ruleEclFocusConcept() throws RecognitionException {
        EObject current = null;

        EObject this_MemberOf_0 = null;

        EObject this_EclConceptReference_1 = null;

        EObject this_Any_2 = null;

        EObject this_NestedExpression_3 = null;



        	enterRule();

        try {
            // InternalQLParser.g:1919:2: ( (this_MemberOf_0= ruleMemberOf | this_EclConceptReference_1= ruleEclConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression ) )
            // InternalQLParser.g:1920:2: (this_MemberOf_0= ruleMemberOf | this_EclConceptReference_1= ruleEclConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression )
            {
            // InternalQLParser.g:1920:2: (this_MemberOf_0= ruleMemberOf | this_EclConceptReference_1= ruleEclConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression )
            int alt24=4;
            switch ( input.LA(1) ) {
            case RULE_CARET:
                {
                alt24=1;
                }
                break;
            case RULE_DIGIT_NONZERO:
                {
                alt24=2;
                }
                break;
            case RULE_WILDCARD:
                {
                alt24=3;
                }
                break;
            case RULE_ROUND_OPEN:
                {
                alt24=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalQLParser.g:1921:3: this_MemberOf_0= ruleMemberOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getMemberOfParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MemberOf_0=ruleMemberOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MemberOf_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalQLParser.g:1933:3: this_EclConceptReference_1= ruleEclConceptReference
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getEclConceptReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EclConceptReference_1=ruleEclConceptReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EclConceptReference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalQLParser.g:1945:3: this_Any_2= ruleAny
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getAnyParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Any_2=ruleAny();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Any_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalQLParser.g:1957:3: this_NestedExpression_3= ruleNestedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getNestedExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedExpression_3=ruleNestedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEclFocusConcept"


    // $ANTLR start "entryRuleChildOf"
    // InternalQLParser.g:1972:1: entryRuleChildOf returns [EObject current=null] : iv_ruleChildOf= ruleChildOf EOF ;
    public final EObject entryRuleChildOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildOf = null;


        try {
            // InternalQLParser.g:1972:48: (iv_ruleChildOf= ruleChildOf EOF )
            // InternalQLParser.g:1973:2: iv_ruleChildOf= ruleChildOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChildOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChildOf=ruleChildOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChildOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleChildOf"


    // $ANTLR start "ruleChildOf"
    // InternalQLParser.g:1979:1: ruleChildOf returns [EObject current=null] : (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleChildOf() throws RecognitionException {
        EObject current = null;

        Token this_LT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:1985:2: ( (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalQLParser.g:1986:2: (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalQLParser.g:1986:2: (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalQLParser.g:1987:3: this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_LT_EM_0=(Token)match(input,RULE_LT_EM,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LT_EM_0, grammarAccess.getChildOfAccess().getLT_EMTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:1991:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalQLParser.g:1992:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalQLParser.g:1992:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalQLParser.g:1993:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChildOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getChildOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleChildOf"


    // $ANTLR start "entryRuleChildOrSelfOf"
    // InternalQLParser.g:2014:1: entryRuleChildOrSelfOf returns [EObject current=null] : iv_ruleChildOrSelfOf= ruleChildOrSelfOf EOF ;
    public final EObject entryRuleChildOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildOrSelfOf = null;


        try {
            // InternalQLParser.g:2014:54: (iv_ruleChildOrSelfOf= ruleChildOrSelfOf EOF )
            // InternalQLParser.g:2015:2: iv_ruleChildOrSelfOf= ruleChildOrSelfOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChildOrSelfOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChildOrSelfOf=ruleChildOrSelfOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChildOrSelfOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleChildOrSelfOf"


    // $ANTLR start "ruleChildOrSelfOf"
    // InternalQLParser.g:2021:1: ruleChildOrSelfOf returns [EObject current=null] : (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleChildOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_LT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:2027:2: ( (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalQLParser.g:2028:2: (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalQLParser.g:2028:2: (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalQLParser.g:2029:3: this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_LT_EM_0=(Token)match(input,RULE_DBL_LT_EM,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_LT_EM_0, grammarAccess.getChildOrSelfOfAccess().getDBL_LT_EMTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:2033:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalQLParser.g:2034:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalQLParser.g:2034:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalQLParser.g:2035:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChildOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getChildOrSelfOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleChildOrSelfOf"


    // $ANTLR start "entryRuleDescendantOf"
    // InternalQLParser.g:2056:1: entryRuleDescendantOf returns [EObject current=null] : iv_ruleDescendantOf= ruleDescendantOf EOF ;
    public final EObject entryRuleDescendantOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendantOf = null;


        try {
            // InternalQLParser.g:2056:53: (iv_ruleDescendantOf= ruleDescendantOf EOF )
            // InternalQLParser.g:2057:2: iv_ruleDescendantOf= ruleDescendantOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDescendantOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDescendantOf=ruleDescendantOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDescendantOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDescendantOf"


    // $ANTLR start "ruleDescendantOf"
    // InternalQLParser.g:2063:1: ruleDescendantOf returns [EObject current=null] : (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleDescendantOf() throws RecognitionException {
        EObject current = null;

        Token this_LT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:2069:2: ( (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalQLParser.g:2070:2: (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalQLParser.g:2070:2: (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalQLParser.g:2071:3: this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_LT_0=(Token)match(input,RULE_LT,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LT_0, grammarAccess.getDescendantOfAccess().getLTTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:2075:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalQLParser.g:2076:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalQLParser.g:2076:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalQLParser.g:2077:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDescendantOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDescendantOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDescendantOf"


    // $ANTLR start "entryRuleDescendantOrSelfOf"
    // InternalQLParser.g:2098:1: entryRuleDescendantOrSelfOf returns [EObject current=null] : iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF ;
    public final EObject entryRuleDescendantOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendantOrSelfOf = null;


        try {
            // InternalQLParser.g:2098:59: (iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF )
            // InternalQLParser.g:2099:2: iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDescendantOrSelfOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDescendantOrSelfOf=ruleDescendantOrSelfOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDescendantOrSelfOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDescendantOrSelfOf"


    // $ANTLR start "ruleDescendantOrSelfOf"
    // InternalQLParser.g:2105:1: ruleDescendantOrSelfOf returns [EObject current=null] : (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleDescendantOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_LT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:2111:2: ( (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalQLParser.g:2112:2: (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalQLParser.g:2112:2: (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalQLParser.g:2113:3: this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_LT_0=(Token)match(input,RULE_DBL_LT,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_LT_0, grammarAccess.getDescendantOrSelfOfAccess().getDBL_LTTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:2117:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalQLParser.g:2118:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalQLParser.g:2118:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalQLParser.g:2119:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDescendantOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDescendantOrSelfOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDescendantOrSelfOf"


    // $ANTLR start "entryRuleParentOf"
    // InternalQLParser.g:2140:1: entryRuleParentOf returns [EObject current=null] : iv_ruleParentOf= ruleParentOf EOF ;
    public final EObject entryRuleParentOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentOf = null;


        try {
            // InternalQLParser.g:2140:49: (iv_ruleParentOf= ruleParentOf EOF )
            // InternalQLParser.g:2141:2: iv_ruleParentOf= ruleParentOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParentOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParentOf=ruleParentOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParentOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParentOf"


    // $ANTLR start "ruleParentOf"
    // InternalQLParser.g:2147:1: ruleParentOf returns [EObject current=null] : (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleParentOf() throws RecognitionException {
        EObject current = null;

        Token this_GT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:2153:2: ( (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalQLParser.g:2154:2: (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalQLParser.g:2154:2: (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalQLParser.g:2155:3: this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_GT_EM_0=(Token)match(input,RULE_GT_EM,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_GT_EM_0, grammarAccess.getParentOfAccess().getGT_EMTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:2159:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalQLParser.g:2160:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalQLParser.g:2160:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalQLParser.g:2161:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParentOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParentOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParentOf"


    // $ANTLR start "entryRuleParentOrSelfOf"
    // InternalQLParser.g:2182:1: entryRuleParentOrSelfOf returns [EObject current=null] : iv_ruleParentOrSelfOf= ruleParentOrSelfOf EOF ;
    public final EObject entryRuleParentOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentOrSelfOf = null;


        try {
            // InternalQLParser.g:2182:55: (iv_ruleParentOrSelfOf= ruleParentOrSelfOf EOF )
            // InternalQLParser.g:2183:2: iv_ruleParentOrSelfOf= ruleParentOrSelfOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParentOrSelfOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParentOrSelfOf=ruleParentOrSelfOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParentOrSelfOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParentOrSelfOf"


    // $ANTLR start "ruleParentOrSelfOf"
    // InternalQLParser.g:2189:1: ruleParentOrSelfOf returns [EObject current=null] : (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleParentOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_GT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:2195:2: ( (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalQLParser.g:2196:2: (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalQLParser.g:2196:2: (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalQLParser.g:2197:3: this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_GT_EM_0=(Token)match(input,RULE_DBL_GT_EM,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_GT_EM_0, grammarAccess.getParentOrSelfOfAccess().getDBL_GT_EMTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:2201:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalQLParser.g:2202:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalQLParser.g:2202:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalQLParser.g:2203:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParentOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParentOrSelfOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParentOrSelfOf"


    // $ANTLR start "entryRuleAncestorOf"
    // InternalQLParser.g:2224:1: entryRuleAncestorOf returns [EObject current=null] : iv_ruleAncestorOf= ruleAncestorOf EOF ;
    public final EObject entryRuleAncestorOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncestorOf = null;


        try {
            // InternalQLParser.g:2224:51: (iv_ruleAncestorOf= ruleAncestorOf EOF )
            // InternalQLParser.g:2225:2: iv_ruleAncestorOf= ruleAncestorOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAncestorOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAncestorOf=ruleAncestorOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAncestorOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAncestorOf"


    // $ANTLR start "ruleAncestorOf"
    // InternalQLParser.g:2231:1: ruleAncestorOf returns [EObject current=null] : (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleAncestorOf() throws RecognitionException {
        EObject current = null;

        Token this_GT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:2237:2: ( (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalQLParser.g:2238:2: (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalQLParser.g:2238:2: (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalQLParser.g:2239:3: this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_GT_0=(Token)match(input,RULE_GT,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_GT_0, grammarAccess.getAncestorOfAccess().getGTTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:2243:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalQLParser.g:2244:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalQLParser.g:2244:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalQLParser.g:2245:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAncestorOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAncestorOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAncestorOf"


    // $ANTLR start "entryRuleAncestorOrSelfOf"
    // InternalQLParser.g:2266:1: entryRuleAncestorOrSelfOf returns [EObject current=null] : iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF ;
    public final EObject entryRuleAncestorOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncestorOrSelfOf = null;


        try {
            // InternalQLParser.g:2266:57: (iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF )
            // InternalQLParser.g:2267:2: iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAncestorOrSelfOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAncestorOrSelfOf=ruleAncestorOrSelfOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAncestorOrSelfOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAncestorOrSelfOf"


    // $ANTLR start "ruleAncestorOrSelfOf"
    // InternalQLParser.g:2273:1: ruleAncestorOrSelfOf returns [EObject current=null] : (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleAncestorOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_GT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:2279:2: ( (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalQLParser.g:2280:2: (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalQLParser.g:2280:2: (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalQLParser.g:2281:3: this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_GT_0=(Token)match(input,RULE_DBL_GT,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_GT_0, grammarAccess.getAncestorOrSelfOfAccess().getDBL_GTTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:2285:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalQLParser.g:2286:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalQLParser.g:2286:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalQLParser.g:2287:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAncestorOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAncestorOrSelfOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAncestorOrSelfOf"


    // $ANTLR start "entryRuleMemberOf"
    // InternalQLParser.g:2308:1: entryRuleMemberOf returns [EObject current=null] : iv_ruleMemberOf= ruleMemberOf EOF ;
    public final EObject entryRuleMemberOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberOf = null;


        try {
            // InternalQLParser.g:2308:49: (iv_ruleMemberOf= ruleMemberOf EOF )
            // InternalQLParser.g:2309:2: iv_ruleMemberOf= ruleMemberOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMemberOf=ruleMemberOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMemberOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMemberOf"


    // $ANTLR start "ruleMemberOf"
    // InternalQLParser.g:2315:1: ruleMemberOf returns [EObject current=null] : (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) ) ;
    public final EObject ruleMemberOf() throws RecognitionException {
        EObject current = null;

        Token this_CARET_0=null;
        EObject lv_constraint_1_1 = null;

        EObject lv_constraint_1_2 = null;

        EObject lv_constraint_1_3 = null;



        	enterRule();

        try {
            // InternalQLParser.g:2321:2: ( (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) ) )
            // InternalQLParser.g:2322:2: (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) )
            {
            // InternalQLParser.g:2322:2: (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) )
            // InternalQLParser.g:2323:3: this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) )
            {
            this_CARET_0=(Token)match(input,RULE_CARET,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CARET_0, grammarAccess.getMemberOfAccess().getCARETTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:2327:3: ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) )
            // InternalQLParser.g:2328:4: ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) )
            {
            // InternalQLParser.g:2328:4: ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) )
            // InternalQLParser.g:2329:5: (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression )
            {
            // InternalQLParser.g:2329:5: (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_DIGIT_NONZERO:
                {
                alt25=1;
                }
                break;
            case RULE_WILDCARD:
                {
                alt25=2;
                }
                break;
            case RULE_ROUND_OPEN:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalQLParser.g:2330:6: lv_constraint_1_1= ruleEclConceptReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintEclConceptReferenceParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_constraint_1_1=ruleEclConceptReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMemberOfRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_1_1,
                      							"com.b2international.snomed.ecl.Ecl.EclConceptReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalQLParser.g:2346:6: lv_constraint_1_2= ruleAny
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintAnyParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_constraint_1_2=ruleAny();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMemberOfRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_1_2,
                      							"com.b2international.snomed.ecl.Ecl.Any");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalQLParser.g:2362:6: lv_constraint_1_3= ruleNestedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintNestedExpressionParserRuleCall_1_0_2());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_constraint_1_3=ruleNestedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMemberOfRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_1_3,
                      							"com.b2international.snomed.ecl.Ecl.NestedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMemberOf"


    // $ANTLR start "entryRuleEclConceptReference"
    // InternalQLParser.g:2384:1: entryRuleEclConceptReference returns [EObject current=null] : iv_ruleEclConceptReference= ruleEclConceptReference EOF ;
    public final EObject entryRuleEclConceptReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclConceptReference = null;


        try {
            // InternalQLParser.g:2384:60: (iv_ruleEclConceptReference= ruleEclConceptReference EOF )
            // InternalQLParser.g:2385:2: iv_ruleEclConceptReference= ruleEclConceptReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEclConceptReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEclConceptReference=ruleEclConceptReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEclConceptReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEclConceptReference"


    // $ANTLR start "ruleEclConceptReference"
    // InternalQLParser.g:2391:1: ruleEclConceptReference returns [EObject current=null] : ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_TERM_STRING ) )? ) ;
    public final EObject ruleEclConceptReference() throws RecognitionException {
        EObject current = null;

        Token lv_term_1_0=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:2397:2: ( ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_TERM_STRING ) )? ) )
            // InternalQLParser.g:2398:2: ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_TERM_STRING ) )? )
            {
            // InternalQLParser.g:2398:2: ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_TERM_STRING ) )? )
            // InternalQLParser.g:2399:3: ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_TERM_STRING ) )?
            {
            // InternalQLParser.g:2399:3: ( (lv_id_0_0= ruleSnomedIdentifier ) )
            // InternalQLParser.g:2400:4: (lv_id_0_0= ruleSnomedIdentifier )
            {
            // InternalQLParser.g:2400:4: (lv_id_0_0= ruleSnomedIdentifier )
            // InternalQLParser.g:2401:5: lv_id_0_0= ruleSnomedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEclConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_23);
            lv_id_0_0=ruleSnomedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEclConceptReferenceRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_0_0,
              						"com.b2international.snomed.ecl.Ecl.SnomedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalQLParser.g:2418:3: ( (lv_term_1_0= RULE_TERM_STRING ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_TERM_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalQLParser.g:2419:4: (lv_term_1_0= RULE_TERM_STRING )
                    {
                    // InternalQLParser.g:2419:4: (lv_term_1_0= RULE_TERM_STRING )
                    // InternalQLParser.g:2420:5: lv_term_1_0= RULE_TERM_STRING
                    {
                    lv_term_1_0=(Token)match(input,RULE_TERM_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_term_1_0, grammarAccess.getEclConceptReferenceAccess().getTermTERM_STRINGTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEclConceptReferenceRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"term",
                      						lv_term_1_0,
                      						"com.b2international.snomed.ecl.Ecl.TERM_STRING");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEclConceptReference"


    // $ANTLR start "entryRuleAny"
    // InternalQLParser.g:2440:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // InternalQLParser.g:2440:44: (iv_ruleAny= ruleAny EOF )
            // InternalQLParser.g:2441:2: iv_ruleAny= ruleAny EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAny=ruleAny();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAny; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAny"


    // $ANTLR start "ruleAny"
    // InternalQLParser.g:2447:1: ruleAny returns [EObject current=null] : (this_WILDCARD_0= RULE_WILDCARD () ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token this_WILDCARD_0=null;


        	enterRule();

        try {
            // InternalQLParser.g:2453:2: ( (this_WILDCARD_0= RULE_WILDCARD () ) )
            // InternalQLParser.g:2454:2: (this_WILDCARD_0= RULE_WILDCARD () )
            {
            // InternalQLParser.g:2454:2: (this_WILDCARD_0= RULE_WILDCARD () )
            // InternalQLParser.g:2455:3: this_WILDCARD_0= RULE_WILDCARD ()
            {
            this_WILDCARD_0=(Token)match(input,RULE_WILDCARD,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_WILDCARD_0, grammarAccess.getAnyAccess().getWILDCARDTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:2459:3: ()
            // InternalQLParser.g:2460:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAnyAccess().getAnyAction_1(),
              					current);
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAny"


    // $ANTLR start "entryRuleEclRefinement"
    // InternalQLParser.g:2473:1: entryRuleEclRefinement returns [EObject current=null] : iv_ruleEclRefinement= ruleEclRefinement EOF ;
    public final EObject entryRuleEclRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclRefinement = null;


        try {
            // InternalQLParser.g:2473:54: (iv_ruleEclRefinement= ruleEclRefinement EOF )
            // InternalQLParser.g:2474:2: iv_ruleEclRefinement= ruleEclRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEclRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEclRefinement=ruleEclRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEclRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEclRefinement"


    // $ANTLR start "ruleEclRefinement"
    // InternalQLParser.g:2480:1: ruleEclRefinement returns [EObject current=null] : this_OrRefinement_0= ruleOrRefinement ;
    public final EObject ruleEclRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_OrRefinement_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:2486:2: (this_OrRefinement_0= ruleOrRefinement )
            // InternalQLParser.g:2487:2: this_OrRefinement_0= ruleOrRefinement
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getEclRefinementAccess().getOrRefinementParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_OrRefinement_0=ruleOrRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_OrRefinement_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEclRefinement"


    // $ANTLR start "entryRuleOrRefinement"
    // InternalQLParser.g:2501:1: entryRuleOrRefinement returns [EObject current=null] : iv_ruleOrRefinement= ruleOrRefinement EOF ;
    public final EObject entryRuleOrRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrRefinement = null;


        try {
            // InternalQLParser.g:2501:53: (iv_ruleOrRefinement= ruleOrRefinement EOF )
            // InternalQLParser.g:2502:2: iv_ruleOrRefinement= ruleOrRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOrRefinement=ruleOrRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrRefinement"


    // $ANTLR start "ruleOrRefinement"
    // InternalQLParser.g:2508:1: ruleOrRefinement returns [EObject current=null] : (this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION )=> ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) ) )* ) ;
    public final EObject ruleOrRefinement() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_AndRefinement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:2514:2: ( (this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION )=> ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) ) )* ) )
            // InternalQLParser.g:2515:2: (this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION )=> ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) ) )* )
            {
            // InternalQLParser.g:2515:2: (this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION )=> ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) ) )* )
            // InternalQLParser.g:2516:3: this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION )=> ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrRefinementAccess().getAndRefinementParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_3);
            this_AndRefinement_0=ruleAndRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndRefinement_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalQLParser.g:2527:3: ( ( RULE_DISJUNCTION )=> ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) ) )*
            loop27:
            do {
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // InternalQLParser.g:2528:4: ( RULE_DISJUNCTION )=> ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) )
            	    {
            	    // InternalQLParser.g:2529:4: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) )
            	    // InternalQLParser.g:2530:5: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) )
            	    {
            	    // InternalQLParser.g:2530:5: ()
            	    // InternalQLParser.g:2531:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getOrRefinementAccess().getOrRefinementLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FollowSets000.FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_DISJUNCTION_2, grammarAccess.getOrRefinementAccess().getDISJUNCTIONTerminalRuleCall_1_0_1());
            	      				
            	    }
            	    // InternalQLParser.g:2544:5: ( (lv_right_3_0= ruleAndRefinement ) )
            	    // InternalQLParser.g:2545:6: (lv_right_3_0= ruleAndRefinement )
            	    {
            	    // InternalQLParser.g:2545:6: (lv_right_3_0= ruleAndRefinement )
            	    // InternalQLParser.g:2546:7: lv_right_3_0= ruleAndRefinement
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getOrRefinementAccess().getRightAndRefinementParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_right_3_0=ruleAndRefinement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getOrRefinementRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"com.b2international.snomed.ecl.Ecl.AndRefinement");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOrRefinement"


    // $ANTLR start "entryRuleAndRefinement"
    // InternalQLParser.g:2569:1: entryRuleAndRefinement returns [EObject current=null] : iv_ruleAndRefinement= ruleAndRefinement EOF ;
    public final EObject entryRuleAndRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndRefinement = null;


        try {
            // InternalQLParser.g:2569:54: (iv_ruleAndRefinement= ruleAndRefinement EOF )
            // InternalQLParser.g:2570:2: iv_ruleAndRefinement= ruleAndRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAndRefinement=ruleAndRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndRefinement"


    // $ANTLR start "ruleAndRefinement"
    // InternalQLParser.g:2576:1: ruleAndRefinement returns [EObject current=null] : (this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION | RULE_COMMA )=> ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* ) ;
    public final EObject ruleAndRefinement() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        Token this_COMMA_3=null;
        EObject this_SubRefinement_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:2582:2: ( (this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION | RULE_COMMA )=> ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* ) )
            // InternalQLParser.g:2583:2: (this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION | RULE_COMMA )=> ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* )
            {
            // InternalQLParser.g:2583:2: (this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION | RULE_COMMA )=> ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* )
            // InternalQLParser.g:2584:3: this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION | RULE_COMMA )=> ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndRefinementAccess().getSubRefinementParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_5);
            this_SubRefinement_0=ruleSubRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SubRefinement_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalQLParser.g:2595:3: ( ( RULE_CONJUNCTION | RULE_COMMA )=> ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )*
            loop29:
            do {
                int alt29=2;
                alt29 = dfa29.predict(input);
                switch (alt29) {
            	case 1 :
            	    // InternalQLParser.g:2596:4: ( RULE_CONJUNCTION | RULE_COMMA )=> ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) )
            	    {
            	    // InternalQLParser.g:2597:4: ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) )
            	    // InternalQLParser.g:2598:5: () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) )
            	    {
            	    // InternalQLParser.g:2598:5: ()
            	    // InternalQLParser.g:2599:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getAndRefinementAccess().getAndRefinementLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalQLParser.g:2608:5: (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==RULE_CONJUNCTION) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==RULE_COMMA) ) {
            	        alt28=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalQLParser.g:2609:6: this_CONJUNCTION_2= RULE_CONJUNCTION
            	            {
            	            this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FollowSets000.FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(this_CONJUNCTION_2, grammarAccess.getAndRefinementAccess().getCONJUNCTIONTerminalRuleCall_1_0_1_0());
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalQLParser.g:2614:6: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(this_COMMA_3, grammarAccess.getAndRefinementAccess().getCOMMATerminalRuleCall_1_0_1_1());
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    // InternalQLParser.g:2619:5: ( (lv_right_4_0= ruleSubRefinement ) )
            	    // InternalQLParser.g:2620:6: (lv_right_4_0= ruleSubRefinement )
            	    {
            	    // InternalQLParser.g:2620:6: (lv_right_4_0= ruleSubRefinement )
            	    // InternalQLParser.g:2621:7: lv_right_4_0= ruleSubRefinement
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAndRefinementAccess().getRightSubRefinementParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_right_4_0=ruleSubRefinement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getAndRefinementRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_4_0,
            	      								"com.b2international.snomed.ecl.Ecl.SubRefinement");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAndRefinement"


    // $ANTLR start "entryRuleSubRefinement"
    // InternalQLParser.g:2644:1: entryRuleSubRefinement returns [EObject current=null] : iv_ruleSubRefinement= ruleSubRefinement EOF ;
    public final EObject entryRuleSubRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubRefinement = null;


        try {
            // InternalQLParser.g:2644:54: (iv_ruleSubRefinement= ruleSubRefinement EOF )
            // InternalQLParser.g:2645:2: iv_ruleSubRefinement= ruleSubRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubRefinement=ruleSubRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubRefinement"


    // $ANTLR start "ruleSubRefinement"
    // InternalQLParser.g:2651:1: ruleSubRefinement returns [EObject current=null] : (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement ) ;
    public final EObject ruleSubRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeConstraint_0 = null;

        EObject this_EclAttributeGroup_1 = null;

        EObject this_NestedRefinement_2 = null;



        	enterRule();

        try {
            // InternalQLParser.g:2657:2: ( (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement ) )
            // InternalQLParser.g:2658:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )
            {
            // InternalQLParser.g:2658:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )
            int alt30=3;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalQLParser.g:2659:3: this_AttributeConstraint_0= ruleAttributeConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubRefinementAccess().getAttributeConstraintParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AttributeConstraint_0=ruleAttributeConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AttributeConstraint_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalQLParser.g:2671:3: this_EclAttributeGroup_1= ruleEclAttributeGroup
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubRefinementAccess().getEclAttributeGroupParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EclAttributeGroup_1=ruleEclAttributeGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EclAttributeGroup_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalQLParser.g:2683:3: this_NestedRefinement_2= ruleNestedRefinement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubRefinementAccess().getNestedRefinementParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedRefinement_2=ruleNestedRefinement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedRefinement_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSubRefinement"


    // $ANTLR start "entryRuleNestedRefinement"
    // InternalQLParser.g:2698:1: entryRuleNestedRefinement returns [EObject current=null] : iv_ruleNestedRefinement= ruleNestedRefinement EOF ;
    public final EObject entryRuleNestedRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedRefinement = null;


        try {
            // InternalQLParser.g:2698:57: (iv_ruleNestedRefinement= ruleNestedRefinement EOF )
            // InternalQLParser.g:2699:2: iv_ruleNestedRefinement= ruleNestedRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedRefinement=ruleNestedRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNestedRefinement"


    // $ANTLR start "ruleNestedRefinement"
    // InternalQLParser.g:2705:1: ruleNestedRefinement returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedRefinement() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:2711:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalQLParser.g:2712:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalQLParser.g:2712:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalQLParser.g:2713:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedRefinementAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:2717:3: ( (lv_nested_1_0= ruleEclRefinement ) )
            // InternalQLParser.g:2718:4: (lv_nested_1_0= ruleEclRefinement )
            {
            // InternalQLParser.g:2718:4: (lv_nested_1_0= ruleEclRefinement )
            // InternalQLParser.g:2719:5: lv_nested_1_0= ruleEclRefinement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedRefinementAccess().getNestedEclRefinementParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_nested_1_0=ruleEclRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNestedRefinementRule());
              					}
              					set(
              						current,
              						"nested",
              						lv_nested_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclRefinement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedRefinementAccess().getROUND_CLOSETerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNestedRefinement"


    // $ANTLR start "entryRuleEclAttributeGroup"
    // InternalQLParser.g:2744:1: entryRuleEclAttributeGroup returns [EObject current=null] : iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF ;
    public final EObject entryRuleEclAttributeGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclAttributeGroup = null;


        try {
            // InternalQLParser.g:2744:58: (iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF )
            // InternalQLParser.g:2745:2: iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEclAttributeGroupRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEclAttributeGroup=ruleEclAttributeGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEclAttributeGroup; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEclAttributeGroup"


    // $ANTLR start "ruleEclAttributeGroup"
    // InternalQLParser.g:2751:1: ruleEclAttributeGroup returns [EObject current=null] : ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE ) ;
    public final EObject ruleEclAttributeGroup() throws RecognitionException {
        EObject current = null;

        Token this_CURLY_OPEN_1=null;
        Token this_CURLY_CLOSE_3=null;
        EObject lv_cardinality_0_0 = null;

        EObject lv_refinement_2_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:2757:2: ( ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE ) )
            // InternalQLParser.g:2758:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE )
            {
            // InternalQLParser.g:2758:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE )
            // InternalQLParser.g:2759:3: ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE
            {
            // InternalQLParser.g:2759:3: ( (lv_cardinality_0_0= ruleCardinality ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_SQUARE_OPEN) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalQLParser.g:2760:4: (lv_cardinality_0_0= ruleCardinality )
                    {
                    // InternalQLParser.g:2760:4: (lv_cardinality_0_0= ruleCardinality )
                    // InternalQLParser.g:2761:5: lv_cardinality_0_0= ruleCardinality
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEclAttributeGroupAccess().getCardinalityCardinalityParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_cardinality_0_0=ruleCardinality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEclAttributeGroupRule());
                      					}
                      					set(
                      						current,
                      						"cardinality",
                      						lv_cardinality_0_0,
                      						"com.b2international.snomed.ecl.Ecl.Cardinality");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            this_CURLY_OPEN_1=(Token)match(input,RULE_CURLY_OPEN,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CURLY_OPEN_1, grammarAccess.getEclAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:2782:3: ( (lv_refinement_2_0= ruleEclAttributeSet ) )
            // InternalQLParser.g:2783:4: (lv_refinement_2_0= ruleEclAttributeSet )
            {
            // InternalQLParser.g:2783:4: (lv_refinement_2_0= ruleEclAttributeSet )
            // InternalQLParser.g:2784:5: lv_refinement_2_0= ruleEclAttributeSet
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEclAttributeGroupAccess().getRefinementEclAttributeSetParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_refinement_2_0=ruleEclAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEclAttributeGroupRule());
              					}
              					set(
              						current,
              						"refinement",
              						lv_refinement_2_0,
              						"com.b2international.snomed.ecl.Ecl.EclAttributeSet");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_CURLY_CLOSE_3=(Token)match(input,RULE_CURLY_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CURLY_CLOSE_3, grammarAccess.getEclAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEclAttributeGroup"


    // $ANTLR start "entryRuleEclAttributeSet"
    // InternalQLParser.g:2809:1: entryRuleEclAttributeSet returns [EObject current=null] : iv_ruleEclAttributeSet= ruleEclAttributeSet EOF ;
    public final EObject entryRuleEclAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclAttributeSet = null;


        try {
            // InternalQLParser.g:2809:56: (iv_ruleEclAttributeSet= ruleEclAttributeSet EOF )
            // InternalQLParser.g:2810:2: iv_ruleEclAttributeSet= ruleEclAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEclAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEclAttributeSet=ruleEclAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEclAttributeSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEclAttributeSet"


    // $ANTLR start "ruleEclAttributeSet"
    // InternalQLParser.g:2816:1: ruleEclAttributeSet returns [EObject current=null] : this_OrAttributeSet_0= ruleOrAttributeSet ;
    public final EObject ruleEclAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_OrAttributeSet_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:2822:2: (this_OrAttributeSet_0= ruleOrAttributeSet )
            // InternalQLParser.g:2823:2: this_OrAttributeSet_0= ruleOrAttributeSet
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getEclAttributeSetAccess().getOrAttributeSetParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_OrAttributeSet_0=ruleOrAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_OrAttributeSet_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEclAttributeSet"


    // $ANTLR start "entryRuleOrAttributeSet"
    // InternalQLParser.g:2837:1: entryRuleOrAttributeSet returns [EObject current=null] : iv_ruleOrAttributeSet= ruleOrAttributeSet EOF ;
    public final EObject entryRuleOrAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrAttributeSet = null;


        try {
            // InternalQLParser.g:2837:55: (iv_ruleOrAttributeSet= ruleOrAttributeSet EOF )
            // InternalQLParser.g:2838:2: iv_ruleOrAttributeSet= ruleOrAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOrAttributeSet=ruleOrAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrAttributeSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrAttributeSet"


    // $ANTLR start "ruleOrAttributeSet"
    // InternalQLParser.g:2844:1: ruleOrAttributeSet returns [EObject current=null] : (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) ) )* ) ;
    public final EObject ruleOrAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_2=null;
        EObject this_AndAttributeSet_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:2850:2: ( (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) ) )* ) )
            // InternalQLParser.g:2851:2: (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) ) )* )
            {
            // InternalQLParser.g:2851:2: (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) ) )* )
            // InternalQLParser.g:2852:3: this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAttributeSetAccess().getAndAttributeSetParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_3);
            this_AndAttributeSet_0=ruleAndAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndAttributeSet_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalQLParser.g:2863:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_DISJUNCTION) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalQLParser.g:2864:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) )
            	    {
            	    // InternalQLParser.g:2864:4: ()
            	    // InternalQLParser.g:2865:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAttributeSetAccess().getOrRefinementLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FollowSets000.FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DISJUNCTION_2, grammarAccess.getOrAttributeSetAccess().getDISJUNCTIONTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalQLParser.g:2878:4: ( (lv_right_3_0= ruleAndAttributeSet ) )
            	    // InternalQLParser.g:2879:5: (lv_right_3_0= ruleAndAttributeSet )
            	    {
            	    // InternalQLParser.g:2879:5: (lv_right_3_0= ruleAndAttributeSet )
            	    // InternalQLParser.g:2880:6: lv_right_3_0= ruleAndAttributeSet
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAttributeSetAccess().getRightAndAttributeSetParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_right_3_0=ruleAndAttributeSet();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrAttributeSetRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"com.b2international.snomed.ecl.Ecl.AndAttributeSet");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOrAttributeSet"


    // $ANTLR start "entryRuleAndAttributeSet"
    // InternalQLParser.g:2902:1: entryRuleAndAttributeSet returns [EObject current=null] : iv_ruleAndAttributeSet= ruleAndAttributeSet EOF ;
    public final EObject entryRuleAndAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndAttributeSet = null;


        try {
            // InternalQLParser.g:2902:56: (iv_ruleAndAttributeSet= ruleAndAttributeSet EOF )
            // InternalQLParser.g:2903:2: iv_ruleAndAttributeSet= ruleAndAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAndAttributeSet=ruleAndAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndAttributeSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndAttributeSet"


    // $ANTLR start "ruleAndAttributeSet"
    // InternalQLParser.g:2909:1: ruleAndAttributeSet returns [EObject current=null] : (this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* ) ;
    public final EObject ruleAndAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_2=null;
        Token this_COMMA_3=null;
        EObject this_SubAttributeSet_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:2915:2: ( (this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* ) )
            // InternalQLParser.g:2916:2: (this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* )
            {
            // InternalQLParser.g:2916:2: (this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* )
            // InternalQLParser.g:2917:3: this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAttributeSetAccess().getSubAttributeSetParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_5);
            this_SubAttributeSet_0=ruleSubAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SubAttributeSet_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalQLParser.g:2928:3: ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_COMMA && LA34_0<=RULE_CONJUNCTION)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalQLParser.g:2929:4: () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) )
            	    {
            	    // InternalQLParser.g:2929:4: ()
            	    // InternalQLParser.g:2930:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAttributeSetAccess().getAndRefinementLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalQLParser.g:2939:4: (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==RULE_CONJUNCTION) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==RULE_COMMA) ) {
            	        alt33=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalQLParser.g:2940:5: this_CONJUNCTION_2= RULE_CONJUNCTION
            	            {
            	            this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FollowSets000.FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_CONJUNCTION_2, grammarAccess.getAndAttributeSetAccess().getCONJUNCTIONTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalQLParser.g:2945:5: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_COMMA_3, grammarAccess.getAndAttributeSetAccess().getCOMMATerminalRuleCall_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalQLParser.g:2950:4: ( (lv_right_4_0= ruleSubAttributeSet ) )
            	    // InternalQLParser.g:2951:5: (lv_right_4_0= ruleSubAttributeSet )
            	    {
            	    // InternalQLParser.g:2951:5: (lv_right_4_0= ruleSubAttributeSet )
            	    // InternalQLParser.g:2952:6: lv_right_4_0= ruleSubAttributeSet
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAttributeSetAccess().getRightSubAttributeSetParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_right_4_0=ruleSubAttributeSet();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndAttributeSetRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_4_0,
            	      							"com.b2international.snomed.ecl.Ecl.SubAttributeSet");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAndAttributeSet"


    // $ANTLR start "entryRuleSubAttributeSet"
    // InternalQLParser.g:2974:1: entryRuleSubAttributeSet returns [EObject current=null] : iv_ruleSubAttributeSet= ruleSubAttributeSet EOF ;
    public final EObject entryRuleSubAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAttributeSet = null;


        try {
            // InternalQLParser.g:2974:56: (iv_ruleSubAttributeSet= ruleSubAttributeSet EOF )
            // InternalQLParser.g:2975:2: iv_ruleSubAttributeSet= ruleSubAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubAttributeSet=ruleSubAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubAttributeSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubAttributeSet"


    // $ANTLR start "ruleSubAttributeSet"
    // InternalQLParser.g:2981:1: ruleSubAttributeSet returns [EObject current=null] : (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet ) ;
    public final EObject ruleSubAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeConstraint_0 = null;

        EObject this_NestedAttributeSet_1 = null;



        	enterRule();

        try {
            // InternalQLParser.g:2987:2: ( (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet ) )
            // InternalQLParser.g:2988:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )
            {
            // InternalQLParser.g:2988:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalQLParser.g:2989:3: this_AttributeConstraint_0= ruleAttributeConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubAttributeSetAccess().getAttributeConstraintParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AttributeConstraint_0=ruleAttributeConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AttributeConstraint_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalQLParser.g:3001:3: this_NestedAttributeSet_1= ruleNestedAttributeSet
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubAttributeSetAccess().getNestedAttributeSetParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedAttributeSet_1=ruleNestedAttributeSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedAttributeSet_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSubAttributeSet"


    // $ANTLR start "entryRuleNestedAttributeSet"
    // InternalQLParser.g:3016:1: entryRuleNestedAttributeSet returns [EObject current=null] : iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF ;
    public final EObject entryRuleNestedAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedAttributeSet = null;


        try {
            // InternalQLParser.g:3016:59: (iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF )
            // InternalQLParser.g:3017:2: iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedAttributeSet=ruleNestedAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedAttributeSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNestedAttributeSet"


    // $ANTLR start "ruleNestedAttributeSet"
    // InternalQLParser.g:3023:1: ruleNestedAttributeSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:3029:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalQLParser.g:3030:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalQLParser.g:3030:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalQLParser.g:3031:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedAttributeSetAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:3035:3: ( (lv_nested_1_0= ruleEclAttributeSet ) )
            // InternalQLParser.g:3036:4: (lv_nested_1_0= ruleEclAttributeSet )
            {
            // InternalQLParser.g:3036:4: (lv_nested_1_0= ruleEclAttributeSet )
            // InternalQLParser.g:3037:5: lv_nested_1_0= ruleEclAttributeSet
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedAttributeSetAccess().getNestedEclAttributeSetParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_nested_1_0=ruleEclAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNestedAttributeSetRule());
              					}
              					set(
              						current,
              						"nested",
              						lv_nested_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclAttributeSet");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedAttributeSetAccess().getROUND_CLOSETerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNestedAttributeSet"


    // $ANTLR start "entryRuleAttributeConstraint"
    // InternalQLParser.g:3062:1: entryRuleAttributeConstraint returns [EObject current=null] : iv_ruleAttributeConstraint= ruleAttributeConstraint EOF ;
    public final EObject entryRuleAttributeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeConstraint = null;


        try {
            // InternalQLParser.g:3062:60: (iv_ruleAttributeConstraint= ruleAttributeConstraint EOF )
            // InternalQLParser.g:3063:2: iv_ruleAttributeConstraint= ruleAttributeConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeConstraint=ruleAttributeConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeConstraint"


    // $ANTLR start "ruleAttributeConstraint"
    // InternalQLParser.g:3069:1: ruleAttributeConstraint returns [EObject current=null] : ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleSubExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) ) ) ;
    public final EObject ruleAttributeConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_reversed_1_0=null;
        EObject lv_cardinality_0_0 = null;

        EObject lv_attribute_2_0 = null;

        EObject lv_comparison_3_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:3075:2: ( ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleSubExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) ) ) )
            // InternalQLParser.g:3076:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleSubExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) ) )
            {
            // InternalQLParser.g:3076:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleSubExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) ) )
            // InternalQLParser.g:3077:3: ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleSubExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )
            {
            // InternalQLParser.g:3077:3: ( (lv_cardinality_0_0= ruleCardinality ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_SQUARE_OPEN) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalQLParser.g:3078:4: (lv_cardinality_0_0= ruleCardinality )
                    {
                    // InternalQLParser.g:3078:4: (lv_cardinality_0_0= ruleCardinality )
                    // InternalQLParser.g:3079:5: lv_cardinality_0_0= ruleCardinality
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAttributeConstraintAccess().getCardinalityCardinalityParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_cardinality_0_0=ruleCardinality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAttributeConstraintRule());
                      					}
                      					set(
                      						current,
                      						"cardinality",
                      						lv_cardinality_0_0,
                      						"com.b2international.snomed.ecl.Ecl.Cardinality");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalQLParser.g:3096:3: ( (lv_reversed_1_0= RULE_REVERSED ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_REVERSED) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalQLParser.g:3097:4: (lv_reversed_1_0= RULE_REVERSED )
                    {
                    // InternalQLParser.g:3097:4: (lv_reversed_1_0= RULE_REVERSED )
                    // InternalQLParser.g:3098:5: lv_reversed_1_0= RULE_REVERSED
                    {
                    lv_reversed_1_0=(Token)match(input,RULE_REVERSED,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_reversed_1_0, grammarAccess.getAttributeConstraintAccess().getReversedREVERSEDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAttributeConstraintRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"reversed",
                      						lv_reversed_1_0 != null,
                      						"com.b2international.snomed.ecl.Ecl.REVERSED");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalQLParser.g:3114:3: ( (lv_attribute_2_0= ruleSubExpressionConstraint ) )
            // InternalQLParser.g:3115:4: (lv_attribute_2_0= ruleSubExpressionConstraint )
            {
            // InternalQLParser.g:3115:4: (lv_attribute_2_0= ruleSubExpressionConstraint )
            // InternalQLParser.g:3116:5: lv_attribute_2_0= ruleSubExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_28);
            lv_attribute_2_0=ruleSubExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeConstraintRule());
              					}
              					set(
              						current,
              						"attribute",
              						lv_attribute_2_0,
              						"com.b2international.snomed.ecl.Ecl.SubExpressionConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalQLParser.g:3133:3: ( (lv_comparison_3_0= ruleComparison ) )
            // InternalQLParser.g:3134:4: (lv_comparison_3_0= ruleComparison )
            {
            // InternalQLParser.g:3134:4: (lv_comparison_3_0= ruleComparison )
            // InternalQLParser.g:3135:5: lv_comparison_3_0= ruleComparison
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeConstraintAccess().getComparisonComparisonParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_comparison_3_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeConstraintRule());
              					}
              					set(
              						current,
              						"comparison",
              						lv_comparison_3_0,
              						"com.b2international.snomed.ecl.Ecl.Comparison");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttributeConstraint"


    // $ANTLR start "entryRuleCardinality"
    // InternalQLParser.g:3156:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalQLParser.g:3156:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalQLParser.g:3157:2: iv_ruleCardinality= ruleCardinality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCardinalityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCardinality; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalQLParser.g:3163:1: ruleCardinality returns [EObject current=null] : (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token this_SQUARE_OPEN_0=null;
        Token this_TO_2=null;
        Token this_SQUARE_CLOSE_4=null;
        AntlrDatatypeRuleToken lv_min_1_0 = null;

        AntlrDatatypeRuleToken lv_max_3_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:3169:2: ( (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE ) )
            // InternalQLParser.g:3170:2: (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE )
            {
            // InternalQLParser.g:3170:2: (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE )
            // InternalQLParser.g:3171:3: this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE
            {
            this_SQUARE_OPEN_0=(Token)match(input,RULE_SQUARE_OPEN,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SQUARE_OPEN_0, grammarAccess.getCardinalityAccess().getSQUARE_OPENTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:3175:3: ( (lv_min_1_0= ruleNonNegativeInteger ) )
            // InternalQLParser.g:3176:4: (lv_min_1_0= ruleNonNegativeInteger )
            {
            // InternalQLParser.g:3176:4: (lv_min_1_0= ruleNonNegativeInteger )
            // InternalQLParser.g:3177:5: lv_min_1_0= ruleNonNegativeInteger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_30);
            lv_min_1_0=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCardinalityRule());
              					}
              					set(
              						current,
              						"min",
              						lv_min_1_0,
              						"com.b2international.snomed.ecl.Ecl.NonNegativeInteger");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_TO_2=(Token)match(input,RULE_TO,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TO_2, grammarAccess.getCardinalityAccess().getTOTerminalRuleCall_2());
              		
            }
            // InternalQLParser.g:3198:3: ( (lv_max_3_0= ruleMaxValue ) )
            // InternalQLParser.g:3199:4: (lv_max_3_0= ruleMaxValue )
            {
            // InternalQLParser.g:3199:4: (lv_max_3_0= ruleMaxValue )
            // InternalQLParser.g:3200:5: lv_max_3_0= ruleMaxValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_32);
            lv_max_3_0=ruleMaxValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCardinalityRule());
              					}
              					set(
              						current,
              						"max",
              						lv_max_3_0,
              						"com.b2international.snomed.ecl.Ecl.MaxValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_SQUARE_CLOSE_4=(Token)match(input,RULE_SQUARE_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SQUARE_CLOSE_4, grammarAccess.getCardinalityAccess().getSQUARE_CLOSETerminalRuleCall_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleComparison"
    // InternalQLParser.g:3225:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalQLParser.g:3225:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalQLParser.g:3226:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalQLParser.g:3232:1: ruleComparison returns [EObject current=null] : (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeComparison_0 = null;

        EObject this_DataTypeComparison_1 = null;



        	enterRule();

        try {
            // InternalQLParser.g:3238:2: ( (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison ) )
            // InternalQLParser.g:3239:2: (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison )
            {
            // InternalQLParser.g:3239:2: (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison )
            int alt38=2;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==False||LA38_1==True||LA38_1==RULE_HASH||LA38_1==RULE_STRING) ) {
                    alt38=2;
                }
                else if ( (LA38_1==RULE_DIGIT_NONZERO||LA38_1==RULE_ROUND_OPEN||LA38_1==RULE_CARET||LA38_1==RULE_WILDCARD||(LA38_1>=RULE_LT && LA38_1<=RULE_DBL_GT_EM)) ) {
                    alt38=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NOT_EQUAL:
                {
                int LA38_2 = input.LA(2);

                if ( (LA38_2==False||LA38_2==True||LA38_2==RULE_HASH||LA38_2==RULE_STRING) ) {
                    alt38=2;
                }
                else if ( (LA38_2==RULE_DIGIT_NONZERO||LA38_2==RULE_ROUND_OPEN||LA38_2==RULE_CARET||LA38_2==RULE_WILDCARD||(LA38_2>=RULE_LT && LA38_2<=RULE_DBL_GT_EM)) ) {
                    alt38=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_LT:
            case RULE_GT:
            case RULE_GTE:
            case RULE_LTE:
                {
                alt38=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalQLParser.g:3240:3: this_AttributeComparison_0= ruleAttributeComparison
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComparisonAccess().getAttributeComparisonParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AttributeComparison_0=ruleAttributeComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AttributeComparison_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalQLParser.g:3252:3: this_DataTypeComparison_1= ruleDataTypeComparison
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComparisonAccess().getDataTypeComparisonParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DataTypeComparison_1=ruleDataTypeComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DataTypeComparison_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleAttributeComparison"
    // InternalQLParser.g:3267:1: entryRuleAttributeComparison returns [EObject current=null] : iv_ruleAttributeComparison= ruleAttributeComparison EOF ;
    public final EObject entryRuleAttributeComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeComparison = null;


        try {
            // InternalQLParser.g:3267:60: (iv_ruleAttributeComparison= ruleAttributeComparison EOF )
            // InternalQLParser.g:3268:2: iv_ruleAttributeComparison= ruleAttributeComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeComparison=ruleAttributeComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeComparison; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeComparison"


    // $ANTLR start "ruleAttributeComparison"
    // InternalQLParser.g:3274:1: ruleAttributeComparison returns [EObject current=null] : (this_AttributeValueEquals_0= ruleAttributeValueEquals | this_AttributeValueNotEquals_1= ruleAttributeValueNotEquals ) ;
    public final EObject ruleAttributeComparison() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeValueEquals_0 = null;

        EObject this_AttributeValueNotEquals_1 = null;



        	enterRule();

        try {
            // InternalQLParser.g:3280:2: ( (this_AttributeValueEquals_0= ruleAttributeValueEquals | this_AttributeValueNotEquals_1= ruleAttributeValueNotEquals ) )
            // InternalQLParser.g:3281:2: (this_AttributeValueEquals_0= ruleAttributeValueEquals | this_AttributeValueNotEquals_1= ruleAttributeValueNotEquals )
            {
            // InternalQLParser.g:3281:2: (this_AttributeValueEquals_0= ruleAttributeValueEquals | this_AttributeValueNotEquals_1= ruleAttributeValueNotEquals )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_EQUAL) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_NOT_EQUAL) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalQLParser.g:3282:3: this_AttributeValueEquals_0= ruleAttributeValueEquals
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAttributeComparisonAccess().getAttributeValueEqualsParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AttributeValueEquals_0=ruleAttributeValueEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AttributeValueEquals_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalQLParser.g:3294:3: this_AttributeValueNotEquals_1= ruleAttributeValueNotEquals
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAttributeComparisonAccess().getAttributeValueNotEqualsParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AttributeValueNotEquals_1=ruleAttributeValueNotEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AttributeValueNotEquals_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttributeComparison"


    // $ANTLR start "entryRuleDataTypeComparison"
    // InternalQLParser.g:3309:1: entryRuleDataTypeComparison returns [EObject current=null] : iv_ruleDataTypeComparison= ruleDataTypeComparison EOF ;
    public final EObject entryRuleDataTypeComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeComparison = null;


        try {
            // InternalQLParser.g:3309:59: (iv_ruleDataTypeComparison= ruleDataTypeComparison EOF )
            // InternalQLParser.g:3310:2: iv_ruleDataTypeComparison= ruleDataTypeComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDataTypeComparison=ruleDataTypeComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeComparison; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataTypeComparison"


    // $ANTLR start "ruleDataTypeComparison"
    // InternalQLParser.g:3316:1: ruleDataTypeComparison returns [EObject current=null] : (this_BooleanValueEquals_0= ruleBooleanValueEquals | this_BooleanValueNotEquals_1= ruleBooleanValueNotEquals | this_StringValueEquals_2= ruleStringValueEquals | this_StringValueNotEquals_3= ruleStringValueNotEquals | this_IntegerValueEquals_4= ruleIntegerValueEquals | this_IntegerValueNotEquals_5= ruleIntegerValueNotEquals | this_IntegerValueGreaterThan_6= ruleIntegerValueGreaterThan | this_IntegerValueGreaterThanEquals_7= ruleIntegerValueGreaterThanEquals | this_IntegerValueLessThan_8= ruleIntegerValueLessThan | this_IntegerValueLessThanEquals_9= ruleIntegerValueLessThanEquals | this_DecimalValueEquals_10= ruleDecimalValueEquals | this_DecimalValueNotEquals_11= ruleDecimalValueNotEquals | this_DecimalValueGreaterThan_12= ruleDecimalValueGreaterThan | this_DecimalValueGreaterThanEquals_13= ruleDecimalValueGreaterThanEquals | this_DecimalValueLessThan_14= ruleDecimalValueLessThan | this_DecimalValueLessThanEquals_15= ruleDecimalValueLessThanEquals ) ;
    public final EObject ruleDataTypeComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValueEquals_0 = null;

        EObject this_BooleanValueNotEquals_1 = null;

        EObject this_StringValueEquals_2 = null;

        EObject this_StringValueNotEquals_3 = null;

        EObject this_IntegerValueEquals_4 = null;

        EObject this_IntegerValueNotEquals_5 = null;

        EObject this_IntegerValueGreaterThan_6 = null;

        EObject this_IntegerValueGreaterThanEquals_7 = null;

        EObject this_IntegerValueLessThan_8 = null;

        EObject this_IntegerValueLessThanEquals_9 = null;

        EObject this_DecimalValueEquals_10 = null;

        EObject this_DecimalValueNotEquals_11 = null;

        EObject this_DecimalValueGreaterThan_12 = null;

        EObject this_DecimalValueGreaterThanEquals_13 = null;

        EObject this_DecimalValueLessThan_14 = null;

        EObject this_DecimalValueLessThanEquals_15 = null;



        	enterRule();

        try {
            // InternalQLParser.g:3322:2: ( (this_BooleanValueEquals_0= ruleBooleanValueEquals | this_BooleanValueNotEquals_1= ruleBooleanValueNotEquals | this_StringValueEquals_2= ruleStringValueEquals | this_StringValueNotEquals_3= ruleStringValueNotEquals | this_IntegerValueEquals_4= ruleIntegerValueEquals | this_IntegerValueNotEquals_5= ruleIntegerValueNotEquals | this_IntegerValueGreaterThan_6= ruleIntegerValueGreaterThan | this_IntegerValueGreaterThanEquals_7= ruleIntegerValueGreaterThanEquals | this_IntegerValueLessThan_8= ruleIntegerValueLessThan | this_IntegerValueLessThanEquals_9= ruleIntegerValueLessThanEquals | this_DecimalValueEquals_10= ruleDecimalValueEquals | this_DecimalValueNotEquals_11= ruleDecimalValueNotEquals | this_DecimalValueGreaterThan_12= ruleDecimalValueGreaterThan | this_DecimalValueGreaterThanEquals_13= ruleDecimalValueGreaterThanEquals | this_DecimalValueLessThan_14= ruleDecimalValueLessThan | this_DecimalValueLessThanEquals_15= ruleDecimalValueLessThanEquals ) )
            // InternalQLParser.g:3323:2: (this_BooleanValueEquals_0= ruleBooleanValueEquals | this_BooleanValueNotEquals_1= ruleBooleanValueNotEquals | this_StringValueEquals_2= ruleStringValueEquals | this_StringValueNotEquals_3= ruleStringValueNotEquals | this_IntegerValueEquals_4= ruleIntegerValueEquals | this_IntegerValueNotEquals_5= ruleIntegerValueNotEquals | this_IntegerValueGreaterThan_6= ruleIntegerValueGreaterThan | this_IntegerValueGreaterThanEquals_7= ruleIntegerValueGreaterThanEquals | this_IntegerValueLessThan_8= ruleIntegerValueLessThan | this_IntegerValueLessThanEquals_9= ruleIntegerValueLessThanEquals | this_DecimalValueEquals_10= ruleDecimalValueEquals | this_DecimalValueNotEquals_11= ruleDecimalValueNotEquals | this_DecimalValueGreaterThan_12= ruleDecimalValueGreaterThan | this_DecimalValueGreaterThanEquals_13= ruleDecimalValueGreaterThanEquals | this_DecimalValueLessThan_14= ruleDecimalValueLessThan | this_DecimalValueLessThanEquals_15= ruleDecimalValueLessThanEquals )
            {
            // InternalQLParser.g:3323:2: (this_BooleanValueEquals_0= ruleBooleanValueEquals | this_BooleanValueNotEquals_1= ruleBooleanValueNotEquals | this_StringValueEquals_2= ruleStringValueEquals | this_StringValueNotEquals_3= ruleStringValueNotEquals | this_IntegerValueEquals_4= ruleIntegerValueEquals | this_IntegerValueNotEquals_5= ruleIntegerValueNotEquals | this_IntegerValueGreaterThan_6= ruleIntegerValueGreaterThan | this_IntegerValueGreaterThanEquals_7= ruleIntegerValueGreaterThanEquals | this_IntegerValueLessThan_8= ruleIntegerValueLessThan | this_IntegerValueLessThanEquals_9= ruleIntegerValueLessThanEquals | this_DecimalValueEquals_10= ruleDecimalValueEquals | this_DecimalValueNotEquals_11= ruleDecimalValueNotEquals | this_DecimalValueGreaterThan_12= ruleDecimalValueGreaterThan | this_DecimalValueGreaterThanEquals_13= ruleDecimalValueGreaterThanEquals | this_DecimalValueLessThan_14= ruleDecimalValueLessThan | this_DecimalValueLessThanEquals_15= ruleDecimalValueLessThanEquals )
            int alt40=16;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // InternalQLParser.g:3324:3: this_BooleanValueEquals_0= ruleBooleanValueEquals
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getBooleanValueEqualsParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BooleanValueEquals_0=ruleBooleanValueEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanValueEquals_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalQLParser.g:3336:3: this_BooleanValueNotEquals_1= ruleBooleanValueNotEquals
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getBooleanValueNotEqualsParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BooleanValueNotEquals_1=ruleBooleanValueNotEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanValueNotEquals_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalQLParser.g:3348:3: this_StringValueEquals_2= ruleStringValueEquals
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getStringValueEqualsParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringValueEquals_2=ruleStringValueEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringValueEquals_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalQLParser.g:3360:3: this_StringValueNotEquals_3= ruleStringValueNotEquals
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getStringValueNotEqualsParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringValueNotEquals_3=ruleStringValueNotEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringValueNotEquals_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalQLParser.g:3372:3: this_IntegerValueEquals_4= ruleIntegerValueEquals
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getIntegerValueEqualsParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerValueEquals_4=ruleIntegerValueEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerValueEquals_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalQLParser.g:3384:3: this_IntegerValueNotEquals_5= ruleIntegerValueNotEquals
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getIntegerValueNotEqualsParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerValueNotEquals_5=ruleIntegerValueNotEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerValueNotEquals_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalQLParser.g:3396:3: this_IntegerValueGreaterThan_6= ruleIntegerValueGreaterThan
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getIntegerValueGreaterThanParserRuleCall_6());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerValueGreaterThan_6=ruleIntegerValueGreaterThan();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerValueGreaterThan_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalQLParser.g:3408:3: this_IntegerValueGreaterThanEquals_7= ruleIntegerValueGreaterThanEquals
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getIntegerValueGreaterThanEqualsParserRuleCall_7());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerValueGreaterThanEquals_7=ruleIntegerValueGreaterThanEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerValueGreaterThanEquals_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalQLParser.g:3420:3: this_IntegerValueLessThan_8= ruleIntegerValueLessThan
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getIntegerValueLessThanParserRuleCall_8());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerValueLessThan_8=ruleIntegerValueLessThan();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerValueLessThan_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalQLParser.g:3432:3: this_IntegerValueLessThanEquals_9= ruleIntegerValueLessThanEquals
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getIntegerValueLessThanEqualsParserRuleCall_9());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerValueLessThanEquals_9=ruleIntegerValueLessThanEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerValueLessThanEquals_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalQLParser.g:3444:3: this_DecimalValueEquals_10= ruleDecimalValueEquals
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getDecimalValueEqualsParserRuleCall_10());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DecimalValueEquals_10=ruleDecimalValueEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DecimalValueEquals_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalQLParser.g:3456:3: this_DecimalValueNotEquals_11= ruleDecimalValueNotEquals
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getDecimalValueNotEqualsParserRuleCall_11());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DecimalValueNotEquals_11=ruleDecimalValueNotEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DecimalValueNotEquals_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalQLParser.g:3468:3: this_DecimalValueGreaterThan_12= ruleDecimalValueGreaterThan
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getDecimalValueGreaterThanParserRuleCall_12());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DecimalValueGreaterThan_12=ruleDecimalValueGreaterThan();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DecimalValueGreaterThan_12;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalQLParser.g:3480:3: this_DecimalValueGreaterThanEquals_13= ruleDecimalValueGreaterThanEquals
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getDecimalValueGreaterThanEqualsParserRuleCall_13());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DecimalValueGreaterThanEquals_13=ruleDecimalValueGreaterThanEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DecimalValueGreaterThanEquals_13;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalQLParser.g:3492:3: this_DecimalValueLessThan_14= ruleDecimalValueLessThan
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getDecimalValueLessThanParserRuleCall_14());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DecimalValueLessThan_14=ruleDecimalValueLessThan();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DecimalValueLessThan_14;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalQLParser.g:3504:3: this_DecimalValueLessThanEquals_15= ruleDecimalValueLessThanEquals
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getDecimalValueLessThanEqualsParserRuleCall_15());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DecimalValueLessThanEquals_15=ruleDecimalValueLessThanEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DecimalValueLessThanEquals_15;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDataTypeComparison"


    // $ANTLR start "entryRuleAttributeValueEquals"
    // InternalQLParser.g:3519:1: entryRuleAttributeValueEquals returns [EObject current=null] : iv_ruleAttributeValueEquals= ruleAttributeValueEquals EOF ;
    public final EObject entryRuleAttributeValueEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValueEquals = null;


        try {
            // InternalQLParser.g:3519:61: (iv_ruleAttributeValueEquals= ruleAttributeValueEquals EOF )
            // InternalQLParser.g:3520:2: iv_ruleAttributeValueEquals= ruleAttributeValueEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeValueEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeValueEquals=ruleAttributeValueEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeValueEquals; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeValueEquals"


    // $ANTLR start "ruleAttributeValueEquals"
    // InternalQLParser.g:3526:1: ruleAttributeValueEquals returns [EObject current=null] : (this_EQUAL_0= RULE_EQUAL ( (lv_constraint_1_0= ruleSubExpressionConstraint ) ) ) ;
    public final EObject ruleAttributeValueEquals() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:3532:2: ( (this_EQUAL_0= RULE_EQUAL ( (lv_constraint_1_0= ruleSubExpressionConstraint ) ) ) )
            // InternalQLParser.g:3533:2: (this_EQUAL_0= RULE_EQUAL ( (lv_constraint_1_0= ruleSubExpressionConstraint ) ) )
            {
            // InternalQLParser.g:3533:2: (this_EQUAL_0= RULE_EQUAL ( (lv_constraint_1_0= ruleSubExpressionConstraint ) ) )
            // InternalQLParser.g:3534:3: this_EQUAL_0= RULE_EQUAL ( (lv_constraint_1_0= ruleSubExpressionConstraint ) )
            {
            this_EQUAL_0=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_0, grammarAccess.getAttributeValueEqualsAccess().getEQUALTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:3538:3: ( (lv_constraint_1_0= ruleSubExpressionConstraint ) )
            // InternalQLParser.g:3539:4: (lv_constraint_1_0= ruleSubExpressionConstraint )
            {
            // InternalQLParser.g:3539:4: (lv_constraint_1_0= ruleSubExpressionConstraint )
            // InternalQLParser.g:3540:5: lv_constraint_1_0= ruleSubExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeValueEqualsAccess().getConstraintSubExpressionConstraintParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleSubExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeValueEqualsRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.SubExpressionConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttributeValueEquals"


    // $ANTLR start "entryRuleAttributeValueNotEquals"
    // InternalQLParser.g:3561:1: entryRuleAttributeValueNotEquals returns [EObject current=null] : iv_ruleAttributeValueNotEquals= ruleAttributeValueNotEquals EOF ;
    public final EObject entryRuleAttributeValueNotEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValueNotEquals = null;


        try {
            // InternalQLParser.g:3561:64: (iv_ruleAttributeValueNotEquals= ruleAttributeValueNotEquals EOF )
            // InternalQLParser.g:3562:2: iv_ruleAttributeValueNotEquals= ruleAttributeValueNotEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeValueNotEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeValueNotEquals=ruleAttributeValueNotEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeValueNotEquals; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeValueNotEquals"


    // $ANTLR start "ruleAttributeValueNotEquals"
    // InternalQLParser.g:3568:1: ruleAttributeValueNotEquals returns [EObject current=null] : (this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_constraint_1_0= ruleSubExpressionConstraint ) ) ) ;
    public final EObject ruleAttributeValueNotEquals() throws RecognitionException {
        EObject current = null;

        Token this_NOT_EQUAL_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:3574:2: ( (this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_constraint_1_0= ruleSubExpressionConstraint ) ) ) )
            // InternalQLParser.g:3575:2: (this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_constraint_1_0= ruleSubExpressionConstraint ) ) )
            {
            // InternalQLParser.g:3575:2: (this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_constraint_1_0= ruleSubExpressionConstraint ) ) )
            // InternalQLParser.g:3576:3: this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_constraint_1_0= ruleSubExpressionConstraint ) )
            {
            this_NOT_EQUAL_0=(Token)match(input,RULE_NOT_EQUAL,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NOT_EQUAL_0, grammarAccess.getAttributeValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:3580:3: ( (lv_constraint_1_0= ruleSubExpressionConstraint ) )
            // InternalQLParser.g:3581:4: (lv_constraint_1_0= ruleSubExpressionConstraint )
            {
            // InternalQLParser.g:3581:4: (lv_constraint_1_0= ruleSubExpressionConstraint )
            // InternalQLParser.g:3582:5: lv_constraint_1_0= ruleSubExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeValueNotEqualsAccess().getConstraintSubExpressionConstraintParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleSubExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeValueNotEqualsRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.SubExpressionConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttributeValueNotEquals"


    // $ANTLR start "entryRuleBooleanValueEquals"
    // InternalQLParser.g:3603:1: entryRuleBooleanValueEquals returns [EObject current=null] : iv_ruleBooleanValueEquals= ruleBooleanValueEquals EOF ;
    public final EObject entryRuleBooleanValueEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValueEquals = null;


        try {
            // InternalQLParser.g:3603:59: (iv_ruleBooleanValueEquals= ruleBooleanValueEquals EOF )
            // InternalQLParser.g:3604:2: iv_ruleBooleanValueEquals= ruleBooleanValueEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBooleanValueEquals=ruleBooleanValueEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValueEquals; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanValueEquals"


    // $ANTLR start "ruleBooleanValueEquals"
    // InternalQLParser.g:3610:1: ruleBooleanValueEquals returns [EObject current=null] : (this_EQUAL_0= RULE_EQUAL ( (lv_value_1_0= ruleBoolean ) ) ) ;
    public final EObject ruleBooleanValueEquals() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:3616:2: ( (this_EQUAL_0= RULE_EQUAL ( (lv_value_1_0= ruleBoolean ) ) ) )
            // InternalQLParser.g:3617:2: (this_EQUAL_0= RULE_EQUAL ( (lv_value_1_0= ruleBoolean ) ) )
            {
            // InternalQLParser.g:3617:2: (this_EQUAL_0= RULE_EQUAL ( (lv_value_1_0= ruleBoolean ) ) )
            // InternalQLParser.g:3618:3: this_EQUAL_0= RULE_EQUAL ( (lv_value_1_0= ruleBoolean ) )
            {
            this_EQUAL_0=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_0, grammarAccess.getBooleanValueEqualsAccess().getEQUALTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:3622:3: ( (lv_value_1_0= ruleBoolean ) )
            // InternalQLParser.g:3623:4: (lv_value_1_0= ruleBoolean )
            {
            // InternalQLParser.g:3623:4: (lv_value_1_0= ruleBoolean )
            // InternalQLParser.g:3624:5: lv_value_1_0= ruleBoolean
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBooleanValueEqualsAccess().getValueBooleanParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_1_0=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBooleanValueEqualsRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"com.b2international.snomed.ecl.Ecl.Boolean");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanValueEquals"


    // $ANTLR start "entryRuleBooleanValueNotEquals"
    // InternalQLParser.g:3645:1: entryRuleBooleanValueNotEquals returns [EObject current=null] : iv_ruleBooleanValueNotEquals= ruleBooleanValueNotEquals EOF ;
    public final EObject entryRuleBooleanValueNotEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValueNotEquals = null;


        try {
            // InternalQLParser.g:3645:62: (iv_ruleBooleanValueNotEquals= ruleBooleanValueNotEquals EOF )
            // InternalQLParser.g:3646:2: iv_ruleBooleanValueNotEquals= ruleBooleanValueNotEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueNotEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBooleanValueNotEquals=ruleBooleanValueNotEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValueNotEquals; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanValueNotEquals"


    // $ANTLR start "ruleBooleanValueNotEquals"
    // InternalQLParser.g:3652:1: ruleBooleanValueNotEquals returns [EObject current=null] : (this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_value_1_0= ruleBoolean ) ) ) ;
    public final EObject ruleBooleanValueNotEquals() throws RecognitionException {
        EObject current = null;

        Token this_NOT_EQUAL_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:3658:2: ( (this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_value_1_0= ruleBoolean ) ) ) )
            // InternalQLParser.g:3659:2: (this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_value_1_0= ruleBoolean ) ) )
            {
            // InternalQLParser.g:3659:2: (this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_value_1_0= ruleBoolean ) ) )
            // InternalQLParser.g:3660:3: this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_value_1_0= ruleBoolean ) )
            {
            this_NOT_EQUAL_0=(Token)match(input,RULE_NOT_EQUAL,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NOT_EQUAL_0, grammarAccess.getBooleanValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:3664:3: ( (lv_value_1_0= ruleBoolean ) )
            // InternalQLParser.g:3665:4: (lv_value_1_0= ruleBoolean )
            {
            // InternalQLParser.g:3665:4: (lv_value_1_0= ruleBoolean )
            // InternalQLParser.g:3666:5: lv_value_1_0= ruleBoolean
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBooleanValueNotEqualsAccess().getValueBooleanParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_1_0=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBooleanValueNotEqualsRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"com.b2international.snomed.ecl.Ecl.Boolean");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanValueNotEquals"


    // $ANTLR start "entryRuleStringValueEquals"
    // InternalQLParser.g:3687:1: entryRuleStringValueEquals returns [EObject current=null] : iv_ruleStringValueEquals= ruleStringValueEquals EOF ;
    public final EObject entryRuleStringValueEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValueEquals = null;


        try {
            // InternalQLParser.g:3687:58: (iv_ruleStringValueEquals= ruleStringValueEquals EOF )
            // InternalQLParser.g:3688:2: iv_ruleStringValueEquals= ruleStringValueEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringValueEquals=ruleStringValueEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValueEquals; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringValueEquals"


    // $ANTLR start "ruleStringValueEquals"
    // InternalQLParser.g:3694:1: ruleStringValueEquals returns [EObject current=null] : (this_EQUAL_0= RULE_EQUAL ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValueEquals() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalQLParser.g:3700:2: ( (this_EQUAL_0= RULE_EQUAL ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalQLParser.g:3701:2: (this_EQUAL_0= RULE_EQUAL ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalQLParser.g:3701:2: (this_EQUAL_0= RULE_EQUAL ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalQLParser.g:3702:3: this_EQUAL_0= RULE_EQUAL ( (lv_value_1_0= RULE_STRING ) )
            {
            this_EQUAL_0=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_0, grammarAccess.getStringValueEqualsAccess().getEQUALTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:3706:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalQLParser.g:3707:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalQLParser.g:3707:4: (lv_value_1_0= RULE_STRING )
            // InternalQLParser.g:3708:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getStringValueEqualsAccess().getValueSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStringValueEqualsRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"com.b2international.snomed.ecl.Ecl.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringValueEquals"


    // $ANTLR start "entryRuleStringValueNotEquals"
    // InternalQLParser.g:3728:1: entryRuleStringValueNotEquals returns [EObject current=null] : iv_ruleStringValueNotEquals= ruleStringValueNotEquals EOF ;
    public final EObject entryRuleStringValueNotEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValueNotEquals = null;


        try {
            // InternalQLParser.g:3728:61: (iv_ruleStringValueNotEquals= ruleStringValueNotEquals EOF )
            // InternalQLParser.g:3729:2: iv_ruleStringValueNotEquals= ruleStringValueNotEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueNotEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringValueNotEquals=ruleStringValueNotEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValueNotEquals; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringValueNotEquals"


    // $ANTLR start "ruleStringValueNotEquals"
    // InternalQLParser.g:3735:1: ruleStringValueNotEquals returns [EObject current=null] : (this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValueNotEquals() throws RecognitionException {
        EObject current = null;

        Token this_NOT_EQUAL_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalQLParser.g:3741:2: ( (this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalQLParser.g:3742:2: (this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalQLParser.g:3742:2: (this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalQLParser.g:3743:3: this_NOT_EQUAL_0= RULE_NOT_EQUAL ( (lv_value_1_0= RULE_STRING ) )
            {
            this_NOT_EQUAL_0=(Token)match(input,RULE_NOT_EQUAL,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NOT_EQUAL_0, grammarAccess.getStringValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:3747:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalQLParser.g:3748:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalQLParser.g:3748:4: (lv_value_1_0= RULE_STRING )
            // InternalQLParser.g:3749:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getStringValueNotEqualsAccess().getValueSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStringValueNotEqualsRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"com.b2international.snomed.ecl.Ecl.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringValueNotEquals"


    // $ANTLR start "entryRuleIntegerValueEquals"
    // InternalQLParser.g:3769:1: entryRuleIntegerValueEquals returns [EObject current=null] : iv_ruleIntegerValueEquals= ruleIntegerValueEquals EOF ;
    public final EObject entryRuleIntegerValueEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueEquals = null;


        try {
            // InternalQLParser.g:3769:59: (iv_ruleIntegerValueEquals= ruleIntegerValueEquals EOF )
            // InternalQLParser.g:3770:2: iv_ruleIntegerValueEquals= ruleIntegerValueEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValueEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntegerValueEquals=ruleIntegerValueEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValueEquals; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerValueEquals"


    // $ANTLR start "ruleIntegerValueEquals"
    // InternalQLParser.g:3776:1: ruleIntegerValueEquals returns [EObject current=null] : (this_EQUAL_0= RULE_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleIntegerValueEquals() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:3782:2: ( (this_EQUAL_0= RULE_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) )
            // InternalQLParser.g:3783:2: (this_EQUAL_0= RULE_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            {
            // InternalQLParser.g:3783:2: (this_EQUAL_0= RULE_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            // InternalQLParser.g:3784:3: this_EQUAL_0= RULE_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) )
            {
            this_EQUAL_0=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_0, grammarAccess.getIntegerValueEqualsAccess().getEQUALTerminalRuleCall_0());
              		
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getIntegerValueEqualsAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:3792:3: ( (lv_value_2_0= ruleInteger ) )
            // InternalQLParser.g:3793:4: (lv_value_2_0= ruleInteger )
            {
            // InternalQLParser.g:3793:4: (lv_value_2_0= ruleInteger )
            // InternalQLParser.g:3794:5: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerValueEqualsAccess().getValueIntegerParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIntegerValueEqualsRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.b2international.snomed.ecl.Ecl.Integer");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntegerValueEquals"


    // $ANTLR start "entryRuleIntegerValueNotEquals"
    // InternalQLParser.g:3815:1: entryRuleIntegerValueNotEquals returns [EObject current=null] : iv_ruleIntegerValueNotEquals= ruleIntegerValueNotEquals EOF ;
    public final EObject entryRuleIntegerValueNotEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueNotEquals = null;


        try {
            // InternalQLParser.g:3815:62: (iv_ruleIntegerValueNotEquals= ruleIntegerValueNotEquals EOF )
            // InternalQLParser.g:3816:2: iv_ruleIntegerValueNotEquals= ruleIntegerValueNotEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValueNotEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntegerValueNotEquals=ruleIntegerValueNotEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValueNotEquals; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerValueNotEquals"


    // $ANTLR start "ruleIntegerValueNotEquals"
    // InternalQLParser.g:3822:1: ruleIntegerValueNotEquals returns [EObject current=null] : (this_NOT_EQUAL_0= RULE_NOT_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleIntegerValueNotEquals() throws RecognitionException {
        EObject current = null;

        Token this_NOT_EQUAL_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:3828:2: ( (this_NOT_EQUAL_0= RULE_NOT_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) )
            // InternalQLParser.g:3829:2: (this_NOT_EQUAL_0= RULE_NOT_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            {
            // InternalQLParser.g:3829:2: (this_NOT_EQUAL_0= RULE_NOT_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            // InternalQLParser.g:3830:3: this_NOT_EQUAL_0= RULE_NOT_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) )
            {
            this_NOT_EQUAL_0=(Token)match(input,RULE_NOT_EQUAL,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NOT_EQUAL_0, grammarAccess.getIntegerValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0());
              		
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getIntegerValueNotEqualsAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:3838:3: ( (lv_value_2_0= ruleInteger ) )
            // InternalQLParser.g:3839:4: (lv_value_2_0= ruleInteger )
            {
            // InternalQLParser.g:3839:4: (lv_value_2_0= ruleInteger )
            // InternalQLParser.g:3840:5: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerValueNotEqualsAccess().getValueIntegerParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIntegerValueNotEqualsRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.b2international.snomed.ecl.Ecl.Integer");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntegerValueNotEquals"


    // $ANTLR start "entryRuleIntegerValueGreaterThan"
    // InternalQLParser.g:3861:1: entryRuleIntegerValueGreaterThan returns [EObject current=null] : iv_ruleIntegerValueGreaterThan= ruleIntegerValueGreaterThan EOF ;
    public final EObject entryRuleIntegerValueGreaterThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueGreaterThan = null;


        try {
            // InternalQLParser.g:3861:64: (iv_ruleIntegerValueGreaterThan= ruleIntegerValueGreaterThan EOF )
            // InternalQLParser.g:3862:2: iv_ruleIntegerValueGreaterThan= ruleIntegerValueGreaterThan EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValueGreaterThanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntegerValueGreaterThan=ruleIntegerValueGreaterThan();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValueGreaterThan; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerValueGreaterThan"


    // $ANTLR start "ruleIntegerValueGreaterThan"
    // InternalQLParser.g:3868:1: ruleIntegerValueGreaterThan returns [EObject current=null] : (this_GT_0= RULE_GT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleIntegerValueGreaterThan() throws RecognitionException {
        EObject current = null;

        Token this_GT_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:3874:2: ( (this_GT_0= RULE_GT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) )
            // InternalQLParser.g:3875:2: (this_GT_0= RULE_GT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            {
            // InternalQLParser.g:3875:2: (this_GT_0= RULE_GT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            // InternalQLParser.g:3876:3: this_GT_0= RULE_GT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) )
            {
            this_GT_0=(Token)match(input,RULE_GT,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_GT_0, grammarAccess.getIntegerValueGreaterThanAccess().getGTTerminalRuleCall_0());
              		
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getIntegerValueGreaterThanAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:3884:3: ( (lv_value_2_0= ruleInteger ) )
            // InternalQLParser.g:3885:4: (lv_value_2_0= ruleInteger )
            {
            // InternalQLParser.g:3885:4: (lv_value_2_0= ruleInteger )
            // InternalQLParser.g:3886:5: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerValueGreaterThanAccess().getValueIntegerParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIntegerValueGreaterThanRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.b2international.snomed.ecl.Ecl.Integer");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntegerValueGreaterThan"


    // $ANTLR start "entryRuleIntegerValueLessThan"
    // InternalQLParser.g:3907:1: entryRuleIntegerValueLessThan returns [EObject current=null] : iv_ruleIntegerValueLessThan= ruleIntegerValueLessThan EOF ;
    public final EObject entryRuleIntegerValueLessThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueLessThan = null;


        try {
            // InternalQLParser.g:3907:61: (iv_ruleIntegerValueLessThan= ruleIntegerValueLessThan EOF )
            // InternalQLParser.g:3908:2: iv_ruleIntegerValueLessThan= ruleIntegerValueLessThan EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValueLessThanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntegerValueLessThan=ruleIntegerValueLessThan();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValueLessThan; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerValueLessThan"


    // $ANTLR start "ruleIntegerValueLessThan"
    // InternalQLParser.g:3914:1: ruleIntegerValueLessThan returns [EObject current=null] : (this_LT_0= RULE_LT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleIntegerValueLessThan() throws RecognitionException {
        EObject current = null;

        Token this_LT_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:3920:2: ( (this_LT_0= RULE_LT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) )
            // InternalQLParser.g:3921:2: (this_LT_0= RULE_LT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            {
            // InternalQLParser.g:3921:2: (this_LT_0= RULE_LT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            // InternalQLParser.g:3922:3: this_LT_0= RULE_LT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) )
            {
            this_LT_0=(Token)match(input,RULE_LT,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LT_0, grammarAccess.getIntegerValueLessThanAccess().getLTTerminalRuleCall_0());
              		
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getIntegerValueLessThanAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:3930:3: ( (lv_value_2_0= ruleInteger ) )
            // InternalQLParser.g:3931:4: (lv_value_2_0= ruleInteger )
            {
            // InternalQLParser.g:3931:4: (lv_value_2_0= ruleInteger )
            // InternalQLParser.g:3932:5: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerValueLessThanAccess().getValueIntegerParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIntegerValueLessThanRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.b2international.snomed.ecl.Ecl.Integer");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntegerValueLessThan"


    // $ANTLR start "entryRuleIntegerValueGreaterThanEquals"
    // InternalQLParser.g:3953:1: entryRuleIntegerValueGreaterThanEquals returns [EObject current=null] : iv_ruleIntegerValueGreaterThanEquals= ruleIntegerValueGreaterThanEquals EOF ;
    public final EObject entryRuleIntegerValueGreaterThanEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueGreaterThanEquals = null;


        try {
            // InternalQLParser.g:3953:70: (iv_ruleIntegerValueGreaterThanEquals= ruleIntegerValueGreaterThanEquals EOF )
            // InternalQLParser.g:3954:2: iv_ruleIntegerValueGreaterThanEquals= ruleIntegerValueGreaterThanEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValueGreaterThanEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntegerValueGreaterThanEquals=ruleIntegerValueGreaterThanEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValueGreaterThanEquals; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerValueGreaterThanEquals"


    // $ANTLR start "ruleIntegerValueGreaterThanEquals"
    // InternalQLParser.g:3960:1: ruleIntegerValueGreaterThanEquals returns [EObject current=null] : (this_GTE_0= RULE_GTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleIntegerValueGreaterThanEquals() throws RecognitionException {
        EObject current = null;

        Token this_GTE_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:3966:2: ( (this_GTE_0= RULE_GTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) )
            // InternalQLParser.g:3967:2: (this_GTE_0= RULE_GTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            {
            // InternalQLParser.g:3967:2: (this_GTE_0= RULE_GTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            // InternalQLParser.g:3968:3: this_GTE_0= RULE_GTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) )
            {
            this_GTE_0=(Token)match(input,RULE_GTE,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_GTE_0, grammarAccess.getIntegerValueGreaterThanEqualsAccess().getGTETerminalRuleCall_0());
              		
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getIntegerValueGreaterThanEqualsAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:3976:3: ( (lv_value_2_0= ruleInteger ) )
            // InternalQLParser.g:3977:4: (lv_value_2_0= ruleInteger )
            {
            // InternalQLParser.g:3977:4: (lv_value_2_0= ruleInteger )
            // InternalQLParser.g:3978:5: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getValueIntegerParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIntegerValueGreaterThanEqualsRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.b2international.snomed.ecl.Ecl.Integer");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntegerValueGreaterThanEquals"


    // $ANTLR start "entryRuleIntegerValueLessThanEquals"
    // InternalQLParser.g:3999:1: entryRuleIntegerValueLessThanEquals returns [EObject current=null] : iv_ruleIntegerValueLessThanEquals= ruleIntegerValueLessThanEquals EOF ;
    public final EObject entryRuleIntegerValueLessThanEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueLessThanEquals = null;


        try {
            // InternalQLParser.g:3999:67: (iv_ruleIntegerValueLessThanEquals= ruleIntegerValueLessThanEquals EOF )
            // InternalQLParser.g:4000:2: iv_ruleIntegerValueLessThanEquals= ruleIntegerValueLessThanEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValueLessThanEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntegerValueLessThanEquals=ruleIntegerValueLessThanEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValueLessThanEquals; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerValueLessThanEquals"


    // $ANTLR start "ruleIntegerValueLessThanEquals"
    // InternalQLParser.g:4006:1: ruleIntegerValueLessThanEquals returns [EObject current=null] : (this_LTE_0= RULE_LTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleIntegerValueLessThanEquals() throws RecognitionException {
        EObject current = null;

        Token this_LTE_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:4012:2: ( (this_LTE_0= RULE_LTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) )
            // InternalQLParser.g:4013:2: (this_LTE_0= RULE_LTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            {
            // InternalQLParser.g:4013:2: (this_LTE_0= RULE_LTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            // InternalQLParser.g:4014:3: this_LTE_0= RULE_LTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) )
            {
            this_LTE_0=(Token)match(input,RULE_LTE,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LTE_0, grammarAccess.getIntegerValueLessThanEqualsAccess().getLTETerminalRuleCall_0());
              		
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getIntegerValueLessThanEqualsAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:4022:3: ( (lv_value_2_0= ruleInteger ) )
            // InternalQLParser.g:4023:4: (lv_value_2_0= ruleInteger )
            {
            // InternalQLParser.g:4023:4: (lv_value_2_0= ruleInteger )
            // InternalQLParser.g:4024:5: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerValueLessThanEqualsAccess().getValueIntegerParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIntegerValueLessThanEqualsRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.b2international.snomed.ecl.Ecl.Integer");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntegerValueLessThanEquals"


    // $ANTLR start "entryRuleDecimalValueEquals"
    // InternalQLParser.g:4045:1: entryRuleDecimalValueEquals returns [EObject current=null] : iv_ruleDecimalValueEquals= ruleDecimalValueEquals EOF ;
    public final EObject entryRuleDecimalValueEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueEquals = null;


        try {
            // InternalQLParser.g:4045:59: (iv_ruleDecimalValueEquals= ruleDecimalValueEquals EOF )
            // InternalQLParser.g:4046:2: iv_ruleDecimalValueEquals= ruleDecimalValueEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalValueEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDecimalValueEquals=ruleDecimalValueEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalValueEquals; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDecimalValueEquals"


    // $ANTLR start "ruleDecimalValueEquals"
    // InternalQLParser.g:4052:1: ruleDecimalValueEquals returns [EObject current=null] : (this_EQUAL_0= RULE_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) ;
    public final EObject ruleDecimalValueEquals() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:4058:2: ( (this_EQUAL_0= RULE_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) )
            // InternalQLParser.g:4059:2: (this_EQUAL_0= RULE_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            {
            // InternalQLParser.g:4059:2: (this_EQUAL_0= RULE_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            // InternalQLParser.g:4060:3: this_EQUAL_0= RULE_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) )
            {
            this_EQUAL_0=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_0, grammarAccess.getDecimalValueEqualsAccess().getEQUALTerminalRuleCall_0());
              		
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getDecimalValueEqualsAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:4068:3: ( (lv_value_2_0= ruleDecimal ) )
            // InternalQLParser.g:4069:4: (lv_value_2_0= ruleDecimal )
            {
            // InternalQLParser.g:4069:4: (lv_value_2_0= ruleDecimal )
            // InternalQLParser.g:4070:5: lv_value_2_0= ruleDecimal
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDecimalValueEqualsAccess().getValueDecimalParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDecimalValueEqualsRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.b2international.snomed.ecl.Ecl.Decimal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDecimalValueEquals"


    // $ANTLR start "entryRuleDecimalValueNotEquals"
    // InternalQLParser.g:4091:1: entryRuleDecimalValueNotEquals returns [EObject current=null] : iv_ruleDecimalValueNotEquals= ruleDecimalValueNotEquals EOF ;
    public final EObject entryRuleDecimalValueNotEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueNotEquals = null;


        try {
            // InternalQLParser.g:4091:62: (iv_ruleDecimalValueNotEquals= ruleDecimalValueNotEquals EOF )
            // InternalQLParser.g:4092:2: iv_ruleDecimalValueNotEquals= ruleDecimalValueNotEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalValueNotEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDecimalValueNotEquals=ruleDecimalValueNotEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalValueNotEquals; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDecimalValueNotEquals"


    // $ANTLR start "ruleDecimalValueNotEquals"
    // InternalQLParser.g:4098:1: ruleDecimalValueNotEquals returns [EObject current=null] : (this_NOT_EQUAL_0= RULE_NOT_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) ;
    public final EObject ruleDecimalValueNotEquals() throws RecognitionException {
        EObject current = null;

        Token this_NOT_EQUAL_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:4104:2: ( (this_NOT_EQUAL_0= RULE_NOT_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) )
            // InternalQLParser.g:4105:2: (this_NOT_EQUAL_0= RULE_NOT_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            {
            // InternalQLParser.g:4105:2: (this_NOT_EQUAL_0= RULE_NOT_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            // InternalQLParser.g:4106:3: this_NOT_EQUAL_0= RULE_NOT_EQUAL this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) )
            {
            this_NOT_EQUAL_0=(Token)match(input,RULE_NOT_EQUAL,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NOT_EQUAL_0, grammarAccess.getDecimalValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0());
              		
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getDecimalValueNotEqualsAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:4114:3: ( (lv_value_2_0= ruleDecimal ) )
            // InternalQLParser.g:4115:4: (lv_value_2_0= ruleDecimal )
            {
            // InternalQLParser.g:4115:4: (lv_value_2_0= ruleDecimal )
            // InternalQLParser.g:4116:5: lv_value_2_0= ruleDecimal
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDecimalValueNotEqualsAccess().getValueDecimalParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDecimalValueNotEqualsRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.b2international.snomed.ecl.Ecl.Decimal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDecimalValueNotEquals"


    // $ANTLR start "entryRuleDecimalValueGreaterThan"
    // InternalQLParser.g:4137:1: entryRuleDecimalValueGreaterThan returns [EObject current=null] : iv_ruleDecimalValueGreaterThan= ruleDecimalValueGreaterThan EOF ;
    public final EObject entryRuleDecimalValueGreaterThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueGreaterThan = null;


        try {
            // InternalQLParser.g:4137:64: (iv_ruleDecimalValueGreaterThan= ruleDecimalValueGreaterThan EOF )
            // InternalQLParser.g:4138:2: iv_ruleDecimalValueGreaterThan= ruleDecimalValueGreaterThan EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalValueGreaterThanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDecimalValueGreaterThan=ruleDecimalValueGreaterThan();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalValueGreaterThan; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDecimalValueGreaterThan"


    // $ANTLR start "ruleDecimalValueGreaterThan"
    // InternalQLParser.g:4144:1: ruleDecimalValueGreaterThan returns [EObject current=null] : (this_GT_0= RULE_GT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) ;
    public final EObject ruleDecimalValueGreaterThan() throws RecognitionException {
        EObject current = null;

        Token this_GT_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:4150:2: ( (this_GT_0= RULE_GT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) )
            // InternalQLParser.g:4151:2: (this_GT_0= RULE_GT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            {
            // InternalQLParser.g:4151:2: (this_GT_0= RULE_GT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            // InternalQLParser.g:4152:3: this_GT_0= RULE_GT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) )
            {
            this_GT_0=(Token)match(input,RULE_GT,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_GT_0, grammarAccess.getDecimalValueGreaterThanAccess().getGTTerminalRuleCall_0());
              		
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getDecimalValueGreaterThanAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:4160:3: ( (lv_value_2_0= ruleDecimal ) )
            // InternalQLParser.g:4161:4: (lv_value_2_0= ruleDecimal )
            {
            // InternalQLParser.g:4161:4: (lv_value_2_0= ruleDecimal )
            // InternalQLParser.g:4162:5: lv_value_2_0= ruleDecimal
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDecimalValueGreaterThanAccess().getValueDecimalParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDecimalValueGreaterThanRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.b2international.snomed.ecl.Ecl.Decimal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDecimalValueGreaterThan"


    // $ANTLR start "entryRuleDecimalValueLessThan"
    // InternalQLParser.g:4183:1: entryRuleDecimalValueLessThan returns [EObject current=null] : iv_ruleDecimalValueLessThan= ruleDecimalValueLessThan EOF ;
    public final EObject entryRuleDecimalValueLessThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueLessThan = null;


        try {
            // InternalQLParser.g:4183:61: (iv_ruleDecimalValueLessThan= ruleDecimalValueLessThan EOF )
            // InternalQLParser.g:4184:2: iv_ruleDecimalValueLessThan= ruleDecimalValueLessThan EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalValueLessThanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDecimalValueLessThan=ruleDecimalValueLessThan();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalValueLessThan; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDecimalValueLessThan"


    // $ANTLR start "ruleDecimalValueLessThan"
    // InternalQLParser.g:4190:1: ruleDecimalValueLessThan returns [EObject current=null] : (this_LT_0= RULE_LT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) ;
    public final EObject ruleDecimalValueLessThan() throws RecognitionException {
        EObject current = null;

        Token this_LT_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:4196:2: ( (this_LT_0= RULE_LT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) )
            // InternalQLParser.g:4197:2: (this_LT_0= RULE_LT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            {
            // InternalQLParser.g:4197:2: (this_LT_0= RULE_LT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            // InternalQLParser.g:4198:3: this_LT_0= RULE_LT this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) )
            {
            this_LT_0=(Token)match(input,RULE_LT,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LT_0, grammarAccess.getDecimalValueLessThanAccess().getLTTerminalRuleCall_0());
              		
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getDecimalValueLessThanAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:4206:3: ( (lv_value_2_0= ruleDecimal ) )
            // InternalQLParser.g:4207:4: (lv_value_2_0= ruleDecimal )
            {
            // InternalQLParser.g:4207:4: (lv_value_2_0= ruleDecimal )
            // InternalQLParser.g:4208:5: lv_value_2_0= ruleDecimal
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDecimalValueLessThanAccess().getValueDecimalParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDecimalValueLessThanRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.b2international.snomed.ecl.Ecl.Decimal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDecimalValueLessThan"


    // $ANTLR start "entryRuleDecimalValueGreaterThanEquals"
    // InternalQLParser.g:4229:1: entryRuleDecimalValueGreaterThanEquals returns [EObject current=null] : iv_ruleDecimalValueGreaterThanEquals= ruleDecimalValueGreaterThanEquals EOF ;
    public final EObject entryRuleDecimalValueGreaterThanEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueGreaterThanEquals = null;


        try {
            // InternalQLParser.g:4229:70: (iv_ruleDecimalValueGreaterThanEquals= ruleDecimalValueGreaterThanEquals EOF )
            // InternalQLParser.g:4230:2: iv_ruleDecimalValueGreaterThanEquals= ruleDecimalValueGreaterThanEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalValueGreaterThanEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDecimalValueGreaterThanEquals=ruleDecimalValueGreaterThanEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalValueGreaterThanEquals; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDecimalValueGreaterThanEquals"


    // $ANTLR start "ruleDecimalValueGreaterThanEquals"
    // InternalQLParser.g:4236:1: ruleDecimalValueGreaterThanEquals returns [EObject current=null] : (this_GTE_0= RULE_GTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) ;
    public final EObject ruleDecimalValueGreaterThanEquals() throws RecognitionException {
        EObject current = null;

        Token this_GTE_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:4242:2: ( (this_GTE_0= RULE_GTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) )
            // InternalQLParser.g:4243:2: (this_GTE_0= RULE_GTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            {
            // InternalQLParser.g:4243:2: (this_GTE_0= RULE_GTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            // InternalQLParser.g:4244:3: this_GTE_0= RULE_GTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) )
            {
            this_GTE_0=(Token)match(input,RULE_GTE,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_GTE_0, grammarAccess.getDecimalValueGreaterThanEqualsAccess().getGTETerminalRuleCall_0());
              		
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getDecimalValueGreaterThanEqualsAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:4252:3: ( (lv_value_2_0= ruleDecimal ) )
            // InternalQLParser.g:4253:4: (lv_value_2_0= ruleDecimal )
            {
            // InternalQLParser.g:4253:4: (lv_value_2_0= ruleDecimal )
            // InternalQLParser.g:4254:5: lv_value_2_0= ruleDecimal
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getValueDecimalParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDecimalValueGreaterThanEqualsRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.b2international.snomed.ecl.Ecl.Decimal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDecimalValueGreaterThanEquals"


    // $ANTLR start "entryRuleDecimalValueLessThanEquals"
    // InternalQLParser.g:4275:1: entryRuleDecimalValueLessThanEquals returns [EObject current=null] : iv_ruleDecimalValueLessThanEquals= ruleDecimalValueLessThanEquals EOF ;
    public final EObject entryRuleDecimalValueLessThanEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueLessThanEquals = null;


        try {
            // InternalQLParser.g:4275:67: (iv_ruleDecimalValueLessThanEquals= ruleDecimalValueLessThanEquals EOF )
            // InternalQLParser.g:4276:2: iv_ruleDecimalValueLessThanEquals= ruleDecimalValueLessThanEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalValueLessThanEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDecimalValueLessThanEquals=ruleDecimalValueLessThanEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalValueLessThanEquals; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDecimalValueLessThanEquals"


    // $ANTLR start "ruleDecimalValueLessThanEquals"
    // InternalQLParser.g:4282:1: ruleDecimalValueLessThanEquals returns [EObject current=null] : (this_LTE_0= RULE_LTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) ;
    public final EObject ruleDecimalValueLessThanEquals() throws RecognitionException {
        EObject current = null;

        Token this_LTE_0=null;
        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:4288:2: ( (this_LTE_0= RULE_LTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) )
            // InternalQLParser.g:4289:2: (this_LTE_0= RULE_LTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            {
            // InternalQLParser.g:4289:2: (this_LTE_0= RULE_LTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            // InternalQLParser.g:4290:3: this_LTE_0= RULE_LTE this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) )
            {
            this_LTE_0=(Token)match(input,RULE_LTE,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LTE_0, grammarAccess.getDecimalValueLessThanEqualsAccess().getLTETerminalRuleCall_0());
              		
            }
            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getDecimalValueLessThanEqualsAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:4298:3: ( (lv_value_2_0= ruleDecimal ) )
            // InternalQLParser.g:4299:4: (lv_value_2_0= ruleDecimal )
            {
            // InternalQLParser.g:4299:4: (lv_value_2_0= ruleDecimal )
            // InternalQLParser.g:4300:5: lv_value_2_0= ruleDecimal
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDecimalValueLessThanEqualsAccess().getValueDecimalParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDecimalValueLessThanEqualsRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.b2international.snomed.ecl.Ecl.Decimal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDecimalValueLessThanEquals"


    // $ANTLR start "entryRuleNestedExpression"
    // InternalQLParser.g:4321:1: entryRuleNestedExpression returns [EObject current=null] : iv_ruleNestedExpression= ruleNestedExpression EOF ;
    public final EObject entryRuleNestedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpression = null;


        try {
            // InternalQLParser.g:4321:57: (iv_ruleNestedExpression= ruleNestedExpression EOF )
            // InternalQLParser.g:4322:2: iv_ruleNestedExpression= ruleNestedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedExpression=ruleNestedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNestedExpression"


    // $ANTLR start "ruleNestedExpression"
    // InternalQLParser.g:4328:1: ruleNestedExpression returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedExpression() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalQLParser.g:4334:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalQLParser.g:4335:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalQLParser.g:4335:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalQLParser.g:4336:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedExpressionAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:4340:3: ( (lv_nested_1_0= ruleExpressionConstraint ) )
            // InternalQLParser.g:4341:4: (lv_nested_1_0= ruleExpressionConstraint )
            {
            // InternalQLParser.g:4341:4: (lv_nested_1_0= ruleExpressionConstraint )
            // InternalQLParser.g:4342:5: lv_nested_1_0= ruleExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedExpressionAccess().getNestedExpressionConstraintParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_nested_1_0=ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNestedExpressionRule());
              					}
              					set(
              						current,
              						"nested",
              						lv_nested_1_0,
              						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedExpressionAccess().getROUND_CLOSETerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNestedExpression"


    // $ANTLR start "entryRuleSnomedIdentifier"
    // InternalQLParser.g:4367:1: entryRuleSnomedIdentifier returns [String current=null] : iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF ;
    public final String entryRuleSnomedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSnomedIdentifier = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalQLParser.g:4369:2: (iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF )
            // InternalQLParser.g:4370:2: iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSnomedIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSnomedIdentifier=ruleSnomedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSnomedIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSnomedIdentifier"


    // $ANTLR start "ruleSnomedIdentifier"
    // InternalQLParser.g:4379:1: ruleSnomedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO | this_ZERO_2= RULE_ZERO ) (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO | this_ZERO_4= RULE_ZERO ) (this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO | this_ZERO_6= RULE_ZERO ) (this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO | this_ZERO_8= RULE_ZERO ) (this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO | this_ZERO_10= RULE_ZERO )+ ) ;
    public final AntlrDatatypeRuleToken ruleSnomedIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_NONZERO_0=null;
        Token this_DIGIT_NONZERO_1=null;
        Token this_ZERO_2=null;
        Token this_DIGIT_NONZERO_3=null;
        Token this_ZERO_4=null;
        Token this_DIGIT_NONZERO_5=null;
        Token this_ZERO_6=null;
        Token this_DIGIT_NONZERO_7=null;
        Token this_ZERO_8=null;
        Token this_DIGIT_NONZERO_9=null;
        Token this_ZERO_10=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalQLParser.g:4386:2: ( (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO | this_ZERO_2= RULE_ZERO ) (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO | this_ZERO_4= RULE_ZERO ) (this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO | this_ZERO_6= RULE_ZERO ) (this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO | this_ZERO_8= RULE_ZERO ) (this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO | this_ZERO_10= RULE_ZERO )+ ) )
            // InternalQLParser.g:4387:2: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO | this_ZERO_2= RULE_ZERO ) (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO | this_ZERO_4= RULE_ZERO ) (this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO | this_ZERO_6= RULE_ZERO ) (this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO | this_ZERO_8= RULE_ZERO ) (this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO | this_ZERO_10= RULE_ZERO )+ )
            {
            // InternalQLParser.g:4387:2: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO | this_ZERO_2= RULE_ZERO ) (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO | this_ZERO_4= RULE_ZERO ) (this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO | this_ZERO_6= RULE_ZERO ) (this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO | this_ZERO_8= RULE_ZERO ) (this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO | this_ZERO_10= RULE_ZERO )+ )
            // InternalQLParser.g:4388:3: this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO | this_ZERO_2= RULE_ZERO ) (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO | this_ZERO_4= RULE_ZERO ) (this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO | this_ZERO_6= RULE_ZERO ) (this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO | this_ZERO_8= RULE_ZERO ) (this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO | this_ZERO_10= RULE_ZERO )+
            {
            this_DIGIT_NONZERO_0=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DIGIT_NONZERO_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DIGIT_NONZERO_0, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0());
              		
            }
            // InternalQLParser.g:4395:3: (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO | this_ZERO_2= RULE_ZERO )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_DIGIT_NONZERO) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_ZERO) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalQLParser.g:4396:4: this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO
                    {
                    this_DIGIT_NONZERO_1=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DIGIT_NONZERO_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DIGIT_NONZERO_1, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalQLParser.g:4404:4: this_ZERO_2= RULE_ZERO
                    {
                    this_ZERO_2=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ZERO_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ZERO_2, grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalQLParser.g:4412:3: (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO | this_ZERO_4= RULE_ZERO )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_DIGIT_NONZERO) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_ZERO) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalQLParser.g:4413:4: this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO
                    {
                    this_DIGIT_NONZERO_3=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DIGIT_NONZERO_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DIGIT_NONZERO_3, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalQLParser.g:4421:4: this_ZERO_4= RULE_ZERO
                    {
                    this_ZERO_4=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ZERO_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ZERO_4, grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalQLParser.g:4429:3: (this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO | this_ZERO_6= RULE_ZERO )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_DIGIT_NONZERO) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_ZERO) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalQLParser.g:4430:4: this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO
                    {
                    this_DIGIT_NONZERO_5=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DIGIT_NONZERO_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DIGIT_NONZERO_5, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalQLParser.g:4438:4: this_ZERO_6= RULE_ZERO
                    {
                    this_ZERO_6=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ZERO_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ZERO_6, grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_3_1());
                      			
                    }

                    }
                    break;

            }

            // InternalQLParser.g:4446:3: (this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO | this_ZERO_8= RULE_ZERO )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_DIGIT_NONZERO) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ZERO) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalQLParser.g:4447:4: this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO
                    {
                    this_DIGIT_NONZERO_7=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DIGIT_NONZERO_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DIGIT_NONZERO_7, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalQLParser.g:4455:4: this_ZERO_8= RULE_ZERO
                    {
                    this_ZERO_8=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ZERO_8);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ZERO_8, grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_4_1());
                      			
                    }

                    }
                    break;

            }

            // InternalQLParser.g:4463:3: (this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO | this_ZERO_10= RULE_ZERO )+
            int cnt45=0;
            loop45:
            do {
                int alt45=3;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_DIGIT_NONZERO) ) {
                    alt45=1;
                }
                else if ( (LA45_0==RULE_ZERO) ) {
                    alt45=2;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalQLParser.g:4464:4: this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_9=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DIGIT_NONZERO_9);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DIGIT_NONZERO_9, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_5_0());
            	      			
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalQLParser.g:4472:4: this_ZERO_10= RULE_ZERO
            	    {
            	    this_ZERO_10=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ZERO_10);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ZERO_10, grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_5_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSnomedIdentifier"


    // $ANTLR start "entryRuleNonNegativeInteger"
    // InternalQLParser.g:4487:1: entryRuleNonNegativeInteger returns [String current=null] : iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF ;
    public final String entryRuleNonNegativeInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonNegativeInteger = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalQLParser.g:4489:2: (iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF )
            // InternalQLParser.g:4490:2: iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNonNegativeIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNonNegativeInteger=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNonNegativeInteger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNonNegativeInteger"


    // $ANTLR start "ruleNonNegativeInteger"
    // InternalQLParser.g:4499:1: ruleNonNegativeInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ZERO_0= RULE_ZERO | (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) ) ;
    public final AntlrDatatypeRuleToken ruleNonNegativeInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ZERO_0=null;
        Token this_DIGIT_NONZERO_1=null;
        Token this_DIGIT_NONZERO_2=null;
        Token this_ZERO_3=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalQLParser.g:4506:2: ( (this_ZERO_0= RULE_ZERO | (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) ) )
            // InternalQLParser.g:4507:2: (this_ZERO_0= RULE_ZERO | (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) )
            {
            // InternalQLParser.g:4507:2: (this_ZERO_0= RULE_ZERO | (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ZERO) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_DIGIT_NONZERO) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalQLParser.g:4508:3: this_ZERO_0= RULE_ZERO
                    {
                    this_ZERO_0=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ZERO_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ZERO_0, grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalQLParser.g:4516:3: (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* )
                    {
                    // InternalQLParser.g:4516:3: (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* )
                    // InternalQLParser.g:4517:4: this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )*
                    {
                    this_DIGIT_NONZERO_1=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DIGIT_NONZERO_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DIGIT_NONZERO_1, grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_0());
                      			
                    }
                    // InternalQLParser.g:4524:4: (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )*
                    loop46:
                    do {
                        int alt46=3;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==RULE_DIGIT_NONZERO) ) {
                            alt46=1;
                        }
                        else if ( (LA46_0==RULE_ZERO) ) {
                            alt46=2;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalQLParser.g:4525:5: this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO
                    	    {
                    	    this_DIGIT_NONZERO_2=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_DIGIT_NONZERO_2);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_DIGIT_NONZERO_2, grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_1_0());
                    	      				
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalQLParser.g:4533:5: this_ZERO_3= RULE_ZERO
                    	    {
                    	    this_ZERO_3=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_ZERO_3);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_ZERO_3, grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_1_1_1());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNonNegativeInteger"


    // $ANTLR start "entryRuleMaxValue"
    // InternalQLParser.g:4549:1: entryRuleMaxValue returns [String current=null] : iv_ruleMaxValue= ruleMaxValue EOF ;
    public final String entryRuleMaxValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMaxValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalQLParser.g:4551:2: (iv_ruleMaxValue= ruleMaxValue EOF )
            // InternalQLParser.g:4552:2: iv_ruleMaxValue= ruleMaxValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMaxValue=ruleMaxValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxValue.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleMaxValue"


    // $ANTLR start "ruleMaxValue"
    // InternalQLParser.g:4561:1: ruleMaxValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD ) ;
    public final AntlrDatatypeRuleToken ruleMaxValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WILDCARD_1=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalQLParser.g:4568:2: ( (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD ) )
            // InternalQLParser.g:4569:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD )
            {
            // InternalQLParser.g:4569:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_ZERO && LA48_0<=RULE_DIGIT_NONZERO)) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_WILDCARD) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalQLParser.g:4570:3: this_NonNegativeInteger_0= ruleNonNegativeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMaxValueAccess().getNonNegativeIntegerParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NonNegativeInteger_0=ruleNonNegativeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NonNegativeInteger_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalQLParser.g:4581:3: this_WILDCARD_1= RULE_WILDCARD
                    {
                    this_WILDCARD_1=(Token)match(input,RULE_WILDCARD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_WILDCARD_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_WILDCARD_1, grammarAccess.getMaxValueAccess().getWILDCARDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleMaxValue"


    // $ANTLR start "entryRuleInteger"
    // InternalQLParser.g:4595:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalQLParser.g:4597:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalQLParser.g:4598:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalQLParser.g:4607:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_DASH_1=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalQLParser.g:4614:2: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger ) )
            // InternalQLParser.g:4615:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger )
            {
            // InternalQLParser.g:4615:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger )
            // InternalQLParser.g:4616:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger
            {
            // InternalQLParser.g:4616:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_PLUS) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_DASH) ) {
                alt49=2;
            }
            switch (alt49) {
                case 1 :
                    // InternalQLParser.g:4617:4: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PLUS_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PLUS_0, grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalQLParser.g:4625:4: this_DASH_1= RULE_DASH
                    {
                    this_DASH_1=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DASH_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DASH_1, grammarAccess.getIntegerAccess().getDASHTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIntegerAccess().getNonNegativeIntegerParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_NonNegativeInteger_2=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NonNegativeInteger_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleDecimal"
    // InternalQLParser.g:4650:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalQLParser.g:4652:2: (iv_ruleDecimal= ruleDecimal EOF )
            // InternalQLParser.g:4653:2: iv_ruleDecimal= ruleDecimal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDecimal=ruleDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimal.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // InternalQLParser.g:4662:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_DASH_1=null;
        AntlrDatatypeRuleToken this_NonNegativeDecimal_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalQLParser.g:4669:2: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal ) )
            // InternalQLParser.g:4670:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal )
            {
            // InternalQLParser.g:4670:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal )
            // InternalQLParser.g:4671:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal
            {
            // InternalQLParser.g:4671:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_PLUS) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_DASH) ) {
                alt50=2;
            }
            switch (alt50) {
                case 1 :
                    // InternalQLParser.g:4672:4: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PLUS_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PLUS_0, grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalQLParser.g:4680:4: this_DASH_1= RULE_DASH
                    {
                    this_DASH_1=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DASH_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DASH_1, grammarAccess.getDecimalAccess().getDASHTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDecimalAccess().getNonNegativeDecimalParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_NonNegativeDecimal_2=ruleNonNegativeDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NonNegativeDecimal_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDecimal"


    // $ANTLR start "entryRuleNonNegativeDecimal"
    // InternalQLParser.g:4705:1: entryRuleNonNegativeDecimal returns [String current=null] : iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF ;
    public final String entryRuleNonNegativeDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonNegativeDecimal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalQLParser.g:4707:2: (iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF )
            // InternalQLParser.g:4708:2: iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNonNegativeDecimalRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNonNegativeDecimal=ruleNonNegativeDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNonNegativeDecimal.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNonNegativeDecimal"


    // $ANTLR start "ruleNonNegativeDecimal"
    // InternalQLParser.g:4717:1: ruleNonNegativeDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) ;
    public final AntlrDatatypeRuleToken ruleNonNegativeDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOT_1=null;
        Token this_DIGIT_NONZERO_2=null;
        Token this_ZERO_3=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalQLParser.g:4724:2: ( (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) )
            // InternalQLParser.g:4725:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* )
            {
            // InternalQLParser.g:4725:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* )
            // InternalQLParser.g:4726:3: this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_11);
            this_NonNegativeInteger_0=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NonNegativeInteger_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_DOT_1=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DOT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOT_1, grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1());
              		
            }
            // InternalQLParser.g:4743:3: (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )*
            loop51:
            do {
                int alt51=3;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_DIGIT_NONZERO) ) {
                    alt51=1;
                }
                else if ( (LA51_0==RULE_ZERO) ) {
                    alt51=2;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalQLParser.g:4744:4: this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_2=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DIGIT_NONZERO_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DIGIT_NONZERO_2, grammarAccess.getNonNegativeDecimalAccess().getDIGIT_NONZEROTerminalRuleCall_2_0());
            	      			
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalQLParser.g:4752:4: this_ZERO_3= RULE_ZERO
            	    {
            	    this_ZERO_3=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ZERO_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ZERO_3, grammarAccess.getNonNegativeDecimalAccess().getZEROTerminalRuleCall_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNonNegativeDecimal"


    // $ANTLR start "entryRuleBoolean"
    // InternalQLParser.g:4767:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalQLParser.g:4769:2: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalQLParser.g:4770:2: iv_ruleBoolean= ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolean.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalQLParser.g:4779:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalQLParser.g:4786:2: ( (kw= True | kw= False ) )
            // InternalQLParser.g:4787:2: (kw= True | kw= False )
            {
            // InternalQLParser.g:4787:2: (kw= True | kw= False )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==True) ) {
                alt52=1;
            }
            else if ( (LA52_0==False) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalQLParser.g:4788:3: kw= True
                    {
                    kw=(Token)match(input,True,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalQLParser.g:4794:3: kw= False
                    {
                    kw=(Token)match(input,False,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "ruleLexicalSearchType"
    // InternalQLParser.g:4806:1: ruleLexicalSearchType returns [Enumerator current=null] : ( (enumLiteral_0= Match ) | (enumLiteral_1= Regex ) | (enumLiteral_2= Exact ) ) ;
    public final Enumerator ruleLexicalSearchType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalQLParser.g:4812:2: ( ( (enumLiteral_0= Match ) | (enumLiteral_1= Regex ) | (enumLiteral_2= Exact ) ) )
            // InternalQLParser.g:4813:2: ( (enumLiteral_0= Match ) | (enumLiteral_1= Regex ) | (enumLiteral_2= Exact ) )
            {
            // InternalQLParser.g:4813:2: ( (enumLiteral_0= Match ) | (enumLiteral_1= Regex ) | (enumLiteral_2= Exact ) )
            int alt53=3;
            switch ( input.LA(1) ) {
            case Match:
                {
                alt53=1;
                }
                break;
            case Regex:
                {
                alt53=2;
                }
                break;
            case Exact:
                {
                alt53=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalQLParser.g:4814:3: (enumLiteral_0= Match )
                    {
                    // InternalQLParser.g:4814:3: (enumLiteral_0= Match )
                    // InternalQLParser.g:4815:4: enumLiteral_0= Match
                    {
                    enumLiteral_0=(Token)match(input,Match,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLexicalSearchTypeAccess().getMATCHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getLexicalSearchTypeAccess().getMATCHEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalQLParser.g:4822:3: (enumLiteral_1= Regex )
                    {
                    // InternalQLParser.g:4822:3: (enumLiteral_1= Regex )
                    // InternalQLParser.g:4823:4: enumLiteral_1= Regex
                    {
                    enumLiteral_1=(Token)match(input,Regex,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLexicalSearchTypeAccess().getREGEXEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getLexicalSearchTypeAccess().getREGEXEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalQLParser.g:4830:3: (enumLiteral_2= Exact )
                    {
                    // InternalQLParser.g:4830:3: (enumLiteral_2= Exact )
                    // InternalQLParser.g:4831:4: enumLiteral_2= Exact
                    {
                    enumLiteral_2=(Token)match(input,Exact,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLexicalSearchTypeAccess().getEXACTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getLexicalSearchTypeAccess().getEXACTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLexicalSearchType"


    // $ANTLR start "ruleDomain"
    // InternalQLParser.g:4841:1: ruleDomain returns [Enumerator current=null] : ( (enumLiteral_0= Concept ) | (enumLiteral_1= Description ) ) ;
    public final Enumerator ruleDomain() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalQLParser.g:4847:2: ( ( (enumLiteral_0= Concept ) | (enumLiteral_1= Description ) ) )
            // InternalQLParser.g:4848:2: ( (enumLiteral_0= Concept ) | (enumLiteral_1= Description ) )
            {
            // InternalQLParser.g:4848:2: ( (enumLiteral_0= Concept ) | (enumLiteral_1= Description ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==Concept) ) {
                alt54=1;
            }
            else if ( (LA54_0==Description) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalQLParser.g:4849:3: (enumLiteral_0= Concept )
                    {
                    // InternalQLParser.g:4849:3: (enumLiteral_0= Concept )
                    // InternalQLParser.g:4850:4: enumLiteral_0= Concept
                    {
                    enumLiteral_0=(Token)match(input,Concept,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDomainAccess().getCONCEPTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDomainAccess().getCONCEPTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalQLParser.g:4857:3: (enumLiteral_1= Description )
                    {
                    // InternalQLParser.g:4857:3: (enumLiteral_1= Description )
                    // InternalQLParser.g:4858:4: enumLiteral_1= Description
                    {
                    enumLiteral_1=(Token)match(input,Description,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDomainAccess().getDESCRIPTIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDomainAccess().getDESCRIPTIONEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDomain"

    // $ANTLR start synpred1_InternalQLParser
    public final void synpred1_InternalQLParser_fragment() throws RecognitionException {   
        EObject lv_query_1_0 = null;


        // InternalQLParser.g:102:4: ( (lv_query_1_0= ruleQueryConstraint ) )
        // InternalQLParser.g:102:4: (lv_query_1_0= ruleQueryConstraint )
        {
        // InternalQLParser.g:102:4: (lv_query_1_0= ruleQueryConstraint )
        // InternalQLParser.g:103:5: lv_query_1_0= ruleQueryConstraint
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getQueryAccess().getQueryQueryConstraintParserRuleCall_1_0());
          				
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_query_1_0=ruleQueryConstraint();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalQLParser

    // $ANTLR start synpred6_InternalQLParser
    public final void synpred6_InternalQLParser_fragment() throws RecognitionException {   
        EObject this_DomainQuery_0 = null;


        // InternalQLParser.g:369:3: (this_DomainQuery_0= ruleDomainQuery )
        // InternalQLParser.g:369:3: this_DomainQuery_0= ruleDomainQuery
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_DomainQuery_0=ruleDomainQuery();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalQLParser

    // $ANTLR start synpred25_InternalQLParser
    public final void synpred25_InternalQLParser_fragment() throws RecognitionException {   
        Token this_DISJUNCTION_2=null;
        EObject lv_right_3_0 = null;


        // InternalQLParser.g:1475:4: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )
        // InternalQLParser.g:1475:4: () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndExpressionConstraint ) )
        {
        // InternalQLParser.g:1475:4: ()
        // InternalQLParser.g:1476:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        this_DISJUNCTION_2=(Token)match(input,RULE_DISJUNCTION,FollowSets000.FOLLOW_16); if (state.failed) return ;
        // InternalQLParser.g:1489:4: ( (lv_right_3_0= ruleAndExpressionConstraint ) )
        // InternalQLParser.g:1490:5: (lv_right_3_0= ruleAndExpressionConstraint )
        {
        // InternalQLParser.g:1490:5: (lv_right_3_0= ruleAndExpressionConstraint )
        // InternalQLParser.g:1491:6: lv_right_3_0= ruleAndExpressionConstraint
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getOrExpressionConstraintAccess().getRightAndExpressionConstraintParserRuleCall_1_2_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_right_3_0=ruleAndExpressionConstraint();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred25_InternalQLParser

    // $ANTLR start synpred27_InternalQLParser
    public final void synpred27_InternalQLParser_fragment() throws RecognitionException {   
        Token this_CONJUNCTION_2=null;
        Token this_COMMA_3=null;
        EObject lv_right_4_0 = null;


        // InternalQLParser.g:1540:4: ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )
        // InternalQLParser.g:1540:4: () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) )
        {
        // InternalQLParser.g:1540:4: ()
        // InternalQLParser.g:1541:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalQLParser.g:1550:4: (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA )
        int alt57=2;
        int LA57_0 = input.LA(1);

        if ( (LA57_0==RULE_CONJUNCTION) ) {
            alt57=1;
        }
        else if ( (LA57_0==RULE_COMMA) ) {
            alt57=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 57, 0, input);

            throw nvae;
        }
        switch (alt57) {
            case 1 :
                // InternalQLParser.g:1551:5: this_CONJUNCTION_2= RULE_CONJUNCTION
                {
                this_CONJUNCTION_2=(Token)match(input,RULE_CONJUNCTION,FollowSets000.FOLLOW_16); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalQLParser.g:1556:5: this_COMMA_3= RULE_COMMA
                {
                this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_16); if (state.failed) return ;

                }
                break;

        }

        // InternalQLParser.g:1561:4: ( (lv_right_4_0= ruleExclusionExpressionConstraint ) )
        // InternalQLParser.g:1562:5: (lv_right_4_0= ruleExclusionExpressionConstraint )
        {
        // InternalQLParser.g:1562:5: (lv_right_4_0= ruleExclusionExpressionConstraint )
        // InternalQLParser.g:1563:6: lv_right_4_0= ruleExclusionExpressionConstraint
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getAndExpressionConstraintAccess().getRightExclusionExpressionConstraintParserRuleCall_1_2_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_right_4_0=ruleExclusionExpressionConstraint();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred27_InternalQLParser

    // $ANTLR start synpred28_InternalQLParser
    public final void synpred28_InternalQLParser_fragment() throws RecognitionException {   
        Token this_EXCLUSION_2=null;
        EObject lv_right_3_0 = null;


        // InternalQLParser.g:1612:4: ( () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )
        // InternalQLParser.g:1612:4: () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= ruleRefinedExpressionConstraint ) )
        {
        // InternalQLParser.g:1612:4: ()
        // InternalQLParser.g:1613:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        this_EXCLUSION_2=(Token)match(input,RULE_EXCLUSION,FollowSets000.FOLLOW_16); if (state.failed) return ;
        // InternalQLParser.g:1626:4: ( (lv_right_3_0= ruleRefinedExpressionConstraint ) )
        // InternalQLParser.g:1627:5: (lv_right_3_0= ruleRefinedExpressionConstraint )
        {
        // InternalQLParser.g:1627:5: (lv_right_3_0= ruleRefinedExpressionConstraint )
        // InternalQLParser.g:1628:6: lv_right_3_0= ruleRefinedExpressionConstraint
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getExclusionExpressionConstraintAccess().getRightRefinedExpressionConstraintParserRuleCall_1_2_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_right_3_0=ruleRefinedExpressionConstraint();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred28_InternalQLParser

    // $ANTLR start synpred45_InternalQLParser
    public final void synpred45_InternalQLParser_fragment() throws RecognitionException {   
        // InternalQLParser.g:2528:4: ( RULE_DISJUNCTION )
        // InternalQLParser.g:2528:5: RULE_DISJUNCTION
        {
        match(input,RULE_DISJUNCTION,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalQLParser

    // $ANTLR start synpred47_InternalQLParser
    public final void synpred47_InternalQLParser_fragment() throws RecognitionException {   
        // InternalQLParser.g:2596:4: ( RULE_CONJUNCTION | RULE_COMMA )
        // InternalQLParser.g:
        {
        if ( (input.LA(1)>=RULE_COMMA && input.LA(1)<=RULE_CONJUNCTION) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred47_InternalQLParser

    // $ANTLR start synpred49_InternalQLParser
    public final void synpred49_InternalQLParser_fragment() throws RecognitionException {   
        EObject this_AttributeConstraint_0 = null;


        // InternalQLParser.g:2659:3: (this_AttributeConstraint_0= ruleAttributeConstraint )
        // InternalQLParser.g:2659:3: this_AttributeConstraint_0= ruleAttributeConstraint
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_AttributeConstraint_0=ruleAttributeConstraint();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalQLParser

    // $ANTLR start synpred50_InternalQLParser
    public final void synpred50_InternalQLParser_fragment() throws RecognitionException {   
        EObject this_EclAttributeGroup_1 = null;


        // InternalQLParser.g:2671:3: (this_EclAttributeGroup_1= ruleEclAttributeGroup )
        // InternalQLParser.g:2671:3: this_EclAttributeGroup_1= ruleEclAttributeGroup
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_EclAttributeGroup_1=ruleEclAttributeGroup();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalQLParser

    // $ANTLR start synpred55_InternalQLParser
    public final void synpred55_InternalQLParser_fragment() throws RecognitionException {   
        EObject this_AttributeConstraint_0 = null;


        // InternalQLParser.g:2989:3: (this_AttributeConstraint_0= ruleAttributeConstraint )
        // InternalQLParser.g:2989:3: this_AttributeConstraint_0= ruleAttributeConstraint
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_AttributeConstraint_0=ruleAttributeConstraint();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalQLParser

    // Delegated rules

    public final boolean synpred28_InternalQLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalQLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalQLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalQLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalQLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalQLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalQLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalQLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalQLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalQLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalQLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalQLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalQLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalQLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalQLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalQLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalQLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalQLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalQLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalQLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA40 dfa40 = new DFA40(this);
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\1\1\24\uffff";
    static final String dfa_3s = "\1\24\13\uffff\1\0\10\uffff";
    static final String dfa_4s = "\1\64\13\uffff\1\0\10\uffff";
    static final String dfa_5s = "\1\uffff\1\1\22\uffff\1\2";
    static final String dfa_6s = "\14\uffff\1\0\10\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\4\uffff\4\1\1\uffff\1\1\3\uffff\1\14\1\1\4\uffff\1\1\1\uffff\1\1\2\uffff\10\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "368:2: (this_DomainQuery_0= ruleDomainQuery | this_NestedQuery_1= ruleNestedQuery )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_12 = input.LA(1);

                         
                        int index6_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalQLParser()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index6_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\16\uffff";
    static final String dfa_9s = "\1\4\2\51\12\uffff\1\12";
    static final String dfa_10s = "\1\42\2\51\12\uffff\1\14";
    static final String dfa_11s = "\3\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff";
    static final String dfa_12s = "\16\uffff}>";
    static final String[] dfa_13s = {
            "\1\12\1\7\1\6\1\13\1\2\1\5\1\11\1\1\1\3\1\10\4\uffff\1\4\17\uffff\1\14",
            "\1\15",
            "\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\1\uffff\1\3"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "809:2: (this_ActiveFilter_0= ruleActiveFilter | this_TermFilter_1= ruleTermFilter | this_PreferredInFilter_2= rulePreferredInFilter | this_AcceptableInFilter_3= ruleAcceptableInFilter | this_LanguageRefSetFilter_4= ruleLanguageRefSetFilter | this_TypeFilter_5= ruleTypeFilter | this_ModuleFilter_6= ruleModuleFilter | this_CaseSignificanceFilter_7= ruleCaseSignificanceFilter | this_LanguageCodeFilter_8= ruleLanguageCodeFilter | this_NestedFilter_9= ruleNestedFilter )";
        }
    }
    static final String dfa_14s = "\12\uffff";
    static final String dfa_15s = "\1\1\11\uffff";
    static final String dfa_16s = "\1\24\4\uffff\1\0\4\uffff";
    static final String dfa_17s = "\1\43\4\uffff\1\0\4\uffff";
    static final String dfa_18s = "\1\uffff\1\2\7\uffff\1\1";
    static final String dfa_19s = "\5\uffff\1\0\4\uffff}>";
    static final String[] dfa_20s = {
            "\2\1\3\uffff\2\1\1\5\1\1\6\uffff\1\1",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 1474:3: ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalQLParser()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_21s = "\1\24\3\uffff\2\0\4\uffff";
    static final String dfa_22s = "\1\43\3\uffff\2\0\4\uffff";
    static final String dfa_23s = "\4\uffff\1\0\1\1\4\uffff}>";
    static final String[] dfa_24s = {
            "\2\1\3\uffff\1\5\1\4\2\1\6\uffff\1\1",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_18;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "()* loopback of 1539:3: ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_4 = input.LA(1);

                         
                        int index19_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalQLParser()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_5 = input.LA(1);

                         
                        int index19_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalQLParser()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_25s = "\1\2\11\uffff";
    static final String dfa_26s = "\1\24\1\0\10\uffff";
    static final String dfa_27s = "\1\43\1\0\10\uffff";
    static final String dfa_28s = "\2\uffff\1\2\6\uffff\1\1";
    static final String dfa_29s = "\1\uffff\1\0\10\uffff}>";
    static final String[] dfa_30s = {
            "\2\2\3\uffff\3\2\1\1\6\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_14;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "1611:3: ( () this_EXCLUSION_2= RULE_EXCLUSION ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_1 = input.LA(1);

                         
                        int index20_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalQLParser()) ) {s = 9;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index20_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_31s = "\1\24\3\uffff\1\0\5\uffff";
    static final String dfa_32s = "\1\43\3\uffff\1\0\5\uffff";
    static final String dfa_33s = "\4\uffff\1\0\5\uffff}>";
    static final String[] dfa_34s = {
            "\2\1\3\uffff\2\1\1\4\1\1\6\uffff\1\1",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[][] dfa_34 = unpackEncodedStringArray(dfa_34s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_18;
            this.special = dfa_33;
            this.transition = dfa_34;
        }
        public String getDescription() {
            return "()* loopback of 2527:3: ( ( RULE_DISJUNCTION )=> ( () this_DISJUNCTION_2= RULE_DISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_4 = input.LA(1);

                         
                        int index27_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalQLParser()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_35s = "\1\24\2\uffff\2\0\5\uffff";
    static final String dfa_36s = "\1\43\2\uffff\2\0\5\uffff";
    static final String dfa_37s = "\3\uffff\1\0\1\1\5\uffff}>";
    static final String[] dfa_38s = {
            "\2\1\3\uffff\1\4\1\3\2\1\6\uffff\1\1",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_18;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "()* loopback of 2595:3: ( ( RULE_CONJUNCTION | RULE_COMMA )=> ( () (this_CONJUNCTION_2= RULE_CONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_3 = input.LA(1);

                         
                        int index29_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalQLParser()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_4 = input.LA(1);

                         
                        int index29_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalQLParser()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_39s = "\21\uffff";
    static final String dfa_40s = "\1\27\1\0\14\uffff\1\0\2\uffff";
    static final String dfa_41s = "\1\64\1\0\14\uffff\1\0\2\uffff";
    static final String dfa_42s = "\2\uffff\1\1\14\uffff\1\2\1\3";
    static final String dfa_43s = "\1\uffff\1\0\14\uffff\1\1\2\uffff}>";
    static final String[] dfa_44s = {
            "\1\2\6\uffff\1\2\1\uffff\1\17\1\uffff\1\16\1\uffff\1\1\3\uffff\1\2\1\uffff\1\2\2\uffff\10\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_39;
            this.eof = dfa_39;
            this.min = dfa_40;
            this.max = dfa_41;
            this.accept = dfa_42;
            this.special = dfa_43;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "2658:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_InternalQLParser()) ) {s = 2;}

                        else if ( (synpred50_InternalQLParser()) ) {s = 15;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_14 = input.LA(1);

                         
                        int index30_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_InternalQLParser()) ) {s = 2;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index30_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_45s = "\20\uffff";
    static final String dfa_46s = "\1\27\15\uffff\1\0\1\uffff";
    static final String dfa_47s = "\1\64\15\uffff\1\0\1\uffff";
    static final String dfa_48s = "\1\uffff\1\1\15\uffff\1\2";
    static final String dfa_49s = "\16\uffff\1\0\1\uffff}>";
    static final String[] dfa_50s = {
            "\1\1\6\uffff\1\1\3\uffff\1\16\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\2\uffff\10\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            ""
    };

    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[][] dfa_50 = unpackEncodedStringArray(dfa_50s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_45;
            this.eof = dfa_45;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_48;
            this.special = dfa_49;
            this.transition = dfa_50;
        }
        public String getDescription() {
            return "2988:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_14 = input.LA(1);

                         
                        int index35_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalQLParser()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index35_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_51s = "\101\uffff";
    static final String dfa_52s = "\23\uffff\2\51\2\uffff\2\55\2\uffff\2\61\2\uffff\2\65\2\uffff\2\71\2\uffff\2\75\2\uffff\2\51\2\uffff\2\55\2\uffff\2\61\2\uffff\2\65\2\uffff\2\71\2\uffff\2\75";
    static final String dfa_53s = "\1\53\2\17\4\67\1\35\3\uffff\1\35\1\uffff\6\35\2\24\2\35\2\24\2\35\2\24\2\35\2\24\2\35\2\24\2\35\2\24\2\uffff\2\24\2\uffff\2\24\2\uffff\2\24\2\uffff\2\24\2\uffff\2\24\2\uffff\2\24";
    static final String dfa_54s = "\1\66\2\73\4\67\1\47\3\uffff\1\47\1\uffff\4\47\2\36\2\51\2\36\2\51\2\36\2\51\2\36\2\51\2\36\2\51\2\36\2\51\2\uffff\2\51\2\uffff\2\51\2\uffff\2\51\2\uffff\2\51\2\uffff\2\51\2\uffff\2\51";
    static final String dfa_55s = "\10\uffff\1\1\1\3\1\2\1\uffff\1\4\34\uffff\1\5\1\13\2\uffff\1\6\1\14\2\uffff\1\7\1\15\2\uffff\1\10\1\16\2\uffff\1\11\1\17\2\uffff\1\12\1\20\2\uffff";
    static final String dfa_56s = "\101\uffff}>";
    static final String[] dfa_57s = {
            "\1\1\1\2\1\5\1\3\6\uffff\1\4\1\6",
            "\1\10\3\uffff\1\10\43\uffff\1\7\3\uffff\1\11",
            "\1\12\3\uffff\1\12\43\uffff\1\13\3\uffff\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\23\1\24\7\uffff\1\21\1\22",
            "",
            "",
            "",
            "\1\27\1\30\7\uffff\1\25\1\26",
            "",
            "\1\33\1\34\7\uffff\1\31\1\32",
            "\1\37\1\40\7\uffff\1\35\1\36",
            "\1\43\1\44\7\uffff\1\41\1\42",
            "\1\47\1\50\7\uffff\1\45\1\46",
            "\1\23\1\24",
            "\1\23\1\24",
            "\2\51\3\uffff\4\51\4\uffff\1\51\1\uffff\1\51\5\uffff\1\52",
            "\2\51\3\uffff\4\51\1\54\1\53\2\uffff\1\51\1\uffff\1\51\5\uffff\1\52",
            "\1\27\1\30",
            "\1\27\1\30",
            "\2\55\3\uffff\4\55\4\uffff\1\55\1\uffff\1\55\5\uffff\1\56",
            "\2\55\3\uffff\4\55\1\60\1\57\2\uffff\1\55\1\uffff\1\55\5\uffff\1\56",
            "\1\33\1\34",
            "\1\33\1\34",
            "\2\61\3\uffff\4\61\4\uffff\1\61\1\uffff\1\61\5\uffff\1\62",
            "\2\61\3\uffff\4\61\1\64\1\63\2\uffff\1\61\1\uffff\1\61\5\uffff\1\62",
            "\1\37\1\40",
            "\1\37\1\40",
            "\2\65\3\uffff\4\65\4\uffff\1\65\1\uffff\1\65\5\uffff\1\66",
            "\2\65\3\uffff\4\65\1\70\1\67\2\uffff\1\65\1\uffff\1\65\5\uffff\1\66",
            "\1\43\1\44",
            "\1\43\1\44",
            "\2\71\3\uffff\4\71\4\uffff\1\71\1\uffff\1\71\5\uffff\1\72",
            "\2\71\3\uffff\4\71\1\74\1\73\2\uffff\1\71\1\uffff\1\71\5\uffff\1\72",
            "\1\47\1\50",
            "\1\47\1\50",
            "\2\75\3\uffff\4\75\4\uffff\1\75\1\uffff\1\75\5\uffff\1\76",
            "\2\75\3\uffff\4\75\1\100\1\77\2\uffff\1\75\1\uffff\1\75\5\uffff\1\76",
            "",
            "",
            "\2\51\3\uffff\4\51\1\54\1\53\2\uffff\1\51\1\uffff\1\51\5\uffff\1\52",
            "\2\51\3\uffff\4\51\1\54\1\53\2\uffff\1\51\1\uffff\1\51\5\uffff\1\52",
            "",
            "",
            "\2\55\3\uffff\4\55\1\60\1\57\2\uffff\1\55\1\uffff\1\55\5\uffff\1\56",
            "\2\55\3\uffff\4\55\1\60\1\57\2\uffff\1\55\1\uffff\1\55\5\uffff\1\56",
            "",
            "",
            "\2\61\3\uffff\4\61\1\64\1\63\2\uffff\1\61\1\uffff\1\61\5\uffff\1\62",
            "\2\61\3\uffff\4\61\1\64\1\63\2\uffff\1\61\1\uffff\1\61\5\uffff\1\62",
            "",
            "",
            "\2\65\3\uffff\4\65\1\70\1\67\2\uffff\1\65\1\uffff\1\65\5\uffff\1\66",
            "\2\65\3\uffff\4\65\1\70\1\67\2\uffff\1\65\1\uffff\1\65\5\uffff\1\66",
            "",
            "",
            "\2\71\3\uffff\4\71\1\74\1\73\2\uffff\1\71\1\uffff\1\71\5\uffff\1\72",
            "\2\71\3\uffff\4\71\1\74\1\73\2\uffff\1\71\1\uffff\1\71\5\uffff\1\72",
            "",
            "",
            "\2\75\3\uffff\4\75\1\100\1\77\2\uffff\1\75\1\uffff\1\75\5\uffff\1\76",
            "\2\75\3\uffff\4\75\1\100\1\77\2\uffff\1\75\1\uffff\1\75\5\uffff\1\76"
    };

    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[][] dfa_57 = unpackEncodedStringArray(dfa_57s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_51;
            this.eof = dfa_52;
            this.min = dfa_53;
            this.max = dfa_54;
            this.accept = dfa_55;
            this.special = dfa_56;
            this.transition = dfa_57;
        }
        public String getDescription() {
            return "3323:2: (this_BooleanValueEquals_0= ruleBooleanValueEquals | this_BooleanValueNotEquals_1= ruleBooleanValueNotEquals | this_StringValueEquals_2= ruleStringValueEquals | this_StringValueNotEquals_3= ruleStringValueNotEquals | this_IntegerValueEquals_4= ruleIntegerValueEquals | this_IntegerValueNotEquals_5= ruleIntegerValueNotEquals | this_IntegerValueGreaterThan_6= ruleIntegerValueGreaterThan | this_IntegerValueGreaterThanEquals_7= ruleIntegerValueGreaterThanEquals | this_IntegerValueLessThan_8= ruleIntegerValueLessThan | this_IntegerValueLessThanEquals_9= ruleIntegerValueLessThanEquals | this_DecimalValueEquals_10= ruleDecimalValueEquals | this_DecimalValueNotEquals_11= ruleDecimalValueNotEquals | this_DecimalValueGreaterThan_12= ruleDecimalValueGreaterThan | this_DecimalValueGreaterThanEquals_13= ruleDecimalValueGreaterThanEquals | this_DecimalValueLessThan_14= ruleDecimalValueLessThan | this_DecimalValueLessThanEquals_15= ruleDecimalValueLessThanEquals )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x001FE50440100000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000006000002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400043FF0L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x001FE50440000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0800000000034000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x001FE51540800000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x001FE51440800000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x001FE50440800000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0060780000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040060000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000C060000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000060000002L});
    }


}