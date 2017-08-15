import java.io.*;


public class RssSampleTest {
	
    public static void main(String[] args) throws IOException {
    	RssReader reader = new RssReader("http://tech.uzabase.com/rss");
    	reader.initRssModel();
    	
    	RssWriter writer = new RssWriter(reader.getRssModel());
    	writer.printStdOutExcludingKeyword("NewsPicks");
    }

}