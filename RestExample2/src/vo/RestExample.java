package vo;

import java.util.List;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

public class RestExample {

	public static void main(String[] args) {
		Client client = Client.create();

		WebResource webResource = client
		   .resource("https://feriados-cl-api.herokuapp.com/feriados");

		ClientResponse response = webResource.accept("application/json")
                   .get(ClientResponse.class);

		if (response.getStatus() != 200) {
		   throw new RuntimeException("Failed : HTTP error code : "
			+ response.getStatus());
		}

		List<Feriado> output = response.getEntity(new GenericType<List<Feriado>>(){});

		System.out.println("Output from Server .... \n");
		
		for(Feriado f: output) {
			if(f.getExtra().contains("Irrenunciable"))
				System.out.println(f.toString());
			
		}
		
	}


}
