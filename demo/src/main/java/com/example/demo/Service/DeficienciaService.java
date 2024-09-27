package com.example.demo.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Form.Deficiencia.DeficienciaForm;
import com.example.demo.Model.Deficiencia;
import com.example.demo.Repository.DeficienciaRepository;

@Service
public class DeficienciaService {

    @Autowired
    private DeficienciaRepository deficienciaRepository;

    // Método para buscar todas as deficiências
    public List<Deficiencia> findAll() {
        return deficienciaRepository.findAll();
    }

    // Método para criar uma nova deficiência
    public Deficiencia create(DeficienciaForm deficienciaForm) {
        Deficiencia deficiencia = new Deficiencia();
        deficiencia.setNome(deficienciaForm.getNome());
        deficiencia.setCategoria(deficienciaForm.getCategoria());
        return deficienciaRepository.save(deficiencia);
    }

    public Deficiencia update(DeficienciaForm deficienciaForm, Long id){
        //ENTIDADE DEFICIENCIA
        Deficiencia deficiencia = this.deficienciaRepository.findById(id).orElseThrow();

        deficiencia.setNome(deficienciaForm.getNome());
        deficiencia.setCategoria(deficienciaForm.getCategoria());

        return deficienciaRepository.save(deficiencia);
    }
}
