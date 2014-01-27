package designPatterns.j2ee.servicelocator;

public abstract class RealService implements Service{

	@Override
	public abstract String getName() ;

	@Override
	public abstract void execute();

}
