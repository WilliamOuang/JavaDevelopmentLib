package com.mum.chess;

/**
 * Copyright 2012, NEWTOUCH Co., Ltd.  All right reserved.
 */


/**
 * @author aijnec
 */
public class ChessTest {

    //棋盘维度
    private static int n = 8;
    //棋盘模型
    private long[][] chessBoard = new long[n][n];

    /**
     * 构造棋盘矩阵 往格子里填方法数
     *
     */
    private void buildChessBoard(){            

        for(int i=0;i<n;i++){            

            for(int j=0;j<n;j++){                

                if(i==0 || j==0){
                    //边界条件
                    chessBoard[i][j]=1;
                    System.out.println("chessBoard["+i+"]"+"["+j+"]="+chessBoard[i][j]);
                }else{
                    //子方法递推
                    chessBoard[i][j]=chessBoard[i-1][j]+chessBoard[i][j-1];
                    System.out.println("chessBoard["+i+"]"+"["+j+"]="+chessBoard[i][j]);
                }
            }
        }
    }

    /**
     * 取得从(0,0)走到对角端点(n,n)的最短方法数
     * @return
     */
    public void getPointNum(){        
        buildChessBoard();
        System.out.println("pointNum="+chessBoard[n-1][n-1]);
    }

    public static void main(String[] args){
        ChessTest test = new ChessTest();

        long startTick,endTick;
        startTick = System.nanoTime();

        test.getPointNum();

        endTick = System.nanoTime();
        System.out.println("process  costs "+(endTick-startTick)+" ns");

    }
}
