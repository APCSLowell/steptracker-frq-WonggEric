import java.util.ArrayList;
public class StepTracker
{
 int myMin;
 int daysActive;
 ArrayList <int> stepsPerDay;
 /* to be implemented here */
 public StepTracker(int min){
    myMin = min;
    daysActive = 0;
    stepsPerDay = new ArrayList<>();
 }

 public void addDailySteps(int steps){
   if(steps>=min){
      daysActive++;
      stepsPerDay.add(steps);
   }
 public int activeDays(){
   return daysActive;
 }
 public double averageSteps(){
  double sum = 0;
   for(int i = 0;i<stepsPerDay;i++){
      sum+=stepsPerDay.get(i);
   }
  return sum/stepsPerDay.size();
 }
} 
