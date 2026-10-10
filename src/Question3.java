class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int data) {
        this.data = data;
        next = null;
    }
}

public class Question3 {
    static QueueNode reverse(QueueNode head) {
        QueueNode prev = null;
        QueueNode current = head;
        QueueNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    static void printList(QueueNode head) {
        QueueNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        QueueNode head = new QueueNode(1);
        head.next = new QueueNode(2);
        head.next.next = new QueueNode(3);
        head.next.next.next = new QueueNode(4);

        head = reverse(head);
        printList(head);
    }
}