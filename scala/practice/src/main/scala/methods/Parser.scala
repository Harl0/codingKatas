package methods

/**
  * Created by Jason on 28/08/2016.
  */
class Parser {

  def parseInt(s: String): Int = try {
    s.toInt
  } catch {
    case e: NumberFormatException => 0
    case _ : Throwable => 0
  }

  def parseIntOption(s: String): Option[Int] = try {
    Some(s.toInt)
  } catch {
    case e: NumberFormatException => None
    }
}
