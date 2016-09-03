package calculator

import scala.collection.mutable

/**
  * Created by Jason on 20/08/2016.
  */

class Calculator {

  // def main(args: Array[String]): Unit = println("Hello, world")
  // execute via sbt run
  // inital main method to just echo out Hello, world to prove runs

//  def main(args: Array[String]): Unit =
//    if (args.length != 1) {
//      throw new IllegalArgumentException("Usage calculator <expression>") // exception handling
//
//    } else {
//      val expression = args(0)
//      //println(exception) // debug statement
//      val tokens = expression.split(" ") // spit on space
//      for (token <- tokens) // for token in tokens array
//      token match {
//        case "+" | "-" | "*" | "/" => println("operator " + token) // match supplie token
//        case _ => try { // assume any other value is a number
//          println("number " + token.toInt)
//        }  catch { // catch the fact the token may be rubbish
//          case _: NumberFormatException =>
//            throw new IllegalArgumentException("Invalid token " + token)
//        }
//      }
//    }

  def add(m: Int, n: Int): Int = m + n
  def multiply(m: Int, n: Int): Int = m * n

  // def handleOperator(token: String, stack: mutable.Stack[Int]): Boolean = ??? // dummy function
  def main(args: Array[String]): Unit = {

  if (args.length != 1) {
    throw new IllegalArgumentException("Usage: calculator <expression")
  } else {
      // get the first argument and tokenise it
      val expression = args(0)
      val tokens = expression.split(" ")
      val stack = new mutable.Stack[Int]

      // handle each token
      for (token <- tokens)
         token match { // handle operator cases
          case "+" =>
            val rhs = stack.pop()
            val lhs = stack.pop()
            stack.push(lhs + rhs)
          case "-" =>
            val rhs = stack.pop()
            val lhs = stack.pop()
            stack.push(lhs - rhs)
          case "*" =>
            val rhs = stack.pop()
            val lhs = stack.pop()
            stack.push(lhs * rhs)
          case "/" =>
            val rhs = stack.pop()
            val lhs = stack.pop()
            stack.push(lhs / rhs)
          case _ => try { // assume any other value is a number
            stack.push(token.toInt) // push resulting token to stack
          }  catch { // catch the fact the token may be rubbish
            case _: NumberFormatException =>
              throw new IllegalArgumentException("Invalid token " + token)
          }
        }
      println(stack.pop()) // print resulting output
    }
  }
}
