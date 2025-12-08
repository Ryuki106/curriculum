package ques30;

class Person2 {
    String name;
    int age;
    double height;
    double weight;

    static int count = 0;

    Person2(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        count++;
    }

    double bmi() {
        return this.weight / (this.height * this.height);
    }

    void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "です");
        System.out.println("BMIは" + String.format("%.2f", this.bmi()) + "です");
        System.out.println("合計" + count + "人です");
    }
}

