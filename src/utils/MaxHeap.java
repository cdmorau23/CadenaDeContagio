/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import ClasesPaciente.PacienteNE;

/**
 *
 * @author sordo
 */
public class MaxHeap {
    private PacienteNE[] Heap;
    private int size;
    private int maxsize;

    public MaxHeap(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new PacienteNE[this.maxsize + 1];
        Heap[0] = new PacienteNE();
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return (2 * pos);
    }

    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    private boolean isLeaf(int pos) {
        if (pos >= (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    private void swap(int fpos, int spos) {
        PacienteNE tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }


    private void maxHeapify(int pos) {
        if (isLeaf(pos))
            return;

        if (Heap[pos].N_Arboles < Heap[leftChild(pos)].N_Arboles || Heap[pos].N_Arboles < Heap[rightChild(pos)].N_Arboles) {

            if (Heap[leftChild(pos)].N_Arboles > Heap[rightChild(pos)].N_Arboles) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            } else {
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
    }

    public PacienteNE extractMax()
    {
        PacienteNE popped = Heap[1];
        Heap[1] = Heap[size--];
        maxHeapify(1);
        return popped;
    }

    public void insert(PacienteNE user) {
        Heap[++size] = user;

        int current = size;
        while (Heap[current].N_Arboles > Heap[parent(current)].N_Arboles) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

}
