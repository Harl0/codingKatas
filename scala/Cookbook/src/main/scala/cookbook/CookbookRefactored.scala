package cookbook

/**
  * Created by Jason on 29/08/2016.
  */

///**
//  * Create an empty immutable list of ingredients and directions
//  * @param ingredients
//  * @param directions
//  */

//class RecipeRefactored(
//  val ingredients: List[String] = List.empty,
//  val directions: List[String] = List.empty) {
//  // println("ingredients " + ingredients)
//  //println("directions " + directions)
//}


///**
//  * map ingredients and directions together
//  */

//class CookbookRefactored(val recipes: Map[String, Recipe]){
//  //println("Recipes: " + recipes)
//  def this() = this(Map.empty) // aux constructor
//}

/**
  * Constructor
  * contains shoppingList function which calculates wither more of a given ingredient is required
  *
  * @param ingredients
  * @param directions
  */
//class RecipeRefactored private(val ingredients: List[String], val directions: List[String])
//case class RecipeRefactored private(ingredients: List[String], directions: List[String])
case class RecipeRefactored private(ingredients: Map[String, Mass], directions: List[String]) {
  def shoppingList(kitchen: Map[String, Mass]): List[String] =
    for {
      (name, need) <- ingredients.toList
      have = kitchen.getOrElse(name, Grams(0))
      if have.compareTo(need) < 0
    } yield name
}

///**
//  * Companion object of class Recipe
//  */
//object RecipeRefactored {
//  def make(ingredients: List[String] = List.empty,
//           directions: List[String] = List.empty): Recipe =
//    new Recipe(ingredients, directions)
//}

//object RecipeRefactored {
//  def apply(
//      ingredients: List[String] = List.empty,
//      directions: List[String] = List.empty): Recipe =
//    new Recipe(ingredients, directions)
//
//  def unapply(recipe: Recipe): Option[(List[String], List[String])] =
//    Some((recipe.ingredients, recipe.directions))
//}

/**
  * abstract class which uses the Compare class, used for shoppingList function
  * implemented by the case classes
  */
sealed abstract class Mass extends Comparable[Mass] {
  def amount: Double

  def toGrams: Grams

  def compareTo(that: Mass): Int = (this.toGrams.amount - that.toGrams.amount) toInt
}

/**
  * case classes to support the Mass calculations
  * @param amount
  */
case class Grams(amount: Double) extends Mass {
  override def toGrams: Grams = this

  override def toString: String = amount + "g"
}

case class Milligrams(amount: Double) extends Mass {
  override def toGrams: Grams = Grams(amount / 1000)

  override def toString: String = amount + "mg"
}

case class Kilograms(amount: Double) extends Mass {
  override def toGrams: Grams = Grams(amount * 1000)

  override def toString: String = amount + "kg"
}

/**
  * new recipe objects
  */
object CookbookRefactored {
  val pbj = RecipeRefactored(
    //    List("Peanut butter", "jelly", "bread"),
    //    List("put the peanut butter and jelly on the bread"))

    Map("Peanut butter" -> new Grams(10),
      "jelly" -> new Kilograms(1),
      "bread" -> new Grams(250)),
    List("put the peanut butter and jelly on the bread"))


  val baconPancakes = RecipeRefactored(
    //    List("bacon", "pancakes"),
    //    List("take some bacon and put it on a pancake"))

    Map("bacon" -> new Kilograms(1),
      "pancakes" -> new Milligrams(10)),
    List("take some bacon and put it on a pancake"))
}