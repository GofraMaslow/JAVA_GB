
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class sem6_work1 {
    public static void main(String[] args) {
        Notebook nb1 = new Notebook(16, 1024, "macos", "white");
        Notebook nb2 = new Notebook(4, 256, "microsoft", "black");
        Notebook nb3 = new Notebook(16, 1024, "linux", "silver");
        Notebook nb4 = new Notebook(8, 256, "microsoft", "black");
        Notebook nb5 = new Notebook(16, 512, "microsoft", "white");
        Notebook nb6 = new Notebook(8, 1024, "microsoft", "black");
        Notebook nb7 = new Notebook(32, 2048, "macos", "white");
        Notebook nb8 = new Notebook(4, 512, "microsoft", "silver");
        Notebook nb9 = new Notebook(8, 1024, "macos", "black");
        Notebook nb10 = new Notebook(16, 512, "microsoft", "silver");
        Notebook nb11 = new Notebook(32, 1024, "microsoft", "silver");
        Notebook nb12 = new Notebook(16, 1024, "linux", "black");
        Notebook nb13 = new Notebook(16, 1024, "linux", "black");
        List<Notebook> nbList = new LinkedList<>();
        nbList = List.of(nb1, nb2, nb3, nb4, nb5, nb6, nb7, nb8, nb9, nb10, nb11, nb12, nb13);

        HashSet<Notebook> notebooks = new HashSet<Notebook>(nbList);

        System.out.println(notebooks.size());

        for (Notebook nbk : notebooks) {
            System.out.println(nbk);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите минимальную оперативную память ноутбука: ");
        int ram = scanner.nextInt();
        System.out.printf("Введите минимальный объем жесткого диска ноутбука в Гб: ");
        int hdSize = scanner.nextInt();
        System.out.printf("Введите желаемую операционную систему ноутбука: ");
        String os = scanner.next();
        os = os.trim();
        os = os.toLowerCase();
        System.out.printf("Введите желаемый цвет ноутбука: ");
        String color = scanner.next();
        color = color.trim();
        color = color.toLowerCase();
        scanner.close();

        HashSet<Notebook> foundNotebooks = filterNotebooks(notebooks, ram, hdSize, color, os);
        if (foundNotebooks.isEmpty()) {
            System.out.println("Подходящих под Ваши запросы ноутбуков нет.");
        } else {
            System.out.println("Вам подходят: " + foundNotebooks);
        }
    }

    private static HashSet<Notebook> filterNotebooks(Set<Notebook> notebooks, int ram, int hdSize, String color,
            String os) {
        HashSet<Notebook> notebooksForUser = new HashSet<Notebook>();
        for (Notebook nb : notebooks) {
            int nbRam = nb.getRam();
            int nbHdSize = nb.getHdSize();
            String nbColor = nb.getColor();
            String nbOS = nb.getOs();
            if (nbRam >= ram & nbHdSize >= hdSize & nbColor.equals(color) & nbOS.equals(os)) {
                notebooksForUser.add(nb);
            }
        }
        return notebooksForUser;
    }
}
