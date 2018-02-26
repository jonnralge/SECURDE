package securde.users;
import securde.resources.Product;
public class ProductManager extends User {
	
	
	public ProductManager(int id, String userName, String password) {
		super(id, userName, password);
	}

	public void addProduct(Product product)
	{
		//Database logic for adding the product	
	}
	
	public void deleteProduct(Product product)
	{
		//Database logic for deleting product
	}
	
	public void editProduct(Product product)
	{
		//Database logic for editing product details
	}
}
