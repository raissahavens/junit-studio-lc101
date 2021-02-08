package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void BracketsFollowedByStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void BracketsWithStringPartiallyOutsideReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void BracketsWithStringsInsideReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void OneBracketWithStringsReturnsTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void OneBracketOnlyReturnsTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void OppositeBracketsReturnsTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

}
