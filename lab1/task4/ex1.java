public class ex1 {
    public static void main(String[] args){
    int a = 3;
    int b = 5;
    int t = a;
    b = t;
    a = b;

    System.out.println(a);
    System.out.println(b);
    System.out.println(t);
}
}

// sets a, b, and t equal to the original value of a