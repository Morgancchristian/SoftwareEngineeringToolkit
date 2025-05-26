public class genericArrayList<T> implements genericArrayListInterface<T> {

    private genericArray<T> array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public genericArrayList() {
        this.array = new genericArray<>(DEFAULT_CAPACITY);
        this.size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int capacity() {
        return this.array.length();
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public T get(int index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return this.array.get(index);
    }

    @Override
    public void set(int index, T value) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        this.array.set(index, value);
    }
}
