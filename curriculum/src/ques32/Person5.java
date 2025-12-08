package ques32;

class Person5 {
    private static int count = 0;
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private double weight;

    Person5(String firstName, int age, double height, double weight) {
        this.firstName = firstName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        count++;
    }

    Person5(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        count++;
    }

    public String fullName() {
        return this.firstName + this.lastName;
    }

    public void print() {
        System.out.println("名前は" + this.fullName() + "です");
        System.out.println("年は" + this.age + "です");
    }

    public double bmi() {
        return this.weight / (this.height * this.height);
    }

    public static void printCount() {
        System.out.println("合計" + count + "人です");
    }
}

