package org.flashdevelop.cpp.debugger;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  interface IController extends haxe.lang.IHxObject
{
	   org.flashdevelop.cpp.debugger.Command getNextCommand();
	
	   void acceptMessage(org.flashdevelop.cpp.debugger.Message message);
	
}


