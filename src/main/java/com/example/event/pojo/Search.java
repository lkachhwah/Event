package com.example.event.pojo;

public class Search {

	Navigator navigator;
	Tabular tabular;
	private String sortable = null;

	public Navigator getNavigator() {
		return navigator;
	}

	public void setNavigator(Navigator navigator) {
		this.navigator = navigator;
	}

	public Tabular getTabular() {
		return tabular;
	}

	public void setTabular(Tabular tabular) {
		this.tabular = tabular;
	}

	public String getSortable() {
		return sortable;
	}

	public void setSortable(String sortable) {
		this.sortable = sortable;
	}

}
