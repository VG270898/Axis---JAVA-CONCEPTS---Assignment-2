public class MyClass {

    void linearSearch(int[] myArray,int data){
        int flag=0;
        for(int i=0;i< myArray.length;i++){
            if(data == myArray[i]) {
                System.out.println("Data found at index : " + i);
                flag = 1;
            }
        }

        if(flag==0){
            System.out.println("Data not in Array");
        }
    }

    public static void main(String[] args){
        MyClass obj = new MyClass();
        int[] myArray = {30,54,12,66,49,66};
        obj.linearSearch(myArray,66);
        obj.linearSearch(myArray,10);
    }
}
