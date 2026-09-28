package app.src.main.java.awesomesauceproject1;

public class Main {
    private static int variable1 = 1;
    private static int incrementAmount = 1;

    public Main(String[] args) {
        // constructor
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("Initial value is: " + variable1);

        variable1 += incrementAmount;

        System.out.println("Incremented value is: " + variable1);
    }
}
