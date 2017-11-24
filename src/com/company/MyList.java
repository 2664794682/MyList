package com.company;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MyList<T> {
    class Node{
        Node next = null;
        T data;
        public Node(T data){
            this.data = data;
        }
    }
    Node head = null;
    public void add(T data){
        Node newnode = new Node(data);
        if(head == null) {
            head = newnode;
            return;
        }
        Node p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = newnode;

    }
    public void Delete_Node(int n){
        int flag = 0;
        Node p = head;
        if(n == 0){
            head = p.next;
            return;
        }
        while (flag != n - 1 && p != null){
            flag++;
            p = p.next;
        }
        if(p == null){
            System.out.println("未找到要删除的节点");
            return;
        }
        p.next = p.next.next;
    }
    public void Print_Link(){
        Node p = head;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }
}
