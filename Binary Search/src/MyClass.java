public class MyClass {
    void binarySearch(int[] myArray,int data){
        int start = 0;
        int end = myArray.length-1;
        int flag=0;

        while(start<=end) {
            int mid = (start + end) / 2;
            if (data == myArray[mid]) {
                System.out.println("Data found at Index : " + mid);
                flag=1;
                break;
            } else if (data < myArray[mid]) {
                end = mid - 1;
            } else if (data > myArray[mid]) {
                start = mid + 1;
            }
        }
        if(flag==0){
            System.out.println("Data not in List");
        }
    }
    public static void main(String[] args){
        MyClass obj = new MyClass();
        int[] myArray = {15,20,30,35,40,50};
        obj.binarySearch(myArray,40);
        obj.binarySearch(myArray,10);
    }
}
