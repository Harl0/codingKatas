package org.me.hotel

/**
  * Created by Jason on 20/08/2016.
  */

/*
 * We will create automatically a bunch of 10 rooms
 * if these are not specified.
 */
case class Hotel(rooms: List[Room] = (1 to 10).map(n => Room(number=n)).toList){

  require(!rooms.isEmpty,"there are no rooms at all!")

  def checkin(personName: String): Hotel = {
    val (free,occupied) = rooms.partition(_.isFree)
    require(!free.isEmpty, "There are no free rooms")
    val (selectedRoom::restEmpty) = free
    Hotel(selectedRoom.checkin(Guest(personName)) +: (restEmpty ++ occupied))
  }

}
