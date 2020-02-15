import java.io.File;
import java.io.IOException;

public class PrintDirTree {

    public static void main(String[] args) {
        printDirTree(new File("/home/project/"), "");
    }

    public static void printDirTree(File file, String s) {
        if (file.isDirectory()) {
            File[] files;
            System.out.println(s + file.getName());
            if ((files = file.listFiles()) != null) {
                s = s + "   ";
                for (File file1 : files) {
                    printDirTree(file1, s);
                }
            }
        } else {
            System.out.println(s + file.getName());
        }
    }
}