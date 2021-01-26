package pl.sda.javalondek4.java_demo.optional.homework;

import java.util.Optional;

public class Kitchen {

    private InductionHob inductionHob;

    public Kitchen(InductionHob inductionHob) {
        this.inductionHob = inductionHob;
    }

    public Optional<InductionHob> getInductionHob() {
        return Optional.ofNullable(inductionHob);
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "kitchen=" + inductionHob +
                '}';
    }
}
