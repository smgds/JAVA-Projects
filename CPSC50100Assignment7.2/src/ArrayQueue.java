//ArrayQueue.java		Author: Amy Noyes

public class ArrayQueue {

		private char Queue[];
		private int front;
		private int rear;
		private int size;

		public ArrayQueue() {
			size = 10;
			front = -1;
			rear = -1;
			Queue = new char[size];
}
		public void enqueue(char ABC) throws QueueException {

			if (rear == -1) {
				front = 0;
				rear = 0;
				Queue[rear] = ABC;			
				} else if (rear + 1 >= size)

				System.out.println("Queue is full");
				else if (rear + 1 < size)
				Queue[++rear] = ABC;

		}
		public char dequeue() throws QueueException {

				if (isEmpty())
				throw new QueueException("Queue Underflow");
				else {
				char c = Queue[front];
				if (front == rear) {
				front = -1;
				rear = -1;
				} else {
				front++;
				}
				return c;
				}
				}
			
		public boolean isEmpty() {	
			return front == -1;
}
}