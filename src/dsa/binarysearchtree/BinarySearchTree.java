package dsa.binarysearchtree;

public class BinarySearchTree {

    public Node root = new Node(27);
    public class Node {
        public int value;
        public Node left;
        public Node right;


        public Node(int value) {
            this.value = value;
        }
    }




    public boolean insert(int value){

        Node newNode = new Node(value);
        if (root==null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true){
            if(temp.value == newNode.value){
                return false;
            }
            if(temp.value > newNode.value){
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }else{
                    temp = temp.left;
                }
            }

            if(temp.value < newNode.value){
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }else{
                    temp = temp.right;
                }
            }

        }

    }

    public boolean contains(int value){

        Node temp = root;
        while(temp!=null){
            if(temp.value == value){
                System.out.println("ELEMENT FOUND!");
                return true;
            }
            if(temp.value > value){
                temp = temp.left;
            }else{
                temp = temp.right;
            }

        }
        System.out.println("ELEMENT NOT FOUND");
        return false;
    }


    private boolean rContains(Node current_node, int value){

        if(current_node == null){
            return false;
        }
        if(current_node.value == value){
            return true;
        }
        if(current_node.value > value){
            return rContains(current_node.left, value);
        }else{
            return rContains(current_node.right, value);
        }

    }

    public boolean rContains(int value){
        return rContains(root, value);
    }


    private Node rInsert(Node current_node, int value){

        if(current_node == null){
            return new Node(value);
        }

        if( value > current_node.value){
            current_node.right = rInsert(current_node.right, value);
        }else{
            current_node.left = rInsert(current_node.left, value);
        }
        return current_node;
    }

    public void rInsert(int value){

        rInsert(root, value);
    }


}
