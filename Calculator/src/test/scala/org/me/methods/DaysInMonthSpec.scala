package org.me.methods

/**
  * Created by Jason on 27/08/2016.
  */
class DaysInMonthSpec extends UnitTest("DaysInMonth") {

  "1" should "Equal 31" in {

    val days = new DaysInMonth

    days.daysInMonth(1) shouldEqual (31)
  }

  "6" should "Equal 30" in {

    val days = new DaysInMonth

    days.daysInMonth(6) shouldEqual (30)
  }

  "2" should "Equal 28" in {

    val days = new DaysInMonth

    days.daysInMonth(2) shouldEqual (28)
  }

  "99" should "Equal 0" in {

    val days = new DaysInMonth

    days.daysInMonth(99) shouldEqual (0)
  }
}