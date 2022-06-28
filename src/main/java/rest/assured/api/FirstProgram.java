package rest.assured.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstProgram {

	@Test
	public void test() {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());
		String bodyResponse = response.body().asString();
		System.out.println(bodyResponse);
	}
	
}
