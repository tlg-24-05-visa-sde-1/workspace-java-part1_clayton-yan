package misc.test;

class StringTest {
    public static void main(String[] args) {
        String city1 = "New York";
        String city2 = "New York";

        System.out.println(city1.equals(city2));
        System.out.println(city1 == city2); // dont do this

        String greeting = "What's up \"Doc?\"";
        // \ is escape character
        System.out.println(greeting);

        // \n for new line
        System.out.println("roses are red\nviolets are blue");

        // """ text blocks
        String aTextBlock = """
                hello
                from
                Clayton""";
        System.out.println(aTextBlock);

        // regular expressions
        String ssn = "077-23-0812";
        String zip = "10988-1223";
        String ref = "PQYZQI";

        // see if they match
        System.out.println(ssn.matches("\\d{3}-\\d{2}-\\d{4}"));
        System.out.println(zip.matches("\\d{5}-\\d{4}"));

        // regex 101 for help

        // valid license plate
        String pattern = "\\d{3}[A-Z]{3}|[A-Z]\\d{3}[A-Z]{3}";
        String plate1 = "637YOC";
        System.out.println("This license plate is valid: " + plate1.matches(pattern));

    }
}
