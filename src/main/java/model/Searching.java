package model;

import java.util.List;

public class Searching 
{
	String searchStr,workStr;
	
	Integer recordPerPage;
	Integer totalPage;
	Integer totalRecord;
	Integer currentPage;
	List<Integer> objects;
	
	{
		recordPerPage=10;currentPage=1;searchStr="";
	}
	
	public String getWorkStr() {
		return workStr;
	}
	public void setWorkStr(String workStr) {
		this.workStr = workStr;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public String getSearchStr() {
		return searchStr;
	}
	public void setSearchStr(String searchStr) {
		this.searchStr = searchStr;
	}
	public Integer getRecordPerPage() {
		return recordPerPage;
	}
	public void setRecordPerPage(Integer recordPerPage) {
		System.out.println("setting record per page "+recordPerPage);
		this.recordPerPage = recordPerPage;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(Integer totalRecord) {
		this.totalRecord = totalRecord;
	}
	public List<Integer> getObjects() {
		return objects;
	}
	public void setObjects(List<Integer> objects) {
		this.objects = objects;
	}
	@Override
	public String toString() {
		return "Searching [searchStr=" + searchStr + ", workStr=" + workStr + ", recordPerPage=" + recordPerPage
				+ ", totalPage=" + totalPage + ", totalRecord=" + totalRecord + ", currentPage=" + currentPage
				+ ", objects=" + objects + "]";
	}


	
	
}
