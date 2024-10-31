<%@page import="java.util.List" %>
<%@page import="logica.Producto" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>Mostrar productos</title>
  </head>
  <body>
    <h1>Mostrar productos registrados</h1>
    <%
       List <Producto> listaProductos = (List) request.getSession().getAttribute("listaProductos");
       int cont = 1;
       for (Producto product : listaProductos){
    %>

    <p><b>Producto N° <%=cont%></b></p>
    <p>Nombre producto: <%=product.getNombreProducto()%></p>
    <p>Descripción: <%=product.getDescription()%></p>
    <p>Precio: <%=product.getPrecio()%></p>
    <p>Categoría: <%=product.getCategoria()%></p>
    <p>-------------------------------------------------------</p>
    <%cont = cont+ 1;%>

    <% } %>


  </body>


</html>