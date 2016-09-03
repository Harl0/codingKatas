package methods

/**
  * Created by Jason on 27/08/2016.
  */
class WhatIsItSpec extends UnitTest("WhatIsIt") {

  "hello" should "Equal \"A greeting\"" in {

    val whatIsIt = new WhatIsIt

    whatIsIt.whatIsIt("hello") shouldEqual("A greeting")

  }

  "1" should "Equal \"The number one\"" in {

    val whatIsIt = new WhatIsIt

    whatIsIt.whatIsIt(1) shouldEqual("The number one")

  }

  "List of two" should "Equal \"This is a two item list\"" in {

    val whatIsIt = new WhatIsIt

    whatIsIt.whatIsIt(List(1, "two")) shouldEqual("A two item list")

  }

  "List of three, mix" should "Equal \"This is a three item list\"" in {

    val whatIsIt = new WhatIsIt

    whatIsIt.whatIsIt(List(1, "two", 3)) shouldEqual("A three item list")

  }

  "String test" should "Equal \"The string String test\"" in {

    val whatIsIt = new WhatIsIt

    whatIsIt.refactoredWhatIsIt("String test") shouldEqual("The string String test")
  }

  "Number test" should "Equal \"The number 97\"" in {

    val whatIsIt = new WhatIsIt

    whatIsIt.refactoredWhatIsIt(97) shouldEqual("The number 97")
  }

  "List of two" should "Equal \"A list of two 1, 2\"" in {

    val whatIsIt = new WhatIsIt

    whatIsIt.refactoredWhatIsIt(List(1, 2)) shouldEqual("A list of two 1, 2")
  }

  "List of three" should "Equal \"A list of three 1, 2, 3\"" in {

    val whatIsIt = new WhatIsIt

    whatIsIt.refactoredWhatIsIt(List(1, 2, 3)) shouldEqual("A list of three 1, 2, 3")
  }

  "List of three, mix" should "Equal \"A list of three 1, 'tree', 3.4\"" in {

    val whatIsIt = new WhatIsIt

    whatIsIt.refactoredWhatIsIt(List(1, "tree", 3.4)) shouldEqual("A list of three 1, tree, 3.4")
  }

  "Unknown" should "Equal \"Unknown\"" in {

    val whatIsIt = new WhatIsIt

    whatIsIt.refactoredWhatIsIt(List(0.0)) shouldEqual("Unknown")
  }


}
