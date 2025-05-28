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
    
    @Override
    public void add(T value) {
        if (this.size == this.array.length()) {
            this.array.resize(this.array.length() * 2);
        }
        this.array.set(this.size, value);
        this.size++;
    }
    
    @Override 
    public void add(int index, T value){
        if (index < 0 || index > this.size) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        if (this.size == this.array.length()) {
            this.array.resize(this.array.length() * 2);
        }
        for (int i = this.size - 1; i >= index; i--) {
            this.array.set(i + 1, this.array.get(i));
        }
        this.array.set(index, value);
        this.size++;
    }
    
    @Override
    public T remove(int index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        T removed = this.array.get(index);
        for (int i = index + 1; i < this.size; i++) {
            this.array.set(i - 1, this.array.get(i));
        }
        this.array.set(this.size - 1, null);
        this.size--;
        return removed;
    }
    
    @Override
    public boolean remove(T value) {
        for (int i = 0; i < this.size; i++) {
            if (this.array.get(i).equals(value)) {
                this.remove(i);
                return true;
            }
        }
        return false;
    }
}
