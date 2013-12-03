package org.flashdevelop.cpp.debugger;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Message extends haxe.lang.Enum
{
	static 
	{
		org.flashdevelop.cpp.debugger.Message.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"ErrorInternal", "ErrorNoSuchThread", "ErrorNoSuchFile", "ErrorNoSuchBreakpoint", "ErrorBadClassNameRegex", "ErrorBadFunctionNameRegex", "ErrorNoMatchingFunctions", "ErrorBadCount", "ErrorCurrentThreadNotStopped", "ErrorEvaluatingExpression", "OK", "Exited", "Detached", "Files", "Classes", "MemBytes", "Compacted", "Collected", "CurrentThread", "FileLineBreakpointNumber", "ClassFunctionBreakpointNumber", "Breakpoints", "BreakpointDescription", "BreakpointStatuses", "Continued", "ThreadsWhere", "CurrentFrame", "Variables", "Value", "ThreadCreated", "ThreadTerminated", "ThreadStarted", "ThreadStopped", "MessageId", "Variable"});
		org.flashdevelop.cpp.debugger.Message.OK = new org.flashdevelop.cpp.debugger.Message(((int) (10) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		org.flashdevelop.cpp.debugger.Message.Exited = new org.flashdevelop.cpp.debugger.Message(((int) (11) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		org.flashdevelop.cpp.debugger.Message.Detached = new org.flashdevelop.cpp.debugger.Message(((int) (12) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    Message(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static   org.flashdevelop.cpp.debugger.Message ErrorInternal(java.lang.String details)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{details})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message ErrorNoSuchThread(int number)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message ErrorNoSuchFile(java.lang.String fileName)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (2) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{fileName})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message ErrorNoSuchBreakpoint(int number)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (3) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message ErrorBadClassNameRegex(java.lang.String details)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (4) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{details})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message ErrorBadFunctionNameRegex(java.lang.String details)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (5) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{details})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message ErrorNoMatchingFunctions(java.lang.String className, java.lang.String functionName, org.flashdevelop.cpp.debugger.StringList unresolvableClasses)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (6) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{className, functionName, unresolvableClasses})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message ErrorBadCount(int count)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (7) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{count})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message ErrorCurrentThreadNotStopped(int threadNumber)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (8) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{threadNumber})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message ErrorEvaluatingExpression(java.lang.String details)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (9) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{details})) ));
	}
	
	
	public static  org.flashdevelop.cpp.debugger.Message OK;
	
	public static  org.flashdevelop.cpp.debugger.Message Exited;
	
	public static  org.flashdevelop.cpp.debugger.Message Detached;
	
	public static   org.flashdevelop.cpp.debugger.Message Files(org.flashdevelop.cpp.debugger.StringList list)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (13) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{list})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message Classes(org.flashdevelop.cpp.debugger.StringList list)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (14) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{list})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message MemBytes(int bytes)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (15) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{bytes})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message Compacted(int bytesBefore, int bytesAfter)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (16) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{bytesBefore, bytesAfter})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message Collected(int bytesBefore, int bytesAfter)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (17) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{bytesBefore, bytesAfter})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message CurrentThread(int number)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (18) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message FileLineBreakpointNumber(int number)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (19) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message ClassFunctionBreakpointNumber(int number, org.flashdevelop.cpp.debugger.StringList unresolvableClasses)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (20) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, unresolvableClasses})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message Breakpoints(org.flashdevelop.cpp.debugger.BreakpointList list)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (21) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{list})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message BreakpointDescription(int number, org.flashdevelop.cpp.debugger.BreakpointLocationList list)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (22) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, list})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message BreakpointStatuses(org.flashdevelop.cpp.debugger.BreakpointStatusList list)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (23) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{list})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message Continued(int count)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (24) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{count})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message ThreadsWhere(org.flashdevelop.cpp.debugger.ThreadWhereList list)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (25) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{list})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message CurrentFrame(int number)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (26) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message Variables(org.flashdevelop.cpp.debugger.StringList list)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (27) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{list})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message Value(java.lang.String expression, java.lang.String type, java.lang.String value)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (28) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{expression, type, value})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message ThreadCreated(int number)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (29) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message ThreadTerminated(int number)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (30) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message ThreadStarted(int number)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (31) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message ThreadStopped(int number, java.lang.String className, java.lang.String functionName, java.lang.String fileName, int lineNumber)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (32) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, className, functionName, fileName, lineNumber})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message MessageId(int id, org.flashdevelop.cpp.debugger.Message message)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (33) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{id, message})) ));
	}
	
	
	public static   org.flashdevelop.cpp.debugger.Message Variable(java.lang.String name, org.flashdevelop.cpp.debugger.VariableValue value)
	{
		return new org.flashdevelop.cpp.debugger.Message(((int) (34) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{name, value})) ));
	}
	
	
}


