package com.bawono.tutorial.model;

import java.util.Date;

import javax.validation.constraints.Size;

public class Berita {
	@Size(min = 4, max = 50) // validasi minimal 4 dan maksimal 50 karakter
	private String judul;
	@Size(min = 10, max = 1000, message = "Panjang minimal 10 dan maksimal 1000 karakter")
	private String berita; // validasi minimal 30 dan maksimal 1000 karakter

	private Date tanggal;

	public String getJudul() {
		return judul;
	}

	public void setJudul(String judul) {
		this.judul = judul;
	}

	public String getBerita() {
		return berita;
	}

	public void setBerita(String berita) {
		this.berita = berita;
	}

	public Date getTanggal() {
		return tanggal;
	}

	public void setTanggal(Date tanggal) {
		this.tanggal = tanggal;
	}

}
