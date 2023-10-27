package com.ssafy.video.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.video.model.dto.SearchCondition;
import com.ssafy.video.model.dto.Video;
import com.ssafy.video.model.service.VideoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(tags = "비디오 컨트롤러")
//@CrossOrigin("*")
public class VideoRestController {

	@Autowired
	private VideoService videoService;

	// 1. 목록(검색조건 있을 수도 있고 없을 수도 있다.)
	@GetMapping("/video")
	@ApiOperation(value = "비디오 조회", notes = "검색조건도 넣으면 같이 가져온다.")
	public ResponseEntity<?> list(SearchCondition condition) {
//        List<Video> list = videoService.getList(); //전체 조회
		List<Video> list = videoService.getList(condition); // 검색 조건이 있다면 그것으로 조회
		if (list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Video>>(list, HttpStatus.OK);
	}

	// 2. 상세보기
	@GetMapping("/video/{id}")
	public ResponseEntity<Video> detail(@PathVariable int id) {
		Video video = videoService.getVideo(id);
		// 정석이라면 게시글 제목을 클릭해서 상세보기로 들어갈 거니까 여기서 매무리 해도 된다.
		// 꼬옥 주소창을 통해 접근하려고 하는 악의무리가 있기 때문에 만약 없는 값을 보냈을때... 처리를 해주어라. (해볼것)
		return new ResponseEntity<Video>(video, HttpStatus.OK);
	}
}