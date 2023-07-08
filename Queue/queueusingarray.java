package Queue;

import java.util.*;

import collectionsframework.listinterface.stack;

public class queueusingarray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            this.size = n;
            arr = new int[n];
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static boolean isFull() {
            return rear == size - 1;
        }

        // enque O(1)
        public static void add(int data) {
            if (isFull()) {
                System.out.println("q is full:");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // deque O(n)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("q is empty:");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];

            }
            rear--;
            return front;

        }
//peek O(n)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue:");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();

        }

    }

}
