/** <h2> Sum Mixed Array </h2>
*
* Description:
*
* Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers. Return your answer as a number.
*
* <h2> Solution: </h2>
*/

import java.util.List;

public class MixedSum {

  public int sum(List<?> mixed) {
    return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
  }

}
