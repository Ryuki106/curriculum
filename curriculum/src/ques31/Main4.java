package ques31;

class Main4 {
    public static void main(String[] args) {
        Person4 person1 = new Person4("鈴木太郎", 20, 1.7, 60);
        person1.print();

        Person4 person2 = new Person4("山田花子", 22, 1.5, 40);
        person2.print();

        System.out.println("合計" + Person4.count + "人です");

        Person4.printCount();
    }
}
