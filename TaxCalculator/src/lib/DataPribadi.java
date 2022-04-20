package lib;

public class DataPribadi {
    private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;

    public DataPribadi(String employeeId, String firstName, String lastName, String idNumber, String address) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;
	}

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setAddress(String address) {
        private String address;
    }

    public String getEmployeeId(){
        return this.employeeId;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
}
