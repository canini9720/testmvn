package com.testservice.soap;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.Holder;
import javax.xml.ws.WebServiceContext;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.testservice.dto.TestDTO;
import com.testservice.dto.TestSoapDTO;
import com.testservice.service.TestService;





@Component("testEndpoint")
@WebService
@SOAPBinding(style=Style.RPC, use=Use.LITERAL)
public class TestEndpoint {
	
	
	
	@Autowired
	TestService testService;
	
	@Resource
	WebServiceContext ctx;
	
	
	@WebMethod(action="testRequest")
	public void testRequest(@WebParam(name="testRequest") TestSoapDTO testSoapDTO,
								   	   @WebParam(name = "ReferenceNo", mode = WebParam.Mode.OUT) Holder<Long> refNoHolder) throws Exception{
		
		TestDTO testDTO = new TestDTO();
		
		BeanUtils.copyProperties(testSoapDTO, testDTO);
	
		try{
			//Thread.sleep(20000l);
			
			refNoHolder.value = 6548971l;
			refNoHolder.value = testService.saveTest(testDTO);
			
		}catch(Exception ex){
			
			throw ex;
		}
	}

}
