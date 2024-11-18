package runners;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PokemonApiTest {

    @Test
    public void testGetPokemonByName() {
        // Configurar a base URI da API do Pokémon
        RestAssured.baseURI = "https://pokeapi.co/api/v2";

        // Nome do Pokémon a ser consultado
        String pokemonName = "pikachu";

        // Realizar a requisição GET
        Response response =
                given()
                        .log().all() // Logar a requisição
                        .when()
                        .get("/pokemon/" + pokemonName) // Endpoint da API
                        .then()
                        .log().all() // Logar a resposta
                        .statusCode(200) // Verificar que o status é 200
                        .body("name", equalTo(pokemonName)) // Verificar que o nome corresponde
                        .extract()
                        .response();

        // Verificar outros dados manualmente
        String baseExperience = response.jsonPath().getString("base_experience");
        System.out.println("Base Experience of " + pokemonName + ": " + baseExperience);
    }
}