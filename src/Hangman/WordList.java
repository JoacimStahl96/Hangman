package Hangman;

public class WordList{
	
	// words -> simply the library from which to pick a secret word
		private static String[] words = { "MUPP", "PEN", "PLAYGROUND", "BOTTLE", "MOUSE", "VARIABLE", "SCREEN", "CLOCK",
				"CRISPS", "EGG", "CHICKEN", "CHAIR", "SUPERCALIFRAGILISTICEXPIALIDOCIUS" };

		private static String word = words[(int) (Math.random() * words.length)]; // picks the secret word.

		public static String getWord() { // makes it possible to grab String word in class hangmanv2.
			return word;
		}

}
