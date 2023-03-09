import java.util.Scanner;
public class yuyu {
        static char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        static char p1;
        static char p2;
        public static void main (String[]args){
            Scanner le = new Scanner(System.in);
            System.out.println("Escolha X ou O");
            p1 = le.next().charAt(0);
            switch (p1){
                case 'X' :
                    p2 = 'O';
                    break;
                case 'x' :
                    p2 = 'o';
                    break;
                case 'O' :
                    p2 = 'X';
                    break;
                case 'o' :
                    p2 = 'x';
                    break;

                }


            }

        }
        private static void imprimirTabuleiro(char[][] tabuleiro) {
            while (!viloria(tabuleiro) || !empate()) {
                for (int h = 0; h<3; h++)
                    System.out.println(h+" ");
                    for ( int g=0; g<3; g++)
                        System.out.println("|" + tabueliro[i][j]);

            }
        }
        public static boolean vitoria ( char[][] tabuleiro){
            for (char i = 0; i < 3; i++)
                for (char j = 0; j < 3; j++) {
                   tabuleiro[i][j];
                }
               if ((tabuleiro[0][0] == p1 && tabuleiro[1][1]==p1 && tabuleiro[2][2]==p1)|| (tabuleiro[0][0]== p1 && tabuleiro[0][1]==p1 && tabuleiro[0][2]==p1)||(tabuleiro[1][0]==p1 && tabuleiro[1][1]==p1 && tabuleiro[1][2]==p1)||(tabuleiro[2][0]==p1 && tabuleiro[2][1]==p1 && tabuleiro[2][2]==p1)|| (tabuleiro[2][0]==p1 && tabuleiro[1][1]==p1 && tabuleiro[0][2]==p1)|| (tabuleiro[0][0]==p1 && tabuleiro[1][0]==p1 && tabuleiro[2][0]==p1)|| (tabuleiro[0][1]==p1 && tabuleiro[1][1]==p1 && tabuleiro[2][1]==p1)|| (tabuleiro[0][2]==p1 && tabuleiro[1][2]==p1 && tabuleiro[2][2]==p1)) {
                 System.out.println("Vitória de " + p1);
               }
            if ((tabuleiro[0][0] == p2 && tabuleiro[1][1]==p2 && tabuleiro[2][2]==p2)|| (tabuleiro[0][0]== p2 && tabuleiro[0][1]==p2 && tabuleiro[0][2]==p2)||(tabuleiro[1][0]==p2 && tabuleiro[1][1]==p2 && tabuleiro[1][2]==p2)||(tabuleiro[2][0]==p2 && tabuleiro[2][1]==p2 && tabuleiro[2][2]==p2)|| (tabuleiro[2][0]==p2 && tabuleiro[1][1]==p2 && tabuleiro[0][2]==p2)|| (tabuleiro[0][0]==p2 && tabuleiro[1][0]==p2 && tabuleiro[2][0]==p2)|| (tabuleiro[0][1]==p2 && tabuleiro[1][1]==p2 && tabuleiro[2][1]==p2)|| (tabuleiro[0][2]==p2 && tabuleiro[1][2]==p2 && tabuleiro[2][2]==p2)) {
                System.out.println("Vitória de " + p2);
            }
            else
                System.out.println("Empate");




        }
}
