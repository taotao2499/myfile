package fileDemo;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {

        findAVI();
    }
    public static void findAVI() {
        File[] arr = File.listRoots();
        for (File f : arr) {
            findAVI(f);
        }
    }
    public static void findAVI(File src){
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()){
                String name = file.getName();
                if (name.endsWith(".avi")){
                    System.out.println(file);
                }
            }else {
                findAVI(file);
            }
        }

    }
}
