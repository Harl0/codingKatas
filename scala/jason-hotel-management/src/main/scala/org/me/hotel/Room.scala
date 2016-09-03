package org.me.hotel

/**
  * Created by Jason on 20/08/2016.
  */
case class Room(number: Int, guest: Option[Guest] = None){ room =>

  // check to see if room has a guest
  def isFree(): Boolean =
    guest.isEmpty

  def checkin(guest: Guest): Room = {
    require(room.guest.isEmpty, "Room is occupied")
    Room(number,Some(guest))
  }

  def checkout(): Room = {
    require(guest.isDefined,"Room is already free")
    Room(number,None)
  }

}