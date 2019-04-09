package hello.controller;

import hello.model.Identificacion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ListasController {


    @GetMapping("/listas")
    public List get(Model modeloLista) {

        List listaSimple = inicializaLista();
        modeloLista.addAttribute("listaId1",listaSimple.get(0));
        modeloLista.addAttribute("listaId2",listaSimple.get(1));
        return inicializaLista();
    }

    private List<Identificacion> inicializaListaObjetos() {
        List <Identificacion> listaNueva = new ArrayList<>();
        Identificacion id1 = new Identificacion();
        id1.setId(1);
        id1.setNombre("Cedula");
        Identificacion id2 = new Identificacion();
        id2.setNombre("nip");
        id2.setId(2);

        listaNueva.add(1,id1);
        listaNueva.add(2,id2);
        return listaNueva;
    }

    private List inicializaLista(){
        List listaSimple= new ArrayList();
        listaSimple.add("Cedula");
        listaSimple.add("Nip");
        return listaSimple;
    }
}
