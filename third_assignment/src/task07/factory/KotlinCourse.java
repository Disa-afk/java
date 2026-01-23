package task07.factory;

import task07.developers.*;

public class KotlinCourse extends ProgrammingCourse {

    @Override
    public Developer createDeveloper() {
        return new KotlinDeveloper();
    }
}
