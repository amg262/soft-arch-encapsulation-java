package edu.wctc.part2;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 * In this lab focus on METHOD encapsulation and fix/add code as necessary.
 * Pay special attention to the following issues:
 * <p>
 * 1. Not all methods need to be public
 * <p>
 * 2. When methods need to be called in a certain order you can do this
 * by creating a parent method that calls the other, helper methods.
 * <p>
 * 3. There is some duplicate code used that violates the D.R.Y. principle.
 * Eliminate that by encapsulating the duplicate code in a new method
 * and then call that method in place of the duplicate code.
 * <p>
 * 4. All method parameters should be validated (except booleans).
 * <p>
 * Review the tips in the document Encapsulation Checklist if needed.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private LocalDate orientationDate;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public void setUpEmployee() {
        meetWithHrForBenefitAndSalaryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle(this.cubeId);
    }

    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired.
    private void meetWithHrForBenefitAndSalaryInfo() {
        metWithHr = true;
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yy");
//        String fmtDate = formatter.format(orientationDate);
        System.out.println(firstName + " " + lastName + " met with HR on "
                + dateFormatter(orientationDate));
    }

    // Assume this must be performed second, and assume that an employee
    // would only do this once, upon being hired.
    private void meetDepartmentStaff() {
        metDeptStaff = true;
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yy");
//        String fmtDate = formatter.format(orientationDate);
        System.out.println(firstName + " " + lastName + " met with dept staff on "
                + dateFormatter(orientationDate));
    }

    // Assume this must be performed third. And assume that because department
    // policies may change that this method may need to be called 
    // independently from other classes.
    private void reviewDeptPolicies() {
        reviewedDeptPolicies = true;
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yy");
//        String fmtDate = formatter.format(orientationDate);
        System.out.println(firstName + " " + lastName + " reviewed dept policies on "
                + dateFormatter(orientationDate));
    }

    // Assume this must be performed fourth. And assume that because employees
    // sometimes change office locations that this method may need to be called 
    // independently from other classes.
    private void moveIntoCubicle(String cubeId) {
        this.cubeId = cubeId;
        this.movedIn = true;
        System.out.println(firstName + " " + lastName + " moved into cubicle "
                + cubeId + " on " + dateFormatter(orientationDate));
    }

    private String dateFormatter(LocalDate theDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yy");
        return formatter.format(theDate);
    }

    // setter methods give the developer the power to control what data is
    // allowed through validation.

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public boolean hasMetWithHr() {
        return metWithHr;
    }

    public boolean hasMetDeptStaff() {
        return metDeptStaff;
    }

    public boolean hasReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public boolean hasMovedIn() {
        return movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        this.cubeId = cubeId;
    }

    public LocalDate getOrientationDate() {
        return orientationDate;
    }

    public void setOrientationDate(LocalDate orientationDate) {
        this.orientationDate = orientationDate;
    }
}
