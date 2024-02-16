public class StudentRunner {
    public void run(){
        Student firstStudent = new Student("John", "Dower", "1");
        Student secondStudent = new Student("David", "Dower", "2");
        Student emptyStudent = new Student();

        System.out.println("First student : "+firstStudent.toString());
        System.out.println("Second student : "+secondStudent.toString());
        System.out.println("Empty constructor: "+emptyStudent.toString());
    }
}
