/** <h2> Money, Money, Money </h2>
*
* Mr. Scrooge has a sum of money 'P' that he wants to invest. Before he does, he wants to know how many years 'Y' this sum 'P' has to be kept in the bank in order for it to amount to a desired sum of money 'D'.
*
* The sum is kept for 'Y' years in the bank where interest 'I' is paid yearly. After paying taxes 'T' for the year the new sum is re-invested.
*
* Note to Tax: not the invested principal is taxed, but only the year's accrued interest
*
*
* Your task is to complete the method provided and return the number of years 'Y' as a whole in order for Mr. Scrooge to get the desired sum.
*
* Assumption: Assume that Desired Principal 'D' is always greater than the initial principal. However it is best to take into consideration that if Desired Principal 'D' is equal to Principal 'P' this should return 0 Years.
*
* <h2> Solution: </h2>
*/

public class Money {
  public static int calculateYears(double principal, double interest,  double tax, double desired) {
    int years = 0;
    if (desired <= principal) return years;
    
    while (principal < desired) {
      double earnings = principal * interest;
      double taxes = earnings * tax;
      principal += (earnings - taxes);
      years += 1;
    }
    
    return years;
  }
}
