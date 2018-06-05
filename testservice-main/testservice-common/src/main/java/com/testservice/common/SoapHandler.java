package com.testservice.common;

import java.util.Collections;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.WebFault;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.springframework.stereotype.Component;

import com.ctc.wstx.util.ExceptionUtil;



@Component
@WebFault
public class SoapHandler implements SOAPHandler<SOAPMessageContext> {
	
	//private static final Logger logger = Logger.getLogger(CommonConstants.LOGGER_DPSERVICES_ERROR);
	//private static final Logger loggerInfo = Logger.getLogger(CommonConstants.LOGGER_DPSERVICES_INFO);
	
    public Set<QName> getHeaders() {
        return Collections.emptySet();
    }
    
    public boolean handleMessage(SOAPMessageContext context) {
        
        
        /*SOAPMessage soapMessage =  context.getMessage();
    	SOAPPart soapPart = soapMessage.getSOAPPart();
    	SOAPEnvelope soapEnvelope;
    	
    	try {
    		
			soapEnvelope = soapPart.getEnvelope();
			SOAPBody soapBody = soapEnvelope.getBody();
			
			soapBody.getTextContent());
			
		} catch (SOAPException e) {
			
		}*/
        
        return true;
    }
    
    public boolean handleFault(SOAPMessageContext context) {
    	
    	
    	SOAPMessage soapMessage =  context.getMessage();
    	SOAPPart soapPart = soapMessage.getSOAPPart();
    	SOAPEnvelope soapEnvelope;
    	
		try {
			
			soapEnvelope = soapPart.getEnvelope();
			SOAPBody soapBody = soapEnvelope.getBody();
	    	SOAPFault soapFault = soapBody.getFault();
	    	
	    	String faultCode = CommonConstants.STR_ZERO;
	    	String faultMessage = CommonConstants.EXC_SERVER_ERROR;
	    	
	    	if(soapFault != null){
		    	
		    	String faultMsg = soapFault.getFaultString();
		    	
		    	if(faultMsg != null && !faultMsg.isEmpty()){
		    		
		    		String faultMsgs[] = faultMsg.split("-");
		    		
		    		/*if(faultMsgs.length > 1 && ExceptionUtil.DPSERVICES_EXCEPTION.equals(faultMsgs[2].trim())){
		    			
		    			faultCode = faultMsgs[0];
		    			faultMessage = faultMsgs[1];
		    			
		    			loggerInfo.info("SOAP FAULT : "+soapFault.getFaultString());
		    			
		    		}else if(faultMsg.contains(CommonConstants.DB_EXC_ORA_NO_DATA_FOUND)
		    				|| faultMsg.contains(CommonConstants.EXC_NO_DATA_FOUND_JPA_STR)){
		    			
		    			logger.error("SOAP FAULT : "+soapFault.getFaultString());
		    			
		    			faultCode = ExceptionBusinessConstants.NO_DATA_FOUND;
		    			faultMessage = ExceptionUtil.getErrorMessageFromProps(ExceptionBusinessConstants.NO_DATA_FOUND, ExceptionUtil.EXCEPTION_BUSINESS);
		    			
		    		}else{*/
		    			
		    			System.out.println("SOAP FAULT : "+soapFault.getFaultString());
		    			
		    			
		    			faultCode = CommonConstants.STR_ZERO;
		    			faultMessage = CommonConstants.EXC_SERVER_ERROR;
		    		//}
		    	}
	    	}
	    	
	    	soapFault.setFaultCode(faultCode);
	    	soapFault.setFaultString(faultMessage);
	    	
		} catch (Exception e) {
			System.out.println("SOAPException : "+ e);
			e.printStackTrace();
		}
    	
        return true;
    }

    public void close(MessageContext context) {
    }
}
