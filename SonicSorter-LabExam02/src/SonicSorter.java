//Maggie O'Connell
public class SonicSorter 
{
	private Game[] games = new Game[26];
	public SonicSorter(Game[] aGames)
	{
		for(int x = 0; x < 26; x++)
		{
			games[x] = aGames[x];
		}
	}
	
	public void quickSort(int left, int right)
	{
		//partition
		int index = partition(left,right);
		if(left < index - 1)
			quickSort(left,index -1);
		if(index < right)
			quickSort(index, right);
		
	}
	
	private int partition(int left, int right)
	{
		int i = left;
		int j = right;
		Game pivot = games[(left + right)/2];
		while(i <= j)
		{
			while(games[i].getYear() < pivot.getYear())
				i++;
			while(games[j].getYear() > pivot.getYear())
				j--;
			if(i <= j)//SWAP
			{
				Game temp = games[i];
				games[i] = games[j];
				games[j] = temp;
				i++;
				j--;
			}
		}
		return i;
	}
}
