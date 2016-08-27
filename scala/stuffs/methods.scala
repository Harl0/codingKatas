// Method to return the month as String.
// Accepts number of month as input.

	def monthNumber(n: Int): String =
	if (n == 1) {
		"Jan"
	} else if (n == 2) {
		"Feb"
	} else {
		"Unknown"
	}

// Refactored to use pattern matching
// Use case of if else blocks

def monthNumber(n: Int): String = n match {
	case 1 => "Jan"
	case 2 => "Feb"
	case _ => "Unknown"
}

// Match the number of days in a month, 
// return the number of days in the requested month using collasped cases
// using constant patterns

def daysInMonth(n: Int): Int = n match {
	case 1 | 3 | 5 | 7 | 8 | 10 | 12 => 31
	case 4 | 6 | 9 | 11 => 30
	case 2 => 28
	case _ => 0
}

// Match a variety of types using pattern matching

def whatIsIt(something: Any): String something match {

	case 1 => "The number one"
	case "hello" => "A greeting"
	case List(_, _, _) => "A three item list"
	case List(_, _) => "A two item list"
	case _ => "Unknown"
}