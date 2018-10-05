package junit;

import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class MyAssertFalseTest {

//    public boolean isEvenNumber(int number) {
//
//        boolean result = false;
//        if (number % 2 == 0) {
//            result = true;
//        }
//        return result;
//    }

//    @Test
//    public void evenNumberTest() {
//        MyAssertFalseTest asft = new MyAssertFalseTest();
//        assertFalse(asft.isEvenNumber(3));
//    }

    public String getPropValue(final String key) {
        Map<String, String> appProps = new HashMap<String, String>();
        appProps.put("key1", "value 1");
        appProps.put("key2", "value 2");
        appProps.put("key3", "value 3");
        return appProps.get(key);
    }

    @Ignore
    @Test
    public void test() {
        MyAssertFalseTest msnt = new MyAssertFalseTest();
        assertNull(msnt.getPropValue("key4"));
    }


}