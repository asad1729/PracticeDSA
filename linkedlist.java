public class linkedlist
{
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodevalue)
    {
        head = new Node();
        Node node = new Node();
        node.Next = null;
        node.value = nodevalue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public static void main(String[] args) {
        linkedlist obj = new linkedlist();
        obj.createSinglyLinkedList(5);
        System.out.println(obj.head.value);

    }
}