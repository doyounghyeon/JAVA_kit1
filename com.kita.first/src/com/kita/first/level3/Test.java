package com.kita.first.level3;

public class Test {
	public static void main(String[] args) {
		ProGamer p1 = new ProGamer();
		Game game = new Game();
		p1.playGame(game);
//		game = new StardewValley();
//		p1.playGame(game);
//		game = new Lol();
//		p1.playGame(game);
		
		StardewValley sDew = new StardewValley();
		p1.playGame(sDew);  // 부모객체는 자식객체에 대입가능 자동으로 변환된다.
		
		Lol lol = new Lol();
		p1.playGame(lol);
		
// ---------------------------------------------------------------	
//		Animal animal = new Animal();
//		Cat cat = new Cat();
//		Dog dog = new Dog();
//		animal = new Animal();
//		
//		animal.crying();
//		
//		animal = cat; //animal = new Cat();
//		animal.crying();
//		
//		animal = dog;
//		animal.crying();
////		animal.barking(); // 부모클래스에는 없고 자식클래에만 있을때는 오류가 난다.
//		
//		
//		System.out.println("--------------------------------------");
//		
//		
//		
//		Student minsu = new Student();
//		
//		for(int i = 1; i <= 5; i++) {
//			int result = minsu.readBooks();
//			switch(result) {
//			case 1:  // minsu가 book1을 다 읽었을 ㄱㅕㅇ우
//				minsu.book1 = new ComicBook(3);
//				System.out.println("새 만화책을 가져왔다");
//			case 2:
//				minsu.book2 = new MajorTextBook(7);
//				System.out.println("새 전공서적을 가져왔다");
//			case 3:
//				minsu.book3 = new MajorTextBook(7);
//				System.out.println("새 책을 가져왔다");
//				break;
//			}
//			System.out.println("--------------------------------------");
//			
//		}
		
		
		
	
	}
}
