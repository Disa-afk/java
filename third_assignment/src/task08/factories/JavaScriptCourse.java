package task08.factories;

import task08.juniors.JavaScriptJunior;
import task08.middles.JavaScriptMiddle;
import task08.seniors.JavaScriptSenior;

import task08.juniors.JuniorDeveloper;
import task08.middles.MiddleDeveloper;
import task08.seniors.SeniorDeveloper;

public class JavaScriptCourse implements DeveloperCourse {
    @Override
    public JuniorDeveloper createJunior() {
        return new JavaScriptJunior();
    }

    @Override
    public MiddleDeveloper createMiddle() {
        return new JavaScriptMiddle();
    }

    @Override
    public SeniorDeveloper createSenior() {
        return new JavaScriptSenior();
    }
}
