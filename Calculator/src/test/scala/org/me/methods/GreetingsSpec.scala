package org.me.methods

/**
  * Created by Jason on 27/08/2016.
  */
class GreetingsSpec extends UnitTest("Greetings") {


  "Hello" should "Equal \"Hello\"" in {

    val greeting = new Greetings

    greeting.customGreeting("Hello") shouldEqual("Hello")
  }

  "Hello, Jason" should "Equal \"Hello, Jason\"" in {

    val greeting = new Greetings

    greeting.customGreeting("Hello, Jason") shouldEqual("Hello, Jason")
  }

  "1234QWER(*&^" should "Equal \"1234QWER(*&^\"" in {

    val greeting = new Greetings

    greeting.customGreeting("1234QWER(*&^") shouldEqual("1234QWER(*&^")
  }

}