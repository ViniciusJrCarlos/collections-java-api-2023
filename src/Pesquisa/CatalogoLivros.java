package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listalivros;

    public CatalogoLivros() {

        this.listalivros = new ArrayList<>();

    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {

        listalivros.add(new Livro(titulo, autor, anoPublicacao));

    }

    //pesquisa de livros por autor

    public List<Livro> pesquisarPorAutor(String autor) {

        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!listalivros.isEmpty()){

            for (Livro l: listalivros) {

                if (l.getAutor().equalsIgnoreCase(autor)) {

                    livrosPorAutor.add(l);
                }

            }
        }
        return livrosPorAutor;
    }

    //public List<Livro> pesquisarPorAutor

    public List<Livro> pesquisarPorIntervaloAnos (int anoInicial, int anoFinal) {

        List<Livro> livrosPorIntervalosAnos = new ArrayList<>();

        if (!listalivros.isEmpty()) {

            for (Livro l: listalivros) {

                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {

                    livrosPorIntervalosAnos.add(l);
                }
            }
        }
        return livrosPorIntervalosAnos;
    }

    //pesquisa o primeiro livro  por titulo

    public Livro pesquisarPorTitulo(String titulo) {

        Livro livroPorTitulo = null;

        if (!listalivros.isEmpty()) {

            for (Livro l: listalivros) {

                if (l.getTitulo().equalsIgnoreCase(titulo)) {

                    livroPorTitulo = l;
                    break;
                }
            }
        }

        return livroPorTitulo;
    }

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();


        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2014);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 4"));

    }
}
