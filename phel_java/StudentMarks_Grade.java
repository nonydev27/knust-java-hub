class StudentMarks_Grade {
    public static void main(String[] args){
        double[] midSem = {65, 45, 22};
        double[] exams = {74, 50, 90};
        double mark30 = 0.0;
        double exam70 = 0.0;

        for (int i = 0; i < midSem.length; i++){
            mark30 = ((midSem[i]/100) * 30);
        }
        for (int i = 0; i < exams.length; i++){
            exam70 = ((exams[i]/100) * 70);
        }

    }
}
