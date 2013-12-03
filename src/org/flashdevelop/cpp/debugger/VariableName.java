package org.flashdevelop.cpp.debugger;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class VariableName extends haxe.lang.Enum
{
	static 
	{
		org.flashdevelop.cpp.debugger.VariableName.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Variable"});
	}
	public    VariableName(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static   org.flashdevelop.cpp.debugger.VariableName Variable(java.lang.String name, java.lang.String fullName, boolean isStatic, org.flashdevelop.cpp.debugger.VariableValue value)
	{
		return new org.flashdevelop.cpp.debugger.VariableName(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{name, fullName, isStatic, value})) ));
	}
	
	
}


