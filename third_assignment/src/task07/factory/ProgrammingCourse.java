package task07.factory;

import task07.developers.Developer;

public abstract class ProgrammingCourse {

    public abstract Developer createDeveloper();

    public void educateStudent() {
        Developer developer = createDeveloper();
        developer.study();
    }
}
