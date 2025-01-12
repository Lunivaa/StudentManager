public class GradeCalculator { 
    public double calculateAverageGrade(int[] grades) { 
        int sum = 0; 
        for (int grade : grades) { 
            sum += grade; 
        } 
        return (double) sum / grades.length; 
    } 
}
