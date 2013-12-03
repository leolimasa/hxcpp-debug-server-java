package org.flashdevelop.cpp.debugger;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class FrameList extends haxe.lang.Enum
{
	static 
	{
		org.flashdevelop.cpp.debugger.FrameList.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Terminator", "Frame"});
		org.flashdevelop.cpp.debugger.FrameList.Terminator = new org.flashdevelop.cpp.debugger.FrameList(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    FrameList(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static  org.flashdevelop.cpp.debugger.FrameList Terminator;
	
	public static   org.flashdevelop.cpp.debugger.FrameList Frame(boolean isCurrent, int number, java.lang.String className, java.lang.String functionName, java.lang.String fileName, int lineNumber, org.flashdevelop.cpp.debugger.FrameList next)
	{
		return new org.flashdevelop.cpp.debugger.FrameList(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{isCurrent, number, className, functionName, fileName, lineNumber, next})) ));
	}
	
	
}


