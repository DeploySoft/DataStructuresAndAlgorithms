package List;

/**
 * @author : J. Andres Boyaca (janbs)
 * @since : 17/05/21
 **/

public class LinkedList {

    public static void main(String... args) {
        Attribute blue = new Attribute("blue");
        Attribute red = new Attribute("red");
        Attribute yellow = new Attribute("yellow");

        AttributeLinkedList linkedList = new AttributeLinkedList();
        linkedList.addToFront(blue);
        linkedList.addToFront(red);
        linkedList.addToFront(yellow);

        System.out.println(linkedList.removeFromFront());
        linkedList.printList();
        System.out.println(linkedList.size());
        System.out.println(linkedList.isEmpty());
    }
}

class AttributeLinkedList {

    private AttributeNode head;
    private AttributeNode tail;
    private int size;

    public void addToFront(Attribute attribute) {
        AttributeNode attributeNode = new AttributeNode(attribute);
        attributeNode.setNext(head);
        head = attributeNode;
        size++;
    }

    public void printList() {
        AttributeNode current = head;
        System.out.println("HEAD ->");
        while (current != null) {
            System.out.println(current);
            System.out.println("->");
            current = current.getNext();
        }
        System.out.println("NULL");

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public AttributeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        AttributeNode removedNode = this.head;
        this.head = this.head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

}

class AttributeNode {

    private Attribute attribute;

    private AttributeNode next;
    private AttributeNode previous;

    public AttributeNode getPrevious() {
        return previous;
    }

    public void setPrevious(AttributeNode previous) {
        this.previous = previous;
    }

    public AttributeNode(Attribute attribute) {
        this.attribute = attribute;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public AttributeNode getNext() {
        return next;
    }

    public void setNext(AttributeNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return attribute.toString();
    }
}

class Attribute {

    private String name;

    public Attribute(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                '}';
    }
}