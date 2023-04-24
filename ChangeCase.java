//Демонстрация использования toUpperCase() и toLowerCase()
public class ChangeCase {
    public static void main(String[] args) {
        String test = "This is a test";
        String upper = test.toUpperCase();
        String lower = test.toLowerCase();
        System.out.println(test);
        System.out.println(upper);
        System.out.println(lower);
    }
}
/*
This is a test
THIS IS A TEST
this is a test
 */