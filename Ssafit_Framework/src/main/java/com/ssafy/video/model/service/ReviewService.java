package com.ssafy.video.model.service;

import java.util.List;

import com.ssafy.video.model.dto.Review;

public interface ReviewService {
		
		List<Review> selectAll();
	
		// 비디오에 따른 게시글 조회
		List<Review> getSelectedList(int videoId);

		// 게시글 등록
		void writeReview(Review review);

		// 게시글 수정
		void modifyReview(int reviewId, String content);

		// 게시글 삭제
		void removeReview(int reviewId);

}
