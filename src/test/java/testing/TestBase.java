package testing;

import org.junit.After;
import org.junit.Before;

public abstract class TestBase {

    protected TestManager manager;

    @Before
    public void setUp() {
        manager = new TestManager();
        manager.getNavHelper().navToHome();
    }

    @After
    public void tearDown() {
        manager.close();
    }
}
