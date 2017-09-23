package task08;

import java.util.Arrays;
import java.util.Comparator;

public class StringSorter {
    public String sortNumbers(String str) {
        String[] numbers;
        numbers = str.split("\\s*,\\s*");
        try {
            Arrays.sort(numbers, new Comparator<String>() {
                public int compare(String s1, String s2) {
                    return Integer.valueOf(s1).compareTo(Integer.valueOf(s2));
                }
            });
        } catch(NumberFormatException e){
            return "Error! Wrong input! Please try again.";
        }
        StringBuffer sb = new StringBuffer("");
        String prefix = "";
        for (String number : numbers) {
            sb.append(prefix);
            sb.append(number);
            prefix = ", ";
        }
        return  sb.toString();
    }
}
