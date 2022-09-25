package com.bridgelabz;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SingleTone> list = new ArrayList<>();
        SingleTone singleTone = SingleTone.getInstance("Aditya","Mumbai",44);
        SingleTone singleTone1 =SingleTone.getInstance("Abhishek","Pune",45);
        list.add(singleTone);
        list.add(singleTone1);
        System.out.println(list);
        //System.out.println(singleTone);
        //System.out.println(singleTone1);

    }
}
