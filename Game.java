package conFusion;

import myLib.MyIO;

public class Game {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int room = 1;
		boolean door = false;
		String desc = "bleck";
		String log = "";
		System.out.println("This is your room, and you are sitting on your bed, \n"
				+ "sun comes through the window and you look at the clock on the wall.");
		while (door == false)
		{
			log = MyIO.readLine();
			if (log.equalsIgnoreCase("open door") 
					|| log.equalsIgnoreCase("go door") 
					|| log.equalsIgnoreCase("go through door"))
			{
				door = true;
			}
			else
			{
				if (log.equalsIgnoreCase("look around") || log.equalsIgnoreCase("look"))
				{
					System.out.println("This is your room, and you are sitting on your bed, \n"
							+ "sun comes through the window and you look at the clock on the wall.");
				}
				else if (log.equalsIgnoreCase("look door"))
				{
					System.out.println("It is your door.");
				}
				else if (log.equalsIgnoreCase("look clock"))
				{
					System.out.println("The clock says it is 11:00PM.");
				}
				else if (log.equalsIgnoreCase("look window")){
					System.out.println("It is your street, the neighbor's house is red.");
				}
				else
				{
					System.out.println("Please use simpler words or actual commands.");
				}
			}
		}
		System.out.println("The door opens and immediately you feel terrified with uncertainty.");
		room = 2;
		door = false;
		desc = "placeholder";
		log = "placeholder2";
		boolean mirror = false;
		String room2 = ("Your head begins to throb, and what was supposed to a hallway \n"
				+ "is an area with no seeable dimensions, it feels as though it spins and is \n"
				+ "pitch black. Despite it being dark, the character can still see items clearly \n"
				+ "throughout the room. Light seems to reflect off the objects, despite there being \n"
				+ "no light to reflect. The only items found in the room are a mirror, a handle, a globe \n"
				+ "on the left, and a lamp on the right. All on top of a table, never separating. You look \n"
				+ "into the mirror, and when you look at your face, your head throbs and you can’t comprehend \n"
				+ "it. All you see is that the lamp is on the left and the globe is on the right in its reflection. ");
		System.out.println(room2);
		while(door == false)
		{
			log = MyIO.readLine();
			if(log.equalsIgnoreCase("look") || log.equalsIgnoreCase("look around"))
			{
				System.out.println("what was supposed to a hallway \n"
						+ "is an area with no seeable dimensions, it feels as though it spins and is \n"
						+ "pitch black. Despite it being dark, the character can still see items clearly \n"
						+ "throughout the room. Light seems to reflect off the objects, despite there being \n"
						+ "no light to reflect. The only items found in the room are a mirror, a handle, a globe \n"
						+ "on the left, and a lamp on the right. All on top of a table, never separating. You look \n"
						+ "into the mirror, and when you look at your face, your head throbs and you can’t comprehend \n"
						+ "it. All you see is that the lamp is on the left and the globe is on the right in its reflection. ");
			}
			else if(log.equalsIgnoreCase("move left") || log.equalsIgnoreCase("move right"))
			{
				System.out.println("You can't, whenever you try, you seem drawn to the table.");
			}
			else if(log.equalsIgnoreCase("switch globe lamp") || log.equalsIgnoreCase("switch lamp globe"))
			{
				System.out.println("You hear a click");
			}
			else if(log.equalsIgnoreCase("open door") 
					|| log.equalsIgnoreCase("go door") 
					|| log.equalsIgnoreCase("go through door") && mirror == true)
			{
				System.out.println("You open the door.");
				door = true;
			}
			else
			{
				System.out.println("Please use simpler words or commands that work.");
			}
		}
		room = 3;
		door = false;
		log = "placeholder2";
		
	}

}
