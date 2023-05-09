import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String[]> phoneBook = new HashMap<>();

        phoneBook.put("Иван Иванов", new String[]{"+7 123 456-78-90", "+7 987 654-32-10"});
        phoneBook.put("Светлана Петрова", new String[]{"+7 111 222-33-44"});
        phoneBook.put("Кристина Белова", new String[]{"+7 555 666-77-88"});
        phoneBook.put("Анна Мусина", new String[]{"+7 999 888-77-66", "+7 777 666-55-44"});
        phoneBook.put("Анна Крутова", new String[]{"+7 333 444-55-66"});
        phoneBook.put("Иван Юрин", new String[]{"+7 111 222-33-44"});
        phoneBook.put("Петр Лыков", new String[]{"+7 123 456-78-90", "+7 111 222-33-44"});
        phoneBook.put("Павел Чернов", new String[]{"+7 555 666-77-88"});
        phoneBook.put("Петр Чернышов", new String[]{"+7 123 456-78-90"});
        phoneBook.put("Мария Федорова", new String[]{"+7 333 444-55-66"});
        phoneBook.put("Марина Светлова", new String[]{"+7 999 888-77-66", "+7 777 666-55-44"});
        phoneBook.put("Мария Савина", new String[]{"+7 123 456-78-90", "+7 111 222-33-44"});
        phoneBook.put("Мария Рыкова", new String[]{"+7 555 666-77-88"});
        phoneBook.put("Марина Лугова", new String[]{"+7 999 888-77-66"});
        phoneBook.put("Анна Владимирова", new String[]{"+7 333 444-55-66"});
        phoneBook.put("Иван Мечников", new String[]{"+7 123 456-78-90", "+7 555 666-77-88"});
        phoneBook.put("Петр Петин", new String[]{"+7 999 888-77-66", "+7 777 666-55-44"});
        phoneBook.put("Иван Ежов", new String[]{"+7 111 222-33-44"});

        Map<String, Integer> nameCount = new HashMap<>();

        for (Map.Entry<String, String[]> entry : phoneBook.entrySet()) {
            String name = entry.getKey();
            String[] phones = entry.getValue();

            for (String phone : phones) {
                String number = phone.replaceAll("\\D", "");
                if (number.length() == 11) {
                    String code = number.substring(1, 4);
                    if (!code.equals("495") && !code.equals("499")) {
                        number = "8" + number.substring(1);
                    }
                }
                nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
            }
        }

        Map<String, Integer> sortedNameCount = new TreeMap<>((o1, o2) -> {
            int count1 = nameCount.get(o1);
            int count2 = nameCount.get(o2);
            if (count1 == count2) {
                return o1.compareTo(o2);
            } else {
                return Integer.compare(count2, count1);
            }
        });

        sortedNameCount.putAll(nameCount);

        for (Map.Entry<String, Integer> entry : sortedNameCount.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();
            if (count > 1) {
                System.out.println(name + ": " + count);
            }
        }
    }
}