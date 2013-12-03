package org.flashdevelop.cpp.debugger;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class BreakpointLocationList extends haxe.lang.Enum
{
	static 
	{
		org.flashdevelop.cpp.debugger.BreakpointLocationList.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Terminator", "FileLine", "ClassFunction"});
		org.flashdevelop.cpp.debugger.BreakpointLocationList.Terminator = new org.flashdevelop.cpp.debugger.BreakpointLocationList(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    BreakpointLocationList(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static  org.flashdevelop.cpp.debugger.BreakpointLocationList Terminator;
	
	public static   org.flashdevelop.cpp.debugger.BreakpointLocationList FileLine(java.lang.String fileName, int lineNumber, org.flashdevelop.cpp.debugger.BreakpointLocationList next)
	{
		return new org.flashdevelop.cpp.debugger.BreakpointLocationList(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{fileName, lineNumber, next})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.BreakpointLocationList ClassFunction(java.lang.String className, java.lang.String functionName, org.flashdevelop.cpp.debugger.BreakpointLocationList next)
	{
		return new org.flashdevelop.cpp.debugger.BreakpointLocationList(((int) (2) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{className, functionName, next})) ));
	}
	
	
}


