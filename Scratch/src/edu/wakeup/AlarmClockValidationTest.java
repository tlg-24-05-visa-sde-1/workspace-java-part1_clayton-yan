package edu.wakeup;/*
 * Main class focused on testing setter validation logic
 * boundary testing
 */

class AlarmClockValidationTest {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1);
        System.out.println(clock);

        clock.setSnoozeInterval(2);
        System.out.println(clock); // show 2

        clock.setSnoozeInterval(0);
        System.out.println(clock);

        clock.setSnoozeInterval(21);
        System.out.println(clock);

    }
}