package dataStructures.genericArrayList;

public class genericArray<T> {

    private Object[] data;
    private int capacity;

    public genericArray(int capacity) {
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
