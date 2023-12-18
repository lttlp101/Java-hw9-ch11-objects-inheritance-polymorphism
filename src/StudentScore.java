
//
// ------------------------------------------
/*
    @brief This Program:
    This Java program defines the class StudentScore based on the following:

    Define the utility Class StudentScore that inherits from the ExamScore
    and has one attribute to store the identification number for the student.
        • A no-arg constructor to initialize the instance variable to a value of your choice.
        • A Constructor with 1 parameter to initialize the instance variables to the argument
            indicated in the parameter list of the constructor.
        • Appropriate methods to set the value of each of the private instance field.
        • Appropriate methods to get the value of each of the private instance field.
        • A toString() method used to display the identification number along with the Exam
            score information inherited from the ExamScore information.

 */
//
// ------------------------------------------
/*
    @note
    UML Diagram for StudentScore class
    ----------------------
    StudentScore
    ----------------------
    - studentID: int
    ----------------------
    + StudentScore()
    + StudentScore(studentID: int)
    ----------------------
    + setStudentID(studentID: int): void
    + getStudentID(): int
    + toString(): String
    ----------------------
 */
//
// ------------------------------------------
//
//
//


@SuppressWarnings("java:S106") // Disable the warning about System.out from SonarLint

// Defines a StudentScore class Inherits from the ExamScore class
public class StudentScore extends ExamScore {
    // Attributes for StudentScore class
    private int studentID;


    // Constructors for StudentScore class

    // No-arg Constructor that sets initiate values for each attribute
    public StudentScore() {
        super(); // Invoke a superclass constructor
        studentID = 1000;

    } // No-arg Constructor

    // Arg Constructor
    // that defines the Student ID, with superclass Exam Name and Exam Score
    public StudentScore(String examName, double examScore, int studentID) {
        super(examName, examScore);  // Invoke a superclass constructor with args
        this.studentID = studentID;

    } // Arg Constructor


    // Methods for StudentScore class

    // Setter

    // Set the Student ID
    ///setStudentID - Set the Student ID
    ///@param - studentID [int] , integer number for student id
    ///return: None
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }


    // Getter

    // Get the Student ID
    ///getStudentID - Get the Student ID
    ///@param - None
    ///return: the value number [int] of the student id
    public int getStudentID() {
        return studentID;
    }


    // Other Methods

    // toString() Method
    // Display the object outputs
    ///toString - Display the formatted object data by overriding the toString() method
    ///@param - None
    ///return: the String type of the formatted object data
    @Override
    public String toString() {

        return super.toString() +
                ", Identification Number: " + studentID +
                "\n";

    } // toString

}
