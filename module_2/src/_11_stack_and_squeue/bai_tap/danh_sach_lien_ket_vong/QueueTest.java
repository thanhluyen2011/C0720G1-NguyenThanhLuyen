package _11_stack_and_squeue.bai_tap.danh_sach_lien_ket_vong;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(0);
        System.out.println(queue.dislayQueue());
        queue.enQueue(1);
        System.out.println(queue.dislayQueue());
        queue.enQueue(2);
        System.out.println(queue.dislayQueue());
        queue.enQueue(3);
        System.out.println(queue.dislayQueue());
        queue.deQueue();
        System.out.println(queue.dislayQueue());

    }
}
