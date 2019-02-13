package com.javalac.boardSpring.command;

import java.util.Map;

import org.springframework.ui.Model;

public class BContentCommand implements BCommand {

	@Override
	public void excute(Model model) {
		
		
		Map<String, Object> map = model.asMap();
		System.out.println("git 커밋");

	}

}
