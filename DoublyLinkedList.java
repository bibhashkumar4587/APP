public class DoublyLinkedList {
  static class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

  Node head;

  void append(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
    } else {
      Node last = head;
      while (last.next != null) {
        last = last.next;
      }
      last.next = newNode;
      newNode.prev = last;
    }
  }

  Node reverse() {
    Node current = head;
    Node temp = null;
    while (current != null) {
      temp = current.prev;
      current.prev = current.next;
      current.next = temp;
      current = current.prev;
    }

    if (temp != null) {
      head = temp.prev;
    }

    return head;
  }

  void printList() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();
    dll.append(1);
    dll.append(2);
    dll.append(3);
    dll.append(4);
    System.out.println("Original list:");
    dll.printList();
    dll.reverse();
    System.out.println("Reversed list:");
    dll.printList();
  }
}
