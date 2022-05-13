
import java.io.IOException;


public class Decoded {

    public static void decoded(String pathFile, int offset) throws IOException {
        Metods metods = new Metods();
        char[] buffer = metods.reader(pathFile);
        buffer = metods.offsetArray(buffer, offset * (-1));
        metods.writer(Main.DECRYPTED_PATH_FILE, buffer);
    }
}

