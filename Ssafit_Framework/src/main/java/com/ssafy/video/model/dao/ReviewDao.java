package com.ssafy.video.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssafy.video.model.dto.Review;

public interface ReviewDao {
	
	public List<Review> selectAll();

	// 게시글 등록
	public void insertReview(Review review);

	// 게시글 삭제
	public void deleteReview(int id);

	// 게시글 수정
	public void updateReview(@Param("reviewId") int reviewId, @Param("content") String content);

	public List<Review> selectVideo(int videoId);

}