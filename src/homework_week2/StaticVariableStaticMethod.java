package homework_week2;

public class StaticVariableStaticMethod {
    /**
     * 2.1 Declare two static variables
     * 2.2 Declare one static method
     * 2.3 Call both static variables into the static method inside the print statement.
     * 2.4 Declare the Main method.
     * 2.5 Call the static method into the Main method and Run the programme.
     */
    static float f = 5.6f; // static variable
    static String name = "Priyanka"; //static variable

    public static void pi() { //static method
        System.out.println(f);
        System.out.println(name);

    }

    public static void main(String[] args) {
        pi();
    }
}
