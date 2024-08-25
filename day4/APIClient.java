package week2.day4;

public class APIClient {
	
	// Method overloading
	
	 public void sendRequest(String endpoint) {
	        System.out.println("Sending request to endpoint: " +endpoint);
	    }

	    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
	        System.out.println("Sending request to endpoint: " +endpoint);
	        System.out.println("Request body: " +requestBody);
	        System.out.println("Request status: " +requestStatus);
	    }

	    public static void main(String[] args) {
	       
	        APIClient client = new APIClient();
	        client.sendRequest("Testleaf");
	        client.sendRequest("Testleaf", "Method overloading", true);
	    }
	}

