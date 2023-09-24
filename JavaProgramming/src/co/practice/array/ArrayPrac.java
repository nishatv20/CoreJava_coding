import java.util.Scanner; 
class Test {
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
System.out.println("Array Elements Are :");
for(int i =0; i<arr.length; i++) {
System.out.println(arr[i]);
}
}

}

class ArrayPrac {
public static void main(String s[]) {
Test t = new Test();
t.getData();
t.printData();
}
}