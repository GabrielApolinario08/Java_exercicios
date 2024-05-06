/*Criar uma classe para representar uma Pessoa. A pessoa tem como características o nome, em
        formato String, a idade, em números inteiros e a altura, que pode ter casas decimais. Além dos
        métodos assessores de cada característica, temos um método que recebe como parâmetro de
        entrada um valor lógico, que quando verdadeiro, incrementa em um a idade da pessoa e esse
        método deve ser chamado por fazAniversario, não havendo retorno. Siga o diagrama abaixo para
        implementar a classe Pessoa. Após crie uma classe para testar. Observe os sinais de mais e de
        menos antes dos nomes dos atributos e métodos. Respeite-os!*/

//Gabriel Apolinário Fabrício
package ex01;

public class Ex01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Gabriel");
        pessoa.setIdade(19);
        pessoa.setAltura(1.75);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());
        pessoa.fazAniversario();
        System.out.println("nova idade: " + pessoa.getIdade());
    }
}
