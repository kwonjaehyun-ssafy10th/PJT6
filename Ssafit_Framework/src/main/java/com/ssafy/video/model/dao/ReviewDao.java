package com.ssafy.video.model.dao;

import java.util.List;

import com.ssafy.video.model.dto.Review;

public interface ReviewDao {
	
	public List<Review> selectAll();

	// 게시글 등록
	public void insertReview(Review review);

	// 게시글 삭제
	public void deleteReview(int id);

	// 게시글 수정
	public void updateReview(Review review);

	public List<Review> selectVideo(int videoId);

}