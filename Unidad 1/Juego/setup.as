﻿package  {
	
	import flash.display.MovieClip;
	
	
	public class setup extends MovieClip {
		
		private var piso_new: piso=new piso();
		private var protagonista_new: protagonista=new protagonista();
		private var antagonista_new: antagonista=new antagonista();
		public function setup() {
			
				// constructor code
			//trace ("hola mundo");
				
				addChild(piso_new);
				addChild(protagonista_new);
				addChild (antagonista_new);
				
				piso_new.y=370;
				piso_new.x=275;
				
				protagonista_new.y=320;
				protagonista_new.x=275;
				
				antagonista_new.y=80;
				antagonista_new.x=275;
				
			
			
			
		}
	}
	
}