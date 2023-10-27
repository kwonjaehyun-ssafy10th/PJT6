package com.ssafy.video.model.dao;

import java.util.List;

import com.ssafy.video.model.dto.SearchCondition;
import com.ssafy.video.model.dto.Video;

public interface VideoDao {
	
	Video selectOne(int id);
	
	List<Video> selectList(SearchCondition searchcondition);
	
	void updateViewCnt(int id);
	
}
