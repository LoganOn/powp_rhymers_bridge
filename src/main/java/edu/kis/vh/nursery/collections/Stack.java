package edu.kis.vh.nursery.collections;

public interface Stack {
    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    Node getLast();

    void setLast(Node last);

    int getI();

    int getTotal();
}