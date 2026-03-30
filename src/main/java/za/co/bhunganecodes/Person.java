package za.co.bhunganecodes;

class Person {
    private String name;
    private int age;
    private double height;

    Person(String name){
        this.setName(name);
        this.age = 0;
        this.height = 0.0;
    }

    Person(String name, int age, double height){
        this.setName(name);
        this.setAge(age);
        this.setHeight(height);
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double newHeight){
        this.height = newHeight;
    }
}
