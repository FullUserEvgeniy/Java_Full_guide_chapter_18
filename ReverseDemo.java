// Использование метода reverse()
public class ReverseDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("ABCDEFG");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
/*
ABCDEFG
GFEDCBA
 */