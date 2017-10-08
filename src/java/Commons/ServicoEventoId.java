package Commons;
// Generated 10/jun/2017 0:10:28 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ServicoEventoId generated by hbm2java
 */
@Embeddable
public class ServicoEventoId  implements java.io.Serializable {


     private int idEvento;
     private int idServico;

    public ServicoEventoId() {
    }

    public ServicoEventoId(int idEvento, int idServico) {
       this.idEvento = idEvento;
       this.idServico = idServico;
    }
   


    @Column(name="id_evento", nullable=false)
    public int getIdEvento() {
        return this.idEvento;
    }
    
    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }


    @Column(name="id_servico", nullable=false)
    public int getIdServico() {
        return this.idServico;
    }
    
    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ServicoEventoId) ) return false;
		 ServicoEventoId castOther = ( ServicoEventoId ) other; 
         
		 return (this.getIdEvento()==castOther.getIdEvento())
 && (this.getIdServico()==castOther.getIdServico());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdEvento();
         result = 37 * result + this.getIdServico();
         return result;
   }   


}

