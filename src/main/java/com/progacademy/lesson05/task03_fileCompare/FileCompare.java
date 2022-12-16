import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileCompare {

    public static boolean compareFilesByBytes(File file1, File file2) throws IOException, FileNotFoundException {
        if (!file1.exists() || !file1.isFile()) throw new FileNotFoundException("File 1 not found");
        if (!file2.exists() || !file2.isFile()) throw new FileNotFoundException("File 2 not found");

        if (file1.length() != file2.length()) return false;

        byte[] bytes1, bytes2 = new byte[(int) file1.length()];

        try {
            bytes1 = new FileInputStream(file1).readAllBytes();
            bytes2 = new FileInputStream(file2).readAllBytes();
        } catch (IOException e) {
            throw new IOException("Files can't be read");
        }

        for (int i=0; i< bytes1.length; i++){
            if (bytes1[i] != bytes2[i]) return false;
        }

        return true;
    }

    public static File getFileByPathParameter(String path) throws FileNotFoundException {
        File file = new File(path);
        if (!file.isFile() || !file.exists()) throw new FileNotFoundException("File not found by path: " + path);
        return file;
    }

}
