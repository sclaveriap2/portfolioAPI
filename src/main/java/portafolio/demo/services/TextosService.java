package portafolio.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portafolio.demo.models.TextosModel;
import portafolio.demo.repositories.ITextosRepository;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TextosService {
    @Autowired
    ITextosRepository textosRepository;

    public ArrayList <TextosModel> getTextos(){
        return (ArrayList<TextosModel>) textosRepository.findAll();
    }

    public TextosModel saveTexto(TextosModel texto){
        return textosRepository.save(texto);
    }

    public Optional<TextosModel> getById(Long id){
        return textosRepository.findById(id);
    }

    public TextosModel UpdateById(TextosModel request, Long id){
        TextosModel texto = textosRepository.findById(id).get();

        texto.setTexto(request.getTexto());
        texto.setTipo_texto(request.getTipo_texto());
        return texto;
    }

    public Boolean deleteTexto(Long id){
        try{
            textosRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
