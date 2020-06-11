package internetOpreation;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 网页获取
 */
public class GetWebPage {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.baidu.com/");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data.html"));
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            reader.close();
            bufferedWriter.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
