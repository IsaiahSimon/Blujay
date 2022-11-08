package controllers;

import play.mvc.*;
import models.Product;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("A lightweight healthcare inventory management system (H.I.M.S.)"));
    }

    public Result about() {
        return ok(about.render());
    }

    public Result products() {

        // Create a new product
        Product p = new Product();

        // Set the properties for p
        p.setId(1L);
        p.setName("Test Product");
        p.setCategory("Test Category");
        p.setDescription("Test Description");
        p.setStock(10);
        p.setPrice(100.00);

        // Create an object and initialize the properties
        Product p2 = new Product(1L, "Test Product2", "Test Category2", "Test Description2", 20, 200.00);

        return ok(products.render(p));
    }
}
