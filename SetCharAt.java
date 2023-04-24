//Демонстрация работы методов charAt() и setCharAt()
public class SetCharAt {
    public static void main(String[] args) {
        StringBuffer stringBuffer1 = new StringBuffer("Hello");
        System.out.println("Буфер до = " + stringBuffer1);
        System.out.println("charAt(1) до = " + stringBuffer1.charAt(1));
        stringBuffer1.setCharAt(1, 'i');
        stringBuffer1.setLength(2);
        System.out.println("Буфер после = " + stringBuffer1);
        System.out.println("charAt(1) после = " + stringBuffer1.charAt(1));
    }
}
/*
Буфер до = Hello
charAt(1) до = e
Буфер после = Hi
charAt(1) после = i
 */