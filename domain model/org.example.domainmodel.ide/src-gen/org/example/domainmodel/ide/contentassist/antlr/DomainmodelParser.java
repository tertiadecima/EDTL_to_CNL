/*
 * generated by Xtext 2.32.0
 */
package org.example.domainmodel.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.example.domainmodel.ide.contentassist.antlr.internal.InternalDomainmodelParser;
import org.example.domainmodel.services.DomainmodelGrammarAccess;

public class DomainmodelParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DomainmodelGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DomainmodelGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDomainmodelAccess().getGroup(), "rule__Domainmodel__Group__0");
			builder.put(grammarAccess.getNumberAccess().getGroup(), "rule__Number__Group__0");
			builder.put(grammarAccess.getNumberAccess().getGroup_3(), "rule__Number__Group_3__0");
			builder.put(grammarAccess.getNumberAccess().getGroup_4(), "rule__Number__Group_4__0");
			builder.put(grammarAccess.getDomainmodelAccess().getNumbersAssignment_0(), "rule__Domainmodel__NumbersAssignment_0");
			builder.put(grammarAccess.getNumberAccess().getSignAssignment_1(), "rule__Number__SignAssignment_1");
			builder.put(grammarAccess.getNumberAccess().getBefore_pointAssignment_2(), "rule__Number__Before_pointAssignment_2");
			builder.put(grammarAccess.getNumberAccess().getAfter_pointAssignment_3_1(), "rule__Number__After_pointAssignment_3_1");
			builder.put(grammarAccess.getNumberAccess().getExponentAssignment_4_2(), "rule__Number__ExponentAssignment_4_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DomainmodelGrammarAccess grammarAccess;

	@Override
	protected InternalDomainmodelParser createParser() {
		InternalDomainmodelParser result = new InternalDomainmodelParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DomainmodelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DomainmodelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}