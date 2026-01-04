public class order {
    public static class Node{
        int val; // by default initialized to 0
        Node left; // null
        Node right; // null

        public Node(int val){
            this.val = val;
        }
    }
    public static void preorder(Node root){
        if(root == null) return;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);
    }
     public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right =b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left =c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        System.out.println("--------pre order----------");
        preorder(root);
        System.out.println("-----------in order-----------");
        inorder(root);
        System.out.println("----------post order-----------");
        postorder(root);
       
    }
    
}
