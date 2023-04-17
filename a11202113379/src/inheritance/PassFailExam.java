/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author HP
 */
public class PassFailExam extends PassFailActivity {

    private int numberOfQuestion;
    private double pointsPerQuestion;
    private int numberMissed;
    
    public PassFailExam (int questions, int missed, double minPassing) {
    numberOfQuestion = questions;
    numberMissed = missed;
    }

    public double getPointsEach(){
        return pointsPerQuestion;
    }

    public int getNumMissed(){
        return numberMissed;
    }
    
}
