package com.ssafy.video.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.video.model.dao.ReviewDao;
import com.ssafy.video.model.dto.Review;

@Service
public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	public ReviewDao Rdao;


	@Override
	public void writeReview(Review review) {
		Rdao.insertReview(review);
	}

	@Override
	public void modifyReview(Review review) {
		Rdao.updateReview(review);
	}

	@Override
	public void removeReview(int reviewId) {
		Rdao.deleteReview(reviewId);
	}

	@Override
	public List<Review> getSelectedList(int videoId) {
		return Rdao.selectVideo(videoId);
	}

	@Override
	public List<Review> selectAll() {
		return Rdao.selectAll();
	}

}
