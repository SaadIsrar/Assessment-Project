package restassured;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Ignore;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PetClinicControl {
	private Response response;
	private RequestSpecification request;

	@Test
	@Ignore
	public void getdata() {
		RestAssured.baseURI = ("http://10.0.10.10:9966/petclinic/api/owners");
		RequestSpecification request = given().contentType(ContentType.JSON);
		JSONObject addata = new JSONObject();

		addata.put("id", "1");
		addata.put("firstname", "George");
		addata.put("lastname", "Franklin");
		addata.put("address", "110 W.Liberty St");
		addata.put("city", "Maddison");
		addata.put("telephone", "075455656636");

		System.out.println(addata);
		request.body(addata.toString());
		Response response = request.post("http://10.0.10.10:9966/petclinic/api/owners");
		System.out.println(response.getStatusCode());
	}

	@Test
	public void postdata() {

		JSONArray petArray = new JSONArray();
		JSONArray visitArray = new JSONArray();
		RestAssured.baseURI = "http://10.0.10.10:9966/petclinic/api/owners";

		Map<String, Object> emptyOwner = new HashMap<>();
		Map<String, Object> emptyPet = new HashMap<>();
		Map<String, Object> nestedVisitAsMap = new HashMap<>();

		nestedVisitAsMap.put("date", "1990/02/28");

		nestedVisitAsMap.put("description", "bengalcat");

		nestedVisitAsMap.put("id", 5);

		nestedVisitAsMap.put("pet", "bengal");

		visitArray.add(nestedVisitAsMap);

		Map<String, Object> nestedPetAsMap = new HashMap<>();

		Map<String, Object> nestedTypeAsMap = new HashMap<>();

		nestedTypeAsMap.put("id", 0);

		nestedTypeAsMap.put("name", "String");

		nestedPetAsMap.put("birthDate", "2018-07-27T09:02:40.767Z");

		nestedPetAsMap.put("id", 0);

		nestedPetAsMap.put("name", "String");

		nestedPetAsMap.put("owner", emptyOwner);

		nestedPetAsMap.put("type", nestedTypeAsMap); // needs nested type TODO

		nestedPetAsMap.put("visits", visitArray); // needs nested type TODO

		petArray.add(nestedPetAsMap);

		JSONObject requestParams = new JSONObject();

		requestParams.put("address", "3 A Dorset");

		requestParams.put("city", "Bristol");

		requestParams.put("firstName", "Paul");

		requestParams.put("id", 10);

		requestParams.put("lastName", "Jason");

		requestParams.put("pets", petArray);

		requestParams.put("telephone", "07586546787");

		given().contentType(ContentType.JSON).body(requestParams).when().post("/").then().statusCode(201);

		System.out.println(requestParams.toString());
	}

	@Test
	@Ignore
	public void deletedata() {
		request = given().contentType(ContentType.JSON);
		response = request.delete("http://10.0.10.10:9966/petclinic/api/owners/2");
	}

	@Test
	public void updatedata() {
		request = given().contentType(ContentType.JSON);
		JSONObject changedata = new JSONObject();

		changedata.put("city", "Cardiff");
		changedata.put("description", "Bike");
		changedata.put("id", 8);
		changedata.put("name", "Smith");
		changedata.put("rating", 6.5);

		request.body(changedata.toString());
		response = request.put("http://10.0.10.10:9966/petclinic/api/owners/5");
		response = request.get("http://10.0.10.10:9966/petclinic/api/owners/5");

		System.out.println("response:" + response.prettyPrint());

		System.out.println(response.getStatusCode());

	}

}
