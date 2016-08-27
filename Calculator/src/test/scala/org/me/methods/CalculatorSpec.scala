package org.me.methods

/**
  * Created by Jason on 20/08/2016.
  */

class CalculatorSpec extends UnitTest("Calculator") {

  "Calculator add 1,4" should "Should equal 5" in {

    val calc = new Calculator

    calc.add(1, 4) shouldEqual(5)

  }

  "Calculator add 0,4" should "Should equal 4" in {

    val calc = new Calculator

    calc.add(0, 4) shouldEqual(4)
  }

  "Calculator add 99988, 1099938" should "Should equal 1199926" in {

    val calc = new Calculator

    calc.add(99988, 1099938) shouldEqual(1199926)
  }


}

