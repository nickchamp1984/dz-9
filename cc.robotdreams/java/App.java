package cc.robotdreams.java;

public class App {
    public static void main(String[] args) {
        Man nick = new Man();
        nick.setFirstName("Mykola");
        nick.setLastName("Pruchkovskiy");
        nick.setAge(38);

        Woman mila = new Woman();
        mila.setFirstName("Mila");
        mila.setMaidenName("Kalkutina");
        mila.setAge(20);

        System.out.println(nick.getFirstName() + "'s last name is now: " + nick.getLastName());
        System.out.println(mila.getFirstName() + "'s last name is now: " + mila.getLastName());

        mila.registerPartnership(nick);

        System.out.println(nick.getFirstName() + " and " + mila.getFirstName() + " are partners.");
        System.out.println(nick.getFirstName() + "'s last name is now: " + nick.getLastName());

        /* Here I want also create method to change -iy Man's postfix
        to -a Women's postfix but still had no chance to review dz–6.
         */
        System.out.println(mila.getFirstName() + "'s last name is now: " + mila.getLastName());

        System.out.println(nick.getFirstName() + " is retired: " + nick.isRetired());
        System.out.println(mila.getFirstName() + " is retired: " + mila.isRetired());

        nick.setAge(78);
        mila.setAge(60);

        System.out.println(nick.getFirstName() + " is retired: " + nick.isRetired());
        System.out.println(mila.getFirstName() + " is retired: " + mila.isRetired());

        nick.deregisterPartnership(true);
        mila.deregisterPartnership(true);

        System.out.println(nick.getFirstName() + " and " + mila.getFirstName() + " are no longer partners.");
        System.out.println(nick.getFirstName() + "'s last name is now: " + nick.getLastName());
        System.out.println(mila.getFirstName() + "'s last name is now: " + mila.getLastName());
    }
    }

