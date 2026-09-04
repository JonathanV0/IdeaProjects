public class Yadayada {/** Returns an index in arr where the value x appears if x appears
 *  in arr between arr[left] and arr[right], inclusive;
 *  otherwise returns -1.
 *  Precondition: arr is sorted in ascending order.
 *                left >= 0, right < arr.length, arr.length > 0
 */

public static int mystery(int n)
{
    if (n == 0)
        return 1;
    else
        return 3 * mystery (n - 1);}


public static void main(String args[]){
    System.out.println(mystery(5));
}
}
