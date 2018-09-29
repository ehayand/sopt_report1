package org.sopt;

import org.sopt.model.Department;
import org.sopt.model.Professor;
import org.sopt.model.Student;
import org.sopt.model.University;
import org.sopt.model.builder.DepartmentBuilder;
import org.sopt.model.builder.ProfessorBuilder;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.model.builder.UniversityBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehay@naver.com on 2018-09-29
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static void main(String[] args) {
        final List<Student> studentList = new ArrayList<>();
        final List<Professor> professorList = new ArrayList<>();
        final List<Department> departmentList = new ArrayList<>();
        final List<University> universityList = new ArrayList<>();

        StudentBuilder studentBuilder = new StudentBuilder();
        ProfessorBuilder professorBuilder = new ProfessorBuilder();
        DepartmentBuilder departmentBuilder = new DepartmentBuilder();
        UniversityBuilder universityBuilder = new UniversityBuilder();

        final Student student1 = studentBuilder.build();
        final Student student2 = studentBuilder.build();
        final Student student3 = studentBuilder.build();
        final Professor professor1 = professorBuilder.build();
        final Professor professor2 = professorBuilder.build();
        final Professor professor3 = professorBuilder.build();
        final Department department1 = departmentBuilder.build();
        final Department department2 = departmentBuilder.build();
        final Department department3 = departmentBuilder.build();
        final University university1 = universityBuilder.build();
        final University university2 = universityBuilder.build();
        final University university3 = universityBuilder.build();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        professorList.add(professor1);
        professorList.add(professor2);
        professorList.add(professor3);
        departmentList.add(department1);
        departmentList.add(department2);
        departmentList.add(department3);
        universityList.add(university1);
        universityList.add(university2);
        universityList.add(university3);

        for (final Student s : studentList) System.out.println(s.toString());
        for (final Professor p : professorList) System.out.println(p.toString());
        for (final Department d : departmentList) System.out.println(d.toString());
        for (final University u : universityList) System.out.println(u.toString());

    }
}
