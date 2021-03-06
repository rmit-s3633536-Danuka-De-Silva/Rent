package model;

import javafx.beans.property.SimpleStringProperty;

public abstract class Property {

		protected SimpleStringProperty property_Id;
		protected String Street_num;
		protected String Street_name;
		protected String Suburb;
		protected int Num_of_beds;
		protected SimpleStringProperty property_type;
		protected String property_status;
		protected DateTime lastMaintenanceDate;
		protected RentalRecords[] arr;

		public Property(){
			this.property_Id = new SimpleStringProperty();
			this.property_type = new SimpleStringProperty();
		}

//public Property(String property_Id, String Street_num, String Street_name, String Suburb, int Num_of_beds, String property_type, String property_status, DateTime lastMaintenanceDate)
//
//{
//	this.property_Id = property_Id;
//	this.Street_num = Street_num;
//	this.Street_name = Street_name;
//	this.Suburb = Suburb;
//	this.Num_of_beds = Num_of_beds;
//	this.property_type = property_type;
//	this. property_status = property_status;
//	this.lastMaintenanceDate = lastMaintenanceDate;
//	this.arr = new RentalRecords[10];
//}
      

	public abstract boolean rent(String customerID, DateTime rentDate, int numOfRentDay);
	
	public abstract boolean Return(DateTime returnDate);
	
	public abstract boolean performanceMaintenance();
	
	public abstract boolean completeMaintenance(DateTime completionDate);
	
	public abstract String toString();
	
	public abstract String getDetails();

	public String getProperty_Id() {
		return property_Id.get();
	}

	public void setProperty_Id(String property_Id) {
		this.property_Id.set(property_Id);
	}

	public String getProperty_type() {
		return property_type.get();
	}

	public void setProperty_type(String property_type) {
		this.property_type.set(property_type);
	}
	
	
	
}

