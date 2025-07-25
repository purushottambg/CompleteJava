package companyWiseDSA;

class Node {
    Node next;
    int val;

    Node(int val){
        this.val=val;
        this.next=null;
    }
}

class NullNodePassedException extends Exception{
    public NullNodePassedException(String msg){
        super(msg);
    }
}

public class DetectCycleInLinkedList {

    public static void main(String[] args) {
        Node n1 = new Node(3);
        Node n2 = new Node(2);
        Node n3 = new Node(0);
        Node n4 = new Node(-4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n2;
        n4.next = n4;
        try {
            System.out.println(isCycle(n1));
        } catch (NullNodePassedException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isCycle(Node node) throws NullNodePassedException{

        if (node==null || node.next==null){
            throw new NullNodePassedException("You should Always pass non null nodes");
        }

        Node slow = node;
        Node fast = node;

        while(fast.next!=null && slow.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if (fast==slow){
                return true;
            }
        }

        return false;
    }
}
