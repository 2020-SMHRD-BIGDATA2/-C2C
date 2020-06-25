package m;

public class CycleVO {

	private String id;
	private String pw;
	private String name;
	private String pn;
	private String payment;
	
	
	public CycleVO(String id, String pw, String name, String pn) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.pn = pn;
	}
	
	public CycleVO(String id, String pw, String name, String pn, String payment) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.pn = pn;
		this.payment = payment;
	}


	public String getPayment() {
		return payment;
	}


	public void setPayment(String payment) {
		this.payment = payment;
	}


	public CycleVO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	public CycleVO(String name) {
		super();
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPn() {
		return pn;
	}


	public void setPn(String pn) {
		this.pn = pn;
	}
	
	
	
	
}
