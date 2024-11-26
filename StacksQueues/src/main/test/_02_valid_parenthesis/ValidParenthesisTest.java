
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import _02_valid_parenthesis.ValidParenthesis;

public class ValidParenthesisTest {

   @Test
  public void queueWithStacksTest() {
    ValidParenthesis validParenthesis = new ValidParenthesis();

    assertTrue(validParenthesis.isValid("([]){}"));
    assertFalse(validParenthesis.isValid("({)}"));
  }   
}
