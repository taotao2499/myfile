package fileDemo;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        File file = new File("myfile");
        boolean b = haveAVI(file);
        System.out.println(b);

    }
    public  static   boolean haveAVI(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".avi")){

                return true;
            }
        }
        return false;

    }
}
