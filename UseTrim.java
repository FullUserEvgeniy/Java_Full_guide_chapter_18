import java.io.*;

//Использование trim() для обработки команд
public class UseTrim {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Для завершения введите СТОП");
        System.out.println("Введите название штата: ");
        do {
            str = bufferedReader.readLine();
            str = str.trim();
            if (str.equalsIgnoreCase("Иллинойс")) System.out.println("Столица - Спрингфилд");
            else if (str.equalsIgnoreCase("Миссури")) System.out.println("Столица - Джеферсон-Сити");
            else if (str.equalsIgnoreCase("Калифорния")) System.out.println("Столица - Сокраменто");
            else if (str.equalsIgnoreCase("Вашингтон")) System.out.println("Столица - Олимпия");
        }while (!str.equalsIgnoreCase("СТОП"));
    }
}
/*
Для завершения введите СТОП
Введите название штата:
иллинойс
Столица - Спрингфилд
МиССури
Столица - Джеферсон-Сити
КаЛиФорния
Столица - Сокраменто
ВаШиНгТоН
Столица - Олимпия
стоп
 */