package com.fsp.controller;

import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fsp.form.ProductForm;
import com.fsp.validator.ProductFormValidator;

@Controller
@RequestMapping("/add-product.htm")
public class ProductFormController {
	@Autowired
	private ProductFormValidator validator;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(validator);
	}

	@GetMapping
	public String showAddProductForm(ModelMap model) {
		ProductForm productForm = new ProductForm();

		model.addAttribute("productForm", productForm);
		return "add-product";
	}

	@PostMapping
	public String addProduct(@ModelAttribute("productForm") @Validated ProductForm productForm, BindingResult errors,
			ModelMap model) {

		/*
		 * if (validator.supports(productForm.getClass())) {
		 * validator.validate(productForm, errors); }
		 */

		if (errors.hasErrors()) {
			return "add-product";
		}
		// store the product data into database

		model.addAttribute("productName", productForm.getProductName());
		model.addAttribute("productNo", new SecureRandom().nextInt(83738));

		return "product-added-success";
	}

}
