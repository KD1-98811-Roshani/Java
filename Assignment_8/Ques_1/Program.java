package com.sunbeam;

import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

interface Stack {
    int STACK_SIZE = 3;

    void push(Employee e) throws StackOverFlow;
    Employee pop() throws StackUnderFlow;
}

class StackOverFlow extends Exception {
    public StackOverFlow(String message) {
        super(message);
    }
}

class StackUnderFlow extends Exception {
    public StackUnderFlow(String message) {
        super(message);
    }
}

class FixedStack implements Stack {
    private Employee[] arr;
    private int top;

    public FixedStack() {
        arr = new Employee[STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(Employee e) throws StackOverFlow {
        if (top == arr.length - 1)
            throw new StackOverFlow("Fixed Stack is Full!");
        arr[++top] = e;
    }

    @Override
    public Employee pop() throws StackUnderFlow {
        if (top == -1)
            throw new StackUnderFlow("Fixed Stack is Empty!");
        return arr[top--];
    }
}
class GrowableStack implements Stack {
    private Employee[] arr;
    private int top;

    public GrowableStack() {
        arr = new Employee[STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(Employee e) {
        if (top == arr.length - 1) {
            Employee[] temp = new Employee[arr.length * 2];

            for (int i = 0; i < arr.length; i++)
                temp[i] = arr[i];

            arr = temp;
        }

        arr[++top] = e;
    }

    @Override
    public Employee pop() throws StackUnderFlow {
        if (top == -1)
            throw new StackUnderFlow("Growable Stack is Empty!");
        return arr[top--];
    }
}
public class Program {
    static Scanner sc = new Scanner(System.in);
    static Stack stack = null;

    public int menuList() {
        if (stack == null) {
            System.out.println("1. Choose Fixed Stack");
            System.out.println("2. Choose Growable Stack");
        } else {
            System.out.println("3. Push Data");
            System.out.println("4. Pop Data");
        }

        System.out.println("5. Exit");
        System.out.print("Enter choice: ");

        return sc.nextInt();
    }

    public static void main(String[] args) {
        Program p = new Program();
        int choice;

        while ((choice = p.menuList()) != 5) {

            try {
                switch (choice) {

                case 1:
                    if (stack == null) {
                        stack = new FixedStack();
                        System.out.println("Fixed Stack Selected.");
                    } else {
                        System.out.println("Stack already selected!");
                    }
                    break;

                case 2:
                    if (stack == null) {
                        stack = new GrowableStack();
                        System.out.println("Growable Stack Selected.");
                    } else {
                        System.out.println("Stack already selected!");
                    }
                    break;

                case 3:
                    if (stack == null) {
                        System.out.println("NO stack chosen !!!");
                    } else {
                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Employee Salary: ");
                        double salary = sc.nextDouble();
                        Employee emp = new Employee(id, name, salary);
                        stack.push(emp);

                        System.out.println("Employee pushed successfully.");
                    }
                    break;

                case 4:
                    if (stack == null) {
                        System.out.println("NO stack chosen !!!");
                    } else {
                        Employee emp = stack.pop();

                        System.out.println("Popped Employee:");
                        System.out.println(emp);
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
                }

            } catch (StackOverFlow e) {
                System.out.println(e.getMessage());
            } catch (StackUnderFlow e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Program terminated.");
    }
}