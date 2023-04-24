// создание объекта String
public class MakeString {
    public static void main(String[] args) {
        char[]chars = {'J', 'a', 'v', 'a'};
        byte[]bytes = {65, 66, 67, 68, 69, 70};
        String str1 = new String(chars); //создание строки из массива символов
        String str2 = new String(str1); //создание строки из объекта String
        String str3 = new String(chars, 2,2); //создание строки из выборки массива символов
        String str5 = "ABCDEF"; //создание строки с помощью строкового литерала ""
        String str4 = new String(bytes); //создание строки из массива byte[]
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str4.length());
        System.out.println(str5);
        System.out.println("Ему " + 9 + " лет"); //конкатенация строк оператор + и преобразование типа int в строку
    }
}
/*
Java
Java
va
ABCDEF
6
ABCDEF
Ему 9 лет
 */