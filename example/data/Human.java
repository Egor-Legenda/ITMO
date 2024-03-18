package Egor.example.data;
import java.time.LocalDateTime;
public class Human {
    private java.time.LocalDateTime birthday;

    public Human(java.time.LocalDateTime birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Human{" +
                "birthday=" + birthday +
                '}';
    }
}