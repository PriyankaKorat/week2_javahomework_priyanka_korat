package homework_week2;

public class InstanceVariableInstanceMethod {
    /**
     * 1.1 Declare two instance variables.
     * 1.2 Declare one instance method.
     * 1.3 Call both instance variables into the instance method inside the print statement.
     * 1.4 Declare the Main method.
     * 1.5 Call the above instance method into the Main method and Run the programme.
     */
    int a = 10; //instance variable
    String message = "It's instance variable"; //instance variable

    public void a1() { // instance method
        System.out.println(a);
        System.out.println(message);

    }

    public static void main(String[] args) {
        InstanceVariableInstanceMethod instanceMethod = new InstanceVariableInstanceMethod();
        instanceMethod.a1();
    }
}
