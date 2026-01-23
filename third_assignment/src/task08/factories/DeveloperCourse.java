package task08.factories;

import task08.juniors.JuniorDeveloper;
import task08.middles.MiddleDeveloper;
import task08.seniors.SeniorDeveloper;

public interface DeveloperCourse {
    JuniorDeveloper createJunior();
    MiddleDeveloper createMiddle();
    SeniorDeveloper createSenior();
}