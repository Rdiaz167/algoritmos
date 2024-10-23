public class ValidParenthesisTest {

   @Test
  public void queueWithStacksTest() {
    ValidParenthesis validParenthesis = new ValidParenthesis();

    assertTrue(validParenthesis.isValid("([]){}"));
    assertFalse(validParenthesis.isValid("({)}"));
  }   
}
