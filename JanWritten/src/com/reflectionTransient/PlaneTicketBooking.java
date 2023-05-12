package com.reflectionTransient;


public class PlaneTicketBooking {

     static int availableTickets = 10;
     static Object lock = new Object();

    static class BookingThread implements Runnable {
        private String user;
        private int ticketsToBook;

        public BookingThread(String user, int ticketsToBook) {
            this.user = user;
            this.ticketsToBook = ticketsToBook;
        }

        public void run() {
            synchronized (lock) {
                try {
                    while (availableTickets < ticketsToBook) {
                        System.out.println(user + " is waiting for tickets");
                        lock.wait();
                    }
                    System.out.println(user + " booked " + ticketsToBook + " tickets");
                    availableTickets -= ticketsToBook;
                    System.out.println("Remaining tickets: " + availableTickets);
                    lock.notifyAll();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    

    public static void main(String[] args) {
        Thread t1 = new Thread(new BookingThread("User1", 2));
        Thread t2 = new Thread(new BookingThread("User2", 4));
        t1.start();
        t2.start();
    }

}
