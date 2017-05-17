package DrawHelpers;

public class ShapesList<T> {
    private T data;
    private ShapesList next;

    // Set next node reference and data
    public ShapesList(T nodeData, ShapesList nodeNext ) {
        data = nodeData;
        next = nodeNext;
    }

    // Get data DrawHelpers list object
    public T getData() {
        return data;
    }

    // Get the next DrawHelpers object
    public ShapesList getNext() {
        return next;
    }

}