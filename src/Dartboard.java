/** A dartboard maintains a list of DartboardNodes
*/
public class Dartboard
{	
	// Even though it's a circle, we need to start somewhere.
	DartboardNode root;

	// How many nodes are there? We need this to prevent infinite loops.
	int nodeCount;

	/** Constructor for the Dartboard class. */
	public Dartboard (int[] scores)
	{
		// Initialise the scoring areas from an array, starting at the top and moving clockwise.

		if (scores.length >= 2)
		{
			root = new DartboardNode(scores[0]);
			nodeCount++;
			root.next = new DartboardNode(scores[1]);
			nodeCount++;
			DartboardNode element = root.next;
			DartboardNode prevElement = root;

			for (int i = 2; i < scores.length; i++)
			{	
				element.next = new DartboardNode(scores[i]);
				element.prev = prevElement;

				this.nodeCount++;

				if (i == (scores.length - 1))
				{
					root.prev = element;
					element.next = root;
				}

				prevElement = element;
				element = element.next;

			}
		}
		else
		{
			throw new IllegalArgumentException("There must be at least two elements in the dartboard, got " + scores.length);
		}
	}

	/** Print out the dartboard, starting at the root element and moving clockwise */
	public void printBoardClockwise ()
	{
		// Note - this is MEANT to go on forever. It's expected, since the dartboard is
		// a circle!
		DartboardNode element = root;
		while (element != null)
		{
			System.out.println(element.score + " ");
			element = element.next;
		}
	}

	public void printNode (int number)
	{
		DartboardNode element = root;
		int i = 0;
		while ((element != null) && (i <= this.nodeCount))
		{
			if (element.score == number)
			{
				element.print();
				i = this.nodeCount + 1;
			}
			 
			if (i == this.nodeCount)
			 {
			     System.out.println("Element %n not found.", number);
			     }
			else
			{
				element = element.next;
				i++;
				

			}
		}
	}

	/** Inner-class for nodes in the dartboard. */
	class DartboardNode
	{
		DartboardNode next;
		DartboardNode prev;
		int score;

		public DartboardNode (int score)
		{
			this.score = score;
		}

		public int getDouble ()
		{
			return (this.score * 2);
		}

		public int getTriple ()
		{
			return (this.score * 3);
		}

		public void print ()
		{
			System.out.println("Prev:\t" + this.prev);
			System.out.println("This:\t" + this);
			System.out.println("Next:\t" + this.next);
		}

		public String toString ()
		{
			String retVal = "Score: " + this.score;
			retVal += "\tDouble: " + this.getDouble();
			retVal += "\tTriple: " + this.getTriple();

			return retVal;
		}
	}
}