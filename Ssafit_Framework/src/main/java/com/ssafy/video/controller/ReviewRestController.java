package com.ssafy.video.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.video.model.dto.Review;
import com.ssafy.video.model.service.ReviewService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/api")
@Api(tags = "리뷰 컨트롤러")
//@CrossOrigin("*")
public class ReviewRestController {

	@Autowired
	private ReviewService reviewService;

	@GetMapping("/review")
	@ApiOperation(value = "전체 게시글 조회", notes = "모든 게시글을 조회한다.")
	public ResponseEntity<?> list() {
		List<Review> list = reviewService.selectAll(); // 검색 조건이 있다면 그것으로 조회
		if (list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Review>>(list, HttpStatus.OK);
	}
	
	// 2. 상세보기
	@GetMapping("/review/{id}")
	@ApiOperation(value = "동영상 별 게시글 조회", notes = "특정 동영상에 달린 모든 게시글을 조회한다.")
	public ResponseEntity<List<Review>> detail(@PathVariable int id) {
		List<Review> list = reviewService.getSelectedList(id);
		return new ResponseEntity<List<Review>>(list, HttpStatus.OK);
	}
	
	//3. 등록
	@PostMapping("/review")
	@ApiOperation(value = "게시글 등록", notes = "새로운 게시글을 작성한 뒤 등록한다.")
	public ResponseEntity<Review> write(Review review){
		reviewService.writeReview(review);
		//ID는 어차피 중복이 안되서 무조건 게시글이 등록이 된다.
		//문제 발생해서 게시글이 등록이 안될 경우도 있다더라.... 
		//I / U / D 테이블의 행의 변환 개수를 반환해 주더라 이걸 이용해서 처리를 해볼 수도 있겠다....
		return new ResponseEntity<Review>(review, HttpStatus.CREATED);
	}
	
	//4. 삭제
	@DeleteMapping("/review/{id}")
	@ApiOperation(value = "게시글 삭제", notes = "특정 게시글을 삭제한다.")
	public ResponseEntity<Void> delete(@PathVariable int id){
		reviewService.removeReview(id);
		//반환 값을 통해서 지워졌는지 / 안지워졌는지 쳌
		//이상한 값(id) 못하게 막던지
		//다른사람도 요청 주소를 통해 내글을 지워버릴수 있다. (권한쳌 -> 인터셉터)
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	//5. 수정
	@PatchMapping("/review/edit/{id}/{content}") //JSON 형태의 데이터로 넘어왔을 떄 처리하고 싶은데?
	@ApiOperation(value = "게시글 수정", notes = "특정 게시글을 수정한다.")
	public ResponseEntity<Review> update(@PathVariable("id") int reviewId, @PathVariable("content") String content){
		reviewService.modifyReview(reviewId, content);
		//위와같은 상황 대비
		
		return new ResponseEntity<Review>(HttpStatus.CREATED);
	}
}