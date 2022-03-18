package Giris.studentinfosystem;

public class main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Course matSoz = new Course("Matematik", "MAT101", "MAT");
        Course fizSoz = new Course("Fizik", "FZK101", "FZK");
        Course kimSoz = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya, matSoz, fizSoz, kimSoz);
        s1.addBulkExamNote(50,20,40);
        s1.addSozluExamNote(70, 40, 30);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya, matSoz, fizSoz, kimSoz);
        s2.addBulkExamNote(100,50,40);
        s2.addSozluExamNote(70, 2,63);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya, matSoz, fizSoz, kimSoz);
        s3.addBulkExamNote(50,20,40);
        s3.addSozluExamNote(35, 74,32);
        s3.isPass();

    }
}
