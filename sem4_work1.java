
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class sem4_work1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Сколько элементов будет в списке? ");
        int listSize = scanner.nextInt();
        scanner.close();

        List<Integer> randomList = new LinkedList<>();
        for (int i = 0; i < listSize; i++) {
            Random random = new Random();
            int randNum = random.nextInt(0,100);
            randomList.add(randNum);
        }
        System.out.println(randomList);

        randomList=reverseList(randomList);
        System.out.println(randomList);
    }

    public static List<Integer> reverseList (List<Integer> listToReverse){
        int listSize = listToReverse.size();
        List <Integer> listReversted = new LinkedList<>();
        int j = listSize-1;
        for (int i = 0; i < listSize; i++) {
            listReversted.add(i,listToReverse.get(j));
            j=j-1;
        }
    return listReversted;
    }
}