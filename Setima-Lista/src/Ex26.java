/*26) Escreva um programa para gerar aleatoriamente uma String com 100 letras minúsculas.
        Apresentar, caso haja:
        - as letras do alfabeto que NÃO constam na sequência;
        - a maior sequência de letras repetidas;
        - a maior sequência de vogais; e
        - a maior sequência alfabética.*/


import java.util.Random;

// Gabriel Apolinário Fabrício
public class Ex26 {
    public static void main(String[] args) {
        Random random = new Random();
        String letras = "", letrasNaoConstam = "";
        int maiorSeqLetrasRep = 0, ocorrencias = 0, maiorSeqVogaisRep = 0, maiorSeqAlf = 0;;
        char letra;
        boolean constam = true;
        for (int i = 0; i < 1000; i++) {
            letra = (char) random.nextInt(97, 122);
            letras += letra;
        }
        letras += 'z';
        for (char i = 'a' ; i <= 'z' ; i++) {
            for (int item = 0; item < letras.length(); item++) {
                if (i == letras.charAt(item)) {
                    constam = true;
                    break;
                } else {
                    constam = false;
                }
            }
            if (!constam) {
                letrasNaoConstam += i;
            }
        }

        for (int i = 0 ; i < letras.length() ; i++) {
            if (i != 0) {
                char letraAnterior = letras.charAt(i - 1);
                if (letraAnterior == letras.charAt(i)) {
                    ocorrencias++;
                    if (ocorrencias > maiorSeqLetrasRep) {
                        maiorSeqLetrasRep = ocorrencias;
                    }
                } else {
                    ocorrencias = 0;
                }
            }
        }
        if (maiorSeqLetrasRep != 0){
            maiorSeqLetrasRep ++;
        }

        for (int i = 0 ; i < letras.length() ; i++) {
            if (i != 0) {
                char letraAnterior = letras.charAt(i - 1);
                if (letras.charAt(i - 1) == 'a' || letras.charAt(i - 1) == 'e' ||
                        letras.charAt(i - 1) == 'i' ||letras.charAt(i - 1) == 'o' ||
                        letras.charAt(i - 1) == 'u') {
                    if (letraAnterior == letras.charAt(i)) {
                        ocorrencias++;
                        if (ocorrencias > maiorSeqVogaisRep) {
                            maiorSeqVogaisRep = ocorrencias;
                        }
                    } else {
                        ocorrencias = 0;
                    }
                }
            }
        }
        if (maiorSeqVogaisRep != 0) {
            maiorSeqVogaisRep++;
        }
        ocorrencias = 0;
        for (int i = 0 ; i < letras.length() ; i++) {
            if (i != 0) {
                char atual = letras.charAt(i);
                char anterior = letras.charAt(i - 1);
                if (atual == anterior + 1) {
                    ocorrencias++;
                    if (ocorrencias > maiorSeqAlf) {
                        maiorSeqAlf = ocorrencias;
                    }
                } else {
                    ocorrencias = 0;
                }

            }
        }
        if (maiorSeqAlf != 0) {
            maiorSeqAlf++;
        }

        System.out.println("Sequência: " + letras);
        if (letrasNaoConstam.isEmpty()) {
            System.out.println("Todas as letras do alfabeto constam na sequência.");
        }else {
            System.out.println("Letras do alfabeto que não constam na sequência: " + letrasNaoConstam);
        }
        System.out.println("Maior sequência de letras repetidas: " + maiorSeqLetrasRep);
        System.out.println("Maior sequência de vogais: " + maiorSeqVogaisRep);
        System.out.println("Maior sequência alfabética: " + maiorSeqAlf);
    }
}
