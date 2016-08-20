import collection.mutable.Stack
import org.scalatest._

/**
  * Created by Jason on 20/08/2016.
  */
class CalculatorSpec extends FlatSpec with Matchers {

  "Calculator" should "Return the value of 4" in {

    val calc = new Calculator

    calc.add(1, 4)

  }
}

