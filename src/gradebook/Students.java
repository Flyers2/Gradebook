/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gradebook;



import java.util.ArrayList;

public class Students {
    public String name;
    private ArrayList<Integer> grades = new ArrayList<Integer>();
    
    public Students (String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String showGrades(){   
        for(int test:grades){
             if (grades.isEmpty()){
               return name+" has no tests recorded";
                
                
             }
          int t =1;
          
          System.out.println("test "+t+":"+test);
          t++;
          
          
        
        }return "lala";
    }
    public void recordGrade(int grade){
        grades.add(grade);
        
    }
    
    public int getAverage() {
        int total = 0;
        for(int grade : grades) {
            //total = total + grade;
            total += grade;
        }
        //total = total / grades.size();
        total /= grades.size();
        return total;
    }
}
