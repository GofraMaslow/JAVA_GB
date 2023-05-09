import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class sem3_work3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Сколько элементов будет в списке? ");
        int listSize = scanner.nextInt();
        scanner.close();

        List<Integer> randomList = new ArrayList<> (listSize);
        for (int i = 0; i < listSize; i++) {
            Random random = new Random();
            int randNum = random.nextInt(0,100);
            randomList.add(randNum);
        }
        System.out.println(randomList);

        int max= -1;
        int min= 101;
        float sum = 0;
        for (int i = 0; i < listSize; i++) {
            if (randomList.get(i)>max){
                max=randomList.get(i);
            }
            else if (randomList.get(i)<min){
                min=randomList.get(i);
            }
            sum = sum + randomList.get(i);
        }
        float midsum= sum/listSize;

        System.out.printf("Минимальное значение - %d, максимальное значение - %d, среднее арифметическое - %.3f \n", min, max, midsum);
    }
}

