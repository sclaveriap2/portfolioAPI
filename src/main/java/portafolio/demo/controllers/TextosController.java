package portafolio.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import portafolio.demo.models.TextosModel;
import portafolio.demo.services.TextosService;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/textos")
public class TextosController {

    @Autowired
    private TextosService textosService;

    @GetMapping("/todos-los-textos")
    public ArrayList<TextosModel> getTextos(){
        return this.textosService.getTextos();
    }
    @PostMapping("/guardar-texto")
    public TextosModel saveTexto(@RequestBody TextosModel texto){
        return this.textosService.saveTexto(texto);
    }

    @GetMapping("/texto-por-id/{id}")
    public Optional<TextosModel> getTextoById(@PathVariable("id") Long id){
        return this.textosService.getById(id);
    }

    @PutMapping("/update-por-id/{id}")
    public TextosModel updateTextoById(@RequestBody TextosModel Request,@PathVariable("id") Long id){
        return this.textosService.UpdateById(Request, id);
    }

    @DeleteMapping("/Delete-por-id/{id}")
    public String deleteTextoById(@PathVariable("id") Long id){
        boolean ok = this.textosService.deleteTexto(id);
        if(ok){
            return "Texto " + id + "Eliminado";
        }else{
            return "Error";
        }
    }
}
