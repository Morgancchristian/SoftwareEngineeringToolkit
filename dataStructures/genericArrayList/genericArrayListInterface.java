public interface genericArrayListInterface<T> {
    // Basic Access
    T get(int index);
    void set(int index, T value);

    // Size and capacity
    int size();
    int capacity();
    boolean isEmpty();

    // Modifiers
    void add(T value);
    void add(int index, T value);
    T remove(int index);
    boolean remove(T value);

    // Search
    boolean contains(T value);
    int indexOf(T value);
    int lastIndexOf(T value);

    // Utilities
    void clear();
    void ensureCapacity(int minCapacity);
    void trimToSize();
}
