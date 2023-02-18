package pl;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ArrayManipulation {
    public static long run(int n, List<List<Integer>> queries) {
        Map<Integer, Long> sum = new TreeMap<>();
        for (List<Integer> querie: queries) {
            sum.put(querie.get(0), sum.getOrDefault(querie.get(0), 0L) + querie.get(2));
            sum.put(querie.get(1) + 1, sum.getOrDefault(querie.get(1) + 1, 0L) - querie.get(2));
        }
        long max = 0L;
        long current = 0L;
        for(long value: sum.values()) {
            current += value;
            max = Math.max(max, current);
        }

        return max;
    }
}

