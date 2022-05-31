package clips;
import net.sf.clipsrules.jni.Environment;

public class javaclips
{
	public static void main (String[] noseusa) throws Exception
	{
		Environment env = new Environment();
		env.eval("(reset)");

		env.eval("(assert (person Octavio))");
		env.eval("(assert (sympton Cancer))");
		env.eval("(assert (age 22))");
		env.eval("(assert (height 170))");

		env.eval("(facts)");
	}
}