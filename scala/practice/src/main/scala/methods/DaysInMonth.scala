package methods

/**
  * Created by Jason on 27/08/2016.
  */
class DaysInMonth {

  // Match the number of days in a month,
  // return the number of days in the requested month using collasped cases
  // using constant patterns

  def daysInMonth(n: Int): Int = n match {
    case 1 | 3 | 5 | 7 | 8 | 10 | 12 => 31
    case 4 | 6 | 9 | 11 => 30
    case 2 => 28
    case _ => 0
  }

}
