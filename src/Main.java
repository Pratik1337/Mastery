import dsa.binarysearchtree.BinarySearchTree;

public class Main {
    public static void main(String[] args) {

        System.out.println("Binary Search Tree");
        BinarySearchTree bst = new BinarySearchTree();
//        System.out.println("BST root = "+ bst.root);


        System.out.println(bst.insert(24));
        System.out.println(bst.insert(24));
        System.out.println(bst.insert(30));
        System.out.println(bst.insert(35));
        System.out.println(bst.insert(32));

//        System.out.println("value = "+ bst.root.left.right.value);
//        bst.contains(119);
//
//        System.out.println(bst.rContains(24));

        System.out.println("---------------------------");

        System.out.println(bst.rContains(23));
        bst.rInsert(23);
        System.out.println(bst.rContains(23));


    }
}