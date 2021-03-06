
package de.tudresden.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Sumo-Webservice", targetNamespace = "http://ws.tudresden.de/", wsdlLocation = "http://127.0.0.1:8080/TRAAS_WS?wsdl")
public class SumoWebservice
    extends Service
{

    private final static URL SUMOWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException SUMOWEBSERVICE_EXCEPTION;
    private final static QName SUMOWEBSERVICE_QNAME = new QName("http://ws.tudresden.de/", "Sumo-Webservice");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8080/TRAAS_WS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SUMOWEBSERVICE_WSDL_LOCATION = url;
        SUMOWEBSERVICE_EXCEPTION = e;
    }

    public SumoWebservice() {
        super(__getWsdlLocation(), SUMOWEBSERVICE_QNAME);
    }

    public SumoWebservice(WebServiceFeature... features) {
        super(__getWsdlLocation(), SUMOWEBSERVICE_QNAME, features);
    }

    public SumoWebservice(URL wsdlLocation) {
        super(wsdlLocation, SUMOWEBSERVICE_QNAME);
    }

    public SumoWebservice(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SUMOWEBSERVICE_QNAME, features);
    }

    public SumoWebservice(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SumoWebservice(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceImpl
     */
    @WebEndpoint(name = "Service_ImplPort")
    public ServiceImpl getServiceImplPort() {
        return super.getPort(new QName("http://ws.tudresden.de/", "Service_ImplPort"), ServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceImpl
     */
    @WebEndpoint(name = "Service_ImplPort")
    public ServiceImpl getServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.tudresden.de/", "Service_ImplPort"), ServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SUMOWEBSERVICE_EXCEPTION!= null) {
            throw SUMOWEBSERVICE_EXCEPTION;
        }
        return SUMOWEBSERVICE_WSDL_LOCATION;
    }

}
