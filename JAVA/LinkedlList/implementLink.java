package LinkedlList;

public class implementLink {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;

        }

    }

    public static class linklist {
        Node head = null;
        Node tail = null;
        int size=0;

        void insertAtStart(int data) {
            Node temp = new Node(data);
            if (head == null) { // Empty List
                head = tail = temp;
                // insertAtEnd(data); we can do this too because the list is empty

            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAtEnd(int data) {

            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;

            }
            size++;

        }

        // Insert at any Index
        void insertAt(int idx, int data) {
            Node t = new Node(data);
            Node temp = head;
            if (idx == size) {
                insertAtEnd(data);
                return;
            } else if (idx == 0) {
                insertAtStart(data);
                return;
            } else if (idx < 0 || idx > size) {
                System.out.println("Wrong index");
                return;
            }

            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;


        }
        //Delete at any Index

        void deleteAt(int idx){
            if(idx==0){
                head=head.next;
                size--;
                return;
            }
            
            Node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
            size--;
        }

        // Get element at any index
        int getNodeAt(int idx) {
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;

            }
            return temp.data;

        }

        // Display Linked list
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    //     int size() {  //Time Complexity O(n) ->To Avoid this initialized size in Linked list class and when we insert a data increase it
    //         Node temp = head;
    //         int count = 0;
    //         while (temp != null) {
    //             count++;
    //             temp = temp.next;
    //         }
    //         return count;

    //     }

     }

    public static void main(String[] args) {
        linklist lL = new linklist();
        lL.insertAtEnd(4);
        lL.insertAtEnd(5);

        // lL.display();
        lL.insertAtEnd(6);
        lL.insertAtStart(7);
        lL.insertAt(2, 10);
        lL.insertAt(5, 17);
        lL.insertAt(0, 100);
        lL.display();
        lL.deleteAt(0);
        // lL.insertAt(10, 100);
        lL.display();
        System.out.println("\nSize is-" + lL.size);
        System.out.println("Head is-" + lL.head.data);
        System.out.println("Tail is-" + lL.tail.data);
        System.out.println("data at Given Index is-"+lL.getNodeAt(3));

    }

}
