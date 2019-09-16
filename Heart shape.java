class  LoveSymbol 
{
	public static void main(String[] args) 
	{
		int start_or_end=5;
		int l_space=2;
		int r_star=5;
		int r_space=1;
		
		for(int i=1;i<=11;i++)
		{
			if(i==1 || i==11){
				for(int row=1;row<=17;row++)
				{
					System.out.print("*");
				}
			}else if(i==2){
				start_or_end--;l_space++;r_star=r_star-2;r_space=r_space+2;
			}else if(i==3){
				start_or_end--;l_space=l_space+2;r_star=r_star-2;r_space=r_space+2;
			}else if(i==4){
				start_or_end--;l_space=l_space+8;
			}else if(i==5){
				start_or_end--;l_space=l_space+2;
			}else if(i==6){
				start_or_end++;l_space=l_space-2;
			}else if(i==7){
				start_or_end++;l_space=l_space-2;
			}else if(i==8){
				start_or_end=start_or_end+2;l_space=l_space-4;
			}else if(i==9){
				start_or_end=start_or_end+2;l_space=l_space-4;
			}
			else if(i==10){
				start_or_end++;
				l_space=1;
			}
			for(int j=1;j<=start_or_end;j++)
			{
				if(i!=1 && i!=11)
				System.out.print("*");
			}

			for(int s=1;s<=l_space;s++)
			{
				if(i!=1 && i!=11)
				System.out.print(" ");
			}
			for(int r=1;r<=r_star;r++)
			{
				if(i==2 || i==3 )
				System.out.print("*");
			}

			for(int rs=1;rs<=r_space;rs++)
			{
				if(i==2 || i==3 )
				System.out.print(" ");
			}
			for(int j=1;j<=start_or_end;j++)
			{
				if(i!=1 && i!=11)
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
