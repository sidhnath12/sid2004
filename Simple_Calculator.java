import java.util.*;

public class Simple_Calculator{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Addition:");
        System.out.println("2.Subtraction:");
        System.out.println("3.Multiplication:");
        System.out.println("4.Division:");
        System.out.println("5.Remainder");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:{
                System.out.println("Enter the number a:");
                int a = sc.nextInt();
                System.out.println("Enter the number b:");
                int b = sc.nextInt();
                int sum = a + b;
                System.out.println("Answer:");
                System.out.println(sum);
            break;

            }
            case 2:{
                System.out.println("Enter the number a:");
                int a = sc.nextInt();
                System.out.println("Enter the number b:");
                int b = sc.nextInt();
                int sub = a - b;
                System.out.println("Answer:");
                System.out.println(sub);
            break;
            }
            case 3:{
                System.out.println("Enter the number a:");
                int a = sc.nextInt();
                System.out.println("Enter the number b:");
                int b = sc.nextInt();
                int mul = a * b;
                System.out.println("Answer:");
                System.out.println(mul);
            break;

            } 
            case 4:{
                System.out.println("Enter the number a:");
                int a = sc.nextInt();
                System.out.println("Enter the number b:");
                int b = sc.nextInt();
                int div = a / b;
                System.out.println("Answer:");
                System.out.println(div);
            break;
            }
            case 5:{
                System.out.println("Enter the number a:");
                int a = sc.nextInt();
                System.out.println("Enter the number b:");
                int b = sc.nextInt();
                int remainder = a % b;
                System.out.println("Remainder:");
                System.out.println(remainder);
            break;
            }   
        
            default:{
                System.out.println("Invalid Choice");
            }
                
            break;
        }

    }
}