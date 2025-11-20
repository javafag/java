package OOP.files;

import OOP.generics.Pair2.Pair;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class files1 {
    public static void main(String[] args) throws IOException {
        try(FileWriter writer = new FileWriter("hello.txt") ) {
            writer.write("aello, aorld! Java writes to files.");
            System.out.println("File written successfully!");
        } catch (IOException e){
            e.printStackTrace();
        }


//        🧩 Задание 2. Чтение из файла (FileReader)
//
//        Цель: научиться читать данные из файла построчно.
//
//        Описание:
//        Прочитай содержимое файла hello.txt и выведи его в консоль.

        try (FileReader reader = new FileReader("hello.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

        }catch (IOException e){
            e.printStackTrace();
        }


//        🧩 Задание 3. Чтение файла как Stream (Java 8+)
//
//        Цель: познакомиться с Files.lines() и Stream API.


        Files.lines(Path.of("hello.txt"))
                .filter(line -> line.startsWith("A"))
                .forEach(System.out::println);


//        🧩 Задание 4. Использование Files.readString и Files.writeString (Java 11+)
//
//        Цель: освоить новые удобные методы для работы со строками и файлами.
//
//        Описание:
//
//        Создай файл info.txt, запиши туда текст.
//
//        Прочитай этот файл с помощью Files.readString().
//
//                Добавь в конец строки " -- file processed" и запиши обратно.


        Path path = Path.of("info.txt");

        System.out.println("\n");

        System.out.println(Files.readString(path));

        Files.writeString(path,"Java 11 makes file IO simpler!");

        String content = Files.readString(path);
        content += " -- file processed";

        Files.writeString(path, content);
        System.out.println("Updated content:\n" + Files.readString(path));

    }
}
