import java.io.IOException;

public class Main {
            public static void main(String[] args) throws IOException {
                int offset = 5;
                String pathFileEncryption = "C:\\Users\\Алексей\\Desktop\\JavaRush проект\\НужноЗашифровать.txt";
                String pathFileDecoded = "C:\\Users\\Алексей\\Desktop\\JavaRush проект\\Зашифровано.txt";
                Encryption.encryption(pathFileEncryption,offset);
                Decoded.decoded(pathFileDecoded,offset);}
            }




