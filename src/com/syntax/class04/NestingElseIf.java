package com.syntax.class04;

public class NestingElseIf {
	
	public static void main(String [] args) {
		
		
		/*if student completed a quiz we will check for a score
		 * if score will be more than 90 ----> great job
		 * if score is >---> welldone
		 * if score > you could have than better
		 * 
		 * if student did not completed the quiz ----> not good
		 * please do homework
		 * 
		 */
		
		
		boolean quizCompleted = false ;
		int score = 86;

		if (quizCompleted) {
			System.out.println("lets check your score!");

			if (score > 90) {
				System.out.println("great job, you study a lot");
			} else if (score > 80) {

				System.out.println("well done");
			} else if (score > 70) {
				System.out.println("You could have done better");

			} else {
				System.out.println("you failed");
			}

		} else {
			System.out.println("Please do hw on time");
		}

	}

}
