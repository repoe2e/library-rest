package consultas;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;

public class ListarLivrosTest {

	@Test
	public void listarLivros() {

		RestAssured.given().when().get("http://localhost:8085/api/livros").then().statusCode(200);

	}

}
