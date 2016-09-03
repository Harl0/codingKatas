def add(m: Int, n: Int): Int = m + n
def multiply(m: Int, n: Int): Int = m * n

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

def parseInt(s: String): Int = try {
  s.toInt
} catch {
  case e: NumberFormatException => 0
  case _ : Throwable => 0
}

parseInt("uu")

"1".toInt

def parseIntSome(s: String): Option[Int] = try {
  Some(s.toInt)
} catch {
  case e: NumberFormatException => None
}

parseIntSome("1")
parseIntSome("d")

for (i: Int <- 1 to 10) println("I'M AWESOME!")

val original = List(1,2,3)

import scala.collection.mutable

val transformed = new mutable.MutableList[Int]

for (i: Int <- 0 until original.size) transformed += original(i) * 2

transformed

transformed.clear()

for (i <- original) transformed += i * 2

transformed

for (i <- original) yield i * 2

 for {
  i <- List(1, 2, 3)
  j <- List(4, 5, 6)
  product = i * j
  if product % 2 == 0
} yield product


/////////////////
val iList = List(1,2,3)
val jList = List(4,5,6)
val megaList = iList ::: jList

// concat two lists
val fruit = iList.:::(jList)



