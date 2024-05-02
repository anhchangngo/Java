public class ex4 {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if(!(a < b) && !(a > b)){
            System.out.println("a == b");
        }
        else {
            System.out.println("a != b");
        }
    }
}

// Use : java ex4 3 5 
// output : a != b