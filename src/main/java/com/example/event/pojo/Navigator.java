package com.example.event.pojo;

import java.util.ArrayList;

public class Navigator {

	private Nav[] nav;

	private Pages[] pages;

	private End[] end;

	private String[] ellipsis;

	public Nav[] getNav() {
		return nav;
	}

	public void setNav(Nav[] nav) {
		this.nav = nav;
	}

	public Pages[] getPages() {
		return pages;
	}

	public void setPages(Pages[] pages) {
		this.pages = pages;
	}

	public End[] getEnd() {
		return end;
	}

	public void setEnd(End[] end) {
		this.end = end;
	}

	public String[] getEllipsis() {
		return ellipsis;
	}

	public void setEllipsis(String[] ellipsis) {
		this.ellipsis = ellipsis;
	}

	@Override
	public String toString() {
		return "Navigator [nav = " + nav + ", pages = " + pages + ", end = " + end + ", ellipsis = " + ellipsis + "]";
	}
}
