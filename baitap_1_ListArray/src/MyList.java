import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    private int capacity = DEFAULT_CAPACITY;
//contructor
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        this.capacity = capacity;
        elements = new Object[capacity];
    }
//methor

    public int getCapacity() {
        return capacity;
    }

    private void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void add1(int index, E element){
        if(size == elements.length){
            ensureCapa();
        }
        for(int i = size;i > index;i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index){
        if(index > size || index < 0){
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+index);
        }
        Object result = elements[index];
        for (int i = index;i < size - 1;i++){
            elements[i]=elements[i+1];
        }
        size--;
        return (E) result;
    }

    public int getSize() {
        return size;
    }

    public MyList<E> clone1(){
        MyList<E> newList = new MyList<>(getCapacity());
//        newList.size=size;
//        newList.elements = Arrays.copyOf(elements,getCapacity());
        for (int i = 0; i < getSize(); i++) {
            newList.add((E) elements[i]);
        }
        return newList;

    }
    // sai

    public boolean contains(E element){
        for(Object e: elements){
            if((E) e == element){
                return true;
            }
        }
        return false;
    }

    public int indexOf(E element){
        int i = 0;
        for(;i < elements.length;i++){
            if((E) elements[i] == element){
                return i;
            }
        }
        return -1;
    }


    public boolean add(E element){
        if(size == elements.length){
            this.ensureCapa();
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity){
        if(minCapacity >= size){
            elements = Arrays.copyOf(elements,minCapacity);

        }else {
            Object[] temp = new Object[minCapacity];
            for (int i = 0; i < minCapacity; i++) {
                temp[i] = elements[i];
            }
            elements = temp;

        }
    }
    public E get(int i){

        return (E) elements[i];
    }
    public void clear(){
        elements = new Object[getCapacity()];
    }



}
