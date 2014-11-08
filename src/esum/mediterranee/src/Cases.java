package esum.mediterranee.src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Cases
{
	public static Case[] casesList =
	{
		new Case(0, 0, new int[] {4}),
		new Case(1, 1, new int[] {5, 6, 7}),
		new Case(2, 2, new int[] {8, 9, 10, 11}),
		new Case(3, 3, new int[] {12, 13}),
		new Case(4, 4, new int[] {0, 14}),
		new Case(5, 5, new int[] {1, 6, 11}),
		new Case(6, 6, new int[] {1, 5, 7, 10, 11, 15, 16, 17}),
		new Case(7, 7, new int[] {1, 6, 16, 17}),
		new Case(8, -1, new int[] {2, 9}),
		new Case(9, 8, new int[] {2, 8, 10, 15}),
		new Case(10, -1, new int[] {2, 6, 9, 11, 15}),
		new Case(11, 9, new int[] {2, 5, 6, 10}),
		new Case(12, -1, new int[] {3}),
		new Case(13, 10, new int[] {3, 18, 19}),
		new Case(14, 11, new int[] {4, 18, 20, 21}),
		new Case(15, -1, new int[] {6, 9, 10, 16, 22}),
		new Case(16, -1, new int[] {6, 7, 15, 17, 20, 22}),
		new Case(17, 12, new int[] {7, 16, 20}),
		new Case(18, 13, new int[] {13, 14, 19, 20, 21, 23}),
		new Case(19, 14, new int[] {13, 18, 23, 24, 25}),
		new Case(20, 15, new int[] {14, 15, 16, 17, 21, 22, 26}),
		new Case(21, -1, new int[] {14, 18, 20, 23, 26, 27}),
		new Case(22, 16, new int[] {15, 16, 20, 26, 28}),
		new Case(23, 17, new int[] {18, 19, 21, 24, 27, 29}),
		new Case(24, -1, new int[] {19, 23, 25, 29, 30}),
		new Case(25, 18, new int[] {19, 24, 30}),
		new Case(26, -1, new int[] {20, 21, 22, 27, 28, 31}),
		new Case(27, -1, new int[] {21, 23, 26, 29, 31}),
		new Case(28, 19, new int[] {22, 26, 31}),
		new Case(29, 20, new int[] {23, 24, 27, 30}),
		new Case(30, 21, new int[] {24, 25}),
		new Case(31, 22, new int[] {26, 27, 28})
	};
}
