package DataGeneration;

public class Customerdetails {
	
	
	
	
	private String zip;
	private String id;

    private String phone;

    private String email;

    private String street;

    private String name;

    public String getZip ()
    {
        return zip;
    }
    public Customerdetails()
	{
		this.id=Idgen.fid();
	}
    public String getcid()
    {
    	return this.id;
    }
    
    public void setZip (String zip)
    {
        this.zip = zip;
    }

    public String getPhone ()
    {
        return phone;
    }

    public void setPhone (String phone)
    {
        this.phone = phone;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getStreet ()
    {
        return street;
    }

    public void setStreet (String street)
    {
        this.street = street;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

}
