package task08.factories;

import task08.juniors.PythonJunior;
import task08.middles.PythonMiddle;
import task08.seniors.PythonSenior;

import task08.juniors.JuniorDeveloper;
import task08.middles.MiddleDeveloper;
import task08.seniors.SeniorDeveloper;

public class PythonCourse implements DeveloperCourse {
    @Override
    public JuniorDeveloper createJunior() {
        return new PythonJunior();
    }

    @Override
    public MiddleDeveloper createMiddle() {
        return new PythonMiddle();
    }

    @Override
    public SeniorDeveloper createSenior() {
        return new PythonSenior();
    }
}
