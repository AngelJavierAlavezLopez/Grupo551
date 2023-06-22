package  {
	
	import flash.display.MovieClip;
	import flash.events.Event;
	
	public class setup extends MovieClip {//se trae las propiedades de x,y libreria que import
		
		private var piso_new: piso=new piso();
		static var protagonista_new: protagonista=new protagonista();
		private var antagonista_new: antagonista=new antagonista();
		static var puntos: Number=0;  //para los puntos
		static var puntos_box_new:puntos_box=new puntos_box();
		
		//variables de clase=atributos que se ocupan
		
		public function setup() { // funcion contructora
			
				// constructor code
				
				
			//trace ("hola mundo");
				
				addChild(piso_new);
				addChild(protagonista_new);
				addChild (antagonista_new);
				addChild (puntos_box_new);
				
				piso_new.y=370;
				piso_new.x=275;
				
				protagonista_new.y=320;
				protagonista_new.x=275;
				
				antagonista_new.y=80;
				antagonista_new.x=275;
				
				puntos_box_new.y=90;
				puntos_box_new.x=290;
				puntos_box_new.puntostxt.text=String (puntos);
				//clase protagonista 
				
				this.addEventListener(Event.ENTER_FRAME, actualiza_puntos);
		}
		public function actualiza_puntos(e:Event){
			puntos_box_new.puntostxt.text=String(puntos); 
			
		}
		
	}
	
}
