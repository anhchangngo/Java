import java.io.Serializable;

public class Cow implements Serializable {
    boolean hasMilk;
    String breed;
    public Cow(boolean m, String b){
        hasMilk = m;
        breed = b;
    }
}

/*
Giao diện Serializable là một giao diện đặc biệt trong Java, được sử dụng để 
đánh dấu đối tượng có thể được chuyển đổi thành một dạng dữ liệu tuần tự (serialized) 
và có thể được tái tạo lại từ dạng tuần tự đó (deserialized).

Việc triển khai giao diện Serializable cho lớp Cow cho phép chúng ta tuần tự hóa 
(serialize) và phục hồi (deserialize) các đối tượng Cow. Điều này có thể hữu ích khi 
chúng ta muốn lưu trữ đối tượng Cow vào một tập tin hoặc truyền đối tượng Cow qua mạng.
 */