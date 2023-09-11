import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LabTest {
    Lab lab;
    @Before
    public void setUp(){
        lab = new Lab();
    }

    /**
     * a basic url, such as revature's site, is valid
     */
    @Test
    public void validUrlTest1(){
        String url = "https://revature.com";
        boolean expected = true;
        boolean actual = lab.validate(url);
        Assert.assertEquals(expected, actual);
    }
    /**
     * a basic url, such as youtube's site, is valid
     */
    @Test
    public void validUrlTest2(){
        String url = "https://youtube.com";
        boolean expected = true;
        boolean actual = lab.validate(url);
        Assert.assertEquals(expected, actual);
    }
    /**
     * a valid url followed by a path is valid
     */
    @Test
    public void validUrlTestWithPath(){
        String url = "https://revature.com/partners/";
        boolean expected = true;
        boolean actual = lab.validate(url);
        Assert.assertEquals(expected, actual);
    }
    /**
     * a valid url followed by a path and a query param is valid
     */
    @Test
    public void validUrlTestWithQueryParam(){
        String url = "https://www.youtube.com/watch?v=Fk-4lXLM34g";
        boolean expected = true;
        boolean actual = lab.validate(url);
        Assert.assertEquals(expected, actual);
    }
    /**
     * a valid url followed by a path and multiple query params is valid
     */
    @Test
    public void validUrlTestWithMultipleQueryParam(){
        String url = "https://www.youtube.com/watch?v=Fk-4lXLM34g&t=72s";
        boolean expected = true;
        boolean actual = lab.validate(url);
        Assert.assertEquals(expected, actual);
    }
    /**
     * a valid url with any alphabetic extension is valid
     */
    @Test
    public void validUrlTestExt1(){
        String url = "https://tedbalashov.site";
        boolean expected = true;
        boolean actual = lab.validate(url);
        Assert.assertEquals(expected, actual);
    }
    /**
     * a valid url with any alphabetic extension is valid
     */
    @Test
    public void validUrlTestExt2(){
        String url = "https://youtube.mx";
        boolean expected = true;
        boolean actual = lab.validate(url);
        Assert.assertEquals(expected, actual);
    }
    /**
     * a valid url with any alphabetic extension is valid
     */
    @Test
    public void validUrlTestExt3(){
        String url = "https://youtube.ru";
        boolean expected = true;
        boolean actual = lab.validate(url);
        Assert.assertEquals(expected, actual);
    }
    /**
     * a valid url with any alphabetic extension is valid
     */
    @Test
    public void validUrlTestExt4(){
        String url = "https://youtube.ca";
        boolean expected = true;
        boolean actual = lab.validate(url);
        Assert.assertEquals(expected, actual);
    }
    /**
     * a completely invalid url should be rejected
     */
    @Test
    public void invalidUrlTest1(){
        String url = "tomato";
        boolean expected = false;
        boolean actual = lab.validate(url);
        Assert.assertEquals(expected, actual);
    }
    /**
     * a url that doesn't specific the correct web protocol should be rejected
     */
    @Test
    public void invalidUrlTestHttp1(){
        String url = "hbbps://revature.com";
        boolean expected = false;
        boolean actual = lab.validate(url);
        Assert.assertEquals(expected, actual);
    }
    /**
     * a url that is poorly formatted should be rejected
     */
    @Test
    public void invalidUrlTestHttp2(){
        String url = "https//revature.com";
        boolean expected = false;
        boolean actual = lab.validate(url);
        Assert.assertEquals(expected, actual);
    }
    /**
     * a url that is poorly formatted should be rejected
     */
    @Test
    public void invalidUrlTestHttp3(){
        String url = "https:revature.com";
        boolean expected = false;
        boolean actual = lab.validate(url);
        Assert.assertEquals(expected, actual);
    }
    /**
     * a url that lacks an extension should be rejected
     */
    @Test
    public void invalidUrlTestExt1(){
        String url = "https://revature";
        boolean expected = false;
        boolean actual = lab.validate(url);
        Assert.assertEquals(expected, actual);
    }
    /**
     * a url that lacks an extension should be rejected
     */
    @Test
    public void invalidUrlTestExt2(){
        String url = "https://revature.";
        boolean expected = false;
        boolean actual = lab.validate(url);
        Assert.assertEquals(expected, actual);
    }
    /**
     * a url that attempts to have a path before the file extension should be rejected
     */
    @Test
    public void invalidUrlTestPath1(){
        String url = "https://revature/partners.com";
        boolean expected = false;
        boolean actual = lab.validate(url);
        Assert.assertEquals(expected, actual);
    }
    /**
     * a url that attempts to establish a path after query params should be rejected
     */
    @Test
    public void invalidUrlTestPathQuery(){
        String url = "https://www.youtube.com?v=Fk-4lXLM34g/watch";
        boolean expected = false;
        boolean actual = lab.validate(url);
        Assert.assertEquals(expected, actual);
    }
}
