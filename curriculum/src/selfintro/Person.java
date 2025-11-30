package selfintro;

class Person {

  private static int count = 0;
  private String firstName;
  private String lastName;
  private int age;
  private double height;
  private double weight;

  Person(String firstName, String lastName, int age, double height, double weight){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
    count++;
  }

  public String fullName(){
    return this.firstName + this.lastName;
  }

  public double bmi(){
    return this.weight / this.height / this.height;
  }

  public void print(){
    System.out.println("名前は" + this.fullName() + "です");
    System.out.println("年は" + this.age + "です");
  }

  public static void printCount(){
    System.out.println("合計" + count + "人です");
  }

  public void buy(Car car){
    car.setOwner(this.fullName());
    System.out.println(car.getOwner() + "が購入しました");
  }

  public void buy(Bicycle bicycle){
    bicycle.setOwner(this.fullName());
    System.out.println(bicycle.getOwner() + "が購入しました");
  }
}
