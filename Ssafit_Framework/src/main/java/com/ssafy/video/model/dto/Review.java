package com.ssafy.video.model.dto;

public class Review {
	private static int no = 1;
	private int videoId;
	private int reviewId;
	private String writer;
	private String content;
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Review(int videoId, String writer, String content) {
		super();
		this.reviewId = no++;
		this.videoId = videoId;
		this.writer = writer;
		this.content = content;
	}
	public int getReviewId() {
		return reviewId;
	}
	
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Review [videoId=" + videoId + ", writer=" + writer + ", content=" + content + "]";
	}
	 
	
}
