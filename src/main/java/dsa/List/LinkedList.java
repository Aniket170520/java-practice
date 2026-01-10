package dsa.List;

import com.sun.jdi.Value;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;

        if (head != null){
            head.prev = node;
        }

        if (tail == null) tail = node;
        head = node;
        size++;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        node.next = null;
        node.prev = tail;

        if (tail != null){
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public void insertAfter(int after, int value){
        Node temp = find(after);

        if (temp ==  null) {
            System.out.println("Value not found: "+ after);
            return;
        }

        if (temp.next == null){
            insertLast(value);
        }else {
            Node node = new Node(value);
            node.prev = temp;
            node.next = temp.next;

            temp.next = node;
            temp.next.prev = node;
        }

    }

    public Node find(int value){
        Node temp = head;

        while (temp != null){
            if(temp.value == value) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void print(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + ",");
            temp = temp.next;
        }
    }

    private class Node{
        private int value;
        private Node prev;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev) {
            this.value = value;
            this.prev = prev;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
