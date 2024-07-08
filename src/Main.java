public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(13);
        tree.insert(16);
        tree.insert(14);
        tree.insert(1);
        tree.insert(18);

        tree.inOrder();
        System.out.println();
//        tree.preOrder();
//        System.out.println();
//        tree.postOrder();
//        System.out.println();


        System.out.println(tree.search(1));


    }
}