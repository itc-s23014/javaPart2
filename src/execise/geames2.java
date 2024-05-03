package execise;

import java.util.Scanner;

public class geames2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sr = new Scanner(System.in);

        char    answer = 'X';

        char[][] hulirudo = new char[3][3];
        for (int i = 0; i < 3;++i) {
            for (int b = 0; b < 3;++b){
                hulirudo[i][b] = '_';
            }

                }
                while (true){
                    System.out.println("行番号を入力してください(上が1,下が3)");
                    int s = sc.nextInt() ;
                    System.out.println("列番号を入力してください(左が1,右が3)");
                    int r = sr.nextInt() ;

                    boolean x = isValidMove(hulirudo,s,r);
                    if (x == true){
                        hulirudo[s][r] = answer;

                        if (checkWin(hulirudo)){
                            System.out.println("kati");
                            break;

                        }


                    }else {
                        System.out.println("選べません");
                    }
                }
                    //状況確認





















            }
            public static void printBoard(char[][] array) {
                for (int i = 0; i < array.length; ++i) {
                    for (int j = 0; j < array[0].length; ++j) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }

            }
            public static boolean isValidMove(char[][] array, int s,int r ) {
                    if (s >= 0 && s <=2) {
                        if (r >= 0 && r <=2){
                            if (array[s][r] =='_'){
                                return true;

                            }
                        }

                    }
                return false;
            }
            public static boolean checkWin(char[][] array) {
                    char mark = 'X';
                   for (int i=0;i<2;++i){
                       if (array[0][i] == mark && array[1][i] == mark && array[2][i]==mark) {
                           return true;
                       }
                       if (array[i][0]==mark && array[i][1]==mark && array[i][2]==mark){
                           return true;
                       }if (array[0][0]==mark && array[1][1]==mark && array[2][2]==mark){
                           return true;
                       }if (array[0][2]==mark && array[1][1]==mark && array[2][0]==mark){
                           return true;
                       }
                   }


                   return false;

                    }


        }

