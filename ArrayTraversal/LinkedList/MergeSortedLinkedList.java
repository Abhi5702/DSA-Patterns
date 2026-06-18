package ArrayTraversal.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class MergeSortedLinkedList {

    // Create Linked List
    static Node createList(int... values) {
        Node head = null, tail = null;

        for (int value : values) {
            Node node = new Node(value);

            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
        return head;
    }

    // Merge Two Sorted Lists
    static Node merge(Node l1, Node l2) {

        Node dummy = new Node(-1);
        Node current = dummy;

        while (l1 != null && l2 != null) {

            if (l1.data <= l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }

            current = current.next;
        }

        // Attach remaining nodes
        if (l1 != null) {
            current.next = l1;
        }

        if (l2 != null) {
            current.next = l2;
        }

        return dummy.next;
    }

    // Print List
    static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node list1 = createList(1, 3, 5, 7);
        Node list2 = createList(2, 4, 6, 8);

        System.out.println("List 1:");
        printList(list1);

        System.out.println("List 2:");
        printList(list2);

        Node merged = merge(list1, list2);

        System.out.println("Merged List:");
        printList(merged);
    }
}
