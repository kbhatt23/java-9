package http2usage;

public class PostSyncExample {
public static void main(String[] args) throws Exception {
	String url = "http://www.example.com";
//	Http2Utility.callGetSync(url, false, null);
	
	//Http2Utility.callGetSync(url, true, "getsyncfile.txt");
	Http2Utility.callPostSync(url, false, null);
}
}
