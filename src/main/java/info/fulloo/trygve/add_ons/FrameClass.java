package info.fulloo.trygve.add_ons;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import info.fulloo.trygve.declarations.AccessQualifier;
import info.fulloo.trygve.declarations.FormalParameterList;
import info.fulloo.trygve.declarations.Type;
import info.fulloo.trygve.declarations.TypeDeclaration;
import info.fulloo.trygve.declarations.Declaration.ClassDeclaration;
import info.fulloo.trygve.declarations.Declaration.MethodDeclaration;
import info.fulloo.trygve.declarations.Declaration.ObjectDeclaration;
import info.fulloo.trygve.declarations.Type.ClassType;
import info.fulloo.trygve.error.ErrorLogger;
import info.fulloo.trygve.error.ErrorLogger.ErrorType;
import info.fulloo.trygve.expressions.Expression;
import info.fulloo.trygve.run_time.RTCode;
import info.fulloo.trygve.run_time.RTDynamicScope;
import info.fulloo.trygve.run_time.RTClass;
import info.fulloo.trygve.run_time.RTFrameObject;
import info.fulloo.trygve.run_time.RTObjectCommon.RTStringObject;
import info.fulloo.trygve.run_time.RTPanelObject;
import info.fulloo.trygve.run_time.RTObject;
import info.fulloo.trygve.run_time.RunTimeEnvironment;
import info.fulloo.trygve.semantic_analysis.StaticScope;
import static java.util.Arrays.asList;

/*
 * Trygve IDE 1.5
 *   Copyright (c)2016 James O. Coplien, jcoplien@gmail.com
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *  
 * For further information about the trygve project, please contact
 * Jim Coplien at jcoplien@gmail.com
 */

public final class FrameClass {
	private static void declareFrameMethod(final String methodSelector,
			final Type returnType,
			final List<String> paramNames,
			final List<Type> paramTypes,
			final boolean isConst) {
		final AccessQualifier Public = AccessQualifier.PublicAccess;
		
		final Iterator<Type> typeIterator = null == paramTypes? null: paramTypes.iterator();
		final FormalParameterList formals = new FormalParameterList();
		if (null != paramNames) {
			for (final String paramName : paramNames) {
				if (null != paramName) {
					final Type paramType = typeIterator.next();
					final ObjectDeclaration formalParameter = new ObjectDeclaration(paramName, paramType, 0);
					formals.addFormalParameter(formalParameter);
				}
			}
		}
		final ObjectDeclaration self = new ObjectDeclaration("this", frameType_, 0);
		formals.addFormalParameter(self);
		final StaticScope methodScope = new StaticScope(frameType_.enclosedScope());
		final MethodDeclaration methodDecl = new MethodDeclaration(methodSelector, methodScope, returnType, Public, 0, false);
		methodDecl.addParameterList(formals);
		methodDecl.setReturnType(returnType);
		methodDecl.setHasConstModifier(isConst);
		frameType_.enclosedScope().declareMethod(methodDecl);
	}
	public static void setup() {
		final StaticScope globalScope = StaticScope.globalScope();
		if (null == globalScope.lookupTypeDeclaration("Panel")) {
			typeDeclarationList_ = new ArrayList<TypeDeclaration>();
			final Type voidType = globalScope.lookupTypeDeclaration("void");
			final Type intType = globalScope.lookupTypeDeclaration("int");
			final Type stringType = globalScope.lookupTypeDeclaration("String");
			final Type panelType = globalScope.lookupTypeDeclaration("Panel");
			assert null != panelType;
			
			final ClassDeclaration objectBaseClass = globalScope.lookupClassDeclaration("Object");
			assert null != objectBaseClass;

			final StaticScope newScope = new StaticScope(globalScope);
			final ClassDeclaration classDecl = new ClassDeclaration("Panel", newScope, objectBaseClass, 0);
			newScope.setDeclaration(classDecl);
			frameType_ = new ClassType("Frame", newScope, null);
			classDecl.setType(frameType_);
			typeDeclarationList_.add(classDecl);

			declareFrameMethod("Frame", null, asList("name"), asList(stringType), false);
			declareFrameMethod("resize", voidType, asList("width", "height"), asList(intType, intType), false);
			declareFrameMethod("show", voidType, null, null, false);
			declareFrameMethod("add", voidType, asList("name", "panel"), asList(stringType, panelType), false);
			
			globalScope.declareType(frameType_);
			globalScope.declareClass(classDecl);
		}
	}
	
