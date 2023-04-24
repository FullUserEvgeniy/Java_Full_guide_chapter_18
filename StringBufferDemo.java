// Демонстрация длины и емкости объекта StringBuffer
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer1 = new StringBuffer("Hello");
        System.out.println("Буфер - " + stringBuffer1);
        System.out.println("Длина - " + stringBuffer1.length());
        System.out.println("Емкость - " + stringBuffer1.capacity());
    }
}
/*
Буфер - Hello
Длина - 5
Емкость - 21
 */