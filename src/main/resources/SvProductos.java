package Servlets;

import logica.Producto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "SvProductos", urlPatterns = {"/SvProductos"})
public class SvProductos extends HttpServlet {

    protected  void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws  ServletException, IOException{

        //podemos implementar la comunicación servlet jsp de dos maneras: teniendo un jsp que se comunica a un servlet
        //siendo dos entidades completamente distintas y separadas, o podemos hacer que el servlet funcione como un jsp
        //es decir: que dentro del servlet se muestre el código HTML que queremos que visualice el usuaruio o cliente..
        //LO IDEAL NO ES USARLO ASÍ, la buena practica es el modelo de capas,separar el front del back,tratando que sea
        // lo mas optimo posible y que cada parte tenga sus tareas bien divididas: no se usará esto:
//        response.setContentType("text/html;charset=UTF-8");
//        try ( PrintWriter out = response.getWriter()){
//
//
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet SvProductos</title>");
//            out.println("</head>");
//            out.println("<h1>Servlet SvProductos at " + request.getContextPath() + "</h1>");
//            out.println("<body></html>");
//
//        } pues el código HTML estará dentro de nuestras páginas JSP y se comunicarán con el servlet mediante los metodos
        //doGet y doPost

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

   List<Producto> listaProductos = new ArrayList<>();
    listaProductos.add(new Producto("Carro","negro", 500000, "automotriz"));
    listaProductos.add(new Producto("Motorola","Celular última generación", 20000, "Telecomunicación"));

        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaProductos", listaProductos);

        response.sendRedirect("mostrarProducto.jsp");

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        String nombreProducto = request.getParameter("nombreProducto");
        String description = request.getParameter("description");
        String price = request.getParameter("price");
        String category = request.getParameter("category");

        System.out.println("el producto es: " + nombreProducto);
        System.out.println("Descripción: " + description);
        System.out.println("el precio: " + price);
        System.out.println("La categoría: " + category);

    }

    public String getServletInfo(){
        return "Short description";
    }
}
