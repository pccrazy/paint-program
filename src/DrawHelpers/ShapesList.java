package DrawHelpers;

public class ShapesList<T> {
    private T data;
    private ShapesList next;
     
    // Constructor: No reference to next node provided so make it null 
    public ShapesList(T nodeData ) {
        this( nodeData, null);
    }
     
    // Constructor: Set data and reference to next node.
    public ShapesList(T nodeData, ShapesList nodeNext ) {
        data = nodeData;
        next = nodeNext;
    }
     
    // Accessor: Return the data for current DrawHelpers.ListNode object
    public T getData() {
        return data;
    }
     
    // Accessor: Return reference to next DrawHelpers.ListNode object
    public ShapesList getNext() {
        return next;
    }
     
    // Mutator: Set new data for current DrawHelpers.ListNode object
    public void setData( T newData ) {
        data = newData;
    }
     
     
    // Mutator: Set new reference to the next node object
    public void setNext( ShapesList newNext ) {
        next = newNext;
    }
}