package ch.brix.gql.client.frontify.builders;

public class Guideline_defaultLanguage extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Language> {
  public Guideline_defaultLanguage() {
    super(new ch.brix.gql.client.Call<>("defaultLanguage", "Language"));
  }
  public Guideline_defaultLanguage onLanguage(On_Language typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
