
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.hluther.parser;

import java_cup.runtime.*;
import com.hluther.gui.PrincipalFrame;
import com.hluther.lexer.Lexer;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\004\000\002\002\004\000\002\003\003\000\002\002" +
    "\004\000\002\002\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\006\000\004\004\004\001\002\000\006\002\ufffe\004" +
    "\004\001\002\000\004\002\007\001\002\000\004\002\000" +
    "\001\002\000\004\002\001\001\002\000\004\002\uffff\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\006\000\006\002\005\003\004\001\001\000\004\002" +
    "\007\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    private PrincipalFrame principalFrame;
    private int n;
    
    public Parser(Lexer lexer, PrincipalFrame principalFrame) { 
        super(lexer);
        this.principalFrame = principalFrame;
    }

    public void printValue(int value){
        principalFrame.printValue(value);
    }

    public void printProcess(String process){
        principalFrame.printProcess(process + "\n");
    }

    public void syntax_error(Symbol s){
       
    }

    public void unrecovered_syntax_error(Symbol s){
       
    } 


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= s EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // s ::= d 
            {
              Object RESULT =null;
		int valueleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valueright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer value = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		  printValue(value); 
            printProcess("Todos los hijos del arbol se han sintetizado, el resultado final es: " + value);
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("s",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // d ::= NUM d 
            {
              Integer RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int numright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Integer num = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int valueleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valueright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer value = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 
            n++;
            int op = value + (num * (int)Math.pow(8, n));
            printProcess("Se multiplica " + num + " por 8^" +n+ " y se suma al valor previamente sintetizado de " +value+ ". Se sintetiza el resultado: " + op);
            RESULT = op;
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("d",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // d ::= NUM 
            {
              Integer RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int numright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Integer num = (Integer)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 
            n = 0;
            int op = num * (int)Math.pow(8, n);
            printProcess("Se multiplica " + num + " por 8^" +n+ " y se sintetiza el resultado: " + op);
            RESULT = op;
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("d",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
