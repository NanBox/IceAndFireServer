package com.southernbox.iceandfireserver.entity;

import java.util.List;

public class ContentJson {
	private List<Content> data;

	public ContentJson(List<Content> data) {
		this.data = data;
	}

	public ContentJson() {
	}

	public List<Content> getData() {
		return data;
	}

	public void setData(List<Content> data) {
		this.data = data;
	}

}
