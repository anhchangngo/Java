public class test {
    public static void main(String[] args) {
        String arr[][] = {{"a", "b"}, {"c", "d", "e"}, {"f", "g"}};

        System.out.println("Element [1][2] : " + arr[0][1]);
        
        for(String[] r : arr){
            for(String c : r){
                System.out.println(c);
            }
        }
    }
}
