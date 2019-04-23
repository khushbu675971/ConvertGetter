package converter;

public class ConvertGetter {

    // To split Camel case and Title case letters
    private static String[] splitByCapitalLetters(String input) {
        return input.split("(?<=\\p{Ll})(?=\\p{Lu})|(?<=\\p{L})(?=\\p{Lu}\\p{Ll})");
    }

    private static String removeLastSeperator(String lastSepString){
        //Remove last separator
        if (lastSepString.endsWith("_")) {
            lastSepString = lastSepString.substring(0, lastSepString.length() - "_".length());
        }
        return lastSepString;
    }

    public static String getterMethodNameConvertion(String input) {
        if(input == null) System.out.println("Cannot convert empty string");

        // Remove get from function name
        String s1 = input.replace("get","");

        StringBuilder str = new StringBuilder();

        // Append "-" after spliting by capital letters
        for(String s2: splitByCapitalLetters(s1)) {
            str.append(s2);
            str.append("_");
        }

        // Remove last seperator
        return removeLastSeperator(str.toString());
    }

    public static void main(String[] args) {
        for(String arg: args) {
            System.out.println(getterMethodNameConvertion(arg));
        }
    }
}
