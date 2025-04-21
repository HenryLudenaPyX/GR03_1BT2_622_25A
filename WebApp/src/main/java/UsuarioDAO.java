import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UsuarioDAO {
    // Método para guardar un usuario en la base de datos
    public void guardar(Usuario usuario) {
        Transaction tx = null;
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            tx = session.beginTransaction();  // Inicia una nueva transacción

            session.save(usuario);  // Guarda el objeto Usuario en la base de datos

            tx.commit();  // Confirma la transacción (hace que los cambios se guarden)
        } catch (Exception e) {
            if (tx != null) tx.rollback();  // Si ocurre un error, revierte los cambios
            e.printStackTrace();  // Muestra el error en la consola
        }
    }
}
