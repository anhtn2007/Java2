package emtity;

public class ImportedProduct extends product {
		private double importTaxRate;
		private double shippingFee;
		
		public double getImportTaxRate() {
			return importTaxRate;
		}
		public boolean setImportTaxRate(double importTaxRate) {
			if(importTaxRate >= 0 && importTaxRate <= 1) {
				this.importTaxRate = importTaxRate;
				return true;
			
			}
				return false;
					
		}
		public double getShippingFee() {
			return shippingFee;
		}
		public boolean setShippingFee(double shippingFee) {
			if(shippingFee >= 0) {
			this.shippingFee = shippingFee;
			return true;
		}
				return false;
		}
		@Override
		public double finalPrice() {
			// TODO Auto-generated method stub
			return super.finalPrice() + super.finalPrice()*this.importTaxRate + this.shippingFee;
		}
		
}
