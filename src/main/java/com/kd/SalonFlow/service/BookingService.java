package com.kd.SalonFlow.service;

import com.kd.SalonFlow.entity.Booking;
import java.util.List;

public interface BookingService {
    Booking createBooking(Booking booking);
    Booking updateBookingStatus(int bookingId, int status);
    List<Booking> getBookingsByUser(int userId);
    void cancelBooking(int bookingId);
}
