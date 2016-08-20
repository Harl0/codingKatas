package org.me.hotel

/**
  * Created by Jason on 20/08/2016.
  */

class RoomTest extends UnitTest("Room") {
  it should "provide info about its occupation" in {
    Room(1).isFree() shouldEqual true
    Room(1,None).isFree() shouldEqual true
    Room(1,Some(Guest("Bruce"))).isFree() shouldEqual false
  }

}
