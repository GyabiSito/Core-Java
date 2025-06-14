package dao;

import model.Flight;
import model.Reservation;

import java.util.HashMap;

public class ReservationDaoImpl implements ReservationDao {
    HashMap<Long, Flight> flights;
    HashMap<Long, Reservation> reservations;
    long reservationId;
    public ReservationDaoImpl() {
        reservations = new HashMap<>();
        flights = new HashMap<>();
        Flight flight = new Flight();
        flight.setId(1l);
        flight.setFlightNumber("12345");
        flight.setOperatingAirlines("Airlines");
        flight.setArrivalCity("Austria");
        flight.setDepartureCity("London");
        flight.setDateAndTimeOfDeparture("5/2/2022 9PM");
        flights.put(flight.getId(), flight);
        Flight flight2 = new Flight();
        flight2.setId(2l);
        flight2.setFlightNumber("11111");
        flight2.setOperatingAirlines("ASDASD");
        flight2.setArrivalCity("DSADSA");
        flight2.setDepartureCity("ASD");
        flight2.setDateAndTimeOfDeparture("5/2/2026 9PM");
        flights.put(flight2.getId(), flight2);
    }

    @Override
    public Reservation bookFlight(Reservation reservation) {
        Flight flight = flights.get(reservation.getFlightId());
        reservation.setFlightId(flight.getId());
        reservationId = reservationId+1;
        reservation.setId(reservationId);
        reservations.put(reservationId, reservation);
        return reservation;
    }

    @Override
    public Reservation checkIn(long reservationId, int noOfBags) {
        Reservation reservation = reservations.get(reservationId);
        reservation.setNoOfBags(noOfBags);
        reservation.setCheckin(true);
        return reservation;
    }
}
