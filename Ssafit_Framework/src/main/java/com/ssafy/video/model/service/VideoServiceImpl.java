package com.ssafy.video.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.video.model.dao.VideoDao;
import com.ssafy.video.model.dto.SearchCondition;
import com.ssafy.video.model.dto.Video;

@Service
public class VideoServiceImpl implements VideoService{
	
	@Autowired
	public VideoDao Vdao;

	@Override
	public List<Video> getList(SearchCondition searchcondition) {
		
		List<Video> list = Vdao.selectList(searchcondition);
		
		return list;
	}

	@Override
	public Video getVideo(int id) {
		Vdao.updateViewCnt(id);
		return Vdao.selectOne(id);
	}
}