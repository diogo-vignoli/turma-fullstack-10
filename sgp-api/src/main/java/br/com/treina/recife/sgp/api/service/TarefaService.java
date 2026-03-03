package br.com.treina.recife.sgp.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.treina.recife.sgp.api.model.Tarefa;
import br.com.treina.recife.sgp.api.repository.TarefaRepository;

@Service



public class TarefaService {

    @Autowired
private TarefaRepository TarefaRepository;
    // SELECT * FROM TB_TAREFA

    public List<Tarefa> listarTarefas(){
       
        return TarefaRepository.findAll();
    }
    
// SELECT * FROM TB_USUARIOS WHERE ID = ?

    public Optional<Tarefa> obterDadosdaTarefa(Long id){
        return TarefaRepository.findById(id); 
    }
    

    // INSERT INTO TB_USUARIOS

    public Tarefa cadastrarTarefa(Tarefa tarefa){
        return TarefaRepository.save(tarefa);
    }

    //UPDATE TB_USUARIO WHERE ID = ?

     public Tarefa atualizarTarefa(Long id, Tarefa tarefa){
     tarefa.setId(id);
     return TarefaRepository.save(tarefa);

     }

     // DELETE FROM TB_USUARIOS WHERE ID = ?

     public void excluirTarefa(Long id){
        TarefaRepository.deleteById(id);
     }
}

