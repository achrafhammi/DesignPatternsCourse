import fs.File;
import fs.Folder;

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        root.add(new File("java.txt"));
        root.add(new File("pom.xml"));
        Folder src = new Folder("src");
        root.add(src);
        src.add(new File("data.csv"));
        root.afficher();

    }
}