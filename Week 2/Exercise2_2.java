class Printer { 
    // This are the methods in class Printer
    public void print() { 
		System.out.println("Hi! I class SCHOOL."); 
    } 
    public void print(String s) { 
		System.out.println(s); 
    } 
} 

public class Exercise2_2{ 
    public static void main(String[] args) {    
    Printer ptr = new Printer();
    ptr.print("Hi! I am class STUDENT");
    ptr.print();
    }
}