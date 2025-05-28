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
            size++;
            return true;
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

    public boolean searchFor(T itemToSearchFor) {
        if (root == null) {
            return false;
        }

        treeNode<T> current = root;

        while (current != null) {
            if (itemToSearchFor.compareTo(current.getItem()) < 0) {
                current = current.getLeftTreeNode();
            } else if (itemToSearchFor.compareTo(current.getItem()) > 0) {
                current = current.getRightTreeNode();
            } else if (itemToSearchFor.compareTo(current.getItem()) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(T itemToRemove) {
        return true;
    }
}
