    public static  Node insert(Node head,int data) {
        //Complete this method
        Node temp = new Node(data);
        if(head==null)
        {
            head=temp;
            return head;
        }
        else{
            Node current = head;
            while(current.next !=null)
            {
                current = current.next;
            }
            current.next = temp;
            return head;
        }
        
    }