
//
// ------------------------------------------
/*
    @brief This Program:
    This Java program defines the class ExamScore based on the following:

    The class should have 2 private instance fields to store the name of an exam
    and the score for an exam. Also provide the following methods:
        • A no-arg constructor to initialize the instance variables to values of your choice.
        • A Constructor with 2 parameters to initialize the instance variables to the arguments
            indicated in the parameter list of the constructor.
        • Appropriate methods to set the value of each of the private instance fields.
        • Appropriate methods to get the value of each of the private instance fields.
        • A toString() method used to display the values of the object using the format:
            "Exam Name: " followed by the name, followed by " Score: ", followed by the score.

 */
//
// ------------------------------------------
/*
    @note
    UML Diagram for ExamScore class
    ----------------------
    ExamScore
    ----------------------
    - examName: String
    - score: double
    ----------------------
    + ExamScore()
    + ExamScore(examName: String, score: double)
    ----------------------
    + setExamName(examName: String): void
    + setExamScore(score: double): void
    + getExamName(): String
    + getExamScore(): double
    + toString(): String
    ----------------------
 */
//
// ------------------------------------------
//
//
//


import java.text.DecimalFormat;

@SuppressWarnings("java:S106") // Disable the warning about System.out from SonarLint

// Define an ExamScore class
public class ExamScore {
    // Attributes for ExamScore class
    private String examName;
    private double score;


    // Constructors for ExamScore class

    // No-arg Constructor that sets initiate values for each attribute
    public ExamScore() {
        examName = "Exam 1";
        score = 100.0;

    } // No-arg Constructor

    // Arg Constructor
    // that defines the Exam Name and Exam Score
    public ExamScore(String examName, double score) {
        // Define the Exam Name and Exam Score
        this.examName = examName;
        this.score = score;

    } // Arg Constructor


    // Methods for ExamScore class

    // Setters

    // Set the Exam Name
    ///setExamName - Set the Exam Name
    ///@param - examName [String] , name for exam
    ///return: None
    public void setExamName(String examName) {
        this.examName = examName;
    }

    // Set the Exam Score
    ///setExamScore - Set the Exam Score
    ///@param - score [double] , double type number for exam
    ///return: None
    public void setExamScore(double score) {
        this.score = score;
    }


    // Getters

    // Get the Exam Name
    ///getExamName - Get the Exam Name
    ///@param - None
    ///return: the value [String] of exam name
    public String getExamName() {
        return examName;
    }

    // Get the Exam score
    ///getExamScore - Get the Exam Score
    ///@param - None
    ///return: the value number [double] of exam score
    public double getExamScore() {
        return score;
    }


    // Other Methods

    // toString() Method
    // Display the object outputs
    ///toString - Display the formatted object data by overriding the toString() method
    ///@param - None
    ///return: the String type of the formatted object data
    @Override
    public String toString() {

        // Use DecimalFormat class to set up the 2 digits decimal point for double type value
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        return "Exam Name: " + examName +
                ", Score: " + decimalFormat.format(score);

    } // toString

}
