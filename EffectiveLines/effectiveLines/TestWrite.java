package ouc.sei.test;

public class TestWrite {
	static{
		System.loadLibrary("libwriteutfLib");
	}
	//test comment
  public static void main(String args[]){
	  /** another Comment***/
	  TestWrite tw = new TestWrite();
	  tw.writeFile("test", "hello UTFS");
  }
	private native  void  writeFile(String filePathName,String Content); 
}