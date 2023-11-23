package Static;



public class missing_no {

    public static void main(String[] args) {
      int arr[]={1,2,3,4,7,8};
      int size=arr.length;
      //sum including the given missing no
      int newSum= (size+1)*(size+2)/2;
      
      //sum of only array without including missing no

      int sum = 0; // initialize sum
      int i;

      // Iterate through all elements and add them to sum
      for (i = 0; i < arr.length; i++){
          sum += arr[i];

    }
    // we need to compare the oldsum and newsum
    int x;
    //x be the the missing no
    x=newSum-sum;
    System.out.println("the missing ele is"+x);

}
}















