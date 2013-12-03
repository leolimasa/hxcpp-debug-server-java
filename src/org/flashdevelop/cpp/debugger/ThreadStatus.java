package org.flashdevelop.cpp.debugger;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class ThreadStatus extends haxe.lang.Enum
{
	static 
	{
		org.flashdevelop.cpp.debugger.ThreadStatus.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Running", "StoppedImmediate", "StoppedBreakpoint", "StoppedUncaughtException", "StoppedCriticalError"});
		org.flashdevelop.cpp.debugger.ThreadStatus.Running = new org.flashdevelop.cpp.debugger.ThreadStatus(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		org.flashdevelop.cpp.debugger.ThreadStatus.StoppedImmediate = new org.flashdevelop.cpp.debugger.ThreadStatus(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		org.flashdevelop.cpp.debugger.ThreadStatus.StoppedUncaughtException = new org.flashdevelop.cpp.debugger.ThreadStatus(((int) (3) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    ThreadStatus(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static  org.flashdevelop.cpp.debugger.ThreadStatus Running;
	
	public static  org.flashdevelop.cpp.debugger.ThreadStatus StoppedImmediate;
	
	public static   org.flashdevelop.cpp.debugger.ThreadStatus StoppedBreakpoint(int number)
	{
		return new org.flashdevelop.cpp.debugger.ThreadStatus(((int) (2) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static  org.flashdevelop.cpp.debugger.ThreadStatus StoppedUncaughtException;
	
	public static   org.flashdevelop.cpp.debugger.ThreadStatus StoppedCriticalError(java.lang.String description)
	{
		return new org.flashdevelop.cpp.debugger.ThreadStatus(((int) (4) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{description})) ));
	}
	
	
}


