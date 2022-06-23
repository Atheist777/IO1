import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Main {



    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        File dir = new File("C://Games/src");
         if(dir.mkdir()) {
             stringBuilder.append(" каталог").append(dir.getName()).append(" создан");
             stringBuilder.append("/n");

}
         File dir1 = new File("C://Games/res");
         if(dir1.mkdir())
             stringBuilder.append(" каталог").append(dir.getName()).append(" создан");
             stringBuilder.append("/n");

         File dir2 = new File("C://Games/savegames");
         if(dir2.mkdir())
             stringBuilder.append(" каталог").append(dir.getName()).append(" создан");
             stringBuilder.append("/n");

         File dir3 = new File("C://Games/temp");
         if(dir3.mkdir())
             stringBuilder.append(" каталог").append(dir.getName()).append(" создан");
             stringBuilder.append("/n");

         File srcdir = new File("C://Games/src/main");
         if(srcdir.mkdir())
             stringBuilder.append(" каталог").append(dir.getName()).append(" создан");
             stringBuilder.append("/n");

         File srcdir1 = new File("C://Games/src/test");
         if(srcdir1.mkdir())
             stringBuilder.append(" каталог").append(dir.getName()).append(" создан");
             stringBuilder.append("/n");

         File resdir = new File("C://Games/res/drawables");
         if(resdir.mkdir())
             stringBuilder.append(" каталог").append(dir.getName()).append(" создан");
             stringBuilder.append("/n");

         File resdir1 = new File("C://Games/res/vectors");
         if(resdir1.mkdir())
             stringBuilder.append(" каталог").append(dir.getName()).append(" создан");
             stringBuilder.append("/n");

         File resdir2 = new File("C://Games/res/icons");
         if(resdir2.mkdir())
             stringBuilder.append(" каталог").append(dir.getName()).append(" создан");
             stringBuilder.append("/n");

         File mainFile = new File("C://Games/src/main/Main.java");

         try {
             if (mainFile.createNewFile())
                 stringBuilder.append(" файл").append(dir.getName()).append(" создан");
                 stringBuilder.append("/n");
         }
         catch (IOException e){
             e.getMessage();
         }

         File mainFile1 = new File("C://Games/src/main/Utils.java");

         try {
             if(mainFile1.createNewFile())
                 stringBuilder.append(" файл").append(dir.getName()).append(" создан");
                 stringBuilder.append("/n");
         }
         catch (IOException e){
             e.getMessage();
         }

         File tempFile = new File("C://Games/temp/temp.txt");

         try {
             if(tempFile.createNewFile())
                 stringBuilder.append(" файл").append(dir.getName()).append(" создан");
                 stringBuilder.append("/n");
         }
         catch (IOException e){
             e.getMessage();
         }

        try {
            FileWriter filewriter = new FileWriter("C://Games/temp/temp.txt");
            filewriter.write(String.valueOf(stringBuilder));
            filewriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(stringBuilder);

    }
}
