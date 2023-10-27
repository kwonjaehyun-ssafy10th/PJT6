package com.ssafy.video.model.service;

import java.util.List;

import com.ssafy.video.model.dto.SearchCondition;
import com.ssafy.video.model.dto.Video;

public interface VideoService {
	
	List<Video> getList(SearchCondition searchcondition);
	
	Video getVideo(int id);
	
	
	
}
