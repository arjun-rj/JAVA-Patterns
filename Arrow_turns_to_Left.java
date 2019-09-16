public class LeftArrow {

  public static void main(String[] args)
{
      int star=0,space=6;
      for(int i =1 ;i<=11 ;i++ ){
        if(i<=6)
		  {
			space--;
			star++;
		  }else if(i>6){
			  space++;
			  star--;
		  }
        print_star_or_space(space," ");
        print_star_or_space(star,"*");
		if(i>=5 && i<=7)
		print_star_or_space(8,"*");
		if(i==i)
			 System.out.println();
      }
  }
  public static void print_star_or_space(int len,String type){
    for(int i =1 ;i<=len ;i++ )
    {
      System.out.print(type);
    }
  }
}
