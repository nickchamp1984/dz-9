package cc.robotdreams.java;

public class Man extends Person {

    @Override
    protected boolean isRetired() {
        if (age >= 65) {
            return true;
        } else {
            return false;
        }
    }
}
