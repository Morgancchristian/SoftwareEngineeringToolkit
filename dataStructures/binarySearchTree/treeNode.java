

public class treeNode<T> {
    private T item;
    private treeNode<T> lefTreeNode;
    private treeNode<T> rightTreeNode;

    public treeNode() {
        this.item = null;
        this.lefTreeNode = null;
        this.rightTreeNode = null;
    }

    public treeNode(T item) {
        this.item = item;
        this.lefTreeNode = null;
        this.rightTreeNode = null;
    }

    public T getItem () {
        return this.item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public treeNode<T> getLeftTreeNode() {
        return this.lefTreeNode;
    }

    public void setLeftTreeNode(treeNode<T> leftNode) {
        this.lefTreeNode = leftNode;
    }

    public treeNode<T> getRightTreeNode() {
        return this.rightTreeNode;
    }

    public void setRightTreeNode(treeNode<T> rightNode) {
        this.rightTreeNode = rightNode;
    }

}
