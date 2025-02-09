package lesson7;

import java.io.*;
import java.util.*;

public class FileScanner {
    static Scanner fileScanner(String fileName) {
        Scanner value = null;
        try {
            value = new Scanner(new File(fileName));
            value.useDelimiter("[^A-Za-z]+"); // 英字以外を区切りとする
        } catch (FileNotFoundException e) {
            System.err.println("ファイル" + fileName + "は存在しません。");
            System.exit(1);
        }
        return value;
    }
}
