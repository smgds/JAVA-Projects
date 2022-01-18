public class TestQueue {

public static void main(String str[]) throws QueueException {

ArrayQueue queue = new ArrayQueue();

queue.enqueue('A');
System.out.println("Character : A");
queue.enqueue('B');
System.out.println("Character : B");
queue.enqueue('C');
System.out.println("Character : C");
queue.enqueue('D');
System.out.println("Character : D");
queue.enqueue('E');
System.out.println("Character : E");
queue.enqueue('F');
System.out.println("Character : F");
queue.enqueue('G');
System.out.println("Character : G");
queue.enqueue('H');
System.out.println("Character : H");
queue.enqueue('I');
System.out.println("Character : I");
queue.enqueue('J');
System.out.println("Character : J");
queue.enqueue('K');
System.out.println("Character : K");
queue.enqueue('L');
System.out.println("Character : L");
queue.enqueue('M');
System.out.println("Character : M");
queue.enqueue('N');
System.out.println("Character : N");
queue.enqueue('O');
System.out.println("Character : O");
queue.enqueue('P');
System.out.println("Character : P");
queue.enqueue('Q');
System.out.println("Character : Q");
queue.enqueue('R');
System.out.println("Character : R");
queue.enqueue('S');
System.out.println("Character : S");
queue.enqueue('T');
System.out.println("Character : T");
queue.enqueue('U');
System.out.println("Character : U");
queue.enqueue('V');
System.out.println("Character : V");
queue.enqueue('W');
System.out.println("Character : W");
queue.enqueue('X');
System.out.println("Character : X");
queue.enqueue('Y');
System.out.println("Character : Y");
queue.enqueue('Z');
System.out.println("Character : Z");
System.out.println("Removed Character : " + queue.dequeue());
System.out.println("Removed Character : " + queue.dequeue());
System.out.println("Removed Character : " + queue.dequeue());
System.out.println("Removed Character : " + queue.dequeue());
System.out.println("Removed Character : " + queue.dequeue());
System.out.println("Removed Character : " + queue.dequeue());
System.out.println("Removed Character : " + queue.dequeue());
System.out.println("Removed Character : " + queue.dequeue());
System.out.println("Removed Character : " + queue.dequeue());
System.out.println("Removed Character : " + queue.dequeue());
System.out.println("Removed Character : " + queue.dequeue());

}
}