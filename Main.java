import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();

        File[] dirs = {new File("Games/savegames"),
                new File("Games/temp"),
                new File("Games/src/main"),
                new File("Games/src/test"),
                new File("Games/res/drawables"),
                new File("Games/res/vectors"),
                new File("Games/res/icons"),};
        File[] files = {new File("Games/src/main/Main.java"),
                new File("Games/src/main/Utils.java"),
                new File("Games/temp/temp.txt")};

        for (int i = 0; i < dirs.length; i++) {
            if (dirs[i].mkdirs()) {
                stringBuilder.append("Создана директория: " + dirs[i].getName() + "\n");
            }
        }

        for (int i = 0; i < files.length; i++) {
            try {
                if (files[i].createNewFile()) {
                    stringBuilder.append("Создан файл: " + files[i].getName() + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
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


