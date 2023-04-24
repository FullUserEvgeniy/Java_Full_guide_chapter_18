// Демонстрация исполь зования insert()
public class InsertDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Мне Java!");
        stringBuffer.insert(4, "нравится ");
        System.out.println(stringBuffer);
    }
}
/*
Мне нравится Java!
 */