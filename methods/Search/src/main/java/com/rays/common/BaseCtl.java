package com.rays.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rays.Ors16Application;

public class BaseCtl<F extends BaseForm, T extends BaseDTO, S extends BaseServiceInt<T>> {

	@Autowired
	protected S baseService;

	@Value("${page.size}")
	private int pageSize = 0;

	
	@RequestMapping(value = "/search/{pageNo}", method = { RequestMethod.POST, RequestMethod.GET })
	public ORSResponse search(@RequestBody F form, @PathVariable int pageNo) {
		ORSResponse res = new ORSResponse(true);

		pageNo = (pageNo < 0) ? 0 : pageNo;

		T dto = (T) form.getDTO();

		res.addData(baseService.search(dto, pageNo, pageSize));
		res.AddNextData(baseService.search(dto, pageNo + 1, pageNo));
		return res;

	}

}
