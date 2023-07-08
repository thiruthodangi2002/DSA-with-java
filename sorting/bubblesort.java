package sorting;

public class bubblesort {

  public static void printarray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = { 206, 37, 16, 81, 3 };
    // outerloop
    for (int i = 0; i < arr.length-1; i++) {
      // innerloop --- highest element auto matically sorted
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    printarray(arr);
  }
}
//time complexity is O(n^2)
