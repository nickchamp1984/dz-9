package cc.robotdreams.java;

public class Woman extends Person {

    public static String getMaidenName() {
        return maidenName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    public static String maidenName;

    @Override
    protected boolean isRetired() {
        if (age >= 60) {
            return true;
        } else {
            return false;
        }
    }
}
