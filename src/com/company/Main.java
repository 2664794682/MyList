package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        MyList<Integer> a = new MyList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.Print_Link();
        a.Delete_Node(3);
        a.Print_Link();
    }
}
