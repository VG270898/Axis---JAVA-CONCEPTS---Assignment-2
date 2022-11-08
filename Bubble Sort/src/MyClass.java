public class MyClass {
    int[] myArray = new int[5]; //declaring a myArray
    MyClass(){      //initialising myArray
        myArray[0]=5;
        myArray[1]=45;
        myArray[2]=0;
        myArray[3]=9;
        myArray[4]=-15;
    }

    //method to bubble sort
    void bubbleSort(){
        int temp,step=0;
        for(int i=0;i< myArray.length-1;i++){
            step++;
            System.out.println("Iteration "+step);
            for(int j=0;j<myArray.length-1-i;j++){
                if(myArray[j+1]<myArray[j]){
                    temp = myArray[j+1];
                    myArray[j+1] = myArray[j];
                    myArray[j]=temp;
                }

                for(int k=0;k<myArray.length;k++){
                    System.out.print(myArray[k]+" -> ");
                }
                System.out.println();
            }
            System.out.println();
        }
        for(int i=0;i<myArray.length;i++){
            System.out.print(myArray[i]+" ");
        }

    }

    //creating main method to create object of class
    public static void main(String[] args){
        MyClass obj = new MyClass();
        obj.bubbleSort();
    }
}
