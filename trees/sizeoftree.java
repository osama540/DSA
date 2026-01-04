

public class sizeoftree {
    public static class Node{
        int val; // by default initialized to 0
        Node left; // null
        Node right; // null

        public Node(int val){
            this.val = val;
        }
    }
    // find heigth of the tree
    public static int height(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    // preorder traversal  1 2 3 4 5 6 
    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
     // calculate the maximum value in the tree
    public static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
       // int a = root.val;
        //int b = max(root.left);
        //int c = max(root.right);
        //return Math.max(a, Math.max(b,c));
               // or simply   both are same
        return Math.max(root.val, Math.max(max(root.left),max(root.right)));

    } 
    //calculate size of tree
    public static int size(Node root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    // calculate sum of all Node values
    public static int sum(Node root){
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right =b;
        Node c = new Node(40);
        Node d = new Node(5);
        a.left =c;
        a.right = d;
        Node e = new Node(6);
        b.right = e;
        //preorder(root); // print 1 2 3 4 5 6
       // display(root); // 
       //System.out.print(sum(root));//print size of tree 6
       System.out.println(max(root)); // print maximum value in tree
       System.out.println(height(root));
       
    }
    
}
