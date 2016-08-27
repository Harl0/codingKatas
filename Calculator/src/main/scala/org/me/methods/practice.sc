def helloJason(): String = "Hello"
println(helloJason())

def greeting(message: String): String = message
greeting("Hello")

def refactoredWhatIsIt(something: Any): String = something match {
  case n: Int => "The number " + n
  case s: String => "The string " + s
  case List(a, b, c) => "A list of three " + a + ", " + b + ", " + c
  case List(a, b) => "A list of two " + a + ", " + b
  case _ => "Unknown"
}

refactoredWhatIsIt(List(1, 2, 4))
refactoredWhatIsIt(List(1, "tree", 3.4))
refactoredWhatIsIt(List(1, 2))
refactoredWhatIsIt(List(1, "tree"))
