package ques32;

class Main5 {
    public static void main(String[] args) {
        Person5 person1 = new Person5("鈴木", "太郎", 20, 1.7, 60);
        person1.print();

        Person5 person2 = new Person5("山田", "花子", 22, 1.5, 40);
        person2.print();

        Person5.printCount();
    }
}
