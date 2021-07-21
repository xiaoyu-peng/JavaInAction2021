package com.xhh.DesignPatterns.Behavioral_Model_11.D004_IteratorPatterns.Demo002;


import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("xzg");
        names.add("wang");
        names.add("zheng");

        IteratorM<String> iteratorM = new ArrayIteratorM(names);
        while (iteratorM.hasNext()) {
            System.out.println(iteratorM.currentItem());
            iteratorM.next();
        }
    }
}