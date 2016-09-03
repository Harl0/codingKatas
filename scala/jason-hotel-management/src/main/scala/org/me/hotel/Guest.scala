package org.me.hotel

/**
  * Created by Jason on 20/08/2016.
  */
case class Guest(name: String) {
  require(!name.isEmpty,"Name must be defined")
}
