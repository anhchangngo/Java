public class test {
    public static void main(String[] args) {
            System.out.println("test a");

            casioFX500 fx500 = new casioFX500();
            casioFX800 fx800 = new casioFX800();

            System.out.println("5 + 3 = " + fx500.add(5, 3));
            System.out.println("4 * 5 = " + fx500.multiply(4, 5));
            System.out.println("4 / 0 = " + fx800.divide(4, 0));

            System.out.println("test b");

            double[] arr1 = new double[] {5, 1, 3, 4, 5, 8, 0};
            double[] arr2 = new double[] {6, 2, 7, 9, 2, 4, 5};

            intersection_sort itx = new intersection_sort();
            selection_sort slx = new selection_sort();

            itx.increase_sort(arr1);
            for(int i = 0; i < arr1.length; i++){
                System.out.print(arr1[i] + " ");
            }

            System.out.println();
            
            slx.decrease_sort(arr2);
            for(int i = 0; i < arr2.length; i++){
                System.out.print(arr2[i] + " ");
            }

            System.out.println();

            System.out.println("test c");
            system sys = new system();

            System.out.println("3 + 5 = " + sys.add(3, 5));

            double[] arr3 = new double[] {3, 8, 1, 9, 0, 3, 6, 5};
            sys.increase_sort(arr3);
            for(int i = 0; i < arr3.length; i++){
                System.out.print(arr3[i] + " ");

            }
    }
}
