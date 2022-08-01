import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter sentence");

        String sentence = myObj.nextLine();  // Read user input

        wordFrequency(sentence);
    }

    public static void wordFrequency(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = str.split(" ");
        for(String word : arr) {
            if(map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        map.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> System.out.println(k.getValue() + " " + k.getKey()));
    }
}