package com.livingoncodes.vnoticeboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livingoncodes.vnoticeboard.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

	public Board findByName(String name);
}