package task3.service;

import task2.Group;
import task2.ScheduleItem;
import task2.Student;
import task2.Subject;

import java.util.ArrayList;

public class AddNewSubject {

    private Subject subject;

    public AddNewSubject() {
        subject = new Subject();
    }

    public AddNewSubject(final Subject subject) {
        this.subject = subject;
    }

    public void setNameOfSubject(final String nameOfSubject) {
        subject.setNameOfSubject(nameOfSubject);
    }

    public void action(final Group group) {
        for (final Student student : group.getStudents()) {
            student.getStudySchedule().getSchedule().add(new ScheduleItem(new ArrayList<>(), subject));
        }
    }
}
