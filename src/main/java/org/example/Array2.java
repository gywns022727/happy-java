package org.example;

public class Array2 {
    public static void main(String[] args) {
        int[] copyFrom = {1, 2, 3};
        int[] copyTo = java.util.Arrays.copyOf(copyFrom, copyFrom.length);

        for(int i : copyTo){
            System.out.println(i);
        }

        System.out.println("----------------");

        int[] copyTo2 = java.util.Arrays.copyOf(copyFrom, 5);
        for(int j : copyTo2){
            System.out.println(j);
        }

        System.out.println("----------------");

        int[] copyTo3 = copyFrom;
        for(int k : copyTo3){
            System.out.println(k);
        }
    }
}
