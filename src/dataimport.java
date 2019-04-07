import java.net.URL;
import java.net.URLConnection;

public class dataimport{

    public static void main(String[] args) throws Exception{
        URL url = new URL("http://localhost:8983/solr/youthchinacore/dataimport?command=full-import");
        URLConnection im = url.openConnection();
    }
}