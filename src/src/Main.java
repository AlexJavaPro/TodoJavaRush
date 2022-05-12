import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final String CHAR_TO_STRING = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя" +
            "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ" +
            ".,”:-!? ";
    public static final char[] CHARS_CODE = Main.CHAR_TO_STRING.toCharArray();
    public static final String PATH_FILE = "C:\\Users\\Алексей\\Desktop\\JavaRush проект\\НужноЗашифровать.txt";
    public static final String ENCRYPTED_PATH_FILE = "C:\\Users\\Алексей\\Desktop\\JavaRush проект\\Зашифровано.txt";
    public static final String DECRYPTED_PATH_FILE =  "C:\\Users\\Алексей\\Desktop\\JavaRush проект\\Расшифровано.txt";
    public static final String DECRYPTED_PATH_FILE_BF =  "C:\\Users\\Алексей\\Desktop\\JavaRush проект\\РасшифрованоМетодомПодбора.txt";
    public static final String LETTERS = "ёёёщыёёуйэгъкщщфщзэщщкгщщпщтщшщгщмфщщлщддщьэчцвйёцёэёайашяшыёейёгюхяйыцягьсйхюхёёиёояёёяёьёэъжэёъдцёуьщччйшйшзыфжщжшжцыъыэыюыьжйыыжъжыъшпйъщзщъчъцъуъфъхъъъыыожязйъьъэыанйеьцйьйьльрпъеыеъьашъёыёъътщсоькъоыщхщщщъщцкйоъцщлъмйшщцьцъщййьъгиъъбъвъиъйъпъръсъоънъкълъмиыиьйущэйыйъщыщющяъамъйййжьугйэъуъаьчъхйтйчщръюъфъуыаъюьаыюыэьэыбйяььыьььъяъяыхщдйфй";



    public static void main(String[] args) throws IOException {
        int offset;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет");
        System.out.println("Зашифруем текст?");
        System.out.println("Путь к файлу который нужно зашифровать: " + PATH_FILE);
        while (true)
        {
            System.out.println("Укажи на сколько знаков сместить символы: ");
            System.out.println("Число от 1 до " + CHARS_CODE.length);
            String line = scanner.nextLine();
            try
            {offset = Integer.parseInt(line);
                if(offset>0&&offset<CHARS_CODE.length)
                    break;

            }
            catch (NumberFormatException e)
            {System.out.println("Это вообще не число");
            }
        }
        Encryption.encryption(PATH_FILE, offset);
        System.out.println("Путь к зашифрованному файлу: " + ENCRYPTED_PATH_FILE);
        System.out.println("Расшифруем?");
        System.out.println("Ваш ключ " + offset);
        Decoded.decoded(ENCRYPTED_PATH_FILE,offset);
        System.out.println("Путь к расшифрованному файлу: " + DECRYPTED_PATH_FILE);
        Bruteforce.decoded(DECRYPTED_PATH_FILE_BF);
        System.out.println("Путь к расшифрованному файлу методом BruteFirce: " + DECRYPTED_PATH_FILE_BF);
    }
}




