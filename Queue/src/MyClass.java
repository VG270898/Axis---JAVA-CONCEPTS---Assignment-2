public class MyClass {
    int maxSize = 10;
    int[] queue = new int[maxSize];
    int rear=-1;
    int front=-1;

    void enqueue(int data){
        if(rear+1==maxSize){
            System.out.println("OverFlow");
        }
        else{
            rear++;
            queue[rear]=data;
            System.out.println("done");
            front=0;
        }
    }

    void dequeue(){
        if(front==rear || rear==-1 || front==-1){
            System.out.println("UnderFlow");
        }
        else{
            System.out.println("Deleted element is " + queue[front]);
            front++;
        }
    }

    void display(){
        if(rear==-1 || front==-1 || front==rear){
            System.out.println("UnderFlow");
        }
        else{
            for(int i=front;i<rear+1;i++){
                System.out.print(queue[i] + " ");
            }
        }
    }

    public static void main(String[] args){
        MyClass que = new MyClass();

        que.display();
        que.dequeue();

        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);
        que.enqueue(40);
        que.enqueue(50);

        que.display();

        que.dequeue();
        que.dequeue();

        que.display();

        que.enqueue(60);
        que.enqueue(70);
        que.display();
    }

}
