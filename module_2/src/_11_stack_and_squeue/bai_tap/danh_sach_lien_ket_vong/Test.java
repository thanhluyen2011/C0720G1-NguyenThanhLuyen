package _11_stack_and_squeue.bai_tap.danh_sach_lien_ket_vong;

public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(5);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.display();
        queue.deQueue();
        queue.display();
    }
}
