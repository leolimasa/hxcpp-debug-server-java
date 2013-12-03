package org.flashdevelop.cpp.debugger;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Command extends haxe.lang.Enum
{
	static 
	{
		org.flashdevelop.cpp.debugger.Command.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Exit", "Detach", "Files", "Classes", "Mem", "Compact", "Collect", "SetCurrentThread", "AddFileLineBreakpoint", "AddClassFunctionBreakpoint", "ListBreakpoints", "DescribeBreakpoint", "DisableAllBreakpoints", "DisableBreakpointRange", "EnableAllBreakpoints", "EnableBreakpointRange", "DeleteAllBreakpoints", "DeleteBreakpointRange", "BreakNow", "Continue", "Step", "Next", "Finish", "WhereCurrentThread", "WhereAllThreads", "Up", "Down", "SetFrame", "Variables", "PrintExpression", "SetExpression", "CommandId", "GetExpression"});
		org.flashdevelop.cpp.debugger.Command.Exit = new org.flashdevelop.cpp.debugger.Command(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		org.flashdevelop.cpp.debugger.Command.Detach = new org.flashdevelop.cpp.debugger.Command(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		org.flashdevelop.cpp.debugger.Command.Files = new org.flashdevelop.cpp.debugger.Command(((int) (2) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		org.flashdevelop.cpp.debugger.Command.Classes = new org.flashdevelop.cpp.debugger.Command(((int) (3) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		org.flashdevelop.cpp.debugger.Command.Mem = new org.flashdevelop.cpp.debugger.Command(((int) (4) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		org.flashdevelop.cpp.debugger.Command.Compact = new org.flashdevelop.cpp.debugger.Command(((int) (5) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		org.flashdevelop.cpp.debugger.Command.Collect = new org.flashdevelop.cpp.debugger.Command(((int) (6) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		org.flashdevelop.cpp.debugger.Command.DisableAllBreakpoints = new org.flashdevelop.cpp.debugger.Command(((int) (12) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		org.flashdevelop.cpp.debugger.Command.EnableAllBreakpoints = new org.flashdevelop.cpp.debugger.Command(((int) (14) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		org.flashdevelop.cpp.debugger.Command.DeleteAllBreakpoints = new org.flashdevelop.cpp.debugger.Command(((int) (16) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		org.flashdevelop.cpp.debugger.Command.BreakNow = new org.flashdevelop.cpp.debugger.Command(((int) (18) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		org.flashdevelop.cpp.debugger.Command.WhereAllThreads = new org.flashdevelop.cpp.debugger.Command(((int) (24) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    Command(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static  org.flashdevelop.cpp.debugger.Command Exit;
	
	public static  org.flashdevelop.cpp.debugger.Command Detach;
	
	public static  org.flashdevelop.cpp.debugger.Command Files;
	
	public static  org.flashdevelop.cpp.debugger.Command Classes;
	
	public static  org.flashdevelop.cpp.debugger.Command Mem;
	
	public static  org.flashdevelop.cpp.debugger.Command Compact;
	
	public static  org.flashdevelop.cpp.debugger.Command Collect;
	
	public static   org.flashdevelop.cpp.debugger.Command SetCurrentThread(int number)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (7) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Command AddFileLineBreakpoint(java.lang.String fileName, int lineNumber)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (8) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{fileName, lineNumber})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Command AddClassFunctionBreakpoint(java.lang.String className, java.lang.String functionName)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (9) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{className, functionName})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Command ListBreakpoints(boolean enabled, boolean disabled)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (10) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{enabled, disabled})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Command DescribeBreakpoint(int number)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (11) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static  org.flashdevelop.cpp.debugger.Command DisableAllBreakpoints;
	
	public static   org.flashdevelop.cpp.debugger.Command DisableBreakpointRange(int first, int last)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (13) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{first, last})) ));
	}
	
	
	public static  org.flashdevelop.cpp.debugger.Command EnableAllBreakpoints;
	
	public static   org.flashdevelop.cpp.debugger.Command EnableBreakpointRange(int first, int last)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (15) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{first, last})) ));
	}
	
	
	public static  org.flashdevelop.cpp.debugger.Command DeleteAllBreakpoints;
	
	public static   org.flashdevelop.cpp.debugger.Command DeleteBreakpointRange(int first, int last)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (17) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{first, last})) ));
	}
	
	
	public static  org.flashdevelop.cpp.debugger.Command BreakNow;
	
	public static   org.flashdevelop.cpp.debugger.Command Continue(int count)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (19) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{count})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Command Step(int count)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (20) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{count})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Command Next(int count)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (21) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{count})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Command Finish(int count)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (22) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{count})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Command WhereCurrentThread(boolean unsafe)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (23) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{unsafe})) ));
	}
	
	
	public static  org.flashdevelop.cpp.debugger.Command WhereAllThreads;
	
	public static   org.flashdevelop.cpp.debugger.Command Up(int count)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (25) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{count})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Command Down(int count)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (26) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{count})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Command SetFrame(int number)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (27) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Command Variables(boolean unsafe)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (28) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{unsafe})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Command PrintExpression(boolean unsafe, java.lang.String expression)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (29) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{unsafe, expression})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Command SetExpression(boolean unsafe, java.lang.String lhs, java.lang.String rhs)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (30) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{unsafe, lhs, rhs})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Command CommandId(int id, org.flashdevelop.cpp.debugger.Command command)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (31) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{id, command})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Command GetExpression(boolean unsafe, java.lang.String expression)
	{
		return new org.flashdevelop.cpp.debugger.Command(((int) (32) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{unsafe, expression})) ));
	}
	
	
}


