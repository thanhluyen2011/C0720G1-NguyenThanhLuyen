package _10_danh_sach.bai_tap;

public class MyLinkedList<E> {
    private class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }
//    phần tử đầu tiên
    private Node head;
//    số lượng phần tử trong danh sách
    private int numNodes = 0;

    public MyLinkedList(){}

    public void addFirst(E e){
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }
    public void addLast(E e){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }
    public void add(int index, E e){
        Node temp = head;
        Node holder;
        for (int i = 0; i < index-1 && temp.next != null;i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        numNodes++;
    }
    public Object get(int index){
        Node temp = head;
        for (int i = 0;i <index; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    public int size(){
        return numNodes;
    }

    public E remove(int index){
        if (index < 0 || index >numNodes){
            throw new IllegalArgumentException("Lỗi index: " + index);
        }
        Node temp = head;
        Object data;
        if (index == 0){
            data = temp.data;
            head = head.next;
        }else {
            for (int i =0; i < index - 1 && temp.next != null; i++){
                temp = temp.next;
            }
            data = temp.next.next;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }

    public boolean remove(E e){
        if (head.data.equals(e)){
            remove(0);
            return true;
        }else {
            Node temp = head;
            while (temp.next != null){
                if (temp.next.data.equals(e)){
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
            }
        }
        return false;
    }

    public MyLinkedList<E> clone(){
        if (numNodes == 0){
            throw new IllegalArgumentException("MyLinkedList is a null");
        }
        MyLinkedList<E> myLinkedList = new MyLinkedList<>();
        Node temp = head;
        myLinkedList.addFirst((E) temp.data);
        temp = temp.next;
        while (temp != null){
            myLinkedList.addFirst((E) temp.data);
            temp = temp.next;
        }
        return myLinkedList;
    }

    public boolean constrains(E e){
        Node temp = head;
        while (temp.next != null){
            if (temp.data.equals(e)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E e){
        Node temp = head;
        for (int i =0; i < numNodes; i++){
            if (temp.data.equals(e)){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public E getFirst(){
        return (E) head.data;
    }

    public E getLast(){
        Node temp = head;

        for (int i = 0; i < numNodes; i++){
            if (temp.next == null){
                  return (E) temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    public void clear(){
        Node temp = head;
        while (temp.next != null){
            temp.data = null;
            temp = temp.next;
        }
        numNodes = 0;
    }

}
