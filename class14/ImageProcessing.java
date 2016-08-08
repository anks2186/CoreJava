public class ImageProcessing{

	public void processImages(){
		Image i1 = new Image("...1.jpg");
		//processing
		//i1 = null;
		i1 = new Image("...2.jpg");
		//processing

		Image i3 = new Image("...3.jpg");
		//processing
		
		Image i4 = new Image("...4.jpg"); //OutOfMemoryError
		//processing
	}
}

/** 
HEAP
====
1000x: ImageObj
2000x: ImageObj
3000x: ImageObj

STACK
=====
processImage_Stack
------------------
i1: null
i2: 2000x
i3: 3000x
i4: 

Solution: nullify the objects after its use.

or use the same reference for different objects.
*/
