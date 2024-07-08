public class BinaryTree {
    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data){
        if(root == null){
            root = new Node(data);
        } else if(data < root.data){
            root.left = insertRec(root.left, data);
        } else{
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void inOrder(){
        inOrderRec(root);
    }

    public Node inOrderRec(Node root){
        if(root != null){
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
        return root;
    }

    public int search(int data) {
        Node searchNode = root;

        while(searchNode.data != data){
            if(data < searchNode.data) {
                searchNode = searchNode.left;
            } else{
                searchNode = searchNode.right;
            }
            if(searchNode == null){
                return -1;
            }
        }
        System.out.print("Element found: " );
        return searchNode.data;
    }

}
