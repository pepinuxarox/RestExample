package vo;

public class Feriado {
	
	@Override
	public String toString() {
		return "Feriado [date=" + date + ", title=" + title + ", extra=" + extra + "]";
	}
	private String date;
	private	String title;
	private String extra;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	
	
	

}
