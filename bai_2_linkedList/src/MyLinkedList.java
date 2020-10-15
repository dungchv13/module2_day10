public class MyLinkedList {
    private Node head;
    private int numNodes;
    private int capacity;

    public MyLinkedList(Object data){
        head = new Node(data);
    }

    //class Node
    private class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }
    //Phương thức thêm một phần tử mới vào danh sách: add()
    public void add(int index,Object data){
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;

    }

    //Phương thức thêm một phần tử mới vào đầu danh sách: addFirst()
    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    //Phương thức thêm một phần tử mới vào cuối danh sách: addLast()
    public void addLast(Object data){
        Node temp = head;
        for (int i = 0;temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }
    //Phương thức xóa 1 phần tử tại vị trí index: remove(int index)
    public void remove1(int index){
        if(index < 0 || index > size()-1){
            throw new IndexOutOfBoundsException("Index : "+index+" ,size:"+size());
        }else{
            Node temp = head;
            for(int i = 0;i < index-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }
    //Phương thức xóa 1 phần tử cho trước: remove(Object o)
    public void remove2(Object data){
        if(!contains(data)){
            System.out.println("ko co phan tu nay trong mang");
            return;
        }else{
            while (indexOf(data) != -1){
                remove1(indexOf(data));
            }

        }
    }

    // Phương thức size trả về số lượng các phần tử có trong danh sách
    public int size(){
        Node temp = head;
        int i = 1;
        for(;temp.next != null; i++){
            temp = temp.next;
        }
        return i;
    }
    // Phương thức clone thực hiện sao chép danh sách ra 1 danh sách khác
    public MyLinkedList clone(){
        Node temp = head;
        MyLinkedList newList = new MyLinkedList(head.getData());
        for (int i = 0; i < numNodes; i++) {
            newList.addLast(temp.next.getData());
            temp = temp.next;
        }
        return newList;
    }
    //Phương thức contains kiểm tra phần tử o có trong danh sách không
    public boolean contains(Object data){
        Node temp = head;
        for (int i = 0;temp.next != null;i++){
            if(temp.getData() == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    //Phương thức indexOf trả về vị trí của phần tử o trong danh sách
    public int indexOf(Object data){
        Node temp = head;
        for (int i = 0;temp.next != null;i++){
            if(temp.getData() == data){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
    //add(Object e):boolean
    //ensureCapacity(int minCapacity)
    public void ensureCapacity(int minCapacity){
        this.capacity = minCapacity;
    }
    public void ensureCapa(){
        this.capacity = this.capacity*2;
    }
    //get(int i):Object
    public Object get(int index){
        if(index < 0 || index > size()-1){
            throw new IndexOutOfBoundsException("Index : "+index+" ,size:"+size());
        }else {
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            return temp.next.getData();
        }
    }
    //getFirst():Object
    public Object getFirst(){
        return head.getData();
    }
    //getLast():Object
    public Object getLast(){
        Node temp = head;
        for(int i = 0;temp.next != null;i++){
            temp =temp.next;
        }
        return  temp.getData();
    }
    //clear():void
    public void clear(){
        head = new Node(null);
    }
    //printList
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}
