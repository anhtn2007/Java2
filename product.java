package emtity;

public class product {
     private String id;
     private String name;
     private double basePrice;
     
	 public String getId() {
		 return id;
	 }
	 public boolean setId(String id) {
		 if(id !="") {
		 this.id = id;
		 return true;
		 }
		 return false;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public double getBasePrice() {
		 return basePrice;
	 }
	 public boolean setBasePrice(double basePrice) {
		 if(basePrice>=0) {
		 this.basePrice = basePrice;
		 return true;
		 }
		 return false;
	 }
	 
     public double finalPrice() {
    	 return this.basePrice;	 
     }
	 @Override
	 public String toString() {
		return "product [id=" + id + ", name=" + name + ", basePrice=" + basePrice + "]";
	 }
}
