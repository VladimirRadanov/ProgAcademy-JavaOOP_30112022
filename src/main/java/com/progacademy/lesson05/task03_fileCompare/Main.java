import java.io.File;

public class Main {
    public static void main(String[] args) {
        /*File file1 = new File("./files/file1");
        File file2 = new File("./files/file2");*/

        File file1;
        File file2;
        try {
            file1 = FileCompare.getFileByPathParameter(args[0]);
            file2 = FileCompare.getFileByPathParameter(args[1]);
            System.out.println(FileCompare.compareFilesByBytes(file1, file2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
