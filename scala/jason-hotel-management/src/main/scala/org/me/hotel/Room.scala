package org.me.hotel

/**
  * Created by Jason on 20/08/2016.
  */
case class Room(number: Int, guest: Option[Guest] = None){ room =>

  def isAvailable(): Boolean = ???

  def checkin(guest: Guest): Room = ???

  def checkout(): Room = ???

}