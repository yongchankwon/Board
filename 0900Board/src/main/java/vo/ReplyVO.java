package vo;

public class ReplyVO {
	private int rnum;
	private int num;
	private String email;
	private String comment;
	private String regdate;
	
	public ReplyVO(int num, String email, String comment) {
		super();
		this.num = num;
		this.email = email;
		this.comment = comment;
	}
	public ReplyVO(int num, String email, String comment,String regdate) {
		super();
		this.num = num;
		this.email = email;
		this.comment = comment;
		this.regdate=regdate;
	}
	

	public int getRnum() {
		return rnum;
	}

	public int getNum() {
		return num;
	}

	public String getEmail() {
		return email;
	}

	public String getComment() {
		return comment;
	}


	public String getRegdate() {
		return regdate;
	}
	
	
	
	
}
