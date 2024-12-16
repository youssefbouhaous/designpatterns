package org.example.stratey.implementations;

import org.example.stratey.TriStrategy;

import java.util.ArrayList;
import java.util.List;

public class TrieParFusion implements TriStrategy {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5, 1, 4, 2, 0, -9, 4, 12, 31, 1, 0));
        TrieParFusion trieParFusion = new TrieParFusion();
        trieParFusion.trier(list);
        System.out.println(list);
    }

    public void conquer(int l, int m, int r, List<Integer> list) {
        List<Integer> ans = new ArrayList<>();
        int ll = l;
        int mm = m + 1;
        while (l <= m && mm <= r) {
            if (list.get(l) < list.get(mm)) {
                ans.add(list.get(l));
                l++;
            } else {
                ans.add(list.get(mm));
                mm++;
            }
        }
        while (l <= m) {
            ans.add(list.get(l));
            l++;
        }
        while (mm <= r) {
            ans.add(list.get(mm));
            mm++;
        }
        for (int i = ll; i <= r; i++) {
            list.set(i, ans.get(i - ll));
        }
    }

    public void divide(int l, int r, List<Integer> list) {
        if (l >= r) return;
        int m = (l + r) / 2;
        divide(l, m, list);
        divide(m + 1, r, list);
        conquer(l, m, r, list);
    }

    @Override
    public void trier(List<Integer> list) {
        divide(0, list.size() - 1, list);
    }
}
