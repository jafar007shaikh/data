
package classes;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SearchService", targetNamespace = "http://Classes/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SearchService {


    /**
     * 
     * @param data
     * @param emailid
     * @param algo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSearchService", targetNamespace = "http://Classes/", className = "classes.GetSearchService")
    @ResponseWrapper(localName = "getSearchServiceResponse", targetNamespace = "http://Classes/", className = "classes.GetSearchServiceResponse")
    @Action(input = "http://Classes/SearchService/getSearchServiceRequest", output = "http://Classes/SearchService/getSearchServiceResponse")
    public String getSearchService(
        @WebParam(name = "Emailid", targetNamespace = "")
        String emailid,
        @WebParam(name = "Data", targetNamespace = "")
        String data,
        @WebParam(name = "Algo", targetNamespace = "")
        String algo);

}
