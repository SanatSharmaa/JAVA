// //Various Sorting Algorithms Implementation for descending order
// public class Array {

//     public static void print(int arr[]){
//         for (int i = 0 ; i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void bubbleSort(int arr[]){
//         for (int turn = 0 ; turn<arr.length-1;turn++){

//             for (int j = 0; j<arr.length - 1 - turn;j++){

//                 if (arr[j]<arr[j+1]){
//                     int temp = arr[j+1];
//                     arr[j+1] = arr[j];
//                     arr[j] =temp; 
//                 }
//             }
//         }

//     }

//     public static void selectionSort(int arr[]){//For descending order
//         for (int i = 0 ; i<arr.length-2;i++){
//             int minPos = i;
//             //Finding the index of the min value in unsorted part of array
//             for (int j = i+1; j<arr.length;j++){

//                 if (arr[minPos]<arr[j]){
//                     minPos = j;
//                 }
//             }
//             //swap
//             int temp = arr[i];
//             arr[i] = arr[minPos];
//             arr[minPos] = temp;
//         }
//     }
//     public static void insertionSort(int arr[]){
//         for (int i = 1 ; i<arr.length;i++){
//             int curr = arr[i];
//             int prev = i-1;
//             while(prev>=0 && arr[prev]<curr){//for descending
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }
//             arr[prev+1] = curr;
//         }
//     }
//     public static void countingSort(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i = 0 ; i<arr.length;i++){
//             largest = Math.max(largest,arr[i]);
//         }
//         int count [] = new int[largest+1];
//         for (int i = 0 ; i<arr.length;i++){
//             count[arr[i]]++;
//         }

//         int j = 0;
//         for (int i = count.length-1 ; i>=0;i--){
//             while(count[i]>0){
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {3,6,2,1,8,7,4,5,3,1};
//         countingSort(arr);
//         print(arr);

//     }
// }



// //InBuilt Sort
// import java.util.Arrays;
// import java.util.Collections;
// public class Array{

//     public static void print(int arr[]){
//         for (int i = 0 ; i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main (String args[]){
//         int arr [] = {5,4,3,1,2};
//         Arrays.sort(arr);
//         print(arr);
//         //for reverse order 
//         // Integer arr [] = {5,4,3,1,2};
//         // Arrays.sort(arr,Collections.reverseOrder());
//         // print(arr);
//     }
// }
// //INSERTION SORT


// public class Arrays{

//     public static void print(int arr[]){
//         for (int i = 0 ; i<arr.length;i++){
//             System.out.print(arr[i]);
//         }
//     }

//     public static void insertionSort(int arr[]){

//         for(int i = 1 ; i<arr.length ; i++){
//             int curr = arr[i];
//             int prev = i-1;
//             //finding out the pos to insert
//             while(prev >=0 && arr[prev]>curr){
//                 arr[prev+1] = arr[prev];
//                 prev--; 
//             } 
//             //Insertion
//             arr[prev+1] = curr;
//         }
        
//     }
//     public static void main(String args[]){
//         int [] arr = {5,4,1,3,2};
//         insertionSort(arr);
//         print(arr);
//     }
// }








// //Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1   if it is not in nums.But the time complexity must be O(log n )

// public class Arrays {
//     public static void main(String args[]){
//         int nums [] = {4,5,6,7,8,9,0,1,2,3};
//         int target = 6;

//         System.out.println(findIndex(nums,target))
//         ;
//     }
//     public static int findIndex(int nums[],int target){
//         int left = 0;
//         int right = nums.length-1;

//         while(left<=right){

//             int mid = left + (right - left)/2;

//             if (nums[mid]==target){
//                 return mid;
//             }

//             if (nums[left]<=nums[mid]){
//                 //left half is sorted
//                 if (nums[left]<=target && target<nums[mid]){
//                     //Its in the left half
//                     right = mid - 1;
//                 }else{
//                     //Its in the right half 
//                     left = mid + 1;
//                 }

//             }else{
//                 if (nums[mid]<target && target <=nums[right]){
//                     //Its in the right half
//                     left = mid + 1;
//                 }else{
//                     //Its in the left half
//                     right = mid - 1;
//                 }
//             }
//         }

//         return -1;
//     }
// }
//
// public class Arrays {
//     public static void main(String args[]){
//         int arr [] = {0,1,2,3,4,5,6,7,8,9};
//         int tar = 8;
//         int mid = arr.length/2;
//         if (tar == arr[mid]){
//             System.out.println(mid);
//         }else if (arr[mid] > tar){
//             int start = 0;
//             int end = mid;
//             for (int i = start ; i<end;i++){
//                 if (arr[i]==tar){
//                     System.out.println(i);
//                 }
//             }
//         }else{
//             int start = mid +1;
//             int end = arr.length;
//             for(int i = start ; i<end ; i++){
//                 if (arr[i] == tar){
//                     System.out.println(i);
//                 }
//             }
//         }
//     }
// }


