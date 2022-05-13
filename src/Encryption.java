import java.io.IOException;
import java.lang.reflect.Method;

public class Encryption {

    public static void encryption(String pathFile, int offset) throws IOException {
        Metods metod = new Metods();
        char[] buffer = metod.reader(pathFile);
        buffer = metod.offsetArray(buffer, offset);
        metod.writer(Main.ENCRYPTED_PATH_FILE, buffer);
    }

}