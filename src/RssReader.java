import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class RssReader {
	private RssModel rssModel;
	private String rssLink;
	
	public RssReader(String rssLink) {
		this.rssLink = rssLink;
	}

	public RssModel getRssModel() {
		return rssModel;
	}

	public void setRssModel(RssModel rssModel) {
		this.rssModel = rssModel;
	}

	public String getRssLink() {
		return rssLink;
	}

	public void setRssLink(String rssLink) {
		this.rssLink = rssLink;
	}
	
	public void initRssModel() throws IOException{
		URL rssUrl = new URL (rssLink);
		BufferedReader in = new BufferedReader(new InputStreamReader(rssUrl.openStream()));
		rssModel = new RssModel();
		String line;
		String input = "";
		while((line=in.readLine())!=null){
			input = input + line + "\n" ;
		}
		rssModel.setRssContent(input);
		in.close();
	}
}
