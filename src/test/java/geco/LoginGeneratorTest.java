package geco;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LoginGeneratorTest {

    LoginService log = new LoginService(new String[] {"JROL",
            "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});

    LoginGenerator logGen = new LoginGenerator(log);

    @Test
    public void CT2() {
        //String[] tabLog = {"LauraDuph", "LauDuf", "log3"};
        //LoginService log = new LoginService(tabLog);

        assertEquals("Pb : les 2 devraient être égaux : ", "JRAL2", logGen.generateLoginForNomAndPrenom("Ralling","John"));
        //assertNotEquals("Pb, les 2 devraient être dif : ", true, log.loginExists("log2"));
    }

    @Test
    public void CT1() {
        //String[] tabLog = {"LauraDuph", "LauDuf", "log3"};
        //LoginService log = new LoginService(tabLog);

        assertEquals("Pb : les 2 devraient être égaux : ", "PDUR", logGen.generateLoginForNomAndPrenom("Durand","Paul"));
        //assertNotEquals("Pb, les 2 devraient être dif : ", true, log.loginExists("log2"));
    }

    @Test
    public void CT3() {
        //String[] tabLog = {"LauraDuph", "LauDuf", "log3"};
        //LoginService log = new LoginService(tabLog);

        assertEquals("Pb : les 2 devraient être égaux : ", "JROL1", logGen.generateLoginForNomAndPrenom("Rolling","Jean"));
        //assertNotEquals("Pb, les 2 devraient être dif : ", true, log.loginExists("log2"));
    }

    @Test
    public void CT4() {
        //String[] tabLog = {"LauraDuph", "LauDuf", "log3"};
        //LoginService log = new LoginService(tabLog);

        assertEquals("Pb : les 2 devraient être égaux : ", "PDUR", logGen.generateLoginForNomAndPrenom("Dùrand","Paul"));
        //assertNotEquals("Pb, les 2 devraient être dif : ", true, log.loginExists("log2"));
    }

    @Test
    public void CT5() {
        //String[] tabLog = {"LauraDuph", "LauDuf", "log3"};
        //LoginService log = new LoginService(tabLog);

        assertEquals("Pb : les 2 devraient être égaux : ", "PDU", logGen.generateLoginForNomAndPrenom("Du","Paul"));
        //assertNotEquals("Pb, les 2 devraient être dif : ", true, log.loginExists("log2"));
    }
}
