<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Registro</title></head>
<body>
<div style="width: 400px; margin: auto; padding: 20px; border: 1px solid #ccc;">
    <h2 style="text-align:center;">Registro de Usuario</h2>
    <!-- El formulario envía los datos al servlet "registro" usando el método POST -->
    <form action="GuardarNombreServlet" method="post">
        ID:<br>
        <input type="text" name="id" required><br><br>

        Nombre:<br>
        <input type="text" name="nombre" required><br><br>

        <div style="text-align:center;">
            <input type="submit" value="Registrar">
        </div>
    </form>
</div>
</body>
</html>
