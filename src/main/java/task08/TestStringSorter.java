package task08;

import java.util.Arrays;
import java.util.Comparator;
// This class only for test
public class TestStringSorter {
    public static void main(String[] args) {
        String str = new String("10, 10    , 13    ,1, 5, 45, 34");
//        String str = new String("");
        String[] numbers;
        numbers = str.split("\\s*,\\s*");
//        System.out.println();
//        System.out.println(Arrays.toString(numbers));
//        System.out.println("sorting...");
        try {
            Arrays.sort(numbers, new Comparator<String>() {
                public int compare(String s1, String s2) {
                    return Integer.valueOf(s1).compareTo(Integer.valueOf(s2));
                }
            });
        } catch(NumberFormatException e){
            System.out.println("Wrong input. Please try again");
        }
//        System.out.println(Arrays.toString(numbers));
        StringBuffer sb = new StringBuffer("");
        String prefix = "";
        for (String number : numbers) {
            sb.append(prefix);
            sb.append(number);
            prefix = ", ";
        }
        System.out.println(sb);

    }

}
