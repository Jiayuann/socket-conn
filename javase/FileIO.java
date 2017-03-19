import java.util.*;
import java.io.*;
public class FileIO{
    public static void main(String []args)throws IOException{
            File src = new File("/Users/jiayuan/Downloads/untitled");
            File dest = new File("/Users/jiayuan/Downloads/untitled_new");
            copyFolder(src, dest);
    }
    public static void copyFolder(File src, File dest)throws IOException{
        if(src.isDirectory()){
            if(!dest.exists())
                dest.mkdir();
                String files[] = src.list();
                for (String file : files) {
                File srcFile = new File(src, file);
                File destFile = new File(dest, file);
                copyFolder(srcFile,destFile);
                }
            }else{
                InputStream in = new FileInputStream(src);
                OutputStream out = new FileOutputStream(dest);
                byte[] buffer = new byte[1024];
                int length;
                //copy the file content in bytes
                while ((length = in.read(buffer)) > 0){
                    out.write(buffer, 0, length);
                }
                in.close();
                out.close();
        }
    }


}