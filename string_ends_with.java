/* <h2> String ends with? </h2>
*
* Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
*
* Examples:
*
* solution('abc', 'bc') // returns true
* solution('abc', 'd') // returns false
*
* <h2> Solution: </h2>
*/

public class Kata {
  public static boolean solution(String str, String ending) {
    return str.endsWith(ending);
  }
}
