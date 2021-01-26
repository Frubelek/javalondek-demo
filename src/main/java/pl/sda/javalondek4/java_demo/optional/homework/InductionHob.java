package pl.sda.javalondek4.java_demo.optional.homework;

import java.util.Optional;

public class InductionHob {

    private Display display;

    public InductionHob(Display display) {
        this.display = display;
    }

    public Optional<Display> getDisplay() {
        return Optional.ofNullable(display);
    }

    @Override
    public String toString() {
        return "InductionHob{" +
                "display=" + display +
                '}';
    }
}
