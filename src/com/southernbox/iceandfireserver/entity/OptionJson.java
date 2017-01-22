package com.southernbox.iceandfireserver.entity;

import java.util.List;

public class OptionJson {
	private List<Option> data;

	public OptionJson(List<Option> data) {
		this.data = data;
	}

	public OptionJson() {
	}

	public List<Option> getData() {
		return data;
	}

	public void setData(List<Option> data) {
		this.data = data;
	}

}
