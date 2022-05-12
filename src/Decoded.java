
import java.io.IOException;

public class Decoded {

    public static void decoded(String pathFile, int offset) throws IOException {
        char[] buffer = Metods.reader(pathFile);
        buffer = Metods.offsetArray(buffer, offset * (-1));
        Metods.writer(Main.DECRYPTED_PATH_FILE, buffer);
    }
}

