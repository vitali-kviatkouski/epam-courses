package _4assertions.assertions;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

public class UnixClasspathExtractorTest {
	private ClasspathExtractor extractor = new UnixClasspathExtractor();
	
	@Test
	public void testExtractClasspath() {
		Assume.assumeTrue(System.getProperty("path.separator").equals(":"));
		Assert.assertArrayEquals(extractor.extractCurrentUserPath(), new String[]{"/bin", "/usr/bin"});
	}
}