//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
/* 
public class Arrays {
    public static void main(String args[]){
        int arr [] = {1,2,3,4,2};
        
        boolean check = false;
        for (int i = 0; i<arr.length;i++){
            int temp = arr[i];
            for (int j = i+1 ; j<arr.length;j++){
                if (arr[i] == arr[j]){
                    check = true;
                }
            }
        }
        System.out.println(check);
    }
}
*/

//CONSTRUCTOR
/*class Arrays {
    private String name;
    private int age;

    {
        System.out.println("Welcome to the student portal!");
    }

    public Arrays(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    public static void main(String[] args) {
        Arrays student = new Arrays("Alice", 20);
        Arrays student2 = new Arrays("Sanat",19);
        student.displayStudentInfo();
        student2.displayStudentInfo();
    }
}*/






//PREFIX SUM ALGORITHM FOR FINDING MAXSUM OF SUBARRAY
/*
public class Arrays{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int prefix[] = new int [5];
        prefix[0] = arr[0];
        for (int i = 1; i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for (int i =0;i<prefix.length;i++){
            System.out.print(prefix[i]+" ");
        }System.out.println();
        int s = 1;
        int e = 3;
        int sum = prefix[e] - prefix[s-1];
        System.out.println(sum);
    }
}*/



/* 
import java.util.*;
public class Arrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows of array : ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int col = sc.nextInt();
        int arr1 [][] = new int [row][col];
        int arr[][] = new int[row][col];
        //enter elemenets of array
        for (int i = 0 ; i<arr.length;i++){
            for (int j = 0;j<arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //rotated array by 90 degree clockwise
        int k = 0;
        for (int i = 0 ;i<arr.length;i++){
            int l = 0;
            for (int j = arr.length-1 ; j>= 0;j--){
                
                System.out.print(arr[j][i]);   
                arr1[k][l] = arr[j][i];
                l++;
            }System.out.println();
            k++;
        }
        System.out.println();
        //again rotated array by 90 degree clockwise
        for (int i = 0 ;i<arr1.length;i++){
            for (int j = arr1.length-1 ; j>= 0;j--){
                System.out.print(arr1[j][i]);   
            }System.out.println();
        }        
    }
}*/


/*
//WAP TO FIND THE MAX SUM OF SUB ARRAYS
import java.util.*;
public class Arrays{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in a array : ");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.print("Enter elements of array : ");
        for (int i = 0 ; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int j = 0 ; j<arr.length ; j++){
            for (int i = j ; i<arr.length;i++){
                int temp_sum = 0;
                for(int l = j ; l<=i;l++){
                    System.out.print(arr[l] + " ");
                    temp_sum += arr[l];
                    if (temp_sum > sum){
                        sum = temp_sum;
                    }
                }System.out.println();
            }System.out.println();
            
        }System.out.println("maximum sum is : "+ sum);

    }
}
*/
/* 
//WAP TO FIND THE SADDLE POINT 
import java.util.*;

public class Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of array: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns of array: ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int current_element = arr[i][j];

                //for rows
                boolean isMinInRow = true;
                for (int k = 0; k < rows; k++) {
                    if (arr[i][k] < current_element) {
                        isMinInRow = false;
                        break;
                    }
                }

                // For col
                boolean isMaxInCol = true;
                for (int l = 0; l < cols; l++) {
                    if (arr[l][j] > current_element) {
                        isMaxInCol = false;
                        break;
                    }
                }

                if (isMinInRow && isMaxInCol) {
                    System.out.println("Saddle Point: " + current_element);
                    return; // Exit the program, as we've found the saddle point
                }
            }
        }
        System.out.println("No saddle point found in the array.");
    }
}*/

//IMPORTANT
/*Sample input 
a3 This1 is2 program4 

Sample output 
This is a program  */
/*
import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of words : ");
        int n = sc.nextInt();
        String str1 = sc.nextLine();
        System.out.print("Enter string : ");
        String str = sc.nextLine();
        String arr [] = new String [n];
        String words[] = str.split("\\s+");

        for (String word : words){
            int c = word.length();
            char num = word.charAt(c-1);
            int number = Character.getNumericValue(num);
            String str2 = word.substring(0,c-1);
            arr[number-1] = str2 + " ";
        }
        for (int i = 0;i<n ; i++){
            System.out.print(arr[i]);
        }
    }
}*/ 