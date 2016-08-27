package org.me.hotel

/**
  * Created by Jason on 20/08/2016.
  */
class GuestTest extends UnitTest("Guest") {

  it should "have its name defined" in {
    Guest("Jason") // works fine
    an [IllegalArgumentException] should be thrownBy {
      Guest("") // oops...
    }
  }

}
