package com.example.travelplanner;

public class Booking {
    private String bookingId;
    private String date;
    private String time;
    private String customerName;

    public Booking(String bookingId, String date, String time, String customerName) {
        this.bookingId = bookingId;
        this.date = date;
        this.time = time;
        this.customerName = customerName;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId + "\n" +
                "Date: " + date + "\n" +
                "Time: " + time + "\n" +
                "Customer Name: " + customerName;
    }
}
