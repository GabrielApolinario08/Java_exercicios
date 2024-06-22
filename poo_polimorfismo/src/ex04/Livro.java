package ex04;

import java.util.ArrayList;

public class Livro extends Midia{
    private String autor;
    private String editora;
    private int edicao;

    public Livro() {
        super(null, "descrição", "tipo", "genero", 0);
        setAutor("autor");
        setEditora("editora");
        setEdicao(1);
    }

    public Livro(ArrayList<Midia> midias, String descricao, String tipo, String genero, double valorAluguel, String autor, String editora, int edicao) {
        super(midias, descricao, tipo, genero, valorAluguel);
        setAutor(autor);
        setEditora(editora);
        setEdicao(edicao);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor.trim().isEmpty()) throw new IllegalArgumentException("Autor não pode ser vazio");
        this.autor = autor;

    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        if (editora.trim().isEmpty()) throw new IllegalArgumentException("Editora não pode ser vazio");

        this.editora = editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        if (edicao < 1) throw new IllegalArgumentException("Edição deve ser maior que 0.");
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tAutor: " + getAutor() +
                "\tEditora: " + getEditora() +
                "\tEdição: " + getEdicao();
    }
}
