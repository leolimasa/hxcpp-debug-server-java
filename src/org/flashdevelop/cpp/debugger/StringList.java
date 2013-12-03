package org.flashdevelop.cpp.debugger;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class StringList extends haxe.lang.Enum
{
	static 
	{
		org.flashdevelop.cpp.debugger.StringList.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Terminator", "Element"});
		org.flashdevelop.cpp.debugger.StringList.Terminator = new org.flashdevelop.cpp.debugger.StringList(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    StringList(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static  org.flashdevelop.cpp.debugger.StringList Terminator;
	
	public static   org.flashdevelop.cpp.debugger.StringList Element(java.lang.String string, org.flashdevelop.cpp.debugger.StringList next)
	{
		return new org.flashdevelop.cpp.debugger.StringList(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{string, next})) ));
	}
	
	
}


