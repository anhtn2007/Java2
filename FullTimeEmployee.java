package bai2;

public class FullTimeEmployee extends Employee{
		private double bonus;
		private double penalty;
		
		public double getBonus() {
			return bonus;
		}
		public boolean setBonus(double bonus) {
			if(bonus>=0) {
				this.bonus = bonus;
				return true;
			}
			return false;
		}
		public double getPenalty() {
			return penalty;
		}
		public boolean setPenalty(double penalty) {
			if(penalty>=0) {
				this.penalty = penalty;
				return true;
			}
			return false;
		}
		@Override
		public double income() {
			// TODO Auto-generated method stub
			return getBasicSalary() + bonus - penalty;
		}
		
}
