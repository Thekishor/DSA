
package LinkedList;

public class SinglyLinkedList {

  Node head;
  private int size;

  SinglyLinkedList() {
    this.size = 0;
  }

  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
      size++;
    }
  }

  // add first
  public void addFirst(int data) {
    Node node = new Node(data);
    if (head == null) {
      head = node;
      return;
    }
    node.next = head;
    head = node;
  }

  // add last
  public void addLast(int data) {
    Node node = new Node(data);
    if (head == null) {
      head = node;
      return;
    }

    Node currNode = head;
    while (currNode.next != null) {
      currNode = currNode.next;
    }
    currNode.next = node;
  }

  // print list
  public void printList() {
    if (head == null) {
      System.out.println("List is empty");
    }

    Node currNode = head;
    while (currNode != null) {
      System.out.print(currNode.data + "->");
      currNode = currNode.next;
    }
    System.out.println("null");
  }

  // delete first
  public void deleteFirst() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    size--;
    head = head.next;
  }

  // delete last
  public void deleteLast() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }

    size--;
    if (head.next == null) {
      head = null;
      return;
    }

    Node secondLast = head;
    Node lastNode = head.next;
    while (lastNode.next != null) {
      lastNode = lastNode.next;
      secondLast = secondLast.next;
    }

    secondLast.next = null;
  }

  // return size
  public int getSize() {
    return size;
  }

  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();
    list.addFirst(10);

    list.addLast(20);
    list.addLast(30);
    list.addLast(40);
    list.addLast(50);

    list.printList();

    System.out.println(list.getSize());
  }
}