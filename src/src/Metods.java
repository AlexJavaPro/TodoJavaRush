import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Metods {
    public static char[] reader (String pathFile) throws IOException {
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

    public static void writer (String pathFile, char[] buffer) throws IOException {
        FileWriter writer = new FileWriter(pathFile);
        String text1 = new String(buffer);
        writer.write(text1);
        writer.close();
        }







}
