package core;


public class Stack implements IStack {
	int top;
	int[] st;
	public Stack() {
		st = new int[3];
		top = -1;
	}

	public int getSize() {
		return 3;
	}

	public boolean isFull() {
		return top == 2;
	}


	public boolean isEmpty() {
		return top == -1;
	}

	public void push(int elm) {
		if(isFull())
			System.out.print("Error. It is full");
		else
		{
			top++;
			st[top] = elm;
		}
	}


	public int pop() {
		int p = st[top];
		top--;
		return p;
	}


	public int top() {
		return st[top];
	}

		
	

}
