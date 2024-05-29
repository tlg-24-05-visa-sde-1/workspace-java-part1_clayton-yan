package edu.wakeup;

/*
 * Client-side main class (main method)
 *
 * Instances of alarm clocks and test
 */
class AlarmClockClient {
    public static void main(String[] args) {
        // create an object and set props
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);

        AlarmClock clock2 = new AlarmClock(AlarmClock.MAX_INTERVAL);

        AlarmClock clock3 = new AlarmClock();

        // make them snooze
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();

        // toString
        System.out.println(clock1);
        System.out.println(clock2);
        System.out.println(clock3);

    }

}