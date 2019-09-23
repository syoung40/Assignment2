import java.util.Deque;

public class Assignment1 {

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



	/* Function Declaration */
	void addChar1() {
	}
	void getChar1() {
	}
	void getNonBlank1() {
	}
	int lex1() {
		return 0;
	}

	


	/* main driver */
	void main() {

	/* Open the input data file and process its contents */
	Object in_fp;
	if (("font.in", "r") == 0)
	printf("ERROR - cannot open front.in \n");
	else {
	getChar1();
	String nextToken;
	do {
	lex1();
	} while (nextToken = EOF);
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

	/* addChar - a function to add nextChar to lexeme */
	void addChar() {
	if (lex() <= 98) {
	Object nextChar = null;
	int[] lexeme = null;
	int lexLen = 0;
	lexeme[lexLen++] = (int) nextChar;
	lexeme[lex()] = 0;
	}
	else
	printf("Error - lexeme is too long \n");
	}

	private void printf(String string) {
		// TODO Auto-generated method stub
		
	}
	/*****************************************************/
	/* getChar - a function to get the next character of
	input and determine its character class */
	void getChar() {
	Object nextChar;
	Object in_fp;
	int charClass;
	if ((getc(in_fp)) != EOF) {
	if (isalpha(nextChar))
	charClass = LETTER;
	else if (isdigit(nextChar))
	charClass = DIGIT;
	else charClass = UNKNOWN;
	}
	else
	charClass = EOF;
	}

	private boolean isdigit(Object nextChar) {
		// TODO Auto-generated method stub
		return false;
	}
	private Object getc(Object in_fp) {
		// TODO Auto-generated method stub
		return null;
	}
	private boolean isalpha(Object nextChar) {
		// TODO Auto-generated method stub
		return false;
	}
	/*****************************************************/
	/* getNonBlank - a function to call getChar until it
	returns a non-whitespace character */
	void getNonBlank() {
	Object nextChar = null;
	while (isspace(nextChar))
	getChar1();
	}
	

	/* lex1 - a simple lexical analyzer for arithmetic
	expressions */
	private boolean isspace(Object nextChar) {
		// TODO Auto-generated method stub
		return false;
	}
	int lex() {
	int lexLen = 0;
	getNonBlank1();
	switch (charClass) int nextToken;
	Object lexeme;
	{

	
	/* Parse identifiers */
	 LETTER:
	addChar1();
	getChar1();
	int charClass;
	while (charClass == LETTER || charClass == DIGIT) {
	addChar1();
	getChar1();
	}
	nextToken = IDENT;
	break;

	/* Parse integer literals */
	int DIGIT;
	addChar1();
	getChar1();
	while (charClass == DIGIT) {
	addChar1();
	getChar1();
	}
	nextToken = INT_LIT;
	break;

	/* Parentheses and operators */
	 char nextChar;
	UNKNOWN:
	lookup(nextChar);
	getChar1();
	break;

	/* EOF */
	 EOF:
	nextToken = EOF;
	string lexeme(0) = 'E';
	lexeme[1] = 'O';
	lexeme[2] = 'F';
	lexeme[3] = 0;
	break;

	} /* End of switch */
	printf("Next token is: %d, Next lexeme is %s\n");
	return nextToken;

	} /* End of function lex */
}

