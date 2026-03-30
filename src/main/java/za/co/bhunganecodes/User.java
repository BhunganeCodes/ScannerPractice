package za.co.bhunganecodes;

public class User extends Person {

    private boolean isAmazing;


    User(String name){
        super(name);
    }

    User(String name, int age, double height){
        super(name, age, height);
        this.setAmazing(true);
    }

    public void setAmazing(boolean amazing) {
        this.isAmazing = amazing;
    }

    public boolean getIsAmazing() {
        return isAmazing;
    }
}
