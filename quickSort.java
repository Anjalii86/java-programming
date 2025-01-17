public class quickSort {
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
        //swap with pivot
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
    
public static void quickSort(int[]arr,int low,int high){
    if(low<high){
        int p=partition(arr,low,high);
        quickSort(arr, low, p-1);
        quickSort(arr, p+1, high);

    }
}
public static void main(String[] args) {
    int arr[]={5,45,67,23,14,43};
    int n=arr.length;
    quickSort(arr, 0, n-1);
    //print
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    
}

}

