import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCommands = sc.nextInt();
        Object[] commands = new Object[numOfCommands];

        for (int i = 0; i < numOfCommands; i++) {
            if (sc.hasNextInt()) {
                commands[i] = sc.nextInt();
            } else {
                commands[i] = sc.next();
            }
        }

        String reservationSummary = kabaddiMatchBooking(commands);
        System.out.println(reservationSummary);
    }

    public static String kabaddiMatchBooking(Object[] commands) {
        int totalSeats = 15;
        boolean[] seatStatus = new boolean[totalSeats];
        StringBuilder summary = new StringBuilder();

        for (Object command : commands) {
            if (command instanceof String) {
                String action = (String) command;
                if (action.equals("book")) {
                    int nextAvailableSeat = getNextAvailableSeat(seatStatus);
                    if (nextAvailableSeat != -1) {
                        seatStatus[nextAvailableSeat] = true;
                    }
                } else if (action.equals("cancel")) {
                    if (seatStatus.length > 0) {
                        int lastBookedSeat = getLastBookedSeat(seatStatus);
                        seatStatus[lastBookedSeat] = false;
                    }
                }
            } else if (command instanceof Integer) {
                int seatNumber = (int) command;
                if (seatNumber >= 1 && seatNumber <= totalSeats) {
                    seatStatus[seatNumber - 1] = true;
                }
            }
        }

        for (int i = 0; i < totalSeats; i++) {
            summary.append("Seat ").append(i + 1).append(": ");
            if (seatStatus[i]) {
                summary.append("Reserved");
            } else {
                summary.append("Available");
            }
            summary.append("\n");
        }

        return summary.toString();
    }

    private static int getNextAvailableSeat(boolean[] seatStatus) {
        for (int i = 0; i < seatStatus.length; i++) {
            if (!seatStatus[i]) {
                return i;
            }
        }
        return -1; // No available seat
    }

    private static int getLastBookedSeat(boolean[] seatStatus) {
        for (int i = seatStatus.length - 1; i >= 0; i--) {
            if (seatStatus[i]) {
                return i;
            }
        }
        return -1; // No booked seat
    }
}