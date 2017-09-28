
public class Checkbook_Class implements Comparable {
//	private static final long serialVersionUID = -6381801229629928103L;
	
	private Integer checkNumber;
	private String payTo;
	private Double checkAmount;

	public Checkbook_Class(Integer checkNumber, String payTo,
			Double checkAmount) {
		super();
		this.checkNumber = checkNumber;
		this.payTo = payTo;
		this.checkAmount = checkAmount;
	}

	public Integer getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(Integer checkNumber) {
		this.checkNumber = checkNumber;
	}

	public String getPayTo() {
		return payTo;
	}

	public void setPayTo(String payTo) {
		this.payTo = payTo;
	}


	public Double getCheckAmount() {
		return checkAmount;
	}

	public void setCheckAmount(Double checkAmount) {
		this.checkAmount = checkAmount;
	}

	@Override
	public String toString() {
		return "Check [checkNumber = " + checkNumber + ", payTo = " + payTo
				+  ", checkAmount = " + checkAmount
				+ "]";
	}

	@Override
	public int compareTo(Object o) {
		Checkbook_Class that = (Checkbook_Class) o;	
		return this.checkNumber - that.checkNumber;
	}

	


}