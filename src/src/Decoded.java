
import java.io.IOException;

public class Decoded {
    
    public static void decoded(String pathFile, int offset) throws IOException {
        char[] buffer = Metods.reader(pathFile);

        for (int i = 0; i < buffer.length; i++) {
            for (int j = 0; j < Main.CHARS_CODE.length; j++) {
                if (buffer[i] == Main.CHARS_CODE[j]) {
                    if (j - offset < 0) {
                        buffer[i] = Main.CHARS_CODE[Main.CHARS_CODE.length + j - offset];
                        break;
                    } else buffer[i] = Main.CHARS_CODE[j - offset];
                    break;
                }
            }
        }
        Metods.writer(Main.DECRYPTED_PATH_FILE, buffer);
    }
}

