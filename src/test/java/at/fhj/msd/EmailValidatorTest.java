package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class EmailValidatorTest {
    @Test
    public void testEmailIsValid() {
        assertTrue(EmailValidator.isValid("user@example.com"));
    }

    @Test
    public void testEmailIsNotValid() {
        assertFalse(EmailValidator.isValid("userexample.org"));
    
    }

}
