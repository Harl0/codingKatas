package cookbook

/**
  * Created by Jason on 29/08/2016.
  */

class CookbookSpec extends UnitTest("Cookbook") {

  "Cookbook" should "Equal List(\"peanut butter\", \"jelly\", \"bread\")" in {

    val cookbook = new Cookbook
    val recipe = new Recipe

    cookbook.recipes = Map("p.b & j." -> recipe)
    recipe.ingredients = List("peanut butter", "jelly", "bread")
    recipe.directions = List("put the peanut butter and jelly on the bread")
    cookbook.recipes("p.b & j.").ingredients shouldEqual (List("peanut butter", "jelly", "bread"))
    cookbook.recipes("p.b & j.").directions shouldEqual (List("put the peanut butter and jelly on the bread"))
  }

}
