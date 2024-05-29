package edu.wakeup;

/*
 * Class definition to model the workings of an alarm clock
 * can be called "business", "system" class
 * no main method
 */
class AlarmClock {

    // static = shared, class-wide common storage area
    // static vars, there is only one copy of these, they live up in that "shared" area, not in each object
    // final = fixed
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;
    private static int nextId = 1;

    // static methods: call w ClassName.methodName()
    // Encapsulation of static fields, utility methods/one-off functions


    // properties or attributes - called "fields" or "instance variables"
    private int snoozeInterval = 5;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public AlarmClock() {

    }

    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval);
        this.id = nextId++; // no setter provided, assign directly
    }

    // functions or behaviors "methods"
    public void snooze() {
        System.out.println("Snoozing " + getSnoozeInterval() + " minutes");
    }

    // accessor methods, provide controlled access to objects fields

    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    /*
     * must be minInterval and maxInterval inclusive
     */
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;
        } else {
            System.out.println("Invalid snooze interval" + snoozeInterval + "must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL);
        }
    }

    /*
     * returns a string representation of this AlarmClock object
     */
    public String toString() {
        return "AlarmClock: id= " + getId() + "snoozeInterval" + getSnoozeInterval() + " minutes";
    }
}