// 14-02-2024
// Encapsulation (Инкапсуляция)

public class Main {
    public static void main(String[] args) {
        School school = new School();
        School school1 = new School();
        School school2 = new School();

        Car car = new Car();
        Car car1 = new Car();
        Car car2 = new Car();

        Person person = new Person();
        Person person1 = new Person();
        Person person2 = new Person();

        school.setLesson("English");
        school.setTeacher("Aelita Jeldenova");
        school.setTimeInHour(3);

        school1.setLesson("JS");
        school1.setTeacher("Bekbolsun");
        school1.setTimeInHour(2);

        school2.setLesson("Java");
        school2.setTeacher("Aijamal Asangazieva");
        school2.setTimeInHour(2);


        car.setCar("BMW");
        car.setModel("BMW E39 M5");
        car.setColorCode(192761);

        car1.setCar("Mercedes");
        car1.setModel("Mercedes-AMG GT");
        car1.setColorCode(989991);

        car2.setCar("Lamborghini");
        car2.setModel("Lamborghini Revuelto");
        car2.setColorCode(256733);

        person.setFirstName("Beknazar");
        person.setLastName("Zholdoshbekov");
        person.setAge(16);

        person1.setFirstName("Aizada");
        person1.setLastName("Abdyrazakova");
        person1.setAge(21);

        person2.setFirstName("Akylai");
        person2.setLastName("Musaeva");
        person2.setAge(23);


        School[] lessons = {school, school1, school2};
        Car[] cars = {car, car1, car2};
        Person[] persons = {person, person1, person2};

        for (School lesson : lessons) {
            System.out.println("Lesson: " + lesson.getLesson());
            System.out.println("Teacher: " + lesson.getTeacher());
            System.out.println("Time: " + lesson.getTimeInHour() + "\n");
        }

        for (Car machine : cars) {
            System.out.println("Car: " + machine.getCar());
            System.out.println("Model: " + machine.getModel());
            System.out.println("Color code: " + machine.getColorCode() + "\n");
        }

        for (Person human : persons) {
            System.out.println("First name: " + human.getFirstName());
            System.out.println("Last name: " + human.getLastName());
            System.out.println("Age: " + human.getAge() + "\n");
        }
    }
}


