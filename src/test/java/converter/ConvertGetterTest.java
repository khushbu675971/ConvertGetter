package converter;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class ConvertGetterTest {
    private ConvertGetter convertGetter;

    @Before
    public void setUp() {
        convertGetter = new ConvertGetter();
    }

    @Test
    public void testCamelCaseFormat() {
        assertEquals("Currency", convertGetter.getterMethodNameConvertion("getCurrency"));
        assertEquals("Account_Name", convertGetter.getterMethodNameConvertion("getAccountName"));
        assertEquals("Long_Account_Name", convertGetter.getterMethodNameConvertion("getLongAccountName"));
        assertEquals("Trade_ID", convertGetter.getterMethodNameConvertion("getTradeID"));
        assertEquals("SWIFT_Code", convertGetter.getterMethodNameConvertion("getSWIFTCode"));
    }
}