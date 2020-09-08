package PrintOutStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderSample {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn=new FileInputStream("C:\\Users\\Administrator\\Desktop\\fileIn.txt");
            int data;
            while((data=fileIn.read())!=-1){
                System.out.println(data+"");
            }
            fileIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
