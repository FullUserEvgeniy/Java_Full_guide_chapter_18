// Демонст рация и споль зов ания replace()
public class ReplaceDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Строка для тестирования");
        stringBuffer.replace(7, 10, "для целей");
        System.out.println(stringBuffer);
    }
}
/*
Строка для целей тестирования
 */