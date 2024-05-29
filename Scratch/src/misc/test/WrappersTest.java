package misc.test;

class WrappersTest {
    public static void main(String[] args) {
        String ageInput = "57";
        int age = Integer.parseInt(ageInput);
        Integer ageInteger = Integer.valueOf(ageInput); // returns Integer object w 57 inside

        String populationInput = "100";
        long population = Long.parseLong(populationInput); // returns primitive long
        Long populationLong = Long.valueOf(populationInput); // returns Long object

        String sizeInput = "9.5";
        double size = Double.parseDouble(sizeInput);
        Double sizeDouble = Double.valueOf(sizeInput);

        String isRainingInput = "true";
        boolean isRaining = Boolean.parseBoolean(isRainingInput);
        Boolean isRainingBoolean = Boolean.valueOf(isRainingInput);

    }
}