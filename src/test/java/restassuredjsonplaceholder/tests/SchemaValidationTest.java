package restassuredjsonplaceholder.tests;

import org.testng.annotations.Test;
import restassuredjsonplaceholder.utils.JsonPlaceholderAPI;

import static com.jayway.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

/**
 * See more at http://awesome-testing.blogspot.com/2016/07/restful-api-testing-with-rest-assured-1.html
 */
public class SchemaValidationTest {

    private JsonPlaceholderAPI jsonPlaceholderAPI = new JsonPlaceholderAPI();

    @Test
    public void schemaValidation() {
        jsonPlaceholderAPI.getPostContent(1)

                .then()
                .body(matchesJsonSchemaInClasspath("jsonplaceholder-posts-schema.json"));
    }

}
