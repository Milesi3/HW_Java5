import java.util.*;

public class SecondTask {

    public List<String> emloyersList() {
        List<String> result = Arrays.asList("Иванов Иван", "Васильев Петр",
                "Семенова Наталья", "Иванов Петр", "Сергеева Наталья",
                "Николаев Петр");
        return result;

    }

    public static void findRepetable(List<String> database) {
        String temp;
        Map<String, Integer> unsorted = new HashMap<>();
        Map<Integer, String> sorted = new HashMap<>();
        for (int i = 0; i < database.size(); i++) {
            temp = (List.of((database.get(i)).split(" "))).get(1);
            if (!unsorted.containsKey(temp)) {
                unsorted.put(temp, 1);
            } else {
                unsorted.replace(temp, unsorted.get(temp), unsorted.get(temp) + 1);
            }
        }
        int max = Collections.max(unsorted.values());
        for (int i = 0; i <= max; i++) {
            for (Map.Entry<String, Integer> entry : unsorted.entrySet()) {
                String key = entry.getKey();
                if (unsorted.get(key) == i) {
                    sorted.put(unsorted.get(key), key);
                }
            }
        }
        for (int i = max; i > 0; i--) {
            if (sorted.containsKey(i)) {
                System.out.println(i+ "-"+ sorted.get(i));
            }
        }

    }
}
