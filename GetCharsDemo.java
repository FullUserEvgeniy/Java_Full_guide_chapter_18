// работа с символами строки
public class GetCharsDemo {
    public static void main(String[] args) {
        String str1 = "A string to demonstrate how the GetChars() method works";
        char result = str1.charAt(15); // вернуть символ с индексом 15 во внутреннем массиве объекта str1
        int start = 12;
        int end = 16;
        char[] buffer = new char[end - start]; // массив для возврата символов строки с индексом от 12 по 15 ( индексация с 0)
        byte b = str1.getBytes()[15]; // вернуть число  byte по индексу символа во внутреннем массиве строки
        str1.getChars(start, end, buffer, 0); // вернуть массив последовательных символов от 12 до 15 (16 конечный символ)
        System.out.println(buffer);
        System.out.println(result);
        System.out.println(b);
    }
}
/*
demo
o
111
 */