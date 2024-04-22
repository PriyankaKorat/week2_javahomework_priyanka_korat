package homework_week2;

public class InstanceStaticMix {
    /**
     * 3.1 Declare one instance and one static variable.
     * 3.2 Declare one instance method.
     * 3.3 Declare one static method.
     * 3.4 Call both instance and static variables into both instance and static methods inside the
     * print statement.
     * 3.5 Declare the Main method.
     * 3.6 Call both instance and static methods into the Main method and run the programme.
     */
    double q = 10.50; // instance variable
    static int w = 50; // static variable

    public static void e1() { // static method
        InstanceStaticMix t = new InstanceStaticMix();

        System.out.println(w);
        System.out.println(t.q);
    }

    public void r1() { // instance method
        System.out.println(w);
        System.out.println(q);
    }

    public static void main(String[] args) {
        InstanceStaticMix y = new InstanceStaticMix();
        e1();
        y.r1();

    }
}
