class OrderNode {
    int data;
    OrderNode next;

    OrderNode(int data) {
        this.data = data;
        next = null;
    }
}

public class cancelled {
    static OrderNode removeAll(OrderNode head, int code) {
        while (head != null && head.data == code) {
            head = head.next;
        }

        OrderNode temp = head;

        while (temp != null && temp.next != null) {
            if (temp.next.data == code) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }

    static void printList(OrderNode head) {
        OrderNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        OrderNode head = new OrderNode(5);
        head.next = new OrderNode(3);
        head.next.next = new OrderNode(5);
        head.next.next.next = new OrderNode(8);
        head.next.next.next.next = new OrderNode(5);

        int code = 5;

        head = removeAll(head, code);
        printList(head);
    }
}
