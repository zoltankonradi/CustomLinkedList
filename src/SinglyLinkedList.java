
public class SinglyLinkedList extends LinkedList {

    SinglyLinkedList(int dataInput) {
        super(dataInput);
    }

    @Override
    public void insert(int dataInput) {
        Node new_node = new Node(dataInput);
        if (head.nextNode == null) {
            head.nextNode = new_node;
        } else {
            Node lastNode = head;
            while(lastNode.nextNode != null) {
                lastNode = lastNode.nextNode;
            }
            lastNode.nextNode = new_node;
        }
    }

    @Override
    public String remove(int index) {
        Node previousNode = head;
        Node currentNode = head.nextNode;
        if (index >= getLength())
            return "No such index!";
        else {
            if (index == 0) {
                head = head.nextNode;
                return "Deleted item at index " + index;
            }
            int counter = 1;
            while (counter < index) {
                counter++;
                previousNode = currentNode;
                currentNode = currentNode.nextNode;
            }
            previousNode.nextNode = currentNode.nextNode;
            return "Deleted item at index " + index;
        }
    }
}
