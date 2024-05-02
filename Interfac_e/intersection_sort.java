public class intersection_sort implements sort {

    @Override
    public void increase_sort(double[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            // lay ra phan tu chi so i
            double x = arr[i];
            int pos = i - 1;
            while(pos >= 0 && x < arr[pos]){ // vi tri hien tai nam trong mang va < dg xet
                arr[pos + 1] = arr[pos];
                --pos; // xet vi tri phan tu truoc pos
            }
            arr[pos + 1] = x; // x > hon tren sau vi tri hien tai
            }
    }

    @Override
    public void decrease_sort(double[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            double x = arr[i];
            int pos = i - 1;
            while (pos >= 0 && x > arr[pos]) {
                arr[pos + 1] = arr[pos];
                pos--;
            }
            arr[pos + 1] = x;
        }
    }
}
