public class MinArr {
   public static int minvalue(int arr[]){
       int min = arr[0];
       for (int i = 0; i < arr.length; i++) {
           if (min>arr[i]){
               min= arr[i];
           }
       }return min;
   }

    public static void main(String[] args) {
        int arr[] ={ 1, 3, -5, 9, 12, 29, -4};
        int index = minvalue(arr);
        System.out.println(index);
    }
}
