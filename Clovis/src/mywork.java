import java.util.Scanner;

public class mywork {
    public static void menu(){
        System.out.println("1) Addition");
        System.out.println("2) Multiplication ");
        System.out.println("3) Subtraction ");
        System.out.println("4) Division ");
    }
    public static int add(int a, int b) {
        return (a + b);
    }

    public static int multiply(int a, int b) {
        return (a * b);
    }

    public static int sub(int a, int b) {
        return (a - b);
    }

    public static int div(int a, int b) {
        return (a / b);
    }


    public static void main(String[] args) {
// program to compute two numbers
        Scanner input = new Scanner(System.in);
        int options;
        do {
            menu();
            System.out.print("Select option 1-4 :");
            options = input.nextInt();

            System.out.print("Enter first number : ");
            int x = input.nextInt();
            System.out.print("Enter second number : ");
            int y = input.nextInt();


            switch (options) {
                case 1:
                    System.out.println("The sum is " + add(x, y));
                    break;
                case 2:
                    System.out.println("The product is " + multiply(x, y));
                    break;
                case 3:
                    System.out.println("The Difference is " + sub(x, y));
                    break;
                case 4:
                    System.out.println("The Quotient is " + div(x, y));
                    break;
                default:
                    System.out.println("Invalid Entry");
            }
        }while (options <=4);
    }
}

