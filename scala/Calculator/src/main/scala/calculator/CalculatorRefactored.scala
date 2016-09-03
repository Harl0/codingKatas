package calculator

import java.util


/**
  * Created by Jason on 29/08/2016.
  */
object CalculatorRefactored {

  trait Operator {

    def operate(lhs: Int, rhs: Int): Int

  }

  // companion object which enables mapping of operators and clean up handle operator
   object Operator {
    val operators: Map[String, Operator] =
      Map("+" -> Add, "-" -> Subtract, "*" -> Multiply, "/" -> Divide)
    def unapply(token: String): Option[Operator] = // take a token and produce an option of operator
      operators.get(token) // if finds token as key in map it returns the key or none
  }

  // case classes to give structure to operators and pattern match
  case object Add extends Operator{
     def operate(lhs: Int, rhs: Int): Int = lhs + rhs
    override val toString = "+"
  }
  case object Subtract extends Operator{
     def operate(lhs: Int, rhs: Int): Int = lhs - rhs
    override val toString = "-"
  }
  case object Multiply extends Operator{
     def operate(lhs: Int, rhs: Int): Int = lhs * rhs
    override val toString = "*"
  }
  case object Divide extends Operator{
     def operate(lhs: Int, rhs: Int): Int = lhs / rhs
    override val toString = "/"
  }

  // if the supplied token is a number, add it to the stack
  object Number {
    def unapply(token: String): Option[Int] = try {
      Some(token.toInt) // wrapped in some as produces an option
    } catch {
      case _: NumberFormatException => None
    }
  }
//  /**
//    * if the token is an operator, pop two operands off the stack
//    * perform the operation and push the result back on
//    *
//    * @param token
//    * @param stack
//    * @return
//    */
//  def handleOperator(token: String, stack: mutable.Stack[Int]): Boolean = token match {
//    case "+" =>
//      val rhs = stack.pop()
//      val lhs = stack.pop()
//      stack.push(lhs + rhs)
//      true
//    case "-" =>
//      val rhs = stack.pop()
//      val lhs = stack.pop()
//      stack.push(lhs - rhs)
//      true
//    case "*" =>
//      val rhs = stack.pop()
//      val lhs = stack.pop()
//      stack.push(lhs * rhs)
//      true
//    case "/" =>
//      val rhs = stack.pop()
//      val lhs = stack.pop()
//      stack.push(lhs / rhs)
//      true
//    case _ => false
//  }
//
//  /**
//    * if the token is a number, push it on the stack
//    *
//    * @param token
//    * @param stack
//    * @return
//    */
//  def handleNumber(token: String, stack: mutable.Stack[Int]): Boolean = try {
//    stack.push(token.toInt) // push resulting token to stack
//    true
//  } catch {
//    // catch the fact the token may be rubbish
//    case _ => false
//  }
//
//  /**
//    * perform calculation using handleNumber and handleOperator functions
//    *
//    * @param expression
//    * @return
//    */
//  def calculate(expression: String): Int = {
//
//    val stack = new mutable.Stack[Int]
//
//    // handle each token
//    for (token <- expression.split(" "))
//      if (!handleOperator(token, stack) && !handleNumber(token, stack))
//        throw new IllegalArgumentException("Invalid token " + token)
//
//    stack.pop()
//
//  }

  /**
    *   class hierarchy (algebraic) parse tree
    */

  sealed trait Expression
  case class NumberExpression(value: Int) extends Expression
  case class OperationExpression(lhs: Expression, rhs: Expression, op: Operator) extends Expression


  /**
    * Calculate the resut of a postfix notation expression
    * @param expression
    * @return
    */
  def parse(expression: String): Expression = {
    val stack = new util.Stack[Expression]

    for (token <- expression.split(" ")) token match {
      case Number(num) => stack.push(NumberExpression(num))
      case Operator(op) =>
        val rhs = stack.pop()
        val lhs = stack.pop()
        stack.push(OperationExpression(lhs, rhs, op))
      case _ => throw new IllegalArgumentException("invalid token: " + token)
    }
    stack.pop()
  }

  def calculate(expression: Expression): Int = expression match {
    case NumberExpression(value) => value
    case OperationExpression(lhs, rhs, op) => op.operate(calculate(lhs), calculate(rhs))
  }

  def toInfix(expression: Expression): String = expression match {

    case NumberExpression(value) => value.toString
    case OperationExpression(lhs, rhs, op) => s"(${toInfix(lhs)} $op ${toInfix(rhs)})"
  }

  def main(args: Array[String]): Unit =
    if (args.length != 1) {
      throw new IllegalArgumentException("Usage calculator <expression>")
      // exception handling for not enough arguments, expect one only

    } else {
      println(args(0))
      val expression = parse(args(0))
      println(s"${toInfix(expression)} = ${calculate(expression)}")
//     println(calculate(args(0)))
    }
}
