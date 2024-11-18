package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ExampleSteps {

    private String username;
    private String password;
    private boolean loginSuccess;

    @Given("que o usuário está na página de login")
    public void queOUsuarioEstaNaPaginaDeLogin() {
        System.out.println("Usuário está na página de login");
        // Simulando a navegação para a página de login
    }

    @When("o usuário insere o username {string} e o password {string}")
    public void oUsuarioInsereOUsernameEPassword(String username, String password) {
        this.username = username;
        this.password = password;

        // Simulação de validação (em uma aplicação real, chamaria um método de login)
        loginSuccess = "user123".equals(username) && "senha123".equals(password);
    }

    @Then("o login é realizado com sucesso")
    public void oLoginERealizadoComSucesso() {
        Assert.assertTrue("Login falhou!", loginSuccess);
        System.out.println("Login realizado com sucesso");
    }
}
