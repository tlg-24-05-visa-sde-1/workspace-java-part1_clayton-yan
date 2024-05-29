package misc.test;

import java.util.Arrays;

class ArraysTest {

    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] = 23;
        ages[1] = 25;
        ages[2] = 51;
        ages[3] = 52;

        System.out.println(Arrays.toString(ages));

        for (int age : ages) {
            System.out.println("the age is: " + age);

        }

        double[] sizes = {9.5, 12.0, 8.5};
        System.out.println(Arrays.toString(sizes));

        String[] brands = {"LV", "Apple", "Visa"};
        System.out.println(Arrays.toString(brands));

        for (int i = 0; i < brands.length; i++) {
            System.out.println("The brand is: " + brands[i]);
        }
    }
}
