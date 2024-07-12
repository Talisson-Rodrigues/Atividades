package br.com.senac.sistema;

import br.com.senac.controller.*;

public class GerenciadorSistema {
    private AutorController autorController;
    private LivroController livroController;
    private Menu menuSistema;

    public AutorController getAutorController() {
        return autorController;
    }

    public LivroController getLivroController() {
        return livroController;
    }

    public Menu getMenuSistema() {
        return menuSistema;
    }

    public void setAutorController(AutorController autorController) {
        this.autorController = autorController;
    }

    public void setLivroController(LivroController livroController) {
        this.livroController = livroController;
    }

    public void setMenuSistema(Menu menuSistema) {
        this.menuSistema = menuSistema;
    }

    
    public void inicializaControllers() {
        autorController = new AutorController();
        livroController = new LivroController();
    }

    public void inicializaMenu() {
        menuSistema = new Menu();
        menuSistema.gerarMensagemInicial();
    }

}
