package week12.parameter;

public class TestModel {
    public static void main(String[] args) {
        Model firstModel = new Model("Caroline");
        System.out.println("\nEerste model");
        System.out.println(firstModel);

        Model secondModel = new Model("Veronica", 102, 67, 88);
        secondModel.setAddress(new Address("Nationalestraat 5", "2000"));
        System.out.println("\nTweede model");
        System.out.println(secondModel);

        testAddress(null, "2000", "Street number cannot be null or empty");
        testAddress("", "2000", "Street number cannot be null or empty");
        testAddress("Nationalestraat 5", "200", "Postal code must be exactly 4 digits");
        testAddress("Nationalestraat 5", "abcd", "Postal code must be exactly 4 digits");

        // Test Person
        testPerson(null, "Name cannot be null or empty");
        testPerson("", "Name cannot be null or empty");

        // Test BodyMeasures
        testBodyMeasures(-1, 60, 90, "Measurements must be between 0 and 200");
        testBodyMeasures(90, 201, 90, "Measurements must be between 0 and 200");
        testBodyMeasures(90, 60, -1, "Measurements must be between 0 and 200");

        // Test Model
        testModel(null, "Name cannot be null or empty");
        testModel("", "Name cannot be null or empty");
        testModel("Veronica", -1, 67, 88, "Measurements must be between 0 and 200");
        testModel("Veronica", 102, 67, 201, "Measurements must be between 0 and 200");
    }

    private static void testAddress(String streetnr, String postalCode, String expectedMessage) {
        try {
            new Address(streetnr, postalCode);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage().equals(expectedMessage));
        }
    }

    private static void testPerson(String name, String expectedMessage) {
        try {
            new Person(name);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage().equals(expectedMessage));
        }
    }

    private static void testBodyMeasures(double bust, double hips, double waist, String expectedMessage) {
        try {
            new BodyMeusures(bust, hips, waist);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage().equals(expectedMessage));
        }
    }

    private static void testModel(String name, double bust, double hips, double waist, String expectedMessage) {
        try {
            new Model(name, bust, hips, waist);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage().equals(expectedMessage));
        }
    }

    private static void testModel(String name, String expectedMessage) {
        try {
            new Model(name);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage().equals(expectedMessage));
        }
    }
}
