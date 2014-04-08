public class RemoteWebDriverTest {
    public static WebDriver driver;
 
    @BeforeClass
    public static void conectarDriver() throws MalformedURLException {
         driver = new RemoteWebDriver(new URL("http://carlotesrandomice.no-ip.org:4444/wd/hub"));
    }
 
    @Test
    public void elTituloDeGoogleEsGoogle(){
        driver.get("http://www.google.es");
        assertEquals(driver.getTitle(), "Google");
    }
 
    @AfterClass
    public static void cerrarDriver(){
        driver.close();
    }