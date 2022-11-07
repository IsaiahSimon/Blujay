package models;

public class Product {

    // Properties
    private Long id;
    private String name;
    private String category;
    private String description;
    private int stock;
    private double price;

    // Constructors
    public Product() {

    }

    public Product(Long id, String name, String category, String description, int stock, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.stock = stock;
        this.price = price;
    }

    // Accessor Methods
    public Long getId()	{
		return this.id;
	}

	  public void setId(Long id)	{
		this.id = id;
    }

    public String getName()	{
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
    }

    public String getCategory()	{
		return this.category;
	}

	public void setCategory(String category) {
	    this.category = category;
	}

    public String getDescription()	{
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
    }

    public int getStock() {
		return this.stock;
	}

	public void setStock(int stock)	{
		this.stock = stock;
    }

    public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
	    this.price = price;
  }
}