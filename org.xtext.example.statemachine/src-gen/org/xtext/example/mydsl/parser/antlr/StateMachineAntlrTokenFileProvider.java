/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class StateMachineAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/mydsl/parser/antlr/internal/InternalStateMachineParser.tokens");
	}
}
