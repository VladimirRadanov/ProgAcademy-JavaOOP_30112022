import java.io.File;

public class Main {
    public static void main(String[] args) {
        /*File file1 = new File("src/main/java/com/progacademy/lesson05/task03_fileCompare/files/file1");
        File file2 = new File("src/main/java/com/progacademy/lesson05/task03_fileCompare/files/file2");*/

        try {
            File file1 = FileCompare.getFileByPathParameter(args[0]);
            File file2 = FileCompare.getFileByPathParameter(args[1]);

            System.out.println(FileCompare.compareFilesByBytes(file1, file2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
