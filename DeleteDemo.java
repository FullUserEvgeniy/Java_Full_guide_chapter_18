// Демонстрация работы delete() и deleteCharAt()
public class DeleteDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Строка для тестирования");
        stringBuffer.delete(6, 10);
        System.out.println("После delete() = " + stringBuffer);
        stringBuffer.deleteCharAt(0);
        System.out.println("После deleteCharAt() = " + stringBuffer);
    }
}
/*
После delete() = Строка тестирования
После deleteCharAt() = трока тестирования
 */