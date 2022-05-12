import java.io.IOException;
import java.lang.reflect.Method;

public class Encryption {

    public static void encryption(String pathFile, int offset) throws IOException {
        char[] buffer = Metods.reader(pathFile);
        buffer = Metods.offsetArray(buffer, offset);
        Metods.writer(Main.ENCRYPTED_PATH_FILE, buffer);
    }

}