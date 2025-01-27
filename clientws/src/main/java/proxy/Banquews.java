
package proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "Banquews", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8189/?wsdl")
public class Banquews
    extends Service
{

    private static final URL BANQUEWS_WSDL_LOCATION;
    private static final WebServiceException BANQUEWS_EXCEPTION;
    private static final QName BANQUEWS_QNAME = new QName("http://ws/", "Banquews");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8189/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANQUEWS_WSDL_LOCATION = url;
        BANQUEWS_EXCEPTION = e;
    }

    public Banquews() {
        super(__getWsdlLocation(), BANQUEWS_QNAME);
    }

    public Banquews(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANQUEWS_QNAME, features);
    }

    public Banquews(URL wsdlLocation) {
        super(wsdlLocation, BANQUEWS_QNAME);
    }

    public Banquews(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANQUEWS_QNAME, features);
    }

    public Banquews(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Banquews(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BanqueService
     */
    @WebEndpoint(name = "BanqueServicePort")
    public BanqueService getBanqueServicePort() {
        return super.getPort(new QName("http://ws/", "BanqueServicePort"), BanqueService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BanqueService
     */
    @WebEndpoint(name = "BanqueServicePort")
    public BanqueService getBanqueServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "BanqueServicePort"), BanqueService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANQUEWS_EXCEPTION!= null) {
            throw BANQUEWS_EXCEPTION;
        }
        return BANQUEWS_WSDL_LOCATION;
    }

}
