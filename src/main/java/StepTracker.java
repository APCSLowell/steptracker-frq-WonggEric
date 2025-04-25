import java.util.ArrayList;
public class StepTracker
{
 int myMin;
 int daysActive;
 ArrayList <Integer> stepsPerDay;
 /* to be implemented here */
 public StepTracker(int min){
    myMin = min;
    daysActive = 0;
    stepsPerDay = new ArrayList<>();
 }

 public void addDailySteps(int steps){
  stepsPerDay.add(steps);
   if(steps>=myMin){
    daysActive++;
   }
 }
 public int activeDays(){
   return daysActive;
 }
 public double averageSteps(){
  double sum = 0;
  if(stepsPerDay.size()==0){
     return 0.0;
  }
   for(int i = 0;i<stepsPerDay.size();i++){
      sum+=stepsPerDay.get(i);
   }
  return sum/stepsPerDay.size();
 }
} 
