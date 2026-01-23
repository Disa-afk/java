package task08.factories;

import task08.juniors.JavaJunior;
import task08.middles.JavaMiddle;
import task08.seniors.JavaSenior;

import task08.juniors.JuniorDeveloper;
import task08.middles.MiddleDeveloper;
import task08.seniors.SeniorDeveloper;

public class JavaRush implements DeveloperCourse {
    @Override
    public JuniorDeveloper createJunior() {
        return new JavaJunior();
    }

    @Override
    public MiddleDeveloper createMiddle() {
        return new JavaMiddle();
    }

    @Override
    public SeniorDeveloper createSenior() {
        return new JavaSenior();
    }
}
