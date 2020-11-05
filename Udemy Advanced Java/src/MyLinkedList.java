import java.util.Iterator;

public class MyLinkedList{

    private Node head;
    private int size;

    public void add(int value){
        if (head == null){
            head = new Node(value);
        }
        else{
            Node temp = head;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        size++;
    }

    public int get(int index){
        if (index <= size - 1){
            int i = 0;
            Node temp = head;
            while ( i != index){
                temp = temp.getNext();
                i++;
            }
            return temp.getValue();
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public void remove(int index){
        // [1] -> [2] -> [3]
        Node temp = head;
        int i = 0;
        if(index <= size - 1){
            if (index == 0){
                head = head.getNext();
            }
            else {
                while (i != index - 1) {
                    temp = temp.getNext();
                    i++;
                }
                temp.setNext(temp.getNext().getNext());
            }
            size --;
            return;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public String toString(){
        StringBuilder s = new StringBuilder("");
        Node temp = head;
        while(temp != null){
            s.append(temp.getValue() + " ");
            temp = temp.getNext();
        }
        return s.toString();
    }

    private static class Node{

        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public int getValue() {
            return value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
