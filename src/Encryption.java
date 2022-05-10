import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Encryption {
 private static final String charsToString = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя" +
         "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ" +
         ".,”:-!? ";
 static char[] chars = charsToString.toCharArray();

public static void encryption(String pathFile, int offset) throws IOException {
  String dest = "C:\\Users\\Алексей\\Desktop\\JavaRush проект\\Зашифровано.txt";
  FileReader reader = new FileReader(pathFile);
  FileWriter writer = new FileWriter(dest);
  StringBuilder sb = new StringBuilder();
    for (int data = reader.read(); data != -1; data = reader.read()) {
        sb.append((char)data);}

    String text = sb.toString();
   // System.out.println(text);
    char[] buffer = text.toCharArray();

  for (int i = 0; i < buffer.length; i++) {
   for (int j = 0; j < chars.length; j++) {
   if (buffer[i]==chars[j]){
    if ((j + offset) > (chars.length - 1)){
     buffer[i] = chars[offset-(chars.length-1)+j-1];
        break;}
   else buffer[i] = chars[j + offset];
   break;}
   }
  }
  String text1 = new String(buffer);
  // System.out.print(text1);
   writer.write(text1);
  reader.close();
  writer.close();
}
}