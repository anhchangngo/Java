public class test {
    public static void main(String[] args) {
        animal a1 = new animal();
        dog d1 = new dog();
        animal poly = new dog();

        a1.animalSound(); // chi co 1 phuong thuc 

        d1.move();
        d1.animalSound();

        poly.animalSound();
        // poly gọi đến animalSound() là compile-time
        // ta chạy chương trình sẽ là runtime chỉ đến phương thức mà nó đang tham chiếu đến 
        // animalSound() của dog class, kiểu dữ liệu vẫn là animal
        // cùng method nhưng giá trị của nó khác nhau
    }
}
