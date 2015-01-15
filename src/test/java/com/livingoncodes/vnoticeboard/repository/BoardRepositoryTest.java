package com.livingoncodes.vnoticeboard.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.livingoncodes.vnoticeboard.VNoticeBoardApplication;
import com.livingoncodes.vnoticeboard.entity.Board;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = VNoticeBoardApplication.class)
@WebAppConfiguration
public class BoardRepositoryTest {
	
	@Autowired
	BoardRepository boardRepository;
	
	@Test
	public void findByNameTest() {
		
		Board board1 = new Board(1L, "tinytots", "testpass", "Sample board text");

		boardRepository.save(board1);
		
		System.out.println(boardRepository.findByName("tinytots"));

		
	}
}
