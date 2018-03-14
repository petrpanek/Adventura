package com.github.petrpanek.adventura.uiText;

import com.github.petrpanek.adventura.logika.IHra;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 * Kontroler, který zprostředkovává komunikaci mezi grafikou
 * a logikou adventury
 * 
 * @author Petr Panek
 *
 */
public class HomeController extends GridPane {
	
	@FXML private TextField vstupniText;
	
	/**
	 * Metoda čte příkaz ze vstupního textového pole
	 * a zpracuje ho
	 */
	public void odesliPrikaz() {
		System.out.println(vstupniText.getText());
		vstupniText.setText("");
	}
	
	/**
	 * Metoda bude soužit pro předání objektu se spuštěnou hrou
	 * kontroleru a zobrazí stav hry v grafice.
	 * @param objekt spuštěné hry
	 */
	public void inicializuj(IHra hra) {
		
	}

}
