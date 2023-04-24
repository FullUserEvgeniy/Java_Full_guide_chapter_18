// методы equals() и equalsIgnoreCase()
public class EqualsDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Good-bye";
        String s4 = "HELLO";
        System.out.println("Сравнение строк s1 и s2 с помощью метода equals() - " + s1.equals(s2));
        System.out.println("Сравнение строк s1 и s3 с помощью метода equals() - " + s1.equals(s3));
        System.out.println("Сравнение строк s1 и s4 с помощью метода equals() - " + s1.equals(s4));
        System.out.println("Сравнение строк s1 и s4 с помощью метода equalsIgnoreCase() - " + s1.equalsIgnoreCase(s4));
    }
}
/*
Сравнение строк s1 и s2 с помощью метода equals() - true
Сравнение строк s1 и s3 с помощью метода equals() - false
Сравнение строк s1 и s4 с помощью метода equals() - false
Сравнение строк s1 и s4 с помощью метода equalsIgnoreCase() - true
 */