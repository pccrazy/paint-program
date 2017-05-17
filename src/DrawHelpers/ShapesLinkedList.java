package DrawHelpers;

import java.util.ArrayList;

class ShapesLinkedList<T> {
    private int numberOfNodes = 0;
    private ShapesList<T> front = null;

    // Returns the state of list content
    public boolean isEmpty() {
        return (front == null);
    }

    //remove all modes from list
    public void makeEmpty() {
        front = null;
        numberOfNodes = 0;
    }

    // Place new node to front of list
    public void addFront( T element ) {
        front = new ShapesList<T>( element, front );
        numberOfNodes++;
    }

    // Method used to remove available node list front and reference node

    @SuppressWarnings("unchecked")
    public T removeFront() {
        T tempData;

        if (isEmpty())
            return null;

        tempData = front.getData();
        front = front.getNext();
        numberOfNodes--;
        return tempData;
    }

    // Return array of shapes
    @SuppressWarnings("unchecked")
    public ArrayList<T> getArray() {

        ArrayList<T> shapeArray=new ArrayList<T>();

        ShapesList<T> node=front;
        while (node!=null)
        {
            shapeArray.add(node.getData());
            node = node.getNext();
        }

        return shapeArray;
    }
}