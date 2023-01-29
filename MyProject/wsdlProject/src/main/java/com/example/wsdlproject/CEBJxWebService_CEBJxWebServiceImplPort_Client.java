
package com.example.wsdlproject;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 4.0.0
 * 2022-12-27T14:06:32.749+08:00
 * Generated source version: 4.0.0
 *
 */
public final class CEBJxWebService_CEBJxWebServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://impl.service.web.custom.baiwang.com/", "CEBJxWebServiceImplService");

    private CEBJxWebService_CEBJxWebServiceImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CEBJxWebServiceImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        CEBJxWebServiceImplService ss = new CEBJxWebServiceImplService(wsdlURL, SERVICE_NAME);
        CEBJxWebService port = ss.getCEBJxWebServiceImplPort();

        {
        System.out.println("Invoking findInvoice...");
        java.lang.String _findInvoice_invoiceRequest = "";
        java.lang.String _findInvoice__return = port.findInvoice(_findInvoice_invoiceRequest);
        System.out.println("findInvoice.result=" + _findInvoice__return);


        }

        System.exit(0);
    }

}