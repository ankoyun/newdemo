package ls.hdgl.entity;

import java.util.Date;

/**
 * 活动实体类
 */
public class THd {
	private int id;
	private String actname;
	private String actnr;
	private String acttime;
	private Date starttime;
	private Date endtime;
	private int actzt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getActname() {
		return actname;
	}
	public void setActname(String actname) {
		this.actname = actname;
	}
	public String getActnr() {
		return actnr;
	}
	public void setActnr(String actnr) {
		this.actnr = actnr;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public String getActtime() {
		return acttime;
	}
	public void setActtime(String acttime) {
		this.acttime = acttime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public int getActzt() {
		return actzt;
	}
	public void setActzt(int actzt) {
		this.actzt = actzt;
	}
}
