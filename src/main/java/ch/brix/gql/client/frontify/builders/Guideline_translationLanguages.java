package ch.brix.gql.client.frontify.builders;

public class Guideline_translationLanguages extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.Language>> {
  public Guideline_translationLanguages() {
    super(new ch.brix.gql.client.Call<>("translationLanguages", "Language"));
  }
  public Guideline_translationLanguages onLanguage(On_Language typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
