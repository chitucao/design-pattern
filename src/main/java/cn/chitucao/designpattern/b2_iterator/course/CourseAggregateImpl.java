package cn.chitucao.designpattern.b2_iterator.course;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom.
 */
public class CourseAggregateImpl implements ICourseAggregate {
    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void add(Course course) {
        courseList.add(course);
    }

    @Override
    public void remove(Course course) {
        courseList.remove(course);
    }

    @Override
    public Iterator<Course> iterator() {
        return new IteratorImpl<Course>(courseList);
    }
}
