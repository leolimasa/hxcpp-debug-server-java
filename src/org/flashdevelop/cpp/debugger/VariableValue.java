package org.flashdevelop.cpp.debugger;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class VariableValue extends haxe.lang.Enum
{
	static 
	{
		org.flashdevelop.cpp.debugger.VariableValue.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Item", "NoItem"});
		org.flashdevelop.cpp.debugger.VariableValue.NoItem = new org.flashdevelop.cpp.debugger.VariableValue(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    VariableValue(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static   org.flashdevelop.cpp.debugger.VariableValue Item(java.lang.String type, java.lang.String value, org.flashdevelop.cpp.debugger.VariableNameList children)
	{
		return new org.flashdevelop.cpp.debugger.VariableValue(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{type, value, children})) ));
	}
	
	
	public static  org.flashdevelop.cpp.debugger.VariableValue NoItem;
	
}


