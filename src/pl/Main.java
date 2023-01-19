package pl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<List<Integer>> lists = new ArrayList<>(Arrays.asList(Arrays.asList(1, 5, 3), Arrays.asList(4, 8, 7), Arrays.asList(6, 9, 1)));
        System.out.println(ArrayManipulation.run(5,lists));
    }
}