package com.dsa;

import com.dsa.LinkListP.SinglyLinkedListNode;

import java.util.HashSet;

public class LinkListQuestion {

    //Nth Node From last Brute-Force
    //it gives result from count 1
    //Good solution Works on GeeksForGeeks
    public void nNodeFromLast(SinglyLinkedListNode head, int n) {
        SinglyLinkedListNode ptr = head;
        int count = 0;
        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }
        int res = count - n;
        count = 0;
        ptr = head;
        while (count != res && ptr != null) {
            count++;
            ptr = ptr.next;
        }
        if (ptr != null)
            System.out.println(ptr.data);
        else
            System.out.println("out of range");
    }

    //it gives result from count 0
    public void nNodeFromEnd(SinglyLinkedListNode head, int n) {
        SinglyLinkedListNode pTemp = head, pNth = null;
        for (int i = 0; i < n; i++) {
            if (pTemp != null)
                pTemp = pTemp.next;
        }
        while (pTemp != null) {
            if (pNth == null)
                pNth = head;
            else
                pNth = pNth.next;
            pTemp = pTemp.next;
        }
        if (pNth != null)
            System.out.println(pNth.data);
        else
            System.out.println("not exist");
    }

    //cycle in LinkList
    //	Floyd	cycle	finding	algorithm.
    public boolean findCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode fhead = head, shead = head;
        while (fhead != null && fhead.next != null) {
            fhead = fhead.next.next;
            shead = shead.next;
            if (fhead == shead)
                return true;
        }
        return false;
    }

    //find node data  that has cycle
    public int findNodeCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode fhead = head, shead = head;
        boolean loopExist = findCycle(head);

        if (loopExist) {
            shead = head;
            while (shead != fhead) {
                shead = shead.next;
                fhead = fhead.next;
            }
            return fhead.data;
        }
        return -1;
    }

    //Find the length of loop
    public int LengthOfCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode fhead = head, shead = head;
        boolean loopExist = findCycle(head);
        int count = 0;
        if (loopExist) {
            do {
                shead = shead.next;
                count++;
            }
            while (shead != fhead);
        }
        return count;
    }

    //Insert Node At Position
    public SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        SinglyLinkedListNode ptr = head;
        int count = 0;
        //System.out.println(" new node created:" + node.data);
        while (ptr != null && count != position - 1) {
            ptr = ptr.next;
            count++;

        }
        node.next = ptr.next;
        ptr.next = node;
        //  System.out.println(" new ptr created:" + ptr.data);


        return head;
    }

    //Insert node in Sorted list
    public SinglyLinkedListNode insertInSortedList(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        SinglyLinkedListNode ptr = head, temp = null;
        if (ptr == null)
            return node;
        if (ptr.data > data) {
            node.next = ptr;
            head = node;
        } else {
            while (ptr != null && ptr.data < node.data) {
                temp = ptr;
                ptr = ptr.next;
            }
            node.next = ptr;
            temp.next = node;


        }
        return head;
    }

    //Reverse a LinkList
    public SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode next;
        SinglyLinkedListNode current = head;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // This function will remove the loop from the linked list
    public void removeTheLoop(SinglyLinkedListNode head) {
        SinglyLinkedListNode sp = head, fp = head;
        while (sp != null && fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;
            if (sp == fp)
                break;
        }

        if (sp == fp) {
            sp = head;
            while (sp.next != fp.next) {
                sp = sp.next;
                fp = fp.next;
            }
            fp.next = null;
        }

    }

    //intersection Of two LinkList
    public int intersectPoint(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode temp1 = head1;
        SinglyLinkedListNode temp2 = head2;
        HashSet<SinglyLinkedListNode> list = new HashSet<>();
        while (temp1 != null) {
            list.add(temp1);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            if (list.contains(temp2)) {
                break;
            }
            temp2 = temp2.next;
        }
        return temp2.data;
    }

    //Linked List Length Even or Odd?
    int isLengthEvenorOdd(SinglyLinkedListNode head1) {
        if (head1 == null)
            return 0;
        else {
            while (head1 != null && head1.next != null) {
                head1 = head1.next.next;
            }
            if (head1 == null)
                return 0;
        }
        return 1;
    }
    //Merge two sorted linked lists
    SinglyLinkedListNode sortedMerge(SinglyLinkedListNode headA, SinglyLinkedListNode headB) {
        if (headA == null)
            return headB;

        if (headB == null)
            return headA;

        SinglyLinkedListNode temp = null;
        if (headA.data < headB.data) {
            temp = headA;
            headA = headA.next;
        } else {
            temp = headB;
            headB = headB.next;
        }
        SinglyLinkedListNode head = temp;
        while (headA != null && headB != null) {
            if (headA.data < headB.data) {
                temp.next = headA;
                headA = headA.next;
            } else {
                temp.next = headB;
                headB = headB.next;
            }
            temp = temp.next;
        }
        if (headA == null) {
            temp.next = headB;
        } else {
            temp.next = headA;
        }
        return head;
    }

}
