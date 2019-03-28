package test;
import control.ControlAjouterAlimentMenu;
import vue.BoundaryAjouterAlimentMenu;;


public class test {
	public static void main(String[]args) {
		ControlAjouterAlimentMenu controlAjouterAlimentMenu = new ControlAjouterAlimentMenu();
		BoundaryAjouterAlimentMenu boundaryAjouterAlimentMenu = new BoundaryAjouterAlimentMenu(controlAjouterAlimentMenu);
		boundaryAjouterAlimentMenu.ajouterAlimentMenu();
	}
}
