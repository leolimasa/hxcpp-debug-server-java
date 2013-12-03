package org.flashdevelop.cpp.debugger;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class BreakpointList extends haxe.lang.Enum
{
	static 
	{
		org.flashdevelop.cpp.debugger.BreakpointList.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Terminator", "Breakpoint"});
		org.flashdevelop.cpp.debugger.BreakpointList.Terminator = new org.flashdevelop.cpp.debugger.BreakpointList(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    BreakpointList(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static  org.flashdevelop.cpp.debugger.BreakpointList Terminator;
	
	public static   org.flashdevelop.cpp.debugger.BreakpointList Breakpoint(int number, java.lang.String description, boolean enabled, boolean multi, org.flashdevelop.cpp.debugger.BreakpointList next)
	{
		return new org.flashdevelop.cpp.debugger.BreakpointList(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, description, enabled, multi, next})) ));
	}
	
	
}


