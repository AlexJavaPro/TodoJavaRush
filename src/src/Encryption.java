import java.io.IOException;
public class Encryption {

    

    public static void encryption(String pathFile, int offset) throws IOException {
       char[] buffer = Metods.reader(pathFile);

        for (int i = 0; i < buffer.length; i++) {
            for (int j = 0; j < Main.CHARS_CODE.length; j++) {
                if (buffer[i] == Main.CHARS_CODE[j]) {
                    if ((j + offset) > (Main.CHARS_CODE.length - 1)) {
                        buffer[i] = Main.CHARS_CODE[offset - (Main.CHARS_CODE.length - 1) + j - 1];
                        break;
                    } else buffer[i] = Main.CHARS_CODE[j + offset];
                    break;
                }
            }
        }
       Metods.writer(Main.ENCRYPTED_PATH_FILE, buffer);
    }

}