package ehub.api.Controllers;

import ehub.api.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Ismail on 30/01/2016.
 */
@Controller
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value="/products", method= RequestMethod.GET)
    public Iterable listProducts(){
        return productService.ListAllProducts();
    }
}
