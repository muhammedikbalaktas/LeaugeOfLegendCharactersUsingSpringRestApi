package com.example.LeaugeOfLegendsCharacters;

public class CharacterData {
	
	private Character Alistar=new Character("Alistar","Tank","Support","Medium");
	private Character Pyke=new Character("Pyke","Assasin","Support","Hard");
	private Character Rell=new Character("Rell","Tank","Support","Hard");
	private Character Leona=new Character("Leona","Tank","Support","Easy");
	private Character Thresh=new Character("Thresh","Tank","Support","Hard");
	private Character Tahm=new Character("Tahm Kench","Tank","Support","Hard");
	private Character Nautilus=new Character("Nautilus","Tank","Support","Medium");
	private Character Karma=new Character("Karma","Sorcerer","Support","Medium");
	private Character Morgana=new Character("Morgana","Sorcerer","Support","Easy");
	private Character Blitz=new Character("BlitzCrank","Tank","Support","Hard");
	private Character character[]= {Alistar,Pyke,Rell,Leona,Thresh,Tahm,Nautilus,Karma,Morgana,Blitz};
	
	public Character getCharacter(String name) {
		
		for(Character i:character) {
			if(i.name.equals(name))return i;
			
		}	
		
		
		
		
		return null;
	}
	

}
