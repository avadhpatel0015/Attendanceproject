package com.example.attendance;
public class ClassItem {
    private String className;
    private String subjectName;

    // Default (no-argument) constructor required by Firebase
    public ClassItem() {
        // Initialize any fields if needed
    }

    public ClassItem(String className, String subjectName) {
        this.className = className;
        this.subjectName = subjectName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
