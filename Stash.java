Public Class Stash{
    //meant to say stack oops
    private class Node {
        Node next;
        int elem;
    }

    public static void Push(Stack node, int elem){
        Node add = new Node(elem);
        stack.next = add;
    }
}