//Использование методов indexOf() и lastIndexOf()
public class IndexOfDemo1 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("one two one");
        int i;
        i = stringBuffer.indexOf("one");
        System.out.println("Индекс первого вхождения: " + i);
        i = stringBuffer.lastIndexOf("one");
        System.out.println("Индекс последнего вхождения: " + i);
    }
}
/*
Индекс первого вхождения: 0
Индекс последнего вхождения: 8
 */