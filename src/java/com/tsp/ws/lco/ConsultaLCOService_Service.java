
package com.tsp.ws.lco;

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
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "consultaLCOService", targetNamespace = "http://lco.ws.tsp.com/", wsdlLocation = "http://sctmixcoac.from-la.net:8084/LCO_WS/consultaLCOService?wsdl")
public class ConsultaLCOService_Service
    extends Service
{

    private final static URL CONSULTALCOSERVICE_WSDL_LOCATION;
    private final static WebServiceException CONSULTALCOSERVICE_EXCEPTION;
    private final static QName CONSULTALCOSERVICE_QNAME = new QName("http://lco.ws.tsp.com/", "consultaLCOService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://sctmixcoac.from-la.net:8084/LCO_WS/consultaLCOService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTALCOSERVICE_WSDL_LOCATION = url;
        CONSULTALCOSERVICE_EXCEPTION = e;
    }

    public ConsultaLCOService_Service() {
        super(__getWsdlLocation(), CONSULTALCOSERVICE_QNAME);
    }

    public ConsultaLCOService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ConsultaLCOService
     */
    @WebEndpoint(name = "consultaLCOServicePort")
    public ConsultaLCOService getConsultaLCOServicePort() {
        return super.getPort(new QName("http://lco.ws.tsp.com/", "consultaLCOServicePort"), ConsultaLCOService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaLCOService
     */
    @WebEndpoint(name = "consultaLCOServicePort")
    public ConsultaLCOService getConsultaLCOServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://lco.ws.tsp.com/", "consultaLCOServicePort"), ConsultaLCOService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTALCOSERVICE_EXCEPTION!= null) {
            throw CONSULTALCOSERVICE_EXCEPTION;
        }
        return CONSULTALCOSERVICE_WSDL_LOCATION;
    }

}