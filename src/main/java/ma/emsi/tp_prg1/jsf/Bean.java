/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ma.emsi.tp_prg1.jsf;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 @NAMED pour indiquer à Jakarta EE que cette classe est un bean géré et peut être injectée dans d'autres composants JSF.
 * L'annotation @RequestScoped indique que le cycle de vie de ce bean est limité à la requête HTTP actuelle.


 */
@Named(value = "bean")
@RequestScoped
public class Bean {

    private int nombre;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> l = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            l.add(i);
        }
        return l;
    }
    public String afficher() {
    return "affichage_3?nb="+ nombre + "&amp;faces-redirect=true";
}
  /* cette méthode génère une liste de nombres qui suit la valeur actuelle de nombre 
en commençant par nombre et en ajoutant les nombres suivants jusqu'à nombre + nb.
La liste générée est ensuite renvoyée pour être utilisée dans d'autres parties de l'application.  */  
}