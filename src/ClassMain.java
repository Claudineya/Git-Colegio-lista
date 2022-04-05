import java.util.Scanner;

public class ClassMain {
    public static void main (String[] args){

        Scanner imput = new Scanner(System.in);

        String[] data = {" 01/03/2022 "," 02/03/2022 "," 03/03/2022 "};
        String[] aluno = { " Veronica "," Isis "," Carlos "};

        String [] [] chamada = new String [data.length][aluno.length];

        for (int i  = 0; i < data.length; i++ ) {
            System.out.println("Lista presença do dia " + data [i]);

            for (int x = 0; x < aluno.length; x++) {
                System.out.println(aluno[x] + " esta presente");
                chamada[i][x] = imput.nextLine();

            }
        }
        System.out.println(" Data ");
        for (String datum : data) {
            System.out.println(datum + " ");
            for (int x = 0; x < aluno.length; x++) {
                System.out.println(aluno[x]);
                for (String[] strings : chamada) {
                    System.out.println(strings[x]);
                }
            }

        }
        System.out.println(" ");

    }
}
