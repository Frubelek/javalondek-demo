package pl.sda.javalondek4.java_demo.optional.homework;

import java.util.Optional;

public class Home {

    private Kitchen kitchen;

    public Home(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public Optional<Kitchen> getKitchen() {
        return Optional.ofNullable(kitchen);
    }

    @Override
    public String toString() {
        return "Home{" +
                "kitchen=" + kitchen +
                '}';
    }
}
