package ch3.javaIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        String currentPath = System.getProperty("user.dir");

        try {

            InputStream in = new BufferedInputStream(new FileInputStream(currentPath + "/ch3/javaIO/assets/test.txt"));

            in = new ReverseCaseInputStream(in);
            // in = new LowerCaseInputStream(in);
            // in = new UpperCaseInputStream(in);

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
