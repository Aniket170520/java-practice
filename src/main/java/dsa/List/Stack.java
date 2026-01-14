package dsa.List;

public class Stack {

    protected int[] data;

    protected static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public Stack(int size) {
        this.data = new int[size];
    }

    public Stack(){
        this(DEFAULT_SIZE);
    }

    public boolean push(int item){
        if(isFull()){
            int [] temp = new int[data.length *2];
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            throw  new RuntimeException("Stack is empty");
        }

        return data[ptr--];
    }

    public int peak(){
        if(isEmpty()){
            throw  new RuntimeException("Stack is empty");
        }

        return data[ptr];
    }

    private boolean isEmpty() {
        return ptr == -1;
    }

    private boolean isFull() {
        return ptr == data.length;
    }

}
