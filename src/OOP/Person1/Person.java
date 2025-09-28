package OOP.Person1;

public class Person {

     String name;
      double age;

    public Person(double age, String name) {
        this.age = age;
        this.name = name;
    }

    void printInfo(){
        System.out.println("Student: " + name + " Age: " + age);
    }

    public static class Student extends Person{

        String university;

        @Override
        void printInfo(){
            System.out.println("Student: " + name + " Age: " + age + " University: " + university);
        }

        public Student(double age, String name,String university) {
            super(age, name);
            this.university = university;
        }

    }


    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }


    public static void main(String[] args) {
        Student student = new Student(19,"Alex","Harward");

        System.out.println(student);

        Person person = new Person(21,"Sane");

        System.out.println(person);
    }
}


//Задача:
//
//Класс Person с полями name и age.
//
//Класс Student наследует Person и добавляет поле university.
//
//Использовать super в конструкторе, чтобы передавать name и age родителю.
//
//        Метод printInfo() выводит все данные.