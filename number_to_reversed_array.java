/* <h2> Convert number to reversed array of digits </h2>
*
* Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
*
* Example(Input => Output):
*
* 348597 => [7,9,5,8,4,3]
* 0 => [0]
*
* <h2> Solution: </h2>
*/

public class Kata {
  public static int[] digitize(long n) {
    String s = Long.toString(n);
    int[] reversedDigits = new int[s.length()];
    for (int i = s.length()-1; i >= 0; i--){
      reversedDigits[s.length() - 1 - i] = Integer.parseInt(s.substring(i, i+1));
    }
    return reversedDigits;
  }
}

// Can also be done with something like this:

public class Kata {
  public static int[] digitize(long n) {
        return new StringBuilder().append(n)
                                  .reverse()
                                  .chars()
                                  .map(Character::getNumericValue)
                                  .toArray();
  }
}
