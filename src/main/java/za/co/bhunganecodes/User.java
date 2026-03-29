package za.co.bhunganecodes;

public class User {
    private String name;
    private int age;
    private boolean isAmazing;

    User(){
        this.name = "Name not provided.";
        this.age = 0;
        this.isAmazing = false;
    }

    User(String name){
        this.name = name;
        this.age = 0;
        this.isAmazing = false;
    }

    User(String name, int age){
        this.name = name;
        this.age = age;
        this.isAmazing = true;
    }

    public String getName(){return name;}

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getIsAmazing() {
        return isAmazing;
    }

    public void setAmazing(boolean amazing) {
        isAmazing = amazing;
    }
}
