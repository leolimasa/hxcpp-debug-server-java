package org.flashdevelop.cpp.debugger;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class ThreadWhereList extends haxe.lang.Enum
{
	static 
	{
		org.flashdevelop.cpp.debugger.ThreadWhereList.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Terminator", "Where"});
		org.flashdevelop.cpp.debugger.ThreadWhereList.Terminator = new org.flashdevelop.cpp.debugger.ThreadWhereList(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    ThreadWhereList(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static  org.flashdevelop.cpp.debugger.ThreadWhereList Terminator;
	
	public static   org.flashdevelop.cpp.debugger.ThreadWhereList Where(int number, org.flashdevelop.cpp.debugger.ThreadStatus status, org.flashdevelop.cpp.debugger.FrameList frameList, org.flashdevelop.cpp.debugger.ThreadWhereList next)
	{
		return new org.flashdevelop.cpp.debugger.ThreadWhereList(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, status, frameList, next})) ));
	}
	
	
}


