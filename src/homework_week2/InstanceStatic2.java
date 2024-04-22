package homework_week2;

public class InstanceStatic2 {
    /**
     * 4.1 Declare two instance and two static variables.
     * 4.2 Declare one instance method.
     * 4.3 Declare one static method.
     * 4.4 Call all four instance and static variables into both instance and static methods inside the
     * print statement.
     * 4.5 Declare the Main method.
     * 4.6 Call both instance and static methods into the Main method and run the programme
     */
    int a = 10; //instance variable
    int b = 20; //instance variable
    static String firstName = "Priyanka"; // static variable
    static String lastName = "Korat"; // static variable

    public void m1() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(firstName);
        System.out.println(lastName);
    }

    public static void m2() {
        InstanceStatic2 instanceStatic2 = new InstanceStatic2();
        System.out.println(instanceStatic2.a);
        System.out.println(instanceStatic2.b);
        System.out.println(firstName);
        System.out.println(lastName);

    }

    public static void main(String[] args) {
        //new InstanceStatic2().m1();
        InstanceStatic2 s = new InstanceStatic2();
        s.m1();
        m2();

    }


}
