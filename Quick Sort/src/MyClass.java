public class MyClass {
    //method to partition array
    int partition(int[] arr,int lb, int ub){

        int pivot = arr[lb];
        int start = lb;
        int end = ub;
        int temp;

        while(start<end){
            while(arr[start]<=pivot){
                start++;
            }

            while(arr[end]>pivot){
                end--;
            }

            if(start<end){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

        arr[lb] = arr[end];
        arr[end] = pivot;
        return end;
    }

    //method to quickSort the array
    void quickSort(int arr[],int lb,int ub){
        if(lb<ub){
            int pos = partition(arr,lb,ub);
            quickSort(arr,lb,pos-1);
            quickSort(arr,pos+1,ub);
        }
    }

    //main method to create object of class
    public static void main(String[] args){
        MyClass obj = new MyClass();
        int[] arr = {35,82,11,74,23,21,89};
        obj.quickSort(arr,0,arr.length-1);  //calling quickSort method
        System.out.print("Sorted Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
