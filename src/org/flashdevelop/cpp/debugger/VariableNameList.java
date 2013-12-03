package org.flashdevelop.cpp.debugger;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class VariableNameList extends haxe.lang.Enum
{
	static 
	{
		org.flashdevelop.cpp.debugger.VariableNameList.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Terminator", "Element"});
		org.flashdevelop.cpp.debugger.VariableNameList.Terminator = new org.flashdevelop.cpp.debugger.VariableNameList(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    VariableNameList(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static  org.flashdevelop.cpp.debugger.VariableNameList Terminator;
	
	public static   org.flashdevelop.cpp.debugger.VariableNameList Element(org.flashdevelop.cpp.debugger.VariableName variable, org.flashdevelop.cpp.debugger.VariableNameList next)
	{
		return new org.flashdevelop.cpp.debugger.VariableNameList(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{variable, next})) ));
	}
	
	
}


