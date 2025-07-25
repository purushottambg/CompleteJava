package companyWiseDSA;

class NodeC{
    NodeC next;
    int val;

    NodeC(int val){
        this.val=val;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        NodeC n1 = new NodeC(3);
        NodeC n2 = new NodeC(2);
        NodeC n3 = new NodeC(0);
        NodeC n4 = new NodeC(-4);

        // link them
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        System.out.println("Before reverse");
        printList(n1);
        System.out.println("After reverse");
        NodeC reversedHead = reverseList(n1);
        printList(reversedHead);
    }

    public static void printList(NodeC head){
        while (head!=null){
            System.out.print(head.val+"->");
            head=head.next;
        }
        System.out.println();
    }

    public static NodeC reverseList(NodeC node){
        NodeC curr=node;
        NodeC prev=null;

        while (curr != null) {
            NodeC nextNode = curr.next;
            curr.next = prev;  // reverse the link
            prev = curr;       // move prev to current
            curr = nextNode;   // move to next
        }

        return prev;
    }

}
