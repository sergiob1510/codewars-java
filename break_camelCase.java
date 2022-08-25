/** <h2> Break camelCase </h2>
*
* Complete the solution so that the function will break up camel casing, using a space between words.
*
* <h2> Solutions: </h2>
*/

class Solution {
  public static String camelCase(String input) {
    String broken_camelcase = "";
    
    for (int i = 0; i < input.length(); i++) {
      if (Character.isUpperCase(input.charAt(i))) {
        broken_camelcase += " ";
      }
      broken_camelcase += input.charAt(i);
    }
    return broken_camelcase;
  }
}

// Using Regex

class Solution {
  public static String camelCase(String input) {
    return input.replaceAll("([A-Z])", " $1");
  }
}
