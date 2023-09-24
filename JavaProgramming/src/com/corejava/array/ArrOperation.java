package com.corejava.array;
import java.util.Scanner;
class Array {
int arr[];

public void getData() {
Scanner sc = new Scanner(System.in);
arr = new int[5];
System.out.println("Enter Elements :");
for(int i=0; i<arr.length; i++) {
arr[i] = sc.nextInt();
}
}

public void printData() {
System.out.println("Array Elements are :");
for(int i=0; i<arr.length; i++) {
System.out.println(arr[i]);
}
}

public void maxMin() {
int max = arr[0];
int min = arr[0];
for(int i=1; i<arr.length; i++) {
if(arr[i] > max) {
max = arr[i];
}
else {max = max;}
}
System.out.println("Maximun Element is : " +max);

for(int j =1; j<arr.length; j++) {
if(arr[j] < min) {
min = arr[j];
}
}
System.out.println("Minnimum Element is : " +min);
}

public void sortArray() {
int temp = 0;
for(int i=0; i<arr.length; i++) {
for(int j= i+1; j<arr.length; j++) {
if(arr[i] > arr[j]) {
temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}
}
System.out.println("Sorted array elements");
for(int i =0; i<arr.length; i++){
System.out.println(arr[i] + " ");
}
}

public void reverseArray() {
int[] rev = new int[5];
int j = 0;
for(int i=arr.length-1; i>=0; i--) {
rev[j] = arr[i];
j = j+1;
} 

System.out.println("Array in Reverse is :");
for(int i =0; i<arr.length; i++) {
System.out.println(rev[i]);
}
}

public void searchElement() {
int ele;
System.out.println("Enter Element you want to search");
Scanner sc = new Scanner(System.in);
ele = sc.nextInt();
for(int i=0; i<arr.length; i++) {
if(arr[i]==ele) {System.out.println("Element found at index : " + i );}
}
}

}

class ArrOperation {
public static void main(String s[]) {
Array a = new Array();
a.getData();
a.printData();
a.maxMin();
a.sortArray();
a.reverseArray();
a.searchElement();
}
}