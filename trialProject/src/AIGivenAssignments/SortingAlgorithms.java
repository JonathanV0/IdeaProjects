package AIGivenAssignments;

public class SortingAlgorithms {
    /*
    *SET count to zero

FOR each position except the last position
    SET minimum position to the current position

    FOR each remaining position to the right
        INCREASE count by one

        IF the examined value is smaller than the current minimum
            SET minimum position to the examined position
        END IF
    END FOR

    SWAP the current value with the minimum value
END FOR

RETURN count
    * */


    public static void SelectionSorter(int[] elements){
        int count = 0;
        for (int i = 0; i < elements.length; i++){
            int minIndex = i;
            for (int k = i + 1; k < elements.length; k++){
                count++;

                if (elements[k] < elements[minIndex]) {
                    minIndex = elements[k];
                }


            }

        }
    }
}
