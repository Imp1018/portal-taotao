package com.taotao.portal.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;



public class SearchResult {
	//商品列表
	private List<Item> searchItemList;
	//总记录数
	private long recordCount;

	public List<Item> getSearchItemList() {
		return searchItemList;
	}

	public long getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(long totalPages) {
		this.totalPages = totalPages;
	}

	public SearchResult setSearchItemList(List<Item> searchItemList) {
		this.searchItemList = searchItemList;
		return this;
	}

	public long getRecordCount() {
		return recordCount;
	}

	public SearchResult setRecordCount(long recordCount) {
		this.recordCount = recordCount;
		return this;
	}



	public long getCurPage() {
		return curPage;
	}

	public SearchResult setCurPage(long curPage) {
		this.curPage = curPage;
		return this;
	}

	//总页数
	private long totalPages;
	//当前页
	private long curPage;
}
