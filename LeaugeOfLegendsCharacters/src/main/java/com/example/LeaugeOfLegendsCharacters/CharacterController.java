package com.example.LeaugeOfLegendsCharacters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {
	CharacterData characterData=new CharacterData();
	
	@GetMapping("/character")
	public Character getCharacter(@RequestParam(name="name")String name) {
		
		
		return characterData.getCharacter(name);
	}
	

}
