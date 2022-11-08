public class MyClass {
    int[] myArray = new int[5];     //declaring array

    MyClass(){          //initialising array
        myArray[0]=7;
        myArray[1]=8;
        myArray[2]=6;
        myArray[3]=5;
        myArray[4]=1;

    }

    //method of selection sort
    void selectionSort(){
        int min;
        int minIndex;
        for(int i=0;i<myArray.length;i++){
            min = myArray[i];
            minIndex=i;

            //code to print each pass
            for(int k=0;k<myArray.length;k++){
                System.out.print(myArray[k] + " -> ");
            }

            for(int j=i+1;j<myArray.length;j++){
                if(myArray[j]<min){
                    min=myArray[j];
                    minIndex = j;
                }
            }
            myArray[minIndex] = myArray[i];
            myArray[i]= min;

            System.out.println();

        }
    }

    //creating main method to create object of class
    public static void main(String[] args){
        MyClass obj = new MyClass();
        obj.selectionSort();
    }
}
