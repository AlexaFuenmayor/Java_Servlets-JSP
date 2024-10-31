<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>Formulario con JSP</title>
  </head>
  <body>
  <h1>Registrar Producto</h1>
    <form action="SvProductos" method="POST">
        <div>
            <label for="nombreProducto">Nombre del Producto:</label>
            <input type="text" id="nombreProducto" name="nombreProducto" required>
        </div>
        <div>
            <label for="description">Descripción:</label>
            <textarea id="description" name="description" rows="2" cols="50" required></textarea>
        </div>
        <div>
            <label for="precio">Precio:</label>
            <input type="number" id="price" name="price" step="0.01" required>
        </div>
        <div>
            <label for="category">Categoría:</label>
            <select id="category" name="category" required>
                <option value="electronica">Electrónica</option>
                <option value="ropa">Ropa</option>
                <option value="alimentos">Alimentos</option>
                <option value="hogar">Hogar</option>
            </select>
        </div>
        <div>
            <label for="cantidad">Cantidad Disponible:</label>
            <input type="number" id="cantidad" name="cantidad" required>
        </div>
        <div>
            <button type="submit">Registrar Producto</button>
        </div>
    </form>

    <h1>Ver lista de Productos</h1>
    <p>Haz clic en el siguiente botón para ver los productos</p>
    <form action="SvProductos" method="GET">
    <button type="submit">VER</button>

    </form>
  </body>
</html>
