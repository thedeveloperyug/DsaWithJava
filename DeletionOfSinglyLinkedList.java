public class DeletionOfSinglyLinkedList {
   
    // Creating a head node
    Node head;

    // ------- CREATING A NODE -------- 
    class Node{
        String data;
        Node next;
    
        Node(String data){
        this.data = data;
        this.next = null;
    }
}
// adding the node from the beginning 
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


// deleting the node from the beginning 
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node firstNode = head;
        head = firstNode.next;
        return;
    }

// --------Printing the linked list----------

    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode =currNode.next;
        }
        System.out.println("NULL"); 
    }

   
public static void main(String[] args) {
    DeletionOfSinglyLinkedList sll = new DeletionOfSinglyLinkedList();
    // Adding items to the linked list 
    sll.addFirst("item2");
    sll.addFirst("item1");
    sll.printList();
   // deleting items from the linked list 
    sll.deleteFirst();
    sll.printList();

    }
}
