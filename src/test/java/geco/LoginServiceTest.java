package geco;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LoginServiceTest {

    @Test
    public void loginExistsTest() {
        String[] tabLog = {"LauraDuph", "LauDuf", "log3"};
        LoginService log = new LoginService(tabLog);

        assertEquals("Pb : les 2 devraient être égaux : ", true, log.loginExists("log3"));
        assertNotEquals("Pb, les 2 devraient être dif : ", true, log.loginExists("log2"));
    }

    @Test
    public void loginAddOkTest() {
        String[] tabLog = {"LauraDuph", "LauDuf", "log3"};
        LoginService log = new LoginService(tabLog);

        assertNotEquals("Pb, les 2 devraient être dif : ", true, log.loginExists("log2"));
        log.addLogin("log2");
        assertEquals("Pb : les 2 devraient être égaux : ", true, log.loginExists("log2"));
    }

    @Test
    public void loginAddPbTest() {
        String[] tabLog = {"LauraDuph", "LauDuf", "log3"};
        LoginService log = new LoginService(tabLog);

        assertNotEquals("Pb, les 2 devraient être dif : ", true, log.loginExists("log2"));
        log.addLogin("log1");
        assertNotEquals("Pb : les 2 devraient être égaux : ", true, log.loginExists("log2"));
    }

    @Test
    public void findAllLoginsStartingWithTest() {
        String[] tabLog = {"LauraDuph", "LauDuf", "log3"};
        LoginService log = new LoginService(tabLog);

        List<String> commenceParLau ;
        commenceParLau=new ArrayList<>();
        commenceParLau.add("LauDuf");
        commenceParLau.add("LauraDuph");

        assertEquals("Pb : les 2 devraient être égaux : ", commenceParLau, log.findAllLoginsStartingWith("Lau"));

        assertNotEquals("Pb, les 2 devraient être dif : ", commenceParLau, log.findAllLoginsStartingWith("Pas"));
    }

    @Test
    public void findAllLoginsTest() {
        String[] tabLog = {"LauDuf", "LauraDuph", "log3"};
        LoginService log = new LoginService(tabLog);
        List<String> tout = Arrays.asList(tabLog);

        assertEquals("Pb : les 2 devraient être égaux : ", tout, log.findAllLogins());
        log.addLogin("log1");
        assertNotEquals("Pb, les 2 devraient être dif : ", tout, log.findAllLogins());
    }
}
