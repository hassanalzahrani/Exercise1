import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter height (m): ");
        double height = scanner.nextDouble();
        
        double bmi = weight / (height * height);
        System.out.println("BMI = " + bmi);

        System.out.print("Enter obtained marks: ");
        double obtainedMarks = scanner.nextDouble();
        
        System.out.print("Enter total marks: ");
        double totalMarks = scanner.nextDouble();
        
        double percentage = (obtainedMarks / totalMarks) * 100;
        System.out.println("Percentage = " + percentage + "%");


        System.out.print("Enter amount in USD: ");
        double amountInUSD = scanner.nextDouble();
        
        System.out.print("Enter exchange rate (USD to EUR): ");
        double exchangeRate = scanner.nextDouble();
        
        double amountInEUR = amountInUSD * exchangeRate;
        System.out.println("Amount in EUR = " + amountInEUR);

        scanner.nextLine();

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        int length = inputString.length();
        String reversedString = new StringBuilder(inputString).reverse().toString();
        System.out.println("Length of the string: " + length);
        System.out.println("Reversed string: " + reversedString);

     
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();
        
        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();
        
        String substring = sentence.substring(startIndex, endIndex);
        System.out.println("Extracted substring: " + substring);

        scanner.nextLine(); 

        System.out.print("Enter a sentence: ");
        sentence = scanner.nextLine();
        
        System.out.print("Enter a keyword: ");
        String keyword = scanner.nextLine();
        
        boolean isPresent = sentence.contains(keyword);
        System.out.println("Keyword \"" + keyword + "\" is " + (isPresent ? "present" : "not present") + " in the sentence.");

        System.out.print("Enter a sentence: ");
        sentence = scanner.nextLine();
        
        System.out.print("Enter word to replace: ");
        String wordToReplace = scanner.nextLine();
        
        System.out.print("Enter replacement word: ");
        String replacementWord = scanner.nextLine();
        
        String modifiedSentence = sentence.replace(wordToReplace, replacementWord);
        System.out.println("Modified sentence: " + modifiedSentence);

        System.out.print("Enter first string: ");
        String string1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String string2 = scanner.nextLine();
        
        boolean areEqual = string1.equalsIgnoreCase(string2);
        System.out.println("Strings are " + (areEqual ? "equal" : "not equal") + " (ignoring case).");

        scanner.close();
    }
}
