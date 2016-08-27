package org.me.methods

/**
  * Created by Jason on 27/08/2016.
  */

class MethodsSpec extends UnitTest("Methods") {

  "monthNumber Jan" should "Return the value of Jan" in {

    val month = new Methods

    month.monthNumber(1) shouldEqual "Jan"

  }

  "monthNumber Feb" should "Return the value of Feb" in {

    val month = new Methods

    month.monthNumber(2) shouldEqual "Feb"

  }

  "monthNumber Jason" should "Return the value of unknown" in {

    val month = new Methods

    month.monthNumber(111) shouldEqual "Unknown"

  }

  "daysInMonth 1" should "Equal 31" in {

    val days = new Methods

    days.daysInMonth(1) shouldEqual(31)
  }


  "daysInMonth 6" should "Equal 30" in {

    val days = new Methods

    days.daysInMonth(6) shouldEqual(30)
  }

  "daysInMonth 2" should "Equal 28" in {

    val days = new Methods

    days.daysInMonth(2) shouldEqual(28)
  }

  "daysInMonth 99" should "Equal 0" in {

    val days = new Methods

    days.daysInMonth(99) shouldEqual(0)
  }

  "customGreeting" should "Equal Hello" in {

    val greeting = new Methods

    greeting.customGreeting("Hello") shouldEqual("Hello")
  }

}

