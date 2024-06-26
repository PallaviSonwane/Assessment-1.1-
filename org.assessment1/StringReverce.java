import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StringReverce {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw=null;
        String input="D:\\assisment1\\input.txt";
        String output="D:\\assisment1\\output.txt";

        try {
           // File f = new File("D:\\assisment1\\input.txt");
            FileReader fr = new FileReader(new File(input)); // read data single character
            br = new BufferedReader(fr); // read data line by line
            
            bw=new BufferedWriter(new FileWriter(output));

            String data; // hello good morning
            while ((data = br.readLine()) != null) {

                String s[] = data.split(" ");
                for (int i = 0; i < s.length; i++) {
                    char s1[] = s[i].toCharArray(); // H e l l o
                    for (int j = 0; j < s1.length / 2; j++) {
                        if (Character.isLetter(s1[j])) {
                            char ch = s1[j];
                            s1[j] = s1[s1.length - j - 1];
                            s1[s1.length - j - 1] = ch;
                        }
                    }
                    String s2 = new String(s1); // olleH
                    bw.write(s2);
                    bw.write(" ");
               
                }
                bw.newLine();
            }
        } catch (Exception ex) {
            System.out.println("error is" + ex);
        } finally {
            br.close();
            bw.flush();
        }

    }
}
