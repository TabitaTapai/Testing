/*Declare and initialize 2 Strings and a char.
If the first string doesn’t contain the char and the length of the string is > 3, the second string should have the following format:
 <char><last3CharactersOfTheFirstString><char>
If the string doesn’t contain the char and the length is <=3 , the new string should have the following format:
 <char><FirstString>. Print the value of the second string.
*/

public class Homework4 {
    public static void main(String[] args) {
        String myString = "hhvkhk";
        char myChar = 'x';
        int lengthOfMyString = myString.length();

        // verify if string contains my char and length of the string
        if (!myString.contains("" + myChar + "") && myString.length() > 3){
            System.out.println(myChar + myString.substring(myString.length() - 3) + myChar);
        }
        else if (!myString.contains("" + myChar + "") && lengthOfMyString <= 3){
            System.out.println(myChar + myString);
        }
        else {
            System.out.println("The string contain " + myChar);
        }
    }
}
