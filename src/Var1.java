import java.io.*;
import java.util.Scanner;
public class Var1 {
    public static boolean sogl(final String word) {
        if (word == null || word.isBlank()) {
            return false;}
        boolean startsWith = false;
        switch (word.toLowerCase().charAt(0)) {
            case 'а':
            case 'е':
            case 'ё':
            case 'и':
            case 'о':
            case 'у':
            case 'ы':
            case 'э':
            case 'я':
            case 'ю':
                startsWith = true;
                break;
            default:
                break;}
        return startsWith;
    }

    public static void main(String[]args) throws IOException {
        Scanner sc = new Scanner(System.in);
        InputStream in = null;
        Reader file = null;
        BufferedReader bufread = null;
        OutputStream out = null;
        Writer writer = null;
        try {
            in = new FileInputStream("C:\\Java\\in.txt");
            file = new InputStreamReader(in, "utf-8");
            bufread = new BufferedReader(file);
            File f2 = new File("C:\\Java\\out.txt");
            f2.createNewFile();
            out = new FileOutputStream(f2);
            writer = new OutputStreamWriter(out, "utf-8");
            if (f2.exists()) {
                String line = " ";
                String[] words;
                while ((line = bufread.readLine()) != null) {
                    words = line.split(" ");
                    for (int i = 0; i < words.length; i++) {
                        if (sogl(words[i])) {
                            writer.append(words[i] + " ");}
                    }
                    writer.append("\n");}
            }
        }
        catch (IOException e) {
            System.out.println("Ошибка: " + e);}
        finally {
            in.close();
            file.close();
            bufread.close();
            writer.flush();
            writer.close();
            out.close()}
    }
}