/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author HP
 */
public class PassFailActivity extends GradedActivity {
   
   private double minimumPassingScore;
   
   public PassFailActivity(double min){
       minimumPassingScore = min;
   }

    PassFailActivity() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
   public char getGraded(){
       return 0;
   }
}
