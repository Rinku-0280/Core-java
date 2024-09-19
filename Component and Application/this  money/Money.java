class Money
{
	private int rs;
	private int paisa;

	public void set (int rs,int paisa)
	{
	this.rs=rs;
	this.paisa=paisa;
	}
	public void show()
	{
		System.out.println(rs+"."+paisa);
	}
}
   