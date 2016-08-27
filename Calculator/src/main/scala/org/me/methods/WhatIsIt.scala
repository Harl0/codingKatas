package org.me.methods

/**
  * Created by Jason on 27/08/2016.
  */
class WhatIsIt {

  // Match a variety of types using pattern matching
  def whatIsIt(something: Any): String = something match {
    case 1 => "The number one"
    case "hello" => "A greeting"
    case List(_, _, _) => "A three item list"
    case List(_, _) => "A two item list"
    case _ => "Unknown"
  }

  def refactoredWhatIsIt(something: Any): String = something match {
    case n: Int => "The number " + n
    case s: String => "The string " + s
    case List(a, b, c) => "A list of three " + a + ", " + b + ", " + c
    case List(a, b) => "A list of two " + a + ", " + b
    case _ => "Unknown"
  }

}
