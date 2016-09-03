package methods

/**
  * Created by Jason on 28/08/2016.
  */
class Yield {

  // TODO: refactor to take lists as variable

//  val iList = List(1,2,3)
//  val jList = List(4,5,6)

    for {
      i <- List(1, 2, 3)
      j <- List(4, 5, 6)
      product = i * j
      if product % 2 == 0
    } yield product

}
