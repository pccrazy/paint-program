package DrawHelpers;

public class ShapesList<T> {
    private T data;
    private ShapesList next;

    // Set next node reference to null if no node exist
    public ShapesList(T nodeData ) {
        this( nodeData, null);
    }

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

    // Set data for the next DrawHelpers list object
    public void setData( T newData ) {
        data = newData;
    }


    // Set reference for the next node object
    public void setNext( ShapesList newNext ) {
        next = newNext;
    }
}