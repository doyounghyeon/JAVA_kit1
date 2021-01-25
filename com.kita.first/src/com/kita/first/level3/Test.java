package com.kita.first.level3;

public class Test {
	public static void main(String[] args) {
		ProGamer hong = new ProGamer();
		Game game = new Game();
		hong.playGame(game);
//		game = new StardewValley();
//		p1.playGame(game);
//		game = new Lol();
//		p1.playGame(game);
		
		StardewValley sDew = new StardewValley();
		hong.playGame(sDew);  // 부모객체는 자식객체에 대입가능 자동으로 변환된다. 
		
		Lol lol = new Lol();
		hong.playGame(lol);
		
// ---------------------------------------------------------------	
//		Animal ani = new Animal();
//		Cat cat = new Cat();
//		Dog dog = new Dog();
//		ani = new Animal();
//		
//		ani.crying();
//		
//		ani = cat; //animal = new Cat();
//		ani.crying();
//		
//		ani = dog;
//		ani.crying();
//		
//		ani = cat;
//		
//		boolean result = ani instanceof Dog;
//		System.out.println(result);
//		
//		Dog dog1 = (Dog)ani; // 부모클래스에는 없고 자식클래스에만 있을때는 오류가 난다.
//		dog1.barking();
		
		
//		System.out.println("--------------------------------------");
//		
//		
//		
		Student minsu = new Student();
		
		for(int i = 1; i <= 5; i++) {
			int result = minsu.readBooks();
			switch(result) {
			case 1:  // minsu가 book1을 다 읽었을 경우
				minsu.book1 = new ComicBook(3);
				System.out.println("새 만화책을 가져왔다");
			case 2:
				minsu.book2 = new MajorTextBook(7);
				System.out.println("새 전공서적을 가져왔다");
			case 3:
				minsu.book3 = new MajorTextBook(7);
				System.out.println("새 책을 가져왔다");
				break;
			}
			System.out.println("--------------------------------------");
			
		}
		
		
		
	
	}
	}

