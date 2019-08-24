package code401challenges.MultiBracketValidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void test_multiBracketValidation() {
        MultiBracketValidation testThis = new MultiBracketValidation();
        assertTrue("Balanced brackets return true", testThis.multiBracketValidation("{}" ));
        assertTrue("Balanced brackets return true", testThis.multiBracketValidation("{}(){}" ));
        assertTrue("Balanced brackets return true", testThis.multiBracketValidation("()[[Extra Characters]]" ));
        assertTrue("Balanced brackets return true", testThis.multiBracketValidation("(){}[[]]" ));
        assertTrue("Balanced brackets return true", testThis.multiBracketValidation("{}{Code}[Fellows](())" ));
        assertFalse("Unbalanced brackets return false", testThis.multiBracketValidation("[({}]" ));
        assertFalse("Unbalanced brackets return false",testThis.multiBracketValidation("(](" ));
//        assertFalse("Unbalanced brackets return false",testThis.multiBracketValidation("{(})" ));
    }
}