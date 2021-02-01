package com.kita.first.level4;

public class Test {
	public static void main(String[] args) {
	
		Parent p = new Parent() {
		
		@Override
		void parentMethod() {
			System.out.println("자식 객체입니다.");
		};
	};
	p.parentMethod();
	child.clidMethod();
	child.clidMethod2(new Parent(){
		@Override
		void parentMethod() {};
	});
		
		
//		ThrowsException te = new ThrowsException();
//		try {
//			te.parseInputStrToInt();
//		}catch(Exception e)
		
		
			
//		}
//		AkmuAlbum album1 = new MusicPlayer();
//		IUAlbum album2 = new MusicPlayer();
//		
//		album1.playAkmuAlbum();
//		album1.stopAkmuAlbum();
//		album2.playIUAlbum();
//		album2.stopIUAlbum();
//		
//		MusicPlayer myMp3 = (MusicPlayer)album1;
//		myMp3.playMichaelJacksonAlbum();
//	}
}
}
