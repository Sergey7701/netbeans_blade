/* The following code was generated by JFlex 1.6.1 */

/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2016 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2016 Sun Microsystems, Inc.
 */

package org.netbeans.modules.php.blade.editor.lexer;

import java.util.Objects;
import org.netbeans.spi.lexer.LexerInput;
import org.netbeans.spi.lexer.LexerRestartInfo;
import org.netbeans.modules.web.common.api.ByteStack;

@org.netbeans.api.annotations.common.SuppressWarnings({"SF_SWITCH_FALLTHROUGH", "URF_UNREAD_FIELD", "DLS_DEAD_LOCAL_STORE", "DM_DEFAULT_ENCODING"})

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>/home/ravi/NetBeansProjects/org.netbeans.modules.php.blade/tools/BladeTopColoringLexer.flex</tt>
 */
public class BladeTopColoringLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = LexerInput.EOF;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int ST_RAW_START = 2;
  public static final int ST_RAW_END = 4;
  public static final int ST_VERBATIM_START = 6;
  public static final int ST_VERBATIM_END = 8;
  public static final int ST_TESI_START = 10;
  public static final int ST_TESI_END = 12;
  public static final int ST_BLOCK = 14;
  public static final int ST_VAR = 16;
  public static final int ST_COMMENT = 18;
  public static final int ST_HIGHLIGHTING_ERROR = 20;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  2,  2,  4,  4,  5,  5,  6,  6, 
     7,  7,  8,  8,  9, 9
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\5\1\1\1\26\1\26\1\1\22\0\1\5\1\0\1\23"+
    "\1\22\3\0\1\24\30\0\1\3\1\7\1\15\1\0\1\13\1\11"+
    "\3\0\1\17\3\0\1\20\1\12\3\0\1\6\1\21\1\16\1\0"+
    "\1\14\1\10\4\0\1\25\4\0\1\7\1\15\1\0\1\13\1\11"+
    "\3\0\1\17\3\0\1\20\1\12\3\0\1\6\1\21\1\16\1\0"+
    "\1\14\1\10\3\0\1\2\1\0\1\4\7\0\1\26\252\0\2\17"+
    "\115\0\1\21\u1ea8\0\1\26\1\26\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\12\0\12\1\1\2\1\3\1\4\1\5\4\1\1\0"+
    "\1\6\1\7\1\10\1\11\2\0\1\12\1\13\1\14"+
    "\1\15\2\0\1\16\1\0\1\17\10\0\1\20\13\0"+
    "\1\21\1\22\5\0\1\23\7\0\1\24\3\0\1\25"+
    "\5\0\1\26\2\0\1\27";

  private static int [] zzUnpackAction() {
    int [] result = new int[93];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\27\0\56\0\105\0\134\0\163\0\212\0\241"+
    "\0\270\0\317\0\346\0\375\0\u0114\0\u012b\0\u0142\0\u0159"+
    "\0\u0170\0\u0187\0\u019e\0\u01b5\0\346\0\u01cc\0\346\0\346"+
    "\0\u01e3\0\u01fa\0\u0211\0\u0228\0\u01fa\0\346\0\346\0\u023f"+
    "\0\346\0\u0256\0\u026d\0\346\0\346\0\346\0\346\0\u0284"+
    "\0\u029b\0\u02b2\0\u0228\0\346\0\u023f\0\u02c9\0\u02e0\0\u02f7"+
    "\0\u030e\0\u0325\0\u033c\0\u0353\0\346\0\u036a\0\u0381\0\u0398"+
    "\0\u03af\0\u03c6\0\u01b5\0\u03dd\0\u03f4\0\u040b\0\u0422\0\u0439"+
    "\0\346\0\346\0\u0450\0\u0467\0\u047e\0\u0495\0\u04ac\0\346"+
    "\0\u04c3\0\u04da\0\u04f1\0\u0508\0\u051f\0\u0536\0\u054d\0\346"+
    "\0\u0564\0\u057b\0\u0592\0\346\0\u05a9\0\u05c0\0\u05d7\0\u05ee"+
    "\0\u0605\0\346\0\u061c\0\u0633\0\346";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[93];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\13\1\14\1\15\1\16\1\13\1\14\20\13\1\0"+
    "\1\13\1\14\1\17\1\20\1\13\1\14\20\13\1\0"+
    "\1\13\1\14\1\21\1\20\1\13\1\14\20\13\1\0"+
    "\1\13\1\14\1\22\1\20\1\13\1\14\20\13\1\0"+
    "\1\13\1\14\1\13\1\23\1\13\1\14\20\13\1\0"+
    "\1\13\1\14\1\13\1\24\1\13\1\14\20\13\1\0"+
    "\1\13\1\14\1\13\1\20\1\13\1\14\20\13\1\0"+
    "\1\13\1\14\1\25\1\13\1\26\1\14\15\13\1\27"+
    "\1\30\1\31\1\0\1\32\1\33\3\32\1\33\14\32"+
    "\1\34\3\32\1\35\1\36\1\0\24\36\31\0\1\14"+
    "\3\0\1\14\23\0\1\37\1\40\16\0\1\41\15\0"+
    "\1\42\4\0\1\43\13\0\1\44\27\0\1\45\25\0"+
    "\1\46\26\0\1\47\34\0\1\50\33\0\1\51\14\0"+
    "\1\52\45\0\3\13\1\0\22\35\1\53\5\35\1\33"+
    "\3\35\1\33\14\35\1\53\10\35\1\54\22\35\5\0"+
    "\1\55\1\56\2\0\1\57\2\0\1\60\24\0\1\61"+
    "\25\0\1\62\27\0\1\63\25\0\1\64\21\0\1\65"+
    "\31\0\1\66\31\0\1\67\25\0\1\70\30\0\1\71"+
    "\34\0\1\72\20\0\1\73\34\0\1\74\15\0\1\75"+
    "\31\0\1\76\21\0\1\77\36\0\1\100\27\0\1\101"+
    "\26\0\1\102\12\0\1\103\1\0\1\75\27\0\1\104"+
    "\5\0\1\105\27\0\1\106\22\0\1\107\21\0\1\110"+
    "\31\0\1\111\30\0\1\112\24\0\1\113\40\0\1\114"+
    "\15\0\1\115\24\0\1\116\36\0\1\117\27\0\1\120"+
    "\12\0\1\121\1\0\1\115\36\0\1\122\30\0\1\123"+
    "\13\0\1\124\31\0\1\125\37\0\1\126\24\0\1\127"+
    "\13\0\1\130\1\0\1\126\40\0\1\131\13\0\1\132"+
    "\42\0\1\133\11\0\1\134\1\0\1\133\25\0\1\135"+
    "\22\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1610];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\12\0\1\11\11\1\1\11\1\1\2\11\4\1\1\0"+
    "\2\11\1\1\1\11\2\0\4\11\2\0\1\1\1\0"+
    "\1\11\10\0\1\11\13\0\2\11\5\0\1\11\7\0"+
    "\1\11\3\0\1\11\5\0\1\11\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[93];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the
   * matched text
   */
  private int yycolumn;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF = false;

  /* user code: */

    private ByteStack stack = new ByteStack();
    private LexerInput input;
    private Lexing lexing;
    private boolean probablyInDString;
    private boolean probablyInSString;
    private int curlyBalance;

    public BladeTopColoringLexer(LexerRestartInfo info) {
        this.input = info.input();
        if(info.state() != null) {
            //reset state
            setState((LexerState) info.state());
            this.lexing = ((LexerState) info.state()).lexing;
            probablyInDString = ((LexerState) info.state()).probablyInDString;
            probablyInSString = ((LexerState) info.state()).probablyInSString;
            curlyBalance = ((LexerState) info.state()).curlyBalance;
        } else {
            zzState = zzLexicalState = YYINITIAL;
            this.lexing = Lexing.NORMAL;
            probablyInDString = false;
            probablyInSString = false;
            curlyBalance = 0;
            stack.clear();
        }

    }

    private enum Lexing {
        NORMAL,
        RAW,
        VERBATIM;
    }

    public static final class LexerState  {
        final ByteStack stack;
        /** the current state of the DFA */
        final int zzState;
        /** the current lexical state */
        final int zzLexicalState;
        private final Lexing lexing;
        private final boolean probablyInDString;
        private final boolean probablyInSString;
        private final int curlyBalance;

        LexerState(ByteStack stack, int zzState, int zzLexicalState, Lexing lexing, boolean probablyInDString, boolean probablyInSString, int curlyBalance) {
            this.stack = stack;
            this.zzState = zzState;
            this.zzLexicalState = zzLexicalState;
            this.lexing = lexing;
            this.probablyInDString = probablyInDString;
            this.probablyInSString = probablyInSString;
            this.curlyBalance = curlyBalance;
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 17 * hash + Objects.hashCode(this.stack);
            hash = 17 * hash + this.zzState;
            hash = 17 * hash + this.zzLexicalState;
            hash = 17 * hash + Objects.hashCode(this.lexing);
            hash = 17 * hash + (this.probablyInDString ? 1 : 0);
            hash = 17 * hash + (this.probablyInSString ? 1 : 0);
            hash = 17 * hash + this.curlyBalance;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final LexerState other = (LexerState) obj;
            if (this.zzState != other.zzState) {
                return false;
            }
            if (this.zzLexicalState != other.zzLexicalState) {
                return false;
            }
            if (this.probablyInDString != other.probablyInDString) {
                return false;
            }
            if (this.probablyInSString != other.probablyInSString) {
                return false;
            }
            if (this.curlyBalance != other.curlyBalance) {
                return false;
            }
            if (!Objects.equals(this.stack, other.stack)) {
                return false;
            }
            if (this.lexing != other.lexing) {
                return false;
            }
            return true;
        }
    }

    public LexerState getState() {
        return new LexerState(stack.copyOf(), zzState, zzLexicalState, lexing, probablyInDString, probablyInSString, curlyBalance);
    }

    public void setState(LexerState state) {
        this.stack.copyFrom(state.stack);
        this.zzState = state.zzState;
        this.zzLexicalState = state.zzLexicalState;
        this.lexing = state.lexing;
        this.probablyInDString = state.probablyInDString;
        this.probablyInSString = state.probablyInSString;
        this.curlyBalance = state.curlyBalance;
    }

    protected int getZZLexicalState() {
        return zzLexicalState;
    }

    protected void popState() {
        yybegin(stack.pop());
    }

    protected void pushState(final int state) {
        stack.push(getZZLexicalState());
        yybegin(state);
    }


 // End user code



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public BladeTopColoringLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 164) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }



  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return input.readText().toString();
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
     return input.readText().charAt(pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return input.readLength();
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    input.backup(number);
    //zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public BladeTopTokenId findNextToken() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    //int zzCurrentPosL;
    //int zzMarkedPosL;
    //int zzEndReadL = zzEndRead;
    //char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      //zzMarkedPosL = zzMarkedPos;

//      yychar+= zzMarkedPosL-zzStartRead;

      zzAction = -1;

      //zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
      int tokenLength = 0;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
            zzInput = input.read();

            if(zzInput == LexerInput.EOF) {
                //end of input reached
                zzInput = YYEOF;
                break zzForAction;
                //notice: currently LexerInput.EOF == YYEOF
            }

//          if (zzCurrentPosL < zzEndReadL) {
//            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
//            zzCurrentPosL += Character.charCount(zzInput);
//          }
//          else if (zzAtEOF) {
//            zzInput = YYEOF;
//            break zzForAction;
//          }
//          else {
//            // store back cached positions
//            zzCurrentPos  = zzCurrentPosL;
//            zzMarkedPos   = zzMarkedPosL;
//            boolean eof = zzRefill();
//            // get translated positions and possibly new buffer
//            zzCurrentPosL  = zzCurrentPos;
//            zzMarkedPosL   = zzMarkedPos;
//            zzBufferL      = zzBuffer;
//            zzEndReadL     = zzEndRead;
//            if (eof) {
//              zzInput = YYEOF;
//              break zzForAction;
//            }
//            else {
//              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
//              zzCurrentPosL += Character.charCount(zzInput);
//            }
//          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            tokenLength = input.readLength();
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      if(zzInput != YYEOF) {
         input.backup(input.readLength() - tokenLength);
      }

          
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
            }
          case 24: break;
          case 2: 
            { if (!probablyInDString && !probablyInSString) {
            curlyBalance++;
        }
            }
          case 25: break;
          case 3: 
            { if (!probablyInDString && !probablyInSString) {
            curlyBalance--;
        }
            }
          case 26: break;
          case 4: 
            { if (!probablyInSString) {
            probablyInDString = !probablyInDString;
        }
            }
          case 27: break;
          case 5: 
            { if (!probablyInDString) {
            probablyInSString = !probablyInSString;
        }
            }
          case 28: break;
          case 6: 
            { return BladeTopTokenId.T_BLADE_OTHER;
            }
          case 29: break;
          case 7: 
            { if (lexing == Lexing.NORMAL) {
            if (yylength() > 2) {
                yypushback(2);
                return BladeTopTokenId.T_HTML;
            }
            pushState(ST_VAR);
            curlyBalance = 0;
            return BladeTopTokenId.T_BLADE_VAR_START;
        }
            }
          case 30: break;
          case 8: 
            { if (lexing == Lexing.NORMAL) {
            if (yylength() > 2) {
                yypushback(2);
                return BladeTopTokenId.T_HTML;
            }
            pushState(ST_BLOCK);
            return BladeTopTokenId.T_BLADE_BLOCK_START;
        }
            }
          case 31: break;
          case 9: 
            { if (lexing == Lexing.NORMAL) {
            int textLength = yylength();
            yypushback(2);
            pushState(ST_COMMENT);
            if (textLength > 2) {
                return BladeTopTokenId.T_HTML;
            }
        }
            }
          case 32: break;
          case 10: 
            { if (yylength() > 2) {
            yypushback(2);
            return BladeTopTokenId.T_HTML;
        }
        lexing = Lexing.RAW;
        return BladeTopTokenId.T_BLADE_BLOCK_START;
            }
          case 33: break;
          case 11: 
            { if (yylength() > 2) {
            yypushback(2);
            return BladeTopTokenId.T_BLADE_BLOCK;
        }
        popState();
        return BladeTopTokenId.T_BLADE_BLOCK_END;
            }
          case 34: break;
          case 12: 
            { if (yylength() > 2) {
            yypushback(2);
            return BladeTopTokenId.T_HTML;
        }
        lexing = Lexing.NORMAL;
        return BladeTopTokenId.T_BLADE_BLOCK_START;
            }
          case 35: break;
          case 13: 
            { if (yylength() > 2) {
            yypushback(2);
            return BladeTopTokenId.T_HTML;
        }
        lexing = Lexing.VERBATIM;
        return BladeTopTokenId.T_BLADE_BLOCK_START;
            }
          case 36: break;
          case 14: 
            { if (!probablyInDString && !probablyInSString) {
            if (yylength() > 2) {
                if (curlyBalance == 0 || curlyBalance == 1) {
                    if (zzInput == YYEOF) {
                        yypushback(3);
                    } else {
                        yypushback(2);
                    }
                    return BladeTopTokenId.T_BLADE_VAR;
                }
            }
            if (curlyBalance == 0) {
                popState();
                return BladeTopTokenId.T_BLADE_VAR_END;
            } else if (curlyBalance == 1) {
                // missing closing curly "}"
                popState();
                curlyBalance = 0;
                return BladeTopTokenId.T_BLADE_VAR_END;
            } else {
                curlyBalance -= 2;
            }
        }
            }
          case 37: break;
          case 15: 
            { popState();
        return BladeTopTokenId.T_BLADE_COMMENT;
            }
          case 38: break;
          case 16: 
            { // {{{}}}
        if (!probablyInDString && !probablyInSString) {
            if (curlyBalance >= 0 && curlyBalance <= 2) {
                curlyBalance--;
                yypushback(2);
            } else {
                curlyBalance -= 3;
            }
        }
            }
          case 39: break;
          case 17: 
            { pushState(ST_TESI_START);
        return BladeTopTokenId.T_BLADE_BLOCK;
            }
          case 40: break;
          case 18: 
            { popState();
        return BladeTopTokenId.T_HTML;
            }
          case 41: break;
          case 19: 
            { if (lexing == Lexing.NORMAL) {
            yypushback(yylength());
            pushState(ST_RAW_START);
        }
            }
          case 42: break;
          case 20: 
            { pushState(ST_TESI_END);
        return BladeTopTokenId.T_BLADE_BLOCK;
            }
          case 43: break;
          case 21: 
            { if (lexing != Lexing.VERBATIM) {
            int indexOfRawBlockStart = yytext().lastIndexOf("{@"); //NOI18N
            yypushback(yylength() - indexOfRawBlockStart);
            pushState(ST_RAW_END);
        }
            }
          case 44: break;
          case 22: 
            { if (lexing == Lexing.NORMAL) {
            yypushback(yylength());
            pushState(ST_VERBATIM_START);
        }
            }
          case 45: break;
          case 23: 
            { if (lexing != Lexing.RAW) {
            int indexOfVerbatimBlockStart = yytext().lastIndexOf("{@"); //NOI18N
            yypushback(yylength() - indexOfVerbatimBlockStart);
            pushState(ST_VERBATIM_END);
        }
            }
          case 46: break;
          default:
          if (zzInput == YYEOF)
            //zzAtEOF = true;
{         if(input.readLength() > 0) {
            // backup eof
            input.backup(1);
            //and return the text as error token
            if (zzLexicalState == ST_BLOCK) {
                return BladeTopTokenId.T_BLADE_BLOCK;
            } else if (zzLexicalState == ST_VAR) {
                return BladeTopTokenId.T_BLADE_VAR;
            } else {
                return BladeTopTokenId.T_HTML;
            }
        } else {
            return null;
        }
 }
        
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
