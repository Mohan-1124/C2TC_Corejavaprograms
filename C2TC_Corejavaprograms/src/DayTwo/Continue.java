package DayTwo;

public class Continue {

	public static void main(String[] args) {
		for(int k=500; k<1000; k++)
		{
			if(k%2 != 0)
				continue;
			System.out.println(k + " ");
		}

	}

}
