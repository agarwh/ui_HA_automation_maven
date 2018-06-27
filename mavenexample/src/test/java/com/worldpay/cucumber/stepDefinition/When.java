package com.worldpay.cucumber.stepDefinition;

import com.HA.application.utilities.CreateSelectors;

public class When {

    @When("^I click on login automation$")
    public void clickTheLink(){


        CreateSelectors.CreateBasicSelector("a","text","Login automation");

   }
}
