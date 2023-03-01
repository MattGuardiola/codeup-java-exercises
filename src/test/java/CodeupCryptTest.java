import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodeupCryptTest {

    @Test
    public void testHashPwLetterA(){
        assertEquals("4bc",CodeupCrypt.hashPassword("Abc"));
    }

    @Test
    public void testHashPwLetterE(){
        assertEquals("3bc",CodeupCrypt.hashPassword("Ebc"));
    }

    @Test
    public void testHashPwLetterI(){
        assertEquals("1bc",CodeupCrypt.hashPassword("Ibc"));
    }

    @Test
    public void testHashPwLetterO(){
        assertEquals("0bc",CodeupCrypt.hashPassword("Obc"));
    }

    @Test
    public void testHashPwLetterU(){
        assertEquals("9bc",CodeupCrypt.hashPassword("Ubc"));
    }

    @Test
    public void testHashPwNoVoels(){
        assertEquals("plkvmw",CodeupCrypt.hashPassword("plkvmw"));
    }
}
