public class selection_sort implements sort {

    @Override
    public void increase_sort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_pos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_pos]) {
                    min_pos = j;
                }
            }
            double tmp = arr[i];
            arr[i] = arr[min_pos];
            arr[min_pos] = tmp;
        }
    }

    @Override
    public void decrease_sort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int max_pos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[max_pos]) {
                    max_pos = j;
                }
            }
            double tmp = arr[i];
            arr[i] = arr[max_pos];
            arr[max_pos] = tmp;
        }
    }
}
