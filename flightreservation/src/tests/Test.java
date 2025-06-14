package tests;

import dao.ReservationDao;
import dao.ReservationDaoImpl;
import model.Passenger;
import model.Reservation;

public class Test {
    public static void main(String[] args) {

        ReservationDao dao = new ReservationDaoImpl();
        Reservation reservation = new Reservation();
        reservation.setId(1l);
        Passenger passenger = new Passenger();
        passenger.setId(2l);
        passenger.setFirstName("John");
        passenger.setLastName("Doe");
        passenger.setEmail("a@b.com");
        passenger.setPhone("1234567890");
        reservation.setPassenger(passenger);
        reservation.setFlightId(1l);

        Reservation reservation1 = dao.bookFlight(reservation);
        System.out.println(reservation1);
        System.out.println(dao.checkIn(reservation1.getId(), 2));

    }
}
