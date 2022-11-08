public class MyClass {
    int[] myArray = new int[6];     //declaring array

    MyClass(){          //initialising array
        myArray[0] = 7;
        myArray[1] = 4;
        myArray[2] = 15;
        myArray[3] = 1;
        myArray[4] = 8;
        myArray[5] = 2;
    }

    //method of insertion sort
    void insertionSort(){
        int temp;
        for(int i=0;i<myArray.length-1;i++){
            temp = myArray[i+1];
            for(int j=i;j>-1;j--){
                if(myArray[j]>temp) {
                    myArray[j + 1] = myArray[j];
                    myArray[j] = temp;
                    for(int k=0;k<myArray.length;k++){
                        System.out.print(myArray[k] + " -> ");
                    }
                    System.out.println();
                }
                else{
                    break;
                }
            }
        }
    }

    //creating main method to create object of class
    public static void main(String[] args){
        MyClass obj = new MyClass();
        obj.insertionSort();
    }
}
