package methods

/**
  * Created by Jason on 27/08/2016.
  */
class MonthNumber {

  // Method to return the month as String.
  // Accepts number of month as input.

//  def monthNumber(n: Int): String =
//    if (n == 1) {
//      "Jan"
//    } else if (n == 2) {
//      "Feb"
//    } else {
//      "Unknown"
//    }

  // Refactored to use pattern matching
  // Use case of if else blocks

  def monthNumber(n: Int): String = n match {
    case 1 => "Jan"
    case 2 => "Feb"
    case _ => "Unknown"
  }

}
