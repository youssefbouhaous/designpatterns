package org.example.stratey.implementations;

import org.example.stratey.TriStrategy;

import java.util.ArrayList;
import java.util.List;

public class TriParFusion implements TriStrategy {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5, 1, 4, 2, 0, -9, 4, 12, 31, 1, 0));
        TriParFusion mergeSortStrategy = new TriParFusion();
        mergeSortStrategy.trier(list);
        System.out.println(list);
    }

    public void merge(int left, int mid, int right, List<Integer> list) {
        List<Integer> mergedList = new ArrayList<>();
        int leftStart = left;
        int rightStart = mid + 1;

        while (leftStart <= mid && rightStart <= right) {
            if (list.get(leftStart) < list.get(rightStart)) {
                mergedList.add(list.get(leftStart));
                leftStart++;
            } else {
                mergedList.add(list.get(rightStart));
                rightStart++;
            }
        }

        while (leftStart <= mid) {
            mergedList.add(list.get(leftStart));
            leftStart++;
        }

        while (rightStart <= right) {
            mergedList.add(list.get(rightStart));
            rightStart++;
        }

        for (int i = left; i <= right; i++) {
            list.set(i, mergedList.get(i - left));
        }
    }

    public void divide(int left, int right, List<Integer> list) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        divide(left, mid, list);
        divide(mid + 1, right, list);
        merge(left, mid, right, list);
    }

    @Override
    public void trier(List<Integer> list) {
        divide(0, list.size() - 1, list);
    }
}