package dao;

import model.Reservation;

public interface ReservationDao {
    Reservation bookFlight(Reservation reservation);
    Reservation checkIn(long reservationId,int noOfBags);
}