	public static class RTPanelCommon extends RTClass.RTObjectClass.RTSimpleObjectMethodsCommon {
		public RTPanelCommon(final String className, final String methodName, final List<String> parameterNames,
				final List<String> parameterTypeNames,
				final StaticScope enclosingMethodScope, final Type returnType) {
			super(methodName, RTMessage.buildArguments(className, methodName, parameterNames, parameterTypeNames, enclosingMethodScope, false), returnType, Expression.nearestEnclosingMegaTypeOf(enclosingMethodScope), false);
		}
		@Override public RTCode run() {
			// Don't need to push or pop anything. The return code stays
			// until the RTReturn statement processes it, and everything
			// else has been popped into the activation record by
			// RTMessage
			// 		NO: returnCode = (RTCode)RunTimeEnvironment.runTimeEnvironment_.popStack();
			// 		Yes, but...: assert returnCode instanceof RTCode;
			
			// Parameters have all been packaged into the
			// activation record
			final RTDynamicScope activationRecord = RunTimeEnvironment.runTimeEnvironment_.currentDynamicScope();
			final RTObject self = (RTObject)activationRecord.getObject("this");
			assert self instanceof RTPanelObject;
			final RTCode retval = this.runDetails(activationRecord, (RTFrameObject)self);
			
			// All dogs go to heaven, and all return statements that
			// have something to return do it. We deal with consumption
			// in the message. This function's return statement will be
			// set for a consumed result in higher-level logic.
			
			return retval;
		}
		public RTCode runDetails(final RTObject scope, final RTFrameObject theFrame) {
			// Effectively a pure virtual method, but Java screws us again...
			ErrorLogger.error(ErrorType.Internal, "call of pure virutal method runDetails", "", "", "");
			return null;	// halt the machine
		}
	}
	
	public static class RTAddCode extends RTPanelCommon {
		public RTAddCode(final StaticScope enclosingMethodScope) {
			super("Frame", "add", asList("name", "panel"), asList("String", "Panel"), enclosingMethodScope, StaticScope.globalScope().lookupTypeDeclaration("void"));
		}
		@Override public RTCode runDetails(final RTObject myEnclosedScope, final RTFrameObject theFrame) {
			assert null != theFrame;
			theFrame.show();
			
			return super.nextCode();
		}
	}
	public static class RTShowCode extends RTPanelCommon {
		public RTShowCode(final StaticScope enclosingMethodScope) {
			super("Frame", "show", null, null, enclosingMethodScope, StaticScope.globalScope().lookupTypeDeclaration("void"));
		}
		@Override public RTCode runDetails(final RTObject myEnclosedScope, final RTFrameObject theFrame) {
			assert null != theFrame;
			theFrame.show();
			
			return super.nextCode();
		}
	}
	public static class RTResizeCode extends RTPanelCommon {
		public RTResizeCode(final StaticScope enclosingMethodScope) {
			super("Frame", "resize", asList("width", "height"), asList("int", "int"), enclosingMethodScope, StaticScope.globalScope().lookupTypeDeclaration("void"));
		}
		@Override public RTCode runDetails(final RTObject myEnclosedScope, final RTFrameObject theFrame) {
			assert null != theFrame;
			final RTDynamicScope activationRecord = RunTimeEnvironment.runTimeEnvironment_.currentDynamicScope();
			final RTObject width = (RTObject)activationRecord.getObject("width");
			final RTObject height = (RTObject)activationRecord.getObject("width");
			theFrame.resize(width, height);
			
			return super.nextCode();
		}
	}
	public static class RTPanelCtorCode extends RTPanelCommon {
		public RTPanelCtorCode(final StaticScope enclosingMethodScope) {
			super("Frame", "Frame", asList("name"), asList("String"), enclosingMethodScope, StaticScope.globalScope().lookupTypeDeclaration("void"));
		}
		@Override public RTCode runDetails(final RTObject myEnclosedScope, final RTFrameObject theFrame) {
			final RTDynamicScope activationRecord = RunTimeEnvironment.runTimeEnvironment_.currentDynamicScope();
			final RTObject nameArg = (RTObject)activationRecord.getObject("name");
			assert nameArg instanceof RTStringObject;
			final RTFrameObject theFrameObject = (RTFrameObject)activationRecord.getObject("this");
			theFrameObject.ctor1((RTStringObject)nameArg);
			RunTimeEnvironment.runTimeEnvironment_.pushStack(theFrameObject);
			return super.nextCode();
		}
	}

	public static List<TypeDeclaration> typeDeclarationList() {
		return typeDeclarationList_;
	}
	
	private static List<TypeDeclaration> typeDeclarationList_;
	private static ClassType frameType_;
}