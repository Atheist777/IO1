import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Main {



    public static void main(String[] args) {
        String gamesFile = "C:\\Games\\";
        StringBuilder stringBuilder = new StringBuilder();
        
        stringBuilder.append(createDir(gamesFile + "src"));
        stringBuilder.append(createDir(gamesFile + "res"));
        stringBuilder.append(createDir(gamesFile + "savegames"));
        stringBuilder.append(createDir(gamesFile + "temp"));
        stringBuilder.append(createDir(gamesFile + "src\\main"));
        stringBuilder.append(createDir(gamesFile + "src\\test"));
        stringBuilder.append(createFile(gamesFile + "src\\main\\Main.java"));
        stringBuilder.append(createFile(gamesFile + "src\\main\\Utils.java"));
        stringBuilder.append(createDir(gamesFile + "res\\drawables"));
        stringBuilder.append(createDir(gamesFile + "res\\vectors"));
        stringBuilder.append(createDir(gamesFile + "res\\icons"));
        stringBuilder.append(createFile(gamesFile + "temp\\temp.txt"));

        try (FileWriter writer = new FileWriter(gamesFile + "temp\\temp.txt", false)) {
            writer.write(String.valueOf(stringBuilder));
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String createDir(String dirLink) {
        File dir = new File(dirLink);
        if (dir.mkdir()) {
            return dir.getName() + " - Каталог создан" + "\n";
        } else return dir.getName() + " - Каталог создать не удалось" + "\n";
    }

    public static String createFile(String fileLink) {
        File file = new File(fileLink);
        try {
            if (file.createNewFile())
                return file.getName() + " - Файл создан" + "\n";
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return file.getName() + " - Файл создать не удалось" + "\n";



    }
}
