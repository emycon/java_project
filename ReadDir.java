import java.io.File;

/**
 * ReadDir
 */
public class ReadDir {
    public static void main(String[] args) {
        readDir(new File("/home/project"));
    }

    static void readDir(File file) {
        if (file==null) {
            return;
        }

        if (file.isDirectory()) {
            File[] files;
            if ((files = file.listFiles()) != null) {
                for (File file1 : files) {
                    readDir(file1);
                }
            }
        } else {
            System.out.println(file.getName());
        }
    }
}