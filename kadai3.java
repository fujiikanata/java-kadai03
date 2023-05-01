import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedWriter;
//import java.nio.file.StandardOpenOption;

public class kadai3 {
    public static void main(String[] args) {
        String[][] data = new String [6][4];
        try(BufferedWriter writer = Files.newBufferedWriter(
        Paths.get(".", "kadai3", "scores2.csv"), 
            StandardCharsets.UTF_8) 
            ){try(
                BufferedReader r = Files.newBufferedReader(
                    Paths.get(".", "kadai3", "scores.csv"),
                    StandardCharsets.UTF_8))
                    {
                String line = r.readLine();
                for(int j=0; j<=5; j++){
                    data[j] = line.split(",");
                    line = r.readLine();
                }
        }
        for(int i=0; i<=3; i++){
            writer.write(data[0][i] + ",");
        }
            writer.newLine();
        for(int i=0; i<=3; i++){
            writer.write(data[4][i] + ",");
        }
            writer.newLine();
        for(int i=0; i<=3; i++){
            writer.write(data[2][i] + ",");
        }
            writer.newLine();
        for(int i=0; i<=3; i++){
            writer.write(data[5][i] + ",");
        }
            writer.newLine();
        for(int i=0; i<=3; i++){
            writer.write(data[3][i] + ",");
        }
            writer.newLine();
        for(int i=0; i<=3; i++){
            writer.write(data[1][i] + ",");
        }
    }catch(IOException e) {
        e.printStackTrace();}
            try(
            BufferedReader r2 = Files.newBufferedReader(
                Paths.get(".", "kadai3", "scores2.csv"),
                StandardCharsets.UTF_8)){
                    String line2;
                    while((line2 = r2.readLine())!= null) {
                        System.out.println(line2);
                    }
                }catch(IOException ex) {
                    ex.printStackTrace();
                }
            }
        }