package portafolio.demo.models;

import jakarta.persistence.*;

@Entity
@Table (name= "textos")
public class TextosModel {
    @Id
    @Column(name = "id_texto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "texto")
    private String texto;
    @Column(name = "tipo_texto")
    private String tipo_texto;

    public TextosModel(){
    };
    public TextosModel(Long id, String texto, String tipo_texto) {
        this.id = id;
        this.texto = texto;
        this.tipo_texto = tipo_texto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTipo_texto() {
        return tipo_texto;
    }

    public void setTipo_texto(String tipo_texto) {
        this.tipo_texto = tipo_texto;
    }
}
