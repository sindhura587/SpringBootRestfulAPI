package com.cts.dto;

public class Book {
	
	public Book(int bookId, String title, double price, int volume,String publishDate) {
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.volume =volume;
		this.publishDate = publishDate;
	}
	
	private int bookId;
    private String title;
    private double price;
    private int volume ;
   	private String publishDate;
    
    public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	 public String getPublishDate() {
			return publishDate;
		}
		public void setPublishDate(String publishDate) {
			this.publishDate = publishDate;
		}

}
