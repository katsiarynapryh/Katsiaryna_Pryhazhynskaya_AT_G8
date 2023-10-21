package classwork.day6;

public class ObjectContainer {
    Object[] objects = new Object[10];
    int counter = 0;

    public void add(Object incoming) {
        if (counter < objects.length) {
            objects[counter] = incoming;
            counter++;
        }
    }
    
    public Object removeLast() {
        Object removedObj = null;
        if (counter > 0) {
           removedObj = objects[counter - 1];
           counter--;
        }
        return removedObj;
    }

    public boolean isEmpty() {
            return counter == 0;
    }

}
