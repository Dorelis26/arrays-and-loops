package DataStructure;

public class Arrays {

	public static void main(String[] args) {
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","n","m","l",
				"o","p","q","r","s","t","u","v","w","x","y","z","\n"};
			
		
		for (int i=0;i<alphabet.length;i++) {
			System.out.print(alphabet[i]);
			
		}
		
		System.out.println("\nUsing the for Each method\n");
		
		for(String letter :alphabet) {
			System.out.print(letter);
		}
		
		String[][] users = {{"jon","williams","jwilliams@gmail.com","1234569878"},
							{"Nick","Dorelis","ndorelis@gmail.com","1234569878"},
							{"rachel","wallet","rw@gmail.com","1234569878"}};
		
		//get the  sides of the array
		int numUsers = users.length;
		int numOfFiels = users[0].length;
		System.out.println("num of users : "+numUsers + "\n"+ "num of Fiels : "+numOfFiels);
		//travers the 2d array
		
		for(int i =0;i<users.length;i++) {
			for(int j=0;j<users.length;j++) {
				
				System.out.println( users[i][j]);
				
			}
				
			}
		//for each loop to ittirate a 2d array
		for (String[] user : users) {
		for	(String field : user) {
			System.out.println(field);
		}
		}
		
		
	}

}
