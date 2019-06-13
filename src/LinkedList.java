
public abstract class LinkedList {

    public Node head;

    LinkedList(int dataInput) {
        head = new Node(dataInput);
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.nextNode;
        }
    }

    public String getItemAt(int index) {
        int listLength = getLength();
        if (index >= listLength)
            return "No such index!";
        else {
            int counter = 0;
            Node currentNode = head;
            while (counter < index) {
                counter++;
                currentNode = currentNode.nextNode;
            }
            return Integer.toString(currentNode.data);
        }
    }

    public int getLength() {
        int counter = 0;
        Node currentNode = head;
        while (currentNode != null) {
            counter++;
            currentNode = currentNode.nextNode;
        }
        return counter;
    }

    public int getTail() {
        Node currentNode = head;
        while (currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
        }
        return currentNode.data;
    }

    public int getHead() {
        return head.data;
    }

    public abstract void insert(int dataInput);

    public abstract String remove(int index);
}
