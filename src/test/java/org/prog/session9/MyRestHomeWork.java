package org.prog.session9;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class MyRestHomeWork {

    @Test
    public void checkLocationFields() {
        Response response = RestAssured.given()
                .baseUri("https://randomuser.me/")
                .basePath("api/")
                .queryParam("inc", "location")
                .queryParam("results", 3)
                .queryParam("noinfo")
                .get();

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertTrue(response.getContentType().contains("application/json"));

        List<Map<String, Object>> results = response.jsonPath().getList("results");

        for (Map<String, Object> person : results) {
            Map<String, Object> location = (Map<String, Object>) person.get("location");
            Map<String, Object> street = (Map<String, Object>) location.get("street");
            Map<String, String> coordinates = (Map<String, String>) location.get("coordinates");

            Assert.assertNotNull(street.get("number"), "Street number is null");
            Assert.assertNotNull(street.get("name"), "Street name is null");
            Assert.assertNotNull(coordinates.get("latitude"), "Latitude is null");
            Assert.assertNotNull(coordinates.get("longitude"), "Longitude is null");
        }
    }
}
