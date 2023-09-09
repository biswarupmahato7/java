package LinkedlList;

public class basicLink {
    // Number of node in linked list
    public static int countNode(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;

        }

        return count;

    }

    // display Linkedlist Using Recursion
    public static void display(Node head) {
        if (head == null)
            return;
        System.out.println(head.data + " ");
        display(head.next);

    }

    public static void displayLinkList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;

        }

    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        Node f = new Node(16);

        // 5 3 9 8 16
        a.next = b; // 5-> 3 9 8 16 (STORE THE ADDRESS OF B IN a.next to link a&b)
        b.next = c;// 5-> 3-> 9 8 16
        c.next = d;// 5-> 3-> 9-> 8 16
        d.next = e;// 5-> 3-> 9-> 8-> 16
        e.next=f;

        // After cunnect all this now we can Access all of them by HEAD=a
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);

        // Node temp=a;

        // for(int i=0;i<=4;i++){
        // System.out.print(temp.data+" ");
        // temp=temp.next; //Update temp value; here temp point ting b then c ...

        // }

        // while(temp!=null){
        // System.out.print(temp.data+" ");
        // temp=temp.next;

        // }
        displayLinkList(a);

        System.out.println("\nLength of the linked list");
        System.out.println(countNode(a));

    }

}
