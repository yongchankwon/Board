package vo;

public class ReplyVO {
	private int rnum;
	private int bnum;
	private String email;
	private String comment;
	private String regdate;
	
	public ReplyVO(int bnum, String email, String comment) {
		super();
		this.bnum = bnum;
		this.email = email;
		this.comment = comment;
	}
	public ReplyVO(int bnum, String email, String comment,String regdate) {
		super();
		this.bnum = bnum;
		this.email = email;
		this.comment = comment;
		this.regdate=regdate;
	}
	

	public int getRnum() {
		return rnum;
	}

	public int getBnum() {
		return bnum;
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
