package adapter;


// Generic example
public class GenericObjectAdapter extends ClassAdatingTo
{
	private ClassAdaptingFrom fromObject;
	
	public GenericObjectAdapter(ClassAdaptingFrom fromObject)
	{
		this.fromObject;
	}
	
	// Overridden method
	public void methodInToClass()
	{
		fromObject.methedInFromClass();
	}
}
