package task07.factory;

import task07.developers.*;

public class DotNetCourse extends ProgrammingCourse {

    @Override
    public Developer createDeveloper() {
        return new DotNetDeveloper();
    }
}
