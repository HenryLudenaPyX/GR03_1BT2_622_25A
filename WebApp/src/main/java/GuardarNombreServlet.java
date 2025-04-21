
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GuardarNombreServlet")
public class GuardarNombreServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public GuardarNombreServlet() {

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        String nombre = request.getParameter("nombre");
        String id = request.getParameter("id");

        Usuario usuario = new Usuario(nombre, id);

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>"+ nombre + " " + id + " registrado con exito</h1>");
        out.println("</body>");
        out.println("</html>");
    }

}
