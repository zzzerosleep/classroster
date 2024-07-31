package Com.sg.classroster.dao;

import Com.sg.classroster.entity.Course;
import Com.sg.classroster.entity.Student;
import Com.sg.classroster.entity.Teacher;

import java.util.List;

public interface CourseDao {
    Course getCourseById(int id);
    List<Course> getAllCourses();
    Course addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourseById(int id);

    List<Course> getCoursesForTeacher(Teacher teacher);
    List<Course> getCoursesForStudent(Student student);
}