public class genericArray<T> {

    private Object[] data; // In specifying a generic array, we must first allocate space in memory for the generic objects that will go inside.
    private int capacity; // The capacity of the array.

    public genericArray(int capacity) { // Constructor for the genericArray class.
        if (capacity < 0) throw new IllegalArgumentException(
            "Capacity must be greater than 0"
        );
        this.capacity = capacity;
        this.data = new Object[capacity];
    }

    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    public void set(int index, T value) {
        checkIndex(index);
        data[index] = value;
    }

    public int length() {
        return capacity;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= capacity) {
            throw new IndexOutOfBoundsException(
                "Index: " + index + ", Capacity: " + capacity
            );
        }
    }

    public void resize(int newCapacity) {
        if (newCapacity <= 0) throw new IllegalArgumentException(
            "New capacity must be > 0"
        );
        Object[] newData = new Object[newCapacity];
        int lengthToCopy = Math.min(capacity, newCapacity);
        for (int i = 0; i < lengthToCopy; i++) {
            newData[i] = data[i];
        }
        data = newData;
        capacity = newCapacity;
    }
}
