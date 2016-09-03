import calculator.CalculatorRefactored

val args = Array("1 2 3 + -")
val firstValue = args(0)

val converted = firstValue.toString

CalculatorRefactored.parse(firstValue)


val numbers = Array(1, 2, 3, 4)
val first = numbers(0) // read the first element


/**
  * Created by Jason on 02/09/2016.
  */
class ShoppingCart {

  // accept a list of items
  // map to a cost
  // total up the bill


  // global variables
  val apple_value = 25
  val orange_value = 60

  val apple_count = 0
  val orange_count = 0

  def handleItems(item: String) = item match {
    case "apple" => apple_count + 1
    case "orange" => orange_count + 1
    case _ => "unknown item"
  }

  def increase_apple(apple_count: Int): Int = apple_count + 1

  val list = handleItems("apple")

  println(list)

}