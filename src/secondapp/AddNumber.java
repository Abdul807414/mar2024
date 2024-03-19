package secondapp;

import java.util.Scanner;

public class AddNumber {

public static void main(String args[])
{
        Scanner scanner = new Scanner(System.in);
System.out.println("ENTER FIRST VALUE");
int num1 = scanner.nextInt();
System.out.println("ENTER SECOND VALUE");
int num2 = scanner.nextInt();

int result = num1+num2;
System.out.println(result);
}
public static int addition(int num1, int num2)
{
int temp = num1;
temp =temp + num2;
return temp;
}
}

