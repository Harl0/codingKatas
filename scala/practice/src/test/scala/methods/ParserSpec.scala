package methods

/**
  * Created by Jason on 28/08/2016.
  */
class ParserSpec extends UnitTest("Parser") {

  "1" should "Equal 1" in {

    val parsedMessage = new Parser

    parsedMessage.parseInt("1") shouldEqual(1)

  }

  "Hello" should "Equal 0" in {

    val parsedMessage = new Parser

    parsedMessage.parseInt("Hello") shouldEqual(0)

  }

  "1 Some" should "Equal 1" in {

    val parsedMessage = new Parser

    parsedMessage.parseIntOption("1") shouldEqual(Some(1))
  }

  "Hello Some" should "Equal None" in {

    val parsedMessage = new Parser

    parsedMessage.parseIntOption("Hello") shouldEqual(None)
  }


}
