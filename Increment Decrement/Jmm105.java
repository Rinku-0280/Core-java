class Jmm105
{
   public static void main (String args[])
   {
	int x=6,success=0;
    do  {

	switch(x){
	case 0:System.out.print("0");
	x+=5;
	break;
	case 1:System.out.print("1");
	x+=3;
	break;
	case 2:System.out.print("2");
	x+=1;
	break;
	case 3:System.out.print("3");
	success++;
	break;
	case 4:System.out.print("4");
	x-=1;
	break;
	case 5:System.out.print("5");
	x-=4;
	break;
	case 6:System.out.print("6");
	x-=5;
	break;
	}
	}
	While((x!=3)||(success<2));
	
   }

}