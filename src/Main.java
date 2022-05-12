import java.io.IOException;

public class Main {
    public static final String CHAR_TO_STRING = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя" +
            "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ" +
            ".,”:-!? ";

    public static int getOffset() {
        return offset;
    }

    public static void setOffset(int offset) {
        if (offset > 0 && offset <= CHAR_TO_STRING.length())
            Main.offset = offset;
    }

    private static int offset;

    public static void main(String[] args) throws IOException {
        setOffset(5);
        String pathFileEncryption = "C:\\Users\\Алексей\\Desktop\\JavaRush проект\\НужноЗашифровать.txt";
        String pathFileDecoded = "C:\\Users\\Алексей\\Desktop\\JavaRush проект\\Зашифровано.txt";
       Encryption.encryption(pathFileEncryption, getOffset());
       Decoded.decoded(pathFileDecoded, getOffset());
        Bruteforce.decoded(pathFileDecoded);
    }
}




