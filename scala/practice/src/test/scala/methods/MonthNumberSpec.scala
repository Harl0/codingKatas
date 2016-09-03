package methods

/**
  * Created by Jason on 27/08/2016.
  */

class MonthNumberSpec extends UnitTest("MonthNumber") {

  "Jan" should "Equal \"Jan\"" in {

    val month = new MonthNumber

    month.monthNumber(1) shouldEqual "Jan"

  }

  "Feb" should "Equal \"Feb\"" in {

    val month = new MonthNumber

    month.monthNumber(2) shouldEqual "Feb"

  }

  "Jason" should "Equal \"unknown\"" in {

    val month = new MonthNumber

    month.monthNumber(111) shouldEqual "Unknown"

  }
}