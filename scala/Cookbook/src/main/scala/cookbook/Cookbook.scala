package cookbook

/**
  * Created by Jason on 29/08/2016.
  */

/**
  * Create an empty list of ingredients and directions
  *
  * @param ingredients
  * @param directions
  */

class Recipe(
              var ingredients: List[String] = List.empty,
              var directions: List[String] = List.empty) {

  //  println("ingredients " + ingredients)
  //  println("directions " + directions)
}

/**
  * map ingredients and directions together
  */

class Cookbook {
  var recipes: Map[String, Recipe] = Map.empty
  //  println("Recipes: " + recipes)
}
