import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Metods {
    public static char[] reader(String pathFile) throws IOException {
        FileReader reader = new FileReader(pathFile);
        StringBuilder sb = new StringBuilder();
        for (int data = reader.read(); data != -1; data = reader.read()) {
            sb.append((char) data);
        }
        reader.close();
        String text = sb.toString();
        char[] buffer = text.toCharArray();
        return buffer;
    }

    public static void writer(String pathFile, char[] buffer) throws IOException {
        FileWriter writer = new FileWriter(pathFile);
        String text1 = new String(buffer);
        writer.write(text1);
        writer.close();
    }

    public static char[] offsetArray(char[] buffer, int offset) {
        for (int i = 0; i < buffer.length; i++) {
            for (int j = 0; j < Main.CHARS_CODE.length; j++) {
                if (buffer[i] == Main.CHARS_CODE[j]) {
                    if ((j + offset) > (Main.CHARS_CODE.length - 1)) {
                        buffer[i] = Main.CHARS_CODE[offset - (Main.CHARS_CODE.length - 1) + j - 1];
                        break;
                    } else if (j + offset < 0) {
                        buffer[i] = Main.CHARS_CODE[Main.CHARS_CODE.length + j + offset];
                        break;
                    } else buffer[i] = Main.CHARS_CODE[j + offset];
                    break;
                }

            }
        }
        return buffer;
    }

}




