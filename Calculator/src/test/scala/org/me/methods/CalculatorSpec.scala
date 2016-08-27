package org.me.methods

/**
  * Created by Jason on 20/08/2016.
  */

class CalculatorSpec extends UnitTest("Calculator") {

  "Add 1,4" should "Equal 5" in {

    val calc = new Calculator

    calc.add(1, 4) shouldEqual(5)

  }

  "Add 0,4" should "Equal 4" in {

    val calc = new Calculator

    calc.add(0, 4) shouldEqual(4)
  }

  "Add 99988, 1099938" should "Equal 1199926" in {

    val calc = new Calculator

    calc.add(99988, 1099938) shouldEqual(1199926)
  }

  "Multiply 2, 5" should "Equal 10" in {

    val calc = new Calculator

    calc.multiply(2, 5) shouldEqual(10)
  }

  "Multiply 0, 103" should "Equal 0" in {

    val calc = new Calculator

    calc.multiply(0, 103) shouldEqual(0)
  }

}

