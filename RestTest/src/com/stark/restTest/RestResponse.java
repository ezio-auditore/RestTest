package com.stark.restTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.stark.bean.Say;

@XmlRootElement(name="Response")
@XmlAccessorType(XmlAccessType.FIELD)
public class RestResponse {
	
	@XmlElement(name="Say")
	private Say say;

	public Say getSay() {
		return say;
	}

	public void setSay(Say say) {
		this.say = say;
	}



	
	



}
