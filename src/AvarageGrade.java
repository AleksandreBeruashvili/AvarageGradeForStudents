
import java.util.Scanner;

public class AvarageGrade {
    public AvarageGrade() {
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Student Grade Calculator!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's name:  ");

        while(!scanner.hasNext("[a-zA-Z]+")) {
            System.out.println("invalid input. please type your name !");
            scanner.next();
        }

        String name = scanner.next();

        while(true) {
            while(true) {
                System.out.println("Enter test score 1 (between 0 and 100): ");
                if (scanner.hasNextDouble()) {
                    double score1 = scanner.nextDouble();
                    if (score1 >= 0.0 && score1 <= 100.0) {
                        while(true) {
                            while(true) {
                                System.out.println("Enter test score 2 (between 0 and 100): ");
                                if (scanner.hasNextDouble()) {
                                    double score2 = scanner.nextDouble();
                                    if (score2 >= 0.0 && score2 <= 100.0) {
                                        while(true) {
                                            while(true) {
                                                System.out.println("Enter test score 3 (between 0 and 100): ");
                                                if (scanner.hasNextDouble()) {
                                                    double score3 = scanner.nextDouble();
                                                    if (score3 >= 0.0 && score3 <= 100.0) {
                                                        double avarage = (score1 + score2 + score3) / 3.0;
                                                        if (avarage % 1.0 == 0.0) {
                                                            System.out.println("avrage score is : " + (int)avarage);
                                                        } else {
                                                            System.out.println("avrage score is : " + avarage);
                                                        }

                                                        char grade;
                                                        if (avarage >= 90.0) {
                                                            grade = 'A';
                                                        } else if (avarage >= 80.0) {
                                                            grade = 'B';
                                                        } else if (avarage > 70.0) {
                                                            grade = 'C';
                                                        } else if (avarage >= 60.0) {
                                                            grade = 'D';
                                                        } else {
                                                            grade = 'F';
                                                        }

                                                        System.out.println("Grade : " + grade);
                                                        return;
                                                    }

                                                    System.out.println("Invalid input. Score must be between 0 and 100. Please try again.");
                                                } else {
                                                    System.out.println("Invalid input. Please type a valid score.");
                                                    scanner.next();
                                                }
                                            }
                                        }
                                    }

                                    System.out.println("Invalid input. Score must be between 0 and 100. Please try again.");
                                } else {
                                    System.out.println("Invalid input. Please type a valid score.");
                                    scanner.next();
                                }
                            }
                        }
                    }

                    System.out.println("Invalid input. Score must be between 0 and 100. Please try again.");
                } else {
                    System.out.println("Invalid input. Please type a valid score.");
                    scanner.next();
                }
            }
        }
    }
}
