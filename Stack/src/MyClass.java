public class MyClass {
    //declaring variables
    int maxSize = 5;
    int[] stack = new int[maxSize]; //declaring stack array
    int top = -1;

    //a.Method to push element
    void push(int data){
        if(top+1==maxSize){
            System.out.println("Overflow");
        }
        else{
            top++;
            stack[top] = data;
        }

    }

    //b.Method to pop element
    void pop(){
        if(top==-1){
            System.out.println("Underflow");
        }
        else{
            System.out.println("Element " + stack[top] +" is deleted");
            top--;
        }

    }

    //c.Method to display stack element
    void displayStack(){
        if(top==-1){
            System.out.println("Stack is Empty");
        }
        else{
            for(int i=0;i<=top;i++){
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }

    }

    //creating main method to create object of class
    public static void main(String[] args){
        MyClass st = new MyClass();
        st.displayStack();
        st.pop();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.displayStack();
        st.pop();
        st.pop();
        st.displayStack();
    }
}
