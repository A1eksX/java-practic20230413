package lesson5;

import com.sun.source.tree.BreakTree;
/*
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //2999
        Map<Character, Integer> infoMap = getInfoMapCharToInt();
        String romeInt = "MMCMXCIX";
        System.out.println(converter(romeInt, infoMap));
        Map<Integer, String> infoMap2 = getInfoMapIntToChar();
        int number = 2999;
        System.out.println(converterCharToInt(number, infoMap2));
    }
    public static int converter(String str, Map<Character, Integer> infoMap) {
        int previous = 0;
        int result = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            int currentValue = infoMap.get(str.charAt(i));
            if (currentValue < previous) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            previous = currentValue;
        }
        return result;
    }
    public static Map<Character, Integer> getInfoMapCharToInt() {
        return Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
    }
    public static Map<Integer, String> getInfoMapIntToChar() {
        return Map.ofEntries(
                Map.entry(1, "I"),
                Map.entry(5, "V"),
                Map.entry(10, "X"),
                Map.entry(50, "L"),
                Map.entry(100, "C"),
                Map.entry(500, "D"),
                Map.entry(1000, "M"),
                Map.entry(4, "IV"),
                Map.entry(9, "IX"),
                Map.entry(40, "XL"),
                Map.entry(90, "XC"),
                Map.entry(400, "CD"),
                Map.entry(900, "CM")
        );
    }
    public static String converterCharToInt(int inputNum, Map<Integer, String> map) {
        StringBuilder result = new StringBuilder();
        Set<Integer> tmp = map.keySet();
        //        List<String> strArrList = tmp.stream().map(String::valueOf).toList();
        ArrayList<Integer> listInt = new ArrayList<>(tmp);
        listInt.sort(Comparator.reverseOrder());
        for (int number: listInt) {
            while (inputNum >= number) {
                result.append(map.get(number));
                inputNum -= number;
            }
        }
        return result.toString();
    }
}
*/