package com.testservice;

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
import org.springframework.stereotype.Component;

import com.ctc.wstx.util.ExceptionUtil;
import com.testservice.dto.ElephantRidingDTO;
import com.testservice.dto.ElephantRidingSoapDTO;





@Component("elephantRidingEndpoint")
@WebService
@SOAPBinding(style=Style.RPC, use=Use.LITERAL)
public class ElephantRidingEndpoint {
	
	
	
	@Resource
	WebServiceContext ctx;
	
	
	@WebMethod(action="elephantRidingRequest")
	public void horseRidingRequest(@WebParam(name="elephantRidingRequest") ElephantRidingSoapDTO elephantRidingSoapDTO,
								   	   @WebParam(name = "ReferenceNo", mode = WebParam.Mode.OUT) Holder<Long> refNoHolder) throws Exception{
		
		ElephantRidingDTO horseRidingDTO = new ElephantRidingDTO();
		
		BeanUtils.copyProperties(elephantRidingSoapDTO, horseRidingDTO);
	
		try{
			Thread.sleep(20000l);
			
			refNoHolder.value = 6548971l;
			
		}catch(Exception ex){
			
			throw ex;
		}
	}

}
