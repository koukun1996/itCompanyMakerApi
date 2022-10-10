package com.koukun.itCompanyMaker;

public class CompanyNameMaker {
	private final long id;
	private final String content;

	public CompanyNameMaker(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
