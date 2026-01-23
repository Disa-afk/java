package task07.factory;

import task07.developers.*;

public class JavaRush extends ProgrammingCourse {

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
