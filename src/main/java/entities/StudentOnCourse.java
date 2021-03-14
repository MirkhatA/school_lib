package entities;

import java.util.Date;

public class StudentOnCourse {
    private int studentId;
    private int courseCode;
    private Date dateFrom;
    private Date dateTo;

    public StudentOnCourse() {

    }

    public StudentOnCourse(int studentId, int courseCode, Date dateFrom, Date dateTo) {
        setStudentId(studentId);
        setCourseCode(courseCode);
        setDateFrom(dateFrom);
        setDateTo(dateTo);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }
}
