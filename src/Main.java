import java.util.*;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задаача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    private static void task2() {
        System.out.println("Задаача 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 8, 8, 8, 10, 1, 2, 2, 2, 2, 3, 4, 4, 5, 5, 6, 70, 70));
        Collections.sort(nums);

        Integer temp = Integer.MIN_VALUE;

        for (Integer num : nums) {
            if (num % 2 == 0 && !temp.equals(num)) {
                temp = num;
                System.out.println(temp);
            }
        }

    }


    public static void task3() {
        System.out.println("Задаача 3");
        List<String> words2 = new ArrayList<>(List.of("один", "один", "два","два", "два", "три", "три", "три"));
        Map<String,Integer> map =new LinkedHashMap<>();
        for (String word : words2) {
            if(!map.containsKey(word)){
                map.put(word, 0);
            }
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }
        }
        System.out.println(map.values());
    }

    private static void task4() {
        System.out.println("Задаача 4");
        List<String> stringList = new ArrayList<>(List.of("qaz", "wsx", "qaz", "qaz", "edc", "wsx"));

        Set<String> hashSet = new HashSet<>(stringList);
        for (String set : hashSet) {
            System.out.println(Collections.frequency(stringList, set) - 1);
        }

    }
}