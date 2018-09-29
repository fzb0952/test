package com.fan.image.controller.validate;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author Administrator
 *
 */
@Controller
public class validateController {

	@RequestMapping(value = "/getCode")
	public void getCode(HttpServletRequest request, HttpServletResponse response) {
		try {
	        response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
	        response.setHeader("Pragma", "No-cache");//设置响应头信息，告诉浏览器不要缓存此内容
	        response.setHeader("Cache-Control", "no-cache");
	        response.setDateHeader("Expire", 0);
	        RandomValidateCodeUtil randomValidateCode = new RandomValidateCodeUtil();
	        randomValidateCode.getRandcode(request, response);//输出验证码图片方法
	    } catch (Exception e) {
	    	
	    }
	}
	
	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	@ResponseBody
	public boolean validate(String validateCode, HttpSession session) {
	    try{
	        //从session中获取随机数
//	        String inputStr = requestMap.get("inputStr").toString();
	        String random = (String) session.getAttribute("RANDOMVALIDATECODEKEY");
	        if (random == null) {
	            return false;
	        }
	        if (random.equals(validateCode)) {
	        	System.out.println("ojbk");
	            return true;
	        } else {
	            return false;
	        }
	    }catch (Exception e){
	        return false;
	    }
	}
}
