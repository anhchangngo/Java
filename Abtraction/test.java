public class test {
    public static void main(String[] args) {
        coordinates c1 = new coordinates(5, 5);
        coordinates c2 = new coordinates(7, 9);
        coordinates c3 = new coordinates(12, 1);

        // shape s1 = new shape(c1); lớp trừu tượng k tổn tại, k thể gọi constructor cua no dc

        shape s1 = new point(c1);
        shape s2 = new circle(c2, 10);
        shape s3 = new rectangle(c3, 5, 10);

        System.out.println("AREA 1 : " + s1.calculateArea());
        System.out.println("AREA 2 : " + s2.calculateArea());
        System.out.println("AREA 3 : " + s3.calculateArea());
    }
}
