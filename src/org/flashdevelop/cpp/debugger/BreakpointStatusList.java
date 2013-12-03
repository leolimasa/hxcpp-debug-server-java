package org.flashdevelop.cpp.debugger;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class BreakpointStatusList extends haxe.lang.Enum
{
	static 
	{
		org.flashdevelop.cpp.debugger.BreakpointStatusList.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Terminator", "Nonexistent", "Disabled", "AlreadyDisabled", "Enabled", "AlreadyEnabled", "Deleted"});
		org.flashdevelop.cpp.debugger.BreakpointStatusList.Terminator = new org.flashdevelop.cpp.debugger.BreakpointStatusList(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    BreakpointStatusList(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static  org.flashdevelop.cpp.debugger.BreakpointStatusList Terminator;
	
	public static   org.flashdevelop.cpp.debugger.BreakpointStatusList Nonexistent(int number, org.flashdevelop.cpp.debugger.BreakpointStatusList next)
	{
		return new org.flashdevelop.cpp.debugger.BreakpointStatusList(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, next})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.BreakpointStatusList Disabled(int number, org.flashdevelop.cpp.debugger.BreakpointStatusList next)
	{
		return new org.flashdevelop.cpp.debugger.BreakpointStatusList(((int) (2) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, next})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.BreakpointStatusList AlreadyDisabled(int number, org.flashdevelop.cpp.debugger.BreakpointStatusList next)
	{
		return new org.flashdevelop.cpp.debugger.BreakpointStatusList(((int) (3) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, next})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.BreakpointStatusList Enabled(int number, org.flashdevelop.cpp.debugger.BreakpointStatusList next)
	{
		return new org.flashdevelop.cpp.debugger.BreakpointStatusList(((int) (4) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, next})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.BreakpointStatusList AlreadyEnabled(int number, org.flashdevelop.cpp.debugger.BreakpointStatusList next)
	{
		return new org.flashdevelop.cpp.debugger.BreakpointStatusList(((int) (5) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, next})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.BreakpointStatusList Deleted(int number, org.flashdevelop.cpp.debugger.BreakpointStatusList next)
	{
		return new org.flashdevelop.cpp.debugger.BreakpointStatusList(((int) (6) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, next})) ));
	}
	
	
}


