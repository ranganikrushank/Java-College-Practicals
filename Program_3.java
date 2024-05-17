public class Program_3 {
    public static void main(String[] args)
    {
        String inputFromStandardInput = getInputFromStandardInput();
        System.out.println("String from standard input: " + inputFromStandardInput);

        String inputFromCommandLine = args.length > 0 ? args[0] : "";
        System.out.println("String from command line argument: " + inputFromCommandLine);

        int length = inputFromStandardInput.length();
        System.out.println("Length of the string: " + length);

        String reversedString = reverseString(inputFromStandardInput);
        System.out.println("Reversed string: " + reversedString);

        String copiedString = inputFromStandardInput;
        System.out.println("Copied string: " + copiedString);

        String concatenatedString = inputFromStandardInput.concat(inputFromCommandLine);
        System.out.println("Concatenated string: " + concatenatedString);

        byte[] bytes = inputFromStandardInput.getBytes();
        System.out.println("Bytes extracted from string: " + new String(bytes));

        String substring = inputFromStandardInput.substring(2, 5);
        System.out.println("Substring: " + substring);

        boolean startsWith = inputFromStandardInput.startsWith("Hello");
        boolean endsWith = inputFromStandardInput.endsWith("World");
        System.out.println("Starts with 'Hello': " + startsWith);
        System.out.println("Ends with 'World': " + endsWith);

        int number = 123;
        String convertedString = String.valueOf(number);
        System.out.println("Converted string from integer: " + convertedString);

        String[] splitStrings = inputFromStandardInput.split("\\s+");
        System.out.println("Split string: ");

        for (String str : splitStrings)
        {
            System.out.println(str);
        }

        String replacedString = inputFromStandardInput.replace("World", "Universe");
        System.out.println("Replaced string: " + replacedString);

        int index = inputFromStandardInput.indexOf("World");
        System.out.println("Index of 'World': " + index);

        byte[] byteArray = inputFromStandardInput.getBytes();
        char[] charArray = inputFromStandardInput.toCharArray();
        
        System.out.println("String converted to byte array: " + new String(byteArray));
        System.out.println("String converted to character array: ");

        for (char c : charArray)
        {
            System.out.print(c + " ");
        }
        System.out.println();

        String upperCase = inputFromStandardInput.toUpperCase();
        String lowerCase = inputFromStandardInput.toLowerCase();
        System.out.println("Uppercase string: " + upperCase);
        System.out.println("Lowercase string: " + lowerCase);

        boolean isEqual = inputFromStandardInput.equals(inputFromCommandLine);
        boolean isEqualIgnoreCase = inputFromStandardInput.equalsIgnoreCase(inputFromCommandLine);
        System.out.println("Equality of strings (case-sensitive): " + isEqual);
        System.out.println("Equality of strings (case-insensitive): " + isEqualIgnoreCase);

        int hashCode = inputFromStandardInput.hashCode();
        System.out.println("Hashcode of the string: " + hashCode);
    }
    private static String getInputFromStandardInput()
    {
        return "Hello World";
    }
    private static String reverseString(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }
}