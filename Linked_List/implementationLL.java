package Linked_List;
//user defined data structure
class SLL{
    private Node head;
    Node tail;
    private int size;
    void insertAtTail(int val){
        Node temp = new Node(val);
        if(head==null){
//            head=temp;
//            tail=temp;
            head=tail=temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null){
            head=tail=temp;
        }else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void insert(int idx, int val){
        if(idx==0) {
            insertAtHead(val);
            return;
        }
        if(idx==size) {
            insertAtTail(val);
            return;
        }
        if(idx>size || idx<0){
            System.out.println("Invalid index!!");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i=1; i<=idx-1; i++){
            x=x.next;
        }
//        sab.insertion
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    int get(int idx){
        if(idx==size-1) return tail.val;
        if(idx>=size || idx<0) {
            System.out.println("Inavalid index");
            return -1;
        }
        Node temp = head;
        for(int i=1; i<=idx; i++){
            temp=temp.next;
        }
        return temp.val;
    }
    void set(int idx,int val){
        if(idx==size-1) {
            tail.val = val;
        }
        if(idx>=size || idx<0) {
            System.out.println("Inavalid index");
        }
        Node temp = head;
        for(int i=1; i<=idx; i++){
            temp=temp.next;
        }
        temp.val = val;
    }
    void deleteAtHead(){
        if(head==null) System.out.print("Invalid deletion");
        head=head.next;
        size--;
    }
    void delete(int idx){
        if(idx==0) {
            deleteAtHead();
            return;
        }
        if(idx<0 || idx>=size) System.out.println("Invalid index");
        Node temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        if(temp.next==tail){
            tail=temp;
        }
        temp.next=temp.next.next;
        size--;
    }
}


public class implementationLL {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
        list.insertAtHead(100);
        list.display();
        list.insert(0,1000);
        list.display();
        list.set(0,34);
        list.display();
        System.out.println(list.get(0));
    }
}
