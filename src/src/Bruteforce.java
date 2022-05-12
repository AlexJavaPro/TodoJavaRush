import java.io.IOException;

public class Bruteforce {


    public static void decoded(String pathFile) throws IOException {
        char[] buffer = Metods.reader(pathFile);


        int offset = 0;
        String offsetText = new String();
        boolean isExit = false;
        while(!isExit){
            isExit = true;
            offset++;
            for (int i = 0; i < buffer.length; i++) {
                for (int j = 0; j < Main.CHARS_CODE.length; j++) {
                    if (buffer[i] == Main.CHARS_CODE[j]) {
                        if (j - offset < 0) {
                            buffer[i] = Main.CHARS_CODE[Main.CHARS_CODE.length + j - offset];
                            break;
                        } else buffer[i] = Main.CHARS_CODE[j - offset];
                        break;
                    }}}
            for (int i = 0; i < buffer.length-1; i++) {
                 offsetText = new String(buffer);
                for (int j = 0; j < Main.LETTERS.length(); j+=2) {
                    if(offsetText.regionMatches(true,i, Main.LETTERS, j, 2)){
                        isExit = false;
                    }
                }
            }
        }
        Metods.writer(Main.DECRYPTED_PATH_FILE_BF, buffer);
        }
    }
