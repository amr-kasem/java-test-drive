import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class FilesExample{
    public static void main(String args[]) throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bfreader = new BufferedReader(reader);
        String input = "";
        String data = "";
        File f = new File("data.txt");
        do{
            System.out.print("input data: ");
            input = bfreader.readLine();
            System.out.println("data is: "+input);
            data += input+"\n\r";
        }while(!input.equals("stop"));
        if(!f.exists()){
            f.createNewFile();
        }
        FileWriter fw = new FileWriter(f);
        fw.write(data);
        fw.close();
    }
}