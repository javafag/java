package io;

//Прочитать файл построчно с помощью BufferedReader
//
//Вывести количество строк
//
//Вывести первую и последнюю строку

import javax.tools.JavaFileManager;
import java.io.BufferedReader; import java.io.FileReader; import java.io.IOException; import java.nio.file.*; import java.util.ArrayList; import java.util.List;

public class file {

    public void copyFile(String source, String target){
        Path sourcePath = Paths.get(source);
        Path targetPath = Paths.get(target);

        try {
            Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Файл скопирован!");
        } catch (IOException e) {
            System.out.println("Ошибка при копировании: " + e.getMessage());
        }
    }


    static boolean containsWord(Path path, String word){
        try {
            // Stream строк из файла, проверка, содержит ли строка слово
            return Files.lines(path)
                    .anyMatch(line -> line.contains(word));
        } catch (IOException e) {
            e.printStackTrace();
            return false; // если ошибка чтения — считаем, что слово не найдено
        }
    }

    public static  void main(String[] args) {


        Path filePath = Path.of("data.txt");

        boolean found = containsWord(filePath, "Java");
        if (found) {
            System.out.println("Слово найдено!");
        } else {
            System.out.println("Слово не найдено!");
        }


        try {
            Files.write(filePath, List.of("Новая строка"), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




        file fm = new file();
        fm.copyFile("data.txt", "copy_data.txt");




        List<String> lines = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader("data.txt"))){
            String line;

            while ((line = bf.readLine()) != null) {
                System.out.println(line);
                lines.add(line.toUpperCase());
            }
        }catch (IOException e){
            e.printStackTrace();
        }




        System.out.println(lines.size() + "   Lines capacity");


        System.out.println(lines.get(0));
        System.out.println(lines.get(lines.size()-1));




    }
}
