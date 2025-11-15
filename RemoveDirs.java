import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

public class RemoveDirs {
    public static void main(String[] args) {
        String[] dirsToRemove = {
            ".github",
            ".idea",
            "CompetitiveProgramming",
            "GFG",
            "HackerRank",
            "Leetcode",
            "Udemy_Practice"
        };

        for (String dir : dirsToRemove) {
            Path path = Paths.get(dir);
            if (Files.exists(path)) {
                try {
                    Files.walk(path)
                        .sorted(Comparator.reverseOrder())
                        .map(Path::toFile)
                        .forEach(File::delete);
                    System.out.println("Removed directory: " + dir);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
