package data_structure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    private Node rootNode;

    public void add(int data) {
        this.rootNode = addNode(rootNode, data);
    }

    private Node addNode(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            return node;
        }
        if (data < node.getData()) {
            node.leftChild = addNode(node.leftChild, data);
        } else if (data > node.getData()) {
            node.rightChild = addNode(node.rightChild, data);
        }
        return node;
    }

    public void showInorder(Node rootNode) {
        if (rootNode != null) {
            showInorder(rootNode.getLeftChild());
            System.out.print(rootNode.getData() + " | ");
            showInorder(rootNode.getRightChild());
        }
    }

    public void showEvenNodes(Node node) {
        if (node != null) {
            showEvenNodes(node.leftChild);
            if (node.getData() % 2 == 0)
                System.out.print(node.getData() + " | ");
            showEvenNodes(node.rightChild);
        }
    }

    public void showOddNodes(Node node) {
        if (node != null) {
            showOddNodes(node.leftChild);
            if (node.getData() % 2 != 0)
                System.out.print(node.getData() + " | ");
            showOddNodes(node.rightChild);
        }
    }

    public void showLeftView(Node node){
        final Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()) {
            int noOfElementsAtThisLevel = queue.size();
           // System.out.println("Queue size "+queue.size() +" no of element  "+noOfElementsAtThisLevel);
            for(int index = 0; index < noOfElementsAtThisLevel; index++) {
                Node tmp = queue.poll();
                System.out.println("Polled "+tmp.getData());
                if(index != 0) {
                    System.out.print(tmp.getData() + " <-- ");
                }

                if(tmp.getLeftChild() != null) {
                    queue.add(tmp.getLeftChild());
                }
                if(tmp.getRightChild() != null) {
                    queue.add(tmp.getRightChild());
                }
            }
        }
    }

    private void doLevelOrderTraversal(Node root) {
        final Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int noOfElementsAtThisLevel = queue.size();
            System.out.println("No of element "+noOfElementsAtThisLevel+" size "+queue.size());
            for(int index = 0; index < noOfElementsAtThisLevel; index++) {
                Node tmp = queue.poll();
                System.out.println();
                System.out.println("Polled --> "+tmp.getData());
                System.out.println();
                System.out.print(tmp.getData() + " <--");
                if(tmp.getLeftChild() != null) {
                    queue.add(tmp.getLeftChild());
                }
                if(tmp.getRightChild() != null) {
                    queue.add(tmp.getRightChild());
                }
            }
            System.out.println();
        }
    }

    public void levelOrderTraversal() {
        doLevelOrderTraversal(rootNode);
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(10);
        binaryTree.add(2);
        binaryTree.add(30);
        binaryTree.add(35);
        binaryTree.add(34);
        binaryTree.add(40);
        binaryTree.add(1);
        binaryTree.add(5);
        //System.out.println("Showing Inorder");
        //binaryTree.showInorder(binaryTree.rootNode);
        //System.out.println();
        //System.out.println("Showing even nodes");
        //binaryTree.showEvenNodes(binaryTree.rootNode);
        //System.out.println();
        //System.out.println("Showing Odd nodes");
        //binaryTree.showOddNodes(binaryTree.rootNode);
        //System.out.println();
        //System.out.println("Showing Left view");
        //binaryTree.showLeftView(binaryTree.rootNode);
        binaryTree.levelOrderTraversal();
    }
}
