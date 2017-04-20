package com.bawono.tutorial.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bawono.tutorial.model.Berita;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Berita berita) {
		return "index";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String hasil(@Valid Berita berita, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "index";
		}
		berita.setTanggal(new Date());
		model.addAttribute("judul", berita.getJudul());
		model.addAttribute("berita", berita.getBerita());
		model.addAttribute("tanggal", berita.getTanggal());
		return "hasil";
	}
}
