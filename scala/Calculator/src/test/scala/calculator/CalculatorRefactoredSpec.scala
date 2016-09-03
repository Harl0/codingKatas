package calculator

/**
  * Created by Jason on 02/09/2016.
  */
class CalculatorRefactoredSpec extends UnitTest("CalculatorRefactored") {

  "run \"1 2 3 + -\"" should "Equal -4" in {
//    val args = "1 2 3 + -"
//    calculator.CalculatorRefactored.parse("1 2 3 + -").toString shouldEqual "(1 - (2 + 3)) = -4"

    def CalcCall(args: Array[String]): Unit =
      if (args.length != 1) {
        throw new IllegalArgumentException("Usage calculator <expression>")
        // exception handling for not enough arguments, expect one only

      } else {
        println(args(0))
        val expression = CalculatorRefactored.parse(args(0))
        println(s"${CalculatorRefactored.toInfix(expression)} = ${CalculatorRefactored.calculate(expression)}")
        //      println(calculate(args(0)))
      }
  }

}