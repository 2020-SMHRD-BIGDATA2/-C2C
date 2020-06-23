package 하나둘셋야;

public class CycleVO {

	private String id;
	private String pw;
	private String name;
	private String pn;
	
	
	public CycleVO(String id, String pw, String name, String pn) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.pn = pn;
	}


	public CycleVO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
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
