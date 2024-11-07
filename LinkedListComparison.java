public class LinkedListComparison {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    int compareLists(LinkedListComparison otherList) {
        Node current1 = this.head;
        Node current2 = otherList.head;

        while (current1 != null && current2 != null) {
            if (current1.data != current2.data) {
                return 0;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        if (current1 == null && current2 == null) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        LinkedListComparison list1 = new LinkedListComparison();
        list1.append(1);
        list1.append(2);
        list1.append(3);
        LinkedListComparison list2 = new LinkedListComparison();
        list2.append(1);
        list2.append(2);
        list2.append(3);
        int result = list1.compareLists(list2);
        if (result == 1) {
            System.out.println("The two linked lists are equal.");
        } else {
            System.out.println("The two linked lists are not equal.");
        }
    }
}
