import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
 
public class Addition extends UnicastRemoteObject
         implements AdditionInterface {
 
      public Addition () throws RemoteException {   }
 
      public int add(int a, int b) throws RemoteException {
    	  int result=a+b;
    	  return result;
      }
	
	public int[][] matrixSum() throws RemoteException {
		Scanner s = new Scanner(System.in);
	       System.out.print("Insira o numero de linhas: ");
	       int rows = s.nextInt();
	       System.out.print("Insira o numero de colunas: ");
	       int columns = s.nextInt();
	       int[][] a = new int[rows][columns];
	       int[][] b = new int[rows][columns];
	       System.out.println("Insira a primeira matriz: ");
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               a[i][j] = s.nextInt();
	           }
	       }
	       System.out.println("Insira a segunda matriz: ");
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               b[i][j] = s.nextInt();
	           }
	       }
	       int[][] c = new int[rows][columns];
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               c[i][j] = a[i][j] + b[i][j];
	           }
	       }
	       System.out.println("A soma das duas matrizes �: ");
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               System.out.print(c[i][j] + " ");	  	          
	           }
	           System.out.println();
	       }
	   	       
		return c;
	}
	
	public int[][] matrixSubtract() throws RemoteException {
		Scanner s = new Scanner(System.in);
	       System.out.print("Insira o numero de linhas: ");
	       int rows = s.nextInt();
	       System.out.print("Insira o numero de colunas: ");
	       int columns = s.nextInt();
	       int[][] a = new int[rows][columns];
	       int[][] b = new int[rows][columns];
	       System.out.println("Insira a primeira matriz: ");
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               a[i][j] = s.nextInt();
	           }
	       }
	       System.out.println("Insira a segunda matriz: ");
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               b[i][j] = s.nextInt();
	           }
	       }
	       int[][] c = new int[rows][columns];
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               c[i][j] = a[i][j] - b[i][j];
	           }
	       }
	       System.out.println("A soma das duas matrizes �: ");
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               System.out.print(c[i][j] + " ");	  	          
	           }
	           System.out.println();
	       }
	   	       
		return c;
	}
 }