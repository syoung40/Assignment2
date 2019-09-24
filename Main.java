import static java.lang.Character.isLetter;
import static java.lang.Character.isSpace;
import static java.lang.Character.isDigit;

public class Assignemnt2 {

	static int charClass;
	static char[] lexeme = new char[100];
	static char nextChar;
	static int lexlen;
	static int nextToken;
	
	// File *in_fp, *fopen();
	
	
	private static final int EOF = 14;
	private static final int NULL = 13;
	private static final int RIGHT_PARENT = 21;
	private static final int LEFT_PARENT = 25;
	private static final int MULT_OP = 15;
	private static final int DIV_OP = 12;
	private static final int ADD_OP = 1;
	private static final int SUB_OP = 9;
	private static final int LETTER = 12;
	private static final int UNKNOWN = 19;
	private static final int DIGIT = 8;
	private static final int IDENT = 20;
	private static final int INT_LIT = 0;

	


	/* main driver */
	void main() {

	/* Open the input data file and process its contents */
	Object in_fp;
  int lex1 = 1;
	if (lex1 == 0)
	  System.out.printf("ERROR - cannot open front.in \n");
	
  else {
	  getChar1();
	  int nextToken = 0;
	  do {
	    lex1();
	  } while (nextToken != EOF);
	}

	}

	private Object fopen(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
	/*****************************************************/
	int lookup(char ch) {
	int nextToken;
	switch (ch) {
	case '(':
	addChar1();
	nextToken = LEFT_PARENT;
	break;

	case ')':
	addChar1();
	nextToken = RIGHT_PARENT;
	break;

	case '+':
	addChar1();
	nextToken = MULT_OP;
	break;

	case '-':
	addChar1();
	nextToken = DIV_OP;
	break;

	case '*':
	addChar1();
	nextToken = ADD_OP;
	break;

	case '/':
	addChar1();
	nextToken = SUB_OP;
	break;

	default:
	addChar1();
	nextToken = EOF;
	break;
	}
	return nextToken;
	}
	/*****************************************************/

	/* addChar1 - a function to add nextChar to lexeme */
	void addChar1() {
	if (lex1() <= 98) {
	char nextChar = 'a';    //=========================================== used 'a' for testign
	char[] lexeme = new char[100];
	int lexLen = 0;
	lexeme[lexLen++] = (char) nextChar;
	lexeme[lex1()] = 0;
	}
	else
	System.out.printf("Error - lexeme is too long \n");
	}


	/*****************************************************/
	/* getChar1 - a function to get the next character of
	input and determine its character class */
	void getChar1() {
	Object in_fp;
	int charClass;
	if (nextChar != EOF) {

    int testChar = (int)nextChar;

	  if (isLetter(nextChar))
	    charClass = LETTER;

    
	  
    else if (isDigit(testChar))
	    charClass = DIGIT;
	  
    else charClass = UNKNOWN;
	}
	else
	  charClass = EOF;
	}


	/*****************************************************/
	/* getNonBlank1 - a function to call getChar until it
	returns a non-whitespace character */
	void getNonBlank1() {
	Object nextChar = null;
	while (isSpace((char)nextChar))
	getChar1();
	}
	

	/* lex1 - a simple lexical analyzer for arithmetic
	expressions */
	
	int lex1() {
		int lexLen = 0;
		getNonBlank1();
		int nextToken = 0;
		
		switch (charClass)
		{
		
		
		

	
		/* Parse identifiers */
		case LETTER:
		addChar1();
		getChar1();
		int charClass1 = 0;
		while (charClass == LETTER || charClass == DIGIT) {
		addChar1();
		getChar1();
		}
		nextToken = IDENT;
		break;
	
		/* Parse integer literals */
		case DIGIT:
		addChar1();
		getChar1();
		while ((char)charClass == DIGIT) {
		addChar1();
		getChar1();
		}
		nextToken = INT_LIT;
		break;
	
		/* Parentheses and operators */
		case UNKNOWN:
		lookup(nextChar);
		getChar1();
		break;
	
		} /* End of switch */
		System.out.printf("Next token is: %d, Next lexeme is %s\n");
		return nextToken;

	} /* End of function lex */
	
	
} // end of Assignment1