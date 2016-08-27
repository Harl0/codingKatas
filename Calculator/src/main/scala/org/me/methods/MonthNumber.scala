package org.me.methods

/**
  * Created by Jason on 27/08/2016.
  */
class MonthNumber {

  // Refactored to use pattern matching
  // Use case of if else blocks

  def monthNumber(n: Int): String = n match {
    case 1 => "Jan"
    case 2 => "Feb"
    case _ => "Unknown"
  }

}
