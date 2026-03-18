package bai2;

public class PartTimeEmployee extends Employee {
      private double workingHours;
      private double hourlyRate ;
      
	  public double getWorkingHours() {
		  return workingHours;
	  }
	  public boolean setWorkingHours(double workingHours) {
		  if(workingHours >=0) {
		  this.workingHours = workingHours;
		  return true;
		  }
		  return false;
	  }
	  public double getHourlyRate() {
		  return hourlyRate;
	  }
	  public boolean setHourlyRate(double hourlyRate) {
		  if( hourlyRate >=0) {
		  this.hourlyRate = hourlyRate;
		  return true;
		  }
		  return false;
	  }
	  @Override
	  public double income() {
		// TODO Auto-generated method stub
		return workingHours * hourlyRate;
	  }
	  
}
