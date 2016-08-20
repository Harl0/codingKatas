object FirstWorksheet {


  val a = 5

  val b = 15

  val next = if ( a % 2 == 0) a / 2 else 3 * a + 1

  if ( a > 9 ) "hi" else ()


 val result = a*3 match {

    case 0  => "zero"
    case 1 => "one"
    case 5 => "five"
    case 9 => "nine"
    case `b` => "Same as b"
    case i => "something bigger, " +i
  }



}

