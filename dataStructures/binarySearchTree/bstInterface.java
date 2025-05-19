

public interface bstInterface<T> {

    public boolean insert(T itemToInsert);

    public boolean searchFor(T itemToSearchFor);

    public treeNode<T> searchGet(T itemToReturn);

    public boolean remove(T itemToRemove);

    public T infixTraversal();

    public T prefixTraversal();

    public T postfixTraversal();



}
