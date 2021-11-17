package cbj.matrix;

import java.security.InvalidParameterException;

public class Matrix<T> {
    private T[][] matrix;
    private int rows;
    private int columns;

    public Matrix(T[][] matrix) {
        for(int i = 0; i < matrix.length; i++){

        }
    }

    public T[][] getMatrix() {
        return matrix;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
}