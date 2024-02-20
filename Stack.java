public class Stack {
    private class Node {
        Node next;
        int elem;

        public Node(int elem) {
            this.next = null;
            this.elem = elem;
        }
    }

    private Node head = null;
    private int nodeCount = 0;

    public void Push(int elem){
        Node add = new Node(elem);
        add.next = head;
        head = add;
        nodeCount++;
    }

    public void Pop(){
        if(head == null){
            System.out.println("Stack is empty bozo.");
        }
        head = head.next;
        nodeCount--;
    }

    public Integer peek(){
        if(head == null) {
            System.out.println("Stack is empty bucko.");
            return null;
        }
        return head.elem;
    }

    public boolean isEmpty() {
        if(head == null || nodeCount == 0) {
            System.out.println("Stack is indeed empty.");
            return true;
        } else {
            System.out.println("Stack isn't empty, wow.");
            return false;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.Push(1);
        stack.Push(2);
        stack.Push(3);
        stack.Push(8);
        stack.isEmpty();
        System.out.println(stack.peek());
        stack.Pop();
        System.out.println(stack.peek());
        stack.Pop();
        System.out.println(stack.peek());
        stack.Pop();
        System.out.println(stack.peek());
        stack.Pop();
        stack.isEmpty();
        System.out.println(stack.peek());
    }
}
