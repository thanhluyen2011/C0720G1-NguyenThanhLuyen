package _11_stack_and_squeue.bai_tap.danh_sach_lien_ket_vong;

public class Queue {
    public Node front;
    public Node rear;
    static public int size = 0;
    public void enQueue(int data) {
        Node node = new Node(data);
        if (front == null) {
            front = rear = node;
        } else {
            rear.link = node;
            node.link = front;
            rear = node;
        }
        size++;
    }

    public void deQueue() {
        if (front == null) {
            System.out.println("hàng chờ trống");
        } else if (front == rear) {
            front = rear = null;
        } else {
            front = front.link;
        }
        size--;
    }
    public void display(){
        String str = "";
        Node temp = front;
        for (int i = 0; i < size;i++){
            str += temp.data + " ";
            temp = temp.link;
        }
        System.out.println(str);
    }
}