package Assistedprojects;
public class BinarySearchAlgorithm {
    public static  void main(String[] args){

        int[] arr = {2 , 8 , 16 , 19 , 28 , 45 , 48 , 57 , 63 , 72 , 78 , 88};
        int key = 72;
        int arrlength = (arr.length-1); 
        binarySearch(arr,0,key,arrlength);
    }

public static void binarySearch(int[] arr, int start, int key, int length){

        int midValue = (start+length)/2;       
        while(start<=length){

            if(arr[midValue]<key){
                start = midValue + 1;
            } else if(arr[midValue]==key){
                System.out.println("Element is found at index :"+midValue);
                break;
            }else {

                length=midValue-1;
            }
            midValue = (start+length)/2;
        }
            if(start>length){

                System.out.println("Element is not found");
            }      
    }

}
