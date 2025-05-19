package dataStructures.genericArrayList;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.GenericArrayType;

public class genericArrayList<T> implements genericArrayListInterface<T> {

    private genericArray<T> array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public genericArrayList() {
        this.array = new genericArray<>(DEFAULT_CAPACITY);
        this.size = 0;
    }
}
