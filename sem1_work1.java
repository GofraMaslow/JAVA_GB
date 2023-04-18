
import java.util.Scanner;

public class sem1_work1 {
   
   
    public static void main(String[] args) {
        int res=0;
        // int num=5;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите num: ");
        int num = scanner.nextInt();
        for (int i = num; i >0; i--) {
            res=res+i;
        }
        System.out.println(res);
    }
}
