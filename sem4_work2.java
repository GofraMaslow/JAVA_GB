
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class sem4_work2  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Сколько элементов будет в списке? ");
        int listSize = scanner.nextInt();

        List<Integer> randomList = new LinkedList<>();
        for (int i = 0; i < listSize; i++) {
            Random random = new Random();
            int randNum = random.nextInt(0,100);
            randomList.add(randNum);
        }
        System.out.println(randomList);

        System.out.println("Добавляем элемент в конец очереди: " +enqueueMyList(randomList));

        System.out.println("Возвращем и удаляем первый элемент очереди: " + dequeueMyList(randomList));

        System.out.println("Возвращем первый элемент очереди, не удаляя его: " + dequeueMyList(randomList));

    }

    public static List<Integer> enqueueMyList (List<Integer> myList) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Какой элемент добавляем? ");
        int newElem = scanner.nextInt();
        scanner.close();
        int myListSize = myList.size();
        List<Integer> newList = new LinkedList<>();
        for (int i = 0; i < myListSize; i++) {
            newList.add(i, myList.get(i));
        }
        newList.add(myListSize,newElem);
        return newList;
    }

    public static int dequeueMyList (List<Integer> myList){
        int firstElem = myList.get(0);
        myList.remove(0);
        return firstElem;
    }

    public static int returnFirstElem (List<Integer> myList){
        int firstElem = myList.get(0);
        return firstElem;
    }
}