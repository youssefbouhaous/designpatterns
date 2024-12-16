package org.example.stratey.implementations;

import org.example.stratey.TriStrategy;

import java.util.ArrayList;
import java.util.List;

public class TriParSelection implements TriStrategy {
    @Override
    public void trier(List<Integer> list) {
        int n=list.size();
        for(int i=0;i<n;i++){
            Integer min=list.get(i);
            Integer indexMin=i;
            for(int j=i;j<n;j++){
                if(list.get(j)<min){
                    indexMin=j;
                    min=list.get(j);
                }
            }
            list.set(indexMin,list.get(i));
            list.set(i,min);
        }
    }
}
