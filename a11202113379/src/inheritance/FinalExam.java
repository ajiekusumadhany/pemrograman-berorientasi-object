/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author HP
 */
public class FinalExam extends GradedActivity{
        
    private int numberOfQuestion;
    private int numberMissed;
    private double pointsPerQuestion;
    
    public FinalExam(int questions, int missed){
        numberOfQuestion = questions;
        numberMissed = missed;
    }
    
    public int getNumberMissed(){
        return numberMissed;
    }
    
}
