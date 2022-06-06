import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number");
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();

        Model model = new Model();
        model.setFirstNumber(firstNumber);
        model.setSecondNumber(secondNumber);

        Calculation calculation = new Calculation();
        System.out.println("Addition Result: " + calculation.add(model.getFirstNumber(),model.getSecondNumber()));
        System.out.println("Substraction Result: " + calculation.substract(model.getFirstNumber(),model.getSecondNumber()));
        System.out.println("Multiplication Result: " + calculation.multiply(model.getFirstNumber(),model.getSecondNumber()));
        System.out.println("Division Result: " + calculation.division(model.getFirstNumber(),model.getSecondNumber()));

    }
}

