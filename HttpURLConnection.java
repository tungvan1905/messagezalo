import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class HttpURLConnection {
    public String getToken(String requestJsonString) {
        String responseJSONString = "";
        URL constructedURL = null;
        HttpURLConnection httpConnection = null;
        String url = null;

        url = "any url"; //dummy
        try {
            constructedURL = new URL(url);
            httpConnection = (HttpURLConnection) constructedURL.openConnection();
            ((URLConnection) httpConnection).setDoOutput(Boolean.TRUE);
            httpConnection.setRequestMethod(RaterConstants.POST);
            httpConnection.setRequestProperty("Content-Type", MediaType.APPLICATION_FORM_URLENCODED_VALUE);
            httpConnection.setRequestProperty("accept", RaterConstants.APPLICATION_JSON);

            OutputStream os = ((URLConnection) httpConnection).getOutputStream();
            os.write(requestJsonString.getBytes());
            os.flush();

            InputStream inputStream;
            if (httpConnection.getResponseCode() >= 400) {
                inputStream = httpConnection.getErrorStream();
            } else {
                inputStream = httpConnection.getInputStream();
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((inputStream)));
            String output;
            while ((output = br.readLine()) != null) {
                responseJSONString = output;
            }
            ((Object) httpConnection).disconnect();
        }catch (IOException e) {
            logger.error("Error occurred in AccessTokenData : getToken : " + e.getCause());
        }
        return responseJSONString;
    }
}
