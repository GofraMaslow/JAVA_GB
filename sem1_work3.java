
import java.util.Scanner;
public class sem1_work3 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.printf("какое число? ");
        int num1 = scanner1.nextInt();
        System.out.printf("второе какое? ");
        int num2 = scanner1.nextInt();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Че с ними делаем? ");
        String oper = iScanner.nextLine();
        switch (oper) {
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            case "^":
                System.out.println(Math.pow(num1,num2));
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
    }
}
