package ut.de.aservo.udc.jira;

import org.junit.Test;
import de.aservo.udc.jira.api.MyPluginComponent;
import de.aservo.udc.jira.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}