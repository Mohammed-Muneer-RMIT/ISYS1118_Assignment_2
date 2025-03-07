abstract class Customer {
    public void browseProducts() {}
    public void addToCart(Product product) {}
    public void viewProductDetails(Product product) {}
    public void virtualTryOn(Product product) {}
}

class GuestCustomer extends Customer {
    String guestId;
    
    public void login() {} // NOTE: Log in with customerId?
    public void createAccount() {}
}

class RegisteredCustomer extends Customer {
    String customerId;
    
    public void checkout(Cart cart) {}
    public void bookEyeTest(Optician optician) {}
}

class Optician {
    String opticianId;
    String schedule;
}

class ExternalAPIService {
    String serviceName;
    String apiUrl;
    
    public void service(String serviceName) {}
}

class Product {
    String productId;
    String productName;
    double price;
    String details;
}

class Cart {
    String cartId;
    Product[] items;
    double totalPrice;

    public void addToCart(Product product) {}
    // TODO: remove from cart/update quantity and whatnot? 
    public void checkout(ExternalAPIService pay) {}
}
