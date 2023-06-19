import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class ApiTest {
    @Test
    void test1(){
        Response response = RestAssured.get("http://computer-database.gatling.io/computers?f=hp");
        System.out.println("Response for HP Computer:"+response.asString());
    }
    @Test
    void test2(){
        Response response =RestAssured.get("http://computer-database.gatling.io/computers?f=ace");
        System.out.println("Response for ACE Computer:"+response.asString());
        int statusCode=response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }
    @Test
    void test3(){
        given().
                when().
                get("http://computer-database.gatling.io/computers?f=hp").
                then().
                statusCode(200);
    }

}


//This page includes 2 testcases for searching computers with their names using restAssured

