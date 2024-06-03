package May2024LinkedList;

public class LL_1_addNode {

    public static void main(String[] args) {

        LL_1_addNode ll = new LL_1_addNode();
        ll.addNodeAtEnd(8);
        ll.addNodeAtEnd(8);
        ll.addNodeAtEnd(8);
        ll.printLL();
    }
    Node head= null;
    Node tail = null;
    Node currentNode =head;

    public void addNodeAtEnd(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
        }
    }

    public void printLL()
    {
        currentNode = head;
        if(head == null)
        {
            System.out.println("Empty");
        }
        else
        {
            Node nextNode = currentNode;
            while(nextNode.next!=null)
            {
                System.out.println(currentNode.data);
               currentNode = currentNode.next;
               currentNode.data = nextNode.data;
            }
        }
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}