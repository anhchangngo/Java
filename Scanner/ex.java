import java.util.Scanner;

// nhập từ bàn phím System.in

public class ex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();  // nhap chuoi tu ban phim

        System.out.println("Enter student id");
        long id = sc.nextLong();  // nhap so nguyen lon tu ban phim

        System.out.println("Enter marks");
        float marks = sc.nextFloat();  // nhap so thuc tu ban phim

        System.out.println("---------------------");
        System.out.println("Name " + name);
        System.out.println("Id " + id);
        System.out.println("Marks " + marks);
    }
}
