
import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonObject;
import com.vng.zalo.sdk.APIException;
import com.vng.zalo.sdk.oa.ZaloOaClient;

public class Test {
	
public static void main(String[] args) throws APIException {
	ZaloOaClient client = new ZaloOaClient();
	String access_token = "wYjIO73KTJxiBr9gTz9_EEmhMsjmp0vKY6vxO7_mBZANGGnaQjXwMgD0NqX8tnfOY452S7FUPsIkLYHbSCq4D90oNs9gj25gi1S4H4Y4LMIfD0rLCvPR1gWEAbXXamXEdZ0gN4N9KNUYQNmcGl4lA8Lj37zwnI1hvMzjP7FAFt3fLs0b0wqMBSq-I0mkf6KwxbqI533UK0VfKZmnV_5H5AfP3XXiuMCFi1uI26gsPn-CEZay5B1c4_8JEpeMeaKgp1ve83Up8oJe3qSZAhKq9B4VJd5Vv1vKk4XSK4EloHHcTinrFm";
	Map<String, String> headers = new HashMap<>();
	headers.put("access_token", access_token);
	JsonObject id = new JsonObject();
	id.addProperty("user_id", "user_id");
	 
	JsonObject text = new JsonObject();
	text.addProperty("text", "text_message");
	 
	JsonObject body = new JsonObject();
	body.add("recipient", id);
	body.add("message", text);
	 
	JsonObject excuteRequest = client.excuteRequest("https://openapi.zalo.me/v2.0/oa/message", "POST", null, body, headers, null);
	System.out.println("runinggg...");

}
	
	


}			
