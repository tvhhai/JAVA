package com.company.assignments.datastructure;

import java.util.Arrays;

// Your task is to count how many of these points le strictly inside the ing (the border of the ring is not included).
public class TheRing {

    public static void main(String[] args) {
        int inner = 1;
        int outer = 3;
        int[] points_x = {0, 1, 2, -2, 3};
        int[] points_y = {0, 1, 4, 1, 0};
        solution(inner, outer, points_x, points_y);
    }


    static void solution(int inner, int outer, int[] points_x, int[] points_y) {
        double[] radiusInside = new double[points_x.length];
        String[] resultPoint = new String[points_x.length];
        int count = 0;

        for (int i = 0; i < points_x.length; i++) {
            radiusInside[i] = Math.sqrt(points_x[i] * points_x[i] + points_y[i] * points_y[i]);
            if (radiusInside[i] > inner && radiusInside[i] < outer) {
                count++;
                resultPoint[count - 1] = "(" + points_x[i] + ", " + points_y[i] + ")";
            }
        }

        System.out.println(count);
        System.out.println(Arrays.toString(resultPoint));

    }
}
