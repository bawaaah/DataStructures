class StackX{

    private int[] stackArr;
    private int maxSize;
    private int top;

    public StackX(int x){
        maxSize = x;
        stackArr = new int[maxSize];
        top = -1;
    }
    
    public void push(int x){
        if(top == maxSize-1)
            System.out.println("Stack is FULL");
        else
            stackArr[++top] = x;
    }

    public boolean isEmpty(){
        if(top == -1)
            return true;
        else
            return false;
    }

    public int pop(){
        if(isEmpty()){
            System.err.println("Stack is Empty!");
            return -99;
        }
        else
            return stackArr[top--];
    }

    public int peek(){
        if(isEmpty()){
            System.err.println("Stack is Empty!");
            return -99;
        }
        else
            return stackArr[top];
    }
    
}

