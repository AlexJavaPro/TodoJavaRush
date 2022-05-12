import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class Bruteforce {
    static char[] chars = Main.CHAR_TO_STRING.toCharArray();
    static String str= "ёёёщыёёуйэгъкщщфщзэщщкгщщпщтщшщгщмфщщлщддщьэчцвйёцёэёайашяшыёейёгюхяйыцягьсйхюхёёиёояёёяёьёэъжэёъдцёуьщччйшйшзыфжщжшжцыъыэыюыьжйыыжъжыъшпйъщзщъчъцъуъфъхъъъыыожязйъьъэыанйеьцйьйьльрпъеыеъьашъёыёъътщсоькъоыщхщщщъщцкйоъцщлъмйшщцьцъщййьъгиъъбъвъиъйъпъръсъоънъкълъмиыиьйущэйыйъщыщющяъамъйййжьугйэъуъаьчъхйтйчщръюъфъуыаъюьаыюыэьэыбйяььыьььъяъяыхщдйфй";


    public static void decoded(String pathFile) throws IOException {
        String dest = "C:\\Users\\Алексей\\Desktop\\JavaRush проект\\РасшифрованоМетодомПодбора.txt";
        FileReader reader = new FileReader(pathFile);
        FileWriter writer = new FileWriter(dest);
        StringBuilder sb = new StringBuilder();
        for (int data = reader.read(); data != -1; data = reader.read()) {
            sb.append((char) data);
        }
        String text = sb.toString();
        System.out.println(text);
        char[] buffer = text.toCharArray();
        int offset = 0;
        String offsetText = new String();
        boolean isExit = false;
        while(!isExit){
            isExit = true;
            offset++;
            for (int i = 0; i < buffer.length; i++) {
                for (int j = 0; j < chars.length; j++) {
                    if (buffer[i] == chars[j]) {
                        if (j - offset < 0) {
                            buffer[i] = chars[chars.length + j - offset];
                            break;
                        } else buffer[i] = chars[j - offset];
                        break;
                    }}}
            for (int i = 0; i < buffer.length-1; i++) {
                 offsetText = new String(buffer);
                for (int j = 0; j < str.length(); j+=2) {
                    if(offsetText.regionMatches(true,i, str, j, 2)){
                        isExit = false;
                    }
                }
            }
        }
        writer.write(offsetText);
        reader.close();
        writer.close();
        System.out.println(offsetText);
        }
    }
