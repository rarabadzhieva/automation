package chapter18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise {

    private int[] data = {4, 2, 2, 5, 2, 3, 2, 3, 1, 5, 2, 6, 6, 6};
    private HashMap<Integer, Integer> dictNum = new HashMap<>();

    private void seedDict() {
        for (int datum : data) {
            Integer count = dictNum.get(datum);
            if (count == null) {
                count = 0;
            }
            dictNum.put(datum, count + 1);
        }
    }

    public ArrayList<Integer> reduceArr() {
        seedDict();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : dictNum.entrySet()) {
            int value = entry.getValue();
            if (value % 2 == 0) {
                map.put(entry.getKey(), 1);
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for (int datum : data) {
            if (map.containsKey(datum)) {
                arr.add(datum);
            }
        }
        return arr;
    }
}
