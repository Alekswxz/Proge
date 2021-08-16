package github.Alekswxz.Proge.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping(path = "demo/usuario/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo")Integer codigo){
        return repository.findById(codigo)
                .map(record->ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping(path ="/demo/usuario/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario){
        return repository.save(usuario);
    }
    @DeleteMapping(path ={ "demo/usuario/deletar {codigo}"})
    public ResponseEntity <?> deletar(@PathVariable Integer codigo) {
        return repository.findById(codigo)
                .map(record -> {
                    repository.deleteById(codigo);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

}
