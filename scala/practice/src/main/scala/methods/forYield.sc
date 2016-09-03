val i = List(1,2,3)
val j = List(4,5,6)

product.map
val product = for {
//  i <- List(1, 2, 3)
//  j <- List(4, 5, 6)
  product = i * j
 if product % 2 == 0
} yield product

//println(product)