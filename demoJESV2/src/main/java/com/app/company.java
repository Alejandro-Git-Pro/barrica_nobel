package com.app;

public class company {
	
	private Long id;
	private String content;
	
	public company() {
	}
	
	public company(Long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Greeting [id=" + id + ", content=" + content + "]";
	}
	
}
