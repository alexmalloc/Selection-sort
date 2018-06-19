/*
    Alex Malloc's selection sort algorithm implemented by Recursive function
*/
public class main
{
    public static void main(String[] args)
    {
        int[] numbers = {7,1, 2, 9, 10, 5,2, 29, 2131,13,0,0}; // Example array
        numbers = SelectionSort(numbers, 0); // Sorting
        for(int i = 0; i < numbers.length; i++) // Printing
            System.out.print(numbers[i]+ " ");
    }
    public static int[] SelectionSort(int[] input, int start) // Sort function
    {
        /*
            System Review:
            1) Make an int variable, if the lowest is found then we increment this
            2) Remember the index of lowest number
            3) Go through the array and if array is not sorted increment counter and remember the lowest index
            4) Replace first number by the lowest number
            5) Call again with incremented start
         */
        int counter = 0;
        int lowestIndex = start;
        for(int i = start; i< input.length; i++)
        {
            if(i+1 != input.length)
            {
                if (input[i + 1] < input[lowestIndex])
                {
                    lowestIndex = i+1;
                    counter++;
                }

            }
        }
        if(start != lowestIndex) {
            int temp = input[start];
            input[start] = input[lowestIndex];
            input[lowestIndex] = temp;
        }
        else if(start != input.length-1) {
            counter++;
        }

        if(counter > 0 )
        {
            return SelectionSort(input, ++start);
        }
        else {
            return input;
        }
    }
}
