public class Linked {
    // Scratch code to linked list
    public static Node head;
    public static Node tail;
    public static int size;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Adding element to the first of linked list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;

            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.err.print("null");
        System.out.println();
    }

    public boolean hasCycle() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }

        }
        return false;
    }

    public void removeCycle() {
        // detect cycle
        Node prev = null;
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        while (fast != null && fast.next != null) {
            prev = fast;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {// LL has a cycle
                flag = true;
                break;
            }

        }
        if (flag == false) {
            return;
        }
        // find Meeting point
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;

        }
        prev.next = null;
    }

    // Merge SOrt code
    private Node Merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head1 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head1 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find Middle Node
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        Node midNode = slow;
        // Divide the Linked list
        Node righthead = midNode.next;
        midNode.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(righthead);
        return Merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        Linked ll = new Linked();
        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head.next;
        // System.out.println(ll.hasCycle());
        // ll.removeCycle();
        // ll.printList();
        // System.out.println(ll.hasCycle());
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.head=ll.mergeSort(ll.head);
        ll.printList();
       
    }
}