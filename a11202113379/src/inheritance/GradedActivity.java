/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author HP
 */
public class GradedActivity {
    
    private double score;
    private String name;
    
    public GradedActivity(){
        
    }
    
    public GradedActivity(String n){
        name = n;
    }
    
    public void setScore(double s){
        score = s;
    }
    
    public double getScore(){
        
        return score;   
    }
    
    public char getGrade(){
        char Grade = 0;
        return Grade;
    }
}
