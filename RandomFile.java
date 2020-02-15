import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RandomFile {
    public static void main(String[] args) {
        RandomAccessFile file;
        try {
            File d = new File("./randomAccess.file");
            file = new RandomAccessFile(d, "rw");
            file.seek(10);
            byte[] b = new byte[(int) file.length()-10];
            file.read(b);
            System.out.println(new String(b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}