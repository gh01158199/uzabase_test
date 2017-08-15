
public class RssWriter {
	RssModel rssModel;
	
	public RssWriter(RssModel rssModel) {
		super();
		this.rssModel = rssModel;
	}

	public RssModel getRssModel() {
		return rssModel;
	}

	public void setRssModel(RssModel rssModel) {
		this.rssModel = rssModel;
	}
	
	public void printStdOutExcludingKeyword(String keyword) {
		String output = rssModel.getRssContent();
		output = output.replaceAll(keyword, "");
		System.out.println("Conversion result to std output: ");
		System.out.println(output);
	}
	
}
