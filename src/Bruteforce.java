import java.io.IOException;

public class Bruteforce {
    public static void decoded(String pathFile) throws IOException {
        Metods met = new Metods();
        char[] buffer = met.reader(pathFile);
        char[] buffer1;
        int offset = 0;
        String offsetText;
        boolean isExit = false;
        while(!isExit){
            isExit = true;
            offset++;
            if(offset>Main.CHARS_CODE.length*2)
                break;
            if(offset<Main.CHARS_CODE.length){
             buffer1 = met.offsetArray(buffer,offset*(-1));}
            else  {
                int shift = offset%Main.CHARS_CODE.length;
                buffer1 = met.offsetArray(buffer,shift);}
            for (int i = 0; i < buffer1.length-1; i++) {
                offsetText = new String(buffer1);
                for (int j = 0; j < Main.LETTERS.length()-1; j+=2) {
                    if (offsetText.regionMatches(true, i, Main.LETTERS, j, 2)) {
                        isExit = false;
                        break;
                    }
                }
            }
        }

        if(offset>=Main.CHARS_CODE.length*2-2)
            System.out.println("Не удалось подобрать ключ методом Brute Force");
      else {
            met.writer(Main.DECRYPTED_PATH_FILE_BF, buffer);
            System.out.println("Путь к расшифрованному файлу методом BruteForce: " + Main.DECRYPTED_PATH_FILE_BF);
        }
    }}
