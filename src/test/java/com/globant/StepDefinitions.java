package com.globant;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class StepDefinitions {

    int result;

    @Given("a bowling game")
    public void aBowlingGame() {
    }

    @When("I roll the following line {string}")
    public void whenIRollLine(String lineStr) {
        ArrayList<Integer> line = new ArrayList<Integer>();
        for (String n : lineStr.split(",")) {
            try {
                line.add(Integer.parseInt(n));
            } catch (Exception e) {
                // TODO: handle exception
            }
        }        
        this.result = BowlingGame.getScore(line);
    }

    @Then("my score is {int}")
    public void theScenarioPasses(int expected) {
        assertEquals(expected, this.result);
    }

}
