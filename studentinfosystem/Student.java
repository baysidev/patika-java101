package Giris.studentinfosystem;


public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course matSoz;
    Course fizSoz;
    Course kimSoz;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya, Course matSoz, Course kimSoz, Course fizSoz) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.matSoz = matSoz;
        this.kimSoz = kimSoz;
        this.fizSoz = fizSoz;
        calcAvarage();
        this.isPass = false;
    }


    public void addSozluExamNote(int matSoz, int fizikSoz, int kimyaSoz) {

        if (matSoz >= 0 && matSoz <= 100) {
            this.matSoz.note = matSoz;
        }

        if (fizikSoz >= 0 && fizikSoz <= 100) {
            this.fizSoz.note = fizikSoz;
        }

        if (kimyaSoz >= 0 && kimyaSoz <= 100) {
            this.kimSoz.note = kimyaSoz;
        }

    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {

        double fizOrt = (this.fizik.note * fizik.bulkCarp) + (this.fizSoz.note * fizik.sozCarp);
        double matOrt = (this.mat.note * mat.bulkCarp ) + (this.matSoz.note * mat.sozCarp);
        double kimOrt = (this.kimya.note * kimya.bulkCarp) + (this.kimSoz.note * kimya.sozCarp);

        this.avarage = (fizOrt + matOrt + kimOrt) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Matematik Sözlü Notu : " + this.matSoz.note);
        System.out.println("Fizik Sözlü Notu : " + this.fizSoz.note);
        System.out.println("Kimya Sözlü Notu : " + this.kimSoz.note);
    }

}
