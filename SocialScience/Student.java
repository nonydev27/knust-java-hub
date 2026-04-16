public class Student {
    private String indexNumber;
    private double rawMidSem;
    private double rawExam;

    public Student(String indexNumber, double rawMidSem, double rawExam) {
        this.indexNumber = indexNumber;
        this.rawMidSem = rawMidSem;
        this.rawExam = rawExam;
    }

    public double getScaledMidSem() {
        return (rawMidSem / 100.0) * 30.0;
    }

    public double getScaledExam() {
        return (rawExam / 100.0) * 70.0;
    }

    public double getFinalMark() {
        return getScaledMidSem() + getScaledExam();
    }

    public String getLetterGrade() {
        double mark = getFinalMark();
        if (mark >= 70) return "A";
        else if (mark >= 60) return "B";
        else if (mark >= 50) return "C";
        else if (mark >= 45) return "D";
        else if (mark >= 40) return "E";
        else return "F";
    }

    public String getIndexNumber() { return indexNumber; }
}