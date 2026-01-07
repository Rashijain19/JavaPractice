package Session11;

public class Lab117_TwoDimensionalArray_Program {
    public static void main(String[] args) {
        int arr[][] = { {23, 1000, 90},
                        {67, 10, 900},
                        {300, 76, 200}};
        //Find the maximum number
        int max_num = arr[0][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
            {
              if (arr[i][j] > max_num)
              {
                max_num = arr[i][j];
              }
            }
        }
        System.out.println("The highest number is:" + max_num);
    }
}

