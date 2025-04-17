package SoftwareEngineeringToolkit.BinarySearchTree;

public class bst<T extends Comparable<T>> {
    private treeNode<T> root;
    private int size;

    public bst() {
        this.root = null;
    }

    public boolean instert(T itemToInsert) {
        
        treeNode<T> newNode = new treeNode<>(itemToInsert);
        
        if (root == null) {
            root = newNode;
        }

        treeNode<T> parent = null;
        treeNode<T> current = root;

        while (current != null) {
            if (itemToInsert.compareTo(current.getItem()) < 0) {
                parent = current;
                current = current.getLeftTreeNode();
            } else if (itemToInsert.compareTo(current.getItem()) > 0) {
                parent = current;
                current = current.getRightTreeNode();
            } else {
                return false;
            }
        }

        if (itemToInsert.compareTo(parent.getItem()) < 0) {
            parent.setLeftTreeNode(newNode);
        } else {
            parent.setRightTreeNode(newNode);
        }

        size++;
        return true;
    }

    


    
}
