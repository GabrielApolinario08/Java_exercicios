/*25) Escreva um programa validador de senhas. A regra para a criação de uma senha forte é
        que a senha deve ser de tamanho mínimo 10. A senha deve conter letras maiúsculas, letras
        minúsculas, números e caracteres especiais/símbolos (!@#$%&*()+). Outra regra, deve ter
        pelo menos 3 caracteres (maiúsculo ou minúsculo), pelo menos 3 números e pelo menos 2
        símbolos. O programa deve solicitar uma senha forte ao usuário até ele conseguir uma senha
        que respeite esses critérios. Após cada senha digitada, apresentar as regras e se a senha
        passou pelos quesitos ou não.
        Ex:
        Senha: senha123
        Regras
        Tamanho 10: 8 (x)
        Letras 3: 5 (ok)
        Números 3: 3 (ok)
        Símbolos 2: 0 (x)
        Senha reprovada! Tente novamente.
        Senha: Bgp2Ip4*@1
        Regras
        Tamanho 10: 10 (ok)
        Letras 3: 5 (ok)
        Números 3: 3 (ok)
        Símbolos 2: 2 (ok)
        Senha aprovada! Parabéns!*/


import java.util.Scanner;

// Gabriel Apolinário Fabrício
public class Ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite uma senha: ");
            String senha = scanner.nextLine();
            if (verificacoes(senha)) {
                System.out.println("Senha aprovada! Parabéns!");
                break;
            } else {
                System.out.println("Senha reprovada! Tente novamente!");
            }
        }
    }
    public static boolean verificacoes(String senha) {
        boolean tamanho, letras, numeros, simbolos;
        tamanho = letras = numeros = simbolos = false;
        int qtdLetrasMinusc = 0, qtdLetrasMaiusc = 0, qtdNumeros = 0, qtdSimbolos = 0;
        if (senha.length() >= 10) {
            tamanho = true;
        }
        for (int i = 0 ; i < senha.length() ; i++) {
            for (char caracter = 'a' ; caracter <= 'z' ; caracter++) {
                if (senha.charAt(i) == caracter) {
                    qtdLetrasMinusc++;
                }
            }
            for (char caracter = 'A' ; caracter <= 'Z' ; caracter++) {
                if (senha.charAt(i) == caracter) {
                    qtdLetrasMaiusc++;
                }
            }

            for (char caracter = '0' ; caracter <= '9' ; caracter++) {
                if (senha.charAt(i) == caracter) {
                    qtdNumeros++;
                }
            }

            if (senha.charAt(i) == '!' || senha.charAt(i) == '@' || senha.charAt(i) == '#' || senha.charAt(i) == '$' ||
                    senha.charAt(i) == '%' ||senha.charAt(i) == '&' ||senha.charAt(i) == '*' || senha.charAt(i) == '(' ||
                    senha.charAt(i) == ')' || senha.charAt(i) == '+') {
                qtdSimbolos++;
            }
        }
        if (qtdLetrasMinusc + qtdLetrasMaiusc >= 3) {
            letras = true;
        }
        if (qtdNumeros >= 3) {
            numeros = true;
        }
        if (qtdSimbolos >= 2) {
            simbolos = true;
        }
        System.out.printf("REGRAS\n\tTamanho 10: %d(%s)\n\tLetras 3: %d(%s)\n\tNúmeros 3: %d(%s)\n\tSímbolos 2: %d(%s)\n",
                senha.length(), tamanho ? "ok" : "x", qtdLetrasMaiusc + qtdLetrasMinusc, letras ? "ok" : "x",
                qtdNumeros, numeros ? "ok" : "x", qtdSimbolos, simbolos ? "ok" : "x");
        if (tamanho && letras && numeros && simbolos) {
            return true;
        } else {
            return false;
        }
    }
}
