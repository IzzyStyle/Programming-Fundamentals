import java.util.Arrays;

class Queue {
	private static int front, rear, capacity;
	private static String[] alphalist;

	Queue(int c) {
		front = rear = 0;
		capacity = c;
		alphalist = new String[capacity]; // inserting an element to the array
	}

	static void enqueue(String data) {
		if (capacity == rear) {
			System.out.println("\nThe list is full\n");
			return;
		}

		else {
			alphalist[rear] = data; // add element to the end of array
			rear++;
		}
		return;
	}

	static void dequeue() {
		// if queue is empty
		if (front == rear) {
			System.out.println("\nList is empty\n");
			return;
		}

		else {
			for (int i = 0; i < rear - 1; i++) { // Shifting elements
				alphalist[i] = alphalist[i + 1];
			}

			if (rear < capacity)
				alphalist[rear] = null; // store empty space at rear indicating there's no element

			rear--;
		}
		return;
	}

	static void queueDisplay() {
		if (front == rear) {
			System.out.println("\nList is Empty\n");
			return;
		}

		if (front != rear) {
			System.out.println("Elements in array are:" + Arrays.toString(alphalist)); // prints arrays
		}
		return;
	}

	static void queueFront() {
		if (front == rear) {
			System.out.println("\nList is Empty\n");
			return;
		}
		System.out.println("\nFront Element is:" + alphalist[front]);
		return;
	}
}
