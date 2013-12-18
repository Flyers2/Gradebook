

package gradebook;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Gradebook {
     ArrayList<Students> StudentsNames=new ArrayList<>();//sets a student object array
     
     
private void controller(){
    System.out.println("Please choose from the following commands ");
    System.out.println("addName");
    System.out.println("addGrade   (the name must already exist to add a grade)");
    System.out.println("records    to check existing records");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    switch (input){
        case"addName":
            addName();
            break;
        case"addGrade":
            addGrade();
             
             
            break;
        case "records":
            checkRecord();
            break;
        default: System.err.println("You must enter a valid command");
        controller();
            break;
    
   }
    
}

public void addGrade(){
    System.out.println("please enter the name of the student");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
        for(Students n:StudentsNames){
            if (n.getName().equals(input)){
                for(;;){
              System.out.println("enter the test score you wish to add to "+ input );  //add grade to student and ask what next
               Scanner inscore = new Scanner(System.in);
               int grade = inscore.nextInt();
               n.recordGrade(grade);
               System.out.println("enter another score y/n");
               Scanner sc = new Scanner(System.in);
                    String input2 = sc.next();
                   
                    if ("y".equals(input2)){continue;}  
                    else{
                        controller();
                        return;
                    }
                    
                    
               
            }
        }
           }
    System.out.println("No students with the name "+input+" was found /n"
            + " press t to try again or press any key  to go to the main menu");
    Scanner scanner2 = new Scanner(System.in);
    String input2 = scanner2.next();
    switch (input2){
        case "t":
            addGrade();
            break;
        default: 
            controller();
            
    
    }
    
}
public void checkRecord(){
    if(StudentsNames.isEmpty()){
        System.err.println("There are no students on record");
        controller();
    }
        System.out.println("Please enter a name");
    Scanner scanner = new Scanner(System.in);
    String input= scanner.next();
     
    
      for(Students s:StudentsNames){
         if( s.getName().equals(input)){
             System.out.println(input +" found");
             s.showGrades();
          }
      }
}

   
    public static void main(String[] args) {
        Gradebook start = new Gradebook();
        for(;;)start.controller();
        
        
     /* Students s = new Students("Bob");
       Students s2 = new Students("Joe");
        
        for(int i = 0; i < 25; i++)
        {
            s.addGrade(r.nextInt(41) + 60);
            s2.addGrade(r.nextInt(41) + 60);
        }
        
        System.out.println(s.getName() + ": " + s.getAverage());
        System.out.println(s2.getName() + ": " + s2.getAverage());
             */
        
    }

   /* public Gradebook() {
        this.StudentsNames = new ArrayList<>();
    }
     */
    //public void addName(String name){
      //  StudentsNames.add(name);
   // }
    public void addName(){
        System.out.println("enter the student name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for(Students sname: StudentsNames){
            if (sname.getName().equals(name)){
                System.out.println(name+" is already a registered! press n to enter a new name or press any key to return to main menu");
                Scanner scanner2 = new Scanner(System.in);
                    String input2 = scanner2.next();
                    switch (input2){
                        case "n":
                            addName();
                            break;
                        default: 
                            controller();

                     }
             }
        }
        Students new_student = new Students(name);//starts the student class and passes in the string name as a parameter
        StudentsNames.add(new_student);//adds the new_student class object into the Studentnames array
        System.out.println(name +" had been added to the records hit n to add another name or press any key to return to the main menu ");
           Scanner scanner2 = new Scanner(System.in);
                    String input2 = scanner2.next();
                    switch (input2){
                        case "n":
                            addName();
                            break;
                        default: 
                            controller();

                     }
        
        /*for(Students sname: StudentsNames){
               Random r = new Random();
               sname.addGrade(r.nextInt(41)+60);
                 System.out.println(sname.getName()+ sname.getAverage());
                
                
            }
        
         
      // System.out.println(StudentsNames.get(0)+"  is in array"); //tests if item is in array
       addName();//runs the function again to add a new name
        
    }*/}
}
