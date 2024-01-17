import java.io.*;
public class Two {
    public static void main(String[] args) throws IOException{
        BufferedReader brin = null;
        BufferedWriter brout = null;
        try {
            brin = new BufferedReader( new FileReader("D:\\MyFile1.txt" ), 1024);
            brout = new BufferedWriter( new FileWriter( "D:\\MyFile2.txt" ));
            int lineCount = 0;
            String s;
            while ((s = brin.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                brout.write(s);
                brout.newLine();}}
        catch (IOException e) {
            System.out.println("Ошибка !!!");}
        finally{
            brin.close();
            brout.flush();
            brout.close();}
    }
}