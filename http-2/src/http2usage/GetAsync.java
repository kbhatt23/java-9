package http2usage;

public class GetAsync {
public static void main(String[] args) throws Exception {
	String url = "http://www.example.com";
	Http2Utility.callGetASync(url, false, null);
}
}
