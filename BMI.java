
public class BMI {

    // field
    private String Name;
    private int age;
    private double weight;
    private double height;

    public BMI(String Name,
               int age,
               double weight,
               double height) {

        this.Name = Name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String Name, double weight, double height) {
        this.Name = Name;
        this.age = 20;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI() {
        return (weight * 703) / (height * height);
    }
    public int getage(){
        return age;
    }

    public String getStatus() {
        double BMI = getBMI();

        if (BMI < 18.5) {
            return "under weight";
        }
        else if (BMI < 25) {
            return "Normal";
        }
        else if (BMI < 30) {
            return "over weight";
        }
        else {
            return "obese";
        }
    }

    public static void main(String[] args) {

        BMI person1 = new BMI("Noura", 150, 65);

        System.out.println("Name: " + person1.Name);
        System.out.println("age:"+person1.age);
        System.out.println("BMI: " + person1.getBMI());
        System.out.println("Status: " + person1.getStatus());

        BMI person2 = new BMI("Mohamed", 180, 70);

        System.out.println("Name: " + person2.Name);
        System.out.println("age:"+person2.age);
        System.out.println("BMI: " + person2.getBMI());
        System.out.println("Status: " + person2.getStatus());
    }
}
