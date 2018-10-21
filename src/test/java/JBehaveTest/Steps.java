package JBehaveTest;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertTrue;

public class Steps {

    private int a;
    private int b;
    private int c;
    private int max;

    @Given("three numbers")
    public void numbers() {
        a = 0;
        b=0;
        c=0;
        max = 0;
    }

    @When("I enter three numbers a = $a, b = $b, c = $c")
    public void enterNumbers(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Then("$max is max of three numbers")
    public void printMax(int max) {
        assertTrue(max == findMax());
    }


    public int findMax()
    {
        if(a>0 && b>0 && c>0)
        {
            max = a;

            if(max<b)
            {
                max = b;
            }

            if(max<c)
            {
                max = c;
            }

            return max;
        }

        return -1;
    }


}