package ch.brix.gql.client.frontify.builders;

public class Guideline_contentSearch extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelineContentSearchItems> {
  public Guideline_contentSearch() {
    super(new ch.brix.gql.client.Call<>("contentSearch", "GuidelineContentSearchItems"));
  }
  public Guideline_contentSearch args(Guideline_contentSearch_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Guideline_contentSearch onGuidelineContentSearchItems(On_GuidelineContentSearchItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
