package cse.testmodels;

public class ListTile {
	private String leadingTitle;
	private String leadingSubtitle;
	private String trailingTitle;
	private String trailingSubtitle;
	private String id;
	public String getLeadingTitle() {
		return leadingTitle;
	}
	public void setLeadingTitle(String leadingTitle) {
		this.leadingTitle = leadingTitle;
	}
	public String getLeadingSubtitle() {
		return leadingSubtitle;
	}
	public void setLeadingSubtitle(String leadingSubtitle) {
		this.leadingSubtitle = leadingSubtitle;
	}
	public String getTrailingTitle() {
		return trailingTitle;
	}
	public void setTrailingTitle(String trailingTitle) {
		this.trailingTitle = trailingTitle;
	}
	public String getTrailingSubtitle() {
		return trailingSubtitle;
	}
	public void setTrailingSubtitle(String trailingSubtitle) {
		this.trailingSubtitle = trailingSubtitle;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "ListTile [leadingTitle=" + leadingTitle + ", leadingSubtitle=" + leadingSubtitle + ", trailingTitle="
				+ trailingTitle + ", trailingSubtitle=" + trailingSubtitle + ", id=" + id + "]";
	}
	public ListTile(String leadingTitle, String leadingSubtitle, String trailingTitle, String trailingSubtitle,
			String id) {
		super();
		this.leadingTitle = leadingTitle;
		this.leadingSubtitle = leadingSubtitle;
		this.trailingTitle = trailingTitle;
		this.trailingSubtitle = trailingSubtitle;
		this.id = id;
	}
	
}
