package cookbook

/**
  * Created by Jason on 29/08/2016.
  */

class CookbookRefactoredSpec extends UnitTest("Cookbook Refactored") {
  //
  //  "CookbookRefactored Full Test" should "Equal List(\"peanut butter\", \"jelly\", \"bread\") and " +
  //    "(\"put the peanut butter and jelly on the bread\")" in {
  //
  //    val recipeFull = new Recipe(
  //      List("peanut butter", "jelly", "bread"),
  //      List("put the peanut butter and jelly on the bread")
  //    )
  //
  //    recipeFull.ingredients shouldEqual (List("peanut butter", "jelly", "bread"))
  //    recipeFull.directions shouldEqual(List("put the peanut butter and jelly on the bread"))
  //
  //  }
  //
  //  "CookbookRefactored Ingredients" should "Equal List(\"peanut butter\", \"jelly\", \"bread\")" in {
  //
  //    val RecipeIngredientOnly = new Recipe(
  //      ingredients = List("peanut butter", "jelly", "bread"))
  //
  //    RecipeIngredientOnly.ingredients shouldEqual (List("peanut butter", "jelly", "bread"))
  //  }
  //
  //  "CookbookRefactored Directions" should "Equal List(\"peanut butter\", \"jelly\", \"bread\")" in {
  //
  //    val RecipeDirectionsOnly = new Recipe(
  //      directions = List("put the peanut butter and jelly on the bread"))
  //
  //    RecipeDirectionsOnly.directions shouldEqual(List("put the peanut butter and jelly on the bread"))
  //  }

  "CookbookRefactored cake" should "Equal \"Map(Flour -> 300.0g, sugar -> 20.0g, eggs -> 1.0kg)\" AND List(\"Mix it up\")" in {
    val cake = RecipeRefactored(
      Map("Flour" -> new Grams(300),
        "sugar" -> new Grams(20),
        "eggs" -> new Kilograms(1)),
      List("Mix it up"))

    cake.ingredients.toString() shouldEqual "Map(Flour -> 300.0g, sugar -> 20.0g, eggs -> 1.0kg)"

    cake.directions shouldEqual (List("Mix it up"))

  }

  "CookbookRefactored pbj" should "Equal List(\"Peanut butter\", \"jelly\", \"bread\") AND \"put the peanut butter and jelly on the bread\"" in {

    //    val pbj = RecipeRefactored.apply(
    //      List("Peanut butter", "jelly", "bread"),
    //      List("put the peanut butter and jelly on the bread"))

    CookbookRefactored.pbj.ingredients.toString() shouldEqual "Map(Peanut butter -> 10.0g, jelly -> 1.0kg, bread -> 250.0g)"
    CookbookRefactored.pbj.directions shouldEqual (List("put the peanut butter and jelly on the bread"))

  }

  "CookbookRefactored baconPancakes" should "Equal List(\"bacon\", \"pancakes\") AND  List(\"take some bacon and put it on a pancake\")" in {
    //
    //    val baconPancakes = RecipeRefactored.apply(
    //      List("bacon", "pancakes"),
    //      List("take some bacon and put it on a pancake"))

    CookbookRefactored.baconPancakes.ingredients.toString() shouldEqual "Map(bacon -> 1.0kg, pancakes -> 10.0mg)"

    CookbookRefactored.baconPancakes.directions shouldEqual (List("take some bacon and put it on a pancake"))

  }

  //TODO make this test fail due to missing value or something!
  "CookbookRefactored chicken sandwich" should "Fail" in {

    val chickenSandwich = RecipeRefactored(
      Map(
        "chicken" ->  Kilograms(10),
        "bread" ->  Grams(100)),
      List("Eat it!"))

    chickenSandwich.ingredients.toString() shouldEqual "Map(chicken -> 10.0kg, bread -> 100.0g)"

    chickenSandwich.directions shouldEqual (List("Eat it!"))
  }

}
