
//
// ------------------------------------------
/*
    @brief This Program:
    This Java program include the following:
    This is the Main program to:

        • Test various operations on the objects of the ExamScore and StudentScore classes.
            Perform a series of operations to test each of the methods and the constructors.
        • Show how to define an arraylist of student names.
        • Show how to populate the arraylist with the name of as many students as the user wishes.
        • Display the header “N A M E O U T P U T”.
        • Display the contents of the arraylist.

 */
//
// ------------------------------------------
//
//
//


import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("java:S106") // Disable the warning about System.out from SonarLint


public class CIT130hw9ch11 {

    // Define the scanner object to take input
    public static final Scanner inputs = new Scanner(System.in);

    public static void main(String[] args) {
        // Display the assignment title
        System.out.println("\nAssignment 9 \t\tChapter 11 \tOOP - Inheritance\n");

        // 1) No-Arg Constructors
        // Call the noArgConstructors() method
        noArgConstructors();

        // 2) Arg Constructors
        // 2) Arg Constructor Part 1:
        // Call the argConstructorsPart1() method
        argConstructorsPart1();

        // 2) Arg Constructor Part 2:
        // Call the argConstructorsPart2() method
        argConstructorsPart2();

        // 3) Student Names - ArrayList
        // Call the studentNamesArrayList() method
        studentNamesArrayList();

    } // main



    // Methods

    // 1) No-Arg Constructors
    // No-Arg Constructors Example
    ///noArgConstructors - Printing the object from ExamScore using
    ///                      -  only the no-arg constructor
    ///@param - None
    ///return: None
    public static void noArgConstructors() {
        // Create examScore and studentScore object using default no-arg constructors
        ExamScore examScore = new ExamScore();
        StudentScore studentScore= new StudentScore();

        System.out.println("1) No-Arg Constructor Example ");

        System.out.println("Printing the object from ExamScore using the no-arg constructor ");

        // Print out the objects using toString method
        System.out.printf("%s %n%s %n%n", examScore, studentScore);

    } // noArgConstructors




    // 2) Arg Constructors

    // 2) Arg Constructor Part 1:
    // Arg Constructor for creating Exam Score object Example
    ///argConstructorsPart1 - Ask user inputs for exam name and exam score,
    ///                         -  then use the arg constructor to create examScore object and print it
    ///@param - None
    ///return: None
    public static void argConstructorsPart1() {

        System.out.println("2) Arg Constructors Example Part 1 ");

        System.out.println("Enter the name of an exam and the corresponding score ");
        // Ask user input for name, then call capitalizeNames() method to capitalize the name
        // then Ask user input for score
        String name = inputs.nextLine();
        String examName = capitalizeNames(name);
        double score = inputs.nextDouble();

        // Validate the exam score is in between 0 and 100
        while (score < 0.00000000001 || score > 100.00000000001) {
            System.out.println("Invalid!! Enter again!");
            score = inputs.nextDouble();
        }

        // Create the examScore object using arg constructor
        // Passing in the inputs (name and score)
        ExamScore examScore = new ExamScore(examName, score);

        System.out.println("Just updated information for an exam ");
        // Print out the object by using toString method
        System.out.printf("%s %n%n", examScore);

    } // ArgConstructorsPart1


    // 2) Arg Constructor Part 2:
    // Arg Constructor for creating Student Score object Example
    ///argConstructorsPart2 - Ask user inputs for student id number and the name of the exam,
    ///                         -  then use the arg constructor to create studentScore object and print it
    ///@param - None
    ///return: None
    public static void argConstructorsPart2() {

        System.out.println("3) Arg Constructors Example Part 2 ");

        System.out.println("Enter the identification number for a student ");
        // Get the student id number from user
        int id = inputs.nextInt();

        // Validate the ID is greater than zero
        while (id <= 0) {
            System.out.println("Invalid!! Enter again!");
            id = inputs.nextInt();
        }

        System.out.println("Enter the name of an exam and the corresponding score for: " + id);
        inputs.nextLine(); // Avoid Skipping line
        // Ask user input for name, then call capitalizeNames() method to capitalize the name
        // then Ask user input for score
        String name = inputs.nextLine();
        String examName = capitalizeNames(name);
        double score = inputs.nextDouble();

        // Validate the exam score is in between 0 and 100
        while (score < 0.00000000001 || score > 100.00000000001) {
            System.out.println("Invalid!! Enter again!");
            score = inputs.nextDouble();
        }

        // Create the studentScore object using arg constructor
        StudentScore studentScore = new StudentScore(examName, score, id);

        // Print out the object using toString method
        System.out.println(studentScore);

    } // ArgConstructorsPart2


    // 3) Student Names - ArrayList
    // Create Student Names Array List Example
    ///studentNamesArrayList - Ask user inputs for number of the amount of student want to put in,
    ///                         -  then create an arraylist to store the names then print the names
    ///@param - None
    ///return: None
    public static void studentNamesArrayList() {

        System.out.println("4) Student Name ArrayList Example ");

        // Initialize the header
        String header = "\n---N A M E O U T P U T---";

        // Create an ArrayList
        List<String> studentNames = new ArrayList<>();

        // Ask user for the amount number of the students
        System.out.println("Enter the number of students to process: ");
        int numOfStudents = inputs.nextInt();

        // Validate the number of students is greater than zero
        while (numOfStudents <= 0) {
            System.out.println("Invalid!! Enter again!");
            numOfStudents = inputs.nextInt();
        }

        inputs.nextLine(); // Avoid skipping line

        // For loop for adding the names into arraylist one by one
        for (int i = 0; i < numOfStudents; i++) {
            // Ask input for name, then call capitalizeNames() method to capitalize the name
            System.out.println("Enter the name of the student: ");
            String name = inputs.nextLine();
            String studentName = capitalizeNames(name);

            // Add name into the arraylist
            studentNames.add(i, studentName);

        }

        // Display the header
        System.out.printf("%n%s %n", header);

        // Display names one line by one line
        for (String studentName : studentNames) {
            System.out.println(studentName);
        }

        System.out.println("\n");

    } // studentNamesArrayList


    // Extra Methods

    // Capitalize Names
    ///capitalizeNames - Capitalize the first letter of the name whatever is a single word or words with white space
    ///                - Check if the name is a single word or more
    ///                - If it's more than one word, use StringBuilder class to separate the words,
    ///                -     then build a new whole string with capitalize first letter of each word.
    ///                - If it's one word, then capitalize the first letter
    ///@param - names [String] a String value of name
    ///return: the new name String with capitalize first letter
    public static String capitalizeNames(String names) {

        // Check if names contains white space
        if (names.contains(" ")) {
            // Separate the words by the white space and put them into an array
            String[] nameArray = names.split(" ");
            // Use StringBuilder class
            StringBuilder stringBuilder = new StringBuilder();

            // Literal the word array and rebuild with capitalize first letter
            for (String s : nameArray) {
                stringBuilder.append(Character.toUpperCase(s.charAt(0)))
                        .append(s.substring(1)).append(" ");
            }
            return stringBuilder.toString().trim();
        }
        else {
            // Capitalize the first letter for the value of the name
            return names.substring(0, 1).toUpperCase() + names.substring(1);
        }

    } // capitalizeNames


}